package e.a.a.a.y0.b.c1;

import b.e.a.a.a;
import e.a.a.a.y0.b.a1.h;
import e.a.a.a.y0.b.e;
import e.a.a.a.y0.b.k;
import e.a.a.a.y0.j.y.o.c;
import e.a.a.a.y0.j.y.o.d;
import java.util.Objects;

public class s extends d {

    /* renamed from: k  reason: collision with root package name */
    public final e f8263k;

    /* renamed from: l  reason: collision with root package name */
    public final c f8264l;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public s(e eVar) {
        super(h.a.a);
        if (eVar != null) {
            Objects.requireNonNull(h.f7785e);
            this.f8263k = eVar;
            this.f8264l = new c(eVar, (c) null);
            return;
        }
        c0(0);
        throw null;
    }

    public static /* synthetic */ void c0(int i2) {
        String str = (i2 == 1 || i2 == 2) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[((i2 == 1 || i2 == 2) ? 2 : 3)];
        if (i2 == 1 || i2 == 2) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/LazyClassReceiverParameterDescriptor";
        } else if (i2 != 3) {
            objArr[0] = "descriptor";
        } else {
            objArr[0] = "newOwner";
        }
        if (i2 == 1) {
            objArr[1] = "getValue";
        } else if (i2 != 2) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/LazyClassReceiverParameterDescriptor";
        } else {
            objArr[1] = "getContainingDeclaration";
        }
        if (!(i2 == 1 || i2 == 2)) {
            if (i2 != 3) {
                objArr[2] = "<init>";
            } else {
                objArr[2] = "copy";
            }
        }
        String format = String.format(str, objArr);
        throw ((i2 == 1 || i2 == 2) ? new IllegalStateException(format) : new IllegalArgumentException(format));
    }

    public k b() {
        e eVar = this.f8263k;
        if (eVar != null) {
            return eVar;
        }
        c0(2);
        throw null;
    }

    public d getValue() {
        c cVar = this.f8264l;
        if (cVar != null) {
            return cVar;
        }
        c0(1);
        throw null;
    }

    public String toString() {
        StringBuilder y = a.y("class ");
        y.append(this.f8263k.getName());
        y.append("::this");
        return y.toString();
    }
}
