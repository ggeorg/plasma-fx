package plasma.fx.scene.webview;

import org.w3c.dom.DOMConfiguration;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.bootstrap.DOMImplementationRegistry;
import org.w3c.dom.ls.DOMImplementationLS;
import org.w3c.dom.ls.LSParser;
import org.w3c.dom.traversal.DocumentTraversal;
import org.w3c.dom.traversal.NodeFilter;
import org.w3c.dom.traversal.TreeWalker;

import plasma.fx.scene.ClutterActor;
import plasma.fx.scene.ClutterActorAlign;
import plasma.fx.scene.ClutterAlignAxis;
import plasma.fx.scene.ClutterAlignConstraint;
import plasma.fx.scene.ClutterColor;
import plasma.fx.scene.ClutterStage;
import plasma.fx.scene.layout.ClutterBinLayout;
import plasma.jna.clutter.ClutterLibrary;

import com.sun.jna.Pointer;

public class WebView extends ClutterActor { // TODO enable scroll

  public WebView() {
    super();
  }

  public void render(Document doc) {
    if (!doc.isSupported("Traversal", "2.0")) {
      throw new RuntimeException("This DOM Document does not support Traversal");
    }

    Node root = doc.getDocumentElement();

    boolean expandRefs = false;

    DocumentTraversal traversal = (DocumentTraversal) doc;

    TreeWalker treeWalker = traversal.createTreeWalker(root, NodeFilter.SHOW_ALL, new NameNodeFilter(), expandRefs);
    
    Node n = doc.createElement("lala");
    root.appendChild(n);
    
    Node thisNode = treeWalker.getCurrentNode();
    while (thisNode != null) {
      if (thisNode.getNodeType() == Node.ELEMENT_NODE) {
        System.out.print("\n" + thisNode.getNodeName() + " ");
        Element thisElement = (Element) thisNode;
        NamedNodeMap attributes = thisElement.getAttributes();
        System.out.print("(");
        for (int i = 0; i < attributes.getLength(); i++) {
          System.out.print(attributes.item(i).getNodeName() + "=\"" + attributes.item(i).getNodeValue() + "\" ");
        }
        System.out.print(") : ");
      } else if (thisNode.getNodeType() == Node.TEXT_NODE) {
        System.out.print(thisNode.getNodeValue());
      }
      thisNode = treeWalker.nextNode();
    }
    

  }

  // ---

  static LSParser builder;

  public static void main(String[] argv) {
    if (argv.length == 0) {
      System.err.println("wrong usage");
      System.exit(1);
    }

    ClutterLibrary.INSTANCE.clutter_init(0, Pointer.NULL);

    try {
      DOMImplementationRegistry registry = DOMImplementationRegistry.newInstance();
      DOMImplementationLS impl = (DOMImplementationLS) registry.getDOMImplementation("LS");

      // create DOMBuilder
      builder = impl.createLSParser(DOMImplementationLS.MODE_SYNCHRONOUS, null);

      DOMConfiguration config = builder.getDomConfig();

      // TODO Error Handler and Filter

      // set validation feature
      config.setParameter("validate", Boolean.FALSE);
      // config.setParameter("validate", Boolean.TRUE);

      // set schema language
      // config.setParameter("schema-type", "http://www.w3.org/2001/XMLSchema");
      // config.setParameter("psvi",Boolean.TRUE);
      // config.setParameter("schema-type","http://www.w3.org/TR/REC-xml");

      // set schema location
      // config.setParameter("schema-location", "personal.xsd");

      // parse document
      System.out.println("Parsing " + argv[0] + "...");
      Document doc = builder.parseURI(argv[0]);

      // set error handler on the Document
      config = doc.getDomConfig();

      // config.setParameter("error-handler", errorHandler);

      // set validation feature
      config.setParameter("validate", Boolean.FALSE);
      // config.setParameter("schema-type", "http://www.w3.org/2001/XMLSchema");
      // config.setParameter("schema-type","http://www.w3.org/TR/REC-xml");
      // config.setParameter("schema-location", "data/personal.xsd");

      // remove comments from the document
      config.setParameter("comments", Boolean.FALSE);

      System.out.println("Normalizing document... ");
      doc.normalizeDocument();

      // render it...
      ClutterStage stage = new ClutterStage();
      stage.connect(new QuitSignalHandler());
      stage.setSize(1024, 768);
      stage.setTitle("PlasmaFx Browser");
      stage.setLayoutManager(new ClutterBinLayout());
//      stage.setAlignX(ClutterActorAlign.CLUTTER_ACTOR_ALIGN_FILL);
//      stage.setAlignY(ClutterActorAlign.CLUTTER_ACTOR_ALIGN_FILL);
      stage.setResizable(true);
      stage.show();

      WebView webview = new WebView();
      webview.setBackgroundColor(ClutterColor.CYAN);
      webview.setExpandX(true);
      webview.setExpandY(true);
      webview.addConstraint(new ClutterAlignConstraint(stage, ClutterAlignAxis.CLUTTER_ALIGN_BOTH, 0.5F));
      stage.addChild(webview);

      webview.render(doc);

      ClutterLibrary.INSTANCE.clutter_main();

    } catch (Exception ex) {
      ex.printStackTrace();
    }
  }
}
