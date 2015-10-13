package plasma.fx.scene;

import plasma.jna.clutter.ClutterLibrary;

public final class ClutterAlignConstraint extends ClutterConstraint {

  public ClutterAlignConstraint(ClutterActor source, ClutterAlignAxis axis, float factor) {
    super(ClutterLibrary.INSTANCE.clutter_align_constraint_new(source, axis.ordinal(), factor));
  }
  
  public int getAlignAxis() {
    return ClutterLibrary.INSTANCE.clutter_align_constraint_get_align_axis(this);
  }
  
}
