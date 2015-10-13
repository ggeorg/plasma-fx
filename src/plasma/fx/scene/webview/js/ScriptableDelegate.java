package plasma.fx.scene.webview.js;

import org.mozilla.javascript.Scriptable;

/**
 * Java classes used in JavaScript should implement this interface.
 * <p>
 * While all classes can be mapped to JavaScript, implementing this interface
 * ensures that the Java object proxy is not garbage collected as long as the
 * Java object is not garbage collected.
 */
public interface ScriptableDelegate {
  Scriptable getScriptable();

  void setScriptable(Scriptable scriptable);
}
