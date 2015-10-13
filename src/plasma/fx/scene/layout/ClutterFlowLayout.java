package plasma.fx.scene.layout;

import plasma.jna.clutter.ClutterLibrary;

public class ClutterFlowLayout extends ClutterLayoutManager {

  public ClutterFlowLayout() {
    this(ClutterFlowOrientation.CLUTTER_FLOW_HORIZONTAL);
  }
  
  public ClutterFlowLayout(ClutterFlowOrientation orientation) {
    super(ClutterLibrary.INSTANCE.clutter_flow_layout_new(orientation.ordinal()));
  }
  
  public void setOrientation(ClutterFlowOrientation orientation) {
    ClutterLibrary.INSTANCE.clutter_flow_layout_set_orientation(this, orientation.ordinal());
  }
  
  public ClutterFlowOrientation getOrientation() {
    return ClutterFlowOrientation.valueOf(ClutterLibrary.INSTANCE.clutter_flow_layout_get_orientation(this));
  }
  
  public void setHomogeneous(boolean homogeneous) {
    ClutterLibrary.INSTANCE.clutter_flow_layout_set_homogeneous(this, homogeneous);
  }

  public boolean getHomogeneous() {
    return ClutterLibrary.INSTANCE.clutter_flow_layout_get_homogeneous(this);
  }
  
  public void setColumnsSpacing(float spacing) {
    ClutterLibrary.INSTANCE.clutter_flow_layout_set_column_spacing(this, spacing);
  }

  public float getColumnSpacing() {
    return ClutterLibrary.INSTANCE.clutter_flow_layout_get_column_spacing(this);
  }
  
  public void setRowSpacing(int spacing) {
    ClutterLibrary.INSTANCE.clutter_flow_layout_set_row_spacing(this, spacing);
  }

  public float getRowSpacing() {
    return ClutterLibrary.INSTANCE.clutter_flow_layout_get_row_spacing(this);
  }
  
  // TODO colomn width / row height
  
  public void setSnapToGrid(boolean snapToGrid) {
    ClutterLibrary.INSTANCE.clutter_flow_layout_set_snap_to_grid(this, snapToGrid);
  }
  
  public boolean isSnapToGrid(boolean snapToGrid) {
    return ClutterLibrary.INSTANCE.clutter_flow_layout_get_snap_to_grid(this);
  }
  
}
