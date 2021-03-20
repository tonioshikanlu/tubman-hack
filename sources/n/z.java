package n;

import androidx.exifinterface.media.ExifInterface;
import com.google.android.material.badge.BadgeDrawable;
import e.c0.h;
import e.x.c.i;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.regex.Pattern;
import kotlin.jvm.internal.DefaultConstructorMarker;
import n.m0.c;
import o.e;

public final class z {

    /* renamed from: k  reason: collision with root package name */
    public static final char[] f10428k = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: l  reason: collision with root package name */
    public static final b f10429l = new b((DefaultConstructorMarker) null);
    public final boolean a;

    /* renamed from: b  reason: collision with root package name */
    public final String f10430b;
    public final String c;
    public final String d;

    /* renamed from: e  reason: collision with root package name */
    public final String f10431e;
    public final int f;

    /* renamed from: g  reason: collision with root package name */
    public final List<String> f10432g;

    /* renamed from: h  reason: collision with root package name */
    public final List<String> f10433h;

    /* renamed from: i  reason: collision with root package name */
    public final String f10434i;

    /* renamed from: j  reason: collision with root package name */
    public final String f10435j;

    public static final class a {

        /* renamed from: i  reason: collision with root package name */
        public static final C0239a f10436i = new C0239a((DefaultConstructorMarker) null);
        public String a;

        /* renamed from: b  reason: collision with root package name */
        public String f10437b = "";
        public String c = "";
        public String d;

        /* renamed from: e  reason: collision with root package name */
        public int f10438e = -1;
        public final List<String> f;

        /* renamed from: g  reason: collision with root package name */
        public List<String> f10439g;

        /* renamed from: h  reason: collision with root package name */
        public String f10440h;

        /* renamed from: n.z$a$a  reason: collision with other inner class name */
        public static final class C0239a {
            public C0239a(DefaultConstructorMarker defaultConstructorMarker) {
            }
        }

        public a() {
            ArrayList arrayList = new ArrayList();
            this.f = arrayList;
            arrayList.add("");
        }

        public final a a(String str) {
            i.e(str, "encodedPathSegment");
            f(str, 0, str.length(), false, true);
            return this;
        }

        public final z b() {
            ArrayList arrayList;
            ArrayList arrayList2;
            String str;
            b bVar = z.f10429l;
            String str2 = this.a;
            if (str2 != null) {
                b bVar2 = bVar;
                String d2 = b.d(bVar2, this.f10437b, 0, 0, false, 7);
                String d3 = b.d(bVar2, this.c, 0, 0, false, 7);
                String str3 = this.d;
                if (str3 != null) {
                    int c2 = c();
                    List<String> list = this.f;
                    ArrayList arrayList3 = new ArrayList(b.q.a.a.C(list, 10));
                    for (String d4 : list) {
                        arrayList3.add(b.d(bVar, d4, 0, 0, false, 7));
                    }
                    List<String> list2 = this.f10439g;
                    if (list2 != null) {
                        ArrayList arrayList4 = new ArrayList(b.q.a.a.C(list2, 10));
                        for (String str4 : list2) {
                            if (str4 != null) {
                                arrayList2 = arrayList4;
                                str = b.d(bVar, str4, 0, 0, true, 3);
                            } else {
                                arrayList2 = arrayList4;
                                str = null;
                            }
                            arrayList2.add(str);
                            arrayList4 = arrayList2;
                        }
                        arrayList = arrayList4;
                    } else {
                        arrayList = null;
                    }
                    String str5 = this.f10440h;
                    return new z(str2, d2, d3, str3, c2, arrayList3, arrayList, str5 != null ? b.d(bVar, str5, 0, 0, false, 7) : null, toString());
                }
                throw new IllegalStateException("host == null");
            }
            throw new IllegalStateException("scheme == null");
        }

        public final int c() {
            int i2 = this.f10438e;
            if (i2 != -1) {
                return i2;
            }
            String str = this.a;
            i.c(str);
            i.e(str, "scheme");
            int hashCode = str.hashCode();
            if (hashCode != 3213448) {
                if (hashCode == 99617003 && str.equals("https")) {
                    return 443;
                }
            } else if (str.equals("http")) {
                return 80;
            }
            return -1;
        }

