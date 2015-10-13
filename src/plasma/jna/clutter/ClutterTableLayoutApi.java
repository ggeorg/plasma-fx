package plasma.jna.clutter;

import plasma.fx.scene.ClutterActor;
import plasma.fx.scene.layout.ClutterTableLayout;

import com.sun.jna.Pointer;

public interface ClutterTableLayoutApi {

//@formatter:off
  
  Pointer               clutter_table_layout_new                 ();

  void                  clutter_table_layout_pack                (ClutterTableLayout     layout,
                                                                  ClutterActor           actor,
                                                                  int                    column,
                                                                  int                    row);

  void                  clutter_table_layout_set_column_spacing  (ClutterTableLayout     layout,
                                                                  int                    spacing);
  void                  clutter_table_layout_set_row_spacing     (ClutterTableLayout     layout,
                                                                  int                    spacing);
  int                   clutter_table_layout_get_column_spacing  (ClutterTableLayout     layout);
  int                   clutter_table_layout_get_row_spacing     (ClutterTableLayout     layout);

  void                  clutter_table_layout_set_span            (ClutterTableLayout     layout,
                                                                  ClutterActor           actor,
                                                                  int                    column_span,
                                                                  int                    row_span);
  void                  clutter_table_layout_get_span            (ClutterTableLayout     layout,
                                                                  ClutterActor           actor,
                                                                  int                    column_span,
                                                                  int                    row_span);

//  CLUTTER_DEPRECATED_IN_1_12
  void                  clutter_table_layout_set_alignment       (ClutterTableLayout     layout,
                                                                  ClutterActor           actor,
                                                                  int                    x_align, // ClutterTableAlignment
                                                                  int                    y_align); // ClutterTableAlignment
//  CLUTTER_DEPRECATED_IN_1_12
  void                  clutter_table_layout_get_alignment       (ClutterTableLayout     layout,
                                                                  ClutterActor           actor,
                                                                  int[]                  x_align, // ClutterTableAlignment
                                                                  int[]                  y_align); // ClutterTableAlignment
//  CLUTTER_DEPRECATED_IN_1_12
  void                  clutter_table_layout_set_fill            (ClutterTableLayout     layout,
                                                                  ClutterActor           actor,
                                                                  boolean                x_fill,
                                                                  boolean                y_fill);
//  CLUTTER_DEPRECATED_IN_1_12
  void                  clutter_table_layout_get_fill            (ClutterTableLayout     layout,
                                                                  ClutterActor           actor,
                                                                  boolean[]              x_fill,
                                                                  boolean[]              y_fill);
//  CLUTTER_DEPRECATED_IN_1_12
//  void                  clutter_table_layout_set_expand          (ClutterTableLayout    *layout,
//                                                                  ClutterActor          *actor,
//                                                                  gboolean               x_expand,
//                                                                  gboolean               y_expand);
//  CLUTTER_DEPRECATED_IN_1_12
//  void                  clutter_table_layout_get_expand          (ClutterTableLayout    *layout,
//                                                                  ClutterActor          *actor,
//                                                                  gboolean              *x_expand,
//                                                                  gboolean              *y_expand);

  int                   clutter_table_layout_get_row_count       (ClutterTableLayout     layout);
  int                   clutter_table_layout_get_column_count    (ClutterTableLayout     layout);

//  CLUTTER_DEPRECATED_IN_1_12
//  void                  clutter_table_layout_set_use_animations  (ClutterTableLayout    *layout,
//                                                                  gboolean               animate);
//  CLUTTER_DEPRECATED_IN_1_12
//  gboolean              clutter_table_layout_get_use_animations  (ClutterTableLayout    *layout);
//  CLUTTER_DEPRECATED_IN_1_12
//  void                  clutter_table_layout_set_easing_mode     (ClutterTableLayout    *layout,
//                                                                  gulong                 mode);
//  CLUTTER_DEPRECATED_IN_1_12
//  gulong                clutter_table_layout_get_easing_mode     (ClutterTableLayout    *layout);
//  CLUTTER_DEPRECATED_IN_1_12
//  void                  clutter_table_layout_set_easing_duration (ClutterTableLayout    *layout,
//                                                                  guint                  msecs);
//  CLUTTER_DEPRECATED_IN_1_12
//  guint                 clutter_table_layout_get_easing_duration (ClutterTableLayout    *layout);
  
//@formatter:on
  
}
