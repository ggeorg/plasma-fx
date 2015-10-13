package plasma.fx.scene.webview.dom.impl;

import java.util.ArrayList;
import java.util.Collection;

import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import plasma.fx.scene.webview.js.AbstractScriptableDelegate;

public class NodeListImpl extends AbstractScriptableDelegate implements NodeList {
  //Note: class must be public for reflection to work.
  private final ArrayList<Node> nodeList = new ArrayList<Node>(); 
  
  public NodeListImpl(Collection<Node> collection) {
    super();
    nodeList.addAll(collection);
  }

  public int getLength() {
    return this.nodeList.size();
  }
  
  public Node item(int index) {
    try {
      return (Node) this.nodeList.get(index);
    } catch(IndexOutOfBoundsException iob) {
      return null;
    }
  }
}
