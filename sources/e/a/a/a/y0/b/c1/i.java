package e.a.a.a.y0.b.c1;

import e.a.a.a.y0.b.a1.h;
import e.a.a.a.y0.b.b;
import e.a.a.a.y0.b.d;
import e.a.a.a.y0.b.e;
import e.a.a.a.y0.b.i0;
import e.a.a.a.y0.b.j;
import e.a.a.a.y0.b.k;
import e.a.a.a.y0.b.m;
import e.a.a.a.y0.b.m0;
import e.a.a.a.y0.b.r0;
import e.a.a.a.y0.b.s;
import e.a.a.a.y0.b.v;
import e.a.a.a.y0.b.w0;
import e.a.a.a.y0.b.z0;
import e.a.a.a.y0.m.d0;
import e.a.a.a.y0.m.d1;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;

public class i extends r implements d {
    public static final e.a.a.a.y0.f.d L = e.a.a.a.y0.f.d.n("<init>");
    public final boolean K;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public i(e eVar, j jVar, h hVar, boolean z, b.a aVar, m0 m0Var) {
        super(eVar, jVar, hVar, L, aVar, m0Var);
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
            this.K = z;
        } else {
            c0(3);
            throw null;
        }
    }

    public static /* synthetic */ void c0(int i2) {
        String str;
        int i3;
        Throwable th;
        if (!(i2 == 19 || i2 == 25)) {
            switch (i2) {
                case 15:
                case 16:
                case 17:
                    break;
                default:
                    str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                    break;
            }
        }
        str = "@NotNull method %s.%s must not return null";
        if (!(i2 == 19 || i2 == 25)) {
            switch (i2) {
                case 15:
                case 16:
                case 17:
                    break;
                default:
                    i3 = 3;
                    break;
            }
        }
        i3 = 2;
        Object[] objArr = new Object[i3];
        switch (i2) {
            case 1:
            case 5:
            case 8:
            case 23:
                objArr[0] = "annotations";
                break;
            case 2:
            case 22:
                objArr[0] = "kind";
                break;
            case 3:
            case 6:
            case 9:
            case 24:
                objArr[0] = "source";
                break;
            case 10:
            case 13:
                objArr[0] = "unsubstitutedValueParameters";
                break;
            case 11:
            case 14:
                objArr[0] = "visibility";
                break;
            case 12:
                objArr[0] = "typeParameterDescriptors";
                break;
            case 15:
            case 16:
            case 17:
            case 19:
            case 25:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassConstructorDescriptorImpl";
                break;
            case 18:
                objArr[0] = "originalSubstitutor";
                break;
            case 20:
                objArr[0] = "overriddenDescriptors";
                break;
            case 21:
                objArr[0] = "newOwner";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        if (i2 == 19) {
            objArr[1] = "getOverriddenDescriptors";
        } else if (i2 != 25) {
            switch (i2) {
                case 15:
                    objArr[1] = "getContainingDeclaration";
                    break;
                case 16:
                    objArr[1] = "getConstructedClass";
                    break;
                case 17:
                    objArr[1] = "getOriginal";
                    break;
                default:
                    objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassConstructorDescriptorImpl";
                    break;
            }
        } else {
            objArr[1] = "copy";
        }
        switch (i2) {
            case 4:
            case 5:
            case 6:
                objArr[2] = "create";
                break;
            case 7:
            case 8:
            case 9:
                objArr[2] = "createSynthesized";
                break;
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
                objArr[2] = "initialize";
                break;
            case 15:
            case 16:
            case 17:
            case 19:
            case 25:
                break;
            case 18:
                objArr[2] = "substitute";
                break;
            case 20:
                objArr[2] = "setOverriddenDescriptors";
                break;
            case 21:
            case 22:
            case 23:
            case 24:
                objArr[2] = "createSubstitutedCopy";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        if (!(i2 == 19 || i2 == 25)) {
            switch (i2) {
                case 15:
                case 16:
                case 17:
                    break;
                default:
                    th = new IllegalArgumentException(format);
                    break;
            }
        }
        th = new IllegalStateException(format);
        throw th;
    }

    public b O0(k kVar, v vVar, z0 z0Var, b.a aVar, boolean z) {
        d dVar = (d) super.O0(kVar, vVar, z0Var, aVar, z);
        if (dVar != null) {
            return dVar;
        }
        c0(25);
        throw null;
    }

    public boolean S() {
        return this.K;
    }

    public e T() {
        e c1 = b();
        if (c1 != null) {
            return c1;
        }
        c0(16);
        throw null;
    }

    public d a() {
        d dVar = (d) super.j0();
        if (dVar != null) {
            return dVar;
        }
        c0(17);
        throw null;
    }

    /* renamed from: b1 */
    public i K0(k kVar, s sVar, b.a aVar, e.a.a.a.y0.f.d dVar, h hVar, m0 m0Var) {
        if (kVar == null) {
            c0(21);
            throw null;
        } else if (aVar == null) {
            c0(22);
            throw null;
        } else if (hVar == null) {
            c0(23);
            throw null;
        } else if (m0Var != null) {
            b.a aVar2 = b.a.DECLARATION;
            if (aVar == aVar2 || aVar == b.a.SYNTHESIZED) {
                return new i((e) kVar, this, hVar, this.K, aVar2, m0Var);
            }
            throw new IllegalStateException("Attempt at creating a constructor that is not a declaration: \ncopy from: " + this + "\n" + "newOwner: " + kVar + "\n" + "kind: " + aVar);
        } else {
            c0(24);
            throw null;
        }
    }

    public d c(d1 d1Var) {
        if (d1Var != null) {
            return (d) super.c(d1Var);
        }
        c0(18);
        throw null;
    }

    /* renamed from: c1 */
    public e b() {
        e eVar = (e) super.b();
        if (eVar != null) {
            return eVar;
        }
        c0(15);
        throw null;
    }

    public i d1(List<w0> list, z0 z0Var) {
        if (list == null) {
            c0(13);
            throw null;
        } else if (z0Var != null) {
            e1(list, z0Var, b().A());
            return this;
        } else {
            c0(14);
            throw null;
        }
    }

    public i e1(List<w0> list, z0 z0Var, List<r0> list2) {
        i0 i0Var = null;
        if (list == null) {
            c0(10);
            throw null;
        } else if (z0Var == null) {
            c0(11);
            throw null;
        } else if (list2 != null) {
            e c1 = b();
            if (c1.t()) {
                k b2 = c1.b();
                if (b2 instanceof e) {
                    i0Var = ((e) b2).U0();
                }
            }
            V0((i0) null, i0Var, list2, list, (d0) null, v.FINAL, z0Var);
            return this;
        } else {
            c0(12);
            throw null;
        }
    }

    public Collection<? extends s> g() {
        Set emptySet = Collections.emptySet();
        if (emptySet != null) {
            return emptySet;
        }
        c0(19);
        throw null;
    }

    public <R, D> R l0(m<R, D> mVar, D d) {
        return mVar.e(this, d);
    }

    public void s0(Collection<? extends b> collection) {
        if (collection == null) {
            c0(20);
            throw null;
        }
    }

    public s w0(k kVar, v vVar, z0 z0Var, b.a aVar, boolean z) {
        d dVar = (d) super.O0(kVar, vVar, z0Var, aVar, z);
        if (dVar != null) {
            return dVar;
        }
        c0(25);
        throw null;
    }
}
