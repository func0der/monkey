// This is a generated file. Not intended for manual editing.
package io.github.liias.monkey.lang.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static io.github.liias.monkey.lang.psi.MonkeyTypes.*;
import io.github.liias.monkey.lang.psi.*;

public class MonkeyModifiersImpl extends MonkeyPsiCompositeElementImpl implements MonkeyModifiers {

  public MonkeyModifiersImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull MonkeyVisitor visitor) {
    visitor.visitModifiers(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof MonkeyVisitor) accept((MonkeyVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public MonkeyAnnotation getAnnotation() {
    return findChildByClass(MonkeyAnnotation.class);
  }

}
