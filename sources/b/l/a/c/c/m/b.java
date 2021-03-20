package b.l.a.c.c.m;

import android.accounts.Account;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.BinderThread;
import androidx.annotation.CallSuper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import b.l.a.c.c.l.k.w0;
import b.l.a.c.c.l.k.x0;
import b.l.a.c.c.m.k;
import b.l.a.c.c.m.o;
import b.l.a.c.c.m.p;
import b.l.a.c.f.e.ti;
import com.google.android.gms.common.api.Scope;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Locale;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

public abstract class b<T extends IInterface> {
    public static final b.l.a.c.c.d[] A = new b.l.a.c.c.d[0];
    public int a;

    /* renamed from: b  reason: collision with root package name */
    public long f2745b;
    public long c;
    public int d;

    /* renamed from: e  reason: collision with root package name */
    public long f2746e;
    public i0 f;

    /* renamed from: g  reason: collision with root package name */
    public final Context f2747g;

    /* renamed from: h  reason: collision with root package name */
    public final k f2748h;

    /* renamed from: i  reason: collision with root package name */
    public final b.l.a.c.c.f f2749i;

    /* renamed from: j  reason: collision with root package name */
    public final Handler f2750j;

    /* renamed from: k  reason: collision with root package name */
    public final Object f2751k = new Object();

    /* renamed from: l  reason: collision with root package name */
    public final Object f2752l = new Object();

    /* renamed from: m  reason: collision with root package name */
    public p f2753m;

    /* renamed from: n  reason: collision with root package name */
    public c f2754n;

    /* renamed from: o  reason: collision with root package name */
    public T f2755o;

    /* renamed from: p  reason: collision with root package name */
    public final ArrayList<g<?>> f2756p = new ArrayList<>();

    /* renamed from: q  reason: collision with root package name */
    public j f2757q;
    public int r = 1;
    public final a s;
    public final C0060b t;
    public final int u;
    public final String v;
    public b.l.a.c.c.b w = null;
    public boolean x = false;
    public volatile c0 y = null;
    public AtomicInteger z = new AtomicInteger(0);

    public interface a {
        void g(int i2);

        void k(@Nullable Bundle bundle);
    }

    /* renamed from: b.l.a.c.c.m.b$b  reason: collision with other inner class name */
    public interface C0060b {
        void n(@NonNull b.l.a.c.c.b bVar);
    }

    public interface c {
        void a(@NonNull b.l.a.c.c.b bVar);
    }

    public class d implements c {
        public d() {
        }

        public void a(@NonNull b.l.a.c.c.b bVar) {
            if (bVar.W()) {
                b bVar2 = b.this;
                bVar2.j((n) null, bVar2.A());
                return;
            }
            C0060b bVar3 = b.this.t;
            if (bVar3 != null) {
                bVar3.n(bVar);
            }
        }
    }

    public interface e {
    }

    public abstract class f extends g<Boolean> {
        public final int d;

        /* renamed from: e  reason: collision with root package name */
        public final Bundle f2758e;

        @BinderThread
        public f(int i2, Bundle bundle) {
            super(Boolean.TRUE);
            this.d = i2;
            this.f2758e = bundle;
        }

