package b.l.b.a.b;

import b.l.c.b.n;
import com.google.api.client.http.HttpHeaders;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Level;
import java.util.logging.Logger;
import l.b.c.m;
import l.b.c.o;
import l.b.c.v;
import l.b.c.x;
import l.b.c.y.a;
import l.b.c.y.b;
import l.b.c.z.a;

public class m {
    public static final Logger a = Logger.getLogger(m.class.getName());

    /* renamed from: b  reason: collision with root package name */
    public static final String f4744b = b.e.a.a.a.e(f.class, b.e.a.a.a.y("Sent."), ".execute");
    public static final v c = x.f8153b.b();
    public static final AtomicLong d = new AtomicLong();

    /* renamed from: e  reason: collision with root package name */
    public static volatile boolean f4745e = true;
    public static volatile l.b.c.z.a f;

    /* renamed from: g  reason: collision with root package name */
    public static volatile a.C0164a f4746g;

    public static class a extends a.C0164a<HttpHeaders> {
    }

    static {
        f = null;
        f4746g = null;
        try {
            f = new l.b.b.a.a.a();
            f4746g = new a();
        } catch (Exception e2) {
            a.log(Level.WARNING, "Cannot initialize default OpenCensus HTTP propagation text format.", e2);
        }
        try {
            b bVar = ((a.b) x.f8153b.a()).a;
            n D = n.D(f4744b);
            b.C0163b bVar2 = (b.C0163b) bVar;
            Objects.requireNonNull(bVar2);
            b.q.a.a.x(D, "spanNames");
            synchronized (bVar2.a) {
                bVar2.a.addAll(D);
            }
        } catch (Exception e3) {
            a.log(Level.WARNING, "Cannot register default OpenCensus span names for collection.", e3);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0059  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0060  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static l.b.c.l a(java.lang.Integer r4) {
        /*
            l.b.c.l r0 = l.b.c.l.a
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r1 = 0
            if (r4 != 0) goto L_0x0008
            goto L_0x0035
        L_0x0008:
            int r2 = r4.intValue()
            r3 = 200(0xc8, float:2.8E-43)
            if (r2 < r3) goto L_0x0016
            r3 = 300(0x12c, float:4.2E-43)
            if (r2 >= r3) goto L_0x0016
            r2 = 1
            goto L_0x0017
        L_0x0016:
            r2 = r1
        L_0x0017:
            if (r2 != 0) goto L_0x004a
            int r4 = r4.intValue()
            r2 = 400(0x190, float:5.6E-43)
            if (r4 == r2) goto L_0x0047
            r2 = 401(0x191, float:5.62E-43)
            if (r4 == r2) goto L_0x0044
            r2 = 403(0x193, float:5.65E-43)
            if (r4 == r2) goto L_0x0041
            r2 = 404(0x194, float:5.66E-43)
            if (r4 == r2) goto L_0x003e
            r2 = 412(0x19c, float:5.77E-43)
            if (r4 == r2) goto L_0x003b
            r2 = 500(0x1f4, float:7.0E-43)
            if (r4 == r2) goto L_0x0038
        L_0x0035:
            l.b.c.r r4 = l.b.c.r.f8131e
            goto L_0x004c
        L_0x0038:
            l.b.c.r r4 = l.b.c.r.f8136k
            goto L_0x004c
        L_0x003b:
            l.b.c.r r4 = l.b.c.r.f8135j
            goto L_0x004c
        L_0x003e:
            l.b.c.r r4 = l.b.c.r.f8132g
            goto L_0x004c
        L_0x0041:
            l.b.c.r r4 = l.b.c.r.f8133h
            goto L_0x004c
        L_0x0044:
            l.b.c.r r4 = l.b.c.r.f8134i
            goto L_0x004c
        L_0x0047:
            l.b.c.r r4 = l.b.c.r.f
            goto L_0x004c
        L_0x004a:
            l.b.c.r r4 = l.b.c.r.d
        L_0x004c:
            if (r0 != 0) goto L_0x0051
            java.lang.String r0 = " sampleToLocalSpanStore"
            goto L_0x0053
        L_0x0051:
            java.lang.String r0 = ""
        L_0x0053:
            boolean r2 = r0.isEmpty()
            if (r2 == 0) goto L_0x0060
            l.b.c.c r0 = new l.b.c.c
            r2 = 0
            r0.<init>(r1, r4, r2)
            return r0
        L_0x0060:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r1 = "Missing required properties:"
            java.lang.String r0 = b.e.a.a.a.m(r1, r0)
            r4.<init>(r0)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: b.l.b.a.b.m.a(java.lang.Integer):l.b.c.l");
    }

    public static void b(o oVar, long j2, m.b bVar) {
        b.l.a.c.b.a.o(oVar != null, "span should not be null.");
        if (j2 < 0) {
            j2 = 0;
        }
        m.a a2 = l.b.c.m.a(bVar, d.getAndIncrement());
        a2.b(j2);
        oVar.a(a2.a());
    }
}
