package plasma.fx.scene;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;

import com.sun.jna.Structure;

public class ClutterColor extends Structure {

  // public static final ClutterColor BLACK = new ClutterColor();
  // public static final ClutterColor WHITE = new ClutterColor(255, 255, 255);
  // public static final ClutterColor BLUE = new ClutterColor(0, 0, 255);
  // public static final ClutterColor RED = new ClutterColor(255, 0, 0);
  // public static final ClutterColor GREEN = new ClutterColor(0, 255, 0);
  // public static final ClutterColor YELLOW = new ClutterColor(255, 255, 0);
  // public static final ClutterColor CYAN = new ClutterColor(0, 255, 255);
  // public static final ClutterColor MAGENTA = new ClutterColor(255, 0, 255);

  public static final ClutterColor WHITE = new ClutterColor(0xffffffff);
  public static final ClutterColor BLACK = new ClutterColor(0x000000ff);
  public static final ClutterColor RED = new ClutterColor(0xff0000ff);
  public static final ClutterColor DARK_RED = new ClutterColor(0x800000ff);
  public static final ClutterColor GREEN = new ClutterColor(0x00ff00ff);
  public static final ClutterColor DARK_GREEN = new ClutterColor(0x008000ff);
  public static final ClutterColor BLUE = new ClutterColor(0x0000ffff);
  public static final ClutterColor DARK_BLUE = new ClutterColor(0x000080ff);
  public static final ClutterColor CYAN = new ClutterColor(0x00ffffff);
  public static final ClutterColor DARK_CYAN = new ClutterColor(0x008080ff);
  public static final ClutterColor MAGENTA = new ClutterColor(0xff00ffff);
  public static final ClutterColor DARK_MAGENTA = new ClutterColor(0x800080ff);
  public static final ClutterColor YELLOW = new ClutterColor(0xffff00ff);
  public static final ClutterColor DARK_YELLOW = new ClutterColor(0x808000ff);
  public static final ClutterColor GRAY = new ClutterColor(0xa0a0a4ff);
  public static final ClutterColor DARK_GRAY = new ClutterColor(0x808080ff);
  public static final ClutterColor LIGHT_GRAY = new ClutterColor(0xc0c0c0ff);
  public static final ClutterColor BUTTER = new ClutterColor(0xedd400ff);
  public static final ClutterColor BUTTER_LIGHT = new ClutterColor(0xfce94fff);
  public static final ClutterColor BUTTER_DARK = new ClutterColor(0xc4a000ff);
  public static final ClutterColor ORANGE = new ClutterColor(0xf57900ff);
  public static final ClutterColor ORANGE_LIGHT = new ClutterColor(0xfcaf3fff);
  public static final ClutterColor ORANGE_DARK = new ClutterColor(0xce5c00ff);
  public static final ClutterColor CHOCOLATE = new ClutterColor(0xc17d11ff);
  public static final ClutterColor CHOCOLATE_LIGHT = new ClutterColor(0xe9b96eff);
  public static final ClutterColor CHOCOLATE_DARK = new ClutterColor(0x8f5902ff);
  public static final ClutterColor CHAMELEON = new ClutterColor(0x73d216ff);
  public static final ClutterColor CHAMELEON_LIGHT = new ClutterColor(0x8ae234ff);
  public static final ClutterColor CHAMELEON_DARK = new ClutterColor(0x4e9a06ff);
  public static final ClutterColor SKY_BLUE = new ClutterColor(0x3465a4ff);
  public static final ClutterColor SKY_BLUE_LIGHT = new ClutterColor(0x729fcfff);
  public static final ClutterColor SKY_BLUE_DARK = new ClutterColor(0x204a87ff);
  public static final ClutterColor PLUM = new ClutterColor(0x75507bff);
  public static final ClutterColor PLUM_LIGHT = new ClutterColor(0xad7fa8ff);
  public static final ClutterColor PLUM_DARK = new ClutterColor(0x5c3566ff);
  public static final ClutterColor SCARLET_RED = new ClutterColor(0xcc0000ff);
  public static final ClutterColor SCARLET_RED_LIGHT = new ClutterColor(0xef2929ff);
  public static final ClutterColor SCARLET_RED_DARK = new ClutterColor(0xa40000ff);
  public static final ClutterColor ALUMINIUM_1 = new ClutterColor(0xeeeeecff);
  public static final ClutterColor ALUMINIUM_2 = new ClutterColor(0xd3d7cfff);
  public static final ClutterColor ALUMINIUM_3 = new ClutterColor(0xbabdb6ff);
  public static final ClutterColor ALUMINIUM_4 = new ClutterColor(0x888a85ff);
  public static final ClutterColor ALUMINIUM_5 = new ClutterColor(0x555753ff);
  public static final ClutterColor ALUMINIUM_6 = new ClutterColor(0x2e3436ff);
  public static final ClutterColor TRANSPARENT = new ClutterColor(0x00000000);

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
