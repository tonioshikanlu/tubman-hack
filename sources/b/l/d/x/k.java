package b.l.d.x;

import b.l.d.x.o.a;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

public final class k {

    /* renamed from: b  reason: collision with root package name */
    public static final long f5375b = TimeUnit.HOURS.toSeconds(1);
    public static final Pattern c = Pattern.compile("\\AA[\\w-]{38}\\z");
    public static k d;
    public final a a;

    public k(a aVar) {
        this.a = aVar;
    }

    public static k c() {
        if (a.a == null) {
            a.a = new a();
        }
        a aVar = a.a;
        if (d == null) {
            d = new k(aVar);
        }
        return d;
    }

    public long a() {
        Objects.requireNonNull(this.a);
        return System.currentTimeMillis();
    }

    public long b() {
        return TimeUnit.MILLISECONDS.toSeconds(a());
    }
}
