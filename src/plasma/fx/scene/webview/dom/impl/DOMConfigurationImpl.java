package plasma.fx.scene.webview.dom.impl;

import java.util.*;

import org.w3c.dom.DOMConfiguration;
import org.w3c.dom.DOMException;
import org.w3c.dom.DOMStringList;

public class DOMConfigurationImpl implements DOMConfiguration {
  private final Map<String, Object> parameters = new HashMap<String, Object>();

  public DOMConfigurationImpl() {
    super();
  }

  public void setParameter(String name, Object value) throws DOMException {
    synchronized (this) {
      this.parameters.put(name, value);
    }
  }

  public Object getParameter(String name) throws DOMException {
    synchronized (this) {
      return this.parameters.get(name);
    }
  }

  public boolean canSetParameter(String name, Object value) {
    // TODO
    return true;
  }

  public DOMStringList getParameterNames() {
    synchronized (this) {
      return new DOMStringListImpl(parameters.keySet());
    }
  }
}