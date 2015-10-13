package plasma.fx.scene.layout;

import plasma.jna.clutter.ClutterLibrary;

public class ClutterBinLayout extends ClutterLayoutManager {
  /* ClutterBinAlignment is deprecated since 1.2 */
  private static final int CLUTTER_BIN_ALIGNMENT_FIXED = 0;
  @SuppressWarnings("unused")
  private static final int CLUTTER_BIN_ALIGNMENT_FILL = 1;
  @SuppressWarnings("unused")
  private static final int CLUTTER_BIN_ALIGNMENT_START = 2;
  @SuppressWarnings("unused")
  private static final int CLUTTER_BIN_ALIGNMENT_END = 3;
  @SuppressWarnings("unused")
  private static final int CLUTTER_BIN_ALIGNMENT_CENTER = 4;

  public ClutterBinLayout() {
    super(ClutterLibrary.INSTANCE.clutter_bin_layout_new(CLUTTER_BIN_ALIGNMENT_FIXED, CLUTTER_BIN_ALIGNMENT_FIXED));
  }
  
  public static ClutterBinLayout valueOf(int ordinal)

}
