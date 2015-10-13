package plasma.fx.scene.webview.style;

public interface RenderState {
  static final int MASK_TEXTDECORATION_UNDERLINE = 1;
  static final int MASK_TEXTDECORATION_OVERLINE = 2;
  static final int MASK_TEXTDECORATION_LINE_THROUGH = 4;
  static final int MASK_TEXTDECORATION_BLINK = 8;

  static final int TEXTTRANSFORM_NONE = 0;
  static final int TEXTTRANSFORM_CAPITALIZE = 1;
  static final int TEXTTRANSFORM_UPPERCASE = 2;
  static final int TEXTTRANSFORM_LOWERCASE = 4;
  // TODO how to handle style cascading?
  // static final int TEXTTRANSFORM_INHERIT = 8;

  static final int DISPLAY_NONE = 0;
  static final int DISPLAY_INLINE = 1;
  static final int DISPLAY_BLOCK = 2;
  static final int DISPLAY_LIST_ITEM = 3;
  static final int DISPLAY_TABLE_ROW = 4;
  static final int DISPLAY_TABLE_CELL = 5;
  static final int DISPLAY_TABLE = 6;

  static final int WS_NORMAL = 0;
  static final int WS_PRE = 1;
  static final int WS_NOWRAP = 2;

  static final int VISIBILITY_VISIBLE = 0;
  static final int VISIBILITY_HIDDEN = 1;
  static final int VISIBILITY_COLLAPSE = 2;

  static final int POSITION_STATIC = 0;
  static final int POSITION_ABSOLUTE = 1;
  static final int POSITION_RELATIVE = 2;
  static final int POSITION_FIXED = 3;

  static final int FLOAT_NONE = 0;
  static final int FLOAT_LEFT = 1;
  static final int FLOAT_RIGHT = 2;

  static final int OVERFLOW_NONE = 0;
  static final int OVERFLOW_SCROLL = 1;
  static final int OVERFLOW_AUTO = 2;
  static final int OVERFLOW_HIDDEN = 3;
  static final int OVERFLOW_VISIBLE = 4;

  int getPosition();

  int getFloat();

  int getVisibility();

//  Font getFont();

  int getFontBase();

//  WordInfo getWordInfo(String word);

//  Color getColor();

//  Color getBackgroundColor();

//  Color getTextBackgroundColor();

//  BackgroundInfo getBackgroundInfo();

//  Color getOverlayColor();

  int getTextTransform();

  int getTextDecorationMask();

//  FontMetrics getFontMetrics();

  int getBlankWidth();

  boolean isHighlight();

  void setHighlight(boolean highlight);

  RenderState getPreviousRenderState();

  int getAlignXPercent();

  int getAlignYPercent();

  int getCount(String counter, int nesting);

  int getDisplay();

  void resetCount(String counter, int nesting, int value);

  int incrementCount(String counter, int nesting);

  int getTextIndent(int availWidth);

  String getTextIndentText();

  int getWhiteSpace();

//  HtmlInsets getMarginInsets();

//  HtmlInsets getPaddingInsets();

  int getOverflowX();

  int getOverflowY();

  void invalidate();

//  BorderInfo getBorderInfo();
}
