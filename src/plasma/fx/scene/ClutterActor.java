package plasma.fx.scene;

import plasma.fx.scene.animation.ClutterAnimationMode;
import plasma.fx.scene.geometry.Dimension;
import plasma.fx.scene.geometry.Point2D;
import plasma.fx.scene.layout.ClutterLayoutManager;

import com.sun.jna.Pointer;

import plasma.jna.NativeObject;
import plasma.jna.clutter.ClutterLibrary;
import plasma.jna.gobject.GObject;
import plasma.jna.gobject.SignalConnection;
import plasma.jna.gobject.SignalHandler;

public class ClutterActor extends GObject implements ClutterContainer {

  /**
   * The {@code destroy} signal notifies that all references held on the actor
   * emitted it should be released.
   * <p>
   * The {@code destroy} signal should be used by all holders of a reference on
   * actor.
   * <p>
   * This signal might result in the finalization of the {@code Actor} if all
   * references are released.
   */
  public static final String SIGNAL_DESTROY = "destroy";

  public static final String ON_BUTTON_PRESS_EVENT = "button-press-event";
  public static final String ON_ENTER_EVENT = "enter-event";
  public static final String ON_LEAVE_EVENT = "leave-event";
  public static final String ON_TRANSITION_STOPPED = "transition-stopped::rotation-angle-y";

  public ClutterActor() {
    this(ClutterLibrary.INSTANCE.clutter_actor_new());
  }

  protected ClutterActor(Pointer ptr) {
    super(ptr);
  }

  // TODO ClutterActorFlags

  public void show() {
    ClutterLibrary.INSTANCE.clutter_actor_show(this);
  }

  public void hide() {
    ClutterLibrary.INSTANCE.clutter_actor_hide(this);
  }

  // TODO realize/unrealize/map/unmap
  // TODO paint/continue_paint/queue_redraw/queue_redraw_with_clip
  // TODO queue_relayout
  // TODO destroy

  public void setName(String name) {
    ClutterLibrary.INSTANCE.clutter_actor_set_name(this, name);
  }

  public String getName() {
    return ClutterLibrary.INSTANCE.clutter_actor_get_name(this);
  }

  // TODO more methods

  public void setSize(float width, float height) {
    ClutterLibrary.INSTANCE.clutter_actor_set_size(this, width, height);
  }

  public Dimension getSize() {
    final Dimension d = new Dimension();
    ClutterLibrary.INSTANCE.clutter_actor_get_size(this, d.width, d.height);
    return d;
  }

  public void setPosition(float x, float y) {
    ClutterLibrary.INSTANCE.clutter_actor_set_position(this, x, y);
  }

  public Point2D getPosition() {
    final Point2D p = new Point2D();
    ClutterLibrary.INSTANCE.clutter_actor_get_position(this, p.x, p.y);
    return p;
  }

  /**
   * Sets whether an actor has a fixed position set (and will thus be unaffected
   * by any layout manager).
   * 
   * @param fixed
   *          whether to use fixed position
   */
  public void setFixedPosition(boolean fixed) {
    ClutterLibrary.INSTANCE.clutter_actor_set_fixed_position_set(this, fixed);
  }

  public boolean getFixedPosition() {
    return ClutterLibrary.INSTANCE.clutter_actor_get_fixed_position_set(this);
  }

  /**
   * Moves an actor by the specified distance relative to its current position
   * in pixels.
   * <p>
   * This function modifies the fixed position of an actor and thus removes it
   * from any layout management. Another way to move an actor is with an anchor
   * point, see clutter_actor_set_anchor_point(), or with an additional
   * translation, using clutter_actor_set_translation().
   * 
   * @param dx distance to move Actor on X axis.
   * @param dy distance to move Actor on Y axis.
   */
  public void moveBy(float dx, float dy) {
    ClutterLibrary.INSTANCE.clutter_actor_move_by(this, dx, dy);
  }
  
  public void setWidth(float width) {
    ClutterLibrary.INSTANCE.clutter_actor_set_width(this, width);
  }

