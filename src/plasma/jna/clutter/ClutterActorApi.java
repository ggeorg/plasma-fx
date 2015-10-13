package plasma.jna.clutter;

import plasma.fx.scene.ClutterActor;
import plasma.fx.scene.ClutterColor;
import plasma.fx.scene.ClutterMargin;
import plasma.fx.scene.layout.ClutterLayoutManager;

import com.sun.jna.Pointer;

public interface ClutterActorApi {

//@formatter:off
  
  Pointer                         clutter_actor_new                               ();

//TODO  void                     clutter_actor_set_flags                         (ClutterActor                *self,
//                                                                                ClutterActorFlags            flags);
//TODO  void                     clutter_actor_unset_flags                       (ClutterActor                *self,
//                                                                                ClutterActorFlags            flags);
//TODO  ClutterActorFlags        clutter_actor_get_flags                         (ClutterActor                self);
 void                            clutter_actor_show                              (ClutterActor                self);
 void                            clutter_actor_hide                              (ClutterActor                self);
//void                            clutter_actor_realize                           (ClutterActor                *self);
//void                            clutter_actor_unrealize                         (ClutterActor                *self);
 void                            clutter_actor_map                               (ClutterActor                self);
 void                            clutter_actor_unmap                             (ClutterActor                self);
 void                            clutter_actor_paint                             (ClutterActor                self);
 void                            clutter_actor_continue_paint                    (ClutterActor                self);
 void                            clutter_actor_queue_redraw                      (ClutterActor                self);
// CLUTTER_AVAILABLE_IN_1_10
//TODO  void                     clutter_actor_queue_redraw_with_clip            (ClutterActor                *self,
//                                                                                const cairo_rectangle_int_t *clip);
 void                            clutter_actor_queue_relayout                    (ClutterActor                self);
 void                            clutter_actor_destroy                           (ClutterActor                self);
 void                            clutter_actor_set_name                          (ClutterActor                self,
                                                                                  String                      name);
 String                          clutter_actor_get_name                          (ClutterActor                self);
//TODO  AtkObject *              clutter_actor_get_accessible                    (ClutterActor                *self);

 /* Size negotiation */
//TODO  void                     clutter_actor_set_request_mode                  (ClutterActor                *self,
//                                                                                ClutterRequestMode           mode);
//TODO  ClutterRequestMode       clutter_actor_get_request_mode                  (ClutterActor                *self);
//TODO  void                     clutter_actor_get_preferred_width               (ClutterActor                *self,
//                                                                                gfloat                       for_height,
//                                                                                gfloat                      *min_width_p,
//                                                                                gfloat                      *natural_width_p);
//TODO  void                     clutter_actor_get_preferred_height              (ClutterActor                *self,
//                                                                                gfloat                       for_width,
//                                                                                gfloat                      *min_height_p,
//                                                                                gfloat                      *natural_height_p);
//TODO  void                     clutter_actor_get_preferred_size                (ClutterActor                *self,
//                                                                                gfloat                      *min_width_p,
//                                                                                gfloat                      *min_height_p,
//                                                                                gfloat                      *natural_width_p,
//                                                                                gfloat                      *natural_height_p);
//TODO  void                     clutter_actor_allocate                          (ClutterActor                *self,
//                                                                                const ClutterActorBox       *box,
//                                                                                ClutterAllocationFlags       flags);
//TODO  void                     clutter_actor_allocate_preferred_size           (ClutterActor                *self,
//                                                                                ClutterAllocationFlags       flags);
//TODO  void                     clutter_actor_allocate_available_size           (ClutterActor                *self,
//                                                                                gfloat                       x,
//                                                                                gfloat                       y,
//                                                                                gfloat                       available_width,
//                                                                                gfloat                       available_height,
//                                                                                ClutterAllocationFlags       flags);
//TODO  void                     clutter_actor_allocate_align_fill               (ClutterActor                *self,
//                                                                                const ClutterActorBox       *box,
//                                                                                gdouble                      x_align,
//                                                                                gdouble                      y_align,
//                                                                                gboolean                     x_fill,
//                                                                                gboolean                     y_fill,
//                                                                                ClutterAllocationFlags       flags);
//TODO  void                     clutter_actor_set_allocation                    (ClutterActor                *self,
//                                                                                const ClutterActorBox       *box,
//                                                                                ClutterAllocationFlags       flags);
//TODO  void                     clutter_actor_get_allocation_box                (ClutterActor                *self,
//                                                                                ClutterActorBox             *box);
//TODO  void                     clutter_actor_get_allocation_vertices           (ClutterActor                *self,
//                                                                                ClutterActor                *ancestor,
//                                                                                ClutterVertex                verts[]);
 boolean                         clutter_actor_has_allocation                    (ClutterActor                 self);
 void                            clutter_actor_set_size                          (ClutterActor                 self,
                                                                                  float                        width,
                                                                                  float                        height);
 void                            clutter_actor_get_size                          (ClutterActor                 self,
                                                                                  float[]                      width,
                                                                                  float[]                      height);
 void                            clutter_actor_set_position                      (ClutterActor                 self,
                                                                                  float                        x,
                                                                                  float                        y);
 void                            clutter_actor_get_position                      (ClutterActor                 self,
                                                                                  float[]                      x,
                                                                                  float[]                      y);
 boolean                         clutter_actor_get_fixed_position_set            (ClutterActor                self);
 void                            clutter_actor_set_fixed_position_set            (ClutterActor                self,
                                                                                  boolean                     is_set);
 void                            clutter_actor_move_by                           (ClutterActor                self,
                                                                                  float                       dx,
                                                                                  float                       dy);

