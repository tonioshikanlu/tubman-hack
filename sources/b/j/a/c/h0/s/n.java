package b.j.a.c.h0.s;

import b.j.a.b.f;
import b.j.a.c.d;
import b.j.a.c.h0.h;
import b.j.a.c.h0.i;
import b.j.a.c.x;
import b.j.a.c.y;
import b.j.a.c.z.a;

@a
public class n extends b.j.a.c.h0.t.a<String[]> implements i {

    /* renamed from: m  reason: collision with root package name */
    public static final n f2075m = new n();

    /* renamed from: l  reason: collision with root package name */
    public final b.j.a.c.n<Object> f2076l;

    static {
        b.j.a.c.i0.n.f2184k.n(String.class);
    }

    public n() {
        super(String[].class);
        this.f2076l = null;
    }

    public n(n nVar, d dVar, b.j.a.c.n<?> nVar2, Boolean bool) {
        super(nVar, dVar, bool);
        this.f2076l = nVar2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0028  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x002b  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0049 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x004a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public b.j.a.c.n<?> a(b.j.a.c.y r5, b.j.a.c.d r6) {
        /*
            r4 = this;
            r0 = 0
            if (r6 == 0) goto L_0x0018
            b.j.a.c.b r1 = r5.B()
            b.j.a.c.e0.h r2 = r6.e()
            if (r2 == 0) goto L_0x0018
            java.lang.Object r1 = r1.d(r2)
            if (r1 == 0) goto L_0x0018
            b.j.a.c.n r1 = r5.N(r2, r1)
            goto L_0x0019
        L_0x0018:
            r1 = r0
        L_0x0019:
            java.lang.Class<java.lang.String[]> r2 = java.lang.String[].class
            b.j.a.a.k$a r3 = b.j.a.a.k.a.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED
            b.j.a.a.k$d r2 = r4.l(r5, r6, r2)
            if (r2 == 0) goto L_0x0028
            java.lang.Boolean r2 = r2.b(r3)
            goto L_0x0029
        L_0x0028:
            r2 = r0
        L_0x0029:
            if (r1 != 0) goto L_0x002d
            b.j.a.c.n<java.lang.Object> r1 = r4.f2076l
        L_0x002d:
            b.j.a.c.n r1 = r4.k(r5, r6, r1)
            if (r1 != 0) goto L_0x0039
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            b.j.a.c.n r1 = r5.A(r1, r6)
        L_0x0039:
            boolean r5 = b.j.a.c.j0.g.u(r1)
            if (r5 == 0) goto L_0x0040
            goto L_0x0041
        L_0x0040:
            r0 = r1
        L_0x0041:
            b.j.a.c.n<java.lang.Object> r5 = r4.f2076l
            if (r0 != r5) goto L_0x004a
            java.lang.Boolean r5 = r4.f2082k
            if (r2 != r5) goto L_0x004a
            return r4
        L_0x004a:
            b.j.a.c.h0.s.n r5 = new b.j.a.c.h0.s.n
            r5.<init>(r4, r6, r0, r2)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: b.j.a.c.h0.s.n.a(b.j.a.c.y, b.j.a.c.d):b.j.a.c.n");
    }

    public boolean d(y yVar, Object obj) {
        return ((String[]) obj).length == 0;
    }

    public void f(Object obj, f fVar, y yVar) {
        String[] strArr = (String[]) obj;
        int length = strArr.length;
        if (length != 1 || ((this.f2082k != null || !yVar.K(x.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED)) && this.f2082k != Boolean.TRUE)) {
            fVar.M0(length);
            u(strArr, fVar, yVar);
            fVar.q0();
            return;
        }
        u(strArr, fVar, yVar);
    }

    public h<?> q(b.j.a.c.f0.f fVar) {
        return this;
    }

    public b.j.a.c.n<?> t(d dVar, Boolean bool) {
        return new n(this, dVar, this.f2076l, bool);
    }

    /* renamed from: v */
    public void u(String[] strArr, f fVar, y yVar) {
        int length = strArr.length;
        if (length != 0) {
            b.j.a.c.n<Object> nVar = this.f2076l;
            int i2 = 0;
            if (nVar != null) {
                int length2 = strArr.length;
                while (i2 < length2) {
                    if (strArr[i2] == null) {
                        yVar.t(fVar);
                    } else {
                        nVar.f(strArr[i2], fVar, yVar);
                    }
                    i2++;
                }
                return;
            }
            while (i2 < length) {
                if (strArr[i2] == null) {
                    fVar.u0();
                } else {
                    fVar.Q0(strArr[i2]);
                }
                i2++;
            }
        }
    }
}
