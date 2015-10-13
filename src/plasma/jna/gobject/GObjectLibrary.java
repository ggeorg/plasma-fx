package plasma.jna.gobject;

import java.util.HashMap;

import plasma.jna.PlasmaFxPlatform;

import com.sun.jna.Callback;
import com.sun.jna.Library;
import com.sun.jna.NativeLong;
import com.sun.jna.Pointer;

public interface GObjectLibrary extends Library {

  String NATIVE_LIBRARY_NAME = "gobject-2.0";

  @SuppressWarnings("serial")
  static GObjectLibrary INSTANCE = PlasmaFxPlatform.loadLibrary(NATIVE_LIBRARY_NAME, GObjectLibrary.class, new HashMap<String, Object>() {
    {
      put(Library.OPTION_TYPE_MAPPER, new GTypeMapper());
    }
  });

  public void g_object_ref(GObject obj);

  public void g_object_unref(GObject obj);

  public NativeLong g_signal_connect_data(GObject obj, String signal,
      Callback callback, Pointer data, GClosureNotify destroy_data, int connect_flags);

  public void g_signal_handler_disconnect(GObject obj, NativeLong id);
}
