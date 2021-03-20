package g.a.u1;

import e.a.a.a.y0.m.o1.c;
import g.a.a.r;
import g.a.x;

public final class b extends c {

    /* renamed from: n  reason: collision with root package name */
    public static final x f10013n;

    /* renamed from: o  reason: collision with root package name */
    public static final b f10014o;

    static {
        b bVar = new b();
        f10014o = bVar;
        int i2 = r.a;
        f10013n = new e(bVar, c.m0("kotlinx.coroutines.io.parallelism", 64 < i2 ? i2 : 64, 0, 0, 12, (Object) null), "Dispatchers.IO", 1);
    }

    public b() {
        super(0, 0, (String) null, 7);
    }

    public void close() {
        throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }

    public String toString() {
        return "Dispatchers.Default";
    }
}
