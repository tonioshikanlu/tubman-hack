package e.a.a.a.y0.f;

public class f {
    public static final d a = d.n("<no name provided>");

    /* renamed from: b  reason: collision with root package name */
    public static final d f9212b = d.l("Companion");
    public static final d c = d.l("no_name_in_PSI_3d19d79d_1ba9_4cd0_b7f5_b46aa3cd5d40");

    static {
        d.n("<root package>");
        d.n("<anonymous>");
    }

    public static /* synthetic */ void a(int i2) {
        String str = i2 != 1 ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i2 != 1 ? 2 : 3)];
        if (i2 != 1) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/name/SpecialNames";
        } else {
            objArr[0] = "name";
        }
        if (i2 != 1) {
            objArr[1] = "safeIdentifier";
        } else {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/name/SpecialNames";
        }
        if (i2 == 1) {
            objArr[2] = "isSafeIdentifier";
        }
        String format = String.format(str, objArr);
        throw (i2 != 1 ? new IllegalStateException(format) : new IllegalArgumentException(format));
    }
}
