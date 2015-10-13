package plasma.fx.scene.webview.dom;

import org.w3c.dom.Node;

public interface MyElementCollection {
  int getLength();
  Node item(int index);
  Node namedItem(String name);
}
