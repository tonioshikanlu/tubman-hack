package b.l.d;

import android.annotation.TargetApi;
import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import androidx.collection.ArrayMap;
import androidx.core.os.UserManagerCompat;
import b.l.a.c.c.l.k.c;
import b.l.a.c.c.m.q0;
import b.l.a.c.c.m.r;
import b.l.d.p.m;
import b.l.d.p.x;
import com.google.android.material.badge.BadgeDrawable;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

public class d {

    /* renamed from: i  reason: collision with root package name */
    public static final Object f4909i = new Object();

    /* renamed from: j  reason: collision with root package name */
    public static final Executor f4910j = new C0074d((a) null);

    /* renamed from: k  reason: collision with root package name */
    public static final Map<String, d> f4911k = new ArrayMap();
    public final Context a;

    /* renamed from: b  reason: collision with root package name */
    public final String f4912b;
    public final l c;
    public final m d;

    /* renamed from: e  reason: collision with root package name */
    public final AtomicBoolean f4913e = new AtomicBoolean(false);
    public final AtomicBoolean f = new AtomicBoolean();

    /* renamed from: g  reason: collision with root package name */
    public final x<b.l.d.y.a> f4914g;

    /* renamed from: h  reason: collision with root package name */
    public final List<b> f4915h = new CopyOnWriteArrayList();

    public interface b {
        void a(boolean z);
    }

    @TargetApi(14)
    public static class c implements c.a {
        public static AtomicReference<c> a = new AtomicReference<>();

        public void a(boolean z) {
            Object obj = d.f4909i;
            synchronized (d.f4909i) {
                Iterator it = new ArrayList(d.f4911k.values()).iterator();
                while (it.hasNext()) {
                    d dVar = (d) it.next();
                    if (dVar.f4913e.get()) {
                        Log.d("FirebaseApp", "Notifying background state change listeners.");
                        for (b a2 : dVar.f4915h) {
                            a2.a(z);
                        }
                    }
                }
            }
        }
    }

    /* renamed from: b.l.d.d$d  reason: collision with other inner class name */
    public static class C0074d implements Executor {

        /* renamed from: h  reason: collision with root package name */
        public static final Handler f4916h = new Handler(Looper.getMainLooper());

        public C0074d(a aVar) {
        }

        public void execute(@NonNull Runnable runnable) {
            f4916h.post(runnable);
        }
    }

    @TargetApi(24)
    public static class e extends BroadcastReceiver {

        /* renamed from: b  reason: collision with root package name */
        public static AtomicReference<e> f4917b = new AtomicReference<>();
        public final Context a;

        public e(Context context) {
            this.a = context;
        }

