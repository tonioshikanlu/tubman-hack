package e.a.a.a.y0.b.c1;

import e.a.a.a.y0.b.a;
import e.a.a.a.y0.b.a1.h;
import e.a.a.a.y0.b.b;
import e.a.a.a.y0.b.e0;
import e.a.a.a.y0.b.f0;
import e.a.a.a.y0.b.i0;
import e.a.a.a.y0.b.k;
import e.a.a.a.y0.b.m0;
import e.a.a.a.y0.b.r0;
import e.a.a.a.y0.b.s;
import e.a.a.a.y0.b.v;
import e.a.a.a.y0.b.z0;
import e.a.a.a.y0.f.d;
import e.a.a.a.y0.m.d1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public abstract class d0 extends n implements e0 {

    /* renamed from: l  reason: collision with root package name */
    public boolean f8175l;

    /* renamed from: m  reason: collision with root package name */
    public final boolean f8176m;

    /* renamed from: n  reason: collision with root package name */
    public final v f8177n;

    /* renamed from: o  reason: collision with root package name */
    public final f0 f8178o;

    /* renamed from: p  reason: collision with root package name */
    public final boolean f8179p;

    /* renamed from: q  reason: collision with root package name */
    public final b.a f8180q;
    public z0 r;
    public s s;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d0(v vVar, z0 z0Var, f0 f0Var, h hVar, d dVar, boolean z, boolean z2, boolean z3, b.a aVar, m0 m0Var) {
        super(f0Var.b(), hVar, dVar, m0Var);
        if (vVar == null) {
            c0(0);
            throw null;
        } else if (z0Var == null) {
            c0(1);
            throw null;
        } else if (hVar == null) {
            c0(3);
            throw null;
        } else if (m0Var != null) {
            this.s = null;
            this.f8177n = vVar;
            this.r = z0Var;
            this.f8178o = f0Var;
            this.f8175l = z;
            this.f8176m = z2;
            this.f8179p = z3;
            this.f8180q = aVar;
        } else {
            c0(5);
            throw null;
        }
    }

    public static /* synthetic */ void c0(int i2) {
        String str;
        int i3;
        Throwable th;
        switch (i2) {
            case 6:
            case 8:
            case 9:
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
            case 6:
            case 8:
            case 9:
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
                objArr[0] = "visibility";
                break;
            case 2:
                objArr[0] = "correspondingProperty";
                break;
            case 3:
                objArr[0] = "annotations";
                break;
            case 4:
                objArr[0] = "name";
                break;
            case 5:
                objArr[0] = "source";
                break;
            case 6:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyAccessorDescriptorImpl";
                break;
            case 7:
                objArr[0] = "substitutor";
                break;
            case 14:
                objArr[0] = "overriddenDescriptors";
                break;
            default:
                objArr[0] = "modality";
                break;
        }
        switch (i2) {
            case 6:
                objArr[1] = "getKind";
                break;
            case 8:
                objArr[1] = "getTypeParameters";
                break;
            case 9:
                objArr[1] = "getModality";
                break;
            case 10:
                objArr[1] = "getVisibility";
                break;
            case 11:
                objArr[1] = "getCorrespondingVariable";
                break;
            case 12:
                objArr[1] = "getCorrespondingProperty";
                break;
            case 13:
                objArr[1] = "getOverriddenDescriptors";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyAccessorDescriptorImpl";
                break;
        }
        switch (i2) {
            case 6:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
                break;
            case 7:
                objArr[2] = "substitute";
                break;
            case 14:
                objArr[2] = "setOverriddenDescriptors";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        switch (i2) {
            case 6:
            case 8:
            case 9:
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

    public List<r0> B() {
        List<r0> emptyList = Collections.emptyList();
        if (emptyList != null) {
            return emptyList;
        }
        c0(8);
        throw null;
    }

    public boolean C0() {
        return this.f8175l;
    }

    public boolean D0() {
        return false;
    }

    public s G() {
        return this.s;
    }

    public boolean J() {
        return this.f8176m;
    }

    public boolean J0() {
        return false;
    }

    public i0 K() {
        return z0().K();
    }

    public Collection<e0> K0(boolean z) {
        ArrayList arrayList = new ArrayList(0);
        for (f0 f0Var : z0().g()) {
            Object j2 = z ? f0Var.j() : f0Var.m();
            if (j2 != null) {
                arrayList.add(j2);
            }
        }
        return arrayList;
    }

    public boolean N0() {
        return false;
    }

    public b O0(k kVar, v vVar, z0 z0Var, b.a aVar, boolean z) {
        throw new UnsupportedOperationException("Accessors must be copied by the corresponding property");
    }

    public <V> V P(a.C0139a<V> aVar) {
        return null;
    }

    public i0 U() {
        return z0().U();
    }

    public boolean b0() {
        return false;
    }

    public s c(d1 d1Var) {
        if (d1Var == null) {
            c0(7);
            throw null;
        }
        throw new UnsupportedOperationException();
    }

    public z0 getVisibility() {
        z0 z0Var = this.r;
        if (z0Var != null) {
            return z0Var;
        }
        c0(10);
        throw null;
    }

    public b.a i() {
        b.a aVar = this.f8180q;
        if (aVar != null) {
            return aVar;
        }
        c0(6);
        throw null;
    }

    public boolean l() {
        return this.f8179p;
    }

    public boolean m0() {
        return false;
    }

    public v q() {
        v vVar = this.f8177n;
        if (vVar != null) {
            return vVar;
        }
        c0(9);
        throw null;
    }

    public boolean q0() {
        return false;
    }

    public boolean r0() {
        return false;
    }

    public void s0(Collection<? extends b> collection) {
    }

    public boolean t0() {
        return false;
    }

    public boolean u0() {
        return false;
    }

    /* renamed from: w0 */
    public abstract e0 j0();

    public f0 z0() {
        f0 f0Var = this.f8178o;
        if (f0Var != null) {
            return f0Var;
        }
        c0(12);
        throw null;
    }
}
