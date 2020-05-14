import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.SAXParserFactory;
import javax.xml.transform.dom.DOMSource;

import org.w3c.dom.Document;
import org.xml.sax.InputSource;
public class SomeClass {
    public void test() {
        String xml = "xxe.xml";
DocumentBuilderFactory df = DocumentBuilderFactory.newInstance();  // Noncompliant
DocumentBuilder builder = df.newDocumentBuilder();
Document document = builder.parse(new InputSource(xml));
DOMSource domSource = new DOMSource(document);

    }
}