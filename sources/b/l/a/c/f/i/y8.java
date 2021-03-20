package b.l.a.c.f.i;

public final class y8 implements x8 {
    public static final o3<Boolean> a;

    static {
        m3 m3Var = new m3(f3.a("com.google.android.gms.measurement"));
        a = m3Var.b("measurement.sdk.dynamite.allow_remote_dynamite3", true);
        m3Var.b("measurement.collection.init_params_control_enabled", true);
        m3Var.b("measurement.sdk.dynamite.use_dynamite3", true);
        m3Var.a("measurement.id.sdk.dynamite.use_dynamite", 0);
    }

    public final boolean a() {
        return a.c().booleanValue();
    }
}
