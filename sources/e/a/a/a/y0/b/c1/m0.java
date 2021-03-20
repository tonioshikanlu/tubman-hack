package e.a.a.a.y0.b.c1;

import b.e.a.a.a;
import e.a.a.a.y0.b.a1.h;
import e.a.a.a.y0.b.k;
import e.a.a.a.y0.b.p0;
import e.a.a.a.y0.b.r0;
import e.a.a.a.y0.f.d;
import e.a.a.a.y0.j.g;
import e.a.a.a.y0.j.v.b;
import e.a.a.a.y0.l.m;
import e.a.a.a.y0.m.d0;
import e.a.a.a.y0.m.j1;
import e.x.b.l;
import java.util.ArrayList;
import java.util.List;

public class m0 extends g {
    public final l<d0, Void> r;
    public final List<d0> s;
    public boolean t;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public m0(k kVar, h hVar, boolean z, j1 j1Var, d dVar, int i2, e.a.a.a.y0.b.m0 m0Var, l<d0, Void> lVar, p0 p0Var, m mVar) {
        super(mVar, kVar, hVar, dVar, j1Var, z, i2, m0Var, p0Var);
        if (kVar == null) {
            c0(19);
            throw null;
        } else if (hVar == null) {
            c0(20);
            throw null;
        } else if (j1Var == null) {
            c0(21);
            throw null;
        } else if (dVar == null) {
            c0(22);
            throw null;
        } else if (m0Var == null) {
            c0(23);
            throw null;
        } else if (p0Var == null) {
            c0(24);
            throw null;
        } else if (mVar != null) {
            this.s = new ArrayList(1);
            this.t = false;
            this.r = lVar;
        } else {
            c0(25);
            throw null;
        }
    }

    public static m0 V0(k kVar, h hVar, boolean z, j1 j1Var, d dVar, int i2, e.a.a.a.y0.b.m0 m0Var, m mVar) {
        if (kVar == null) {
            c0(6);
            throw null;
        } else if (hVar == null) {
            c0(7);
            throw null;
        } else if (j1Var == null) {
            c0(8);
            throw null;
        } else if (dVar == null) {
            c0(9);
            throw null;
        } else if (mVar != null) {
            return new m0(kVar, hVar, z, j1Var, dVar, i2, m0Var, (l<d0, Void>) null, p0.a.a, mVar);
        } else {
            c0(11);
            throw null;
        }
    }

    public static r0 W0(k kVar, h hVar, boolean z, j1 j1Var, d dVar, int i2, m mVar) {
        if (kVar == null) {
            c0(0);
            throw null;
        } else if (hVar == null) {
            c0(1);
            throw null;
        } else if (mVar != null) {
            m0 V0 = V0(kVar, hVar, z, j1Var, dVar, i2, e.a.a.a.y0.b.m0.a, mVar);
            V0.P0(b.f(kVar).l());
            V0.R0();
            V0.t = true;
            return V0;
        } else {
            c0(4);
            throw null;
        }
    }

    public static /* synthetic */ void c0(int i2) {
        String str = (i2 == 5 || i2 == 28) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[((i2 == 5 || i2 == 28) ? 2 : 3)];
        switch (i2) {
            case 1:
            case 7:
            case 13:
            case 20:
                objArr[0] = "annotations";
                break;
            case 2:
            case 8:
            case 14:
            case 21:
                objArr[0] = "variance";
                break;
            case 3:
            case 9:
            case 15:
            case 22:
                objArr[0] = "name";
                break;
            case 4:
            case 11:
            case 18:
            case 25:
                objArr[0] = "storageManager";
                break;
            case 5:
            case 28:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/TypeParameterDescriptorImpl";
                break;
            case 10:
            case 16:
            case 23:
                objArr[0] = "source";
                break;
            case 17:
                objArr[0] = "supertypeLoopsResolver";
                break;
            case 24:
                objArr[0] = "supertypeLoopsChecker";
                break;
            case 26:
                objArr[0] = "bound";
                break;
            case 27:
                objArr[0] = "type";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        if (i2 == 5) {
            objArr[1] = "createWithDefaultBound";
        } else if (i2 != 28) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/TypeParameterDescriptorImpl";
        } else {
            objArr[1] = "resolveUpperBounds";
        }
        switch (i2) {
            case 5:
            case 28:
                break;
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
                objArr[2] = "createForFurtherModification";
                break;
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
                objArr[2] = "<init>";
                break;
            case 26:
                objArr[2] = "addUpperBound";
                break;
            case 27:
                objArr[2] = "reportSupertypeLoopError";
                break;
            default:
                objArr[2] = "createWithDefaultBound";
                break;
        }
        String format = String.format(str, objArr);
        throw ((i2 == 5 || i2 == 28) ? new IllegalStateException(format) : new IllegalArgumentException(format));
    }

    public List<d0> K0() {
        if (this.t) {
            List<d0> list = this.s;
            if (list != null) {
                return list;
            }
            c0(28);
            throw null;
        }
        StringBuilder y = a.y("Type parameter descriptor is not initialized: ");
        y.append(X0());
        throw new IllegalStateException(y.toString());
    }

    public void P0(d0 d0Var) {
        if (d0Var != null) {
            R0();
            if (!b.q.a.a.I1(d0Var)) {
                this.s.add(d0Var);
                return;
            }
            return;
        }
        c0(26);
        throw null;
    }

    public final void R0() {
        if (this.t) {
            StringBuilder y = a.y("Type parameter descriptor is already initialized: ");
            y.append(X0());
            throw new IllegalStateException(y.toString());
        }
    }

    public final String X0() {
        return getName() + " declared in " + g.g(b());
    }

    public void w0(d0 d0Var) {
        if (d0Var != null) {
            l<d0, Void> lVar = this.r;
            if (lVar != null) {
                lVar.invoke(d0Var);
                return;
            }
            return;
        }
        c0(27);
        throw null;
    }
}
