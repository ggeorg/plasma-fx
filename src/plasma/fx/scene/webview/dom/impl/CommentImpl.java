package plasma.fx.scene.webview.dom.impl;

import org.w3c.dom.Comment;
import org.w3c.dom.DOMException;
import org.w3c.dom.Node;

public class CommentImpl extends CharacterDataImpl implements Comment {
  public CommentImpl(String text) {
    super(text);
  }

  @Override
  public String getLocalName() {
    return null;
  }

  @Override
  public String getNodeName() {
    return "#comment";
  }

  @Override
  public String getNodeValue() throws DOMException {
    return this.getTextContent();
  }

  @Override
  public void setNodeValue(String nodeValue) throws DOMException {
    this.setTextContent(nodeValue);
  }

  @Override
  public short getNodeType() {
    return Node.COMMENT_NODE;
  }

  @Override
  protected Node createSimilarNode() {
    return new CommentImpl(this.text);
  }
}