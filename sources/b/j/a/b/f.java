package b.j.a.b;

import java.io.Closeable;
import java.io.Flushable;
import java.io.InputStream;
import java.math.BigDecimal;
import java.math.BigInteger;

public abstract class f implements Closeable, Flushable {

    /* renamed from: h  reason: collision with root package name */
    public n f1399h;

    public enum a {
        AUTO_CLOSE_TARGET(true),
        AUTO_CLOSE_JSON_CONTENT(true),
        FLUSH_PASSED_TO_STREAM(true),
        QUOTE_FIELD_NAMES(true),
        QUOTE_NON_NUMERIC_NUMBERS(true),
        ESCAPE_NON_ASCII(false),
        WRITE_NUMBERS_AS_STRINGS(false),
        WRITE_BIGDECIMAL_AS_PLAIN(false),
        STRICT_DUPLICATE_DETECTION(false),
        IGNORE_UNKNOWN(false);
        

        /* renamed from: h  reason: collision with root package name */
        public final boolean f1408h;

        /* renamed from: i  reason: collision with root package name */
        public final int f1409i;

        /* access modifiers changed from: public */
        a(boolean z) {
            this.f1408h = z;
            this.f1409i = 1 << ordinal();
        }

        public static int d() {
            a[] values = values();
            int i2 = 0;
            for (int i3 = 0; i3 < 10; i3++) {
                a aVar = values[i3];
                if (aVar.f1408h) {
                    i2 |= aVar.f1409i;
                }
            }
            return i2;
        }

        public boolean e(int i2) {
            return (i2 & this.f1409i) != 0;
        }
    }

    public abstract void A0(BigDecimal bigDecimal);

    public abstract void B0(BigInteger bigInteger);

    public void C0(short s) {
        x0(s);
    }

    public abstract void D0(Object obj);

    public void E0(Object obj) {
        throw new e("No native support for writing Object Ids", this);
    }

    public abstract void F0(char c);

    public void G0(o oVar) {
        H0(oVar.getValue());
    }

    public abstract f H(a aVar);

    public abstract void H0(String str);

    public abstract void I0(char[] cArr, int i2, int i3);

    public void J0(o oVar) {
        K0(oVar.getValue());
    }

    public abstract void K0(String str);

    public abstract void L0();

    public void M0(int i2) {
        L0();
    }

    public abstract int N();

    public abstract void N0();

    public abstract k O();

    public void O0(Object obj) {
        N0();
        Y(obj);
    }

    public abstract void P0(o oVar);

    public abstract void Q0(String str);

    public abstract void R0(char[] cArr, int i2, int i3);

    public f S(int i2, int i3) {
        return e0((i2 & i3) | (N() & (~i3)));
    }

    public void S0(String str, String str2) {
        t0(str);
        Q0(str2);
    }

    public void T0(Object obj) {
        throw new e("No native support for writing Type Ids", this);
    }

    public void Y(Object obj) {
        k O = O();
        if (O != null) {
            O.g(obj);
        }
    }

    public final void b(int i2, int i3, int i4) {
        if (i3 < 0 || i3 + i4 > i2) {
            throw new IllegalArgumentException(String.format("invalid argument(s) (offset=%d, length=%d) for input array of %d element", new Object[]{Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i2)}));
        }
    }

    public abstract void close();

    public boolean e() {
        return false;
    }

    @Deprecated
    public abstract f e0(int i2);

    public abstract void flush();

    public abstract f g0();

    public abstract int k0(a aVar, InputStream inputStream, int i2);

    public abstract void m0(a aVar, byte[] bArr, int i2, int i3);

    public void n0(byte[] bArr) {
        m0(b.f1372b, bArr, 0, bArr.length);
    }

    public abstract void o0(boolean z);

    public void p0(Object obj) {
        if (obj == null) {
            u0();
        } else if (obj instanceof byte[]) {
            n0((byte[]) obj);
        } else {
            StringBuilder y = b.e.a.a.a.y("No native support for writing embedded objects of type ");
            y.append(obj.getClass().getName());
            throw new e(y.toString(), this);
        }
    }

    public boolean q() {
        return false;
    }

    public abstract void q0();

    public abstract void r0();

    public abstract void s0(o oVar);

    public abstract void t0(String str);

    public abstract void u0();

    public abstract void v0(double d);

    public abstract void w0(float f);

    public abstract void x0(int i2);

    public abstract void y0(long j2);

    public boolean z() {
        return false;
    }

    public abstract void z0(String str);
}
