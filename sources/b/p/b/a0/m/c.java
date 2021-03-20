package b.p.b.a0.m;

import b.e.a.a.a;
import javax.security.auth.x500.X500Principal;

public final class c {
    public final String a;

    /* renamed from: b  reason: collision with root package name */
    public final int f6682b;
    public int c;
    public int d;

    /* renamed from: e  reason: collision with root package name */
    public int f6683e;
    public int f;

    /* renamed from: g  reason: collision with root package name */
    public char[] f6684g;

    public c(X500Principal x500Principal) {
        String name = x500Principal.getName("RFC2253");
        this.a = name;
        this.f6682b = name.length();
    }

    public final int a(int i2) {
        int i3;
        int i4;
        int i5 = i2 + 1;
        if (i5 < this.f6682b) {
            char[] cArr = this.f6684g;
            char c2 = cArr[i2];
            if (c2 >= '0' && c2 <= '9') {
                i3 = c2 - '0';
            } else if (c2 >= 'a' && c2 <= 'f') {
                i3 = c2 - 'W';
            } else if (c2 < 'A' || c2 > 'F') {
                StringBuilder y = a.y("Malformed DN: ");
                y.append(this.a);
                throw new IllegalStateException(y.toString());
            } else {
                i3 = c2 - '7';
            }
            char c3 = cArr[i5];
            if (c3 >= '0' && c3 <= '9') {
                i4 = c3 - '0';
            } else if (c3 >= 'a' && c3 <= 'f') {
                i4 = c3 - 'W';
            } else if (c3 < 'A' || c3 > 'F') {
                StringBuilder y2 = a.y("Malformed DN: ");
                y2.append(this.a);
                throw new IllegalStateException(y2.toString());
            } else {
                i4 = c3 - '7';
            }
            return (i3 << 4) + i4;
        }
        StringBuilder y3 = a.y("Malformed DN: ");
        y3.append(this.a);
        throw new IllegalStateException(y3.toString());
    }

    public final char b() {
        int i2;
        int i3 = this.c + 1;
        this.c = i3;
        if (i3 != this.f6682b) {
            char[] cArr = this.f6684g;
            char c2 = cArr[i3];
            if (!(c2 == ' ' || c2 == '%' || c2 == '\\' || c2 == '_' || c2 == '\"' || c2 == '#')) {
                switch (c2) {
                    case '*':
                    case '+':
                    case ',':
                        break;
                    default:
                        switch (c2) {
                            case ';':
                            case '<':
                            case '=':
                            case '>':
                                break;
                            default:
                                int a2 = a(i3);
                                this.c++;
                                if (a2 >= 128) {
                                    if (a2 < 192 || a2 > 247) {
                                        return '?';
                                    }
                                    if (a2 <= 223) {
                                        a2 &= 31;
                                        i2 = 1;
                                    } else if (a2 <= 239) {
                                        i2 = 2;
                                        a2 &= 15;
                                    } else {
                                        i2 = 3;
                                        a2 &= 7;
                                    }
                                    for (int i4 = 0; i4 < i2; i4++) {
                                        int i5 = this.c + 1;
                                        this.c = i5;
                                        if (i5 == this.f6682b || this.f6684g[i5] != '\\') {
                                            return '?';
                                        }
                                        int i6 = i5 + 1;
                                        this.c = i6;
                                        int a3 = a(i6);
                                        this.c++;
                                        if ((a3 & 192) != 128) {
                                            return '?';
                                        }
                                        a2 = (a2 << 6) + (a3 & 63);
                                    }
                                }
                                return (char) a2;
                        }
                }
            }
            return cArr[i3];
        }
        StringBuilder y = a.y("Unexpected end of DN: ");
        y.append(this.a);
        throw new IllegalStateException(y.toString());
    }

