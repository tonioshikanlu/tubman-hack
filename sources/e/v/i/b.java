package e.v.i;

import b.q.a.a;
import e.v.d;
import e.v.j.a.g;
import e.x.b.p;
import e.x.c.y;
import java.util.Objects;

public final class b extends g {

    /* renamed from: i  reason: collision with root package name */
    public int f7952i;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ d f7953j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ p f7954k;

    /* renamed from: l  reason: collision with root package name */
    public final /* synthetic */ Object f7955l;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b(d dVar, d dVar2, p pVar, Object obj) {
        super(dVar2);
        this.f7953j = dVar;
        this.f7954k = pVar;
        this.f7955l = obj;
    }

    public Object d(Object obj) {
        int i2 = this.f7952i;
        if (i2 == 0) {
            this.f7952i = 1;
            a.c3(obj);
            p pVar = this.f7954k;
            Objects.requireNonNull(pVar, "null cannot be cast to non-null type (R, kotlin.coroutines.Continuation<T>) -> kotlin.Any?");
            y.b(pVar, 2);
            return pVar.invoke(this.f7955l, this);
        } else if (i2 == 1) {
            this.f7952i = 2;
            a.c3(obj);
            return obj;
        } else {
            throw new IllegalStateException("This coroutine had already completed".toString());
        }
    }
}
