package plasma.fx.scene.layout;

/**
 * The direction of the arrangement of the children inside a
 * {@link ClutterFlowLayout}.
 * 
 * Since: 1.2
 */
public enum ClutterFlowOrientation {
  /** Arrange the children of the flow layout horizontally first */
  CLUTTER_FLOW_HORIZONTAL,
  /** Arrange the children of the flow layout vertically first */
  CLUTTER_FLOW_VERTICAL;

  public static ClutterFlowOrientation valueOf(int ordinal) {
    switch (ordinal) {
    case 0:
      return CLUTTER_FLOW_HORIZONTAL;
    case 1:
      return CLUTTER_FLOW_VERTICAL;
    default:
      return CLUTTER_FLOW_HORIZONTAL;
    }
  }
}
