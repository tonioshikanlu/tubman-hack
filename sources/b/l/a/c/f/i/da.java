package b.l.a.c.f.i;

public final class da implements ca {
    public static final o3<Boolean> a;

    /* renamed from: b  reason: collision with root package name */
    public static final o3<Boolean> f3518b;
    public static final o3<Boolean> c;
    public static final o3<Boolean> d;

    static {
        m3 m3Var = new m3(f3.a("com.google.android.gms.measurement"));
        a = m3Var.b("measurement.sdk.collection.enable_extend_user_property_size", true);
        f3518b = m3Var.b("measurement.sdk.collection.last_deep_link_referrer2", true);
        c = m3Var.b("measurement.sdk.collection.last_deep_link_referrer_campaign2", false);
        d = m3Var.b("measurement.sdk.collection.last_gclid_from_referrer2", false);
        m3Var.a("measurement.id.sdk.collection.last_deep_link_referrer2", 0);
    }

    public final boolean a() {
        return a.c().booleanValue();
    }

    public final boolean b() {
        return f3518b.c().booleanValue();
    }

    public final boolean c() {
        return c.c().booleanValue();
    }

    public final boolean d() {
        return d.c().booleanValue();
    }
}
