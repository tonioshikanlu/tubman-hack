package b.l.e.e0.z;

import b.l.e.e0.s;
import b.l.e.g0.b;
import b.l.e.n;
import b.l.e.q;
import b.l.e.t;
import b.l.e.v;
import java.io.Reader;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;

public final class e extends b.l.e.g0.a {
    public static final Reader B = new a();
    public static final Object C = new Object();
    public int[] A = new int[32];
    public Object[] x = new Object[32];
    public int y = 0;
    public String[] z = new String[32];

    public class a extends Reader {
        public void close() {
            throw new AssertionError();
        }

        public int read(char[] cArr, int i2, int i3) {
            throw new AssertionError();
        }
    }

    public e(q qVar) {
        super(B);
        F0(qVar);
    }

    private String g0() {
        StringBuilder y2 = b.e.a.a.a.y(" at path ");
        y2.append(S());
        return y2.toString();
    }

    public void A0() {
        if (v0() == b.NAME) {
            p0();
            this.z[this.y - 2] = "null";
        } else {
            E0();
            int i2 = this.y;
            if (i2 > 0) {
                this.z[i2 - 1] = "null";
            }
        }
        int i3 = this.y;
        if (i3 > 0) {
            int[] iArr = this.A;
            int i4 = i3 - 1;
            iArr[i4] = iArr[i4] + 1;
        }
    }

    public final void C0(b bVar) {
        if (v0() != bVar) {
            throw new IllegalStateException("Expected " + bVar + " but was " + v0() + g0());
        }
    }

    public final Object D0() {
        return this.x[this.y - 1];
    }

    public final Object E0() {
        Object[] objArr = this.x;
        int i2 = this.y - 1;
        this.y = i2;
        Object obj = objArr[i2];
        objArr[i2] = null;
        return obj;
    }

    public final void F0(Object obj) {
        int i2 = this.y;
        Object[] objArr = this.x;
        if (i2 == objArr.length) {
            int i3 = i2 * 2;
            this.x = Arrays.copyOf(objArr, i3);
            this.A = Arrays.copyOf(this.A, i3);
            this.z = (String[]) Arrays.copyOf(this.z, i3);
        }
        Object[] objArr2 = this.x;
        int i4 = this.y;
        this.y = i4 + 1;
        objArr2[i4] = obj;
    }

    public void H() {
        C0(b.END_ARRAY);
        E0();
        E0();
        int i2 = this.y;
        if (i2 > 0) {
            int[] iArr = this.A;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
        }
    }

    public void N() {
        C0(b.END_OBJECT);
        E0();
        E0();
        int i2 = this.y;
        if (i2 > 0) {
            int[] iArr = this.A;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
        }
    }

    public String S() {
        StringBuilder v = b.e.a.a.a.v('$');
        int i2 = 0;
        while (i2 < this.y) {
            Object[] objArr = this.x;
            if (objArr[i2] instanceof n) {
                i2++;
                if (objArr[i2] instanceof Iterator) {
                    v.append('[');
                    v.append(this.A[i2]);
                    v.append(']');
                }
            } else if (objArr[i2] instanceof t) {
                i2++;
                if (objArr[i2] instanceof Iterator) {
                    v.append('.');
                    String[] strArr = this.z;
                    if (strArr[i2] != null) {
                        v.append(strArr[i2]);
                    }
                }
            }
            i2++;
        }
        return v.toString();
    }

    public boolean Y() {
        b v0 = v0();
        return (v0 == b.END_OBJECT || v0 == b.END_ARRAY) ? false : true;
    }

    public void b() {
        C0(b.BEGIN_ARRAY);
        F0(((n) D0()).iterator());
        this.A[this.y - 1] = 0;
    }

    public void close() {
        this.x = new Object[]{C};
        this.y = 1;
    }

    public void e() {
        C0(b.BEGIN_OBJECT);
        F0(new s.b.a((s.b) ((t) D0()).entrySet()));
    }

    public boolean k0() {
        C0(b.BOOLEAN);
        boolean s = ((v) E0()).s();
        int i2 = this.y;
        if (i2 > 0) {
            int[] iArr = this.A;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
        }
        return s;
    }

