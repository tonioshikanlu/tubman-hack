package b.p.b;

import androidx.exifinterface.media.ExifInterface;
import com.google.android.material.badge.BadgeDrawable;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import o.e;

public final class o {

    /* renamed from: j  reason: collision with root package name */
    public static final char[] f6723j = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    public final String a;

    /* renamed from: b  reason: collision with root package name */
    public final String f6724b;
    public final String c;
    public final String d;

    /* renamed from: e  reason: collision with root package name */
    public final int f6725e;
    public final List<String> f;

    /* renamed from: g  reason: collision with root package name */
    public final List<String> f6726g;

    /* renamed from: h  reason: collision with root package name */
    public final String f6727h;

    /* renamed from: i  reason: collision with root package name */
    public final String f6728i;

    public static final class b {
        public String a;

        /* renamed from: b  reason: collision with root package name */
        public String f6729b = "";
        public String c = "";
        public String d;

        /* renamed from: e  reason: collision with root package name */
        public int f6730e = -1;
        public final List<String> f;

        /* renamed from: g  reason: collision with root package name */
        public List<String> f6731g;

        /* renamed from: h  reason: collision with root package name */
        public String f6732h;

        public enum a {
            SUCCESS,
            MISSING_SCHEME,
            UNSUPPORTED_SCHEME,
            INVALID_PORT,
            INVALID_HOST
        }

        public b() {
            ArrayList arrayList = new ArrayList();
            this.f = arrayList;
            arrayList.add("");
        }

