package plasma.fx.scene.webview.style;

public interface CSS2PropertiesContext {
  void informLookInvalid();
  void informSizeInvalid();
  void informPositionInvalid();
  void informInvalid();
  AbstractCSS2Properties getParentStyle();
  String getDocumentBaseURI();
}
