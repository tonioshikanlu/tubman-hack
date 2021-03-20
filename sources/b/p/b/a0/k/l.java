package b.p.b.a0.k;

import b.e.a.a.a;
import b.p.b.a0.i;
import java.net.ProtocolException;
import o.a0;
import o.e;
import o.x;

public final class l implements x {

    /* renamed from: h  reason: collision with root package name */
    public boolean f6658h;

    /* renamed from: i  reason: collision with root package name */
    public final int f6659i;

    /* renamed from: j  reason: collision with root package name */
    public final e f6660j;

    public l() {
        this.f6660j = new e();
        this.f6659i = -1;
    }

    public l(int i2) {
        this.f6660j = new e();
        this.f6659i = i2;
    }

    public void close() {
        if (!this.f6658h) {
            this.f6658h = true;
            if (this.f6660j.f10453i < ((long) this.f6659i)) {
                StringBuilder y = a.y("content-length promised ");
                y.append(this.f6659i);
                y.append(" bytes, but received ");
                y.append(this.f6660j.f10453i);
                throw new ProtocolException(y.toString());
            }
        }
    }

    public a0 f() {
        return a0.d;
    }

    public void flush() {
    }

    public void j(e eVar, long j2) {
        if (!this.f6658h) {
            i.a(eVar.f10453i, 0, j2);
            int i2 = this.f6659i;
            if (i2 == -1 || this.f6660j.f10453i <= ((long) i2) - j2) {
                this.f6660j.j(eVar, j2);
                return;
            }
            throw new ProtocolException(a.o(a.y("exceeded content-length limit of "), this.f6659i, " bytes"));
        }
        throw new IllegalStateException("closed");
    }
}