 /* Actor geometry */
 float                           clutter_actor_get_width                         (ClutterActor                self);
 float                           clutter_actor_get_height                        (ClutterActor                self);
 void                            clutter_actor_set_width                         (ClutterActor                self,
                                                                                  float                       width);
 void                            clutter_actor_set_height                        (ClutterActor                self,
                                                                                  float                       height);
 float                           clutter_actor_get_x                             (ClutterActor                self);
 float                           clutter_actor_get_y                             (ClutterActor                self);
 void                            clutter_actor_set_x                             (ClutterActor                self,
                                                                                  float                       x);
 void                            clutter_actor_set_y                             (ClutterActor                self,
                                                                                  float                       y);
// CLUTTER_AVAILABLE_IN_1_12
 void                            clutter_actor_set_z_position                    (ClutterActor                self,
                                                                                  float                       z_position);
// CLUTTER_AVAILABLE_IN_1_12
 float                           clutter_actor_get_z_position                    (ClutterActor                self);
 
// CLUTTER_AVAILABLE_IN_1_10
 void                            clutter_actor_set_layout_manager               (ClutterActor                 self,
                                                                                 ClutterLayoutManager         manager);
// CLUTTER_AVAILABLE_IN_1_10
 ClutterLayoutManager            clutter_actor_get_layout_manager               (ClutterActor                 self);

// CLUTTER_AVAILABLE_IN_1_10
 void                            clutter_actor_set_x_align                       (ClutterActor                self,
                                                                                  int                         x_align); // ClutterActorAlign
// CLUTTER_AVAILABLE_IN_1_10
 int                             clutter_actor_get_x_align                       (ClutterActor                self); // ClutterActorAlign
// CLUTTER_AVAILABLE_IN_1_10
 void                            clutter_actor_set_y_align                       (ClutterActor                self,
                                                                                  int                         y_align); // ClutterActorAlign
// CLUTTER_AVAILABLE_IN_1_10
int                              clutter_actor_get_y_align                       (ClutterActor                self); // ClutterActorAlign

// CLUTTER_AVAILABLE_IN_1_10
 void                            clutter_actor_set_margin_top                    (ClutterActor                self,
                                                                                  float                       margin);
// CLUTTER_AVAILABLE_IN_1_10
 float                           clutter_actor_get_margin_top                    (ClutterActor                self);
// CLUTTER_AVAILABLE_IN_1_10
 void                            clutter_actor_set_margin_bottom                 (ClutterActor                self,
                                                                                  float                       margin);
// CLUTTER_AVAILABLE_IN_1_10
 float                           clutter_actor_get_margin_bottom                 (ClutterActor                self);
// CLUTTER_AVAILABLE_IN_1_10
 void                            clutter_actor_set_margin_left                   (ClutterActor                self,
                                                                                  float                       margin);
// CLUTTER_AVAILABLE_IN_1_10
 float                           clutter_actor_get_margin_left                   (ClutterActor                self);
// CLUTTER_AVAILABLE_IN_1_10
 void                            clutter_actor_set_margin_right                  (ClutterActor                self,
                                                                                  float                       margin);
// CLUTTER_AVAILABLE_IN_1_10
 float                           clutter_actor_get_margin_right                  (ClutterActor                self);
// CLUTTER_AVAILABLE_IN_1_10
 void                            clutter_actor_set_margin                        (ClutterActor                self,
                                                                                  ClutterMargin               margin);
// CLUTTER_AVAILABLE_IN_1_10
 void                            clutter_actor_get_margin                        (ClutterActor                self,
                                                                                  ClutterMargin               margin);
// CLUTTER_AVAILABLE_IN_1_12
 void                            clutter_actor_set_x_expand                      (ClutterActor                self,
                                                                                  boolean                     expand);
// CLUTTER_AVAILABLE_IN_1_12
 boolean                         clutter_actor_get_x_expand                      (ClutterActor                self);
// CLUTTER_AVAILABLE_IN_1_12
 void                            clutter_actor_set_y_expand                      (ClutterActor                self,
                                                                                  boolean                     expand);
// CLUTTER_AVAILABLE_IN_1_12
 boolean                         clutter_actor_get_y_expand                      (ClutterActor                self);
// CLUTTER_AVAILABLE_IN_1_12
 boolean                         clutter_actor_needs_expand                      (ClutterActor                self,
                                                                                  int                         orientation); //ClutterOrientation

