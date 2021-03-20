package b.l.b.a.c;

import b.l.a.c.b.a;
import b.l.b.a.d.k;
import java.io.IOException;

public class b extends k implements Cloneable {
    public c jsonFactory;

    public b clone() {
        return (b) super.clone();
    }

    public b set(String str, Object obj) {
        super.set(str, obj);
        return this;
    }

    public String toPrettyString() {
        c cVar = this.jsonFactory;
        if (cVar != null) {
            return cVar.e(this, true);
        }
        return super.toString();
    }

    public String toString() {
        c cVar = this.jsonFactory;
        if (cVar == null) {
            return super.toString();
        }
        try {
            return cVar.e(this, false);
        } catch (IOException e2) {
            a.l0(e2);
            throw null;
        }
    }
}
