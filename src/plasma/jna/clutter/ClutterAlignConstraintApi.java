package plasma.jna.clutter;

import plasma.fx.scene.ClutterActor;
import plasma.fx.scene.ClutterAlignConstraint;

import com.sun.jna.Pointer;

public interface ClutterAlignConstraintApi extends ClutterConstraintApi {

//@formatter:off
  
Pointer            clutter_align_constraint_new            (ClutterActor            source,
                                                            int                     axis, //ClutterAlignAxis
                                                            float                   factor);

void               clutter_align_constraint_set_source     (ClutterAlignConstraint  align,
                                                            ClutterActor            source);
ClutterActor       clutter_align_constraint_get_source     (ClutterAlignConstraint  align);
void               clutter_align_constraint_set_align_axis (ClutterAlignConstraint  align,
                                                            int                     axis);  //ClutterAlignAxis
int                clutter_align_constraint_get_align_axis (ClutterAlignConstraint  align); //ClutterAlignAxis
void               clutter_align_constraint_set_factor     (ClutterAlignConstraint  align,
                                                            float                   factor);
float              clutter_align_constraint_get_factor     (ClutterAlignConstraint  align);
  
//@formatter:on
  
}
