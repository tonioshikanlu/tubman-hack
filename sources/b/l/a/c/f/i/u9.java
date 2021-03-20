package b.l.a.c.f.i;

public final class u9 implements t9 {
    public static final o3<Boolean> a;

    static {
        m3 m3Var = new m3(f3.a("com.google.android.gms.measurement"));
        m3Var.b("measurement.collection.efficient_engagement_reporting_enabled_2", true);
        a = m3Var.b("measurement.collection.redundant_engagement_removal_enabled", false);
        m3Var.a("measurement.id.collection.redundant_engagement_removal_enabled", 0);
    }

    public final boolean a() {
        return a.c().booleanValue();
    }
}
