package e.a.a.a.y0.d.a.a0;

import b.q.a.a;
import e.a.a.a.y0.b.a;
import e.a.a.a.y0.b.a1.h;
import e.a.a.a.y0.b.b;
import e.a.a.a.y0.b.c1.i;
import e.a.a.a.y0.b.e;
import e.a.a.a.y0.b.i0;
import e.a.a.a.y0.b.k;
import e.a.a.a.y0.b.m0;
import e.a.a.a.y0.b.s;
import e.a.a.a.y0.f.d;
import e.a.a.a.y0.m.d0;
import e.j;
import java.util.List;
import java.util.Objects;

public class c extends i implements b {
    public Boolean M;
    public Boolean N;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c(e eVar, c cVar, h hVar, boolean z, b.a aVar, m0 m0Var) {
        super(eVar, cVar, hVar, z, aVar, m0Var);
        if (eVar == null) {
            c0(0);
            throw null;
        } else if (hVar == null) {
            c0(1);
            throw null;
        } else if (aVar == null) {
            c0(2);
            throw null;
        } else if (m0Var != null) {
            this.M = null;
            this.N = null;
        } else {
            c0(3);
            throw null;
        }
    }

    public static /* synthetic */ void c0(int i2) {
        String str = (i2 == 11 || i2 == 18) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[((i2 == 11 || i2 == 18) ? 2 : 3)];
        switch (i2) {
            case 1:
            case 5:
            case 9:
            case 15:
                objArr[0] = "annotations";
                break;
            case 2:
            case 8:
            case 13:
                objArr[0] = "kind";
                break;
            case 3:
            case 6:
            case 10:
                objArr[0] = "source";
                break;
            case 7:
            case 12:
                objArr[0] = "newOwner";
                break;
            case 11:
            case 18:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaClassConstructorDescriptor";
                break;
            case 14:
                objArr[0] = "sourceElement";
                break;
            case 16:
                objArr[0] = "enhancedValueParametersData";
                break;
            case 17:
                objArr[0] = "enhancedReturnType";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        if (i2 == 11) {
            objArr[1] = "createSubstitutedCopy";
        } else if (i2 != 18) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaClassConstructorDescriptor";
        } else {
            objArr[1] = "enhance";
        }
        switch (i2) {
            case 4:
            case 5:
            case 6:
                objArr[2] = "createJavaConstructor";
                break;
            case 7:
            case 8:
            case 9:
            case 10:
                objArr[2] = "createSubstitutedCopy";
                break;
            case 11:
            case 18:
                break;
            case 12:
            case 13:
            case 14:
            case 15:
                objArr[2] = "createDescriptor";
                break;
            case 16:
            case 17:
                objArr[2] = "enhance";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        throw ((i2 == 11 || i2 == 18) ? new IllegalStateException(format) : new IllegalArgumentException(format));
    }

    public static c f1(e eVar, h hVar, boolean z, m0 m0Var) {
        if (eVar == null) {
            c0(4);
            throw null;
        } else if (hVar == null) {
            c0(5);
            throw null;
        } else if (m0Var != null) {
            return new c(eVar, (c) null, hVar, z, b.a.DECLARATION, m0Var);
        } else {
            c0(6);
            throw null;
        }
    }

    public b H(d0 d0Var, List list, d0 d0Var2, j jVar) {
        d0 d0Var3 = d0Var;
        j jVar2 = jVar;
        i0 i0Var = null;
        if (d0Var2 != null) {
            c g1 = b1(b(), (s) null, i(), (d) null, k(), w());
            if (d0Var3 != null) {
                Objects.requireNonNull(h.f7785e);
                i0Var = a.Y(g1, d0Var, h.a.a);
            }
            List list2 = list;
            g1.V0(i0Var, this.f8245p, B(), a.P(list, n(), g1), d0Var2, q(), getVisibility());
            if (jVar2 != null) {
                g1.X0((a.C0139a) jVar2.f7906h, jVar2.f7907i);
            }
            return g1;
        }
        c0(17);
        throw null;
    }

    public void Y0(boolean z) {
        this.M = Boolean.valueOf(z);
    }

    public void Z0(boolean z) {
        this.N = Boolean.valueOf(z);
    }

    public boolean b0() {
        return this.N.booleanValue();
    }

    /* renamed from: g1 */
    public c b1(k kVar, s sVar, b.a aVar, d dVar, h hVar, m0 m0Var) {
        if (kVar == null) {
            c0(7);
            throw null;
        } else if (aVar == null) {
            c0(8);
            throw null;
        } else if (hVar == null) {
            c0(9);
            throw null;
        } else if (m0Var == null) {
            c0(10);
            throw null;
        } else if (aVar == b.a.DECLARATION || aVar == b.a.SYNTHESIZED) {
            e eVar = (e) kVar;
            c cVar = (c) sVar;
            if (eVar == null) {
                c0(12);
                throw null;
            } else if (aVar == null) {
                c0(13);
                throw null;
            } else if (m0Var == null) {
                c0(14);
                throw null;
            } else if (hVar != null) {
                c cVar2 = new c(eVar, cVar, hVar, this.K, aVar, m0Var);
                cVar2.Y0(this.M.booleanValue());
                cVar2.Z0(b0());
                return cVar2;
            } else {
                c0(15);
                throw null;
            }
        } else {
            throw new IllegalStateException("Attempt at creating a constructor that is not a declaration: \ncopy from: " + this + "\n" + "newOwner: " + kVar + "\n" + "kind: " + aVar);
        }
    }
}
