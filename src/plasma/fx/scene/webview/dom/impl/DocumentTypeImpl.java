package plasma.fx.scene.webview.dom.impl;

import org.w3c.dom.DOMException;
import org.w3c.dom.DocumentType;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;

public class DocumentTypeImpl extends NodeImpl implements DocumentType {
  private final String qualifiedName;
  private final String publicId;
  private final String systemId;

  public DocumentTypeImpl(String qname, String publicId, String systemId) {
    super();
    this.qualifiedName = qname;
    this.publicId = publicId;
    this.systemId = systemId;
  }

  @Override
  public String getLocalName() {
    return null;
  }

  @Override
  public String getNodeName() {
    return this.getName();
  }

  @Override
  public String getNodeValue() throws DOMException {
    return null;
  }

  @Override
  public void setNodeValue(String nodeValue) throws DOMException {
    // nop
  }

  @Override
  public short getNodeType() {
    return org.w3c.dom.Node.DOCUMENT_TYPE_NODE;
  }

  @Override
  public String getName() {
    return this.qualifiedName;
  }

  @Override
  public NamedNodeMap getEntities() {
    // TODO: DOCTYPE declared entities
    return null;
  }

  @Override
  public NamedNodeMap getNotations() {
    // TODO: DOCTYPE notations
    return null;
  }

  @Override
  public String getPublicId() {
    return this.publicId;
  }

  @Override
  public String getSystemId() {
    return this.systemId;
  }

  @Override
  public String getInternalSubset() {
    // TODO: DOCTYPE internal subset
    return null;
  }

  @Override
  protected Node createSimilarNode() {
    return new DocumentTypeImpl(this.qualifiedName, this.publicId, this.systemId);
  }
}