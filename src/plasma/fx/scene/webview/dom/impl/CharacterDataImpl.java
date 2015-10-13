package plasma.fx.scene.webview.dom.impl;

import org.w3c.dom.CharacterData;
import org.w3c.dom.DOMException;
import org.w3c.dom.Node;

public abstract class CharacterDataImpl extends NodeImpl implements CharacterData {
  protected volatile String text;

  public CharacterDataImpl() {
    super();
  }

  public CharacterDataImpl(String text) {
    this.text = text;
  }

  public String getClassName() {
    return "HTMLCharacterData";
  }

  @Override
  public String getTextContent() throws DOMException {
    return this.text;
  }

  @Override
  public void setTextContent(String textContent) throws DOMException {
    this.text = textContent;
    if (!this.notificationsSuspended) {
      this.informInvalid();
    }
  }

  @Override
  public Node cloneNode(boolean deep) {
    CharacterDataImpl newNode = (CharacterDataImpl) super.cloneNode(deep);
    newNode.setData(this.getData());
    return newNode;
  }

  @Override
  public void appendData(String arg) throws DOMException {
    this.text += arg;
    if (!this.notificationsSuspended) {
      this.informInvalid();
    }
  }

  @Override
  public void deleteData(int offset, int count)
      throws DOMException {
    StringBuffer buffer = new StringBuffer(this.text);
    StringBuffer result = buffer.delete(offset, offset + count);
    this.text = result.toString();
    if (!this.notificationsSuspended) {
      this.informInvalid();
    }
  }

  @Override
  public String getData() throws DOMException {
    return this.text;
  }

  @Override
  public int getLength() {
    return this.text.length();
  }

  @Override
  public void insertData(int offset, String arg)
      throws DOMException {
    StringBuffer buffer = new StringBuffer(this.text);
    StringBuffer result = buffer.insert(offset, arg);
    this.text = result.toString();
    if (!this.notificationsSuspended) {
      this.informInvalid();
    }
  }

  @Override
  public void replaceData(int offset, int count, String arg)
      throws DOMException {
    StringBuffer buffer = new StringBuffer(this.text);
    StringBuffer result = buffer.replace(offset, offset + count, arg);
    this.text = result.toString();
    if (!this.notificationsSuspended) {
      this.informInvalid();
    }
  }

  @Override
  public void setData(String data) throws DOMException {
    this.text = data;
    if (!this.notificationsSuspended) {
      this.informInvalid();
    }
  }

  @Override
  public String substringData(int offset, int count)
      throws DOMException {
    return this.text.substring(offset, offset + count);
  }

  @Override
  public String toString() {
    String someText = this.text;
    int length = someText.length();
    if (someText != null && someText.length() > 32) {
      someText = someText.substring(0, 29) + "...";
    }
    return this.getNodeName() + "[length=" + length + ",text=" + someText + "]";
  }

}