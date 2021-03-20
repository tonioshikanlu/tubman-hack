package b.l.a.a.f.q.i;

import b.e.a.a.a;
import b.l.a.a.f.q.i.a;
import com.google.auto.value.AutoValue;

@AutoValue
public abstract class d {
    public static final d a;

    static {
        Long l2 = 10485760L;
        Integer num = 200;
        Integer num2 = 10000;
        Long l3 = 604800000L;
        Integer num3 = 81920;
        String str = l2 == null ? " maxStorageSizeInBytes" : "";
        if (num == null) {
            str = a.m(str, " loadBatchSize");
        }
        if (num2 == null) {
            str = a.m(str, " criticalSectionEnterTimeoutMs");
        }
        if (l3 == null) {
            str = a.m(str, " eventCleanUpAge");
        }
        if (num3 == null) {
            str = a.m(str, " maxBlobByteSizePerRow");
        }
        if (str.isEmpty()) {
            a = new a(l2.longValue(), num.intValue(), num2.intValue(), l3.longValue(), num3.intValue(), (a.C0057a) null);
            return;
        }
        throw new IllegalStateException(b.e.a.a.a.m("Missing required properties:", str));
    }

    public abstract int a();

    public abstract long b();

    public abstract int c();

    public abstract int d();

    public abstract long e();
}
