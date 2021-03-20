package b.l.a.c.f.e;

import androidx.annotation.Nullable;
import b.l.a.c.b.a;
import b.l.a.c.c.l.k.p;
import b.l.d.o.c;
import b.l.d.o.e0.e0;
import b.l.d.o.e0.j0;
import b.l.d.o.e0.y;
import com.google.android.gms.common.api.Status;

public final class jh extends hj<Object, y> {

    /* renamed from: p  reason: collision with root package name */
    public final vd f3090p;

    public jh(c cVar, @Nullable String str) {
        super(2);
        a.B(cVar, "credential cannot be null");
        sl U0 = a.U0(cVar, str);
        U0.f3288q = false;
        this.f3090p = new vd(U0);
    }

    public final String a() {
        return "reauthenticateWithCredentialWithData";
    }

    public final p<fi, Object> b() {
        p.a a = p.a();
        a.a = new ih(this);
        return a.a();
    }

    public final void c() {
        j0 d = ci.d(this.c, this.f3040i);
        if (this.d.Z().equalsIgnoreCase(d.f4979i.f4968h)) {
            ((y) this.f3037e).b(this.f3039h, d);
            e0 e0Var = new e0(d);
            this.f3045n = true;
            this.f3046o.a(e0Var, (Status) null);
            return;
        }
        Status status = new Status(17024);
        this.f3045n = true;
        this.f3046o.a(null, status);
    }
}
