package e.a.a.a.y0.b.c1;

import e.a.a.a.y0.b.a1.h;
import e.a.a.a.y0.b.k;
import e.a.a.a.y0.b.l;
import e.a.a.a.y0.b.m0;
import e.a.a.a.y0.f.d;

public abstract class n extends m implements l {

    /* renamed from: j  reason: collision with root package name */
    public final k f8221j;

    /* renamed from: k  reason: collision with root package name */
    public final m0 f8222k;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public n(k kVar, h hVar, d dVar, m0 m0Var) {
        super(hVar, dVar);
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
            this.f8221j = kVar;
            this.f8222k = m0Var;
        } else {
            c0(3);
            throw null;
        }
    }

    public static /* synthetic */ void c0(int i2) {
        String str = (i2 == 4 || i2 == 5 || i2 == 6) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[((i2 == 4 || i2 == 5 || i2 == 6) ? 2 : 3)];
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
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/DeclarationDescriptorNonRootImpl";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        if (i2 == 4) {
            objArr[1] = "getOriginal";
        } else if (i2 == 5) {
            objArr[1] = "getContainingDeclaration";
        } else if (i2 != 6) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/DeclarationDescriptorNonRootImpl";
        } else {
            objArr[1] = "getSource";
        }
        if (!(i2 == 4 || i2 == 5 || i2 == 6)) {
            objArr[2] = "<init>";
        }
        String format = String.format(str, objArr);
        throw ((i2 == 4 || i2 == 5 || i2 == 6) ? new IllegalStateException(format) : new IllegalArgumentException(format));
    }

    public k b() {
        k kVar = this.f8221j;
        if (kVar != null) {
            return kVar;
        }
        c0(5);
        throw null;
    }

    /* renamed from: j0 */
    public e.a.a.a.y0.b.n a() {
        return this;
    }

    public m0 w() {
        m0 m0Var = this.f8222k;
        if (m0Var != null) {
            return m0Var;
        }
        c0(6);
        throw null;
    }
}
