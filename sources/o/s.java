package o;

import b.e.a.a.a;
import e.x.c.i;
import java.nio.ByteBuffer;

public final class s implements f {

    /* renamed from: h  reason: collision with root package name */
    public final e f10482h = new e();

    /* renamed from: i  reason: collision with root package name */
    public boolean f10483i;

    /* renamed from: j  reason: collision with root package name */
    public final x f10484j;

    public s(x xVar) {
        i.e(xVar, "sink");
        this.f10484j = xVar;
    }

    public f E(int i2) {
        if (!this.f10483i) {
            this.f10482h.u0(i2);
            Q();
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }

    public f K(byte[] bArr) {
        i.e(bArr, "source");
        if (!this.f10483i) {
            this.f10482h.s0(bArr);
            Q();
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }

    public f M(h hVar) {
        i.e(hVar, "byteString");
        if (!this.f10483i) {
            this.f10482h.r0(hVar);
            Q();
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }

    public f Q() {
        if (!this.f10483i) {
            long q2 = this.f10482h.q();
            if (q2 > 0) {
                this.f10484j.j(this.f10482h, q2);
            }
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }

    public e a() {
        return this.f10482h;
    }

    public void close() {
        if (!this.f10483i) {
            Throwable th = null;
            try {
                e eVar = this.f10482h;
                long j2 = eVar.f10453i;
                if (j2 > 0) {
                    this.f10484j.j(eVar, j2);
                }
            } catch (Throwable th2) {
                th = th2;
            }
            try {
                this.f10484j.close();
            } catch (Throwable th3) {
                if (th == null) {
                    th = th3;
                }
            }
            this.f10483i = true;
            if (th != null) {
                throw th;
            }
        }
    }

    public e d() {
        return this.f10482h;
    }

    public f d0(String str) {
        i.e(str, "string");
        if (!this.f10483i) {
            this.f10482h.y0(str);
            return Q();
        }
        throw new IllegalStateException("closed".toString());
    }

    public a0 f() {
        return this.f10484j.f();
    }

    public void flush() {
        if (!this.f10483i) {
            e eVar = this.f10482h;
            long j2 = eVar.f10453i;
            if (j2 > 0) {
                this.f10484j.j(eVar, j2);
            }
            this.f10484j.flush();
            return;
        }
        throw new IllegalStateException("closed".toString());
    }

    public f h(byte[] bArr, int i2, int i3) {
        i.e(bArr, "source");
        if (!this.f10483i) {
            this.f10482h.t0(bArr, i2, i3);
            Q();
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }

    public boolean isOpen() {
        return !this.f10483i;
    }

    public void j(e eVar, long j2) {
        i.e(eVar, "source");
        if (!this.f10483i) {
            this.f10482h.j(eVar, j2);
            Q();
            return;
        }
        throw new IllegalStateException("closed".toString());
    }

    public f m(String str, int i2, int i3) {
        i.e(str, "string");
        if (!this.f10483i) {
            this.f10482h.z0(str, i2, i3);
            Q();
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }

    public long n(z zVar) {
        i.e(zVar, "source");
        long j2 = 0;
        while (true) {
            long T = zVar.T(this.f10482h, (long) 8192);
            if (T == -1) {
                return j2;
            }
            j2 += T;
            Q();
        }
    }

    public f o(long j2) {
        if (!this.f10483i) {
            this.f10482h.o(j2);
            return Q();
        }
        throw new IllegalStateException("closed".toString());
    }

    public f r(int i2) {
        if (!this.f10483i) {
            this.f10482h.x0(i2);
            Q();
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }

    public String toString() {
        StringBuilder y = a.y("buffer(");
        y.append(this.f10484j);
        y.append(')');
        return y.toString();
    }

    public f v(int i2) {
        if (!this.f10483i) {
            this.f10482h.w0(i2);
            Q();
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }

    public int write(ByteBuffer byteBuffer) {
        i.e(byteBuffer, "source");
        if (!this.f10483i) {
            int write = this.f10482h.write(byteBuffer);
            Q();
            return write;
        }
        throw new IllegalStateException("closed".toString());
    }
}
