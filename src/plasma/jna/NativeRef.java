package plasma.jna;

import java.lang.ref.WeakReference;

public final class NativeRef extends WeakReference<NativeObject> {
  public NativeRef(NativeObject referent) {
    super(referent);
  }
}
