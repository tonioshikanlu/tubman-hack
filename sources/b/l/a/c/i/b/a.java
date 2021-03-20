package b.l.a.c.i.b;

import java.util.Map;

public final class a implements Runnable {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ String f3881h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ long f3882i;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ c2 f3883j;

    public a(c2 c2Var, String str, long j2) {
        this.f3883j = c2Var;
        this.f3881h = str;
        this.f3882i = j2;
    }

    public final void run() {
        Map map;
        Object valueOf;
        c2 c2Var = this.f3883j;
        String str = this.f3881h;
        long j2 = this.f3882i;
        c2Var.h();
        b.l.a.c.b.a.x(str);
        if (c2Var.c.isEmpty()) {
            c2Var.d = j2;
        }
        Integer num = c2Var.c.get(str);
        if (num != null) {
            map = c2Var.c;
            valueOf = Integer.valueOf(num.intValue() + 1);
        } else if (c2Var.c.size() >= 100) {
            c2Var.a.a().f4091i.a("Too many ads visible");
            return;
        } else {
            c2Var.c.put(str, 1);
            map = c2Var.f3936b;
            valueOf = Long.valueOf(j2);
        }
        map.put(str, valueOf);
    }
}
