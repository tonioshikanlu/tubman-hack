package b.l.d.p;

import b.l.d.w.b;
import java.util.Set;

public final /* synthetic */ class k implements Runnable {

    /* renamed from: h  reason: collision with root package name */
    public final y f5039h;

    /* renamed from: i  reason: collision with root package name */
    public final b f5040i;

    public k(y yVar, b bVar) {
        this.f5039h = yVar;
        this.f5040i = bVar;
    }

    public void run() {
        Set set;
        Object obj;
        y yVar = this.f5039h;
        b bVar = this.f5040i;
        int i2 = m.f5041g;
        synchronized (yVar) {
            if (yVar.f5052b == null) {
                set = yVar.a;
                obj = bVar;
            } else {
                set = yVar.f5052b;
                obj = bVar.get();
            }
            set.add(obj);
        }
    }
}
