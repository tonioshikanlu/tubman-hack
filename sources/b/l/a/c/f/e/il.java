package b.l.a.c.f.e;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import b.l.a.c.b.a;
import java.util.List;

public final class il implements aj {

    /* renamed from: h  reason: collision with root package name */
    public String f3072h;

    /* renamed from: i  reason: collision with root package name */
    public String f3073i;

    /* renamed from: j  reason: collision with root package name */
    public String f3074j;

    /* renamed from: k  reason: collision with root package name */
    public String f3075k;

    /* renamed from: l  reason: collision with root package name */
    public String f3076l;

    /* renamed from: m  reason: collision with root package name */
    public String f3077m;

    /* renamed from: n  reason: collision with root package name */
    public final ql f3078n = new ql((List<String>) null);

    /* renamed from: o  reason: collision with root package name */
    public final ql f3079o = new ql((List<String>) null);
    @Nullable

    /* renamed from: p  reason: collision with root package name */
    public String f3080p;

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String a() {
        /*
            r11 = this;
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            java.lang.String r1 = "returnSecureToken"
            r2 = 1
            r0.put(r1, r2)
            b.l.a.c.f.e.ql r1 = r11.f3079o
            java.util.List<java.lang.String> r1 = r1.f3245i
            boolean r1 = r1.isEmpty()
            r3 = 0
            if (r1 != 0) goto L_0x0035
            b.l.a.c.f.e.ql r1 = r11.f3079o
            java.util.List<java.lang.String> r1 = r1.f3245i
            org.json.JSONArray r4 = new org.json.JSONArray
            r4.<init>()
            r5 = r3
        L_0x0020:
            int r6 = r1.size()
            if (r5 >= r6) goto L_0x0030
            java.lang.Object r6 = r1.get(r5)
            r4.put(r6)
            int r5 = r5 + 1
            goto L_0x0020
        L_0x0030:
            java.lang.String r1 = "deleteProvider"
            r0.put(r1, r4)
        L_0x0035:
            b.l.a.c.f.e.ql r1 = r11.f3078n
            java.util.List<java.lang.String> r1 = r1.f3245i
            int r4 = r1.size()
            int[] r5 = new int[r4]
            r6 = r3
        L_0x0040:
            int r7 = r1.size()
            if (r6 >= r7) goto L_0x0093
            java.lang.Object r7 = r1.get(r6)
            java.lang.String r7 = (java.lang.String) r7
            int r8 = r7.hashCode()
            r9 = 3
            r10 = 2
            switch(r8) {
                case -333046776: goto L_0x0074;
                case 66081660: goto L_0x006a;
                case 1939891618: goto L_0x0060;
                case 1999612571: goto L_0x0056;
                default: goto L_0x0055;
            }
        L_0x0055:
            goto L_0x007e
        L_0x0056:
            java.lang.String r8 = "PASSWORD"
            boolean r7 = r7.equals(r8)
            if (r7 == 0) goto L_0x007e
            r7 = r10
            goto L_0x007f
        L_0x0060:
            java.lang.String r8 = "PHOTO_URL"
            boolean r7 = r7.equals(r8)
            if (r7 == 0) goto L_0x007e
            r7 = r9
            goto L_0x007f
        L_0x006a:
            java.lang.String r8 = "EMAIL"
            boolean r7 = r7.equals(r8)
            if (r7 == 0) goto L_0x007e
            r7 = r3
            goto L_0x007f
        L_0x0074:
            java.lang.String r8 = "DISPLAY_NAME"
            boolean r7 = r7.equals(r8)
            if (r7 == 0) goto L_0x007e
            r7 = r2
            goto L_0x007f
        L_0x007e:
            r7 = -1
        L_0x007f:
            if (r7 == 0) goto L_0x008d
            if (r7 == r2) goto L_0x008e
            if (r7 == r10) goto L_0x008b
            if (r7 == r9) goto L_0x0089
            r10 = r3
            goto L_0x008e
        L_0x0089:
            r10 = 4
            goto L_0x008e
        L_0x008b:
            r10 = 5
            goto L_0x008e
        L_0x008d:
            r10 = r2
        L_0x008e:
            r5[r6] = r10
            int r6 = r6 + 1
            goto L_0x0040
        L_0x0093:
            if (r4 <= 0) goto L_0x00a9
            org.json.JSONArray r1 = new org.json.JSONArray
            r1.<init>()
        L_0x009a:
            if (r3 >= r4) goto L_0x00a4
            r2 = r5[r3]
            r1.put(r2)
            int r3 = r3 + 1
            goto L_0x009a
        L_0x00a4:
            java.lang.String r2 = "deleteAttribute"
            r0.put(r2, r1)
        L_0x00a9:
            java.lang.String r1 = r11.f3072h
            if (r1 == 0) goto L_0x00b2
            java.lang.String r2 = "idToken"
            r0.put(r2, r1)
        L_0x00b2:
            java.lang.String r1 = r11.f3074j
            if (r1 == 0) goto L_0x00bb
            java.lang.String r2 = "email"
            r0.put(r2, r1)
        L_0x00bb:
            java.lang.String r1 = r11.f3075k
            if (r1 == 0) goto L_0x00c4
            java.lang.String r2 = "password"
            r0.put(r2, r1)
        L_0x00c4:
            java.lang.String r1 = r11.f3073i
            if (r1 == 0) goto L_0x00cd
            java.lang.String r2 = "displayName"
            r0.put(r2, r1)
        L_0x00cd:
            java.lang.String r1 = r11.f3077m
            if (r1 == 0) goto L_0x00d6
            java.lang.String r2 = "photoUrl"
            r0.put(r2, r1)
        L_0x00d6:
            java.lang.String r1 = r11.f3076l
            if (r1 == 0) goto L_0x00df
            java.lang.String r2 = "oobCode"
            r0.put(r2, r1)
        L_0x00df:
            java.lang.String r1 = r11.f3080p
            if (r1 == 0) goto L_0x00e8
            java.lang.String r2 = "tenantId"
            r0.put(r2, r1)
        L_0x00e8:
            java.lang.String r0 = r0.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: b.l.a.c.f.e.il.a():java.lang.String");
    }

    public final boolean b(String str) {
        a.x(str);
        return this.f3078n.f3245i.contains(str);
    }

    @NonNull
    public final il c(@Nullable String str) {
        if (str == null) {
            this.f3078n.f3245i.add("EMAIL");
        } else {
            this.f3074j = str;
        }
        return this;
    }

    @NonNull
    public final il d(@Nullable String str) {
        if (str == null) {
            this.f3078n.f3245i.add("PASSWORD");
        } else {
            this.f3075k = str;
        }
        return this;
    }
}
