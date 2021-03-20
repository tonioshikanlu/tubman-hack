package b.o;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import b.l.f.x.a.g;
import b.o.c2;
import b.o.i2;
import b.o.p0;
import b.o.q4;
import b.o.t0;
import com.amplitude.api.DeviceInfo;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class u0 implements p0.a, c2.b {

    /* renamed from: n  reason: collision with root package name */
    public static ArrayList<String> f6298n = new c();

    /* renamed from: o  reason: collision with root package name */
    public static final Object f6299o = new Object();
    public e2 a;

    /* renamed from: b  reason: collision with root package name */
    public c2 f6300b;
    public g1 c;
    @NonNull
    public ArrayList<s0> d = new ArrayList<>();
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final Set<String> f6301e;
    @NonNull
    public final Set<String> f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final Set<String> f6302g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final ArrayList<s0> f6303h;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    public List<s0> f6304i;

    /* renamed from: j  reason: collision with root package name */
    public e1 f6305j = null;

    /* renamed from: k  reason: collision with root package name */
    public boolean f6306k = false;
    @Nullable

    /* renamed from: l  reason: collision with root package name */
    public Date f6307l = null;

    /* renamed from: m  reason: collision with root package name */
    public int f6308m = 0;

    public class a extends l3 {
        public final /* synthetic */ s0 a;

        public a(s0 s0Var) {
            this.a = s0Var;
        }

        public void a(int i2, String str, Throwable th) {
            boolean z;
            u0 u0Var;
            int i3;
            u0.this.f6306k = false;
            u0.d("html", i2, str);
            int[] iArr = f2.a;
            int length = iArr.length;
            int i4 = 0;
            while (true) {
                if (i4 >= length) {
                    z = true;
                    break;
                } else if (i2 == iArr[i4]) {
                    z = false;
                    break;
                } else {
                    i4++;
                }
            }
            if (!z || (i3 = u0Var.f6308m) >= 3) {
                u0 u0Var2 = u0.this;
                u0Var2.f6308m = 0;
                u0Var2.q(this.a, true);
                return;
            }
            (u0Var = u0.this).f6308m = i3 + 1;
            u0Var.u(this.a);
        }

        public void b(String str) {
            u0.this.f6308m = 0;
            try {
                JSONObject jSONObject = new JSONObject(str);
                String string = jSONObject.getString("html");
                double optDouble = jSONObject.optDouble("display_duration");
                s0 s0Var = this.a;
                s0Var.f = optDouble;
                y1 y1Var = i2.v;
                String str2 = s0Var.a;
                j1 j1Var = y1Var.c;
                ((i1) j1Var).a("OneSignal SessionManager onInAppMessageReceived messageId: " + str2);
                b.o.u4.a c = y1Var.a.c();
                c.n(str2);
                c.l();
                q4.i(this.a, string);
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
        }
    }

    public class b extends l3 {
        public b() {
        }

        public void a(int i2, String str, Throwable th) {
            u0.d("html", i2, str);
            u0.this.g((s0) null);
        }

        public void b(String str) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                String string = jSONObject.getString("html");
                s0 s0Var = new s0(true);
                s0Var.f = jSONObject.optDouble("display_duration");
                q4.i(s0Var, string);
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
        }
    }

    public static class c extends ArrayList<String> {
        public c() {
            add(DeviceInfo.OS_NAME);
            add("app");
            add("all");
        }
    }

    public class d implements i2.p {
        public final /* synthetic */ s0 a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ List f6310b;

        public d(s0 s0Var, List list) {
            this.a = s0Var;
            this.f6310b = list;
        }
    }

    public u0(z2 z2Var) {
        Set<String> p2 = f2.p();
        this.f6301e = p2;
        this.f6303h = new ArrayList<>();
        Set<String> p3 = f2.p();
        this.f = p3;
        Set<String> p4 = f2.p();
        this.f6302g = p4;
        this.a = new e2(this);
        this.f6300b = new c2(this);
        String str = b3.a;
        Set<String> g2 = b3.g(str, "PREFS_OS_DISPLAYED_IAMS", (Set<String>) null);
        if (g2 != null) {
            p2.addAll(g2);
        }
        Set<String> g3 = b3.g(str, "PREFS_OS_IMPRESSIONED_IAMS", (Set<String>) null);
        if (g3 != null) {
            p3.addAll(g3);
        }
        Set<String> g4 = b3.g(str, "PREFS_OS_CLICKED_CLICK_IDS_IAMS", (Set<String>) null);
        if (g4 != null) {
            p4.addAll(g4);
        }
        l(z2Var);
    }

    public static void c(String str, String str2) {
        i2.k kVar = i2.k.DEBUG;
        i2.a(kVar, "Successful post for in-app message " + str + " request: " + str2, (Throwable) null);
    }

    public static void d(String str, int i2, String str2) {
        i2.k kVar = i2.k.ERROR;
        i2.a(kVar, "Encountered a " + i2 + " error while attempting in-app message " + str + " request: " + str2, (Throwable) null);
    }

    @Nullable
    public static String x(@NonNull s0 s0Var) {
        String b2 = f2.b();
        Iterator<String> it = f6298n.iterator();
        while (it.hasNext()) {
            String next = it.next();
            if (s0Var.f6272b.containsKey(next)) {
                HashMap hashMap = s0Var.f6272b.get(next);
                if (!hashMap.containsKey(b2)) {
                    b2 = "default";
                }
                return (String) hashMap.get(b2);
            }
        }
        return null;
    }

    public void a() {
        i2.a(i2.k.DEBUG, "messageTriggerConditionChanged called", (Throwable) null);
        j();
    }

    public void b() {
        e();
    }

    public final void e() {
        synchronized (this.f6303h) {
            if (!this.f6300b.a()) {
                i2.a(i2.k.WARN, "In app message not showing due to system condition not correct", (Throwable) null);
                return;
            }
            i2.k kVar = i2.k.DEBUG;
            i2.a(kVar, "displayFirstIAMOnQueue: " + this.f6303h, (Throwable) null);
            if (this.f6303h.size() <= 0 || n()) {
                i2.a(kVar, "In app message is currently showing or there are no IAMs left in the queue!", (Throwable) null);
                return;
            }
            i2.a(kVar, "No IAM showing currently, showing first item in the queue!", (Throwable) null);
            h(this.f6303h.get(0));
        }
    }

    public final void f(s0 s0Var, List<e1> list) {
        if (list.size() > 0) {
            i2.k kVar = i2.k.DEBUG;
            StringBuilder y = b.e.a.a.a.y("IAM showing prompts from IAM: ");
            y.append(s0Var.toString());
            i2.a(kVar, y.toString(), (Throwable) null);
            String str = q4.f6243g;
            StringBuilder y2 = b.e.a.a.a.y("WebViewManager IAM dismissAndAwaitNextMessage lastInstance: ");
            y2.append(q4.f6245i);
            i2.a(kVar, y2.toString(), (Throwable) null);
            q4 q4Var = q4.f6245i;
            if (q4Var != null) {
                q4Var.f((q4.f) null);
            }
            w(s0Var, list);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x009e, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void g(@androidx.annotation.Nullable b.o.s0 r7) {
        /*
            r6 = this;
            b.o.i2$k r0 = b.o.i2.k.DEBUG
            b.o.y1 r1 = b.o.i2.v
            b.o.j1 r2 = r1.c
            b.o.i1 r2 = (b.o.i1) r2
            java.lang.String r3 = "OneSignal SessionManager onDirectInfluenceFromIAMClickFinished"
            r2.a(r3)
            b.o.u4.e r1 = r1.a
            b.o.u4.a r1 = r1.c()
            r1.l()
            b.o.e1 r1 = r6.f6305j
            r2 = 0
            if (r1 == 0) goto L_0x0021
            java.lang.String r7 = "Stop evaluateMessageDisplayQueue because prompt is currently displayed"
            b.o.i2.a(r0, r7, r2)
            return
        L_0x0021:
            r1 = 0
            r6.f6306k = r1
            java.util.ArrayList<b.o.s0> r3 = r6.f6303h
            monitor-enter(r3)
            java.util.ArrayList<b.o.s0> r4 = r6.f6303h     // Catch:{ all -> 0x009f }
            int r4 = r4.size()     // Catch:{ all -> 0x009f }
            if (r4 <= 0) goto L_0x0063
            if (r7 == 0) goto L_0x0040
            java.util.ArrayList<b.o.s0> r4 = r6.f6303h     // Catch:{ all -> 0x009f }
            boolean r7 = r4.contains(r7)     // Catch:{ all -> 0x009f }
            if (r7 != 0) goto L_0x0040
            java.lang.String r7 = "Message already removed from the queue!"
            b.o.i2.a(r0, r7, r2)     // Catch:{ all -> 0x009f }
            monitor-exit(r3)     // Catch:{ all -> 0x009f }
            return
        L_0x0040:
            java.util.ArrayList<b.o.s0> r7 = r6.f6303h     // Catch:{ all -> 0x009f }
            java.lang.Object r7 = r7.remove(r1)     // Catch:{ all -> 0x009f }
            b.o.s0 r7 = (b.o.s0) r7     // Catch:{ all -> 0x009f }
            java.lang.String r7 = r7.a     // Catch:{ all -> 0x009f }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x009f }
            r4.<init>()     // Catch:{ all -> 0x009f }
            java.lang.String r5 = "In app message with id, "
            r4.append(r5)     // Catch:{ all -> 0x009f }
            r4.append(r7)     // Catch:{ all -> 0x009f }
            java.lang.String r7 = ", dismissed (removed) from the queue!"
            r4.append(r7)     // Catch:{ all -> 0x009f }
            java.lang.String r7 = r4.toString()     // Catch:{ all -> 0x009f }
            b.o.i2.a(r0, r7, r2)     // Catch:{ all -> 0x009f }
        L_0x0063:
            java.util.ArrayList<b.o.s0> r7 = r6.f6303h     // Catch:{ all -> 0x009f }
            int r7 = r7.size()     // Catch:{ all -> 0x009f }
            if (r7 <= 0) goto L_0x0095
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x009f }
            r7.<init>()     // Catch:{ all -> 0x009f }
            java.lang.String r4 = "In app message on queue available: "
            r7.append(r4)     // Catch:{ all -> 0x009f }
            java.util.ArrayList<b.o.s0> r4 = r6.f6303h     // Catch:{ all -> 0x009f }
            java.lang.Object r4 = r4.get(r1)     // Catch:{ all -> 0x009f }
            b.o.s0 r4 = (b.o.s0) r4     // Catch:{ all -> 0x009f }
            java.lang.String r4 = r4.a     // Catch:{ all -> 0x009f }
            r7.append(r4)     // Catch:{ all -> 0x009f }
            java.lang.String r7 = r7.toString()     // Catch:{ all -> 0x009f }
            b.o.i2.a(r0, r7, r2)     // Catch:{ all -> 0x009f }
            java.util.ArrayList<b.o.s0> r7 = r6.f6303h     // Catch:{ all -> 0x009f }
            java.lang.Object r7 = r7.get(r1)     // Catch:{ all -> 0x009f }
            b.o.s0 r7 = (b.o.s0) r7     // Catch:{ all -> 0x009f }
            r6.h(r7)     // Catch:{ all -> 0x009f }
            goto L_0x009d
        L_0x0095:
            java.lang.String r7 = "In app message dismissed evaluating messages"
            b.o.i2.a(r0, r7, r2)     // Catch:{ all -> 0x009f }
            r6.j()     // Catch:{ all -> 0x009f }
        L_0x009d:
            monitor-exit(r3)     // Catch:{ all -> 0x009f }
            return
        L_0x009f:
            r7 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x009f }
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: b.o.u0.g(b.o.s0):void");
    }

    public final void h(@NonNull s0 s0Var) {
        String str;
        this.f6306k = true;
        String x = x(s0Var);
        if (x == null) {
            i2.k kVar = i2.k.ERROR;
            StringBuilder y = b.e.a.a.a.y("Unable to find a variant for in-app message ");
            y.append(s0Var.a);
            i2.a(kVar, y.toString(), (Throwable) null);
            str = null;
        } else {
            StringBuilder y2 = b.e.a.a.a.y("in_app_messages/");
            b.e.a.a.a.L(y2, s0Var.a, "/variants/", x, "/html?app_id=");
            y2.append(i2.a);
            str = y2.toString();
        }
        g.r(str, new a(s0Var), (String) null);
    }

    public void i(@NonNull String str) {
        this.f6306k = true;
        StringBuilder C = b.e.a.a.a.C("in_app_messages/device_preview?preview_id=", str, "&app_id=");
        C.append(i2.a);
        g.r(C.toString(), new b(), (String) null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:102:0x01c4, code lost:
        if (((java.util.Collection) r3).contains(r10.f6063e) != false) goto L_0x0237;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x01db, code lost:
        if (r1.b((java.lang.String) r5, (java.lang.String) r3, r0) != false) goto L_0x0237;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x0235, code lost:
        if (r0 == false) goto L_0x0239;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x014b, code lost:
        if (r5 > r0) goto L_0x014d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x01a6, code lost:
        if (r10.f6063e != null) goto L_0x0237;
     */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x023e A[LOOP:2: B:10:0x004e->B:138:0x023e, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:167:0x02f1  */
    /* JADX WARNING: Removed duplicated region for block: B:168:0x02f6  */
    /* JADX WARNING: Removed duplicated region for block: B:181:0x0331  */
    /* JADX WARNING: Removed duplicated region for block: B:188:0x037f  */
    /* JADX WARNING: Removed duplicated region for block: B:213:0x023c A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00f9  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0149  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0152  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x015e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void j() {
        /*
            r22 = this;
            r1 = r22
            b.o.d2$a r0 = b.o.d2.a.f6066k
            b.o.d2$a r2 = b.o.d2.a.UNKNOWN
            b.o.i2$k r3 = b.o.i2.k.DEBUG
            java.lang.String r4 = "Starting evaluateInAppMessages"
            r5 = 0
            b.o.i2.a(r3, r4, r5)
            java.util.ArrayList<b.o.s0> r4 = r1.d
            java.util.Iterator r4 = r4.iterator()
        L_0x0014:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x03f7
            java.lang.Object r5 = r4.next()
            b.o.s0 r5 = (b.o.s0) r5
            b.o.e2 r6 = r1.a
            java.util.Objects.requireNonNull(r6)
            java.util.ArrayList<java.util.ArrayList<b.o.d2>> r7 = r5.c
            int r7 = r7.size()
            r8 = 1
            if (r7 != 0) goto L_0x0038
            r16 = r0
            r20 = r3
            r21 = r4
            r17 = r5
            goto L_0x0276
        L_0x0038:
            java.util.ArrayList<java.util.ArrayList<b.o.d2>> r7 = r5.c
            java.util.Iterator r7 = r7.iterator()
        L_0x003e:
            boolean r9 = r7.hasNext()
            if (r9 == 0) goto L_0x026d
            java.lang.Object r9 = r7.next()
            java.util.ArrayList r9 = (java.util.ArrayList) r9
            java.util.Iterator r9 = r9.iterator()
        L_0x004e:
            boolean r10 = r9.hasNext()
            if (r10 == 0) goto L_0x024e
            java.lang.Object r10 = r9.next()
            b.o.d2 r10 = (b.o.d2) r10
            b.o.d2$b r11 = b.o.d2.b.NOT_EQUAL_TO
            b.o.d2$b r12 = b.o.d2.b.NOT_EXISTS
            b.o.d2$a r13 = r10.f6062b
            if (r13 != r2) goto L_0x0063
            goto L_0x006e
        L_0x0063:
            if (r13 == r0) goto L_0x0184
            b.o.p0 r11 = r6.a
            java.util.Objects.requireNonNull(r11)
            java.lang.Object r12 = r10.f6063e
            if (r12 != 0) goto L_0x007b
        L_0x006e:
            r16 = r0
            r20 = r3
            r21 = r4
            r17 = r5
            r1 = r6
            r19 = r7
            goto L_0x0239
        L_0x007b:
            java.util.ArrayList<java.lang.String> r13 = r11.f6225b
            monitor-enter(r13)
            java.lang.Object r12 = r10.f6063e     // Catch:{ all -> 0x0181 }
            boolean r12 = r12 instanceof java.lang.Number     // Catch:{ all -> 0x0181 }
            if (r12 != 0) goto L_0x0085
            goto L_0x00a8
        L_0x0085:
            b.o.d2$a r12 = r10.f6062b     // Catch:{ all -> 0x0181 }
            int r12 = r12.ordinal()     // Catch:{ all -> 0x0181 }
            if (r12 == 0) goto L_0x009e
            if (r12 == r8) goto L_0x0092
            r14 = 0
            goto L_0x00d1
        L_0x0092:
            java.util.Date r8 = new java.util.Date     // Catch:{ all -> 0x0181 }
            r8.<init>()     // Catch:{ all -> 0x0181 }
            long r14 = r8.getTime()     // Catch:{ all -> 0x0181 }
            java.util.Date r8 = b.o.p0.c     // Catch:{ all -> 0x0181 }
            goto L_0x00cb
        L_0x009e:
            b.o.u0 r8 = b.o.i2.p()     // Catch:{ all -> 0x0181 }
            boolean r8 = r8.n()     // Catch:{ all -> 0x0181 }
            if (r8 == 0) goto L_0x00b6
        L_0x00a8:
            r16 = r0
            r20 = r3
            r21 = r4
            r17 = r5
            r18 = r6
            r19 = r7
            goto L_0x017c
        L_0x00b6:
            b.o.u0 r8 = b.o.i2.p()     // Catch:{ all -> 0x0181 }
            java.util.Date r8 = r8.f6307l     // Catch:{ all -> 0x0181 }
            if (r8 != 0) goto L_0x00c2
            r14 = 999999(0xf423f, double:4.94065E-318)
            goto L_0x00d1
        L_0x00c2:
            java.util.Date r12 = new java.util.Date     // Catch:{ all -> 0x0181 }
            r12.<init>()     // Catch:{ all -> 0x0181 }
            long r14 = r12.getTime()     // Catch:{ all -> 0x0181 }
        L_0x00cb:
            long r16 = r8.getTime()     // Catch:{ all -> 0x0181 }
            long r14 = r14 - r16
        L_0x00d1:
            java.lang.String r8 = r10.a     // Catch:{ all -> 0x0181 }
            java.lang.Object r12 = r10.f6063e     // Catch:{ all -> 0x0181 }
            java.lang.Number r12 = (java.lang.Number) r12     // Catch:{ all -> 0x0181 }
            double r16 = r12.doubleValue()     // Catch:{ all -> 0x0181 }
            r18 = 4652007308841189376(0x408f400000000000, double:1000.0)
            r20 = r3
            r21 = r4
            double r3 = r16 * r18
            long r3 = (long) r3     // Catch:{ all -> 0x0181 }
            r16 = r0
            double r0 = (double) r3     // Catch:{ all -> 0x0181 }
            r17 = r5
            r18 = r6
            double r5 = (double) r14     // Catch:{ all -> 0x0181 }
            b.o.d2$b r10 = r10.d     // Catch:{ all -> 0x0181 }
            int r12 = r10.ordinal()     // Catch:{ all -> 0x0181 }
            r19 = r7
            if (r12 == 0) goto L_0x0149
            r7 = 1
            if (r12 == r7) goto L_0x0144
            r7 = 2
            if (r12 == r7) goto L_0x013f
            r7 = 3
            if (r12 == r7) goto L_0x0138
            r7 = 4
            if (r12 == r7) goto L_0x012d
            r7 = 5
            if (r12 == r7) goto L_0x0122
            b.o.i2$k r0 = b.o.i2.k.ERROR     // Catch:{ all -> 0x0181 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0181 }
            r1.<init>()     // Catch:{ all -> 0x0181 }
            java.lang.String r5 = "Attempted to apply an invalid operator on a time-based in-app-message trigger: "
            r1.append(r5)     // Catch:{ all -> 0x0181 }
            java.lang.String r5 = r10.f6079h     // Catch:{ all -> 0x0181 }
            r1.append(r5)     // Catch:{ all -> 0x0181 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0181 }
            r5 = 0
            b.o.i2.a(r0, r1, r5)     // Catch:{ all -> 0x0181 }
            goto L_0x014f
        L_0x0122:
            int r7 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r7 >= 0) goto L_0x014d
            boolean r0 = b.o.p0.a(r0, r5)     // Catch:{ all -> 0x0181 }
            if (r0 == 0) goto L_0x014f
            goto L_0x014d
        L_0x012d:
            int r7 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r7 <= 0) goto L_0x014d
            boolean r0 = b.o.p0.a(r0, r5)     // Catch:{ all -> 0x0181 }
            if (r0 == 0) goto L_0x014f
            goto L_0x014d
        L_0x0138:
            boolean r0 = b.o.p0.a(r0, r5)     // Catch:{ all -> 0x0181 }
            r0 = r0 ^ 1
            goto L_0x0150
        L_0x013f:
            boolean r0 = b.o.p0.a(r0, r5)     // Catch:{ all -> 0x0181 }
            goto L_0x0150
        L_0x0144:
            int r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r0 >= 0) goto L_0x014f
            goto L_0x014d
        L_0x0149:
            int r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x014f
        L_0x014d:
            r0 = 1
            goto L_0x0150
        L_0x014f:
            r0 = 0
        L_0x0150:
            if (r0 == 0) goto L_0x015e
            b.o.p0$a r0 = r11.a     // Catch:{ all -> 0x0181 }
            b.o.u0 r0 = (b.o.u0) r0
            r0.o(r8)     // Catch:{ all -> 0x0181 }
            monitor-exit(r13)     // Catch:{ all -> 0x0181 }
            r1 = r18
            goto L_0x0237
        L_0x015e:
            long r3 = r3 - r14
            r0 = 0
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 > 0) goto L_0x0166
            goto L_0x017c
        L_0x0166:
            java.util.ArrayList<java.lang.String> r0 = r11.f6225b     // Catch:{ all -> 0x0181 }
            boolean r0 = r0.contains(r8)     // Catch:{ all -> 0x0181 }
            if (r0 == 0) goto L_0x016f
            goto L_0x017c
        L_0x016f:
            b.o.o0 r0 = new b.o.o0     // Catch:{ all -> 0x0181 }
            r0.<init>(r11, r8)     // Catch:{ all -> 0x0181 }
            b.l.f.x.a.g.h0(r0, r8, r3)     // Catch:{ all -> 0x0181 }
            java.util.ArrayList<java.lang.String> r0 = r11.f6225b     // Catch:{ all -> 0x0181 }
            r0.add(r8)     // Catch:{ all -> 0x0181 }
        L_0x017c:
            monitor-exit(r13)     // Catch:{ all -> 0x0181 }
            r1 = r18
            goto L_0x0239
        L_0x0181:
            r0 = move-exception
            monitor-exit(r13)     // Catch:{ all -> 0x0181 }
            throw r0
        L_0x0184:
            r16 = r0
            r20 = r3
            r21 = r4
            r17 = r5
            r18 = r6
            r19 = r7
            b.o.d2$b r0 = r10.d
            r1 = r18
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.Object> r3 = r1.f6083b
            java.lang.String r4 = r10.c
            java.lang.Object r3 = r3.get(r4)
            if (r3 != 0) goto L_0x01aa
            if (r0 != r12) goto L_0x01a2
            goto L_0x0237
        L_0x01a2:
            if (r0 != r11) goto L_0x0239
            java.lang.Object r0 = r10.f6063e
            if (r0 == 0) goto L_0x0239
            goto L_0x0237
        L_0x01aa:
            b.o.d2$b r4 = b.o.d2.b.EXISTS
            if (r0 != r4) goto L_0x01b0
            goto L_0x0237
        L_0x01b0:
            if (r0 != r12) goto L_0x01b4
            goto L_0x0239
        L_0x01b4:
            b.o.d2$b r4 = b.o.d2.b.CONTAINS
            if (r0 != r4) goto L_0x01c8
            boolean r0 = r3 instanceof java.util.Collection
            if (r0 == 0) goto L_0x0239
            java.util.Collection r3 = (java.util.Collection) r3
            java.lang.Object r0 = r10.f6063e
            boolean r0 = r3.contains(r0)
            if (r0 == 0) goto L_0x0239
            goto L_0x0237
        L_0x01c8:
            boolean r4 = r3 instanceof java.lang.String
            if (r4 == 0) goto L_0x01de
            java.lang.Object r5 = r10.f6063e
            boolean r6 = r5 instanceof java.lang.String
            if (r6 == 0) goto L_0x01de
            java.lang.String r5 = (java.lang.String) r5
            r6 = r3
            java.lang.String r6 = (java.lang.String) r6
            boolean r5 = r1.b(r5, r6, r0)
            if (r5 == 0) goto L_0x01de
            goto L_0x0237
        L_0x01de:
            java.lang.Object r5 = r10.f6063e
            boolean r6 = r5 instanceof java.lang.Number
            if (r6 == 0) goto L_0x01f4
            boolean r6 = r3 instanceof java.lang.Number
            if (r6 == 0) goto L_0x01f4
            java.lang.Number r5 = (java.lang.Number) r5
            r6 = r3
            java.lang.Number r6 = (java.lang.Number) r6
            boolean r5 = r1.a(r5, r6, r0)
            if (r5 == 0) goto L_0x01f4
            goto L_0x0237
        L_0x01f4:
            java.lang.Object r5 = r10.f6063e
            if (r5 != 0) goto L_0x01f9
            goto L_0x0234
        L_0x01f9:
            java.util.Objects.requireNonNull(r0)
            b.o.d2$b r6 = b.o.d2.b.EQUAL_TO
            if (r0 == r6) goto L_0x0205
            if (r0 != r11) goto L_0x0203
            goto L_0x0205
        L_0x0203:
            r6 = 0
            goto L_0x0206
        L_0x0205:
            r6 = 1
        L_0x0206:
            if (r6 == 0) goto L_0x0215
            java.lang.String r4 = r5.toString()
            java.lang.String r3 = r3.toString()
            boolean r0 = r1.b(r4, r3, r0)
            goto L_0x0235
        L_0x0215:
            if (r4 == 0) goto L_0x0234
            boolean r4 = r5 instanceof java.lang.Number
            if (r4 == 0) goto L_0x0234
            java.lang.Number r5 = (java.lang.Number) r5
            java.lang.String r3 = (java.lang.String) r3
            double r3 = java.lang.Double.parseDouble(r3)     // Catch:{ NumberFormatException -> 0x0234 }
            double r5 = r5.doubleValue()
            java.lang.Double r5 = java.lang.Double.valueOf(r5)
            java.lang.Double r3 = java.lang.Double.valueOf(r3)
            boolean r0 = r1.a(r5, r3, r0)
            goto L_0x0235
        L_0x0234:
            r0 = 0
        L_0x0235:
            if (r0 == 0) goto L_0x0239
        L_0x0237:
            r0 = 1
            goto L_0x023a
        L_0x0239:
            r0 = 0
        L_0x023a:
            if (r0 != 0) goto L_0x023e
            r0 = 0
            goto L_0x025a
        L_0x023e:
            r8 = 1
            r6 = r1
            r0 = r16
            r5 = r17
            r7 = r19
            r3 = r20
            r4 = r21
            r1 = r22
            goto L_0x004e
        L_0x024e:
            r16 = r0
            r20 = r3
            r21 = r4
            r17 = r5
            r1 = r6
            r19 = r7
            r0 = 1
        L_0x025a:
            r8 = 1
            if (r0 == 0) goto L_0x025e
            goto L_0x0276
        L_0x025e:
            r6 = r1
            r0 = r16
            r5 = r17
            r7 = r19
            r3 = r20
            r4 = r21
            r1 = r22
            goto L_0x003e
        L_0x026d:
            r16 = r0
            r20 = r3
            r21 = r4
            r17 = r5
            r8 = 0
        L_0x0276:
            if (r8 == 0) goto L_0x03eb
            r1 = r22
            java.util.Set<java.lang.String> r0 = r1.f6301e
            r5 = r17
            java.lang.String r3 = r5.a
            boolean r0 = r0.contains(r3)
            java.util.List<b.o.s0> r3 = r1.f6304i
            int r3 = r3.indexOf(r5)
            if (r0 == 0) goto L_0x03c6
            r0 = -1
            if (r3 == r0) goto L_0x03c6
            java.util.List<b.o.s0> r0 = r1.f6304i
            java.lang.Object r0 = r0.get(r3)
            b.o.s0 r0 = (b.o.s0) r0
            b.o.f1 r3 = r5.f6273e
            b.o.f1 r4 = r0.f6273e
            java.util.Objects.requireNonNull(r3)
            long r6 = r4.a
            r3.a = r6
            int r4 = r4.f6088b
            r3.f6088b = r4
            boolean r0 = r0.f6274g
            r5.f6274g = r0
            b.o.e2 r0 = r1.a
            java.util.Objects.requireNonNull(r0)
            java.util.ArrayList<java.util.ArrayList<b.o.d2>> r0 = r5.c
            if (r0 == 0) goto L_0x02ec
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x02ba
            goto L_0x02ec
        L_0x02ba:
            java.util.ArrayList<java.util.ArrayList<b.o.d2>> r0 = r5.c
            java.util.Iterator r0 = r0.iterator()
        L_0x02c0:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x02e8
            java.lang.Object r3 = r0.next()
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            java.util.Iterator r3 = r3.iterator()
        L_0x02d0:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x02c0
            java.lang.Object r4 = r3.next()
            b.o.d2 r4 = (b.o.d2) r4
            b.o.d2$a r4 = r4.f6062b
            r6 = r16
            if (r4 == r6) goto L_0x02ee
            if (r4 != r2) goto L_0x02e5
            goto L_0x02ee
        L_0x02e5:
            r16 = r6
            goto L_0x02d0
        L_0x02e8:
            r6 = r16
            r0 = 1
            goto L_0x02ef
        L_0x02ec:
            r6 = r16
        L_0x02ee:
            r0 = 0
        L_0x02ef:
            if (r0 == 0) goto L_0x02f6
            boolean r0 = r5.f6274g
            r3 = 1
            r0 = r0 ^ r3
            goto L_0x0310
        L_0x02f6:
            r3 = 1
            boolean r0 = r5.f6274g
            if (r0 != 0) goto L_0x0305
            java.util.ArrayList<java.util.ArrayList<b.o.d2>> r0 = r5.c
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0305
            r0 = r3
            goto L_0x0306
        L_0x0305:
            r0 = 0
        L_0x0306:
            boolean r4 = r5.f6275h
            if (r4 != 0) goto L_0x030f
            if (r0 == 0) goto L_0x030d
            goto L_0x030f
        L_0x030d:
            r0 = 0
            goto L_0x0310
        L_0x030f:
            r0 = r3
        L_0x0310:
            java.lang.String r4 = "setDataForRedisplay: "
            java.lang.StringBuilder r4 = b.e.a.a.a.y(r4)
            java.lang.String r7 = r5.toString()
            r4.append(r7)
            java.lang.String r7 = " triggerHasChanged: "
            r4.append(r7)
            r4.append(r0)
            java.lang.String r4 = r4.toString()
            r7 = 0
            r8 = r20
            b.o.i2.a(r8, r4, r7)
            if (r0 == 0) goto L_0x03ca
            b.o.f1 r0 = r5.f6273e
            long r9 = r0.a
            r11 = 0
            int r4 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r4 >= 0) goto L_0x033c
            goto L_0x037a
        L_0x033c:
            long r9 = java.lang.System.currentTimeMillis()
            r11 = 1000(0x3e8, double:4.94E-321)
            long r9 = r9 / r11
            long r11 = r0.a
            long r11 = r9 - r11
            java.lang.String r4 = "OSInAppMessage lastDisplayTime: "
            java.lang.StringBuilder r4 = b.e.a.a.a.y(r4)
            long r13 = r0.a
            r4.append(r13)
            java.lang.String r7 = " currentTimeInSeconds: "
            r4.append(r7)
            r4.append(r9)
            java.lang.String r7 = " diffInSeconds: "
            r4.append(r7)
            r4.append(r11)
            java.lang.String r7 = " displayDelay: "
            r4.append(r7)
            long r9 = r0.d
            r4.append(r9)
            java.lang.String r4 = r4.toString()
            r7 = 0
            b.o.i2.a(r8, r4, r7)
            long r9 = r0.d
            int r0 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
            if (r0 < 0) goto L_0x037c
        L_0x037a:
            r0 = r3
            goto L_0x037d
        L_0x037c:
            r0 = 0
        L_0x037d:
            if (r0 == 0) goto L_0x03ca
            b.o.f1 r0 = r5.f6273e
            int r4 = r0.f6088b
            int r0 = r0.c
            if (r4 >= r0) goto L_0x0388
            goto L_0x0389
        L_0x0388:
            r3 = 0
        L_0x0389:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r4 = "OSInAppMessage shouldDisplayAgain: "
            r0.append(r4)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            r4 = 0
            b.o.i2.a(r8, r0, r4)
            if (r3 == 0) goto L_0x03ca
            java.lang.String r0 = "setDataForRedisplay message available for redisplay: "
            java.lang.StringBuilder r0 = b.e.a.a.a.y(r0)
            java.lang.String r3 = r5.a
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            b.o.i2.a(r8, r0, r4)
            java.util.Set<java.lang.String> r0 = r1.f6301e
            java.lang.String r3 = r5.a
            r0.remove(r3)
            java.util.Set<java.lang.String> r0 = r1.f
            java.lang.String r3 = r5.a
            r0.remove(r3)
            java.util.Set<java.lang.String> r0 = r5.d
            r0.clear()
            goto L_0x03ca
        L_0x03c6:
            r6 = r16
            r8 = r20
        L_0x03ca:
            java.util.Set<java.lang.String> r0 = r1.f6301e
            java.lang.String r3 = r5.a
            boolean r0 = r0.contains(r3)
            if (r0 != 0) goto L_0x03f1
            java.util.Date r0 = r5.f6277j
            if (r0 != 0) goto L_0x03da
            r0 = 0
            goto L_0x03e5
        L_0x03da:
            java.util.Date r0 = new java.util.Date
            r0.<init>()
            java.util.Date r3 = r5.f6277j
            boolean r0 = r3.before(r0)
        L_0x03e5:
            if (r0 != 0) goto L_0x03f1
            r1.u(r5)
            goto L_0x03f1
        L_0x03eb:
            r1 = r22
            r6 = r16
            r8 = r20
        L_0x03f1:
            r0 = r6
            r3 = r8
            r4 = r21
            goto L_0x0014
        L_0x03f7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: b.o.u0.j():void");
    }

    public final void k(@NonNull t0 t0Var) {
        String str = t0Var.c;
        if (str != null && !str.isEmpty()) {
            t0.a aVar = t0Var.f6286b;
            if (aVar == t0.a.BROWSER) {
                f2.r(t0Var.c);
            } else if (aVar == t0.a.IN_APP_WEBVIEW) {
                g.X(t0Var.c, true);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0081, code lost:
        if (r2.isClosed() == false) goto L_0x009a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0098, code lost:
        if (r2.isClosed() == false) goto L_0x009a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x009a, code lost:
        r2.close();
     */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0094 A[SYNTHETIC, Splitter:B:29:0x0094] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00bd A[SYNTHETIC, Splitter:B:39:0x00bd] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void l(b.o.z2 r12) {
        /*
            r11 = this;
            b.o.g1 r0 = r11.c
            if (r0 != 0) goto L_0x000b
            b.o.g1 r0 = new b.o.g1
            r0.<init>(r12)
            r11.c = r0
        L_0x000b:
            b.o.g1 r12 = r11.c
            r11.c = r12
            monitor-enter(r12)
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ all -> 0x00c7 }
            r0.<init>()     // Catch:{ all -> 0x00c7 }
            r1 = 0
            b.o.z2 r2 = r12.a     // Catch:{ JSONException -> 0x0088, all -> 0x0086 }
            java.lang.String r3 = "in_app_message"
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            android.database.Cursor r2 = r2.S(r3, r4, r5, r6, r7, r8, r9)     // Catch:{ JSONException -> 0x0088, all -> 0x0086 }
            boolean r3 = r2.moveToFirst()     // Catch:{ JSONException -> 0x0084 }
            if (r3 == 0) goto L_0x007d
        L_0x002a:
            java.lang.String r3 = "message_id"
            int r3 = r2.getColumnIndex(r3)     // Catch:{ JSONException -> 0x0084 }
            java.lang.String r3 = r2.getString(r3)     // Catch:{ JSONException -> 0x0084 }
            java.lang.String r4 = "click_ids"
            int r4 = r2.getColumnIndex(r4)     // Catch:{ JSONException -> 0x0084 }
            java.lang.String r4 = r2.getString(r4)     // Catch:{ JSONException -> 0x0084 }
            java.lang.String r5 = "display_quantity"
            int r5 = r2.getColumnIndex(r5)     // Catch:{ JSONException -> 0x0084 }
            int r5 = r2.getInt(r5)     // Catch:{ JSONException -> 0x0084 }
            java.lang.String r6 = "last_display"
            int r6 = r2.getColumnIndex(r6)     // Catch:{ JSONException -> 0x0084 }
            long r6 = r2.getLong(r6)     // Catch:{ JSONException -> 0x0084 }
            java.lang.String r8 = "displayed_in_session"
            int r8 = r2.getColumnIndex(r8)     // Catch:{ JSONException -> 0x0084 }
            int r8 = r2.getInt(r8)     // Catch:{ JSONException -> 0x0084 }
            r9 = 1
            if (r8 != r9) goto L_0x0060
            goto L_0x0061
        L_0x0060:
            r9 = 0
        L_0x0061:
            org.json.JSONArray r8 = new org.json.JSONArray     // Catch:{ JSONException -> 0x0084 }
            r8.<init>(r4)     // Catch:{ JSONException -> 0x0084 }
            java.util.Set r4 = b.o.f2.q(r8)     // Catch:{ JSONException -> 0x0084 }
            b.o.s0 r8 = new b.o.s0     // Catch:{ JSONException -> 0x0084 }
            b.o.f1 r10 = new b.o.f1     // Catch:{ JSONException -> 0x0084 }
            r10.<init>(r5, r6)     // Catch:{ JSONException -> 0x0084 }
            r8.<init>(r3, r4, r9, r10)     // Catch:{ JSONException -> 0x0084 }
            r0.add(r8)     // Catch:{ JSONException -> 0x0084 }
            boolean r3 = r2.moveToNext()     // Catch:{ JSONException -> 0x0084 }
            if (r3 != 0) goto L_0x002a
        L_0x007d:
            boolean r3 = r2.isClosed()     // Catch:{ all -> 0x00c7 }
            if (r3 != 0) goto L_0x009d
            goto L_0x009a
        L_0x0084:
            r3 = move-exception
            goto L_0x008b
        L_0x0086:
            r0 = move-exception
            goto L_0x00bb
        L_0x0088:
            r2 = move-exception
            r3 = r2
            r2 = r1
        L_0x008b:
            b.o.i2$k r4 = b.o.i2.k.ERROR     // Catch:{ all -> 0x00b9 }
            java.lang.String r5 = "Generating JSONArray from iam click ids:JSON Failed."
            b.o.i2.a(r4, r5, r3)     // Catch:{ all -> 0x00b9 }
            if (r2 == 0) goto L_0x009d
            boolean r3 = r2.isClosed()     // Catch:{ all -> 0x00c7 }
            if (r3 != 0) goto L_0x009d
        L_0x009a:
            r2.close()     // Catch:{ all -> 0x00c7 }
        L_0x009d:
            monitor-exit(r12)
            r11.f6304i = r0
            b.o.i2$k r12 = b.o.i2.k.DEBUG
            java.lang.String r0 = "redisplayedInAppMessages: "
            java.lang.StringBuilder r0 = b.e.a.a.a.y(r0)
            java.util.List<b.o.s0> r2 = r11.f6304i
            java.lang.String r2 = r2.toString()
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            b.o.i2.a(r12, r0, r1)
            return
        L_0x00b9:
            r0 = move-exception
            r1 = r2
        L_0x00bb:
            if (r1 == 0) goto L_0x00c6
            boolean r2 = r1.isClosed()     // Catch:{ all -> 0x00c7 }
            if (r2 != 0) goto L_0x00c6
            r1.close()     // Catch:{ all -> 0x00c7 }
        L_0x00c6:
            throw r0     // Catch:{ all -> 0x00c7 }
        L_0x00c7:
            r0 = move-exception
            monitor-exit(r12)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: b.o.u0.l(b.o.z2):void");
    }

    public void m() {
        i2.k kVar = i2.k.DEBUG;
        if (!this.d.isEmpty()) {
            StringBuilder y = b.e.a.a.a.y("initWithCachedInAppMessages with already in memory messages: ");
            y.append(this.d);
            i2.a(kVar, y.toString(), (Throwable) null);
            return;
        }
        String f2 = b3.f(b3.a, "PREFS_OS_CACHED_IAMS", (String) null);
        i2.a(kVar, "initWithCachedInAppMessages: " + f2, (Throwable) null);
        if (f2 != null && !f2.isEmpty()) {
            synchronized (f6299o) {
                try {
                    if (this.d.isEmpty()) {
                        t(new JSONArray(f2));
                    }
                } catch (JSONException e2) {
                    e2.printStackTrace();
                }
            }
        }
    }

    public boolean n() {
        return this.f6306k;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0075  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x005f A[LOOP:2: B:13:0x005f->B:36:0x005f, LOOP_END, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void o(java.lang.String r13) {
        /*
            r12 = this;
            b.o.i2$k r0 = b.o.i2.k.DEBUG
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "messageDynamicTriggerCompleted called with triggerId: "
            r1.append(r2)
            r1.append(r13)
            java.lang.String r1 = r1.toString()
            r2 = 0
            b.o.i2.a(r0, r1, r2)
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>()
            r1.add(r13)
            java.util.ArrayList<b.o.s0> r13 = r12.d
            java.util.Iterator r13 = r13.iterator()
        L_0x0025:
            boolean r3 = r13.hasNext()
            if (r3 == 0) goto L_0x00a5
            java.lang.Object r3 = r13.next()
            b.o.s0 r3 = (b.o.s0) r3
            boolean r4 = r3.f6275h
            if (r4 != 0) goto L_0x0025
            java.util.List<b.o.s0> r4 = r12.f6304i
            boolean r4 = r4.contains(r3)
            if (r4 == 0) goto L_0x0025
            b.o.e2 r4 = r12.a
            java.util.Objects.requireNonNull(r4)
            java.util.ArrayList<java.util.ArrayList<b.o.d2>> r4 = r3.c
            r5 = 0
            r6 = 1
            if (r4 != 0) goto L_0x0049
            goto L_0x008c
        L_0x0049:
            java.util.Iterator r4 = r1.iterator()
        L_0x004d:
            boolean r7 = r4.hasNext()
            if (r7 == 0) goto L_0x008c
            java.lang.Object r7 = r4.next()
            java.lang.String r7 = (java.lang.String) r7
            java.util.ArrayList<java.util.ArrayList<b.o.d2>> r8 = r3.c
            java.util.Iterator r8 = r8.iterator()
        L_0x005f:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L_0x004d
            java.lang.Object r9 = r8.next()
            java.util.ArrayList r9 = (java.util.ArrayList) r9
            java.util.Iterator r9 = r9.iterator()
        L_0x006f:
            boolean r10 = r9.hasNext()
            if (r10 == 0) goto L_0x005f
            java.lang.Object r10 = r9.next()
            b.o.d2 r10 = (b.o.d2) r10
            java.lang.String r11 = r10.c
            boolean r11 = r7.equals(r11)
            if (r11 != 0) goto L_0x008b
            java.lang.String r10 = r10.a
            boolean r10 = r7.equals(r10)
            if (r10 == 0) goto L_0x006f
        L_0x008b:
            r5 = r6
        L_0x008c:
            if (r5 == 0) goto L_0x0025
            java.lang.String r4 = "Trigger changed for message: "
            java.lang.StringBuilder r4 = b.e.a.a.a.y(r4)
            java.lang.String r5 = r3.toString()
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            b.o.i2.a(r0, r4, r2)
            r3.f6275h = r6
            goto L_0x0025
        L_0x00a5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: b.o.u0.o(java.lang.String):void");
    }

    public void p(@NonNull s0 s0Var) {
        q(s0Var, false);
    }

    public void q(@NonNull s0 s0Var, boolean z) {
        i2.k kVar = i2.k.DEBUG;
        if (!s0Var.f6278k) {
            this.f6301e.add(s0Var.a);
            if (!z) {
                b3.h(b3.a, "PREFS_OS_DISPLAYED_IAMS", this.f6301e);
                this.f6307l = new Date();
                f1 f1Var = s0Var.f6273e;
                f1Var.a = System.currentTimeMillis() / 1000;
                f1Var.f6088b++;
                s0Var.f6275h = false;
                s0Var.f6274g = true;
                new Thread(new a1(this, s0Var), "OS_SAVE_IN_APP_MESSAGE").start();
                int indexOf = this.f6304i.indexOf(s0Var);
                if (indexOf != -1) {
                    this.f6304i.set(indexOf, s0Var);
                } else {
                    this.f6304i.add(s0Var);
                }
                StringBuilder y = b.e.a.a.a.y("persistInAppMessageForRedisplay: ");
                y.append(s0Var.toString());
                y.append(" with msg array data: ");
                y.append(this.f6304i.toString());
                i2.a(kVar, y.toString(), (Throwable) null);
            }
            StringBuilder y2 = b.e.a.a.a.y("OSInAppMessageController messageWasDismissed dismissedMessages: ");
            y2.append(this.f6301e.toString());
            i2.a(kVar, y2.toString(), (Throwable) null);
        }
        g(s0Var);
    }

    /* JADX WARNING: type inference failed for: r6v0 */
    /* JADX WARNING: type inference failed for: r6v1, types: [java.lang.Throwable, b.o.i2$q] */
    /* JADX WARNING: type inference failed for: r6v18 */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x020d, code lost:
        if (r0 == false) goto L_0x0229;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x0227, code lost:
        if (r6.isClosed() == false) goto L_0x0229;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x0229, code lost:
        r6.close();
     */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x0223 A[SYNTHETIC, Splitter:B:131:0x0223] */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x024c  */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x024f  */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x025d  */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x0266 A[SYNTHETIC, Splitter:B:144:0x0266] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void r(@androidx.annotation.NonNull b.o.s0 r27, @androidx.annotation.NonNull org.json.JSONObject r28) {
        /*
            r26 = this;
            r1 = r26
            r2 = r27
            b.o.i2$k r3 = b.o.i2.k.ERROR
            b.o.t0 r4 = new b.o.t0
            r0 = r28
            r4.<init>(r0)
            boolean r0 = r2.f6276i
            r5 = 1
            if (r0 == 0) goto L_0x0014
            r0 = 0
            goto L_0x0017
        L_0x0014:
            r2.f6276i = r5
            r0 = r5
        L_0x0017:
            r4.f6288g = r0
            b.o.i2$g r0 = b.o.i2.H
            java.util.Objects.requireNonNull(r0)
            java.util.List<b.o.e1> r0 = r4.f6287e
            r1.f(r2, r0)
            r1.k(r4)
            java.lang.String r0 = x(r27)
            r6 = 0
            if (r0 != 0) goto L_0x002e
            goto L_0x0086
        L_0x002e:
            java.lang.String r7 = r4.a
            b.o.f1 r8 = r2.f6273e
            boolean r8 = r8.f6089e
            if (r8 == 0) goto L_0x0041
            java.util.Set<java.lang.String> r8 = r2.d
            boolean r8 = r8.contains(r7)
            r8 = r8 ^ r5
            if (r8 == 0) goto L_0x0041
            r8 = r5
            goto L_0x0042
        L_0x0041:
            r8 = 0
        L_0x0042:
            if (r8 != 0) goto L_0x004d
            java.util.Set<java.lang.String> r8 = r1.f6302g
            boolean r8 = r8.contains(r7)
            if (r8 == 0) goto L_0x004d
            goto L_0x0086
        L_0x004d:
            java.util.Set<java.lang.String> r8 = r1.f6302g
            r8.add(r7)
            java.util.Set<java.lang.String> r8 = r2.d
            r8.add(r7)
            b.o.y0 r8 = new b.o.y0     // Catch:{ JSONException -> 0x007d }
            r8.<init>(r1, r7, r0, r4)     // Catch:{ JSONException -> 0x007d }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ JSONException -> 0x007d }
            r0.<init>()     // Catch:{ JSONException -> 0x007d }
            java.lang.String r7 = "in_app_messages/"
            r0.append(r7)     // Catch:{ JSONException -> 0x007d }
            java.lang.String r7 = r2.a     // Catch:{ JSONException -> 0x007d }
            r0.append(r7)     // Catch:{ JSONException -> 0x007d }
            java.lang.String r7 = "/click"
            r0.append(r7)     // Catch:{ JSONException -> 0x007d }
            java.lang.String r0 = r0.toString()     // Catch:{ JSONException -> 0x007d }
            b.o.z0 r7 = new b.o.z0     // Catch:{ JSONException -> 0x007d }
            r7.<init>(r1, r4)     // Catch:{ JSONException -> 0x007d }
            b.l.f.x.a.g.a0(r0, r8, r7)     // Catch:{ JSONException -> 0x007d }
            goto L_0x0086
        L_0x007d:
            r0 = move-exception
            r0.printStackTrace()
            java.lang.String r0 = "Unable to execute in-app message action HTTP request due to invalid JSON"
            b.o.i2.a(r3, r0, r6)
        L_0x0086:
            b.o.h1 r0 = r4.f
            if (r0 == 0) goto L_0x00c0
            org.json.JSONObject r7 = r0.a
            if (r7 == 0) goto L_0x0091
            b.o.i2.D(r7, r6)
        L_0x0091:
            org.json.JSONArray r0 = r0.f6109b
            if (r0 == 0) goto L_0x00c0
            java.lang.String r7 = "deleteTags()"
            boolean r7 = b.o.i2.G(r7)
            if (r7 == 0) goto L_0x009e
            goto L_0x00c0
        L_0x009e:
            org.json.JSONObject r7 = new org.json.JSONObject     // Catch:{ all -> 0x00ba }
            r7.<init>()     // Catch:{ all -> 0x00ba }
            r8 = 0
        L_0x00a4:
            int r9 = r0.length()     // Catch:{ all -> 0x00ba }
            if (r8 >= r9) goto L_0x00b6
            java.lang.String r9 = r0.getString(r8)     // Catch:{ all -> 0x00ba }
            java.lang.String r10 = ""
            r7.put(r9, r10)     // Catch:{ all -> 0x00ba }
            int r8 = r8 + 1
            goto L_0x00a4
        L_0x00b6:
            b.o.i2.D(r7, r6)     // Catch:{ all -> 0x00ba }
            goto L_0x00c0
        L_0x00ba:
            r0 = move-exception
            java.lang.String r7 = "Failed to generate JSON for deleteTags."
            b.o.i2.a(r3, r7, r0)
        L_0x00c0:
            java.lang.String r0 = r2.a
            java.util.List<b.o.d1> r2 = r4.d
            b.o.y1 r4 = b.o.i2.v
            r4.c(r0)
            b.o.r1 r4 = b.o.i2.w
            if (r4 != 0) goto L_0x00d4
            java.lang.String r0 = "Make sure OneSignal.init is called first"
            b.o.i2.a(r3, r0, r6)
            goto L_0x02c1
        L_0x00d4:
            java.util.Iterator r2 = r2.iterator()
        L_0x00d8:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x02c1
            java.lang.Object r0 = r2.next()
            b.o.d1 r0 = (b.o.d1) r0
            java.lang.String r3 = r0.a
            boolean r7 = r0.c
            if (r7 == 0) goto L_0x029f
            b.o.y1 r0 = r4.c
            java.util.List r0 = r0.b()
            b.o.i2$k r7 = b.o.i2.k.DEBUG
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>(r0)
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            java.util.Iterator r0 = r0.iterator()
        L_0x00fd:
            boolean r9 = r0.hasNext()
            if (r9 == 0) goto L_0x012b
            java.lang.Object r9 = r0.next()
            b.o.u4.f.a r9 = (b.o.u4.f.a) r9
            b.o.u4.f.c r10 = r9.f6316b
            b.o.u4.f.c r11 = b.o.u4.f.c.DISABLED
            boolean r10 = r10.equals(r11)
            if (r10 == 0) goto L_0x00fd
            java.lang.String r10 = "Outcomes disabled for channel: "
            java.lang.StringBuilder r10 = b.e.a.a.a.y(r10)
            b.o.u4.f.b r11 = r9.a
            java.lang.String r11 = r11.f6321h
            r10.append(r11)
            java.lang.String r10 = r10.toString()
            b.o.i2.a(r7, r10, r6)
            r8.remove(r9)
            goto L_0x00fd
        L_0x012b:
            boolean r0 = r8.isEmpty()
            if (r0 == 0) goto L_0x0137
            java.lang.String r0 = "Unique Outcome disabled for current session"
            r28 = r2
            goto L_0x028f
        L_0x0137:
            java.util.Iterator r0 = r8.iterator()
        L_0x013b:
            boolean r9 = r0.hasNext()
            if (r9 == 0) goto L_0x0151
            java.lang.Object r9 = r0.next()
            b.o.u4.f.a r9 = (b.o.u4.f.a) r9
            b.o.u4.f.c r9 = r9.f6316b
            boolean r9 = r9.e()
            if (r9 == 0) goto L_0x013b
            r0 = r5
            goto L_0x0152
        L_0x0151:
            r0 = 0
        L_0x0152:
            if (r0 == 0) goto L_0x0273
            b.o.v4.c r0 = r4.f6266b
            b.o.v4.d r9 = r0.b()
            b.o.v4.a r10 = r9.f6333b
            monitor-enter(r10)
            java.util.ArrayList r11 = new java.util.ArrayList     // Catch:{ all -> 0x0270 }
            r11.<init>()     // Catch:{ all -> 0x0270 }
            java.util.Iterator r0 = r8.iterator()     // Catch:{ JSONException -> 0x0219, all -> 0x0216 }
        L_0x0166:
            boolean r12 = r0.hasNext()     // Catch:{ JSONException -> 0x0212 }
            if (r12 == 0) goto L_0x0205
            java.lang.Object r12 = r0.next()     // Catch:{ JSONException -> 0x0212 }
            b.o.u4.f.a r12 = (b.o.u4.f.a) r12     // Catch:{ JSONException -> 0x0212 }
            org.json.JSONArray r13 = new org.json.JSONArray     // Catch:{ JSONException -> 0x0212 }
            r13.<init>()     // Catch:{ JSONException -> 0x0212 }
            org.json.JSONArray r14 = r12.c     // Catch:{ JSONException -> 0x0212 }
            if (r14 != 0) goto L_0x0181
            r27 = r0
            r28 = r2
            goto L_0x01f5
        L_0x0181:
            r5 = 0
        L_0x0182:
            int r15 = r14.length()     // Catch:{ JSONException -> 0x0200 }
            if (r5 >= r15) goto L_0x01e0
            java.lang.String r15 = r14.getString(r5)     // Catch:{ JSONException -> 0x0200 }
            r27 = r0
            b.o.u4.f.b r0 = r12.a     // Catch:{ JSONException -> 0x0200 }
            r1 = 0
            java.lang.String[] r1 = new java.lang.String[r1]     // Catch:{ JSONException -> 0x01db }
            java.lang.String r19 = "channel_influence_id = ? AND channel_type = ? AND name = ?"
            r28 = r2
            r2 = 3
            java.lang.String[] r2 = new java.lang.String[r2]     // Catch:{ JSONException -> 0x01d9 }
            r16 = 0
            r2[r16] = r15     // Catch:{ JSONException -> 0x01d7 }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ JSONException -> 0x01d7 }
            r25 = 1
            r2[r25] = r0     // Catch:{ JSONException -> 0x01d3 }
            r0 = 2
            r2[r0] = r3     // Catch:{ JSONException -> 0x01d3 }
            b.o.y2 r0 = r10.f6331b     // Catch:{ JSONException -> 0x01d3 }
            java.lang.String r17 = "cached_unique_outcome"
            r21 = 0
            r22 = 0
            r23 = 0
            java.lang.String r24 = "1"
            r16 = r0
            b.o.z2 r16 = (b.o.z2) r16
            r18 = r1
            r20 = r2
            android.database.Cursor r6 = r16.Y(r17, r18, r19, r20, r21, r22, r23, r24)     // Catch:{ JSONException -> 0x01d3 }
            int r0 = r6.getCount()     // Catch:{ JSONException -> 0x01d3 }
            if (r0 != 0) goto L_0x01ca
            r13.put(r15)     // Catch:{ JSONException -> 0x01d3 }
        L_0x01ca:
            int r5 = r5 + 1
            r1 = r26
            r0 = r27
            r2 = r28
            goto L_0x0182
        L_0x01d3:
            r0 = move-exception
            r5 = r25
            goto L_0x021e
        L_0x01d7:
            r0 = move-exception
            goto L_0x01de
        L_0x01d9:
            r0 = move-exception
            goto L_0x0203
        L_0x01db:
            r0 = move-exception
            r28 = r2
        L_0x01de:
            r5 = 1
            goto L_0x021e
        L_0x01e0:
            r27 = r0
            r28 = r2
            r1 = 1
            int r0 = r13.length()     // Catch:{ JSONException -> 0x01fd }
            if (r0 <= 0) goto L_0x01f4
            b.o.u4.f.a r0 = r12.a()     // Catch:{ JSONException -> 0x01fd }
            r0.c = r13     // Catch:{ JSONException -> 0x01fd }
            r11.add(r0)     // Catch:{ JSONException -> 0x01fd }
        L_0x01f4:
            r5 = r1
        L_0x01f5:
            r1 = r26
            r0 = r27
            r2 = r28
            goto L_0x0166
        L_0x01fd:
            r0 = move-exception
        L_0x01fe:
            r5 = r1
            goto L_0x021e
        L_0x0200:
            r0 = move-exception
            r28 = r2
        L_0x0203:
            r1 = 1
            goto L_0x01fe
        L_0x0205:
            r28 = r2
            if (r6 == 0) goto L_0x022c
            boolean r0 = r6.isClosed()     // Catch:{ all -> 0x0270 }
            if (r0 != 0) goto L_0x022c
            goto L_0x0229
        L_0x0210:
            r0 = move-exception
            goto L_0x0263
        L_0x0212:
            r0 = move-exception
            r28 = r2
            goto L_0x021e
        L_0x0216:
            r0 = move-exception
            r1 = 0
            goto L_0x0264
        L_0x0219:
            r0 = move-exception
            r28 = r2
            r1 = 0
            r6 = r1
        L_0x021e:
            r0.printStackTrace()     // Catch:{ all -> 0x0210 }
            if (r6 == 0) goto L_0x022c
            boolean r0 = r6.isClosed()     // Catch:{ all -> 0x0270 }
            if (r0 != 0) goto L_0x022c
        L_0x0229:
            r6.close()     // Catch:{ all -> 0x0270 }
        L_0x022c:
            monitor-exit(r10)
            b.o.j1 r0 = r9.a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "OneSignal getNotCachedUniqueOutcome influences: "
            r1.append(r2)
            r1.append(r11)
            java.lang.String r1 = r1.toString()
            b.o.i1 r0 = (b.o.i1) r0
            r0.a(r1)
            int r0 = r11.size()
            if (r0 <= 0) goto L_0x024c
            goto L_0x024d
        L_0x024c:
            r11 = 0
        L_0x024d:
            if (r11 != 0) goto L_0x025d
            java.lang.String r0 = "Measure endpoint will not send because unique outcome already sent for: \nSessionInfluences: "
            java.lang.StringBuilder r0 = b.e.a.a.a.y(r0)
            java.lang.String r1 = r8.toString()
            r0.append(r1)
            goto L_0x0288
        L_0x025d:
            r0 = 0
            r6 = 0
            r4.b(r3, r0, r11, r6)
            goto L_0x02bb
        L_0x0263:
            r1 = r6
        L_0x0264:
            if (r1 == 0) goto L_0x026f
            boolean r2 = r1.isClosed()     // Catch:{ all -> 0x0270 }
            if (r2 != 0) goto L_0x026f
            r1.close()     // Catch:{ all -> 0x0270 }
        L_0x026f:
            throw r0     // Catch:{ all -> 0x0270 }
        L_0x0270:
            r0 = move-exception
            monitor-exit(r10)
            throw r0
        L_0x0273:
            r28 = r2
            java.util.Set<java.lang.String> r0 = r4.a
            boolean r0 = r0.contains(r3)
            if (r0 == 0) goto L_0x0293
            java.lang.String r0 = "Measure endpoint will not send because unique outcome already sent for: \nSession: "
            java.lang.StringBuilder r0 = b.e.a.a.a.y(r0)
            b.o.u4.f.c r1 = b.o.u4.f.c.UNATTRIBUTED
            r0.append(r1)
        L_0x0288:
            java.lang.String r1 = "\nOutcome name: "
            java.lang.String r0 = b.e.a.a.a.q(r0, r1, r3)
            r6 = 0
        L_0x028f:
            b.o.i2.a(r7, r0, r6)
            goto L_0x02bb
        L_0x0293:
            r0 = 0
            java.util.Set<java.lang.String> r1 = r4.a
            r1.add(r3)
            r1 = 0
            r4.b(r3, r1, r8, r0)
            r6 = r0
            goto L_0x02bb
        L_0x029f:
            r28 = r2
            r1 = 0
            float r0 = r0.f6061b
            int r2 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r2 <= 0) goto L_0x02b2
            b.o.y1 r1 = r4.c
            java.util.List r1 = r1.b()
            r4.b(r3, r0, r1, r6)
            goto L_0x02bb
        L_0x02b2:
            b.o.y1 r0 = r4.c
            java.util.List r0 = r0.b()
            r4.b(r3, r1, r0, r6)
        L_0x02bb:
            r1 = r26
            r2 = r28
            goto L_0x00d8
        L_0x02c1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: b.o.u0.r(b.o.s0, org.json.JSONObject):void");
    }

    public void s(@NonNull s0 s0Var, @NonNull JSONObject jSONObject) {
        boolean z;
        t0 t0Var = new t0(jSONObject);
        if (s0Var.f6276i) {
            z = false;
        } else {
            z = true;
            s0Var.f6276i = true;
        }
        t0Var.f6288g = z;
        Objects.requireNonNull(i2.H);
        f(s0Var, t0Var.f6287e);
        k(t0Var);
        i2.k kVar = i2.k.DEBUG;
        if (t0Var.f != null) {
            StringBuilder y = b.e.a.a.a.y("Tags detected inside of the action click payload, ignoring because action came from IAM preview:: ");
            y.append(t0Var.f.toString());
            i2.a(kVar, y.toString(), (Throwable) null);
        }
        if (t0Var.d.size() > 0) {
            StringBuilder y2 = b.e.a.a.a.y("Outcomes detected inside of the action click payload, ignoring because action came from IAM preview: ");
            y2.append(t0Var.d.toString());
            i2.a(kVar, y2.toString(), (Throwable) null);
        }
    }

    public final void t(@NonNull JSONArray jSONArray) {
        synchronized (f6299o) {
            ArrayList<s0> arrayList = new ArrayList<>();
            for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                arrayList.add(new s0(jSONArray.getJSONObject(i2)));
            }
            this.d = arrayList;
        }
        j();
    }

    public final void u(@NonNull s0 s0Var) {
        synchronized (this.f6303h) {
            if (!this.f6303h.contains(s0Var)) {
                this.f6303h.add(s0Var);
                i2.k kVar = i2.k.DEBUG;
                i2.a(kVar, "In app message with id, " + s0Var.a + ", added to the queue", (Throwable) null);
            }
            e();
        }
    }

    public void v(@NonNull JSONArray jSONArray) {
        b3.h(b3.a, "PREFS_OS_CACHED_IAMS", jSONArray.toString());
        for (s0 s0Var : this.f6304i) {
            s0Var.f6274g = false;
        }
        t(jSONArray);
    }

    public final void w(s0 s0Var, List<e1> list) {
        i2.k kVar = i2.k.DEBUG;
        Iterator<e1> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            e1 next = it.next();
            if (!next.a) {
                this.f6305j = next;
                break;
            }
        }
        if (this.f6305j != null) {
            StringBuilder y = b.e.a.a.a.y("IAM prompt to handle: ");
            y.append(this.f6305j.toString());
            i2.a(kVar, y.toString(), (Throwable) null);
            e1 e1Var = this.f6305j;
            e1Var.a = true;
            e1Var.b(new d(s0Var, list));
            return;
        }
        StringBuilder y2 = b.e.a.a.a.y("No IAM prompt to handle, dismiss message: ");
        y2.append(s0Var.a);
        i2.a(kVar, y2.toString(), (Throwable) null);
        p(s0Var);
    }
}
