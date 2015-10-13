package plasma.fx.scene.webview.style;

public class ComputedCSS2Properties extends AbstractCSS2Properties {
  public ComputedCSS2Properties(CSS2PropertiesContext context) {
    super(context);
  }

  protected void setPropertyValueLC(String lowerCaseName, String value) {
    throw new java.lang.IllegalAccessError("Style properties cannot be set in this instance.");
  }

  protected void checkSetProperty() {
    throw new java.lang.IllegalAccessError("Style properties cannot be set in this instance.");
  }
  
  public void internalSetLC(String lowerCaseName, String value) {
      // Should only be called right after creation of the CSS object.
      // Properties need to be "unimportant" otherwise they won't get overridden.
      super.setPropertyValueLCAlt(lowerCaseName, value, false);
  }
}
