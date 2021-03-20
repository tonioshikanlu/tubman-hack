package b.l.a.c.i.b;

import android.os.Bundle;
import b.l.a.c.b.a;
import java.util.Objects;

public final class w5 implements Runnable {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ Bundle f4332h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ m6 f4333i;

    public w5(m6 m6Var, Bundle bundle) {
        this.f4333i = m6Var;
        this.f4332h = bundle;
    }

    public final void run() {
        m6 m6Var = this.f4333i;
        Bundle bundle = this.f4332h;
        m6Var.h();
        m6Var.i();
        Objects.requireNonNull(bundle, "null reference");
        a.x(bundle.getString("name"));
        if (!m6Var.a.j()) {
            m6Var.a.a().f4096n.a("Conditional property not cleared since app measurement is disabled");
            return;
        }
        g9 g9Var = new g9(bundle.getString("name"), 0, (Object) null, (String) null);
        try {
            s J = m6Var.a.t().J(bundle.getString("app_id"), bundle.getString("expired_event_name"), bundle.getBundle("expired_event_params"), bundle.getString("origin"), bundle.getLong("creation_timestamp"), true, false);
            String string = bundle.getString("app_id");
            String string2 = bundle.getString("origin");
            long j2 = bundle.getLong("creation_timestamp");
            boolean z = bundle.getBoolean("active");
            String string3 = bundle.getString("trigger_event_name");
            String str = string3;
            b bVar = r5;
            b bVar2 = new b(string, string2, g9Var, j2, z, str, (s) null, bundle.getLong("trigger_timeout"), (s) null, bundle.getLong("time_to_live"), J);
            m6Var.a.z().y(bVar);
        } catch (IllegalArgumentException unused) {
        }
    }
}
