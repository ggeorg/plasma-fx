package plasma.jna.gobject;

import java.util.HashMap;

import plasma.jna.PlasmaFxPlatform;

import com.sun.jna.Library;

public interface GlibLibrary extends Library {
  
  String NATIVE_LIBRARY_NAME = "glib-2.0";
  
  @SuppressWarnings("serial")
  static GlibLibrary INSTANCE = PlasmaFxPlatform.loadLibrary(NATIVE_LIBRARY_NAME, GlibLibrary.class, new HashMap<String, Object>() {
    {
      put(Library.OPTION_TYPE_MAPPER, new GTypeMapper());
    }
  });

}
