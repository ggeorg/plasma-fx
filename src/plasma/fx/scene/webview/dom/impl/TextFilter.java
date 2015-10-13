package plasma.fx.scene.webview.dom.impl;

import org.w3c.dom.Node;
import org.w3c.dom.traversal.NodeFilter;

public class TextFilter implements NodeFilter {

  @Override
  public short acceptNode(Node node) {
    return node instanceof org.w3c.dom.Text ? NodeFilter.FILTER_ACCEPT : FILTER_REJECT;
  }

}
