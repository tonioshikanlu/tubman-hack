package e.a.a.a.y0.b.c1;

import e.a.a.a.y0.b.a1.b;
import e.a.a.a.y0.b.a1.h;
import e.a.a.a.y0.b.k;
import e.a.a.a.y0.f.d;
import e.a.a.a.y0.i.c;

public abstract class m extends b implements k {

    /* renamed from: i  reason: collision with root package name */
    public final d f8220i;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public m(h hVar, d dVar) {
        super(hVar);
        if (hVar == null) {
            c0(0);
            throw null;
        } else if (dVar != null) {
            this.f8220i = dVar;
        } else {
            c0(1);
            throw null;
        }
    }

    public static /* synthetic */ void c0(int i2) {
        String str = (i2 == 2 || i2 == 3 || i2 == 5 || i2 == 6) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[((i2 == 2 || i2 == 3 || i2 == 5 || i2 == 6) ? 2 : 3)];
        switch (i2) {
            case 1:
                objArr[0] = "name";
                break;
            case 2:
            case 3:
            case 5:
            case 6:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/DeclarationDescriptorImpl";
                break;
            case 4:
                objArr[0] = "descriptor";
                break;
            default:
                objArr[0] = "annotations";
                break;
        }
        if (i2 == 2) {
            objArr[1] = "getName";
        } else if (i2 == 3) {
            objArr[1] = "getOriginal";
        } else if (i2 == 5 || i2 == 6) {
            objArr[1] = "toString";
        } else {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/DeclarationDescriptorImpl";
        }
        if (!(i2 == 2 || i2 == 3)) {
            if (i2 == 4) {
                objArr[2] = "toString";
            } else if (!(i2 == 5 || i2 == 6)) {
                objArr[2] = "<init>";
            }
        }
        String format = String.format(str, objArr);
        throw ((i2 == 2 || i2 == 3 || i2 == 5 || i2 == 6) ? new IllegalStateException(format) : new IllegalArgumentException(format));
    }

    public static String e0(k kVar) {
        try {
            String str = c.f9317b.q(kVar) + "[" + kVar.getClass().getSimpleName() + "@" + Integer.toHexString(System.identityHashCode(kVar)) + "]";
            if (str != null) {
                return str;
            }
            c0(5);
            throw null;
        } catch (Throwable unused) {
            String str2 = kVar.getClass().getSimpleName() + " " + kVar.getName();
            if (str2 != null) {
                return str2;
            }
            c0(6);
            throw null;
        }
    }

    public k a() {
        return this;
    }

    public d getName() {
        d dVar = this.f8220i;
        if (dVar != null) {
            return dVar;
        }
        c0(2);
        throw null;
    }

    public String toString() {
        return e0(this);
    }
}
