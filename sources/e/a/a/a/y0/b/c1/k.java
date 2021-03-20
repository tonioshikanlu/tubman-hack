package e.a.a.a.y0.b.c1;

import b.e.a.a.a;
import e.a.a.a.y0.b.a1.h;
import e.a.a.a.y0.b.d;
import e.a.a.a.y0.b.e;
import e.a.a.a.y0.b.f;
import e.a.a.a.y0.b.m0;
import e.a.a.a.y0.b.r0;
import e.a.a.a.y0.b.v;
import e.a.a.a.y0.b.y0;
import e.a.a.a.y0.b.z0;
import e.a.a.a.y0.j.y.i;
import e.a.a.a.y0.l.m;
import e.a.a.a.y0.m.d0;
import e.a.a.a.y0.m.n;
import e.a.a.a.y0.m.v0;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.Set;

public class k extends j {

    /* renamed from: o  reason: collision with root package name */
    public final v f8215o;

    /* renamed from: p  reason: collision with root package name */
    public final f f8216p;

    /* renamed from: q  reason: collision with root package name */
    public final v0 f8217q;
    public i r;
    public Set<d> s;
    public d t;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public k(e.a.a.a.y0.b.k kVar, e.a.a.a.y0.f.d dVar, v vVar, f fVar, Collection<d0> collection, m0 m0Var, boolean z, m mVar) {
        super(mVar, kVar, dVar, m0Var, z);
        if (kVar == null) {
            j0(0);
            throw null;
        } else if (dVar == null) {
            j0(1);
            throw null;
        } else if (collection == null) {
            j0(4);
            throw null;
        } else if (mVar != null) {
            this.f8215o = vVar;
            this.f8216p = fVar;
            this.f8217q = new n(this, Collections.emptyList(), collection, mVar);
        } else {
            j0(6);
            throw null;
        }
    }

    public static /* synthetic */ void j0(int i2) {
        String str;
        int i3;
        Throwable th;
        switch (i2) {
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
            case 15:
            case 16:
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
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
            case 15:
            case 16:
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
                objArr[0] = "name";
                break;
            case 2:
                objArr[0] = "modality";
                break;
            case 3:
                objArr[0] = "kind";
                break;
            case 4:
                objArr[0] = "supertypes";
                break;
            case 5:
                objArr[0] = "source";
                break;
            case 6:
                objArr[0] = "storageManager";
                break;
            case 7:
                objArr[0] = "unsubstitutedMemberScope";
                break;
            case 8:
                objArr[0] = "constructors";
                break;
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassDescriptorImpl";
                break;
            case 12:
                objArr[0] = "kotlinTypeRefiner";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        switch (i2) {
            case 9:
                objArr[1] = "getAnnotations";
                break;
            case 10:
                objArr[1] = "getTypeConstructor";
                break;
            case 11:
                objArr[1] = "getConstructors";
                break;
            case 13:
                objArr[1] = "getUnsubstitutedMemberScope";
                break;
            case 14:
                objArr[1] = "getStaticScope";
                break;
            case 15:
                objArr[1] = "getKind";
                break;
            case 16:
                objArr[1] = "getModality";
                break;
            case 17:
                objArr[1] = "getVisibility";
                break;
            case 18:
                objArr[1] = "getDeclaredTypeParameters";
                break;
            case 19:
                objArr[1] = "getSealedSubclasses";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassDescriptorImpl";
                break;
        }
        switch (i2) {
            case 7:
            case 8:
                objArr[2] = "initialize";
                break;
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
                break;
            case 12:
                objArr[2] = "getUnsubstitutedMemberScope";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        switch (i2) {
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
            case 15:
            case 16:
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
        List<r0> emptyList = Collections.emptyList();
        if (emptyList != null) {
            return emptyList;
        }
        j0(18);
        throw null;
    }

    public e B0() {
        return null;
    }

    public boolean J0() {
        return false;
    }

    public final void K0(i iVar, Set<d> set, d dVar) {
        if (set != null) {
            this.r = iVar;
            this.s = set;
            this.t = dVar;
            return;
        }
        j0(8);
        throw null;
    }

    public boolean N() {
        return false;
    }

    public boolean S0() {
        return false;
    }

    public boolean V() {
        return false;
    }

    public i e0(e.a.a.a.y0.m.l1.f fVar) {
        if (fVar != null) {
            i iVar = this.r;
            if (iVar != null) {
                return iVar;
            }
            j0(13);
            throw null;
        }
        j0(12);
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
        z0 z0Var = y0.f7850e;
        if (z0Var != null) {
            return z0Var;
        }
        j0(17);
        throw null;
    }

    public f i() {
        f fVar = this.f8216p;
        if (fVar != null) {
            return fVar;
        }
        j0(15);
        throw null;
    }

    public h k() {
        Objects.requireNonNull(h.f7785e);
        h hVar = h.a.a;
        if (hVar != null) {
            return hVar;
        }
        j0(9);
        throw null;
    }

    public boolean l() {
        return false;
    }

    public boolean m0() {
        return false;
    }

    public v0 p() {
        v0 v0Var = this.f8217q;
        if (v0Var != null) {
            return v0Var;
        }
        j0(10);
        throw null;
    }

    public v q() {
        v vVar = this.f8215o;
        if (vVar != null) {
            return vVar;
        }
        j0(16);
        throw null;
    }

    public Collection<d> r() {
        Set<d> set = this.s;
        if (set != null) {
            return set;
        }
        j0(11);
        throw null;
    }

    public boolean t() {
        return false;
    }

    public String toString() {
        StringBuilder y = a.y("class ");
        y.append(getName());
        return y.toString();
    }

    public d x0() {
        return this.t;
    }

    public i y0() {
        return i.b.f9460b;
    }
}
