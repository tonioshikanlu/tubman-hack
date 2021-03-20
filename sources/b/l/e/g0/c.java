package b.l.e.g0;

import b.e.a.a.a;
import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.Writer;
import java.util.Arrays;
import java.util.Objects;

public class c implements Closeable, Flushable {

    /* renamed from: q  reason: collision with root package name */
    public static final String[] f5540q = new String[128];
    public static final String[] r;

    /* renamed from: h  reason: collision with root package name */
    public final Writer f5541h;

    /* renamed from: i  reason: collision with root package name */
    public int[] f5542i = new int[32];

    /* renamed from: j  reason: collision with root package name */
    public int f5543j = 0;

    /* renamed from: k  reason: collision with root package name */
    public String f5544k;

    /* renamed from: l  reason: collision with root package name */
    public String f5545l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f5546m;

    /* renamed from: n  reason: collision with root package name */
    public boolean f5547n;

    /* renamed from: o  reason: collision with root package name */
    public String f5548o;

    /* renamed from: p  reason: collision with root package name */
    public boolean f5549p;

    static {
        for (int i2 = 0; i2 <= 31; i2++) {
            f5540q[i2] = String.format("\\u%04x", new Object[]{Integer.valueOf(i2)});
        }
        String[] strArr = f5540q;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        String[] strArr2 = (String[]) strArr.clone();
        r = strArr2;
        strArr2[60] = "\\u003c";
        strArr2[62] = "\\u003e";
        strArr2[38] = "\\u0026";
        strArr2[61] = "\\u003d";
        strArr2[39] = "\\u0027";
    }

    public c(Writer writer) {
        g0(6);
        this.f5545l = ":";
        this.f5549p = true;
        Objects.requireNonNull(writer, "out == null");
        this.f5541h = writer;
    }

    public c H() {
        z(1, 2, ']');
        return this;
    }

    public c N() {
        z(3, 5, '}');
        return this;
    }

    public c O(String str) {
        Objects.requireNonNull(str, "name == null");
        if (this.f5548o != null) {
            throw new IllegalStateException();
        } else if (this.f5543j != 0) {
            this.f5548o = str;
            return this;
        } else {
            throw new IllegalStateException("JsonWriter is closed.");
        }
    }

    public final void S() {
        if (this.f5544k != null) {
            this.f5541h.write(10);
            int i2 = this.f5543j;
            for (int i3 = 1; i3 < i2; i3++) {
                this.f5541h.write(this.f5544k);
            }
        }
    }

    public c Y() {
        if (this.f5548o != null) {
            if (this.f5549p) {
                s0();
            } else {
                this.f5548o = null;
                return this;
            }
        }
        b();
        this.f5541h.write("null");
        return this;
    }

    public final void b() {
        int e0 = e0();
        if (e0 == 1) {
            k0(2);
        } else if (e0 == 2) {
            this.f5541h.append(',');
        } else if (e0 != 4) {
            if (e0 != 6) {
                if (e0 != 7) {
                    throw new IllegalStateException("Nesting problem.");
                } else if (!this.f5546m) {
                    throw new IllegalStateException("JSON must have only one top-level value.");
                }
            }
            k0(7);
            return;
        } else {
            this.f5541h.append(this.f5545l);
            k0(5);
            return;
        }
        S();
    }

    public void close() {
        this.f5541h.close();
        int i2 = this.f5543j;
        if (i2 > 1 || (i2 == 1 && this.f5542i[i2 - 1] != 7)) {
            throw new IOException("Incomplete document");
        }
        this.f5543j = 0;
    }

    public c e() {
        s0();
        b();
        g0(1);
        this.f5541h.write(91);
        return this;
    }

    public final int e0() {
        int i2 = this.f5543j;
        if (i2 != 0) {
            return this.f5542i[i2 - 1];
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    public void flush() {
        if (this.f5543j != 0) {
            this.f5541h.flush();
            return;
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    public final void g0(int i2) {
        int i3 = this.f5543j;
        int[] iArr = this.f5542i;
        if (i3 == iArr.length) {
            this.f5542i = Arrays.copyOf(iArr, i3 * 2);
        }
        int[] iArr2 = this.f5542i;
        int i4 = this.f5543j;
        this.f5543j = i4 + 1;
        iArr2[i4] = i2;
    }

    public final void k0(int i2) {
        this.f5542i[this.f5543j - 1] = i2;
    }

    public final void m0(String str) {
        String str2;
        String[] strArr = this.f5547n ? r : f5540q;
        this.f5541h.write(34);
        int length = str.length();
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3++) {
            char charAt = str.charAt(i3);
            if (charAt < 128) {
                str2 = strArr[charAt];
                if (str2 == null) {
                }
            } else if (charAt == 8232) {
                str2 = "\\u2028";
            } else if (charAt == 8233) {
                str2 = "\\u2029";
            }
            if (i2 < i3) {
                this.f5541h.write(str, i2, i3 - i2);
            }
            this.f5541h.write(str2);
            i2 = i3 + 1;
        }
        if (i2 < length) {
            this.f5541h.write(str, i2, length - i2);
        }
        this.f5541h.write(34);
    }

    public c n0(long j2) {
        s0();
        b();
        this.f5541h.write(Long.toString(j2));
        return this;
    }

    public c o0(Boolean bool) {
        if (bool == null) {
            return Y();
        }
        s0();
        b();
        this.f5541h.write(bool.booleanValue() ? "true" : "false");
        return this;
    }

    public c p0(Number number) {
        if (number == null) {
            return Y();
        }
        s0();
        String obj = number.toString();
        if (this.f5546m || (!obj.equals("-Infinity") && !obj.equals("Infinity") && !obj.equals("NaN"))) {
            b();
            this.f5541h.append(obj);
            return this;
        }
        throw new IllegalArgumentException("Numeric values must be finite, but was " + number);
    }

    public c q() {
        s0();
        b();
        g0(3);
        this.f5541h.write(123);
        return this;
    }

    public c q0(String str) {
        if (str == null) {
            return Y();
        }
        s0();
        b();
        m0(str);
        return this;
    }

    public c r0(boolean z) {
        s0();
        b();
        this.f5541h.write(z ? "true" : "false");
        return this;
    }

    public final void s0() {
        if (this.f5548o != null) {
            int e0 = e0();
            if (e0 == 5) {
                this.f5541h.write(44);
            } else if (e0 != 3) {
                throw new IllegalStateException("Nesting problem.");
            }
            S();
            k0(4);
            m0(this.f5548o);
            this.f5548o = null;
        }
    }

    public final c z(int i2, int i3, char c) {
        int e0 = e0();
        if (e0 != i3 && e0 != i2) {
            throw new IllegalStateException("Nesting problem.");
        } else if (this.f5548o == null) {
            this.f5543j--;
            if (e0 == i3) {
                S();
            }
            this.f5541h.write(c);
            return this;
        } else {
            StringBuilder y = a.y("Dangling name: ");
            y.append(this.f5548o);
            throw new IllegalStateException(y.toString());
        }
    }
}
