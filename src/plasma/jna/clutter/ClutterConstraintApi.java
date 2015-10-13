package plasma.jna.clutter;

import plasma.fx.scene.ClutterActor;
import plasma.fx.scene.ClutterConstraint;

public interface ClutterConstraintApi {

//@formatter:off
  
void               clutter_actor_add_constraint            (ClutterActor       self,
                                                            ClutterConstraint  constraint);
void               clutter_actor_add_constraint_with_name  (ClutterActor       self,
                                                            String             name,
                                                            ClutterConstraint  constraint);
void               clutter_actor_remove_constraint         (ClutterActor       self,
                                                            ClutterConstraint  constraint);
void               clutter_actor_remove_constraint_by_name (ClutterActor       self,
                                                            String             name);
//GList *            clutter_actor_get_constraints           (ClutterActor      *self);
ClutterConstraint  clutter_actor_get_constraint            (ClutterActor       self,
                                                            String name);
void               clutter_actor_clear_constraints         (ClutterActor       self);

boolean            clutter_actor_has_constraints           (ClutterActor       self);

//@formatter:off

}
