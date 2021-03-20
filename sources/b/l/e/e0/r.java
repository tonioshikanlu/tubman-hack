package b.l.e.e0;

import java.math.BigDecimal;

public final class r extends Number {

    /* renamed from: h  reason: collision with root package name */
    public final String f5436h;

    public r(String str) {
        this.f5436h = str;
    }

    public double doubleValue() {
        return Double.parseDouble(this.f5436h);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        String str = this.f5436h;
        String str2 = ((r) obj).f5436h;
        return str == str2 || str.equals(str2);
    }

    public float floatValue() {
        return Float.parseFloat(this.f5436h);
    }

    public int hashCode() {
        return this.f5436h.hashCode();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000e, code lost:
        return (int) java.lang.Long.parseLong(r2.f5436h);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001a, code lost:
        return new java.math.BigDecimal(r2.f5436h).intValue();
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0007 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int intValue() {
        /*
            r2 = this;
            java.lang.String r0 = r2.f5436h     // Catch:{ NumberFormatException -> 0x0007 }
            int r0 = java.lang.Integer.parseInt(r0)     // Catch:{ NumberFormatException -> 0x0007 }
            return r0
        L_0x0007:
            java.lang.String r0 = r2.f5436h     // Catch:{ NumberFormatException -> 0x000f }
            long r0 = java.lang.Long.parseLong(r0)     // Catch:{ NumberFormatException -> 0x000f }
            int r0 = (int) r0
            return r0
        L_0x000f:
            java.math.BigDecimal r0 = new java.math.BigDecimal
            java.lang.String r1 = r2.f5436h
            r0.<init>(r1)
            int r0 = r0.intValue()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: b.l.e.e0.r.intValue():int");
    }

    public long longValue() {
        try {
            return Long.parseLong(this.f5436h);
        } catch (NumberFormatException unused) {
            return new BigDecimal(this.f5436h).longValue();
        }
    }

    public String toString() {
        return this.f5436h;
    }
}
