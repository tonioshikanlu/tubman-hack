package b.l.a.d.a.b;

import android.content.Context;
import b.l.a.d.a.e.c0;
import b.l.a.d.a.e.e0;
import b.l.a.d.a.e.f0;
import java.util.concurrent.Executor;

public final class i0 implements f0<h0> {
    public final f0 a;

    /* renamed from: b  reason: collision with root package name */
    public final f0 f4558b;
    public final f0 c;
    public final f0 d;

    /* renamed from: e  reason: collision with root package name */
    public final f0 f4559e;
    public final f0 f;

    /* renamed from: g  reason: collision with root package name */
    public final f0 f4560g;

    /* renamed from: h  reason: collision with root package name */
    public final f0 f4561h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ int f4562i = 0;

    public i0(f0<v0> f0Var, f0<n2> f0Var2, f0<f0> f0Var3, f0<x1> f0Var4, f0<i1> f0Var5, f0<n1> f0Var6, f0<r1> f0Var7, f0<y0> f0Var8) {
        this.a = f0Var;
        this.f4558b = f0Var2;
        this.c = f0Var3;
        this.d = f0Var4;
        this.f4559e = f0Var5;
        this.f = f0Var6;
        this.f4560g = f0Var7;
        this.f4561h = f0Var8;
    }

    public i0(f0<Context> f0Var, f0<v0> f0Var2, f0<h0> f0Var3, f0<n2> f0Var4, f0<k0> f0Var5, f0<b0> f0Var6, f0<Executor> f0Var7, f0<Executor> f0Var8, byte[] bArr) {
        this.a = f0Var;
        this.f4560g = f0Var2;
        this.f4561h = f0Var3;
        this.f4558b = f0Var4;
        this.f4559e = f0Var5;
        this.f = f0Var6;
        this.c = f0Var7;
        this.d = f0Var8;
    }

    public final /* bridge */ /* synthetic */ Object a() {
        if (this.f4562i != 0) {
            Context b2 = ((j2) this.a).a();
            Object a2 = this.f4560g.a();
            Object a3 = this.f4561h.a();
            c0 b3 = e0.b(this.f4558b);
            Object a4 = this.f4559e.a();
            Object a5 = this.f.a();
            return new q(b2, (v0) a2, (h0) a3, b3, (k0) a4, (b0) a5, e0.b(this.c), e0.b(this.d));
        }
        Object a6 = this.a.a();
        return new h0((v0) a6, e0.b(this.f4558b), (f0) this.c.a(), (x1) this.d.a(), (i1) this.f4559e.a(), (n1) this.f.a(), (r1) this.f4560g.a(), (y0) this.f4561h.a());
    }
}
