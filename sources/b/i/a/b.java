package b.i.a;

import android.util.Log;
import b.i.a.f;
import b.i.a.i;
import com.segment.analytics.AnalyticsContext;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;

public class b {
    public f a = null;

    /* renamed from: b  reason: collision with root package name */
    public u f1020b = null;
    public boolean c = false;

    /* renamed from: b.i.a.b$b  reason: collision with other inner class name */
    public static class C0041b {
        public final String a;

        /* renamed from: b  reason: collision with root package name */
        public final c f1021b;
        public final String c;

        public C0041b(String str, c cVar, String str2) {
            this.a = str;
            this.f1021b = cVar;
            this.c = str2;
        }
    }

    public enum c {
        EXISTS,
        EQUALS,
        INCLUDES,
        DASHMATCH
    }

    public static class d extends i.C0045i {

        public static class a {
            public int a;

            /* renamed from: b  reason: collision with root package name */
            public int f1027b;

            public a(int i2, int i3) {
                this.a = i2;
                this.f1027b = i3;
            }
        }

        public d(String str) {
            super(str.replaceAll("(?s)/\\*.*?\\*/", ""));
        }

        public final int s(int i2) {
            if (i2 >= 48 && i2 <= 57) {
                return i2 - 48;
            }
            int i3 = 65;
            if (i2 < 65 || i2 > 70) {
                i3 = 97;
                if (i2 < 97 || i2 > 102) {
                    return -1;
                }
            }
            return (i2 - i3) + 10;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:28:0x0057, code lost:
            r2 = h().intValue();
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.String t() {
            /*
                r8 = this;
                boolean r0 = r8.f()
                r1 = 0
                if (r0 == 0) goto L_0x0008
                return r1
            L_0x0008:
                java.lang.String r0 = r8.a
                int r2 = r8.f1267b
                char r0 = r0.charAt(r2)
                r2 = 39
                if (r0 == r2) goto L_0x0019
                r2 = 34
                if (r0 == r2) goto L_0x0019
                return r1
            L_0x0019:
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                int r2 = r8.f1267b
                r3 = 1
                int r2 = r2 + r3
                r8.f1267b = r2
            L_0x0024:
                java.lang.Integer r2 = r8.h()
                int r2 = r2.intValue()
            L_0x002c:
                r4 = -1
                if (r2 == r4) goto L_0x0076
                if (r2 == r0) goto L_0x0076
                r5 = 92
                if (r2 != r5) goto L_0x0071
                java.lang.Integer r2 = r8.h()
                int r2 = r2.intValue()
                if (r2 != r4) goto L_0x0040
                goto L_0x002c
            L_0x0040:
                r5 = 10
                if (r2 == r5) goto L_0x0024
                r5 = 13
                if (r2 == r5) goto L_0x0024
                r5 = 12
                if (r2 != r5) goto L_0x004d
                goto L_0x0024
            L_0x004d:
                int r5 = r8.s(r2)
                if (r5 == r4) goto L_0x0071
                r6 = r3
            L_0x0054:
                r7 = 5
                if (r6 > r7) goto L_0x006c
                java.lang.Integer r2 = r8.h()
                int r2 = r2.intValue()
                int r7 = r8.s(r2)
                if (r7 != r4) goto L_0x0066
                goto L_0x006c
            L_0x0066:
                int r5 = r5 * 16
                int r5 = r5 + r7
                int r6 = r6 + 1
                goto L_0x0054
            L_0x006c:
                char r4 = (char) r5
                r1.append(r4)
                goto L_0x002c
            L_0x0071:
                char r2 = (char) r2
                r1.append(r2)
                goto L_0x0024
            L_0x0076:
                java.lang.String r0 = r1.toString()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: b.i.a.b.d.t():java.lang.String");
        }

        public String u() {
            int i2;
            int i3;
            if (f()) {
                i2 = this.f1267b;
            } else {
                int i4 = this.f1267b;
                int charAt = this.a.charAt(i4);
                if (charAt == 45) {
                    charAt = a();
                }
                if ((charAt < 65 || charAt > 90) && ((charAt < 97 || charAt > 122) && charAt != 95)) {
                    i3 = i4;
                } else {
                    while (true) {
                        int a2 = a();
                        if ((a2 < 65 || a2 > 90) && ((a2 < 97 || a2 > 122) && !((a2 >= 48 && a2 <= 57) || a2 == 45 || a2 == 95))) {
                            break;
                        }
                    }
                    i3 = this.f1267b;
                }
                this.f1267b = i4;
                i2 = i3;
            }
            int i5 = this.f1267b;
            if (i2 == i5) {
                return null;
            }
            String substring = this.a.substring(i5, i2);
            this.f1267b = i2;
            return substring;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v2, resolved type: b.i.a.b$e} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v3, resolved type: int} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v14, resolved type: b.i.a.b$t} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v4, resolved type: boolean} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v3, resolved type: b.i.a.b$e} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v4, resolved type: b.i.a.b$e} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v0, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v5, resolved type: b.i.a.b$e} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v1, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v2, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v3, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v4, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v5, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v6, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v7, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v8, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v9, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v10, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v11, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v12, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v13, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v14, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v17, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v29, resolved type: int} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v32, resolved type: int} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v34, resolved type: b.i.a.b$t} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v35, resolved type: b.i.a.b$t} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v34, resolved type: int} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v12, resolved type: b.i.a.b$e} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v15, resolved type: b.i.a.b$e} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v17, resolved type: b.i.a.b$e} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v18, resolved type: b.i.a.b$e} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v36, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v37, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v35, resolved type: boolean} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v40, resolved type: boolean} */
        /* JADX WARNING: type inference failed for: r3v5, types: [b.i.a.b$a, java.lang.String] */
        /* JADX WARNING: type inference failed for: r8v19 */
        /* JADX WARNING: type inference failed for: r8v20, types: [b.i.a.b$m] */
        /* JADX WARNING: type inference failed for: r3v51, types: [b.i.a.b$m] */
        /* JADX WARNING: type inference failed for: r8v21, types: [b.i.a.b$i] */
        /* JADX WARNING: type inference failed for: r3v55, types: [b.i.a.b$l] */
        /* JADX WARNING: type inference failed for: r3v60, types: [b.i.a.b$l] */
        /* JADX WARNING: type inference failed for: r3v64 */
        /* JADX WARNING: type inference failed for: r3v73 */
        /* JADX WARNING: Code restructure failed: missing block: B:101:0x018d, code lost:
            throw new b.i.a.a(b.e.a.a.a.m("Unsupported pseudo class: ", r9));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:102:0x018e, code lost:
            r3 = new b.i.a.b.l(r9);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:104:0x0199, code lost:
            if (f() == false) goto L_0x019c;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:105:0x019c, code lost:
            r8 = r0.f1267b;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:106:0x01a2, code lost:
            if (d('(') != false) goto L_0x01a5;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:107:0x01a5, code lost:
            r();
            r3 = r3;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:108:0x01a8, code lost:
            r10 = u();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:109:0x01ac, code lost:
            if (r10 != null) goto L_0x01af;
            r3 = r3;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:110:0x01af, code lost:
            if (r3 != null) goto L_0x01b6;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:111:0x01b1, code lost:
            r3 = new java.util.ArrayList();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:112:0x01b6, code lost:
            r3.add(r10);
            r();
            r3 = r3;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:113:0x01c0, code lost:
            if (q() != false) goto L_0x01a8;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:115:0x01c6, code lost:
            if (d(')') == false) goto L_0x01c9;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:116:0x01c9, code lost:
            r0.f1267b = r8;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:117:0x01cb, code lost:
            r3 = new b.i.a.b.l(r9);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:118:0x01d2, code lost:
            r3 = r3;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:119:0x01d6, code lost:
            if (f() == false) goto L_0x01d9;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:120:0x01d9, code lost:
            r8 = r0.f1267b;
            r3 = r3;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:121:0x01df, code lost:
            if (d('(') != false) goto L_0x01e2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:122:0x01e2, code lost:
            r();
            r10 = v();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:123:0x01e9, code lost:
            if (r10 != null) goto L_0x01ec;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:125:0x01f0, code lost:
            if (d(')') != false) goto L_0x01f5;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:126:0x01f2, code lost:
            r0.f1267b = r8;
            r3 = r3;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:127:0x01f5, code lost:
            r8 = r10.iterator();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:129:0x01fd, code lost:
            if (r8.hasNext() == false) goto L_0x0234;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:130:0x01ff, code lost:
            r11 = r8.next().a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:131:0x0207, code lost:
            if (r11 != null) goto L_0x020a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:132:0x020a, code lost:
            r11 = r11.iterator();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:134:0x0212, code lost:
            if (r11.hasNext() == false) goto L_0x01f9;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:135:0x0214, code lost:
            r13 = r11.next().d;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:136:0x021c, code lost:
            if (r13 != null) goto L_0x021f;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:137:0x021f, code lost:
            r13 = r13.iterator();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:139:0x0227, code lost:
            if (r13.hasNext() == false) goto L_0x020e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:141:0x0231, code lost:
            if ((r13.next() instanceof b.i.a.b.k) == false) goto L_0x0223;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:142:0x0234, code lost:
            r3 = r10;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:143:0x0235, code lost:
            if (r3 == null) goto L_0x025a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:144:0x0237, code lost:
            r8 = new b.i.a.b.k(r3);
            r3 = r3.iterator();
            r9 = Integer.MIN_VALUE;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:146:0x0246, code lost:
            if (r3.hasNext() == false) goto L_0x0254;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:147:0x0248, code lost:
            r10 = r3.next().f1056b;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:148:0x0250, code lost:
            if (r10 <= r9) goto L_0x0242;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:149:0x0252, code lost:
            r9 = r10;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:150:0x0254, code lost:
            r4.f1056b = r9;
            r20 = r7;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:152:0x0263, code lost:
            throw new b.i.a.a(b.e.a.a.a.m("Invalid or missing parameter section for pseudo class: ", r9));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:153:0x0264, code lost:
            r8 = new b.i.a.b.i(r3);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:154:0x026a, code lost:
            r3 = new b.i.a.b.m(r8, r2.f1057b);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:155:0x0272, code lost:
            r8 = new b.i.a.b.m(false, r3);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:156:0x0278, code lost:
            r3 = r8;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:157:0x027a, code lost:
            r10 = new b.i.a.b.h(0, 1, false, true, r2.f1057b);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:158:0x0287, code lost:
            r16 = new b.i.a.b.h(0, 1, true, true, r2.f1057b);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:159:0x029b, code lost:
            r9 = new b.i.a.b.h(0, 1, false, false, (java.lang.String) null);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:160:0x02a7, code lost:
            r15 = new b.i.a.b.h(0, 1, true, false, (java.lang.String) null);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:161:0x02b7, code lost:
            r8 = r3;
            r20 = r7;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:163:0x02be, code lost:
            if (r10 == b.i.a.b.j.f1046j) goto L_0x02c9;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:165:0x02c2, code lost:
            if (r10 != b.i.a.b.j.f1048l) goto L_0x02c5;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:166:0x02c5, code lost:
            r17 = false;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:167:0x02c9, code lost:
            r17 = r8;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:169:0x02cd, code lost:
            if (r10 == b.i.a.b.j.f1048l) goto L_0x02d8;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:171:0x02d1, code lost:
            if (r10 != b.i.a.b.j.f1049m) goto L_0x02d4;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:172:0x02d4, code lost:
            r18 = false;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:173:0x02d8, code lost:
            r18 = r8;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:175:0x02de, code lost:
            if (f() == false) goto L_0x02e1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:176:0x02e1, code lost:
            r10 = r0.f1267b;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:177:0x02e7, code lost:
            if (d('(') != false) goto L_0x02ed;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:178:0x02e9, code lost:
            r20 = r7;
            r3 = r3;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:179:0x02ed, code lost:
            r();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:180:0x02f7, code lost:
            if (e("odd") == false) goto L_0x02ff;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:181:0x02f9, code lost:
            r3 = new b.i.a.b.d.a(2, r8);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:183:0x0305, code lost:
            if (e("even") == false) goto L_0x0311;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:184:0x0307, code lost:
            r3 = new b.i.a.b.d.a(2, 0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:185:0x030d, code lost:
            r20 = r7;
            r3 = r3;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:186:0x0311, code lost:
            r8 = r8;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:187:0x0319, code lost:
            if (d('+') == false) goto L_0x031c;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:188:0x031c, code lost:
            r8 = r8;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:189:0x0320, code lost:
            if (d('-') == false) goto L_0x0323;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:190:0x0322, code lost:
            r8 = -1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:191:0x0323, code lost:
            r3 = b.i.a.c.a(r0.a, r0.f1267b, r0.c, false);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:192:0x032e, code lost:
            if (r3 == null) goto L_0x0334;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:193:0x0330, code lost:
            r0.f1267b = r3.a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:195:0x033a, code lost:
            if (d('n') != false) goto L_0x0350;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:197:0x0342, code lost:
            if (d('N') == false) goto L_0x0345;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:198:0x0345, code lost:
            r11 = r8;
            r8 = 1;
            r14 = null;
            r13 = 0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:199:0x0350, code lost:
            if (r3 == null) goto L_0x0353;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:200:0x0353, code lost:
            r3 = new b.i.a.c(1, r0.f1267b);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:201:0x035c, code lost:
            r();
            r13 = d('+');
         */
        /* JADX WARNING: Code restructure failed: missing block: B:202:0x0365, code lost:
            if (r13 != false) goto L_0x036f;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:203:0x0367, code lost:
            r13 = d('-');
         */
        /* JADX WARNING: Code restructure failed: missing block: B:204:0x036b, code lost:
            if (r13 == false) goto L_0x036f;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:205:0x036d, code lost:
            r11 = -1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:206:0x036f, code lost:
            r11 = 1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:207:0x0370, code lost:
            if (r13 == false) goto L_0x038c;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:208:0x0372, code lost:
            r();
            r16 = r3;
            r3 = 0;
            r13 = b.i.a.c.a(r0.a, r0.f1267b, r0.c, false);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:209:0x0382, code lost:
            if (r13 == null) goto L_0x0389;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:210:0x0384, code lost:
            r0.f1267b = r13.a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:211:0x0389, code lost:
            r20 = r7;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:212:0x038c, code lost:
            r16 = r3;
            r3 = 0;
            r13 = null;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:213:0x0390, code lost:
            r14 = r16;
            r22 = r13;
            r13 = r3;
            r3 = r22;
            r8 = r8;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:215:0x0399, code lost:
            if (r14 != null) goto L_0x039c;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:216:0x039c, code lost:
            r13 = ((int) r14.f1061b) * r8;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:217:0x03a0, code lost:
            if (r3 != null) goto L_0x03a6;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:218:0x03a2, code lost:
            r3 = 0;
            r20 = r7;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:219:0x03a6, code lost:
            r20 = r7;
            r3 = ((int) r3.f1061b) * r11;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:220:0x03ac, code lost:
            r3 = new b.i.a.b.d.a(r13, r3);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:221:0x03b0, code lost:
            r();
            r3 = r3;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:222:0x03b9, code lost:
            if (d(')') == false) goto L_0x03bc;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:223:0x03bc, code lost:
            r0.f1267b = r10;
            r3 = null;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:224:0x03bf, code lost:
            if (r3 == null) goto L_0x03d3;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:225:0x03c1, code lost:
            r8 = new b.i.a.b.h(r3.a, r3.f1027b, r17, r18, r2.f1057b);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:227:0x03dc, code lost:
            throw new b.i.a.a(b.e.a.a.a.m("Invalid or missing parameter section for pseudo class: ", r9));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:228:0x03dd, code lost:
            r20 = r7;
            r3 = new b.i.a.b.n((b.i.a.b.a) null);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:229:0x03e6, code lost:
            r20 = r7;
            r3 = new b.i.a.b.o(r3);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:230:0x03ee, code lost:
            r8 = r3;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:231:0x03ef, code lost:
            r4.a();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:233:0x03f4, code lost:
            if (r2.d != null) goto L_0x03fd;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:234:0x03f6, code lost:
            r2.d = new java.util.ArrayList();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:235:0x03fd, code lost:
            r2.d.add(r8);
            r3 = false;
            r8 = true;
            r7 = r20;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:237:0x040f, code lost:
            throw new b.i.a.a("Invalid pseudo class");
         */
        /* JADX WARNING: Code restructure failed: missing block: B:276:0x007b, code lost:
            r8 = r8;
            r3 = r3;
            r2 = r2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:278:0x007b, code lost:
            r2 = r2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:284:0x0235, code lost:
            r3 = r3;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:43:0x00ab, code lost:
            if (d('#') == false) goto L_0x00d0;
            r2 = r2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:44:0x00ad, code lost:
            if (r2 != null) goto L_0x00b4;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:45:0x00af, code lost:
            r2 = new b.i.a.b.t(r7, r3);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:46:0x00b4, code lost:
            r9 = u();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:47:0x00b8, code lost:
            if (r9 == null) goto L_0x00c8;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:48:0x00ba, code lost:
            r2.a(com.segment.analytics.AnalyticsContext.Device.DEVICE_ID_KEY, r5, r9);
            r4.f1056b += 1000000;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:50:0x00cf, code lost:
            throw new b.i.a.a("Invalid \"#id\" simpleSelectors");
         */
        /* JADX WARNING: Code restructure failed: missing block: B:52:0x00d6, code lost:
            if (d('[') == false) goto L_0x0153;
            r2 = r2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:53:0x00d8, code lost:
            if (r2 != null) goto L_0x00df;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:54:0x00da, code lost:
            r2 = new b.i.a.b.t(r7, r3);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:55:0x00df, code lost:
            r();
            r9 = u();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:56:0x00e8, code lost:
            if (r9 == null) goto L_0x014d;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:57:0x00ea, code lost:
            r();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:58:0x00f3, code lost:
            if (d('=') == false) goto L_0x00f7;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:59:0x00f5, code lost:
            r11 = r5;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:61:0x00fd, code lost:
            if (e("~=") == false) goto L_0x0102;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:62:0x00ff, code lost:
            r11 = b.i.a.b.c.f1024j;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:64:0x0108, code lost:
            if (e("|=") == false) goto L_0x010d;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:65:0x010a, code lost:
            r11 = b.i.a.b.c.f1025k;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:66:0x010d, code lost:
            r11 = r3;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:67:0x010e, code lost:
            if (r11 == null) goto L_0x0132;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:68:0x0110, code lost:
            r();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:69:0x0117, code lost:
            if (f() == false) goto L_0x011b;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:70:0x0119, code lost:
            r12 = r3;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:71:0x011b, code lost:
            r12 = k();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:72:0x011f, code lost:
            if (r12 == null) goto L_0x0122;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:73:0x0122, code lost:
            r12 = u();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:74:0x0126, code lost:
            if (r12 == null) goto L_0x012c;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:75:0x0128, code lost:
            r();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:77:0x0131, code lost:
            throw new b.i.a.a("Invalid attribute simpleSelectors");
         */
        /* JADX WARNING: Code restructure failed: missing block: B:78:0x0132, code lost:
            r12 = r3;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:80:0x0139, code lost:
            if (d(']') == false) goto L_0x0147;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:81:0x013b, code lost:
            if (r11 != null) goto L_0x013f;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:82:0x013d, code lost:
            r11 = b.i.a.b.c.f1022h;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:83:0x013f, code lost:
            r2.a(r9, r11, r12);
            r2 = r2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:86:0x014c, code lost:
            throw new b.i.a.a("Invalid attribute simpleSelectors");
         */
        /* JADX WARNING: Code restructure failed: missing block: B:88:0x0152, code lost:
            throw new b.i.a.a("Invalid attribute simpleSelectors");
         */
        /* JADX WARNING: Code restructure failed: missing block: B:90:0x0159, code lost:
            if (d(':') == false) goto L_0x0410;
            r2 = r2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:91:0x015b, code lost:
            if (r2 != null) goto L_0x0162;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:92:0x015d, code lost:
            r2 = new b.i.a.b.t(r7, r3);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:93:0x0162, code lost:
            r9 = u();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:94:0x0166, code lost:
            if (r9 == null) goto L_0x0408;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:95:0x0168, code lost:
            r10 = b.i.a.b.j.G.get(r9);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:96:0x0170, code lost:
            if (r10 == null) goto L_0x0173;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:97:0x0173, code lost:
            r10 = b.i.a.b.j.F;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:99:0x017f, code lost:
            switch(r10.ordinal()) {
                case 0: goto L_0x03e6;
                case 1: goto L_0x03dd;
                case 2: goto L_0x02bc;
                case 3: goto L_0x02bc;
                case 4: goto L_0x02bc;
                case 5: goto L_0x02bc;
                case 6: goto L_0x02a7;
                case 7: goto L_0x029b;
                case 8: goto L_0x0287;
                case 9: goto L_0x027a;
                case 10: goto L_0x0272;
                case 11: goto L_0x026a;
                case 12: goto L_0x0264;
                case 13: goto L_0x01d2;
                case 14: goto L_0x0195;
                case 15: goto L_0x018e;
                case 16: goto L_0x018e;
                case 17: goto L_0x018e;
                case 18: goto L_0x018e;
                case 19: goto L_0x018e;
                case 20: goto L_0x018e;
                case 21: goto L_0x018e;
                case 22: goto L_0x018e;
                case 23: goto L_0x018e;
                default: goto L_0x0182;
            };
         */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Removed duplicated region for block: B:239:0x0412  */
        /* JADX WARNING: Removed duplicated region for block: B:243:0x0424  */
        /* JADX WARNING: Removed duplicated region for block: B:246:0x0429  */
        /* JADX WARNING: Removed duplicated region for block: B:255:0x044a  */
        /* JADX WARNING: Removed duplicated region for block: B:256:0x044c  */
        /* JADX WARNING: Removed duplicated region for block: B:258:0x044f  */
        /* JADX WARNING: Removed duplicated region for block: B:261:0x043f A[SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:26:0x0059  */
        /* JADX WARNING: Removed duplicated region for block: B:27:0x0065  */
        /* JADX WARNING: Removed duplicated region for block: B:33:0x0081  */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.util.List<b.i.a.b.s> v() {
            /*
                r23 = this;
                r0 = r23
                boolean r1 = r23.f()
                r2 = 0
                if (r1 == 0) goto L_0x000a
                return r2
            L_0x000a:
                java.util.ArrayList r1 = new java.util.ArrayList
                r3 = 1
                r1.<init>(r3)
                b.i.a.b$s r4 = new b.i.a.b$s
                r4.<init>(r2)
            L_0x0015:
                boolean r5 = r23.f()
                if (r5 != 0) goto L_0x043f
                b.i.a.b$c r5 = b.i.a.b.c.EQUALS
                boolean r6 = r23.f()
                if (r6 == 0) goto L_0x0025
                goto L_0x0426
            L_0x0025:
                int r6 = r0.f1267b
                java.util.List<b.i.a.b$t> r7 = r4.a
                if (r7 == 0) goto L_0x0034
                boolean r7 = r7.isEmpty()
                if (r7 == 0) goto L_0x0032
                goto L_0x0034
            L_0x0032:
                r7 = 0
                goto L_0x0035
            L_0x0034:
                r7 = r3
            L_0x0035:
                r8 = 43
                if (r7 != 0) goto L_0x0050
                r7 = 62
                boolean r7 = r0.d(r7)
                if (r7 == 0) goto L_0x0044
                b.i.a.b$e r7 = b.i.a.b.e.CHILD
                goto L_0x004c
            L_0x0044:
                boolean r7 = r0.d(r8)
                if (r7 == 0) goto L_0x0050
                b.i.a.b$e r7 = b.i.a.b.e.FOLLOWS
            L_0x004c:
                r23.r()
                goto L_0x0051
            L_0x0050:
                r7 = r2
            L_0x0051:
                r8 = 42
                boolean r8 = r0.d(r8)
                if (r8 == 0) goto L_0x0065
                b.i.a.b$t r8 = new b.i.a.b$t
                r8.<init>(r7, r2)
                r22 = r3
                r3 = r2
                r2 = r8
                r8 = r22
                goto L_0x007b
            L_0x0065:
                java.lang.String r8 = r23.u()
                if (r8 == 0) goto L_0x0079
                b.i.a.b$t r9 = new b.i.a.b$t
                r9.<init>(r7, r8)
                int r8 = r4.f1056b
                int r8 = r8 + r3
                r4.f1056b = r8
                r8 = r3
                r3 = r2
                r2 = r9
                goto L_0x007b
            L_0x0079:
                r8 = r3
                r3 = r2
            L_0x007b:
                boolean r9 = r23.f()
                if (r9 != 0) goto L_0x0410
                r9 = 46
                boolean r9 = r0.d(r9)
                if (r9 == 0) goto L_0x00a5
                if (r2 != 0) goto L_0x0090
                b.i.a.b$t r2 = new b.i.a.b$t
                r2.<init>(r7, r3)
            L_0x0090:
                java.lang.String r9 = r23.u()
                if (r9 == 0) goto L_0x009d
                java.lang.String r10 = "class"
                r2.a(r10, r5, r9)
                goto L_0x0142
            L_0x009d:
                b.i.a.a r1 = new b.i.a.a
                java.lang.String r2 = "Invalid \".class\" simpleSelectors"
                r1.<init>(r2)
                throw r1
            L_0x00a5:
                r9 = 35
                boolean r9 = r0.d(r9)
                if (r9 == 0) goto L_0x00d0
                if (r2 != 0) goto L_0x00b4
                b.i.a.b$t r2 = new b.i.a.b$t
                r2.<init>(r7, r3)
            L_0x00b4:
                java.lang.String r9 = r23.u()
                if (r9 == 0) goto L_0x00c8
                java.lang.String r10 = "id"
                r2.a(r10, r5, r9)
                int r9 = r4.f1056b
                r10 = 1000000(0xf4240, float:1.401298E-39)
                int r9 = r9 + r10
                r4.f1056b = r9
                goto L_0x007b
            L_0x00c8:
                b.i.a.a r1 = new b.i.a.a
                java.lang.String r2 = "Invalid \"#id\" simpleSelectors"
                r1.<init>(r2)
                throw r1
            L_0x00d0:
                r9 = 91
                boolean r9 = r0.d(r9)
                if (r9 == 0) goto L_0x0153
                if (r2 != 0) goto L_0x00df
                b.i.a.b$t r2 = new b.i.a.b$t
                r2.<init>(r7, r3)
            L_0x00df:
                r23.r()
                java.lang.String r9 = r23.u()
                java.lang.String r10 = "Invalid attribute simpleSelectors"
                if (r9 == 0) goto L_0x014d
                r23.r()
                r11 = 61
                boolean r11 = r0.d(r11)
                if (r11 == 0) goto L_0x00f7
                r11 = r5
                goto L_0x010e
            L_0x00f7:
                java.lang.String r11 = "~="
                boolean r11 = r0.e(r11)
                if (r11 == 0) goto L_0x0102
                b.i.a.b$c r11 = b.i.a.b.c.INCLUDES
                goto L_0x010e
            L_0x0102:
                java.lang.String r11 = "|="
                boolean r11 = r0.e(r11)
                if (r11 == 0) goto L_0x010d
                b.i.a.b$c r11 = b.i.a.b.c.DASHMATCH
                goto L_0x010e
            L_0x010d:
                r11 = r3
            L_0x010e:
                if (r11 == 0) goto L_0x0132
                r23.r()
                boolean r12 = r23.f()
                if (r12 == 0) goto L_0x011b
                r12 = r3
                goto L_0x0126
            L_0x011b:
                java.lang.String r12 = r23.k()
                if (r12 == 0) goto L_0x0122
                goto L_0x0126
            L_0x0122:
                java.lang.String r12 = r23.u()
            L_0x0126:
                if (r12 == 0) goto L_0x012c
                r23.r()
                goto L_0x0133
            L_0x012c:
                b.i.a.a r1 = new b.i.a.a
                r1.<init>(r10)
                throw r1
            L_0x0132:
                r12 = r3
            L_0x0133:
                r13 = 93
                boolean r13 = r0.d(r13)
                if (r13 == 0) goto L_0x0147
                if (r11 != 0) goto L_0x013f
                b.i.a.b$c r11 = b.i.a.b.c.EXISTS
            L_0x013f:
                r2.a(r9, r11, r12)
            L_0x0142:
                r4.a()
                goto L_0x007b
            L_0x0147:
                b.i.a.a r1 = new b.i.a.a
                r1.<init>(r10)
                throw r1
            L_0x014d:
                b.i.a.a r1 = new b.i.a.a
                r1.<init>(r10)
                throw r1
            L_0x0153:
                r9 = 58
                boolean r9 = r0.d(r9)
                if (r9 == 0) goto L_0x0410
                if (r2 != 0) goto L_0x0162
                b.i.a.b$t r2 = new b.i.a.b$t
                r2.<init>(r7, r3)
            L_0x0162:
                java.lang.String r9 = r23.u()
                if (r9 == 0) goto L_0x0408
                java.util.Map<java.lang.String, b.i.a.b$j> r10 = b.i.a.b.j.G
                java.lang.Object r10 = r10.get(r9)
                b.i.a.b$j r10 = (b.i.a.b.j) r10
                if (r10 == 0) goto L_0x0173
                goto L_0x0175
            L_0x0173:
                b.i.a.b$j r10 = b.i.a.b.j.UNSUPPORTED
            L_0x0175:
                int r11 = r10.ordinal()
                java.lang.String r12 = "Invalid or missing parameter section for pseudo class: "
                r13 = 40
                r14 = 41
                switch(r11) {
                    case 0: goto L_0x03e6;
                    case 1: goto L_0x03dd;
                    case 2: goto L_0x02bc;
                    case 3: goto L_0x02bc;
                    case 4: goto L_0x02bc;
                    case 5: goto L_0x02bc;
                    case 6: goto L_0x02a7;
                    case 7: goto L_0x029b;
                    case 8: goto L_0x0287;
                    case 9: goto L_0x027a;
                    case 10: goto L_0x0272;
                    case 11: goto L_0x026a;
                    case 12: goto L_0x0264;
                    case 13: goto L_0x01d2;
                    case 14: goto L_0x0195;
                    case 15: goto L_0x018e;
                    case 16: goto L_0x018e;
                    case 17: goto L_0x018e;
                    case 18: goto L_0x018e;
                    case 19: goto L_0x018e;
                    case 20: goto L_0x018e;
                    case 21: goto L_0x018e;
                    case 22: goto L_0x018e;
                    case 23: goto L_0x018e;
                    default: goto L_0x0182;
                }
            L_0x0182:
                b.i.a.a r1 = new b.i.a.a
                java.lang.String r2 = "Unsupported pseudo class: "
                java.lang.String r2 = b.e.a.a.a.m(r2, r9)
                r1.<init>(r2)
                throw r1
            L_0x018e:
                b.i.a.b$l r3 = new b.i.a.b$l
                r3.<init>(r9)
                goto L_0x02b7
            L_0x0195:
                boolean r8 = r23.f()
                if (r8 == 0) goto L_0x019c
                goto L_0x01cb
            L_0x019c:
                int r8 = r0.f1267b
                boolean r10 = r0.d(r13)
                if (r10 != 0) goto L_0x01a5
                goto L_0x01cb
            L_0x01a5:
                r23.r()
            L_0x01a8:
                java.lang.String r10 = r23.u()
                if (r10 != 0) goto L_0x01af
                goto L_0x01c9
            L_0x01af:
                if (r3 != 0) goto L_0x01b6
                java.util.ArrayList r3 = new java.util.ArrayList
                r3.<init>()
            L_0x01b6:
                r3.add(r10)
                r23.r()
                boolean r10 = r23.q()
                if (r10 != 0) goto L_0x01a8
                boolean r3 = r0.d(r14)
                if (r3 == 0) goto L_0x01c9
                goto L_0x01cb
            L_0x01c9:
                r0.f1267b = r8
            L_0x01cb:
                b.i.a.b$l r3 = new b.i.a.b$l
                r3.<init>(r9)
                goto L_0x02b7
            L_0x01d2:
                boolean r8 = r23.f()
                if (r8 == 0) goto L_0x01d9
                goto L_0x0235
            L_0x01d9:
                int r8 = r0.f1267b
                boolean r10 = r0.d(r13)
                if (r10 != 0) goto L_0x01e2
                goto L_0x0235
            L_0x01e2:
                r23.r()
                java.util.List r10 = r23.v()
                if (r10 != 0) goto L_0x01ec
                goto L_0x01f2
            L_0x01ec:
                boolean r11 = r0.d(r14)
                if (r11 != 0) goto L_0x01f5
            L_0x01f2:
                r0.f1267b = r8
                goto L_0x0235
            L_0x01f5:
                java.util.Iterator r8 = r10.iterator()
            L_0x01f9:
                boolean r11 = r8.hasNext()
                if (r11 == 0) goto L_0x0234
                java.lang.Object r11 = r8.next()
                b.i.a.b$s r11 = (b.i.a.b.s) r11
                java.util.List<b.i.a.b$t> r11 = r11.a
                if (r11 != 0) goto L_0x020a
                goto L_0x0234
            L_0x020a:
                java.util.Iterator r11 = r11.iterator()
            L_0x020e:
                boolean r13 = r11.hasNext()
                if (r13 == 0) goto L_0x01f9
                java.lang.Object r13 = r11.next()
                b.i.a.b$t r13 = (b.i.a.b.t) r13
                java.util.List<b.i.a.b$g> r13 = r13.d
                if (r13 != 0) goto L_0x021f
                goto L_0x01f9
            L_0x021f:
                java.util.Iterator r13 = r13.iterator()
            L_0x0223:
                boolean r14 = r13.hasNext()
                if (r14 == 0) goto L_0x020e
                java.lang.Object r14 = r13.next()
                b.i.a.b$g r14 = (b.i.a.b.g) r14
                boolean r14 = r14 instanceof b.i.a.b.k
                if (r14 == 0) goto L_0x0223
                goto L_0x0235
            L_0x0234:
                r3 = r10
            L_0x0235:
                if (r3 == 0) goto L_0x025a
                b.i.a.b$k r8 = new b.i.a.b$k
                r8.<init>(r3)
                java.util.Iterator r3 = r3.iterator()
                r9 = -2147483648(0xffffffff80000000, float:-0.0)
            L_0x0242:
                boolean r10 = r3.hasNext()
                if (r10 == 0) goto L_0x0254
                java.lang.Object r10 = r3.next()
                b.i.a.b$s r10 = (b.i.a.b.s) r10
                int r10 = r10.f1056b
                if (r10 <= r9) goto L_0x0242
                r9 = r10
                goto L_0x0242
            L_0x0254:
                r4.f1056b = r9
                r20 = r7
                goto L_0x03f2
            L_0x025a:
                b.i.a.a r1 = new b.i.a.a
                java.lang.String r2 = b.e.a.a.a.m(r12, r9)
                r1.<init>(r2)
                throw r1
            L_0x0264:
                b.i.a.b$i r8 = new b.i.a.b$i
                r8.<init>(r3)
                goto L_0x0278
            L_0x026a:
                b.i.a.b$m r3 = new b.i.a.b$m
                java.lang.String r9 = r2.f1057b
                r3.<init>(r8, r9)
                goto L_0x02b7
            L_0x0272:
                b.i.a.b$m r8 = new b.i.a.b$m
                r9 = 0
                r8.<init>(r9, r3)
            L_0x0278:
                r3 = r8
                goto L_0x02b7
            L_0x027a:
                b.i.a.b$h r3 = new b.i.a.b$h
                r11 = 0
                r12 = 1
                r13 = 0
                r14 = 1
                java.lang.String r15 = r2.f1057b
                r10 = r3
                r10.<init>(r11, r12, r13, r14, r15)
                goto L_0x02b7
            L_0x0287:
                b.i.a.b$h r3 = new b.i.a.b$h
                r17 = 0
                r18 = 1
                r19 = 1
                r20 = 1
                java.lang.String r8 = r2.f1057b
                r16 = r3
                r21 = r8
                r16.<init>(r17, r18, r19, r20, r21)
                goto L_0x02b7
            L_0x029b:
                b.i.a.b$h r3 = new b.i.a.b$h
                r10 = 0
                r11 = 1
                r12 = 0
                r13 = 0
                r14 = 0
                r9 = r3
                r9.<init>(r10, r11, r12, r13, r14)
                goto L_0x02b7
            L_0x02a7:
                b.i.a.b$h r3 = new b.i.a.b$h
                r16 = 0
                r17 = 1
                r18 = 1
                r19 = 0
                r20 = 0
                r15 = r3
                r15.<init>(r16, r17, r18, r19, r20)
            L_0x02b7:
                r8 = r3
                r20 = r7
                goto L_0x03ef
            L_0x02bc:
                b.i.a.b$j r11 = b.i.a.b.j.nth_child
                if (r10 == r11) goto L_0x02c9
                b.i.a.b$j r11 = b.i.a.b.j.nth_of_type
                if (r10 != r11) goto L_0x02c5
                goto L_0x02c9
            L_0x02c5:
                r11 = 0
                r17 = r11
                goto L_0x02cb
            L_0x02c9:
                r17 = r8
            L_0x02cb:
                b.i.a.b$j r11 = b.i.a.b.j.nth_of_type
                if (r10 == r11) goto L_0x02d8
                b.i.a.b$j r11 = b.i.a.b.j.nth_last_of_type
                if (r10 != r11) goto L_0x02d4
                goto L_0x02d8
            L_0x02d4:
                r10 = 0
                r18 = r10
                goto L_0x02da
            L_0x02d8:
                r18 = r8
            L_0x02da:
                boolean r10 = r23.f()
                if (r10 == 0) goto L_0x02e1
                goto L_0x02e9
            L_0x02e1:
                int r10 = r0.f1267b
                boolean r11 = r0.d(r13)
                if (r11 != 0) goto L_0x02ed
            L_0x02e9:
                r20 = r7
                goto L_0x03bf
            L_0x02ed:
                r23.r()
                java.lang.String r3 = "odd"
                boolean r3 = r0.e(r3)
                r11 = 2
                if (r3 == 0) goto L_0x02ff
                b.i.a.b$d$a r3 = new b.i.a.b$d$a
                r3.<init>(r11, r8)
                goto L_0x030d
            L_0x02ff:
                java.lang.String r3 = "even"
                boolean r3 = r0.e(r3)
                if (r3 == 0) goto L_0x0311
                b.i.a.b$d$a r3 = new b.i.a.b$d$a
                r8 = 0
                r3.<init>(r11, r8)
            L_0x030d:
                r20 = r7
                goto L_0x03b0
            L_0x0311:
                r3 = 43
                boolean r3 = r0.d(r3)
                r11 = 45
                if (r3 == 0) goto L_0x031c
                goto L_0x0323
            L_0x031c:
                boolean r3 = r0.d(r11)
                if (r3 == 0) goto L_0x0323
                r8 = -1
            L_0x0323:
                java.lang.String r3 = r0.a
                int r13 = r0.f1267b
                int r14 = r0.c
                r15 = 0
                b.i.a.c r3 = b.i.a.c.a(r3, r13, r14, r15)
                if (r3 == 0) goto L_0x0334
                int r13 = r3.a
                r0.f1267b = r13
            L_0x0334:
                r13 = 110(0x6e, float:1.54E-43)
                boolean r13 = r0.d(r13)
                if (r13 != 0) goto L_0x0350
                r13 = 78
                boolean r13 = r0.d(r13)
                if (r13 == 0) goto L_0x0345
                goto L_0x0350
            L_0x0345:
                r11 = 0
                r13 = 0
                r14 = 1
                r22 = r11
                r11 = r8
                r8 = r14
                r14 = r13
                r13 = r22
                goto L_0x0397
            L_0x0350:
                if (r3 == 0) goto L_0x0353
                goto L_0x035c
            L_0x0353:
                b.i.a.c r3 = new b.i.a.c
                r13 = 1
                int r15 = r0.f1267b
                r3.<init>(r13, r15)
            L_0x035c:
                r23.r()
                r13 = 43
                boolean r13 = r0.d(r13)
                if (r13 != 0) goto L_0x036f
                boolean r13 = r0.d(r11)
                if (r13 == 0) goto L_0x036f
                r11 = -1
                goto L_0x0370
            L_0x036f:
                r11 = 1
            L_0x0370:
                if (r13 == 0) goto L_0x038c
                r23.r()
                java.lang.String r13 = r0.a
                int r14 = r0.f1267b
                int r15 = r0.c
                r16 = r3
                r3 = 0
                b.i.a.c r13 = b.i.a.c.a(r13, r14, r15, r3)
                if (r13 == 0) goto L_0x0389
                int r14 = r13.a
                r0.f1267b = r14
                goto L_0x0390
            L_0x0389:
                r20 = r7
                goto L_0x03bc
            L_0x038c:
                r16 = r3
                r3 = 0
                r13 = 0
            L_0x0390:
                r14 = r16
                r22 = r13
                r13 = r3
                r3 = r22
            L_0x0397:
                b.i.a.b$d$a r15 = new b.i.a.b$d$a
                if (r14 != 0) goto L_0x039c
                goto L_0x03a0
            L_0x039c:
                long r13 = r14.f1061b
                int r13 = (int) r13
                int r13 = r13 * r8
            L_0x03a0:
                if (r3 != 0) goto L_0x03a6
                r3 = 0
                r20 = r7
                goto L_0x03ac
            L_0x03a6:
                r20 = r7
                long r7 = r3.f1061b
                int r3 = (int) r7
                int r3 = r3 * r11
            L_0x03ac:
                r15.<init>(r13, r3)
                r3 = r15
            L_0x03b0:
                r23.r()
                r7 = 41
                boolean r7 = r0.d(r7)
                if (r7 == 0) goto L_0x03bc
                goto L_0x03bf
            L_0x03bc:
                r0.f1267b = r10
                r3 = 0
            L_0x03bf:
                if (r3 == 0) goto L_0x03d3
                b.i.a.b$h r7 = new b.i.a.b$h
                int r15 = r3.a
                int r3 = r3.f1027b
                java.lang.String r8 = r2.f1057b
                r14 = r7
                r16 = r3
                r19 = r8
                r14.<init>(r15, r16, r17, r18, r19)
                r8 = r7
                goto L_0x03ef
            L_0x03d3:
                b.i.a.a r1 = new b.i.a.a
                java.lang.String r2 = b.e.a.a.a.m(r12, r9)
                r1.<init>(r2)
                throw r1
            L_0x03dd:
                r20 = r7
                b.i.a.b$n r3 = new b.i.a.b$n
                r7 = 0
                r3.<init>(r7)
                goto L_0x03ee
            L_0x03e6:
                r20 = r7
                b.i.a.b$o r7 = new b.i.a.b$o
                r7.<init>(r3)
                r3 = r7
            L_0x03ee:
                r8 = r3
            L_0x03ef:
                r4.a()
            L_0x03f2:
                java.util.List<b.i.a.b$g> r3 = r2.d
                if (r3 != 0) goto L_0x03fd
                java.util.ArrayList r3 = new java.util.ArrayList
                r3.<init>()
                r2.d = r3
            L_0x03fd:
                java.util.List<b.i.a.b$g> r3 = r2.d
                r3.add(r8)
                r3 = 0
                r8 = 1
                r7 = r20
                goto L_0x007b
            L_0x0408:
                b.i.a.a r1 = new b.i.a.a
                java.lang.String r2 = "Invalid pseudo class"
                r1.<init>(r2)
                throw r1
            L_0x0410:
                if (r2 == 0) goto L_0x0424
                java.util.List<b.i.a.b$t> r3 = r4.a
                if (r3 != 0) goto L_0x041d
                java.util.ArrayList r3 = new java.util.ArrayList
                r3.<init>()
                r4.a = r3
            L_0x041d:
                java.util.List<b.i.a.b$t> r3 = r4.a
                r3.add(r2)
                r2 = 1
                goto L_0x0427
            L_0x0424:
                r0.f1267b = r6
            L_0x0426:
                r2 = 0
            L_0x0427:
                if (r2 == 0) goto L_0x043f
                boolean r2 = r23.q()
                if (r2 != 0) goto L_0x0431
                r2 = 0
                goto L_0x043c
            L_0x0431:
                r1.add(r4)
                b.i.a.b$s r2 = new b.i.a.b$s
                r3 = 0
                r2.<init>(r3)
                r4 = r2
                r2 = r3
            L_0x043c:
                r3 = 1
                goto L_0x0015
            L_0x043f:
                java.util.List<b.i.a.b$t> r2 = r4.a
                if (r2 == 0) goto L_0x044c
                boolean r2 = r2.isEmpty()
                if (r2 == 0) goto L_0x044a
                goto L_0x044c
            L_0x044a:
                r2 = 0
                goto L_0x044d
            L_0x044c:
                r2 = 1
            L_0x044d:
                if (r2 != 0) goto L_0x0452
                r1.add(r4)
            L_0x0452:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: b.i.a.b.d.v():java.util.List");
        }
    }

    public enum e {
        DESCENDANT,
        CHILD,
        FOLLOWS
    }

    public enum f {
        all,
        aural,
        braille,
        embossed,
        handheld,
        print,
        projection,
        screen,
        speech,
        tty,
        tv
    }

    public interface g {
        boolean a(q qVar, f.k0 k0Var);
    }

    public static class h implements g {
        public int a;

        /* renamed from: b  reason: collision with root package name */
        public int f1042b;
        public boolean c;
        public boolean d;

        /* renamed from: e  reason: collision with root package name */
        public String f1043e;

        public h(int i2, int i3, boolean z, boolean z2, String str) {
            this.a = i2;
            this.f1042b = i3;
            this.c = z;
            this.d = z2;
            this.f1043e = str;
        }

        public boolean a(q qVar, f.k0 k0Var) {
            int i2;
            int i3;
            String o2 = (!this.d || this.f1043e != null) ? this.f1043e : k0Var.o();
            f.i0 i0Var = k0Var.f1183b;
            if (i0Var != null) {
                Iterator<f.m0> it = i0Var.c().iterator();
                i3 = 0;
                i2 = 0;
                while (it.hasNext()) {
                    f.k0 k0Var2 = (f.k0) it.next();
                    if (k0Var2 == k0Var) {
                        i3 = i2;
                    }
                    if (o2 == null || k0Var2.o().equals(o2)) {
                        i2++;
                    }
                }
            } else {
                i3 = 0;
                i2 = 1;
            }
            int i4 = this.c ? i3 + 1 : i2 - i3;
            int i5 = this.a;
            if (i5 == 0) {
                return i4 == this.f1042b;
            }
            int i6 = this.f1042b;
            if ((i4 - i6) % i5 == 0) {
                return Integer.signum(i4 - i6) == 0 || Integer.signum(i4 - this.f1042b) == Integer.signum(this.a);
            }
            return false;
        }

        public String toString() {
            String str = this.c ? "" : "last-";
            if (this.d) {
                return String.format("nth-%schild(%dn%+d of type <%s>)", new Object[]{str, Integer.valueOf(this.a), Integer.valueOf(this.f1042b), this.f1043e});
            }
            return String.format("nth-%schild(%dn%+d)", new Object[]{str, Integer.valueOf(this.a), Integer.valueOf(this.f1042b)});
        }
    }

    public static class i implements g {
        public i(a aVar) {
        }

        public boolean a(q qVar, f.k0 k0Var) {
            return !(k0Var instanceof f.i0) || ((f.i0) k0Var).c().size() == 0;
        }

        public String toString() {
            return "empty";
        }
    }

    public enum j {
        target,
        root,
        nth_child,
        nth_last_child,
        nth_of_type,
        nth_last_of_type,
        first_child,
        last_child,
        first_of_type,
        last_of_type,
        only_child,
        only_of_type,
        empty,
        not,
        lang,
        link,
        visited,
        hover,
        active,
        focus,
        enabled,
        disabled,
        checked,
        indeterminate,
        UNSUPPORTED;
        
        public static final Map<String, j> G = null;

        /* access modifiers changed from: public */
        static {
            G = new HashMap();
            j[] values = values();
            for (int i2 = 0; i2 < 25; i2++) {
                j jVar = values[i2];
                if (jVar != UNSUPPORTED) {
                    G.put(jVar.name().replace('_', '-'), jVar);
                }
            }
        }
    }

    public static class k implements g {
        public List<s> a;

        public k(List<s> list) {
            this.a = list;
        }

        public boolean a(q qVar, f.k0 k0Var) {
            for (s h2 : this.a) {
                if (b.h(qVar, h2, k0Var)) {
                    return false;
                }
            }
            return true;
        }

        public String toString() {
            StringBuilder y = b.e.a.a.a.y("not(");
            y.append(this.a);
            y.append(")");
            return y.toString();
        }
    }

    public static class l implements g {
        public String a;

        public l(String str) {
            this.a = str;
        }

        public boolean a(q qVar, f.k0 k0Var) {
            return false;
        }

        public String toString() {
            return this.a;
        }
    }

    public static class m implements g {
        public boolean a;

        /* renamed from: b  reason: collision with root package name */
        public String f1054b;

        public m(boolean z, String str) {
            this.a = z;
            this.f1054b = str;
        }

        public boolean a(q qVar, f.k0 k0Var) {
            int i2;
            String o2 = (!this.a || this.f1054b != null) ? this.f1054b : k0Var.o();
            f.i0 i0Var = k0Var.f1183b;
            if (i0Var != null) {
                Iterator<f.m0> it = i0Var.c().iterator();
                i2 = 0;
                while (it.hasNext()) {
                    f.k0 k0Var2 = (f.k0) it.next();
                    if (o2 == null || k0Var2.o().equals(o2)) {
                        i2++;
                    }
                }
            } else {
                i2 = 1;
            }
            return i2 == 1;
        }

        public String toString() {
            if (!this.a) {
                return String.format("only-child", new Object[0]);
            }
            return String.format("only-of-type <%s>", new Object[]{this.f1054b});
        }
    }

    public static class n implements g {
        public n(a aVar) {
        }

        public boolean a(q qVar, f.k0 k0Var) {
            return k0Var.f1183b == null;
        }

        public String toString() {
            return "root";
        }
    }

    public static class o implements g {
        public o(a aVar) {
        }

        public boolean a(q qVar, f.k0 k0Var) {
            return qVar != null && k0Var == null;
        }

        public String toString() {
            return "target";
        }
    }

    public static class p {
        public s a = null;

        /* renamed from: b  reason: collision with root package name */
        public f.d0 f1055b = null;
        public u c;

        public p(s sVar, f.d0 d0Var, u uVar) {
            this.a = sVar;
            this.f1055b = d0Var;
            this.c = uVar;
        }

        public String toString() {
            return String.valueOf(this.a) + " {...} (src=" + this.c + ")";
        }
    }

    public static class q {
    }

    public static class r {
        public List<p> a = null;

        public void a(p pVar) {
            if (this.a == null) {
                this.a = new ArrayList();
            }
            for (int i2 = 0; i2 < this.a.size(); i2++) {
                if (this.a.get(i2).a.f1056b > pVar.a.f1056b) {
                    this.a.add(i2, pVar);
                    return;
                }
            }
            this.a.add(pVar);
        }

        public void b(r rVar) {
            if (rVar.a != null) {
                if (this.a == null) {
                    this.a = new ArrayList(rVar.a.size());
                }
                for (p a2 : rVar.a) {
                    a(a2);
                }
            }
        }

        public String toString() {
            if (this.a == null) {
                return "";
            }
            StringBuilder sb = new StringBuilder();
            for (p pVar : this.a) {
                sb.append(pVar.toString());
                sb.append(10);
            }
            return sb.toString();
        }
    }

    public static class s {
        public List<t> a = null;

        /* renamed from: b  reason: collision with root package name */
        public int f1056b = 0;

        public s() {
        }

        public s(a aVar) {
        }

        public void a() {
            this.f1056b += 1000;
        }

        public t b(int i2) {
            return this.a.get(i2);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            for (t append : this.a) {
                sb.append(append);
                sb.append(' ');
            }
            sb.append('[');
            sb.append(this.f1056b);
            sb.append(']');
            return sb.toString();
        }
    }

    public static class t {
        public e a = null;

        /* renamed from: b  reason: collision with root package name */
        public String f1057b = null;
        public List<C0041b> c = null;
        public List<g> d = null;

        public t(e eVar, String str) {
            this.a = eVar == null ? e.DESCENDANT : eVar;
            this.f1057b = str;
        }

        public void a(String str, c cVar, String str2) {
            if (this.c == null) {
                this.c = new ArrayList();
            }
            this.c.add(new C0041b(str, cVar, str2));
        }

        /* JADX WARNING: Removed duplicated region for block: B:12:0x0025  */
        /* JADX WARNING: Removed duplicated region for block: B:29:0x006c  */
        /* JADX WARNING: Removed duplicated region for block: B:9:0x001c  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.String toString() {
            /*
                r5 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                b.i.a.b$e r1 = r5.a
                b.i.a.b$e r2 = b.i.a.b.e.CHILD
                if (r1 != r2) goto L_0x0011
                java.lang.String r1 = "> "
            L_0x000d:
                r0.append(r1)
                goto L_0x0018
            L_0x0011:
                b.i.a.b$e r2 = b.i.a.b.e.FOLLOWS
                if (r1 != r2) goto L_0x0018
                java.lang.String r1 = "+ "
                goto L_0x000d
            L_0x0018:
                java.lang.String r1 = r5.f1057b
                if (r1 != 0) goto L_0x001e
                java.lang.String r1 = "*"
            L_0x001e:
                r0.append(r1)
                java.util.List<b.i.a.b$b> r1 = r5.c
                if (r1 == 0) goto L_0x0068
                java.util.Iterator r1 = r1.iterator()
            L_0x0029:
                boolean r2 = r1.hasNext()
                if (r2 == 0) goto L_0x0068
                java.lang.Object r2 = r1.next()
                b.i.a.b$b r2 = (b.i.a.b.C0041b) r2
                r3 = 91
                r0.append(r3)
                java.lang.String r3 = r2.a
                r0.append(r3)
                b.i.a.b$c r3 = r2.f1021b
                int r3 = r3.ordinal()
                r4 = 1
                if (r3 == r4) goto L_0x0058
                r4 = 2
                if (r3 == r4) goto L_0x0052
                r4 = 3
                if (r3 == r4) goto L_0x004f
                goto L_0x0062
            L_0x004f:
                java.lang.String r3 = "|="
                goto L_0x0054
            L_0x0052:
                java.lang.String r3 = "~="
            L_0x0054:
                r0.append(r3)
                goto L_0x005d
            L_0x0058:
                r3 = 61
                r0.append(r3)
            L_0x005d:
                java.lang.String r2 = r2.c
                r0.append(r2)
            L_0x0062:
                r2 = 93
                r0.append(r2)
                goto L_0x0029
            L_0x0068:
                java.util.List<b.i.a.b$g> r1 = r5.d
                if (r1 == 0) goto L_0x0085
                java.util.Iterator r1 = r1.iterator()
            L_0x0070:
                boolean r2 = r1.hasNext()
                if (r2 == 0) goto L_0x0085
                java.lang.Object r2 = r1.next()
                b.i.a.b$g r2 = (b.i.a.b.g) r2
                r3 = 58
                r0.append(r3)
                r0.append(r2)
                goto L_0x0070
            L_0x0085:
                java.lang.String r0 = r0.toString()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: b.i.a.b.t.toString():java.lang.String");
        }
    }

    public enum u {
        Document,
        RenderOptions
    }

    public b(f fVar, u uVar) {
        this.a = fVar;
        this.f1020b = uVar;
    }

    public static int a(List<f.i0> list, int i2, f.k0 k0Var) {
        int i3 = 0;
        if (i2 < 0) {
            return 0;
        }
        f.i0 i0Var = list.get(i2);
        f.i0 i0Var2 = k0Var.f1183b;
        if (i0Var != i0Var2) {
            return -1;
        }
        for (f.m0 m0Var : i0Var2.c()) {
            if (m0Var == k0Var) {
                return i3;
            }
            i3++;
        }
        return -1;
    }

    public static boolean b(List<f> list, f fVar) {
        for (f next : list) {
            if (next == f.all) {
                return true;
            }
            if (next == fVar) {
                return true;
            }
        }
        return false;
    }

    public static List<f> d(d dVar) {
        ArrayList arrayList = new ArrayList();
        while (!dVar.f()) {
            String str = null;
            if (!dVar.f()) {
                int i2 = dVar.f1267b;
                char charAt = dVar.a.charAt(i2);
                if ((charAt < 'A' || charAt > 'Z') && (charAt < 'a' || charAt > 'z')) {
                    dVar.f1267b = i2;
                } else {
                    while (true) {
                        int a2 = dVar.a();
                        if ((a2 < 65 || a2 > 90) && (a2 < 97 || a2 > 122)) {
                            str = dVar.a.substring(i2, dVar.f1267b);
                        }
                    }
                    str = dVar.a.substring(i2, dVar.f1267b);
                }
            }
            if (str != null) {
                try {
                    arrayList.add(f.valueOf(str));
                } catch (IllegalArgumentException unused) {
                }
                if (!dVar.q()) {
                    break;
                }
            } else {
                break;
            }
        }
        return arrayList;
    }

    public static boolean g(q qVar, s sVar, int i2, List<f.i0> list, int i3, f.k0 k0Var) {
        t tVar = sVar.a.get(i2);
        if (!j(qVar, tVar, k0Var)) {
            return false;
        }
        e eVar = tVar.a;
        if (eVar == e.DESCENDANT) {
            if (i2 == 0) {
                return true;
            }
            while (i3 >= 0) {
                if (i(qVar, sVar, i2 - 1, list, i3)) {
                    return true;
                }
                i3--;
            }
            return false;
        } else if (eVar == e.CHILD) {
            return i(qVar, sVar, i2 - 1, list, i3);
        } else {
            int a2 = a(list, i3, k0Var);
            if (a2 <= 0) {
                return false;
            }
            return g(qVar, sVar, i2 - 1, list, i3, (f.k0) k0Var.f1183b.c().get(a2 - 1));
        }
    }

    public static boolean h(q qVar, s sVar, f.k0 k0Var) {
        int i2;
        ArrayList arrayList = new ArrayList();
        f.i0 i0Var = k0Var.f1183b;
        while (true) {
            i2 = 0;
            if (i0Var == null) {
                break;
            }
            arrayList.add(0, i0Var);
            i0Var = ((f.m0) i0Var).f1183b;
        }
        int size = arrayList.size() - 1;
        List<t> list = sVar.a;
        if ((list == null ? 0 : list.size()) == 1) {
            return j(qVar, sVar.b(0), k0Var);
        }
        List<t> list2 = sVar.a;
        if (list2 != null) {
            i2 = list2.size();
        }
        return g(qVar, sVar, i2 - 1, arrayList, size, k0Var);
    }

    public static boolean i(q qVar, s sVar, int i2, List<f.i0> list, int i3) {
        t tVar = sVar.a.get(i2);
        f.k0 k0Var = (f.k0) list.get(i3);
        if (!j(qVar, tVar, k0Var)) {
            return false;
        }
        e eVar = tVar.a;
        if (eVar == e.DESCENDANT) {
            if (i2 == 0) {
                return true;
            }
            while (i3 > 0) {
                i3--;
                if (i(qVar, sVar, i2 - 1, list, i3)) {
                    return true;
                }
            }
            return false;
        } else if (eVar == e.CHILD) {
            return i(qVar, sVar, i2 - 1, list, i3 - 1);
        } else {
            int a2 = a(list, i3, k0Var);
            if (a2 <= 0) {
                return false;
            }
            return g(qVar, sVar, i2 - 1, list, i3, (f.k0) k0Var.f1183b.c().get(a2 - 1));
        }
    }

    public static boolean j(q qVar, t tVar, f.k0 k0Var) {
        List<String> list;
        String str = tVar.f1057b;
        if (str != null && !str.equals(k0Var.o().toLowerCase(Locale.US))) {
            return false;
        }
        List<C0041b> list2 = tVar.c;
        if (list2 != null) {
            for (C0041b next : list2) {
                String str2 = next.a;
                str2.hashCode();
                if (!str2.equals(AnalyticsContext.Device.DEVICE_ID_KEY)) {
                    if (!str2.equals("class") || (list = k0Var.f1177g) == null || !list.contains(next.c)) {
                        return false;
                    }
                } else if (!next.c.equals(k0Var.c)) {
                    return false;
                }
            }
        }
        List<g> list3 = tVar.d;
        if (list3 == null) {
            return true;
        }
        for (g a2 : list3) {
            if (!a2.a(qVar, k0Var)) {
                return false;
            }
        }
        return true;
    }

    public final void c(r rVar, d dVar) {
        int intValue;
        char charAt;
        char c2;
        int s2;
        String u2 = dVar.u();
        dVar.r();
        if (u2 != null) {
            int i2 = 0;
            if (!this.c && u2.equals("media")) {
                List<f> d2 = d(dVar);
                if (dVar.d('{')) {
                    dVar.r();
                    if (b(d2, this.a)) {
                        this.c = true;
                        rVar.b(f(dVar));
                        this.c = false;
                    } else {
                        f(dVar);
                    }
                    if (!dVar.f() && !dVar.d('}')) {
                        throw new a("Invalid @media rule: expected '}' at end of rule set");
                    }
                } else {
                    throw new a("Invalid @media rule: missing rule set");
                }
            } else if (this.c || !u2.equals("import")) {
                Log.w("CSSParser", String.format("Ignoring @%s rule", new Object[]{u2}));
                while (!dVar.f() && ((intValue = dVar.h().intValue()) != 59 || i2 != 0)) {
                    if (intValue != 123) {
                        if (intValue == 125 && i2 > 0 && i2 - 1 == 0) {
                            break;
                        }
                    } else {
                        i2++;
                    }
                }
            } else {
                String str = null;
                if (!dVar.f()) {
                    int i3 = dVar.f1267b;
                    if (dVar.e("url(")) {
                        dVar.r();
                        String t2 = dVar.t();
                        if (t2 == null) {
                            StringBuilder sb = new StringBuilder();
                            while (!dVar.f() && (charAt = dVar.a.charAt(dVar.f1267b)) != '\'' && charAt != '\"' && charAt != '(' && charAt != ')' && !dVar.g(charAt) && !Character.isISOControl(charAt)) {
                                dVar.f1267b++;
                                if (charAt == '\\') {
                                    if (!dVar.f()) {
                                        String str2 = dVar.a;
                                        int i4 = dVar.f1267b;
                                        dVar.f1267b = i4 + 1;
                                        charAt = str2.charAt(i4);
                                        if (!(charAt == 10 || charAt == 13 || charAt == 12)) {
                                            int s3 = dVar.s(charAt);
                                            if (s3 != -1) {
                                                for (int i5 = 1; i5 <= 5 && !dVar.f() && (s2 = dVar.s(dVar.a.charAt(dVar.f1267b))) != -1; i5++) {
                                                    dVar.f1267b++;
                                                    s3 = (s3 * 16) + s2;
                                                }
                                                c2 = (char) s3;
                                                sb.append(c2);
                                            }
                                        }
                                    }
                                }
                                c2 = (char) charAt;
                                sb.append(c2);
                            }
                            t2 = sb.length() == 0 ? null : sb.toString();
                        }
                        if (t2 != null) {
                            dVar.r();
                            if (dVar.f() || dVar.e(")")) {
                                str = t2;
                            }
                        }
                        dVar.f1267b = i3;
                    }
                }
                if (str == null) {
                    str = dVar.t();
                }
                if (str != null) {
                    dVar.r();
                    d(dVar);
                    if (!dVar.f() && !dVar.d(';')) {
                        throw new a("Invalid @media rule: expected '}' at end of rule set");
                    }
                } else {
                    throw new a("Invalid @import rule: expected string or url()");
                }
            }
            dVar.r();
            return;
        }
        throw new a("Invalid '@' rule");
    }

    /* JADX WARNING: Removed duplicated region for block: B:58:0x00d8 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x002c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean e(b.i.a.b.r r14, b.i.a.b.d r15) {
        /*
            r13 = this;
            java.util.List r0 = r15.v()
            r1 = 0
            if (r0 == 0) goto L_0x00e8
            boolean r2 = r0.isEmpty()
            if (r2 != 0) goto L_0x00e8
            r2 = 123(0x7b, float:1.72E-43)
            boolean r2 = r15.d(r2)
            if (r2 == 0) goto L_0x00e0
            r15.r()
            b.i.a.f$d0 r2 = new b.i.a.f$d0
            r2.<init>()
        L_0x001d:
            java.lang.String r3 = r15.u()
            r15.r()
            r4 = 58
            boolean r4 = r15.d(r4)
            if (r4 == 0) goto L_0x00d8
            r15.r()
            boolean r4 = r15.f()
            r5 = 0
            r6 = 33
            r7 = 125(0x7d, float:1.75E-43)
            r8 = 59
            r9 = 1
            if (r4 == 0) goto L_0x003e
            goto L_0x007a
        L_0x003e:
            int r4 = r15.f1267b
            java.lang.String r10 = r15.a
            char r10 = r10.charAt(r4)
            r11 = r4
        L_0x0047:
            r12 = -1
            if (r10 == r12) goto L_0x006d
            if (r10 == r8) goto L_0x006d
            if (r10 == r7) goto L_0x006d
            if (r10 == r6) goto L_0x006d
            r12 = 10
            if (r10 == r12) goto L_0x005b
            r12 = 13
            if (r10 != r12) goto L_0x0059
            goto L_0x005b
        L_0x0059:
            r12 = r1
            goto L_0x005c
        L_0x005b:
            r12 = r9
        L_0x005c:
            if (r12 != 0) goto L_0x006d
            boolean r10 = r15.g(r10)
            if (r10 != 0) goto L_0x0068
            int r10 = r15.f1267b
            int r11 = r10 + 1
        L_0x0068:
            int r10 = r15.a()
            goto L_0x0047
        L_0x006d:
            int r10 = r15.f1267b
            if (r10 <= r4) goto L_0x0078
            java.lang.String r5 = r15.a
            java.lang.String r5 = r5.substring(r4, r11)
            goto L_0x007a
        L_0x0078:
            r15.f1267b = r4
        L_0x007a:
            if (r5 == 0) goto L_0x00d0
            r15.r()
            boolean r4 = r15.d(r6)
            if (r4 == 0) goto L_0x009c
            r15.r()
            java.lang.String r4 = "important"
            boolean r4 = r15.e(r4)
            if (r4 == 0) goto L_0x0094
            r15.r()
            goto L_0x009c
        L_0x0094:
            b.i.a.a r14 = new b.i.a.a
            java.lang.String r15 = "Malformed rule set: found unexpected '!'"
            r14.<init>(r15)
            throw r14
        L_0x009c:
            r15.d(r8)
            b.i.a.i.J(r2, r3, r5)
            r15.r()
            boolean r3 = r15.f()
            if (r3 != 0) goto L_0x00b1
            boolean r3 = r15.d(r7)
            if (r3 == 0) goto L_0x001d
        L_0x00b1:
            r15.r()
            java.util.Iterator r15 = r0.iterator()
        L_0x00b8:
            boolean r0 = r15.hasNext()
            if (r0 == 0) goto L_0x00cf
            java.lang.Object r0 = r15.next()
            b.i.a.b$s r0 = (b.i.a.b.s) r0
            b.i.a.b$p r1 = new b.i.a.b$p
            b.i.a.b$u r3 = r13.f1020b
            r1.<init>(r0, r2, r3)
            r14.a(r1)
            goto L_0x00b8
        L_0x00cf:
            return r9
        L_0x00d0:
            b.i.a.a r14 = new b.i.a.a
            java.lang.String r15 = "Expected property value"
            r14.<init>(r15)
            throw r14
        L_0x00d8:
            b.i.a.a r14 = new b.i.a.a
            java.lang.String r15 = "Expected ':'"
            r14.<init>(r15)
            throw r14
        L_0x00e0:
            b.i.a.a r14 = new b.i.a.a
            java.lang.String r15 = "Malformed rule block: expected '{'"
            r14.<init>(r15)
            throw r14
        L_0x00e8:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: b.i.a.b.e(b.i.a.b$r, b.i.a.b$d):boolean");
    }

    public final r f(d dVar) {
        r rVar = new r();
        while (!dVar.f()) {
            try {
                if (!dVar.e("<!--")) {
                    if (!dVar.e("-->")) {
                        if (!dVar.d('@')) {
                            if (!e(rVar, dVar)) {
                                break;
                            }
                        } else {
                            c(rVar, dVar);
                        }
                    }
                }
            } catch (a e2) {
                StringBuilder y = b.e.a.a.a.y("CSS parser terminated early due to error: ");
                y.append(e2.getMessage());
                Log.e("CSSParser", y.toString());
            }
        }
        return rVar;
    }
}
