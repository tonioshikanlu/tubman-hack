package b.j.a.b;

import java.io.Closeable;
import java.io.OutputStream;
import java.math.BigDecimal;
import java.math.BigInteger;

public abstract class i implements Closeable {

    /* renamed from: h  reason: collision with root package name */
    public int f1416h;

    public enum a {
        AUTO_CLOSE_SOURCE(true),
        ALLOW_COMMENTS(false),
        ALLOW_YAML_COMMENTS(false),
        ALLOW_UNQUOTED_FIELD_NAMES(false),
        ALLOW_SINGLE_QUOTES(false),
        ALLOW_UNQUOTED_CONTROL_CHARS(false),
        ALLOW_BACKSLASH_ESCAPING_ANY_CHARACTER(false),
        ALLOW_NUMERIC_LEADING_ZEROS(false),
        ALLOW_NON_NUMERIC_NUMBERS(false),
        ALLOW_MISSING_VALUES(false),
        ALLOW_TRAILING_COMMA(false),
        STRICT_DUPLICATE_DETECTION(false),
        IGNORE_UNDEFINED(false),
        INCLUDE_SOURCE_IN_LOCATION(true);
        

        /* renamed from: h  reason: collision with root package name */
        public final boolean f1425h;

        /* renamed from: i  reason: collision with root package name */
        public final int f1426i;

        /* access modifiers changed from: public */
        a(boolean z) {
            this.f1426i = 1 << ordinal();
            this.f1425h = z;
        }

        public boolean d(int i2) {
            return (i2 & this.f1426i) != 0;
        }
    }

    public enum b {
        INT,
        LONG,
        BIG_INTEGER,
        FLOAT,
        DOUBLE,
        BIG_DECIMAL
    }

    public i() {
    }

    public i(int i2) {
        this.f1416h = i2;
    }

    public abstract int A0();

    public abstract g B0();

    public Object C0() {
        return null;
    }

    public int D0() {
        return E0(0);
    }

    public int E0(int i2) {
        return i2;
    }

    public long F0() {
        return G0(0);
    }

    public long G0(long j2) {
        return j2;
    }

    public abstract BigInteger H();

    public String H0() {
        return I0((String) null);
    }

    public abstract String I0(String str);

    public abstract boolean J0();

    public abstract boolean K0();

    public abstract boolean L0(l lVar);

    public abstract boolean M0(int i2);

    public abstract byte[] N(a aVar);

    public boolean N0(a aVar) {
        return aVar.d(this.f1416h);
    }

    public byte O() {
        int q0 = q0();
        if (q0 >= -128 && q0 <= 255) {
            return (byte) q0;
        }
        StringBuilder y = b.e.a.a.a.y("Numeric value (");
        y.append(x0());
        y.append(") out of range of Java byte");
        throw new h(this, y.toString());
    }

    public boolean O0() {
        return z() == l.START_ARRAY;
    }

    public boolean P0() {
        return z() == l.START_OBJECT;
    }

    public boolean Q0() {
        return false;
    }

    public String R0() {
        if (T0() == l.FIELD_NAME) {
            return e0();
        }
        return null;
    }

    public abstract m S();

    public String S0() {
        if (T0() == l.VALUE_STRING) {
            return x0();
        }
        return null;
    }

    public abstract l T0();

    public abstract l U0();

    public i V0(int i2, int i3) {
        return Z0((i2 & i3) | (this.f1416h & (~i3)));
    }

    public int W0(a aVar, OutputStream outputStream) {
        StringBuilder y = b.e.a.a.a.y("Operation not supported by parser of type ");
        y.append(getClass().getName());
        throw new UnsupportedOperationException(y.toString());
    }

    public boolean X0() {
        return false;
    }

    public abstract g Y();

    public void Y0(Object obj) {
        k v0 = v0();
        if (v0 != null) {
            v0.g(obj);
        }
    }

    @Deprecated
    public i Z0(int i2) {
        this.f1416h = i2;
        return this;
    }

    public abstract i a1();

    public boolean b() {
        return false;
    }

    public abstract void close();

    public boolean e() {
        return false;
    }

    public abstract String e0();

    public abstract l g0();

    public abstract int k0();

    public abstract BigDecimal m0();

    public abstract double n0();

    public Object o0() {
        return null;
    }

    public abstract float p0();

    public abstract void q();

    public abstract int q0();

    public abstract long r0();

    public abstract b s0();

    public abstract Number t0();

    public Object u0() {
        return null;
    }

    public abstract k v0();

    public short w0() {
        int q0 = q0();
        if (q0 >= -32768 && q0 <= 32767) {
            return (short) q0;
        }
        StringBuilder y = b.e.a.a.a.y("Numeric value (");
        y.append(x0());
        y.append(") out of range of Java short");
        throw new h(this, y.toString());
    }

    public abstract String x0();

    public abstract char[] y0();

    public l z() {
        return g0();
    }

    public abstract int z0();
}
