/* The following code was generated by JFlex 1.4.3 on 6.06.15 23:40 */

package ee.edio.garmin;
import com.intellij.lexer.*;
import com.intellij.psi.tree.IElementType;
import static ee.edio.garmin.psi.MonkeyCTypes.*;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.4.3
 * on 6.06.15 23:40 from the specification file
 * <tt>C:/Users/Madis/Projects/2015/MonkeyC/src/ee/edio/garmin/_MonkeyCLexer.flex</tt>
 */
public class _MonkeyCLexer implements FlexLexer {
  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0, 0
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\11\0\1\1\1\2\1\1\1\1\1\1\22\0\1\1\1\0\1\14"+
    "\4\0\1\12\1\47\1\50\1\4\1\52\1\51\1\53\1\6\1\3"+
    "\12\5\1\15\1\16\5\0\32\11\1\0\1\13\2\0\1\10\1\0"+
    "\1\21\1\42\1\17\1\36\1\32\1\23\1\37\1\41\1\27\1\11"+
    "\1\43\1\20\1\35\1\25\1\30\2\11\1\31\1\22\1\26\1\24"+
    "\1\34\1\33\1\40\1\44\1\11\1\45\1\0\1\46\54\0\1\7"+
    "\12\0\1\7\4\0\1\7\5\0\27\7\1\0\37\7\1\0\u01ca\7"+
    "\4\0\14\7\16\0\5\7\7\0\1\7\1\0\1\7\201\0\5\7"+
    "\1\0\2\7\2\0\4\7\10\0\1\7\1\0\3\7\1\0\1\7"+
    "\1\0\24\7\1\0\123\7\1\0\213\7\10\0\236\7\11\0\46\7"+
    "\2\0\1\7\7\0\47\7\110\0\33\7\5\0\3\7\55\0\53\7"+
    "\43\0\2\7\1\0\143\7\1\0\1\7\17\0\2\7\7\0\2\7"+
    "\12\0\3\7\2\0\1\7\20\0\1\7\1\0\36\7\35\0\131\7"+
    "\13\0\1\7\30\0\41\7\11\0\2\7\4\0\1\7\5\0\26\7"+
    "\4\0\1\7\11\0\1\7\3\0\1\7\27\0\31\7\107\0\1\7"+
    "\1\0\13\7\127\0\66\7\3\0\1\7\22\0\1\7\7\0\12\7"+
    "\17\0\7\7\1\0\7\7\5\0\10\7\2\0\2\7\2\0\26\7"+
    "\1\0\7\7\1\0\1\7\3\0\4\7\3\0\1\7\20\0\1\7"+
    "\15\0\2\7\1\0\3\7\16\0\2\7\23\0\6\7\4\0\2\7"+
    "\2\0\26\7\1\0\7\7\1\0\2\7\1\0\2\7\1\0\2\7"+
    "\37\0\4\7\1\0\1\7\23\0\3\7\20\0\11\7\1\0\3\7"+
    "\1\0\26\7\1\0\7\7\1\0\2\7\1\0\5\7\3\0\1\7"+
    "\22\0\1\7\17\0\2\7\43\0\10\7\2\0\2\7\2\0\26\7"+
    "\1\0\7\7\1\0\2\7\1\0\5\7\3\0\1\7\36\0\2\7"+
    "\1\0\3\7\17\0\1\7\21\0\1\7\1\0\6\7\3\0\3\7"+
    "\1\0\4\7\3\0\2\7\1\0\1\7\1\0\2\7\3\0\2\7"+
    "\3\0\3\7\3\0\14\7\26\0\1\7\64\0\10\7\1\0\3\7"+
    "\1\0\27\7\1\0\12\7\1\0\5\7\3\0\1\7\32\0\2\7"+
    "\6\0\2\7\43\0\10\7\1\0\3\7\1\0\27\7\1\0\12\7"+
    "\1\0\5\7\3\0\1\7\40\0\1\7\1\0\2\7\17\0\2\7"+
    "\22\0\10\7\1\0\3\7\1\0\51\7\2\0\1\7\20\0\1\7"+
    "\21\0\2\7\30\0\6\7\5\0\22\7\3\0\30\7\1\0\11\7"+
    "\1\0\1\7\2\0\7\7\72\0\60\7\1\0\2\7\14\0\7\7"+
    "\72\0\2\7\1\0\1\7\2\0\2\7\1\0\1\7\2\0\1\7"+
    "\6\0\4\7\1\0\7\7\1\0\3\7\1\0\1\7\1\0\1\7"+
    "\2\0\2\7\1\0\4\7\1\0\2\7\11\0\1\7\2\0\5\7"+
    "\1\0\1\7\25\0\4\7\40\0\1\7\77\0\10\7\1\0\44\7"+
    "\33\0\5\7\163\0\53\7\24\0\1\7\20\0\6\7\4\0\4\7"+
    "\3\0\1\7\3\0\2\7\7\0\3\7\4\0\15\7\14\0\1\7"+
    "\21\0\46\7\1\0\1\7\5\0\1\7\2\0\53\7\1\0\u014d\7"+
    "\1\0\4\7\2\0\7\7\1\0\1\7\1\0\4\7\2\0\51\7"+
    "\1\0\4\7\2\0\41\7\1\0\4\7\2\0\7\7\1\0\1\7"+
    "\1\0\4\7\2\0\17\7\1\0\71\7\1\0\4\7\2\0\103\7"+
    "\45\0\20\7\20\0\125\7\14\0\u026c\7\2\0\21\7\1\0\32\7"+
    "\5\0\113\7\25\0\15\7\1\0\4\7\16\0\22\7\16\0\22\7"+
    "\16\0\15\7\1\0\3\7\17\0\64\7\43\0\1\7\4\0\1\7"+
    "\103\0\130\7\10\0\51\7\1\0\1\7\5\0\106\7\12\0\35\7"+
    "\63\0\36\7\2\0\5\7\13\0\54\7\25\0\7\7\70\0\27\7"+
    "\11\0\65\7\122\0\1\7\135\0\57\7\21\0\7\7\67\0\36\7"+
    "\15\0\2\7\12\0\54\7\32\0\44\7\51\0\3\7\12\0\44\7"+
    "\153\0\4\7\1\0\4\7\3\0\2\7\11\0\300\7\100\0\u0116\7"+
    "\2\0\6\7\2\0\46\7\2\0\6\7\2\0\10\7\1\0\1\7"+
    "\1\0\1\7\1\0\1\7\1\0\37\7\2\0\65\7\1\0\7\7"+
    "\1\0\1\7\3\0\3\7\1\0\7\7\3\0\4\7\2\0\6\7"+
    "\4\0\15\7\5\0\3\7\1\0\7\7\164\0\1\7\15\0\1\7"+
    "\20\0\15\7\145\0\1\7\4\0\1\7\2\0\12\7\1\0\1\7"+
    "\3\0\5\7\6\0\1\7\1\0\1\7\1\0\1\7\1\0\4\7"+
    "\1\0\13\7\2\0\4\7\5\0\5\7\4\0\1\7\64\0\2\7"+
    "\u0a7b\0\57\7\1\0\57\7\1\0\205\7\6\0\4\7\3\0\2\7"+
    "\14\0\46\7\1\0\1\7\5\0\1\7\2\0\70\7\7\0\1\7"+
    "\20\0\27\7\11\0\7\7\1\0\7\7\1\0\7\7\1\0\7\7"+
    "\1\0\7\7\1\0\7\7\1\0\7\7\1\0\7\7\120\0\1\7"+
    "\u01d5\0\2\7\52\0\5\7\5\0\2\7\4\0\126\7\6\0\3\7"+
    "\1\0\132\7\1\0\4\7\5\0\51\7\3\0\136\7\21\0\33\7"+
    "\65\0\20\7\u0200\0\u19b6\7\112\0\u51cd\7\63\0\u048d\7\103\0\56\7"+
    "\2\0\u010d\7\3\0\20\7\12\0\2\7\24\0\57\7\20\0\31\7"+
    "\10\0\106\7\61\0\11\7\2\0\147\7\2\0\4\7\1\0\4\7"+
    "\14\0\13\7\115\0\12\7\1\0\3\7\1\0\4\7\1\0\27\7"+
    "\35\0\64\7\16\0\62\7\76\0\6\7\3\0\1\7\16\0\34\7"+
    "\12\0\27\7\31\0\35\7\7\0\57\7\34\0\1\7\60\0\51\7"+
    "\27\0\3\7\1\0\10\7\24\0\27\7\3\0\1\7\5\0\60\7"+
    "\1\0\1\7\3\0\2\7\2\0\5\7\2\0\1\7\1\0\1\7"+
    "\30\0\3\7\2\0\13\7\7\0\3\7\14\0\6\7\2\0\6\7"+
    "\2\0\6\7\11\0\7\7\1\0\7\7\221\0\43\7\35\0\u2ba4\7"+
    "\14\0\27\7\4\0\61\7\u2104\0\u016e\7\2\0\152\7\46\0\7\7"+
    "\14\0\5\7\5\0\1\7\1\0\12\7\1\0\15\7\1\0\5\7"+
    "\1\0\1\7\1\0\2\7\1\0\2\7\1\0\154\7\41\0\u016b\7"+
    "\22\0\100\7\2\0\66\7\50\0\14\7\164\0\5\7\1\0\207\7"+
    "\44\0\32\7\6\0\32\7\13\0\131\7\3\0\6\7\2\0\6\7"+
    "\2\0\6\7\2\0\3\7\43\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7"+
    "\1\10\1\1\1\11\21\6\1\12\1\13\1\14\1\15"+
    "\1\16\1\17\1\20\1\21\1\22\1\23\1\5\1\0"+
    "\1\24\3\0\1\25\3\6\1\26\15\6\1\27\1\6"+
    "\1\30\7\6\1\31\4\6\1\32\1\0\4\6\1\33"+
    "\5\6\1\34\3\6\1\35\1\6\1\36\7\6\1\37"+
    "\2\6\1\40\2\6\1\32\1\6\1\41\12\6\1\42"+
    "\1\43\3\6\1\44\1\45\6\6\1\46\1\47\1\50"+
    "\3\6\1\51\2\6\1\52\1\6\1\53\3\6\1\54"+
    "\3\6\1\55\1\6\1\56\1\57\2\6\1\60\1\6"+
    "\1\61\1\6\1\62\1\6\1\63\2\6\1\64\1\6"+
    "\1\65\1\66\1\67\1\70\2\6\1\71";

