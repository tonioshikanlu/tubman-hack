package l.b.c;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.TreeMap;

public final class r {
    public static final List<r> c;
    public static final r d = a.OK.d();

    /* renamed from: e  reason: collision with root package name */
    public static final r f8131e = a.UNKNOWN.d();
    public static final r f = a.INVALID_ARGUMENT.d();

    /* renamed from: g  reason: collision with root package name */
    public static final r f8132g = a.NOT_FOUND.d();

    /* renamed from: h  reason: collision with root package name */
    public static final r f8133h = a.PERMISSION_DENIED.d();

    /* renamed from: i  reason: collision with root package name */
    public static final r f8134i = a.UNAUTHENTICATED.d();

    /* renamed from: j  reason: collision with root package name */
    public static final r f8135j = a.FAILED_PRECONDITION.d();

    /* renamed from: k  reason: collision with root package name */
    public static final r f8136k = a.UNAVAILABLE.d();
    public final a a;

    /* renamed from: b  reason: collision with root package name */
    public final String f8137b = null;

    public enum a {
        OK(0),
        CANCELLED(1),
        UNKNOWN(2),
        INVALID_ARGUMENT(3),
        DEADLINE_EXCEEDED(4),
        NOT_FOUND(5),
        ALREADY_EXISTS(6),
        PERMISSION_DENIED(7),
        RESOURCE_EXHAUSTED(8),
        FAILED_PRECONDITION(9),
        ABORTED(10),
        OUT_OF_RANGE(11),
        UNIMPLEMENTED(12),
        INTERNAL(13),
        UNAVAILABLE(14),
        DATA_LOSS(15),
        UNAUTHENTICATED(16);
        

        /* renamed from: h  reason: collision with root package name */
        public final int f8147h;

        /* access modifiers changed from: public */
        a(int i2) {
            this.f8147h = i2;
        }

        public r d() {
            return r.c.get(this.f8147h);
        }
    }

    static {
        TreeMap treeMap = new TreeMap();
        a[] values = a.values();
        int i2 = 0;
        while (i2 < 17) {
            a aVar = values[i2];
            r rVar = (r) treeMap.put(Integer.valueOf(aVar.f8147h), new r(aVar, (String) null));
            if (rVar == null) {
                i2++;
            } else {
                StringBuilder y = b.e.a.a.a.y("Code value duplication between ");
                y.append(rVar.a.name());
                y.append(" & ");
                y.append(aVar.name());
                throw new IllegalStateException(y.toString());
            }
        }
        c = Collections.unmodifiableList(new ArrayList(treeMap.values()));
        a.CANCELLED.d();
        a.DEADLINE_EXCEEDED.d();
        a.ALREADY_EXISTS.d();
        a.RESOURCE_EXHAUSTED.d();
        a.ABORTED.d();
        a.OUT_OF_RANGE.d();
        a.UNIMPLEMENTED.d();
        a.INTERNAL.d();
        a.DATA_LOSS.d();
    }

    public r(a aVar, String str) {
        b.q.a.a.x(aVar, "canonicalCode");
        this.a = aVar;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        if (this.a == rVar.a) {
            String str = this.f8137b;
            String str2 = rVar.f8137b;
            if (str == null ? str2 == null : str.equals(str2)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.f8137b});
    }

    public String toString() {
        StringBuilder y = b.e.a.a.a.y("Status{canonicalCode=");
        y.append(this.a);
        y.append(", description=");
        return b.e.a.a.a.q(y, this.f8137b, "}");
    }
}