 /* Paint */
 void                            clutter_actor_set_clip                          (ClutterActor                self,
                                                                                  float                       xoff,
                                                                                  float                       yoff,
                                                                                  float                       width,
                                                                                  float                       height);
 void                            clutter_actor_remove_clip                       (ClutterActor                self);
 boolean                         clutter_actor_has_clip                          (ClutterActor                self);
 void                            clutter_actor_get_clip                          (ClutterActor                self,
                                                                                  float[]                     xoff,
                                                                                  float[]                     yoff,
                                                                                  float[]                     width,
                                                                                  float[]                     height);
 void                            clutter_actor_set_clip_to_allocation            (ClutterActor                self,
                                                                                  boolean                     clip_set);
 boolean                         clutter_actor_get_clip_to_allocation            (ClutterActor                self);
 void                            clutter_actor_set_opacity                       (ClutterActor                self,
                                                                                  byte                        opacity);
 byte                            clutter_actor_get_opacity                       (ClutterActor                self);
//TODO  guint8                   clutter_actor_get_paint_opacity                 (ClutterActor               *self);
//TODO  boolean                  clutter_actor_get_paint_visibility              (ClutterActor                self);
//TODO  void                     clutter_actor_set_offscreen_redirect            (ClutterActor               *self,
//                                                                                ClutterOffscreenRedirect    redirect);
//TODO  ClutterOffscreenRedirect clutter_actor_get_offscreen_redirect            (ClutterActor               *self);
// boolean                       clutter_actor_should_pick_paint                 (ClutterActor                self);
//TODO boolean                         clutter_actor_is_in_clone_paint                 (ClutterActor                self);
//TODO  gboolean                 clutter_actor_get_paint_box                     (ClutterActor               *self,
//                                                                                ClutterActorBox            *box);
//TODO boolean                         clutter_actor_has_overlaps                      (ClutterActor                self);

 /* Content */
// CLUTTER_AVAILABLE_IN_1_10
//TODO  void                     clutter_actor_set_content                       (ClutterActor               *self,
//                                                                                ClutterContent             *content);
// CLUTTER_AVAILABLE_IN_1_10
//TODO  ClutterContent *         clutter_actor_get_content                       (ClutterActor               *self);
// CLUTTER_AVAILABLE_IN_1_10
//TODO  void                     clutter_actor_set_content_gravity               (ClutterActor               *self,
//                                                                                ClutterContentGravity       gravity);
// CLUTTER_AVAILABLE_IN_1_10
//TODO  ClutterContentGravity    clutter_actor_get_content_gravity               (ClutterActor               *self);
// CLUTTER_AVAILABLE_IN_1_10
//TODO  void                     clutter_actor_set_content_scaling_filters       (ClutterActor               *self,
//                                                                                ClutterScalingFilter        min_filter,
//                                                                                ClutterScalingFilter        mag_filter);
// CLUTTER_AVAILABLE_IN_1_10
//TODO  void                     clutter_actor_get_content_scaling_filters       (ClutterActor               *self,
//                                                                                ClutterScalingFilter       *min_filter,
//                                                                                ClutterScalingFilter       *mag_filter);
// CLUTTER_AVAILABLE_IN_1_12
//TODO  void                     clutter_actor_set_content_repeat                (ClutterActor               *self,
//                                                                                ClutterContentRepeat        repeat);
// CLUTTER_AVAILABLE_IN_1_12
//TODO  ClutterContentRepeat     clutter_actor_get_content_repeat                (ClutterActor               *self);
// CLUTTER_AVAILABLE_IN_1_10
//TODO  void                     clutter_actor_get_content_box                   (ClutterActor               *self,
//                                                                                ClutterActorBox            *box);
// CLUTTER_AVAILABLE_IN_1_10
 void                            clutter_actor_set_background_color              (ClutterActor               self,
                                                                                  ClutterColor               color);
// CLUTTER_AVAILABLE_IN_1_10
 void                            clutter_actor_get_background_color              (ClutterActor               self,
                                                                                  ClutterColor               color);
//TODO const ClutterPaintVolume *clutter_actor_get_paint_volume                  (ClutterActor               *self);
//TODO const ClutterPaintVolume *clutter_actor_get_transformed_paint_volume      (ClutterActor               *self,
//                                                                                ClutterActor               *relative_to_ancestor);
// CLUTTER_AVAILABLE_IN_1_10
//TODO const ClutterPaintVolume *clutter_actor_get_default_paint_volume          (ClutterActor               *self);

