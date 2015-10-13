package plasma.jna.clutter;

import plasma.fx.scene.layout.ClutterFlowLayout;

import com.sun.jna.Pointer;

public interface ClutterFlowLayoutApi {

//@formatter:off
  
  Pointer                clutter_flow_layout_new                (int                     orientation); // ClutterFlowOrientation

  void                   clutter_flow_layout_set_orientation    (ClutterFlowLayout       layout,
                                                                 int                     orientation); // ClutterFlowOrientation
  int                    clutter_flow_layout_get_orientation    (ClutterFlowLayout       layout); // ClutterFlowOrientation
  void                   clutter_flow_layout_set_homogeneous    (ClutterFlowLayout       layout,
                                                                 boolean                 homogeneous);
  boolean                clutter_flow_layout_get_homogeneous    (ClutterFlowLayout       layout);

  void                   clutter_flow_layout_set_column_spacing (ClutterFlowLayout       layout,
                                                                 float                   spacing);
  float                  clutter_flow_layout_get_column_spacing (ClutterFlowLayout       layout);
  void                   clutter_flow_layout_set_row_spacing    (ClutterFlowLayout       layout,
                                                                 float                   spacing);
  float                  clutter_flow_layout_get_row_spacing    (ClutterFlowLayout       layout);

  void                   clutter_flow_layout_set_column_width   (ClutterFlowLayout       layout,
                                                                 float                   min_width,
                                                                 float                   max_width);
  void                   clutter_flow_layout_get_column_width   (ClutterFlowLayout       layout,
                                                                 float[]                 min_width,
                                                                 float[]                 max_width);
  void                   clutter_flow_layout_set_row_height     (ClutterFlowLayout       layout,
                                                                 float                   min_height,
                                                                 float                   max_height);
  void                   clutter_flow_layout_get_row_height     (ClutterFlowLayout       layout,
                                                                 float[]                 min_height,
                                                                 float[]                 max_height);
//  CLUTTER_AVAILABLE_IN_1_16
  void                   clutter_flow_layout_set_snap_to_grid   (ClutterFlowLayout       layout,
                                                                 boolean                 snap_to_grid);
//  CLUTTER_AVAILABLE_IN_1_16
  boolean                clutter_flow_layout_get_snap_to_grid   (ClutterFlowLayout       layout);
  
//@formatter:on
  
}
