package plasma.fx.scene.webview.dom.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.w3c.dom.DOMStringList;

public class DOMStringListImpl implements DOMStringList {
  // A collection of DOMString values
  private final List<String> sourceList;

  public DOMStringListImpl(Collection<String> sourceList) {
    this.sourceList = new ArrayList<String>(sourceList);
  }

  @Override
  public String item(int index) {
    final int length = getLength();
    if (index >= 0 && index < length) {
      return sourceList.get(index);
    }
    return null;
  }

  @Override
  public int getLength() {
    return sourceList.size();
  }

  @Override
  public boolean contains(String str) {
    return sourceList.contains(str);
  }
}
