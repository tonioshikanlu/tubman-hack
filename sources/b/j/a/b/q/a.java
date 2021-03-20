package b.j.a.b.q;

import b.j.a.b.f;
import b.j.a.b.k;
import b.j.a.b.m;
import b.j.a.b.o;
import b.j.a.b.t.b;
import b.j.a.b.t.e;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

public abstract class a extends f {

    /* renamed from: m  reason: collision with root package name */
    public static final int f1446m = ((f.a.WRITE_NUMBERS_AS_STRINGS.f1409i | f.a.ESCAPE_NON_ASCII.f1409i) | f.a.STRICT_DUPLICATE_DETECTION.f1409i);

    /* renamed from: i  reason: collision with root package name */
    public m f1447i;

    /* renamed from: j  reason: collision with root package name */
    public int f1448j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f1449k;

    /* renamed from: l  reason: collision with root package name */
    public e f1450l;

    public a(int i2, m mVar) {
        this.f1448j = i2;
        this.f1447i = mVar;
        boolean z = true;
        this.f1450l = e.m((f.a.STRICT_DUPLICATE_DETECTION.f1409i & i2) != 0 ? new b(this) : null);
        this.f1449k = (i2 & f.a.WRITE_NUMBERS_AS_STRINGS.f1409i) == 0 ? false : z;
    }

    public void D0(Object obj) {
        boolean z;
        int i2;
        long j2;
        short s;
        if (obj == null) {
            u0();
            return;
        }
        m mVar = this.f1447i;
        if (mVar != null) {
            mVar.a(this, obj);
        } else if (obj instanceof String) {
            Q0((String) obj);
        } else {
            if (obj instanceof Number) {
                Number number = (Number) obj;
                if (number instanceof Integer) {
                    i2 = number.intValue();
                } else {
                    if (number instanceof Long) {
                        j2 = number.longValue();
                    } else if (number instanceof Double) {
                        v0(number.doubleValue());
                        return;
                    } else if (number instanceof Float) {
                        w0(number.floatValue());
                        return;
                    } else {
                        if (number instanceof Short) {
                            s = number.shortValue();
                        } else if (number instanceof Byte) {
                            s = (short) number.byteValue();
                        } else if (number instanceof BigInteger) {
                            B0((BigInteger) number);
                            return;
                        } else if (number instanceof BigDecimal) {
                            A0((BigDecimal) number);
                            return;
                        } else if (number instanceof AtomicInteger) {
                            i2 = ((AtomicInteger) number).get();
                        } else if (number instanceof AtomicLong) {
                            j2 = ((AtomicLong) number).get();
                        }
                        C0(s);
                        return;
                    }
                    y0(j2);
                    return;
                }
                x0(i2);
                return;
            } else if (obj instanceof byte[]) {
                n0((byte[]) obj);
                return;
            } else {
                if (obj instanceof Boolean) {
                    z = ((Boolean) obj).booleanValue();
                } else if (obj instanceof AtomicBoolean) {
                    z = ((AtomicBoolean) obj).get();
                }
                o0(z);
                return;
            }
            throw new IllegalStateException(b.e.a.a.a.f(obj, b.e.a.a.a.y("No ObjectCodec defined for the generator, can only serialize simple wrapper types (type passed "), ")"));
        }
    }

    public void J0(o oVar) {
        W0("write raw value");
        G0(oVar);
    }

    public void K0(String str) {
        W0("write raw value");
        H0(str);
    }

    public int N() {
        return this.f1448j;
    }

    public k O() {
        return this.f1450l;
    }

    public f S(int i2, int i3) {
        int i4 = this.f1448j;
        int i5 = (i2 & i3) | ((~i3) & i4);
        int i6 = i4 ^ i5;
        if (i6 != 0) {
            this.f1448j = i5;
            V0(i5, i6);
        }
        return this;
    }

    public String U0(BigDecimal bigDecimal) {
        if (!f.a.WRITE_BIGDECIMAL_AS_PLAIN.e(this.f1448j)) {
            return bigDecimal.toString();
        }
        int scale = bigDecimal.scale();
        if (scale >= -9999 && scale <= 9999) {
            return bigDecimal.toPlainString();
        }
        throw new b.j.a.b.e(String.format("Attempt to write plain `java.math.BigDecimal` (see JsonGenerator.Feature.WRITE_BIGDECIMAL_AS_PLAIN) with illegal scale (%d): needs to be between [-%d, %d]", new Object[]{Integer.valueOf(scale), 9999, 9999}), this);
    }

    public abstract void V0(int i2, int i3);

    public abstract void W0(String str);

    public final boolean X0(f.a aVar) {
        return (aVar.f1409i & this.f1448j) != 0;
    }

    public void Y(Object obj) {
        e eVar = this.f1450l;
        if (eVar != null) {
            eVar.f1512g = obj;
        }
    }

    @Deprecated
    public f e0(int i2) {
        int i3 = this.f1448j ^ i2;
        this.f1448j = i2;
        if (i3 != 0) {
            V0(i2, i3);
        }
        return this;
    }

    public f g0() {
        if (this.f1399h != null) {
            return this;
        }
        this.f1399h = new b.j.a.b.w.e();
        return this;
    }
}
