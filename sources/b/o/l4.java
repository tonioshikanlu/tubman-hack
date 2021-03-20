package b.o;

import android.os.Handler;
import android.os.HandlerThread;
import androidx.core.app.NotificationCompat;
import b.l.f.x.a.g;
import b.o.c0;
import b.o.i2;
import b.o.o3;
import java.util.HashMap;
import java.util.Objects;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

public abstract class l4 {
    public final Object a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public o3.a f6176b;
    public boolean c;
    public AtomicBoolean d = new AtomicBoolean();

    /* renamed from: e  reason: collision with root package name */
    public final Queue<i2.h> f6177e = new ConcurrentLinkedQueue();
    public final Queue<i2.o> f = new ConcurrentLinkedQueue();

    /* renamed from: g  reason: collision with root package name */
    public HashMap<Integer, c> f6178g = new HashMap<>();

    /* renamed from: h  reason: collision with root package name */
    public final Object f6179h = new a(this);

    /* renamed from: i  reason: collision with root package name */
    public boolean f6180i = false;

    /* renamed from: j  reason: collision with root package name */
    public f4 f6181j;

    /* renamed from: k  reason: collision with root package name */
    public f4 f6182k;

    public class a {
        public a(l4 l4Var) {
        }
    }

    public static class b {
        public boolean a;

        /* renamed from: b  reason: collision with root package name */
        public JSONObject f6183b;

        public b(boolean z, JSONObject jSONObject) {
            this.a = z;
            this.f6183b = jSONObject;
        }
    }

    public class c extends HandlerThread {

        /* renamed from: h  reason: collision with root package name */
        public int f6184h;

        /* renamed from: i  reason: collision with root package name */
        public Handler f6185i = null;

        /* renamed from: j  reason: collision with root package name */
        public int f6186j;

        public c(int i2) {
            super("OSH_NetworkHandlerThread");
            this.f6184h = i2;
            start();
            this.f6185i = new Handler(getLooper());
        }

        public void a() {
            if (l4.this.c) {
                synchronized (this.f6185i) {
                    this.f6186j = 0;
                    p4 p4Var = null;
                    this.f6185i.removeCallbacksAndMessages((Object) null);
                    Handler handler = this.f6185i;
                    if (this.f6184h == 0) {
                        p4Var = new p4(this);
                    }
                    handler.postDelayed(p4Var, 5000);
                }
            }
        }
    }

    public l4(o3.a aVar) {
        this.f6176b = aVar;
    }

