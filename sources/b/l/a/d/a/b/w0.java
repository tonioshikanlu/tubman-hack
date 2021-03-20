package b.l.a.d.a.b;

import b.l.a.d.a.e.e0;
import b.l.a.d.a.e.f0;
import java.util.concurrent.Executor;

public final class w0 implements f0<v0> {
    public final f0 a;

    /* renamed from: b  reason: collision with root package name */
    public final f0 f4641b;
    public final f0 c;
    public final f0 d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ int f4642e = 0;

    public w0(f0<t> f0Var, f0<n2> f0Var2, f0<k0> f0Var3, f0<Executor> f0Var4) {
        this.a = f0Var;
        this.f4641b = f0Var2;
        this.c = f0Var3;
        this.d = f0Var4;
    }

    public w0(f0<t> f0Var, f0<n2> f0Var2, f0<q> f0Var3, f0<k0> f0Var4, byte[] bArr) {
        this.a = f0Var;
        this.f4641b = f0Var2;
        this.c = f0Var3;
        this.d = f0Var4;
    }

    public final /* bridge */ /* synthetic */ Object a() {
        if (this.f4642e != 0) {
            return new f0((t) this.a.a(), e0.b(this.f4641b), e0.b(this.c), (k0) this.d.a());
        }
        Object a2 = this.a.a();
        return new v0((t) a2, e0.b(this.f4641b), (k0) this.c.a(), e0.b(this.d));
    }
}
