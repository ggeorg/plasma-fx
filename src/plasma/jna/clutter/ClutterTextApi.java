package plasma.jna.clutter;

import plasma.fx.scene.ClutterColor;
import plasma.fx.scene.ClutterText;

import com.sun.jna.Pointer;

public interface ClutterTextApi {

//@formatter:off
  
  Pointer               clutter_text_new                  ();
  Pointer               clutter_text_new_full             (String                font_name,
                                                           String                text,
                                                           ClutterColor          color);
  Pointer               clutter_text_new_with_text        (String                font_name,
                                                           String                text);
//  CLUTTER_AVAILABLE_IN_1_10
  Pointer               clutter_text_new_with_buffer      (ClutterTextBuffer     buffer);
//  CLUTTER_AVAILABLE_IN_1_10
  ClutterTextBuffer     clutter_text_get_buffer           (ClutterText           self);
//  CLUTTER_AVAILABLE_IN_1_10
  void                  clutter_text_set_buffer           (ClutterText           self,
                                                           ClutterTextBuffer     buffer);
  String                clutter_text_get_text             (ClutterText           self);
  void                  clutter_text_set_text             (ClutterText           self,
                                                           String                text);
  void                  clutter_text_set_markup           (ClutterText           self,
                                                           String                markup);
  void                  clutter_text_set_color            (ClutterText           self,
                                                           ClutterColor          color);
  void                  clutter_text_get_color            (ClutterText           self,
                                                           ClutterColor          color);
  void                  clutter_text_set_font_name        (ClutterText           self,
                                                           String                font_name);
  String                clutter_text_get_font_name        (ClutterText           self);
//  void                  clutter_text_set_font_description (ClutterText          *self,
//                                                           PangoFontDescription *font_desc);
//  PangoFontDescription *clutter_text_get_font_description (ClutterText          *self);

//  void                  clutter_text_set_ellipsize        (ClutterText          *self,
//                                                           PangoEllipsizeMode    mode);
//  PangoEllipsizeMode    clutter_text_get_ellipsize        (ClutterText          *self);
  void                  clutter_text_set_line_wrap        (ClutterText           self,
                                                           boolean               line_wrap);
  boolean               clutter_text_get_line_wrap        (ClutterText           self);
  void                  clutter_text_set_line_wrap_mode   (ClutterText           self,
                                                           int                   wrap_mode); // PangoWrapMode
  int                   clutter_text_get_line_wrap_mode   (ClutterText           self); // PangoWrapMode
//  PangoLayout *         clutter_text_get_layout           (ClutterText          *self);
//  void                  clutter_text_set_attributes       (ClutterText          *self,
//                                                           PangoAttrList        *attrs);
//  PangoAttrList *       clutter_text_get_attributes       (ClutterText          *self);
  void                  clutter_text_set_use_markup       (ClutterText           self,
                                                           boolean               setting);
  boolean               clutter_text_get_use_markup       (ClutterText           self);
  void                  clutter_text_set_line_alignment   (ClutterText           self,
                                                           int                   alignment); // PangoAlignment
  int                   clutter_text_get_line_alignment   (ClutterText           self); // PangoAlignment
  void                  clutter_text_set_justify          (ClutterText           self,
                                                           boolean               justify);
  boolean               clutter_text_get_justify          (ClutterText           self);

//  void                  clutter_text_insert_unichar       (ClutterText          *self,
//                                                           gunichar              wc);
  void                  clutter_text_delete_chars         (ClutterText           self,
                                                           int                   n_chars);
//  void                  clutter_text_insert_text          (ClutterText          *self,
//                                                           const gchar          *text,
//                                                           gssize                position);
//  void                  clutter_text_delete_text          (ClutterText          *self,
//                                                           gssize                start_pos,
//                                                           gssize                end_pos);
//  gchar *               clutter_text_get_chars            (ClutterText          *self,
//                                                           gssize                start_pos,
//                                                           gssize                end_pos);
  void                  clutter_text_set_editable         (ClutterText           self,
                                                           boolean               editable);
  boolean               clutter_text_get_editable         (ClutterText           self);
  void                  clutter_text_set_activatable      (ClutterText           self,
                                                           boolean               activatable);
  boolean               clutter_text_get_activatable      (ClutterText           self);

  int                   clutter_text_get_cursor_position  (ClutterText           self);
  void                  clutter_text_set_cursor_position  (ClutterText           self,
                                                           int                   position);
  void                  clutter_text_set_cursor_visible   (ClutterText           self,
                                                           boolean               cursor_visible);
  boolean               clutter_text_get_cursor_visible   (ClutterText           self);
  void                  clutter_text_set_cursor_color     (ClutterText           self,
                                                           ClutterColor          color);
  void                  clutter_text_get_cursor_color     (ClutterText           self,
                                                           ClutterColor          color);
  void                  clutter_text_set_cursor_size      (ClutterText           self,
                                                           int                   size);
  int                   clutter_text_get_cursor_size      (ClutterText           self);
//  void                  clutter_text_get_cursor_rect      (ClutterText          *self,
//                                                           ClutterRect          *rect);
  void                  clutter_text_set_selectable       (ClutterText           self,
                                                           boolean               selectable);
  boolean               clutter_text_get_selectable       (ClutterText           self);
  void                  clutter_text_set_selection_bound  (ClutterText           self,
                                                           int                   selection_bound);
  int                   clutter_text_get_selection_bound  (ClutterText           self);
//  void                  clutter_text_set_selection        (ClutterText          *self,
//                                                           gssize                start_pos,
//                                                           gssize                end_pos);
  String                clutter_text_get_selection        (ClutterText           self);
  void                  clutter_text_set_selection_color  (ClutterText           self,
                                                           ClutterColor          color);
  void                  clutter_text_get_selection_color  (ClutterText           self,
                                                           ClutterColor          color);
  boolean               clutter_text_delete_selection     (ClutterText           self);
//  void                  clutter_text_set_password_char    (ClutterText          *self,
//                                                           gunichar              wc);
//  gunichar              clutter_text_get_password_char    (ClutterText          *self);
  void                  clutter_text_set_max_length       (ClutterText           self,
                                                           int                   max);
  int                   clutter_text_get_max_length       (ClutterText           self);
  void                  clutter_text_set_single_line_mode (ClutterText           self,
                                                           boolean               single_line);
  boolean               clutter_text_get_single_line_mode (ClutterText           self);

  void                  clutter_text_set_selected_text_color  (ClutterText           self,
                                                               ClutterColor          color);
  void                  clutter_text_get_selected_text_color  (ClutterText           self,
                                                               ClutterColor          color);

  boolean               clutter_text_activate             (ClutterText           self);
//  CLUTTER_AVAILABLE_IN_1_10
  int                   clutter_text_coords_to_position   (ClutterText           self,
                                                           float                 x,
                                                           float                 y);
  boolean               clutter_text_position_to_coords   (ClutterText           self,
                                                           int                   position,
                                                           float[]               x,
                                                           float[]               y,
                                                           float[]               line_height);

//  void                  clutter_text_set_preedit_string   (ClutterText          *self,
//                                                           const gchar          *preedit_str,
//                                                           PangoAttrList        *preedit_attrs,
//                                                           guint                 cursor_pos);

  void                  clutter_text_get_layout_offsets   (ClutterText            self,
                                                           int[]                  x,
                                                           int[]                  y);
  
//@formatter:on
  
}
