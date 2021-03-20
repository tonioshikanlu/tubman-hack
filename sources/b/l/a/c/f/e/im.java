package b.l.a.c.f.e;

public final class im {
    public static final Class<?> a;

    /* renamed from: b  reason: collision with root package name */
    public static final boolean f3081b;

    static {
        Class<?> cls;
        Class<?> cls2 = null;
        try {
            cls = Class.forName("libcore.io.Memory");
        } catch (Throwable unused) {
            cls = null;
        }
        a = cls;
        try {
            cls2 = Class.forName("org.robolectric.Robolectric");
        } catch (Throwable unused2) {
        }
        f3081b = cls2 != null;
    }

    public static boolean a() {
        return a != null && !f3081b;
    }
}
