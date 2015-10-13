package plasma.jna;

import java.util.concurrent.ConcurrentHashMap;

import plasma.jna.gobject.GObject;
import plasma.jna.gobject.GObjectLibrary;

import com.sun.jna.Pointer;

public class NativeObject {
  private static final ConcurrentHashMap<Pointer, NativeRef> sInstanceMap = new ConcurrentHashMap<Pointer, NativeRef>();

  @SuppressWarnings("unchecked")
  public static <T extends NativeObject> T instanceFor(Pointer ptr) {
    // ignore null pointers
    if (null == ptr) {
      return null;
    }

    NativeRef ref = sInstanceMap.get(ptr);
    NativeObject obj = null != ref ? ref.get() : null;

    // If the reference was there, but the object it pointed to had been
    // collected, remove the reference from the map.
    if (null != ref && null == obj) {
      sInstanceMap.remove(ptr);
    }

    return (T) obj;
  }
  
  // ---
  
  private final Pointer ptr;
  private final NativeRef nativeRef;
  
  protected NativeObject(Pointer ptr) {
    assert null != ptr : "Pointer cannot be null";
    
    this.ptr = ptr;
    this.nativeRef = new NativeRef(this);
    
    if (GObject.class.isAssignableFrom(getClass())) {
      GObjectLibrary.INSTANCE.g_object_ref((GObject) this);
      sInstanceMap.put(ptr, nativeRef);
    }
  }

  public Pointer getPtr() {
    return ptr;
  }
  
  @Override
  protected void finalize() throws Throwable {
    sInstanceMap.remove(ptr, nativeRef);
    
    if (GObject.class.isAssignableFrom(getClass())) {
      GObjectLibrary.INSTANCE.g_object_unref((GObject) this);
    }
    
    super.finalize();
  }
}
