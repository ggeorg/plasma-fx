package plasma.fx.scene;

import plasma.jna.clutter.ClutterLibrary;

public class ClutterScrollActor extends ClutterActor {

  public ClutterScrollActor() {
    super(ClutterLibrary.INSTANCE.clutter_scroll_actor_new());
  }

  public void setScrollMode(ClutterScrollMode mode) {
    ClutterLibrary.INSTANCE.clutter_scroll_actor_set_scroll_mode(this, mode.getMode());
  }

  public ClutterScrollMode getScrollMode() {
    return ClutterScrollMode.valueOf(ClutterLibrary.INSTANCE.clutter_scroll_actor_get_scroll_mode(this));
  }
}
