package plasma.fx.scene.webview.dom.impl;

public interface NodeVisitor {
  /**
   * Visits a node. The call should be expected to occur in a synchronized
   * block. The lock will be node-dependent.
   * 
   * @param node
   */
  public void visit(org.w3c.dom.Node node);
}
