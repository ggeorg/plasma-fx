package plasma.fx.scene.webview.dom.impl;

@SuppressWarnings("serial")
class SkipVisitorException extends RuntimeException {
  public SkipVisitorException() {
    super();
  }

  public SkipVisitorException(String message) {
    super(message);
  }

  public SkipVisitorException(String message, Throwable cause) {
    super(message, cause);
  }

  public SkipVisitorException(Throwable cause) {
    super(cause);
  }
}
