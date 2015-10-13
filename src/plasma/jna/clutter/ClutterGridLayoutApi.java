package plasma.jna.clutter;

import plasma.fx.scene.ClutterActor;
import plasma.fx.scene.layout.ClutterGridLayout;

import com.sun.jna.Pointer;

public interface ClutterGridLayoutApi {

//@formatter:off
  
//  CLUTTER_AVAILABLE_IN_1_12
  Pointer             clutter_grid_layout_new                         ();

//  CLUTTER_AVAILABLE_IN_1_12
  void                clutter_grid_layout_attach                      (ClutterGridLayout  layout,
                                                                       ClutterActor       child,
                                                                       int                left,
                                                                       int                top,
                                                                       int                width,
                                                                       int                height);

//  CLUTTER_AVAILABLE_IN_1_12
  void                clutter_grid_layout_attach_next_to              (ClutterGridLayout    layout,
                                                                       ClutterActor         child,
                                                                       ClutterActor         sibling,
                                                                       int                  side, // ClutterGridPosition
                                                                       int                  width,
                                                                       int                  height);

//  CLUTTER_AVAILABLE_IN_1_12
  ClutterActor        clutter_grid_layout_get_child_at                (ClutterGridLayout  layout,
                                                                       int                left,
                                                                       int                top);

//  CLUTTER_AVAILABLE_IN_1_12
  void                clutter_grid_layout_insert_row                  (ClutterGridLayout  layout,
                                                                       int                position);

//  CLUTTER_AVAILABLE_IN_1_12
  void                clutter_grid_layout_insert_column               (ClutterGridLayout  layout,
                                                                       int                position);

//  CLUTTER_AVAILABLE_IN_1_12
  void                clutter_grid_layout_insert_next_to              (ClutterGridLayout    layout,
                                                                       ClutterActor         sibling,
                                                                       int                  side); // ClutterGridPosition

//  CLUTTER_AVAILABLE_IN_1_12
  void                clutter_grid_layout_set_orientation             (ClutterGridLayout  layout,
                                                                       int                orientation); // ClutterOrientation

//  CLUTTER_AVAILABLE_IN_1_12
  int                 clutter_grid_layout_get_orientation             (ClutterGridLayout  layout); // ClutterOrientation

//  CLUTTER_AVAILABLE_IN_1_12
  void                clutter_grid_layout_set_column_spacing          (ClutterGridLayout  layout,
                                                                       int                spacing);

//  CLUTTER_AVAILABLE_IN_1_12
  int                 clutter_grid_layout_get_column_spacing          (ClutterGridLayout  layout);

//  CLUTTER_AVAILABLE_IN_1_12
  void                clutter_grid_layout_set_row_spacing             (ClutterGridLayout  layout,
                                                                       int                spacing);

//  CLUTTER_AVAILABLE_IN_1_12
  int                 clutter_grid_layout_get_row_spacing             (ClutterGridLayout  layout);

//  CLUTTER_AVAILABLE_IN_1_12
  void                clutter_grid_layout_set_column_homogeneous      (ClutterGridLayout  layout,
                                                                       boolean            homogeneous);

//  CLUTTER_AVAILABLE_IN_1_12
  boolean             clutter_grid_layout_get_column_homogeneous      (ClutterGridLayout  layout);


//  CLUTTER_AVAILABLE_IN_1_12
  void                clutter_grid_layout_set_row_homogeneous         (ClutterGridLayout  layout,
                                                                       boolean            homogeneous);

//  CLUTTER_AVAILABLE_IN_1_12
  boolean             clutter_grid_layout_get_row_homogeneous         (ClutterGridLayout  layout);
  
//@formatter:on
  
}
