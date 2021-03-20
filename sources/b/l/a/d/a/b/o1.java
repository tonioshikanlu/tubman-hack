package b.l.a.d.a.b;

import android.content.Context;
import b.l.a.d.a.c.c;
import b.l.a.d.a.e.e0;
import b.l.a.d.a.e.f0;
import java.io.File;
import java.util.concurrent.Executor;

public final class o1 implements f0<n1> {
    public final f0 a;

    /* renamed from: b  reason: collision with root package name */
    public final f0 f4590b;
    public final f0 c;
    public final f0 d;

    /* renamed from: e  reason: collision with root package name */
    public final f0 f4591e;
    public final f0 f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ int f4592g = 0;

    public o1(f0<t> f0Var, f0<n2> f0Var2, f0<v0> f0Var3, f0<Executor> f0Var4, f0<k0> f0Var5, f0<c> f0Var6) {
        this.a = f0Var;
        this.f4590b = f0Var2;
        this.c = f0Var3;
        this.d = f0Var4;
        this.f4591e = f0Var5;
        this.f = f0Var6;
    }

    public o1(f0<String> f0Var, f0<q> f0Var2, f0<k0> f0Var3, f0<Context> f0Var4, f0<p1> f0Var5, f0<Executor> f0Var6, byte[] bArr) {
        this.f = f0Var;
        this.f4590b = f0Var2;
        this.f4591e = f0Var3;
        this.d = f0Var4;
        this.c = f0Var5;
        this.a = f0Var6;
    }

    public final /* bridge */ /* synthetic */ Object a() {
        if (this.f4592g != 0) {
            String str = (String) this.f.a();
            Object a2 = this.f4590b.a();
            Object a3 = this.f4591e.a();
            Context b2 = ((j2) this.d).a();
            Object a4 = this.c.a();
            return new d1(str != null ? new File(b2.getExternalFilesDir((String) null), str) : b2.getExternalFilesDir((String) null), (q) a2, (k0) a3, b2, (p1) a4, e0.b(this.a));
        }
        Object a5 = this.a.a();
        return new n1((t) a5, e0.b(this.f4590b), (v0) this.c.a(), e0.b(this.d), (k0) this.f4591e.a(), (c) this.f.a());
    }
}
