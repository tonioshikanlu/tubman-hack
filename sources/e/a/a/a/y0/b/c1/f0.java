package e.a.a.a.y0.b.c1;

import e.a.a.a.y0.b.g0;
import e.a.a.a.y0.b.m;
import e.a.a.a.y0.b.w0;
import e.a.a.a.y0.m.d0;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class f0 extends d0 implements g0 {
    public d0 t;
    public final g0 u;

    /* JADX WARNING: type inference failed for: r21v0, types: [e.a.a.a.y0.b.g0] */
    /* JADX WARNING: Illegal instructions before constructor call */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public f0(e.a.a.a.y0.b.f0 r13, e.a.a.a.y0.b.a1.h r14, e.a.a.a.y0.b.v r15, e.a.a.a.y0.b.z0 r16, boolean r17, boolean r18, boolean r19, e.a.a.a.y0.b.b.a r20, e.a.a.a.y0.b.g0 r21, e.a.a.a.y0.b.m0 r22) {
        /*
            r12 = this;
            r0 = 0
            if (r14 == 0) goto L_0x005b
            if (r15 == 0) goto L_0x0055
            if (r16 == 0) goto L_0x004f
            if (r20 == 0) goto L_0x0049
            if (r22 == 0) goto L_0x0043
            java.lang.String r0 = "<get-"
            java.lang.StringBuilder r0 = b.e.a.a.a.y(r0)
            e.a.a.a.y0.f.d r1 = r13.getName()
            r0.append(r1)
            java.lang.String r1 = ">"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            e.a.a.a.y0.f.d r6 = e.a.a.a.y0.f.d.n(r0)
            r1 = r12
            r2 = r15
            r3 = r16
            r4 = r13
            r5 = r14
            r7 = r17
            r8 = r18
            r9 = r19
            r10 = r20
            r11 = r22
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            if (r21 == 0) goto L_0x003e
            r1 = r12
            r0 = r21
            goto L_0x0040
        L_0x003e:
            r0 = r12
            r1 = r0
        L_0x0040:
            r1.u = r0
            return
        L_0x0043:
            r1 = r12
            r2 = 5
            c0(r2)
            throw r0
        L_0x0049:
            r1 = r12
            r2 = 4
            c0(r2)
            throw r0
        L_0x004f:
            r1 = r12
            r2 = 3
            c0(r2)
            throw r0
        L_0x0055:
            r1 = r12
            r2 = 2
            c0(r2)
            throw r0
        L_0x005b:
            r1 = r12
            r2 = 1
            c0(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: e.a.a.a.y0.b.c1.f0.<init>(e.a.a.a.y0.b.f0, e.a.a.a.y0.b.a1.h, e.a.a.a.y0.b.v, e.a.a.a.y0.b.z0, boolean, boolean, boolean, e.a.a.a.y0.b.b$a, e.a.a.a.y0.b.g0, e.a.a.a.y0.b.m0):void");
    }

    public static /* synthetic */ void c0(int i2) {
        String str = (i2 == 6 || i2 == 7 || i2 == 8) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[((i2 == 6 || i2 == 7 || i2 == 8) ? 2 : 3)];
        switch (i2) {
            case 1:
                objArr[0] = "annotations";
                break;
            case 2:
                objArr[0] = "modality";
                break;
            case 3:
                objArr[0] = "visibility";
                break;
            case 4:
                objArr[0] = "kind";
                break;
            case 5:
                objArr[0] = "source";
                break;
            case 6:
            case 7:
            case 8:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyGetterDescriptorImpl";
                break;
            default:
                objArr[0] = "correspondingProperty";
                break;
        }
        if (i2 == 6) {
            objArr[1] = "getOverriddenDescriptors";
        } else if (i2 == 7) {
            objArr[1] = "getValueParameters";
        } else if (i2 != 8) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyGetterDescriptorImpl";
        } else {
            objArr[1] = "getOriginal";
        }
        if (!(i2 == 6 || i2 == 7 || i2 == 8)) {
            objArr[2] = "<init>";
        }
        String format = String.format(str, objArr);
        throw ((i2 == 6 || i2 == 7 || i2 == 8) ? new IllegalStateException(format) : new IllegalArgumentException(format));
    }

    /* renamed from: P0 */
    public g0 w0() {
        g0 g0Var = this.u;
        if (g0Var != null) {
            return g0Var;
        }
        c0(8);
        throw null;
    }

    public void R0(d0 d0Var) {
        if (d0Var == null) {
            d0Var = z0().d();
        }
        this.t = d0Var;
    }

    public d0 f() {
        return this.t;
    }

    public Collection<? extends g0> g() {
        return K0(true);
    }

    public <R, D> R l0(m<R, D> mVar, D d) {
        return mVar.b(this, d);
    }

    public List<w0> n() {
        List<w0> emptyList = Collections.emptyList();
        if (emptyList != null) {
            return emptyList;
        }
        c0(7);
        throw null;
    }
}
