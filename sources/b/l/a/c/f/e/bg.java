package b.l.a.c.f.e;

import androidx.annotation.Nullable;
import java.util.List;

public final class bg implements ij<jk> {
    public final /* synthetic */ ij a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ sk f2864b;
    public final /* synthetic */ cg c;

    public bg(cg cgVar, ij ijVar, sk skVar) {
        this.c = cgVar;
        this.a = ijVar;
        this.f2864b = skVar;
    }

    public final void a(Object obj) {
        List<lk> list = ((jk) obj).f3093h.f3196h;
        if (list == null || list.isEmpty()) {
            this.a.d("No users");
        } else {
            this.c.a.a(this.f2864b, list.get(0));
        }
    }

    public final void d(@Nullable String str) {
        this.a.d(str);
    }
}