  public float getWidth() {
    return ClutterLibrary.INSTANCE.clutter_actor_get_width(this);
  }

  public void setHeight(float height) {
    ClutterLibrary.INSTANCE.clutter_actor_set_height(this, height);
  }

  public float getHeight() {
    return ClutterLibrary.INSTANCE.clutter_actor_get_height(this);
  }
  
  public void setX(float x) {
    ClutterLibrary.INSTANCE.clutter_actor_set_x(this, x);
  }

  public float getX() {
    return ClutterLibrary.INSTANCE.clutter_actor_get_x(this);
  }

  public void setY(float y) {
    ClutterLibrary.INSTANCE.clutter_actor_set_y(this, y);
  }

  public float getY() {
    return ClutterLibrary.INSTANCE.clutter_actor_get_y(this);
  }
  
  public void setZ(float z) {
    ClutterLibrary.INSTANCE.clutter_actor_set_z_position(this, z);
  }

  public float getZ() {
    return ClutterLibrary.INSTANCE.clutter_actor_get_z_position(this);
  }
  
  public void setLayoutManager(ClutterLayoutManager manager) {
    ClutterLibrary.INSTANCE.clutter_actor_set_layout_manager(this, manager);
  }

  public ClutterLayoutManager getLayoutManager() {
    return ClutterLibrary.INSTANCE.clutter_actor_get_layout_manager(this);
  }
  
  public void setAlignX(ClutterActorAlign align) {
    ClutterLibrary.INSTANCE.clutter_actor_set_x_align(this, align.ordinal());
  }

  public ClutterActorAlign getAlignX() {
    return ClutterActorAlign.valueOf(ClutterLibrary.INSTANCE.clutter_actor_get_x_align(this));
  }

  public void setAlignY(ClutterActorAlign align) {
    ClutterLibrary.INSTANCE.clutter_actor_set_y_align(this, align.ordinal());
  }

  public ClutterActorAlign getAlignY() {
    return ClutterActorAlign.valueOf(ClutterLibrary.INSTANCE.clutter_actor_get_y_align(this));
  }

  public void setMarginTop(float margin) {
    ClutterLibrary.INSTANCE.clutter_actor_set_margin_top(this, margin);
  }

  public float getMarginTop() {
    return ClutterLibrary.INSTANCE.clutter_actor_get_margin_top(this);
  }

  public void setMarginBottom(float margin) {
    ClutterLibrary.INSTANCE.clutter_actor_set_margin_bottom(this, margin);
  }

  public float getMarginBottom() {
    return ClutterLibrary.INSTANCE.clutter_actor_get_margin_bottom(this);
  }

  public void setMarginLeft(float margin) {
    ClutterLibrary.INSTANCE.clutter_actor_set_margin_left(this, margin);
  }

  public float getMarginLeft() {
    return ClutterLibrary.INSTANCE.clutter_actor_get_margin_left(this);
  }

  public void setMarginRight(float margin) {
    ClutterLibrary.INSTANCE.clutter_actor_set_margin_right(this, margin);
  }

  public float getMarginRight() {
    return ClutterLibrary.INSTANCE.clutter_actor_get_margin_right(this);
  }
  
  public void setMargin(float margin) {
    setMargin(new ClutterMargin(margin));
  }
  
  public void setMargin(float marginX, float marginY) {
    setMargin(new ClutterMargin(marginX, marginY));
  }
  
  public void setMargin(ClutterMargin margin) {
    ClutterLibrary.INSTANCE.clutter_actor_set_margin(this, margin);
  }
  
  public ClutterMargin getMargin() {
    ClutterMargin margin = new ClutterMargin();
    ClutterLibrary.INSTANCE.clutter_actor_get_margin(this, margin);
    return margin;
  }
  
  public void setExpandX(boolean expand) {
    ClutterLibrary.INSTANCE.clutter_actor_set_x_expand(this, expand);
  }

