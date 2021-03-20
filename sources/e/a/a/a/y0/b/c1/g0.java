package e.a.a.a.y0.b.c1;

import e.a.a.a.y0.b.a1.h;
import e.a.a.a.y0.b.h0;
import e.a.a.a.y0.b.m;
import e.a.a.a.y0.b.m0;
import e.a.a.a.y0.b.w0;
import e.a.a.a.y0.f.d;
import e.a.a.a.y0.j.v.b;
import e.a.a.a.y0.m.d0;
import e.a.a.a.y0.m.k0;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class g0 extends d0 implements h0 {
    public w0 t;
    public final h0 u;

    /* JADX WARNING: type inference failed for: r21v0, types: [e.a.a.a.y0.b.h0] */
    /* JADX WARNING: Illegal instructions before constructor call */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public g0(e.a.a.a.y0.b.f0 r13, e.a.a.a.y0.b.a1.h r14, e.a.a.a.y0.b.v r15, e.a.a.a.y0.b.z0 r16, boolean r17, boolean r18, boolean r19, e.a.a.a.y0.b.b.a r20, e.a.a.a.y0.b.h0 r21, e.a.a.a.y0.b.m0 r22) {
        /*
            r12 = this;
            r0 = 0
            if (r14 == 0) goto L_0x005b
            if (r15 == 0) goto L_0x0055
            if (r16 == 0) goto L_0x004f
            if (r20 == 0) goto L_0x0049
            if (r22 == 0) goto L_0x0043
            java.lang.String r0 = "<set-"
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
        throw new UnsupportedOperationException("Method not decompiled: e.a.a.a.y0.b.c1.g0.<init>(e.a.a.a.y0.b.f0, e.a.a.a.y0.b.a1.h, e.a.a.a.y0.b.v, e.a.a.a.y0.b.z0, boolean, boolean, boolean, e.a.a.a.y0.b.b$a, e.a.a.a.y0.b.h0, e.a.a.a.y0.b.m0):void");
    }

    public static n0 P0(h0 h0Var, d0 d0Var, h hVar) {
        if (h0Var == null) {
            c0(7);
            throw null;
        } else if (d0Var == null) {
            c0(8);
            throw null;
        } else if (hVar != null) {
            return new n0(h0Var, (w0) null, 0, hVar, d.n("<set-?>"), d0Var, false, false, false, (d0) null, m0.a);
        } else {
            c0(9);
            throw null;
        }
    }

    public static /* synthetic */ void c0(int i2) {
        String str;
        int i3;
        Throwable th;
        switch (i2) {
            case 10:
            case 11:
            case 12:
            case 13:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i2) {
            case 10:
            case 11:
            case 12:
            case 13:
                i3 = 2;
                break;
            default:
                i3 = 3;
                break;
        }
        Object[] objArr = new Object[i3];
        switch (i2) {
            case 1:
            case 9:
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
                objArr[0] = "parameter";
                break;
            case 7:
                objArr[0] = "setterDescriptor";
                break;
            case 8:
                objArr[0] = "type";
                break;
            case 10:
            case 11:
            case 12:
            case 13:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertySetterDescriptorImpl";
                break;
            default:
                objArr[0] = "correspondingProperty";
                break;
        }
        switch (i2) {
            case 10:
                objArr[1] = "getOverriddenDescriptors";
                break;
            case 11:
                objArr[1] = "getValueParameters";
                break;
            case 12:
                objArr[1] = "getReturnType";
                break;
            case 13:
                objArr[1] = "getOriginal";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertySetterDescriptorImpl";
                break;
        }
        switch (i2) {
            case 6:
                objArr[2] = "initialize";
                break;
            case 7:
            case 8:
            case 9:
                objArr[2] = "createSetterParameter";
                break;
            case 10:
            case 11:
            case 12:
            case 13:
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        switch (i2) {
            case 10:
            case 11:
            case 12:
            case 13:
                th = new IllegalStateException(format);
                break;
            default:
                th = new IllegalArgumentException(format);
                break;
        }
        throw th;
    }

    /* renamed from: R0 */
    public h0 w0() {
        h0 h0Var = this.u;
        if (h0Var != null) {
            return h0Var;
        }
        c0(13);
        throw null;
    }

    public void V0(w0 w0Var) {
        if (w0Var != null) {
            this.t = w0Var;
        } else {
            c0(6);
            throw null;
        }
    }

    public d0 f() {
        k0 y = b.f(this).y();
        if (y != null) {
            return y;
        }
        c0(12);
        throw null;
    }

    public Collection<? extends h0> g() {
        return K0(false);
    }

    public <R, D> R l0(m<R, D> mVar, D d) {
        return mVar.f(this, d);
    }

    public List<w0> n() {
        w0 w0Var = this.t;
        if (w0Var != null) {
            List<w0> singletonList = Collections.singletonList(w0Var);
            if (singletonList != null) {
                return singletonList;
            }
            c0(11);
            throw null;
        }
        throw new IllegalStateException();
    }
}
