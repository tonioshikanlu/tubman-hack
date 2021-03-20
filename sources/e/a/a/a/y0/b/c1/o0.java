package e.a.a.a.y0.b.c1;

import e.a.a.a.y0.b.a;
import e.a.a.a.y0.b.a1.h;
import e.a.a.a.y0.b.i0;
import e.a.a.a.y0.b.k;
import e.a.a.a.y0.b.m0;
import e.a.a.a.y0.b.r0;
import e.a.a.a.y0.b.w0;
import e.a.a.a.y0.b.x0;
import e.a.a.a.y0.f.d;
import e.a.a.a.y0.m.d0;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;

public abstract class o0 extends n implements x0 {

    /* renamed from: l  reason: collision with root package name */
    public d0 f8229l;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public o0(k kVar, h hVar, d dVar, d0 d0Var, m0 m0Var) {
        super(kVar, hVar, dVar, m0Var);
        if (kVar == null) {
            c0(0);
            throw null;
        } else if (hVar == null) {
            c0(1);
            throw null;
        } else if (dVar == null) {
            c0(2);
            throw null;
        } else if (m0Var != null) {
            this.f8229l = d0Var;
        } else {
            c0(3);
            throw null;
        }
    }

    public static /* synthetic */ void c0(int i2) {
        String str;
        int i3;
        Throwable th;
        switch (i2) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i2) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                i3 = 2;
                break;
            default:
                i3 = 3;
                break;
        }
        Object[] objArr = new Object[i3];
        switch (i2) {
            case 1:
                objArr[0] = "annotations";
                break;
            case 2:
                objArr[0] = "name";
                break;
            case 3:
                objArr[0] = "source";
                break;
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/VariableDescriptorImpl";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        switch (i2) {
            case 4:
                objArr[1] = "getType";
                break;
            case 5:
                objArr[1] = "getOriginal";
                break;
            case 6:
                objArr[1] = "getValueParameters";
                break;
            case 7:
                objArr[1] = "getOverriddenDescriptors";
                break;
            case 8:
                objArr[1] = "getTypeParameters";
                break;
            case 9:
                objArr[1] = "getReturnType";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/VariableDescriptorImpl";
                break;
        }
        switch (i2) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        switch (i2) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
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

    public i0 K() {
        return null;
    }

    public i0 U() {
        return null;
    }

    public boolean b0() {
        return false;
    }

    public d0 d() {
        d0 d0Var = this.f8229l;
        if (d0Var != null) {
            return d0Var;
        }
        c0(4);
        throw null;
    }

    public d0 f() {
        d0 d = d();
        if (d != null) {
            return d;
        }
        c0(9);
        throw null;
    }

    public Collection<? extends a> g() {
        Set emptySet = Collections.emptySet();
        if (emptySet != null) {
            return emptySet;
        }
        c0(7);
        throw null;
    }

    public List<w0> n() {
        List<w0> emptyList = Collections.emptyList();
        if (emptyList != null) {
            return emptyList;
        }
        c0(6);
        throw null;
    }

    /* renamed from: w0 */
    public x0 j0() {
        return this;
    }
}
