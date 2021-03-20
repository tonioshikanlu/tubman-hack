package e.a.a.a.y0.o;

import e.x.b.l;

public final class a extends b<N, Boolean> {
    public final /* synthetic */ l a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ boolean[] f9807b;

    public a(l lVar, boolean[] zArr) {
        this.a = lVar;
        this.f9807b = zArr;
    }

    public Object a() {
        return Boolean.valueOf(this.f9807b[0]);
    }

    public boolean c(N n2) {
        if (((Boolean) this.a.invoke(n2)).booleanValue()) {
            this.f9807b[0] = true;
        }
        return !this.f9807b[0];
    }
}