        public final a d(String str) {
            List<String> list;
            if (str != null) {
                b bVar = z.f10429l;
                list = bVar.e(b.a(bVar, str, 0, 0, " \"'<>#", true, false, true, false, (Charset) null, 211));
            } else {
                list = null;
            }
            this.f10439g = list;
            return this;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:106:0x0261, code lost:
            if (65535 < r1) goto L_0x026c;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:28:0x0081, code lost:
            if (r9 == ':') goto L_0x0085;
         */
        /* JADX WARNING: Removed duplicated region for block: B:101:0x0225  */
        /* JADX WARNING: Removed duplicated region for block: B:118:0x029f  */
        /* JADX WARNING: Removed duplicated region for block: B:121:0x02c7  */
        /* JADX WARNING: Removed duplicated region for block: B:122:0x02c9  */
        /* JADX WARNING: Removed duplicated region for block: B:124:0x02cc  */
        /* JADX WARNING: Removed duplicated region for block: B:136:0x0324  */
        /* JADX WARNING: Removed duplicated region for block: B:155:0x03ac  */
        /* JADX WARNING: Removed duplicated region for block: B:179:0x021c A[SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:184:0x0352 A[SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:32:0x0089  */
        /* JADX WARNING: Removed duplicated region for block: B:40:0x00c6  */
        /* JADX WARNING: Removed duplicated region for block: B:63:0x013a  */
        /* JADX WARNING: Removed duplicated region for block: B:64:0x013f  */
        /* JADX WARNING: Removed duplicated region for block: B:88:0x01fd  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final n.z.a e(n.z r26, java.lang.String r27) {
            /*
                r25 = this;
                r0 = r25
                r1 = r26
                r12 = r27
                n.z$b r13 = n.z.f10429l
                java.lang.String r2 = "input"
                e.x.c.i.e(r12, r2)
                byte[] r2 = n.m0.c.a
                int r2 = r27.length()
                r3 = 0
                int r2 = n.m0.c.n(r12, r3, r2)
                int r4 = r27.length()
                int r14 = n.m0.c.o(r12, r2, r4)
                int r4 = r14 - r2
                r5 = 2
                r6 = 58
                r7 = -1
                r8 = 1
                if (r4 >= r5) goto L_0x002b
                goto L_0x0084
            L_0x002b:
                char r4 = r12.charAt(r2)
                r5 = 97
                int r9 = e.x.c.i.g(r4, r5)
                r10 = 90
                r11 = 122(0x7a, float:1.71E-43)
                r15 = 65
                if (r9 < 0) goto L_0x0043
                int r9 = e.x.c.i.g(r4, r11)
                if (r9 <= 0) goto L_0x0050
            L_0x0043:
                int r9 = e.x.c.i.g(r4, r15)
                if (r9 < 0) goto L_0x0084
                int r4 = e.x.c.i.g(r4, r10)
                if (r4 <= 0) goto L_0x0050
                goto L_0x0084
            L_0x0050:
                r4 = r2
            L_0x0051:
                int r4 = r4 + r8
                if (r4 >= r14) goto L_0x0084
                char r9 = r12.charAt(r4)
                if (r5 <= r9) goto L_0x005b
                goto L_0x005e
            L_0x005b:
                if (r11 < r9) goto L_0x005e
                goto L_0x007c
            L_0x005e:
                if (r15 <= r9) goto L_0x0061
                goto L_0x0064
            L_0x0061:
                if (r10 < r9) goto L_0x0064
                goto L_0x007c
            L_0x0064:
                r5 = 57
                r15 = 48
                if (r15 <= r9) goto L_0x006b
                goto L_0x006e
            L_0x006b:
                if (r5 < r9) goto L_0x006e
                goto L_0x007c
            L_0x006e:
                r5 = 43
                if (r9 != r5) goto L_0x0073
                goto L_0x007c
            L_0x0073:
                r5 = 45
                if (r9 != r5) goto L_0x0078
                goto L_0x007c
            L_0x0078:
                r5 = 46
                if (r9 != r5) goto L_0x0081
            L_0x007c:
                r15 = 65
                r5 = 97
                goto L_0x0051
            L_0x0081:
                if (r9 != r6) goto L_0x0084
                goto L_0x0085
            L_0x0084:
                r4 = r7
            L_0x0085:
                java.lang.String r15 = "(this as java.lang.Strin…ing(startIndex, endIndex)"
                if (r4 == r7) goto L_0x00c6
                java.lang.String r5 = "https:"
                boolean r5 = e.c0.h.z(r12, r5, r2, r8)
                if (r5 == 0) goto L_0x0098
                java.lang.String r4 = "https"
                r0.a = r4
                int r2 = r2 + 6
                goto L_0x00cc
            L_0x0098:
                java.lang.String r5 = "http:"
                boolean r5 = e.c0.h.z(r12, r5, r2, r8)
                if (r5 == 0) goto L_0x00a7
                java.lang.String r4 = "http"
                r0.a = r4
                int r2 = r2 + 5
                goto L_0x00cc
            L_0x00a7:
                java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
                java.lang.String r2 = "Expected URL scheme 'http' or 'https' but was '"
                java.lang.StringBuilder r2 = b.e.a.a.a.y(r2)
                java.lang.String r3 = r12.substring(r3, r4)
                e.x.c.i.d(r3, r15)
                r2.append(r3)
                java.lang.String r3 = "'"
                r2.append(r3)
                java.lang.String r2 = r2.toString()
                r1.<init>(r2)
                throw r1
            L_0x00c6:
                if (r1 == 0) goto L_0x03d1
                java.lang.String r4 = r1.f10430b
                r0.a = r4
            L_0x00cc:
                r4 = r2
            L_0x00cd:
                r5 = 47
                r6 = 92
                if (r4 >= r14) goto L_0x00e0
                char r9 = r12.charAt(r4)
                if (r9 == r6) goto L_0x00db
                if (r9 != r5) goto L_0x00e0
            L_0x00db:
                int r3 = r3 + 1
                int r4 = r4 + 1
                goto L_0x00cd
            L_0x00e0:
                r4 = 63
                r9 = 35
                r10 = 2
                if (r3 >= r10) goto L_0x012a
                if (r1 == 0) goto L_0x012a
                java.lang.String r10 = r1.f10430b
                java.lang.String r11 = r0.a
                boolean r10 = e.x.c.i.a(r10, r11)
                r10 = r10 ^ r8
                if (r10 == 0) goto L_0x00f5
                goto L_0x012a
            L_0x00f5:
                java.lang.String r3 = r26.e()
                r0.f10437b = r3
                java.lang.String r3 = r26.a()
                r0.c = r3
                java.lang.String r3 = r1.f10431e
                r0.d = r3
                int r3 = r1.f
                r0.f10438e = r3
                java.util.List<java.lang.String> r3 = r0.f
                r3.clear()
                java.util.List<java.lang.String> r3 = r0.f
                java.util.List r4 = r26.c()
                r3.addAll(r4)
                if (r2 == r14) goto L_0x011f
                char r3 = r12.charAt(r2)
                if (r3 != r9) goto L_0x0126
            L_0x011f:
                java.lang.String r1 = r26.d()
                r0.d(r1)
            L_0x0126:
                r18 = r14
                goto L_0x02cd
            L_0x012a:
                int r2 = r2 + r3
                r1 = 0
                r3 = 0
                r16 = r1
                r11 = r2
                r17 = r3
            L_0x0132:
                java.lang.String r1 = "@/\\?#"
                int r10 = n.m0.c.g(r12, r1, r11, r14)
                if (r10 == r14) goto L_0x013f
                char r1 = r12.charAt(r10)
                goto L_0x0140
            L_0x013f:
                r1 = r7
            L_0x0140:
                if (r1 == r7) goto L_0x01f7
                if (r1 == r9) goto L_0x01f7
                if (r1 == r5) goto L_0x01f7
                if (r1 == r6) goto L_0x01f7
                if (r1 == r4) goto L_0x01f7
                r2 = 64
                if (r1 == r2) goto L_0x0152
                r18 = r14
                goto L_0x01ea
            L_0x0152:
                java.lang.String r9 = "%40"
                if (r16 != 0) goto L_0x01b6
                r1 = 58
                int r8 = n.m0.c.f(r12, r1, r11, r10)
                r6 = 1
                r7 = 0
                r18 = 0
                r19 = 0
                r20 = 0
                r21 = 240(0xf0, float:3.36E-43)
                java.lang.String r5 = " \"':;<=>@[]^`{}|/\\?#"
                r1 = r13
                r2 = r27
                r3 = r11
                r4 = r8
                r11 = r8
                r8 = r18
                r22 = r9
                r9 = r19
                r23 = r10
                r10 = r20
                r18 = r14
                r14 = r11
                r11 = r21
                java.lang.String r1 = n.z.b.a(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
                if (r17 == 0) goto L_0x0190
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = r0.f10437b
                r4 = r22
                java.lang.String r1 = b.e.a.a.a.r(r2, r3, r4, r1)
            L_0x0190:
                r0.f10437b = r1
                r11 = r23
                if (r14 == r11) goto L_0x01b1
                int r3 = r14 + 1
                r6 = 1
                r7 = 0
                r8 = 0
                r9 = 0
                r10 = 0
                r14 = 240(0xf0, float:3.36E-43)
                java.lang.String r5 = " \"':;<=>@[]^`{}|/\\?#"
                r1 = r13
                r2 = r27
                r4 = r11
                r23 = r11
                r11 = r14
                java.lang.String r1 = n.z.b.a(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
                r0.c = r1
                r16 = 1
                goto L_0x01b3
            L_0x01b1:
                r23 = r11
            L_0x01b3:
                r17 = 1
                goto L_0x01e6
            L_0x01b6:
                r4 = r9
                r23 = r10
                r18 = r14
                java.lang.StringBuilder r14 = new java.lang.StringBuilder
                r14.<init>()
                java.lang.String r1 = r0.c
                r14.append(r1)
                r14.append(r4)
                r6 = 1
                r7 = 0
                r8 = 0
                r9 = 0
                r10 = 0
                r19 = 240(0xf0, float:3.36E-43)
                java.lang.String r5 = " \"':;<=>@[]^`{}|/\\?#"
                r1 = r13
                r2 = r27
                r3 = r11
                r4 = r23
                r11 = r19
                java.lang.String r1 = n.z.b.a(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
                r14.append(r1)
                java.lang.String r1 = r14.toString()
                r0.c = r1
            L_0x01e6:
                r14 = r23
                int r11 = r14 + 1
            L_0x01ea:
                r9 = 35
                r4 = 63
                r6 = 92
                r5 = 47
                r7 = -1
                r14 = r18
                goto L_0x0132
            L_0x01f7:
                r18 = r14
                r14 = r10
                r10 = r11
            L_0x01fb:
                if (r10 >= r14) goto L_0x021c
                char r1 = r12.charAt(r10)
                r2 = 58
                if (r1 == r2) goto L_0x0219
                r2 = 91
                if (r1 == r2) goto L_0x020a
                goto L_0x0216
            L_0x020a:
                int r10 = r10 + 1
                if (r10 >= r14) goto L_0x0216
                char r1 = r12.charAt(r10)
                r2 = 93
                if (r1 != r2) goto L_0x020a
            L_0x0216:
                int r10 = r10 + 1
                goto L_0x01fb
            L_0x0219:
                r1 = 1
                r7 = r1
                goto L_0x021f
            L_0x021c:
                r1 = 1
                r7 = r1
                r10 = r14
            L_0x021f:
                int r9 = r10 + 1
                r8 = 34
                if (r9 >= r14) goto L_0x029f
                r5 = 0
                r6 = 4
                r1 = r13
                r2 = r27
                r3 = r11
                r4 = r10
                java.lang.String r1 = n.z.b.d(r1, r2, r3, r4, r5, r6)
                java.lang.String r1 = e.a.a.a.y0.m.o1.c.o0(r1)
                r0.d = r1
                java.lang.String r5 = ""
                r6 = 0
                r7 = 0
                r8 = 0
                r16 = 0
                r17 = 0
                r19 = 248(0xf8, float:3.48E-43)
                r1 = r13
                r2 = r27
                r3 = r9
                r4 = r14
                r24 = r9
                r9 = r16
                r26 = r10
                r10 = r17
                r16 = r11
                r11 = r19
                java.lang.String r1 = n.z.b.a(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)     // Catch:{ NumberFormatException -> 0x0264 }
                int r1 = java.lang.Integer.parseInt(r1)     // Catch:{ NumberFormatException -> 0x0264 }
                r2 = 65535(0xffff, float:9.1834E-41)
                r7 = 1
                if (r7 <= r1) goto L_0x0261
                goto L_0x026c
            L_0x0261:
                if (r2 < r1) goto L_0x026c
                goto L_0x026d
            L_0x0264:
                r7 = 1
                goto L_0x026c
            L_0x0266:
                r24 = r9
                r26 = r10
                r16 = r11
            L_0x026c:
                r1 = -1
            L_0x026d:
                r0.f10438e = r1
                r2 = -1
                if (r1 == r2) goto L_0x0274
                r1 = r7
                goto L_0x0275
            L_0x0274:
                r1 = 0
            L_0x0275:
                if (r1 == 0) goto L_0x027a
                r8 = 34
                goto L_0x02c1
            L_0x027a:
                java.lang.String r1 = "Invalid URL port: \""
                java.lang.StringBuilder r1 = b.e.a.a.a.y(r1)
                r10 = r24
                java.lang.String r2 = r12.substring(r10, r14)
                e.x.c.i.d(r2, r15)
                r1.append(r2)
                r2 = 34
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
                java.lang.String r1 = r1.toString()
                r2.<init>(r1)
                throw r2
            L_0x029f:
                r26 = r10
                r16 = r11
                r5 = 0
                r6 = 4
                r1 = r13
                r2 = r27
                r3 = r16
                r4 = r26
                java.lang.String r1 = n.z.b.d(r1, r2, r3, r4, r5, r6)
                java.lang.String r1 = e.a.a.a.y0.m.o1.c.o0(r1)
                r0.d = r1
                java.lang.String r1 = r0.a
                e.x.c.i.c(r1)
                int r1 = r13.b(r1)
                r0.f10438e = r1
            L_0x02c1:
                r1 = r8
                r8 = r7
                java.lang.String r2 = r0.d
                if (r2 == 0) goto L_0x02c9
                r2 = r8
                goto L_0x02ca
            L_0x02c9:
                r2 = 0
            L_0x02ca:
                if (r2 == 0) goto L_0x03ac
                r2 = r14
            L_0x02cd:
                java.lang.String r1 = "?#"
                r3 = r18
                int r1 = n.m0.c.g(r12, r1, r2, r3)
                if (r2 != r1) goto L_0x02df
                r8 = r1
                r14 = r3
                r1 = r12
                r15 = r13
                r13 = r1
                r12 = r0
                goto L_0x0356
            L_0x02df:
                char r4 = r12.charAt(r2)
                java.lang.String r5 = ""
                r6 = 47
                if (r4 == r6) goto L_0x0304
                r6 = 92
                if (r4 != r6) goto L_0x02ee
                goto L_0x0304
            L_0x02ee:
                java.util.List<java.lang.String> r4 = r0.f
                int r6 = r4.size()
                int r6 = r6 - r8
                r4.set(r6, r5)
                r10 = r0
                r11 = r10
                r9 = r1
                r4 = r2
                r16 = r3
                r14 = r12
                r15 = r13
                r13 = r8
                r8 = r9
                r1 = r14
                goto L_0x0322
            L_0x0304:
                java.util.List<java.lang.String> r4 = r0.f
                r4.clear()
                java.util.List<java.lang.String> r4 = r0.f
                r4.add(r5)
                r6 = r0
                r7 = r6
                r4 = r1
                r5 = r2
                r14 = r3
                r2 = r12
                r3 = r4
                r1 = r2
            L_0x0316:
                int r5 = r5 + r8
                r9 = r4
                r4 = r5
                r10 = r6
                r11 = r7
                r15 = r13
                r16 = r14
                r13 = r8
                r14 = r12
                r12 = r2
                r8 = r3
            L_0x0322:
                if (r4 >= r9) goto L_0x0352
                java.lang.String r2 = "/\\"
                int r7 = n.m0.c.g(r14, r2, r4, r9)
                if (r7 >= r9) goto L_0x032f
                r17 = r13
                goto L_0x0332
            L_0x032f:
                r2 = 0
                r17 = r2
            L_0x0332:
                r18 = 1
                r2 = r11
                r3 = r14
                r5 = r7
                r6 = r17
                r19 = r7
                r7 = r18
                r2.f(r3, r4, r5, r6, r7)
                if (r17 == 0) goto L_0x034f
                r3 = r8
                r4 = r9
                r6 = r10
                r7 = r11
                r2 = r12
                r8 = r13
                r12 = r14
                r13 = r15
                r14 = r16
                r5 = r19
                goto L_0x0316
            L_0x034f:
                r4 = r19
                goto L_0x0322
            L_0x0352:
                r13 = r12
                r14 = r16
                r12 = r10
            L_0x0356:
                if (r8 >= r14) goto L_0x038c
                char r2 = r1.charAt(r8)
                r3 = 63
                if (r2 != r3) goto L_0x038c
                r11 = 35
                int r16 = n.m0.c.f(r1, r11, r8, r14)
                int r4 = r8 + 1
                r7 = 1
                r8 = 0
                r9 = 1
                r10 = 0
                r17 = 0
                r18 = 208(0xd0, float:2.91E-43)
                java.lang.String r6 = " \"'<>#"
                r2 = r15
                r3 = r13
                r5 = r16
                r19 = r11
                r11 = r17
                r0 = r12
                r12 = r18
                java.lang.String r2 = n.z.b.a(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
                java.util.List r2 = r15.e(r2)
                r0.f10439g = r2
                r8 = r16
                r11 = r19
                goto L_0x038f
            L_0x038c:
                r0 = r12
                r11 = 35
            L_0x038f:
                if (r8 >= r14) goto L_0x03ab
                char r1 = r1.charAt(r8)
                if (r1 != r11) goto L_0x03ab
                int r4 = r8 + 1
                r7 = 1
                r8 = 0
                r9 = 0
                r10 = 1
                r11 = 0
                r12 = 176(0xb0, float:2.47E-43)
                java.lang.String r6 = ""
                r2 = r15
                r3 = r13
                r5 = r14
                java.lang.String r1 = n.z.b.a(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
                r0.f10440h = r1
            L_0x03ab:
                return r0
            L_0x03ac:
                java.lang.String r0 = "Invalid URL host: \""
                java.lang.StringBuilder r0 = b.e.a.a.a.y(r0)
                r14 = r26
                r2 = r16
                java.lang.String r2 = r12.substring(r2, r14)
                e.x.c.i.d(r2, r15)
                r0.append(r2)
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
                java.lang.String r0 = r0.toString()
                r1.<init>(r0)
                throw r1
            L_0x03d1:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.String r1 = "Expected URL scheme 'http' or 'https' but no colon was found"
                r0.<init>(r1)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: n.z.a.e(n.z, java.lang.String):n.z$a");
        }

        public final void f(String str, int i2, int i3, boolean z, boolean z2) {
            String a2 = b.a(z.f10429l, str, i2, i3, " \"<>^`{}|/\\?#", z2, false, false, false, (Charset) null, 240);
            boolean z3 = false;
            if (!(i.a(a2, ".") || h.f(a2, "%2e", true))) {
                if (i.a(a2, "..") || h.f(a2, "%2e.", true) || h.f(a2, ".%2e", true) || h.f(a2, "%2e%2e", true)) {
                    List<String> list = this.f;
                    if (list.remove(list.size() - 1).length() == 0) {
                        z3 = true;
                    }
                    if (!z3 || !(!this.f.isEmpty())) {
                        this.f.add("");
                        return;
                    }
                    List<String> list2 = this.f;
                    list2.set(list2.size() - 1, "");
                    return;
                }
                List<String> list3 = this.f;
                if (list3.get(list3.size() - 1).length() == 0) {
                    z3 = true;
                }
                List<String> list4 = this.f;
                if (z3) {
                    list4.set(list4.size() - 1, a2);
                } else {
                    list4.add(a2);
                }
                if (z) {
                    this.f.add("");
                }
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0030, code lost:
            if ((r9.c.length() > 0) != false) goto L_0x0032;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:43:0x00b0, code lost:
            if (r1 != r5) goto L_0x00b2;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.String toString() {
            /*
                r9 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = r9.a
                if (r1 == 0) goto L_0x000f
                r0.append(r1)
                java.lang.String r1 = "://"
                goto L_0x0011
            L_0x000f:
                java.lang.String r1 = "//"
            L_0x0011:
                r0.append(r1)
                java.lang.String r1 = r9.f10437b
                int r1 = r1.length()
                r2 = 1
                r3 = 0
                if (r1 <= 0) goto L_0x0020
                r1 = r2
                goto L_0x0021
            L_0x0020:
                r1 = r3
            L_0x0021:
                r4 = 58
                if (r1 != 0) goto L_0x0032
                java.lang.String r1 = r9.c
                int r1 = r1.length()
                if (r1 <= 0) goto L_0x002f
                r1 = r2
                goto L_0x0030
            L_0x002f:
                r1 = r3
            L_0x0030:
                if (r1 == 0) goto L_0x0050
            L_0x0032:
                java.lang.String r1 = r9.f10437b
                r0.append(r1)
                java.lang.String r1 = r9.c
                int r1 = r1.length()
                if (r1 <= 0) goto L_0x0040
                goto L_0x0041
            L_0x0040:
                r2 = r3
            L_0x0041:
                if (r2 == 0) goto L_0x004b
                r0.append(r4)
                java.lang.String r1 = r9.c
                r0.append(r1)
            L_0x004b:
                r1 = 64
                r0.append(r1)
            L_0x0050:
                java.lang.String r1 = r9.d
                r2 = 2
                if (r1 == 0) goto L_0x0073
                e.x.c.i.c(r1)
                boolean r1 = e.c0.h.c(r1, r4, r3, r2)
                if (r1 == 0) goto L_0x006e
                r1 = 91
                r0.append(r1)
                java.lang.String r1 = r9.d
                r0.append(r1)
                r1 = 93
                r0.append(r1)
                goto L_0x0073
            L_0x006e:
                java.lang.String r1 = r9.d
                r0.append(r1)
            L_0x0073:
                int r1 = r9.f10438e
                r5 = -1
                if (r1 != r5) goto L_0x007c
                java.lang.String r1 = r9.a
                if (r1 == 0) goto L_0x00b8
            L_0x007c:
                int r1 = r9.c()
                java.lang.String r6 = r9.a
                if (r6 == 0) goto L_0x00b2
                e.x.c.i.c(r6)
                java.lang.String r7 = "scheme"
                e.x.c.i.e(r6, r7)
                int r7 = r6.hashCode()
                r8 = 3213448(0x310888, float:4.503E-39)
                if (r7 == r8) goto L_0x00a6
                r8 = 99617003(0x5f008eb, float:2.2572767E-35)
                if (r7 == r8) goto L_0x009b
                goto L_0x00b0
            L_0x009b:
                java.lang.String r7 = "https"
                boolean r6 = r6.equals(r7)
                if (r6 == 0) goto L_0x00b0
                r5 = 443(0x1bb, float:6.21E-43)
                goto L_0x00b0
            L_0x00a6:
                java.lang.String r7 = "http"
                boolean r6 = r6.equals(r7)
                if (r6 == 0) goto L_0x00b0
                r5 = 80
            L_0x00b0:
                if (r1 == r5) goto L_0x00b8
            L_0x00b2:
                r0.append(r4)
                r0.append(r1)
            L_0x00b8:
                java.util.List<java.lang.String> r1 = r9.f
                java.lang.String r4 = "$this$toPathString"
                e.x.c.i.e(r1, r4)
                java.lang.String r4 = "out"
                e.x.c.i.e(r0, r4)
                int r5 = r1.size()
                r6 = r3
            L_0x00c9:
                if (r6 >= r5) goto L_0x00dc
                r7 = 47
                r0.append(r7)
                java.lang.Object r7 = r1.get(r6)
                java.lang.String r7 = (java.lang.String) r7
                r0.append(r7)
                int r6 = r6 + 1
                goto L_0x00c9
            L_0x00dc:
                java.util.List<java.lang.String> r1 = r9.f10439g
                if (r1 == 0) goto L_0x0131
                r1 = 63
                r0.append(r1)
                java.util.List<java.lang.String> r1 = r9.f10439g
                e.x.c.i.c(r1)
                java.lang.String r5 = "$this$toQueryString"
                e.x.c.i.e(r1, r5)
                e.x.c.i.e(r0, r4)
                int r4 = r1.size()
                e.a0.d r3 = e.a0.e.d(r3, r4)
                e.a0.b r2 = e.a0.e.c(r3, r2)
                int r3 = r2.f7883h
                int r4 = r2.f7884i
                int r2 = r2.f7885j
                if (r2 < 0) goto L_0x0109
                if (r3 > r4) goto L_0x0131
                goto L_0x010b
            L_0x0109:
                if (r3 < r4) goto L_0x0131
            L_0x010b:
                java.lang.Object r5 = r1.get(r3)
                java.lang.String r5 = (java.lang.String) r5
                int r6 = r3 + 1
                java.lang.Object r6 = r1.get(r6)
                java.lang.String r6 = (java.lang.String) r6
                if (r3 <= 0) goto L_0x0120
                r7 = 38
                r0.append(r7)
            L_0x0120:
                r0.append(r5)
                if (r6 == 0) goto L_0x012d
                r5 = 61
                r0.append(r5)
                r0.append(r6)
            L_0x012d:
                if (r3 == r4) goto L_0x0131
                int r3 = r3 + r2
                goto L_0x010b
            L_0x0131:
                java.lang.String r1 = r9.f10440h
                if (r1 == 0) goto L_0x013f
                r1 = 35
                r0.append(r1)
                java.lang.String r1 = r9.f10440h
                r0.append(r1)
            L_0x013f:
                java.lang.String r0 = r0.toString()
                java.lang.String r1 = "StringBuilder().apply(builderAction).toString()"
                e.x.c.i.d(r0, r1)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: n.z.a.toString():java.lang.String");
        }
    }

    public static final class b {
        public b(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public static String a(b bVar, String str, int i2, int i3, String str2, boolean z, boolean z2, boolean z3, boolean z4, Charset charset, int i4) {
            boolean z5;
            b bVar2 = bVar;
            String str3 = str;
            String str4 = str2;
            int i5 = i4;
            int i6 = (i5 & 1) != 0 ? 0 : i2;
            int length = (i5 & 2) != 0 ? str.length() : i3;
            boolean z6 = (i5 & 8) != 0 ? false : z;
            boolean z7 = (i5 & 16) != 0 ? false : z2;
            boolean z8 = (i5 & 32) != 0 ? false : z3;
            boolean z9 = (i5 & 64) != 0 ? false : z4;
            Charset charset2 = (i5 & 128) != 0 ? null : charset;
            i.e(str3, "$this$canonicalize");
            i.e(str4, "encodeSet");
            int i7 = i6;
            while (i7 < length) {
                int codePointAt = str3.codePointAt(i7);
                int i8 = 2;
                if (codePointAt < 32 || codePointAt == 127 || ((codePointAt >= 128 && !z9) || h.c(str4, (char) codePointAt, false, 2) || ((codePointAt == 37 && (!z6 || (z7 && !bVar2.c(str3, i7, length)))) || (codePointAt == 43 && z8)))) {
                    e eVar = new e();
                    eVar.z0(str3, i6, i7);
                    e eVar2 = null;
                    while (i7 < length) {
                        int codePointAt2 = str3.codePointAt(i7);
                        if (!z6 || !(codePointAt2 == 9 || codePointAt2 == 10 || codePointAt2 == 12 || codePointAt2 == 13)) {
                            if (codePointAt2 != 43 || !z8) {
                                if (codePointAt2 < 32 || codePointAt2 == 127 || (codePointAt2 >= 128 && !z9)) {
                                    z5 = z8;
                                } else {
                                    z5 = z8;
                                    if (!h.c(str4, (char) codePointAt2, false, i8) && (codePointAt2 != 37 || (z6 && (!z7 || bVar2.c(str3, i7, length))))) {
                                        eVar.A0(codePointAt2);
                                        i7 += Character.charCount(codePointAt2);
                                        i8 = 2;
                                        z8 = z5;
                                    }
                                }
                                if (eVar2 == null) {
                                    eVar2 = new e();
                                }
                                if (charset2 == null || i.a(charset2, StandardCharsets.UTF_8)) {
                                    eVar2.A0(codePointAt2);
                                } else {
                                    int charCount = Character.charCount(codePointAt2) + i7;
                                    i.e(str3, "string");
                                    i.e(charset2, "charset");
                                    boolean z10 = true;
                                    if (i7 >= 0) {
                                        if (charCount >= i7) {
                                            if (charCount > str.length()) {
                                                z10 = false;
                                            }
                                            if (!z10) {
                                                StringBuilder z11 = b.e.a.a.a.z("endIndex > string.length: ", charCount, " > ");
                                                z11.append(str.length());
                                                throw new IllegalArgumentException(z11.toString().toString());
                                            } else if (i.a(charset2, e.c0.a.a)) {
                                                eVar2.z0(str3, i7, charCount);
                                            } else {
                                                String substring = str3.substring(i7, charCount);
                                                i.d(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                                                byte[] bytes = substring.getBytes(charset2);
                                                i.d(bytes, "(this as java.lang.String).getBytes(charset)");
                                                eVar2.t0(bytes, 0, bytes.length);
                                            }
                                        } else {
                                            throw new IllegalArgumentException(b.e.a.a.a.i("endIndex < beginIndex: ", charCount, " < ", i7).toString());
                                        }
                                    } else {
                                        throw new IllegalArgumentException(b.e.a.a.a.g("beginIndex < 0: ", i7).toString());
                                    }
                                }
                                while (!eVar2.D()) {
                                    byte readByte = eVar2.readByte() & ExifInterface.MARKER;
                                    eVar.u0(37);
                                    char[] cArr = z.f10428k;
                                    eVar.u0(cArr[(readByte >> 4) & 15]);
                                    eVar.u0(cArr[readByte & 15]);
                                }
                                i7 += Character.charCount(codePointAt2);
                                i8 = 2;
                                z8 = z5;
                            } else {
                                eVar.y0(z6 ? BadgeDrawable.DEFAULT_EXCEED_MAX_BADGE_NUMBER_SUFFIX : "%2B");
                            }
                        }
                        z5 = z8;
                        i7 += Character.charCount(codePointAt2);
                        i8 = 2;
                        z8 = z5;
                    }
                    return eVar.m0();
                }
                i7 += Character.charCount(codePointAt);
            }
            String substring2 = str3.substring(i6, length);
            i.d(substring2, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            return substring2;
        }

        public static String d(b bVar, String str, int i2, int i3, boolean z, int i4) {
            int i5;
            int i6;
            if ((i4 & 1) != 0) {
                i2 = 0;
            }
            if ((i4 & 2) != 0) {
                i3 = str.length();
            }
            if ((i4 & 4) != 0) {
                z = false;
            }
            i.e(str, "$this$percentDecode");
            int i7 = i2;
            while (i5 < i3) {
                char charAt = str.charAt(i5);
                if (charAt == '%' || (charAt == '+' && z)) {
                    e eVar = new e();
                    eVar.z0(str, i2, i5);
                    while (i5 < i3) {
                        int codePointAt = str.codePointAt(i5);
                        if (codePointAt == 37 && (i6 = i5 + 2) < i3) {
                            int q2 = c.q(str.charAt(i5 + 1));
                            int q3 = c.q(str.charAt(i6));
                            if (!(q2 == -1 || q3 == -1)) {
                                eVar.u0((q2 << 4) + q3);
                                i5 = Character.charCount(codePointAt) + i6;
                            }
                        } else if (codePointAt == 43 && z) {
                            eVar.u0(32);
                            i5++;
                        }
                        eVar.A0(codePointAt);
                        i5 += Character.charCount(codePointAt);
                    }
                    return eVar.m0();
                }
                i7 = i5 + 1;
            }
            String substring = str.substring(i2, i3);
            i.d(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            return substring;
        }

        public final int b(String str) {
            i.e(str, "scheme");
            int hashCode = str.hashCode();
            if (hashCode != 3213448) {
                if (hashCode == 99617003 && str.equals("https")) {
                    return 443;
                }
            } else if (str.equals("http")) {
                return 80;
            }
            return -1;
        }

        public final boolean c(String str, int i2, int i3) {
            int i4 = i2 + 2;
            return i4 < i3 && str.charAt(i2) == '%' && c.q(str.charAt(i2 + 1)) != -1 && c.q(str.charAt(i4)) != -1;
        }

        public final List<String> e(String str) {
            String str2;
            i.e(str, "$this$toQueryNamesAndValues");
            ArrayList arrayList = new ArrayList();
            int i2 = 0;
            while (i2 <= str.length()) {
                int k2 = h.k(str, '&', i2, false, 4);
                if (k2 == -1) {
                    k2 = str.length();
                }
                int k3 = h.k(str, '=', i2, false, 4);
                if (k3 == -1 || k3 > k2) {
                    String substring = str.substring(i2, k2);
                    i.d(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    arrayList.add(substring);
                    str2 = null;
                } else {
                    String substring2 = str.substring(i2, k3);
                    i.d(substring2, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    arrayList.add(substring2);
                    str2 = str.substring(k3 + 1, k2);
                    i.d(str2, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                }
                arrayList.add(str2);
                i2 = k2 + 1;
            }
            return arrayList;
        }
    }

    public z(String str, String str2, String str3, String str4, int i2, List<String> list, List<String> list2, String str5, String str6) {
        i.e(str, "scheme");
        i.e(str2, "username");
        i.e(str3, "password");
        i.e(str4, "host");
        i.e(list, "pathSegments");
        i.e(str6, "url");
        this.f10430b = str;
        this.c = str2;
        this.d = str3;
        this.f10431e = str4;
        this.f = i2;
        this.f10432g = list;
        this.f10433h = list2;
        this.f10434i = str5;
        this.f10435j = str6;
        this.a = i.a(str, "https");
    }

    public static final z h(String str) {
        i.e(str, "$this$toHttpUrlOrNull");
        try {
            i.e(str, "$this$toHttpUrl");
            a aVar = new a();
            aVar.e((z) null, str);
            return aVar.b();
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    public final String a() {
        if (this.d.length() == 0) {
            return "";
        }
        int k2 = h.k(this.f10435j, '@', 0, false, 6);
        String str = this.f10435j;
        Objects.requireNonNull(str, "null cannot be cast to non-null type java.lang.String");
        String substring = str.substring(h.k(this.f10435j, ':', this.f10430b.length() + 3, false, 4) + 1, k2);
        i.d(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return substring;
    }

    public final String b() {
        int k2 = h.k(this.f10435j, '/', this.f10430b.length() + 3, false, 4);
        String str = this.f10435j;
        int g2 = c.g(str, "?#", k2, str.length());
        String str2 = this.f10435j;
        Objects.requireNonNull(str2, "null cannot be cast to non-null type java.lang.String");
        String substring = str2.substring(k2, g2);
        i.d(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return substring;
    }

    public final List<String> c() {
        int k2 = h.k(this.f10435j, '/', this.f10430b.length() + 3, false, 4);
        String str = this.f10435j;
        int g2 = c.g(str, "?#", k2, str.length());
        ArrayList arrayList = new ArrayList();
        while (k2 < g2) {
            int i2 = k2 + 1;
            int f2 = c.f(this.f10435j, '/', i2, g2);
            String str2 = this.f10435j;
            Objects.requireNonNull(str2, "null cannot be cast to non-null type java.lang.String");
            String substring = str2.substring(i2, f2);
            i.d(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            arrayList.add(substring);
            k2 = f2;
        }
        return arrayList;
    }

    public final String d() {
        if (this.f10433h == null) {
            return null;
        }
        int k2 = h.k(this.f10435j, '?', 0, false, 6) + 1;
        String str = this.f10435j;
        int f2 = c.f(str, '#', k2, str.length());
        String str2 = this.f10435j;
        Objects.requireNonNull(str2, "null cannot be cast to non-null type java.lang.String");
        String substring = str2.substring(k2, f2);
        i.d(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return substring;
    }

    public final String e() {
        if (this.c.length() == 0) {
            return "";
        }
        int length = this.f10430b.length() + 3;
        String str = this.f10435j;
        int g2 = c.g(str, ":@", length, str.length());
        String str2 = this.f10435j;
        Objects.requireNonNull(str2, "null cannot be cast to non-null type java.lang.String");
        String substring = str2.substring(length, g2);
        i.d(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return substring;
    }

    public boolean equals(Object obj) {
        return (obj instanceof z) && i.a(((z) obj).f10435j, this.f10435j);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0072  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final n.z.a f() {
        /*
            r6 = this;
            n.z$a r0 = new n.z$a
            r0.<init>()
            java.lang.String r1 = r6.f10430b
            r0.a = r1
            java.lang.String r1 = r6.e()
            java.lang.String r2 = "<set-?>"
            e.x.c.i.e(r1, r2)
            r0.f10437b = r1
            java.lang.String r1 = r6.a()
            e.x.c.i.e(r1, r2)
            r0.c = r1
            java.lang.String r1 = r6.f10431e
            r0.d = r1
            int r1 = r6.f
            java.lang.String r2 = r6.f10430b
            java.lang.String r3 = "scheme"
            e.x.c.i.e(r2, r3)
            int r3 = r2.hashCode()
            r4 = 3213448(0x310888, float:4.503E-39)
            r5 = -1
            if (r3 == r4) goto L_0x0045
            r4 = 99617003(0x5f008eb, float:2.2572767E-35)
            if (r3 == r4) goto L_0x003a
            goto L_0x0050
        L_0x003a:
            java.lang.String r3 = "https"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0050
            r2 = 443(0x1bb, float:6.21E-43)
            goto L_0x0051
        L_0x0045:
            java.lang.String r3 = "http"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0050
            r2 = 80
            goto L_0x0051
        L_0x0050:
            r2 = r5
        L_0x0051:
            if (r1 == r2) goto L_0x0055
            int r5 = r6.f
        L_0x0055:
            r0.f10438e = r5
            java.util.List<java.lang.String> r1 = r0.f
            r1.clear()
            java.util.List<java.lang.String> r1 = r0.f
            java.util.List r2 = r6.c()
            r1.addAll(r2)
            java.lang.String r1 = r6.d()
            r0.d(r1)
            java.lang.String r1 = r6.f10434i
            if (r1 != 0) goto L_0x0072
            r1 = 0
            goto L_0x008e
        L_0x0072:
            java.lang.String r1 = r6.f10435j
            r2 = 35
            r3 = 6
            r4 = 0
            int r1 = e.c0.h.k(r1, r2, r4, r4, r3)
            int r1 = r1 + 1
            java.lang.String r2 = r6.f10435j
            java.lang.String r3 = "null cannot be cast to non-null type java.lang.String"
            java.util.Objects.requireNonNull(r2, r3)
            java.lang.String r1 = r2.substring(r1)
            java.lang.String r2 = "(this as java.lang.String).substring(startIndex)"
            e.x.c.i.d(r1, r2)
        L_0x008e:
            r0.f10440h = r1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: n.z.f():n.z$a");
    }

    public final a g(String str) {
        i.e(str, "link");
        try {
            a aVar = new a();
            aVar.e(this, str);
            return aVar;
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    public int hashCode() {
        return this.f10435j.hashCode();
    }

    public final String i() {
        a g2 = g("/...");
        i.c(g2);
        i.e("", "username");
        b bVar = f10429l;
        g2.f10437b = b.a(bVar, "", 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, (Charset) null, 251);
        i.e("", "password");
        g2.c = b.a(bVar, "", 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, (Charset) null, 251);
        return g2.b().f10435j;
    }

    public final URI j() {
        String str;
        String str2;
        int i2;
        List<String> list;
        int i3;
        String str3;
        a f2 = f();
        b bVar = f10429l;
        String str4 = f2.d;
        String str5 = "nativePattern.matcher(in…).replaceAll(replacement)";
        String str6 = "";
        String str7 = "nativePattern";
        String str8 = "Pattern.compile(pattern)";
        String str9 = "pattern";
        String str10 = null;
        if (str4 != null) {
            i.e("[\"<>^`{|}]", str9);
            Pattern compile = Pattern.compile("[\"<>^`{|}]");
            i.d(compile, str8);
            i.e(compile, str7);
            i.e(str4, "input");
            i.e(str6, "replacement");
            str = compile.matcher(str4).replaceAll(str6);
            i.d(str, str5);
        } else {
            str = null;
        }
        f2.d = str;
        int size = f2.f.size();
        int i4 = 0;
        while (i4 < size) {
            List<String> list2 = f2.f;
            int i5 = i4;
            list2.set(i5, b.a(bVar, list2.get(i4), 0, 0, "[]", true, true, false, false, (Charset) null, 227));
            i4 = i5 + 1;
            str6 = str6;
            size = size;
            str5 = str5;
            str9 = str9;
            str8 = str8;
            str7 = str7;
        }
        String str11 = str9;
        String str12 = str8;
        String str13 = str7;
        String str14 = str5;
        String str15 = str6;
        List<String> list3 = f2.f10439g;
        if (list3 != null) {
            int size2 = list3.size();
            int i6 = 0;
            while (i6 < size2) {
                String str16 = list3.get(i6);
                if (str16 != null) {
                    i2 = size2;
                    str2 = str15;
                    list = list3;
                    str3 = b.a(bVar, str16, 0, 0, "\\^`{|}", true, true, true, false, (Charset) null, 195);
                    i3 = i6;
                } else {
                    i2 = size2;
                    str2 = str15;
                    list = list3;
                    i3 = i6;
                    str3 = null;
                }
                list.set(i3, str3);
                i6 = i3 + 1;
                list3 = list;
                size2 = i2;
                str15 = str2;
            }
        }
        String str17 = str15;
        String str18 = f2.f10440h;
        if (str18 != null) {
            str10 = b.a(bVar, str18, 0, 0, " \"#<>\\^`{|}", true, true, false, true, (Charset) null, 163);
        }
        f2.f10440h = str10;
        String aVar = f2.toString();
        try {
            return new URI(aVar);
        } catch (URISyntaxException e2) {
            try {
                i.e("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]", str11);
                Pattern compile2 = Pattern.compile("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]");
                i.d(compile2, str12);
                i.e(compile2, str13);
                i.e(aVar, "input");
                String str19 = str17;
                i.e(str19, "replacement");
                String replaceAll = compile2.matcher(aVar).replaceAll(str19);
                i.d(replaceAll, str14);
                URI create = URI.create(replaceAll);
                i.d(create, "try {\n        val stripp…e) // Unexpected!\n      }");
                return create;
            } catch (Exception unused) {
                throw new RuntimeException(e2);
            }
        }
    }

    public String toString() {
        return this.f10435j;
    }
}
