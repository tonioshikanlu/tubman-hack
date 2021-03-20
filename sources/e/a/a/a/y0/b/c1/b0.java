package e.a.a.a.y0.b.c1;

import b.e.a.a.a;
import e.a.a.a.y0.b.a1.h;
import e.a.a.a.y0.b.e;
import e.a.a.a.y0.b.f;
import e.a.a.a.y0.b.k;
import e.a.a.a.y0.b.m0;
import e.a.a.a.y0.b.r0;
import e.a.a.a.y0.b.v;
import e.a.a.a.y0.b.z0;
import e.a.a.a.y0.f.d;
import e.a.a.a.y0.j.y.i;
import e.a.a.a.y0.l.m;
import e.a.a.a.y0.m.d0;
import e.a.a.a.y0.m.n;
import e.a.a.a.y0.m.v0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.Set;

public class b0 extends j {

    /* renamed from: o  reason: collision with root package name */
    public final f f8170o;

    /* renamed from: p  reason: collision with root package name */
    public final boolean f8171p;

    /* renamed from: q  reason: collision with root package name */
    public v f8172q;
    public z0 r;
    public v0 s;
    public List<r0> t;
    public final Collection<d0> u;
    public final m v;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b0(k kVar, f fVar, boolean z, boolean z2, d dVar, m0 m0Var, m mVar) {
        super(mVar, kVar, dVar, m0Var, z2);
        if (dVar == null) {
            j0(2);
            throw null;
        } else if (mVar != null) {
            this.u = new ArrayList();
            this.v = mVar;
            this.f8170o = fVar;
            this.f8171p = z;
        } else {
            j0(4);
            throw null;
        }
    }

    public static /* synthetic */ void j0(int i2) {
        String str;
        int i3;
        Throwable th;
        switch (i2) {
            case 5:
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
            case 15:
            case 17:
            case 18:
            case 19:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i2) {
            case 5:
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
            case 15:
            case 17:
            case 18:
            case 19:
                i3 = 2;
                break;
            default:
                i3 = 3;
                break;
        }
        Object[] objArr = new Object[i3];
        switch (i2) {
            case 1:
                objArr[0] = "kind";
                break;
            case 2:
                objArr[0] = "name";
                break;
            case 3:
                objArr[0] = "source";
                break;
            case 4:
                objArr[0] = "storageManager";
                break;
            case 5:
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
            case 15:
            case 17:
            case 18:
            case 19:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/MutableClassDescriptor";
                break;
            case 6:
                objArr[0] = "modality";
                break;
            case 9:
                objArr[0] = "visibility";
                break;
            case 12:
                objArr[0] = "supertype";
                break;
            case 14:
                objArr[0] = "typeParameters";
                break;
            case 16:
                objArr[0] = "kotlinTypeRefiner";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        switch (i2) {
            case 5:
                objArr[1] = "getAnnotations";
                break;
            case 7:
                objArr[1] = "getModality";
                break;
            case 8:
                objArr[1] = "getKind";
                break;
            case 10:
                objArr[1] = "getVisibility";
                break;
            case 11:
                objArr[1] = "getTypeConstructor";
                break;
            case 13:
                objArr[1] = "getConstructors";
                break;
            case 15:
                objArr[1] = "getDeclaredTypeParameters";
                break;
            case 17:
                objArr[1] = "getUnsubstitutedMemberScope";
                break;
            case 18:
                objArr[1] = "getStaticScope";
                break;
            case 19:
                objArr[1] = "getSealedSubclasses";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/MutableClassDescriptor";
                break;
        }
        switch (i2) {
            case 5:
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
            case 15:
            case 17:
            case 18:
            case 19:
                break;
            case 6:
                objArr[2] = "setModality";
                break;
            case 9:
                objArr[2] = "setVisibility";
                break;
            case 12:
                objArr[2] = "addSupertype";
                break;
            case 14:
                objArr[2] = "setTypeParameterDescriptors";
                break;
            case 16:
                objArr[2] = "getUnsubstitutedMemberScope";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        switch (i2) {
            case 5:
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
            case 15:
            case 17:
            case 18:
            case 19:
                th = new IllegalStateException(format);
                break;
            default:
                th = new IllegalArgumentException(format);
                break;
        }
        throw th;
    }

    public List<r0> A() {
        List<r0> list = this.t;
        if (list != null) {
            return list;
        }
        j0(15);
        throw null;
    }

    public e B0() {
        return null;
    }

    public boolean J0() {
        return false;
    }

    public void K0() {
        this.s = new n(this, this.t, this.u, this.v);
        Set<e.a.a.a.y0.b.d> emptySet = Collections.emptySet();
        if (emptySet != null) {
            for (e.a.a.a.y0.b.d dVar : emptySet) {
                ((i) dVar).a1(s());
            }
            return;
        }
        j0(13);
        throw null;
    }

    public boolean N() {
        return false;
    }

    public void P0(List<r0> list) {
        if (this.t == null) {
            this.t = new ArrayList(list);
            return;
        }
        StringBuilder y = a.y("Type parameters are already set for ");
        y.append(getName());
        throw new IllegalStateException(y.toString());
    }

    public boolean S0() {
        return false;
    }

    public boolean V() {
        return false;
    }

    public i e0(e.a.a.a.y0.m.l1.f fVar) {
        if (fVar != null) {
            return i.b.f9460b;
        }
        j0(16);
        throw null;
    }

    public Collection<e> g0() {
        List emptyList = Collections.emptyList();
        if (emptyList != null) {
            return emptyList;
        }
        j0(19);
        throw null;
    }

    public z0 getVisibility() {
        z0 z0Var = this.r;
        if (z0Var != null) {
            return z0Var;
        }
        j0(10);
        throw null;
    }

    public f i() {
        f fVar = this.f8170o;
        if (fVar != null) {
            return fVar;
        }
        j0(8);
        throw null;
    }

    public h k() {
        Objects.requireNonNull(h.f7785e);
        h hVar = h.a.a;
        if (hVar != null) {
            return hVar;
        }
        j0(5);
        throw null;
    }

    public boolean l() {
        return false;
    }

    public boolean m0() {
        return false;
    }

    public v0 p() {
        v0 v0Var = this.s;
        if (v0Var != null) {
            return v0Var;
        }
        j0(11);
        throw null;
    }

    public v q() {
        v vVar = this.f8172q;
        if (vVar != null) {
            return vVar;
        }
        j0(7);
        throw null;
    }

    public Collection r() {
        Set emptySet = Collections.emptySet();
        if (emptySet != null) {
            return emptySet;
        }
        j0(13);
        throw null;
    }

    public boolean t() {
        return this.f8171p;
    }

    public String toString() {
        return m.e0(this);
    }

    public e.a.a.a.y0.b.d x0() {
        return null;
    }

    public i y0() {
        return i.b.f9460b;
    }
}
