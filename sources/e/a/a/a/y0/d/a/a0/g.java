package e.a.a.a.y0.d.a.a0;

import e.a.a.a.y0.a.n;
import e.a.a.a.y0.b.a;
import e.a.a.a.y0.b.a1.h;
import e.a.a.a.y0.b.b;
import e.a.a.a.y0.b.c1.e0;
import e.a.a.a.y0.b.c1.g0;
import e.a.a.a.y0.b.f0;
import e.a.a.a.y0.b.h0;
import e.a.a.a.y0.b.i0;
import e.a.a.a.y0.b.k;
import e.a.a.a.y0.b.m0;
import e.a.a.a.y0.b.v;
import e.a.a.a.y0.b.z0;
import e.a.a.a.y0.d.a.e0.y;
import e.a.a.a.y0.d.a.t;
import e.a.a.a.y0.f.d;
import e.a.a.a.y0.m.d0;
import e.a.a.a.y0.m.f1;
import e.j;
import e.x.c.i;
import java.util.List;
import java.util.Objects;

public class g extends e0 implements b {
    public final boolean H;
    public final j<a.C0139a<?>, ?> I;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public g(k kVar, h hVar, v vVar, z0 z0Var, boolean z, d dVar, m0 m0Var, f0 f0Var, b.a aVar, boolean z2, j<a.C0139a<?>, ?> jVar) {
        super(kVar, f0Var, hVar, vVar, z0Var, z, dVar, aVar, m0Var, false, false, false, false, false, false);
        if (kVar == null) {
            c0(0);
            throw null;
        } else if (hVar == null) {
            c0(1);
            throw null;
        } else if (vVar == null) {
            c0(2);
            throw null;
        } else if (z0Var == null) {
            c0(3);
            throw null;
        } else if (dVar == null) {
            c0(4);
            throw null;
        } else if (m0Var == null) {
            c0(5);
            throw null;
        } else if (aVar != null) {
            this.H = z2;
            this.I = jVar;
        } else {
            c0(6);
            throw null;
        }
    }

    public static g X0(k kVar, h hVar, v vVar, z0 z0Var, boolean z, d dVar, m0 m0Var, boolean z2) {
        if (kVar == null) {
            c0(7);
            throw null;
        } else if (vVar == null) {
            c0(9);
            throw null;
        } else if (z0Var == null) {
            c0(10);
            throw null;
        } else if (dVar == null) {
            c0(11);
            throw null;
        } else if (m0Var != null) {
            return new g(kVar, hVar, vVar, z0Var, z, dVar, m0Var, (f0) null, b.a.DECLARATION, z2, (j<a.C0139a<?>, ?>) null);
        } else {
            c0(12);
            throw null;
        }
    }

    public static /* synthetic */ void c0(int i2) {
        String str = i2 != 21 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[(i2 != 21 ? 3 : 2)];
        switch (i2) {
            case 1:
            case 8:
                objArr[0] = "annotations";
                break;
            case 2:
            case 9:
                objArr[0] = "modality";
                break;
            case 3:
            case 10:
                objArr[0] = "visibility";
                break;
            case 4:
            case 11:
                objArr[0] = "name";
                break;
            case 5:
            case 12:
            case 18:
                objArr[0] = "source";
                break;
            case 6:
            case 16:
                objArr[0] = "kind";
                break;
            case 13:
                objArr[0] = "newOwner";
                break;
            case 14:
                objArr[0] = "newModality";
                break;
            case 15:
                objArr[0] = "newVisibility";
                break;
            case 17:
                objArr[0] = "newName";
                break;
            case 19:
                objArr[0] = "enhancedValueParametersData";
                break;
            case 20:
                objArr[0] = "enhancedReturnType";
                break;
            case 21:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaPropertyDescriptor";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        if (i2 != 21) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaPropertyDescriptor";
        } else {
            objArr[1] = "enhance";
        }
        switch (i2) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
                objArr[2] = "create";
                break;
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
                objArr[2] = "createSubstitutedCopy";
                break;
            case 19:
            case 20:
                objArr[2] = "enhance";
                break;
            case 21:
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        throw (i2 != 21 ? new IllegalArgumentException(format) : new IllegalStateException(format));
    }

