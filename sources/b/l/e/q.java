package b.l.e;

import b.l.e.e0.z.o;
import b.l.e.g0.c;
import java.io.IOException;
import java.io.StringWriter;

public abstract class q {
    public n d() {
        if (this instanceof n) {
            return (n) this;
        }
        throw new IllegalStateException("Not a JSON Array: " + this);
    }

    public t e() {
        if (this instanceof t) {
            return (t) this;
        }
        throw new IllegalStateException("Not a JSON Object: " + this);
    }

    public v l() {
        if (this instanceof v) {
            return (v) this;
        }
        throw new IllegalStateException("Not a JSON Primitive: " + this);
    }

    public long n() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public String p() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public String toString() {
        try {
            StringWriter stringWriter = new StringWriter();
            c cVar = new c(stringWriter);
            cVar.f5546m = true;
            o.X.b(cVar, this);
            return stringWriter.toString();
        } catch (IOException e2) {
            throw new AssertionError(e2);
        }
    }
}
