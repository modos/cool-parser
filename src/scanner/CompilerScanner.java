// DO NOT EDIT
// Generated by JFlex 1.8.2 http://jflex.de/
// source: flex/scanner.flex

package scanner;
import java.io.IOException;

import parser.Lexical;

// See https://github.com/jflex-de/jflex/issues/222
@SuppressWarnings("FallThrough")
public class CompilerScanner implements Lexical{

  /** This character denotes the end of file. */
  public static final int YYEOF = -1;

  /** Initial size of the lookahead buffer. */
  private static final int ZZ_BUFFERSIZE = 16384;

  // Lexical states.
  public static final int YYINITIAL = 0;
  public static final int STRING = 2;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = {
     0,  0,  1, 1
  };

  /**
   * Top-level table for translating characters to character classes
   */
  private static final int [] ZZ_CMAP_TOP = zzUnpackcmap_top();

  private static final String ZZ_CMAP_TOP_PACKED_0 =
    "\1\0\1\u0100\36\u0200\1\u0300\u10df\u0200";

  private static int [] zzUnpackcmap_top() {
    int [] result = new int[4352];
    int offset = 0;
    offset = zzUnpackcmap_top(ZZ_CMAP_TOP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackcmap_top(String packed, int offset, int [] result) {
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
   * Second-level tables for translating characters to character classes
   */
  private static final int [] ZZ_CMAP_BLOCKS = zzUnpackcmap_blocks();

  private static final String ZZ_CMAP_BLOCKS_PACKED_0 =
    "\11\0\1\1\1\2\1\0\1\3\1\4\22\0\1\3"+
    "\1\5\1\6\2\0\1\7\1\10\1\11\2\7\1\12"+
    "\1\13\1\7\1\14\1\15\1\16\1\17\11\20\1\0"+
    "\1\7\1\21\1\22\1\5\2\0\1\23\3\24\1\25"+
    "\1\24\21\26\1\27\2\26\1\7\1\30\2\7\1\31"+
    "\1\0\1\32\1\33\1\34\1\35\1\36\1\37\1\40"+
    "\1\41\1\42\1\26\1\43\1\44\1\26\1\45\1\46"+
    "\1\47\1\26\1\50\1\51\1\52\1\53\1\54\1\55"+
    "\1\27\1\56\1\26\1\7\1\57\1\7\u0382\0";

  private static int [] zzUnpackcmap_blocks() {
    int [] result = new int[1024];
    int offset = 0;
    offset = zzUnpackcmap_blocks(ZZ_CMAP_BLOCKS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackcmap_blocks(String packed, int offset, int [] result) {
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
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\2\0\1\1\2\2\1\3\1\4\5\3\2\5\1\3"+
    "\17\6\1\3\1\7\1\10\1\1\1\0\1\11\1\12"+
    "\2\0\10\6\1\13\15\6\1\14\1\15\1\16\1\17"+
    "\1\20\1\21\1\0\2\11\1\0\1\22\1\23\10\6"+
    "\1\13\14\6\1\13\12\6\1\24\2\6\1\13\1\6"+
    "\1\24\7\6\1\13\5\6\1\13\2\6\1\13\26\6";

  private static int [] zzUnpackAction() {
    int [] result = new int[150];
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
    "\0\0\0\60\0\140\0\140\0\220\0\300\0\140\0\140"+
    "\0\360\0\u0120\0\u0150\0\u0180\0\u01b0\0\u01e0\0\u0210\0\u0240"+
    "\0\u0270\0\u02a0\0\u02d0\0\u0300\0\u0330\0\u0360\0\u0390\0\u03c0"+
    "\0\u03f0\0\u0420\0\u0450\0\u0480\0\u04b0\0\u04e0\0\u0510\0\u0540"+
    "\0\140\0\u0570\0\u05a0\0\u05d0\0\u0600\0\u0630\0\u0660\0\u0690"+
    "\0\u06c0\0\u06f0\0\u0720\0\u0750\0\u0780\0\u07b0\0\u07e0\0\u0690"+
    "\0\u0810\0\u0840\0\u0870\0\u08a0\0\u08d0\0\u0900\0\u0930\0\u0960"+
    "\0\u0990\0\u09c0\0\u09f0\0\u0a20\0\u0a50\0\140\0\140\0\140"+
    "\0\140\0\140\0\140\0\u0a80\0\140\0\u0ab0\0\u0ae0\0\u0ae0"+
    "\0\u0660\0\u0b10\0\u0b40\0\u0b70\0\u0ba0\0\u0bd0\0\u0c00\0\u0c30"+
    "\0\u0c60\0\u0b10\0\u0c90\0\u0cc0\0\u0cf0\0\u0d20\0\u0d50\0\u0d80"+
    "\0\u0db0\0\u0de0\0\u0e10\0\u0e40\0\u0e70\0\u0ea0\0\u0e70\0\u0ed0"+
    "\0\u0f00\0\u0f30\0\u0f60\0\u0f90\0\u0fc0\0\u0ff0\0\u1020\0\u1050"+
    "\0\u1080\0\u0e70\0\u10b0\0\u10e0\0\u10e0\0\u1110\0\u10e0\0\u1140"+
    "\0\u1170\0\u11a0\0\u11d0\0\u1200\0\u1230\0\u1260\0\u1230\0\u1290"+
    "\0\u12c0\0\u12f0\0\u1320\0\u1350\0\u1350\0\u1380\0\u13b0\0\u13b0"+
    "\0\u13e0\0\u1410\0\u1440\0\u1470\0\u14a0\0\u14d0\0\u1500\0\u1530"+
    "\0\u1560\0\u1590\0\u15c0\0\u15f0\0\u1620\0\u1650\0\u1680\0\u16b0"+
    "\0\u16e0\0\u1710\0\u1740\0\u1770\0\u17a0\0\140";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[150];
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
    "\1\3\3\4\1\5\1\6\1\7\1\10\1\11\1\3"+
    "\1\6\1\12\1\13\1\10\1\14\1\15\1\16\1\17"+
    "\1\6\1\20\4\21\2\3\1\21\1\22\1\23\1\21"+
    "\1\24\1\25\2\21\1\26\1\21\1\27\1\30\1\21"+
    "\1\31\1\32\1\33\1\34\1\21\1\35\1\36\1\21"+
    "\1\37\1\40\2\3\1\40\1\3\1\40\1\41\2\40"+
    "\1\3\16\40\1\42\27\40\62\0\1\4\77\0\1\10"+
    "\45\0\1\10\62\0\1\10\3\0\1\15\1\16\1\0"+
    "\1\10\51\0\1\10\2\0\1\15\1\16\1\0\1\10"+
    "\47\0\1\43\3\0\1\44\3\0\1\10\52\0\1\45"+
    "\1\0\2\16\4\0\1\46\1\0\1\47\6\0\1\46"+
    "\36\0\1\45\1\0\2\16\4\0\1\46\10\0\1\46"+
    "\35\0\1\10\5\0\1\10\54\0\2\50\2\0\5\50"+
    "\1\0\17\50\1\51\6\50\20\0\2\50\2\0\5\50"+
    "\1\0\26\50\20\0\2\50\2\0\5\50\1\0\15\50"+
    "\1\52\1\50\1\53\6\50\20\0\2\50\2\0\5\50"+
    "\1\0\13\50\1\54\1\50\1\55\10\50\20\0\2\50"+
    "\2\0\5\50\1\0\13\50\1\56\12\50\20\0\2\50"+
    "\2\0\5\50\1\0\1\50\1\57\7\50\1\60\3\50"+
    "\1\61\10\50\20\0\2\50\2\0\5\50\1\0\6\50"+
    "\1\60\5\50\1\62\11\50\20\0\2\50\2\0\5\50"+
    "\1\0\5\50\1\63\7\50\1\64\10\50\20\0\2\50"+
    "\2\0\5\50\1\0\5\50\1\65\20\50\20\0\2\50"+
    "\2\0\5\50\1\0\15\50\1\52\1\50\1\66\6\50"+
    "\20\0\2\50\2\0\5\50\1\0\5\50\1\67\7\50"+
    "\1\70\10\50\20\0\2\50\2\0\5\50\1\0\21\50"+
    "\1\71\4\50\20\0\2\50\2\0\5\50\1\0\10\50"+
    "\1\72\6\50\1\73\6\50\20\0\2\50\2\0\5\50"+
    "\1\0\15\50\1\74\10\50\20\0\2\50\2\0\5\50"+
    "\1\0\10\50\1\75\15\50\60\0\1\10\1\40\2\0"+
    "\1\40\1\0\1\40\1\0\2\40\1\0\16\40\1\0"+
    "\27\40\6\0\1\76\2\0\1\77\16\0\1\100\14\0"+
    "\1\101\2\0\1\102\1\0\1\103\5\0\12\43\1\104"+
    "\45\43\2\44\1\105\1\44\1\106\53\44\17\0\2\45"+
    "\4\0\1\46\10\0\1\46\34\0\2\107\2\0\2\110"+
    "\56\0\2\111\2\0\3\111\4\0\6\111\37\0\2\112"+
    "\2\0\5\112\1\0\26\112\20\0\2\112\2\0\5\112"+
    "\1\0\17\112\1\113\6\112\20\0\2\112\2\0\5\112"+
    "\1\0\15\112\1\114\10\112\20\0\2\112\2\0\5\112"+
    "\1\0\5\112\1\115\20\112\20\0\2\112\2\0\5\112"+
    "\1\0\1\112\1\116\24\112\20\0\2\112\2\0\5\112"+
    "\1\0\14\112\1\117\11\112\20\0\2\112\2\0\5\112"+
    "\1\0\20\112\1\120\5\112\20\0\2\112\2\0\5\112"+
    "\1\0\13\112\1\121\12\112\20\0\2\112\2\0\5\112"+
    "\1\0\17\112\1\122\6\112\20\0\2\112\2\0\5\112"+
    "\1\0\1\123\20\112\1\122\4\112\20\0\2\112\2\0"+
    "\5\112\1\0\14\112\1\122\4\112\1\122\4\112\20\0"+
    "\2\112\2\0\5\112\1\0\15\112\1\124\10\112\20\0"+
    "\2\112\2\0\5\112\1\0\24\112\1\122\1\112\20\0"+
    "\2\112\2\0\5\112\1\0\11\112\1\125\14\112\20\0"+
    "\2\112\2\0\5\112\1\0\1\112\1\114\17\112\1\126"+
    "\4\112\20\0\2\112\2\0\5\112\1\0\6\112\1\122"+
    "\17\112\20\0\2\112\2\0\5\112\1\0\1\112\1\127"+
    "\15\112\1\130\6\112\20\0\2\112\2\0\5\112\1\0"+
    "\5\112\1\131\20\112\20\0\2\112\2\0\5\112\1\0"+
    "\22\112\1\132\3\112\20\0\2\112\2\0\5\112\1\0"+
    "\11\112\1\133\14\112\20\0\2\112\2\0\5\112\1\0"+
    "\11\112\1\134\14\112\1\0\12\43\1\104\3\43\1\105"+
    "\41\43\2\0\1\105\74\0\2\110\56\0\2\135\2\0"+
    "\5\135\1\0\26\135\20\0\2\135\2\0\5\135\1\0"+
    "\1\135\1\136\24\135\20\0\2\135\2\0\5\135\1\0"+
    "\13\135\1\137\12\135\20\0\2\135\2\0\5\135\1\0"+
    "\1\135\1\140\24\135\20\0\2\135\2\0\5\135\1\0"+
    "\20\135\1\141\5\135\20\0\2\135\2\0\5\135\1\0"+
    "\21\135\1\142\4\135\20\0\2\135\2\0\5\135\1\0"+
    "\5\135\1\137\20\135\20\0\2\135\2\0\5\135\1\0"+
    "\20\135\1\143\5\135\20\0\2\135\2\0\5\135\1\0"+
    "\11\135\1\144\6\135\1\145\5\135\20\0\2\135\2\0"+
    "\5\135\1\0\16\135\1\137\7\135\20\0\2\135\2\0"+
    "\5\135\1\0\14\135\1\146\11\135\20\0\2\135\2\0"+
    "\5\135\1\0\22\135\1\147\3\135\20\0\2\135\2\0"+
    "\5\135\1\0\21\135\1\150\4\135\20\0\2\135\2\0"+
    "\5\135\1\0\11\135\1\151\14\135\20\0\2\135\2\0"+
    "\5\135\1\0\14\135\1\137\11\135\20\0\2\135\2\0"+
    "\5\135\1\0\5\135\1\152\20\135\20\0\2\135\2\0"+
    "\5\135\1\0\4\135\1\137\21\135\20\0\2\135\2\0"+
    "\5\135\1\0\13\135\1\153\12\135\20\0\2\154\2\0"+
    "\5\154\1\0\26\154\20\0\2\154\2\0\5\154\1\0"+
    "\25\154\1\155\20\0\2\154\2\0\5\154\1\0\12\154"+
    "\1\155\13\154\20\0\2\154\2\0\5\154\1\0\20\154"+
    "\1\155\5\154\20\0\2\154\2\0\5\154\1\0\11\154"+
    "\1\156\14\154\20\0\2\154\2\0\5\154\1\0\5\154"+
    "\1\157\20\154\20\0\2\154\2\0\5\154\1\0\14\154"+
    "\1\160\11\154\20\0\2\154\2\0\5\154\1\0\21\154"+
    "\1\161\4\154\20\0\2\154\2\0\5\154\1\0\21\154"+
    "\1\155\4\154\20\0\2\154\2\0\5\154\1\0\17\154"+
    "\1\162\6\154\20\0\2\154\2\0\5\154\1\0\11\154"+
    "\1\163\14\154\20\0\2\154\2\0\5\154\1\0\14\154"+
    "\1\164\11\154\20\0\2\154\2\0\5\154\1\0\5\154"+
    "\1\155\20\154\20\0\2\165\2\0\5\165\1\0\26\165"+
    "\20\0\2\165\2\0\5\165\1\0\14\165\1\166\11\165"+
    "\20\0\2\165\2\0\5\165\1\0\21\165\1\167\4\165"+
    "\20\0\2\165\2\0\5\165\1\0\17\165\1\170\6\165"+
    "\20\0\2\165\2\0\5\165\1\0\14\165\1\167\11\165"+
    "\20\0\2\165\2\0\5\165\1\0\3\165\1\167\22\165"+
    "\20\0\2\165\2\0\5\165\1\0\7\165\1\167\16\165"+
    "\20\0\2\171\2\0\5\171\1\0\26\171\20\0\2\171"+
    "\2\0\5\171\1\0\22\171\1\172\3\171\20\0\2\171"+
    "\2\0\5\171\1\0\11\171\1\173\14\171\20\0\2\174"+
    "\2\0\5\174\1\0\26\174\20\0\2\174\2\0\5\174"+
    "\1\0\5\174\1\175\20\174\20\0\2\174\2\0\5\174"+
    "\1\0\14\174\1\176\11\174\20\0\2\177\2\0\5\177"+
    "\1\0\26\177\20\0\2\177\2\0\5\177\1\0\7\177"+
    "\1\200\16\177\20\0\2\201\2\0\5\201\1\0\26\201"+
    "\20\0\2\202\2\0\5\202\1\0\26\202\20\0\2\203"+
    "\2\0\5\203\1\0\26\203\20\0\2\204\2\0\5\204"+
    "\1\0\26\204\20\0\2\205\2\0\5\205\1\0\26\205"+
    "\20\0\2\206\2\0\5\206\1\0\26\206\20\0\2\207"+
    "\2\0\5\207\1\0\26\207\20\0\2\210\2\0\5\210"+
    "\1\0\26\210\20\0\2\211\2\0\5\211\1\0\26\211"+
    "\20\0\2\212\2\0\5\212\1\0\26\212\20\0\2\213"+
    "\2\0\5\213\1\0\26\213\20\0\2\214\2\0\5\214"+
    "\1\0\26\214\20\0\2\215\2\0\5\215\1\0\26\215"+
    "\20\0\2\216\2\0\5\216\1\0\26\216\20\0\2\217"+
    "\2\0\5\217\1\0\26\217\20\0\2\220\2\0\5\220"+
    "\1\0\26\220\20\0\2\221\2\0\5\221\1\0\26\221"+
    "\20\0\2\222\2\0\5\222\1\0\26\222\20\0\2\223"+
    "\2\0\5\223\1\0\26\223\20\0\2\224\2\0\5\224"+
    "\1\0\26\224\20\0\2\225\2\0\5\225\1\0\26\225"+
    "\20\0\2\226\2\0\5\226\1\0\26\226\1\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[6096];
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


  /** Error code for "Unknown internal scanner error". */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  /** Error code for "could not match input". */
  private static final int ZZ_NO_MATCH = 1;
  /** Error code for "pushback value was too large". */
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /**
   * Error messages for {@link #ZZ_UNKNOWN_ERROR}, {@link #ZZ_NO_MATCH}, and
   * {@link #ZZ_PUSHBACK_2BIG} respectively.
   */
  private static final String ZZ_ERROR_MSG[] = {
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state {@code aState}
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\2\0\2\11\2\1\2\11\30\1\1\11\1\1\1\0"+
    "\2\1\2\0\26\1\6\11\1\0\1\11\1\1\1\0"+
    "\116\1\1\11";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[150];
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

  /** Input device. */
  private java.io.Reader zzReader;

  /** Current state of the DFA. */
  private int zzState;

  /** Current lexical state. */
  private int zzLexicalState = YYINITIAL;

  /**
   * This buffer contains the current text to be matched and is the source of the {@link #yytext()}
   * string.
   */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** Text position at the last accepting state. */
  private int zzMarkedPos;

  /** Current text position in the buffer. */
  private int zzCurrentPos;

  /** Marks the beginning of the {@link #yytext()} string in the buffer. */
  private int zzStartRead;

  /** Marks the last character in the buffer, that has been read from input. */
  private int zzEndRead;

  /**
   * Whether the scanner is at the end of file.
   * @see #yyatEOF
   */
  private boolean zzAtEOF;

  /**
   * The number of occupied positions in {@link #zzBuffer} beyond {@link #zzEndRead}.
   *
   * <p>When a lead/high surrogate has been read from the input stream into the final
   * {@link #zzBuffer} position, this will have a value of 1; otherwise, it will have a value of 0.
   */
  private int zzFinalHighSurrogate = 0;

  /** Number of newlines encountered up to the start of the matched text. */
  private int yyline;

  /** Number of characters from the last newline up to the start of the matched text. */
  private int yycolumn;

  /** Number of characters up to the start of the matched text. */
  @SuppressWarnings("unused")
  private long yychar;

  /** Whether the scanner is currently at the beginning of a line. */
  @SuppressWarnings("unused")
  private boolean zzAtBOL = true;

  /** Whether the user-EOF-code has already been executed. */
  @SuppressWarnings("unused")
  private boolean zzEOFDone;

  /* user code: */
    public Symbol currentSymbol;
    public int intValue = 0;
    public double doubleValue = 0.0;
    public boolean booleanValue;
    public StringBuffer string  = new StringBuffer();
    private Symbol symbol(String token, Type type) {
        return new Symbol(token, type);
    }


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public CompilerScanner(java.io.Reader in) {
    this.zzReader = in;
  }

  /**
   * Translates raw input code points to DFA table row
   */
  private static int zzCMap(int input) {
    int offset = input & 255;
    return offset == input ? ZZ_CMAP_BLOCKS[offset] : ZZ_CMAP_BLOCKS[ZZ_CMAP_TOP[input >> 8] | offset];
  }

  /**
   * Refills the input buffer.
   *
   * @return {@code false} iff there was new input.
   * @exception java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead - zzStartRead);

      /* translate stored positions */
      zzEndRead -= zzStartRead;
      zzCurrentPos -= zzStartRead;
      zzMarkedPos -= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length - zzFinalHighSurrogate) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzBuffer.length * 2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
    }

    /* fill the buffer with new input */
    int requested = zzBuffer.length - zzEndRead;
    int numRead = zzReader.read(zzBuffer, zzEndRead, requested);

    /* not supposed to occur according to specification of java.io.Reader */
    if (numRead == 0) {
      throw new java.io.IOException(
          "Reader returned 0 characters. See JFlex examples/zero-reader for a workaround.");
    }
    if (numRead > 0) {
      zzEndRead += numRead;
      if (Character.isHighSurrogate(zzBuffer[zzEndRead - 1])) {
        if (numRead == requested) { // We requested too few chars to encode a full Unicode character
          --zzEndRead;
          zzFinalHighSurrogate = 1;
        } else {                    // There is room in the buffer for at least one more char
          int c = zzReader.read();  // Expecting to read a paired low surrogate char
          if (c == -1) {
            return true;
          } else {
            zzBuffer[zzEndRead++] = (char)c;
          }
        }
      }
      /* potentially more input available */
      return false;
    }

    /* numRead < 0 ==> end of stream */
    return true;
  }


  /**
   * Closes the input reader.
   *
   * @throws java.io.IOException if the reader could not be closed.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true; // indicate end of file
    zzEndRead = zzStartRead; // invalidate buffer

    if (zzReader != null) {
      zzReader.close();
    }
  }


  /**
   * Resets the scanner to read from a new input stream.
   *
   * <p>Does not close the old reader.
   *
   * <p>All internal variables are reset, the old input stream <b>cannot</b> be reused (internal
   * buffer is discarded and lost). Lexical state is set to {@code ZZ_INITIAL}.
   *
   * <p>Internal scan buffer is resized down to its initial length, if it has grown.
   *
   * @param reader The new input stream.
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzEOFDone = false;
    yyResetPosition();
    zzLexicalState = YYINITIAL;
    if (zzBuffer.length > ZZ_BUFFERSIZE) {
      zzBuffer = new char[ZZ_BUFFERSIZE];
    }
  }

  /**
   * Resets the input position.
   */
  private final void yyResetPosition() {
      zzAtBOL  = true;
      zzAtEOF  = false;
      zzCurrentPos = 0;
      zzMarkedPos = 0;
      zzStartRead = 0;
      zzEndRead = 0;
      zzFinalHighSurrogate = 0;
      yyline = 0;
      yycolumn = 0;
      yychar = 0L;
  }


  /**
   * Returns whether the scanner has reached the end of the reader it reads from.
   *
   * @return whether the scanner has reached EOF.
   */
  public final boolean yyatEOF() {
    return zzAtEOF;
  }


  /**
   * Returns the current lexical state.
   *
   * @return the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state.
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   *
   * @return the matched text.
   */
  public final String yytext() {
    return new String(zzBuffer, zzStartRead, zzMarkedPos-zzStartRead);
  }


  /**
   * Returns the character at the given position from the matched text.
   *
   * <p>It is equivalent to {@code yytext().charAt(pos)}, but faster.
   *
   * @param position the position of the character to fetch. A value from 0 to {@code yylength()-1}.
   *
   * @return the character at {@code position}.
   */
  public final char yycharat(int position) {
    return zzBuffer[zzStartRead + position];
  }


  /**
   * How many characters were matched.
   *
   * @return the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occurred while scanning.
   *
   * <p>In a well-formed scanner (no or only correct usage of {@code yypushback(int)} and a
   * match-all fallback rule) this method will only be called with things that
   * "Can't Possibly Happen".
   *
   * <p>If this method is called, something is seriously wrong (e.g. a JFlex bug producing a faulty
   * scanner etc.).
   *
   * <p>Usual syntax/scanner level error handling should be done in error fallback rules.
   *
   * @param errorCode the code of the error message to display.
   */
  private static void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    } catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  }


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * <p>They will be read again by then next call of the scanning method.
   *
   * @param number the number of characters to be read again. This number must not be greater than
   *     {@link #yylength()}.
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }




  /**
   * Resumes scanning until the next regular expression is matched, the end of input is encountered
   * or an I/O-Error occurs.
   *
   * @return the next token.
   * @exception java.io.IOException if any I/O-Error occurs.
   */
  public Symbol nextSymbol() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char[] zzBufferL = zzBuffer;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      boolean zzR = false;
      int zzCh;
      int zzCharCount;
      for (zzCurrentPosL = zzStartRead  ;
           zzCurrentPosL < zzMarkedPosL ;
           zzCurrentPosL += zzCharCount ) {
        zzCh = Character.codePointAt(zzBufferL, zzCurrentPosL, zzMarkedPosL);
        zzCharCount = Character.charCount(zzCh);
        switch (zzCh) {
        case '\u000B':  // fall through
        case '\u000C':  // fall through
        case '\u0085':  // fall through
        case '\u2028':  // fall through
        case '\u2029':
          yyline++;
          yycolumn = 0;
          zzR = false;
          break;
        case '\r':
          yyline++;
          yycolumn = 0;
          zzR = true;
          break;
        case '\n':
          if (zzR)
            zzR = false;
          else {
            yyline++;
            yycolumn = 0;
          }
          break;
        default:
          zzR = false;
          yycolumn += zzCharCount;
        }
      }

      if (zzR) {
        // peek one character ahead if it is
        // (if we have counted one line too much)
        boolean zzPeek;
        if (zzMarkedPosL < zzEndReadL)
          zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        else if (zzAtEOF)
          zzPeek = false;
        else {
          boolean eof = zzRefill();
          zzEndReadL = zzEndRead;
          zzMarkedPosL = zzMarkedPos;
          zzBufferL = zzBuffer;
          if (eof)
            zzPeek = false;
          else
            zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        }
        if (zzPeek) yyline--;
      }
      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;

      zzState = ZZ_LEXSTATE[zzLexicalState];

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {

          if (zzCurrentPosL < zzEndReadL) {
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
            zzCurrentPosL += Character.charCount(zzInput);
          }
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
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMap(zzInput) ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
        zzAtEOF = true;
        return null;
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1:
            { System.err.println("\nscanner undefined token error: Token " + yytext() + " is not defined at "+ "line " + (yyline + 1) + " with character index " + yycolumn + "\n");
        return symbol(yytext(), Type.UNDEFINED);
            }
            // fall through
          case 21: break;
          case 2:
            { return symbol(yytext(), Type.WHITESPACE);
            }
            // fall through
          case 22: break;
          case 3:
            { return symbol(yytext(), Type.OPERATOR_AND_PUNCTUATION);
            }
            // fall through
          case 23: break;
          case 4:
            { yybegin(STRING);
        return symbol(yytext(), Type.STRING);
            }
            // fall through
          case 24: break;
          case 5:
            { intValue = Integer.valueOf(yytext());
        return symbol(yytext(), Type.INTEGER_NUMBER);
            }
            // fall through
          case 25: break;
          case 6:
            { return symbol(yytext(), Type.IDENTIFIER);
            }
            // fall through
          case 26: break;
          case 7:
            { string.append(yytext()); return symbol(yytext(), Type.STRING);
            }
            // fall through
          case 27: break;
          case 8:
            { yybegin(YYINITIAL);
                        string.append(yytext());
                        String value = string.toString();
                        string.setLength(0);
                        return symbol(yytext(), Type.STRING);
            }
            // fall through
          case 28: break;
          case 9:
            { return symbol(yytext(), Type.COMMENT);
            }
            // fall through
          case 29: break;
          case 10:
            { doubleValue = Double.valueOf(yytext());
        return symbol(yytext(), Type.REAL_NUMBER);
            }
            // fall through
          case 30: break;
          case 11:
            { return symbol(yytext(), Type.RESERVED_KEYWORD);
            }
            // fall through
          case 31: break;
          case 12:
            { string.append("\""); return symbol(yytext(), Type.ESCAPE_CHAR);
            }
            // fall through
          case 32: break;
          case 13:
            { string.append("'"); return symbol(yytext(), Type.ESCAPE_CHAR);
            }
            // fall through
          case 33: break;
          case 14:
            { string.append("\\"); return symbol(yytext(), Type.ESCAPE_CHAR);
            }
            // fall through
          case 34: break;
          case 15:
            { string.append("\n"); return symbol(yytext(), Type.ESCAPE_CHAR);
            }
            // fall through
          case 35: break;
          case 16:
            { string.append("\r"); return symbol(yytext(), Type.ESCAPE_CHAR);
            }
            // fall through
          case 36: break;
          case 17:
            { string.append("\t"); return symbol(yytext(), Type.ESCAPE_CHAR);
            }
            // fall through
          case 37: break;
          case 18:
            { doubleValue = Double.valueOf(yytext());
        return symbol(yytext(), Type.SCIENTIFIC_NOTATION);
            }
            // fall through
          case 38: break;
          case 19:
            { String absoluteStringValue = yytext().substring(yytext().indexOf("0") + 2);
        char firstChar = yytext().charAt(0);
        String stringToParse = (firstChar == '-') ? firstChar + absoluteStringValue : absoluteStringValue;
        intValue = Integer.parseInt(stringToParse, 16);
        return symbol(yytext(), Type.HEX);
            }
            // fall through
          case 39: break;
          case 20:
            { booleanValue = Boolean.valueOf(yytext());
        return symbol(yytext(), Type.BOOLEAN);
            }
            // fall through
          case 40: break;
          default:
            zzScanError(ZZ_NO_MATCH);
        }
      }
    }
  }
  @Override
  public String nextToken() {
      try {
          currentSymbol = nextSymbol();
          if (currentSymbol == null) {
              return "$";
          }
          while (currentSymbol.getType() == Type.WHITESPACE || currentSymbol.getType() == Type.COMMENT) {
              currentSymbol = nextSymbol();
              if (currentSymbol == null) {
                  return "$";
              }
          }
          String token;
          switch (currentSymbol.getType()) {
              case IDENTIFIER:
                  token = "id";
                  break;
              case HEX:
                  token = "hex_const";
                  break;     
              case INTEGER_NUMBER:
                  token = "int_const";
                  break;
              case SCIENTIFIC_NOTATION:
              case REAL_NUMBER:
                  token = "double_const";
                  break;
              case ESCAPE_CHAR:
                  token = "escape_char_const";
                  break;
              case STRING:
                  token = "string_const";
                  break;
              default:
                  token = currentSymbol.getToken();
          }
          if (currentSymbol.getToken().equals(",")) {
              token = "comma";
          }
          return token;
      } catch (IOException e) {
          e.printStackTrace();
          return null;
      }
  }

}
