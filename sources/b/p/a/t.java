package b.p.a;

import b.e.a.a.a;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public final class t extends u {

    /* renamed from: n  reason: collision with root package name */
    public Object[] f6408n = new Object[32];

    /* renamed from: o  reason: collision with root package name */
    public String f6409o;

    public t() {
        e0(6);
    }

    public u H() {
        if (Y() != 3) {
            throw new IllegalStateException("Nesting problem.");
        } else if (this.f6409o == null) {
            int i2 = this.f6410h;
            int i3 = this.f6415m;
            if (i2 == (~i3)) {
                this.f6415m = ~i3;
                return this;
            }
            this.f6414l = false;
            int i4 = i2 - 1;
            this.f6410h = i4;
            this.f6408n[i4] = null;
            this.f6412j[i4] = null;
            int[] iArr = this.f6413k;
            int i5 = i4 - 1;
            iArr[i5] = iArr[i5] + 1;
            return this;
        } else {
            StringBuilder y = a.y("Dangling name: ");
            y.append(this.f6409o);
            throw new IllegalStateException(y.toString());
        }
    }

    public u O(String str) {
        Objects.requireNonNull(str, "name == null");
        if (this.f6410h == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        } else if (Y() == 3 && this.f6409o == null && !this.f6414l) {
            this.f6409o = str;
            this.f6412j[this.f6410h - 1] = str;
            return this;
        } else {
            throw new IllegalStateException("Nesting problem.");
        }
    }

    public u S() {
        if (!this.f6414l) {
            p0((Object) null);
            int[] iArr = this.f6413k;
            int i2 = this.f6410h - 1;
            iArr[i2] = iArr[i2] + 1;
            return this;
        }
        StringBuilder y = a.y("null cannot be used as a map key in JSON at path ");
        y.append(N());
        throw new IllegalStateException(y.toString());
    }

    public u b() {
        if (!this.f6414l) {
            int i2 = this.f6410h;
            int i3 = this.f6415m;
            if (i2 == i3 && this.f6411i[i2 - 1] == 1) {
                this.f6415m = ~i3;
                return this;
            }
            q();
            ArrayList arrayList = new ArrayList();
            p0(arrayList);
            Object[] objArr = this.f6408n;
            int i4 = this.f6410h;
            objArr[i4] = arrayList;
            this.f6413k[i4] = 0;
            e0(1);
            return this;
        }
        StringBuilder y = a.y("Array cannot be used as a map key in JSON at path ");
        y.append(N());
        throw new IllegalStateException(y.toString());
    }

    public void close() {
        int i2 = this.f6410h;
        if (i2 > 1 || (i2 == 1 && this.f6411i[i2 - 1] != 7)) {
            throw new IOException("Incomplete document");
        }
        this.f6410h = 0;
    }

    public u e() {
        if (!this.f6414l) {
            int i2 = this.f6410h;
            int i3 = this.f6415m;
            if (i2 == i3 && this.f6411i[i2 - 1] == 3) {
                this.f6415m = ~i3;
                return this;
            }
            q();
            v vVar = new v();
            p0(vVar);
            this.f6408n[this.f6410h] = vVar;
            e0(3);
            return this;
        }
        StringBuilder y = a.y("Object cannot be used as a map key in JSON at path ");
        y.append(N());
        throw new IllegalStateException(y.toString());
    }

    public void flush() {
        if (this.f6410h == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
    }

    public u g0(double d) {
        if (Double.isNaN(d) || d == Double.NEGATIVE_INFINITY || d == Double.POSITIVE_INFINITY) {
            throw new IllegalArgumentException("Numeric values must be finite, but was " + d);
        } else if (this.f6414l) {
            this.f6414l = false;
            O(Double.toString(d));
            return this;
        } else {
            p0(Double.valueOf(d));
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
        p0(Long.valueOf(j2));
        int[] iArr = this.f6413k;
        int i2 = this.f6410h - 1;
        iArr[i2] = iArr[i2] + 1;
        return this;
    }

    public u m0(Number number) {
        return ((number instanceof Byte) || (number instanceof Short) || (number instanceof Integer) || (number instanceof Long)) ? k0(number.longValue()) : g0(number.doubleValue());
    }

    public u n0(String str) {
        if (this.f6414l) {
            this.f6414l = false;
            O(str);
            return this;
        }
        p0(str);
        int[] iArr = this.f6413k;
        int i2 = this.f6410h - 1;
        iArr[i2] = iArr[i2] + 1;
        return this;
    }

    public u o0(boolean z) {
        if (!this.f6414l) {
            p0(Boolean.valueOf(z));
            int[] iArr = this.f6413k;
            int i2 = this.f6410h - 1;
            iArr[i2] = iArr[i2] + 1;
            return this;
        }
        StringBuilder y = a.y("Boolean cannot be used as a map key in JSON at path ");
        y.append(N());
        throw new IllegalStateException(y.toString());
    }

    public final t p0(Object obj) {
        String str;
        Object put;
        int Y = Y();
        int i2 = this.f6410h;
        if (i2 == 1) {
            if (Y == 6) {
                this.f6411i[i2 - 1] = 7;
                this.f6408n[i2 - 1] = obj;
            } else {
                throw new IllegalStateException("JSON must have only one top-level value.");
            }
        } else if (Y != 3 || (str = this.f6409o) == null) {
            if (Y == 1) {
                ((List) this.f6408n[i2 - 1]).add(obj);
            } else if (Y == 9) {
                throw new IllegalStateException("Sink from valueSink() was not closed");
            } else {
                throw new IllegalStateException("Nesting problem.");
            }
        } else if (obj == null || (put = ((Map) this.f6408n[i2 - 1]).put(str, obj)) == null) {
            this.f6409o = null;
        } else {
            StringBuilder y = a.y("Map key '");
            y.append(this.f6409o);
            y.append("' has multiple values at path ");
            y.append(N());
            y.append(": ");
            y.append(put);
            y.append(" and ");
            y.append(obj);
            throw new IllegalArgumentException(y.toString());
        }
        return this;
    }

    public u z() {
        if (Y() == 1) {
            int i2 = this.f6410h;
            int i3 = this.f6415m;
            if (i2 == (~i3)) {
                this.f6415m = ~i3;
                return this;
            }
            int i4 = i2 - 1;
            this.f6410h = i4;
            this.f6408n[i4] = null;
            int[] iArr = this.f6413k;
            int i5 = i4 - 1;
            iArr[i5] = iArr[i5] + 1;
            return this;
        }
        throw new IllegalStateException("Nesting problem.");
    }
}
