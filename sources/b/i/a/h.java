package b.i.a;

import org.xml.sax.SAXException;

public class h extends SAXException {
    public h(String str) {
        super(str);
    }

    public h(String str, Exception exc) {
        super(str, exc);
    }
}
