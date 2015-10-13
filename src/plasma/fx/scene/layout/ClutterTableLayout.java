package plasma.fx.scene.layout;

import plasma.jna.clutter.ClutterLibrary;

public class ClutterTableLayout extends ClutterLayoutManager {

  public ClutterTableLayout() {
    super(ClutterLibrary.INSTANCE.clutter_table_layout_new());
  }

}
