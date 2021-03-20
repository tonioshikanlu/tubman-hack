package b.l.a.c.f.i;

public final class k9 implements j9 {
    public static final o3<Boolean> a;

    static {
        m3 m3Var = new m3(f3.a("com.google.android.gms.measurement"));
        a = m3Var.b("measurement.sdk.referrer.delayed_install_referrer_api", false);
        m3Var.a("measurement.id.sdk.referrer.delayed_install_referrer_api", 0);
    }

    public final boolean a() {
        return true;
    }

    public final boolean b() {
        return a.c().booleanValue();
    }
}
