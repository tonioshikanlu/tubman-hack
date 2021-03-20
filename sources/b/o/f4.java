package b.o;

import b.e.a.a.a;
import b.l.f.x.a.g;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

public abstract class f4 {
    public static final Object d = new Object();

    /* renamed from: e  reason: collision with root package name */
    public static final String[] f6098e;
    public static final Set<String> f;
    public String a;

    /* renamed from: b  reason: collision with root package name */
    public JSONObject f6099b;
    public JSONObject c;

    static {
        String[] strArr = {"lat", "long", "loc_acc", "loc_type", "loc_bg", "loc_time_stamp", "ad_id"};
        f6098e = strArr;
        f = new HashSet(Arrays.asList(strArr));
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public f4(java.lang.String r6, boolean r7) {
        /*
            r5 = this;
            r5.<init>()
            r5.a = r6
            if (r7 == 0) goto L_0x00b2
            java.lang.Object r6 = d
            java.lang.String r7 = b.o.b3.a
            java.lang.String r0 = "ONESIGNAL_USERSTATE_DEPENDVALYES_"
            java.lang.StringBuilder r0 = b.e.a.a.a.y(r0)
            java.lang.String r1 = r5.a
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r1 = 0
            java.lang.String r0 = b.o.b3.f(r7, r0, r1)
            if (r0 != 0) goto L_0x0066
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            monitor-enter(r6)
            r5.f6099b = r0     // Catch:{ all -> 0x0063 }
            monitor-exit(r6)     // Catch:{ all -> 0x0063 }
            java.lang.String r0 = r5.a     // Catch:{ JSONException -> 0x0077 }
            java.lang.String r2 = "CURRENT_STATE"
            boolean r0 = r0.equals(r2)     // Catch:{ JSONException -> 0x0077 }
            r2 = 1
            if (r0 == 0) goto L_0x0038
            java.lang.String r0 = "ONESIGNAL_SUBSCRIPTION"
            goto L_0x003a
        L_0x0038:
            java.lang.String r0 = "ONESIGNAL_SYNCED_SUBSCRIPTION"
        L_0x003a:
            int r7 = b.o.b3.c(r7, r0, r2)     // Catch:{ JSONException -> 0x0077 }
            r0 = -2
            if (r7 != r0) goto L_0x0043
            r7 = 0
            goto L_0x0046
        L_0x0043:
            r4 = r2
            r2 = r7
            r7 = r4
        L_0x0046:
            java.util.HashMap r0 = new java.util.HashMap     // Catch:{ JSONException -> 0x0077 }
            r0.<init>()     // Catch:{ JSONException -> 0x0077 }
            java.lang.String r3 = "subscribableStatus"
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ JSONException -> 0x0077 }
            r0.put(r3, r2)     // Catch:{ JSONException -> 0x0077 }
            java.lang.String r2 = "userSubscribePref"
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)     // Catch:{ JSONException -> 0x0077 }
            r0.put(r2, r7)     // Catch:{ JSONException -> 0x0077 }
            org.json.JSONObject r7 = r5.f6099b     // Catch:{ JSONException -> 0x0077 }
            r5.n(r7, r0)     // Catch:{ JSONException -> 0x0077 }
            goto L_0x0077
        L_0x0063:
            r7 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x0063 }
            throw r7
        L_0x0066:
            org.json.JSONObject r7 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0073 }
            r7.<init>(r0)     // Catch:{ JSONException -> 0x0073 }
            monitor-enter(r6)     // Catch:{ JSONException -> 0x0073 }
            r5.f6099b = r7     // Catch:{ all -> 0x0070 }
            monitor-exit(r6)     // Catch:{ all -> 0x0070 }
            goto L_0x0077
        L_0x0070:
            r7 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x0070 }
            throw r7     // Catch:{ JSONException -> 0x0073 }
        L_0x0073:
            r7 = move-exception
            r7.printStackTrace()
        L_0x0077:
            java.lang.String r7 = b.o.b3.a
            java.lang.String r0 = "ONESIGNAL_USERSTATE_SYNCVALYES_"
            java.lang.StringBuilder r0 = b.e.a.a.a.y(r0)
            java.lang.String r2 = r5.a
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            java.lang.String r0 = b.o.b3.f(r7, r0, r1)
            if (r0 != 0) goto L_0x009f
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch:{ JSONException -> 0x00ad }
            r0.<init>()     // Catch:{ JSONException -> 0x00ad }
            java.lang.String r2 = "GT_REGISTRATION_ID"
            java.lang.String r7 = b.o.b3.f(r7, r2, r1)     // Catch:{ JSONException -> 0x00ad }
            java.lang.String r1 = "identifier"
            r0.put(r1, r7)     // Catch:{ JSONException -> 0x00ad }
            goto L_0x00a5
        L_0x009f:
            org.json.JSONObject r7 = new org.json.JSONObject     // Catch:{ JSONException -> 0x00ad }
            r7.<init>(r0)     // Catch:{ JSONException -> 0x00ad }
            r0 = r7
        L_0x00a5:
            monitor-enter(r6)     // Catch:{ JSONException -> 0x00ad }
            r5.c = r0     // Catch:{ all -> 0x00aa }
            monitor-exit(r6)     // Catch:{ all -> 0x00aa }
            goto L_0x00c0
        L_0x00aa:
            r7 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x00aa }
            throw r7     // Catch:{ JSONException -> 0x00ad }
        L_0x00ad:
            r6 = move-exception
            r6.printStackTrace()
            goto L_0x00c0
        L_0x00b2:
            org.json.JSONObject r6 = new org.json.JSONObject
            r6.<init>()
            r5.f6099b = r6
            org.json.JSONObject r6 = new org.json.JSONObject
            r6.<init>()
            r5.c = r6
        L_0x00c0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: b.o.f4.<init>(java.lang.String, boolean):void");
    }

    public static JSONObject c(JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, Set<String> set) {
        JSONObject q2;
        synchronized (d) {
            q2 = g.q(jSONObject, jSONObject2, jSONObject3, set);
        }
        return q2;
    }

    public abstract void a();

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0057 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0058 A[SYNTHETIC, Splitter:B:12:0x0058] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public org.json.JSONObject b(b.o.f4 r11, boolean r12) {
        /*
            r10 = this;
            java.lang.String r0 = "external_user_id_auth_hash"
            java.lang.String r1 = "email_auth_hash"
            java.lang.String r2 = "app_id"
            r10.a()
            r11.a()
            java.lang.String r3 = "loc_bg"
            java.lang.String r4 = "loc_time_stamp"
            r5 = 0
            org.json.JSONObject r6 = r10.f6099b     // Catch:{ all -> 0x0040 }
            long r6 = r6.optLong(r4)     // Catch:{ all -> 0x0040 }
            org.json.JSONObject r8 = r11.f6099b     // Catch:{ all -> 0x0040 }
            long r8 = r8.getLong(r4)     // Catch:{ all -> 0x0040 }
            int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r6 == 0) goto L_0x0040
            java.util.HashMap r6 = new java.util.HashMap     // Catch:{ all -> 0x0040 }
            r6.<init>()     // Catch:{ all -> 0x0040 }
            org.json.JSONObject r7 = r11.f6099b     // Catch:{ all -> 0x0040 }
            java.lang.Object r7 = r7.opt(r3)     // Catch:{ all -> 0x0040 }
            r6.put(r3, r7)     // Catch:{ all -> 0x0040 }
            org.json.JSONObject r3 = r11.f6099b     // Catch:{ all -> 0x0040 }
            java.lang.Object r3 = r3.opt(r4)     // Catch:{ all -> 0x0040 }
            r6.put(r4, r3)     // Catch:{ all -> 0x0040 }
            org.json.JSONObject r3 = r11.c     // Catch:{ all -> 0x0040 }
            r10.n(r3, r6)     // Catch:{ all -> 0x0040 }
            java.util.Set<java.lang.String> r3 = f     // Catch:{ all -> 0x0040 }
            goto L_0x0041
        L_0x0040:
            r3 = r5
        L_0x0041:
            org.json.JSONObject r4 = r10.c
            org.json.JSONObject r11 = r11.c
            org.json.JSONObject r11 = c(r4, r11, r5, r3)
            if (r12 != 0) goto L_0x0058
            java.lang.String r12 = r11.toString()
            java.lang.String r3 = "{}"
            boolean r12 = r12.equals(r3)
            if (r12 == 0) goto L_0x0058
            return r5
        L_0x0058:
            boolean r12 = r11.has(r2)     // Catch:{ JSONException -> 0x008a }
            if (r12 != 0) goto L_0x0067
            org.json.JSONObject r12 = r10.c     // Catch:{ JSONException -> 0x008a }
            java.lang.String r12 = r12.optString(r2)     // Catch:{ JSONException -> 0x008a }
            r11.put(r2, r12)     // Catch:{ JSONException -> 0x008a }
        L_0x0067:
            org.json.JSONObject r12 = r10.c     // Catch:{ JSONException -> 0x008a }
            boolean r12 = r12.has(r1)     // Catch:{ JSONException -> 0x008a }
            if (r12 == 0) goto L_0x0078
            org.json.JSONObject r12 = r10.c     // Catch:{ JSONException -> 0x008a }
            java.lang.String r12 = r12.optString(r1)     // Catch:{ JSONException -> 0x008a }
            r11.put(r1, r12)     // Catch:{ JSONException -> 0x008a }
        L_0x0078:
            org.json.JSONObject r12 = r10.c     // Catch:{ JSONException -> 0x008a }
            boolean r12 = r12.has(r0)     // Catch:{ JSONException -> 0x008a }
            if (r12 == 0) goto L_0x008e
            org.json.JSONObject r12 = r10.c     // Catch:{ JSONException -> 0x008a }
            java.lang.String r12 = r12.optString(r0)     // Catch:{ JSONException -> 0x008a }
            r11.put(r0, r12)     // Catch:{ JSONException -> 0x008a }
            goto L_0x008e
        L_0x008a:
            r12 = move-exception
            r12.printStackTrace()
        L_0x008e:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: b.o.f4.b(b.o.f4, boolean):org.json.JSONObject");
    }

    public JSONObject d(JSONObject jSONObject, Set<String> set) {
        JSONObject q2;
        synchronized (d) {
            JSONObject jSONObject2 = this.c;
            q2 = g.q(jSONObject2, jSONObject, jSONObject2, (Set<String>) null);
        }
        return q2;
    }

    public v e() {
        try {
            return new v(f());
        } catch (JSONException e2) {
            e2.printStackTrace();
            return new v();
        }
    }

    public JSONObject f() {
        JSONObject jSONObject;
        synchronized (d) {
            jSONObject = new JSONObject(this.f6099b.toString());
        }
        return jSONObject;
    }

    public v g() {
        try {
            return new v(h());
        } catch (JSONException e2) {
            e2.printStackTrace();
            return new v();
        }
    }

    public JSONObject h() {
        JSONObject jSONObject;
        synchronized (d) {
            jSONObject = new JSONObject(this.c.toString());
        }
        return jSONObject;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:6|7|8|9) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x0021 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void i(org.json.JSONObject r6, org.json.JSONObject r7) {
        /*
            r5 = this;
            java.lang.String r0 = "tags"
            boolean r0 = r6.has(r0)
            if (r0 != 0) goto L_0x0009
            return
        L_0x0009:
            org.json.JSONObject r0 = r5.h()     // Catch:{ JSONException -> 0x0085 }
            java.lang.String r1 = "tags"
            boolean r1 = r0.has(r1)     // Catch:{ JSONException -> 0x0085 }
            if (r1 == 0) goto L_0x0027
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0021 }
            java.lang.String r2 = "tags"
            java.lang.String r0 = r0.optString(r2)     // Catch:{ JSONException -> 0x0021 }
            r1.<init>(r0)     // Catch:{ JSONException -> 0x0021 }
            goto L_0x002c
        L_0x0021:
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0085 }
            r1.<init>()     // Catch:{ JSONException -> 0x0085 }
            goto L_0x002c
        L_0x0027:
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0085 }
            r1.<init>()     // Catch:{ JSONException -> 0x0085 }
        L_0x002c:
            java.lang.String r0 = "tags"
            org.json.JSONObject r6 = r6.optJSONObject(r0)     // Catch:{ JSONException -> 0x0085 }
            java.util.Iterator r0 = r6.keys()     // Catch:{ JSONException -> 0x0085 }
        L_0x0036:
            boolean r2 = r0.hasNext()     // Catch:{ JSONException -> 0x0085 }
            if (r2 == 0) goto L_0x0062
            java.lang.Object r2 = r0.next()     // Catch:{ JSONException -> 0x0085 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ JSONException -> 0x0085 }
            java.lang.String r3 = ""
            java.lang.String r4 = r6.optString(r2)     // Catch:{ JSONException -> 0x0085 }
            boolean r3 = r3.equals(r4)     // Catch:{ JSONException -> 0x0085 }
            if (r3 == 0) goto L_0x0052
            r1.remove(r2)     // Catch:{ JSONException -> 0x0085 }
            goto L_0x0036
        L_0x0052:
            if (r7 == 0) goto L_0x005a
            boolean r3 = r7.has(r2)     // Catch:{ JSONException -> 0x0085 }
            if (r3 != 0) goto L_0x0036
        L_0x005a:
            java.lang.String r3 = r6.optString(r2)     // Catch:{ JSONException -> 0x0085 }
            r1.put(r2, r3)     // Catch:{ JSONException -> 0x0085 }
            goto L_0x0036
        L_0x0062:
            java.lang.Object r6 = d     // Catch:{ JSONException -> 0x0085 }
            monitor-enter(r6)     // Catch:{ JSONException -> 0x0085 }
            java.lang.String r7 = r1.toString()     // Catch:{ all -> 0x0082 }
            java.lang.String r0 = "{}"
            boolean r7 = r7.equals(r0)     // Catch:{ all -> 0x0082 }
            if (r7 == 0) goto L_0x0079
            org.json.JSONObject r7 = r5.c     // Catch:{ all -> 0x0082 }
            java.lang.String r0 = "tags"
            r7.remove(r0)     // Catch:{ all -> 0x0082 }
            goto L_0x0080
        L_0x0079:
            org.json.JSONObject r7 = r5.c     // Catch:{ all -> 0x0082 }
            java.lang.String r0 = "tags"
            r7.put(r0, r1)     // Catch:{ all -> 0x0082 }
        L_0x0080:
            monitor-exit(r6)     // Catch:{ all -> 0x0082 }
            goto L_0x0089
        L_0x0082:
            r7 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x0082 }
            throw r7     // Catch:{ JSONException -> 0x0085 }
        L_0x0085:
            r6 = move-exception
            r6.printStackTrace()
        L_0x0089:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: b.o.f4.i(org.json.JSONObject, org.json.JSONObject):void");
    }

    public abstract f4 j(String str);

    public void k() {
        synchronized (d) {
            String str = b3.a;
            b3.h(str, "ONESIGNAL_USERSTATE_SYNCVALYES_" + this.a, this.c.toString());
            b3.h(str, "ONESIGNAL_USERSTATE_DEPENDVALYES_" + this.a, this.f6099b.toString());
        }
    }

    public void l(JSONObject jSONObject, JSONObject jSONObject2) {
        if (jSONObject != null) {
            JSONObject jSONObject3 = this.f6099b;
            c(jSONObject3, jSONObject, jSONObject3, (Set<String>) null);
        }
        if (jSONObject2 != null) {
            JSONObject jSONObject4 = this.c;
            c(jSONObject4, jSONObject2, jSONObject4, (Set<String>) null);
            i(jSONObject2, (JSONObject) null);
        }
        if (jSONObject != null || jSONObject2 != null) {
            k();
        }
    }

    public void m(String str, Object obj) {
        synchronized (d) {
            this.f6099b.put(str, obj);
        }
    }

    public final void n(JSONObject jSONObject, HashMap<String, Object> hashMap) {
        synchronized (d) {
            for (Map.Entry next : hashMap.entrySet()) {
                jSONObject.put((String) next.getKey(), next.getValue());
            }
        }
    }

    public void o(String str) {
        synchronized (d) {
            this.f6099b.remove(str);
        }
    }

    public void p(String str) {
        synchronized (d) {
            this.c.remove(str);
        }
    }

    public String toString() {
        StringBuilder y = a.y("UserState{persistKey='");
        y.append(this.a);
        y.append('\'');
        y.append(", dependValues=");
        y.append(this.f6099b);
        y.append(", syncValues=");
        y.append(this.c);
        y.append('}');
        return y.toString();
    }
}
