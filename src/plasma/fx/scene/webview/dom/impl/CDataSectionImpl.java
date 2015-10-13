package plasma.fx.scene.webview.dom.impl;

import org.w3c.dom.*;

public class CDataSectionImpl extends TextImpl implements CDATASection {

  public CDataSectionImpl() {
    super();
  }

  public CDataSectionImpl(String text) {
    super(text);
  }

  @Override
  public String getNodeName() {
    return "#cdata-section";
  }

  @Override
  public short getNodeType() {
    return Node.CDATA_SECTION_NODE;
  }

}
