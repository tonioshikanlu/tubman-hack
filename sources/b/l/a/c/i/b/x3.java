package b.l.a.c.i.b;

import android.content.SharedPreferences;
import android.util.Pair;
import androidx.annotation.WorkerThread;
import com.amplitude.api.Constants;
import java.util.Objects;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

public final class x3 extends g5 {
    public static final Pair<String, Long> C = new Pair<>("", 0L);
    public final u3 A = new u3(this, "deferred_attribution_cache_timestamp", 0);
    public final t3 B = new t3(this);
    public SharedPreferences c;
    public v3 d;

    /* renamed from: e  reason: collision with root package name */
    public final u3 f4353e = new u3(this, "last_upload", 0);
    public final u3 f = new u3(this, "last_upload_attempt", 0);

    /* renamed from: g  reason: collision with root package name */
    public final u3 f4354g = new u3(this, "backoff", 0);

    /* renamed from: h  reason: collision with root package name */
    public final u3 f4355h = new u3(this, "last_delete_stale", 0);

    /* renamed from: i  reason: collision with root package name */
    public final u3 f4356i = new u3(this, "midnight_offset", 0);

    /* renamed from: j  reason: collision with root package name */
    public final u3 f4357j = new u3(this, "first_open_time", 0);

    /* renamed from: k  reason: collision with root package name */
    public final u3 f4358k = new u3(this, "app_install_time", 0);

    /* renamed from: l  reason: collision with root package name */
    public final w3 f4359l = new w3(this, "app_instance_id");

    /* renamed from: m  reason: collision with root package name */
    public String f4360m;

    /* renamed from: n  reason: collision with root package name */
    public boolean f4361n;

    /* renamed from: o  reason: collision with root package name */
    public long f4362o;

    /* renamed from: p  reason: collision with root package name */
    public final u3 f4363p = new u3(this, "session_timeout", Constants.SESSION_TIMEOUT_MILLIS);

    /* renamed from: q  reason: collision with root package name */
    public final s3 f4364q = new s3(this, "start_new_session", true);
    public final w3 r = new w3(this, "non_personalized_ads");
    public final s3 s = new s3(this, "allow_remote_dynamite", false);
    public final u3 t = new u3(this, "last_pause_time", 0);
    public boolean u;
    public final s3 v = new s3(this, "app_backgrounded", false);
    public final s3 w = new s3(this, "deep_link_retrieval_complete", false);
    public final u3 x = new u3(this, "deep_link_retrieval_attempts", 0);
    public final w3 y = new w3(this, "firebase_feature_rollouts");
    public final w3 z = new w3(this, "deferred_attribution_cache");

    public x3(l4 l4Var) {
        super(l4Var);
    }

    public final boolean i() {
        return true;
    }

    @WorkerThread
    @EnsuresNonNull.List({@EnsuresNonNull({"this.preferences"}), @EnsuresNonNull({"this.monitoringSample"})})
    public final void j() {
        SharedPreferences sharedPreferences = this.a.a.getSharedPreferences("com.google.android.gms.measurement.prefs", 0);
        this.c = sharedPreferences;
        boolean z2 = sharedPreferences.getBoolean("has_been_opened", false);
        this.u = z2;
        if (!z2) {
            SharedPreferences.Editor edit = this.c.edit();
            edit.putBoolean("has_been_opened", true);
            edit.apply();
        }
        f fVar = this.a.f4114g;
        this.d = new v3(this, Math.max(0, x2.c.a(null).longValue()));
    }

    @WorkerThread
    public final SharedPreferences o() {
        h();
        l();
        Objects.requireNonNull(this.c, "null reference");
        return this.c;
    }

    @WorkerThread
    public final void p(Boolean bool) {
        h();
        SharedPreferences.Editor edit = o().edit();
        if (bool != null) {
            edit.putBoolean("measurement_enabled", bool.booleanValue());
        } else {
            edit.remove("measurement_enabled");
        }
        edit.apply();
    }

    @WorkerThread
    public final Boolean q() {
        h();
        if (o().contains("measurement_enabled")) {
            return Boolean.valueOf(o().getBoolean("measurement_enabled", true));
        }
        return null;
    }

    @WorkerThread
    public final boolean r(int i2) {
        return g.i(i2, o().getInt("consent_source", 100));
    }

    @WorkerThread
    public final g s() {
        h();
        return g.b(o().getString("consent_settings", "G1"));
    }

    @WorkerThread
    public final void t(boolean z2) {
        h();
        this.a.a().f4096n.b("App measurement setting deferred collection", Boolean.valueOf(z2));
        SharedPreferences.Editor edit = o().edit();
        edit.putBoolean("deferred_analytics_collection", z2);
        edit.apply();
    }

    public final boolean u(long j2) {
        return j2 - this.f4363p.a() > this.t.a();
    }
}
