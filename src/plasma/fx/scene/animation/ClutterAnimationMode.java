package plasma.fx.scene.animation;

public enum ClutterAnimationMode {
  CLUTTER_CUSTOM_MODE,

  /* linear */
  CLUTTER_LINEAR,

  /* quadratic */
  CLUTTER_EASE_IN_QUAD,
  CLUTTER_EASE_OUT_QUAD,
  CLUTTER_EASE_IN_OUT_QUAD,

  /* cubic */
  CLUTTER_EASE_IN_CUBIC,
  CLUTTER_EASE_OUT_CUBIC,
  CLUTTER_EASE_IN_OUT_CUBIC,

  /* quartic */
  CLUTTER_EASE_IN_QUART,
  CLUTTER_EASE_OUT_QUART,
  CLUTTER_EASE_IN_OUT_QUART,

  /* quintic */
  CLUTTER_EASE_IN_QUINT,
  CLUTTER_EASE_OUT_QUINT,
  CLUTTER_EASE_IN_OUT_QUINT,

  /* sinusoidal */
  CLUTTER_EASE_IN_SINE,
  CLUTTER_EASE_OUT_SINE,
  CLUTTER_EASE_IN_OUT_SINE,

  /* exponential */
  CLUTTER_EASE_IN_EXPO,
  CLUTTER_EASE_OUT_EXPO,
  CLUTTER_EASE_IN_OUT_EXPO,

  /* circular */
  CLUTTER_EASE_IN_CIRC,
  CLUTTER_EASE_OUT_CIRC,
  CLUTTER_EASE_IN_OUT_CIRC,

  /* elastic */
  CLUTTER_EASE_IN_ELASTIC,
  CLUTTER_EASE_OUT_ELASTIC,
  CLUTTER_EASE_IN_OUT_ELASTIC,

  /* overshooting cubic */
  CLUTTER_EASE_IN_BACK,
  CLUTTER_EASE_OUT_BACK,
  CLUTTER_EASE_IN_OUT_BACK,

  /* exponentially decaying parabolic */
  CLUTTER_EASE_IN_BOUNCE,
  CLUTTER_EASE_OUT_BOUNCE,
  CLUTTER_EASE_IN_OUT_BOUNCE,

  /* step functions (see css3-transitions) */
  CLUTTER_STEPS,
  CLUTTER_STEP_START, /* steps(1, start) */
  CLUTTER_STEP_END, /* steps(1, end) */

  /* cubic bezier (see css3-transitions) */
  CLUTTER_CUBIC_BEZIER,
  CLUTTER_EASE,
  CLUTTER_EASE_IN,
  CLUTTER_EASE_OUT,
  CLUTTER_EASE_IN_OUT,

  /* guard, before registered alpha functions */
  CLUTTER_ANIMATION_LAST
}
