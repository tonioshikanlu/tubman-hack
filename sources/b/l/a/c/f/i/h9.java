package b.l.a.c.f.i;

public final class h9 implements g9 {
    public static final o3<Boolean> a;

    /* renamed from: b  reason: collision with root package name */
    public static final o3<Boolean> f3592b;
    public static final o3<Boolean> c;

    static {
        m3 m3Var = new m3(f3.a("com.google.android.gms.measurement"));
        m3Var.b("measurement.service.audience.fix_skip_audience_with_failed_filters", true);
        a = m3Var.b("measurement.audience.refresh_event_count_filters_timestamp", false);
        f3592b = m3Var.b("measurement.audience.use_bundle_end_timestamp_for_non_sequence_property_filters", false);
        c = m3Var.b("measurement.audience.use_bundle_timestamp_for_event_count_filters", false);
    }

    public final boolean a() {
        return true;
    }

    public final boolean b() {
        return a.c().booleanValue();
    }

    public final boolean c() {
        return f3592b.c().booleanValue();
    }

    public final boolean d() {
        return c.c().booleanValue();
    }
}
