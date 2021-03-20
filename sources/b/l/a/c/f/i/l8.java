package b.l.a.c.f.i;

public final class l8 implements k8 {
    public static final o3<Boolean> a;

    static {
        m3 m3Var = new m3(f3.a("com.google.android.gms.measurement"));
        a = m3Var.b("measurement.androidId.delete_feature", true);
        m3Var.b("measurement.log_androidId_enabled", false);
    }

    public final boolean a() {
        return a.c().booleanValue();
    }
}
