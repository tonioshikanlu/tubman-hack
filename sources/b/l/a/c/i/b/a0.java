package b.l.a.c.i.b;

import b.l.a.c.b.a;

public final class a0 implements Runnable {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ String f3884h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ long f3885i;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ c2 f3886j;

    public a0(c2 c2Var, String str, long j2) {
        this.f3886j = c2Var;
        this.f3884h = str;
        this.f3885i = j2;
    }

    public final void run() {
        c2 c2Var = this.f3886j;
        String str = this.f3884h;
        long j2 = this.f3885i;
        c2Var.h();
        a.x(str);
        Integer num = c2Var.c.get(str);
        if (num != null) {
            t6 p2 = c2Var.a.y().p(false);
            int intValue = num.intValue() - 1;
            if (intValue == 0) {
                c2Var.c.remove(str);
                Long l2 = c2Var.f3936b.get(str);
                if (l2 == null) {
                    c2Var.a.a().f.a("First ad unit exposure time was never set");
                } else {
                    long longValue = l2.longValue();
                    c2Var.f3936b.remove(str);
                    c2Var.m(str, j2 - longValue, p2);
                }
                if (c2Var.c.isEmpty()) {
                    long j3 = c2Var.d;
                    if (j3 == 0) {
                        c2Var.a.a().f.a("First ad exposure time was never set");
                        return;
                    }
                    c2Var.l(j2 - j3, p2);
                    c2Var.d = 0;
                    return;
                }
                return;
            }
            c2Var.c.put(str, Integer.valueOf(intValue));
            return;
        }
        c2Var.a.a().f.b("Call to endAdUnitExposure for unknown ad unit id", str);
    }
}
