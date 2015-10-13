package plasma.fx.scene;

/**
 * A {@code PangoAlignment} describes how to align the lines of a #PangoLayout
 * within the available space. If the #PangoLayout is set to justify using
 * pango_layout_set_justify(), this only has effect for partial lines.
 */
public enum PangoAlignment {
  /** Put all available space on the right. */
  PANGO_ALIGN_LEFT,
  /** Center the line within the available space. */
  PANGO_ALIGN_CENTER,
  /** Put all available space on the left. */
  PANGO_ALIGN_RIGHT;

  public static PangoAlignment valueOf(int ordinal) {
    switch (ordinal) {
    case 0:
      return PANGO_ALIGN_LEFT;
    case 1:
      return PANGO_ALIGN_CENTER;
    case 2:
      return PANGO_ALIGN_RIGHT;
    default:
      return PANGO_ALIGN_LEFT;
    }
  }
}
