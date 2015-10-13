package plasma.fx.scene.layout;

import plasma.jna.clutter.ClutterLibrary;

public class ClutterGridLayout extends ClutterLayoutManager {

  public ClutterGridLayout() {
    super(ClutterLibrary.INSTANCE.clutter_grid_layout_new());
  }

}
