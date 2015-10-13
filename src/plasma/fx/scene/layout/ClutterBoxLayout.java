package plasma.fx.scene.layout;

import plasma.fx.scene.ClutterOrientation;
import plasma.jna.clutter.ClutterLibrary;

public class ClutterBoxLayout extends ClutterLayoutManager {

  public ClutterBoxLayout() {
    super(ClutterLibrary.INSTANCE.clutter_box_layout_new());
  }

  public void setOrientation(ClutterOrientation orientation) {
    ClutterLibrary.INSTANCE.clutter_box_layout_set_orientation(this, orientation.ordinal());
  }

  public ClutterOrientation getOrientation() {
    int orientation = ClutterLibrary.INSTANCE.clutter_box_layout_get_orientation(this);
    switch (orientation) {
    case 0:
      return ClutterOrientation.CLUTTER_ORIENTATION_HORIZONTAL;
    case 1:
      return ClutterOrientation.CLUTTER_ORIENTATION_VERTICAL;
    default:
      return ClutterOrientation.CLUTTER_ORIENTATION_HORIZONTAL;
    }
  }

  /**
   * Sets the spacing between children of layout.
   * 
   * @param spacing
   *          the spacing between children of the layout, in pixels
   */
  public void setSpacing(int spacing) {
    ClutterLibrary.INSTANCE.clutter_box_layout_set_spacing(this, spacing);
  }

  public int getSpacing() {
    return ClutterLibrary.INSTANCE.clutter_box_layout_get_spacing(this);
  }

  /**
   * Sets whether the size of layout children should be homogeneous.
   * 
   * @param homogeneous
   *          {@code true} if the layout should be homogeneous
   */
  public void setHomogeneous(boolean homogeneous) {
    ClutterLibrary.INSTANCE.clutter_box_layout_set_homogeneous(this, homogeneous);
  }

  public boolean getHomogeneous() {
    return ClutterLibrary.INSTANCE.clutter_box_layout_get_homogeneous(this);
  }

  /**
   * Sets whether children of layout should be layed out by appending them or by
   * prepending them.
   * 
   * @param pack_start
   *          {@code true} if the layout should pack children at the beginning
   *          of the layout
   */
  public void setPackStart(boolean pack_start) {
    ClutterLibrary.INSTANCE.clutter_box_layout_set_pack_start(this, pack_start);
  }
  
  public boolean getPackStart() {
    return ClutterLibrary.INSTANCE.clutter_box_layout_get_pack_start(this);
  }
  
  
}
