package b.l.d.o.e0;

import b.l.a.c.c.n.a;
import b.l.a.c.k.d;
import b.l.d.k;

public final class i implements d {
    public final /* synthetic */ j a;

    public i(j jVar) {
        this.a = jVar;
    }

    public final void b(Exception exc) {
        long j2;
        if (exc instanceof k) {
            a aVar = k.f4988h;
            aVar.d("Failure to refresh token; scheduling refresh after failure", new Object[0]);
            k kVar = this.a.f4977i;
            int i2 = (int) kVar.c;
            if (i2 == 30 || i2 == 60 || i2 == 120 || i2 == 240 || i2 == 480) {
                long j3 = kVar.c;
                j2 = j3 + j3;
            } else {
                j2 = i2 != 960 ? 30 : 960;
            }
            kVar.c = j2;
            kVar.f4989b = (kVar.c * 1000) + System.currentTimeMillis();
            long j4 = kVar.f4989b;
            StringBuilder sb = new StringBuilder(43);
            sb.append("Scheduling refresh for ");
            sb.append(j4);
            aVar.d(sb.toString(), new Object[0]);
            kVar.f.postDelayed(kVar.f4991g, kVar.c * 1000);
        }
    }
}
