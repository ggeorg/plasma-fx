package plasma.fx.scene.layout;

import com.sun.jna.Pointer;

import plasma.jna.gobject.GObject;

/**
 * {@code ClutterLayoutManager} is a base abstract class for layout managers.
 * A layout manager implements the layouting policy for a composite or container actor: it controls the
 * preferred size of the actor to which it has been paired, and it controls the allocation of its children.
 * <p>
 * Any composite or container {@link ClutterActor} subclass can delegate the layouting of its children
 * to a {@code ClutterLayoutManager}.
 */
public abstract class ClutterLayoutManager extends GObject {

  protected ClutterLayoutManager(Pointer ptr) {
    super(ptr);
  }

}
