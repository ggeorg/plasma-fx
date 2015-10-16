package plasma.fx.scene.layout;

/**
 * Grid position modes.
 * 
 * Since: 1.12
 */
public enum ClutterGridPosition {
  /** left position */
  CLUTTER_GRID_POSITION_LEFT,
  /** right position */
  CLUTTER_GRID_POSITION_RIGHT,
  /** top position */
  CLUTTER_GRID_POSITION_TOP,
  /** bottom position */
  CLUTTER_GRID_POSITION_BOTTOM;

  public static ClutterGridPosition valueOf(int ordinal) {
    switch (ordinal) {
    case 0:
      return CLUTTER_GRID_POSITION_LEFT;
    case 1:
      return CLUTTER_GRID_POSITION_RIGHT;
    case 2:
      return CLUTTER_GRID_POSITION_TOP;
    case 3:
      return CLUTTER_GRID_POSITION_BOTTOM;
    default:
      return CLUTTER_GRID_POSITION_LEFT;
    }
  }
}
