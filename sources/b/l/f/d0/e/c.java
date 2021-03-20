package b.l.f.d0.e;

import b.l.f.m;
import b.l.f.s;
import b.l.f.y.b;

public final class c {
    public final b a;

    /* renamed from: b  reason: collision with root package name */
    public final s f5660b;
    public final s c;
    public final s d;

    /* renamed from: e  reason: collision with root package name */
    public final s f5661e;
    public final int f;

    /* renamed from: g  reason: collision with root package name */
    public final int f5662g;

    /* renamed from: h  reason: collision with root package name */
    public final int f5663h;

    /* renamed from: i  reason: collision with root package name */
    public final int f5664i;

    public c(b bVar, s sVar, s sVar2, s sVar3, s sVar4) {
        boolean z = false;
        boolean z2 = sVar == null || sVar2 == null;
        z = (sVar3 == null || sVar4 == null) ? true : z;
        if (!z2 || !z) {
            if (z2) {
                sVar = new s(0.0f, sVar3.f5775b);
                sVar2 = new s(0.0f, sVar4.f5775b);
            } else if (z) {
                int i2 = bVar.f5811h;
                sVar3 = new s((float) (i2 - 1), sVar.f5775b);
                sVar4 = new s((float) (i2 - 1), sVar2.f5775b);
            }
            this.a = bVar;
            this.f5660b = sVar;
            this.c = sVar2;
            this.d = sVar3;
            this.f5661e = sVar4;
            this.f = (int) Math.min(sVar.a, sVar2.a);
            this.f5662g = (int) Math.max(sVar3.a, sVar4.a);
            this.f5663h = (int) Math.min(sVar.f5775b, sVar3.f5775b);
            this.f5664i = (int) Math.max(sVar2.f5775b, sVar4.f5775b);
            return;
        }
        throw m.f5759j;
    }

    public c(c cVar) {
        this.a = cVar.a;
        this.f5660b = cVar.f5660b;
        this.c = cVar.c;
        this.d = cVar.d;
        this.f5661e = cVar.f5661e;
        this.f = cVar.f;
        this.f5662g = cVar.f5662g;
        this.f5663h = cVar.f5663h;
        this.f5664i = cVar.f5664i;
    }
}
