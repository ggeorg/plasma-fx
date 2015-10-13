package plasma.fx.scene;

import plasma.jna.clutter.ClutterLibrary;

import com.sun.jna.Pointer;

public class ClutterStage extends ClutterActor {

  public ClutterStage() {
    this(ClutterLibrary.INSTANCE.clutter_stage_new());
  }

  protected ClutterStage(Pointer ptr) {
    super(ptr);
  }

  public void setTitle(String title) {
    ClutterLibrary.INSTANCE.clutter_stage_set_title(this, title);
  }

  public String getTitle() {
    return ClutterLibrary.INSTANCE.clutter_stage_get_title(this);
  }

  public void setResizable(boolean resizable) {
    ClutterLibrary.INSTANCE.clutter_stage_set_user_resizable(this, resizable);
  }

  public boolean isResizable() {
    return ClutterLibrary.INSTANCE.clutter_stage_get_user_resizable(this);
  }

}
