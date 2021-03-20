package b.j.a.b.w;

import b.j.a.b.s.f;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;

public final class k {

    /* renamed from: l  reason: collision with root package name */
    public static final char[] f1576l = new char[0];
    public final a a;

    /* renamed from: b  reason: collision with root package name */
    public char[] f1577b;
    public int c;
    public int d;

    /* renamed from: e  reason: collision with root package name */
    public ArrayList<char[]> f1578e;
    public boolean f;

    /* renamed from: g  reason: collision with root package name */
    public int f1579g;

    /* renamed from: h  reason: collision with root package name */
    public char[] f1580h;

    /* renamed from: i  reason: collision with root package name */
    public int f1581i;

    /* renamed from: j  reason: collision with root package name */
    public String f1582j;

    /* renamed from: k  reason: collision with root package name */
    public char[] f1583k;

    public k(a aVar) {
        this.a = aVar;
    }

    public k(a aVar, char[] cArr) {
        this.a = null;
        this.f1580h = cArr;
        this.f1581i = cArr.length;
        this.c = -1;
    }

    public void a(String str, int i2, int i3) {
        if (this.c >= 0) {
            t(i3);
        }
        this.f1582j = null;
        this.f1583k = null;
        char[] cArr = this.f1580h;
        int length = cArr.length;
        int i4 = this.f1581i;
        int i5 = length - i4;
        if (i5 >= i3) {
            str.getChars(i2, i2 + i3, cArr, i4);
            this.f1581i += i3;
            return;
        }
        if (i5 > 0) {
            int i6 = i2 + i5;
            str.getChars(i2, i6, cArr, i4);
            i3 -= i5;
            i2 = i6;
        }
        while (true) {
            j();
            int min = Math.min(this.f1580h.length, i3);
            int i7 = i2 + min;
            str.getChars(i2, i7, this.f1580h, 0);
            this.f1581i += min;
            i3 -= min;
            if (i3 > 0) {
                i2 = i7;
            } else {
                return;
            }
        }
    }

    public void b(char[] cArr, int i2, int i3) {
        if (this.c >= 0) {
            t(i3);
        }
        this.f1582j = null;
        this.f1583k = null;
        char[] cArr2 = this.f1580h;
        int length = cArr2.length;
        int i4 = this.f1581i;
        int i5 = length - i4;
        if (i5 >= i3) {
            System.arraycopy(cArr, i2, cArr2, i4, i3);
            this.f1581i += i3;
            return;
        }
        if (i5 > 0) {
            System.arraycopy(cArr, i2, cArr2, i4, i5);
            i2 += i5;
            i3 -= i5;
        }
        do {
            j();
            int min = Math.min(this.f1580h.length, i3);
            System.arraycopy(cArr, i2, this.f1580h, 0, min);
            this.f1581i += min;
            i2 += min;
            i3 -= min;
        } while (i3 > 0);
    }

    public final char[] c(int i2) {
        a aVar = this.a;
        return aVar != null ? aVar.b(2, i2) : new char[Math.max(i2, 500)];
    }

    public final void d() {
        this.f = false;
        this.f1578e.clear();
        this.f1579g = 0;
        this.f1581i = 0;
    }

    public char[] e() {
        int i2;
        char[] cArr = this.f1583k;
        if (cArr == null) {
            cArr = f1576l;
            String str = this.f1582j;
            if (str != null) {
                cArr = str.toCharArray();
            } else {
                int i3 = this.c;
                if (i3 >= 0) {
                    int i4 = this.d;
                    if (i4 >= 1) {
                        char[] cArr2 = this.f1577b;
                        cArr = i3 == 0 ? Arrays.copyOf(cArr2, i4) : Arrays.copyOfRange(cArr2, i3, i4 + i3);
                    }
                } else {
                    int s = s();
                    if (s >= 1) {
                        cArr = new char[s];
                        ArrayList<char[]> arrayList = this.f1578e;
                        if (arrayList != null) {
                            int size = arrayList.size();
                            i2 = 0;
                            for (int i5 = 0; i5 < size; i5++) {
                                char[] cArr3 = this.f1578e.get(i5);
                                int length = cArr3.length;
                                System.arraycopy(cArr3, 0, cArr, i2, length);
                                i2 += length;
                            }
                        } else {
                            i2 = 0;
                        }
                        System.arraycopy(this.f1580h, 0, cArr, i2, this.f1581i);
                    }
                }
            }
            this.f1583k = cArr;
        }
        return cArr;
    }

    public BigDecimal f() {
        char[] cArr;
        char[] cArr2;
        char[] cArr3 = this.f1583k;
        if (cArr3 != null) {
            String str = f.a;
            return f.b(cArr3, 0, cArr3.length);
        }
        int i2 = this.c;
        if (i2 >= 0 && (cArr2 = this.f1577b) != null) {
            return f.b(cArr2, i2, this.d);
        }
        if (this.f1579g == 0 && (cArr = this.f1580h) != null) {
            return f.b(cArr, 0, this.f1581i);
        }
        char[] e2 = e();
        String str2 = f.a;
        return f.b(e2, 0, e2.length);
    }

    public int g(boolean z) {
        char[] cArr;
        int i2 = this.c;
        return (i2 < 0 || (cArr = this.f1577b) == null) ? z ? -f.e(this.f1580h, 1, this.f1581i - 1) : f.e(this.f1580h, 0, this.f1581i) : z ? -f.e(cArr, i2 + 1, this.d - 1) : f.e(cArr, i2, this.d);
    }

