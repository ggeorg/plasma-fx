package plasma.fx.scene.examples;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;

import plasma.fx.scene.ClutterActorAlign;
import plasma.fx.scene.ClutterColor;
import plasma.fx.scene.ClutterMargin;
import plasma.fx.scene.ClutterOrientation;
import plasma.fx.scene.ClutterStage;
import plasma.fx.scene.ClutterActor.QuitSignalHandler;
import plasma.fx.scene.ClutterText;
import plasma.fx.scene.layout.ClutterBinLayout;
import plasma.fx.scene.layout.ClutterBoxLayout;
import plasma.fx.scene.layout.ClutterFlowLayout;
import plasma.fx.scene.layout.ClutterLayoutManager;
import plasma.jna.clutter.ClutterLibrary;

import com.sun.jna.Pointer;

public class TextLayout {

  public static void main(String[] args) throws IOException {
    if (args.length == 0) {
      System.err.println("wrong usage");
      System.exit(1);
    }
    
    String markup = readFile(args[0], Charset.defaultCharset());
    System.out.println(markup);
    
    ClutterLibrary.INSTANCE.clutter_init(0, Pointer.NULL);

    ClutterStage stage = new ClutterStage();
    stage.connect(new QuitSignalHandler());
    stage.setTitle("Text Layout");
    stage.setResizable(true);
    
    stage.setAlignX(ClutterActorAlign.CLUTTER_ACTOR_ALIGN_END);
    stage.setAlignY(ClutterActorAlign.CLUTTER_ACTOR_ALIGN_END);
    
    ClutterBoxLayout lm = new ClutterBoxLayout();
    lm.setOrientation(ClutterOrientation.CLUTTER_ORIENTATION_VERTICAL);
    //lm.setPackStart(false);
    stage.setLayoutManager(lm);

    stage.show();

    ClutterText text = new ClutterText();
    text.setMargin(new ClutterMargin(15, 5));
    //text.setWidth(256);
    text.setBackgroundColor(ClutterColor.GREEN);
    text.setMarkup(markup);
    stage.addChild(text);
    
    ClutterText text2 = new ClutterText();
    //text2.setWidth(256);
    text2.setBackgroundColor(ClutterColor.CYAN);
    text2.setMargin(new ClutterMargin(15, 5));
    text2.setMarkup(markup);
    stage.addChild(text2);
    
    ClutterText text3 = new ClutterText();
    //text3.setMargin(new ClutterMargin(15, 5));
    text3.setBackgroundColor(ClutterColor.GREEN);
    text3.setText("Hello George...");
    stage.addChild(text3);
    
    ClutterText text4 = new ClutterText();
    //text4.setMargin(new ClutterMargin(15, 5));
    text4.setBackgroundColor(ClutterColor.CYAN);
    text4.setText("Hi!!!");
    stage.addChild(text4);
    

    ClutterLibrary.INSTANCE.clutter_main();
  }

  static String readFile(String path, Charset encoding) throws IOException {
    byte[] encoded = Files.readAllBytes(Paths.get(path));
    return new String(encoded, encoding);
  }
}
