package b.l.e.g0;

import b.l.e.e0.q;
import java.io.Closeable;
import java.io.IOException;
import java.io.Reader;
import java.util.Arrays;
import java.util.Objects;

public class a implements Closeable {
    public static final char[] w = ")]}'\n".toCharArray();

    /* renamed from: h  reason: collision with root package name */
    public final Reader f5520h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f5521i = false;

    /* renamed from: j  reason: collision with root package name */
    public final char[] f5522j = new char[1024];

    /* renamed from: k  reason: collision with root package name */
    public int f5523k = 0;

    /* renamed from: l  reason: collision with root package name */
    public int f5524l = 0;

    /* renamed from: m  reason: collision with root package name */
    public int f5525m = 0;

    /* renamed from: n  reason: collision with root package name */
    public int f5526n = 0;

    /* renamed from: o  reason: collision with root package name */
    public int f5527o = 0;

    /* renamed from: p  reason: collision with root package name */
    public long f5528p;

    /* renamed from: q  reason: collision with root package name */
    public int f5529q;
    public String r;
    public int[] s;
    public int t;
    public String[] u;
    public int[] v;

    /* renamed from: b.l.e.g0.a$a  reason: collision with other inner class name */
    public class C0096a extends q {
    }

    static {
        q.a = new C0096a();
    }

    public a(Reader reader) {
        int[] iArr = new int[32];
        this.s = iArr;
        this.t = 0;
        this.t = 0 + 1;
        iArr[0] = 6;
        this.u = new String[32];
        this.v = new int[32];
        Objects.requireNonNull(reader, "in == null");
        this.f5520h = reader;
    }

