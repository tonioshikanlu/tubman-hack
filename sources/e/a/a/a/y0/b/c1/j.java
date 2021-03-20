package e.a.a.a.y0.b.c1;

import e.a.a.a.y0.b.k;
import e.a.a.a.y0.b.m0;
import e.a.a.a.y0.f.d;
import e.a.a.a.y0.l.m;

public abstract class j extends b {

    /* renamed from: l  reason: collision with root package name */
    public final k f8211l;

    /* renamed from: m  reason: collision with root package name */
    public final m0 f8212m;

    /* renamed from: n  reason: collision with root package name */
    public final boolean f8213n;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public j(m mVar, k kVar, d dVar, m0 m0Var, boolean z) {
        super(mVar, dVar);
        if (mVar == null) {
            j0(0);
            throw null;
        } else if (kVar == null) {
            j0(1);
            throw null;
        } else if (dVar == null) {
            j0(2);
            throw null;
        } else if (m0Var != null) {
            this.f8211l = kVar;
            this.f8212m = m0Var;
            this.f8213n = z;
        } else {
            j0(3);
            throw null;
        }
    }

    public static /* synthetic */ void j0(int i2) {
        String str = (i2 == 4 || i2 == 5) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[((i2 == 4 || i2 == 5) ? 2 : 3)];
        if (i2 == 1) {
            objArr[0] = "containingDeclaration";
        } else if (i2 == 2) {
            objArr[0] = "name";
        } else if (i2 == 3) {
            objArr[0] = "source";
        } else if (i2 == 4 || i2 == 5) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassDescriptorBase";
        } else {
            objArr[0] = "storageManager";
        }
        if (i2 == 4) {
            objArr[1] = "getContainingDeclaration";
        } else if (i2 != 5) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassDescriptorBase";
        } else {
            objArr[1] = "getSource";
        }
        if (!(i2 == 4 || i2 == 5)) {
            objArr[2] = "<init>";
        }
        String format = String.format(str, objArr);
        throw ((i2 == 4 || i2 == 5) ? new IllegalStateException(format) : new IllegalArgumentException(format));
    }

    public boolean J() {
        return this.f8213n;
    }

    public k b() {
        k kVar = this.f8211l;
        if (kVar != null) {
            return kVar;
        }
        j0(4);
        throw null;
    }

    public m0 w() {
        m0 m0Var = this.f8212m;
        if (m0Var != null) {
            return m0Var;
        }
        j0(5);
        throw null;
    }
}
