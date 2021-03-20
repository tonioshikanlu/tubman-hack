package b.l.a.a.f.q;

import android.content.Context;
import b.l.a.a.f.q.h.d;
import b.l.a.a.f.q.h.f;
import b.l.a.a.f.q.h.r;
import b.l.a.a.f.q.i.c;
import m.a.a;

public final class g implements Object<r> {
    public final a<Context> a;

    /* renamed from: b  reason: collision with root package name */
    public final a<c> f2513b;
    public final a<f> c;
    public final a<b.l.a.a.f.s.a> d;

    public g(a<Context> aVar, a<c> aVar2, a<f> aVar3, a<b.l.a.a.f.s.a> aVar4) {
        this.a = aVar;
        this.f2513b = aVar2;
        this.c = aVar3;
        this.d = aVar4;
    }

    public Object get() {
        b.l.a.a.f.s.a aVar = this.d.get();
        return new d(this.a.get(), this.f2513b.get(), this.c.get());
    }
}
