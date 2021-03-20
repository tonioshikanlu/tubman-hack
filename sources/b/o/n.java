package b.o;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import b.l.f.x.a.g;
import b.o.i2;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

public class n {
    public static n c;
    @Nullable
    public Long a;

    /* renamed from: b  reason: collision with root package name */
    public List<d> f6203b = Arrays.asList(new d[]{new e(), new c()});

    public enum b {
        BACKGROUND,
        END_SESSION
    }

    public static class c extends d {
        public c() {
            super((a) null);
            this.a = 1;
            this.f6207b = "OS_UNSENT_ATTRIBUTED_ACTIVE_TIME";
        }

        public void a(@NonNull JSONObject jSONObject) {
            y1 y1Var = i2.v;
            ArrayList arrayList = new ArrayList();
            for (String aVar : b3.g(b3.a, "PREFS_OS_ATTRIBUTED_INFLUENCES", new HashSet())) {
                try {
                    arrayList.add(new b.o.u4.f.a(aVar));
                } catch (JSONException e2) {
                    i2.k kVar = i2.k.ERROR;
                    i2.a(kVar, c.class.getSimpleName() + ": error generation OSInfluence from json object: " + e2, (Throwable) null);
                }
            }
            j1 j1Var = y1Var.c;
            StringBuilder y = b.e.a.a.a.y("OneSignal SessionManager addSessionData with influences: ");
            y.append(arrayList.toString());
            ((i1) j1Var).a(y.toString());
            b.o.u4.e eVar = y1Var.a;
            Objects.requireNonNull(eVar);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                b.o.u4.f.a aVar2 = (b.o.u4.f.a) it.next();
                if (aVar2.a.ordinal() == 1) {
                    eVar.d().a(jSONObject, aVar2);
                }
            }
            j1 j1Var2 = y1Var.c;
            ((i1) j1Var2).a("OneSignal SessionManager addSessionIds on jsonObject: " + jSONObject);
        }

        public void e(List<b.o.u4.f.a> list) {
            HashSet hashSet = new HashSet();
            for (b.o.u4.f.a b2 : list) {
                try {
                    hashSet.add(b2.b());
                } catch (JSONException e2) {
                    i2.k kVar = i2.k.ERROR;
                    i2.a(kVar, c.class.getSimpleName() + ": error generation json object OSInfluence: " + e2, (Throwable) null);
                }
            }
            b3.h(b3.a, "PREFS_OS_ATTRIBUTED_INFLUENCES", hashSet);
        }

        public void i(@NonNull b bVar) {
            if (bVar.equals(b.END_SESSION)) {
                j();
            } else {
                p3.b(i2.c);
            }
        }

