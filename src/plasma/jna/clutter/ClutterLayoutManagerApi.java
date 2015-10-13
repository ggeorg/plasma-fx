package plasma.jna.clutter;

import plasma.fx.scene.ClutterContainer;
import plasma.fx.scene.layout.ClutterLayoutManager;

public interface ClutterLayoutManagerApi {

//@formatter:off
  
void               clutter_layout_manager_get_preferred_width   (ClutterLayoutManager    manager,
                                                                 ClutterContainer        container,
                                                                 float                   for_height,
                                                                 float[]                 min_width_p,
                                                                 float[]                 nat_width_p);
void               clutter_layout_manager_get_preferred_height  (ClutterLayoutManager    manager,
                                                                 ClutterContainer        container,
                                                                 float                   for_width,
                                                                 float[]                 min_height_p,
                                                                 float[]                 nat_height_p);
// TODO void               clutter_layout_manager_allocate              (ClutterLayoutManager   *manager,
//      ClutterContainer       *container,
//      const ClutterActorBox  *allocation,
//      ClutterAllocationFlags  flags);

void               clutter_layout_manager_set_container         (ClutterLayoutManager    manager,
                                                                 ClutterContainer        container);
void               clutter_layout_manager_layout_changed        (ClutterLayoutManager    manager);

// TODO GParamSpec *       clutter_layout_manager_find_child_property   (ClutterLayoutManager   *manager,
//      const gchar            *name);
// TODO GParamSpec **      clutter_layout_manager_list_child_properties (ClutterLayoutManager   *manager,
//      guint                  *n_pspecs);

// TODO ClutterLayoutMeta *clutter_layout_manager_get_child_meta        (ClutterLayoutManager   *manager,
//      ClutterContainer       *container,
//      ClutterActor           *actor);

// TODO void               clutter_layout_manager_child_set             (ClutterLayoutManager   *manager,
//      ClutterContainer       *container,
//      ClutterActor           *actor,
//      const gchar            *first_property,
//      ...) G_GNUC_NULL_TERMINATED;
// TODO void               clutter_layout_manager_child_get             (ClutterLayoutManager   *manager,
//      ClutterContainer       *container,
//      ClutterActor           *actor,
//      const gchar            *first_property,
//      ...) G_GNUC_NULL_TERMINATED;
// TODO void               clutter_layout_manager_child_set_property    (ClutterLayoutManager   *manager,
//      ClutterContainer       *container,
//      ClutterActor           *actor,
//      const gchar            *property_name,
//      const GValue           *value);
// TODO void               clutter_layout_manager_child_get_property    (ClutterLayoutManager   *manager,
//      ClutterContainer       *container,
//      ClutterActor           *actor,
//      const gchar            *property_name,
//      GValue                 *value);

// CLUTTER_DEPRECATED_IN_1_12
// ClutterAlpha *     clutter_layout_manager_begin_animation       (ClutterLayoutManager   *manager,
//      guint                   duration,
//      gulong                  mode);
// CLUTTER_DEPRECATED_IN_1_12
// void               clutter_layout_manager_end_animation         (ClutterLayoutManager   *manager);
// CLUTTER_DEPRECATED_IN_1_12
// gdouble            clutter_layout_manager_get_animation_progress (ClutterLayoutManager   *manager);
  
//@formatter:on
  
}
