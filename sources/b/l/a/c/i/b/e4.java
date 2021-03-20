package b.l.a.c.i.b;

import android.text.TextUtils;
import androidx.annotation.WorkerThread;
import androidx.collection.ArrayMap;
import b.l.a.c.b.a;
import b.l.a.c.f.i.a1;
import b.l.a.c.f.i.b1;
import b.l.a.c.f.i.c1;
import b.l.a.c.f.i.e1;
import b.l.a.c.f.i.y5;
import b.l.a.c.f.i.z0;
import java.util.Map;

public final class e4 extends u8 implements e {
    public final Map<String, Map<String, String>> d = new ArrayMap();

    /* renamed from: e  reason: collision with root package name */
    public final Map<String, Map<String, Boolean>> f3987e = new ArrayMap();
    public final Map<String, Map<String, Boolean>> f = new ArrayMap();

    /* renamed from: g  reason: collision with root package name */
    public final Map<String, c1> f3988g = new ArrayMap();

    /* renamed from: h  reason: collision with root package name */
    public final Map<String, Map<String, Integer>> f3989h = new ArrayMap();

    /* renamed from: i  reason: collision with root package name */
    public final Map<String, String> f3990i = new ArrayMap();

    public e4(d9 d9Var) {
        super(d9Var);
    }

    public static final Map<String, String> w(c1 c1Var) {
        ArrayMap arrayMap = new ArrayMap();
        for (e1 next : c1Var.w()) {
            arrayMap.put(next.s(), next.t());
        }
        return arrayMap;
    }

    @WorkerThread
    public final String b(String str, String str2) {
        h();
        t(str);
        Map map = this.d.get(str);
        if (map != null) {
            return (String) map.get(str2);
        }
        return null;
    }

    public final boolean k() {
        return false;
    }

    @WorkerThread
    public final c1 l(String str) {
        i();
        h();
        a.x(str);
        t(str);
        return this.f3988g.get(str);
    }

