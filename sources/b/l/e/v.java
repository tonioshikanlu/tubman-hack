package b.l.e;

import b.l.e.e0.r;
import java.math.BigInteger;
import java.util.Objects;

public final class v extends q {
    public final Object a;

    public v(Boolean bool) {
        Objects.requireNonNull(bool);
        this.a = bool;
    }

    public static boolean y(v vVar) {
        Object obj = vVar.a;
        if (obj instanceof Number) {
            Number number = (Number) obj;
            if ((number instanceof BigInteger) || (number instanceof Long) || (number instanceof Integer) || (number instanceof Short) || (number instanceof Byte)) {
                return true;
            }
        }
        return false;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || v.class != obj.getClass()) {
            return false;
        }
        v vVar = (v) obj;
        if (this.a == null) {
            return vVar.a == null;
        }
        if (y(this) && y(vVar)) {
            return v().longValue() == vVar.v().longValue();
        }
        Object obj2 = this.a;
        if (!(obj2 instanceof Number) || !(vVar.a instanceof Number)) {
            return obj2.equals(vVar.a);
        }
        double doubleValue = v().doubleValue();
        double doubleValue2 = vVar.v().doubleValue();
        if (doubleValue != doubleValue2) {
            return Double.isNaN(doubleValue) && Double.isNaN(doubleValue2);
        }
        return true;
    }

    public int hashCode() {
        long doubleToLongBits;
        if (this.a == null) {
            return 31;
        }
        if (y(this)) {
            doubleToLongBits = v().longValue();
        } else {
            Object obj = this.a;
            if (!(obj instanceof Number)) {
                return obj.hashCode();
            }
            doubleToLongBits = Double.doubleToLongBits(v().doubleValue());
        }
        return (int) ((doubleToLongBits >>> 32) ^ doubleToLongBits);
    }

    public long n() {
        return this.a instanceof Number ? v().longValue() : Long.parseLong(p());
    }

    public String p() {
        Object obj = this.a;
        if (obj instanceof Number) {
            return v().toString();
        }
        return obj instanceof Boolean ? ((Boolean) obj).toString() : (String) obj;
    }

    public boolean s() {
        Object obj = this.a;
        return obj instanceof Boolean ? ((Boolean) obj).booleanValue() : Boolean.parseBoolean(p());
    }

    public Number v() {
        Object obj = this.a;
        return obj instanceof String ? new r((String) this.a) : (Number) obj;
    }

    public v(Number number) {
        Objects.requireNonNull(number);
        this.a = number;
    }

    public v(String str) {
        Objects.requireNonNull(str);
        this.a = str;
    }
}