  private static int [] zzUnpackAction() {
    int [] result = new int[178];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\54\0\130\0\204\0\260\0\334\0\u0108\0\u0134"+
    "\0\u0160\0\u018c\0\54\0\u01b8\0\u01e4\0\u0210\0\u023c\0\u0268"+
    "\0\u0294\0\u02c0\0\u02ec\0\u0318\0\u0344\0\u0370\0\u039c\0\u03c8"+
    "\0\u03f4\0\u0420\0\u044c\0\u0478\0\54\0\54\0\54\0\54"+
    "\0\54\0\54\0\54\0\u04a4\0\u04d0\0\54\0\u04fc\0\u0134"+
    "\0\54\0\u0528\0\u0160\0\u0554\0\u0580\0\u05ac\0\u05d8\0\u0604"+
    "\0\u0108\0\u0630\0\u065c\0\u0688\0\u06b4\0\u06e0\0\u070c\0\u0738"+
    "\0\u0764\0\u0790\0\u07bc\0\u07e8\0\u0814\0\u0840\0\u0108\0\u086c"+
    "\0\u0108\0\u0898\0\u08c4\0\u08f0\0\u091c\0\u0948\0\u0974\0\u09a0"+
    "\0\u0108\0\u09cc\0\u09f8\0\u0a24\0\u0a50\0\u04d0\0\u0a7c\0\u0aa8"+
    "\0\u0ad4\0\u0b00\0\u0b2c\0\u0108\0\u0b58\0\u0b84\0\u0bb0\0\u0bdc"+
    "\0\u0c08\0\u0108\0\u0c34\0\u0c60\0\u0c8c\0\u0108\0\u0cb8\0\u0108"+
    "\0\u0ce4\0\u0d10\0\u0d3c\0\u0d68\0\u0d94\0\u0dc0\0\u0dec\0\u0108"+
    "\0\u0e18\0\u0e44\0\u0108\0\u0e70\0\u0e9c\0\54\0\u0ec8\0\u0108"+
    "\0\u0ef4\0\u0f20\0\u0f4c\0\u0f78\0\u0fa4\0\u0fd0\0\u0ffc\0\u1028"+
    "\0\u1054\0\u1080\0\u0108\0\u0108\0\u10ac\0\u10d8\0\u1104\0\u0108"+
    "\0\u0108\0\u1130\0\u115c\0\u1188\0\u11b4\0\u11e0\0\u120c\0\u0108"+
    "\0\u0108\0\u0108\0\u1238\0\u1264\0\u1290\0\u0108\0\u12bc\0\u12e8"+
    "\0\u0108\0\u1314\0\u0108\0\u1340\0\u136c\0\u1398\0\u0108\0\u13c4"+
    "\0\u13f0\0\u141c\0\u0108\0\u1448\0\u0108\0\u0108\0\u1474\0\u14a0"+
    "\0\u0108\0\u14cc\0\u0108\0\u14f8\0\u0108\0\u1524\0\u0108\0\u1550"+
    "\0\u157c\0\u0108\0\u15a8\0\u0108\0\u0108\0\u0108\0\u0108\0\u15d4"+
    "\0\u1600\0\u0108";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[178];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\2\2\3\1\4\1\5\1\6\1\2\1\7\1\2"+
    "\1\7\1\10\1\2\1\11\1\12\1\13\1\14\1\7"+
    "\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24"+
    "\1\25\1\26\1\27\1\30\1\31\1\32\2\7\1\33"+
    "\1\34\2\7\1\35\1\36\1\37\1\40\1\41\1\42"+
    "\1\43\55\0\2\3\54\0\1\44\1\45\52\0\1\46"+
    "\55\0\1\6\1\47\52\0\1\7\2\0\2\7\5\0"+
    "\26\7\7\0\12\50\1\51\1\52\40\50\13\53\1\54"+
    "\1\51\37\53\7\0\1\55\1\0\1\55\5\0\26\55"+
    "\14\0\1\7\2\0\2\7\5\0\1\7\1\56\1\57"+
    "\6\7\1\60\14\7\14\0\1\7\2\0\2\7\5\0"+
    "\3\7\1\61\2\7\1\62\17\7\14\0\1\7\2\0"+
    "\2\7\5\0\7\7\1\63\4\7\1\64\11\7\14\0"+
    "\1\7\2\0\2\7\5\0\2\7\1\65\2\7\1\66"+
    "\2\7\1\67\1\70\14\7\14\0\1\7\2\0\2\7"+
    "\5\0\3\7\1\71\22\7\14\0\1\7\2\0\2\7"+
    "\5\0\2\7\1\72\2\7\1\73\5\7\1\74\12\7"+
    "\14\0\1\7\2\0\2\7\5\0\12\7\1\75\7\7"+
    "\1\76\3\7\14\0\1\7\2\0\2\7\5\0\4\7"+
    "\1\77\1\7\1\100\17\7\14\0\1\7\2\0\2\7"+
    "\5\0\12\7\1\101\13\7\14\0\1\7\2\0\2\7"+
    "\5\0\13\7\1\102\12\7\14\0\1\7\2\0\2\7"+
    "\5\0\1\7\1\103\4\7\1\104\12\7\1\105\4\7"+
    "\14\0\1\7\2\0\2\7\5\0\22\7\1\106\3\7"+
    "\14\0\1\7\2\0\2\7\5\0\2\7\1\107\23\7"+
    "\14\0\1\7\2\0\2\7\5\0\11\7\1\110\14\7"+
    "\14\0\1\7\2\0\2\7\5\0\11\7\1\111\1\7"+
    "\1\112\12\7\14\0\1\7\2\0\2\7\5\0\2\7"+
    "\1\113\5\7\1\114\15\7\14\0\1\7\2\0\2\7"+
    "\5\0\12\7\1\115\13\7\7\0\2\44\1\0\51\44"+
    "\4\116\1\117\47\116\5\0\1\47\46\0\2\50\1\0"+
    "\51\50\2\53\1\0\51\53\5\0\1\55\2\0\2\55"+
    "\5\0\26\55\14\0\1\7\2\0\2\7\5\0\2\7"+
    "\1\120\23\7\14\0\1\7\2\0\2\7\5\0\3\7"+
    "\1\121\3\7\1\122\16\7\14\0\1\7\2\0\2\7"+
    "\5\0\6\7\1\123\17\7\14\0\1\7\2\0\2\7"+
    "\5\0\17\7\1\124\6\7\14\0\1\7\2\0\2\7"+
    "\5\0\2\7\1\125\23\7\14\0\1\7\2\0\2\7"+
    "\5\0\10\7\1\126\15\7\14\0\1\7\2\0\2\7"+
    "\5\0\1\7\1\127\24\7\14\0\1\7\2\0\2\7"+
    "\5\0\6\7\1\130\17\7\14\0\1\7\2\0\2\7"+
    "\5\0\6\7\1\131\17\7\14\0\1\7\2\0\2\7"+
    "\5\0\12\7\1\132\13\7\14\0\1\7\2\0\2\7"+
    "\5\0\10\7\1\133\15\7\14\0\1\7\2\0\2\7"+
    "\5\0\7\7\1\134\16\7\14\0\1\7\2\0\2\7"+
    "\5\0\1\7\1\135\24\7\14\0\1\7\2\0\2\7"+
    "\5\0\14\7\1\136\11\7\14\0\1\7\2\0\2\7"+
    "\5\0\5\7\1\137\17\7\1\140\14\0\1\7\2\0"+
    "\2\7\5\0\12\7\1\141\13\7\14\0\1\7\2\0"+
    "\2\7\5\0\3\7\1\142\22\7\14\0\1\7\2\0"+
    "\2\7\5\0\7\7\1\143\16\7\14\0\1\7\2\0"+
    "\2\7\5\0\3\7\1\144\22\7\14\0\1\7\2\0"+
    "\2\7\5\0\5\7\1\145\20\7\14\0\1\7\2\0"+
    "\2\7\5\0\7\7\1\146\16\7\14\0\1\7\2\0"+
    "\2\7\5\0\10\7\1\147\15\7\14\0\1\7\2\0"+
    "\2\7\5\0\12\7\1\150\13\7\14\0\1\7\2\0"+
    "\2\7\5\0\17\7\1\151\6\7\14\0\1\7\2\0"+
    "\2\7\5\0\4\7\1\152\21\7\14\0\1\7\2\0"+
    "\2\7\5\0\3\7\1\153\22\7\14\0\1\7\2\0"+
    "\2\7\5\0\17\7\1\154\6\7\14\0\1\7\2\0"+
    "\2\7\5\0\13\7\1\155\12\7\7\0\3\116\1\156"+
    "\1\117\47\116\5\0\1\7\2\0\2\7\5\0\3\7"+
    "\1\157\22\7\14\0\1\7\2\0\2\7\5\0\13\7"+
    "\1\160\12\7\14\0\1\7\2\0\2\7\5\0\1\161"+
    "\25\7\14\0\1\7\2\0\2\7\5\0\3\7\1\162"+
    "\3\7\1\163\16\7\14\0\1\7\2\0\2\7\5\0"+
    "\7\7\1\164\16\7\14\0\1\7\2\0\2\7\5\0"+
    "\7\7\1\165\16\7\14\0\1\7\2\0\2\7\5\0"+
    "\3\7\1\166\22\7\14\0\1\7\2\0\2\7\5\0"+
    "\1\167\25\7\14\0\1\7\2\0\2\7\5\0\2\7"+
    "\1\170\23\7\14\0\1\7\2\0\2\7\5\0\6\7"+
    "\1\171\17\7\14\0\1\7\2\0\2\7\5\0\10\7"+
    "\1\172\15\7\14\0\1\7\2\0\2\7\5\0\1\7"+
    "\1\173\24\7\14\0\1\7\2\0\2\7\5\0\13\7"+
    "\1\174\12\7\14\0\1\7\2\0\2\7\5\0\11\7"+
    "\1\175\14\7\14\0\1\7\2\0\2\7\5\0\7\7"+
    "\1\176\16\7\14\0\1\7\2\0\2\7\5\0\5\7"+
    "\1\177\20\7\14\0\1\7\2\0\2\7\5\0\13\7"+
    "\1\200\12\7\14\0\1\7\2\0\2\7\5\0\16\7"+
    "\1\201\7\7\14\0\1\7\2\0\2\7\5\0\13\7"+
    "\1\202\12\7\14\0\1\7\2\0\2\7\5\0\1\7"+
    "\1\203\24\7\14\0\1\7\2\0\2\7\5\0\5\7"+
    "\1\204\20\7\14\0\1\7\2\0\2\7\5\0\2\7"+
    "\1\205\23\7\14\0\1\7\2\0\2\7\5\0\17\7"+
    "\1\206\6\7\14\0\1\7\2\0\2\7\5\0\2\7"+
    "\1\207\23\7\14\0\1\7\2\0\2\7\5\0\3\7"+
    "\1\210\22\7\14\0\1\7\2\0\2\7\5\0\22\7"+
    "\1\211\3\7\14\0\1\7\2\0\2\7\5\0\7\7"+
    "\1\212\16\7\14\0\1\7\2\0\2\7\5\0\10\7"+
    "\1\213\15\7\14\0\1\7\2\0\2\7\5\0\10\7"+
    "\1\214\15\7\14\0\1\7\2\0\2\7\5\0\1\215"+
    "\25\7\14\0\1\7\2\0\2\7\5\0\13\7\1\216"+
    "\12\7\14\0\1\7\2\0\2\7\5\0\7\7\1\217"+
    "\16\7\14\0\1\7\2\0\2\7\5\0\1\7\1\220"+
    "\24\7\14\0\1\7\2\0\2\7\5\0\20\7\1\221"+
    "\5\7\14\0\1\7\2\0\2\7\5\0\15\7\1\222"+
    "\10\7\14\0\1\7\2\0\2\7\5\0\14\7\1\223"+
    "\11\7\14\0\1\7\2\0\2\7\5\0\2\7\1\224"+
    "\23\7\14\0\1\7\2\0\2\7\5\0\12\7\1\225"+
    "\13\7\14\0\1\7\2\0\2\7\5\0\6\7\1\226"+
    "\17\7\14\0\1\7\2\0\2\7\5\0\13\7\1\227"+
    "\12\7\14\0\1\7\2\0\2\7\5\0\1\7\1\230"+
    "\24\7\14\0\1\7\2\0\2\7\5\0\5\7\1\231"+
    "\20\7\14\0\1\7\2\0\2\7\5\0\13\7\1\232"+
    "\12\7\14\0\1\7\2\0\2\7\5\0\24\7\1\233"+
    "\1\7\14\0\1\7\2\0\2\7\5\0\6\7\1\234"+
    "\17\7\14\0\1\7\2\0\2\7\5\0\1\235\25\7"+
    "\14\0\1\7\2\0\2\7\5\0\22\7\1\236\3\7"+
    "\14\0\1\7\2\0\2\7\5\0\10\7\1\237\15\7"+
    "\14\0\1\7\2\0\2\7\5\0\1\7\1\240\24\7"+
    "\14\0\1\7\2\0\2\7\5\0\13\7\1\241\12\7"+
    "\14\0\1\7\2\0\2\7\5\0\6\7\1\242\17\7"+
    "\14\0\1\7\2\0\2\7\5\0\6\7\1\243\17\7"+
    "\14\0\1\7\2\0\2\7\5\0\17\7\1\244\6\7"+
    "\14\0\1\7\2\0\2\7\5\0\13\7\1\245\12\7"+
    "\14\0\1\7\2\0\2\7\5\0\1\7\1\246\24\7"+
    "\14\0\1\7\2\0\2\7\5\0\6\7\1\247\17\7"+
    "\14\0\1\7\2\0\2\7\5\0\5\7\1\250\20\7"+
    "\14\0\1\7\2\0\2\7\5\0\11\7\1\251\14\7"+
    "\14\0\1\7\2\0\2\7\5\0\25\7\1\252\14\0"+
    "\1\7\2\0\2\7\5\0\1\253\25\7\14\0\1\7"+
    "\2\0\2\7\5\0\3\7\1\254\22\7\14\0\1\7"+
    "\2\0\2\7\5\0\7\7\1\255\16\7\14\0\1\7"+
    "\2\0\2\7\5\0\13\7\1\256\12\7\14\0\1\7"+
    "\2\0\2\7\5\0\6\7\1\257\17\7\14\0\1\7"+
    "\2\0\2\7\5\0\13\7\1\260\12\7\14\0\1\7"+
    "\2\0\2\7\5\0\11\7\1\261\14\7\14\0\1\7"+
    "\2\0\2\7\5\0\4\7\1\262\21\7\7\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[5676];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;
  private static final char[] EMPTY_BUFFER = new char[0];
  private static final int YYEOF = -1;
  private static java.io.Reader zzReader = null; // Fake

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unkown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\1\11\10\1\1\11\21\1\7\11\2\1\1\11"+
    "\1\1\1\0\1\11\3\0\42\1\1\0\36\1\1\11"+
    "\104\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[178];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private CharSequence zzBuffer = "";

  /** this buffer may contains the current text array to be matched when it is cheap to acquire it */
  private char[] zzBufferArray;

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the textposition at the last state to be included in yytext */
  private int zzPushbackPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /**
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /* user code: */
  public _MonkeyCLexer() {
    this((java.io.Reader)null);
  }


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public _MonkeyCLexer(java.io.Reader in) {
    this.zzReader = in;
  }


  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x10000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 1590) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }

  public final int getTokenStart(){
    return zzStartRead;
  }

  public final int getTokenEnd(){
    return getTokenStart() + yylength();
  }

  public void reset(CharSequence buffer, int start, int end,int initialState){
    zzBuffer = buffer;
    zzBufferArray = com.intellij.util.text.CharArrayUtil.fromSequenceWithoutCopying(buffer);
    zzCurrentPos = zzMarkedPos = zzStartRead = start;
    zzPushbackPos = 0;
    zzAtEOF  = false;
    zzAtBOL = true;
    zzEndRead = end;
    yybegin(initialState);
  }

  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   *
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {
    return true;
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final CharSequence yytext() {
    return zzBuffer.subSequence(zzStartRead, zzMarkedPos);
  }


  /**
   * Returns the character at position <tt>pos</tt> from the
   * matched text.
   *
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch.
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBufferArray != null ? zzBufferArray[zzStartRead+pos]:zzBuffer.charAt(zzStartRead+pos);
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of
   * yypushback(int) and a match-all fallback rule) this method
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  }


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public IElementType advance() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    CharSequence zzBufferL = zzBuffer;
    char[] zzBufferArrayL = zzBufferArray;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;

      zzState = ZZ_LEXSTATE[zzLexicalState];


      zzForAction: {
        while (true) {

          if (zzCurrentPosL < zzEndReadL)
            zzInput = (zzBufferArrayL != null ? zzBufferArrayL[zzCurrentPosL++] : zzBufferL.charAt(zzCurrentPosL++));
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = (zzBufferArrayL != null ? zzBufferArrayL[zzCurrentPosL++] : zzBufferL.charAt(zzCurrentPosL++));
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          int zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
        case 23: 
          { return IF;
          }
        case 58: break;
        case 56: 
          { return FUNCTION;
          }
        case 59: break;
        case 18: 
          { return MULTI_LINE_COMMENT_START;
          }
        case 60: break;
        case 31: 
          { return VAR;
          }
        case 61: break;
        case 19: 
          { return MULTI_LINE_COMMENT_END;
          }
        case 62: break;
        case 10: 
          { return BLOCK_START;
          }
        case 63: break;
        case 21: 
          { return SYMBOL;
          }
        case 64: break;
        case 15: 
          { return OP_PLUS;
          }
        case 65: break;
        case 48: 
          { return NATIVE;
          }
        case 66: break;
        case 5: 
          { return NUMBER;
          }
        case 67: break;
        case 47: 
          { return SWITCH;
          }
        case 68: break;
        case 41: 
          { return FALSE;
          }
        case 69: break;
        case 14: 
          { return COMMA;
          }
        case 70: break;
        case 55: 
          { return CONTINUE;
          }
        case 71: break;
        case 24: 
          { return OR;
          }
        case 72: break;
        case 16: 
          { return OP_MINUS;
          }
        case 73: break;
        case 27: 
          { return AND;
          }
        case 74: break;
        case 34: 
          { return NULL;
          }
        case 75: break;
        case 26: 
          { return BLOCK_COMMENT;
          }
        case 76: break;
        case 7: 
          { return STRING_B;
          }
        case 77: break;
        case 53: 
          { return EXTENDS;
          }
        case 78: break;
        case 9: 
          { return STATEMENT_END;
          }
        case 79: break;
        case 3: 
          { return OP_DIVIDE;
          }
        case 80: break;
        case 29: 
          { return NEW;
          }
        case 81: break;
        case 25: 
          { return DO;
          }
        case 82: break;
        case 51: 
          { return HIDDEN;
          }
        case 83: break;
        case 43: 
          { return THROW;
          }
        case 84: break;
        case 38: 
          { return CLASS;
          }
        case 85: break;
        case 6: 
          { return ALPHANUM;
          }
        case 86: break;
        case 37: 
          { return ENUM;
          }
        case 87: break;
        case 22: 
          { return AS;
          }
        case 88: break;
        case 36: 
          { return ELSE;
          }
        case 89: break;
        case 49: 
          { return RETURN;
          }
        case 90: break;
        case 44: 
          { return WHILE;
          }
        case 91: break;
        case 33: 
          { return CASE;
          }
        case 92: break;
        case 8: 
          { return STRING_A;
          }
        case 93: break;
        case 42: 
          { return USING;
          }
        case 94: break;
        case 20: 
          { return STRING;
          }
        case 95: break;
        case 2: 
          { return com.intellij.psi.TokenType.WHITE_SPACE;
          }
        case 96: break;
        case 35: 
          { return TRUE;
          }
        case 97: break;
        case 28: 
          { return FOR;
          }
        case 98: break;
        case 12: 
          { return LPAREN;
          }
        case 99: break;
        case 17: 
          { return SINGLE_LINE_COMMENT;
          }
        case 100: break;
        case 45: 
          { return BREAK;
          }
        case 101: break;
        case 52: 
          { return FINALLY;
          }
        case 102: break;
        case 40: 
          { return CONST;
          }
        case 103: break;
        case 57: 
          { return INSTANCEOF;
          }
        case 104: break;
        case 54: 
          { return DEFAULT;
          }
        case 105: break;
        case 46: 
          { return STATIC;
          }
        case 106: break;
        case 13: 
          { return RPAREN;
          }
        case 107: break;
        case 50: 
          { return MODULE;
          }
        case 108: break;
        case 4: 
          { return OP_MULTIPLY;
          }
        case 109: break;
        case 39: 
          { return CATCH;
          }
        case 110: break;
        case 30: 
          { return TRY;
          }
        case 111: break;
        case 32: 
          { return HAS;
          }
        case 112: break;
        case 11: 
          { return BLOCK_END;
          }
        case 113: break;
        case 1: 
          { return com.intellij.psi.TokenType.BAD_CHARACTER;
          }
        case 114: break;
        default:
          if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
            zzAtEOF = true;
            return null;
          }
          else {
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}