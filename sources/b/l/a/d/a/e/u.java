package b.l.a.d.a.e;

import java.io.InputStream;

public final class u extends t {

    /* renamed from: h  reason: collision with root package name */
    public final t f4676h;

    /* renamed from: i  reason: collision with root package name */
    public final long f4677i;

    /* renamed from: j  reason: collision with root package name */
    public final long f4678j;

    public u(t tVar, long j2, long j3) {
        this.f4676h = tVar;
        long q2 = q(j2);
        this.f4677i = q2;
        this.f4678j = q(q2 + j3);
    }

    public final long b() {
        return this.f4678j - this.f4677i;
    }

    public final void close() {
    }

    public final InputStream e(long j2, long j3) {
        long q2 = q(this.f4677i);
        return this.f4676h.e(q2, q(j3 + q2) - q2);
    }

    public final long q(long j2) {
        if (j2 < 0) {
            return 0;
        }
        return j2 > this.f4676h.b() ? this.f4676h.b() : j2;
    }
}
