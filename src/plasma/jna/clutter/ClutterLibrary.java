package plasma.jna.clutter;

import java.util.HashMap;

import plasma.jna.GTypeMapper;
import plasma.jna.PlasmaFxPlatform;

import com.sun.jna.Callback;
import com.sun.jna.Library;
import com.sun.jna.Pointer;

public interface ClutterLibrary extends ClutterActorApi
    , ClutterStageApi
    , ClutterTextApi
    , ClutterScrollActorApi
    , ClutterTextBufferApi
    , ClutterAlignConstraintApi
    , ClutterLayoutManagerApi
    , ClutterBinLayoutApi
    , ClutterBoxLayoutApi
    , ClutterFixedLayoutApi
    , ClutterFlowLayoutApi
    , ClutterGridLayoutApi
    , ClutterTableLayoutApi
    , Library {

  String NATIVE_LIBRARY_NAME = "clutter-1.0";

  @SuppressWarnings("serial")
  static ClutterLibrary INSTANCE = PlasmaFxPlatform.loadLibrary(NATIVE_LIBRARY_NAME, ClutterLibrary.class, new HashMap<String, Object>() {
    {
      put(Library.OPTION_TYPE_MAPPER, new GTypeMapper());
    }
  });

//@formatter:off
  
  void clutter_init(int argc, Pointer argv);
  void clutter_main();
  void clutter_main_quit();
  void clutter_threads_add_idle(Callback callback, Pointer data);

//@formatter:on

}
