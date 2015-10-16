package plasma.fx.scene;

/**
 * Scroll modes.
 * 
 * Since: 1.12
 */
public enum ClutterScrollMode {
  /** Ignore scrolling. */
  CLUTTER_SCROLL_NONE(0),

  /** Scroll only horizontally. */
  CLUTTER_SCROLL_HORIZONTALLY(1 << 0),
  /** Scroll only vertically. */
  CLUTTER_SCROLL_VERTICALLY(1 << 1),

  /** Scroll in both directions. */
  CLUTTER_SCROLL_BOTH(CLUTTER_SCROLL_HORIZONTALLY.getMode() | CLUTTER_SCROLL_VERTICALLY.getMode());

  private final int mode;

  ClutterScrollMode(int mode) {
    this.mode = mode;
  }

  public int getMode() {
    return mode;
  }

  public static ClutterScrollMode valueOf(int mode) {
    switch (mode) {
    case 0:
      return CLUTTER_SCROLL_NONE;
    case (1 << 0):
      return CLUTTER_SCROLL_HORIZONTALLY;
    case (1 << 1):
      return CLUTTER_SCROLL_VERTICALLY;
    case ((1 << 0) | (1 << 1)):
      return CLUTTER_SCROLL_BOTH;
    default:
      return CLUTTER_SCROLL_NONE;
    }
  }
}
