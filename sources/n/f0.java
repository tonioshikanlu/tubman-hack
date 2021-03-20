package n;

import java.io.File;

public final class f0 extends g0 {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ File f10096b;
    public final /* synthetic */ b0 c;

    public f0(File file, b0 b0Var) {
        this.f10096b = file;
        this.c = b0Var;
    }

    public long a() {
        return this.f10096b.length();
    }

    public b0 b() {
        return this.c;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0025, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0021, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0022, code lost:
        b.q.a.a.A(r0, r3);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void c(o.f r3) {
        /*
            r2 = this;
            java.lang.String r0 = "sink"
            e.x.c.i.e(r3, r0)
            java.io.File r0 = r2.f10096b
            java.util.logging.Logger r1 = o.p.a
            java.lang.String r1 = "$this$source"
            e.x.c.i.e(r0, r1)
            java.io.FileInputStream r1 = new java.io.FileInputStream
            r1.<init>(r0)
            o.z r0 = e.a.a.a.y0.m.o1.c.f0(r1)
            r3.n(r0)     // Catch:{ all -> 0x001f }
            r3 = 0
            b.q.a.a.A(r0, r3)
            return
        L_0x001f:
            r3 = move-exception
            throw r3     // Catch:{ all -> 0x0021 }
        L_0x0021:
            r1 = move-exception
            b.q.a.a.A(r0, r3)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: n.f0.c(o.f):void");
    }
}
