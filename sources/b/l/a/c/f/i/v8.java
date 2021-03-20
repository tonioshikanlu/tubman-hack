package b.l.a.c.f.i;

public final class v8 implements u8 {
    public static final o3<Boolean> a;

    /* renamed from: b  reason: collision with root package name */
    public static final o3<Boolean> f3784b;
    public static final o3<Boolean> c;
    public static final o3<Long> d;

    static {
        m3 m3Var = new m3(f3.a("com.google.android.gms.measurement"));
        a = m3Var.b("measurement.client.consent_state_v1", true);
        f3784b = m3Var.b("measurement.client.3p_consent_state_v1", false);
        c = m3Var.b("measurement.service.consent_state_v1_W36", true);
        m3Var.a("measurement.id.service.consent_state_v1_W36", 0);
        d = m3Var.a("measurement.service.storage_consent_support_version", 203590);
    }

    public final boolean a() {
        return true;
    }

    public final boolean b() {
        return a.c().booleanValue();
    }

    public final boolean c() {
        return f3784b.c().booleanValue();
    }

    public final boolean d() {
        return c.c().booleanValue();
    }

    public final long e() {
        return d.c().longValue();
    }
}
