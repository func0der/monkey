package io.github.liias.monkey.project;

import com.intellij.ide.util.importProject.ModuleDescriptor;
import com.intellij.ide.util.importProject.ProjectDescriptor;
import com.intellij.ide.util.projectWizard.ModuleWizardStep;
import com.intellij.ide.util.projectWizard.ProjectJdkForModuleStep;
import com.intellij.ide.util.projectWizard.importSources.DetectedProjectRoot;
import com.intellij.ide.util.projectWizard.importSources.DetectedSourceRoot;
import com.intellij.ide.util.projectWizard.importSources.ProjectFromSourcesBuilder;
import com.intellij.ide.util.projectWizard.importSources.ProjectStructureDetector;
import com.intellij.openapi.util.io.FileUtilRt;
import io.github.liias.monkey.lang.file.MonkeyFileType;
import io.github.liias.monkey.project.module.MonkeyModuleType;
import io.github.liias.monkey.project.sdk.MonkeySdkType;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;
import java.io.File;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;

import static java.util.stream.Collectors.*;

/**
 * Handles New project from existing sources
 */
public class MonkeyProjectStructureDetector extends ProjectStructureDetector {

  /*
  Detects source roots instead of module content root.
  see com.intellij.ide.util.importProject.RootDetectionProcessor.mergeContentRoots(), content root is ignored if there are source roots
   */
  @NotNull
  @Override
  public DirectoryProcessingResult detectRoots(@NotNull File dir,
                                               @NotNull File[] children,
                                               @NotNull File base,
                                               @NotNull List<DetectedProjectRoot> result) {

    String fileExtension = MonkeyFileType.INSTANCE.getDefaultExtension();
    for (File child : children) {
      if (child.isFile() && FileUtilRt.extensionEquals(child.getName(), fileExtension)) {
        result.add(new MonkeyDetectedSourceRoot(dir));
        // alternatively could add one module root instead of many source roots:
        //result.add(new DetectedContentRoot(dir, "MonkeyC", MonkeyModuleType.getInstance(), WebModuleType.getInstance()));
        return DirectoryProcessingResult.SKIP_CHILDREN;
      }
    }

    return DirectoryProcessingResult.PROCESS_CHILDREN;
  }

  /*
  Collect all source roots and add a new module with them
   */
  @Override
  public void setupProjectStructure(@NotNull Collection<DetectedProjectRoot> roots,
                                    @NotNull ProjectDescriptor projectDescriptor,
                                    @NotNull ProjectFromSourcesBuilder builder) {

    if (!builder.hasRootsFromOtherDetectors(this)) {
      builder.setupModulesByContentRoots(projectDescriptor, roots);

      if (!roots.isEmpty()) {
        List<ModuleDescriptor> modules = projectDescriptor.getModules();
        if (modules.isEmpty()) {
          roots.stream()
              .filter(r -> r instanceof MonkeyDetectedSourceRoot)
              .map(r -> (MonkeyDetectedSourceRoot) r)
              .collect(groupingBy(sr -> sr.getDirectory().getParentFile(), mapping(Function.identity(), toSet())))
              .forEach((moduleContentRoot, moduleSourceRoots) ->
                  modules.add(new ModuleDescriptor(moduleContentRoot, MonkeyModuleType.getInstance(), moduleSourceRoots))
              );
        }
      }
    }
  }

  @NotNull
  @Override
  public List<ModuleWizardStep> createWizardSteps(@NotNull ProjectFromSourcesBuilder builder, ProjectDescriptor projectDescriptor, Icon stepIcon) {
    ProjectJdkForModuleStep projectJdkForModuleStep = new ProjectJdkForModuleStep(builder.getContext(), MonkeySdkType.getInstance());
    return Collections.singletonList(projectJdkForModuleStep);
  }

  private static class MonkeyDetectedSourceRoot extends DetectedSourceRoot {
    public MonkeyDetectedSourceRoot(File directory) {
      super(directory, null);
    }

    @NotNull
    @Override
    public String getRootTypeName() {
      return "MonkeyC";
    }
  }
}