    /* JADX WARNING: Removed duplicated region for block: B:6:0x0015 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0017  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String c() {
        /*
            r7 = this;
        L_0x0000:
            int r0 = r7.c
            int r1 = r7.f6682b
            r2 = 32
            if (r0 >= r1) goto L_0x0013
            char[] r3 = r7.f6684g
            char r3 = r3[r0]
            if (r3 != r2) goto L_0x0013
            int r0 = r0 + 1
            r7.c = r0
            goto L_0x0000
        L_0x0013:
            if (r0 != r1) goto L_0x0017
            r0 = 0
            return r0
        L_0x0017:
            r7.d = r0
        L_0x0019:
            int r0 = r0 + 1
            r7.c = r0
            int r0 = r7.c
            int r1 = r7.f6682b
            r3 = 61
            if (r0 >= r1) goto L_0x0030
            char[] r4 = r7.f6684g
            char r5 = r4[r0]
            if (r5 == r3) goto L_0x0030
            char r4 = r4[r0]
            if (r4 == r2) goto L_0x0030
            goto L_0x0019
        L_0x0030:
            java.lang.String r4 = "Unexpected end of DN: "
            if (r0 >= r1) goto L_0x00ce
            r7.f6683e = r0
            char[] r1 = r7.f6684g
            char r0 = r1[r0]
            if (r0 != r2) goto L_0x006d
        L_0x003c:
            int r0 = r7.c
            int r1 = r7.f6682b
            if (r0 >= r1) goto L_0x0051
            char[] r5 = r7.f6684g
            char r6 = r5[r0]
            if (r6 == r3) goto L_0x0051
            char r5 = r5[r0]
            if (r5 != r2) goto L_0x0051
            int r0 = r0 + 1
            r7.c = r0
            goto L_0x003c
        L_0x0051:
            char[] r5 = r7.f6684g
            char r5 = r5[r0]
            if (r5 != r3) goto L_0x005a
            if (r0 == r1) goto L_0x005a
            goto L_0x006d
        L_0x005a:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = b.e.a.a.a.y(r4)
            java.lang.String r2 = r7.a
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x006d:
            int r0 = r7.c
        L_0x006f:
            int r0 = r0 + 1
            r7.c = r0
            int r0 = r7.c
            int r1 = r7.f6682b
            if (r0 >= r1) goto L_0x0080
            char[] r1 = r7.f6684g
            char r1 = r1[r0]
            if (r1 != r2) goto L_0x0080
            goto L_0x006f
        L_0x0080:
            int r0 = r7.f6683e
            int r1 = r7.d
            int r0 = r0 - r1
            r2 = 4
            if (r0 <= r2) goto L_0x00c1
            char[] r0 = r7.f6684g
            int r3 = r1 + 3
            char r3 = r0[r3]
            r4 = 46
            if (r3 != r4) goto L_0x00c1
            char r3 = r0[r1]
            r4 = 79
            if (r3 == r4) goto L_0x009e
            char r3 = r0[r1]
            r4 = 111(0x6f, float:1.56E-43)
            if (r3 != r4) goto L_0x00c1
        L_0x009e:
            int r3 = r1 + 1
            char r3 = r0[r3]
            r4 = 73
            if (r3 == r4) goto L_0x00ae
            int r3 = r1 + 1
            char r3 = r0[r3]
            r4 = 105(0x69, float:1.47E-43)
            if (r3 != r4) goto L_0x00c1
        L_0x00ae:
            int r3 = r1 + 2
            char r3 = r0[r3]
            r4 = 68
            if (r3 == r4) goto L_0x00be
            int r3 = r1 + 2
            char r0 = r0[r3]
            r3 = 100
            if (r0 != r3) goto L_0x00c1
        L_0x00be:
            int r1 = r1 + r2
            r7.d = r1
        L_0x00c1:
            java.lang.String r0 = new java.lang.String
            char[] r1 = r7.f6684g
            int r2 = r7.d
            int r3 = r7.f6683e
            int r3 = r3 - r2
            r0.<init>(r1, r2, r3)
            return r0
        L_0x00ce:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = b.e.a.a.a.y(r4)
            java.lang.String r2 = r7.a
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: b.p.b.a0.m.c.c():java.lang.String");
    }
}
