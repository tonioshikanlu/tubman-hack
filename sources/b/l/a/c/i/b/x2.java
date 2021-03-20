package b.l.a.c.i.b;

import android.content.Context;
import b.l.a.c.f.i.f3;
import com.amplitude.api.Constants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

public final class x2 {
    public static final w2<Long> A = b("measurement.upload.initial_upload_delay_time", 15000L, 15000L, m0.a);
    public static final w2<Boolean> A0;
    public static final w2<Long> B;
    public static final w2<Boolean> B0;
    public static final w2<Integer> C = b("measurement.upload.retry_count", 6, 6, o0.a);
    public static final w2<Long> D = b("measurement.upload.max_queue_time", 2419200000L, 2419200000L, p0.a);
    public static final w2<Integer> E = b("measurement.lifetimevalue.max_currency_tracked", 4, 4, q0.a);
    public static final w2<Integer> F = b("measurement.audience.filter_result_max_count", 200, 200, s0.a);
    public static final w2<Integer> G = b("measurement.upload.max_public_user_properties", 25, 25, (v2) null);
    public static final w2<Integer> H = b("measurement.upload.max_event_name_cardinality", 500, 500, (v2) null);
    public static final w2<Integer> I = b("measurement.upload.max_public_event_params", 25, 25, (v2) null);
    public static final w2<Long> J = b("measurement.service_client.idle_disconnect_millis", 5000L, 5000L, t0.a);
    public static final w2<Boolean> K;
    public static final w2<String> L = b("measurement.test.string_flag", "---", "---", v0.a);
    public static final w2<Long> M = b("measurement.test.long_flag", -1L, -1L, w0.a);
    public static final w2<Integer> N = b("measurement.test.int_flag", -2, -2, x0.a);
    public static final w2<Double> O;
    public static final w2<Integer> P = b("measurement.experiment.max_ids", 50, 50, z0.a);
    public static final w2<Integer> Q = b("measurement.max_bundles_per_iteration", 100, 100, a1.a);
    public static final w2<Long> R = b("measurement.sdk.attribution.cache.ttl", 604800000L, 604800000L, c1.a);
    public static final w2<Boolean> S;
    public static final w2<Boolean> T;
    public static final w2<Boolean> U;
    public static final w2<Boolean> V;
    public static final w2<Boolean> W;
    public static final w2<Boolean> X;
    public static final w2<Boolean> Y;
    public static final w2<Boolean> Z;
    public static final List<w2<?>> a = Collections.synchronizedList(new ArrayList());
    public static final w2<Boolean> a0;

    /* renamed from: b  reason: collision with root package name */
    public static final w2<Long> f4340b = b("measurement.ad_id_cache_time", 10000L, 10000L, u.a);
    public static final w2<Boolean> b0;
    public static final w2<Long> c = b("measurement.monitoring.sample_period_millis", 86400000L, 86400000L, g0.a);
    public static final w2<Boolean> c0;
    public static final w2<Long> d = b("measurement.config.cache_time", 86400000L, 3600000L, r0.a);
    public static final w2<Boolean> d0;

    /* renamed from: e  reason: collision with root package name */
    public static final w2<String> f4341e = b("measurement.config.url_scheme", "https", "https", d1.a);
    public static final w2<Boolean> e0;
    public static final w2<String> f = b("measurement.config.url_authority", "app-measurement.com", "app-measurement.com", o1.a);
    public static final w2<Boolean> f0;

    /* renamed from: g  reason: collision with root package name */
    public static final w2<Integer> f4342g = b("measurement.upload.max_bundles", 100, 100, z1.a);
    public static final w2<Boolean> g0;

    /* renamed from: h  reason: collision with root package name */
    public static final w2<Integer> f4343h = b("measurement.upload.max_batch_size", 65536, 65536, l2.a);
    public static final w2<Boolean> h0;

    /* renamed from: i  reason: collision with root package name */
    public static final w2<Integer> f4344i = b("measurement.upload.max_bundle_size", 65536, 65536, s2.a);
    public static final w2<Boolean> i0;