        public boolean k(@NonNull List<b.o.u4.f.a> list) {
            for (b.o.u4.f.a aVar : list) {
                if (aVar.f6316b.e()) {
                    i2.k kVar = i2.k.DEBUG;
                    i2.a(kVar, c.class.getSimpleName() + ":timeTypeApplies for influences: " + list.toString() + " true", (Throwable) null);
                    return true;
                }
            }
            return false;
        }
    }

    public static abstract class d {
        public long a;
        @NonNull

        /* renamed from: b  reason: collision with root package name */
        public String f6207b;
        @Nullable
        public Long c = null;
        @NonNull
        public final AtomicBoolean d = new AtomicBoolean();

        public class a extends l3 {
            public a() {
            }

            public void a(int i2, String str, Throwable th) {
                i2.w("sending on_focus Failed", i2, th, str);
            }

            public void b(String str) {
                d.this.f(0);
            }
        }

        public d() {
        }

        public d(a aVar) {
        }

        public void a(@NonNull JSONObject jSONObject) {
        }

        @NonNull
        public final JSONObject b(long j2) {
            boolean z;
            int i2 = 1;
            JSONObject put = new JSONObject().put("app_id", i2.q()).put("type", 1).put("state", "ping").put("active_time", j2);
            boolean z2 = false;
            try {
                Class.forName("com.amazon.device.messaging.ADM");
                z = true;
            } catch (ClassNotFoundException unused) {
                z = false;
            }
            if (z) {
                i2 = 2;
            } else if (!f2.n()) {
                if (f2.j()) {
                    if (f2.i() && f2.l()) {
                        z2 = f2.o();
                    }
                }
                if (z2 || (!f2.n() && f2.s("com.huawei.hwid"))) {
                    i2 = 13;
                }
            }
            JSONObject put2 = put.put("device_type", i2);
            try {
                put2.put("net_type", i2.A.e());
            } catch (Throwable unused2) {
            }
            return put2;
        }

        public final long c() {
            if (this.c == null) {
                this.c = Long.valueOf(b3.d(b3.a, this.f6207b, 0));
            }
            i2.k kVar = i2.k.DEBUG;
            i2.a(kVar, getClass().getSimpleName() + ":getUnsentActiveTime: " + this.c, (Throwable) null);
            return this.c.longValue();
        }

        public final boolean d() {
            return c() >= this.a;
        }

        public abstract void e(List<b.o.u4.f.a> list);

        public final void f(long j2) {
            this.c = Long.valueOf(j2);
            i2.k kVar = i2.k.DEBUG;
            i2.a(kVar, getClass().getSimpleName() + ":saveUnsentActiveTime: " + this.c, (Throwable) null);
            b3.j(b3.a, this.f6207b, j2);
        }

        public final void g(long j2) {
            try {
                i2.k kVar = i2.k.DEBUG;
                i2.a(kVar, getClass().getSimpleName() + ":sendOnFocus with totalTimeActive: " + j2, (Throwable) null);
                JSONObject b2 = b(j2);
                a(b2);
                h(i2.r(), b2);
                if (!TextUtils.isEmpty(i2.f6118e)) {
                    h(i2.n(), b(j2));
                }
            } catch (JSONException e2) {
                i2.a(i2.k.ERROR, "Generating on_focus:JSON Failed.", e2);
            }
        }

        public final void h(@NonNull String str, @NonNull JSONObject jSONObject) {
            a aVar = new a();
            g.b0("players/" + str + "/on_focus", jSONObject, aVar);
        }

        public abstract void i(@NonNull b bVar);

        @WorkerThread
        public void j() {
            if (!this.d.get()) {
                synchronized (this.d) {
                    this.d.set(true);
                    if (d()) {
                        g(c());
                    }
                    this.d.set(false);
                }
            }
        }

        public abstract boolean k(@NonNull List<b.o.u4.f.a> list);
    }

    public static class e extends d {
        public e() {
            super((a) null);
            this.a = 60;
            this.f6207b = "GT_UNSENT_ACTIVE_TIME";
        }

        public void e(List<b.o.u4.f.a> list) {
        }

        public void i(@NonNull b bVar) {
            if (!bVar.equals(b.END_SESSION) && d()) {
                p3.b(i2.c);
                j();
            }
        }

        public boolean k(@NonNull List<b.o.u4.f.a> list) {
            for (b.o.u4.f.a aVar : list) {
                if (aVar.f6316b.e()) {
                    return false;
                }
            }
            i2.k kVar = i2.k.DEBUG;
            i2.a(kVar, e.class.getSimpleName() + ":timeTypeApplies for influences: " + list.toString() + " true", (Throwable) null);
            return true;
        }
    }

    public static synchronized n a() {
        n nVar;
        synchronized (n.class) {
            if (c == null) {
                c = new n();
            }
            nVar = c;
        }
        return nVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0033 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0034  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean b(@androidx.annotation.NonNull java.util.List<b.o.u4.f.a> r12, @androidx.annotation.NonNull b.o.n.b r13) {
        /*
            r11 = this;
            java.lang.Long r0 = r11.a
            r1 = 0
            if (r0 != 0) goto L_0x0006
            goto L_0x002f
        L_0x0006:
            long r2 = android.os.SystemClock.elapsedRealtime()
            java.lang.Long r0 = r11.a
            long r4 = r0.longValue()
            long r2 = r2 - r4
            double r2 = (double) r2
            r4 = 4652007308841189376(0x408f400000000000, double:1000.0)
            double r2 = r2 / r4
            r4 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            double r2 = r2 + r4
            long r2 = (long) r2
            r4 = 1
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 < 0) goto L_0x002f
            r4 = 86400(0x15180, double:4.26873E-319)
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x002a
            goto L_0x002f
        L_0x002a:
            java.lang.Long r0 = java.lang.Long.valueOf(r2)
            goto L_0x0030
        L_0x002f:
            r0 = r1
        L_0x0030:
            r2 = 0
            if (r0 != 0) goto L_0x0034
            return r2
        L_0x0034:
            java.util.List<b.o.n$d> r3 = r11.f6203b
            java.util.Iterator r3 = r3.iterator()
        L_0x003a:
            boolean r4 = r3.hasNext()
            r5 = 1
            if (r4 == 0) goto L_0x0091
            java.lang.Object r4 = r3.next()
            b.o.n$d r4 = (b.o.n.d) r4
            long r6 = r0.longValue()
            boolean r8 = r4.k(r12)
            if (r8 != 0) goto L_0x0052
            goto L_0x003a
        L_0x0052:
            r4.e(r12)
            b.o.i2$k r8 = b.o.i2.k.DEBUG
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.Class r10 = r4.getClass()
            java.lang.String r10 = r10.getSimpleName()
            r9.append(r10)
            java.lang.String r10 = ":addTime with lastFocusTimeInfluences: "
            r9.append(r10)
            java.lang.String r10 = r12.toString()
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            b.o.i2.a(r8, r9, r1)
            long r8 = r4.c()
            long r8 = r8 + r6
            r4.f(r8)
            java.lang.String r6 = b.o.i2.r()
            if (r6 == 0) goto L_0x0089
            goto L_0x008a
        L_0x0089:
            r5 = r2
        L_0x008a:
            if (r5 != 0) goto L_0x008d
            goto L_0x003a
        L_0x008d:
            r4.i(r13)
            goto L_0x003a
        L_0x0091:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: b.o.n.b(java.util.List, b.o.n$b):boolean");
    }
}
