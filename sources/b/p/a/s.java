package b.p.a;

import b.e.a.a.a;
import java.io.IOException;
import java.util.Objects;
import o.f;

public final class s extends u {

    /* renamed from: p  reason: collision with root package name */
    public static final String[] f6405p = new String[128];

    /* renamed from: n  reason: collision with root package name */
    public final f f6406n;

    /* renamed from: o  reason: collision with root package name */
    public String f6407o;

    static {
        for (int i2 = 0; i2 <= 31; i2++) {
            f6405p[i2] = String.format("\\u%04x", new Object[]{Integer.valueOf(i2)});
        }
        String[] strArr = f6405p;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
    }

    public s(f fVar) {
        Objects.requireNonNull(fVar, "sink == null");
        this.f6406n = fVar;
        e0(6);
    }

    public static void s0(f fVar, String str) {
        String str2;
        String[] strArr = f6405p;
        fVar.E(34);
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
                fVar.m(str, i2, i3);
            }
            fVar.d0(str2);
            i2 = i3 + 1;
        }
        if (i2 < length) {
            fVar.m(str, i2, length);
        }
        fVar.E(34);
    }

    public u H() {
        this.f6414l = false;
        q0(3, 5, '}');
        return this;
    }

    public u O(String str) {
        Objects.requireNonNull(str, "name == null");
        if (this.f6410h != 0) {
            int Y = Y();
            if ((Y == 3 || Y == 5) && this.f6407o == null && !this.f6414l) {
                this.f6407o = str;
                this.f6412j[this.f6410h - 1] = str;
                return this;
            }
            throw new IllegalStateException("Nesting problem.");
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    public u S() {
        if (this.f6414l) {
            StringBuilder y = a.y("null cannot be used as a map key in JSON at path ");
            y.append(N());
            throw new IllegalStateException(y.toString());
        } else if (this.f6407o != null) {
            this.f6407o = null;
            return this;
        } else {
            p0();
            this.f6406n.d0("null");
            int[] iArr = this.f6413k;
            int i2 = this.f6410h - 1;
            iArr[i2] = iArr[i2] + 1;
            return this;
        }
    }

    public u b() {
        if (!this.f6414l) {
            t0();
            r0(1, 2, '[');
            return this;
        }
        StringBuilder y = a.y("Array cannot be used as a map key in JSON at path ");
        y.append(N());
        throw new IllegalStateException(y.toString());
    }

    public void close() {
        this.f6406n.close();
        int i2 = this.f6410h;
        if (i2 > 1 || (i2 == 1 && this.f6411i[i2 - 1] != 7)) {
            throw new IOException("Incomplete document");
        }
        this.f6410h = 0;
    }

    public u e() {
        if (!this.f6414l) {
            t0();
            r0(3, 5, '{');
            return this;
        }
        StringBuilder y = a.y("Object cannot be used as a map key in JSON at path ");
        y.append(N());
        throw new IllegalStateException(y.toString());
    }

    public void flush() {
        if (this.f6410h != 0) {
            this.f6406n.flush();
            return;
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    public u g0(double d) {
        if (Double.isNaN(d) || Double.isInfinite(d)) {
            throw new IllegalArgumentException("Numeric values must be finite, but was " + d);
        } else if (this.f6414l) {
            this.f6414l = false;
            O(Double.toString(d));
            return this;
        } else {
            t0();
            p0();
            this.f6406n.d0(Double.toString(d));
            int[] iArr = this.f6413k;
            int i2 = this.f6410h - 1;
            iArr[i2] = iArr[i2] + 1;
            return this;
        }
    }

    public u k0(long j2) {
        if (this.f6414l) {
            this.f6414l = false;
            O(Long.toString(j2));
            return this;
        }
        t0();
        p0();
        this.f6406n.d0(Long.toString(j2));
        int[] iArr = this.f6413k;
        int i2 = this.f6410h - 1;
        iArr[i2] = iArr[i2] + 1;
        return this;
    }

    public u m0(Number number) {
        String obj = number.toString();
        if (obj.equals("-Infinity") || obj.equals("Infinity") || obj.equals("NaN")) {
            throw new IllegalArgumentException("Numeric values must be finite, but was " + number);
        } else if (this.f6414l) {
            this.f6414l = false;
            O(obj);
            return this;
        } else {
            t0();
            p0();
            this.f6406n.d0(obj);
            int[] iArr = this.f6413k;
            int i2 = this.f6410h - 1;
            iArr[i2] = iArr[i2] + 1;
            return this;
        }
    }

    public u n0(String str) {
        if (str == null) {
            S();
            return this;
        } else if (this.f6414l) {
            this.f6414l = false;
            O(str);
            return this;
        } else {
            t0();
            p0();
            s0(this.f6406n, str);
            int[] iArr = this.f6413k;
            int i2 = this.f6410h - 1;
            iArr[i2] = iArr[i2] + 1;
            return this;
        }
    }

    public u o0(boolean z) {
        if (!this.f6414l) {
            t0();
            p0();
            this.f6406n.d0(z ? "true" : "false");
            int[] iArr = this.f6413k;
            int i2 = this.f6410h - 1;
            iArr[i2] = iArr[i2] + 1;
            return this;
        }
        StringBuilder y = a.y("Boolean cannot be used as a map key in JSON at path ");
        y.append(N());
        throw new IllegalStateException(y.toString());
    }

    public final void p0() {
        int Y = Y();
        int i2 = 7;
        if (Y != 1) {
            if (Y != 2) {
                if (Y == 4) {
                    i2 = 5;
                    this.f6406n.d0(":");
                } else if (Y == 9) {
                    throw new IllegalStateException("Sink from valueSink() was not closed");
                } else if (Y != 6) {
                    if (Y == 7) {
                        throw new IllegalStateException("JSON must have only one top-level value.");
                    }
                    throw new IllegalStateException("Nesting problem.");
                }
                this.f6411i[this.f6410h - 1] = i2;
            }
            this.f6406n.E(44);
        }
        i2 = 2;
        this.f6411i[this.f6410h - 1] = i2;
    }

    public final u q0(int i2, int i3, char c) {
        int Y = Y();
        if (Y != i3 && Y != i2) {
            throw new IllegalStateException("Nesting problem.");
        } else if (this.f6407o == null) {
            int i4 = this.f6410h;
            int i5 = this.f6415m;
            if (i4 == (~i5)) {
                this.f6415m = ~i5;
                return this;
            }
            int i6 = i4 - 1;
            this.f6410h = i6;
            this.f6412j[i6] = null;
            int[] iArr = this.f6413k;
            int i7 = i6 - 1;
            iArr[i7] = iArr[i7] + 1;
            this.f6406n.E(c);
            return this;
        } else {
            StringBuilder y = a.y("Dangling name: ");
            y.append(this.f6407o);
            throw new IllegalStateException(y.toString());
        }
    }

    public final u r0(int i2, int i3, char c) {
        int i4 = this.f6410h;
        int i5 = this.f6415m;
        if (i4 == i5) {
            int[] iArr = this.f6411i;
            if (iArr[i4 - 1] == i2 || iArr[i4 - 1] == i3) {
                this.f6415m = ~i5;
                return this;
            }
        }
        p0();
        q();
        int[] iArr2 = this.f6411i;
        int i6 = this.f6410h;
        int i7 = i6 + 1;
        this.f6410h = i7;
        iArr2[i6] = i2;
        this.f6413k[i7 - 1] = 0;
        this.f6406n.E(c);
        return this;
    }

    public final void t0() {
        if (this.f6407o != null) {
            int Y = Y();
            if (Y == 5) {
                this.f6406n.E(44);
            } else if (Y != 3) {
                throw new IllegalStateException("Nesting problem.");
            }
            this.f6411i[this.f6410h - 1] = 4;
            s0(this.f6406n, this.f6407o);
            this.f6407o = null;
        }
    }

    public u z() {
        q0(1, 2, ']');
        return this;
    }
}
