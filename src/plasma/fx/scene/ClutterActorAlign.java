package plasma.fx.scene;

/**
 * Controls how a {@link ClutterActor} should align itself inside the extra
 * space assigned to it during the allocation.
 * <p>
 * Alignment only matters if the allocated space given to an actor is bigger
 * than its natural size; for example, when the #ClutterActor:x-expand or the
 * #ClutterActor:y-expand properties of #ClutterActor are set to %TRUE.
 * 
 * Since: 1.10
 */
public enum ClutterActorAlign {
  /**
   * Stretch to cover the whole allocated space.
   */
  CLUTTER_ACTOR_ALIGN_FILL,
  /**
   * Snap to left or top side, leaving space to the right or bottom. For
   * horizontal layouts, in right-to-left locales this should be reversed.
   */
  CLUTTER_ACTOR_ALIGN_START,
  /**
   * Center the actor inside the allocation.
   */
  CLUTTER_ACTOR_ALIGN_CENTER,
  /**
   * Snap to right or bottom side, leaving space to the left or top. For
   * horizontal layouts, in right-to-left locales this should be reversed.
   */
  CLUTTER_ACTOR_ALIGN_END;
  
  public static ClutterActorAlign valueOf(int ordinal) {
    switch (ordinal) {
    case 0:
      return ClutterActorAlign.CLUTTER_ACTOR_ALIGN_FILL;
    case 1:
      return ClutterActorAlign.CLUTTER_ACTOR_ALIGN_START;
    case 2:
      return ClutterActorAlign.CLUTTER_ACTOR_ALIGN_CENTER;
    case 3:
      return ClutterActorAlign.CLUTTER_ACTOR_ALIGN_END;
    default:
      return ClutterActorAlign.CLUTTER_ACTOR_ALIGN_START;
    }
  }
}
