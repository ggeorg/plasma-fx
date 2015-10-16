package plasma.fx.scene.layout;

/**
 * The alignment policies available on each axis of the #ClutterTableLayout
 * 
 * Since: 1.4
 */
public enum ClutterTableAlignment {
  /**
   * Align the child to the top or to the left of a cell in the table, depending
   * on the axis.
   */
  CLUTTER_TABLE_ALIGNMENT_START,
  /**
   * Align the child to the center of a cell in the table.
   */
  CLUTTER_TABLE_ALIGNMENT_CENTER,
  /**
   * Align the child to the bottom or to the right of a cell in the table,
   * depending on the axis.
   */
  CLUTTER_TABLE_ALIGNMENT_END;

  public static ClutterTableAlignment valueOf(int ordinal) {
    switch (ordinal) {
    case 0:
      return CLUTTER_TABLE_ALIGNMENT_START;
    case 1:
      return CLUTTER_TABLE_ALIGNMENT_CENTER;
    case 2:
      return CLUTTER_TABLE_ALIGNMENT_END;
    default:
      return CLUTTER_TABLE_ALIGNMENT_START;
    }
  }
}
