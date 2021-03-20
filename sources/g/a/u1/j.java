package g.a.u1;

import b.e.a.a.a;
import e.a.a.a.y0.m.o1.c;

public final class j extends h {

    /* renamed from: j  reason: collision with root package name */
    public final Runnable f10029j;

    public j(Runnable runnable, long j2, i iVar) {
        super(j2, iVar);
        this.f10029j = runnable;
    }

    public void run() {
        try {
            this.f10029j.run();
        } finally {
            this.f10028i.H();
        }
    }

    public String toString() {
        StringBuilder y = a.y("Task[");
        y.append(c.E(this.f10029j));
        y.append('@');
        y.append(c.F(this.f10029j));
        y.append(", ");
        y.append(this.f10027h);
        y.append(", ");
        y.append(this.f10028i);
        y.append(']');
        return y.toString();
    }
}
