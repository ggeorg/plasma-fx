package plasma.fx.scene.layout;

import plasma.jna.clutter.ClutterLibrary;

public class ClutterFixedLayout extends ClutterLayoutManager {

  public ClutterFixedLayout() {
    super(ClutterLibrary.INSTANCE.clutter_fixed_layout_new());
  }

}