    public double m0() {
        b v0 = v0();
        b bVar = b.NUMBER;
        if (v0 == bVar || v0 == b.STRING) {
            v vVar = (v) D0();
            double doubleValue = vVar.a instanceof Number ? vVar.v().doubleValue() : Double.parseDouble(vVar.p());
            if (this.f5521i || (!Double.isNaN(doubleValue) && !Double.isInfinite(doubleValue))) {
                E0();
                int i2 = this.y;
                if (i2 > 0) {
                    int[] iArr = this.A;
                    int i3 = i2 - 1;
                    iArr[i3] = iArr[i3] + 1;
                }
                return doubleValue;
            }
            throw new NumberFormatException("JSON forbids NaN and infinities: " + doubleValue);
        }
        throw new IllegalStateException("Expected " + bVar + " but was " + v0 + g0());
    }

    public int n0() {
        b v0 = v0();
        b bVar = b.NUMBER;
        if (v0 == bVar || v0 == b.STRING) {
            v vVar = (v) D0();
            int intValue = vVar.a instanceof Number ? vVar.v().intValue() : Integer.parseInt(vVar.p());
            E0();
            int i2 = this.y;
            if (i2 > 0) {
                int[] iArr = this.A;
                int i3 = i2 - 1;
                iArr[i3] = iArr[i3] + 1;
            }
            return intValue;
        }
        throw new IllegalStateException("Expected " + bVar + " but was " + v0 + g0());
    }

    public long o0() {
        b v0 = v0();
        b bVar = b.NUMBER;
        if (v0 == bVar || v0 == b.STRING) {
            long n2 = ((v) D0()).n();
            E0();
            int i2 = this.y;
            if (i2 > 0) {
                int[] iArr = this.A;
                int i3 = i2 - 1;
                iArr[i3] = iArr[i3] + 1;
            }
            return n2;
        }
        throw new IllegalStateException("Expected " + bVar + " but was " + v0 + g0());
    }

    public String p0() {
        C0(b.NAME);
        Map.Entry entry = (Map.Entry) ((Iterator) D0()).next();
        String str = (String) entry.getKey();
        this.z[this.y - 1] = str;
        F0(entry.getValue());
        return str;
    }

    public void r0() {
        C0(b.NULL);
        E0();
        int i2 = this.y;
        if (i2 > 0) {
            int[] iArr = this.A;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
        }
    }

    public String t0() {
        b v0 = v0();
        b bVar = b.STRING;
        if (v0 == bVar || v0 == b.NUMBER) {
            String p2 = ((v) E0()).p();
            int i2 = this.y;
            if (i2 > 0) {
                int[] iArr = this.A;
                int i3 = i2 - 1;
                iArr[i3] = iArr[i3] + 1;
            }
            return p2;
        }
        throw new IllegalStateException("Expected " + bVar + " but was " + v0 + g0());
    }

    public String toString() {
        return e.class.getSimpleName();
    }

    public b v0() {
        if (this.y == 0) {
            return b.END_DOCUMENT;
        }
        Object D0 = D0();
        if (D0 instanceof Iterator) {
            boolean z2 = this.x[this.y - 2] instanceof t;
            Iterator it = (Iterator) D0;
            if (!it.hasNext()) {
                return z2 ? b.END_OBJECT : b.END_ARRAY;
            }
            if (z2) {
                return b.NAME;
            }
            F0(it.next());
            return v0();
        } else if (D0 instanceof t) {
            return b.BEGIN_OBJECT;
        } else {
            if (D0 instanceof n) {
                return b.BEGIN_ARRAY;
            }
            if (D0 instanceof v) {
                Object obj = ((v) D0).a;
                if (obj instanceof String) {
                    return b.STRING;
                }
                if (obj instanceof Boolean) {
                    return b.BOOLEAN;
                }
                if (obj instanceof Number) {
                    return b.NUMBER;
                }
                throw new AssertionError();
            } else if (D0 instanceof b.l.e.s) {
                return b.NULL;
            } else {
                if (D0 == C) {
                    throw new IllegalStateException("JsonReader is closed");
                }
                throw new AssertionError();
            }
        }
    }
}
