package b.j.a.c.h0.t;

import b.j.a.b.f;
import b.j.a.b.l;
import b.j.a.b.v.b;
import b.j.a.c.h0.i;
import b.j.a.c.y;
import java.net.InetAddress;

public class p extends r0<InetAddress> implements i {

    /* renamed from: j  reason: collision with root package name */
    public final boolean f2127j;

    public p() {
        super(InetAddress.class);
        this.f2127j = false;
    }

    public p(boolean z) {
        super(InetAddress.class);
        this.f2127j = z;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x001b  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0021 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public b.j.a.c.n<?> a(b.j.a.c.y r2, b.j.a.c.d r3) {
        /*
            r1 = this;
            java.lang.Class<T> r0 = r1.f2137h
            b.j.a.a.k$d r2 = r1.l(r2, r3, r0)
            if (r2 == 0) goto L_0x0016
            b.j.a.a.k$c r2 = r2.f1327i
            boolean r3 = r2.d()
            if (r3 != 0) goto L_0x0014
            b.j.a.a.k$c r3 = b.j.a.a.k.c.ARRAY
            if (r2 != r3) goto L_0x0016
        L_0x0014:
            r2 = 1
            goto L_0x0017
        L_0x0016:
            r2 = 0
        L_0x0017:
            boolean r3 = r1.f2127j
            if (r2 == r3) goto L_0x0021
            b.j.a.c.h0.t.p r3 = new b.j.a.c.h0.t.p
            r3.<init>(r2)
            return r3
        L_0x0021:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: b.j.a.c.h0.t.p.a(b.j.a.c.y, b.j.a.c.d):b.j.a.c.n");
    }

    public /* bridge */ /* synthetic */ void f(Object obj, f fVar, y yVar) {
        q((InetAddress) obj, fVar);
    }

    public void g(Object obj, f fVar, y yVar, b.j.a.c.f0.f fVar2) {
        InetAddress inetAddress = (InetAddress) obj;
        b d = fVar2.d(inetAddress, l.VALUE_STRING);
        d.f1539b = InetAddress.class;
        b e2 = fVar2.e(fVar, d);
        q(inetAddress, fVar);
        fVar2.f(fVar, e2);
    }

    public void q(InetAddress inetAddress, f fVar) {
        String str;
        if (this.f2127j) {
            str = inetAddress.getHostAddress();
        } else {
            str = inetAddress.toString().trim();
            int indexOf = str.indexOf(47);
            if (indexOf >= 0) {
                str = indexOf == 0 ? str.substring(1) : str.substring(0, indexOf);
            }
        }
        fVar.Q0(str);
    }
}
