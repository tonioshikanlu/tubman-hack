package b.h.a.s;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class g<T, Y> {
    public final Map<T, Y> a = new LinkedHashMap(100, 0.75f, true);

    /* renamed from: b  reason: collision with root package name */
    public long f1015b;
    public long c;

    public g(long j2) {
        this.f1015b = j2;
    }

    @Nullable
    public synchronized Y a(@NonNull T t) {
        return this.a.get(t);
    }

    public int b(@Nullable Y y) {
        return 1;
    }

    public void c(@NonNull T t, @Nullable Y y) {
    }

    @Nullable
    public synchronized Y d(@NonNull T t, @Nullable Y y) {
        long b2 = (long) b(y);
        if (b2 >= this.f1015b) {
            c(t, y);
            return null;
        }
        if (y != null) {
            this.c += b2;
        }
        Y put = this.a.put(t, y);
        if (put != null) {
            this.c -= (long) b(put);
            if (!put.equals(y)) {
                c(t, put);
            }
        }
        e(this.f1015b);
        return put;
    }

    public synchronized void e(long j2) {
        while (this.c > j2) {
            Iterator<Map.Entry<T, Y>> it = this.a.entrySet().iterator();
            Map.Entry next = it.next();
            Object value = next.getValue();
            this.c -= (long) b(value);
            Object key = next.getKey();
            it.remove();
            c(key, value);
        }
    }
}
