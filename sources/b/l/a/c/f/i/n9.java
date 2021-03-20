package b.l.a.c.f.i;

public final class n9 implements m9 {
    public static final o3<Boolean> a;

    static {
        m3 m3Var = new m3(f3.a("com.google.android.gms.measurement"));
        m3Var.a("measurement.id.service.use_appinfo_modified", 0);
        a = m3Var.b("measurement.service.use_appinfo_modified", false);
    }

    public final boolean a() {
        return true;
    }

    public final boolean b() {
        return a.c().booleanValue();
    }
}
