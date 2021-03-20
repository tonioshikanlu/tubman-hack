package b.l.a.c.f.e;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import b.l.a.c.b.a;
import b.l.a.c.c.l.k.p;
import b.l.d.o.e0.e0;
import b.l.d.o.e0.j0;
import b.l.d.o.e0.y;
import com.google.android.gms.common.api.Status;

public final class xg extends hj<Object, y> {
    @NonNull

    /* renamed from: p  reason: collision with root package name */
    public final rc f3402p;

    public xg(String str, String str2, @Nullable String str3) {
        super(2);
        a.y(str, "email cannot be null or empty");
        a.y(str2, "password cannot be null or empty");
        this.f3402p = new rc(str, str2, str3);
    }

    public final String a() {
        return "createUserWithEmailAndPassword";
    }

    public final p<fi, Object> b() {
        p.a a = p.a();
        a.a = new wg(this);
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
