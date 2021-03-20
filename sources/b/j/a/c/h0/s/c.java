package b.j.a.c.h0.s;

import b.j.a.b.f;
import b.j.a.c.h0.j;
import b.j.a.c.h0.t.s0;
import b.j.a.c.k;
import b.j.a.c.y;
import java.io.Closeable;
import java.util.Objects;

public class c extends s0<Object> {
    public c(String str) {
        super(Object.class);
    }

    public void f(Object obj, f fVar, y yVar) {
        Objects.requireNonNull(yVar);
        throw new k((Closeable) ((j) yVar).x, yVar.b("Null key for a Map not allowed in JSON (use a converting NullKeySerializer?)", new Object[0]), (Throwable) null);
    }
}
