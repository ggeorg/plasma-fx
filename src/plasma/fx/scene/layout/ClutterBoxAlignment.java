package plasma.fx.scene.layout;

/**
 * The alignment policies available on each axis of the {@link ClutterBoxLayout}
 * .
 * 
 * Since: 1.2
 */
public enum ClutterBoxAlignment {
  /**
   * Align the child to the top or to to the left, depending on the used axis.
   */
  CLUTTER_BOX_ALIGNMENT_START,

  /**
   * Align the child to the bottom or to the right, depending on the used axis.
   */
  CLUTTER_BOX_ALIGNMENT_END,

  /**
   * Align the child to the center.
   */
  CLUTTER_BOX_ALIGNMENT_CENTER;

  public static ClutterBoxAlignment valueOf(int ordinal) {
    switch (ordinal) {
    case 0:
      return CLUTTER_BOX_ALIGNMENT_START;
    case 1:
      return CLUTTER_BOX_ALIGNMENT_END;
    case 2:
      return CLUTTER_BOX_ALIGNMENT_CENTER;
    default:
      return CLUTTER_BOX_ALIGNMENT_START;
    }
  }
}
