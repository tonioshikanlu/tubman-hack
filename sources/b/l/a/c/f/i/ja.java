package b.l.a.c.f.i;

public final class ja implements ia {
    public static final o3<Boolean> a;

    /* renamed from: b  reason: collision with root package name */
    public static final o3<Boolean> f3624b;

    static {
        m3 m3Var = new m3(f3.a("com.google.android.gms.measurement"));
        a = m3Var.b("measurement.sdk.screen.manual_screen_view_logging", true);
        f3624b = m3Var.b("measurement.sdk.screen.disabling_automatic_reporting", true);
    }

    public final boolean a() {
        return true;
    }

    public final boolean b() {
        return a.c().booleanValue();
    }

    public final boolean c() {
        return f3624b.c().booleanValue();
    }
}