 /* Events */
 void                            clutter_actor_set_reactive                      (ClutterActor                actor,
                                                                                  boolean                     reactive);
 boolean                         clutter_actor_get_reactive                      (ClutterActor                actor);
 boolean                         clutter_actor_has_key_focus                     (ClutterActor                self);
 void                            clutter_actor_grab_key_focus                    (ClutterActor                self);
//TODO  gboolean                 clutter_actor_event                             (ClutterActor               *actor,
//                                                                                const ClutterEvent         *event,
//                                                                                gboolean                    capture);
 boolean                         clutter_actor_has_pointer                       (ClutterActor                self);

 /* Text */
//TODO  PangoContext *           clutter_actor_get_pango_context                 (ClutterActor               *self);
//TODO  PangoContext *           clutter_actor_create_pango_context              (ClutterActor               *self);
//TODO  PangoLayout *            clutter_actor_create_pango_layout               (ClutterActor               *self,
//                                                                                const gchar                *text);
//TODO  void                     clutter_actor_set_text_direction                (ClutterActor               *self,
//                                                                                ClutterTextDirection        text_dir);
//TODO  ClutterTextDirection     clutter_actor_get_text_direction                (ClutterActor               *self);

 /* Actor hierarchy */
// CLUTTER_AVAILABLE_IN_1_10
 void                            clutter_actor_add_child                         (ClutterActor                self,
                                                                                  ClutterActor                child);
// CLUTTER_AVAILABLE_IN_1_10
 void                            clutter_actor_insert_child_at_index             (ClutterActor                self,
                                                                                  ClutterActor                child,
                                                                                  int                         index_);
// CLUTTER_AVAILABLE_IN_1_10
 void                            clutter_actor_insert_child_above                (ClutterActor                self,
                                                                                  ClutterActor                child,
                                                                                  ClutterActor                sibling);
// CLUTTER_AVAILABLE_IN_1_10
 void                            clutter_actor_insert_child_below                (ClutterActor                self,
                                                                                  ClutterActor                child,
                                                                                  ClutterActor                sibling);
// CLUTTER_AVAILABLE_IN_1_10
 void                            clutter_actor_replace_child                     (ClutterActor                self,
                                                                                  ClutterActor                old_child,
                                                                                  ClutterActor                new_child);
// CLUTTER_AVAILABLE_IN_1_10
 void                            clutter_actor_remove_child                      (ClutterActor                self,
                                                                                  ClutterActor                child);
// CLUTTER_AVAILABLE_IN_1_10
 void                            clutter_actor_remove_all_children               (ClutterActor                self);
// CLUTTER_AVAILABLE_IN_1_10
 void                            clutter_actor_destroy_all_children              (ClutterActor                self);
// CLUTTER_AVAILABLE_IN_1_10
//TODO  GList *                  clutter_actor_get_children                      (ClutterActor               *self);
// CLUTTER_AVAILABLE_IN_1_10
 int                             clutter_actor_get_n_children                    (ClutterActor                self);
// CLUTTER_AVAILABLE_IN_1_10
 ClutterActor                    clutter_actor_get_child_at_index                (ClutterActor                self,
                                                                                  int                         index_);
// CLUTTER_AVAILABLE_IN_1_10
 ClutterActor                    clutter_actor_get_previous_sibling              (ClutterActor                self);
// CLUTTER_AVAILABLE_IN_1_10
 ClutterActor                    clutter_actor_get_next_sibling                  (ClutterActor                self);
// CLUTTER_AVAILABLE_IN_1_10
 ClutterActor                    clutter_actor_get_first_child                   (ClutterActor                self);
// CLUTTER_AVAILABLE_IN_1_10
 ClutterActor                    clutter_actor_get_last_child                    (ClutterActor                self);
 ClutterActor                    clutter_actor_get_parent                        (ClutterActor                self);
 boolean                         clutter_actor_contains                          (ClutterActor                self,
                                                                                  ClutterActor                descendant);
 ClutterActor                    clutter_actor_get_stage                         (ClutterActor                actor);
// CLUTTER_AVAILABLE_IN_1_10
 void                            clutter_actor_set_child_below_sibling           (ClutterActor                self,
                                                                                  ClutterActor                child,
                                                                                  ClutterActor                sibling);
// CLUTTER_AVAILABLE_IN_1_10
 void                            clutter_actor_set_child_above_sibling           (ClutterActor                self,
                                                                                  ClutterActor                child,
                                                                                  ClutterActor                sibling);
// CLUTTER_AVAILABLE_IN_1_10
 void                            clutter_actor_set_child_at_index                (ClutterActor                self,
                                                                                  ClutterActor                child,
                                                                                  int                         index_);
// CLUTTER_AVAILABLE_IN_1_10
//TODO  void                     clutter_actor_iter_init                         (ClutterActorIter           *iter,
//                                                                                ClutterActor               *root);
// CLUTTER_AVAILABLE_IN_1_10
//TODO  gboolean                 clutter_actor_iter_next                         (ClutterActorIter           *iter,
//                                                                                ClutterActor              **child);
// CLUTTER_AVAILABLE_IN_1_10
//TODO  gboolean                 clutter_actor_iter_prev                         (ClutterActorIter           *iter,
//                                                                                ClutterActor              **child);
// CLUTTER_AVAILABLE_IN_1_10
//TODO  void                            clutter_actor_iter_remove                       (ClutterActorIter            iter);
// CLUTTER_AVAILABLE_IN_1_10
// TODO void                            clutter_actor_iter_destroy                      (ClutterActorIter            iter);
// CLUTTER_AVAILABLE_IN_1_12
//TODO  gboolean                 clutter_actor_iter_is_valid                     (const ClutterActorIter     *iter);

