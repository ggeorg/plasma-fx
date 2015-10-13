package plasma.jna.clutter;

import com.sun.jna.Pointer;

import plasma.fx.scene.ClutterActor;
import plasma.fx.scene.ClutterStage;

public interface ClutterStageApi {

//@formatter:off
  
  Pointer         clutter_stage_new                               ();

//  void            clutter_stage_set_perspective                   (ClutterStage          *stage,
//                                                 ClutterPerspective    *perspective);
//  void            clutter_stage_get_perspective                   (ClutterStage          *stage,
//                                                 ClutterPerspective    *perspective);
  void            clutter_stage_set_fullscreen                    (ClutterStage          stage,
                                                                   boolean               fullscreen);
  boolean         clutter_stage_get_fullscreen                    (ClutterStage          stage);
  void            clutter_stage_show_cursor                       (ClutterStage          stage);
  void            clutter_stage_hide_cursor                       (ClutterStage          stage);
  void            clutter_stage_set_title                         (ClutterStage          stage,
                                                                   String                title);
  String          clutter_stage_get_title                         (ClutterStage          stage);
  void            clutter_stage_set_user_resizable                (ClutterStage          stage,
                                                                   boolean               resizable);
  boolean         clutter_stage_get_user_resizable                (ClutterStage          stage);

  void            clutter_stage_set_minimum_size                  (ClutterStage          stage,
                                                                   int                   width,
                                                                   int                   height);
  void            clutter_stage_get_minimum_size                  (ClutterStage          stage,
                                                                   int[]                 width,
                                                                   int[]                 height);
  void            clutter_stage_set_no_clear_hint                 (ClutterStage          stage,
                                                                   boolean               no_clear);
  boolean         clutter_stage_get_no_clear_hint                 (ClutterStage          stage);
  void            clutter_stage_set_use_alpha                     (ClutterStage          stage,
                                                                   boolean               use_alpha);
  boolean         clutter_stage_get_use_alpha                     (ClutterStage          stage);

  void            clutter_stage_set_key_focus                     (ClutterStage          stage,
                                                                   ClutterActor          actor);
  ClutterActor    clutter_stage_get_key_focus                     (ClutterStage          stage);
  void            clutter_stage_set_throttle_motion_events        (ClutterStage          stage,
                                                                   boolean               throttle);
  boolean         clutter_stage_get_throttle_motion_events        (ClutterStage          stage);
  void            clutter_stage_set_motion_events_enabled         (ClutterStage          stage,
                                                                   boolean               enabled);
  boolean         clutter_stage_get_motion_events_enabled         (ClutterStage          stage);
  void            clutter_stage_set_accept_focus                  (ClutterStage          stage,
                                                                   boolean               accept_focus);
  boolean         clutter_stage_get_accept_focus                  (ClutterStage          stage);
//  gboolean        clutter_stage_event                             (ClutterStage          *stage,
//                                                                   ClutterEvent          *event);

//  ClutterActor *  clutter_stage_get_actor_at_pos                  (ClutterStage          *stage,
//                                                                   ClutterPickMode        pick_mode,
//                                                                   gint                   x,
//                                                                   gint                   y);
//  guchar *        clutter_stage_read_pixels                       (ClutterStage          *stage,
//                                                                   gint                   x,
//                                                                   gint                   y,
//                                                                   gint                   width,
//                                                                   gint                   height);

//  void            clutter_stage_get_redraw_clip_bounds            (ClutterStage          *stage,
//                                                                   cairo_rectangle_int_t *clip);

  void            clutter_stage_ensure_current                    (ClutterStage          stage);
  void            clutter_stage_ensure_viewport                   (ClutterStage          stage);
  void            clutter_stage_ensure_redraw                     (ClutterStage          stage);

/*
  #ifdef CLUTTER_ENABLE_EXPERIMENTAL_API
  CLUTTER_AVAILABLE_IN_1_14
  void            clutter_stage_set_sync_delay                    (ClutterStage          *stage,
                                                                   gint                   sync_delay);
  CLUTTER_AVAILABLE_IN_1_14
  void            clutter_stage_skip_sync_delay                   (ClutterStage          *stage);

  typedef void (* ClutterStagePaintFunc) (ClutterStage *stage,
                                          gpointer      data);

  CLUTTER_AVAILABLE_IN_1_14
  void            clutter_stage_set_paint_callback                (ClutterStage          *stage,
                                                                   ClutterStagePaintFunc  callback,
                                                                   gpointer               data,
                                                                   GDestroyNotify         notify);
  #endif
*/
  
//@formatter:on
  
}
