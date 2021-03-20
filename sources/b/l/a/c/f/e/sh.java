package b.l.a.c.f.e;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import b.l.a.c.c.l.k.p;
import b.l.d.o.a;
import b.l.d.o.e0.y;

public final class sh extends hj<Void, y> {
    @NonNull

    /* renamed from: p  reason: collision with root package name */
    public final nd f3270p;

    /* renamed from: q  reason: collision with root package name */
    public final String f3271q;

    public sh(String str, a aVar, @Nullable String str2, String str3) {
        super(4);
        b.l.a.c.b.a.y(str, "email cannot be null or empty");
        this.f3270p = new nd(str, aVar, str2);
        this.f3271q = str3;
    }

    public final String a() {
        return this.f3271q;
    }

    public final p<fi, Void> b() {
        p.a a = p.a();
        a.a = new qh(this);
        return a.a();
    }

    public final void c() {
        h(null);
    }
}
