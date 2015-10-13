package plasma.fx.scene.webview.dom.impl;

import org.w3c.dom.*;

import plasma.fx.scene.webview.js.AbstractScriptableDelegate;

import java.util.*;

public class NamedNodeMapImpl extends AbstractScriptableDelegate implements NamedNodeMap {
  // Note: class must be public for reflection to work.
  private final Map<String, Node> attributes = new HashMap<String, Node>();
  private final ArrayList<Node> attributeList = new ArrayList<Node>();

  public NamedNodeMapImpl(Element owner, Map<String, String> attribs) {
    for (Map.Entry<String, String> entry : attribs.entrySet()) {
      String name = entry.getKey();
      String value = entry.getValue();
      // TODO: "specified" attributes
      Attr attr = new AttrImpl(name, value, true, owner, "ID".equals(name));
      attributes.put(name, attr);
      attributeList.add(attr);
    }
  }

  @Override
  public int getLength() {
    return attributeList.size();
  }

  @Override
  public Node getNamedItem(String name) {
    return attributes.get(name);
  }

  public Node namedItem(String name) {
    // Method needed for Javascript indexing.
    return getNamedItem(name);
  }

  @Override
  public Node getNamedItemNS(String namespaceURI, String localName) throws DOMException {
    throw new DOMException(DOMException.NOT_SUPPORTED_ERR, "No namespace support");
  }

  @Override
  public Node item(int index) {
    final int length = getLength();
    if (index >= 0 && index < length) {
      return attributeList.get(index);
    }
    return null;
  }

  @Override
  public Node removeNamedItem(String name) throws DOMException {
    return attributes.remove(name);
  }

  @Override
  public Node removeNamedItemNS(String namespaceURI, String localName) throws DOMException {
    throw new DOMException(DOMException.NOT_SUPPORTED_ERR, "No namespace support");
  }

  @Override
  public Node setNamedItem(Node arg) throws DOMException {
    Object prevValue = attributes.put(arg.getNodeName(), arg);
    if (prevValue != null) {
      attributeList.remove(prevValue);
    }
    attributeList.add(arg);
    return arg;
  }

  @Override
  public Node setNamedItemNS(Node arg) throws DOMException {
    throw new DOMException(DOMException.NOT_SUPPORTED_ERR, "No namespace support");
  }
}
