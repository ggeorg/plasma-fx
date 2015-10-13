package plasma.fx.scene;

/**
 * A {@code PangoWrapMode} describes how to wrap the lines of a #PangoLayout to
 * the desired width.
 */
public enum PangoWrapMode {
  /**
   * Wrap lines at word boundaries.
   */
  PANGO_WRAP_WORD,
  /**
   * Wrap lines at character boundaries.
   */
  PANGO_WRAP_CHAR,
  /**
   * Wrap lines at word boundaries, but fall back to character boundaries if
   * there is not enough space for a full word.
   */
  PANGO_WRAP_WORD_CHAR;
  
  public static PangoWrapMode valueOf(int ordinal) {
    switch(ordinal) {
    case 0:
      return PangoWrapMode.PANGO_WRAP_WORD;
    case 1:
      return PangoWrapMode.PANGO_WRAP_CHAR;
    case 2:
      return PangoWrapMode.PANGO_WRAP_WORD_CHAR;
    default:
      return PangoWrapMode.PANGO_WRAP_WORD;
    }
  }
}
