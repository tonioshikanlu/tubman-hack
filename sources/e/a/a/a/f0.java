package e.a.a.a;

import e.a.a.a.c0;
import e.a.a.a.x0.i;
import e.x.b.l;
import e.x.c.k;
import java.lang.reflect.Field;

public final class f0 extends k implements l<Field, i<? extends Field>> {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ c0.a f7527h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ boolean f7528i;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ e0 f7529j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ d0 f7530k;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public f0(c0.a aVar, boolean z, e0 e0Var, d0 d0Var) {
        super(1);
        this.f7527h = aVar;
        this.f7528i = z;
        this.f7529j = e0Var;
        this.f7530k = d0Var;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0030, code lost:
        if (e.a.a.a.y0.j.g.m(r1) == false) goto L_0x0042;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x003e, code lost:
        if (e.a.a.a.y0.e.a0.b.h.d(((e.a.a.a.y0.k.b.g0.j) r0).H) != false) goto L_0x0042;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final e.a.a.a.x0.i<java.lang.reflect.Field> invoke(java.lang.reflect.Field r5) {
        /*
            r4 = this;
            java.lang.String r0 = "field"
            e.x.c.i.e(r5, r0)
            e.a.a.a.c0$a r0 = r4.f7527h
            e.a.a.a.c0 r0 = r0.H()
            e.a.a.a.y0.b.f0 r0 = r0.D()
            e.a.a.a.y0.b.k r1 = r0.b()
            java.lang.String r2 = "containingDeclaration"
            e.x.c.i.d(r1, r2)
            boolean r2 = e.a.a.a.y0.j.g.p(r1)
            if (r2 != 0) goto L_0x001f
            goto L_0x0041
        L_0x001f:
            e.a.a.a.y0.b.k r1 = r1.b()
            e.a.a.a.y0.b.f r2 = e.a.a.a.y0.b.f.INTERFACE
            boolean r2 = e.a.a.a.y0.j.g.s(r1, r2)
            r3 = 1
            if (r2 != 0) goto L_0x0032
            boolean r1 = e.a.a.a.y0.j.g.m(r1)
            if (r1 == 0) goto L_0x0042
        L_0x0032:
            boolean r1 = r0 instanceof e.a.a.a.y0.k.b.g0.j
            if (r1 == 0) goto L_0x0041
            e.a.a.a.y0.k.b.g0.j r0 = (e.a.a.a.y0.k.b.g0.j) r0
            e.a.a.a.y0.e.n r0 = r0.H
            boolean r0 = e.a.a.a.y0.e.a0.b.h.d(r0)
            if (r0 == 0) goto L_0x0041
            goto L_0x0042
        L_0x0041:
            r3 = 0
        L_0x0042:
            if (r3 != 0) goto L_0x00a7
            int r0 = r5.getModifiers()
            boolean r0 = java.lang.reflect.Modifier.isStatic(r0)
            if (r0 != 0) goto L_0x004f
            goto L_0x00a7
        L_0x004f:
            e.a.a.a.d0 r0 = r4.f7530k
            boolean r0 = r0.a()
            if (r0 == 0) goto L_0x0091
            boolean r0 = r4.f7528i
            if (r0 == 0) goto L_0x0071
            e.a.a.a.c0$a r0 = r4.f7527h
            boolean r0 = r0.F()
            if (r0 == 0) goto L_0x006a
            e.a.a.a.x0.i$e$b r0 = new e.a.a.a.x0.i$e$b
            r0.<init>(r5)
            goto L_0x00ea
        L_0x006a:
            e.a.a.a.x0.i$e$d r0 = new e.a.a.a.x0.i$e$d
            r0.<init>(r5)
            goto L_0x00ea
        L_0x0071:
            e.a.a.a.c0$a r0 = r4.f7527h
            boolean r0 = r0.F()
            if (r0 == 0) goto L_0x0085
            e.a.a.a.x0.i$f$b r0 = new e.a.a.a.x0.i$f$b
            e.a.a.a.e0 r1 = r4.f7529j
            boolean r1 = r1.a()
            r0.<init>(r5, r1)
            goto L_0x00ea
        L_0x0085:
            e.a.a.a.x0.i$f$d r0 = new e.a.a.a.x0.i$f$d
            e.a.a.a.e0 r1 = r4.f7529j
            boolean r1 = r1.a()
            r0.<init>(r5, r1)
            goto L_0x00ea
        L_0x0091:
            boolean r0 = r4.f7528i
            if (r0 == 0) goto L_0x009b
            e.a.a.a.x0.i$e$e r0 = new e.a.a.a.x0.i$e$e
            r0.<init>(r5)
            goto L_0x00ea
        L_0x009b:
            e.a.a.a.x0.i$f$e r0 = new e.a.a.a.x0.i$f$e
            e.a.a.a.e0 r1 = r4.f7529j
            boolean r1 = r1.a()
            r0.<init>(r5, r1)
            goto L_0x00ea
        L_0x00a7:
            boolean r0 = r4.f7528i
            if (r0 == 0) goto L_0x00c5
            e.a.a.a.c0$a r0 = r4.f7527h
            boolean r0 = r0.F()
            if (r0 == 0) goto L_0x00bf
            e.a.a.a.x0.i$e$a r0 = new e.a.a.a.x0.i$e$a
            e.a.a.a.c0$a r1 = r4.f7527h
            java.lang.Object r1 = b.q.a.a.A0(r1)
            r0.<init>(r5, r1)
            goto L_0x00ea
        L_0x00bf:
            e.a.a.a.x0.i$e$c r0 = new e.a.a.a.x0.i$e$c
            r0.<init>(r5)
            goto L_0x00ea
        L_0x00c5:
            e.a.a.a.c0$a r0 = r4.f7527h
            boolean r0 = r0.F()
            if (r0 == 0) goto L_0x00df
            e.a.a.a.x0.i$f$a r0 = new e.a.a.a.x0.i$f$a
            e.a.a.a.e0 r1 = r4.f7529j
            boolean r1 = r1.a()
            e.a.a.a.c0$a r2 = r4.f7527h
            java.lang.Object r2 = b.q.a.a.A0(r2)
            r0.<init>(r5, r1, r2)
            goto L_0x00ea
        L_0x00df:
            e.a.a.a.x0.i$f$c r0 = new e.a.a.a.x0.i$f$c
            e.a.a.a.e0 r1 = r4.f7529j
            boolean r1 = r1.a()
            r0.<init>(r5, r1)
        L_0x00ea:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: e.a.a.a.f0.invoke(java.lang.reflect.Field):e.a.a.a.x0.i");
    }
}
