package n.m0.j;

import n.m0.f.a;

public final class k extends a {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ f f10326e;
    public final /* synthetic */ int f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ b f10327g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public k(String str, boolean z, String str2, boolean z2, f fVar, int i2, b bVar) {
        super(str2, z2);
        this.f10326e = fVar;
        this.f = i2;
        this.f10327g = bVar;
    }

    public long a() {
        this.f10326e.s.c(this.f, this.f10327g);
        synchronized (this.f10326e) {
            this.f10326e.I.remove(Integer.valueOf(this.f));
        }
        return -1;
    }
}
