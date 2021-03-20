package b.l.f.z.e;

public class c implements g {
    public static void f(h hVar, StringBuilder sb) {
        char charAt = sb.charAt(0);
        int charAt2 = (sb.charAt(1) * '(') + (charAt * 1600) + sb.charAt(2) + 1;
        hVar.f5877e.append(new String(new char[]{(char) (charAt2 / 256), (char) (charAt2 % 256)}));
        sb.delete(0, 3);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x004e, code lost:
        if (r2 != 1) goto L_0x0050;
     */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x004c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(b.l.f.z.e.h r9) {
        /*
            r8 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
        L_0x0005:
            boolean r1 = r9.d()
            if (r1 == 0) goto L_0x0071
            char r1 = r9.b()
            int r2 = r9.f
            r3 = 1
            int r2 = r2 + r3
            r9.f = r2
            int r1 = r8.c(r1, r0)
            int r2 = r0.length()
            r4 = 3
            int r2 = r2 / r4
            int r2 = r2 << r3
            int r5 = r9.a()
            int r5 = r5 + r2
            r9.f(r5)
            b.l.f.z.e.j r2 = r9.f5879h
            int r2 = r2.f5883b
            int r2 = r2 - r5
            boolean r5 = r9.d()
            if (r5 != 0) goto L_0x0055
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            int r6 = r0.length()
            int r6 = r6 % r4
            r7 = 2
            if (r6 != r7) goto L_0x0044
            if (r2 == r7) goto L_0x0044
            r6 = r8
            goto L_0x0050
        L_0x0044:
            r6 = r8
        L_0x0045:
            int r7 = r0.length()
            int r7 = r7 % r4
            if (r7 != r3) goto L_0x0072
            if (r1 > r4) goto L_0x0050
            if (r2 == r3) goto L_0x0072
        L_0x0050:
            int r1 = r6.b(r9, r0, r5, r1)
            goto L_0x0045
        L_0x0055:
            int r1 = r0.length()
            int r1 = r1 % r4
            if (r1 != 0) goto L_0x0005
            java.lang.String r1 = r9.a
            int r2 = r9.f
            int r3 = r8.d()
            int r1 = b.l.f.x.a.g.T(r1, r2, r3)
            int r2 = r8.d()
            if (r1 == r2) goto L_0x0005
            r1 = 0
            r9.f5878g = r1
        L_0x0071:
            r6 = r8
        L_0x0072:
            r6.e(r9, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: b.l.f.z.e.c.a(b.l.f.z.e.h):void");
    }

    public final int b(h hVar, StringBuilder sb, StringBuilder sb2, int i2) {
        int length = sb.length();
        sb.delete(length - i2, length);
        hVar.f--;
        int c = c(hVar.b(), sb2);
        hVar.f5879h = null;
        return c;
    }

    public int c(char c, StringBuilder sb) {
        int i2;
        int i3;
        char c2;
        if (c == ' ') {
            c2 = 3;
        } else {
            if (c >= '0' && c <= '9') {
                i3 = (c - '0') + 4;
            } else if (c < 'A' || c > 'Z') {
                if (c < ' ') {
                    sb.append(0);
                } else {
                    if (c <= '/') {
                        sb.append(1);
                        i2 = c - '!';
                    } else if (c <= '@') {
                        sb.append(1);
                        i2 = (c - ':') + 15;
                    } else if (c <= '_') {
                        sb.append(1);
                        i2 = (c - '[') + 22;
                    } else if (c <= 127) {
                        sb.append(2);
                        i2 = c - '`';
                    } else {
                        sb.append("\u0001\u001e");
                        return c((char) (c - 128), sb) + 2;
                    }
                    c = (char) i2;
                }
                sb.append(c);
                return 2;
            } else {
                i3 = (c - 'A') + 14;
            }
            c2 = (char) i3;
        }
        sb.append(c2);
        return 1;
    }

    public int d() {
        return 1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0065, code lost:
        if (r8.d() == false) goto L_0x006c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0031, code lost:
        if (r8.d() != false) goto L_0x0067;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void e(b.l.f.z.e.h r8, java.lang.StringBuilder r9) {
        /*
            r7 = this;
            int r0 = r9.length()
            r1 = 3
            int r0 = r0 / r1
            r2 = 1
            int r0 = r0 << r2
            int r3 = r9.length()
            int r3 = r3 % r1
            int r4 = r8.a()
            int r4 = r4 + r0
            r8.f(r4)
            b.l.f.z.e.j r0 = r8.f5879h
            int r0 = r0.f5883b
            int r0 = r0 - r4
            r4 = 2
            r5 = 0
            r6 = 254(0xfe, float:3.56E-43)
            if (r3 != r4) goto L_0x0034
            r9.append(r5)
        L_0x0023:
            int r0 = r9.length()
            if (r0 < r1) goto L_0x002d
            f(r8, r9)
            goto L_0x0023
        L_0x002d:
            boolean r9 = r8.d()
            if (r9 == 0) goto L_0x006c
            goto L_0x0067
        L_0x0034:
            if (r0 != r2) goto L_0x0053
            if (r3 != r2) goto L_0x0053
        L_0x0038:
            int r0 = r9.length()
            if (r0 < r1) goto L_0x0042
            f(r8, r9)
            goto L_0x0038
        L_0x0042:
            boolean r9 = r8.d()
            if (r9 == 0) goto L_0x004d
            java.lang.StringBuilder r9 = r8.f5877e
            r9.append(r6)
        L_0x004d:
            int r9 = r8.f
            int r9 = r9 - r2
            r8.f = r9
            goto L_0x006c
        L_0x0053:
            if (r3 != 0) goto L_0x006f
        L_0x0055:
            int r2 = r9.length()
            if (r2 < r1) goto L_0x005f
            f(r8, r9)
            goto L_0x0055
        L_0x005f:
            if (r0 > 0) goto L_0x0067
            boolean r9 = r8.d()
            if (r9 == 0) goto L_0x006c
        L_0x0067:
            java.lang.StringBuilder r9 = r8.f5877e
            r9.append(r6)
        L_0x006c:
            r8.f5878g = r5
            return
        L_0x006f:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "Unexpected case. Please report!"
            r8.<init>(r9)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: b.l.f.z.e.c.e(b.l.f.z.e.h, java.lang.StringBuilder):void");
    }
}
