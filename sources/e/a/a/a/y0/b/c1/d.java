package e.a.a.a.y0.b.c1;

import e.a.a.a.y0.b.a;
import e.a.a.a.y0.b.a1.h;
import e.a.a.a.y0.b.e;
import e.a.a.a.y0.b.i0;
import e.a.a.a.y0.b.k;
import e.a.a.a.y0.b.m;
import e.a.a.a.y0.b.m0;
import e.a.a.a.y0.b.r0;
import e.a.a.a.y0.b.w0;
import e.a.a.a.y0.b.y0;
import e.a.a.a.y0.b.z0;
import e.a.a.a.y0.j.y.o.g;
import e.a.a.a.y0.m.d0;
import e.a.a.a.y0.m.d1;
import e.a.a.a.y0.m.j1;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;

public abstract class d extends m implements i0 {

    /* renamed from: j  reason: collision with root package name */
    public static final e.a.a.a.y0.f.d f8174j = e.a.a.a.y0.f.d.n("<this>");

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d(h hVar) {
        super(hVar, f8174j);
        if (hVar != null) {
        } else {
            c0(0);
            throw null;
        }
    }

    public static /* synthetic */ void c0(int i2) {
        String str;
        int i3;
        Throwable th;
        switch (i2) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i2) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                i3 = 2;
                break;
            default:
                i3 = 3;
                break;
        }
        Object[] objArr = new Object[i3];
        switch (i2) {
            case 1:
                objArr[0] = "substitutor";
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractReceiverParameterDescriptor";
                break;
            default:
                objArr[0] = "annotations";
                break;
        }
        switch (i2) {
            case 2:
                objArr[1] = "getTypeParameters";
                break;
            case 3:
                objArr[1] = "getType";
                break;
            case 4:
                objArr[1] = "getValueParameters";
                break;
            case 5:
                objArr[1] = "getOverriddenDescriptors";
                break;
            case 6:
                objArr[1] = "getVisibility";
                break;
            case 7:
                objArr[1] = "getOriginal";
                break;
            case 8:
                objArr[1] = "getSource";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractReceiverParameterDescriptor";
                break;
        }
        switch (i2) {
            case 1:
                objArr[2] = "substitute";
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        switch (i2) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
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
        c0(2);
        throw null;
    }

    public i0 K() {
        return null;
    }

    public i0 U() {
        return null;
    }

    public a a() {
        return this;
    }

    /* renamed from: a  reason: collision with other method in class */
    public k m25a() {
        return this;
    }

    public boolean b0() {
        return false;
    }

    public i0 c(d1 d1Var) {
        j1 j1Var;
        d0 d0Var;
        if (d1Var == null) {
            c0(1);
            throw null;
        } else if (d1Var.h()) {
            return this;
        } else {
            if (b() instanceof e) {
                d0Var = d();
                j1Var = j1.OUT_VARIANCE;
            } else {
                d0Var = d();
                j1Var = j1.INVARIANT;
            }
            d0 k2 = d1Var.k(d0Var, j1Var);
            if (k2 == null) {
                return null;
            }
            return k2 == d() ? this : new h0(b(), new g(k2), k());
        }
    }

    public d0 d() {
        d0 d = getValue().d();
        if (d != null) {
            return d;
        }
        c0(3);
        throw null;
    }

    public d0 f() {
        return d();
    }

    public Collection<? extends a> g() {
        Set emptySet = Collections.emptySet();
        if (emptySet != null) {
            return emptySet;
        }
        c0(5);
        throw null;
    }

    public z0 getVisibility() {
        z0 z0Var = y0.f;
        if (z0Var != null) {
            return z0Var;
        }
        c0(6);
        throw null;
    }

    public <R, D> R l0(m<R, D> mVar, D d) {
        return mVar.k(this, d);
    }

    public List<w0> n() {
        List<w0> emptyList = Collections.emptyList();
        if (emptyList != null) {
            return emptyList;
        }
        c0(4);
        throw null;
    }

    public m0 w() {
        return m0.a;
    }
}
