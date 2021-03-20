package b.l.a.c.f.e;

import androidx.annotation.Nullable;
import b.l.a.c.c.l.k.p;
import b.l.d.o.e0.e0;
import b.l.d.o.e0.j0;
import b.l.d.o.e0.y;
import b.l.d.o.x;
import com.google.android.gms.common.api.Status;
import java.util.Objects;

public final class ai extends hj<Object, y> {

    /* renamed from: p  reason: collision with root package name */
    public final de f2844p;

    public ai(x xVar, @Nullable String str) {
        super(2);
        Objects.requireNonNull(xVar, "null reference");
        this.f2844p = new de(xVar, str);
    }

    public final String a() {
        return "signInWithPhoneNumber";
    }

    public final p<fi, Object> b() {
        p.a a = p.a();
        a.a = new zh(this);
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
