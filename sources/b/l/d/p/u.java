package b.l.d.p;

import b.l.d.t.a;
import b.l.d.t.b;
import java.util.Map;

public final /* synthetic */ class u implements Runnable {

    /* renamed from: h  reason: collision with root package name */
    public final Map.Entry f5048h;

    /* renamed from: i  reason: collision with root package name */
    public final a f5049i;

    public u(Map.Entry entry, a aVar) {
        this.f5048h = entry;
        this.f5049i = aVar;
    }

    public void run() {
        Map.Entry entry = this.f5048h;
        ((b) entry.getKey()).a(this.f5049i);
    }
}
