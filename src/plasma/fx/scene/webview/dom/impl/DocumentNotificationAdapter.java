package plasma.fx.scene.webview.dom.impl;

/**
 * An abstract implementation of {@link DocumentNotificationListener} with blank
 * methods, provided for convenience.
 */
public abstract class DocumentNotificationAdapter implements DocumentNotificationListener {
  @Override
  public void allInvalidated() {
  }

  @Override
  public void externalScriptLoading(NodeImpl node) {
  }

  @Override
  public void invalidated(NodeImpl node) {
  }

  @Override
  public void lookInvalidated(NodeImpl node) {
  }

  @Override
  public void nodeLoaded(NodeImpl node) {
  }

  @Override
  public void positionInvalidated(NodeImpl node) {
  }

  @Override
  public void sizeInvalidated(NodeImpl node) {
  }

  @Override
  public void structureInvalidated(NodeImpl node) {
  }
}