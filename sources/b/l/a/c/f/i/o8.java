package b.l.a.c.f.i;

public final class o8 implements n8 {
    public static final o3<Boolean> a;

    static {
        m3 m3Var = new m3(f3.a("com.google.android.gms.measurement"));
        a = m3Var.b("measurement.service.directly_maybe_log_error_events", false);
        m3Var.a("measurement.id.service.directly_maybe_log_error_events", 0);
    }

    public final boolean a() {
        return true;
    }

    public final boolean b() {
        return a.c().booleanValue();
    }
}
