package b.l.a.c.i.b;

import android.content.SharedPreferences;
import androidx.annotation.WorkerThread;
import b.l.a.c.b.a;
import b.l.a.c.c.p.c;
import java.util.Objects;

public final class v3 {
    public final String a;

    /* renamed from: b  reason: collision with root package name */
    public final String f4308b;
    public final String c;
    public final long d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ x3 f4309e;

    public /* synthetic */ v3(x3 x3Var, long j2) {
        this.f4309e = x3Var;
        a.x("health_monitor");
        a.j(j2 > 0);
        this.a = "health_monitor:start";
        this.f4308b = "health_monitor:count";
        this.c = "health_monitor:value";
        this.d = j2;
    }

    @WorkerThread
    public final void a() {
        this.f4309e.h();
        Objects.requireNonNull((c) this.f4309e.a.f4121n);
        long currentTimeMillis = System.currentTimeMillis();
        SharedPreferences.Editor edit = this.f4309e.o().edit();
        edit.remove(this.f4308b);
        edit.remove(this.c);
        edit.putLong(this.a, currentTimeMillis);
        edit.apply();
    }
}
