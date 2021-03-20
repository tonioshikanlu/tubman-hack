package b.o;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Application;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import b.o.c0;
import b.o.c3;
import b.o.l1;
import b.o.u3;
import b.o.y1;
import com.amplitude.api.Constants;
import com.appfoundry.previewer.constants.AnimationStrength;
import com.onesignal.OSPermissionChangedInternalObserver;
import com.onesignal.OSSubscriptionChangedInternalObserver;
import com.onesignal.OSSubscriptionState;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicLong;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class i2 {
    @NonNull
    public static f2 A = new f2();
    public static String B;
    public static boolean C;
    public static boolean D;
    public static boolean E;
    public static c0.d F;
    public static boolean G = true;
    @NonNull
    public static g H = new g((b) null);
    public static Collection<JSONArray> I = new ArrayList();
    public static HashSet<String> J = new HashSet<>();
    public static ArrayList<i> K = new ArrayList<>();
    public static boolean L;
    public static boolean M;
    public static boolean N = false;
    public static k O;
    public static c3.e P;
    public static t1 Q;
    public static t1 R;
    public static o1<Object, u1> S;
    public static OSSubscriptionState T;
    public static OSSubscriptionState U;
    public static o1<Object, a2> V;
    public static r0 W;
    public static j X;
    public static u3 Y;
    @Nullable
    public static String a;

    /* renamed from: b  reason: collision with root package name */
    public static String f6117b;
    public static Context c;
    public static String d = null;

    /* renamed from: e  reason: collision with root package name */
    public static String f6118e = null;
    public static int f;

    /* renamed from: g  reason: collision with root package name */
    public static boolean f6119g;

    /* renamed from: h  reason: collision with root package name */
    public static boolean f6120h;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    public static f f6121i = f.APP_CLOSE;

    /* renamed from: j  reason: collision with root package name */
    public static ExecutorService f6122j;

    /* renamed from: k  reason: collision with root package name */
    public static ConcurrentLinkedQueue<Runnable> f6123k = new ConcurrentLinkedQueue<>();

    /* renamed from: l  reason: collision with root package name */
    public static AtomicLong f6124l = new AtomicLong();

    /* renamed from: m  reason: collision with root package name */
    public static c4 f6125m;

    /* renamed from: n  reason: collision with root package name */
    public static a4 f6126n;

    /* renamed from: o  reason: collision with root package name */
    public static b4 f6127o;

    /* renamed from: p  reason: collision with root package name */
    public static y1.b f6128p = new b();

    /* renamed from: q  reason: collision with root package name */
    public static b1 f6129q = new b1();
    public static j1 r;
    public static r2 s = new n3();
    public static z1 t;
    public static b.o.u4.e u;
    public static y1 v;
    @Nullable
    public static r1 w;
    @Nullable
    public static b.o.v4.c x;
    @Nullable
    public static e y;
    public static String z = "native";

    public static class a implements Runnable {

        /* renamed from: h  reason: collision with root package name */
        public final /* synthetic */ JSONObject f6130h;

        /* renamed from: i  reason: collision with root package name */
        public final /* synthetic */ h f6131i;

        public a(JSONObject jSONObject, h hVar) {
            this.f6130h = jSONObject;
            this.f6131i = hVar;
        }

        public void run() {
            if (this.f6130h == null) {
                h hVar = this.f6131i;
                if (hVar != null) {
                    hVar.a(new t(-1, "Attempted to send null tags"));
                    return;
                }
                return;
            }
            JSONObject jSONObject = o3.d(false).f6183b;
            JSONObject jSONObject2 = new JSONObject();
            Iterator<String> keys = this.f6130h.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                try {
                    Object opt = this.f6130h.opt(next);
                    if (!(opt instanceof JSONArray)) {
                        if (!(opt instanceof JSONObject)) {
                            if (!this.f6130h.isNull(next)) {
                                if (!"".equals(opt)) {
                                    jSONObject2.put(next, opt.toString());
                                }
                            }
                            if (jSONObject != null && jSONObject.has(next)) {
                                jSONObject2.put(next, "");
                            }
                        }
                    }
                    k kVar = k.ERROR;
                    i2.a(kVar, "Omitting key '" + next + "'! sendTags DO NOT supported nested values!", (Throwable) null);
                } catch (Throwable unused) {
                }
            }
            if (!jSONObject2.toString().equals("{}")) {
                h hVar2 = this.f6131i;
                try {
                    JSONObject put = new JSONObject().put("tags", jSONObject2);
                    k4 b2 = o3.b();
                    if (hVar2 != null) {
                        b2.f6177e.add(hVar2);
                    }
                    b2.o().d(put, (Set<String>) null);
                    h4 a = o3.a();
                    if (hVar2 != null) {
                        a.f6177e.add(hVar2);
                    }
                    a.o().d(put, (Set<String>) null);
                } catch (JSONException e2) {
                    if (hVar2 != null) {
                        StringBuilder y = b.e.a.a.a.y("Encountered an error attempting to serialize your tags into JSON: ");
                        y.append(e2.getMessage());
                        y.append("\n");
                        y.append(e2.getStackTrace());
                        hVar2.a(new t(-1, y.toString()));
                    }
                    e2.printStackTrace();
                }
            } else {
                h hVar3 = this.f6131i;
                if (hVar3 != null) {
                    hVar3.b(jSONObject);
                }
            }
        }
    }

    public static class b implements y1.b {
    }

    public static class c implements Runnable {

        /* renamed from: h  reason: collision with root package name */
        public final /* synthetic */ int f6132h;

        public c(int i2) {
            this.f6132h = i2;
        }

        public void run() {
            z2 e2 = z2.e(i2.c);
            StringBuilder y = b.e.a.a.a.y("android_notification_id = ");
            y.append(this.f6132h);
            y.append(" AND ");
            y.append("opened");
            y.append(" = 0 AND ");
            String q2 = b.e.a.a.a.q(y, "dismissed", " = 0");
            ContentValues contentValues = new ContentValues();
            contentValues.put("dismissed", 1);
            if (e2.k0("notification", contentValues, q2, (String[]) null) > 0) {
                Context context = i2.c;
                Cursor S = e2.S("notification", new String[]{"group_id"}, b.e.a.a.a.g("android_notification_id = ", this.f6132h), (String[]) null, (String) null, (String) null, (String) null);
                if (S.moveToFirst()) {
                    String string = S.getString(S.getColumnIndex("group_id"));
                    S.close();
                    if (string != null) {
                        b.l.f.x.a.g.q0(context, e2, string, true);
                    }
                } else {
                    S.close();
                }
            }
            g.b(e2, i2.c);
            b.l.f.x.a.g.v(i2.c).cancel(this.f6132h);
        }
    }

    public static class d implements u3.a {
        /* JADX WARNING: Code restructure failed: missing block: B:12:0x001a, code lost:
            if (r0 != false) goto L_0x001c;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:8:0x0012, code lost:
            if (r0 != false) goto L_0x001c;
         */
        /* JADX WARNING: Removed duplicated region for block: B:16:0x002e  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void a(java.lang.String r5, int r6) {
            /*
                r4 = this;
                r0 = 0
                r1 = -6
                r2 = 1
                if (r6 >= r2) goto L_0x0015
                java.lang.String r3 = b.o.o3.c()
                if (r3 != 0) goto L_0x001e
                int r3 = b.o.i2.f
                if (r3 == r2) goto L_0x001c
                if (r3 >= r1) goto L_0x0012
                r0 = r2
            L_0x0012:
                if (r0 == 0) goto L_0x001e
                goto L_0x001c
            L_0x0015:
                int r3 = b.o.i2.f
                if (r3 >= r1) goto L_0x001a
                r0 = r2
            L_0x001a:
                if (r0 == 0) goto L_0x001e
            L_0x001c:
                b.o.i2.f = r6
            L_0x001e:
                b.o.i2.B = r5
                b.o.i2.C = r2
                android.content.Context r6 = b.o.i2.c
                com.onesignal.OSSubscriptionState r6 = b.o.i2.m(r6)
                java.util.Objects.requireNonNull(r6)
                if (r5 != 0) goto L_0x002e
                goto L_0x003e
            L_0x002e:
                java.lang.String r0 = r6.f7393l
                boolean r0 = r5.equals(r0)
                r0 = r0 ^ r2
                r6.f7393l = r5
                if (r0 == 0) goto L_0x003e
                b.o.o1<java.lang.Object, com.onesignal.OSSubscriptionState> r5 = r6.f7389h
                r5.a(r6)
            L_0x003e:
                b.o.i2.c()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: b.o.i2.d.a(java.lang.String, int):void");
        }
    }

    public static class e implements Runnable {

        /* renamed from: h  reason: collision with root package name */
        public final /* synthetic */ k f6133h;

        /* renamed from: i  reason: collision with root package name */
        public final /* synthetic */ String f6134i;

        public e(k kVar, String str) {
            this.f6133h = kVar;
            this.f6134i = str;
        }

        public void run() {
            Activity k2 = i2.k();
            if (k2 != null) {
                new AlertDialog.Builder(k2).setTitle(this.f6133h.toString()).setMessage(this.f6134i).show();
            }
        }
    }

    public enum f {
        NOTIFICATION_CLICK,
        APP_OPEN,
        APP_CLOSE
    }

    public static class g {
        public Context a;

        /* renamed from: b  reason: collision with root package name */
        public l f6139b;
        public m c;
        public boolean d;

        /* renamed from: e  reason: collision with root package name */
        public n f6140e = n.InAppAlert;

        public g(Context context, b bVar) {
            this.a = context;
        }

        public g(b bVar) {
        }
    }

    public interface h {
        void a(t tVar);

        void b(JSONObject jSONObject);
    }

    public interface i {
        void a(JSONObject jSONObject);
    }

    public static class j {
        public JSONArray a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f6141b;
        public l3 c;

        public j(JSONArray jSONArray) {
            this.a = jSONArray;
        }
    }

    public enum k {
        NONE,
        FATAL,
        ERROR,
        WARN,
        INFO,
        DEBUG,
        VERBOSE
    }

    public interface l {
        void a(m1 m1Var);
    }

    public interface m {
        void a(k1 k1Var);
    }

    public enum n {
        None,
        InAppAlert,
        Notification
    }

    public interface o {
        void a(String str, boolean z);
    }

    public interface p {
    }

    public interface q {
        void a(@Nullable q3 q3Var);
    }

    public static class r implements Runnable {

        /* renamed from: h  reason: collision with root package name */
        public Runnable f6154h;

        /* renamed from: i  reason: collision with root package name */
        public long f6155i;

        public r(Runnable runnable) {
            this.f6154h = runnable;
        }

        public void run() {
            this.f6154h.run();
            if (i2.f6124l.get() == this.f6155i) {
                i2.a(k.INFO, "Last Pending Task has ran, shutting down", (Throwable) null);
                i2.f6122j.shutdown();
            }
        }
    }

    public enum s {
        PERMISSION_GRANTED,
        PERMISSION_DENIED,
        LOCATION_PERMISSIONS_MISSING_MANIFEST,
        ERROR
    }

    public static class t {
        public t(int i2, String str) {
        }
    }

    static {
        i1 i1Var = new i1();
        r = i1Var;
        z1 z1Var = new z1();
        t = z1Var;
        b.o.u4.e eVar = new b.o.u4.e(z1Var, i1Var);
        u = eVar;
        v = new y1(f6128p, eVar, r);
    }

    public static void A(String str) {
        f6118e = str;
        if (c != null) {
            b3.h(b3.a, "OS_EMAIL_ID", "".equals(f6118e) ? null : f6118e);
        }
    }

    public static void B(JSONArray jSONArray, boolean z2, l3 l3Var) {
        if (!G("sendPurchases()")) {
            if (r() == null) {
                j jVar = new j(jSONArray);
                X = jVar;
                jVar.f6141b = z2;
                jVar.c = l3Var;
                return;
            }
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("app_id", q());
                if (z2) {
                    jSONObject.put("existing", true);
                }
                jSONObject.put("purchases", jSONArray);
                b.l.f.x.a.g.a0("players/" + r() + "/on_purchase", jSONObject, l3Var);
                if (n() != null) {
                    b.l.f.x.a.g.a0("players/" + n() + "/on_purchase", jSONObject, (l3) null);
                }
            } catch (Throwable th) {
                a(k.ERROR, "Failed to generate JSON for sendPurchases.", th);
            }
        }
    }

    public static void C(String str, String str2) {
        if (!G("sendTag()")) {
            try {
                D(new JSONObject().put(str, str2), (h) null);
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
        }
    }

    public static void D(JSONObject jSONObject, h hVar) {
        if (!G("sendTags()")) {
            a aVar = new a(jSONObject, hVar);
            if (c == null || H()) {
                a(k.ERROR, "You must initialize OneSignal before modifying tags!Moving this operation to a pending task queue.", (Throwable) null);
                if (hVar != null) {
                    hVar.a(new t(-1, "You must initialize OneSignal before modifying tags!Moving this operation to a pending task queue."));
                }
                d(new r(aVar));
                return;
            }
            aVar.run();
        }
    }

    public static void E(@NonNull Context context) {
        if (context == null) {
            a(k.WARN, "setAppContext(null) is not valid, ignoring!", (Throwable) null);
            return;
        }
        boolean z2 = c == null;
        Context applicationContext = context.getApplicationContext();
        c = applicationContext;
        Application application = (Application) applicationContext;
        if (c.f6027h == null) {
            c cVar = new c();
            c.f6027h = cVar;
            application.registerActivityLifecycleCallbacks(cVar);
        }
        if (c.f6028i == null) {
            c.f6028i = new a();
        }
        if (c.f6029j == null) {
            b bVar = new b();
            c.f6029j = bVar;
            application.registerComponentCallbacks(bVar);
        }
        if (z2) {
            if (x == null) {
                x = new b.o.v4.c(r, s, z2.e(c), t);
            }
            y1 y1Var = v;
            ((i1) y1Var.c).a("OneSignal SessionManager initSessionFromCache");
            for (b.o.u4.a k2 : y1Var.a.a.values()) {
                k2.k();
            }
            w = new r1(v, x);
            b3.k();
            Class<b.l.f.x.a.g> cls = b.l.f.x.a.g.class;
            z2 e2 = z2.e(context);
            synchronized (cls) {
                new Thread(new v2(e2), "OS_DELETE_CACHED_NOTIFICATIONS_THREAD").start();
            }
            synchronized (cls) {
                new Thread(new w2(e2), "OS_DELETE_CACHED_REDISPLAYED_IAMS_THREAD").start();
            }
        }
    }

    public static void F(long j2) {
        b3.j(b3.a, "OS_LAST_SESSION_TIME", j2);
    }

    public static boolean G(String str) {
        if (!(N && !b3.b(b3.a, "ONESIGNAL_USER_PROVIDED_CONSENT", false))) {
            return false;
        }
        if (str != null) {
            k kVar = k.WARN;
            a(kVar, "Method " + str + " was called before the user provided privacy consent. Your application is set to require the user's privacy consent before the OneSignal SDK can be initialized. Please ensure the user has provided consent before calling this method. You can check the latest OneSignal consent status by calling OneSignal.userProvidedPrivacyConsent()", (Throwable) null);
        }
        return true;
    }

    public static boolean H() {
        boolean z2 = f6119g;
        if (z2 && f6122j == null) {
            return false;
        }
        if (!z2 && f6122j == null) {
            return true;
        }
        ExecutorService executorService = f6122j;
        return executorService != null && !executorService.isShutdown();
    }

    public static boolean I(Context context) {
        Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(context.getPackageName());
        if (launchIntentForPackage == null) {
            return false;
        }
        launchIntentForPackage.setFlags(268566528);
        context.startActivity(launchIntentForPackage);
        return true;
    }

    public static void a(@NonNull k kVar, @NonNull String str, @Nullable Throwable th) {
        k kVar2 = k.WARN;
        if (kVar.compareTo(kVar2) < 1) {
            if (kVar == k.VERBOSE) {
                Log.v("OneSignal", str, th);
            } else if (kVar == k.DEBUG) {
                Log.d("OneSignal", str, th);
            } else if (kVar == k.INFO) {
                Log.i("OneSignal", str, th);
            } else if (kVar == kVar2) {
                Log.w("OneSignal", str, th);
            } else if (kVar == k.ERROR || kVar == k.FATAL) {
                Log.e("OneSignal", str, th);
            }
        }
        if (kVar.compareTo(k.NONE) < 1 && k() != null) {
            try {
                String str2 = str + "\n";
                if (th != null) {
                    StringWriter stringWriter = new StringWriter();
                    th.printStackTrace(new PrintWriter(stringWriter));
                    str2 = (str2 + th.getMessage()) + stringWriter.toString();
                }
                f2.u(new e(kVar, str2));
            } catch (Throwable th2) {
                Log.e("OneSignal", "Error showing logging message.", th2);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00cd, code lost:
        if ("".equals(r0) != false) goto L_0x00d4;
     */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x014c  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0151  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0178  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x017a  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x017f  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x018a  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x018c  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0191  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void b() {
        /*
            android.content.Context r0 = c
            java.lang.String r0 = r0.getPackageName()
            android.content.Context r1 = c
            android.content.pm.PackageManager r1 = r1.getPackageManager()
            org.json.JSONObject r2 = new org.json.JSONObject
            r2.<init>()
            java.lang.String r3 = q()
            java.lang.String r4 = "app_id"
            r2.put(r4, r3)
            b.o.e r3 = j()
            r4 = 0
            if (r3 == 0) goto L_0x0050
            b.o.e r3 = j()
            android.content.Context r5 = c
            b.o.d r3 = (b.o.d) r3
            java.util.Objects.requireNonNull(r3)
            com.google.android.gms.ads.identifier.AdvertisingIdClient$Info r3 = com.google.android.gms.ads.identifier.AdvertisingIdClient.getAdvertisingIdInfo(r5)     // Catch:{ all -> 0x0040 }
            boolean r5 = r3.isLimitAdTrackingEnabled()     // Catch:{ all -> 0x0040 }
            if (r5 == 0) goto L_0x0039
            java.lang.String r3 = "OptedOut"
            goto L_0x003d
        L_0x0039:
            java.lang.String r3 = r3.getId()     // Catch:{ all -> 0x0040 }
        L_0x003d:
            b.o.d.a = r3     // Catch:{ all -> 0x0040 }
            goto L_0x0049
        L_0x0040:
            r3 = move-exception
            b.o.i2$k r5 = b.o.i2.k.INFO
            java.lang.String r6 = "Error getting Google Ad id: "
            a(r5, r6, r3)
            r3 = r4
        L_0x0049:
            if (r3 == 0) goto L_0x0050
            java.lang.String r5 = "ad_id"
            r2.put(r5, r3)
        L_0x0050:
            java.lang.String r3 = android.os.Build.VERSION.RELEASE
            java.lang.String r5 = "device_os"
            r2.put(r5, r3)
            java.util.Calendar r3 = java.util.Calendar.getInstance()
            java.util.TimeZone r3 = r3.getTimeZone()
            int r5 = r3.getRawOffset()
            java.util.Date r6 = new java.util.Date
            r6.<init>()
            boolean r6 = r3.inDaylightTime(r6)
            if (r6 == 0) goto L_0x0073
            int r3 = r3.getDSTSavings()
            int r5 = r5 + r3
        L_0x0073:
            int r5 = r5 / 1000
            java.lang.String r3 = "timezone"
            r2.put(r3, r5)
            java.lang.String r3 = b.o.f2.b()
            java.lang.String r5 = "language"
            r2.put(r5, r3)
            java.lang.String r3 = "sdk"
            java.lang.String r5 = "031507"
            r2.put(r3, r5)
            java.lang.String r3 = z
            java.lang.String r5 = "sdk_type"
            r2.put(r5, r3)
            java.lang.String r3 = "android_package"
            r2.put(r3, r0)
            java.lang.String r3 = android.os.Build.MODEL
            java.lang.String r5 = "device_model"
            r2.put(r5, r3)
            r3 = 0
            java.lang.String r5 = "game_version"
            android.content.pm.PackageInfo r0 = r1.getPackageInfo(r0, r3)     // Catch:{ NameNotFoundException -> 0x00a9 }
            int r0 = r0.versionCode     // Catch:{ NameNotFoundException -> 0x00a9 }
            r2.put(r5, r0)     // Catch:{ NameNotFoundException -> 0x00a9 }
        L_0x00a9:
            b.o.f2 r0 = A
            java.lang.Integer r0 = r0.e()
            java.lang.String r1 = "net_type"
            r2.put(r1, r0)
            b.o.f2 r0 = A
            java.util.Objects.requireNonNull(r0)
            android.content.Context r0 = c     // Catch:{ all -> 0x00d0 }
            java.lang.String r1 = "phone"
            java.lang.Object r0 = r0.getSystemService(r1)     // Catch:{ all -> 0x00d0 }
            android.telephony.TelephonyManager r0 = (android.telephony.TelephonyManager) r0     // Catch:{ all -> 0x00d0 }
            java.lang.String r0 = r0.getNetworkOperatorName()     // Catch:{ all -> 0x00d0 }
            java.lang.String r1 = ""
            boolean r1 = r1.equals(r0)     // Catch:{ all -> 0x00d0 }
            if (r1 == 0) goto L_0x00d5
            goto L_0x00d4
        L_0x00d0:
            r0 = move-exception
            r0.printStackTrace()
        L_0x00d4:
            r0 = r4
        L_0x00d5:
            java.lang.String r1 = "carrier"
            r2.put(r1, r0)
            java.lang.String r5 = "/sbin/"
            java.lang.String r6 = "/system/bin/"
            java.lang.String r7 = "/system/xbin/"
            java.lang.String r8 = "/data/local/xbin/"
            java.lang.String r9 = "/data/local/bin/"
            java.lang.String r10 = "/system/sd/xbin/"
            java.lang.String r11 = "/system/bin/failsafe/"
            java.lang.String r12 = "/data/local/"
            java.lang.String[] r0 = new java.lang.String[]{r5, r6, r7, r8, r9, r10, r11, r12}
            r1 = r3
        L_0x00ef:
            r5 = 8
            r6 = 1
            if (r1 >= r5) goto L_0x0117
            r5 = r0[r1]     // Catch:{ all -> 0x0117 }
            java.io.File r7 = new java.io.File     // Catch:{ all -> 0x0117 }
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ all -> 0x0117 }
            r8.<init>()     // Catch:{ all -> 0x0117 }
            r8.append(r5)     // Catch:{ all -> 0x0117 }
            java.lang.String r5 = "su"
            r8.append(r5)     // Catch:{ all -> 0x0117 }
            java.lang.String r5 = r8.toString()     // Catch:{ all -> 0x0117 }
            r7.<init>(r5)     // Catch:{ all -> 0x0117 }
            boolean r5 = r7.exists()     // Catch:{ all -> 0x0117 }
            if (r5 == 0) goto L_0x0114
            r0 = r6
            goto L_0x0118
        L_0x0114:
            int r1 = r1 + 1
            goto L_0x00ef
        L_0x0117:
            r0 = r3
        L_0x0118:
            java.lang.String r1 = "rooted"
            r2.put(r1, r0)
            b.o.k4 r0 = b.o.o3.b()
            b.o.f4 r0 = r0.o()
            r0.d(r2, r4)
            b.o.h4 r0 = b.o.o3.a()
            b.o.f4 r0 = r0.o()
            r0.d(r2, r4)
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            java.lang.String r1 = B
            java.lang.String r2 = "identifier"
            r0.put(r2, r1)
            int r1 = f
            java.lang.String r2 = "subscribableStatus"
            r0.put(r2, r1)
            b.o.i2$g r1 = H
            boolean r1 = r1.d
            if (r1 == 0) goto L_0x0151
            boolean r1 = b.o.f2.a()
            goto L_0x0152
        L_0x0151:
            r1 = r6
        L_0x0152:
            java.lang.String r2 = "androidPermission"
            r0.put(r2, r1)
            b.o.f2 r1 = A
            int r1 = r1.c()
            java.lang.String r2 = "device_type"
            r0.put(r2, r1)
            b.o.o3.f(r0)
            boolean r0 = G
            if (r0 == 0) goto L_0x0170
            b.o.c0$d r0 = F
            if (r0 == 0) goto L_0x0170
            b.o.o3.e(r0)
        L_0x0170:
            b.o.k4 r0 = b.o.o3.b()
            boolean r1 = r0.c
            if (r1 == r6) goto L_0x017a
            r1 = r6
            goto L_0x017b
        L_0x017a:
            r1 = r3
        L_0x017b:
            r0.c = r6
            if (r1 == 0) goto L_0x0182
            r0.v()
        L_0x0182:
            b.o.h4 r0 = b.o.o3.a()
            boolean r1 = r0.c
            if (r1 == r6) goto L_0x018c
            r1 = r6
            goto L_0x018d
        L_0x018c:
            r1 = r3
        L_0x018d:
            r0.c = r6
            if (r1 == 0) goto L_0x0194
            r0.v()
        L_0x0194:
            M = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: b.o.i2.b():void");
    }

    public static void c() {
        k kVar = k.DEBUG;
        StringBuilder y2 = b.e.a.a.a.y("registerUser:registerForPushFired:");
        y2.append(C);
        y2.append(", locationFired: ");
        y2.append(D);
        y2.append(", remoteParams: ");
        y2.append(P);
        y2.append(", appId: ");
        y2.append(a);
        a(kVar, y2.toString(), (Throwable) null);
        if (C && D && P != null && a != null) {
            new Thread(new q2(), "OS_REG_USER").start();
        }
    }

    public static void d(r rVar) {
        k kVar = k.INFO;
        rVar.f6155i = f6124l.incrementAndGet();
        ExecutorService executorService = f6122j;
        if (executorService == null) {
            StringBuilder y2 = b.e.a.a.a.y("Adding a task to the pending queue with ID: ");
            y2.append(rVar.f6155i);
            a(kVar, y2.toString(), (Throwable) null);
            f6123k.add(rVar);
        } else if (!executorService.isShutdown()) {
            StringBuilder y3 = b.e.a.a.a.y("Executor is still running, add to the executor with ID: ");
            y3.append(rVar.f6155i);
            a(kVar, y3.toString(), (Throwable) null);
            try {
                f6122j.submit(rVar);
            } catch (RejectedExecutionException e2) {
                StringBuilder y4 = b.e.a.a.a.y("Executor is shutdown, running task manually with ID: ");
                y4.append(rVar.f6155i);
                a(kVar, y4.toString(), (Throwable) null);
                rVar.run();
                e2.printStackTrace();
            }
        }
    }

    public static boolean e(k kVar) {
        return kVar.compareTo(k.NONE) < 1 || kVar.compareTo(k.WARN) < 1;
    }

    public static void f(int i2) {
        c cVar = new c(i2);
        if (c == null || H()) {
            k kVar = k.ERROR;
            a(kVar, "OneSignal.init has not been called. Could not clear notification id: " + i2 + " at this time - movingthis operation to a waiting task queue. The notification will still be canceledfrom NotificationManager at this time.", (Throwable) null);
            f6123k.add(cVar);
            return;
        }
        cVar.run();
    }

    public static void g() {
        k kVar = k.DEBUG;
        boolean z2 = true;
        if (System.currentTimeMillis() - b3.d(b3.a, "OS_LAST_SESSION_TIME", -31000) >= Constants.EVENT_UPLOAD_PERIOD_MILLIS) {
            a(kVar, "Starting new session", (Throwable) null);
            o3.b().x();
            o3.a().x();
            if (f6120h) {
                r1 r1Var = w;
                Objects.requireNonNull(r1Var);
                a(kVar, "OneSignal cleanOutcomes for session", (Throwable) null);
                r1Var.a = f2.p();
                r1Var.a();
                y1 y1Var = v;
                f fVar = f6121i;
                List<b.o.u4.a> b2 = y1Var.a.b(fVar);
                ArrayList arrayList = new ArrayList();
                ((i1) y1Var.c).a("OneSignal SessionManager restartSessionIfNeeded with entryAction: " + fVar + "\n channelTrackers: " + b2.toString());
                Iterator it = ((ArrayList) b2).iterator();
                while (it.hasNext()) {
                    b.o.u4.a aVar = (b.o.u4.a) it.next();
                    JSONArray j2 = aVar.j();
                    ((i1) y1Var.c).a("OneSignal SessionManager restartSessionIfNeeded lastIds: " + j2);
                    b.o.u4.f.a e2 = aVar.e();
                    if (j2.length() > 0 ? y1Var.e(aVar, b.o.u4.f.c.INDIRECT, (String) null, j2) : y1Var.e(aVar, b.o.u4.f.c.UNATTRIBUTED, (String) null, (JSONArray) null)) {
                        arrayList.add(e2);
                    }
                }
                y1Var.d(arrayList);
                Objects.requireNonNull(p());
                Date date = p0.c;
                p0.c = new Date();
            }
        } else if (f6120h) {
            a(kVar, "Continue on same session", (Throwable) null);
            v.a(f6121i, (String) null);
        }
        p().m();
        if (!f6120h) {
            if (r() != null) {
                return;
            }
        }
        F(System.currentTimeMillis());
        if (!M) {
            M = true;
            if (o3.b().o().e().a.optBoolean("session") || o3.a().o().e().a.optBoolean("session")) {
                D = false;
            }
            o2 o2Var = new o2();
            Objects.requireNonNull(H);
            if (!E) {
                Objects.requireNonNull(H);
                z2 = false;
            }
            E = z2;
            c0.d(c, false, false, o2Var);
            C = false;
            if (P != null) {
                y();
            } else {
                c3.a(new p2());
            }
        }
    }

    public static void h() {
        for (JSONArray z2 : I) {
            z(z2, true, false);
        }
        I.clear();
    }

    @NonNull
    public static m1 i(JSONArray jSONArray, boolean z2, boolean z3) {
        int length = jSONArray.length();
        m1 m1Var = new m1();
        k1 k1Var = new k1();
        jSONArray.optJSONObject(0).optInt("androidNotificationId");
        boolean z4 = true;
        String str = null;
        for (int i2 = 0; i2 < length; i2++) {
            try {
                JSONObject jSONObject = jSONArray.getJSONObject(i2);
                k1Var.a = b.l.f.x.a.g.a(jSONObject);
                if (str == null && jSONObject.has("actionId")) {
                    str = jSONObject.optString("actionId", (String) null);
                }
                if (z4) {
                    z4 = false;
                } else {
                    if (k1Var.f6169b == null) {
                        k1Var.f6169b = new ArrayList();
                    }
                    k1Var.f6169b.add(k1Var.a);
                }
            } catch (Throwable th) {
                a(k.ERROR, "Error parsing JSON item " + i2 + "/" + length + " for callback.", th);
            }
        }
        m1Var.a = k1Var;
        l1 l1Var = new l1();
        m1Var.f6200b = l1Var;
        Objects.requireNonNull(l1Var);
        m1Var.f6200b.a = str != null ? l1.a.ActionTaken : l1.a.Opened;
        Objects.requireNonNull(m1Var.a);
        return m1Var;
    }

    @Nullable
    public static synchronized e j() {
        e eVar;
        synchronized (i2.class) {
            if (y == null && f2.m()) {
                y = new d();
            }
            eVar = y;
        }
        return eVar;
    }

    @Nullable
    public static Activity k() {
        a aVar = c.f6028i;
        if (aVar != null) {
            return aVar.a;
        }
        return null;
    }

    public static t1 l(Context context) {
        if (context == null) {
            return null;
        }
        if (Q == null) {
            t1 t1Var = new t1(false);
            Q = t1Var;
            o1<Object, t1> o1Var = t1Var.f6294h;
            o1Var.f6215b.add(new OSPermissionChangedInternalObserver());
        }
        return Q;
    }

    public static OSSubscriptionState m(Context context) {
        if (context == null) {
            return null;
        }
        if (T == null) {
            T = new OSSubscriptionState(false, l(context).f6295i);
            l(context).f6294h.f6215b.add(new WeakReference(T));
            o1<Object, OSSubscriptionState> o1Var = T.f7389h;
            o1Var.f6215b.add(new OSSubscriptionChangedInternalObserver());
        }
        return T;
    }

    public static String n() {
        if (f6118e == null && c != null) {
            f6118e = b3.f(b3.a, "OS_EMAIL_ID", (String) null);
        }
        if (TextUtils.isEmpty(f6118e)) {
            return null;
        }
        return f6118e;
    }

    public static boolean o() {
        return b3.b(b3.a, "GT_FIREBASE_TRACKING_ENABLED", false);
    }

    public static u0 p() {
        b1 b1Var = f6129q;
        z2 e2 = z2.e(c);
        if (b1Var.a == null) {
            synchronized (b1.f6018b) {
                if (b1Var.a == null) {
                    b1Var.a = new u0(e2);
                }
            }
        }
        return b1Var.a;
    }

    public static String q() {
        if (c == null) {
            return null;
        }
        return b3.f(b3.a, "GT_APP_ID", (String) null);
    }

    public static String r() {
        if (d == null && c != null) {
            d = b3.f(b3.a, "GT_PLAYER_ID", (String) null);
        }
        return d;
    }

    public static void s(Context context, JSONArray jSONArray, boolean z2, @Nullable String str) {
        boolean z3;
        String optString;
        String str2;
        String str3;
        k kVar = k.ERROR;
        String str4 = null;
        if (!G((String) null)) {
            boolean z4 = false;
            for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                try {
                    String optString2 = new JSONObject(jSONArray.getJSONObject(i2).optString("custom", (String) null)).optString(b.m.a.t.i.f5973b, (String) null);
                    if (!J.contains(optString2)) {
                        J.add(optString2);
                        JSONObject jSONObject = new JSONObject();
                        if (context == null) {
                            str2 = null;
                        } else {
                            str2 = b3.f(b3.a, "GT_APP_ID", (String) null);
                        }
                        jSONObject.put("app_id", str2);
                        if (context == null) {
                            str3 = null;
                        } else {
                            str3 = b3.f(b3.a, "GT_PLAYER_ID", (String) null);
                        }
                        jSONObject.put("player_id", str3);
                        jSONObject.put("opened", true);
                        jSONObject.put("device_type", A.c());
                        new Thread(new e3("notifications/" + optString2, jSONObject, new l2()), "OS_REST_ASYNC_PUT").start();
                    }
                } catch (Throwable th) {
                    a(kVar, "Failed to generate JSON to send notification opened.", th);
                }
            }
            if (f6127o != null && o()) {
                b4 b4Var = f6127o;
                m1 i3 = i(jSONArray, true, z2);
                Objects.requireNonNull(b4Var);
                if (b4.f6025e == null) {
                    b4.f6025e = new AtomicLong();
                }
                b4.f6025e.set(System.currentTimeMillis());
                try {
                    Object b2 = b4Var.b(b4Var.f6026b);
                    Method c2 = b4.c(b4.c);
                    Bundle bundle = new Bundle();
                    bundle.putString("source", "OneSignal");
                    bundle.putString(AnimationStrength.MEDIUM, "notification");
                    bundle.putString("notification_id", i3.a.a.a);
                    bundle.putString("campaign", b4Var.a(i3.a.a));
                    c2.invoke(b2, new Object[]{"os_notification_opened", bundle});
                } catch (Throwable th2) {
                    th2.printStackTrace();
                }
            }
            boolean equals = "DISABLE".equals(f2.d(context, "com.onesignal.NotificationOpened.DEFAULT"));
            if (equals || G((String) null)) {
                z3 = false;
            } else {
                int length = jSONArray.length();
                int i4 = 0;
                z3 = false;
                while (i4 < length) {
                    try {
                        JSONObject jSONObject2 = jSONArray.getJSONObject(i4);
                        if (jSONObject2.has("custom")) {
                            JSONObject jSONObject3 = new JSONObject(jSONObject2.optString("custom"));
                            if (jSONObject3.has("u") && (optString = jSONObject3.optString("u", str4)) != null) {
                                f2.r(optString);
                                z3 = true;
                            }
                        }
                    } catch (Throwable th3) {
                        a(kVar, "Error parsing JSON item " + i4 + "/" + length + " for launching a web URL.", th3);
                    }
                    i4++;
                    str4 = null;
                }
            }
            if (!z2 && !z3 && !equals && !f6120h && I(context)) {
                z4 = true;
            }
            if (z4) {
                f fVar = f.NOTIFICATION_CLICK;
                f6121i = fVar;
                y1 y1Var = v;
                ((i1) y1Var.c).a(b.e.a.a.a.m("OneSignal SessionManager onDirectInfluenceFromNotificationOpen notificationId: ", str));
                if (str != null && !str.isEmpty()) {
                    y1Var.a(fVar, str);
                }
            }
            z(jSONArray, true, z2);
        }
    }

    public static void t(JSONArray jSONArray, boolean z2, boolean z3) {
        m mVar;
        m1 i2 = i(jSONArray, z2, z3);
        if (f6127o != null && o()) {
            b4 b4Var = f6127o;
            Objects.requireNonNull(b4Var);
            try {
                Object b2 = b4Var.b(b4Var.f6026b);
                Method c2 = b4.c(b4.c);
                Bundle bundle = new Bundle();
                bundle.putString("source", "OneSignal");
                bundle.putString(AnimationStrength.MEDIUM, "notification");
                bundle.putString("notification_id", i2.a.a.a);
                bundle.putString("campaign", b4Var.a(i2.a.a));
                c2.invoke(b2, new Object[]{"os_notification_received", bundle});
                if (b4.d == null) {
                    b4.d = new AtomicLong();
                }
                b4.d.set(System.currentTimeMillis());
                b4.f = i2.a.a;
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        g gVar = H;
        if (gVar != null && (mVar = gVar.c) != null) {
            mVar.a(i2.a);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00df, code lost:
        if (1 == 0) goto L_0x00e4;
     */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x021f  */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x0233  */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x025f  */
    /* JADX WARNING: Removed duplicated region for block: B:136:? A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00ef  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00f4  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0101  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0103  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0106 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0107  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void u(android.content.Context r9, java.lang.String r10, java.lang.String r11, b.o.i2.l r12, b.o.i2.m r13) {
        /*
            b.o.i2$k r0 = b.o.i2.k.ERROR
            b.o.i2$g r1 = H
            java.util.Objects.requireNonNull(r1)
            r1.f6139b = r12
            r1.c = r13
            H = r1
            E(r9)
            r1 = 0
            android.content.pm.PackageManager r2 = r9.getPackageManager()     // Catch:{ all -> 0x003c }
            java.lang.String r3 = r9.getPackageName()     // Catch:{ all -> 0x003c }
            r4 = 128(0x80, float:1.794E-43)
            android.content.pm.ApplicationInfo r2 = r2.getApplicationInfo(r3, r4)     // Catch:{ all -> 0x003c }
            android.os.Bundle r2 = r2.metaData     // Catch:{ all -> 0x003c }
            java.lang.String r3 = "com.onesignal.PrivacyConsent"
            java.lang.String r2 = r2.getString(r3)     // Catch:{ all -> 0x003c }
            java.lang.String r3 = "ENABLE"
            boolean r2 = r3.equalsIgnoreCase(r2)     // Catch:{ all -> 0x003c }
            boolean r3 = N     // Catch:{ all -> 0x003c }
            if (r3 == 0) goto L_0x0039
            if (r2 != 0) goto L_0x0039
            java.lang.String r2 = "Cannot change requiresUserPrivacyConsent() from TRUE to FALSE"
            a(r0, r2, r1)     // Catch:{ all -> 0x003c }
            goto L_0x0040
        L_0x0039:
            N = r2     // Catch:{ all -> 0x003c }
            goto L_0x0040
        L_0x003c:
            r2 = move-exception
            r2.printStackTrace()
        L_0x0040:
            boolean r2 = N
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L_0x0052
            java.lang.String r2 = b.o.b3.a
            java.lang.String r5 = "ONESIGNAL_USER_PROVIDED_CONSENT"
            boolean r2 = b.o.b3.b(r2, r5, r4)
            if (r2 != 0) goto L_0x0052
            r2 = r3
            goto L_0x0053
        L_0x0052:
            r2 = r4
        L_0x0053:
            if (r2 == 0) goto L_0x006a
            b.o.i2$k r0 = b.o.i2.k.VERBOSE
            java.lang.String r2 = "OneSignal SDK initialization delayed, user privacy consent is set to required for this application."
            a(r0, r2, r1)
            b.o.k r0 = new b.o.k
            r3 = r0
            r4 = r9
            r5 = r10
            r6 = r11
            r7 = r12
            r8 = r13
            r3.<init>(r4, r5, r6, r7, r8)
            O = r0
            return
        L_0x006a:
            b.o.i2$g r2 = H
            java.util.Objects.requireNonNull(r2)
            r2.f6139b = r12
            r2.c = r13
            H = r2
            b.o.c3$e r12 = P
            if (r12 == 0) goto L_0x007f
            java.lang.String r12 = r12.a
            if (r12 == 0) goto L_0x007f
            r12 = r3
            goto L_0x0080
        L_0x007f:
            r12 = r4
        L_0x0080:
            if (r12 != 0) goto L_0x0084
            f6117b = r10
        L_0x0084:
            b.o.f2 r10 = A
            b.o.i2$k r12 = b.o.i2.k.FATAL
            int r10 = r10.c()
            r13 = -999(0xfffffffffffffc19, float:NaN)
            java.util.UUID.fromString(r11)     // Catch:{ all -> 0x00f6 }
            java.lang.String r2 = "b2f7f966-d8cc-11e4-bed1-df8f05be55ba"
            boolean r2 = r2.equals(r11)
            if (r2 != 0) goto L_0x00a1
            java.lang.String r2 = "5eb5a37e-b458-11e3-ac11-000c2940e62c"
            boolean r2 = r2.equals(r11)
            if (r2 == 0) goto L_0x00a6
        L_0x00a1:
            java.lang.String r2 = "OneSignal Example AppID detected, please update to your app's id found on OneSignal.com"
            a(r0, r2, r1)
        L_0x00a6:
            if (r10 != r3) goto L_0x00b5
            boolean r10 = b.o.f2.h()
            if (r10 == 0) goto L_0x00b5
            b.o.i2$k r10 = b.o.i2.k.WARN
            java.lang.String r0 = "Both GCM & FCM Libraries detected! Please remove the deprecated GCM library."
            a(r10, r0, r1)
        L_0x00b5:
            java.lang.Class<androidx.legacy.content.WakefulBroadcastReceiver> r10 = androidx.legacy.content.WakefulBroadcastReceiver.class
            r10 = r3
            goto L_0x00ba
        L_0x00b9:
            r10 = r4
        L_0x00ba:
            r0 = -5
            if (r10 == 0) goto L_0x00e4
            int r10 = android.os.Build.VERSION.SDK_INT
            r2 = 26
            if (r10 < r2) goto L_0x00e2
            java.lang.String r10 = r9.getPackageName()
            android.content.pm.PackageManager r5 = r9.getPackageManager()
            android.content.pm.ApplicationInfo r10 = r5.getApplicationInfo(r10, r4)     // Catch:{ NameNotFoundException -> 0x00d2 }
            int r10 = r10.targetSdkVersion     // Catch:{ NameNotFoundException -> 0x00d2 }
            goto L_0x00d8
        L_0x00d2:
            r10 = move-exception
            r10.printStackTrace()
            r10 = 15
        L_0x00d8:
            if (r10 < r2) goto L_0x00e2
            java.lang.Class<androidx.core.app.JobIntentService> r10 = androidx.core.app.JobIntentService.class
            r10 = r3
            goto L_0x00df
        L_0x00de:
            r10 = r4
        L_0x00df:
            if (r10 != 0) goto L_0x00e2
            goto L_0x00e4
        L_0x00e2:
            r10 = r1
            goto L_0x00ed
        L_0x00e4:
            java.lang.String r10 = "The included Android Support Library is to old or incomplete. Please update to the 26.0.0 revision or newer."
            a(r12, r10, r1)
            java.lang.Integer r10 = java.lang.Integer.valueOf(r0)
        L_0x00ed:
            if (r10 == 0) goto L_0x00f4
            int r10 = r10.intValue()
            goto L_0x00fd
        L_0x00f4:
            r10 = r3
            goto L_0x00fd
        L_0x00f6:
            r10 = move-exception
            java.lang.String r0 = "OneSignal AppId format is invalid.\nExample: 'b2f7f966-d8cc-11e4-bed1-df8f05be55ba'\n"
            a(r12, r0, r10)
            r10 = r13
        L_0x00fd:
            f = r10
            if (r10 != r13) goto L_0x0103
            r10 = r3
            goto L_0x0104
        L_0x0103:
            r10 = r4
        L_0x0104:
            if (r10 == 0) goto L_0x0107
            return
        L_0x0107:
            java.lang.String r10 = a
            if (r10 == 0) goto L_0x0113
            boolean r10 = r10.equals(r11)
            if (r10 != 0) goto L_0x0113
            f6119g = r4
        L_0x0113:
            boolean r10 = f6119g
            if (r10 == 0) goto L_0x0121
            b.o.i2$g r9 = H
            b.o.i2$l r9 = r9.f6139b
            if (r9 == 0) goto L_0x0120
            h()
        L_0x0120:
            return
        L_0x0121:
            a = r11
            b.o.i2$g r10 = H
            java.util.Objects.requireNonNull(r10)
            android.content.Context r10 = c
            if (r10 != 0) goto L_0x012d
            goto L_0x0134
        L_0x012d:
            java.lang.String r10 = b.o.b3.a
            java.lang.String r11 = "OS_FILTER_OTHER_GCM_RECEIVERS"
            b.o.b3.i(r10, r11, r4)
        L_0x0134:
            b.o.a r10 = b.o.c.f6028i
            boolean r11 = r9 instanceof android.app.Activity
            f6120h = r11
            if (r11 == 0) goto L_0x0166
            if (r10 == 0) goto L_0x0143
            android.app.Activity r9 = (android.app.Activity) r9
            r10.e(r9)
        L_0x0143:
            android.content.Context r9 = c
            java.lang.Thread r10 = new java.lang.Thread
            b.o.m0 r11 = new b.o.m0
            r11.<init>(r9)
            java.lang.String r9 = "OS_RESTORE_NOTIFS"
            r10.<init>(r11, r9)
            r10.start()
            b.o.n r9 = b.o.n.a()
            java.util.Objects.requireNonNull(r9)
            long r10 = android.os.SystemClock.elapsedRealtime()
            java.lang.Long r10 = java.lang.Long.valueOf(r10)
            r9.a = r10
            goto L_0x016a
        L_0x0166:
            if (r10 == 0) goto L_0x016a
            r10.f5984b = r3
        L_0x016a:
            b.o.k4 r9 = b.o.o3.b()
            r9.p()
            b.o.h4 r9 = b.o.o3.a()
            r9.p()
            java.lang.String r9 = "com.amazon.device.iap.PurchasingListener"
            java.lang.Class.forName(r9)     // Catch:{ ClassNotFoundException -> 0x0186 }
            b.o.a4 r9 = new b.o.a4     // Catch:{ ClassNotFoundException -> 0x0186 }
            android.content.Context r10 = c     // Catch:{ ClassNotFoundException -> 0x0186 }
            r9.<init>(r10)     // Catch:{ ClassNotFoundException -> 0x0186 }
            f6126n = r9     // Catch:{ ClassNotFoundException -> 0x0186 }
        L_0x0186:
            java.lang.String r9 = q()
            java.lang.String r10 = "GT_APP_ID"
            if (r9 == 0) goto L_0x01d2
            java.lang.String r11 = a
            boolean r9 = r9.equals(r11)
            if (r9 != 0) goto L_0x01e3
            b.o.i2$k r9 = b.o.i2.k.DEBUG
            java.lang.String r11 = "APP ID changed, clearing user id as it is no longer valid."
            a(r9, r11, r1)
            java.lang.String r9 = a
            android.content.Context r11 = c
            if (r11 != 0) goto L_0x01a4
            goto L_0x01a9
        L_0x01a4:
            java.lang.String r11 = b.o.b3.a
            b.o.b3.h(r11, r10, r9)
        L_0x01a9:
            b.o.k4 r9 = b.o.o3.b()
            r9.u()
            b.o.h4 r9 = b.o.o3.a()
            r9.u()
            d = r1
            android.content.Context r9 = c
            if (r9 != 0) goto L_0x01be
            goto L_0x01c7
        L_0x01be:
            java.lang.String r9 = b.o.b3.a
            java.lang.String r10 = d
            java.lang.String r11 = "GT_PLAYER_ID"
            b.o.b3.h(r9, r11, r10)
        L_0x01c7:
            A(r1)
            r9 = -3660(0xfffffffffffff1b4, double:NaN)
            F(r9)
            P = r1
            goto L_0x01e3
        L_0x01d2:
            android.content.Context r9 = c
            b.o.g.c(r4, r9)
            java.lang.String r9 = a
            android.content.Context r11 = c
            if (r11 != 0) goto L_0x01de
            goto L_0x01e3
        L_0x01de:
            java.lang.String r11 = b.o.b3.a
            b.o.b3.h(r11, r10, r9)
        L_0x01e3:
            android.content.Context r9 = c
            b.o.t1 r9 = l(r9)
            com.onesignal.OSPermissionChangedInternalObserver.a(r9)
            g()
            b.o.i2$g r9 = H
            b.o.i2$l r9 = r9.f6139b
            if (r9 == 0) goto L_0x01f8
            h()
        L_0x01f8:
            android.content.Context r9 = c
            int r10 = b.o.c4.f6054i
            r11 = -99
            if (r10 != r11) goto L_0x0208
            java.lang.String r10 = "com.android.vending.BILLING"
            int r9 = r9.checkCallingOrSelfPermission(r10)
            b.o.c4.f6054i = r9
        L_0x0208:
            int r9 = b.o.c4.f6054i     // Catch:{ all -> 0x021a }
            if (r9 != 0) goto L_0x0214
            java.lang.String r9 = "com.android.vending.billing.IInAppBillingService"
            java.lang.Class r9 = java.lang.Class.forName(r9)     // Catch:{ all -> 0x021a }
            b.o.c4.f6055j = r9     // Catch:{ all -> 0x021a }
        L_0x0214:
            int r9 = b.o.c4.f6054i
            if (r9 != 0) goto L_0x021c
            r9 = r3
            goto L_0x021d
        L_0x021a:
            b.o.c4.f6054i = r4
        L_0x021c:
            r9 = r4
        L_0x021d:
            if (r9 == 0) goto L_0x0228
            b.o.c4 r9 = new b.o.c4
            android.content.Context r10 = c
            r9.<init>(r10)
            f6125m = r9
        L_0x0228:
            java.lang.String r9 = "com.google.firebase.analytics.FirebaseAnalytics"
            java.lang.Class r9 = java.lang.Class.forName(r9)     // Catch:{ ClassNotFoundException -> 0x0231 }
            b.o.b4.c = r9     // Catch:{ ClassNotFoundException -> 0x0231 }
            r4 = r3
        L_0x0231:
            if (r4 == 0) goto L_0x023c
            b.o.b4 r9 = new b.o.b4
            android.content.Context r10 = c
            r9.<init>(r10)
            f6127o = r9
        L_0x023c:
            android.content.Context r9 = c
            b.o.y3.d(r9)
            f6119g = r3
            b.o.r1 r9 = w
            java.util.Objects.requireNonNull(r9)
            java.lang.Thread r10 = new java.lang.Thread
            b.o.p1 r11 = new b.o.p1
            r11.<init>(r9)
            java.lang.String r9 = "OS_SEND_SAVED_OUTCOMES"
            r10.<init>(r11, r9)
            r10.start()
            java.util.concurrent.ConcurrentLinkedQueue<java.lang.Runnable> r9 = f6123k
            boolean r9 = r9.isEmpty()
            if (r9 != 0) goto L_0x0280
            b.o.n2 r9 = new b.o.n2
            r9.<init>()
            java.util.concurrent.ExecutorService r9 = java.util.concurrent.Executors.newSingleThreadExecutor(r9)
            f6122j = r9
        L_0x026a:
            java.util.concurrent.ConcurrentLinkedQueue<java.lang.Runnable> r9 = f6123k
            boolean r9 = r9.isEmpty()
            if (r9 != 0) goto L_0x0280
            java.util.concurrent.ExecutorService r9 = f6122j
            java.util.concurrent.ConcurrentLinkedQueue<java.lang.Runnable> r10 = f6123k
            java.lang.Object r10 = r10.poll()
            java.lang.Runnable r10 = (java.lang.Runnable) r10
            r9.submit(r10)
            goto L_0x026a
        L_0x0280:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: b.o.i2.u(android.content.Context, java.lang.String, java.lang.String, b.o.i2$l, b.o.i2$m):void");
    }

    public static boolean v() {
        return f6119g && f6120h;
    }

    public static void w(String str, int i2, Throwable th, String str2) {
        String n2 = (str2 == null || !e(k.INFO)) ? "" : b.e.a.a.a.n("\n", str2, "\n");
        k kVar = k.WARN;
        a(kVar, "HTTP code: " + i2 + " " + str + n2, th);
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean x(android.content.Context r11, org.json.JSONObject r12) {
        /*
            java.lang.String r12 = b.l.f.x.a.g.w(r12)
            r0 = 0
            r1 = 1
            if (r12 == 0) goto L_0x004f
            java.lang.String r2 = ""
            boolean r2 = r2.equals(r12)
            if (r2 == 0) goto L_0x0011
            goto L_0x004c
        L_0x0011:
            b.o.z2 r3 = b.o.z2.e(r11)
            java.lang.String r11 = "notification_id"
            java.lang.String[] r5 = new java.lang.String[]{r11}
            java.lang.String[] r7 = new java.lang.String[r1]
            r7[r0] = r12
            r8 = 0
            r9 = 0
            r10 = 0
            java.lang.String r4 = "notification"
            java.lang.String r6 = "notification_id = ?"
            android.database.Cursor r11 = r3.S(r4, r5, r6, r7, r8, r9, r10)
            boolean r2 = r11.moveToFirst()
            r11.close()
            if (r2 == 0) goto L_0x004c
            b.o.i2$k r11 = b.o.i2.k.DEBUG
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Duplicate GCM message received, skip processing of "
            r2.append(r3)
            r2.append(r12)
            java.lang.String r12 = r2.toString()
            r2 = 0
            a(r11, r12, r2)
            r11 = r1
            goto L_0x004d
        L_0x004c:
            r11 = r0
        L_0x004d:
            if (r11 == 0) goto L_0x0050
        L_0x004f:
            r0 = r1
        L_0x0050:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: b.o.i2.x(android.content.Context, org.json.JSONObject):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x004c, code lost:
        if (b.o.f2.s("com.huawei.hwid") == false) goto L_0x004f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x003f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void y() {
        /*
            b.o.u3 r0 = Y
            if (r0 == 0) goto L_0x0006
            goto L_0x006f
        L_0x0006:
            r0 = 1
            r1 = 0
            java.lang.String r2 = "com.amazon.device.messaging.ADM"
            java.lang.Class.forName(r2)     // Catch:{ ClassNotFoundException -> 0x000f }
            r2 = r0
            goto L_0x0010
        L_0x000f:
            r2 = r1
        L_0x0010:
            r3 = 2
            if (r2 == 0) goto L_0x0015
            r4 = r3
            goto L_0x0050
        L_0x0015:
            boolean r2 = b.o.f2.n()
            if (r2 == 0) goto L_0x001c
            goto L_0x004f
        L_0x001c:
            boolean r2 = b.o.f2.j()
            if (r2 == 0) goto L_0x0039
            boolean r2 = b.o.f2.i()
            if (r2 == 0) goto L_0x0030
            boolean r2 = b.o.f2.l()
            if (r2 == 0) goto L_0x0030
            r2 = r0
            goto L_0x0031
        L_0x0030:
            r2 = r1
        L_0x0031:
            if (r2 != 0) goto L_0x0034
            goto L_0x0039
        L_0x0034:
            boolean r2 = b.o.f2.o()
            goto L_0x003a
        L_0x0039:
            r2 = r1
        L_0x003a:
            r4 = 13
            if (r2 == 0) goto L_0x003f
            goto L_0x0050
        L_0x003f:
            boolean r2 = b.o.f2.n()
            if (r2 == 0) goto L_0x0046
            goto L_0x004f
        L_0x0046:
            java.lang.String r2 = "com.huawei.hwid"
            boolean r2 = b.o.f2.s(r2)
            if (r2 == 0) goto L_0x004f
            goto L_0x0050
        L_0x004f:
            r4 = r0
        L_0x0050:
            if (r4 != r3) goto L_0x0053
            goto L_0x0054
        L_0x0053:
            r0 = r1
        L_0x0054:
            if (r0 == 0) goto L_0x005c
            b.o.v3 r0 = new b.o.v3
            r0.<init>()
            goto L_0x006d
        L_0x005c:
            boolean r0 = b.o.f2.m()
            if (r0 == 0) goto L_0x0068
            b.o.y3 r0 = new b.o.y3
            r0.<init>()
            goto L_0x006d
        L_0x0068:
            b.o.z3 r0 = new b.o.z3
            r0.<init>()
        L_0x006d:
            Y = r0
        L_0x006f:
            android.content.Context r1 = c
            java.lang.String r2 = f6117b
            b.o.i2$d r3 = new b.o.i2$d
            r3.<init>()
            r0.a(r1, r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: b.o.i2.y():void");
    }

    public static void z(JSONArray jSONArray, boolean z2, boolean z3) {
        g gVar = H;
        if (gVar == null || gVar.f6139b == null) {
            I.add(jSONArray);
        } else {
            f2.u(new k2(i(jSONArray, z2, z3)));
        }
    }
}
