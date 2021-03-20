package e.a.a.a.y0.d.a.a0;

import e.a.a.a.y0.b.a;
import e.a.a.a.y0.b.a1.h;
import e.a.a.a.y0.b.b;
import e.a.a.a.y0.b.c1.i0;
import e.a.a.a.y0.b.c1.r;
import e.a.a.a.y0.b.k;
import e.a.a.a.y0.b.l0;
import e.a.a.a.y0.b.m0;
import e.a.a.a.y0.b.s;
import e.a.a.a.y0.b.w0;
import e.a.a.a.y0.f.d;
import e.a.a.a.y0.m.d0;
import e.j;
import java.util.List;
import java.util.Objects;

public class f extends i0 implements b {
    public static final a.C0139a<w0> L = new a();
    public b K;

    public static class a implements a.C0139a<w0> {
    }

    public enum b {
        NON_STABLE_DECLARED(false, false),
        STABLE_DECLARED(true, false),
        NON_STABLE_SYNTHESIZED(false, true),
        STABLE_SYNTHESIZED(true, true);
        

        /* renamed from: h  reason: collision with root package name */
        public final boolean f8337h;

        /* renamed from: i  reason: collision with root package name */
        public final boolean f8338i;

        /* access modifiers changed from: public */
        b(boolean z, boolean z2) {
            this.f8337h = z;
            this.f8338i = z2;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public f(k kVar, l0 l0Var, h hVar, d dVar, b.a aVar, m0 m0Var) {
        super(kVar, l0Var, hVar, dVar, aVar, m0Var);
        if (kVar == null) {
            c0(0);
            throw null;
        } else if (hVar == null) {
            c0(1);
            throw null;
        } else if (dVar == null) {
            c0(2);
            throw null;
        } else if (aVar == null) {
            c0(3);
            throw null;
        } else if (m0Var != null) {
            this.K = null;
        } else {
            c0(4);
            throw null;
        }
    }

    public static /* synthetic */ void c0(int i2) {
        String str = (i2 == 12 || i2 == 17 || i2 == 20) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[((i2 == 12 || i2 == 17 || i2 == 20) ? 2 : 3)];
        switch (i2) {
            case 1:
            case 6:
            case 15:
                objArr[0] = "annotations";
                break;
            case 2:
            case 7:
                objArr[0] = "name";
                break;
            case 3:
            case 14:
                objArr[0] = "kind";
                break;
            case 4:
            case 8:
            case 16:
                objArr[0] = "source";
                break;
            case 9:
                objArr[0] = "typeParameters";
                break;
            case 10:
                objArr[0] = "unsubstitutedValueParameters";
                break;
            case 11:
                objArr[0] = "visibility";
                break;
            case 12:
            case 17:
            case 20:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaMethodDescriptor";
                break;
            case 13:
                objArr[0] = "newOwner";
                break;
            case 18:
                objArr[0] = "enhancedValueParametersData";
                break;
            case 19:
                objArr[0] = "enhancedReturnType";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        if (i2 == 12) {
            objArr[1] = "initialize";
        } else if (i2 == 17) {
            objArr[1] = "createSubstitutedCopy";
        } else if (i2 != 20) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaMethodDescriptor";
        } else {
            objArr[1] = "enhance";
        }
        switch (i2) {
            case 5:
            case 6:
            case 7:
            case 8:
                objArr[2] = "createJavaMethod";
                break;
            case 9:
            case 10:
            case 11:
                objArr[2] = "initialize";
                break;
            case 12:
            case 17:
            case 20:
                break;
            case 13:
            case 14:
            case 15:
            case 16:
                objArr[2] = "createSubstitutedCopy";
                break;
            case 18:
            case 19:
                objArr[2] = "enhance";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        throw ((i2 == 12 || i2 == 17 || i2 == 20) ? new IllegalStateException(format) : new IllegalArgumentException(format));
    }

    public b H(d0 d0Var, List list, d0 d0Var2, j jVar) {
        e.a.a.a.y0.b.i0 i0Var;
        if (d0Var2 != null) {
            List<w0> P = b.q.a.a.P(list, n(), this);
            if (d0Var == null) {
                i0Var = null;
            } else {
                Objects.requireNonNull(h.f7785e);
                i0Var = b.q.a.a.Y(this, d0Var, h.a.a);
            }
            r.c cVar = (r.c) x();
            cVar.f(P);
            cVar.q(d0Var2);
            cVar.f8253h = i0Var;
            cVar.f8260o = true;
            cVar.f8259n = true;
            f fVar = (f) cVar.e();
            if (jVar != null) {
                fVar.X0((a.C0139a) jVar.f7906h, jVar.f7907i);
            }
            if (fVar != null) {
                return fVar;
            }
            c0(20);
            throw null;
        }
        c0(19);
        throw null;
    }

    public r K0(k kVar, s sVar, b.a aVar, d dVar, h hVar, m0 m0Var) {
        if (kVar == null) {
            c0(13);
            throw null;
        } else if (aVar == null) {
            c0(14);
            throw null;
        } else if (hVar == null) {
            c0(15);
            throw null;
        } else if (m0Var != null) {
            l0 l0Var = (l0) sVar;
            if (dVar == null) {
                dVar = getName();
            }
            f fVar = new f(kVar, l0Var, hVar, dVar, aVar, m0Var);
            b bVar = this.K;
            fVar.g1(bVar.f8337h, bVar.f8338i);
            return fVar;
        } else {
            c0(16);
            throw null;
        }
    }

    public boolean b0() {
        return this.K.f8338i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0056, code lost:
        if (r4.f9774b.a(r5) == false) goto L_0x0067;
     */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x006b A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public e.a.a.a.y0.b.c1.i0 f1(e.a.a.a.y0.b.i0 r2, e.a.a.a.y0.b.i0 r3, java.util.List<? extends e.a.a.a.y0.b.r0> r4, java.util.List<e.a.a.a.y0.b.w0> r5, e.a.a.a.y0.m.d0 r6, e.a.a.a.y0.b.v r7, e.a.a.a.y0.b.z0 r8, java.util.Map<? extends e.a.a.a.y0.b.a.C0139a<?>, ?> r9) {
        /*
            r1 = this;
            r0 = 0
            if (r4 == 0) goto L_0x00ab
            if (r5 == 0) goto L_0x00a5
            if (r8 == 0) goto L_0x009f
            super.f1(r2, r3, r4, r5, r6, r7, r8, r9)
            e.a.a.a.y0.n.j r2 = e.a.a.a.y0.n.j.f9781b
            java.lang.String r3 = "functionDescriptor"
            e.x.c.i.e(r1, r3)
            java.util.List r2 = r2.a()
            java.util.Iterator r2 = r2.iterator()
        L_0x0019:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L_0x0098
            java.lang.Object r4 = r2.next()
            e.a.a.a.y0.n.d r4 = (e.a.a.a.y0.n.d) r4
            java.util.Objects.requireNonNull(r4)
            e.x.c.i.e(r1, r3)
            e.a.a.a.y0.f.d r5 = r4.a
            r6 = 0
            r7 = 1
            if (r5 == 0) goto L_0x003f
            e.a.a.a.y0.f.d r5 = r1.getName()
            e.a.a.a.y0.f.d r8 = r4.a
            boolean r5 = e.x.c.i.a(r5, r8)
            r5 = r5 ^ r7
            if (r5 == 0) goto L_0x003f
            goto L_0x0067
        L_0x003f:
            e.c0.d r5 = r4.f9774b
            if (r5 == 0) goto L_0x0059
            e.a.a.a.y0.f.d r5 = r1.getName()
            java.lang.String r5 = r5.e()
            java.lang.String r8 = "functionDescriptor.name.asString()"
            e.x.c.i.d(r5, r8)
            e.c0.d r8 = r4.f9774b
            boolean r5 = r8.a(r5)
            if (r5 != 0) goto L_0x0059
            goto L_0x0067
        L_0x0059:
            java.util.Collection<e.a.a.a.y0.f.d> r5 = r4.c
            if (r5 == 0) goto L_0x0068
            e.a.a.a.y0.f.d r8 = r1.getName()
            boolean r5 = r5.contains(r8)
            if (r5 != 0) goto L_0x0068
        L_0x0067:
            r7 = r6
        L_0x0068:
            if (r7 != 0) goto L_0x006b
            goto L_0x0019
        L_0x006b:
            e.x.c.i.e(r1, r3)
            e.a.a.a.y0.n.b[] r2 = r4.f9775e
            int r3 = r2.length
        L_0x0071:
            if (r6 >= r3) goto L_0x0084
            r5 = r2[r6]
            java.lang.String r5 = r5.a(r1)
            if (r5 == 0) goto L_0x0081
            e.a.a.a.y0.n.c$b r2 = new e.a.a.a.y0.n.c$b
            r2.<init>(r5)
            goto L_0x009a
        L_0x0081:
            int r6 = r6 + 1
            goto L_0x0071
        L_0x0084:
            e.x.b.l<e.a.a.a.y0.b.s, java.lang.String> r2 = r4.d
            java.lang.Object r2 = r2.invoke(r1)
            java.lang.String r2 = (java.lang.String) r2
            if (r2 == 0) goto L_0x0095
            e.a.a.a.y0.n.c$b r3 = new e.a.a.a.y0.n.c$b
            r3.<init>(r2)
            r2 = r3
            goto L_0x009a
        L_0x0095:
            e.a.a.a.y0.n.c$c r2 = e.a.a.a.y0.n.c.C0227c.f9773b
            goto L_0x009a
        L_0x0098:
            e.a.a.a.y0.n.c$a r2 = e.a.a.a.y0.n.c.a.f9772b
        L_0x009a:
            boolean r2 = r2.a
            r1.s = r2
            return r1
        L_0x009f:
            r2 = 11
            c0(r2)
            throw r0
        L_0x00a5:
            r2 = 10
            c0(r2)
            throw r0
        L_0x00ab:
            r2 = 9
            c0(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: e.a.a.a.y0.d.a.a0.f.f1(e.a.a.a.y0.b.i0, e.a.a.a.y0.b.i0, java.util.List, java.util.List, e.a.a.a.y0.m.d0, e.a.a.a.y0.b.v, e.a.a.a.y0.b.z0, java.util.Map):e.a.a.a.y0.b.c1.i0");
    }

    public void g1(boolean z, boolean z2) {
        this.K = z ? z2 ? b.STABLE_SYNTHESIZED : b.STABLE_DECLARED : z2 ? b.NON_STABLE_SYNTHESIZED : b.NON_STABLE_DECLARED;
    }
}
