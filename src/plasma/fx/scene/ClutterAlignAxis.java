package plasma.fx.scene;

public enum ClutterAlignAxis {
  /** Maintain the alignment on the X axis */
  CLUTTER_ALIGN_X_AXIS,

  /** Maintain the alignment on the Y axis */
  CLUTTER_ALIGN_Y_AXIS,

  /** Maintain the alignment on both the X and Y axis */
  CLUTTER_ALIGN_BOTH;

  public static ClutterAlignAxis valueOf(int ordinal) {
    switch (ordinal) {
    case 0:
      return CLUTTER_ALIGN_X_AXIS;
    case 1:
      return CLUTTER_ALIGN_Y_AXIS;
    case 2:
      return CLUTTER_ALIGN_BOTH;
    default:
      return CLUTTER_ALIGN_X_AXIS;
    }
  }
}