package b.l.a.c.f.e;

import androidx.annotation.Nullable;
import java.util.List;

public final class bf implements ij<jk> {
    public final /* synthetic */ ij a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ei f2862b;
    public final /* synthetic */ sk c;
    public final /* synthetic */ il d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ og f2863e;

    public bf(og ogVar, ij ijVar, ei eiVar, sk skVar, il ilVar) {
        this.f2863e = ogVar;
        this.a = ijVar;
        this.f2862b = eiVar;
        this.c = skVar;
        this.d = ilVar;
    }

    public final void a(Object obj) {
        List<lk> list = ((jk) obj).f3093h.f3196h;
        if (list == null || list.isEmpty()) {
            this.a.d("No users");
        } else {
            og.d(this.f2863e, this.f2862b, this.c, list.get(0), this.d, this.a);
        }
    }

    public final void d(@Nullable String str) {
        this.a.d(str);
    }
}
