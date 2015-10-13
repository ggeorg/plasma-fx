package plasma.fx.scene.webview.dom.impl;

import org.w3c.dom.Node;

import plasma.fx.scene.webview.dom.MyElementCollection;
import plasma.fx.scene.webview.js.AbstractScriptableDelegate;

public class ChildMyElementCollection extends AbstractScriptableDelegate implements MyElementCollection {
  private final NodeImpl rootNode;

  public ChildMyElementCollection(NodeImpl node) {
    super();
    rootNode = node;
  }

  @Override
  public int getLength() {
    return rootNode.getChildCount();
  }

  @Override
  public Node item(int index) {
    return rootNode.getChildAtIndex(index);
  }

  @Override
  public Node namedItem(String name) {
    org.w3c.dom.Document doc = rootNode.getOwnerDocument();
    if (null == doc) {
      return null;
    }
    // TODO: This might get elements that are not descendents.
    Node node = (Node) doc.getElementById(name);
    if (null != node && node.getParentNode() == rootNode) {
      return node;
    }
    return null;
  }

}
