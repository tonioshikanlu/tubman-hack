package e.v.i;

import b.q.a.a;
import e.v.d;
import e.v.f;
import e.x.b.p;
import e.x.c.y;
import java.util.Objects;

public final class c extends e.v.j.a.c {

    /* renamed from: k  reason: collision with root package name */
    public int f7956k;

    /* renamed from: l  reason: collision with root package name */
    public final /* synthetic */ d f7957l;

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ f f7958m;

    /* renamed from: n  reason: collision with root package name */
    public final /* synthetic */ p f7959n;

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ Object f7960o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c(d dVar, f fVar, d dVar2, f fVar2, p pVar, Object obj) {
        super(dVar2, fVar2);
        this.f7957l = dVar;
        this.f7958m = fVar;
        this.f7959n = pVar;
        this.f7960o = obj;
    }

    public Object d(Object obj) {
        int i2 = this.f7956k;
        if (i2 == 0) {
            this.f7956k = 1;
            a.c3(obj);
            p pVar = this.f7959n;
            Objects.requireNonNull(pVar, "null cannot be cast to non-null type (R, kotlin.coroutines.Continuation<T>) -> kotlin.Any?");
            y.b(pVar, 2);
            return pVar.invoke(this.f7960o, this);
        } else if (i2 == 1) {
            this.f7956k = 2;
            a.c3(obj);
            return obj;
        } else {
            throw new IllegalStateException("This coroutine had already completed".toString());
        }
    }
}