    public void A0() {
        int i2;
        char c;
        int i3 = 0;
        do {
            int i4 = this.f5527o;
            if (i4 == 0) {
                i4 = z();
            }
            if (i4 == 3) {
                w0(1);
            } else if (i4 == 1) {
                w0(3);
            } else if (i4 == 4 || i4 == 2) {
                this.t--;
                i3--;
                this.f5527o = 0;
            } else if (i4 == 14 || i4 == 10) {
                while (true) {
                    i2 = 0;
                    while (true) {
                        int i5 = this.f5523k + i2;
                        if (i5 < this.f5524l) {
                            char c2 = this.f5522j[i5];
                            if (!(c2 == 9 || c2 == 10 || c2 == 12 || c2 == 13 || c2 == ' ')) {
                                if (c2 != '#') {
                                    if (c2 != ',') {
                                        if (!(c2 == '/' || c2 == '=')) {
                                            if (!(c2 == '{' || c2 == '}' || c2 == ':')) {
                                                if (c2 != ';') {
                                                    switch (c2) {
                                                        case '[':
                                                        case ']':
                                                            break;
                                                        case '\\':
                                                            break;
                                                        default:
                                                            i2++;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        } else {
                            this.f5523k = i5;
                            if (!O(1)) {
                            }
                        }
                    }
                }
                q();
                this.f5523k += i2;
                this.f5527o = 0;
            } else {
                if (i4 == 8 || i4 == 12) {
                    c = '\'';
                } else if (i4 == 9 || i4 == 13) {
                    c = '\"';
                } else {
                    if (i4 == 16) {
                        this.f5523k += this.f5529q;
                    }
                    this.f5527o = 0;
                }
                y0(c);
                this.f5527o = 0;
            }
            i3++;
            this.f5527o = 0;
        } while (i3 != 0);
        int[] iArr = this.v;
        int i6 = this.t;
        int i7 = i6 - 1;
        iArr[i7] = iArr[i7] + 1;
        this.u[i6 - 1] = "null";
    }

    public final IOException B0(String str) {
        StringBuilder y = b.e.a.a.a.y(str);
        y.append(g0());
        throw new d(y.toString());
    }

    public void H() {
        int i2 = this.f5527o;
        if (i2 == 0) {
            i2 = z();
        }
        if (i2 == 4) {
            int i3 = this.t - 1;
            this.t = i3;
            int[] iArr = this.v;
            int i4 = i3 - 1;
            iArr[i4] = iArr[i4] + 1;
            this.f5527o = 0;
            return;
        }
        StringBuilder y = b.e.a.a.a.y("Expected END_ARRAY but was ");
        y.append(v0());
        y.append(g0());
        throw new IllegalStateException(y.toString());
    }

    public void N() {
        int i2 = this.f5527o;
        if (i2 == 0) {
            i2 = z();
        }
        if (i2 == 2) {
            int i3 = this.t - 1;
            this.t = i3;
            this.u[i3] = null;
            int[] iArr = this.v;
            int i4 = i3 - 1;
            iArr[i4] = iArr[i4] + 1;
            this.f5527o = 0;
            return;
        }
        StringBuilder y = b.e.a.a.a.y("Expected END_OBJECT but was ");
        y.append(v0());
        y.append(g0());
        throw new IllegalStateException(y.toString());
    }

    public final boolean O(int i2) {
        int i3;
        int i4;
        char[] cArr = this.f5522j;
        int i5 = this.f5526n;
        int i6 = this.f5523k;
        this.f5526n = i5 - i6;
        int i7 = this.f5524l;
        if (i7 != i6) {
            int i8 = i7 - i6;
            this.f5524l = i8;
            System.arraycopy(cArr, i6, cArr, 0, i8);
        } else {
            this.f5524l = 0;
        }
        this.f5523k = 0;
        do {
            Reader reader = this.f5520h;
            int i9 = this.f5524l;
            int read = reader.read(cArr, i9, cArr.length - i9);
            if (read == -1) {
                return false;
            }
            i3 = this.f5524l + read;
            this.f5524l = i3;
            if (this.f5525m == 0 && (i4 = this.f5526n) == 0 && i3 > 0 && cArr[0] == 65279) {
                this.f5523k++;
                this.f5526n = i4 + 1;
                i2++;
                continue;
            }
        } while (i3 < i2);
        return true;
    }

    public String S() {
        StringBuilder v2 = b.e.a.a.a.v('$');
        int i2 = this.t;
        for (int i3 = 0; i3 < i2; i3++) {
            int i4 = this.s[i3];
            if (i4 == 1 || i4 == 2) {
                v2.append('[');
                v2.append(this.v[i3]);
                v2.append(']');
            } else if (i4 == 3 || i4 == 4 || i4 == 5) {
                v2.append('.');
                String[] strArr = this.u;
                if (strArr[i3] != null) {
                    v2.append(strArr[i3]);
                }
            }
        }
        return v2.toString();
    }

    public boolean Y() {
        int i2 = this.f5527o;
        if (i2 == 0) {
            i2 = z();
        }
        return (i2 == 2 || i2 == 4) ? false : true;
    }

    public void b() {
        int i2 = this.f5527o;
        if (i2 == 0) {
            i2 = z();
        }
        if (i2 == 3) {
            w0(1);
            this.v[this.t - 1] = 0;
            this.f5527o = 0;
            return;
        }
        StringBuilder y = b.e.a.a.a.y("Expected BEGIN_ARRAY but was ");
        y.append(v0());
        y.append(g0());
        throw new IllegalStateException(y.toString());
    }

    public void close() {
        this.f5527o = 0;
        this.s[0] = 8;
        this.t = 1;
        this.f5520h.close();
    }

    public void e() {
        int i2 = this.f5527o;
        if (i2 == 0) {
            i2 = z();
        }
        if (i2 == 1) {
            w0(3);
            this.f5527o = 0;
            return;
        }
        StringBuilder y = b.e.a.a.a.y("Expected BEGIN_OBJECT but was ");
        y.append(v0());
        y.append(g0());
        throw new IllegalStateException(y.toString());
    }

    public final boolean e0(char c) {
        if (c == 9 || c == 10 || c == 12 || c == 13 || c == ' ') {
            return false;
        }
        if (c != '#') {
            if (c == ',') {
                return false;
            }
            if (!(c == '/' || c == '=')) {
                if (c == '{' || c == '}' || c == ':') {
                    return false;
                }
                if (c != ';') {
                    switch (c) {
                        case '[':
                        case ']':
                            return false;
                        case '\\':
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        q();
        return false;
    }

    public String g0() {
        StringBuilder A = b.e.a.a.a.A(" at line ", this.f5525m + 1, " column ", (this.f5523k - this.f5526n) + 1, " path ");
        A.append(S());
        return A.toString();
    }

    public boolean k0() {
        int i2 = this.f5527o;
        if (i2 == 0) {
            i2 = z();
        }
        if (i2 == 5) {
            this.f5527o = 0;
            int[] iArr = this.v;
            int i3 = this.t - 1;
            iArr[i3] = iArr[i3] + 1;
            return true;
        } else if (i2 == 6) {
            this.f5527o = 0;
            int[] iArr2 = this.v;
            int i4 = this.t - 1;
            iArr2[i4] = iArr2[i4] + 1;
            return false;
        } else {
            StringBuilder y = b.e.a.a.a.y("Expected a boolean but was ");
            y.append(v0());
            y.append(g0());
            throw new IllegalStateException(y.toString());
        }
    }

    public double m0() {
        String str;
        int i2 = this.f5527o;
        if (i2 == 0) {
            i2 = z();
        }
        if (i2 == 15) {
            this.f5527o = 0;
            int[] iArr = this.v;
            int i3 = this.t - 1;
            iArr[i3] = iArr[i3] + 1;
            return (double) this.f5528p;
        }
        if (i2 == 16) {
            this.r = new String(this.f5522j, this.f5523k, this.f5529q);
            this.f5523k += this.f5529q;
        } else {
            if (i2 == 8 || i2 == 9) {
                str = s0(i2 == 8 ? '\'' : '\"');
            } else if (i2 == 10) {
                str = u0();
            } else if (i2 != 11) {
                StringBuilder y = b.e.a.a.a.y("Expected a double but was ");
                y.append(v0());
                y.append(g0());
                throw new IllegalStateException(y.toString());
            }
            this.r = str;
        }
        this.f5527o = 11;
        double parseDouble = Double.parseDouble(this.r);
        if (this.f5521i || (!Double.isNaN(parseDouble) && !Double.isInfinite(parseDouble))) {
            this.r = null;
            this.f5527o = 0;
            int[] iArr2 = this.v;
            int i4 = this.t - 1;
            iArr2[i4] = iArr2[i4] + 1;
            return parseDouble;
        }
        throw new d("JSON forbids NaN and infinities: " + parseDouble + g0());
    }

    public int n0() {
        String str;
        int i2 = this.f5527o;
        if (i2 == 0) {
            i2 = z();
        }
        if (i2 == 15) {
            long j2 = this.f5528p;
            int i3 = (int) j2;
            if (j2 == ((long) i3)) {
                this.f5527o = 0;
                int[] iArr = this.v;
                int i4 = this.t - 1;
                iArr[i4] = iArr[i4] + 1;
                return i3;
            }
            StringBuilder y = b.e.a.a.a.y("Expected an int but was ");
            y.append(this.f5528p);
            y.append(g0());
            throw new NumberFormatException(y.toString());
        }
        if (i2 == 16) {
            this.r = new String(this.f5522j, this.f5523k, this.f5529q);
            this.f5523k += this.f5529q;
        } else if (i2 == 8 || i2 == 9 || i2 == 10) {
            if (i2 == 10) {
                str = u0();
            } else {
                str = s0(i2 == 8 ? '\'' : '\"');
            }
            this.r = str;
            try {
                int parseInt = Integer.parseInt(this.r);
                this.f5527o = 0;
                int[] iArr2 = this.v;
                int i5 = this.t - 1;
                iArr2[i5] = iArr2[i5] + 1;
                return parseInt;
            } catch (NumberFormatException unused) {
            }
        } else {
            StringBuilder y2 = b.e.a.a.a.y("Expected an int but was ");
            y2.append(v0());
            y2.append(g0());
            throw new IllegalStateException(y2.toString());
        }
        this.f5527o = 11;
        double parseDouble = Double.parseDouble(this.r);
        int i6 = (int) parseDouble;
        if (((double) i6) == parseDouble) {
            this.r = null;
            this.f5527o = 0;
            int[] iArr3 = this.v;
            int i7 = this.t - 1;
            iArr3[i7] = iArr3[i7] + 1;
            return i6;
        }
        StringBuilder y3 = b.e.a.a.a.y("Expected an int but was ");
        y3.append(this.r);
        y3.append(g0());
        throw new NumberFormatException(y3.toString());
    }

    public long o0() {
        String str;
        int i2 = this.f5527o;
        if (i2 == 0) {
            i2 = z();
        }
        if (i2 == 15) {
            this.f5527o = 0;
            int[] iArr = this.v;
            int i3 = this.t - 1;
            iArr[i3] = iArr[i3] + 1;
            return this.f5528p;
        }
        if (i2 == 16) {
            this.r = new String(this.f5522j, this.f5523k, this.f5529q);
            this.f5523k += this.f5529q;
        } else if (i2 == 8 || i2 == 9 || i2 == 10) {
            if (i2 == 10) {
                str = u0();
            } else {
                str = s0(i2 == 8 ? '\'' : '\"');
            }
            this.r = str;
            try {
                long parseLong = Long.parseLong(this.r);
                this.f5527o = 0;
                int[] iArr2 = this.v;
                int i4 = this.t - 1;
                iArr2[i4] = iArr2[i4] + 1;
                return parseLong;
            } catch (NumberFormatException unused) {
            }
        } else {
            StringBuilder y = b.e.a.a.a.y("Expected a long but was ");
            y.append(v0());
            y.append(g0());
            throw new IllegalStateException(y.toString());
        }
        this.f5527o = 11;
        double parseDouble = Double.parseDouble(this.r);
        long j2 = (long) parseDouble;
        if (((double) j2) == parseDouble) {
            this.r = null;
            this.f5527o = 0;
            int[] iArr3 = this.v;
            int i5 = this.t - 1;
            iArr3[i5] = iArr3[i5] + 1;
            return j2;
        }
        StringBuilder y2 = b.e.a.a.a.y("Expected a long but was ");
        y2.append(this.r);
        y2.append(g0());
        throw new NumberFormatException(y2.toString());
    }

    public String p0() {
        String str;
        char c;
        int i2 = this.f5527o;
        if (i2 == 0) {
            i2 = z();
        }
        if (i2 == 14) {
            str = u0();
        } else {
            if (i2 == 12) {
                c = '\'';
            } else if (i2 == 13) {
                c = '\"';
            } else {
                StringBuilder y = b.e.a.a.a.y("Expected a name but was ");
                y.append(v0());
                y.append(g0());
                throw new IllegalStateException(y.toString());
            }
            str = s0(c);
        }
        this.f5527o = 0;
        this.u[this.t - 1] = str;
        return str;
    }

    public final void q() {
        if (!this.f5521i) {
            B0("Use JsonReader.setLenient(true) to accept malformed JSON");
            throw null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0051, code lost:
        if (r1 != '/') goto L_0x00ca;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0053, code lost:
        r9.f5523k = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0056, code lost:
        if (r4 != r2) goto L_0x0068;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0058, code lost:
        r9.f5523k = r4 - 1;
        r2 = O(2);
        r9.f5523k++;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0065, code lost:
        if (r2 != false) goto L_0x0068;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0067, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0068, code lost:
        q();
        r2 = r9.f5523k;
        r4 = r0[r2];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0071, code lost:
        if (r4 == '*') goto L_0x007b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0073, code lost:
        if (r4 == '/') goto L_0x0076;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0075, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0076, code lost:
        r9.f5523k = r2 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x007b, code lost:
        r9.f5523k = r2 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x007f, code lost:
        r4 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0085, code lost:
        if ((r9.f5523k + 2) <= r9.f5524l) goto L_0x0090;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x008b, code lost:
        if (O(2) == false) goto L_0x008e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x008e, code lost:
        r3 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0090, code lost:
        r1 = r9.f5522j;
        r2 = r9.f5523k;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0096, code lost:
        if (r1[r2] != 10) goto L_0x00a2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0098, code lost:
        r9.f5525m++;
        r9.f5526n = r2 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00a2, code lost:
        if (r4 >= 2) goto L_0x00bc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00b1, code lost:
        if (r9.f5522j[r9.f5523k + r4] == "*/".charAt(r4)) goto L_0x00b9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00b3, code lost:
        r9.f5523k++;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00b9, code lost:
        r4 = r4 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00bc, code lost:
        if (r3 == false) goto L_0x00c3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00c3, code lost:
        B0("Unterminated comment");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00c9, code lost:
        throw null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00ca, code lost:
        r9.f5523k = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00ce, code lost:
        if (r1 != '#') goto L_0x00d8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00d0, code lost:
        q();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00d8, code lost:
        return r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int q0(boolean r10) {
        /*
            r9 = this;
            char[] r0 = r9.f5522j
        L_0x0002:
            int r1 = r9.f5523k
        L_0x0004:
            int r2 = r9.f5524l
        L_0x0006:
            r3 = 1
            if (r1 != r2) goto L_0x0030
            r9.f5523k = r1
            boolean r1 = r9.O(r3)
            if (r1 != 0) goto L_0x002c
            if (r10 != 0) goto L_0x0015
            r10 = -1
            return r10
        L_0x0015:
            java.io.EOFException r10 = new java.io.EOFException
            java.lang.String r0 = "End of input"
            java.lang.StringBuilder r0 = b.e.a.a.a.y(r0)
            java.lang.String r1 = r9.g0()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r10.<init>(r0)
            throw r10
        L_0x002c:
            int r1 = r9.f5523k
            int r2 = r9.f5524l
        L_0x0030:
            int r4 = r1 + 1
            char r1 = r0[r1]
            r5 = 10
            if (r1 != r5) goto L_0x0041
            int r1 = r9.f5525m
            int r1 = r1 + r3
            r9.f5525m = r1
            r9.f5526n = r4
            goto L_0x00d9
        L_0x0041:
            r6 = 32
            if (r1 == r6) goto L_0x00d9
            r6 = 13
            if (r1 == r6) goto L_0x00d9
            r6 = 9
            if (r1 != r6) goto L_0x004f
            goto L_0x00d9
        L_0x004f:
            r6 = 47
            if (r1 != r6) goto L_0x00ca
            r9.f5523k = r4
            r7 = 2
            if (r4 != r2) goto L_0x0068
            int r4 = r4 + -1
            r9.f5523k = r4
            boolean r2 = r9.O(r7)
            int r4 = r9.f5523k
            int r4 = r4 + r3
            r9.f5523k = r4
            if (r2 != 0) goto L_0x0068
            return r1
        L_0x0068:
            r9.q()
            int r2 = r9.f5523k
            char r4 = r0[r2]
            r8 = 42
            if (r4 == r8) goto L_0x007b
            if (r4 == r6) goto L_0x0076
            return r1
        L_0x0076:
            int r2 = r2 + 1
            r9.f5523k = r2
            goto L_0x00d3
        L_0x007b:
            int r2 = r2 + 1
            r9.f5523k = r2
        L_0x007f:
            int r1 = r9.f5523k
            int r1 = r1 + r7
            int r2 = r9.f5524l
            r4 = 0
            if (r1 <= r2) goto L_0x0090
            boolean r1 = r9.O(r7)
            if (r1 == 0) goto L_0x008e
            goto L_0x0090
        L_0x008e:
            r3 = r4
            goto L_0x00bc
        L_0x0090:
            char[] r1 = r9.f5522j
            int r2 = r9.f5523k
            char r1 = r1[r2]
            if (r1 != r5) goto L_0x00a2
            int r1 = r9.f5525m
            int r1 = r1 + r3
            r9.f5525m = r1
            int r2 = r2 + 1
            r9.f5526n = r2
            goto L_0x00b3
        L_0x00a2:
            if (r4 >= r7) goto L_0x00bc
            char[] r1 = r9.f5522j
            int r2 = r9.f5523k
            int r2 = r2 + r4
            char r1 = r1[r2]
            java.lang.String r2 = "*/"
            char r2 = r2.charAt(r4)
            if (r1 == r2) goto L_0x00b9
        L_0x00b3:
            int r1 = r9.f5523k
            int r1 = r1 + r3
            r9.f5523k = r1
            goto L_0x007f
        L_0x00b9:
            int r4 = r4 + 1
            goto L_0x00a2
        L_0x00bc:
            if (r3 == 0) goto L_0x00c3
            int r1 = r9.f5523k
            int r1 = r1 + r7
            goto L_0x0004
        L_0x00c3:
            java.lang.String r10 = "Unterminated comment"
            r9.B0(r10)
            r10 = 0
            throw r10
        L_0x00ca:
            r2 = 35
            r9.f5523k = r4
            if (r1 != r2) goto L_0x00d8
            r9.q()
        L_0x00d3:
            r9.z0()
            goto L_0x0002
        L_0x00d8:
            return r1
        L_0x00d9:
            r1 = r4
            goto L_0x0006
        */
        throw new UnsupportedOperationException("Method not decompiled: b.l.e.g0.a.q0(boolean):int");
    }

    public void r0() {
        int i2 = this.f5527o;
        if (i2 == 0) {
            i2 = z();
        }
        if (i2 == 7) {
            this.f5527o = 0;
            int[] iArr = this.v;
            int i3 = this.t - 1;
            iArr[i3] = iArr[i3] + 1;
            return;
        }
        StringBuilder y = b.e.a.a.a.y("Expected null but was ");
        y.append(v0());
        y.append(g0());
        throw new IllegalStateException(y.toString());
    }

    public final String s0(char c) {
        char[] cArr = this.f5522j;
        StringBuilder sb = null;
        while (true) {
            int i2 = this.f5523k;
            int i3 = this.f5524l;
            int i4 = i2;
            while (true) {
                if (i2 < i3) {
                    int i5 = i2 + 1;
                    char c2 = cArr[i2];
                    if (c2 == c) {
                        this.f5523k = i5;
                        int i6 = (i5 - i4) - 1;
                        if (sb == null) {
                            return new String(cArr, i4, i6);
                        }
                        sb.append(cArr, i4, i6);
                        return sb.toString();
                    } else if (c2 == '\\') {
                        this.f5523k = i5;
                        int i7 = (i5 - i4) - 1;
                        if (sb == null) {
                            sb = new StringBuilder(Math.max((i7 + 1) * 2, 16));
                        }
                        sb.append(cArr, i4, i7);
                        sb.append(x0());
                    } else {
                        if (c2 == 10) {
                            this.f5525m++;
                            this.f5526n = i5;
                        }
                        i2 = i5;
                    }
                } else {
                    if (sb == null) {
                        sb = new StringBuilder(Math.max((i2 - i4) * 2, 16));
                    }
                    sb.append(cArr, i4, i2 - i4);
                    this.f5523k = i2;
                    if (!O(1)) {
                        B0("Unterminated string");
                        throw null;
                    }
                }
            }
        }
    }

    public String t0() {
        String str;
        char c;
        int i2 = this.f5527o;
        if (i2 == 0) {
            i2 = z();
        }
        if (i2 == 10) {
            str = u0();
        } else {
            if (i2 == 8) {
                c = '\'';
            } else if (i2 == 9) {
                c = '\"';
            } else if (i2 == 11) {
                str = this.r;
                this.r = null;
            } else if (i2 == 15) {
                str = Long.toString(this.f5528p);
            } else if (i2 == 16) {
                str = new String(this.f5522j, this.f5523k, this.f5529q);
                this.f5523k += this.f5529q;
            } else {
                StringBuilder y = b.e.a.a.a.y("Expected a string but was ");
                y.append(v0());
                y.append(g0());
                throw new IllegalStateException(y.toString());
            }
            str = s0(c);
        }
        this.f5527o = 0;
        int[] iArr = this.v;
        int i3 = this.t - 1;
        iArr[i3] = iArr[i3] + 1;
        return str;
    }

    public String toString() {
        return getClass().getSimpleName() + g0();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x004a, code lost:
        q();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String u0() {
        /*
            r6 = this;
            r0 = 0
            r1 = 0
        L_0x0002:
            r2 = r0
        L_0x0003:
            int r3 = r6.f5523k
            int r4 = r3 + r2
            int r5 = r6.f5524l
            if (r4 >= r5) goto L_0x004e
            char[] r4 = r6.f5522j
            int r3 = r3 + r2
            char r3 = r4[r3]
            r4 = 9
            if (r3 == r4) goto L_0x005c
            r4 = 10
            if (r3 == r4) goto L_0x005c
            r4 = 12
            if (r3 == r4) goto L_0x005c
            r4 = 13
            if (r3 == r4) goto L_0x005c
            r4 = 32
            if (r3 == r4) goto L_0x005c
            r4 = 35
            if (r3 == r4) goto L_0x004a
            r4 = 44
            if (r3 == r4) goto L_0x005c
            r4 = 47
            if (r3 == r4) goto L_0x004a
            r4 = 61
            if (r3 == r4) goto L_0x004a
            r4 = 123(0x7b, float:1.72E-43)
            if (r3 == r4) goto L_0x005c
            r4 = 125(0x7d, float:1.75E-43)
            if (r3 == r4) goto L_0x005c
            r4 = 58
            if (r3 == r4) goto L_0x005c
            r4 = 59
            if (r3 == r4) goto L_0x004a
            switch(r3) {
                case 91: goto L_0x005c;
                case 92: goto L_0x004a;
                case 93: goto L_0x005c;
                default: goto L_0x0047;
            }
        L_0x0047:
            int r2 = r2 + 1
            goto L_0x0003
        L_0x004a:
            r6.q()
            goto L_0x005c
        L_0x004e:
            char[] r3 = r6.f5522j
            int r3 = r3.length
            if (r2 >= r3) goto L_0x005e
            int r3 = r2 + 1
            boolean r3 = r6.O(r3)
            if (r3 == 0) goto L_0x005c
            goto L_0x0003
        L_0x005c:
            r0 = r2
            goto L_0x007e
        L_0x005e:
            if (r1 != 0) goto L_0x006b
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r3 = 16
            int r3 = java.lang.Math.max(r2, r3)
            r1.<init>(r3)
        L_0x006b:
            char[] r3 = r6.f5522j
            int r4 = r6.f5523k
            r1.append(r3, r4, r2)
            int r3 = r6.f5523k
            int r3 = r3 + r2
            r6.f5523k = r3
            r2 = 1
            boolean r2 = r6.O(r2)
            if (r2 != 0) goto L_0x0002
        L_0x007e:
            if (r1 != 0) goto L_0x008a
            java.lang.String r1 = new java.lang.String
            char[] r2 = r6.f5522j
            int r3 = r6.f5523k
            r1.<init>(r2, r3, r0)
            goto L_0x0095
        L_0x008a:
            char[] r2 = r6.f5522j
            int r3 = r6.f5523k
            r1.append(r2, r3, r0)
            java.lang.String r1 = r1.toString()
        L_0x0095:
            int r2 = r6.f5523k
            int r2 = r2 + r0
            r6.f5523k = r2
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: b.l.e.g0.a.u0():java.lang.String");
    }

    public b v0() {
        int i2 = this.f5527o;
        if (i2 == 0) {
            i2 = z();
        }
        switch (i2) {
            case 1:
                return b.BEGIN_OBJECT;
            case 2:
                return b.END_OBJECT;
            case 3:
                return b.BEGIN_ARRAY;
            case 4:
                return b.END_ARRAY;
            case 5:
            case 6:
                return b.BOOLEAN;
            case 7:
                return b.NULL;
            case 8:
            case 9:
            case 10:
            case 11:
                return b.STRING;
            case 12:
            case 13:
            case 14:
                return b.NAME;
            case 15:
            case 16:
                return b.NUMBER;
            case 17:
                return b.END_DOCUMENT;
            default:
                throw new AssertionError();
        }
    }

    public final void w0(int i2) {
        int i3 = this.t;
        int[] iArr = this.s;
        if (i3 == iArr.length) {
            int i4 = i3 * 2;
            this.s = Arrays.copyOf(iArr, i4);
            this.v = Arrays.copyOf(this.v, i4);
            this.u = (String[]) Arrays.copyOf(this.u, i4);
        }
        int[] iArr2 = this.s;
        int i5 = this.t;
        this.t = i5 + 1;
        iArr2[i5] = i2;
    }

    public final char x0() {
        int i2;
        int i3;
        if (this.f5523k != this.f5524l || O(1)) {
            char[] cArr = this.f5522j;
            int i4 = this.f5523k;
            int i5 = i4 + 1;
            this.f5523k = i5;
            char c = cArr[i4];
            if (c == 10) {
                this.f5525m++;
                this.f5526n = i5;
            } else if (!(c == '\"' || c == '\'' || c == '/' || c == '\\')) {
                if (c == 'b') {
                    return 8;
                }
                if (c == 'f') {
                    return 12;
                }
                if (c == 'n') {
                    return 10;
                }
                if (c == 'r') {
                    return 13;
                }
                if (c == 't') {
                    return 9;
                }
                if (c != 'u') {
                    B0("Invalid escape sequence");
                    throw null;
                } else if (i5 + 4 <= this.f5524l || O(4)) {
                    char c2 = 0;
                    int i6 = this.f5523k;
                    int i7 = i6 + 4;
                    while (i6 < i7) {
                        char c3 = this.f5522j[i6];
                        char c4 = (char) (c2 << 4);
                        if (c3 < '0' || c3 > '9') {
                            if (c3 >= 'a' && c3 <= 'f') {
                                i3 = c3 - 'a';
                            } else if (c3 < 'A' || c3 > 'F') {
                                StringBuilder y = b.e.a.a.a.y("\\u");
                                y.append(new String(this.f5522j, this.f5523k, 4));
                                throw new NumberFormatException(y.toString());
                            } else {
                                i3 = c3 - 'A';
                            }
                            i2 = i3 + 10;
                        } else {
                            i2 = c3 - '0';
                        }
                        c2 = (char) (i2 + c4);
                        i6++;
                    }
                    this.f5523k += 4;
                    return c2;
                } else {
                    B0("Unterminated escape sequence");
                    throw null;
                }
            }
            return c;
        }
        B0("Unterminated escape sequence");
        throw null;
    }

    public final void y0(char c) {
        char[] cArr = this.f5522j;
        while (true) {
            int i2 = this.f5523k;
            int i3 = this.f5524l;
            while (true) {
                if (i2 < i3) {
                    int i4 = i2 + 1;
                    char c2 = cArr[i2];
                    if (c2 == c) {
                        this.f5523k = i4;
                        return;
                    } else if (c2 == '\\') {
                        this.f5523k = i4;
                        x0();
                        break;
                    } else {
                        if (c2 == 10) {
                            this.f5525m++;
                            this.f5526n = i4;
                        }
                        i2 = i4;
                    }
                } else {
                    this.f5523k = i2;
                    if (!O(1)) {
                        B0("Unterminated string");
                        throw null;
                    }
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:143:0x01f8, code lost:
        if (r9 == 6) goto L_0x01fc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x0210, code lost:
        if (e0(r6) != false) goto L_0x018a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x0212, code lost:
        if (r9 != 2) goto L_0x0233;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x0214, code lost:
        if (r15 == false) goto L_0x0233;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x021a, code lost:
        if (r11 != Long.MIN_VALUE) goto L_0x021e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x021c, code lost:
        if (r16 == false) goto L_0x0233;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x0220, code lost:
        if (r11 != 0) goto L_0x0224;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x0222, code lost:
        if (r16 != false) goto L_0x0233;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x0224, code lost:
        if (r16 == false) goto L_0x0227;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x0227, code lost:
        r11 = -r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x0228, code lost:
        r0.f5528p = r11;
        r0.f5523k += r19;
        r1 = 15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x0233, code lost:
        if (r9 == 2) goto L_0x023b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x0236, code lost:
        if (r9 == 4) goto L_0x023b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x0239, code lost:
        if (r9 != 7) goto L_0x018a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x023b, code lost:
        r0.f5529q = r19;
        r1 = 16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x0241, code lost:
        r6 = r1;
        r0.f5527o = r6;
     */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x0175  */
    /* JADX WARNING: Removed duplicated region for block: B:207:0x02b6  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00d9  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x0174 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int z() {
        /*
            r20 = this;
            r0 = r20
            int[] r1 = r0.s
            int r2 = r0.t
            int r3 = r2 + -1
            r3 = r1[r3]
            r7 = 93
            r8 = 59
            r9 = 44
            r10 = 3
            r11 = 6
            r12 = 7
            r13 = 5
            r14 = 2
            r15 = 0
            r5 = 4
            r6 = 0
            r4 = 1
            if (r3 != r4) goto L_0x0020
            int r2 = r2 - r4
            r1[r2] = r14
            goto L_0x00d1
        L_0x0020:
            if (r3 != r14) goto L_0x003a
            int r1 = r0.q0(r4)
            if (r1 == r9) goto L_0x00d1
            if (r1 == r8) goto L_0x0035
            if (r1 != r7) goto L_0x002f
            r0.f5527o = r5
            return r5
        L_0x002f:
            java.lang.String r1 = "Unterminated array"
            r0.B0(r1)
            throw r15
        L_0x0035:
            r20.q()
            goto L_0x00d1
        L_0x003a:
            if (r3 == r10) goto L_0x02c2
            if (r3 != r13) goto L_0x0040
            goto L_0x02c2
        L_0x0040:
            if (r3 != r5) goto L_0x0074
            int r2 = r2 - r4
            r1[r2] = r13
            int r1 = r0.q0(r4)
            r2 = 58
            if (r1 == r2) goto L_0x00d1
            r2 = 61
            if (r1 != r2) goto L_0x006e
            r20.q()
            int r1 = r0.f5523k
            int r2 = r0.f5524l
            if (r1 < r2) goto L_0x0060
            boolean r1 = r0.O(r4)
            if (r1 == 0) goto L_0x00d1
        L_0x0060:
            char[] r1 = r0.f5522j
            int r2 = r0.f5523k
            char r1 = r1[r2]
            r5 = 62
            if (r1 != r5) goto L_0x00d1
            int r2 = r2 + r4
            r0.f5523k = r2
            goto L_0x00d1
        L_0x006e:
            java.lang.String r1 = "Expected ':'"
            r0.B0(r1)
            throw r15
        L_0x0074:
            if (r3 != r11) goto L_0x00b6
            boolean r1 = r0.f5521i
            if (r1 == 0) goto L_0x00ae
            r0.q0(r4)
            int r1 = r0.f5523k
            int r1 = r1 - r4
            r0.f5523k = r1
            char[] r2 = w
            int r5 = r2.length
            int r1 = r1 + r5
            int r5 = r0.f5524l
            if (r1 <= r5) goto L_0x0092
            int r1 = r2.length
            boolean r1 = r0.O(r1)
            if (r1 != 0) goto L_0x0092
            goto L_0x00ae
        L_0x0092:
            r1 = r6
        L_0x0093:
            char[] r2 = w
            int r5 = r2.length
            if (r1 >= r5) goto L_0x00a8
            char[] r5 = r0.f5522j
            int r15 = r0.f5523k
            int r15 = r15 + r1
            char r5 = r5[r15]
            char r2 = r2[r1]
            if (r5 == r2) goto L_0x00a4
            goto L_0x00ae
        L_0x00a4:
            int r1 = r1 + 1
            r15 = 0
            goto L_0x0093
        L_0x00a8:
            int r1 = r0.f5523k
            int r2 = r2.length
            int r1 = r1 + r2
            r0.f5523k = r1
        L_0x00ae:
            int[] r1 = r0.s
            int r2 = r0.t
            int r2 = r2 - r4
            r1[r2] = r12
            goto L_0x00d1
        L_0x00b6:
            if (r3 != r12) goto L_0x00cd
            int r1 = r0.q0(r6)
            r2 = -1
            if (r1 != r2) goto L_0x00c4
            r1 = 17
        L_0x00c1:
            r0.f5527o = r1
            return r1
        L_0x00c4:
            r20.q()
            int r1 = r0.f5523k
            int r1 = r1 - r4
            r0.f5523k = r1
            goto L_0x00d1
        L_0x00cd:
            r1 = 8
            if (r3 == r1) goto L_0x02ba
        L_0x00d1:
            int r1 = r0.q0(r4)
            r2 = 34
            if (r1 == r2) goto L_0x02b6
            r2 = 39
            if (r1 == r2) goto L_0x02af
            if (r1 == r9) goto L_0x0297
            if (r1 == r8) goto L_0x0297
            r2 = 91
            if (r1 == r2) goto L_0x0294
            if (r1 == r7) goto L_0x028d
            r2 = 123(0x7b, float:1.72E-43)
            if (r1 == r2) goto L_0x028a
            int r1 = r0.f5523k
            int r1 = r1 - r4
            r0.f5523k = r1
            char[] r2 = r0.f5522j
            char r1 = r2[r1]
            r2 = 116(0x74, float:1.63E-43)
            if (r1 == r2) goto L_0x011a
            r2 = 84
            if (r1 != r2) goto L_0x00fd
            goto L_0x011a
        L_0x00fd:
            r2 = 102(0x66, float:1.43E-43)
            if (r1 == r2) goto L_0x0114
            r2 = 70
            if (r1 != r2) goto L_0x0106
            goto L_0x0114
        L_0x0106:
            r2 = 110(0x6e, float:1.54E-43)
            if (r1 == r2) goto L_0x010e
            r2 = 78
            if (r1 != r2) goto L_0x0169
        L_0x010e:
            java.lang.String r1 = "null"
            java.lang.String r2 = "NULL"
            r3 = r12
            goto L_0x011f
        L_0x0114:
            java.lang.String r1 = "false"
            java.lang.String r2 = "FALSE"
            r3 = r11
            goto L_0x011f
        L_0x011a:
            java.lang.String r1 = "true"
            java.lang.String r2 = "TRUE"
            r3 = r13
        L_0x011f:
            int r5 = r1.length()
            r7 = r4
        L_0x0124:
            if (r7 >= r5) goto L_0x014d
            int r8 = r0.f5523k
            int r8 = r8 + r7
            int r9 = r0.f5524l
            if (r8 < r9) goto L_0x0136
            int r8 = r7 + 1
            boolean r8 = r0.O(r8)
            if (r8 != 0) goto L_0x0136
            goto L_0x0169
        L_0x0136:
            char[] r8 = r0.f5522j
            int r9 = r0.f5523k
            int r9 = r9 + r7
            char r8 = r8[r9]
            char r9 = r1.charAt(r7)
            if (r8 == r9) goto L_0x014a
            char r9 = r2.charAt(r7)
            if (r8 == r9) goto L_0x014a
            goto L_0x0169
        L_0x014a:
            int r7 = r7 + 1
            goto L_0x0124
        L_0x014d:
            int r1 = r0.f5523k
            int r1 = r1 + r5
            int r2 = r0.f5524l
            if (r1 < r2) goto L_0x015c
            int r1 = r5 + 1
            boolean r1 = r0.O(r1)
            if (r1 == 0) goto L_0x016b
        L_0x015c:
            char[] r1 = r0.f5522j
            int r2 = r0.f5523k
            int r2 = r2 + r5
            char r1 = r1[r2]
            boolean r1 = r0.e0(r1)
            if (r1 == 0) goto L_0x016b
        L_0x0169:
            r3 = r6
            goto L_0x0172
        L_0x016b:
            int r1 = r0.f5523k
            int r1 = r1 + r5
            r0.f5523k = r1
            r0.f5527o = r3
        L_0x0172:
            if (r3 == 0) goto L_0x0175
            return r3
        L_0x0175:
            char[] r1 = r0.f5522j
            int r2 = r0.f5523k
            int r3 = r0.f5524l
            r7 = 0
            r15 = r4
            r5 = r6
            r9 = r5
            r16 = r9
            r11 = r7
        L_0x0183:
            int r6 = r2 + r5
            if (r6 != r3) goto L_0x019d
            int r2 = r1.length
            if (r5 != r2) goto L_0x018d
        L_0x018a:
            r6 = 0
            goto L_0x026d
        L_0x018d:
            int r2 = r5 + 1
            boolean r2 = r0.O(r2)
            if (r2 != 0) goto L_0x0199
            r19 = r5
            goto L_0x0212
        L_0x0199:
            int r2 = r0.f5523k
            int r3 = r0.f5524l
        L_0x019d:
            int r6 = r2 + r5
            char r6 = r1[r6]
            r13 = 43
            if (r6 == r13) goto L_0x0261
            r13 = 69
            if (r6 == r13) goto L_0x0257
            r13 = 101(0x65, float:1.42E-43)
            if (r6 == r13) goto L_0x0257
            r13 = 45
            if (r6 == r13) goto L_0x024b
            r13 = 46
            if (r6 == r13) goto L_0x0245
            r13 = 48
            if (r6 < r13) goto L_0x020a
            r13 = 57
            if (r6 <= r13) goto L_0x01be
            goto L_0x020a
        L_0x01be:
            if (r9 == r4) goto L_0x01fe
            if (r9 != 0) goto L_0x01c3
            goto L_0x01fe
        L_0x01c3:
            if (r9 != r14) goto L_0x01ed
            int r13 = (r11 > r7 ? 1 : (r11 == r7 ? 0 : -1))
            if (r13 != 0) goto L_0x01ca
            goto L_0x018a
        L_0x01ca:
            r17 = 10
            long r17 = r17 * r11
            int r6 = r6 + -48
            r19 = r5
            long r4 = (long) r6
            long r17 = r17 - r4
            r4 = -922337203685477580(0xf333333333333334, double:-8.390303882365713E246)
            int r4 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
            if (r4 > 0) goto L_0x01e7
            if (r4 != 0) goto L_0x01e5
            int r4 = (r17 > r11 ? 1 : (r17 == r11 ? 0 : -1))
            if (r4 >= 0) goto L_0x01e5
            goto L_0x01e7
        L_0x01e5:
            r4 = 0
            goto L_0x01e8
        L_0x01e7:
            r4 = 1
        L_0x01e8:
            r15 = r15 & r4
            r11 = r17
            r4 = 6
            goto L_0x0206
        L_0x01ed:
            r19 = r5
            if (r9 != r10) goto L_0x01f4
            r4 = 6
            r9 = 4
            goto L_0x0206
        L_0x01f4:
            r4 = 5
            if (r9 == r4) goto L_0x01fb
            r4 = 6
            if (r9 != r4) goto L_0x0206
            goto L_0x01fc
        L_0x01fb:
            r4 = 6
        L_0x01fc:
            r9 = 7
            goto L_0x0206
        L_0x01fe:
            r19 = r5
            r4 = 6
            int r6 = r6 + -48
            int r5 = -r6
            long r11 = (long) r5
            r9 = r14
        L_0x0206:
            r6 = r19
            goto L_0x0267
        L_0x020a:
            r19 = r5
            boolean r1 = r0.e0(r6)
            if (r1 != 0) goto L_0x018a
        L_0x0212:
            if (r9 != r14) goto L_0x0233
            if (r15 == 0) goto L_0x0233
            r1 = -9223372036854775808
            int r1 = (r11 > r1 ? 1 : (r11 == r1 ? 0 : -1))
            if (r1 != 0) goto L_0x021e
            if (r16 == 0) goto L_0x0233
        L_0x021e:
            int r1 = (r11 > r7 ? 1 : (r11 == r7 ? 0 : -1))
            if (r1 != 0) goto L_0x0224
            if (r16 != 0) goto L_0x0233
        L_0x0224:
            if (r16 == 0) goto L_0x0227
            goto L_0x0228
        L_0x0227:
            long r11 = -r11
        L_0x0228:
            r0.f5528p = r11
            int r1 = r0.f5523k
            int r1 = r1 + r19
            r0.f5523k = r1
            r1 = 15
            goto L_0x0241
        L_0x0233:
            if (r9 == r14) goto L_0x023b
            r1 = 4
            if (r9 == r1) goto L_0x023b
            r1 = 7
            if (r9 != r1) goto L_0x018a
        L_0x023b:
            r6 = r19
            r0.f5529q = r6
            r1 = 16
        L_0x0241:
            r6 = r1
            r0.f5527o = r6
            goto L_0x026d
        L_0x0245:
            r6 = r5
            r4 = 6
            if (r9 != r14) goto L_0x018a
            r4 = r10
            goto L_0x0266
        L_0x024b:
            r6 = r5
            r4 = 6
            if (r9 != 0) goto L_0x0253
            r9 = 1
            r16 = 1
            goto L_0x0267
        L_0x0253:
            r5 = 5
            if (r9 != r5) goto L_0x018a
            goto L_0x0266
        L_0x0257:
            r6 = r5
            r4 = 6
            r5 = 5
            if (r9 == r14) goto L_0x025f
            r4 = 4
            if (r9 != r4) goto L_0x018a
        L_0x025f:
            r9 = r5
            goto L_0x0267
        L_0x0261:
            r6 = r5
            r5 = 5
            if (r9 != r5) goto L_0x018a
            r4 = 6
        L_0x0266:
            r9 = r4
        L_0x0267:
            int r5 = r6 + 1
            r4 = 1
            r13 = 5
            goto L_0x0183
        L_0x026d:
            if (r6 == 0) goto L_0x0270
            return r6
        L_0x0270:
            char[] r1 = r0.f5522j
            int r2 = r0.f5523k
            char r1 = r1[r2]
            boolean r1 = r0.e0(r1)
            if (r1 == 0) goto L_0x0283
            r20.q()
            r1 = 10
            goto L_0x00c1
        L_0x0283:
            java.lang.String r1 = "Expected value"
            r0.B0(r1)
            r1 = 0
            throw r1
        L_0x028a:
            r1 = r4
            goto L_0x00c1
        L_0x028d:
            r1 = r4
            if (r3 != r1) goto L_0x0298
            r2 = 4
            r0.f5527o = r2
            return r2
        L_0x0294:
            r0.f5527o = r10
            return r10
        L_0x0297:
            r1 = r4
        L_0x0298:
            if (r3 == r1) goto L_0x02a4
            if (r3 != r14) goto L_0x029d
            goto L_0x02a4
        L_0x029d:
            java.lang.String r1 = "Unexpected value"
            r0.B0(r1)
            r1 = 0
            throw r1
        L_0x02a4:
            r20.q()
            int r2 = r0.f5523k
            int r2 = r2 - r1
            r0.f5523k = r2
            r1 = 7
            goto L_0x00c1
        L_0x02af:
            r20.q()
            r1 = 8
            goto L_0x00c1
        L_0x02b6:
            r1 = 9
            goto L_0x00c1
        L_0x02ba:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "JsonReader is closed"
            r1.<init>(r2)
            throw r1
        L_0x02c2:
            int r2 = r2 - r4
            r5 = 4
            r1[r2] = r5
            r1 = 125(0x7d, float:1.75E-43)
            r2 = 5
            if (r3 != r2) goto L_0x02e4
            int r2 = r0.q0(r4)
            if (r2 == r9) goto L_0x02e2
            if (r2 == r8) goto L_0x02df
            if (r2 != r1) goto L_0x02d8
            r0.f5527o = r14
            return r14
        L_0x02d8:
            java.lang.String r1 = "Unterminated object"
            r0.B0(r1)
            r1 = 0
            throw r1
        L_0x02df:
            r20.q()
        L_0x02e2:
            r2 = 1
            goto L_0x02e5
        L_0x02e4:
            r2 = r4
        L_0x02e5:
            int r4 = r0.q0(r2)
            r5 = 34
            if (r4 == r5) goto L_0x031f
            r5 = 39
            if (r4 == r5) goto L_0x0318
            java.lang.String r5 = "Expected name"
            if (r4 == r1) goto L_0x030d
            r20.q()
            int r1 = r0.f5523k
            int r1 = r1 - r2
            r0.f5523k = r1
            char r1 = (char) r4
            boolean r1 = r0.e0(r1)
            if (r1 == 0) goto L_0x0308
            r1 = 14
            goto L_0x00c1
        L_0x0308:
            r0.B0(r5)
            r1 = 0
            throw r1
        L_0x030d:
            r1 = 0
            r2 = 5
            if (r3 == r2) goto L_0x0314
            r0.f5527o = r14
            return r14
        L_0x0314:
            r0.B0(r5)
            throw r1
        L_0x0318:
            r20.q()
            r1 = 12
            goto L_0x00c1
        L_0x031f:
            r1 = 13
            goto L_0x00c1
        */
        throw new UnsupportedOperationException("Method not decompiled: b.l.e.g0.a.z():int");
    }

    public final void z0() {
        char c;
        do {
            if (this.f5523k < this.f5524l || O(1)) {
                char[] cArr = this.f5522j;
                int i2 = this.f5523k;
                int i3 = i2 + 1;
                this.f5523k = i3;
                c = cArr[i2];
                if (c == 10) {
                    this.f5525m++;
                    this.f5526n = i3;
                    return;
                }
            } else {
                return;
            }
        } while (c != 13);
    }
}
