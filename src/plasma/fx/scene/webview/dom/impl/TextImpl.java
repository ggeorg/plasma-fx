package plasma.fx.scene.webview.dom.impl;

import org.w3c.dom.*;

public class TextImpl extends CharacterDataImpl implements Text {
  public TextImpl() {
    this("");
  }

  public TextImpl(String text) {
    this.text = text;
  }

  /*
   * (non-Javadoc)
   * 
   * @see org.w3c.dom.html2.Text#isElementContentWhitespace()
   */
  @Override
  public boolean isElementContentWhitespace() {
    String t = this.text;
    return t == null || t.trim().equals("");
  }

  /*
   * (non-Javadoc)
   * 
   * @see org.w3c.dom.html2.Text#replaceWholeText(java.lang.String)
   */
  @Override
  public Text replaceWholeText(String content) throws DOMException {
    NodeImpl parent = (NodeImpl) this.getParentNode();
    if (parent == null) {
      throw new DOMException(DOMException.HIERARCHY_REQUEST_ERR, "Text node has no parent");
    }
    return parent.replaceAdjacentTextNodes(this, content);
  }

  /*
   * (non-Javadoc)
   * 
   * @see org.w3c.dom.html2.Text#splitText(int)
   */
  @Override
  public Text splitText(int offset) throws DOMException {
    NodeImpl parent = (NodeImpl) this.getParentNode();
    if (parent == null) {
      throw new DOMException(DOMException.HIERARCHY_REQUEST_ERR, "Text node has no parent");
    }
    String t = this.text;
    if (offset < 0 || offset > t.length()) {
      throw new DOMException(DOMException.INDEX_SIZE_ERR, "Bad offset: " + offset);
    }
    String content1 = t.substring(0, offset);
    String content2 = t.substring(offset);
    this.text = content1;
    TextImpl newNode = new TextImpl(content2);
    newNode.setOwnerDocument(this.document);
    return (Text) parent.insertAfter(newNode, this);
  }

  /*
   * (non-Javadoc)
   * 
   * @see org.w3c.dom.html2.Text#getwholeText()
   */
  @Override
  public String getWholeText() {
    NodeImpl parent = (NodeImpl) this.getParentNode();
    if (parent == null) {
      throw new DOMException(DOMException.HIERARCHY_REQUEST_ERR, "Text node has no parent");
    }
    return parent.getTextContent();
  }

  /*
   * (non-Javadoc)
   * 
   * @see org.xamjwg.html.domimpl.NodeImpl#getlocalName()
   */
  @Override
  public String getLocalName() {
    return null;
  }

  /*
   * (non-Javadoc)
   * 
   * @see org.xamjwg.html.domimpl.NodeImpl#getnodeName()
   */
  @Override
  public String getNodeName() {
    return "#text";
  }

  /*
   * (non-Javadoc)
   * 
   * @see org.xamjwg.html.domimpl.NodeImpl#getnodeType()
   */
  @Override
  public short getNodeType() {
    return Node.TEXT_NODE;
  }

  /*
   * (non-Javadoc)
   * 
   * @see org.xamjwg.html.domimpl.NodeImpl#getnodeValue()
   */
  @Override
  public String getNodeValue() throws DOMException {
    return this.text;
  }

  /*
   * (non-Javadoc)
   * 
   * @see org.xamjwg.html.domimpl.NodeImpl#setnodeValue(java.lang.String)
   */
  @Override
  public void setNodeValue(String nodeValue) throws DOMException {
    this.text = nodeValue;
  }

  @Override
  public void setTextContent(String textContent) throws DOMException {
    this.text = textContent;
  }

  @Override
  protected Node createSimilarNode() {
    return new TextImpl(this.text);
  }

  @Override
  public String toString() {
    String text = this.text;
    int textLength = text == null ? 0 : text.length();
    return "#text[length=" + textLength + ",value=\"" + text.substring(0, 64) + "\",renderState=" + getRenderState() + "]";
  }
}