        /* JADX WARNING: type inference failed for: r5v12, types: [android.os.Parcelable] */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ void b(java.lang.Object r5) {
            /*
                r4 = this;
                java.lang.Boolean r5 = (java.lang.Boolean) r5
                int r5 = r4.d
                r0 = 1
                r1 = 0
                if (r5 == 0) goto L_0x0056
                r2 = 10
                if (r5 == r2) goto L_0x0026
                b.l.a.c.c.m.b r5 = b.l.a.c.c.m.b.this
                r5.H(r0, r1)
                android.os.Bundle r5 = r4.f2758e
                if (r5 == 0) goto L_0x001e
                java.lang.String r0 = "pendingIntent"
                android.os.Parcelable r5 = r5.getParcelable(r0)
                r1 = r5
                android.app.PendingIntent r1 = (android.app.PendingIntent) r1
            L_0x001e:
                b.l.a.c.c.b r5 = new b.l.a.c.c.b
                int r0 = r4.d
                r5.<init>(r0, r1)
                goto L_0x0068
            L_0x0026:
                b.l.a.c.c.m.b r5 = b.l.a.c.c.m.b.this
                r5.H(r0, r1)
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                r1 = 3
                java.lang.Object[] r1 = new java.lang.Object[r1]
                r2 = 0
                java.lang.Class r3 = r4.getClass()
                java.lang.String r3 = r3.getSimpleName()
                r1[r2] = r3
                b.l.a.c.c.m.b r2 = b.l.a.c.c.m.b.this
                java.lang.String r2 = r2.D()
                r1[r0] = r2
                r0 = 2
                b.l.a.c.c.m.b r2 = b.l.a.c.c.m.b.this
                java.lang.String r2 = r2.C()
                r1[r0] = r2
                java.lang.String r0 = "A fatal developer error has occurred. Class name: %s. Start service action: %s. Service Descriptor: %s. "
                java.lang.String r0 = java.lang.String.format(r0, r1)
                r5.<init>(r0)
                throw r5
            L_0x0056:
                boolean r5 = r4.e()
                if (r5 != 0) goto L_0x006b
                b.l.a.c.c.m.b r5 = b.l.a.c.c.m.b.this
                r5.H(r0, r1)
                b.l.a.c.c.b r5 = new b.l.a.c.c.b
                r0 = 8
                r5.<init>(r0, r1)
            L_0x0068:
                r4.d(r5)
            L_0x006b:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: b.l.a.c.c.m.b.f.b(java.lang.Object):void");
        }

        public final void c() {
        }

        public abstract void d(b.l.a.c.c.b bVar);

        public abstract boolean e();
    }

    public abstract class g<TListener> {
        public TListener a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f2759b = false;

        public g(TListener tlistener) {
            this.a = tlistener;
        }

        public final void a() {
            synchronized (this) {
                this.a = null;
            }
            synchronized (b.this.f2756p) {
                b.this.f2756p.remove(this);
            }
        }

        public abstract void b(TListener tlistener);

        public abstract void c();
    }

    public final class h extends b.l.a.c.f.d.d {
        public h(Looper looper) {
            super(looper);
        }

        public static boolean a(Message message) {
            int i2 = message.what;
            return i2 == 2 || i2 == 1 || i2 == 7;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v15, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v2, resolved type: android.app.PendingIntent} */
        /* JADX WARNING: Code restructure failed: missing block: B:11:0x002f, code lost:
            if (r0 == 5) goto L_0x0031;
         */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void handleMessage(android.os.Message r8) {
            /*
                r7 = this;
                b.l.a.c.c.m.b r0 = b.l.a.c.c.m.b.this
                java.util.concurrent.atomic.AtomicInteger r0 = r0.z
                int r0 = r0.get()
                int r1 = r8.arg1
                if (r0 == r1) goto L_0x001d
                boolean r0 = a(r8)
                if (r0 == 0) goto L_0x001c
                java.lang.Object r8 = r8.obj
                b.l.a.c.c.m.b$g r8 = (b.l.a.c.c.m.b.g) r8
                r8.c()
                r8.a()
            L_0x001c:
                return
            L_0x001d:
                int r0 = r8.what
                r1 = 4
                r2 = 1
                r3 = 5
                if (r0 == r2) goto L_0x0031
                r4 = 7
                if (r0 == r4) goto L_0x0031
                if (r0 != r1) goto L_0x002f
                b.l.a.c.c.m.b r0 = b.l.a.c.c.m.b.this
                java.util.Objects.requireNonNull(r0)
                goto L_0x0031
            L_0x002f:
                if (r0 != r3) goto L_0x0044
            L_0x0031:
                b.l.a.c.c.m.b r0 = b.l.a.c.c.m.b.this
                boolean r0 = r0.o()
                if (r0 != 0) goto L_0x0044
                java.lang.Object r8 = r8.obj
                b.l.a.c.c.m.b$g r8 = (b.l.a.c.c.m.b.g) r8
                r8.c()
                r8.a()
                return
            L_0x0044:
                int r0 = r8.what
                r4 = 8
                r5 = 3
                r6 = 0
                if (r0 != r1) goto L_0x007e
                b.l.a.c.c.m.b r0 = b.l.a.c.c.m.b.this
                b.l.a.c.c.b r1 = new b.l.a.c.c.b
                int r8 = r8.arg2
                r1.<init>(r8)
                r0.w = r1
                boolean r8 = b.l.a.c.c.m.b.K(r0)
                if (r8 == 0) goto L_0x0067
                b.l.a.c.c.m.b r8 = b.l.a.c.c.m.b.this
                boolean r0 = r8.x
                if (r0 != 0) goto L_0x0067
                r8.H(r5, r6)
                return
            L_0x0067:
                b.l.a.c.c.m.b r8 = b.l.a.c.c.m.b.this
                b.l.a.c.c.b r0 = r8.w
                if (r0 == 0) goto L_0x006e
                goto L_0x0073
            L_0x006e:
                b.l.a.c.c.b r0 = new b.l.a.c.c.b
                r0.<init>(r4)
            L_0x0073:
                b.l.a.c.c.m.b$c r8 = r8.f2754n
                r8.a(r0)
                b.l.a.c.c.m.b r8 = b.l.a.c.c.m.b.this
                r8.F(r0)
                return
            L_0x007e:
                if (r0 != r3) goto L_0x0097
                b.l.a.c.c.m.b r8 = b.l.a.c.c.m.b.this
                b.l.a.c.c.b r0 = r8.w
                if (r0 == 0) goto L_0x0087
                goto L_0x008c
            L_0x0087:
                b.l.a.c.c.b r0 = new b.l.a.c.c.b
                r0.<init>(r4)
            L_0x008c:
                b.l.a.c.c.m.b$c r8 = r8.f2754n
                r8.a(r0)
                b.l.a.c.c.m.b r8 = b.l.a.c.c.m.b.this
                r8.F(r0)
                return
            L_0x0097:
                if (r0 != r5) goto L_0x00b6
                java.lang.Object r0 = r8.obj
                boolean r1 = r0 instanceof android.app.PendingIntent
                if (r1 == 0) goto L_0x00a2
                r6 = r0
                android.app.PendingIntent r6 = (android.app.PendingIntent) r6
            L_0x00a2:
                b.l.a.c.c.b r0 = new b.l.a.c.c.b
                int r8 = r8.arg2
                r0.<init>(r8, r6)
                b.l.a.c.c.m.b r8 = b.l.a.c.c.m.b.this
                b.l.a.c.c.m.b$c r8 = r8.f2754n
                r8.a(r0)
                b.l.a.c.c.m.b r8 = b.l.a.c.c.m.b.this
                r8.F(r0)
                return
            L_0x00b6:
                r1 = 6
                if (r0 != r1) goto L_0x00db
                b.l.a.c.c.m.b r0 = b.l.a.c.c.m.b.this
                r0.H(r3, r6)
                b.l.a.c.c.m.b r0 = b.l.a.c.c.m.b.this
                b.l.a.c.c.m.b$a r0 = r0.s
                if (r0 == 0) goto L_0x00c9
                int r1 = r8.arg2
                r0.g(r1)
            L_0x00c9:
                b.l.a.c.c.m.b r0 = b.l.a.c.c.m.b.this
                int r8 = r8.arg2
                r0.a = r8
                long r4 = java.lang.System.currentTimeMillis()
                r0.f2745b = r4
                b.l.a.c.c.m.b r8 = b.l.a.c.c.m.b.this
                b.l.a.c.c.m.b.J(r8, r3, r2, r6)
                return
            L_0x00db:
                r1 = 2
                if (r0 != r1) goto L_0x00f1
                b.l.a.c.c.m.b r0 = b.l.a.c.c.m.b.this
                boolean r0 = r0.a()
                if (r0 != 0) goto L_0x00f1
                java.lang.Object r8 = r8.obj
                b.l.a.c.c.m.b$g r8 = (b.l.a.c.c.m.b.g) r8
                r8.c()
                r8.a()
                return
            L_0x00f1:
                boolean r0 = a(r8)
                if (r0 == 0) goto L_0x0145
                java.lang.Object r8 = r8.obj
                r0 = r8
                b.l.a.c.c.m.b$g r0 = (b.l.a.c.c.m.b.g) r0
                monitor-enter(r0)
                TListener r8 = r0.a     // Catch:{ all -> 0x0142 }
                boolean r1 = r0.f2759b     // Catch:{ all -> 0x0142 }
                if (r1 == 0) goto L_0x0128
                java.lang.String r1 = "GmsClient"
                java.lang.String r3 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x0142 }
                int r4 = r3.length()     // Catch:{ all -> 0x0142 }
                int r4 = r4 + 47
                java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x0142 }
                r5.<init>(r4)     // Catch:{ all -> 0x0142 }
                java.lang.String r4 = "Callback proxy "
                r5.append(r4)     // Catch:{ all -> 0x0142 }
                r5.append(r3)     // Catch:{ all -> 0x0142 }
                java.lang.String r3 = " being reused. This is not safe."
                r5.append(r3)     // Catch:{ all -> 0x0142 }
                java.lang.String r3 = r5.toString()     // Catch:{ all -> 0x0142 }
                android.util.Log.w(r1, r3)     // Catch:{ all -> 0x0142 }
            L_0x0128:
                monitor-exit(r0)     // Catch:{ all -> 0x0142 }
                if (r8 == 0) goto L_0x0134
                r0.b(r8)     // Catch:{ RuntimeException -> 0x012f }
                goto L_0x0137
            L_0x012f:
                r8 = move-exception
                r0.c()
                throw r8
            L_0x0134:
                r0.c()
            L_0x0137:
                monitor-enter(r0)
                r0.f2759b = r2     // Catch:{ all -> 0x013f }
                monitor-exit(r0)     // Catch:{ all -> 0x013f }
                r0.a()
                return
            L_0x013f:
                r8 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x013f }
                throw r8
            L_0x0142:
                r8 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x0142 }
                throw r8
            L_0x0145:
                java.lang.String r0 = "GmsClient"
                int r8 = r8.what
                r1 = 45
                java.lang.String r2 = "Don't know how to handle message: "
                java.lang.String r8 = b.e.a.a.a.Q(r1, r2, r8)
                java.lang.Exception r1 = new java.lang.Exception
                r1.<init>()
                android.util.Log.wtf(r0, r8, r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: b.l.a.c.c.m.b.h.handleMessage(android.os.Message):void");
        }
    }

    public static final class i extends o.a {
        public b a;

        /* renamed from: b  reason: collision with root package name */
        public final int f2760b;

        public i(@NonNull b bVar, int i2) {
            this.a = bVar;
            this.f2760b = i2;
        }

        @BinderThread
        public final void k1(int i2, @NonNull IBinder iBinder, @Nullable Bundle bundle) {
            b.l.a.c.b.a.B(this.a, "onPostInitComplete can be called only once per call to getRemoteService");
            b bVar = this.a;
            int i3 = this.f2760b;
            Handler handler = bVar.f2750j;
            handler.sendMessage(handler.obtainMessage(1, i3, -1, new l(i2, iBinder, bundle)));
            this.a = null;
        }
    }

    public final class j implements ServiceConnection {
        public final int a;

        public j(int i2) {
            this.a = i2;
        }

        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            b bVar = b.this;
            if (iBinder == null) {
                b.I(bVar);
                return;
            }
            synchronized (bVar.f2752l) {
                b bVar2 = b.this;
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                bVar2.f2753m = (queryLocalInterface == null || !(queryLocalInterface instanceof p)) ? new p.a.C0062a(iBinder) : (p) queryLocalInterface;
            }
            b bVar3 = b.this;
            int i2 = this.a;
            Handler handler = bVar3.f2750j;
            handler.sendMessage(handler.obtainMessage(7, i2, -1, new k(0)));
        }

        public final void onServiceDisconnected(ComponentName componentName) {
            b bVar;
            synchronized (b.this.f2752l) {
                bVar = b.this;
                bVar.f2753m = null;
            }
            Handler handler = bVar.f2750j;
            handler.sendMessage(handler.obtainMessage(6, this.a, 1));
        }
    }

