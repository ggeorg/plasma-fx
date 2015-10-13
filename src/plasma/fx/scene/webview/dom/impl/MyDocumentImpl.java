package plasma.fx.scene.webview.dom.impl;

import java.util.Map;
import java.util.WeakHashMap;

import org.w3c.dom.Attr;
import org.w3c.dom.CDATASection;
import org.w3c.dom.Comment;
import org.w3c.dom.DOMConfiguration;
import org.w3c.dom.DOMException;
import org.w3c.dom.DOMImplementation;
import org.w3c.dom.DocumentFragment;
import org.w3c.dom.DocumentType;
import org.w3c.dom.Element;
import org.w3c.dom.EntityReference;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.w3c.dom.ProcessingInstruction;
import org.w3c.dom.Text;
import org.w3c.dom.traversal.NodeFilter;
import org.w3c.dom.views.AbstractView;
import org.w3c.dom.views.DocumentView;

import plasma.fx.scene.webview.dom.MyDocument;

public class MyDocumentImpl extends NodeImpl implements MyDocument, DocumentView {
  private final ElementFactory factory;
  private final Map<String, Element> elementsById = new WeakHashMap<String, Element>();

  public MyDocumentImpl() {
    factory = ElementFactory.getInstance();

  }

  public Element getElementById(String elementId) {
    Element element;
    synchronized (treeLock) {
      element = elementsById.get(elementId);
    }
    return element;
  }

  public NodeList getElementsByName(String elementName) {
    return getNodeList(new ElementNameFilter(elementName));
  }

  private class ElementNameFilter implements NodeFilter {
    final String name;

    public ElementNameFilter(String name) {
      this.name = name;
    }

    @Override
    public short acceptNode(Node node) {
      return (node instanceof Element) && ((Element) node).getNodeName().equalsIgnoreCase(name)
          ? FILTER_ACCEPT : FILTER_REJECT;
    }
  }

}
