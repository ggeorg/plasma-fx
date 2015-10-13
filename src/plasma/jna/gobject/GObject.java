package plasma.jna.gobject;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import com.sun.jna.Callback;
import com.sun.jna.NativeLong;
import com.sun.jna.Pointer;

import plasma.jna.NativeObject;

public class GObject extends NativeObject {
  /*
   * Hold a strong Java reference of all connected signal handlers, so that
   * those are not eligible for GC.
   */
  private static final Map<NativeLong, Callback> sSignalHandlers = new ConcurrentHashMap<NativeLong, Callback>();

  protected GObject(Pointer ptr) {
    super(ptr);
  }
  
  protected final synchronized SignalConnection connect(String signal, SignalHandler handler) {
    return connect(signal, handler, 0);
  }

  protected final SignalConnection connect(String signal, SignalHandler handler, int connectFlags) {
    final NativeLong connectId = GObjectLibrary.INSTANCE.g_signal_connect_data(this, signal, handler, null, null, connectFlags);
    if (connectId.intValue() == 0) {
      throw new IllegalArgumentException(String.format("Failed to connect signal '%s'", signal));
    }

    // hold a signal handler reference
    sSignalHandlers.put(connectId, handler);

    return new SignalConnection() {
      private NativeLong id = connectId;

      @Override
      public void disconnect() {
        if (sSignalHandlers.remove(id) != null) {
          GObjectLibrary.INSTANCE.g_signal_handler_disconnect(GObject.this, id);
        }
        this.id = null;
      }
    };
  }
}