    /* renamed from: j  reason: collision with root package name */
    public static final w2<Integer> f4345j = b("measurement.upload.max_events_per_bundle", 1000, 1000, t2.a);
    public static final w2<Boolean> j0;

    /* renamed from: k  reason: collision with root package name */
    public static final w2<Integer> f4346k = b("measurement.upload.max_events_per_day", 100000, 100000, u2.a);
    public static final w2<Boolean> k0;

    /* renamed from: l  reason: collision with root package name */
    public static final w2<Integer> f4347l = b("measurement.upload.max_error_events_per_day", 1000, 1000, v.a);
    public static final w2<Boolean> l0;

    /* renamed from: m  reason: collision with root package name */
    public static final w2<Integer> f4348m = b("measurement.upload.max_public_events_per_day", 50000, 50000, w.a);
    public static final w2<Boolean> m0;

    /* renamed from: n  reason: collision with root package name */
    public static final w2<Integer> f4349n = b("measurement.upload.max_conversions_per_day", 10000, 10000, x.a);
    public static final w2<Boolean> n0;

    /* renamed from: o  reason: collision with root package name */
    public static final w2<Integer> f4350o = b("measurement.upload.max_realtime_events_per_day", 10, 10, y.a);
    public static final w2<Boolean> o0;

    /* renamed from: p  reason: collision with root package name */
    public static final w2<Integer> f4351p = b("measurement.store.max_stored_events_per_app", 100000, 100000, z.a);
    public static final w2<Boolean> p0;

    /* renamed from: q  reason: collision with root package name */
    public static final w2<String> f4352q = b("measurement.upload.url", "https://app-measurement.com/a", "https://app-measurement.com/a", b0.a);
    public static final w2<Boolean> q0;
    public static final w2<Long> r = b("measurement.upload.backoff_period", 43200000L, 43200000L, c0.a);
    public static final w2<Boolean> r0;
    public static final w2<Long> s = b("measurement.upload.window_interval", 3600000L, 3600000L, d0.a);
    public static final w2<Boolean> s0;
    public static final w2<Long> t = b("measurement.upload.interval", 3600000L, 3600000L, e0.a);
    public static final w2<Boolean> t0;
    public static final w2<Long> u = b("measurement.upload.realtime_upload_interval", 10000L, 10000L, f0.a);
    public static final w2<Boolean> u0;
    public static final w2<Long> v = b("measurement.upload.debug_upload_interval", 1000L, 1000L, h0.a);
    public static final w2<Boolean> v0;
    public static final w2<Long> w = b("measurement.upload.minimum_delay", 500L, 500L, i0.a);
    public static final w2<Boolean> w0;
    public static final w2<Long> x = b("measurement.alarm_manager.minimum_interval", 60000L, 60000L, j0.a);
    public static final w2<Boolean> x0;
    public static final w2<Long> y = b("measurement.upload.stale_data_deletion_interval", 86400000L, 86400000L, k0.a);
    public static final w2<Boolean> y0;
    public static final w2<Long> z = b("measurement.upload.refresh_blacklisted_config_interval", 604800000L, 604800000L, l0.a);
    public static final w2<Integer> z0 = b("measurement.service.storage_consent_support_version", 203590, 203590, p2.a);

