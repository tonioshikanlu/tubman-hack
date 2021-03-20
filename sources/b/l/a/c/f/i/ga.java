package b.l.a.c.f.i;

public final class ga implements fa {
    public static final o3<Boolean> a;

    /* renamed from: b  reason: collision with root package name */
    public static final o3<Boolean> f3574b;

    static {
        m3 m3Var = new m3(f3.a("com.google.android.gms.measurement"));
        m3Var.a("measurement.id.lifecycle.app_in_background_parameter", 0);
        a = m3Var.b("measurement.lifecycle.app_backgrounded_engagement", false);
        m3Var.b("measurement.lifecycle.app_backgrounded_tracking", true);
        f3574b = m3Var.b("measurement.lifecycle.app_in_background_parameter", false);
        m3Var.a("measurement.id.lifecycle.app_backgrounded_tracking", 0);
    }

    public final boolean a() {
        return a.c().booleanValue();
    }

    public final boolean b() {
        return f3574b.c().booleanValue();
    }
}
