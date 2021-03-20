package b.l.a.c.f.i;

public final class q9 implements p9 {
    public static final o3<Boolean> a;

    static {
        m3 m3Var = new m3(f3.a("com.google.android.gms.measurement"));
        a = m3Var.b("measurement.client.sessions.check_on_reset_and_enable2", true);
        m3Var.b("measurement.client.sessions.check_on_startup", true);
        m3Var.b("measurement.client.sessions.start_session_before_view_screen", true);
    }

    public final boolean a() {
        return true;
    }

    public final boolean b() {
        return a.c().booleanValue();
    }
}
