package com.google.firebase.iid;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import android.os.Looper;
import android.util.Base64;
import android.util.Log;
import android.util.Pair;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import b.l.d.a0.h;
import b.l.d.d;
import b.l.d.v.a0;
import b.l.d.v.b;
import b.l.d.v.b0;
import b.l.d.v.j0;
import b.l.d.v.p0;
import b.l.d.v.q;
import b.l.d.v.q0;
import b.l.d.v.r0;
import b.l.d.v.t;
import b.l.d.v.t0;
import b.l.d.v.u;
import b.l.d.v.w0;
import b.l.d.v.x;
import b.l.d.v.x0;
import b.l.d.v.z;
import com.amplitude.api.Constants;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class FirebaseInstanceId {

    /* renamed from: i  reason: collision with root package name */
    public static final long f7350i = TimeUnit.HOURS.toSeconds(8);

    /* renamed from: j  reason: collision with root package name */
    public static x f7351j;

    /* renamed from: k  reason: collision with root package name */
    public static ScheduledExecutorService f7352k;
    public final Executor a;

    /* renamed from: b  reason: collision with root package name */
    public final d f7353b;
    public final q c;
    public b d;

    /* renamed from: e  reason: collision with root package name */
    public final t f7354e;
    public final b0 f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f7355g = false;

    /* renamed from: h  reason: collision with root package name */
    public final a f7356h;

    public class a {
        public final boolean a;

        /* renamed from: b  reason: collision with root package name */
        public final b.l.d.t.d f7357b;
        @Nullable
        public b.l.d.t.b<b.l.d.a> c;
        @Nullable
        public Boolean d;

        public a(b.l.d.t.d dVar) {
            boolean z;
            Boolean bool;
            ApplicationInfo applicationInfo;
            Bundle bundle;
            this.f7357b = dVar;
            try {
                Class.forName("b.l.d.z.a");
            } catch (ClassNotFoundException unused) {
                d dVar2 = FirebaseInstanceId.this.f7353b;
                dVar2.a();
                Context context = dVar2.a;
                Intent intent = new Intent("com.google.firebase.MESSAGING_EVENT");
                intent.setPackage(context.getPackageName());
                ResolveInfo resolveService = context.getPackageManager().resolveService(intent, 0);
                z = (resolveService == null || resolveService.serviceInfo == null) ? false : z;
            }
            z = true;
            this.a = z;
            d dVar3 = FirebaseInstanceId.this.f7353b;
            dVar3.a();
            Context context2 = dVar3.a;
            SharedPreferences sharedPreferences = context2.getSharedPreferences("com.google.firebase.messaging", 0);
            if (sharedPreferences.contains("auto_init")) {
                bool = Boolean.valueOf(sharedPreferences.getBoolean("auto_init", false));
            } else {
                try {
                    PackageManager packageManager = context2.getPackageManager();
                    if (!(packageManager == null || (applicationInfo = packageManager.getApplicationInfo(context2.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_messaging_auto_init_enabled"))) {
                        bool = Boolean.valueOf(applicationInfo.metaData.getBoolean("firebase_messaging_auto_init_enabled"));
                    }
                } catch (PackageManager.NameNotFoundException unused2) {
                }
                bool = null;
            }
            this.d = bool;
            if (bool == null && this.a) {
                r0 r0Var = new r0(this);
                this.c = r0Var;
                dVar.a(b.l.d.a.class, r0Var);
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:14:0x001b, code lost:
            return r1.a && r1.f7358e.f7353b.h();
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final synchronized boolean a() {
            /*
                r1 = this;
                monitor-enter(r1)
                java.lang.Boolean r0 = r1.d     // Catch:{ all -> 0x001e }
                if (r0 == 0) goto L_0x000b
                boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x001e }
                monitor-exit(r1)
                return r0
            L_0x000b:
                boolean r0 = r1.a     // Catch:{ all -> 0x001e }
                if (r0 == 0) goto L_0x001c
                com.google.firebase.iid.FirebaseInstanceId r0 = com.google.firebase.iid.FirebaseInstanceId.this     // Catch:{ all -> 0x001e }
                b.l.d.d r0 = r0.f7353b     // Catch:{ all -> 0x001e }
                boolean r0 = r0.h()     // Catch:{ all -> 0x001e }
                if (r0 == 0) goto L_0x001c
                r0 = 1
            L_0x001a:
                monitor-exit(r1)
                return r0
            L_0x001c:
                r0 = 0
                goto L_0x001a
            L_0x001e:
                r0 = move-exception
                monitor-exit(r1)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.iid.FirebaseInstanceId.a.a():boolean");
        }
    }

    public FirebaseInstanceId(d dVar, b.l.d.t.d dVar2, h hVar) {
        dVar.a();
        q qVar = new q(dVar.a);
        Executor a2 = j0.a();
        Executor a3 = j0.a();
        if (q.a(dVar) != null) {
            synchronized (FirebaseInstanceId.class) {
                if (f7351j == null) {
                    dVar.a();
                    f7351j = new x(dVar.a);
                }
            }
            this.f7353b = dVar;
            this.c = qVar;
            if (this.d == null) {
                dVar.a();
                b bVar = (b) dVar.d.a(b.class);
                this.d = (bVar == null || !bVar.e()) ? new t0(dVar, qVar, a2, hVar) : bVar;
            }
            this.d = this.d;
            this.a = a3;
            this.f = new b0(f7351j);
            a aVar = new a(dVar2);
            this.f7356h = aVar;
            this.f7354e = new t(a2);
            if (aVar.a()) {
                k();
                return;
            }
            return;
        }
        throw new IllegalStateException("FirebaseInstanceId failed to initialize, FirebaseApp is missing project ID");
    }

    public static FirebaseInstanceId a() {
        return getInstance(d.c());
    }

    public static void f(Runnable runnable, long j2) {
        synchronized (FirebaseInstanceId.class) {
            if (f7352k == null) {
                f7352k = new ScheduledThreadPoolExecutor(1, new b.l.a.c.c.p.g.a("FirebaseInstanceId"));
            }
            f7352k.schedule(runnable, j2, TimeUnit.SECONDS);
        }
    }

    @Keep
    public static FirebaseInstanceId getInstance(@NonNull d dVar) {
        dVar.a();
        return (FirebaseInstanceId) dVar.d.a(FirebaseInstanceId.class);
    }

    @Nullable
    public static a0 j(String str, String str2) {
        a0 b2;
        x xVar = f7351j;
        synchronized (xVar) {
            b2 = a0.b(xVar.a.getString(x.a("", str, str2), (String) null));
        }
        return b2;
    }

    public static String l() {
        x0 x0Var;
        x xVar = f7351j;
        synchronized (xVar) {
            x0Var = xVar.d.get("");
            if (x0Var == null) {
                try {
                    x0Var = xVar.c.h(xVar.f5348b, "");
                } catch (b.l.d.v.d unused) {
                    Log.w("FirebaseInstanceId", "Stored data is corrupt, generating new identity");
                    a().o();
                    x0Var = xVar.c.j(xVar.f5348b, "");
                }
                xVar.d.put("", x0Var);
            }
        }
        try {
            byte[] digest = MessageDigest.getInstance("SHA1").digest(x0Var.a.getPublic().getEncoded());
            digest[0] = (byte) ((digest[0] & 15) + 112);
            return Base64.encodeToString(digest, 0, 8, 11);
        } catch (NoSuchAlgorithmException unused2) {
            Log.w("FirebaseInstanceId", "Unexpected error, device missing required algorithms");
            return null;
        }
    }

    public static boolean n() {
        return Log.isLoggable("FirebaseInstanceId", 3);
    }

    @WorkerThread
    public String b(String str, String str2) {
        if (Looper.getMainLooper() != Looper.myLooper()) {
            if (str2.isEmpty() || str2.equalsIgnoreCase("fcm") || str2.equalsIgnoreCase("gcm")) {
                str2 = "*";
            }
            return ((b.l.d.v.a) d(b.l.a.c.b.a.X(null).h(this.a, new p0(this, str, str2)))).a();
        }
        throw new IOException("MAIN_THREAD");
    }

    public final synchronized void c() {
        if (!this.f7355g) {
            e(0);
        }
    }

    public final <T> T d(b.l.a.c.k.h<T> hVar) {
        try {
            return b.l.a.c.b.a.c(hVar, Constants.EVENT_UPLOAD_PERIOD_MILLIS, TimeUnit.MILLISECONDS);
        } catch (ExecutionException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof IOException) {
                if ("INSTANCE_ID_RESET".equals(cause.getMessage())) {
                    o();
                }
                throw ((IOException) cause);
            } else if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            } else {
                throw new IOException(e2);
            }
        } catch (InterruptedException | TimeoutException unused) {
            throw new IOException("SERVICE_NOT_AVAILABLE");
        }
    }

    public final synchronized void e(long j2) {
        f(new z(this, this.f, Math.min(Math.max(30, j2 << 1), f7350i)), j2);
        this.f7355g = true;
    }

    public final synchronized void g(boolean z) {
        this.f7355g = z;
    }

    public final boolean h(@Nullable a0 a0Var) {
        if (a0Var != null) {
            return (System.currentTimeMillis() > (a0Var.c + a0.d) ? 1 : (System.currentTimeMillis() == (a0Var.c + a0.d) ? 0 : -1)) > 0 || !this.c.c().equals(a0Var.f5303b);
        }
    }

    public final b.l.a.c.k.h i(String str, String str2) {
        b.l.a.c.k.h<TContinuationResult> hVar;
        String l2 = l();
        a0 j2 = j(str, str2);
        if (!this.d.c() && !h(j2)) {
            return b.l.a.c.b.a.X(new w0(l2, j2.a));
        }
        int i2 = a0.f5302e;
        String str3 = j2 == null ? null : j2.a;
        t tVar = this.f7354e;
        synchronized (tVar) {
            Pair pair = new Pair(str, str2);
            hVar = tVar.f5340b.get(pair);
            if (hVar == null) {
                if (Log.isLoggable("FirebaseInstanceId", 3)) {
                    String valueOf = String.valueOf(pair);
                    StringBuilder sb = new StringBuilder(valueOf.length() + 24);
                    sb.append("Making new request for: ");
                    sb.append(valueOf);
                    Log.d("FirebaseInstanceId", sb.toString());
                }
                hVar = this.d.d(l2, str3, str, str2).o(this.a, new q0(this, str, str2, l2)).h(tVar.a, new u(tVar, pair));
                tVar.f5340b.put(pair, hVar);
            } else if (Log.isLoggable("FirebaseInstanceId", 3)) {
                String valueOf2 = String.valueOf(pair);
                StringBuilder sb2 = new StringBuilder(valueOf2.length() + 29);
                sb2.append("Joining ongoing request for: ");
                sb2.append(valueOf2);
                Log.d("FirebaseInstanceId", sb2.toString());
            }
        }
        return hVar;
    }

    public final void k() {
        boolean z;
        a0 m2 = m();
        if (!this.d.c() && !h(m2)) {
            b0 b0Var = this.f;
            synchronized (b0Var) {
                z = b0Var.a() != null;
            }
            if (!z) {
                return;
            }
        }
        c();
    }

    @Nullable
    public final a0 m() {
        return j(q.a(this.f7353b), "*");
    }

    public final synchronized void o() {
        f7351j.c();
        if (this.f7356h.a()) {
            c();
        }
    }
}
