package plasma.fx.scene.webview.io;

import java.net.URL;

import org.w3c.dom.Document;

/**
 * The <code>HttpRequest</code> interface should be implemented to provide web
 * request capabilities. It is used a similar manner to
 * <code>XMLHttpRequest</code> in JavaScript (AJAX). Normally, a listener will
 * be added by calling
 * {@link #addReadyStateChangeListener(ReadyStateChangeListener)}, the method
 * {@link #open(String, URL, boolean, String, String) open} will be called, and
 * finally, {@link #send(String)} will be called to complete the request.
 * 
 * @see UserAgentContext#createHttpRequest()
 */
public interface HttpRequest {
  /**
   * The uninitialized request state.
   */
  static final int STATE_UNINITIALIZED = 0;

  /**
   * The loading request state. The <code>open</code> method has been called,
   * but a response has not been received yet.
   */
  static final int STATE_LOADING = 1;

  /**
   * The loaded request state. Headers and status are now available.
   */
  static final int STATE_LOADED = 2;

  /**
   * The interactive request state. Downloading response.
   */
  static final int STATE_INTERACTIVE = 3;

  /**
   * The complete request state. All operations are finished.
   */
  static final int STATE_COMPLETE = 4;

  /**
   * Gets the state of the request, a value between 0 and 4.
   * 
   * @return A value corresponding to one of the STATE* constants in this class.
   */
  int getReadyState();

  /**
   * Gets the request response as text.
   */
  String getResponseText();

  /**
   * Gets the request response as an XML DOM.
   */
  Document getResponseXML();

  /**
   * Gets the request response as an AWT image.
   */
  // TODO Image getResponseImage();

  /**
   * Gets the request response bytes.
   */
  byte[] getResponseBytes();

  /**
   * Gets the status of the response. Note that this can be 0 for file requests
   * in addition to 200 for successful HTTP requests.
   */
  int getStatus();

  /**
   * Gets the status text of the request, e.g. "OK" for 200.
   */
  String getStatusText();

  /**
   * Aborts an ongoing request.
   */
  void abort();

  /**
   * Gets a string with all the response headers.
   */
  String getAllResponseHeaders();

  /**
   * Gets a response header value.
   * 
   * @param headerName
   *          The name of the header.
   */
  String getResponseHeader(String headerName);

  /**
   * Starts an asynchronous request.
   * 
   * @param method
   *          The request method.
   * @param url
   *          The destination URL.
   */
  void open(String method, String url) throws java.io.IOException;

  /**
   * Opens an asynchronous request.
   * 
   * @param method
   *          The request method.
   * @param url
   *          The destination URL.
   */
  void open(String method, URL url) throws java.io.IOException;

  /**
   * Opens an request.
   * 
   * @param method
   *          The request method.
   * @param url
   *          The destination URL.
   * @param asyncFlag
   *          Whether the request is asynchronous.
   */
  void open(String method, URL url, boolean asyncFlag) throws java.io.IOException;

  /**
   * Opens a request.
   * 
   * @param method
   *          The request method.
   * @param url
   *          The destination URL.
   * @param asyncFlag
   *          Whether the request should be asynchronous.
   */
  void open(String method, String url, boolean asyncFlag) throws java.io.IOException;

  /**
   * Opens a request.
   * 
   * @param method
   *          The request method.
   * @param url
   *          The destination URL.
   * @param asyncFlag
   *          Whether the request should be asynchronous.
   * @param userName
   *          The HTTP authentication user name.
   */
  void open(String method, URL url, boolean asyncFlag, String userName) throws java.io.IOException;

  /**
   * Opens a request.
   * 
   * @param method
   *          The request method.
   * @param url
   *          The destination URL.
   * @param asyncFlag
   *          Whether the request should be asynchronous.
   * @param userName
   *          The HTTP authentication user name.
   * @param password
   *          The HTTP authentication password.
   */
  void open(String method, URL url, boolean asyncFlag, String userName, String password) throws java.io.IOException;

  /**
   * Sends POST content if any.
   * 
   * @param content
   *          POST content or <code>null</code> for GET requests.
   * @throws java.io.IOException
   */
  void send(String content) throws java.io.IOException;

  /**
   * Adds a listener of ReadyState changes. The listener should be invoked even
   * in the case of errors.
   * 
   * @param listener
   *          An instanceof of
   *          {@link org.lobobrowser.html.ReadyStateChangeListener}
   */
  void addReadyStateChangeListener(ReadyStateChangeListener listener);
}