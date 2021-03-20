package e.a.a.a.y0.b.a1;

public class b implements a {

    /* renamed from: h  reason: collision with root package name */
    public final h f7770h;

    public b(h hVar) {
        if (hVar != null) {
            this.f7770h = hVar;
        } else {
            c0(0);
            throw null;
        }
    }

    public static /* synthetic */ void c0(int i2) {
        String str = i2 != 1 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[(i2 != 1 ? 3 : 2)];
        if (i2 != 1) {
            objArr[0] = "annotations";
        } else {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/annotations/AnnotatedImpl";
        }
        if (i2 != 1) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/annotations/AnnotatedImpl";
        } else {
            objArr[1] = "getAnnotations";
        }
        if (i2 != 1) {
            objArr[2] = "<init>";
        }
        String format = String.format(str, objArr);
        throw (i2 != 1 ? new IllegalArgumentException(format) : new IllegalStateException(format));
    }

    public h k() {
        h hVar = this.f7770h;
        if (hVar != null) {
            return hVar;
        }
        c0(1);
        throw null;
    }
}
