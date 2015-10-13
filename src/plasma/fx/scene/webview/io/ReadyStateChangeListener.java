package plasma.fx.scene.webview.io;

import java.util.EventListener;

/**
 * The <code>ReadyStateChangeListener</code> interface is implemented to receive
 * ReadyState change events from {@link org.lobobrowser.html.HttpRequest}.
 * 
 * @see org.lobobrowser.html.HttpRequest#addReadyStateChangeListener(ReadyStateChangeListener)
 * @author J. H. S.
 */
public interface ReadyStateChangeListener extends EventListener {
  /**
   * This method is called when the ReadyState changes.
   */
  public void readyStateChanged();
}