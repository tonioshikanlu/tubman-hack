package b.l.a.c.f.e;

import android.content.Context;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.os.Build;
import android.util.Base64;
import android.util.Log;
import androidx.annotation.NonNull;
import b.l.a.c.c.d;
import b.l.a.c.c.l.k.p;
import b.l.a.c.c.n.a;
import b.l.a.c.f.b.b;
import b.l.a.c.f.b.h;
import b.l.a.c.f.b.j;
import b.l.a.c.k.e0;
import b.l.d.o.x;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Objects;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public final class sj {
    public static final a d = new a("FirebaseAuth", "SmsRetrieverHelper");
    public final Context a;

    /* renamed from: b  reason: collision with root package name */
    public final ScheduledExecutorService f3272b;
    public final HashMap<String, rj> c = new HashMap<>();

    public sj(@NonNull Context context) {
        this.a = context;
        this.f3272b = Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1));
    }

    public static /* synthetic */ void f(sj sjVar, String str) {
        rj rjVar = sjVar.c.get(str);
        if (rjVar != null && !b.l.a.c.b.a.M1(rjVar.d) && !b.l.a.c.b.a.M1(rjVar.f3259e) && !rjVar.f3258b.isEmpty()) {
            for (ei d2 : rjVar.f3258b) {
                d2.d(x.V(rjVar.d, rjVar.f3259e));
            }
            rjVar.f3261h = true;
        }
    }

    public static String g(String str, String str2) {
        String r = b.e.a.a.a.r(new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(str2).length()), str, " ", str2);
        try {
            MessageDigest instance = MessageDigest.getInstance("SHA-256");
            instance.update(r.getBytes(qg.a));
            String substring = Base64.encodeToString(Arrays.copyOf(instance.digest(), 9), 3).substring(0, 11);
            a aVar = d;
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 19 + String.valueOf(substring).length());
            sb.append("Package: ");
            sb.append(str);
            sb.append(" -- Hash: ");
            sb.append(substring);
            aVar.a(sb.toString(), new Object[0]);
            return substring;
        } catch (NoSuchAlgorithmException e2) {
            a aVar2 = d;
            String valueOf = String.valueOf(e2.getMessage());
            aVar2.b(valueOf.length() != 0 ? "NoSuchAlgorithm: ".concat(valueOf) : new String("NoSuchAlgorithm: "), new Object[0]);
            return null;
        }
    }

    public final boolean a(String str) {
        return this.c.get(str) != null;
    }

    public final void b(String str, ei eiVar, long j2, boolean z) {
        this.c.put(str, new rj(j2, z));
        c(eiVar, str);
        rj rjVar = this.c.get(str);
        long j3 = rjVar.a;
        if (j3 <= 0) {
            a aVar = d;
            Log.w(aVar.a, aVar.c("Timeout of 0 specified; SmsRetriever will not start.", new Object[0]));
            return;
        }
        rjVar.f = this.f3272b.schedule(new nj(this, str), j3, TimeUnit.SECONDS);
        if (!rjVar.c) {
            a aVar2 = d;
            Log.w(aVar2.a, aVar2.c("SMS auto-retrieval unavailable; SmsRetriever will not start.", new Object[0]));
            return;
        }
        qj qjVar = new qj(this, str);
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.google.android.gms.auth.api.phone.SMS_RETRIEVED");
        this.a.getApplicationContext().registerReceiver(qjVar, intentFilter);
        h hVar = new h(this.a);
        p.a a2 = p.a();
        a2.a = new j(hVar);
        a2.f2692b = new d[]{b.f2836b};
        b.l.a.c.k.h e2 = hVar.e(1, a2.a());
        oj ojVar = new oj();
        e0 e0Var = (e0) e2;
        Objects.requireNonNull(e0Var);
        e0Var.d(b.l.a.c.k.j.a, ojVar);
    }

    public final void c(ei eiVar, String str) {
        rj rjVar = this.c.get(str);
        if (rjVar != null) {
            rjVar.f3258b.add(eiVar);
            if (rjVar.f3260g) {
                eiVar.c(rjVar.d);
            }
            if (rjVar.f3261h) {
                eiVar.d(x.V(rjVar.d, rjVar.f3259e));
            }
            if (rjVar.f3262i) {
                eiVar.e(rjVar.d);
            }
        }
    }

    public final String d() {
        try {
            String packageName = this.a.getPackageName();
            String g2 = g(packageName, (Build.VERSION.SDK_INT < 28 ? b.l.a.c.c.q.b.a(this.a).b(packageName, 64).signatures : b.l.a.c.c.q.b.a(this.a).b(packageName, 134217728).signingInfo.getApkContentsSigners())[0].toCharsString());
            if (g2 != null) {
                return g2;
            }
            a aVar = d;
            Log.e(aVar.a, aVar.c("Hash generation failed.", new Object[0]));
            return null;
        } catch (PackageManager.NameNotFoundException unused) {
            a aVar2 = d;
            Log.e(aVar2.a, aVar2.c("Unable to find package to obtain hash.", new Object[0]));
            return null;
        }
    }

    public final void e(String str) {
        rj rjVar = this.c.get(str);
        if (rjVar != null) {
            ScheduledFuture<?> scheduledFuture = rjVar.f;
            if (scheduledFuture != null && !scheduledFuture.isDone()) {
                rjVar.f.cancel(false);
            }
            rjVar.f3258b.clear();
            this.c.remove(str);
        }
    }

    public final void h(String str) {
        rj rjVar = this.c.get(str);
        if (rjVar != null) {
            if (!rjVar.f3262i) {
                i(str);
            }
            e(str);
        }
    }

    public final void i(String str) {
        rj rjVar = this.c.get(str);
        if (rjVar != null && !rjVar.f3261h && !b.l.a.c.b.a.M1(rjVar.d)) {
            a aVar = d;
            Log.w(aVar.a, aVar.c("Timed out waiting for SMS.", new Object[0]));
            for (ei e2 : rjVar.f3258b) {
                e2.e(rjVar.d);
            }
            rjVar.f3262i = true;
        }
    }
}