    public final class k extends f {
        @BinderThread
        public k(int i2) {
            super(i2, (Bundle) null);
        }

        public final void d(b.l.a.c.c.b bVar) {
            Objects.requireNonNull(b.this);
            b.this.f2754n.a(bVar);
            b.this.F(bVar);
        }

        public final boolean e() {
            b.this.f2754n.a(b.l.a.c.c.b.f2586l);
            return true;
        }
    }

    public final class l extends f {

        /* renamed from: g  reason: collision with root package name */
        public final IBinder f2763g;

        @BinderThread
        public l(int i2, IBinder iBinder, Bundle bundle) {
            super(i2, bundle);
            this.f2763g = iBinder;
        }

        public final void d(b.l.a.c.c.b bVar) {
            C0060b bVar2 = b.this.t;
            if (bVar2 != null) {
                bVar2.n(bVar);
            }
            b.this.F(bVar);
        }

        public final boolean e() {
            try {
                String interfaceDescriptor = this.f2763g.getInterfaceDescriptor();
                if (!b.this.C().equals(interfaceDescriptor)) {
                    String C = b.this.C();
                    StringBuilder sb = new StringBuilder(String.valueOf(interfaceDescriptor).length() + String.valueOf(C).length() + 34);
                    sb.append("service descriptor mismatch: ");
                    sb.append(C);
                    sb.append(" vs. ");
                    sb.append(interfaceDescriptor);
                    Log.e("GmsClient", sb.toString());
                    return false;
                }
                IInterface w = b.this.w(this.f2763g);
                if (w == null || (!b.J(b.this, 2, 4, w) && !b.J(b.this, 3, 4, w))) {
                    return false;
                }
                b bVar = b.this;
                bVar.w = null;
                a aVar = bVar.s;
                if (aVar == null) {
                    return true;
                }
                aVar.k((Bundle) null);
                return true;
            } catch (RemoteException unused) {
                Log.w("GmsClient", "service probably died");
                return false;
            }
        }
    }

