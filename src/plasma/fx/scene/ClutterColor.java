package plasma.fx.scene;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;

import com.sun.jna.Structure;

public class ClutterColor extends Structure {

  public static final ClutterColor BLACK = new ClutterColor();
  public static final ClutterColor WHITE = new ClutterColor(255, 255, 255);
  public static final ClutterColor BLUE = new ClutterColor(0, 0, 255);
  public static final ClutterColor RED = new ClutterColor(255, 0, 0);
  public static final ClutterColor GREEN = new ClutterColor(0, 255, 0);
  public static final ClutterColor YELLOW = new ClutterColor(255, 255, 0);
  public static final ClutterColor CYAN = new ClutterColor(0, 255, 255);
  public static final ClutterColor MAGENTA = new ClutterColor(255, 0, 255);

  public static final int BUTTER = 0xedd400ff;
  public static final int BUTTER_LIGHT = 0xfce94fff;

  public static final int ALUMINIUM_6 = 0x2e3436ff;
  public static final int TRANSPARENT = 0x00000000;

  public static ClutterColor decodeColor(String value) {
    if (value == null) {
      throw new IllegalArgumentException("Cannot decode a null String.");
    }

    String valueLowercase = value.toLowerCase(Locale.ENGLISH);

    ClutterColor color;
    if (valueLowercase.startsWith("0x")) {
      valueLowercase = valueLowercase.substring(2);
      if (valueLowercase.length() != 8) {
        throw new IllegalArgumentException(
            "Incorrect Color format.  Expecting exactly 8 digits after the '0x' prefix.");
      }
      color = new ClutterColor(Integer.parseInt(valueLowercase, 16));
    } else if (valueLowercase.startsWith("#")) {
      valueLowercase = valueLowercase.substring(1);
      if (valueLowercase.length() != 6) {
        throw new IllegalArgumentException(
            "Incorrect Color format.  Expecting exactly 6 digits after the '#' prefix.");
      }
      color = new ClutterColor((Integer.parseInt(valueLowercase, 16) << 8) | 0x000000ff);
    } else {
      try {
        color = (ClutterColor) ClutterColor.class.getDeclaredField(valueLowercase).get(null);
      } catch (Exception exception) {
        throw new IllegalArgumentException("\"" + valueLowercase + "\" is not a valid color constant.");
      }
    }

    return color;
  }
  
  // -------------------------------------------------------------------

  public byte red;
  public byte green;
  public byte blue;
  public byte alpha;

  public ClutterColor() {
    this(0, 0, 0, 255);
  }

  public ClutterColor(byte red, byte green, byte blue, byte alpha) {
    this.red = red;
    this.green = green;
    this.blue = blue;
    this.alpha = alpha;
  }

  public ClutterColor(int red, int green, int blue) {
    this((byte) red, (byte) green, (byte) blue, (byte) 255);
  }

  public ClutterColor(int red, int green, int blue, int alpha) {
    this((byte) red, (byte) green, (byte) blue, (byte) alpha);
  }

  public ClutterColor(int rgba) {
    this((byte) ((rgba >> 24) & 0xff), (byte) ((rgba >> 16) & 0xff), (byte) ((rgba >> 8) & 0xff), (byte) (rgba & 0xff));

    System.out.println(String.format("%x ? %s", rgba, this.toString()));
  }

  @SuppressWarnings("rawtypes")
  @Override
  protected List getFieldOrder() {
    return Arrays.asList(new String[] { "red", "green", "blue", "alpha" });
  }

  @Override
  public String toString() {
    return "Color [red=" + (0xff & red) + ", green=" + (0xff & green) + ", blue=" + (0xff & blue) + ", alpha=" + (0xff & alpha) + "]";
  }

}
