package plasma.fx.scene;

import java.util.Arrays;
import java.util.List;

import com.sun.jna.Structure;

public class ClutterMargin extends Structure {

  /** the margin from the left */
  public float left;
  /** the margin from the right */
  public float right;
  /** the margin from the top */
  public float top;
  /** the margin from the bottom */
  public float bottom;
  
  public ClutterMargin() {
    this(0F, 0F, 0F, 0F);
  }
  
  public ClutterMargin(float margin) {
    this(margin, margin, margin, margin);
  }
  
  public ClutterMargin(float marginX, float marginY) {
    this(marginX, marginX, marginY, marginY);
  }
  
  public ClutterMargin(float left, float right, float top, float bottom) {
    this.left = left;
    this.right = right;
    this.top = top;
    this.bottom = bottom;
  }
  
  @SuppressWarnings("rawtypes")
  @Override
  protected List getFieldOrder() {
    return Arrays.asList(new String[] { "left", "right", "top", "bottom" });
  }

}