  public boolean isExpandX() {
    return ClutterLibrary.INSTANCE.clutter_actor_get_x_expand(this);
  }

  public void setExpandY(boolean expand) {
    ClutterLibrary.INSTANCE.clutter_actor_set_y_expand(this, expand);
  }

  public boolean isExpandY() {
    return ClutterLibrary.INSTANCE.clutter_actor_get_y_expand(this);
  }
  
  /**
   * Sets the actor's opacity, with zero being completely transparent and 255 (0xff) being fully opaque.
   * <p>
   * The “opacity” property is animatable.
   * 
   * @param opacity new opacity value for the actor.
   */
  public void setOpacity(byte opacity) {
    ClutterLibrary.INSTANCE.clutter_actor_set_opacity(this, opacity);
  }
  
  public byte getOpacity() {
    return ClutterLibrary.INSTANCE.clutter_actor_get_opacity(this); 
  }
  
  public void setBackgroundColor(int rgba) {
    setBackgroundColor(new ClutterColor(rgba));
  }
  
  public void setBackgroundColor(String color) {
    setBackgroundColor(ClutterColor.decodeColor(color));
  }

  public void setBackgroundColor(ClutterColor c) {
    ClutterLibrary.INSTANCE.clutter_actor_set_background_color(this, c);
  }

  public ClutterColor getBackgroundColor() {
    final ClutterColor c = new ClutterColor();
    ClutterLibrary.INSTANCE.clutter_actor_get_background_color(this, c);
    return c;
  }
  
  public void addChild(ClutterActor child) {
    ClutterLibrary.INSTANCE.clutter_actor_add_child(this, child);
  }
  
  public void insertChild(ClutterActor child, int index) {
    ClutterLibrary.INSTANCE.clutter_actor_insert_child_at_index(this, child, index);
  }
  
  public void insertChildAbove(ClutterActor child, ClutterActor sibling) {
    ClutterLibrary.INSTANCE.clutter_actor_insert_child_above(this, child, sibling);
  }
  
  public void insertChildBelow(ClutterActor child, ClutterActor sibling) {
    ClutterLibrary.INSTANCE.clutter_actor_insert_child_below(this, child, sibling);
  }
  
  public void insertReplaceChild(ClutterActor oldChild, ClutterActor newChild) {
    ClutterLibrary.INSTANCE.clutter_actor_replace_child(this, oldChild, newChild);
  }
  
  public void insertRemoveChild(ClutterActor child) {
    ClutterLibrary.INSTANCE.clutter_actor_remove_child(this, child);
  }
  
  public void removeAllChildren() {
    ClutterLibrary.INSTANCE.clutter_actor_remove_all_children(this);
  }
  
  public void destroyAllChildren() {
    ClutterLibrary.INSTANCE.clutter_actor_destroy_all_children(this);
  }
  
  // TODO getChildren
  
  public int getChildrenNum() {
    return ClutterLibrary.INSTANCE.clutter_actor_get_n_children(this);
  }
  
  public ClutterActor getChildAtIndex(int index) {
    return ClutterLibrary.INSTANCE.clutter_actor_get_child_at_index(this, index);
  }
  
  //----



  public void setPivotPoint(float x, float y) {
    ClutterLibrary.INSTANCE.clutter_actor_set_pivot_point(this, x, y);
  }

  public Point2D getPivotPoint() {
    final Point2D p = new Point2D();
    ClutterLibrary.INSTANCE.clutter_actor_get_pivot_point(this, p.x, p.y);
    return p;
  }

  public void setRotationAngle(ClutterRotateAxis axis, double angle) {
    ClutterLibrary.INSTANCE.clutter_actor_set_rotation_angle(this, axis.ordinal(), angle);
  }

  public double getRotationAngle(ClutterRotateAxis axis) {
    return ClutterLibrary.INSTANCE.clutter_actor_get_rotation_angle(this, axis.ordinal());
  }



  public void addConstraint(ClutterConstraint constraint) {
    ClutterLibrary.INSTANCE.clutter_actor_add_constraint(this, constraint);
  }







