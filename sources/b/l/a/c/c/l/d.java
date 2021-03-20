package b.l.a.c.c.l;

import android.accounts.Account;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import b.l.a.c.c.l.a;
import b.l.a.c.c.l.a.d;
import b.l.a.c.c.l.k.b;
import b.l.a.c.c.l.k.e1;
import b.l.a.c.c.l.k.g;
import b.l.a.c.c.l.k.i1;
import b.l.a.c.c.l.k.o;
import b.l.a.c.c.l.k.p;
import b.l.a.c.c.l.k.q1;
import b.l.a.c.c.l.k.s1;
import b.l.a.c.k.h;
import b.l.a.c.k.i;

public class d<O extends a.d> {
    public final Context a;

    /* renamed from: b  reason: collision with root package name */
    public final a<O> f2608b;
    public final O c;
    public final b<O> d;

    /* renamed from: e  reason: collision with root package name */
    public final Looper f2609e;
    public final int f;

    /* renamed from: g  reason: collision with root package name */
    public final o f2610g;

    /* renamed from: h  reason: collision with root package name */
    public final g f2611h;

    public static class a {
        public static final a c = new a(new b.l.a.c.c.l.k.a(), (Account) null, Looper.getMainLooper());
        public final o a;

        /* renamed from: b  reason: collision with root package name */
        public final Looper f2612b;

        public a(o oVar, Account account, Looper looper) {
            this.a = oVar;
            this.f2612b = looper;
        }
    }

    public d(@NonNull Context context, a<O> aVar, @Nullable O o2, a aVar2) {
        b.l.a.c.b.a.B(context, "Null context is not permitted.");
        b.l.a.c.b.a.B(aVar, "Api must not be null.");
        b.l.a.c.b.a.B(aVar2, "Settings must not be null; use Settings.DEFAULT_SETTINGS instead.");
        Context applicationContext = context.getApplicationContext();
        this.a = applicationContext;
        this.f2608b = aVar;
        this.c = o2;
        this.f2609e = aVar2.f2612b;
        this.d = new b<>(aVar, o2);
        g a2 = g.a(applicationContext);
        this.f2611h = a2;
        this.f = a2.f2645e.getAndIncrement();
        this.f2610g = aVar2.a;
        Handler handler = a2.f2649j;
        handler.sendMessage(handler.obtainMessage(7, this));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0038, code lost:
        r1 = ((b.l.a.c.c.l.a.d.b) r1).b();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public b.l.a.c.c.m.d.a a() {
        /*
            r4 = this;
            b.l.a.c.c.m.d$a r0 = new b.l.a.c.c.m.d$a
            r0.<init>()
            O r1 = r4.c
            boolean r2 = r1 instanceof b.l.a.c.c.l.a.d.b
            r3 = 0
            if (r2 == 0) goto L_0x0024
            b.l.a.c.c.l.a$d$b r1 = (b.l.a.c.c.l.a.d.b) r1
            com.google.android.gms.auth.api.signin.GoogleSignInAccount r1 = r1.b()
            if (r1 == 0) goto L_0x0024
            java.lang.String r2 = r1.f7238k
            if (r2 != 0) goto L_0x0019
            goto L_0x0030
        L_0x0019:
            android.accounts.Account r2 = new android.accounts.Account
            java.lang.String r1 = r1.f7238k
            java.lang.String r3 = "com.google"
            r2.<init>(r1, r3)
            r3 = r2
            goto L_0x0030
        L_0x0024:
            O r1 = r4.c
            boolean r2 = r1 instanceof b.l.a.c.c.l.a.d.C0059a
            if (r2 == 0) goto L_0x0030
            b.l.a.c.c.l.a$d$a r1 = (b.l.a.c.c.l.a.d.C0059a) r1
            android.accounts.Account r3 = r1.a()
        L_0x0030:
            r0.a = r3
            O r1 = r4.c
            boolean r2 = r1 instanceof b.l.a.c.c.l.a.d.b
            if (r2 == 0) goto L_0x0045
            b.l.a.c.c.l.a$d$b r1 = (b.l.a.c.c.l.a.d.b) r1
            com.google.android.gms.auth.api.signin.GoogleSignInAccount r1 = r1.b()
            if (r1 == 0) goto L_0x0045
            java.util.Set r1 = r1.V()
            goto L_0x0049
        L_0x0045:
            java.util.Set r1 = java.util.Collections.emptySet()
        L_0x0049:
            androidx.collection.ArraySet<com.google.android.gms.common.api.Scope> r2 = r0.f2775b
            if (r2 != 0) goto L_0x0054
            androidx.collection.ArraySet r2 = new androidx.collection.ArraySet
            r2.<init>()
            r0.f2775b = r2
        L_0x0054:
            androidx.collection.ArraySet<com.google.android.gms.common.api.Scope> r2 = r0.f2775b
            r2.addAll(r1)
            android.content.Context r1 = r4.a
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            r0.d = r1
            android.content.Context r1 = r4.a
            java.lang.String r1 = r1.getPackageName()
            r0.c = r1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: b.l.a.c.c.l.d.a():b.l.a.c.c.m.d$a");
    }

    public <A extends a.b, T extends b.l.a.c.c.l.k.d<? extends h, A>> T b(@NonNull T t) {
        t.i();
        g gVar = this.f2611h;
        q1 q1Var = new q1(1, t);
        Handler handler = gVar.f2649j;
        handler.sendMessage(handler.obtainMessage(4, new e1(q1Var, gVar.f.get(), this)));
        return t;
    }

    @WorkerThread
    public a.f c(Looper looper, g.a<O> aVar) {
        b.l.a.c.c.m.d a2 = a().a();
        a<O> aVar2 = this.f2608b;
        b.l.a.c.b.a.G(aVar2.a != null, "This API was constructed with a SimpleClientBuilder. Use getSimpleClientBuilder");
        return aVar2.a.a(this.a, looper, a2, this.c, aVar, aVar);
    }

    public i1 d(Context context, Handler handler) {
        return new i1(context, handler, a().a(), i1.f2668h);
    }

    public final <TResult, A extends a.b> h<TResult> e(int i2, @NonNull p<A, TResult> pVar) {
        i iVar = new i();
        g gVar = this.f2611h;
        s1 s1Var = new s1(i2, pVar, iVar, this.f2610g);
        Handler handler = gVar.f2649j;
        handler.sendMessage(handler.obtainMessage(4, new e1(s1Var, gVar.f.get(), this)));
        return iVar.a;
    }
}
