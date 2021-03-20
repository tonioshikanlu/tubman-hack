package e.a.a.a.y0.j.y.o;

import e.a.a.a.y0.b.a;
import e.a.a.a.y0.m.d0;

public class b extends a implements d {
    public final a c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b(a aVar, d0 d0Var, d dVar) {
        super(d0Var, dVar);
        if (aVar != null) {
            this.c = aVar;
            return;
        }
        b(0);
        throw null;
    }

    public static /* synthetic */ void b(int i2) {
        String str = i2 != 2 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[(i2 != 2 ? 3 : 2)];
        if (i2 == 1) {
            objArr[0] = "receiverType";
        } else if (i2 == 2) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/scopes/receivers/ExtensionReceiver";
        } else if (i2 != 3) {
            objArr[0] = "callableDescriptor";
        } else {
            objArr[0] = "newType";
        }
        if (i2 != 2) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/scopes/receivers/ExtensionReceiver";
        } else {
            objArr[1] = "getDeclarationDescriptor";
        }
        if (i2 != 2) {
            if (i2 != 3) {
                objArr[2] = "<init>";
            } else {
                objArr[2] = "replaceType";
            }
        }
        String format = String.format(str, objArr);
        throw (i2 != 2 ? new IllegalArgumentException(format) : new IllegalStateException(format));
    }

    public String toString() {
        return d() + ": Ext {" + this.c + "}";
    }
}
