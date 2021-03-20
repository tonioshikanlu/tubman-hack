package e.a.a.a.y0.b.c1;

import e.a.a.a.y0.b.a1.h;
import e.a.a.a.y0.b.k;
import e.a.a.a.y0.j.y.o.d;

public class h0 extends d {

    /* renamed from: k  reason: collision with root package name */
    public final k f8209k;

    /* renamed from: l  reason: collision with root package name */
    public final d f8210l;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public h0(k kVar, d dVar, h hVar) {
        super(hVar);
        if (kVar == null) {
            c0(0);
            throw null;
        } else if (hVar != null) {
            this.f8209k = kVar;
            this.f8210l = dVar;
        } else {
            c0(2);
            throw null;
        }
    }

    public static /* synthetic */ void c0(int i2) {
        String str = (i2 == 3 || i2 == 4) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[((i2 == 3 || i2 == 4) ? 2 : 3)];
        if (i2 == 1) {
            objArr[0] = "value";
        } else if (i2 == 2) {
            objArr[0] = "annotations";
        } else if (i2 == 3 || i2 == 4) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ReceiverParameterDescriptorImpl";
        } else if (i2 != 5) {
            objArr[0] = "containingDeclaration";
        } else {
            objArr[0] = "newOwner";
        }
        if (i2 == 3) {
            objArr[1] = "getValue";
        } else if (i2 != 4) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ReceiverParameterDescriptorImpl";
        } else {
            objArr[1] = "getContainingDeclaration";
        }
        if (!(i2 == 3 || i2 == 4)) {
            if (i2 != 5) {
                objArr[2] = "<init>";
            } else {
                objArr[2] = "copy";
            }
        }
        String format = String.format(str, objArr);
        throw ((i2 == 3 || i2 == 4) ? new IllegalStateException(format) : new IllegalArgumentException(format));
    }

    public k b() {
        k kVar = this.f8209k;
        if (kVar != null) {
            return kVar;
        }
        c0(4);
        throw null;
    }

    public d getValue() {
        d dVar = this.f8210l;
        if (dVar != null) {
            return dVar;
        }
        c0(3);
        throw null;
    }
}