    @WorkerThread
    public final boolean m(String str) {
        h();
        c1 l2 = l(str);
        if (l2 == null) {
            return false;
        }
        return l2.A();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:100:0x0338, code lost:
        if (r13.s() == false) goto L_0x0343;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x033a, code lost:
        r3 = java.lang.Integer.valueOf(r13.t());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x0343, code lost:
        r3 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x0344, code lost:
        r12.put("filter_id", r3);
        r12.put("event_name", r13.u());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x0354, code lost:
        if (r13.C() == false) goto L_0x035f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x0356, code lost:
        r3 = java.lang.Boolean.valueOf(r13.D());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x035f, code lost:
        r3 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x0360, code lost:
        r12.put("session_scoped", r3);
        r12.put("data", r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x0372, code lost:
        if (r4.y().insertWithOnConflict(r6, (java.lang.String) null, r12, 5) != -1) goto L_0x0385;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x0374, code lost:
        r4.a.a().f.b("Failed to insert event filter (got -1). appId", b.l.a.c.i.b.k3.t(r28));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x0385, code lost:
        r3 = r20;
        r1 = r23;
        r12 = r25;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x038d, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:?, code lost:
        r1 = r4.a.a().f;
        r3 = "Error storing event filter. appId";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x039e, code lost:
        r0 = r0.u().iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x03aa, code lost:
        if (r0.hasNext() == false) goto L_0x04a0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x03ac, code lost:
        r1 = r0.next();
        r4.i();
        r4.h();
        b.l.a.c.b.a.x(r28);
        java.util.Objects.requireNonNull(r1, r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x03c6, code lost:
        if (android.text.TextUtils.isEmpty(r1.u()) == false) goto L_0x03f3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x03c8, code lost:
        r0 = r4.a.a().f4091i;
        r7 = b.l.a.c.i.b.k3.t(r28);
        r9 = java.lang.Integer.valueOf(r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x03de, code lost:
        if (r1.s() == false) goto L_0x03e9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x03e0, code lost:
        r1 = java.lang.Integer.valueOf(r1.t());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x03e9, code lost:
        r1 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x03ea, code lost:
        r0.d("Property filter had no property name. Audience definition ignored. appId, audienceId, filterId", r7, r9, java.lang.String.valueOf(r1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x03f3, code lost:
        r12 = r1.e();
        r13 = new android.content.ContentValues();
        r13.put(r3, r2);
        r25 = r0;
        r13.put("audience_id", java.lang.Integer.valueOf(r11));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x040c, code lost:
        if (r1.s() == false) goto L_0x0417;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x040e, code lost:
        r0 = java.lang.Integer.valueOf(r1.t());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x0417, code lost:
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x0418, code lost:
        r13.put("filter_id", r0);
        r26 = r3;
        r13.put("property_name", r1.u());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x042a, code lost:
        if (r1.y() == false) goto L_0x0435;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x042c, code lost:
        r0 = java.lang.Boolean.valueOf(r1.z());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x0435, code lost:
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x0436, code lost:
        r13.put("session_scoped", r0);
        r13.put("data", r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x0448, code lost:
        if (r4.y().insertWithOnConflict("property_filters", (java.lang.String) null, r13, 5) != -1) goto L_0x045c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x044a, code lost:
        r4.a.a().f.b("Failed to insert property filter (got -1). appId", b.l.a.c.i.b.k3.t(r28));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x045c, code lost:
        r0 = r25;
        r3 = r26;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x0462, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:?, code lost:
        r1 = r4.a.a().f;
        r3 = "Error storing property filter. appId";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x046f, code lost:
        r1.c(r3, b.l.a.c.i.b.k3.t(r28), r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x0472, code lost:
        r4.i();
        r4.h();
        b.l.a.c.b.a.x(r28);
        r0 = r4.y();
        r9 = r17;
        r0.delete("property_filters", r9, new java.lang.String[]{r2, java.lang.String.valueOf(r11)});
        r0.delete(r6, r9, new java.lang.String[]{r2, java.lang.String.valueOf(r11)});
        r17 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x04a0, code lost:
        r19 = r10;
        r3 = r20;
        r1 = r23;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:193:0x063a, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:?, code lost:
        r12 = r0.u().iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x0296, code lost:
        if (r12.hasNext() == false) goto L_0x02ba;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x02a2, code lost:
        if (r12.next().s() != false) goto L_0x0292;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x02a4, code lost:
        r0 = r4.a.a().f4091i;
        r7 = "Property filter with no ID. Audience definition ignored. appId, audienceId";
        r9 = b.l.a.c.i.b.k3.t(r28);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x02b3, code lost:
        r0.c(r7, r9, java.lang.Integer.valueOf(r11));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:?, code lost:
        r12 = r0.x().iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x02c6, code lost:
        r20 = r3;
        r3 = "app_id";
        r23 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x02d6, code lost:
        if (r12.hasNext() == false) goto L_0x039e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:?, code lost:
        r13 = r12.next();
        r4.i();
        r4.h();
        b.l.a.c.b.a.x(r28);
        java.util.Objects.requireNonNull(r13, r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x02f2, code lost:
        if (android.text.TextUtils.isEmpty(r13.u()) == false) goto L_0x031f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x02f4, code lost:
        r0 = r4.a.a().f4091i;
        r3 = b.l.a.c.i.b.k3.t(r28);
        r7 = java.lang.Integer.valueOf(r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x030a, code lost:
        if (r13.s() == false) goto L_0x0315;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x030c, code lost:
        r9 = java.lang.Integer.valueOf(r13.t());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x0315, code lost:
        r9 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x0316, code lost:
        r0.d("Event filter had no event name. Audience definition ignored. appId, audienceId, filterId", r3, r7, java.lang.String.valueOf(r9));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x031f, code lost:
        r1 = r13.e();
        r25 = r12;
        r12 = new android.content.ContentValues();
        r12.put(r3, r2);
        r12.put("audience_id", java.lang.Integer.valueOf(r11));
     */
    @androidx.annotation.WorkerThread
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean n(java.lang.String r28, byte[] r29, java.lang.String r30) {
        /*
            r27 = this;
            r1 = r27
            r2 = r28
            r27.i()
            r27.h()
            b.l.a.c.b.a.x(r28)
            b.l.a.c.f.i.c1 r0 = r27.v(r28, r29)
            b.l.a.c.f.i.m5 r0 = r0.n()
            r3 = r0
            b.l.a.c.f.i.b1 r3 = (b.l.a.c.f.i.b1) r3
            r1.u(r2, r3)
            java.util.Map<java.lang.String, b.l.a.c.f.i.c1> r0 = r1.f3988g
            b.l.a.c.f.i.p5 r4 = r3.g()
            b.l.a.c.f.i.c1 r4 = (b.l.a.c.f.i.c1) r4
            r0.put(r2, r4)
            java.util.Map<java.lang.String, java.lang.String> r0 = r1.f3990i
            r4 = r30
            r0.put(r2, r4)
            java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.String>> r0 = r1.d
            b.l.a.c.f.i.p5 r4 = r3.g()
            b.l.a.c.f.i.c1 r4 = (b.l.a.c.f.i.c1) r4
            java.util.Map r4 = w(r4)
            r0.put(r2, r4)
            b.l.a.c.i.b.d9 r0 = r1.f4305b
            b.l.a.c.i.b.j r4 = r0.L()
            java.util.ArrayList r5 = new java.util.ArrayList
            MessageType r0 = r3.f3654i
            b.l.a.c.f.i.c1 r0 = (b.l.a.c.f.i.c1) r0
            java.util.List r0 = r0.z()
            java.util.List r0 = java.util.Collections.unmodifiableList(r0)
            r5.<init>(r0)
            java.util.Objects.requireNonNull(r4)
            java.lang.String r6 = "app_id=? and audience_id=?"
            java.lang.String r0 = "app_id=?"
            java.lang.String r7 = "event_filters"
            java.lang.String r8 = "property_filters"
            java.lang.String r9 = "null reference"
            r11 = 0
        L_0x0061:
            int r12 = r5.size()
            if (r11 >= r12) goto L_0x01e5
            java.lang.Object r12 = r5.get(r11)
            b.l.a.c.f.i.i0 r12 = (b.l.a.c.f.i.i0) r12
            b.l.a.c.f.i.m5 r12 = r12.n()
            b.l.a.c.f.i.h0 r12 = (b.l.a.c.f.i.h0) r12
            MessageType r14 = r12.f3654i
            b.l.a.c.f.i.i0 r14 = (b.l.a.c.f.i.i0) r14
            int r14 = r14.y()
            if (r14 == 0) goto L_0x0167
            r14 = r12
            r15 = 0
        L_0x007f:
            MessageType r13 = r14.f3654i
            b.l.a.c.f.i.i0 r13 = (b.l.a.c.f.i.i0) r13
            int r13 = r13.y()
            if (r15 >= r13) goto L_0x015e
            MessageType r13 = r14.f3654i
            b.l.a.c.f.i.i0 r13 = (b.l.a.c.f.i.i0) r13
            b.l.a.c.f.i.k0 r13 = r13.z(r15)
            b.l.a.c.f.i.m5 r13 = r13.n()
            b.l.a.c.f.i.j0 r13 = (b.l.a.c.f.i.j0) r13
            b.l.a.c.f.i.m5 r16 = r13.clone()
            r10 = r16
            b.l.a.c.f.i.j0 r10 = (b.l.a.c.f.i.j0) r10
            MessageType r1 = r13.f3654i
            b.l.a.c.f.i.k0 r1 = (b.l.a.c.f.i.k0) r1
            java.lang.String r1 = r1.u()
            r16 = r3
            java.lang.String[] r3 = b.l.a.c.i.b.i5.a
            r17 = r6
            java.lang.String[] r6 = b.l.a.c.i.b.i5.c
            java.lang.String r1 = b.l.a.c.i.b.s6.c(r1, r3, r6)
            if (r1 == 0) goto L_0x00c8
            boolean r3 = r10.f3655j
            if (r3 == 0) goto L_0x00bf
            r10.j()
            r3 = 0
            r10.f3655j = r3
        L_0x00bf:
            MessageType r3 = r10.f3654i
            b.l.a.c.f.i.k0 r3 = (b.l.a.c.f.i.k0) r3
            b.l.a.c.f.i.k0.G(r3, r1)
            r1 = 1
            goto L_0x00c9
        L_0x00c8:
            r1 = 0
        L_0x00c9:
            r3 = 0
        L_0x00ca:
            MessageType r6 = r13.f3654i
            b.l.a.c.f.i.k0 r6 = (b.l.a.c.f.i.k0) r6
            int r6 = r6.w()
            if (r3 >= r6) goto L_0x0129
            MessageType r6 = r13.f3654i
            b.l.a.c.f.i.k0 r6 = (b.l.a.c.f.i.k0) r6
            b.l.a.c.f.i.m0 r6 = r6.x(r3)
            r18 = r13
            java.lang.String r13 = r6.z()
            r19 = r9
            java.lang.String[] r9 = b.l.a.c.i.b.j5.a
            r20 = r7
            java.lang.String[] r7 = b.l.a.c.i.b.j5.f4075b
            java.lang.String r7 = b.l.a.c.i.b.s6.c(r13, r9, r7)
            if (r7 == 0) goto L_0x0120
            b.l.a.c.f.i.m5 r1 = r6.n()
            b.l.a.c.f.i.l0 r1 = (b.l.a.c.f.i.l0) r1
            boolean r6 = r1.f3655j
            if (r6 == 0) goto L_0x0101
            r1.j()
            r6 = 0
            r1.f3655j = r6
            goto L_0x0102
        L_0x0101:
            r6 = 0
        L_0x0102:
            MessageType r9 = r1.f3654i
            b.l.a.c.f.i.m0 r9 = (b.l.a.c.f.i.m0) r9
            b.l.a.c.f.i.m0.C(r9, r7)
            b.l.a.c.f.i.p5 r1 = r1.g()
            b.l.a.c.f.i.m0 r1 = (b.l.a.c.f.i.m0) r1
            boolean r7 = r10.f3655j
            if (r7 == 0) goto L_0x0118
            r10.j()
            r10.f3655j = r6
        L_0x0118:
            MessageType r6 = r10.f3654i
            b.l.a.c.f.i.k0 r6 = (b.l.a.c.f.i.k0) r6
            b.l.a.c.f.i.k0.H(r6, r3, r1)
            r1 = 1
        L_0x0120:
            int r3 = r3 + 1
            r13 = r18
            r9 = r19
            r7 = r20
            goto L_0x00ca
        L_0x0129:
            r20 = r7
            r19 = r9
            if (r1 == 0) goto L_0x0150
            boolean r1 = r14.f3655j
            if (r1 == 0) goto L_0x0139
            r14.j()
            r1 = 0
            r14.f3655j = r1
        L_0x0139:
            MessageType r1 = r14.f3654i
            b.l.a.c.f.i.i0 r1 = (b.l.a.c.f.i.i0) r1
            b.l.a.c.f.i.p5 r3 = r10.g()
            b.l.a.c.f.i.k0 r3 = (b.l.a.c.f.i.k0) r3
            b.l.a.c.f.i.i0.C(r1, r15, r3)
            b.l.a.c.f.i.p5 r1 = r12.g()
            b.l.a.c.f.i.i0 r1 = (b.l.a.c.f.i.i0) r1
            r5.set(r11, r1)
            r14 = r12
        L_0x0150:
            int r15 = r15 + 1
            r1 = r27
            r3 = r16
            r6 = r17
            r9 = r19
            r7 = r20
            goto L_0x007f
        L_0x015e:
            r16 = r3
            r17 = r6
            r20 = r7
            r19 = r9
            goto L_0x0170
        L_0x0167:
            r16 = r3
            r17 = r6
            r20 = r7
            r19 = r9
            r14 = r12
        L_0x0170:
            MessageType r1 = r14.f3654i
            b.l.a.c.f.i.i0 r1 = (b.l.a.c.f.i.i0) r1
            int r1 = r1.v()
            if (r1 == 0) goto L_0x01d7
            r1 = 0
        L_0x017b:
            MessageType r3 = r14.f3654i
            b.l.a.c.f.i.i0 r3 = (b.l.a.c.f.i.i0) r3
            int r3 = r3.v()
            if (r1 >= r3) goto L_0x01d7
            MessageType r3 = r14.f3654i
            b.l.a.c.f.i.i0 r3 = (b.l.a.c.f.i.i0) r3
            b.l.a.c.f.i.t0 r3 = r3.w(r1)
            java.lang.String r6 = r3.u()
            java.lang.String[] r7 = b.l.a.c.i.b.k5.a
            java.lang.String[] r9 = b.l.a.c.i.b.k5.f4099b
            java.lang.String r6 = b.l.a.c.i.b.s6.c(r6, r7, r9)
            if (r6 == 0) goto L_0x01d4
            b.l.a.c.f.i.m5 r3 = r3.n()
            b.l.a.c.f.i.s0 r3 = (b.l.a.c.f.i.s0) r3
            boolean r7 = r3.f3655j
            if (r7 == 0) goto L_0x01ac
            r3.j()
            r7 = 0
            r3.f3655j = r7
            goto L_0x01ad
        L_0x01ac:
            r7 = 0
        L_0x01ad:
            MessageType r9 = r3.f3654i
            b.l.a.c.f.i.t0 r9 = (b.l.a.c.f.i.t0) r9
            b.l.a.c.f.i.t0.C(r9, r6)
            boolean r6 = r14.f3655j
            if (r6 == 0) goto L_0x01bd
            r14.j()
            r14.f3655j = r7
        L_0x01bd:
            MessageType r6 = r14.f3654i
            b.l.a.c.f.i.i0 r6 = (b.l.a.c.f.i.i0) r6
            b.l.a.c.f.i.p5 r3 = r3.g()
            b.l.a.c.f.i.t0 r3 = (b.l.a.c.f.i.t0) r3
            b.l.a.c.f.i.i0.B(r6, r1, r3)
            b.l.a.c.f.i.p5 r3 = r12.g()
            b.l.a.c.f.i.i0 r3 = (b.l.a.c.f.i.i0) r3
            r5.set(r11, r3)
            r14 = r12
        L_0x01d4:
            int r1 = r1 + 1
            goto L_0x017b
        L_0x01d7:
            int r11 = r11 + 1
            r1 = r27
            r3 = r16
            r6 = r17
            r9 = r19
            r7 = r20
            goto L_0x0061
        L_0x01e5:
            r16 = r3
            r17 = r6
            r20 = r7
            r19 = r9
            r4.i()
            r4.h()
            b.l.a.c.b.a.x(r28)
            android.database.sqlite.SQLiteDatabase r1 = r4.y()
            r1.beginTransaction()
            r4.i()     // Catch:{ all -> 0x0252 }
            r4.h()     // Catch:{ all -> 0x0252 }
            b.l.a.c.b.a.x(r28)     // Catch:{ all -> 0x0252 }
            android.database.sqlite.SQLiteDatabase r3 = r4.y()     // Catch:{ all -> 0x0252 }
            r6 = 1
            java.lang.String[] r7 = new java.lang.String[r6]     // Catch:{ all -> 0x0252 }
            r9 = 0
            r7[r9] = r2     // Catch:{ all -> 0x0252 }
            r3.delete(r8, r0, r7)     // Catch:{ all -> 0x0252 }
            java.lang.String[] r7 = new java.lang.String[r6]     // Catch:{ all -> 0x0252 }
            r7[r9] = r2     // Catch:{ all -> 0x0252 }
            r6 = r20
            r3.delete(r6, r0, r7)     // Catch:{ all -> 0x0252 }
            java.util.Iterator r3 = r5.iterator()     // Catch:{ all -> 0x0252 }
        L_0x0220:
            boolean r0 = r3.hasNext()     // Catch:{ all -> 0x0252 }
            if (r0 == 0) goto L_0x04ad
            java.lang.Object r0 = r3.next()     // Catch:{ all -> 0x04a8 }
            b.l.a.c.f.i.i0 r0 = (b.l.a.c.f.i.i0) r0     // Catch:{ all -> 0x04a8 }
            r4.i()     // Catch:{ all -> 0x04a8 }
            r4.h()     // Catch:{ all -> 0x04a8 }
            b.l.a.c.b.a.x(r28)     // Catch:{ all -> 0x04a8 }
            r10 = r19
            java.util.Objects.requireNonNull(r0, r10)     // Catch:{ all -> 0x04a8 }
            boolean r11 = r0.s()     // Catch:{ all -> 0x04a8 }
            if (r11 != 0) goto L_0x0259
            b.l.a.c.i.b.l4 r0 = r4.a     // Catch:{ all -> 0x0252 }
            b.l.a.c.i.b.k3 r0 = r0.a()     // Catch:{ all -> 0x0252 }
            b.l.a.c.i.b.i3 r0 = r0.f4091i     // Catch:{ all -> 0x0252 }
            java.lang.String r7 = "Audience with no ID. appId"
            java.lang.Object r9 = b.l.a.c.i.b.k3.t(r28)     // Catch:{ all -> 0x0252 }
            r0.b(r7, r9)     // Catch:{ all -> 0x0252 }
            goto L_0x02b6
        L_0x0252:
            r0 = move-exception
            r3 = r27
            r23 = r1
            goto L_0x063d
        L_0x0259:
            int r11 = r0.t()     // Catch:{ all -> 0x04a8 }
            java.util.List r12 = r0.x()     // Catch:{ all -> 0x04a8 }
            java.util.Iterator r12 = r12.iterator()     // Catch:{ all -> 0x04a8 }
        L_0x0265:
            boolean r13 = r12.hasNext()     // Catch:{ all -> 0x04a8 }
            if (r13 == 0) goto L_0x028a
            java.lang.Object r13 = r12.next()     // Catch:{ all -> 0x0252 }
            b.l.a.c.f.i.k0 r13 = (b.l.a.c.f.i.k0) r13     // Catch:{ all -> 0x0252 }
            boolean r13 = r13.s()     // Catch:{ all -> 0x0252 }
            if (r13 != 0) goto L_0x0265
            b.l.a.c.i.b.l4 r0 = r4.a     // Catch:{ all -> 0x0252 }
            b.l.a.c.i.b.k3 r0 = r0.a()     // Catch:{ all -> 0x0252 }
            b.l.a.c.i.b.i3 r0 = r0.f4091i     // Catch:{ all -> 0x0252 }
            java.lang.String r7 = "Event filter with no ID. Audience definition ignored. appId, audienceId"
            java.lang.Object r9 = b.l.a.c.i.b.k3.t(r28)     // Catch:{ all -> 0x0252 }
        L_0x0285:
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)     // Catch:{ all -> 0x0252 }
            goto L_0x02b3
        L_0x028a:
            java.util.List r12 = r0.u()     // Catch:{ all -> 0x04a8 }
            java.util.Iterator r12 = r12.iterator()     // Catch:{ all -> 0x04a8 }
        L_0x0292:
            boolean r13 = r12.hasNext()     // Catch:{ all -> 0x04a8 }
            if (r13 == 0) goto L_0x02ba
            java.lang.Object r13 = r12.next()     // Catch:{ all -> 0x0252 }
            b.l.a.c.f.i.t0 r13 = (b.l.a.c.f.i.t0) r13     // Catch:{ all -> 0x0252 }
            boolean r13 = r13.s()     // Catch:{ all -> 0x0252 }
            if (r13 != 0) goto L_0x0292
            b.l.a.c.i.b.l4 r0 = r4.a     // Catch:{ all -> 0x0252 }
            b.l.a.c.i.b.k3 r0 = r0.a()     // Catch:{ all -> 0x0252 }
            b.l.a.c.i.b.i3 r0 = r0.f4091i     // Catch:{ all -> 0x0252 }
            java.lang.String r7 = "Property filter with no ID. Audience definition ignored. appId, audienceId"
            java.lang.Object r9 = b.l.a.c.i.b.k3.t(r28)     // Catch:{ all -> 0x0252 }
            goto L_0x0285
        L_0x02b3:
            r0.c(r7, r9, r11)     // Catch:{ all -> 0x0252 }
        L_0x02b6:
            r19 = r10
            goto L_0x0220
        L_0x02ba:
            java.util.List r12 = r0.x()     // Catch:{ all -> 0x04a8 }
            java.util.Iterator r12 = r12.iterator()     // Catch:{ all -> 0x04a8 }
        L_0x02c2:
            boolean r13 = r12.hasNext()     // Catch:{ all -> 0x04a8 }
            java.lang.String r14 = "data"
            java.lang.String r15 = "session_scoped"
            java.lang.String r7 = "filter_id"
            java.lang.String r9 = "audience_id"
            r20 = r3
            java.lang.String r3 = "app_id"
            r21 = -1
            r23 = r1
            if (r13 == 0) goto L_0x039e
            java.lang.Object r13 = r12.next()     // Catch:{ all -> 0x063a }
            b.l.a.c.f.i.k0 r13 = (b.l.a.c.f.i.k0) r13     // Catch:{ all -> 0x063a }
            r4.i()     // Catch:{ all -> 0x063a }
            r4.h()     // Catch:{ all -> 0x063a }
            b.l.a.c.b.a.x(r28)     // Catch:{ all -> 0x063a }
            java.util.Objects.requireNonNull(r13, r10)     // Catch:{ all -> 0x063a }
            java.lang.String r24 = r13.u()     // Catch:{ all -> 0x063a }
            boolean r24 = android.text.TextUtils.isEmpty(r24)     // Catch:{ all -> 0x063a }
            if (r24 == 0) goto L_0x031f
            b.l.a.c.i.b.l4 r0 = r4.a     // Catch:{ all -> 0x063a }
            b.l.a.c.i.b.k3 r0 = r0.a()     // Catch:{ all -> 0x063a }
            b.l.a.c.i.b.i3 r0 = r0.f4091i     // Catch:{ all -> 0x063a }
            java.lang.String r1 = "Event filter had no event name. Audience definition ignored. appId, audienceId, filterId"
            java.lang.Object r3 = b.l.a.c.i.b.k3.t(r28)     // Catch:{ all -> 0x063a }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r11)     // Catch:{ all -> 0x063a }
            boolean r9 = r13.s()     // Catch:{ all -> 0x063a }
            if (r9 == 0) goto L_0x0315
            int r9 = r13.t()     // Catch:{ all -> 0x063a }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch:{ all -> 0x063a }
            goto L_0x0316
        L_0x0315:
            r9 = 0
        L_0x0316:
            java.lang.String r9 = java.lang.String.valueOf(r9)     // Catch:{ all -> 0x063a }
            r0.d(r1, r3, r7, r9)     // Catch:{ all -> 0x063a }
            goto L_0x0472
        L_0x031f:
            byte[] r1 = r13.e()     // Catch:{ all -> 0x063a }
            r25 = r12
            android.content.ContentValues r12 = new android.content.ContentValues     // Catch:{ all -> 0x063a }
            r12.<init>()     // Catch:{ all -> 0x063a }
            r12.put(r3, r2)     // Catch:{ all -> 0x063a }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r11)     // Catch:{ all -> 0x063a }
            r12.put(r9, r3)     // Catch:{ all -> 0x063a }
            boolean r3 = r13.s()     // Catch:{ all -> 0x063a }
            if (r3 == 0) goto L_0x0343
            int r3 = r13.t()     // Catch:{ all -> 0x063a }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x063a }
            goto L_0x0344
        L_0x0343:
            r3 = 0
        L_0x0344:
            r12.put(r7, r3)     // Catch:{ all -> 0x063a }
            java.lang.String r3 = "event_name"
            java.lang.String r7 = r13.u()     // Catch:{ all -> 0x063a }
            r12.put(r3, r7)     // Catch:{ all -> 0x063a }
            boolean r3 = r13.C()     // Catch:{ all -> 0x063a }
            if (r3 == 0) goto L_0x035f
            boolean r3 = r13.D()     // Catch:{ all -> 0x063a }
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)     // Catch:{ all -> 0x063a }
            goto L_0x0360
        L_0x035f:
            r3 = 0
        L_0x0360:
            r12.put(r15, r3)     // Catch:{ all -> 0x063a }
            r12.put(r14, r1)     // Catch:{ all -> 0x063a }
            android.database.sqlite.SQLiteDatabase r1 = r4.y()     // Catch:{ SQLiteException -> 0x038d }
            r3 = 5
            r7 = 0
            long r12 = r1.insertWithOnConflict(r6, r7, r12, r3)     // Catch:{ SQLiteException -> 0x038d }
            int r1 = (r12 > r21 ? 1 : (r12 == r21 ? 0 : -1))
            if (r1 != 0) goto L_0x0385
            b.l.a.c.i.b.l4 r1 = r4.a     // Catch:{ SQLiteException -> 0x038d }
            b.l.a.c.i.b.k3 r1 = r1.a()     // Catch:{ SQLiteException -> 0x038d }
            b.l.a.c.i.b.i3 r1 = r1.f     // Catch:{ SQLiteException -> 0x038d }
            java.lang.String r3 = "Failed to insert event filter (got -1). appId"
            java.lang.Object r7 = b.l.a.c.i.b.k3.t(r28)     // Catch:{ SQLiteException -> 0x038d }
            r1.b(r3, r7)     // Catch:{ SQLiteException -> 0x038d }
        L_0x0385:
            r3 = r20
            r1 = r23
            r12 = r25
            goto L_0x02c2
        L_0x038d:
            r0 = move-exception
            b.l.a.c.i.b.l4 r1 = r4.a     // Catch:{ all -> 0x063a }
            b.l.a.c.i.b.k3 r1 = r1.a()     // Catch:{ all -> 0x063a }
            b.l.a.c.i.b.i3 r1 = r1.f     // Catch:{ all -> 0x063a }
            java.lang.String r3 = "Error storing event filter. appId"
        L_0x0398:
            java.lang.Object r7 = b.l.a.c.i.b.k3.t(r28)     // Catch:{ all -> 0x063a }
            goto L_0x046f
        L_0x039e:
            java.util.List r0 = r0.u()     // Catch:{ all -> 0x063a }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x063a }
        L_0x03a6:
            boolean r1 = r0.hasNext()     // Catch:{ all -> 0x063a }
            if (r1 == 0) goto L_0x04a0
            java.lang.Object r1 = r0.next()     // Catch:{ all -> 0x063a }
            b.l.a.c.f.i.t0 r1 = (b.l.a.c.f.i.t0) r1     // Catch:{ all -> 0x063a }
            r4.i()     // Catch:{ all -> 0x063a }
            r4.h()     // Catch:{ all -> 0x063a }
            b.l.a.c.b.a.x(r28)     // Catch:{ all -> 0x063a }
            java.util.Objects.requireNonNull(r1, r10)     // Catch:{ all -> 0x063a }
            java.lang.String r12 = r1.u()     // Catch:{ all -> 0x063a }
            boolean r12 = android.text.TextUtils.isEmpty(r12)     // Catch:{ all -> 0x063a }
            if (r12 == 0) goto L_0x03f3
            b.l.a.c.i.b.l4 r0 = r4.a     // Catch:{ all -> 0x063a }
            b.l.a.c.i.b.k3 r0 = r0.a()     // Catch:{ all -> 0x063a }
            b.l.a.c.i.b.i3 r0 = r0.f4091i     // Catch:{ all -> 0x063a }
            java.lang.String r3 = "Property filter had no property name. Audience definition ignored. appId, audienceId, filterId"
            java.lang.Object r7 = b.l.a.c.i.b.k3.t(r28)     // Catch:{ all -> 0x063a }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r11)     // Catch:{ all -> 0x063a }
            boolean r12 = r1.s()     // Catch:{ all -> 0x063a }
            if (r12 == 0) goto L_0x03e9
            int r1 = r1.t()     // Catch:{ all -> 0x063a }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ all -> 0x063a }
            goto L_0x03ea
        L_0x03e9:
            r1 = 0
        L_0x03ea:
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch:{ all -> 0x063a }
            r0.d(r3, r7, r9, r1)     // Catch:{ all -> 0x063a }
            goto L_0x0472
        L_0x03f3:
            byte[] r12 = r1.e()     // Catch:{ all -> 0x063a }
            android.content.ContentValues r13 = new android.content.ContentValues     // Catch:{ all -> 0x063a }
            r13.<init>()     // Catch:{ all -> 0x063a }
            r13.put(r3, r2)     // Catch:{ all -> 0x063a }
            r25 = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r11)     // Catch:{ all -> 0x063a }
            r13.put(r9, r0)     // Catch:{ all -> 0x063a }
            boolean r0 = r1.s()     // Catch:{ all -> 0x063a }
            if (r0 == 0) goto L_0x0417
            int r0 = r1.t()     // Catch:{ all -> 0x063a }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x063a }
            goto L_0x0418
        L_0x0417:
            r0 = 0
        L_0x0418:
            r13.put(r7, r0)     // Catch:{ all -> 0x063a }
            java.lang.String r0 = "property_name"
            r26 = r3
            java.lang.String r3 = r1.u()     // Catch:{ all -> 0x063a }
            r13.put(r0, r3)     // Catch:{ all -> 0x063a }
            boolean r0 = r1.y()     // Catch:{ all -> 0x063a }
            if (r0 == 0) goto L_0x0435
            boolean r0 = r1.z()     // Catch:{ all -> 0x063a }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ all -> 0x063a }
            goto L_0x0436
        L_0x0435:
            r0 = 0
        L_0x0436:
            r13.put(r15, r0)     // Catch:{ all -> 0x063a }
            r13.put(r14, r12)     // Catch:{ all -> 0x063a }
            android.database.sqlite.SQLiteDatabase r0 = r4.y()     // Catch:{ SQLiteException -> 0x0462 }
            r1 = 0
            r3 = 5
            long r12 = r0.insertWithOnConflict(r8, r1, r13, r3)     // Catch:{ SQLiteException -> 0x0462 }
            int r0 = (r12 > r21 ? 1 : (r12 == r21 ? 0 : -1))
            if (r0 != 0) goto L_0x045c
            b.l.a.c.i.b.l4 r0 = r4.a     // Catch:{ SQLiteException -> 0x0462 }
            b.l.a.c.i.b.k3 r0 = r0.a()     // Catch:{ SQLiteException -> 0x0462 }
            b.l.a.c.i.b.i3 r0 = r0.f     // Catch:{ SQLiteException -> 0x0462 }
            java.lang.String r1 = "Failed to insert property filter (got -1). appId"
            java.lang.Object r3 = b.l.a.c.i.b.k3.t(r28)     // Catch:{ SQLiteException -> 0x0462 }
            r0.b(r1, r3)     // Catch:{ SQLiteException -> 0x0462 }
            goto L_0x0472
        L_0x045c:
            r0 = r25
            r3 = r26
            goto L_0x03a6
        L_0x0462:
            r0 = move-exception
            b.l.a.c.i.b.l4 r1 = r4.a     // Catch:{ all -> 0x063a }
            b.l.a.c.i.b.k3 r1 = r1.a()     // Catch:{ all -> 0x063a }
            b.l.a.c.i.b.i3 r1 = r1.f     // Catch:{ all -> 0x063a }
            java.lang.String r3 = "Error storing property filter. appId"
            goto L_0x0398
        L_0x046f:
            r1.c(r3, r7, r0)     // Catch:{ all -> 0x063a }
        L_0x0472:
            r4.i()     // Catch:{ all -> 0x063a }
            r4.h()     // Catch:{ all -> 0x063a }
            b.l.a.c.b.a.x(r28)     // Catch:{ all -> 0x063a }
            android.database.sqlite.SQLiteDatabase r0 = r4.y()     // Catch:{ all -> 0x063a }
            r1 = 2
            java.lang.String[] r3 = new java.lang.String[r1]     // Catch:{ all -> 0x063a }
            r7 = 0
            r3[r7] = r2     // Catch:{ all -> 0x063a }
            java.lang.String r9 = java.lang.String.valueOf(r11)     // Catch:{ all -> 0x063a }
            r12 = 1
            r3[r12] = r9     // Catch:{ all -> 0x063a }
            r9 = r17
            r0.delete(r8, r9, r3)     // Catch:{ all -> 0x063a }
            java.lang.String[] r1 = new java.lang.String[r1]     // Catch:{ all -> 0x063a }
            r1[r7] = r2     // Catch:{ all -> 0x063a }
            java.lang.String r3 = java.lang.String.valueOf(r11)     // Catch:{ all -> 0x063a }
            r1[r12] = r3     // Catch:{ all -> 0x063a }
            r0.delete(r6, r9, r1)     // Catch:{ all -> 0x063a }
            r17 = r9
        L_0x04a0:
            r19 = r10
            r3 = r20
            r1 = r23
            goto L_0x0220
        L_0x04a8:
            r0 = move-exception
            r23 = r1
            goto L_0x063b
        L_0x04ad:
            r23 = r1
            r1 = 0
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ all -> 0x063a }
            r0.<init>()     // Catch:{ all -> 0x063a }
            java.util.Iterator r3 = r5.iterator()     // Catch:{ all -> 0x063a }
        L_0x04b9:
            boolean r5 = r3.hasNext()     // Catch:{ all -> 0x063a }
            if (r5 == 0) goto L_0x04d9
            java.lang.Object r5 = r3.next()     // Catch:{ all -> 0x063a }
            b.l.a.c.f.i.i0 r5 = (b.l.a.c.f.i.i0) r5     // Catch:{ all -> 0x063a }
            boolean r6 = r5.s()     // Catch:{ all -> 0x063a }
            if (r6 == 0) goto L_0x04d4
            int r5 = r5.t()     // Catch:{ all -> 0x063a }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x063a }
            goto L_0x04d5
        L_0x04d4:
            r7 = r1
        L_0x04d5:
            r0.add(r7)     // Catch:{ all -> 0x063a }
            goto L_0x04b9
        L_0x04d9:
            b.l.a.c.b.a.x(r28)     // Catch:{ all -> 0x063a }
            r4.i()     // Catch:{ all -> 0x063a }
            r4.h()     // Catch:{ all -> 0x063a }
            android.database.sqlite.SQLiteDatabase r1 = r4.y()     // Catch:{ all -> 0x063a }
            r3 = 1
            java.lang.String[] r5 = new java.lang.String[r3]     // Catch:{ SQLiteException -> 0x0589 }
            r3 = 0
            r5[r3] = r2     // Catch:{ SQLiteException -> 0x0589 }
            java.lang.String r3 = "select count(1) from audience_filter_values where app_id=?"
            long r5 = r4.t(r3, r5)     // Catch:{ SQLiteException -> 0x0589 }
            b.l.a.c.i.b.l4 r3 = r4.a     // Catch:{ all -> 0x063a }
            b.l.a.c.i.b.f r3 = r3.f4114g     // Catch:{ all -> 0x063a }
            r4 = 2000(0x7d0, float:2.803E-42)
            b.l.a.c.i.b.w2<java.lang.Integer> r7 = b.l.a.c.i.b.x2.F     // Catch:{ all -> 0x063a }
            int r3 = r3.p(r2, r7)     // Catch:{ all -> 0x063a }
            int r3 = java.lang.Math.min(r4, r3)     // Catch:{ all -> 0x063a }
            r4 = 0
            int r3 = java.lang.Math.max(r4, r3)     // Catch:{ all -> 0x063a }
            long r7 = (long) r3     // Catch:{ all -> 0x063a }
            int r4 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r4 > 0) goto L_0x050e
            goto L_0x059b
        L_0x050e:
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ all -> 0x063a }
            r4.<init>()     // Catch:{ all -> 0x063a }
            r5 = 0
        L_0x0514:
            int r6 = r0.size()     // Catch:{ all -> 0x063a }
            if (r5 >= r6) goto L_0x0530
            java.lang.Object r6 = r0.get(r5)     // Catch:{ all -> 0x063a }
            java.lang.Integer r6 = (java.lang.Integer) r6     // Catch:{ all -> 0x063a }
            if (r6 == 0) goto L_0x059b
            int r6 = r6.intValue()     // Catch:{ all -> 0x063a }
            java.lang.String r6 = java.lang.Integer.toString(r6)     // Catch:{ all -> 0x063a }
            r4.add(r6)     // Catch:{ all -> 0x063a }
            int r5 = r5 + 1
            goto L_0x0514
        L_0x0530:
            java.lang.String r0 = ","
            java.lang.String r0 = android.text.TextUtils.join(r0, r4)     // Catch:{ all -> 0x063a }
            java.lang.String r4 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x063a }
            int r4 = r4.length()     // Catch:{ all -> 0x063a }
            r5 = 2
            int r4 = r4 + r5
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x063a }
            r5.<init>(r4)     // Catch:{ all -> 0x063a }
            java.lang.String r4 = "("
            r5.append(r4)     // Catch:{ all -> 0x063a }
            r5.append(r0)     // Catch:{ all -> 0x063a }
            java.lang.String r0 = ")"
            r5.append(r0)     // Catch:{ all -> 0x063a }
            java.lang.String r0 = r5.toString()     // Catch:{ all -> 0x063a }
            java.lang.String r4 = "audience_filter_values"
            java.lang.String r5 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x063a }
            int r5 = r5.length()     // Catch:{ all -> 0x063a }
            int r5 = r5 + 140
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x063a }
            r6.<init>(r5)     // Catch:{ all -> 0x063a }
            java.lang.String r5 = "audience_id in (select audience_id from audience_filter_values where app_id=? and audience_id not in "
            r6.append(r5)     // Catch:{ all -> 0x063a }
            r6.append(r0)     // Catch:{ all -> 0x063a }
            java.lang.String r0 = " order by rowid desc limit -1 offset ?)"
            r6.append(r0)     // Catch:{ all -> 0x063a }
            java.lang.String r0 = r6.toString()     // Catch:{ all -> 0x063a }
            r5 = 2
            java.lang.String[] r5 = new java.lang.String[r5]     // Catch:{ all -> 0x063a }
            r6 = 0
            r5[r6] = r2     // Catch:{ all -> 0x063a }
            java.lang.String r3 = java.lang.Integer.toString(r3)     // Catch:{ all -> 0x063a }
            r6 = 1
            r5[r6] = r3     // Catch:{ all -> 0x063a }
            r1.delete(r4, r0, r5)     // Catch:{ all -> 0x063a }
            goto L_0x059b
        L_0x0589:
            r0 = move-exception
            b.l.a.c.i.b.l4 r1 = r4.a     // Catch:{ all -> 0x063a }
            b.l.a.c.i.b.k3 r1 = r1.a()     // Catch:{ all -> 0x063a }
            b.l.a.c.i.b.i3 r1 = r1.f     // Catch:{ all -> 0x063a }
            java.lang.String r3 = "Database error querying filters. appId"
            java.lang.Object r4 = b.l.a.c.i.b.k3.t(r28)     // Catch:{ all -> 0x063a }
            r1.c(r3, r4, r0)     // Catch:{ all -> 0x063a }
        L_0x059b:
            r23.setTransactionSuccessful()     // Catch:{ all -> 0x063a }
            r23.endTransaction()
            r1 = r16
            boolean r0 = r1.f3655j     // Catch:{ RuntimeException -> 0x05c1 }
            if (r0 == 0) goto L_0x05ad
            r1.j()     // Catch:{ RuntimeException -> 0x05c1 }
            r3 = 0
            r1.f3655j = r3     // Catch:{ RuntimeException -> 0x05c1 }
        L_0x05ad:
            MessageType r0 = r1.f3654i     // Catch:{ RuntimeException -> 0x05c1 }
            b.l.a.c.f.i.c1 r0 = (b.l.a.c.f.i.c1) r0     // Catch:{ RuntimeException -> 0x05c1 }
            b.l.a.c.f.i.c1.F(r0)     // Catch:{ RuntimeException -> 0x05c1 }
            b.l.a.c.f.i.p5 r0 = r1.g()     // Catch:{ RuntimeException -> 0x05c1 }
            b.l.a.c.f.i.c1 r0 = (b.l.a.c.f.i.c1) r0     // Catch:{ RuntimeException -> 0x05c1 }
            byte[] r0 = r0.e()     // Catch:{ RuntimeException -> 0x05c1 }
            r3 = r27
            goto L_0x05d7
        L_0x05c1:
            r0 = move-exception
            r3 = r27
            b.l.a.c.i.b.l4 r4 = r3.a
            b.l.a.c.i.b.k3 r4 = r4.a()
            b.l.a.c.i.b.i3 r4 = r4.f4091i
            java.lang.Object r5 = b.l.a.c.i.b.k3.t(r28)
            java.lang.String r6 = "Unable to serialize reduced-size config. Storing full config instead. appId"
            r4.c(r6, r5, r0)
            r0 = r29
        L_0x05d7:
            b.l.a.c.i.b.d9 r4 = r3.f4305b
            b.l.a.c.i.b.j r4 = r4.L()
            b.l.a.c.b.a.x(r28)
            r4.h()
            r4.i()
            android.content.ContentValues r5 = new android.content.ContentValues
            r5.<init>()
            java.lang.String r6 = "remote_config"
            r5.put(r6, r0)
            android.database.sqlite.SQLiteDatabase r0 = r4.y()     // Catch:{ SQLiteException -> 0x061b }
            r6 = 1
            java.lang.String[] r7 = new java.lang.String[r6]     // Catch:{ SQLiteException -> 0x061b }
            r6 = 0
            r7[r6] = r2     // Catch:{ SQLiteException -> 0x061b }
            java.lang.String r6 = "apps"
            java.lang.String r8 = "app_id = ?"
            int r0 = r0.update(r6, r5, r8, r7)     // Catch:{ SQLiteException -> 0x061b }
            long r5 = (long) r0     // Catch:{ SQLiteException -> 0x061b }
            r7 = 0
            int r0 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r0 != 0) goto L_0x062d
            b.l.a.c.i.b.l4 r0 = r4.a     // Catch:{ SQLiteException -> 0x061b }
            b.l.a.c.i.b.k3 r0 = r0.a()     // Catch:{ SQLiteException -> 0x061b }
            b.l.a.c.i.b.i3 r0 = r0.f     // Catch:{ SQLiteException -> 0x061b }
            java.lang.String r5 = "Failed to update remote config (got 0). appId"
            java.lang.Object r6 = b.l.a.c.i.b.k3.t(r28)     // Catch:{ SQLiteException -> 0x061b }
            r0.b(r5, r6)     // Catch:{ SQLiteException -> 0x061b }
            goto L_0x062d
        L_0x061b:
            r0 = move-exception
            b.l.a.c.i.b.l4 r4 = r4.a
            b.l.a.c.i.b.k3 r4 = r4.a()
            b.l.a.c.i.b.i3 r4 = r4.f
            java.lang.Object r5 = b.l.a.c.i.b.k3.t(r28)
            java.lang.String r6 = "Error storing remote config. appId"
            r4.c(r6, r5, r0)
        L_0x062d:
            java.util.Map<java.lang.String, b.l.a.c.f.i.c1> r0 = r3.f3988g
            b.l.a.c.f.i.p5 r1 = r1.g()
            b.l.a.c.f.i.c1 r1 = (b.l.a.c.f.i.c1) r1
            r0.put(r2, r1)
            r1 = 1
            return r1
        L_0x063a:
            r0 = move-exception
        L_0x063b:
            r3 = r27
        L_0x063d:
            r23.endTransaction()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: b.l.a.c.i.b.e4.n(java.lang.String, byte[], java.lang.String):boolean");
    }

    @WorkerThread
    public final boolean o(String str, String str2) {
        Boolean bool;
        h();
        t(str);
        if ("1".equals(b(str, "measurement.upload.blacklist_internal")) && k9.F(str2)) {
            return true;
        }
        if ("1".equals(b(str, "measurement.upload.blacklist_public")) && k9.e0(str2)) {
            return true;
        }
        Map map = this.f3987e.get(str);
        if (map == null || (bool = (Boolean) map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    @WorkerThread
    public final boolean p(String str, String str2) {
        Boolean bool;
        h();
        t(str);
        if ("ecommerce_purchase".equals(str2) || "purchase".equals(str2) || "refund".equals(str2)) {
            return true;
        }
        Map map = this.f.get(str);
        if (map == null || (bool = (Boolean) map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    @WorkerThread
    public final int q(String str, String str2) {
        Integer num;
        h();
        t(str);
        Map map = this.f3989h.get(str);
        if (map == null || (num = (Integer) map.get(str2)) == null) {
            return 1;
        }
        return num.intValue();
    }

    public final boolean r(String str) {
        return "1".equals(b(str, "measurement.upload.blacklist_internal"));
    }

    public final boolean s(String str) {
        return "1".equals(b(str, "measurement.upload.blacklist_public"));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x007b, code lost:
        if (r2 != null) goto L_0x007d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00d0  */
    @androidx.annotation.WorkerThread
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void t(java.lang.String r12) {
        /*
            r11 = this;
            r11.i()
            r11.h()
            b.l.a.c.b.a.x(r12)
            java.util.Map<java.lang.String, b.l.a.c.f.i.c1> r0 = r11.f3988g
            java.lang.Object r0 = r0.get(r12)
            if (r0 != 0) goto L_0x00d4
            b.l.a.c.i.b.d9 r0 = r11.f4305b
            b.l.a.c.i.b.j r0 = r0.L()
            b.l.a.c.b.a.x(r12)
            r0.h()
            r0.i()
            r1 = 0
            android.database.sqlite.SQLiteDatabase r2 = r0.y()     // Catch:{ SQLiteException -> 0x0067, all -> 0x0065 }
            java.lang.String r3 = "remote_config"
            java.lang.String[] r4 = new java.lang.String[]{r3}     // Catch:{ SQLiteException -> 0x0067, all -> 0x0065 }
            r3 = 1
            java.lang.String[] r6 = new java.lang.String[r3]     // Catch:{ SQLiteException -> 0x0067, all -> 0x0065 }
            r10 = 0
            r6[r10] = r12     // Catch:{ SQLiteException -> 0x0067, all -> 0x0065 }
            java.lang.String r3 = "apps"
            java.lang.String r5 = "app_id=?"
            r7 = 0
            r8 = 0
            r9 = 0
            android.database.Cursor r2 = r2.query(r3, r4, r5, r6, r7, r8, r9)     // Catch:{ SQLiteException -> 0x0067, all -> 0x0065 }
            boolean r3 = r2.moveToFirst()     // Catch:{ SQLiteException -> 0x005f }
            if (r3 != 0) goto L_0x0043
            goto L_0x007d
        L_0x0043:
            byte[] r3 = r2.getBlob(r10)     // Catch:{ SQLiteException -> 0x005f }
            boolean r4 = r2.moveToNext()     // Catch:{ SQLiteException -> 0x005f }
            if (r4 == 0) goto L_0x0061
            b.l.a.c.i.b.l4 r4 = r0.a     // Catch:{ SQLiteException -> 0x005f }
            b.l.a.c.i.b.k3 r4 = r4.a()     // Catch:{ SQLiteException -> 0x005f }
            b.l.a.c.i.b.i3 r4 = r4.f     // Catch:{ SQLiteException -> 0x005f }
            java.lang.String r5 = "Got multiple records for app config, expected one. appId"
            java.lang.Object r6 = b.l.a.c.i.b.k3.t(r12)     // Catch:{ SQLiteException -> 0x005f }
            r4.b(r5, r6)     // Catch:{ SQLiteException -> 0x005f }
            goto L_0x0061
        L_0x005f:
            r3 = move-exception
            goto L_0x006a
        L_0x0061:
            r2.close()
            goto L_0x0081
        L_0x0065:
            r12 = move-exception
            goto L_0x00ce
        L_0x0067:
            r2 = move-exception
            r3 = r2
            r2 = r1
        L_0x006a:
            b.l.a.c.i.b.l4 r0 = r0.a     // Catch:{ all -> 0x00cc }
            b.l.a.c.i.b.k3 r0 = r0.a()     // Catch:{ all -> 0x00cc }
            b.l.a.c.i.b.i3 r0 = r0.f     // Catch:{ all -> 0x00cc }
            java.lang.String r4 = "Error querying remote config. appId"
            java.lang.Object r5 = b.l.a.c.i.b.k3.t(r12)     // Catch:{ all -> 0x00cc }
            r0.c(r4, r5, r3)     // Catch:{ all -> 0x00cc }
            if (r2 == 0) goto L_0x0080
        L_0x007d:
            r2.close()
        L_0x0080:
            r3 = r1
        L_0x0081:
            if (r3 != 0) goto L_0x00a2
            java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.String>> r0 = r11.d
            r0.put(r12, r1)
            java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.Boolean>> r0 = r11.f3987e
            r0.put(r12, r1)
            java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.Boolean>> r0 = r11.f
            r0.put(r12, r1)
            java.util.Map<java.lang.String, b.l.a.c.f.i.c1> r0 = r11.f3988g
            r0.put(r12, r1)
            java.util.Map<java.lang.String, java.lang.String> r0 = r11.f3990i
            r0.put(r12, r1)
            java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.Integer>> r0 = r11.f3989h
        L_0x009e:
            r0.put(r12, r1)
            return
        L_0x00a2:
            b.l.a.c.f.i.c1 r0 = r11.v(r12, r3)
            b.l.a.c.f.i.m5 r0 = r0.n()
            b.l.a.c.f.i.b1 r0 = (b.l.a.c.f.i.b1) r0
            r11.u(r12, r0)
            java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.String>> r2 = r11.d
            b.l.a.c.f.i.p5 r3 = r0.g()
            b.l.a.c.f.i.c1 r3 = (b.l.a.c.f.i.c1) r3
            java.util.Map r3 = w(r3)
            r2.put(r12, r3)
            java.util.Map<java.lang.String, b.l.a.c.f.i.c1> r2 = r11.f3988g
            b.l.a.c.f.i.p5 r0 = r0.g()
            b.l.a.c.f.i.c1 r0 = (b.l.a.c.f.i.c1) r0
            r2.put(r12, r0)
            java.util.Map<java.lang.String, java.lang.String> r0 = r11.f3990i
            goto L_0x009e
        L_0x00cc:
            r12 = move-exception
            r1 = r2
        L_0x00ce:
            if (r1 == 0) goto L_0x00d3
            r1.close()
        L_0x00d3:
            throw r12
        L_0x00d4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: b.l.a.c.i.b.e4.t(java.lang.String):void");
    }

    public final void u(String str, b1 b1Var) {
        ArrayMap arrayMap = new ArrayMap();
        ArrayMap arrayMap2 = new ArrayMap();
        ArrayMap arrayMap3 = new ArrayMap();
        for (int i2 = 0; i2 < ((c1) b1Var.f3654i).x(); i2++) {
            z0 z0Var = (z0) ((c1) b1Var.f3654i).y(i2).n();
            if (TextUtils.isEmpty(z0Var.m())) {
                this.a.a().f4091i.a("EventConfig contained null event name");
            } else {
                String m2 = z0Var.m();
                String c = s6.c(z0Var.m(), i5.a, i5.c);
                if (!TextUtils.isEmpty(c)) {
                    if (z0Var.f3655j) {
                        z0Var.j();
                        z0Var.f3655j = false;
                    }
                    a1.y((a1) z0Var.f3654i, c);
                    if (b1Var.f3655j) {
                        b1Var.j();
                        b1Var.f3655j = false;
                    }
                    c1.E((c1) b1Var.f3654i, i2, (a1) z0Var.g());
                }
                arrayMap.put(m2, Boolean.valueOf(((a1) z0Var.f3654i).t()));
                arrayMap2.put(z0Var.m(), Boolean.valueOf(((a1) z0Var.f3654i).u()));
                if (((a1) z0Var.f3654i).v()) {
                    if (z0Var.n() < 2 || z0Var.n() > 65535) {
                        this.a.a().f4091i.c("Invalid sampling rate. Event name, sample rate", z0Var.m(), Integer.valueOf(z0Var.n()));
                    } else {
                        arrayMap3.put(z0Var.m(), Integer.valueOf(z0Var.n()));
                    }
                }
            }
        }
        this.f3987e.put(str, arrayMap);
        this.f.put(str, arrayMap2);
        this.f3989h.put(str, arrayMap3);
    }

    @WorkerThread
    public final c1 v(String str, byte[] bArr) {
        k3 a;
        if (bArr == null) {
            return c1.C();
        }
        try {
            c1 c1Var = (c1) ((b1) f9.G(c1.B(), bArr)).g();
            i3 i3Var = this.a.a().f4096n;
            String str2 = null;
            Long valueOf = c1Var.s() ? Long.valueOf(c1Var.t()) : null;
            if (c1Var.u()) {
                str2 = c1Var.v();
            }
            i3Var.c("Parsed config. version, gmp_app_id", valueOf, str2);
            return c1Var;
        } catch (y5 e2) {
            e = e2;
            a = this.a.a();
            a.f4091i.c("Unable to merge remote config. appId", k3.t(str), e);
            return c1.C();
        } catch (RuntimeException e3) {
            e = e3;
            a = this.a.a();
            a.f4091i.c("Unable to merge remote config. appId", k3.t(str), e);
            return c1.C();
        }
    }
}
