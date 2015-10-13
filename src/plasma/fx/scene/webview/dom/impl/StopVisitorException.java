package plasma.fx.scene.webview.dom.impl;

@SuppressWarnings("serial")
class StopVisitorException extends RuntimeException {
  private final Object tag;

  public StopVisitorException() {
    super();
    this.tag = null;
  }

  public StopVisitorException(String message) {
    super(message);
    this.tag = null;
  }

  public StopVisitorException(String message, Throwable cause) {
    super(message, cause);
    this.tag = null;
  }

  public StopVisitorException(Throwable cause) {
    super(cause);
    this.tag = null;
  }

  public StopVisitorException(Object tag) {
    this.tag = tag;
  }

  public final Object getTag() {
    return this.tag;
  }
}