        public void onReceive(Context context, Intent intent) {
            Object obj = d.f4909i;
            synchronized (d.f4909i) {
                for (d f : d.f4911k.values()) {
                    f.f();
                }
            }
            this.a.unregisterReceiver(this);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0079  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00bb A[LOOP:1: B:25:0x00b5->B:27:0x00bb, LOOP_END] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public d(android.content.Context r9, java.lang.String r10, b.l.d.l r11) {
        /*
            r8 = this;
            r8.<init>()
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r1 = 0
            r0.<init>(r1)
            r8.f4913e = r0
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r0.<init>()
            r8.f = r0
            java.util.concurrent.CopyOnWriteArrayList r0 = new java.util.concurrent.CopyOnWriteArrayList
            r0.<init>()
            r8.f4915h = r0
            java.util.concurrent.CopyOnWriteArrayList r0 = new java.util.concurrent.CopyOnWriteArrayList
            r0.<init>()
            java.lang.String r0 = "null reference"
            java.util.Objects.requireNonNull(r9, r0)
            r8.a = r9
            b.l.a.c.b.a.x(r10)
            r8.f4912b = r10
            java.util.Objects.requireNonNull(r11, r0)
            r8.c = r11
            java.lang.Class<com.google.firebase.components.ComponentDiscoveryService> r10 = com.google.firebase.components.ComponentDiscoveryService.class
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.lang.String r2 = "ComponentDiscovery"
            r3 = 0
            android.content.pm.PackageManager r4 = r9.getPackageManager()     // Catch:{ NameNotFoundException -> 0x0067 }
            if (r4 != 0) goto L_0x0042
            java.lang.String r10 = "Context has no PackageManager."
            goto L_0x0060
        L_0x0042:
            android.content.ComponentName r5 = new android.content.ComponentName     // Catch:{ NameNotFoundException -> 0x0067 }
            r5.<init>(r9, r10)     // Catch:{ NameNotFoundException -> 0x0067 }
            r6 = 128(0x80, float:1.794E-43)
            android.content.pm.ServiceInfo r4 = r4.getServiceInfo(r5, r6)     // Catch:{ NameNotFoundException -> 0x0067 }
            if (r4 != 0) goto L_0x0064
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ NameNotFoundException -> 0x0067 }
            r4.<init>()     // Catch:{ NameNotFoundException -> 0x0067 }
            r4.append(r10)     // Catch:{ NameNotFoundException -> 0x0067 }
            java.lang.String r10 = " has no service info."
            r4.append(r10)     // Catch:{ NameNotFoundException -> 0x0067 }
            java.lang.String r10 = r4.toString()     // Catch:{ NameNotFoundException -> 0x0067 }
        L_0x0060:
            android.util.Log.w(r2, r10)     // Catch:{ NameNotFoundException -> 0x0067 }
            goto L_0x006c
        L_0x0064:
            android.os.Bundle r10 = r4.metaData     // Catch:{ NameNotFoundException -> 0x0067 }
            goto L_0x006d
        L_0x0067:
            java.lang.String r10 = "Application info not found."
            android.util.Log.w(r2, r10)
        L_0x006c:
            r10 = r3
        L_0x006d:
            if (r10 != 0) goto L_0x0079
            java.lang.String r10 = "Could not retrieve metadata, returning empty list of registrars."
            android.util.Log.w(r2, r10)
            java.util.List r10 = java.util.Collections.emptyList()
            goto L_0x00b1
        L_0x0079:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Set r4 = r10.keySet()
            java.util.Iterator r4 = r4.iterator()
        L_0x0086:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x00b0
            java.lang.Object r5 = r4.next()
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r6 = r10.get(r5)
            java.lang.String r7 = "com.google.firebase.components.ComponentRegistrar"
            boolean r6 = r7.equals(r6)
            if (r6 == 0) goto L_0x0086
            java.lang.String r6 = "com.google.firebase.components:"
            boolean r6 = r5.startsWith(r6)
            if (r6 == 0) goto L_0x0086
            r6 = 31
            java.lang.String r5 = r5.substring(r6)
            r2.add(r5)
            goto L_0x0086
        L_0x00b0:
            r10 = r2
        L_0x00b1:
            java.util.Iterator r10 = r10.iterator()
        L_0x00b5:
            boolean r2 = r10.hasNext()
            if (r2 == 0) goto L_0x00ca
            java.lang.Object r2 = r10.next()
            java.lang.String r2 = (java.lang.String) r2
            b.l.d.p.f r4 = new b.l.d.p.f
            r4.<init>(r2)
            r0.add(r4)
            goto L_0x00b5
        L_0x00ca:
            java.util.concurrent.Executor r10 = f4910j
            int r2 = b.l.d.p.m.f5041g
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r2.addAll(r0)
            com.google.firebase.FirebaseCommonRegistrar r0 = new com.google.firebase.FirebaseCommonRegistrar
            r0.<init>()
            b.l.d.p.n r5 = new b.l.d.p.n
            r5.<init>(r0)
            r2.add(r5)
            java.lang.Class<android.content.Context> r0 = android.content.Context.class
            java.lang.Class[] r5 = new java.lang.Class[r1]
            b.l.d.p.d r0 = b.l.d.p.d.c(r9, r0, r5)
            r4.add(r0)
            java.lang.Class<b.l.d.d> r0 = b.l.d.d.class
            java.lang.Class[] r5 = new java.lang.Class[r1]
            b.l.d.p.d r0 = b.l.d.p.d.c(r8, r0, r5)
            r4.add(r0)
            java.lang.Class<b.l.d.l> r0 = b.l.d.l.class
            java.lang.Class[] r1 = new java.lang.Class[r1]
            b.l.d.p.d r11 = b.l.d.p.d.c(r11, r0, r1)
            r4.add(r11)
            b.l.d.p.m r11 = new b.l.d.p.m
            r11.<init>(r10, r2, r4, r3)
            r8.d = r11
            b.l.d.p.x r10 = new b.l.d.p.x
            b.l.d.c r11 = new b.l.d.c
            r11.<init>(r8, r9)
            r10.<init>(r11)
            r8.f4914g = r10
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: b.l.d.d.<init>(android.content.Context, java.lang.String, b.l.d.l):void");
    }

    public static List<String> b() {
        ArrayList arrayList = new ArrayList();
        synchronized (f4909i) {
            for (d next : f4911k.values()) {
                next.a();
                arrayList.add(next.f4912b);
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    @NonNull
    public static d c() {
        d dVar;
        synchronized (f4909i) {
            dVar = f4911k.get("[DEFAULT]");
            if (dVar == null) {
                throw new IllegalStateException("Default FirebaseApp is not initialized in this process " + b.l.a.c.c.p.e.a() + ". Make sure to call FirebaseApp.initializeApp(Context) first.");
            }
        }
        return dVar;
    }

    @NonNull
    public static d d(@NonNull String str) {
        d dVar;
        String str2;
        synchronized (f4909i) {
            dVar = f4911k.get(str.trim());
            if (dVar == null) {
                List<String> b2 = b();
                if (((ArrayList) b2).isEmpty()) {
                    str2 = "";
                } else {
                    str2 = "Available app names: " + TextUtils.join(", ", b2);
                }
                throw new IllegalStateException(String.format("FirebaseApp with name %s doesn't exist. %s", new Object[]{str, str2}));
            }
        }
        return dVar;
    }

    @NonNull
    public static d g(@NonNull Context context, @NonNull l lVar, @NonNull String str) {
        d dVar;
        AtomicReference<c> atomicReference = c.a;
        if (context.getApplicationContext() instanceof Application) {
            Application application = (Application) context.getApplicationContext();
            if (c.a.get() == null) {
                c cVar = new c();
                if (c.a.compareAndSet((Object) null, cVar)) {
                    b.l.a.c.c.l.k.c.b(application);
                    b.l.a.c.c.l.k.c.f2618l.a(cVar);
                }
            }
        }
        String trim = str.trim();
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        synchronized (f4909i) {
            Map<String, d> map = f4911k;
            boolean z = !map.containsKey(trim);
            b.l.a.c.b.a.G(z, "FirebaseApp name " + trim + " already exists!");
            b.l.a.c.b.a.B(context, "Application context cannot be null.");
            dVar = new d(context, trim, lVar);
            map.put(trim, dVar);
        }
        dVar.f();
        return dVar;
    }

    public final void a() {
        b.l.a.c.b.a.G(!this.f.get(), "FirebaseApp was deleted");
    }

    public String e() {
        String str;
        StringBuilder sb = new StringBuilder();
        a();
        byte[] bytes = this.f4912b.getBytes(Charset.defaultCharset());
        String str2 = null;
        if (bytes == null) {
            str = null;
        } else {
            str = Base64.encodeToString(bytes, 11);
        }
        sb.append(str);
        sb.append(BadgeDrawable.DEFAULT_EXCEED_MAX_BADGE_NUMBER_SUFFIX);
        a();
        byte[] bytes2 = this.c.f4918b.getBytes(Charset.defaultCharset());
        if (bytes2 != null) {
            str2 = Base64.encodeToString(bytes2, 11);
        }
        sb.append(str2);
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof d)) {
            return false;
        }
        String str = this.f4912b;
        d dVar = (d) obj;
        dVar.a();
        return str.equals(dVar.f4912b);
    }

    public final void f() {
        HashMap hashMap;
        if (!UserManagerCompat.isUserUnlocked(this.a)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Device in Direct Boot Mode: postponing initialization of Firebase APIs for app ");
            a();
            sb.append(this.f4912b);
            Log.i("FirebaseApp", sb.toString());
            Context context = this.a;
            if (e.f4917b.get() == null) {
                e eVar = new e(context);
                if (e.f4917b.compareAndSet((Object) null, eVar)) {
                    context.registerReceiver(eVar, new IntentFilter("android.intent.action.USER_UNLOCKED"));
                    return;
                }
                return;
            }
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Device unlocked: initializing all Firebase APIs for app ");
        a();
        sb2.append(this.f4912b);
        Log.i("FirebaseApp", sb2.toString());
        m mVar = this.d;
        boolean i2 = i();
        if (mVar.f.compareAndSet((Object) null, Boolean.valueOf(i2))) {
            synchronized (mVar) {
                hashMap = new HashMap(mVar.a);
            }
            mVar.e(hashMap, i2);
        }
    }

    public boolean h() {
        boolean z;
        a();
        b.l.d.y.a aVar = this.f4914g.get();
        synchronized (aVar) {
            z = aVar.d;
        }
        return z;
    }

    public int hashCode() {
        return this.f4912b.hashCode();
    }

    @VisibleForTesting
    public boolean i() {
        a();
        return "[DEFAULT]".equals(this.f4912b);
    }

    public String toString() {
        r rVar = new r(this, (q0) null);
        rVar.a("name", this.f4912b);
        rVar.a("options", this.c);
        return rVar.toString();
    }
}
