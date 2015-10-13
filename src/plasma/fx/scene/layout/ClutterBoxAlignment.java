package plasma.fx.scene.layout;

/**
 * The alignment policies available on each axis of the {@link ClutterBoxLayout}.
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

  /** Align the child to the center. */
  CLUTTER_BOX_ALIGNMENT_CENTER
}
