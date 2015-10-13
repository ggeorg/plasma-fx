package plasma.jna.clutter;

import com.sun.jna.Pointer;

public interface ClutterTextBufferApi {

//@formatter:off
  
//  CLUTTER_AVAILABLE_IN_1_10
  Pointer             clutter_text_buffer_new                 ();
//  CLUTTER_AVAILABLE_IN_1_10
  Pointer             clutter_text_buffer_new_with_text       (String             text,
                                                               int                text_len);

//  CLUTTER_AVAILABLE_IN_1_10
  int               clutter_text_buffer_get_bytes             (ClutterTextBuffer  buffer);
//  CLUTTER_AVAILABLE_IN_1_10
  int                 clutter_text_buffer_get_length          (ClutterTextBuffer  buffer);
//  CLUTTER_AVAILABLE_IN_1_10
  String              clutter_text_buffer_get_text            (ClutterTextBuffer  buffer);
//  CLUTTER_AVAILABLE_IN_1_10
  void                clutter_text_buffer_set_text            (ClutterTextBuffer  buffer,
                                                               String             chars,
                                                               int                n_chars);
//  CLUTTER_AVAILABLE_IN_1_10
  void                clutter_text_buffer_set_max_length      (ClutterTextBuffer  buffer,
                                                               int                max_length);
//  CLUTTER_AVAILABLE_IN_1_10
  int                 clutter_text_buffer_get_max_length      (ClutterTextBuffer  buffer);

//  CLUTTER_AVAILABLE_IN_1_10
  int                 clutter_text_buffer_insert_text         (ClutterTextBuffer  buffer,
                                                               int                position,
                                                               String             chars,
                                                               int                n_chars);
//  CLUTTER_AVAILABLE_IN_1_10
  int                 clutter_text_buffer_delete_text         (ClutterTextBuffer  buffer,
                                                               int                position,
                                                               int                n_chars);
//  CLUTTER_AVAILABLE_IN_1_10
  void                clutter_text_buffer_emit_inserted_text  (ClutterTextBuffer  buffer,
                                                               int                position,
                                                               String             chars,
                                                               int                n_chars);
//  CLUTTER_AVAILABLE_IN_1_10
  void                clutter_text_buffer_emit_deleted_text   (ClutterTextBuffer  buffer,
                                                               int                position,
                                                               int                n_chars);
  
//@formatter:on
  
}
