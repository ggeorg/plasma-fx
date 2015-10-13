package plasma.fx.scene.webview.dom.impl;

import java.net.MalformedURLException;

import plasma.fx.scene.webview.style.RenderState;

/**
 * A generic node interface. The idea is that implementors could be W3C nodes or
 * not.
 */
public interface ModelNode {

  //
  // There shouldn't be any references to GUI components here.
  // Events are processed by controller in renderer package.
  //

  java.net.URL getFullURL(String spec) throws MalformedURLException;

  void warn(String message, Throwable err);

  boolean isEqualOrDescendentOf(ModelNode otherNode);

  ModelNode getParentModelNode();

  RenderState getRenderState();

  /**
   * Sets a document item. A radio button, for example, can use this to set
   * button group state.
   * 
   * @param name
   * @param value
   */
  void setDocumentItem(String name, Object value);

  Object getDocumentItem(String name);

}
