package b.h.a.m.v;

import b.h.a.m.v.a;
import java.util.Objects;

public class b implements Runnable {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ a f625h;

    public b(a aVar) {
        this.f625h = aVar;
    }

    public void run() {
        a aVar = this.f625h;
        Objects.requireNonNull(aVar);
        while (true) {
            try {
                aVar.b((a.b) aVar.c.remove());
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        }
    }
}