 /* Transformations */
 boolean                         clutter_actor_is_rotated                        (ClutterActor                self);
 boolean                         clutter_actor_is_scaled                         (ClutterActor                self);
// CLUTTER_AVAILABLE_IN_1_12
 void                            clutter_actor_set_pivot_point                   (ClutterActor                self,
                                                                                  float                       pivot_x,
                                                                                  float                       pivot_y);
// CLUTTER_AVAILABLE_IN_1_12
 void                            clutter_actor_get_pivot_point                   (ClutterActor                self,
                                                                                  float[]                     pivot_x,
                                                                                  float[]                     pivot_y);
// CLUTTER_AVAILABLE_IN_1_12
 void                            clutter_actor_set_pivot_point_z                 (ClutterActor                self,
                                                                                  float                       pivot_z);
// CLUTTER_AVAILABLE_IN_1_12
 float                           clutter_actor_get_pivot_point_z                 (ClutterActor                self);
// CLUTTER_AVAILABLE_IN_1_12
 void                            clutter_actor_set_rotation_angle                (ClutterActor                self,
                                                                                  int                         axis, // ClutterRotateAxis
                                                                                  double                      angle);
// CLUTTER_AVAILABLE_IN_1_12
 double                          clutter_actor_get_rotation_angle                (ClutterActor                self,
                                                                                  int                         axis); // ClutterRotateAxis
 void                            clutter_actor_set_scale                         (ClutterActor                self,
                                                                                  double                      scale_x,
                                                                                  double                      scale_y);
 void                            clutter_actor_get_scale                         (ClutterActor                self,
                                                                                  double                      scale_x,
                                                                                  double                      scale_y);
// CLUTTER_AVAILABLE_IN_1_12
 void                            clutter_actor_set_scale_z                       (ClutterActor                self,
                                                                                  double                      scale_z);
// CLUTTER_AVAILABLE_IN_1_12
 double                          clutter_actor_get_scale_z                       (ClutterActor                self);
// CLUTTER_AVAILABLE_IN_1_12
 void                            clutter_actor_set_translation                   (ClutterActor                self,
                                                                                  float                       translate_x,
                                                                                  float                       translate_y,
                                                                                  float                       translate_z);
// CLUTTER_AVAILABLE_IN_1_12
 void                            clutter_actor_get_translation                   (ClutterActor                self,
                                                                                  float[]                     translate_x,
                                                                                  float[]                     translate_y,
                                                                                  float[]                     translate_z);
// CLUTTER_AVAILABLE_IN_1_12
//TODO  void                     clutter_actor_set_transform                     (ClutterActor               *self,
//                                                                                const ClutterMatrix        *transform);
// CLUTTER_AVAILABLE_IN_1_12
//TODO  void                     clutter_actor_get_transform                     (ClutterActor               *self,
//                                                                                ClutterMatrix              *transform);
// CLUTTER_AVAILABLE_IN_1_12
//TODO  void                     clutter_actor_set_child_transform               (ClutterActor               *self,
//                                                                                const ClutterMatrix        *transform);
// CLUTTER_AVAILABLE_IN_1_12
//TODO  void                     clutter_actor_get_child_transform               (ClutterActor               *self,
//                                                                                ClutterMatrix              *transform);
 void                            clutter_actor_get_transformed_position          (ClutterActor                self,
                                                                                  float[]                     x,
                                                                                  float[]                     y);
 void                            clutter_actor_get_transformed_size              (ClutterActor                self,
                                                                                  float[]                     width,
                                                                                  float[]                     height);
 boolean                         clutter_actor_transform_stage_point             (ClutterActor                self,
                                                                                  float                       x,
                                                                                  float                       y,
                                                                                  float[]                     x_out,
                                                                                  float[]                     y_out);
//TODO  void                     clutter_actor_get_abs_allocation_vertices       (ClutterActor               *self,
//                                                                                ClutterVertex               verts[]);
//TODO  void                     clutter_actor_apply_transform_to_point          (ClutterActor               *self,
//                                                                                const ClutterVertex        *point,
//                                                                                  ClutterVertex              *vertex);
//TODO  void                            clutter_actor_apply_relative_transform_to_point (ClutterActor               *self,
//                                                                                  ClutterActor               *ancestor,
//                                                                                  const ClutterVertex        *point,
//                                                                                  ClutterVertex              *vertex);

