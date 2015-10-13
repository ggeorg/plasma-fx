package plasma.fx.scene.webview.style;

import plasma.fx.scene.webview.dom.impl.MyDocumentImpl;
import plasma.fx.scene.webview.dom.impl.MyElementImpl;

public class StyleSheetRenderState implements RenderState {
  protected final MyElementImpl element;
  protected final MyDocumentImpl document;

  public StyleSheetRenderState(MyDocumentImpl document) {
    this.element = null;
    this.document = document;
  }
}
