package b.o;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.os.Build;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import b.l.f.x.a.g;
import b.o.i2;
import com.segment.analytics.internal.Utils;
import java.util.HashSet;
import java.util.Objects;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class c3 {
    public static int a;

    public static class a extends l3 {
        public final /* synthetic */ b a;

        /* renamed from: b.o.c3$a$a  reason: collision with other inner class name */
        public class C0108a implements Runnable {
            public C0108a() {
            }

            public void run() {
                int i2 = (c3.a * 10000) + Utils.DEFAULT_FLUSH_INTERVAL;
                if (i2 > 90000) {
                    i2 = 90000;
                }
                i2.k kVar = i2.k.INFO;
                StringBuilder y = b.e.a.a.a.y("Failed to get Android parameters, trying again in ");
                y.append(i2 / 1000);
                y.append(" seconds.");
                i2.a(kVar, y.toString(), (Throwable) null);
                f2.v(i2);
                c3.a++;
                c3.a(a.this.a);
            }
        }

        public a(b bVar) {
            this.a = bVar;
        }

        public void a(int i2, String str, Throwable th) {
            if (i2 == 403) {
                i2.a(i2.k.FATAL, "403 error getting OneSignal params, omitting further retries!", (Throwable) null);
            } else {
                new Thread(new C0108a(), "OS_PARAMS_REQUEST").start();
            }
        }

        public void b(String str) {
            b bVar = this.a;
            try {
                d3 d3Var = new d3(new JSONObject(str));
                Objects.requireNonNull((p2) bVar);
                i2.P = d3Var;
                String str2 = d3Var.a;
                if (str2 != null) {
                    i2.f6117b = str2;
                }
                String str3 = b3.a;
                b3.i(str3, "GT_FIREBASE_TRACKING_ENABLED", i2.P.d);
                b3.i(str3, "OS_RESTORE_TTL_FILTER", i2.P.f6050e);
                b3.i(str3, "OS_CLEAR_GROUP_SUMMARY_CLICK", i2.P.f);
                b3.i(str3, "PREFS_OS_RECEIVE_RECEIPTS_ENABLED", i2.P.f6051g);
                Objects.requireNonNull(i2.t);
                b3.i(str3, "PREFS_OS_OUTCOMES_V2", d3Var.f6052h.f6048h);
                j1 j1Var = i2.r;
                StringBuilder y = b.e.a.a.a.y("OneSignal saveInfluenceParams: ");
                y.append(d3Var.f6052h.toString());
                ((i1) j1Var).a(y.toString());
                b.o.u4.e eVar = i2.u;
                d dVar = d3Var.f6052h;
                b.o.u4.c cVar = eVar.f6315b;
                Objects.requireNonNull(cVar.a);
                b3.i(str3, "PREFS_OS_DIRECT_ENABLED", dVar.f6046e);
                Objects.requireNonNull(cVar.a);
                b3.i(str3, "PREFS_OS_INDIRECT_ENABLED", dVar.f);
                Objects.requireNonNull(cVar.a);
                b3.i(str3, "PREFS_OS_UNATTRIBUTED_ENABLED", dVar.f6047g);
                z1 z1Var = cVar.a;
                Objects.requireNonNull(z1Var);
                z1Var.a(str3, "PREFS_OS_NOTIFICATION_LIMIT", dVar.f6045b);
                z1 z1Var2 = cVar.a;
                Objects.requireNonNull(z1Var2);
                z1Var2.a(str3, "PREFS_OS_INDIRECT_ATTRIBUTION_WINDOW", dVar.a);
                z1 z1Var3 = cVar.a;
                Objects.requireNonNull(z1Var3);
                z1Var3.a(str3, "PREFS_OS_IAM_LIMIT", dVar.d);
                z1 z1Var4 = cVar.a;
                Objects.requireNonNull(z1Var4);
                z1Var4.a(str3, "PREFS_OS_IAM_INDIRECT_ATTRIBUTION_WINDOW", dVar.c);
                Context context = i2.c;
                JSONArray jSONArray = d3Var.c;
                Pattern pattern = f0.a;
                if (Build.VERSION.SDK_INT >= 26 && jSONArray != null) {
                    NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
                    HashSet hashSet = new HashSet();
                    int length = jSONArray.length();
                    for (int i2 = 0; i2 < length; i2++) {
                        try {
                            hashSet.add(f0.a(context, notificationManager, jSONArray.getJSONObject(i2)));
                        } catch (JSONException e2) {
                            i2.a(i2.k.ERROR, "Could not create notification channel due to JSON payload error!", e2);
                        }
                    }
                    for (NotificationChannel id : notificationManager.getNotificationChannels()) {
                        String id2 = id.getId();
                        if (id2.startsWith("OS_") && !hashSet.contains(id2)) {
                            notificationManager.deleteNotificationChannel(id2);
                        }
                    }
                }
                i2.y();
            } catch (NullPointerException | JSONException e3) {
                i2.k kVar = i2.k.FATAL;
                i2.a(kVar, "Error parsing android_params!: ", e3);
                i2.a(kVar, "Response that errored from android_params!: " + str, (Throwable) null);
            }
        }
    }

    public interface b {
    }

    public static class c {
        @Nullable
        public String a;
        @Nullable

        /* renamed from: b  reason: collision with root package name */
        public String f6044b;
        @Nullable
        public String c;
    }

    public static class d {
        public int a = 1440;

        /* renamed from: b  reason: collision with root package name */
        public int f6045b = 10;
        public int c = 1440;
        public int d = 10;

        /* renamed from: e  reason: collision with root package name */
        public boolean f6046e = false;
        public boolean f = false;

        /* renamed from: g  reason: collision with root package name */
        public boolean f6047g = false;

        /* renamed from: h  reason: collision with root package name */
        public boolean f6048h = false;

        public String toString() {
            StringBuilder y = b.e.a.a.a.y("InfluenceParams{indirectNotificationAttributionWindow=");
            y.append(this.a);
            y.append(", notificationLimit=");
            y.append(this.f6045b);
            y.append(", indirectIAMAttributionWindow=");
            y.append(this.c);
            y.append(", iamLimit=");
            y.append(this.d);
            y.append(", directEnabled=");
            y.append(this.f6046e);
            y.append(", indirectEnabled=");
            y.append(this.f);
            y.append(", unattributedEnabled=");
            y.append(this.f6047g);
            y.append('}');
            return y.toString();
        }
    }

    public static class e {
        public String a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f6049b;
        public JSONArray c;
        public boolean d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f6050e;
        public boolean f;

        /* renamed from: g  reason: collision with root package name */
        public boolean f6051g;

        /* renamed from: h  reason: collision with root package name */
        public d f6052h;

        /* renamed from: i  reason: collision with root package name */
        public c f6053i;
    }

    public static void a(@NonNull b bVar) {
        a aVar = new a(bVar);
        String q2 = b.e.a.a.a.q(b.e.a.a.a.y("apps/"), i2.a, "/android_params.js");
        String r = i2.r();
        if (r != null) {
            q2 = b.e.a.a.a.n(q2, "?player_id=", r);
        }
        i2.a(i2.k.DEBUG, "Starting request to get Android parameters.", (Throwable) null);
        g.r(q2, aVar, "CACHE_KEY_REMOTE_PARAMS");
    }
}
