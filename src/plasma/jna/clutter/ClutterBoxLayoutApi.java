package plasma.jna.clutter;

import plasma.fx.scene.ClutterActor;
import plasma.fx.scene.layout.ClutterBoxLayout;

import com.sun.jna.Pointer;

public interface ClutterBoxLayoutApi {

//@formatter:off
  
  Pointer  clutter_box_layout_new                 ();
  
//  CLUTTER_AVAILABLE_IN_1_12
  void                    clutter_box_layout_set_orientation      (ClutterBoxLayout     layout,
                                                                   int                  orientation); // ClutterOrientation
//  CLUTTER_AVAILABLE_IN_1_12
  int                     clutter_box_layout_get_orientation      (ClutterBoxLayout     layout); // ClutterOrientation

  void                    clutter_box_layout_set_spacing          (ClutterBoxLayout     layout,
                                                                   int                  spacing);
  int                     clutter_box_layout_get_spacing          (ClutterBoxLayout     layout);
  void                    clutter_box_layout_set_homogeneous      (ClutterBoxLayout     layout,
                                                                   boolean              homogeneous);
  boolean                 clutter_box_layout_get_homogeneous      (ClutterBoxLayout     layout);
  void                    clutter_box_layout_set_pack_start       (ClutterBoxLayout     layout,
                                                                   boolean              pack_start);
  boolean                 clutter_box_layout_get_pack_start       (ClutterBoxLayout     layout);

//  CLUTTER_DEPRECATED_IN_1_12_FOR(clutter_box_layout_set_orientation)
//  void                    clutter_box_layout_set_vertical         (ClutterBoxLayout    *layout,
//                                                                   gboolean             vertical);
//  CLUTTER_DEPRECATED_IN_1_12_FOR(clutter_box_layout_get_orientation)
//  gboolean                clutter_box_layout_get_vertical         (ClutterBoxLayout    *layout);

  void                    clutter_box_layout_pack                 (ClutterBoxLayout     layout,
                                                                   ClutterActor         actor,
                                                                   boolean              expand,
                                                                   boolean              x_fill,
                                                                   boolean              y_fill,
                                                                   int                  x_align, // ClutterBoxAlignment
                                                                   int                  y_align); // ClutterBoxAlignment
//  CLUTTER_DEPRECATED_IN_1_12
  void                    clutter_box_layout_set_alignment        (ClutterBoxLayout     layout,
                                                                   ClutterActor         actor,
                                                                   int                  x_align, // ClutterBoxAlignment
                                                                   int                  y_align); // ClutterBoxAlignment
//  CLUTTER_DEPRECATED_IN_1_12
  void                    clutter_box_layout_get_alignment        (ClutterBoxLayout     layout,
                                                                   ClutterActor         actor,
                                                                   int[]                x_align, // ClutterBoxAlignment
                                                                   int[]                y_align); // ClutterBoxAlignment
//  CLUTTER_DEPRECATED_IN_1_12
  void                    clutter_box_layout_set_fill             (ClutterBoxLayout     layout,
                                                                   ClutterActor         actor,
                                                                   boolean              x_fill,
                                                                   boolean              y_fill);
//  CLUTTER_DEPRECATED_IN_1_12
  void                    clutter_box_layout_get_fill             (ClutterBoxLayout     layout,
                                                                   ClutterActor         actor,
                                                                   boolean[]            x_fill,
                                                                   boolean[]            y_fill);
//  CLUTTER_DEPRECATED_IN_1_12
  void                    clutter_box_layout_set_expand           (ClutterBoxLayout     layout,
                                                                   ClutterActor         actor,
                                                                   boolean              expand);
//  CLUTTER_DEPRECATED_IN_1_12
  boolean                 clutter_box_layout_get_expand           (ClutterBoxLayout     layout,
                                                                   ClutterActor         actor);

//  CLUTTER_DEPRECATED_IN_1_12
  void                    clutter_box_layout_set_use_animations   (ClutterBoxLayout     layout,
                                                                   boolean              animate);
//  CLUTTER_DEPRECATED_IN_1_12
  boolean                 clutter_box_layout_get_use_animations   (ClutterBoxLayout     layout);
//  CLUTTER_DEPRECATED_IN_1_12
// TODO  void                    clutter_box_layout_set_easing_mode      (ClutterBoxLayout    *layout,
//                                                                   gulong               mode);
//  CLUTTER_DEPRECATED_IN_1_12
// TODO  gulong                  clutter_box_layout_get_easing_mode      (ClutterBoxLayout    *layout);
//  CLUTTER_DEPRECATED_IN_1_12
  void                    clutter_box_layout_set_easing_duration  (ClutterBoxLayout     layout,
                                                                   int                  msecs);
//  CLUTTER_DEPRECATED_IN_1_12
  int                     clutter_box_layout_get_easing_duration  (ClutterBoxLayout     layout);
  
//@formatter:on
  
}
