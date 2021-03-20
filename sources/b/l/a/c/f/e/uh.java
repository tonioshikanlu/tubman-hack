package b.l.a.c.f.e;

import androidx.annotation.Nullable;
import b.l.a.c.b.a;
import b.l.a.c.c.l.k.p;
import b.l.d.o.c;
import b.l.d.o.e0.e0;
import b.l.d.o.e0.j0;
import b.l.d.o.e0.y;
import com.google.android.gms.common.api.Status;

public final class uh extends hj<Object, y> {

    /* renamed from: p  reason: collision with root package name */
    public final vd f3331p;

    public uh(c cVar, @Nullable String str) {
        super(2);
        a.B(cVar, "credential cannot be null");
        this.f3331p = new vd(a.U0(cVar, str));
    }

    public final String a() {
        return "signInWithCredential";
    }

    public final p<fi, Object> b() {
        p.a a = p.a();
        a.a = new th(this);
        return a.a();
    }

    public final void c() {
        j0 d = ci.d(this.c, this.f3040i);
        ((y) this.f3037e).b(this.f3039h, d);
        e0 e0Var = new e0(d);
        this.f3045n = true;
        this.f3046o.a(e0Var, (Status) null);
    }
}
