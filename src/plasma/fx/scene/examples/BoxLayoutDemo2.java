package plasma.fx.scene.examples;

import plasma.fx.scene.ClutterActor;
import plasma.fx.scene.ClutterActorAlign;
import plasma.fx.scene.ClutterColor;
import plasma.fx.scene.ClutterOrientation;
import plasma.fx.scene.ClutterStage;
import plasma.fx.scene.PangoAlignment;
import plasma.fx.scene.ClutterActor.QuitSignalHandler;
import plasma.fx.scene.ClutterText;
import plasma.fx.scene.layout.ClutterBinLayout;
import plasma.fx.scene.layout.ClutterBoxLayout;
import plasma.fx.scene.layout.ClutterLayoutManager;
import plasma.jna.clutter.ClutterLibrary;

import com.sun.jna.Pointer;

public class BoxLayoutDemo2 {
  public static String INSTRUCTIONS = "Hello, World!";

  public static void main(String[] args) {
    ClutterLibrary.INSTANCE.clutter_init(0, Pointer.NULL);

    ClutterStage stage = new ClutterStage();
    stage.connect(new QuitSignalHandler());
    stage.setTitle("BoxLayout Demo");
    stage.setResizable(true);
    stage.show();
    
    /* make the stage a vbox */
    ClutterBoxLayout layout = new ClutterBoxLayout();
    layout.setOrientation(ClutterOrientation.CLUTTER_ORIENTATION_VERTICAL);
    stage.setLayoutManager(layout);
    
    ClutterActor box = new ClutterActor();
    box.setBackgroundColor(ClutterColor.CYAN);
    box.setExpandX(true);
    box.setExpandY(true);
    layout = new ClutterBoxLayout();
    box.setLayoutManager(layout);
    stage.addChild(box);
    
    ClutterText instructions = new ClutterText("Sans 12px", INSTRUCTIONS);
    instructions.setExpandX(true);
    instructions.setExpandY(false);
    //instructions.setAlignX(ClutterActorAlign.CLUTTER_ACTOR_ALIGN_END);
    instructions.setMarginTop(4);
    instructions.setMarginLeft(4);
    instructions.setMarginBottom(4);
    stage.addChild(instructions);
    
    for(int i = 0; i < 5; i++) {
      addActor(box, i);
    }
    
    ClutterLibrary.INSTANCE.clutter_main();
  }
  
  private static void addActor(ClutterActor box, int position) {
    ClutterColor color = ClutterColor.BLUE;
    
    ClutterLayoutManager layout = new ClutterBinLayout();
    
    ClutterActor rect = new ClutterActor();
    rect.setLayoutManager(layout);
    rect.setBackgroundColor(color);
    rect.setReactive(true);
    rect.setSize(32, 64);
    rect.setExpandX(true);
    rect.setExpandY(true);
    rect.setAlignX(ClutterActorAlign.CLUTTER_ACTOR_ALIGN_START);
    rect.setAlignY(ClutterActorAlign.CLUTTER_ACTOR_ALIGN_START);
    
    ClutterText text = new ClutterText("Sans 8px", null);
    text.setLineAlignment(PangoAlignment.PANGO_ALIGN_CENTER);
    rect.addChild(text);
    
    box.insertChild(rect, position);
  }
}
