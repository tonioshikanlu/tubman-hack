package b.l.a.c.f.e;

import android.text.TextUtils;
import b.l.a.c.b.a;
import b.l.a.c.c.l.k.p;
import b.l.d.o.e0.n;
import b.l.d.o.e0.y;
import b.l.d.o.q;
import com.google.android.gms.common.api.Status;
import java.util.Objects;

public final class zg extends hj<q, y> {

    /* renamed from: p  reason: collision with root package name */
    public final zc f3443p;

    public zg(String str) {
        super(1);
        a.y(str, "refresh token cannot be null");
        this.f3443p = new zc(str);
    }

    public final String a() {
        return "getAccessToken";
    }

    public final p<fi, q> b() {
        p.a a = p.a();
        a.a = new yg(this);
        return a.a();
    }

    public final void c() {
        if (TextUtils.isEmpty(this.f3039h.f3274h)) {
            sk skVar = this.f3039h;
            String str = this.f3443p.f3437h;
            Objects.requireNonNull(skVar);
            a.x(str);
            skVar.f3274h = str;
        }
        ((y) this.f3037e).b(this.f3039h, this.d);
        q a = n.a(this.f3039h.f3275i);
        this.f3045n = true;
        this.f3046o.a(a, (Status) null);
    }
}
