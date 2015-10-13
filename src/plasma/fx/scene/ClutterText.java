package plasma.fx.scene;

import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;

import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;

import plasma.jna.clutter.ClutterLibrary;
import plasma.jna.clutter.ClutterTextBuffer;

import com.sun.jna.Pointer;

public class ClutterText extends ClutterActor {

  public ClutterText() {
    this(ClutterLibrary.INSTANCE.clutter_text_new());
  }

  public ClutterText(String fontName, String text, ClutterColor color) {
    this(ClutterLibrary.INSTANCE.clutter_text_new_full(fontName, text, color));
  }

  public ClutterText(String fontName, String text) {
    this(ClutterLibrary.INSTANCE.clutter_text_new_with_text(fontName, text));
  }

  public ClutterText(String text) {
    this(ClutterLibrary.INSTANCE.clutter_text_new());
    setText(text);
  }

  public ClutterText(ClutterTextBuffer buffer) {
    this(ClutterLibrary.INSTANCE.clutter_text_new_with_buffer(buffer));
  }

  protected ClutterText(Pointer ptr) {
    super(ptr);
    setLineWrap(true);
    setLineWrapMode(PangoWrapMode.PANGO_WRAP_WORD);
    setLineAlignment(PangoAlignment.PANGO_ALIGN_LEFT);
  }

  public ClutterTextBuffer getBuffer() {
    return ClutterLibrary.INSTANCE.clutter_text_get_buffer(this);
  }

  public void setText(String text) {
    ClutterLibrary.INSTANCE.clutter_text_set_text(this, text);
  }
  
  static String readFile(String path, Charset encoding) throws IOException {
    byte[] encoded = Files.readAllBytes(Paths.get(path));
    return new String(encoded, encoding);
  }

  public void setMarkup(String markup) {
    // perform XSLT...
    TransformerFactory factory = TransformerFactory.newInstance();
    Source xslt = new StreamSource(ClutterText.class.getResourceAsStream("/markup.xsl"));
    
    try {
      Transformer transformer = factory.newTransformer(xslt);
      Source text = new StreamSource(new StringReader(markup));
      StringWriter sw = new StringWriter();
      
      transformer.transform(text, new StreamResult(sw));
      
      ClutterLibrary.INSTANCE.clutter_text_set_markup(this, sw.toString());
      
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  public String getText() {
    return ClutterLibrary.INSTANCE.clutter_text_get_text(this);
  }

  public void setColor(ClutterColor color) {
    ClutterLibrary.INSTANCE.clutter_text_set_color(this, color);
  }

  public ClutterColor getColor() {
    final ClutterColor color = new ClutterColor();
    ClutterLibrary.INSTANCE.clutter_text_get_color(this, color);
    return color;
  }

  public void setFontName(String font_name) {
    ClutterLibrary.INSTANCE.clutter_text_set_font_name(this, font_name);
  }

  public String getFontName() {
    return ClutterLibrary.INSTANCE.clutter_text_get_font_name(this);
  }

  public void setLineWrap(boolean lineWrap) {
    ClutterLibrary.INSTANCE.clutter_text_set_line_wrap(this, lineWrap);
  }

  public boolean isLineWrap() {
    return ClutterLibrary.INSTANCE.clutter_text_get_line_wrap(this);
  }

  public void setLineWrapMode(PangoWrapMode wrapMode) {
    ClutterLibrary.INSTANCE.clutter_text_set_line_wrap_mode(this, wrapMode.ordinal());
  }

  public PangoWrapMode getLineWrapMode() {
    return PangoWrapMode.valueOf(ClutterLibrary.INSTANCE.clutter_text_get_line_wrap_mode(this));
  }

  public void setUseMarkup(boolean setting) {
    ClutterLibrary.INSTANCE.clutter_text_set_use_markup(this, setting);
  }

  public boolean isUseMarkup() {
    return ClutterLibrary.INSTANCE.clutter_text_get_use_markup(this);
  }

  public void setLineAlignment(PangoAlignment alignment) {
    ClutterLibrary.INSTANCE.clutter_text_set_line_alignment(this, alignment.ordinal());
  }

  public PangoAlignment getLineAlignment(int alignment) {
    return PangoAlignment.valueOf(ClutterLibrary.INSTANCE.clutter_text_get_line_alignment(this));
  }
  
  public void setEditable(boolean editable) {
    ClutterLibrary.INSTANCE.clutter_text_set_editable(this, editable);
  }
  
  public boolean isEditable() {
    return ClutterLibrary.INSTANCE.clutter_text_get_editable(this);
  }
  
  public void setSelectable(boolean selectable) {
    ClutterLibrary.INSTANCE.clutter_text_set_selectable(this, selectable);
  }
  
  public boolean isSelectable() {
    return ClutterLibrary.INSTANCE.clutter_text_get_selectable(this);
  }
  
  
}