  /** Sets actor as reactive. Reactive actors will receive events. */
  public void setReactive(boolean reactive) {
    ClutterLibrary.INSTANCE.clutter_actor_set_reactive(this, reactive);
  }

  /** Checks whether actor is marked as reactive. */
  public boolean isReactive() {
    return ClutterLibrary.INSTANCE.clutter_actor_get_reactive(this);
  }

  public void saveEastingState() {
    ClutterLibrary.INSTANCE.clutter_actor_save_easing_state(this);
  }

  public void restoreEasingState() {
    ClutterLibrary.INSTANCE.clutter_actor_restore_easing_state(this);
  }

  public void setEasingDuration(int msecs) {
    ClutterLibrary.INSTANCE.clutter_actor_set_easing_duration(this, msecs);
  }

  public int getEasingDuration() {
    return ClutterLibrary.INSTANCE.clutter_actor_get_easing_duration(this);
  }

  public void setEasingMode(ClutterAnimationMode mode) {
    ClutterLibrary.INSTANCE.clutter_actor_set_easing_mode(this, mode.ordinal());
  }

  public int getEasingMode() {
    return ClutterLibrary.INSTANCE.clutter_actor_get_easing_mode(this);
  }

  public void setEasingDelay(int msecs) {
    ClutterLibrary.INSTANCE.clutter_actor_set_easing_delay(this, msecs);
  }

  public int getEasingDelay() {
    return ClutterLibrary.INSTANCE.clutter_actor_get_easing_delay(this);
  }

  //
  // Signal HAndlers
  //

  /**
   * {@code Actor} signal handler.
   * 
   * @see Actor#signalConnect(DestroySignalHandler, Object, int)
   */
  protected static abstract class ActorSignalHandler implements SignalHandler {
    public final boolean onSignal(Pointer actorPtr, Pointer userData) {
      return onSignal((ClutterActor) NativeObject.instanceFor(actorPtr));
    }

    /**
     * The signal handler callback.
     * 
     * @param actor
     *          the actor which received the signal.
     */
    protected abstract boolean onSignal(ClutterActor actor);
  }

  //
  // Destroy signal
  //

  public SignalConnection connect(DestroySignalHandler handler) {
    return super.connect(ClutterActor.SIGNAL_DESTROY, handler);
  }

  /**
   * The {@code destroy} signal handler.
   * 
   * @see Actor#SIGNAL_DESTROY
   */
  public static abstract class DestroySignalHandler extends ActorSignalHandler {
    // empty body
  }

  public static class QuitSignalHandler extends DestroySignalHandler {
    @Override
    protected boolean onSignal(ClutterActor actor) {
      ClutterLibrary.INSTANCE.clutter_main_quit();
      return true;
    }
  }

  //
  // onClick event
  //

  public SignalConnection connect(ButtonPressEventHandler handler) {
    return super.connect(ClutterActor.ON_BUTTON_PRESS_EVENT, handler);
  }

  public static abstract class ButtonPressEventHandler extends ActorSignalHandler {
    // empty body
  }

  //
  // onMouseEnter event
  //

  public SignalConnection connect(EnterEventHandler handler) {
    return super.connect(ClutterActor.ON_ENTER_EVENT, handler);
  }

  public static abstract class EnterEventHandler extends ActorSignalHandler {
    // empty body
  }

  //
  // onMouseExit event
  //

  public SignalConnection connect(LeaveEventHandler handler) {
    return super.connect(ClutterActor.ON_LEAVE_EVENT, handler);
  }

  public static abstract class LeaveEventHandler extends ActorSignalHandler {
    // empty body
  }

  //
  // onTransition event
  //

  public SignalConnection connect(TransitionStoppedEventHandler handler) {
    return super.connect(ClutterActor.ON_TRANSITION_STOPPED, handler);
  }

  public static abstract class TransitionStoppedEventHandler extends ActorSignalHandler {
    // empty body
  }

}