    public String h() {
        String sb;
        if (this.f1582j == null) {
            if (this.f1583k != null) {
                sb = new String(this.f1583k);
            } else {
                String str = "";
                if (this.c < 0) {
                    int i2 = this.f1579g;
                    int i3 = this.f1581i;
                    if (i2 == 0) {
                        if (i3 != 0) {
                            str = new String(this.f1580h, 0, i3);
                        }
                        this.f1582j = str;
                    } else {
                        StringBuilder sb2 = new StringBuilder(i2 + i3);
                        ArrayList<char[]> arrayList = this.f1578e;
                        if (arrayList != null) {
                            int size = arrayList.size();
                            for (int i4 = 0; i4 < size; i4++) {
                                char[] cArr = this.f1578e.get(i4);
                                sb2.append(cArr, 0, cArr.length);
                            }
                        }
                        sb2.append(this.f1580h, 0, this.f1581i);
                        sb = sb2.toString();
                    }
                } else if (this.d < 1) {
                    this.f1582j = str;
                    return str;
                } else {
                    sb = new String(this.f1577b, this.c, this.d);
                }
            }
            this.f1582j = sb;
        }
        return this.f1582j;
    }

    public char[] i() {
        this.c = -1;
        this.f1581i = 0;
        this.d = 0;
        this.f1577b = null;
        this.f1582j = null;
        this.f1583k = null;
        if (this.f) {
            d();
        }
        char[] cArr = this.f1580h;
        if (cArr != null) {
            return cArr;
        }
        char[] c2 = c(0);
        this.f1580h = c2;
        return c2;
    }

    public final void j() {
        if (this.f1578e == null) {
            this.f1578e = new ArrayList<>();
        }
        char[] cArr = this.f1580h;
        this.f = true;
        this.f1578e.add(cArr);
        this.f1579g += cArr.length;
        this.f1581i = 0;
        int length = cArr.length;
        int i2 = length + (length >> 1);
        if (i2 < 500) {
            i2 = 500;
        } else if (i2 > 65536) {
            i2 = 65536;
        }
        this.f1580h = new char[i2];
    }

    public char[] k() {
        char[] cArr = this.f1580h;
        int length = cArr.length;
        int i2 = (length >> 1) + length;
        if (i2 > 65536) {
            i2 = (length >> 2) + length;
        }
        char[] copyOf = Arrays.copyOf(cArr, i2);
        this.f1580h = copyOf;
        return copyOf;
    }

    public char[] l() {
        if (this.f1578e == null) {
            this.f1578e = new ArrayList<>();
        }
        this.f = true;
        this.f1578e.add(this.f1580h);
        int length = this.f1580h.length;
        this.f1579g += length;
        this.f1581i = 0;
        int i2 = length + (length >> 1);
        if (i2 < 500) {
            i2 = 500;
        } else if (i2 > 65536) {
            i2 = 65536;
        }
        char[] cArr = new char[i2];
        this.f1580h = cArr;
        return cArr;
    }

    public char[] m() {
        if (this.c >= 0) {
            t(1);
        } else {
            char[] cArr = this.f1580h;
            if (cArr == null) {
                this.f1580h = c(0);
            } else if (this.f1581i >= cArr.length) {
                j();
            }
        }
        return this.f1580h;
    }

    public char[] n() {
        if (this.c >= 0) {
            return this.f1577b;
        }
        char[] cArr = this.f1583k;
        if (cArr != null) {
            return cArr;
        }
        String str = this.f1582j;
        if (str != null) {
            char[] charArray = str.toCharArray();
            this.f1583k = charArray;
            return charArray;
        } else if (this.f) {
            return e();
        } else {
            char[] cArr2 = this.f1580h;
            return cArr2 == null ? f1576l : cArr2;
        }
    }

    public int o() {
        int i2 = this.c;
        if (i2 >= 0) {
            return i2;
        }
        return 0;
    }

    public void p() {
        if (this.a == null) {
            q();
        } else if (this.f1580h != null) {
            q();
            char[] cArr = this.f1580h;
            this.f1580h = null;
            this.a.f1548b.set(2, cArr);
        }
    }

    public void q() {
        this.c = -1;
        this.f1581i = 0;
        this.d = 0;
        this.f1577b = null;
        this.f1582j = null;
        this.f1583k = null;
        if (this.f) {
            d();
        }
    }

    public void r(char[] cArr, int i2, int i3) {
        this.f1582j = null;
        this.f1583k = null;
        this.f1577b = cArr;
        this.c = i2;
        this.d = i3;
        if (this.f) {
            d();
        }
    }

    public int s() {
        if (this.c >= 0) {
            return this.d;
        }
        char[] cArr = this.f1583k;
        if (cArr != null) {
            return cArr.length;
        }
        String str = this.f1582j;
        return str != null ? str.length() : this.f1579g + this.f1581i;
    }

    public final void t(int i2) {
        int i3 = this.d;
        this.d = 0;
        char[] cArr = this.f1577b;
        this.f1577b = null;
        int i4 = this.c;
        this.c = -1;
        int i5 = i2 + i3;
        char[] cArr2 = this.f1580h;
        if (cArr2 == null || i5 > cArr2.length) {
            this.f1580h = c(i5);
        }
        if (i3 > 0) {
            System.arraycopy(cArr, i4, this.f1580h, 0, i3);
        }
        this.f1579g = 0;
        this.f1581i = i3;
    }

    public String toString() {
        return h();
    }
}
