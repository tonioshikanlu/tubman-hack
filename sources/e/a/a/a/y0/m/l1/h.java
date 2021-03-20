package e.a.a.a.y0.m.l1;

import e.a.a.a.y0.m.i1;
import e.a.a.a.y0.m.k0;
import e.a.a.a.y0.m.n1.b;
import e.a.a.a.y0.m.n1.c;
import e.a.a.a.y0.m.v0;
import e.a.a.a.y0.m.w;
import e.a.a.a.y0.m.y0;
import e.t.o;
import e.x.c.i;
import java.util.List;

public final class h extends k0 implements c {

    /* renamed from: i  reason: collision with root package name */
    public final b f9702i;

    /* renamed from: j  reason: collision with root package name */
    public final j f9703j;

    /* renamed from: k  reason: collision with root package name */
    public final i1 f9704k;

    /* renamed from: l  reason: collision with root package name */
    public final e.a.a.a.y0.b.a1.h f9705l;

    /* renamed from: m  reason: collision with root package name */
    public final boolean f9706m;

    /* renamed from: n  reason: collision with root package name */
    public final boolean f9707n;

    public h(b bVar, j jVar, i1 i1Var, e.a.a.a.y0.b.a1.h hVar, boolean z, boolean z2) {
        i.e(bVar, "captureStatus");
        i.e(jVar, "constructor");
        i.e(hVar, "annotations");
        this.f9702i = bVar;
        this.f9703j = jVar;
        this.f9704k = i1Var;
        this.f9705l = hVar;
        this.f9706m = z;
        this.f9707n = z2;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public h(e.a.a.a.y0.m.n1.b r8, e.a.a.a.y0.m.l1.j r9, e.a.a.a.y0.m.i1 r10, e.a.a.a.y0.b.a1.h r11, boolean r12, boolean r13, int r14) {
        /*
            r7 = this;
            r0 = r14 & 8
            if (r0 == 0) goto L_0x000b
            e.a.a.a.y0.b.a1.h$a r11 = e.a.a.a.y0.b.a1.h.f7785e
            java.util.Objects.requireNonNull(r11)
            e.a.a.a.y0.b.a1.h r11 = e.a.a.a.y0.b.a1.h.a.a
        L_0x000b:
            r4 = r11
            r11 = r14 & 16
            r0 = 0
            if (r11 == 0) goto L_0x0013
            r5 = r0
            goto L_0x0014
        L_0x0013:
            r5 = r12
        L_0x0014:
            r11 = r14 & 32
            if (r11 == 0) goto L_0x001a
            r6 = r0
            goto L_0x001b
        L_0x001a:
            r6 = r13
        L_0x001b:
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: e.a.a.a.y0.m.l1.h.<init>(e.a.a.a.y0.m.n1.b, e.a.a.a.y0.m.l1.j, e.a.a.a.y0.m.i1, e.a.a.a.y0.b.a1.h, boolean, boolean, int):void");
    }

    public List<y0> V0() {
        return o.f7934h;
    }

    public v0 W0() {
        return this.f9703j;
    }

    public boolean X0() {
        return this.f9706m;
    }

    /* renamed from: f1 */
    public h d1(boolean z) {
        return new h(this.f9702i, this.f9703j, this.f9704k, this.f9705l, z, false, 32);
    }

    /* renamed from: g1 */
    public h b1(f fVar) {
        i.e(fVar, "kotlinTypeRefiner");
        b bVar = this.f9702i;
        j e2 = this.f9703j.a(fVar);
        i1 i1Var = this.f9704k;
        return new h(bVar, e2, i1Var != null ? fVar.g(i1Var).Z0() : null, this.f9705l, this.f9706m, false, 32);
    }

    /* renamed from: h1 */
    public h e1(e.a.a.a.y0.b.a1.h hVar) {
        i.e(hVar, "newAnnotations");
        return new h(this.f9702i, this.f9703j, this.f9704k, hVar, this.f9706m, false, 32);
    }

    public e.a.a.a.y0.b.a1.h k() {
        return this.f9705l;
    }

    public e.a.a.a.y0.j.y.i z() {
        e.a.a.a.y0.j.y.i c = w.c("No member resolution should be done on captured type!", true);
        i.d(c, "ErrorUtils.createErrorSc…on captured type!\", true)");
        return c;
    }
}
