package b.l.a.c.i.b;

import b.l.a.c.f.i.o1;
import b.l.a.c.f.i.w1;
import java.util.ArrayList;
import java.util.List;

public final class c9 {
    public w1 a;

    /* renamed from: b  reason: collision with root package name */
    public List<Long> f3956b;
    public List<o1> c;
    public long d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ d9 f3957e;

    public /* synthetic */ c9(d9 d9Var) {
        this.f3957e = d9Var;
    }

    public final boolean a(long j2, o1 o1Var) {
        if (this.c == null) {
            this.c = new ArrayList();
        }
        if (this.f3956b == null) {
            this.f3956b = new ArrayList();
        }
        if (this.c.size() > 0 && ((this.c.get(0).x() / 1000) / 60) / 60 != ((o1Var.x() / 1000) / 60) / 60) {
            return false;
        }
        long b2 = this.d + ((long) o1Var.b());
        f fVar = this.f3957e.f3979j.f4114g;
        if (b2 >= ((long) Math.max(0, x2.f4344i.a(null).intValue()))) {
            return false;
        }
        this.d = b2;
        this.c.add(o1Var);
        this.f3956b.add(Long.valueOf(j2));
        int size = this.c.size();
        f fVar2 = this.f3957e.f3979j.f4114g;
        if (size >= Math.max(1, x2.f4345j.a(null).intValue())) {
            return false;
        }
        return true;
    }
}