    public static boolean a(l4 l4Var, int i2, String str, String str2) {
        Objects.requireNonNull(l4Var);
        if (i2 == 400 && str != null) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                return jSONObject.has("errors") && jSONObject.optString("errors").contains(str2);
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
        }
    }

    public static void b(l4 l4Var) {
        l4Var.n().o("logoutEmail");
        l4Var.f6182k.o("email_auth_hash");
        l4Var.f6182k.p("parent_player_id");
        l4Var.f6182k.p(NotificationCompat.CATEGORY_EMAIL);
        l4Var.f6182k.k();
        l4Var.f6181j.o("email_auth_hash");
        l4Var.f6181j.p("parent_player_id");
        String optString = l4Var.f6181j.g().a.optString(NotificationCompat.CATEGORY_EMAIL);
        l4Var.f6181j.p(NotificationCompat.CATEGORY_EMAIL);
        o3.a().x();
        i2.k kVar = i2.k.INFO;
        i2.a(kVar, "Device successfully logged out of email: " + optString, (Throwable) null);
        String str = i2.a;
    }

    public static void c(l4 l4Var) {
        Objects.requireNonNull(l4Var);
        i2.a(i2.k.WARN, "Creating new player based on missing player_id noted above.", (Throwable) null);
        String str = i2.a;
        l4Var.u();
        l4Var.z((String) null);
        l4Var.v();
    }

    public static void d(l4 l4Var, int i2) {
        boolean hasMessages;
        Objects.requireNonNull(l4Var);
        p4 p4Var = null;
        if (i2 == 403) {
            i2.a(i2.k.FATAL, "403 error updating player, omitting further retries!", (Throwable) null);
        } else {
            c l2 = l4Var.l(0);
            synchronized (l2.f6185i) {
                boolean z = l2.f6186j < 3;
                boolean hasMessages2 = l2.f6185i.hasMessages(0);
                if (z && !hasMessages2) {
                    int i3 = l2.f6186j + 1;
                    l2.f6186j = i3;
                    Handler handler = l2.f6185i;
                    if (l2.f6184h == 0) {
                        p4Var = new p4(l2);
                    }
                    handler.postDelayed(p4Var, (long) (i3 * 15000));
                }
                hasMessages = l2.f6185i.hasMessages(0);
            }
            if (hasMessages) {
                return;
            }
        }
        l4Var.i();
    }

    public void A(c0.d dVar) {
        f4 o2 = o();
        Objects.requireNonNull(o2);
        try {
            HashMap hashMap = new HashMap();
            hashMap.put("lat", dVar.a);
            hashMap.put("long", dVar.f6036b);
            hashMap.put("loc_acc", dVar.c);
            hashMap.put("loc_type", dVar.d);
            o2.n(o2.c, hashMap);
            HashMap hashMap2 = new HashMap();
            hashMap2.put("loc_bg", dVar.f6037e);
            hashMap2.put("loc_time_stamp", dVar.f);
            o2.n(o2.f6099b, hashMap2);
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
    }

    public abstract void e(JSONObject jSONObject);

    public final void f() {
        while (true) {
            i2.o poll = this.f.poll();
            if (poll != null) {
                poll.a(this.f6176b.name().toLowerCase(), false);
            } else {
                return;
            }
        }
    }

    public final void g() {
        while (true) {
            i2.o poll = this.f.poll();
            if (poll != null) {
                poll.a(this.f6176b.name().toLowerCase(), true);
            } else {
                return;
            }
        }
    }

    public abstract void h(JSONObject jSONObject);

    public final void i() {
        JSONObject b2 = this.f6181j.b(this.f6182k, false);
        if (b2 != null) {
            h(b2);
        }
        if (n().e().a.optBoolean("logoutEmail", false)) {
            String str = i2.a;
        }
    }

    public abstract String j();

    public abstract i2.k k();

    public c l(Integer num) {
        c cVar;
        synchronized (this.f6179h) {
            if (!this.f6178g.containsKey(num)) {
                this.f6178g.put(num, new c(num.intValue()));
            }
            cVar = this.f6178g.get(num);
        }
        return cVar;
    }

    public String m() {
        return n().g().a.optString("identifier", (String) null);
    }

    public f4 n() {
        synchronized (this.a) {
            if (this.f6182k == null) {
                this.f6182k = r("TOSYNC_STATE", true);
            }
        }
        return this.f6182k;
    }

    public f4 o() {
        if (this.f6182k == null) {
            synchronized (this.a) {
                if (this.f6181j == null) {
                    this.f6181j = r("CURRENT_STATE", true);
                }
            }
            f4 f4Var = this.f6181j;
            f4 j2 = f4Var.j("TOSYNC_STATE");
            try {
                j2.f6099b = f4Var.f();
                j2.c = f4Var.h();
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
            this.f6182k = j2;
        }
        v();
        return this.f6182k;
    }

    public void p() {
        synchronized (this.a) {
            if (this.f6181j == null) {
                this.f6181j = r("CURRENT_STATE", true);
            }
        }
        n();
    }

    public final boolean q() {
        return (n().e().a.optBoolean("session") || j() == null) && !this.f6180i;
    }

    public abstract f4 r(String str, boolean z);

    public abstract void s(JSONObject jSONObject);

    public boolean t() {
        boolean z = false;
        if (this.f6182k == null) {
            return false;
        }
        synchronized (this.a) {
            if (this.f6181j.b(this.f6182k, q()) != null) {
                z = true;
            }
            this.f6182k.k();
        }
        return z;
    }

    public void u() {
        f4 f4Var = this.f6181j;
        JSONObject jSONObject = new JSONObject();
        Objects.requireNonNull(f4Var);
        synchronized (f4.d) {
            f4Var.c = jSONObject;
        }
        this.f6181j.k();
    }

    public abstract void v();

    public final void w() {
        JSONObject jSONObject = o3.d(false).f6183b;
        while (true) {
            i2.h poll = this.f6177e.poll();
            if (poll != null) {
                poll.b(jSONObject);
            } else {
                return;
            }
        }
    }

    public void x() {
        try {
            synchronized (this.a) {
                o().m("session", Boolean.TRUE);
                o().k();
            }
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
    }

    public void y(boolean z) {
        JSONObject q2;
        String str;
        this.d.set(true);
        String j2 = j();
        if (!n().e().a.optBoolean("logoutEmail", false) || j2 == null) {
            if (this.f6181j == null) {
                p();
            }
            boolean z2 = !z && q();
            synchronized (this.a) {
                JSONObject b2 = this.f6181j.b(n(), z2);
                f4 n2 = n();
                f4 f4Var = this.f6181j;
                Objects.requireNonNull(f4Var);
                synchronized (f4.d) {
                    q2 = g.q(f4Var.f6099b, n2.f6099b, (JSONObject) null, (Set<String>) null);
                }
                if (b2 == null) {
                    this.f6181j.l(q2, (JSONObject) null);
                    w();
                    g();
                } else {
                    n().k();
                    if (z2) {
                        if (j2 == null) {
                            str = "players";
                        } else {
                            str = b.e.a.a.a.n("players/", j2, "/on_session");
                        }
                        this.f6180i = true;
                        e(b2);
                        g.b0(str, b2, new o4(this, q2, b2, j2));
                    } else if (j2 == null) {
                        i2.a(k(), "Error updating the user record because of the null user id", (Throwable) null);
                        i2.t tVar = new i2.t(-1, "Unable to update tags: the current user is not registered with OneSignal");
                        while (true) {
                            i2.h poll = this.f6177e.poll();
                            if (poll == null) {
                                break;
                            }
                            poll.a(tVar);
                        }
                        f();
                    } else {
                        g.U(b.e.a.a.a.m("players/", j2), "PUT", b2, new n4(this, b2, q2), 120000, (String) null);
                    }
                }
            }
        } else {
            String n3 = b.e.a.a.a.n("players/", j2, "/email_logout");
            JSONObject jSONObject = new JSONObject();
            try {
                v e2 = this.f6181j.e();
                if (e2.a.has("email_auth_hash")) {
                    jSONObject.put("email_auth_hash", e2.a.optString("email_auth_hash"));
                }
                v g2 = this.f6181j.g();
                if (g2.a.has("parent_player_id")) {
                    jSONObject.put("parent_player_id", g2.a.optString("parent_player_id"));
                }
                jSONObject.put("app_id", g2.a.optString("app_id"));
            } catch (JSONException e3) {
                e3.printStackTrace();
            }
            g.b0(n3, jSONObject, new m4(this));
        }
        this.d.set(false);
    }

    public abstract void z(String str);
}