    public b H(d0 d0Var, List<k> list, d0 d0Var2, j<a.C0139a<?>, ?> jVar) {
        e.a.a.a.y0.b.c1.f0 f0Var;
        g0 g0Var;
        i0 i0Var;
        d0 d0Var3 = d0Var;
        d0 d0Var4 = d0Var2;
        if (d0Var4 != null) {
            f0 a = w0() == this ? null : w0();
            g gVar = r5;
            g gVar2 = new g(b(), k(), q(), getVisibility(), this.f8238m, getName(), w(), a, i(), this.H, jVar);
            e.a.a.a.y0.b.c1.f0 f0Var2 = this.C;
            if (f0Var2 != null) {
                f0Var = r5;
                e.a.a.a.y0.b.c1.f0 f0Var3 = new e.a.a.a.y0.b.c1.f0(gVar, f0Var2.k(), f0Var2.q(), f0Var2.getVisibility(), f0Var2.f8175l, f0Var2.f8176m, f0Var2.f8179p, i(), a == null ? null : a.j(), f0Var2.w());
                f0Var.s = f0Var2.s;
                f0Var.t = d0Var4;
            } else {
                f0Var = null;
            }
            h0 h0Var = this.D;
            if (h0Var != null) {
                g0 g0Var2 = r5;
                g0 g0Var3 = new g0(gVar, h0Var.k(), h0Var.q(), h0Var.getVisibility(), h0Var.C0(), h0Var.J(), h0Var.l(), i(), a == null ? null : a.m(), h0Var.w());
                g0Var2.s = g0Var2.s;
                g0Var2.V0(h0Var.n().get(0));
                g0Var = g0Var2;
            } else {
                g0Var = null;
            }
            g gVar3 = gVar;
            gVar3.V0(f0Var, g0Var, this.F, this.G);
            gVar3.E = this.E;
            e.a.a.a.y0.l.j<e.a.a.a.y0.j.t.g<?>> jVar2 = this.f8239n;
            if (jVar2 != null) {
                gVar3.K0(jVar2);
            }
            gVar3.s0(g());
            d0 d0Var5 = d0Var;
            if (d0Var5 == null) {
                i0Var = null;
            } else {
                Objects.requireNonNull(h.f7785e);
                i0Var = b.q.a.a.Y(this, d0Var5, h.a.a);
            }
            gVar3.W0(d0Var2, B(), this.z, i0Var);
            return gVar3;
        }
        c0(20);
        throw null;
    }

    public boolean O() {
        d0 d = d();
        if (this.H) {
            i.e(d, "type");
            i.e(d, "$this$canBeUsedForConstVal");
            if (((e.a.a.a.y0.a.g.J(d) || n.a(d)) && !f1.g(d)) || e.a.a.a.y0.a.g.L(d)) {
                e.a.a.a.y0.d.a.e0.b bVar = y.a;
                i.e(d, "$this$hasEnhancedNullability");
                i.e(d, "type");
                e.a.a.a.y0.f.b bVar2 = t.f8582j;
                i.d(bVar2, "JvmAnnotationNames.ENHANCED_NULLABILITY_ANNOTATION");
                i.e(d, "$this$hasAnnotation");
                i.e(bVar2, "fqName");
                if (!b.q.a.a.o1(d, bVar2) || e.a.a.a.y0.a.g.L(d)) {
                    return true;
                }
            }
        }
        return false;
    }

    public e0 P0(k kVar, v vVar, z0 z0Var, f0 f0Var, b.a aVar, d dVar, m0 m0Var) {
        if (kVar == null) {
            c0(13);
            throw null;
        } else if (vVar == null) {
            c0(14);
            throw null;
        } else if (z0Var == null) {
            c0(15);
            throw null;
        } else if (aVar == null) {
            c0(16);
            throw null;
        } else if (dVar != null) {
            return new g(kVar, k(), vVar, z0Var, this.f8238m, dVar, m0Var, f0Var, aVar, this.H, this.I);
        } else {
            c0(17);
            throw null;
        }
    }

    public boolean b0() {
        return false;
    }
}
