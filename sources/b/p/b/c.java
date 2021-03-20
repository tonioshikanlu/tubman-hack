package b.p.b;

import androidx.appcompat.widget.ActivityChooserView;
import java.util.concurrent.TimeUnit;

public final class c {
    public final boolean a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f6686b;
    public final int c;
    public final int d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f6687e;
    public final boolean f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f6688g;

    /* renamed from: h  reason: collision with root package name */
    public final int f6689h;

    /* renamed from: i  reason: collision with root package name */
    public final int f6690i;

    /* renamed from: j  reason: collision with root package name */
    public final boolean f6691j;

    /* renamed from: k  reason: collision with root package name */
    public final boolean f6692k;

    /* renamed from: l  reason: collision with root package name */
    public String f6693l;

    public static final class b {
        public boolean a;

        /* renamed from: b  reason: collision with root package name */
        public int f6694b = -1;
        public boolean c;

        public c a() {
            return new c(this, (a) null);
        }
    }

    static {
        b bVar = new b();
        bVar.a = true;
        bVar.a();
        b bVar2 = new b();
        bVar2.c = true;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        int i2 = ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
        long seconds = timeUnit.toSeconds((long) ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED);
        if (seconds <= 2147483647L) {
            i2 = (int) seconds;
        }
        bVar2.f6694b = i2;
        bVar2.a();
    }

    public c(b bVar, a aVar) {
        this.a = bVar.a;
        this.f6686b = false;
        this.c = -1;
        this.d = -1;
        this.f6687e = false;
        this.f = false;
        this.f6688g = false;
        this.f6689h = bVar.f6694b;
        this.f6690i = -1;
        this.f6691j = bVar.c;
        this.f6692k = false;
    }

