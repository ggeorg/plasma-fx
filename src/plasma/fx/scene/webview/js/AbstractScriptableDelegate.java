package plasma.fx.scene.webview.js;

import org.mozilla.javascript.Scriptable;

public abstract class AbstractScriptableDelegate implements ScriptableDelegate {
  private Scriptable scriptable;

  @Override
  public Scriptable getScriptable() {
    return this.scriptable;
  }

  @Override
  public void setScriptable(Scriptable scriptable) {
    this.scriptable = scriptable;
  }
}
