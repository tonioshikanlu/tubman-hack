package e.a.a.a.y0.b.c1;

import e.a.a.a.y0.b.a1.h;
import e.a.a.a.y0.b.k;
import e.a.a.a.y0.b.m0;
import e.a.a.a.y0.f.d;
import e.a.a.a.y0.j.t.g;
import e.a.a.a.y0.l.j;
import e.a.a.a.y0.m.d0;

public abstract class p0 extends o0 {

    /* renamed from: m  reason: collision with root package name */
    public final boolean f8238m;

    /* renamed from: n  reason: collision with root package name */
    public j<g<?>> f8239n;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public p0(k kVar, h hVar, d dVar, d0 d0Var, boolean z, m0 m0Var) {
        super(kVar, hVar, dVar, (d0) null, m0Var);
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
            this.f8238m = z;
        } else {
            c0(3);
            throw null;
        }
    }

    public static /* synthetic */ void c0(int i2) {
        Object[] objArr = new Object[3];
        if (i2 == 1) {
            objArr[0] = "annotations";
        } else if (i2 == 2) {
            objArr[0] = "name";
        } else if (i2 == 3) {
            objArr[0] = "source";
        } else if (i2 != 4) {
            objArr[0] = "containingDeclaration";
        } else {
            objArr[0] = "compileTimeInitializer";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/VariableDescriptorWithInitializerImpl";
        if (i2 != 4) {
            objArr[2] = "<init>";
        } else {
            objArr[2] = "setCompileTimeInitializer";
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    public g<?> H0() {
        j<g<?>> jVar = this.f8239n;
        if (jVar != null) {
            return (g) jVar.e();
        }
        return null;
    }

    public void K0(j<g<?>> jVar) {
        if (jVar != null) {
            this.f8239n = jVar;
        } else {
            c0(4);
            throw null;
        }
    }

    public boolean Q() {
        return this.f8238m;
    }
}
