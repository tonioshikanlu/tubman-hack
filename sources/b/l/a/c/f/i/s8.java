package b.l.a.c.f.i;

import com.amplitude.api.Constants;

public final class s8 implements r8 {
    public static final o3<Long> A;
    public static final o3<Long> B;
    public static final o3<Long> C;
    public static final o3<Long> D;
    public static final o3<Long> E;
    public static final o3<Long> F;
    public static final o3<Long> G;
    public static final o3<String> H;
    public static final o3<Long> I;
    public static final o3<Long> a;

    /* renamed from: b  reason: collision with root package name */
    public static final o3<Long> f3730b;
    public static final o3<Long> c;
    public static final o3<String> d;

    /* renamed from: e  reason: collision with root package name */
    public static final o3<String> f3731e;
    public static final o3<Long> f;

    /* renamed from: g  reason: collision with root package name */
    public static final o3<Long> f3732g;

    /* renamed from: h  reason: collision with root package name */
    public static final o3<Long> f3733h;

    /* renamed from: i  reason: collision with root package name */
    public static final o3<Long> f3734i;

    /* renamed from: j  reason: collision with root package name */
    public static final o3<Long> f3735j;

    /* renamed from: k  reason: collision with root package name */
    public static final o3<Long> f3736k;

    /* renamed from: l  reason: collision with root package name */
    public static final o3<Long> f3737l;

    /* renamed from: m  reason: collision with root package name */
    public static final o3<Long> f3738m;

    /* renamed from: n  reason: collision with root package name */
    public static final o3<Long> f3739n;

    /* renamed from: o  reason: collision with root package name */
    public static final o3<Long> f3740o;

    /* renamed from: p  reason: collision with root package name */
    public static final o3<Long> f3741p;

    /* renamed from: q  reason: collision with root package name */
    public static final o3<Long> f3742q;
    public static final o3<Long> r;
    public static final o3<Long> s;
    public static final o3<Long> t;
    public static final o3<Long> u;
    public static final o3<Long> v;
    public static final o3<Long> w;
    public static final o3<Long> x;
    public static final o3<Long> y;
    public static final o3<Long> z;

    static {
        m3 m3Var = new m3(f3.a("com.google.android.gms.measurement"));
        a = m3Var.a("measurement.ad_id_cache_time", 10000);
        f3730b = m3Var.a("measurement.max_bundles_per_iteration", 100);
        c = m3Var.a("measurement.config.cache_time", 86400000);
        new l3(m3Var, "measurement.log_tag", "FA");
        d = new l3(m3Var, "measurement.config.url_authority", "app-measurement.com");
        f3731e = new l3(m3Var, "measurement.config.url_scheme", "https");
        f = m3Var.a("measurement.upload.debug_upload_interval", 1000);
        f3732g = m3Var.a("measurement.lifetimevalue.max_currency_tracked", 4);
        f3733h = m3Var.a("measurement.store.max_stored_events_per_app", 100000);
        f3734i = m3Var.a("measurement.experiment.max_ids", 50);
        f3735j = m3Var.a("measurement.audience.filter_result_max_count", 200);
        f3736k = m3Var.a("measurement.alarm_manager.minimum_interval", 60000);
        f3737l = m3Var.a("measurement.upload.minimum_delay", 500);
        f3738m = m3Var.a("measurement.monitoring.sample_period_millis", 86400000);
        f3739n = m3Var.a("measurement.upload.realtime_upload_interval", 10000);
        f3740o = m3Var.a("measurement.upload.refresh_blacklisted_config_interval", 604800000);
        m3Var.a("measurement.config.cache_time.service", 3600000);
        f3741p = m3Var.a("measurement.service_client.idle_disconnect_millis", 5000);
        new l3(m3Var, "measurement.log_tag.service", "FA-SVC");
        f3742q = m3Var.a("measurement.upload.stale_data_deletion_interval", 86400000);
        r = m3Var.a("measurement.sdk.attribution.cache.ttl", 604800000);
        s = m3Var.a("measurement.upload.backoff_period", 43200000);
        t = m3Var.a("measurement.upload.initial_upload_delay_time", 15000);
        u = m3Var.a("measurement.upload.interval", 3600000);
        v = m3Var.a("measurement.upload.max_bundle_size", 65536);
        w = m3Var.a("measurement.upload.max_bundles", 100);
        x = m3Var.a("measurement.upload.max_conversions_per_day", 500);
        y = m3Var.a("measurement.upload.max_error_events_per_day", 1000);
        z = m3Var.a("measurement.upload.max_events_per_bundle", 1000);
        A = m3Var.a("measurement.upload.max_events_per_day", 100000);
        B = m3Var.a("measurement.upload.max_public_events_per_day", 50000);
        C = m3Var.a("measurement.upload.max_queue_time", 2419200000L);
        D = m3Var.a("measurement.upload.max_realtime_events_per_day", 10);
        E = m3Var.a("measurement.upload.max_batch_size", 65536);
        F = m3Var.a("measurement.upload.retry_count", 6);
        G = m3Var.a("measurement.upload.retry_time", Constants.SESSION_TIMEOUT_MILLIS);
        H = new l3(m3Var, "measurement.upload.url", "https://app-measurement.com/a");
        I = m3Var.a("measurement.upload.window_interval", 3600000);
    }

    public final long A() {
        return r.c().longValue();
    }

    public final long B() {
        return C.c().longValue();
    }

    public final long C() {
        return s.c().longValue();
    }

    public final long D() {
        return D.c().longValue();
    }

    public final long E() {
        return I.c().longValue();
    }

    public final long F() {
        return E.c().longValue();
    }

    public final long G() {
        return x.c().longValue();
    }

    public final long H() {
        return A.c().longValue();
    }

    public final long I() {
        return t.c().longValue();
    }

    public final long a() {
        return a.c().longValue();
    }

    public final long b() {
        return f3730b.c().longValue();
    }

    public final long c() {
        return c.c().longValue();
    }

    public final String d() {
        return d.c();
    }

    public final String e() {
        return f3731e.c();
    }

    public final long f() {
        return f3734i.c().longValue();
    }

    public final long g() {
        return f3733h.c().longValue();
    }

    public final long h() {
        return f3735j.c().longValue();
    }

    public final long i() {
        return f.c().longValue();
    }

    public final long j() {
        return f3736k.c().longValue();
    }

    public final long k() {
        return f3742q.c().longValue();
    }

    public final long l() {
        return f3741p.c().longValue();
    }

    public final long m() {
        return G.c().longValue();
    }

    public final long n() {
        return f3739n.c().longValue();
    }

    public final long o() {
        return w.c().longValue();
    }

    public final String p() {
        return H.c();
    }

    public final long q() {
        return f3740o.c().longValue();
    }

    public final long r() {
        return f3732g.c().longValue();
    }

    public final long s() {
        return f3737l.c().longValue();
    }

    public final long t() {
        return F.c().longValue();
    }

    public final long u() {
        return y.c().longValue();
    }

    public final long v() {
        return B.c().longValue();
    }

    public final long w() {
        return u.c().longValue();
    }

    public final long x() {
        return z.c().longValue();
    }

    public final long y() {
        return f3738m.c().longValue();
    }

    public final long z() {
        return v.c().longValue();
    }
}
