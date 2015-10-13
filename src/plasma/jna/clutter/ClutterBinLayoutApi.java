package plasma.jna.clutter;

import com.sun.jna.Pointer;

public interface ClutterBinLayoutApi {
  
//@formatter:off
  
  /* ClutterBinAlignment is deprecated since 1.2 */
  Pointer           clutter_bin_layout_new           (int                  x_align,
                                                      int                  y_align);
  
//@formatter:on

}
