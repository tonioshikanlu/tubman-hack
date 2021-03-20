package b.j.a.b.q;

import androidx.appcompat.widget.ActivityChooserView;
import androidx.recyclerview.widget.RecyclerView;
import b.e.a.a.a;
import b.j.a.b.h;
import b.j.a.b.i;
import b.j.a.b.l;
import java.math.BigDecimal;
import java.math.BigInteger;

public abstract class c extends i {

    /* renamed from: j  reason: collision with root package name */
    public static final byte[] f1451j = new byte[0];

    /* renamed from: k  reason: collision with root package name */
    public static final BigInteger f1452k;

    /* renamed from: l  reason: collision with root package name */
    public static final BigInteger f1453l;

    /* renamed from: m  reason: collision with root package name */
    public static final BigInteger f1454m;

    /* renamed from: n  reason: collision with root package name */
    public static final BigInteger f1455n;

    /* renamed from: o  reason: collision with root package name */
    public static final BigDecimal f1456o;

    /* renamed from: p  reason: collision with root package name */
    public static final BigDecimal f1457p;

    /* renamed from: q  reason: collision with root package name */
    public static final BigDecimal f1458q;
    public static final BigDecimal r;

    /* renamed from: i  reason: collision with root package name */
    public l f1459i;

    static {
        BigInteger valueOf = BigInteger.valueOf(-2147483648L);
        f1452k = valueOf;
        BigInteger valueOf2 = BigInteger.valueOf(2147483647L);
        f1453l = valueOf2;
        BigInteger valueOf3 = BigInteger.valueOf(Long.MIN_VALUE);
        f1454m = valueOf3;
        BigInteger valueOf4 = BigInteger.valueOf(RecyclerView.FOREVER_NS);
        f1455n = valueOf4;
        f1456o = new BigDecimal(valueOf3);
        f1457p = new BigDecimal(valueOf4);
        f1458q = new BigDecimal(valueOf);
        r = new BigDecimal(valueOf2);
    }

    public c(int i2) {
        super(i2);
    }

    public static final String c1(int i2) {
        char c = (char) i2;
        if (Character.isISOControl(c)) {
            return a.h("(CTRL-CHAR, code ", i2, ")");
        }
        if (i2 > 255) {
            return "'" + c + "' (code " + i2 + " / 0x" + Integer.toHexString(i2) + ")";
        }
        return "'" + c + "' (code " + i2 + ")";
    }

