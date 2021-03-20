package b.l.a.c.i.b;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.annotation.GuardedBy;
import androidx.annotation.WorkerThread;
import b.l.a.c.b.a;
import b.l.a.c.c.p.c;
import b.l.a.c.c.p.f;
import b.l.a.c.f.e.am;
import b.l.a.c.f.i.c9;
import b.l.a.c.f.i.i9;
import b.l.a.c.f.i.o9;
import b.l.a.c.f.i.t8;
import b.l.a.c.f.i.ua;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

public final class m6 extends a4 {
    public l6 c;
    public n9 d;

    /* renamed from: e  reason: collision with root package name */
    public final Set<l5> f4148e = new CopyOnWriteArraySet();
    public boolean f;

    /* renamed from: g  reason: collision with root package name */
    public final AtomicReference<String> f4149g = new AtomicReference<>();

    /* renamed from: h  reason: collision with root package name */
    public final Object f4150h = new Object();
    @GuardedBy("consentLock")

    /* renamed from: i  reason: collision with root package name */
    public g f4151i = new g((Boolean) null, (Boolean) null);
    @GuardedBy("consentLock")

    /* renamed from: j  reason: collision with root package name */
    public int f4152j = 100;

    /* renamed from: k  reason: collision with root package name */
    public final AtomicLong f4153k = new AtomicLong(0);

    /* renamed from: l  reason: collision with root package name */
    public long f4154l = -1;

    /* renamed from: m  reason: collision with root package name */
    public int f4155m = 100;

    /* renamed from: n  reason: collision with root package name */
    public final r9 f4156n;

    /* renamed from: o  reason: collision with root package name */
    public boolean f4157o = true;

    /* renamed from: p  reason: collision with root package name */
    public final j9 f4158p = new b6(this);

    public m6(l4 l4Var) {
        super(l4Var);
        this.f4156n = new r9(l4Var);
    }

    public static void t(m6 m6Var, g gVar, int i2, long j2, boolean z, boolean z2) {
        m6Var.h();
        m6Var.i();
        if (j2 > m6Var.f4154l || !g.i(m6Var.f4155m, i2)) {
            x3 q2 = m6Var.a.q();
            t8.b();
            f fVar = q2.a.f4114g;
            w2<Boolean> w2Var = x2.w0;
            if (fVar.r((String) null, w2Var)) {
                q2.h();
                if (q2.r(i2)) {
                    SharedPreferences.Editor edit = q2.o().edit();
                    edit.putString("consent_settings", gVar.c());
                    edit.putInt("consent_source", i2);
                    edit.apply();
                    m6Var.f4154l = j2;
                    m6Var.f4155m = i2;
                    b8 z3 = m6Var.a.z();
                    Objects.requireNonNull(z3);
                    t8.b();
                    if (z3.a.f4114g.r((String) null, w2Var)) {
                        z3.h();
                        z3.i();
                        if (z) {
                            z3.r();
                            z3.a.v().l();
                        }
                        if (z3.p()) {
                            z3.t(new o7(z3, z3.v(false)));
                        }
                    }
                    if (z2) {
                        m6Var.a.z().z(new AtomicReference());
                        return;
                    }
                    return;
                }
            }
            m6Var.a.a().f4094l.b("Lower precedence consent source ignored, proposed source", Integer.valueOf(i2));
            return;
        }
        m6Var.a.a().f4094l.b("Dropped out-of-date consent setting, proposed settings", gVar);
    }

    public final void A(String str, String str2, Bundle bundle) {
        Objects.requireNonNull((c) this.a.f4121n);
        D(str, str2, bundle, true, true, System.currentTimeMillis());
    }

    @WorkerThread
    public final void B(String str, String str2, long j2, Bundle bundle) {
        h();
        C(str, str2, j2, bundle, true, this.d == null || k9.F(str2), false, (String) null);
    }

