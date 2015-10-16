package plasma.jna.clutter;

import plasma.fx.scene.ClutterScrollActor;

import com.sun.jna.Pointer;

public interface ClutterScrollActorApi {
  
//@formatter:off
  
//  CLUTTER_AVAILABLE_IN_1_12
  Pointer                 clutter_scroll_actor_new                ();

//  CLUTTER_AVAILABLE_IN_1_12
  void                    clutter_scroll_actor_set_scroll_mode    (ClutterScrollActor  actor,
                                                                   int                 mode); // ClutterScrollMode
//  CLUTTER_AVAILABLE_IN_1_12
  int                     clutter_scroll_actor_get_scroll_mode    (ClutterScrollActor  actor); // ClutterScrollMode

//  CLUTTER_AVAILABLE_IN_1_12
//  void                    clutter_scroll_actor_scroll_to_point    (ClutterScrollActor  actor,
//                                                                   const ClutterPoint *point);
//  CLUTTER_AVAILABLE_IN_1_12
//  void                    clutter_scroll_actor_scroll_to_rect     (ClutterScrollActor  actor,
//                                                                   const ClutterRect  *rect);

  
//@formatter:on

}