    static {
        Collections.synchronizedSet(new HashSet());
        Long valueOf = Long.valueOf(Constants.SESSION_TIMEOUT_MILLIS);
        B = b("measurement.upload.retry_time", valueOf, valueOf, n0.a);
        Boolean bool = Boolean.FALSE;
        K = b("measurement.test.boolean_flag", bool, bool, u0.a);
        Double valueOf2 = Double.valueOf(-3.0d);
        O = b("measurement.test.double_flag", valueOf2, valueOf2, y0.a);
        S = b("measurement.validation.internal_limits_internal_event_params", bool, bool, e1.a);
        Boolean bool2 = Boolean.TRUE;
        T = b("measurement.collection.firebase_global_collection_flag_enabled", bool2, bool2, f1.a);
        U = b("measurement.collection.redundant_engagement_removal_enabled", bool, bool, g1.a);
        V = b("measurement.collection.log_event_and_bundle_v2", bool2, bool2, h1.a);
        W = b("measurement.quality.checksum", bool, bool, (v2) null);
        X = b("measurement.sdk.dynamite.allow_remote_dynamite3", bool2, bool2, i1.a);
        Y = b("measurement.sdk.collection.validate_param_names_alphabetical", bool2, bool2, j1.a);
        Z = b("measurement.audience.use_bundle_end_timestamp_for_non_sequence_property_filters", bool, bool, k1.a);
        a0 = b("measurement.audience.refresh_event_count_filters_timestamp", bool, bool, l1.a);
        b0 = b("measurement.audience.use_bundle_timestamp_for_event_count_filters", bool, bool, m1.a);
        c0 = b("measurement.sdk.collection.retrieve_deeplink_from_bow_2", bool2, bool2, n1.a);
        d0 = b("measurement.sdk.collection.last_deep_link_referrer2", bool2, bool2, p1.a);
        e0 = b("measurement.sdk.collection.last_deep_link_referrer_campaign2", bool, bool, q1.a);
        f0 = b("measurement.sdk.collection.last_gclid_from_referrer2", bool, bool, r1.a);
        g0 = b("measurement.sdk.collection.enable_extend_user_property_size", bool2, bool2, s1.a);
        h0 = b("measurement.upload.file_lock_state_check", bool, bool, t1.a);
        i0 = b("measurement.ga.ga_app_id", bool, bool, u1.a);
        j0 = b("measurement.lifecycle.app_in_background_parameter", bool, bool, v1.a);
        k0 = b("measurement.integration.disable_firebase_instance_id", bool, bool, w1.a);
        l0 = b("measurement.lifecycle.app_backgrounded_engagement", bool, bool, x1.a);
        m0 = b("measurement.collection.service.update_with_analytics_fix", bool, bool, y1.a);
        n0 = b("measurement.service.use_appinfo_modified", bool, bool, a2.a);
        o0 = b("measurement.client.firebase_feature_rollout.v1.enable", bool2, bool2, b2.a);
        p0 = b("measurement.client.sessions.check_on_reset_and_enable2", bool2, bool2, d2.a);
        q0 = b("measurement.scheduler.task_thread.cleanup_on_exit", bool, bool, e2.a);
        r0 = b("measurement.upload.file_truncate_fix", bool, bool, f2.a);
        s0 = b("measurement.sdk.referrer.delayed_install_referrer_api", bool, bool, g2.a);
        t0 = b("measurement.sdk.screen.disabling_automatic_reporting", bool2, bool2, h2.a);
        u0 = b("measurement.sdk.screen.manual_screen_view_logging", bool2, bool2, i2.a);
        b("measurement.collection.synthetic_data_mitigation", bool, bool, j2.a);
        v0 = b("measurement.androidId.delete_feature", bool2, bool2, k2.a);
        w0 = b("measurement.client.consent_state_v1", bool2, bool2, m2.a);
        x0 = b("measurement.client.3p_consent_state_v1", bool2, bool2, n2.a);
        y0 = b("measurement.service.consent_state_v1_W36", bool2, bool2, o2.a);
        A0 = b("measurement.service.directly_maybe_log_error_events", bool, bool, q2.a);
        B0 = b("measurement.client.safer_resources", bool2, bool2, r2.a);
    }

    public static Map<String, String> a(Context context) {
        b.l.a.c.f.i.x2 a2 = b.l.a.c.f.i.x2.a(context.getContentResolver(), f3.a("com.google.android.gms.measurement"));
        return a2 == null ? Collections.emptyMap() : a2.b();
    }

    public static <V> w2<V> b(String str, V v2, V v3, v2<V> v2Var) {
        w2<V> w2Var = new w2<>(str, v2, v3, v2Var);
        a.add(w2Var);
        return w2Var;
    }
}