    public int D0() {
        l lVar = this.f1459i;
        return (lVar == l.VALUE_NUMBER_INT || lVar == l.VALUE_NUMBER_FLOAT) ? q0() : E0(0);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x003c, code lost:
        r0 = r0.trim();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int E0(int r7) {
        /*
            r6 = this;
            b.j.a.b.l r0 = r6.f1459i
            b.j.a.b.l r1 = b.j.a.b.l.VALUE_NUMBER_INT
            if (r0 == r1) goto L_0x007c
            b.j.a.b.l r1 = b.j.a.b.l.VALUE_NUMBER_FLOAT
            if (r0 != r1) goto L_0x000c
            goto L_0x007c
        L_0x000c:
            if (r0 == 0) goto L_0x007b
            int r0 = r0.f1441k
            r1 = 6
            r2 = 0
            r3 = 1
            if (r0 == r1) goto L_0x002a
            switch(r0) {
                case 9: goto L_0x0029;
                case 10: goto L_0x0028;
                case 11: goto L_0x0028;
                case 12: goto L_0x0019;
                default: goto L_0x0018;
            }
        L_0x0018:
            goto L_0x007b
        L_0x0019:
            java.lang.Object r0 = r6.o0()
            boolean r1 = r0 instanceof java.lang.Number
            if (r1 == 0) goto L_0x007b
            java.lang.Number r0 = (java.lang.Number) r0
            int r7 = r0.intValue()
            return r7
        L_0x0028:
            return r2
        L_0x0029:
            return r3
        L_0x002a:
            java.lang.String r0 = r6.x0()
            java.lang.String r1 = "null"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x0037
            return r2
        L_0x0037:
            java.lang.String r1 = b.j.a.b.s.f.a
            if (r0 != 0) goto L_0x003c
            goto L_0x007b
        L_0x003c:
            java.lang.String r0 = r0.trim()
            int r1 = r0.length()
            if (r1 != 0) goto L_0x0047
            goto L_0x007b
        L_0x0047:
            if (r1 <= 0) goto L_0x005f
            char r4 = r0.charAt(r2)
            r5 = 43
            if (r4 != r5) goto L_0x005a
            java.lang.String r0 = r0.substring(r3)
            int r1 = r0.length()
            goto L_0x005f
        L_0x005a:
            r5 = 45
            if (r4 != r5) goto L_0x005f
            r2 = r3
        L_0x005f:
            if (r2 >= r1) goto L_0x0077
            char r3 = r0.charAt(r2)
            r4 = 57
            if (r3 > r4) goto L_0x0071
            r4 = 48
            if (r3 >= r4) goto L_0x006e
            goto L_0x0071
        L_0x006e:
            int r2 = r2 + 1
            goto L_0x005f
        L_0x0071:
            double r0 = b.j.a.b.s.f.c(r0)     // Catch:{ NumberFormatException -> 0x007b }
            int r7 = (int) r0     // Catch:{ NumberFormatException -> 0x007b }
            goto L_0x007b
        L_0x0077:
            int r7 = java.lang.Integer.parseInt(r0)     // Catch:{ NumberFormatException -> 0x007b }
        L_0x007b:
            return r7
        L_0x007c:
            int r7 = r6.q0()
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: b.j.a.b.q.c.E0(int):int");
    }

    public long F0() {
        l lVar = this.f1459i;
        return (lVar == l.VALUE_NUMBER_INT || lVar == l.VALUE_NUMBER_FLOAT) ? r0() : G0(0);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x003f, code lost:
        r0 = r0.trim();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long G0(long r7) {
        /*
            r6 = this;
            b.j.a.b.l r0 = r6.f1459i
            b.j.a.b.l r1 = b.j.a.b.l.VALUE_NUMBER_INT
            if (r0 == r1) goto L_0x0081
            b.j.a.b.l r1 = b.j.a.b.l.VALUE_NUMBER_FLOAT
            if (r0 != r1) goto L_0x000c
            goto L_0x0081
        L_0x000c:
            if (r0 == 0) goto L_0x0080
            int r0 = r0.f1441k
            r1 = 6
            r2 = 0
            if (r0 == r1) goto L_0x002d
            switch(r0) {
                case 9: goto L_0x002a;
                case 10: goto L_0x0029;
                case 11: goto L_0x0029;
                case 12: goto L_0x001a;
                default: goto L_0x0018;
            }
        L_0x0018:
            goto L_0x0080
        L_0x001a:
            java.lang.Object r0 = r6.o0()
            boolean r1 = r0 instanceof java.lang.Number
            if (r1 == 0) goto L_0x0080
            java.lang.Number r0 = (java.lang.Number) r0
            long r7 = r0.longValue()
            return r7
        L_0x0029:
            return r2
        L_0x002a:
            r7 = 1
            return r7
        L_0x002d:
            java.lang.String r0 = r6.x0()
            java.lang.String r1 = "null"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x003a
            return r2
        L_0x003a:
            java.lang.String r1 = b.j.a.b.s.f.a
            if (r0 != 0) goto L_0x003f
            goto L_0x0080
        L_0x003f:
            java.lang.String r0 = r0.trim()
            int r1 = r0.length()
            if (r1 != 0) goto L_0x004a
            goto L_0x0080
        L_0x004a:
            r2 = 0
            r3 = 1
            if (r1 <= 0) goto L_0x0064
            char r4 = r0.charAt(r2)
            r5 = 43
            if (r4 != r5) goto L_0x005f
            java.lang.String r0 = r0.substring(r3)
            int r1 = r0.length()
            goto L_0x0064
        L_0x005f:
            r5 = 45
            if (r4 != r5) goto L_0x0064
            r2 = r3
        L_0x0064:
            if (r2 >= r1) goto L_0x007c
            char r3 = r0.charAt(r2)
            r4 = 57
            if (r3 > r4) goto L_0x0076
            r4 = 48
            if (r3 >= r4) goto L_0x0073
            goto L_0x0076
        L_0x0073:
            int r2 = r2 + 1
            goto L_0x0064
        L_0x0076:
            double r7 = b.j.a.b.s.f.c(r0)     // Catch:{ NumberFormatException -> 0x0080 }
            long r7 = (long) r7     // Catch:{ NumberFormatException -> 0x0080 }
            goto L_0x0080
        L_0x007c:
            long r7 = java.lang.Long.parseLong(r0)     // Catch:{ NumberFormatException -> 0x0080 }
        L_0x0080:
            return r7
        L_0x0081:
            long r7 = r6.r0()
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: b.j.a.b.q.c.G0(long):long");
    }

    public String H0() {
        l lVar = this.f1459i;
        return lVar == l.VALUE_STRING ? x0() : lVar == l.FIELD_NAME ? e0() : I0((String) null);
    }

    public String I0(String str) {
        l lVar = this.f1459i;
        if (lVar == l.VALUE_STRING) {
            return x0();
        }
        if (lVar == l.FIELD_NAME) {
            return e0();
        }
        return (lVar == null || lVar == l.VALUE_NULL || !lVar.f1445o) ? str : x0();
    }

    public boolean J0() {
        return this.f1459i != null;
    }

    public boolean L0(l lVar) {
        return this.f1459i == lVar;
    }

    public boolean M0(int i2) {
        l lVar = this.f1459i;
        return lVar == null ? i2 == 0 : lVar.f1441k == i2;
    }

    public boolean O0() {
        return this.f1459i == l.START_ARRAY;
    }

    public boolean P0() {
        return this.f1459i == l.START_OBJECT;
    }

    public l U0() {
        l T0 = T0();
        return T0 == l.FIELD_NAME ? T0() : T0;
    }

    public i a1() {
        l lVar = this.f1459i;
        if (lVar != l.START_OBJECT && lVar != l.START_ARRAY) {
            return this;
        }
        int i2 = 1;
        while (true) {
            l T0 = T0();
            if (T0 == null) {
                d1();
                return this;
            } else if (T0.f1442l) {
                i2++;
            } else if (T0.f1443m) {
                i2--;
                if (i2 == 0) {
                    return this;
                }
            } else if (T0 == l.NOT_AVAILABLE) {
                g1("Not enough content available for `skipChildren()`: non-blocking parser? (%s)", getClass().getName());
                throw null;
            }
        }
    }

    public void b1(String str, b.j.a.b.w.c cVar, b.j.a.b.a aVar) {
        try {
            aVar.c(str, cVar);
        } catch (IllegalArgumentException e2) {
            throw new h(this, e2.getMessage());
        }
    }

    public abstract void d1();

    public String e1(String str) {
        int length = str.length();
        if (length < 1000) {
            return str;
        }
        if (str.startsWith("-")) {
            length--;
        }
        return String.format("[Integer with %d digits]", new Object[]{Integer.valueOf(length)});
    }

    public String f1(String str) {
        int length = str.length();
        if (length < 1000) {
            return str;
        }
        if (str.startsWith("-")) {
            length--;
        }
        return String.format("[number with %d characters]", new Object[]{Integer.valueOf(length)});
    }

    public l g0() {
        return this.f1459i;
    }

    public final void g1(String str, Object obj) {
        throw new h(this, String.format(str, new Object[]{obj}));
    }

    public final void h1(String str, Object obj, Object obj2) {
        throw new h(this, String.format(str, new Object[]{obj, obj2}));
    }

    public void i1() {
        StringBuilder y = a.y(" in ");
        y.append(this.f1459i);
        j1(y.toString(), this.f1459i);
        throw null;
    }

    public void j1(String str, l lVar) {
        throw new b.j.a.b.s.c(this, lVar, a.m("Unexpected end-of-input", str));
    }

    public int k0() {
        l lVar = this.f1459i;
        if (lVar == null) {
            return 0;
        }
        return lVar.f1441k;
    }

    public void k1(l lVar) {
        j1(lVar != l.VALUE_STRING ? (lVar == l.VALUE_NUMBER_INT || lVar == l.VALUE_NUMBER_FLOAT) ? " in a Number value" : " in a value" : " in a String value", lVar);
        throw null;
    }

    public void l1(int i2, String str) {
        if (i2 >= 0) {
            String format = String.format("Unexpected character (%s)", new Object[]{c1(i2)});
            if (str != null) {
                format = a.n(format, ": ", str);
            }
            throw new h(this, format);
        }
        i1();
        throw null;
    }

    public void m1(int i2) {
        StringBuilder y = a.y("Illegal character (");
        y.append(c1((char) i2));
        y.append("): only regular white space (\\r, \\n, \\t) is allowed between tokens");
        throw new h(this, y.toString());
    }

    public void n1() {
        o1(x0(), l.VALUE_NUMBER_INT);
        throw null;
    }

    public void o1(String str, l lVar) {
        throw new b.j.a.b.r.a(this, String.format("Numeric value (%s) out of range of int (%d - %s)", new Object[]{e1(str), Integer.MIN_VALUE, Integer.valueOf(ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED)}), lVar, Integer.TYPE);
    }

    public void p1() {
        q1(x0());
        throw null;
    }

    public void q() {
        if (this.f1459i != null) {
            this.f1459i = null;
        }
    }

    public void q1(String str) {
        throw new b.j.a.b.r.a(this, String.format("Numeric value (%s) out of range of long (%d - %s)", new Object[]{e1(str), Long.MIN_VALUE, Long.valueOf(RecyclerView.FOREVER_NS)}), l.VALUE_NUMBER_INT, Long.TYPE);
    }

    public void r1(int i2, String str) {
        throw new h(this, a.n(String.format("Unexpected character (%s) in numeric value", new Object[]{c1(i2)}), ": ", str));
    }

    public l z() {
        return this.f1459i;
    }
}
