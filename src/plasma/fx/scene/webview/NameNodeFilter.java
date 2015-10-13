package plasma.fx.scene.webview;

import org.w3c.dom.Node;
import org.w3c.dom.traversal.NodeFilter;

public class NameNodeFilter implements NodeFilter {

  @Override
  public short acceptNode(Node n) {
    //System.out.println("--------------"+n.getNodeName());
    return FILTER_ACCEPT;
  }

}