    /* JADX WARNING: type inference failed for: r14v1, types: [boolean] */
    /* JADX WARNING: type inference failed for: r14v16 */
    /* JADX WARNING: type inference failed for: r14v17 */
    @WorkerThread
    public final void C(String str, String str2, long j2, Bundle bundle, boolean z, boolean z2, boolean z3, String str3) {
        ? r14;
        boolean z4;
        Bundle bundle2;
        boolean z5;
        boolean z6;
        ArrayList arrayList;
        Bundle[] bundleArr;
        Object[] objArr;
        String str4 = str;
        String str5 = str2;
        long j3 = j2;
        Bundle bundle3 = bundle;
        a.x(str);
        Objects.requireNonNull(bundle3, "null reference");
        h();
        i();
        if (this.a.j()) {
            List<String> list = this.a.b().f3940i;
            if (list == null || list.contains(str5)) {
                if (!this.f) {
                    this.f = true;
                    try {
                        l4 l4Var = this.a;
                        try {
                            (!l4Var.f4113e ? Class.forName("com.google.android.gms.tagmanager.TagManagerService", true, l4Var.a.getClassLoader()) : Class.forName("com.google.android.gms.tagmanager.TagManagerService")).getDeclaredMethod("initialize", new Class[]{Context.class}).invoke((Object) null, new Object[]{this.a.a});
                        } catch (Exception e2) {
                            this.a.a().f4091i.b("Failed to invoke Tag Manager's initialize() method", e2);
                        }
                    } catch (ClassNotFoundException unused) {
                        this.a.a().f4094l.a("Tag Manager is not found and thus will not be used");
                    }
                }
                if (!this.a.f4114g.r((String) null, x2.d0) || !"_cmp".equals(str5) || !bundle3.containsKey("gclid")) {
                    r14 = 0;
                } else {
                    y9 y9Var = this.a.f;
                    String string = bundle3.getString("gclid");
                    Objects.requireNonNull((c) this.a.f4121n);
                    r14 = 0;
                    m("auto", "_lgclid", string, System.currentTimeMillis());
                }
                y9 y9Var2 = this.a.f;
                if (z && (!k9.f4108h[r14].equals(str5))) {
                    this.a.t().v(bundle3, this.a.q().B.a());
                }
                if (z3) {
                    y9 y9Var3 = this.a.f;
                    if (!"_iap".equals(str5)) {
                        k9 t = this.a.t();
                        int i2 = 2;
                        if (t.g0("event", str5)) {
                            if (!t.i0("event", i5.a, i5.f4055b, str5)) {
                                i2 = 13;
                            } else {
                                f fVar = t.a.f4114g;
                                if (t.j0("event", 40, str5)) {
                                    i2 = r14;
                                }
                            }
                        }
                        if (i2 != 0) {
                            this.a.a().f4090h.b("Invalid public event name. Event will not be logged (FE)", this.a.u().p(str5));
                            k9 t2 = this.a.t();
                            f fVar2 = this.a.f4114g;
                            String q2 = t2.q(str5, 40, true);
                            int i3 = r14;
                            if (str5 != null) {
                                i3 = str2.length();
                            }
                            this.a.t().A(this.f4158p, (String) null, i2, "_ev", q2, i3);
                            return;
                        }
                    }
                }
                l4 l4Var2 = this.a;
                y9 y9Var4 = l4Var2.f;
                t6 p2 = l4Var2.y().p(r14);
                if (p2 != null && !bundle3.containsKey("_sc")) {
                    p2.d = true;
                }
                b7.r(p2, bundle3, (!z || !z3) ? r14 : true);
                boolean equals = am.f2847m.equals(str4);
                boolean F = k9.F(str2);
                if (!z || this.d == null || F) {
                    z4 = equals;
                } else if (equals) {
                    z4 = true;
                } else {
                    this.a.a().f4095m.c("Passing event to registered event handler (FE)", this.a.u().p(str5), this.a.u().s(bundle3));
                    Objects.requireNonNull(this.d, "null reference");
                    n9 n9Var = this.d;
                    Objects.requireNonNull(n9Var);
                    try {
                        n9Var.a.b0(str, str2, bundle, j2);
                        return;
                    } catch (RemoteException e3) {
                        l4 l4Var3 = n9Var.f4179b.a;
                        if (l4Var3 != null) {
                            l4Var3.a().f4091i.b("Event interceptor threw exception", e3);
                            return;
                        }
                        return;
                    }
                }
                if (this.a.l()) {
                    int k0 = this.a.t().k0(str5);
                    if (k0 != 0) {
                        this.a.a().f4090h.b("Invalid event name. Event will not be logged (FE)", this.a.u().p(str5));
                        k9 t3 = this.a.t();
                        f fVar3 = this.a.f4114g;
                        String q3 = t3.q(str5, 40, true);
                        int i4 = r14;
                        if (str5 != null) {
                            i4 = str2.length();
                        }
                        this.a.t().A(this.f4158p, str3, k0, "_ev", q3, i4);
                        return;
                    }
                    String str6 = "_o";
                    String str7 = "_si";
                    String str8 = "_sn";
                    String str9 = "_sc";
                    Bundle t4 = this.a.t().t(str3, str2, bundle, Collections.unmodifiableList(Arrays.asList(new String[]{str6, "_sn", "_sc", "_si"})), z3);
                    if (t4.containsKey(str9) && t4.containsKey(str7)) {
                        t4.getString(str8);
                        t4.getString(str9);
                        Long.valueOf(t4.getLong(str7)).longValue();
                    }
                    l4 l4Var4 = this.a;
                    y9 y9Var5 = l4Var4.f;
                    if (l4Var4.y().p(false) != null && "_ae".equals(str5)) {
                        o8 o8Var = this.a.r().f4237e;
                        Objects.requireNonNull((c) o8Var.d.a.f4121n);
                        long elapsedRealtime = SystemClock.elapsedRealtime();
                        long j4 = elapsedRealtime - o8Var.f4203b;
                        o8Var.f4203b = elapsedRealtime;
                        if (j4 > 0) {
                            this.a.t().O(t4, j4);
                        }
                    }
                    c9.b();
                    if (this.a.f4114g.r((String) null, x2.o0)) {
                        if (!"auto".equals(str4) && "_ssr".equals(str5)) {
                            k9 t5 = this.a.t();
                            String string2 = t4.getString("_ffr");
                            if (f.b(string2)) {
                                string2 = null;
                            } else if (string2 != null) {
                                string2 = string2.trim();
                            }
                            if (!k9.G(string2, t5.a.q().y.a())) {
                                t5.a.q().y.b(string2);
                            } else {
                                t5.a.a().f4095m.a("Not logging duplicate session_start_with_rollout event");
                                return;
                            }
                        } else if ("_ae".equals(str5)) {
                            String a = this.a.t().a.q().y.a();
                            if (!TextUtils.isEmpty(a)) {
                                t4.putString("_ffr", a);
                            }
                        }
                    }
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.add(t4);
                    this.a.t().d0().nextLong();
                    if (this.a.q().t.a() <= 0 || !this.a.q().u(j3) || !this.a.q().v.a()) {
                        bundle2 = t4;
                    } else {
                        this.a.a().f4096n.a("Current session is expired, remove the session number, ID, and engagement time");
                        Objects.requireNonNull((c) this.a.f4121n);
                        bundle2 = t4;
                        m("auto", "_sid", (Object) null, System.currentTimeMillis());
                        Objects.requireNonNull((c) this.a.f4121n);
                        m("auto", "_sno", (Object) null, System.currentTimeMillis());
                        Objects.requireNonNull((c) this.a.f4121n);
                        m("auto", "_se", (Object) null, System.currentTimeMillis());
                    }
                    if (bundle2.getLong("extend_session", 0) == 1) {
                        this.a.a().f4096n.a("EXTEND_SESSION param attached: initiate a new session or extend the current active session");
                        this.a.r().d.b(j3, true);
                    }
                    ArrayList arrayList3 = new ArrayList(bundle2.keySet());
                    Collections.sort(arrayList3);
                    int size = arrayList3.size();
                    int i5 = 0;
                    while (i5 < size) {
                        String str10 = (String) arrayList3.get(i5);
                        if (str10 != null) {
                            this.a.t();
                            Object obj = bundle2.get(str10);
                            arrayList = arrayList3;
                            if (obj instanceof Bundle) {
                                bundleArr = new Bundle[]{(Bundle) obj};
                            } else {
                                if (obj instanceof Parcelable[]) {
                                    Parcelable[] parcelableArr = (Parcelable[]) obj;
                                    objArr = Arrays.copyOf(parcelableArr, parcelableArr.length, Bundle[].class);
                                } else if (obj instanceof ArrayList) {
                                    ArrayList arrayList4 = (ArrayList) obj;
                                    objArr = arrayList4.toArray(new Bundle[arrayList4.size()]);
                                } else {
                                    bundleArr = null;
                                }
                                bundleArr = (Bundle[]) objArr;
                            }
                            if (bundleArr != null) {
                                bundle2.putParcelableArray(str10, bundleArr);
                            }
                        } else {
                            arrayList = arrayList3;
                        }
                        i5++;
                        arrayList3 = arrayList;
                    }
                    int i6 = 0;
                    while (i6 < arrayList2.size()) {
                        Bundle bundle4 = (Bundle) arrayList2.get(i6);
                        String str11 = i6 != 0 ? "_ep" : str5;
                        bundle4.putString(str6, str4);
                        if (z2) {
                            bundle4 = this.a.t().I(bundle4);
                        }
                        Bundle bundle5 = bundle4;
                        String str12 = str6;
                        Bundle bundle6 = bundle5;
                        s sVar = r1;
                        s sVar2 = new s(str11, new q(bundle5), str, j2);
                        b8 z7 = this.a.z();
                        Objects.requireNonNull(z7);
                        z7.h();
                        z7.i();
                        z7.r();
                        e3 v = z7.a.v();
                        Objects.requireNonNull(v);
                        Parcel obtain = Parcel.obtain();
                        t.a(sVar, obtain, 0);
                        byte[] marshall = obtain.marshall();
                        obtain.recycle();
                        if (marshall.length > 131072) {
                            v.a.a().f4089g.a("Event is too long for local database. Sending event directly to service");
                            z6 = true;
                            z5 = false;
                        } else {
                            z5 = v.o(0, marshall);
                            z6 = true;
                        }
                        z7.t(new p7(z7, z7.v(z6), z5, sVar, str3));
                        if (!z4) {
                            for (l5 a2 : this.f4148e) {
                                a2.a(str, str2, new Bundle(bundle6), j2);
                            }
                        }
                        i6++;
                        str4 = str;
                        str6 = str12;
                    }
                    l4 l4Var5 = this.a;
                    y9 y9Var6 = l4Var5.f;
                    if (l4Var5.y().p(false) != null && "_ae".equals(str5)) {
                        q8 r = this.a.r();
                        Objects.requireNonNull((c) this.a.f4121n);
                        r.f4237e.a(true, true, SystemClock.elapsedRealtime());
                        return;
                    }
                    return;
                }
                return;
            }
            this.a.a().f4095m.c("Dropping non-safelisted event. event name, origin", str5, str4);
            return;
        }
        this.a.a().f4095m.a("Event not sent since app measurement is disabled");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x007c, code lost:
        if (r4 > 100) goto L_0x007e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00aa, code lost:
        if (r6 > 100) goto L_0x00ac;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0102, code lost:
        r2 = r1.a.a().f4096n;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x010a, code lost:
        if (r13 != null) goto L_0x010f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x010c, code lost:
        r3 = "null";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x010f, code lost:
        r3 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0110, code lost:
        if (r14 != null) goto L_0x0115;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0112, code lost:
        r4 = "null";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0115, code lost:
        r4 = r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0116, code lost:
        r2.c("Logging screen view with name, class", r3, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x011d, code lost:
        if (r1.c != null) goto L_0x0122;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x011f, code lost:
        r2 = r1.d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0122, code lost:
        r2 = r1.c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0124, code lost:
        r12 = new b.l.a.c.i.b.t6(r13, r14, r1.a.t().c0(), true, r26);
        r1.c = r12;
        r1.d = r2;
        r1.f3927i = r12;
        java.util.Objects.requireNonNull((b.l.a.c.c.p.c) r1.a.f4121n);
        r1.a.d().q(new b.l.a.c.i.b.u6(r1, r0, r12, r2, android.os.SystemClock.elapsedRealtime()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void D(java.lang.String r21, java.lang.String r22, android.os.Bundle r23, boolean r24, boolean r25, long r26) {
        /*
            r20 = this;
            r11 = r20
            if (r21 != 0) goto L_0x0008
            java.lang.String r0 = "app"
            r2 = r0
            goto L_0x000a
        L_0x0008:
            r2 = r21
        L_0x000a:
            if (r23 != 0) goto L_0x0012
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            goto L_0x0014
        L_0x0012:
            r0 = r23
        L_0x0014:
            b.l.a.c.i.b.l4 r1 = r11.a
            b.l.a.c.i.b.f r1 = r1.f4114g
            b.l.a.c.i.b.w2<java.lang.Boolean> r3 = b.l.a.c.i.b.x2.u0
            r4 = 0
            boolean r1 = r1.r(r4, r3)
            r5 = 0
            if (r1 == 0) goto L_0x0169
            java.lang.String r1 = "screen_view"
            r6 = r22
            boolean r1 = b.l.a.c.i.b.k9.G(r6, r1)
            if (r1 != 0) goto L_0x002e
            goto L_0x016b
        L_0x002e:
            b.l.a.c.i.b.l4 r1 = r11.a
            b.l.a.c.i.b.b7 r1 = r1.y()
            b.l.a.c.i.b.l4 r2 = r1.a
            b.l.a.c.i.b.f r2 = r2.f4114g
            boolean r2 = r2.r(r4, r3)
            if (r2 != 0) goto L_0x004d
            b.l.a.c.i.b.l4 r0 = r1.a
            b.l.a.c.i.b.k3 r0 = r0.a()
            b.l.a.c.i.b.i3 r0 = r0.f4093k
            java.lang.String r1 = "Manual screen reporting is disabled."
            r0.a(r1)
            goto L_0x0165
        L_0x004d:
            java.lang.Object r3 = r1.f3930l
            monitor-enter(r3)
            boolean r2 = r1.f3929k     // Catch:{ all -> 0x0166 }
            if (r2 != 0) goto L_0x0064
            b.l.a.c.i.b.l4 r0 = r1.a     // Catch:{ all -> 0x0166 }
            b.l.a.c.i.b.k3 r0 = r0.a()     // Catch:{ all -> 0x0166 }
            b.l.a.c.i.b.i3 r0 = r0.f4093k     // Catch:{ all -> 0x0166 }
            java.lang.String r1 = "Cannot log screen view event when the app is in the background."
            r0.a(r1)     // Catch:{ all -> 0x0166 }
        L_0x0061:
            monitor-exit(r3)     // Catch:{ all -> 0x0166 }
            goto L_0x0165
        L_0x0064:
            java.lang.String r2 = "screen_name"
            java.lang.String r13 = r0.getString(r2)     // Catch:{ all -> 0x0166 }
            r2 = 100
            if (r13 == 0) goto L_0x0094
            int r4 = r13.length()     // Catch:{ all -> 0x0166 }
            if (r4 <= 0) goto L_0x007e
            int r4 = r13.length()     // Catch:{ all -> 0x0166 }
            b.l.a.c.i.b.l4 r6 = r1.a     // Catch:{ all -> 0x0166 }
            b.l.a.c.i.b.f r6 = r6.f4114g     // Catch:{ all -> 0x0166 }
            if (r4 <= r2) goto L_0x0094
        L_0x007e:
            b.l.a.c.i.b.l4 r0 = r1.a     // Catch:{ all -> 0x0166 }
            b.l.a.c.i.b.k3 r0 = r0.a()     // Catch:{ all -> 0x0166 }
            b.l.a.c.i.b.i3 r0 = r0.f4093k     // Catch:{ all -> 0x0166 }
            java.lang.String r1 = "Invalid screen name length for screen view. Length"
            int r2 = r13.length()     // Catch:{ all -> 0x0166 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x0166 }
            r0.b(r1, r2)     // Catch:{ all -> 0x0166 }
            goto L_0x0061
        L_0x0094:
            java.lang.String r4 = "screen_class"
            java.lang.String r4 = r0.getString(r4)     // Catch:{ all -> 0x0166 }
            if (r4 == 0) goto L_0x00c2
            int r6 = r4.length()     // Catch:{ all -> 0x0166 }
            if (r6 <= 0) goto L_0x00ac
            int r6 = r4.length()     // Catch:{ all -> 0x0166 }
            b.l.a.c.i.b.l4 r7 = r1.a     // Catch:{ all -> 0x0166 }
            b.l.a.c.i.b.f r7 = r7.f4114g     // Catch:{ all -> 0x0166 }
            if (r6 <= r2) goto L_0x00c2
        L_0x00ac:
            b.l.a.c.i.b.l4 r0 = r1.a     // Catch:{ all -> 0x0166 }
            b.l.a.c.i.b.k3 r0 = r0.a()     // Catch:{ all -> 0x0166 }
            b.l.a.c.i.b.i3 r0 = r0.f4093k     // Catch:{ all -> 0x0166 }
            java.lang.String r1 = "Invalid screen class length for screen view. Length"
            int r2 = r4.length()     // Catch:{ all -> 0x0166 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x0166 }
            r0.b(r1, r2)     // Catch:{ all -> 0x0166 }
            goto L_0x0061
        L_0x00c2:
            if (r4 != 0) goto L_0x00d7
            android.app.Activity r2 = r1.f3925g     // Catch:{ all -> 0x0166 }
            if (r2 == 0) goto L_0x00d3
            java.lang.Class r2 = r2.getClass()     // Catch:{ all -> 0x0166 }
            java.lang.String r4 = "Activity"
            java.lang.String r2 = r1.q(r2, r4)     // Catch:{ all -> 0x0166 }
            goto L_0x00d5
        L_0x00d3:
            java.lang.String r2 = "Activity"
        L_0x00d5:
            r14 = r2
            goto L_0x00d8
        L_0x00d7:
            r14 = r4
        L_0x00d8:
            b.l.a.c.i.b.t6 r2 = r1.c     // Catch:{ all -> 0x0166 }
            boolean r4 = r1.f3926h     // Catch:{ all -> 0x0166 }
            if (r4 == 0) goto L_0x0101
            if (r2 == 0) goto L_0x0101
            r1.f3926h = r5     // Catch:{ all -> 0x0166 }
            java.lang.String r4 = r2.f4282b     // Catch:{ all -> 0x0166 }
            boolean r4 = b.l.a.c.i.b.k9.G(r4, r14)     // Catch:{ all -> 0x0166 }
            java.lang.String r2 = r2.a     // Catch:{ all -> 0x0166 }
            boolean r2 = b.l.a.c.i.b.k9.G(r2, r13)     // Catch:{ all -> 0x0166 }
            if (r4 == 0) goto L_0x0101
            if (r2 == 0) goto L_0x0101
            b.l.a.c.i.b.l4 r0 = r1.a     // Catch:{ all -> 0x0166 }
            b.l.a.c.i.b.k3 r0 = r0.a()     // Catch:{ all -> 0x0166 }
            b.l.a.c.i.b.i3 r0 = r0.f4093k     // Catch:{ all -> 0x0166 }
            java.lang.String r1 = "Ignoring call to log screen view event with duplicate parameters."
            r0.a(r1)     // Catch:{ all -> 0x0166 }
            goto L_0x0061
        L_0x0101:
            monitor-exit(r3)     // Catch:{ all -> 0x0166 }
            b.l.a.c.i.b.l4 r2 = r1.a
            b.l.a.c.i.b.k3 r2 = r2.a()
            b.l.a.c.i.b.i3 r2 = r2.f4096n
            if (r13 != 0) goto L_0x010f
            java.lang.String r3 = "null"
            goto L_0x0110
        L_0x010f:
            r3 = r13
        L_0x0110:
            if (r14 != 0) goto L_0x0115
            java.lang.String r4 = "null"
            goto L_0x0116
        L_0x0115:
            r4 = r14
        L_0x0116:
            java.lang.String r5 = "Logging screen view with name, class"
            r2.c(r5, r3, r4)
            b.l.a.c.i.b.t6 r2 = r1.c
            if (r2 != 0) goto L_0x0122
            b.l.a.c.i.b.t6 r2 = r1.d
            goto L_0x0124
        L_0x0122:
            b.l.a.c.i.b.t6 r2 = r1.c
        L_0x0124:
            b.l.a.c.i.b.t6 r3 = new b.l.a.c.i.b.t6
            b.l.a.c.i.b.l4 r4 = r1.a
            b.l.a.c.i.b.k9 r4 = r4.t()
            long r15 = r4.c0()
            r17 = 1
            r12 = r3
            r18 = r26
            r12.<init>(r13, r14, r15, r17, r18)
            r1.c = r3
            r1.d = r2
            r1.f3927i = r3
            b.l.a.c.i.b.l4 r4 = r1.a
            b.l.a.c.c.p.b r4 = r4.f4121n
            b.l.a.c.c.p.c r4 = (b.l.a.c.c.p.c) r4
            java.util.Objects.requireNonNull(r4)
            long r4 = android.os.SystemClock.elapsedRealtime()
            b.l.a.c.i.b.l4 r6 = r1.a
            b.l.a.c.i.b.i4 r6 = r6.d()
            b.l.a.c.i.b.u6 r7 = new b.l.a.c.i.b.u6
            r21 = r7
            r22 = r1
            r23 = r0
            r24 = r3
            r25 = r2
            r26 = r4
            r21.<init>(r22, r23, r24, r25, r26)
            r6.q(r7)
        L_0x0165:
            return
        L_0x0166:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0166 }
            throw r0
        L_0x0169:
            r6 = r22
        L_0x016b:
            r1 = 1
            if (r25 == 0) goto L_0x017b
            b.l.a.c.i.b.n9 r3 = r11.d
            if (r3 == 0) goto L_0x017b
            boolean r3 = b.l.a.c.i.b.k9.F(r22)
            if (r3 == 0) goto L_0x0179
            goto L_0x017b
        L_0x0179:
            r8 = r5
            goto L_0x017c
        L_0x017b:
            r8 = r1
        L_0x017c:
            r9 = r24 ^ 1
            r10 = 0
            r1 = r20
            r3 = r22
            r4 = r26
            r6 = r0
            r7 = r25
            r1.E(r2, r3, r4, r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: b.l.a.c.i.b.m6.D(java.lang.String, java.lang.String, android.os.Bundle, boolean, boolean, long):void");
    }

    public final void E(String str, String str2, long j2, Bundle bundle, boolean z, boolean z2, boolean z3, String str3) {
        Bundle bundle2 = new Bundle(bundle);
        for (String str4 : bundle2.keySet()) {
            Object obj = bundle2.get(str4);
            if (obj instanceof Bundle) {
                bundle2.putBundle(str4, new Bundle((Bundle) obj));
            } else {
                int i2 = 0;
                if (obj instanceof Parcelable[]) {
                    Parcelable[] parcelableArr = (Parcelable[]) obj;
                    while (i2 < parcelableArr.length) {
                        Parcelable parcelable = parcelableArr[i2];
                        if (parcelable instanceof Bundle) {
                            parcelableArr[i2] = new Bundle((Bundle) parcelable);
                        }
                        i2++;
                    }
                } else if (obj instanceof List) {
                    List list = (List) obj;
                    while (i2 < list.size()) {
                        Object obj2 = list.get(i2);
                        if (obj2 instanceof Bundle) {
                            list.set(i2, new Bundle((Bundle) obj2));
                        }
                        i2++;
                    }
                }
            }
        }
        this.a.d().q(new s5(this, str, str2, j2, bundle2, z, z2, z3, (String) null));
    }

    public final void F(String str, Object obj) {
        Objects.requireNonNull((c) this.a.f4121n);
        G("auto", str, obj, true, System.currentTimeMillis());
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x006c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void G(java.lang.String r16, java.lang.String r17, java.lang.Object r18, boolean r19, long r20) {
        /*
            r15 = this;
            r6 = r15
            r2 = r17
            r0 = r18
            if (r16 != 0) goto L_0x000a
            java.lang.String r1 = "app"
            goto L_0x000c
        L_0x000a:
            r1 = r16
        L_0x000c:
            r3 = 6
            r4 = 0
            r5 = 24
            if (r19 == 0) goto L_0x001e
            b.l.a.c.i.b.l4 r3 = r6.a
            b.l.a.c.i.b.k9 r3 = r3.t()
            int r3 = r3.l0(r2)
        L_0x001c:
            r11 = r3
            goto L_0x0045
        L_0x001e:
            b.l.a.c.i.b.l4 r7 = r6.a
            b.l.a.c.i.b.k9 r7 = r7.t()
            java.lang.String r8 = "user property"
            boolean r9 = r7.g0(r8, r2)
            if (r9 != 0) goto L_0x002d
        L_0x002c:
            goto L_0x001c
        L_0x002d:
            java.lang.String[] r9 = b.l.a.c.i.b.k5.a
            r10 = 0
            boolean r9 = r7.i0(r8, r9, r10, r2)
            if (r9 != 0) goto L_0x0039
            r3 = 15
            goto L_0x001c
        L_0x0039:
            b.l.a.c.i.b.l4 r9 = r7.a
            b.l.a.c.i.b.f r9 = r9.f4114g
            boolean r7 = r7.j0(r8, r5, r2)
            if (r7 != 0) goto L_0x0044
            goto L_0x002c
        L_0x0044:
            r11 = r4
        L_0x0045:
            r3 = 1
            if (r11 == 0) goto L_0x006c
            b.l.a.c.i.b.l4 r0 = r6.a
            b.l.a.c.i.b.k9 r0 = r0.t()
            b.l.a.c.i.b.l4 r1 = r6.a
            b.l.a.c.i.b.f r1 = r1.f4114g
            java.lang.String r13 = r0.q(r2, r5, r3)
            if (r2 == 0) goto L_0x005c
            int r4 = r17.length()
        L_0x005c:
            r14 = r4
            b.l.a.c.i.b.l4 r0 = r6.a
            b.l.a.c.i.b.k9 r8 = r0.t()
            b.l.a.c.i.b.j9 r9 = r6.f4158p
            r10 = 0
            java.lang.String r12 = "_ev"
            r8.A(r9, r10, r11, r12, r13, r14)
            return
        L_0x006c:
            if (r0 == 0) goto L_0x00bd
            b.l.a.c.i.b.l4 r7 = r6.a
            b.l.a.c.i.b.k9 r7 = r7.t()
            int r11 = r7.x(r2, r0)
            if (r11 == 0) goto L_0x00a8
            b.l.a.c.i.b.l4 r1 = r6.a
            b.l.a.c.i.b.k9 r1 = r1.t()
            b.l.a.c.i.b.l4 r7 = r6.a
            b.l.a.c.i.b.f r7 = r7.f4114g
            java.lang.String r13 = r1.q(r2, r5, r3)
            boolean r1 = r0 instanceof java.lang.String
            if (r1 != 0) goto L_0x0090
            boolean r1 = r0 instanceof java.lang.CharSequence
            if (r1 == 0) goto L_0x0098
        L_0x0090:
            java.lang.String r0 = java.lang.String.valueOf(r18)
            int r4 = r0.length()
        L_0x0098:
            r14 = r4
            b.l.a.c.i.b.l4 r0 = r6.a
            b.l.a.c.i.b.k9 r8 = r0.t()
            b.l.a.c.i.b.j9 r9 = r6.f4158p
            r10 = 0
            java.lang.String r12 = "_ev"
            r8.A(r9, r10, r11, r12, r13, r14)
            return
        L_0x00a8:
            b.l.a.c.i.b.l4 r3 = r6.a
            b.l.a.c.i.b.k9 r3 = r3.t()
            java.lang.Object r5 = r3.y(r2, r0)
            if (r5 == 0) goto L_0x00bc
            r0 = r15
            r2 = r17
            r3 = r20
            r0.l(r1, r2, r3, r5)
        L_0x00bc:
            return
        L_0x00bd:
            r5 = 0
            r0 = r15
            r2 = r17
            r3 = r20
            r0.l(r1, r2, r3, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: b.l.a.c.i.b.m6.G(java.lang.String, java.lang.String, java.lang.Object, boolean, long):void");
    }

    public final boolean k() {
        return false;
    }

    public final void l(String str, String str2, long j2, Object obj) {
        this.a.d().q(new t5(this, str, str2, obj, j2));
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x007d  */
    @androidx.annotation.WorkerThread
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void m(java.lang.String r10, java.lang.String r11, java.lang.Object r12, long r13) {
        /*
            r9 = this;
            b.l.a.c.b.a.x(r10)
            b.l.a.c.b.a.x(r11)
            r9.h()
            r9.i()
            java.lang.String r0 = "allow_personalized_ads"
            boolean r0 = r0.equals(r11)
            r1 = 1
            java.lang.String r2 = "_npa"
            if (r0 == 0) goto L_0x0065
            boolean r0 = r12 instanceof java.lang.String
            if (r0 == 0) goto L_0x0053
            r0 = r12
            java.lang.String r0 = (java.lang.String) r0
            boolean r3 = android.text.TextUtils.isEmpty(r0)
            if (r3 != 0) goto L_0x0053
            java.util.Locale r11 = java.util.Locale.ENGLISH
            java.lang.String r11 = r0.toLowerCase(r11)
            java.lang.String r12 = "false"
            boolean r11 = r12.equals(r11)
            r3 = 1
            if (r1 == r11) goto L_0x0037
            r5 = 0
            goto L_0x0038
        L_0x0037:
            r5 = r3
        L_0x0038:
            java.lang.Long r11 = java.lang.Long.valueOf(r5)
            b.l.a.c.i.b.l4 r0 = r9.a
            b.l.a.c.i.b.x3 r0 = r0.q()
            b.l.a.c.i.b.w3 r0 = r0.r
            long r5 = r11.longValue()
            int r3 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r3 != 0) goto L_0x004e
            java.lang.String r12 = "true"
        L_0x004e:
            r0.b(r12)
            r7 = r11
            goto L_0x0063
        L_0x0053:
            if (r12 != 0) goto L_0x0065
            b.l.a.c.i.b.l4 r11 = r9.a
            b.l.a.c.i.b.x3 r11 = r11.q()
            b.l.a.c.i.b.w3 r11 = r11.r
            java.lang.String r0 = "unset"
            r11.b(r0)
            r7 = r12
        L_0x0063:
            r4 = r2
            goto L_0x0067
        L_0x0065:
            r4 = r11
            r7 = r12
        L_0x0067:
            b.l.a.c.i.b.l4 r11 = r9.a
            boolean r11 = r11.j()
            if (r11 != 0) goto L_0x007d
            b.l.a.c.i.b.l4 r10 = r9.a
            b.l.a.c.i.b.k3 r10 = r10.a()
            b.l.a.c.i.b.i3 r10 = r10.f4096n
            java.lang.String r11 = "User property not set since app measurement is disabled"
            r10.a(r11)
            return
        L_0x007d:
            b.l.a.c.i.b.l4 r11 = r9.a
            boolean r11 = r11.l()
            if (r11 != 0) goto L_0x0086
            return
        L_0x0086:
            b.l.a.c.i.b.g9 r11 = new b.l.a.c.i.b.g9
            r3 = r11
            r5 = r13
            r8 = r10
            r3.<init>(r4, r5, r7, r8)
            b.l.a.c.i.b.l4 r10 = r9.a
            b.l.a.c.i.b.b8 r10 = r10.z()
            r10.h()
            r10.i()
            r10.r()
            b.l.a.c.i.b.l4 r12 = r10.a
            b.l.a.c.i.b.e3 r12 = r12.v()
            java.util.Objects.requireNonNull(r12)
            android.os.Parcel r13 = android.os.Parcel.obtain()
            r14 = 0
            b.l.a.c.i.b.h9.a(r11, r13, r14)
            byte[] r0 = r13.marshall()
            r13.recycle()
            int r13 = r0.length
            r2 = 131072(0x20000, float:1.83671E-40)
            if (r13 <= r2) goto L_0x00c8
            b.l.a.c.i.b.l4 r12 = r12.a
            b.l.a.c.i.b.k3 r12 = r12.a()
            b.l.a.c.i.b.i3 r12 = r12.f4089g
            java.lang.String r13 = "User property too long for local database. Sending directly to service"
            r12.a(r13)
            goto L_0x00cc
        L_0x00c8:
            boolean r14 = r12.o(r1, r0)
        L_0x00cc:
            b.l.a.c.i.b.p9 r12 = r10.v(r1)
            b.l.a.c.i.b.d7 r13 = new b.l.a.c.i.b.d7
            r13.<init>(r10, r12, r14, r11)
            r10.t(r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: b.l.a.c.i.b.m6.m(java.lang.String, java.lang.String, java.lang.Object, long):void");
    }

    public final void n(long j2, boolean z) {
        h();
        i();
        this.a.a().f4095m.a("Resetting analytics data (FE)");
        q8 r = this.a.r();
        r.h();
        o8 o8Var = r.f4237e;
        o8Var.c.c();
        o8Var.a = 0;
        o8Var.f4203b = 0;
        boolean j3 = this.a.j();
        x3 q2 = this.a.q();
        q2.f4357j.b(j2);
        if (!TextUtils.isEmpty(q2.a.q().y.a())) {
            q2.y.b((String) null);
        }
        o9.b();
        f fVar = q2.a.f4114g;
        w2<Boolean> w2Var = x2.p0;
        if (fVar.r((String) null, w2Var)) {
            q2.t.b(0);
        }
        if (!q2.a.f4114g.u()) {
            q2.t(!j3);
        }
        q2.z.b((String) null);
        q2.A.b(0);
        q2.B.b((Bundle) null);
        if (z) {
            b8 z2 = this.a.z();
            z2.h();
            z2.i();
            p9 v = z2.v(false);
            z2.r();
            z2.a.v().l();
            z2.t(new e7(z2, v));
        }
        o9.b();
        if (this.a.f4114g.r((String) null, w2Var)) {
            this.a.r().d.a();
        }
        this.f4157o = !j3;
    }

    @WorkerThread
    public final void o() {
        h();
        i();
        if (this.a.l()) {
            if (this.a.f4114g.r((String) null, x2.c0)) {
                f fVar = this.a.f4114g;
                y9 y9Var = fVar.a.f;
                Boolean t = fVar.t("google_analytics_deferred_deep_link_enabled");
                if (t != null && t.booleanValue()) {
                    this.a.a().f4095m.a("Deferred Deep Link feature enabled.");
                    this.a.d().q(new o5(this));
                }
            }
            b8 z = this.a.z();
            z.h();
            z.i();
            p9 v = z.v(true);
            z.a.v().o(3, new byte[0]);
            z.t(new h7(z, v));
            this.f4157o = false;
            x3 q2 = this.a.q();
            q2.h();
            String string = q2.o().getString("previous_os_version", (String) null);
            q2.a.A().l();
            String str = Build.VERSION.RELEASE;
            if (!TextUtils.isEmpty(str) && !str.equals(string)) {
                SharedPreferences.Editor edit = q2.o().edit();
                edit.putString("previous_os_version", str);
                edit.apply();
            }
            if (!TextUtils.isEmpty(string)) {
                this.a.A().l();
                if (!string.equals(str)) {
                    Bundle bundle = new Bundle();
                    bundle.putString("_po", string);
                    A("auto", "_ou", bundle);
                }
            }
        }
    }

    @WorkerThread
    public final void p(n9 n9Var) {
        n9 n9Var2;
        h();
        i();
        if (!(n9Var == null || n9Var == (n9Var2 = this.d))) {
            a.G(n9Var2 == null, "EventInterceptor already set.");
        }
        this.d = n9Var;
    }

    public final void q(Bundle bundle, long j2) {
        Class<Long> cls = Long.class;
        Class<String> cls2 = String.class;
        Objects.requireNonNull(bundle, "null reference");
        Bundle bundle2 = new Bundle(bundle);
        if (!TextUtils.isEmpty(bundle2.getString("app_id"))) {
            this.a.a().f4091i.a("Package name should be null when calling setConditionalUserProperty");
        }
        bundle2.remove("app_id");
        a.B1(bundle2, "app_id", cls2, null);
        a.B1(bundle2, "origin", cls2, null);
        a.B1(bundle2, "name", cls2, null);
        a.B1(bundle2, "value", Object.class, null);
        a.B1(bundle2, "trigger_event_name", cls2, null);
        a.B1(bundle2, "trigger_timeout", cls, 0L);
        a.B1(bundle2, "timed_out_event_name", cls2, null);
        a.B1(bundle2, "timed_out_event_params", Bundle.class, null);
        a.B1(bundle2, "triggered_event_name", cls2, null);
        a.B1(bundle2, "triggered_event_params", Bundle.class, null);
        a.B1(bundle2, "time_to_live", cls, 0L);
        a.B1(bundle2, "expired_event_name", cls2, null);
        a.B1(bundle2, "expired_event_params", Bundle.class, null);
        a.x(bundle2.getString("name"));
        a.x(bundle2.getString("origin"));
        Objects.requireNonNull(bundle2.get("value"), "null reference");
        bundle2.putLong("creation_timestamp", j2);
        String string = bundle2.getString("name");
        Object obj = bundle2.get("value");
        if (this.a.t().l0(string) != 0) {
            this.a.a().f.b("Invalid conditional user property name", this.a.u().r(string));
        } else if (this.a.t().x(string, obj) == 0) {
            Object y = this.a.t().y(string, obj);
            if (y == null) {
                this.a.a().f.c("Unable to normalize conditional user property value", this.a.u().r(string), obj);
                return;
            }
            a.f1(bundle2, y);
            long j3 = bundle2.getLong("trigger_timeout");
            if (!TextUtils.isEmpty(bundle2.getString("trigger_event_name"))) {
                l4 l4Var = this.a;
                f fVar = l4Var.f4114g;
                if (j3 > 15552000000L || j3 < 1) {
                    l4Var.a().f.c("Invalid conditional user property timeout", this.a.u().r(string), Long.valueOf(j3));
                    return;
                }
            }
            long j4 = bundle2.getLong("time_to_live");
            l4 l4Var2 = this.a;
            f fVar2 = l4Var2.f4114g;
            if (j4 > 15552000000L || j4 < 1) {
                l4Var2.a().f.c("Invalid conditional user property time to live", this.a.u().r(string), Long.valueOf(j4));
            } else {
                l4Var2.d().q(new v5(this, bundle2));
            }
        } else {
            this.a.a().f.c("Invalid conditional user property value", this.a.u().r(string), obj);
        }
    }

    public final void r(String str, String str2, Bundle bundle) {
        Objects.requireNonNull((c) this.a.f4121n);
        long currentTimeMillis = System.currentTimeMillis();
        a.x(str);
        Bundle bundle2 = new Bundle();
        bundle2.putString("name", str);
        bundle2.putLong("creation_timestamp", currentTimeMillis);
        if (str2 != null) {
            bundle2.putString("expired_event_name", str2);
            bundle2.putBundle("expired_event_params", bundle);
        }
        this.a.d().q(new w5(this, bundle2));
    }

    public final String s() {
        String str = this.a.f4112b;
        if (str == null) {
            str = null;
            try {
                ua.b();
                if (!this.a.f4114g.r((String) null, x2.B0)) {
                    return s6.a(this.a.a, "google_app_id");
                }
                l4 l4Var = this.a;
                return s6.b(l4Var.a, "google_app_id", l4Var.s);
            } catch (IllegalStateException e2) {
                this.a.a().f.b("getGoogleAppId failed with exception", e2);
            }
        }
        return str;
    }

    @WorkerThread
    public final void u(Boolean bool, boolean z) {
        h();
        i();
        this.a.a().f4095m.b("Setting app measurement enabled (FE)", bool);
        this.a.q().p(bool);
        t8.b();
        f fVar = this.a.f4114g;
        w2<Boolean> w2Var = x2.w0;
        if (fVar.r((String) null, w2Var) && z) {
            x3 q2 = this.a.q();
            t8.b();
            if (q2.a.f4114g.r((String) null, w2Var)) {
                q2.h();
                SharedPreferences.Editor edit = q2.o().edit();
                if (bool != null) {
                    edit.putBoolean("measurement_enabled_from_api", bool.booleanValue());
                } else {
                    edit.remove("measurement_enabled_from_api");
                }
                edit.apply();
            }
        }
        t8.b();
        if (this.a.f4114g.r((String) null, w2Var)) {
            l4 l4Var = this.a;
            l4Var.d().h();
            if (!l4Var.E && (bool == null || bool.booleanValue())) {
                return;
            }
        }
        v();
    }

    @WorkerThread
    public final void v() {
        h();
        String a = this.a.q().r.a();
        if (a != null) {
            if ("unset".equals(a)) {
                Objects.requireNonNull((c) this.a.f4121n);
                m("app", "_npa", (Object) null, System.currentTimeMillis());
            } else {
                Long valueOf = Long.valueOf(true != "true".equals(a) ? 0 : 1);
                Objects.requireNonNull((c) this.a.f4121n);
                m("app", "_npa", valueOf, System.currentTimeMillis());
            }
        }
        if (!this.a.j() || !this.f4157o) {
            this.a.a().f4095m.a("Updating Scion state (FE)");
            b8 z = this.a.z();
            z.h();
            z.i();
            z.t(new n7(z, z.v(true)));
            return;
        }
        this.a.a().f4095m.a("Recording app launch after enabling measurement for the first time (FE)");
        o();
        o9.b();
        if (this.a.f4114g.r((String) null, x2.p0)) {
            this.a.r().d.a();
        }
        i9.f3612i.a().a();
        if (this.a.f4114g.r((String) null, x2.s0)) {
            b4 b4Var = this.a.x;
            Objects.requireNonNull(b4Var, "null reference");
            if (b4Var.a.q().f4358k.a() <= 0) {
                b4Var.a(b4Var.a.a.getPackageName());
            }
        }
        this.a.d().q(new q5(this));
    }

    public final void w() {
        if ((this.a.a.getApplicationContext() instanceof Application) && this.c != null) {
            ((Application) this.a.a.getApplicationContext()).unregisterActivityLifecycleCallbacks(this.c);
        }
    }

    public final void x(Bundle bundle, int i2, long j2) {
        t8.b();
        String str = null;
        if (this.a.f4114g.r((String) null, x2.w0)) {
            i();
            String string = bundle.getString("ad_storage");
            if ((string != null && g.k(string) == null) || ((string = bundle.getString("analytics_storage")) != null && g.k(string) == null)) {
                str = string;
            }
            if (str != null) {
                this.a.a().f4093k.b("Ignoring invalid consent setting", str);
                this.a.a().f4093k.a("Valid consent values are 'granted', 'denied'");
            }
            y(g.a(bundle), i2, j2);
        }
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public final void y(b.l.a.c.i.b.g r16, int r17, long r18) {
        /*
            r15 = this;
            r10 = r15
            r0 = r16
            b.l.a.c.f.i.t8.b()
            b.l.a.c.i.b.l4 r1 = r10.a
            b.l.a.c.i.b.f r1 = r1.f4114g
            b.l.a.c.i.b.w2<java.lang.Boolean> r2 = b.l.a.c.i.b.x2.w0
            r3 = 0
            boolean r1 = r1.r(r3, r2)
            if (r1 == 0) goto L_0x00f8
            r15.i()
            b.l.a.c.i.b.l4 r1 = r10.a
            b.l.a.c.i.b.f r1 = r1.f4114g
            b.l.a.c.i.b.w2<java.lang.Boolean> r2 = b.l.a.c.i.b.x2.x0
            boolean r1 = r1.r(r3, r2)
            r4 = 20
            if (r1 == 0) goto L_0x002b
            r1 = r17
            if (r1 == r4) goto L_0x0029
            goto L_0x002d
        L_0x0029:
            r6 = r4
            goto L_0x0045
        L_0x002b:
            r1 = r17
        L_0x002d:
            java.lang.Boolean r5 = r0.a
            if (r5 != 0) goto L_0x0044
            java.lang.Boolean r5 = r0.f4009b
            if (r5 == 0) goto L_0x0036
            goto L_0x0044
        L_0x0036:
            b.l.a.c.i.b.l4 r0 = r10.a
            b.l.a.c.i.b.k3 r0 = r0.a()
            b.l.a.c.i.b.i3 r0 = r0.f4093k
            java.lang.String r1 = "Discarding empty consent settings"
            r0.a(r1)
            return
        L_0x0044:
            r6 = r1
        L_0x0045:
            java.lang.Object r1 = r10.f4150h
            monitor-enter(r1)
            int r5 = r10.f4152j     // Catch:{ all -> 0x0078 }
            boolean r5 = b.l.a.c.i.b.g.i(r6, r5)     // Catch:{ all -> 0x0078 }
            r7 = 1
            r8 = 0
            if (r5 == 0) goto L_0x0085
            b.l.a.c.i.b.g r5 = r10.f4151i     // Catch:{ all -> 0x0078 }
            boolean r5 = r0.f(r5)     // Catch:{ all -> 0x0078 }
            boolean r9 = r16.e()     // Catch:{ all -> 0x0078 }
            if (r9 == 0) goto L_0x0067
            b.l.a.c.i.b.g r9 = r10.f4151i     // Catch:{ all -> 0x0078 }
            boolean r9 = r9.e()     // Catch:{ all -> 0x0078 }
            if (r9 != 0) goto L_0x0067
            r8 = r7
        L_0x0067:
            b.l.a.c.i.b.g r9 = r10.f4151i     // Catch:{ all -> 0x0078 }
            b.l.a.c.i.b.g r11 = new b.l.a.c.i.b.g     // Catch:{ all -> 0x0078 }
            java.lang.Boolean r12 = r0.a     // Catch:{ all -> 0x0078 }
            if (r12 != 0) goto L_0x0071
            java.lang.Boolean r12 = r9.a     // Catch:{ all -> 0x0078 }
        L_0x0071:
            java.lang.Boolean r0 = r0.f4009b     // Catch:{ all -> 0x0078 }
            if (r0 != 0) goto L_0x007b
            java.lang.Boolean r0 = r9.f4009b     // Catch:{ all -> 0x0078 }
            goto L_0x007b
        L_0x0078:
            r0 = move-exception
            goto L_0x00f6
        L_0x007b:
            r11.<init>(r12, r0)     // Catch:{ all -> 0x0078 }
            r10.f4151i = r11     // Catch:{ all -> 0x0078 }
            r10.f4152j = r6     // Catch:{ all -> 0x0078 }
            r9 = r8
            r8 = r5
            goto L_0x0088
        L_0x0085:
            r11 = r0
            r7 = r8
            r9 = r7
        L_0x0088:
            monitor-exit(r1)     // Catch:{ all -> 0x0078 }
            if (r7 != 0) goto L_0x0099
            b.l.a.c.i.b.l4 r0 = r10.a
            b.l.a.c.i.b.k3 r0 = r0.a()
            b.l.a.c.i.b.i3 r0 = r0.f4094l
            java.lang.String r1 = "Ignoring lower-priority consent settings, proposed settings"
            r0.b(r1, r11)
            return
        L_0x0099:
            java.util.concurrent.atomic.AtomicLong r0 = r10.f4153k
            long r12 = r0.getAndIncrement()
            if (r8 != 0) goto L_0x00dc
            b.l.a.c.i.b.l4 r0 = r10.a
            b.l.a.c.i.b.f r0 = r0.f4114g
            boolean r0 = r0.r(r3, r2)
            if (r0 == 0) goto L_0x00c7
            r0 = 40
            if (r6 == r0) goto L_0x00b2
            if (r6 != r4) goto L_0x00c7
            goto L_0x00b3
        L_0x00b2:
            r4 = r6
        L_0x00b3:
            b.l.a.c.i.b.l4 r0 = r10.a
            b.l.a.c.i.b.i4 r0 = r0.d()
            b.l.a.c.i.b.i6 r8 = new b.l.a.c.i.b.i6
            r1 = r8
            r2 = r15
            r3 = r11
            r5 = r12
            r7 = r9
            r1.<init>(r2, r3, r4, r5, r7)
            r0.s(r8)
            return
        L_0x00c7:
            b.l.a.c.i.b.l4 r0 = r10.a
            b.l.a.c.i.b.i4 r0 = r0.d()
            b.l.a.c.i.b.j6 r8 = new b.l.a.c.i.b.j6
            r1 = r8
            r2 = r15
            r3 = r11
            r4 = r6
            r5 = r12
            r7 = r9
            r1.<init>(r2, r3, r4, r5, r7)
            r0.q(r8)
            return
        L_0x00dc:
            java.util.concurrent.atomic.AtomicReference<java.lang.String> r0 = r10.f4149g
            r0.set(r3)
            b.l.a.c.i.b.l4 r0 = r10.a
            b.l.a.c.i.b.i4 r0 = r0.d()
            b.l.a.c.i.b.h6 r14 = new b.l.a.c.i.b.h6
            r1 = r14
            r2 = r15
            r3 = r11
            r4 = r18
            r7 = r12
            r1.<init>(r2, r3, r4, r6, r7, r9)
            r0.s(r14)
            return
        L_0x00f6:
            monitor-exit(r1)     // Catch:{ all -> 0x0078 }
            throw r0
        L_0x00f8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: b.l.a.c.i.b.m6.y(b.l.a.c.i.b.g, int, long):void");
    }

    @WorkerThread
    public final void z(g gVar) {
        h();
        boolean z = (gVar.e() && gVar.d()) || this.a.z().p();
        l4 l4Var = this.a;
        l4Var.d().h();
        if (z != l4Var.E) {
            l4 l4Var2 = this.a;
            l4Var2.d().h();
            l4Var2.E = z;
            x3 q2 = this.a.q();
            t8.b();
            Boolean bool = null;
            if (q2.a.f4114g.r((String) null, x2.w0)) {
                q2.h();
                if (q2.o().contains("measurement_enabled_from_api")) {
                    bool = Boolean.valueOf(q2.o().getBoolean("measurement_enabled_from_api", true));
                }
            }
            if (!z || bool == null || bool.booleanValue()) {
                u(Boolean.valueOf(z), false);
            }
        }
    }
}
