package n;

import androidx.appcompat.widget.ActivityChooserView;
import e.c0.h;
import e.x.c.i;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class e {

    /* renamed from: n  reason: collision with root package name */
    public static final a f10082n = new a((DefaultConstructorMarker) null);
    public final boolean a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f10083b;
    public final int c;
    public final int d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f10084e;
    public final boolean f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f10085g;

    /* renamed from: h  reason: collision with root package name */
    public final int f10086h;

    /* renamed from: i  reason: collision with root package name */
    public final int f10087i;

    /* renamed from: j  reason: collision with root package name */
    public final boolean f10088j;

    /* renamed from: k  reason: collision with root package name */
    public final boolean f10089k;

    /* renamed from: l  reason: collision with root package name */
    public final boolean f10090l;

    /* renamed from: m  reason: collision with root package name */
    public String f10091m;

    public static final class a {
        public a(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public final int a(String str, String str2, int i2) {
            int length = str.length();
            while (i2 < length) {
                if (h.c(str2, str.charAt(i2), false, 2)) {
                    return i2;
                }
                i2++;
            }
            return str.length();
        }

        /* JADX WARNING: Removed duplicated region for block: B:12:0x004a  */
        /* JADX WARNING: Removed duplicated region for block: B:36:0x00ee  */
        /* JADX WARNING: Removed duplicated region for block: B:38:0x00f2  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final n.e b(n.y r27) {
            /*
                r26 = this;
                r0 = r26
                r1 = r27
                java.lang.String r2 = "headers"
                e.x.c.i.e(r1, r2)
                int r2 = r27.size()
                r6 = 1
                r8 = r6
                r7 = 0
                r9 = 0
                r10 = 0
                r11 = 0
                r12 = -1
                r13 = -1
                r14 = 0
                r15 = 0
                r16 = 0
                r17 = -1
                r18 = -1
                r19 = 0
                r20 = 0
                r21 = 0
            L_0x0023:
                if (r7 >= r2) goto L_0x0191
                java.lang.String r3 = r1.e(r7)
                java.lang.String r4 = r1.p(r7)
                java.lang.String r5 = "Cache-Control"
                boolean r5 = e.c0.h.f(r3, r5, r6)
                if (r5 == 0) goto L_0x003a
                if (r9 == 0) goto L_0x0038
                goto L_0x0042
            L_0x0038:
                r9 = r4
                goto L_0x0043
            L_0x003a:
                java.lang.String r5 = "Pragma"
                boolean r3 = e.c0.h.f(r3, r5, r6)
                if (r3 == 0) goto L_0x0185
            L_0x0042:
                r8 = 0
            L_0x0043:
                r3 = 0
            L_0x0044:
                int r5 = r4.length()
                if (r3 >= r5) goto L_0x0180
                java.lang.String r5 = "=,;"
                int r5 = r0.a(r4, r5, r3)
                java.lang.String r3 = r4.substring(r3, r5)
                java.lang.String r6 = "(this as java.lang.Strin…ing(startIndex, endIndex)"
                e.x.c.i.d(r3, r6)
                java.lang.CharSequence r3 = e.c0.h.N(r3)
                java.lang.String r3 = r3.toString()
                int r1 = r4.length()
                if (r5 == r1) goto L_0x00dc
                char r1 = r4.charAt(r5)
                r24 = r2
                r2 = 44
                if (r1 == r2) goto L_0x00de
                char r1 = r4.charAt(r5)
                r2 = 59
                if (r1 != r2) goto L_0x007a
                goto L_0x00de
            L_0x007a:
                int r5 = r5 + 1
                byte[] r1 = n.m0.c.a
                java.lang.String r1 = "$this$indexOfNonWhitespace"
                e.x.c.i.e(r4, r1)
                int r1 = r4.length()
            L_0x0087:
                if (r5 >= r1) goto L_0x009d
                char r2 = r4.charAt(r5)
                r25 = r1
                r1 = 32
                if (r2 == r1) goto L_0x0098
                r1 = 9
                if (r2 == r1) goto L_0x0098
                goto L_0x00a1
            L_0x0098:
                int r5 = r5 + 1
                r1 = r25
                goto L_0x0087
            L_0x009d:
                int r5 = r4.length()
            L_0x00a1:
                int r1 = r4.length()
                if (r5 >= r1) goto L_0x00c3
                char r1 = r4.charAt(r5)
                r2 = 34
                if (r1 != r2) goto L_0x00c3
                int r5 = r5 + 1
                r1 = 4
                r25 = r9
                r9 = 0
                int r1 = e.c0.h.k(r4, r2, r5, r9, r1)
                java.lang.String r2 = r4.substring(r5, r1)
                e.x.c.i.d(r2, r6)
                r5 = 1
                int r1 = r1 + r5
                goto L_0x00e5
            L_0x00c3:
                r25 = r9
                r9 = 0
                java.lang.String r1 = ",;"
                int r1 = r0.a(r4, r1, r5)
                java.lang.String r2 = r4.substring(r5, r1)
                e.x.c.i.d(r2, r6)
                java.lang.CharSequence r2 = e.c0.h.N(r2)
                java.lang.String r2 = r2.toString()
                goto L_0x00e5
            L_0x00dc:
                r24 = r2
            L_0x00de:
                r25 = r9
                r9 = 0
                int r5 = r5 + 1
                r1 = r5
                r2 = 0
            L_0x00e5:
                java.lang.String r5 = "no-cache"
                r6 = 1
                boolean r5 = e.c0.h.f(r5, r3, r6)
                if (r5 == 0) goto L_0x00f2
                r10 = r6
            L_0x00ef:
                r5 = -1
                goto L_0x0177
            L_0x00f2:
                java.lang.String r5 = "no-store"
                boolean r5 = e.c0.h.f(r5, r3, r6)
                if (r5 == 0) goto L_0x00fc
                r11 = r6
                goto L_0x00ef
            L_0x00fc:
                java.lang.String r5 = "max-age"
                boolean r5 = e.c0.h.f(r5, r3, r6)
                if (r5 == 0) goto L_0x010b
                r5 = -1
                int r12 = n.m0.c.z(r2, r5)
                goto L_0x0177
            L_0x010b:
                r5 = -1
                java.lang.String r9 = "s-maxage"
                boolean r9 = e.c0.h.f(r9, r3, r6)
                if (r9 == 0) goto L_0x0119
                int r13 = n.m0.c.z(r2, r5)
                goto L_0x0177
            L_0x0119:
                java.lang.String r5 = "private"
                boolean r5 = e.c0.h.f(r5, r3, r6)
                if (r5 == 0) goto L_0x0123
                r14 = r6
                goto L_0x00ef
            L_0x0123:
                java.lang.String r5 = "public"
                boolean r5 = e.c0.h.f(r5, r3, r6)
                if (r5 == 0) goto L_0x012d
                r15 = r6
                goto L_0x00ef
            L_0x012d:
                java.lang.String r5 = "must-revalidate"
                boolean r5 = e.c0.h.f(r5, r3, r6)
                if (r5 == 0) goto L_0x0138
                r16 = r6
                goto L_0x00ef
            L_0x0138:
                java.lang.String r5 = "max-stale"
                boolean r5 = e.c0.h.f(r5, r3, r6)
                if (r5 == 0) goto L_0x0148
                r3 = 2147483647(0x7fffffff, float:NaN)
                int r17 = n.m0.c.z(r2, r3)
                goto L_0x00ef
            L_0x0148:
                java.lang.String r5 = "min-fresh"
                boolean r5 = e.c0.h.f(r5, r3, r6)
                if (r5 == 0) goto L_0x0156
                r5 = -1
                int r18 = n.m0.c.z(r2, r5)
                goto L_0x0177
            L_0x0156:
                r5 = -1
                java.lang.String r2 = "only-if-cached"
                boolean r2 = e.c0.h.f(r2, r3, r6)
                if (r2 == 0) goto L_0x0162
                r19 = r6
                goto L_0x0177
            L_0x0162:
                java.lang.String r2 = "no-transform"
                boolean r2 = e.c0.h.f(r2, r3, r6)
                if (r2 == 0) goto L_0x016d
                r20 = r6
                goto L_0x0177
            L_0x016d:
                java.lang.String r2 = "immutable"
                boolean r2 = e.c0.h.f(r2, r3, r6)
                if (r2 == 0) goto L_0x0177
                r21 = r6
            L_0x0177:
                r3 = r1
                r2 = r24
                r9 = r25
                r1 = r27
                goto L_0x0044
            L_0x0180:
                r24 = r2
                r25 = r9
                goto L_0x0188
            L_0x0185:
                r24 = r2
                r3 = r9
            L_0x0188:
                r5 = -1
                int r7 = r7 + 1
                r1 = r27
                r2 = r24
                goto L_0x0023
            L_0x0191:
                r3 = r9
                if (r8 != 0) goto L_0x0197
                r22 = 0
                goto L_0x0199
            L_0x0197:
                r22 = r3
            L_0x0199:
                n.e r1 = new n.e
                r23 = 0
                r9 = r1
                r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: n.e.a.b(n.y):n.e");
        }
    }

    static {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        i.e(timeUnit, "timeUnit");
        timeUnit.toSeconds((long) ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED);
    }

    public e(boolean z, boolean z2, int i2, int i3, boolean z3, boolean z4, boolean z5, int i4, int i5, boolean z6, boolean z7, boolean z8, String str, DefaultConstructorMarker defaultConstructorMarker) {
        this.a = z;
        this.f10083b = z2;
        this.c = i2;
        this.d = i3;
        this.f10084e = z3;
        this.f = z4;
        this.f10085g = z5;
        this.f10086h = i4;
        this.f10087i = i5;
        this.f10088j = z6;
        this.f10089k = z7;
        this.f10090l = z8;
        this.f10091m = str;
    }

    public String toString() {
        String str = this.f10091m;
        if (str != null) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        if (this.a) {
            sb.append("no-cache, ");
        }
        if (this.f10083b) {
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
        if (this.f10084e) {
            sb.append("private, ");
        }
        if (this.f) {
            sb.append("public, ");
        }
        if (this.f10085g) {
            sb.append("must-revalidate, ");
        }
        if (this.f10086h != -1) {
            sb.append("max-stale=");
            sb.append(this.f10086h);
            sb.append(", ");
        }
        if (this.f10087i != -1) {
            sb.append("min-fresh=");
            sb.append(this.f10087i);
            sb.append(", ");
        }
        if (this.f10088j) {
            sb.append("only-if-cached, ");
        }
        if (this.f10089k) {
            sb.append("no-transform, ");
        }
        if (this.f10090l) {
            sb.append("immutable, ");
        }
        if (sb.length() == 0) {
            return "";
        }
        sb.delete(sb.length() - 2, sb.length());
        String sb2 = sb.toString();
        i.d(sb2, "StringBuilder().apply(builderAction).toString()");
        this.f10091m = sb2;
        return sb2;
    }
}
