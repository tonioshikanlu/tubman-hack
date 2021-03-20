package b.l.a.c.i.b;

import android.os.Bundle;
import b.l.a.c.b.a;
import java.util.Objects;

public final class v5 implements Runnable {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ Bundle f4312h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ m6 f4313i;

    public v5(m6 m6Var, Bundle bundle) {
        this.f4313i = m6Var;
        this.f4312h = bundle;
    }

    public final void run() {
        m6 m6Var = this.f4313i;
        Bundle bundle = this.f4312h;
        m6Var.h();
        m6Var.i();
        Objects.requireNonNull(bundle, "null reference");
        String string = bundle.getString("name");
        String string2 = bundle.getString("origin");
        a.x(string);
        a.x(string2);
        Objects.requireNonNull(bundle.get("value"), "null reference");
        if (!m6Var.a.j()) {
            m6Var.a.a().f4096n.a("Conditional property not set since app measurement is disabled");
            return;
        }
        g9 g9Var = new g9(string, bundle.getLong("triggered_timestamp"), bundle.get("value"), string2);
        try {
            s J = m6Var.a.t().J(bundle.getString("app_id"), bundle.getString("triggered_event_name"), bundle.getBundle("triggered_event_params"), string2, 0, true, false);
            s J2 = m6Var.a.t().J(bundle.getString("app_id"), bundle.getString("timed_out_event_name"), bundle.getBundle("timed_out_event_params"), string2, 0, true, false);
            m6Var.a.z().y(new b(bundle.getString("app_id"), string2, g9Var, bundle.getLong("creation_timestamp"), false, bundle.getString("trigger_event_name"), J2, bundle.getLong("trigger_timeout"), J, bundle.getLong("time_to_live"), m6Var.a.t().J(bundle.getString("app_id"), bundle.getString("expired_event_name"), bundle.getBundle("expired_event_params"), string2, 0, true, false)));
        } catch (IllegalArgumentException unused) {
        }
    }
}