 /* Implicit animations */
// CLUTTER_AVAILABLE_IN_1_10
 void                            clutter_actor_save_easing_state                 (ClutterActor                self);
// CLUTTER_AVAILABLE_IN_1_10
 void                            clutter_actor_restore_easing_state              (ClutterActor                self);
// CLUTTER_AVAILABLE_IN_1_10
 void                            clutter_actor_set_easing_mode                   (ClutterActor                self,
                                                                                  int                         mode); //ClutterAnimationMode 
// CLUTTER_AVAILABLE_IN_1_10
 int                             clutter_actor_get_easing_mode                   (ClutterActor                self); //ClutterAnimationMode 
// CLUTTER_AVAILABLE_IN_1_10
 void                            clutter_actor_set_easing_duration               (ClutterActor                self,
                                                                                  int                         msecs);
// CLUTTER_AVAILABLE_IN_1_10
 int                             clutter_actor_get_easing_duration               (ClutterActor                self);
// CLUTTER_AVAILABLE_IN_1_10
 void                            clutter_actor_set_easing_delay                  (ClutterActor                self,
                                                                                  int                         msecs);
// CLUTTER_AVAILABLE_IN_1_10
 int                             clutter_actor_get_easing_delay                  (ClutterActor                self);
// CLUTTER_AVAILABLE_IN_1_10
//TODO  ClutterTransition *      clutter_actor_get_transition                    (ClutterActor               *self,
//                                                                                const char                 *name);
// CLUTTER_AVAILABLE_IN_1_10
//TODO  void                     clutter_actor_add_transition                    (ClutterActor               *self,
//                                                                                const char                 *name,
//                                                                                ClutterTransition          *transition);
// CLUTTER_AVAILABLE_IN_1_10
 void                            clutter_actor_remove_transition                 (ClutterActor                self,
                                                                                  String                      name);
// CLUTTER_AVAILABLE_IN_1_10
 void                            clutter_actor_remove_all_transitions            (ClutterActor                self);

 
//@formatter:on

}