        /* JADX WARNING: Code restructure failed: missing block: B:106:0x0180, code lost:
            throw new java.lang.AssertionError();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:29:0x0078, code lost:
            r4 = r0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:43:0x00a2, code lost:
            if ((r13 - r11) != 0) goto L_0x00a5;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:63:0x00f5, code lost:
            if (r9 == r0) goto L_0x010b;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:64:0x00f7, code lost:
            if (r10 != -1) goto L_0x00fc;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:66:0x00fc, code lost:
            r1 = r9 - r10;
            java.lang.System.arraycopy(r7, r10, r7, 16 - r1, r1);
            r0 = 0;
            java.util.Arrays.fill(r7, r10, (16 - r9) + r10, (byte) 0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:67:0x010b, code lost:
            r0 = 0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:69:?, code lost:
            r1 = java.net.InetAddress.getByAddress(r7);
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static java.lang.String d(java.lang.String r16, int r17, int r18) {
            /*
                r0 = 0
                r1 = r16
                r2 = r17
                r3 = r18
                java.lang.String r1 = b.p.b.o.m(r1, r2, r3, r0)
                java.lang.String r2 = "["
                boolean r2 = r1.startsWith(r2)
                r4 = 1
                r5 = -1
                if (r2 == 0) goto L_0x0181
                java.lang.String r2 = "]"
                boolean r2 = r1.endsWith(r2)
                if (r2 == 0) goto L_0x0181
                int r2 = r1.length()
                int r2 = r2 - r4
                r6 = 16
                byte[] r7 = new byte[r6]
                r9 = r0
                r8 = r4
                r10 = r5
                r11 = r10
            L_0x002a:
                r12 = 255(0xff, float:3.57E-43)
                if (r8 >= r2) goto L_0x00f4
                if (r9 != r6) goto L_0x0032
                goto L_0x00bf
            L_0x0032:
                int r13 = r8 + 2
                r14 = 4
                if (r13 > r2) goto L_0x0050
                java.lang.String r15 = "::"
                r3 = 2
                boolean r3 = r1.regionMatches(r8, r15, r0, r3)
                if (r3 == 0) goto L_0x0050
                if (r10 == r5) goto L_0x0044
                goto L_0x00bf
            L_0x0044:
                int r9 = r9 + 2
                if (r13 != r2) goto L_0x004c
                r0 = r6
                r10 = r9
                goto L_0x00f5
            L_0x004c:
                r10 = r9
                r11 = r13
                goto L_0x00c3
            L_0x0050:
                if (r9 == 0) goto L_0x00c2
                java.lang.String r3 = ":"
                boolean r3 = r1.regionMatches(r8, r3, r0, r4)
                if (r3 == 0) goto L_0x005e
                int r8 = r8 + 1
                goto L_0x00c2
            L_0x005e:
                java.lang.String r3 = "."
                boolean r3 = r1.regionMatches(r8, r3, r0, r4)
                if (r3 == 0) goto L_0x00bf
                int r3 = r9 + -2
                r8 = r3
            L_0x0069:
                if (r11 >= r2) goto L_0x00b1
                if (r8 != r6) goto L_0x006e
                goto L_0x0078
            L_0x006e:
                if (r8 == r3) goto L_0x007c
                char r13 = r1.charAt(r11)
                r15 = 46
                if (r13 == r15) goto L_0x007a
            L_0x0078:
                r4 = r0
                goto L_0x00b7
            L_0x007a:
                int r11 = r11 + 1
            L_0x007c:
                r15 = r0
                r13 = r11
            L_0x007e:
                if (r13 >= r2) goto L_0x00a0
                char r4 = r1.charAt(r13)
                r0 = 48
                if (r4 < r0) goto L_0x00a0
                r6 = 57
                if (r4 <= r6) goto L_0x008d
                goto L_0x00a0
            L_0x008d:
                if (r15 != 0) goto L_0x0092
                if (r11 == r13) goto L_0x0092
                goto L_0x00b4
            L_0x0092:
                int r15 = r15 * 10
                int r15 = r15 + r4
                int r15 = r15 - r0
                if (r15 <= r12) goto L_0x0099
                goto L_0x00b4
            L_0x0099:
                int r13 = r13 + 1
                r0 = 0
                r4 = 1
                r6 = 16
                goto L_0x007e
            L_0x00a0:
                int r0 = r13 - r11
                if (r0 != 0) goto L_0x00a5
                goto L_0x00b4
            L_0x00a5:
                int r0 = r8 + 1
                byte r4 = (byte) r15
                r7[r8] = r4
                r8 = r0
                r11 = r13
                r0 = 0
                r4 = 1
                r6 = 16
                goto L_0x0069
            L_0x00b1:
                int r3 = r3 + r14
                if (r8 == r3) goto L_0x00b6
            L_0x00b4:
                r4 = 0
                goto L_0x00b7
            L_0x00b6:
                r4 = 1
            L_0x00b7:
                if (r4 != 0) goto L_0x00ba
                goto L_0x00bf
            L_0x00ba:
                int r9 = r9 + 2
                r0 = 16
                goto L_0x00f5
            L_0x00bf:
                r0 = 16
                goto L_0x00f9
            L_0x00c2:
                r11 = r8
            L_0x00c3:
                r8 = r11
                r0 = 0
            L_0x00c5:
                if (r8 >= r2) goto L_0x00d8
                char r3 = r1.charAt(r8)
                int r3 = b.p.b.o.c(r3)
                if (r3 != r5) goto L_0x00d2
                goto L_0x00d8
            L_0x00d2:
                int r0 = r0 << 4
                int r0 = r0 + r3
                int r8 = r8 + 1
                goto L_0x00c5
            L_0x00d8:
                int r3 = r8 - r11
                if (r3 == 0) goto L_0x00bf
                if (r3 <= r14) goto L_0x00df
                goto L_0x00bf
            L_0x00df:
                int r3 = r9 + 1
                int r4 = r0 >>> 8
                r4 = r4 & r12
                byte r4 = (byte) r4
                r7[r9] = r4
                int r9 = r3 + 1
                r0 = r0 & 255(0xff, float:3.57E-43)
                byte r0 = (byte) r0
                r7[r3] = r0
                r0 = 0
                r4 = 1
                r6 = 16
                goto L_0x002a
            L_0x00f4:
                r0 = r6
            L_0x00f5:
                if (r9 == r0) goto L_0x010b
                if (r10 != r5) goto L_0x00fc
            L_0x00f9:
                r0 = 0
                r1 = 0
                goto L_0x0110
            L_0x00fc:
                int r1 = r9 - r10
                int r2 = 16 - r1
                java.lang.System.arraycopy(r7, r10, r7, r2, r1)
                int r6 = 16 - r9
                int r6 = r6 + r10
                r0 = 0
                java.util.Arrays.fill(r7, r10, r6, r0)
                goto L_0x010c
            L_0x010b:
                r0 = 0
            L_0x010c:
                java.net.InetAddress r1 = java.net.InetAddress.getByAddress(r7)     // Catch:{ UnknownHostException -> 0x017b }
            L_0x0110:
                if (r1 != 0) goto L_0x0114
                r2 = 0
                return r2
            L_0x0114:
                byte[] r1 = r1.getAddress()
                int r2 = r1.length
                r3 = 16
                if (r2 != r3) goto L_0x0175
                r2 = r0
                r4 = r2
            L_0x011f:
                int r6 = r1.length
                if (r2 >= r6) goto L_0x013f
                r6 = r2
            L_0x0123:
                if (r6 >= r3) goto L_0x0134
                byte r3 = r1[r6]
                if (r3 != 0) goto L_0x0134
                int r3 = r6 + 1
                byte r3 = r1[r3]
                if (r3 != 0) goto L_0x0134
                int r6 = r6 + 2
                r3 = 16
                goto L_0x0123
            L_0x0134:
                int r3 = r6 - r2
                if (r3 <= r4) goto L_0x013a
                r5 = r2
                r4 = r3
            L_0x013a:
                int r2 = r6 + 2
                r3 = 16
                goto L_0x011f
            L_0x013f:
                o.e r2 = new o.e
                r2.<init>()
            L_0x0144:
                int r3 = r1.length
                if (r0 >= r3) goto L_0x0170
                r3 = 58
                if (r0 != r5) goto L_0x0157
                r2.u0(r3)
                int r0 = r0 + r4
                r6 = 16
                if (r0 != r6) goto L_0x0144
                r2.u0(r3)
                goto L_0x0144
            L_0x0157:
                r6 = 16
                if (r0 <= 0) goto L_0x015e
                r2.u0(r3)
            L_0x015e:
                byte r3 = r1[r0]
                r3 = r3 & r12
                int r3 = r3 << 8
                int r7 = r0 + 1
                byte r7 = r1[r7]
                r7 = r7 & r12
                r3 = r3 | r7
                long r7 = (long) r3
                r2.o(r7)
                int r0 = r0 + 2
                goto L_0x0144
            L_0x0170:
                java.lang.String r0 = r2.m0()
                return r0
            L_0x0175:
                java.lang.AssertionError r0 = new java.lang.AssertionError
                r0.<init>()
                throw r0
            L_0x017b:
                java.lang.AssertionError r0 = new java.lang.AssertionError
                r0.<init>()
                throw r0
            L_0x0181:
                r2 = 0
                java.lang.String r1 = java.net.IDN.toASCII(r1)     // Catch:{ IllegalArgumentException -> 0x01b9 }
                java.util.Locale r3 = java.util.Locale.US     // Catch:{ IllegalArgumentException -> 0x01b9 }
                java.lang.String r1 = r1.toLowerCase(r3)     // Catch:{ IllegalArgumentException -> 0x01b9 }
                boolean r3 = r1.isEmpty()     // Catch:{ IllegalArgumentException -> 0x01b9 }
                if (r3 == 0) goto L_0x0193
                goto L_0x01b9
            L_0x0193:
                r3 = r0
            L_0x0194:
                int r4 = r1.length()     // Catch:{ IllegalArgumentException -> 0x01b9 }
                if (r3 >= r4) goto L_0x01b4
                char r4 = r1.charAt(r3)     // Catch:{ IllegalArgumentException -> 0x01b9 }
                r6 = 31
                if (r4 <= r6) goto L_0x01b3
                r6 = 127(0x7f, float:1.78E-43)
                if (r4 < r6) goto L_0x01a7
                goto L_0x01b3
            L_0x01a7:
                java.lang.String r6 = " #%/:?@[\\]"
                int r4 = r6.indexOf(r4)     // Catch:{ IllegalArgumentException -> 0x01b9 }
                if (r4 == r5) goto L_0x01b0
                goto L_0x01b3
            L_0x01b0:
                int r3 = r3 + 1
                goto L_0x0194
            L_0x01b3:
                r0 = 1
            L_0x01b4:
                if (r0 == 0) goto L_0x01b7
                goto L_0x01b9
            L_0x01b7:
                r3 = r1
                goto L_0x01ba
            L_0x01b9:
                r3 = r2
            L_0x01ba:
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: b.p.b.o.b.d(java.lang.String, int, int):java.lang.String");
        }

        public b a(String str) {
            g(str, 0, str.length(), false, true);
            return this;
        }

        public b b(String str) {
            g(str, 0, str.length(), false, false);
            return this;
        }

        public o c() {
            if (this.a == null) {
                throw new IllegalStateException("scheme == null");
            } else if (this.d != null) {
                return new o(this, (a) null);
            } else {
                throw new IllegalStateException("host == null");
            }
        }

        public b e(String str) {
            this.f6731g = str != null ? o.p(o.b(str, " \"'<>#", true, true, true)) : null;
            return this;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:125:0x01f9, code lost:
            if (r1 <= 65535) goto L_0x01fd;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:49:0x008b, code lost:
            if (r7 == ':') goto L_0x0092;
         */
        /* JADX WARNING: Removed duplicated region for block: B:106:0x01bc  */
        /* JADX WARNING: Removed duplicated region for block: B:120:0x01e3  */
        /* JADX WARNING: Removed duplicated region for block: B:132:0x0205  */
        /* JADX WARNING: Removed duplicated region for block: B:135:0x0211  */
        /* JADX WARNING: Removed duplicated region for block: B:137:0x0214  */
        /* JADX WARNING: Removed duplicated region for block: B:150:0x0260  */
        /* JADX WARNING: Removed duplicated region for block: B:205:0x01d8 A[SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:210:0x0281 A[SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:53:0x0094  */
        /* JADX WARNING: Removed duplicated region for block: B:61:0x00c1  */
        /* JADX WARNING: Removed duplicated region for block: B:83:0x0134  */
        /* JADX WARNING: Removed duplicated region for block: B:84:0x0139  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public b.p.b.o.b.a f(b.p.b.o r19, java.lang.String r20) {
            /*
                r18 = this;
                r0 = r18
                r1 = r19
                r8 = r20
                int r2 = r20.length()
                r3 = 0
            L_0x000b:
                r4 = 32
                r5 = 13
                r6 = 12
                r7 = 10
                r9 = 9
                if (r3 >= r2) goto L_0x002a
                char r10 = r8.charAt(r3)
                if (r10 == r9) goto L_0x0027
                if (r10 == r7) goto L_0x0027
                if (r10 == r6) goto L_0x0027
                if (r10 == r5) goto L_0x0027
                if (r10 == r4) goto L_0x0027
                r10 = r3
                goto L_0x002b
            L_0x0027:
                int r3 = r3 + 1
                goto L_0x000b
            L_0x002a:
                r10 = r2
            L_0x002b:
                int r2 = r20.length()
                r11 = -1
                int r2 = r2 + r11
            L_0x0031:
                r12 = 1
                if (r2 < r10) goto L_0x0048
                char r3 = r8.charAt(r2)
                if (r3 == r9) goto L_0x0045
                if (r3 == r7) goto L_0x0045
                if (r3 == r6) goto L_0x0045
                if (r3 == r5) goto L_0x0045
                if (r3 == r4) goto L_0x0045
                int r2 = r2 + r12
                r9 = r2
                goto L_0x0049
            L_0x0045:
                int r2 = r2 + -1
                goto L_0x0031
            L_0x0048:
                r9 = r10
            L_0x0049:
                int r2 = r9 - r10
                r13 = 58
                r14 = 2
                if (r2 >= r14) goto L_0x0051
                goto L_0x0091
            L_0x0051:
                char r2 = r8.charAt(r10)
                r3 = 122(0x7a, float:1.71E-43)
                r4 = 65
                r5 = 97
                r6 = 90
                if (r2 < r5) goto L_0x0061
                if (r2 <= r3) goto L_0x0066
            L_0x0061:
                if (r2 < r4) goto L_0x0091
                if (r2 <= r6) goto L_0x0066
                goto L_0x0091
            L_0x0066:
                r2 = r10
            L_0x0067:
                int r2 = r2 + r12
                if (r2 >= r9) goto L_0x0091
                char r7 = r8.charAt(r2)
                if (r7 < r5) goto L_0x0072
                if (r7 <= r3) goto L_0x008e
            L_0x0072:
                if (r7 < r4) goto L_0x0076
                if (r7 <= r6) goto L_0x008e
            L_0x0076:
                r3 = 48
                if (r7 < r3) goto L_0x007e
                r3 = 57
                if (r7 <= r3) goto L_0x008e
            L_0x007e:
                r3 = 43
                if (r7 == r3) goto L_0x008e
                r3 = 45
                if (r7 == r3) goto L_0x008e
                r3 = 46
                if (r7 != r3) goto L_0x008b
                goto L_0x008e
            L_0x008b:
                if (r7 != r13) goto L_0x0091
                goto L_0x0092
            L_0x008e:
                r3 = 122(0x7a, float:1.71E-43)
                goto L_0x0067
            L_0x0091:
                r2 = r11
            L_0x0092:
                if (r2 == r11) goto L_0x00c1
                r3 = 1
                r6 = 0
                r7 = 6
                java.lang.String r5 = "https:"
                r2 = r20
                r4 = r10
                boolean r2 = r2.regionMatches(r3, r4, r5, r6, r7)
                if (r2 == 0) goto L_0x00a9
                java.lang.String r2 = "https"
                r0.a = r2
                int r10 = r10 + 6
                goto L_0x00c7
            L_0x00a9:
                r3 = 1
                r6 = 0
                r7 = 5
                java.lang.String r5 = "http:"
                r2 = r20
                r4 = r10
                boolean r2 = r2.regionMatches(r3, r4, r5, r6, r7)
                if (r2 == 0) goto L_0x00be
                java.lang.String r2 = "http"
                r0.a = r2
                int r10 = r10 + 5
                goto L_0x00c7
            L_0x00be:
                b.p.b.o$b$a r1 = b.p.b.o.b.a.UNSUPPORTED_SCHEME
                return r1
            L_0x00c1:
                if (r1 == 0) goto L_0x02c2
                java.lang.String r2 = r1.a
                r0.a = r2
            L_0x00c7:
                r2 = 0
                r3 = r10
            L_0x00c9:
                r4 = 92
                r5 = 47
                if (r3 >= r9) goto L_0x00dc
                char r6 = r8.charAt(r3)
                if (r6 == r4) goto L_0x00d7
                if (r6 != r5) goto L_0x00dc
            L_0x00d7:
                int r2 = r2 + 1
                int r3 = r3 + 1
                goto L_0x00c9
            L_0x00dc:
                r3 = 63
                r6 = 35
                if (r2 >= r14) goto L_0x0122
                if (r1 == 0) goto L_0x0122
                java.lang.String r7 = r1.a
                java.lang.String r14 = r0.a
                boolean r7 = r7.equals(r14)
                if (r7 != 0) goto L_0x00ef
                goto L_0x0122
            L_0x00ef:
                java.lang.String r2 = r19.i()
                r0.f6729b = r2
                java.lang.String r2 = r19.f()
                r0.c = r2
                java.lang.String r2 = r1.d
                r0.d = r2
                int r2 = r1.f6725e
                r0.f6730e = r2
                java.util.List<java.lang.String> r2 = r0.f
                r2.clear()
                java.util.List<java.lang.String> r2 = r0.f
                java.util.List r3 = r19.g()
                r2.addAll(r3)
                if (r10 == r9) goto L_0x0119
                char r2 = r8.charAt(r10)
                if (r2 != r6) goto L_0x0215
            L_0x0119:
                java.lang.String r1 = r19.h()
                r0.e(r1)
                goto L_0x0215
            L_0x0122:
                int r10 = r10 + r2
                r1 = 0
                r2 = 0
                r17 = r10
                r10 = r1
                r1 = r11
                r11 = r2
                r2 = r17
            L_0x012c:
                java.lang.String r7 = "@/\\?#"
                int r14 = b.p.b.o.e(r8, r2, r9, r7)
                if (r14 == r9) goto L_0x0139
                char r7 = r8.charAt(r14)
                goto L_0x013a
            L_0x0139:
                r7 = r1
            L_0x013a:
                if (r7 == r1) goto L_0x01b9
                if (r7 == r6) goto L_0x01b9
                if (r7 == r5) goto L_0x01b9
                if (r7 == r4) goto L_0x01b9
                if (r7 == r3) goto L_0x01b9
                r1 = 64
                if (r7 == r1) goto L_0x0149
                goto L_0x01ab
            L_0x0149:
                java.lang.String r15 = "%40"
                if (r10 != 0) goto L_0x0187
                java.lang.String r1 = ":"
                int r7 = b.p.b.o.e(r8, r2, r14, r1)
                r5 = 1
                r6 = 0
                r16 = 1
                java.lang.String r4 = " \"':;<=>@[]^`{}|/\\?#"
                r1 = r20
                r3 = r7
                r13 = r7
                r7 = r16
                java.lang.String r1 = b.p.b.o.a(r1, r2, r3, r4, r5, r6, r7)
                if (r11 == 0) goto L_0x0170
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = r0.f6729b
                java.lang.String r1 = b.e.a.a.a.r(r2, r3, r15, r1)
            L_0x0170:
                r0.f6729b = r1
                if (r13 == r14) goto L_0x0185
                int r2 = r13 + 1
                r5 = 1
                r6 = 0
                r7 = 1
                java.lang.String r4 = " \"':;<=>@[]^`{}|/\\?#"
                r1 = r20
                r3 = r14
                java.lang.String r1 = b.p.b.o.a(r1, r2, r3, r4, r5, r6, r7)
                r0.c = r1
                r10 = r12
            L_0x0185:
                r11 = r12
                goto L_0x01a9
            L_0x0187:
                java.lang.StringBuilder r12 = new java.lang.StringBuilder
                r12.<init>()
                java.lang.String r1 = r0.c
                r12.append(r1)
                r12.append(r15)
                r5 = 1
                r6 = 0
                r7 = 1
                java.lang.String r4 = " \"':;<=>@[]^`{}|/\\?#"
                r1 = r20
                r3 = r14
                java.lang.String r1 = b.p.b.o.a(r1, r2, r3, r4, r5, r6, r7)
                r12.append(r1)
                java.lang.String r1 = r12.toString()
                r0.c = r1
            L_0x01a9:
                int r2 = r14 + 1
            L_0x01ab:
                r6 = 35
                r3 = 63
                r5 = 47
                r4 = 92
                r1 = -1
                r12 = 1
                r13 = 58
                goto L_0x012c
            L_0x01b9:
                r1 = r2
            L_0x01ba:
                if (r1 >= r14) goto L_0x01d8
                char r3 = r8.charAt(r1)
                r4 = 58
                if (r3 == r4) goto L_0x01d9
                r5 = 91
                if (r3 == r5) goto L_0x01ca
                r3 = 1
                goto L_0x01d6
            L_0x01ca:
                r3 = 1
            L_0x01cb:
                int r1 = r1 + r3
                if (r1 >= r14) goto L_0x01d6
                char r5 = r8.charAt(r1)
                r6 = 93
                if (r5 != r6) goto L_0x01cb
            L_0x01d6:
                int r1 = r1 + r3
                goto L_0x01ba
            L_0x01d8:
                r1 = r14
            L_0x01d9:
                int r3 = r1 + 1
                java.lang.String r1 = d(r8, r2, r1)
                r0.d = r1
                if (r3 >= r14) goto L_0x0205
                java.lang.String r4 = ""
                r5 = 0
                r6 = 0
                r7 = 1
                r1 = r20
                r2 = r3
                r3 = r14
                java.lang.String r1 = b.p.b.o.a(r1, r2, r3, r4, r5, r6, r7)     // Catch:{ NumberFormatException -> 0x01fc }
                int r1 = java.lang.Integer.parseInt(r1)     // Catch:{ NumberFormatException -> 0x01fc }
                if (r1 <= 0) goto L_0x01fc
                r2 = 65535(0xffff, float:9.1834E-41)
                if (r1 > r2) goto L_0x01fc
                goto L_0x01fd
            L_0x01fc:
                r1 = -1
            L_0x01fd:
                r0.f6730e = r1
                r2 = -1
                if (r1 != r2) goto L_0x020d
                b.p.b.o$b$a r1 = b.p.b.o.b.a.INVALID_PORT
                return r1
            L_0x0205:
                java.lang.String r1 = r0.a
                int r1 = b.p.b.o.d(r1)
                r0.f6730e = r1
            L_0x020d:
                java.lang.String r1 = r0.d
                if (r1 != 0) goto L_0x0214
                b.p.b.o$b$a r1 = b.p.b.o.b.a.INVALID_HOST
                return r1
            L_0x0214:
                r10 = r14
            L_0x0215:
                java.lang.String r1 = "?#"
                int r1 = b.p.b.o.e(r8, r10, r9, r1)
                if (r10 != r1) goto L_0x0224
                r12 = r0
                r3 = r1
                r1 = r8
                r14 = r9
                r9 = r1
                goto L_0x0282
            L_0x0224:
                char r2 = r8.charAt(r10)
                java.lang.String r3 = ""
                r4 = 47
                if (r2 == r4) goto L_0x0246
                r4 = 92
                if (r2 != r4) goto L_0x0233
                goto L_0x0246
            L_0x0233:
                java.util.List<java.lang.String> r2 = r0.f
                int r4 = r2.size()
                int r4 = r4 + -1
                r2.set(r4, r3)
                r11 = r0
                r12 = r11
                r3 = r1
                r4 = r3
                r1 = r8
                r2 = r1
                r13 = r2
                goto L_0x025c
            L_0x0246:
                r2 = 1
                java.util.List<java.lang.String> r4 = r0.f
                r4.clear()
                java.util.List<java.lang.String> r4 = r0.f
                r4.add(r3)
                r6 = r0
                r7 = r6
                r3 = r1
                r4 = r3
                r5 = r2
                r1 = r8
                r2 = r1
            L_0x0258:
                int r10 = r10 + r5
                r11 = r6
                r12 = r7
                r13 = r8
            L_0x025c:
                r14 = r9
                r7 = r10
            L_0x025e:
                if (r7 >= r4) goto L_0x0281
                java.lang.String r5 = "/\\"
                int r15 = b.p.b.o.e(r13, r7, r4, r5)
                if (r15 >= r4) goto L_0x026a
                r5 = 1
                goto L_0x026b
            L_0x026a:
                r5 = 0
            L_0x026b:
                r16 = r5
                r10 = 1
                r5 = r11
                r6 = r13
                r8 = r15
                r9 = r16
                r5.g(r6, r7, r8, r9, r10)
                if (r16 == 0) goto L_0x027f
                r5 = 1
                r6 = r11
                r7 = r12
                r8 = r13
                r9 = r14
                r10 = r15
                goto L_0x0258
            L_0x027f:
                r7 = r15
                goto L_0x025e
            L_0x0281:
                r9 = r2
            L_0x0282:
                if (r3 >= r14) goto L_0x02a6
                char r2 = r1.charAt(r3)
                r4 = 63
                if (r2 != r4) goto L_0x02a6
                java.lang.String r2 = "#"
                int r10 = b.p.b.o.e(r1, r3, r14, r2)
                int r3 = r3 + 1
                r6 = 1
                r7 = 1
                r8 = 1
                java.lang.String r5 = " \"'<>#"
                r2 = r9
                r4 = r10
                java.lang.String r2 = b.p.b.o.a(r2, r3, r4, r5, r6, r7, r8)
                java.util.List r2 = b.p.b.o.p(r2)
                r12.f6731g = r2
                r3 = r10
            L_0x02a6:
                if (r3 >= r14) goto L_0x02bf
                char r1 = r1.charAt(r3)
                r2 = 35
                if (r1 != r2) goto L_0x02bf
                int r3 = r3 + 1
                r6 = 1
                r7 = 0
                r8 = 0
                java.lang.String r5 = ""
                r2 = r9
                r4 = r14
                java.lang.String r1 = b.p.b.o.a(r2, r3, r4, r5, r6, r7, r8)
                r12.f6732h = r1
            L_0x02bf:
                b.p.b.o$b$a r1 = b.p.b.o.b.a.SUCCESS
                return r1
            L_0x02c2:
                b.p.b.o$b$a r1 = b.p.b.o.b.a.MISSING_SCHEME
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: b.p.b.o.b.f(b.p.b.o, java.lang.String):b.p.b.o$b$a");
        }

        public final void g(String str, int i2, int i3, boolean z, boolean z2) {
            String a2 = o.a(str, i2, i3, " \"<>^`{}|/\\?#", z2, false, true);
            boolean z3 = false;
            if (!(a2.equals(".") || a2.equalsIgnoreCase("%2e"))) {
                if (a2.equals("..") || a2.equalsIgnoreCase("%2e.") || a2.equalsIgnoreCase(".%2e") || a2.equalsIgnoreCase("%2e%2e")) {
                    z3 = true;
                }
                if (z3) {
                    List<String> list = this.f;
                    if (!list.remove(list.size() - 1).isEmpty() || this.f.isEmpty()) {
                        this.f.add("");
                        return;
                    }
                    List<String> list2 = this.f;
                    list2.set(list2.size() - 1, "");
                    return;
                }
                List<String> list3 = this.f;
                if (list3.get(list3.size() - 1).isEmpty()) {
                    List<String> list4 = this.f;
                    list4.set(list4.size() - 1, a2);
                } else {
                    this.f.add(a2);
                }
                if (z) {
                    this.f.add("");
                }
            }
        }

        public b h() {
            int size = this.f.size();
            for (int i2 = 0; i2 < size; i2++) {
                this.f.set(i2, o.b(this.f.get(i2), "[]", true, false, true));
            }
            List<String> list = this.f6731g;
            if (list != null) {
                int size2 = list.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    String str = this.f6731g.get(i3);
                    if (str != null) {
                        this.f6731g.set(i3, o.b(str, "\\^`{|}", true, true, true));
                    }
                }
            }
            String str2 = this.f6732h;
            if (str2 != null) {
                this.f6732h = o.b(str2, " \"#<>\\^`{|}", true, false, false);
            }
            return this;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(this.a);
            sb.append("://");
            if (!this.f6729b.isEmpty() || !this.c.isEmpty()) {
                sb.append(this.f6729b);
                if (!this.c.isEmpty()) {
                    sb.append(':');
                    sb.append(this.c);
                }
                sb.append('@');
            }
            if (this.d.indexOf(58) != -1) {
                sb.append('[');
                sb.append(this.d);
                sb.append(']');
            } else {
                sb.append(this.d);
            }
            int i2 = this.f6730e;
            if (i2 == -1) {
                i2 = o.d(this.a);
            }
            if (i2 != o.d(this.a)) {
                sb.append(':');
                sb.append(i2);
            }
            List<String> list = this.f;
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                sb.append('/');
                sb.append(list.get(i3));
            }
            if (this.f6731g != null) {
                sb.append('?');
                o.j(sb, this.f6731g);
            }
            if (this.f6732h != null) {
                sb.append('#');
                sb.append(this.f6732h);
            }
            return sb.toString();
        }
    }

    public o(b bVar, a aVar) {
        this.a = bVar.a;
        this.f6724b = n(bVar.f6729b, false);
        this.c = n(bVar.c, false);
        this.d = bVar.d;
        int i2 = bVar.f6730e;
        this.f6725e = i2 == -1 ? d(bVar.a) : i2;
        this.f = o(bVar.f, false);
        List<String> list = bVar.f6731g;
        String str = null;
        this.f6726g = list != null ? o(list, true) : null;
        String str2 = bVar.f6732h;
        this.f6727h = str2 != null ? m(str2, 0, str2.length(), false) : str;
        this.f6728i = bVar.toString();
    }

    public static String a(String str, int i2, int i3, String str2, boolean z, boolean z2, boolean z3) {
        String str3 = str;
        int i4 = i3;
        String str4 = str2;
        int i5 = i2;
        while (i5 < i4) {
            int codePointAt = str3.codePointAt(i5);
            if (codePointAt < 32 || codePointAt == 127 || ((codePointAt >= 128 && z3) || str4.indexOf(codePointAt) != -1 || ((codePointAt == 37 && !z) || (codePointAt == 43 && z2)))) {
                e eVar = new e();
                eVar.z0(str3, i2, i5);
                e eVar2 = null;
                while (i5 < i4) {
                    int codePointAt2 = str3.codePointAt(i5);
                    if (!z || !(codePointAt2 == 9 || codePointAt2 == 10 || codePointAt2 == 12 || codePointAt2 == 13)) {
                        if (codePointAt2 == 43 && z2) {
                            eVar.y0(z ? BadgeDrawable.DEFAULT_EXCEED_MAX_BADGE_NUMBER_SUFFIX : "%2B");
                        } else if (codePointAt2 < 32 || codePointAt2 == 127 || ((codePointAt2 >= 128 && z3) || str4.indexOf(codePointAt2) != -1 || (codePointAt2 == 37 && !z))) {
                            if (eVar2 == null) {
                                eVar2 = new e();
                            }
                            eVar2.A0(codePointAt2);
                            while (!eVar2.D()) {
                                byte readByte = eVar2.readByte() & ExifInterface.MARKER;
                                eVar.u0(37);
                                char[] cArr = f6723j;
                                eVar.u0(cArr[(readByte >> 4) & 15]);
                                eVar.u0(cArr[readByte & 15]);
                            }
                        } else {
                            eVar.A0(codePointAt2);
                        }
                    }
                    i5 += Character.charCount(codePointAt2);
                }
                return eVar.m0();
            }
            i5 += Character.charCount(codePointAt);
        }
        int i6 = i2;
        return str.substring(i2, i3);
    }

    public static String b(String str, String str2, boolean z, boolean z2, boolean z3) {
        return a(str, 0, str.length(), str2, z, z2, z3);
    }

    public static int c(char c2) {
        if (c2 >= '0' && c2 <= '9') {
            return c2 - '0';
        }
        char c3 = 'a';
        if (c2 < 'a' || c2 > 'f') {
            c3 = 'A';
            if (c2 < 'A' || c2 > 'F') {
                return -1;
            }
        }
        return (c2 - c3) + 10;
    }

    public static int d(String str) {
        if (str.equals("http")) {
            return 80;
        }
        return str.equals("https") ? 443 : -1;
    }

    public static int e(String str, int i2, int i3, String str2) {
        while (i2 < i3) {
            if (str2.indexOf(str.charAt(i2)) != -1) {
                return i2;
            }
            i2++;
        }
        return i3;
    }

    public static void j(StringBuilder sb, List<String> list) {
        int size = list.size();
        for (int i2 = 0; i2 < size; i2 += 2) {
            String str = list.get(i2);
            String str2 = list.get(i2 + 1);
            if (i2 > 0) {
                sb.append('&');
            }
            sb.append(str);
            if (str2 != null) {
                sb.append('=');
                sb.append(str2);
            }
        }
    }

    public static o l(String str) {
        b bVar = new b();
        if (bVar.f((o) null, str) == b.a.SUCCESS) {
            return bVar.c();
        }
        return null;
    }

    public static String m(String str, int i2, int i3, boolean z) {
        int i4;
        int i5 = i2;
        while (i5 < i3) {
            char charAt = str.charAt(i5);
            if (charAt == '%' || (charAt == '+' && z)) {
                e eVar = new e();
                eVar.z0(str, i2, i5);
                while (i5 < i3) {
                    int codePointAt = str.codePointAt(i5);
                    if (codePointAt == 37 && (i4 = i5 + 2) < i3) {
                        int c2 = c(str.charAt(i5 + 1));
                        int c3 = c(str.charAt(i4));
                        if (!(c2 == -1 || c3 == -1)) {
                            eVar.u0((c2 << 4) + c3);
                            i5 = i4;
                            i5 += Character.charCount(codePointAt);
                        }
                    } else if (codePointAt == 43 && z) {
                        eVar.u0(32);
                        i5 += Character.charCount(codePointAt);
                    }
                    eVar.A0(codePointAt);
                    i5 += Character.charCount(codePointAt);
                }
                return eVar.m0();
            }
            i5++;
        }
        return str.substring(i2, i3);
    }

    public static String n(String str, boolean z) {
        return m(str, 0, str.length(), z);
    }

    public static List<String> p(String str) {
        String str2;
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        while (i2 <= str.length()) {
            int indexOf = str.indexOf(38, i2);
            if (indexOf == -1) {
                indexOf = str.length();
            }
            int indexOf2 = str.indexOf(61, i2);
            if (indexOf2 == -1 || indexOf2 > indexOf) {
                arrayList.add(str.substring(i2, indexOf));
                str2 = null;
            } else {
                arrayList.add(str.substring(i2, indexOf2));
                str2 = str.substring(indexOf2 + 1, indexOf);
            }
            arrayList.add(str2);
            i2 = indexOf + 1;
        }
        return arrayList;
    }

    public boolean equals(Object obj) {
        return (obj instanceof o) && ((o) obj).f6728i.equals(this.f6728i);
    }

    public String f() {
        if (this.c.isEmpty()) {
            return "";
        }
        int indexOf = this.f6728i.indexOf(64);
        return this.f6728i.substring(this.f6728i.indexOf(58, this.a.length() + 3) + 1, indexOf);
    }

    public List<String> g() {
        int indexOf = this.f6728i.indexOf(47, this.a.length() + 3);
        String str = this.f6728i;
        int e2 = e(str, indexOf, str.length(), "?#");
        ArrayList arrayList = new ArrayList();
        while (indexOf < e2) {
            int i2 = indexOf + 1;
            int e3 = e(this.f6728i, i2, e2, "/");
            arrayList.add(this.f6728i.substring(i2, e3));
            indexOf = e3;
        }
        return arrayList;
    }

    public String h() {
        if (this.f6726g == null) {
            return null;
        }
        int indexOf = this.f6728i.indexOf(63) + 1;
        String str = this.f6728i;
        return this.f6728i.substring(indexOf, e(str, indexOf + 1, str.length(), "#"));
    }

    public int hashCode() {
        return this.f6728i.hashCode();
    }

    public String i() {
        if (this.f6724b.isEmpty()) {
            return "";
        }
        int length = this.a.length() + 3;
        String str = this.f6728i;
        return this.f6728i.substring(length, e(str, length, str.length(), ":@"));
    }

    public b k() {
        b bVar = new b();
        bVar.a = this.a;
        bVar.f6729b = i();
        bVar.c = f();
        bVar.d = this.d;
        bVar.f6730e = this.f6725e != d(this.a) ? this.f6725e : -1;
        bVar.f.clear();
        bVar.f.addAll(g());
        bVar.e(h());
        bVar.f6732h = this.f6727h == null ? null : this.f6728i.substring(this.f6728i.indexOf(35) + 1);
        return bVar;
    }

    public final List<String> o(List<String> list, boolean z) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            String next = it.next();
            arrayList.add(next != null ? m(next, 0, next.length(), z) : null);
        }
        return Collections.unmodifiableList(arrayList);
    }

    public o q(String str) {
        b bVar = new b();
        if (bVar.f(this, str) == b.a.SUCCESS) {
            return bVar.c();
        }
        return null;
    }

    public URI r() {
        try {
            b k2 = k();
            k2.h();
            return new URI(k2.toString());
        } catch (URISyntaxException unused) {
            StringBuilder y = b.e.a.a.a.y("not valid as a java.net.URI: ");
            y.append(this.f6728i);
            throw new IllegalStateException(y.toString());
        }
    }

    public String toString() {
        return this.f6728i;
    }
}
