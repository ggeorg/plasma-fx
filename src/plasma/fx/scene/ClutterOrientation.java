package plasma.fx.scene;

/**
 * Represents the orientation of actors or layout managers.
 * 
 * Since: 1.12
 */
public enum ClutterOrientation {

  /** An horizontal orientation. */
  CLUTTER_ORIENTATION_HORIZONTAL,

  /** A vertical orientation. */
  CLUTTER_ORIENTATION_VERTICAL;

  public static ClutterOrientation valueOf(int ordinal) {
    switch (ordinal) {
    case 0:
      return CLUTTER_ORIENTATION_HORIZONTAL;
    case 1:
      return CLUTTER_ORIENTATION_VERTICAL;
    default:
      return CLUTTER_ORIENTATION_HORIZONTAL;
    }
  }

}
