package b.l.a.c.c.l.k;

import android.app.PendingIntent;
import androidx.annotation.WorkerThread;
import b.l.a.c.c.b;
import b.l.a.c.c.l.a;
import b.l.a.c.c.m.b;
import b.l.a.c.c.m.m;
import b.l.a.c.j.e;
import java.util.ArrayList;
import java.util.Map;

public final class y extends h0 {

    /* renamed from: i  reason: collision with root package name */
    public final Map<a.f, z> f2740i;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ x f2741j;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public y(x xVar, Map<a.f, z> map) {
        super(xVar, (w) null);
        this.f2741j = xVar;
        this.f2740i = map;
    }

    @WorkerThread
    public final void a() {
        e eVar;
        m mVar = new m(this.f2741j.d);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (a.f next : this.f2740i.keySet()) {
            if (!next.m() || this.f2740i.get(next).c) {
                arrayList2.add(next);
            } else {
                arrayList.add(next);
            }
        }
        int i2 = -1;
        int i3 = 0;
        if (!arrayList.isEmpty()) {
            int size = arrayList.size();
            while (i3 < size) {
                Object obj = arrayList.get(i3);
                i3++;
                i2 = mVar.a(this.f2741j.c, (a.f) obj);
                if (i2 != 0) {
                    break;
                }
            }
        } else {
            int size2 = arrayList2.size();
            while (i3 < size2) {
                Object obj2 = arrayList2.get(i3);
                i3++;
                i2 = mVar.a(this.f2741j.c, (a.f) obj2);
                if (i2 == 0) {
                    break;
                }
            }
        }
        if (i2 != 0) {
            b bVar = new b(i2, (PendingIntent) null);
            x xVar = this.f2741j;
            p0 p0Var = xVar.a;
            p0Var.f2694e.sendMessage(p0Var.f2694e.obtainMessage(1, new b0(this, xVar, bVar)));
            return;
        }
        x xVar2 = this.f2741j;
        if (xVar2.f2726m && (eVar = xVar2.f2724k) != null) {
            eVar.c();
        }
        for (a.f next2 : this.f2740i.keySet()) {
            b.c cVar = this.f2740i.get(next2);
            if (!next2.m() || mVar.a(this.f2741j.c, next2) == 0) {
                next2.r(cVar);
            } else {
                x xVar3 = this.f2741j;
                p0 p0Var2 = xVar3.a;
                p0Var2.f2694e.sendMessage(p0Var2.f2694e.obtainMessage(1, new a0(xVar3, cVar)));
            }
        }
    }
}
