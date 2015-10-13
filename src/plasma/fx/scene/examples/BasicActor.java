package plasma.fx.scene.examples;

import plasma.fx.scene.ClutterActor;
import plasma.fx.scene.ClutterAlignAxis;
import plasma.fx.scene.ClutterAlignConstraint;
import plasma.fx.scene.ClutterColor;
import plasma.fx.scene.ClutterRotateAxis;
import plasma.fx.scene.ClutterStage;
import plasma.fx.scene.ClutterActor.ButtonPressEventHandler;
import plasma.fx.scene.ClutterActor.EnterEventHandler;
import plasma.fx.scene.ClutterActor.LeaveEventHandler;
import plasma.fx.scene.ClutterActor.QuitSignalHandler;
import plasma.fx.scene.animation.ClutterAnimationMode;
import plasma.fx.scene.layout.ClutterBoxLayout;
import plasma.jna.clutter.ClutterLibrary;
import plasma.jna.gobject.SignalConnection;

import com.sun.jna.Pointer;

public class BasicActor {

  public static void main(String[] args) {
    ClutterLibrary.INSTANCE.clutter_init(0, Pointer.NULL);

    ClutterStage stage = new ClutterStage();
    stage.connect(new QuitSignalHandler());
    stage.setTitle("Three Flowers in a Vase");
    stage.setResizable(true);
    stage.show();

    ClutterActor vase = new ClutterActor();
    vase.setName("vase");
    vase.setLayoutManager(new ClutterBoxLayout());
    // vase.setSize(200, 200);
    vase.addConstraint(new ClutterAlignConstraint(stage, ClutterAlignAxis.CLUTTER_ALIGN_BOTH, 0.5F));
    vase.setBackgroundColor(ClutterColor.CYAN);
    stage.addChild(vase);

    ClutterActor flower0 = new ClutterActor();
    flower0.setName("flower.0");
    flower0.setSize(128, 128);
    flower0.setMarginLeft(12);
    flower0.setBackgroundColor(ClutterColor.RED);
    flower0.setReactive(true);
    flower0.connect(new ButtonPressEventHandler() {
      @Override
      protected boolean onSignal(ClutterActor actor) {
        return animateColor(actor);
      }
    });
    vase.addChild(flower0);

    ClutterActor flower1 = new ClutterActor();
    flower1.setName("flower.1");
    flower1.setSize(128, 128);
    flower1.setMarginTop(12);
    flower1.setMarginLeft(6);
    flower1.setMarginRight(6);
    flower1.setMarginBottom(12);
    flower1.setBackgroundColor(ClutterColor.YELLOW);
    flower1.setReactive(true);
    flower1.connect(new EnterEventHandler() {
      @Override
      protected boolean onSignal(ClutterActor actor) {
        onCrossing(actor, true);
        return false;
      }
    });
    flower1.connect(new LeaveEventHandler() {
      @Override
      protected boolean onSignal(ClutterActor actor) {
        onCrossing(actor, false);
        return false;
      }
    });
    vase.addChild(flower1);

    ClutterActor flower2 = new ClutterActor();
    flower2.setName("flower.2");
    flower2.setSize(128, 128);
    flower2.setMarginRight(12);
    flower2.setBackgroundColor(ClutterColor.GREEN);
    flower2.setPivotPoint(0.5F, 0F);
    flower2.setReactive(true);
    flower2.connect(new ButtonPressEventHandler() {
      @Override
      protected boolean onSignal(ClutterActor actor) {
        return animateRotation(actor);
      }
    });
    vase.addChild(flower2);

    ClutterLibrary.INSTANCE.clutter_main();
  }

  public static boolean toggled = true;

  protected static boolean animateColor(ClutterActor actor) {
    ClutterColor endColor;

    if (toggled)
      endColor = ClutterColor.BLUE;
    else
      endColor = ClutterColor.RED;

    actor.saveEastingState();
    actor.setEasingDuration(1000);
    actor.setEasingMode(ClutterAnimationMode.CLUTTER_LINEAR);
    actor.setBackgroundColor(endColor);
    actor.restoreEasingState();

    toggled = !toggled;

    return true;
  }

  protected static boolean onCrossing(ClutterActor actor, boolean is_enter) {
    float zpos = is_enter ? -250.0F : 0.0F;

    actor.saveEastingState();
    actor.setEasingDuration(1000);
    actor.setEasingMode(ClutterAnimationMode.CLUTTER_EASE_OUT_BOUNCE);
    actor.setZ(zpos);
    actor.restoreEasingState();

    return true;
  }

  private static SignalConnection sh = null;
  private static boolean positive = true;

  protected static boolean animateRotation(ClutterActor actor) {
    actor.saveEastingState();
    actor.setEasingDuration(1000);
    actor.setEasingMode(ClutterAnimationMode.CLUTTER_LINEAR);
    actor.setRotationAngle(ClutterRotateAxis.CLUTTER_Y_AXIS, positive ? 360D : 0D);
    actor.restoreEasingState();
    
    positive = !positive;

//    sh = actor.connect(new TransitionStoppedEventHandler() {
//      @Override
//      protected boolean onSignal(ClutterActor actor) {
//        return onTransitionStopped(actor);
//      }
//    });

    return true;
  }

  protected static boolean onTransitionStopped(ClutterActor actor) {
    actor.saveEastingState();
    actor.setRotationAngle(ClutterRotateAxis.CLUTTER_Y_AXIS, 0D);
    actor.restoreEasingState();

    if (null != sh) {
      sh.disconnect();
      sh = null;
    }

    return false;
  }
  
}
