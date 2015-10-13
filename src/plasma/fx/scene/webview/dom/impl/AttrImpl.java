package plasma.fx.scene.webview.dom.impl;

import org.w3c.dom.Attr;
import org.w3c.dom.DOMException;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.TypeInfo;

public class AttrImpl extends NodeImpl implements Attr {
  private String name;
  private String value;
  private boolean specified;
  private Element ownerElement;
  private boolean isId;
  
  public AttrImpl(String name, String value, boolean specified, Element owner, boolean isId) {
    super();
    this.name = name;
    this.value = value;
    this.specified = specified;
    this.ownerElement = owner;
    this.isId = isId;
  }

  public AttrImpl(String name) {
    super();
    this.name = name;
    this.value = "";
    this.specified = false;
    this.ownerElement = null;
    this.isId = false;
  }

  @Override
  public String getLocalName() {
    return this.name;
  }

  @Override
  public String getNodeName() {
    return this.name;
  }

  @Override
  public String getNodeValue() throws DOMException {
    return this.value;
  }

  @Override
  public void setNodeValue(String nodeValue) throws DOMException {
    this.value = nodeValue;
  }

  @Override
  public short getNodeType() {
    return Node.ATTRIBUTE_NODE; 
  }

  @Override
  public String getName() {
    return this.name;
  }

  @Override
  public boolean getSpecified() {
    return this.specified;
  }

  @Override
  public String getValue() {
    return this.value;
  }

  @Override
  public void setValue(String value) throws DOMException {
    this.value = value;
  }

  @Override
  public Element getOwnerElement() {
    return this.ownerElement;
  }

  @Override
  public TypeInfo getSchemaTypeInfo() {
    throw new DOMException(DOMException.NOT_SUPPORTED_ERR, "Namespaces not supported");
  }

  @Override
  public boolean isId() {
    return this.isId;
  }
  
  public void setId(boolean value) {
    this.isId = value;
  }

  @Override
  protected Node createSimilarNode() {
    return new AttrImpl(this.name, this.value, this.specified, this.ownerElement, this.isId);
  }
}
