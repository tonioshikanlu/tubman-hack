package b.l.a.c.c.l.k;

import androidx.annotation.Nullable;
import androidx.collection.ArrayMap;
import b.l.a.c.c.b;
import b.l.a.c.c.l.c;
import b.l.a.c.k.i;
import java.util.Map;

public final class u1 {
    public final ArrayMap<b<?>, b> a;

    /* renamed from: b  reason: collision with root package name */
    public final ArrayMap<b<?>, String> f2711b;
    public final i<Map<b<?>, String>> c;
    public int d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f2712e;

    public final void a(b<?> bVar, b bVar2, @Nullable String str) {
        this.a.put(bVar, bVar2);
        this.f2711b.put(bVar, str);
        this.d--;
        if (!bVar2.W()) {
            this.f2712e = true;
        }
        if (this.d != 0) {
            return;
        }
        if (this.f2712e) {
            this.c.a.p(new c(this.a));
            return;
        }
        this.c.a.q(this.f2711b);
    }
}
