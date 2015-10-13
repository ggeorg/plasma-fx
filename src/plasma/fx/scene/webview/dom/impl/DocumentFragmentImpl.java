package plasma.fx.scene.webview.dom.impl;

import org.w3c.dom.DOMException;
import org.w3c.dom.DocumentFragment;
import org.w3c.dom.Node;

public class DocumentFragmentImpl extends NodeImpl implements DocumentFragment {
  public DocumentFragmentImpl() {
    super();
  }

  @Override
  public String getLocalName() {
    return null;
  }

  @Override
  public String getNodeName() {
    return "#document-fragment";
  }

  @Override
  public String getNodeValue() throws DOMException {
    return null;
  }

  @Override
  public void setNodeValue(String nodeValue) throws DOMException {
  }

  @Override
  public short getNodeType() {
    return org.w3c.dom.Node.DOCUMENT_FRAGMENT_NODE;
  }

  @Override
  protected Node createSimilarNode() {
    return new DocumentFragmentImpl();
  }
}