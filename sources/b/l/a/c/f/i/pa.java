package b.l.a.c.f.i;

public final class pa implements oa {
    public static final o3<Boolean> a;

    /* renamed from: b  reason: collision with root package name */
    public static final o3<Double> f3682b;
    public static final o3<Long> c;
    public static final o3<Long> d;

    /* renamed from: e  reason: collision with root package name */
    public static final o3<String> f3683e;

    static {
        m3 m3Var = new m3(f3.a("com.google.android.gms.measurement"));
        a = m3Var.b("measurement.test.boolean_flag", false);
        f3682b = new k3(m3Var, Double.valueOf(-3.0d));
        c = m3Var.a("measurement.test.int_flag", -2);
        d = m3Var.a("measurement.test.long_flag", -1);
        f3683e = new l3(m3Var, "measurement.test.string_flag", "---");
    }

    public final boolean a() {
        return a.c().booleanValue();
    }

    public final double b() {
        return f3682b.c().doubleValue();
    }

    public final long c() {
        return c.c().longValue();
    }

    public final long d() {
        return d.c().longValue();
    }

    public final String e() {
        return f3683e.c();
    }
}
