package n;

import java.io.Closeable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import n.m0.c;
import o.g;

public abstract class j0 implements Closeable {

    /* renamed from: h  reason: collision with root package name */
    public static final a f10126h = new a((DefaultConstructorMarker) null);

    public static final class a {
        public a(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public abstract long b();

    public void close() {
        c.d(q());
    }

    public abstract b0 e();

    public abstract g q();

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0024, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0025, code lost:
        b.q.a.a.A(r0, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0028, code lost:
        throw r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String z() {
        /*
            r3 = this;
            o.g r0 = r3.q()
            n.b0 r1 = r3.e()     // Catch:{ all -> 0x0022 }
            if (r1 == 0) goto L_0x0013
            java.nio.charset.Charset r2 = e.c0.a.a     // Catch:{ all -> 0x0022 }
            java.nio.charset.Charset r1 = r1.a(r2)     // Catch:{ all -> 0x0022 }
            if (r1 == 0) goto L_0x0013
            goto L_0x0015
        L_0x0013:
            java.nio.charset.Charset r1 = e.c0.a.a     // Catch:{ all -> 0x0022 }
        L_0x0015:
            java.nio.charset.Charset r1 = n.m0.c.r(r0, r1)     // Catch:{ all -> 0x0022 }
            java.lang.String r1 = r0.i0(r1)     // Catch:{ all -> 0x0022 }
            r2 = 0
            b.q.a.a.A(r0, r2)
            return r1
        L_0x0022:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0024 }
        L_0x0024:
            r2 = move-exception
            b.q.a.a.A(r0, r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: n.j0.z():java.lang.String");
    }
}