    public c(boolean z, boolean z2, int i2, int i3, boolean z3, boolean z4, boolean z5, int i4, int i5, boolean z6, boolean z7, String str) {
        this.a = z;
        this.f6686b = z2;
        this.c = i2;
        this.d = i3;
        this.f6687e = z3;
        this.f = z4;
        this.f6688g = z5;
        this.f6689h = i4;
        this.f6690i = i5;
        this.f6691j = z6;
        this.f6692k = z7;
        this.f6693l = str;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static b.p.b.c a(b.p.b.n r21) {
        /*
            r0 = r21
            int r1 = r21.d()
            r6 = 0
            r7 = 1
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = -1
            r12 = -1
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = -1
            r17 = -1
            r18 = 0
            r19 = 0
        L_0x0018:
            if (r6 >= r1) goto L_0x0131
            java.lang.String r2 = r0.b(r6)
            java.lang.String r4 = r0.e(r6)
            java.lang.String r3 = "Cache-Control"
            boolean r3 = r2.equalsIgnoreCase(r3)
            if (r3 == 0) goto L_0x002f
            if (r8 == 0) goto L_0x002d
            goto L_0x0037
        L_0x002d:
            r8 = r4
            goto L_0x0038
        L_0x002f:
            java.lang.String r3 = "Pragma"
            boolean r2 = r2.equalsIgnoreCase(r3)
            if (r2 == 0) goto L_0x012a
        L_0x0037:
            r7 = 0
        L_0x0038:
            r2 = 0
        L_0x0039:
            int r3 = r4.length()
            if (r2 >= r3) goto L_0x012a
            java.lang.String r3 = "=,;"
            int r3 = b.l.f.x.a.g.m0(r4, r2, r3)
            java.lang.String r2 = r4.substring(r2, r3)
            java.lang.String r2 = r2.trim()
            int r5 = r4.length()
            if (r3 == r5) goto L_0x0097
            char r5 = r4.charAt(r3)
            r0 = 44
            if (r5 == r0) goto L_0x0097
            char r0 = r4.charAt(r3)
            r5 = 59
            if (r0 != r5) goto L_0x0064
            goto L_0x0097
        L_0x0064:
            int r3 = r3 + 1
            int r0 = b.l.f.x.a.g.n0(r4, r3)
            int r3 = r4.length()
            if (r0 >= r3) goto L_0x0087
            char r3 = r4.charAt(r0)
            r5 = 34
            if (r3 != r5) goto L_0x0087
            int r0 = r0 + 1
            java.lang.String r3 = "\""
            int r3 = b.l.f.x.a.g.m0(r4, r0, r3)
            java.lang.String r0 = r4.substring(r0, r3)
            r5 = 1
            int r3 = r3 + r5
            goto L_0x009b
        L_0x0087:
            r5 = 1
            java.lang.String r3 = ",;"
            int r3 = b.l.f.x.a.g.m0(r4, r0, r3)
            java.lang.String r0 = r4.substring(r0, r3)
            java.lang.String r0 = r0.trim()
            goto L_0x009b
        L_0x0097:
            r5 = 1
            int r3 = r3 + 1
            r0 = 0
        L_0x009b:
            java.lang.String r5 = "no-cache"
            boolean r5 = r5.equalsIgnoreCase(r2)
            if (r5 == 0) goto L_0x00a7
            r5 = -1
            r9 = 1
            goto L_0x0125
        L_0x00a7:
            java.lang.String r5 = "no-store"
            boolean r5 = r5.equalsIgnoreCase(r2)
            if (r5 == 0) goto L_0x00b3
            r5 = -1
            r10 = 1
            goto L_0x0125
        L_0x00b3:
            java.lang.String r5 = "max-age"
            boolean r5 = r5.equalsIgnoreCase(r2)
            if (r5 == 0) goto L_0x00c1
            r5 = -1
            int r11 = b.l.f.x.a.g.Y(r0, r5)
            goto L_0x0125
        L_0x00c1:
            java.lang.String r5 = "s-maxage"
            boolean r5 = r5.equalsIgnoreCase(r2)
            if (r5 == 0) goto L_0x00cf
            r5 = -1
            int r12 = b.l.f.x.a.g.Y(r0, r5)
            goto L_0x0125
        L_0x00cf:
            java.lang.String r5 = "private"
            boolean r5 = r5.equalsIgnoreCase(r2)
            if (r5 == 0) goto L_0x00da
            r5 = -1
            r13 = 1
            goto L_0x0125
        L_0x00da:
            java.lang.String r5 = "public"
            boolean r5 = r5.equalsIgnoreCase(r2)
            if (r5 == 0) goto L_0x00e5
            r5 = -1
            r14 = 1
            goto L_0x0125
        L_0x00e5:
            java.lang.String r5 = "must-revalidate"
            boolean r5 = r5.equalsIgnoreCase(r2)
            if (r5 == 0) goto L_0x00f0
            r5 = -1
            r15 = 1
            goto L_0x0125
        L_0x00f0:
            java.lang.String r5 = "max-stale"
            boolean r5 = r5.equalsIgnoreCase(r2)
            if (r5 == 0) goto L_0x0101
            r2 = 2147483647(0x7fffffff, float:NaN)
            int r16 = b.l.f.x.a.g.Y(r0, r2)
            r5 = -1
            goto L_0x0125
        L_0x0101:
            java.lang.String r5 = "min-fresh"
            boolean r5 = r5.equalsIgnoreCase(r2)
            if (r5 == 0) goto L_0x010f
            r5 = -1
            int r17 = b.l.f.x.a.g.Y(r0, r5)
            goto L_0x0125
        L_0x010f:
            r5 = -1
            java.lang.String r0 = "only-if-cached"
            boolean r0 = r0.equalsIgnoreCase(r2)
            if (r0 == 0) goto L_0x011b
            r18 = 1
            goto L_0x0125
        L_0x011b:
            java.lang.String r0 = "no-transform"
            boolean r0 = r0.equalsIgnoreCase(r2)
            if (r0 == 0) goto L_0x0125
            r19 = 1
        L_0x0125:
            r0 = r21
            r2 = r3
            goto L_0x0039
        L_0x012a:
            r5 = -1
            int r6 = r6 + 1
            r0 = r21
            goto L_0x0018
        L_0x0131:
            if (r7 != 0) goto L_0x0136
            r20 = 0
            goto L_0x0138
        L_0x0136:
            r20 = r8
        L_0x0138:
            b.p.b.c r0 = new b.p.b.c
            r8 = r0
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: b.p.b.c.a(b.p.b.n):b.p.b.c");
    }

    public String toString() {
        String str = this.f6693l;
        if (str == null) {
            StringBuilder sb = new StringBuilder();
            if (this.a) {
                sb.append("no-cache, ");
            }
            if (this.f6686b) {
                sb.append("no-store, ");
            }
            if (this.c != -1) {
                sb.append("max-age=");
                sb.append(this.c);
                sb.append(", ");
            }
            if (this.d != -1) {
                sb.append("s-maxage=");
                sb.append(this.d);
                sb.append(", ");
            }
            if (this.f6687e) {
                sb.append("private, ");
            }
            if (this.f) {
                sb.append("public, ");
            }
            if (this.f6688g) {
                sb.append("must-revalidate, ");
            }
            if (this.f6689h != -1) {
                sb.append("max-stale=");
                sb.append(this.f6689h);
                sb.append(", ");
            }
            if (this.f6690i != -1) {
                sb.append("min-fresh=");
                sb.append(this.f6690i);
                sb.append(", ");
            }
            if (this.f6691j) {
                sb.append("only-if-cached, ");
            }
            if (this.f6692k) {
                sb.append("no-transform, ");
            }
            if (sb.length() == 0) {
                str = "";
            } else {
                sb.delete(sb.length() - 2, sb.length());
                str = sb.toString();
            }
            this.f6693l = str;
        }
        return str;
    }
}
