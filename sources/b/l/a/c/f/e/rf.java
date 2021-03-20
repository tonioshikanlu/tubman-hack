package b.l.a.c.f.e;

import androidx.annotation.Nullable;
import b.l.a.c.b.a;
import java.util.List;

public final class rf implements ij<jk> {
    public final /* synthetic */ ij a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ sk f3256b;
    public final /* synthetic */ sf c;

    public rf(sf sfVar, ij ijVar, sk skVar) {
        this.c = sfVar;
        this.a = ijVar;
        this.f3256b = skVar;
    }

    public final void a(Object obj) {
        List<lk> list = ((jk) obj).f3093h.f3196h;
        if (list == null || list.isEmpty()) {
            this.a.d("No users.");
            return;
        }
        il ilVar = new il();
        String str = this.f3256b.f3275i;
        a.x(str);
        ilVar.f3072h = str;
        String str2 = this.c.a;
        a.x(str2);
        ilVar.f3079o.f3245i.add(str2);
        sf sfVar = this.c;
        og.d(sfVar.c, sfVar.f3269b, this.f3256b, list.get(0), ilVar, this.a);
    }

    public final void d(@Nullable String str) {
        this.c.f3269b.f(a.T0(str));
    }
}
