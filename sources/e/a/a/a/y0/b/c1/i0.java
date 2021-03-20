package e.a.a.a.y0.b.c1;

import e.a.a.a.y0.b.a;
import e.a.a.a.y0.b.a1.h;
import e.a.a.a.y0.b.b;
import e.a.a.a.y0.b.k;
import e.a.a.a.y0.b.l0;
import e.a.a.a.y0.b.m0;
import e.a.a.a.y0.b.r0;
import e.a.a.a.y0.b.s;
import e.a.a.a.y0.b.v;
import e.a.a.a.y0.b.w0;
import e.a.a.a.y0.b.z0;
import e.a.a.a.y0.f.d;
import e.a.a.a.y0.m.d0;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class i0 extends r implements l0 {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public i0(k kVar, l0 l0Var, h hVar, d dVar, b.a aVar, m0 m0Var) {
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
        } else {
            c0(4);
            throw null;
        }
    }

    public static /* synthetic */ void c0(int i2) {
        String str = (i2 == 13 || i2 == 17 || i2 == 18 || i2 == 23 || i2 == 24) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[((i2 == 13 || i2 == 17 || i2 == 18 || i2 == 23 || i2 == 24) ? 2 : 3)];
        switch (i2) {
            case 1:
            case 6:
            case 21:
                objArr[0] = "annotations";
                break;
            case 2:
            case 7:
                objArr[0] = "name";
                break;
            case 3:
            case 8:
            case 20:
                objArr[0] = "kind";
                break;
            case 4:
            case 9:
            case 22:
                objArr[0] = "source";
                break;
            case 10:
            case 14:
                objArr[0] = "typeParameters";
                break;
            case 11:
            case 15:
                objArr[0] = "unsubstitutedValueParameters";
                break;
            case 12:
            case 16:
                objArr[0] = "visibility";
                break;
            case 13:
            case 17:
            case 18:
            case 23:
            case 24:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/SimpleFunctionDescriptorImpl";
                break;
            case 19:
                objArr[0] = "newOwner";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        if (i2 == 13 || i2 == 17) {
            objArr[1] = "initialize";
        } else if (i2 == 18) {
            objArr[1] = "getOriginal";
        } else if (i2 == 23) {
            objArr[1] = "copy";
        } else if (i2 != 24) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/SimpleFunctionDescriptorImpl";
        } else {
            objArr[1] = "newCopyBuilder";
        }
        switch (i2) {
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                objArr[2] = "create";
                break;
            case 10:
            case 11:
            case 12:
            case 14:
            case 15:
            case 16:
                objArr[2] = "initialize";
                break;
            case 13:
            case 17:
            case 18:
            case 23:
            case 24:
                break;
            case 19:
            case 20:
            case 21:
            case 22:
                objArr[2] = "createSubstitutedCopy";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        throw ((i2 == 13 || i2 == 17 || i2 == 18 || i2 == 23 || i2 == 24) ? new IllegalStateException(format) : new IllegalArgumentException(format));
    }

    public static i0 c1(k kVar, h hVar, d dVar, b.a aVar, m0 m0Var) {
        if (kVar == null) {
            c0(5);
            throw null;
        } else if (hVar == null) {
            c0(6);
            throw null;
        } else if (dVar == null) {
            c0(7);
            throw null;
        } else if (m0Var != null) {
            return new i0(kVar, (l0) null, hVar, dVar, aVar, m0Var);
        } else {
            c0(9);
            throw null;
        }
    }

    public r K0(k kVar, s sVar, b.a aVar, d dVar, h hVar, m0 m0Var) {
        if (kVar == null) {
            c0(19);
            throw null;
        } else if (aVar == null) {
            c0(20);
            throw null;
        } else if (hVar == null) {
            c0(21);
            throw null;
        } else if (m0Var != null) {
            l0 l0Var = (l0) sVar;
            if (dVar == null) {
                dVar = getName();
            }
            return new i0(kVar, l0Var, hVar, dVar, aVar, m0Var);
        } else {
            c0(22);
            throw null;
        }
    }

    /* renamed from: b1 */
    public l0 w0(k kVar, v vVar, z0 z0Var, b.a aVar, boolean z) {
        l0 l0Var = (l0) super.O0(kVar, vVar, z0Var, aVar, z);
        if (l0Var != null) {
            return l0Var;
        }
        c0(23);
        throw null;
    }

    /* renamed from: d1 */
    public l0 j0() {
        l0 l0Var = (l0) super.j0();
        if (l0Var != null) {
            return l0Var;
        }
        c0(18);
        throw null;
    }

    /* renamed from: e1 */
    public i0 V0(e.a.a.a.y0.b.i0 i0Var, e.a.a.a.y0.b.i0 i0Var2, List<? extends r0> list, List<w0> list2, d0 d0Var, v vVar, z0 z0Var) {
        if (list == null) {
            c0(10);
            throw null;
        } else if (list2 == null) {
            c0(11);
            throw null;
        } else if (z0Var != null) {
            i0 f1 = f1(i0Var, i0Var2, list, list2, d0Var, vVar, z0Var, (Map<? extends a.C0139a<?>, ?>) null);
            if (f1 != null) {
                return f1;
            }
            c0(13);
            throw null;
        } else {
            c0(12);
            throw null;
        }
    }

    public i0 f1(e.a.a.a.y0.b.i0 i0Var, e.a.a.a.y0.b.i0 i0Var2, List<? extends r0> list, List<w0> list2, d0 d0Var, v vVar, z0 z0Var, Map<? extends a.C0139a<?>, ?> map) {
        if (list == null) {
            c0(14);
            throw null;
        } else if (list2 == null) {
            c0(15);
            throw null;
        } else if (z0Var != null) {
            super.V0(i0Var, i0Var2, list, list2, d0Var, vVar, z0Var);
            if (map != null && !map.isEmpty()) {
                this.J = new LinkedHashMap(map);
            }
            return this;
        } else {
            c0(16);
            throw null;
        }
    }

    public s.a<? extends l0> x() {
        return super.x();
    }
}
