package plasma.jna;

import com.sun.jna.FromNativeContext;
import com.sun.jna.Pointer;
import com.sun.jna.ToNativeContext;
import com.sun.jna.TypeConverter;

public final class NativeObjectTypeConverter implements TypeConverter {

  @Override
  public Object fromNative(Object o, FromNativeContext context) {
    return null != o ? NativeObject.instanceFor((Pointer) o) : null;
  }

  @Override
  public Class<?> nativeType() {
    return Pointer.class;
  }

  @Override
  public Object toNative(Object o, ToNativeContext context) {
    return null != o ? ((NativeObject) o).getPtr() : null;
  }

}