    public b(Context context, Looper looper, k kVar, b.l.a.c.c.f fVar, int i2, a aVar, C0060b bVar, String str) {
        b.l.a.c.b.a.B(context, "Context must not be null");
        this.f2747g = context;
        b.l.a.c.b.a.B(looper, "Looper must not be null");
        Looper looper2 = looper;
        b.l.a.c.b.a.B(kVar, "Supervisor must not be null");
        this.f2748h = kVar;
        b.l.a.c.b.a.B(fVar, "API availability must not be null");
        this.f2749i = fVar;
        this.f2750j = new h(looper);
        this.u = i2;
        this.s = aVar;
        this.t = bVar;
        this.v = str;
    }

    public static void I(b bVar) {
        boolean z2;
        int i2;
        synchronized (bVar.f2751k) {
            z2 = bVar.r == 3;
        }
        if (z2) {
            i2 = 5;
            bVar.x = true;
        } else {
            i2 = 4;
        }
        Handler handler = bVar.f2750j;
        handler.sendMessage(handler.obtainMessage(i2, bVar.z.get(), 16));
    }

    public static boolean J(b bVar, int i2, int i3, IInterface iInterface) {
        boolean z2;
        synchronized (bVar.f2751k) {
            if (bVar.r != i2) {
                z2 = false;
            } else {
                bVar.H(i3, iInterface);
                z2 = true;
            }
        }
        return z2;
    }

