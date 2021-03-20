package b.l.d.v;

import android.os.Build;
import android.os.Bundle;
import androidx.core.app.NotificationCompat;
import b.l.a.c.k.i;
import b.l.d.a0.h;
import b.l.d.d;
import java.util.concurrent.Executor;

public final class t0 implements b {
    public final d a;

    /* renamed from: b  reason: collision with root package name */
    public final q f5341b;
    public final w c;
    public final Executor d;

    /* renamed from: e  reason: collision with root package name */
    public final h f5342e;

    public t0(d dVar, q qVar, Executor executor, h hVar) {
        dVar.a();
        w wVar = new w(dVar.a, qVar);
        this.a = dVar;
        this.f5341b = qVar;
        this.c = wVar;
        this.d = executor;
        this.f5342e = hVar;
    }

    public final b.l.a.c.k.h<Void> a(String str, String str2, String str3) {
        Bundle bundle = new Bundle();
        String valueOf = String.valueOf(str3);
        bundle.putString("gcm.topic", valueOf.length() != 0 ? "/topics/".concat(valueOf) : new String("/topics/"));
        bundle.putString("delete", "1");
        String valueOf2 = String.valueOf(str3);
        b.l.a.c.k.h<String> g2 = g(f(str, str2, valueOf2.length() != 0 ? "/topics/".concat(valueOf2) : new String("/topics/"), bundle));
        int i2 = j0.a;
        return g2.g(l0.f5329h, new v0());
    }

    public final b.l.a.c.k.h<Void> b(String str, String str2, String str3) {
        Bundle bundle = new Bundle();
        String valueOf = String.valueOf(str3);
        bundle.putString("gcm.topic", valueOf.length() != 0 ? "/topics/".concat(valueOf) : new String("/topics/"));
        String valueOf2 = String.valueOf(str3);
        b.l.a.c.k.h<String> g2 = g(f(str, str2, valueOf2.length() != 0 ? "/topics/".concat(valueOf2) : new String("/topics/"), bundle));
        int i2 = j0.a;
        return g2.g(l0.f5329h, new v0());
    }

    public final boolean c() {
        return false;
    }

    public final b.l.a.c.k.h<String> d(String str, String str2, String str3, String str4) {
        return g(f(str, str3, str4, new Bundle()));
    }

    public final boolean e() {
        return this.f5341b.b() != 0;
    }

    public final b.l.a.c.k.h<Bundle> f(String str, String str2, String str3, Bundle bundle) {
        String str4;
        bundle.putString("scope", str3);
        bundle.putString(NotificationCompat.MessagingStyle.Message.KEY_SENDER, str2);
        bundle.putString("subtype", str2);
        bundle.putString("appid", str);
        d dVar = this.a;
        dVar.a();
        bundle.putString("gmp_app_id", dVar.c.f4918b);
        bundle.putString("gmsv", Integer.toString(this.f5341b.d()));
        bundle.putString("osv", Integer.toString(Build.VERSION.SDK_INT));
        bundle.putString("app_ver", this.f5341b.c());
        q qVar = this.f5341b;
        synchronized (qVar) {
            if (qVar.c == null) {
                qVar.e();
            }
            str4 = qVar.c;
        }
        bundle.putString("app_ver_name", str4);
        bundle.putString("cliv", "fiid-12451000");
        bundle.putString("Firebase-Client", this.f5342e.a());
        i iVar = new i();
        this.d.execute(new s0(this, bundle, iVar));
        return iVar.a;
    }

    public final b.l.a.c.k.h<String> g(b.l.a.c.k.h<Bundle> hVar) {
        return hVar.g(this.d, new u0(this));
    }
}