    public static boolean K(b bVar) {
        if (bVar.x || TextUtils.isEmpty(bVar.C()) || TextUtils.isEmpty((CharSequence) null)) {
            return false;
        }
        try {
            Class.forName(bVar.C());
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    public Set<Scope> A() {
        return Collections.EMPTY_SET;
    }

    public final T B() {
        T t2;
        synchronized (this.f2751k) {
            if (this.r == 5) {
                throw new DeadObjectException();
            } else if (a()) {
                b.l.a.c.b.a.G(this.f2755o != null, "Client is connected but service is null");
                t2 = this.f2755o;
            } else {
                throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
            }
        }
        return t2;
    }

    @NonNull
    public abstract String C();

    @NonNull
    public abstract String D();

    public String E() {
        return "com.google.android.gms";
    }

    @CallSuper
    public void F(b.l.a.c.c.b bVar) {
        this.d = bVar.f2588i;
        this.f2746e = System.currentTimeMillis();
    }

    public void G(int i2, T t2) {
    }

    public final void H(int i2, T t2) {
        i0 i0Var;
        b.l.a.c.b.a.j((i2 == 4) == (t2 != null));
        synchronized (this.f2751k) {
            this.r = i2;
            this.f2755o = t2;
            G(i2, t2);
            if (i2 == 1) {
                j jVar = this.f2757q;
                if (jVar != null) {
                    k kVar = this.f2748h;
                    i0 i0Var2 = this.f;
                    String str = i0Var2.a;
                    String str2 = i0Var2.f2792b;
                    String L = L();
                    Objects.requireNonNull(kVar);
                    kVar.c(new k.a(str, str2, 129), jVar, L);
                    this.f2757q = null;
                }
            } else if (i2 == 2 || i2 == 3) {
                if (!(this.f2757q == null || (i0Var = this.f) == null)) {
                    String str3 = i0Var.a;
                    String str4 = i0Var.f2792b;
                    StringBuilder sb = new StringBuilder(String.valueOf(str3).length() + 70 + String.valueOf(str4).length());
                    sb.append("Calling connect() while still connected, missing disconnect() for ");
                    sb.append(str3);
                    sb.append(" on ");
                    sb.append(str4);
                    Log.e("GmsClient", sb.toString());
                    k kVar2 = this.f2748h;
                    i0 i0Var3 = this.f;
                    String str5 = i0Var3.a;
                    String str6 = i0Var3.f2792b;
                    j jVar2 = this.f2757q;
                    String L2 = L();
                    Objects.requireNonNull(kVar2);
                    kVar2.c(new k.a(str5, str6, 129), jVar2, L2);
                    this.z.incrementAndGet();
                }
                this.f2757q = new j(this.z.get());
                String E = E();
                String D = D();
                this.f = new i0(E, D, false, false);
                k kVar3 = this.f2748h;
                j jVar3 = this.f2757q;
                String L3 = L();
                Objects.requireNonNull(this.f);
                if (!kVar3.b(new k.a(D, E, 129, false), jVar3, L3)) {
                    i0 i0Var4 = this.f;
                    String str7 = i0Var4.a;
                    String str8 = i0Var4.f2792b;
                    StringBuilder sb2 = new StringBuilder(String.valueOf(str7).length() + 34 + String.valueOf(str8).length());
                    sb2.append("unable to connect to service: ");
                    sb2.append(str7);
                    sb2.append(" on ");
                    sb2.append(str8);
                    Log.e("GmsClient", sb2.toString());
                    int i3 = this.z.get();
                    Handler handler = this.f2750j;
                    handler.sendMessage(handler.obtainMessage(7, i3, -1, new k(16)));
                }
            } else if (i2 == 4) {
                this.c = System.currentTimeMillis();
            }
        }
    }

    @Nullable
    public final String L() {
        String str = this.v;
        return str == null ? this.f2747g.getClass().getName() : str;
    }

    public boolean a() {
        boolean z2;
        synchronized (this.f2751k) {
            z2 = this.r == 4;
        }
        return z2;
    }

    public void b() {
        this.z.incrementAndGet();
        synchronized (this.f2756p) {
            int size = this.f2756p.size();
            for (int i2 = 0; i2 < size; i2++) {
                g gVar = this.f2756p.get(i2);
                synchronized (gVar) {
                    gVar.a = null;
                }
            }
            this.f2756p.clear();
        }
        synchronized (this.f2752l) {
            this.f2753m = null;
        }
        H(1, (IInterface) null);
    }

    public void e(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int i2;
        T t2;
        p pVar;
        synchronized (this.f2751k) {
            i2 = this.r;
            t2 = this.f2755o;
        }
        synchronized (this.f2752l) {
            pVar = this.f2753m;
        }
        printWriter.append(str).append("mConnectState=");
        printWriter.print(i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? i2 != 5 ? "UNKNOWN" : "DISCONNECTING" : "CONNECTED" : "LOCAL_CONNECTING" : "REMOTE_CONNECTING" : "DISCONNECTED");
        printWriter.append(" mService=");
        if (t2 == null) {
            printWriter.append("null");
        } else {
            printWriter.append(C()).append("@").append(Integer.toHexString(System.identityHashCode(t2.asBinder())));
        }
        printWriter.append(" mServiceBroker=");
        if (pVar == null) {
            printWriter.println("null");
        } else {
            printWriter.append("IGmsServiceBroker@").println(Integer.toHexString(System.identityHashCode(pVar.asBinder())));
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS", Locale.US);
        if (this.c > 0) {
            PrintWriter append = printWriter.append(str).append("lastConnectedTime=");
            long j2 = this.c;
            String format = simpleDateFormat.format(new Date(this.c));
            StringBuilder sb = new StringBuilder(String.valueOf(format).length() + 21);
            sb.append(j2);
            sb.append(" ");
            sb.append(format);
            append.println(sb.toString());
        }
        if (this.f2745b > 0) {
            printWriter.append(str).append("lastSuspendedCause=");
            int i3 = this.a;
            printWriter.append(i3 != 1 ? i3 != 2 ? String.valueOf(i3) : "CAUSE_NETWORK_LOST" : "CAUSE_SERVICE_DISCONNECTED");
            PrintWriter append2 = printWriter.append(" lastSuspendedTime=");
            long j3 = this.f2745b;
            String format2 = simpleDateFormat.format(new Date(this.f2745b));
            StringBuilder sb2 = new StringBuilder(String.valueOf(format2).length() + 21);
            sb2.append(j3);
            sb2.append(" ");
            sb2.append(format2);
            append2.println(sb2.toString());
        }
        if (this.f2746e > 0) {
            printWriter.append(str).append("lastFailedStatus=").append(b.l.a.c.b.a.Z(this.d));
            PrintWriter append3 = printWriter.append(" lastFailedTime=");
            long j4 = this.f2746e;
            String format3 = simpleDateFormat.format(new Date(this.f2746e));
            StringBuilder sb3 = new StringBuilder(String.valueOf(format3).length() + 21);
            sb3.append(j4);
            sb3.append(" ");
            sb3.append(format3);
            append3.println(sb3.toString());
        }
    }

    public void f(@NonNull e eVar) {
        x0 x0Var = (x0) eVar;
        b.l.a.c.c.l.k.g.this.f2649j.post(new w0(x0Var));
    }

    public boolean h() {
        return false;
    }

    @WorkerThread
    public void j(n nVar, Set<Scope> set) {
        Bundle z2 = z();
        h hVar = new h(this.u);
        hVar.f2782k = this.f2747g.getPackageName();
        hVar.f2785n = z2;
        if (set != null) {
            hVar.f2784m = (Scope[]) set.toArray(new Scope[set.size()]);
        }
        if (t()) {
            hVar.f2786o = x() != null ? x() : new Account("<<default account>>", "com.google");
            if (nVar != null) {
                hVar.f2783l = nVar.asBinder();
            }
        }
        hVar.f2787p = A;
        hVar.f2788q = y();
        try {
            synchronized (this.f2752l) {
                p pVar = this.f2753m;
                if (pVar != null) {
                    pVar.g0(new i(this, this.z.get()), hVar);
                } else {
                    Log.w("GmsClient", "mServiceBroker is null, client disconnected");
                }
            }
        } catch (DeadObjectException e2) {
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e2);
            Handler handler = this.f2750j;
            handler.sendMessage(handler.obtainMessage(6, this.z.get(), 1));
        } catch (SecurityException e3) {
            throw e3;
        } catch (RemoteException | RuntimeException e4) {
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e4);
            int i2 = this.z.get();
            Handler handler2 = this.f2750j;
            handler2.sendMessage(handler2.obtainMessage(1, i2, -1, new l(8, (IBinder) null, (Bundle) null)));
        }
    }

    public final /* bridge */ /* synthetic */ ti k() {
        return (ti) B();
    }

    public boolean m() {
        return true;
    }

    public abstract int n();

    public boolean o() {
        boolean z2;
        synchronized (this.f2751k) {
            int i2 = this.r;
            if (i2 != 2) {
                if (i2 != 3) {
                    z2 = false;
                }
            }
            z2 = true;
        }
        return z2;
    }

    @Nullable
    public final b.l.a.c.c.d[] p() {
        c0 c0Var = this.y;
        if (c0Var == null) {
            return null;
        }
        return c0Var.f2768i;
    }

    public String q() {
        i0 i0Var;
        if (a() && (i0Var = this.f) != null) {
            return i0Var.f2792b;
        }
        throw new RuntimeException("Failed to connect when checking package");
    }

    public void r(@NonNull c cVar) {
        b.l.a.c.b.a.B(cVar, "Connection progress callbacks cannot be null.");
        this.f2754n = cVar;
        H(2, (IInterface) null);
    }

    public Intent s() {
        throw new UnsupportedOperationException("Not a sign in API");
    }

    public boolean t() {
        return false;
    }

    public Bundle u() {
        return null;
    }

    public void v() {
        int b2 = this.f2749i.b(this.f2747g, n());
        if (b2 != 0) {
            H(1, (IInterface) null);
            d dVar = new d();
            b.l.a.c.b.a.B(dVar, "Connection progress callbacks cannot be null.");
            this.f2754n = dVar;
            Handler handler = this.f2750j;
            handler.sendMessage(handler.obtainMessage(3, this.z.get(), b2, (Object) null));
            return;
        }
        r(new d());
    }

    @Nullable
    public abstract T w(IBinder iBinder);

    public Account x() {
        return null;
    }

    public b.l.a.c.c.d[] y() {
        return A;
    }

    public Bundle z() {
        return new Bundle();
    }
}
