package n.m0.j;

import androidx.appcompat.widget.ActivityChooserView;
import b.e.a.a.a;
import e.x.c.i;
import java.io.Closeable;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import n.m0.c;
import n.m0.j.d;
import o.e;
import o.f;

public final class p implements Closeable {

    /* renamed from: n  reason: collision with root package name */
    public static final Logger f10366n = Logger.getLogger(e.class.getName());

    /* renamed from: h  reason: collision with root package name */
    public final e f10367h;

    /* renamed from: i  reason: collision with root package name */
    public int f10368i = 16384;

    /* renamed from: j  reason: collision with root package name */
    public boolean f10369j;

    /* renamed from: k  reason: collision with root package name */
    public final d.b f10370k;

    /* renamed from: l  reason: collision with root package name */
    public final f f10371l;

    /* renamed from: m  reason: collision with root package name */
    public final boolean f10372m;

    public p(f fVar, boolean z) {
        i.e(fVar, "sink");
        this.f10371l = fVar;
        this.f10372m = z;
        e eVar = new e();
        this.f10367h = eVar;
        this.f10370k = new d.b(0, false, eVar, 3);
    }

    public final synchronized void H(int i2, b bVar) {
        i.e(bVar, "errorCode");
        if (!this.f10369j) {
            if (bVar.f10269h != -1) {
                e(i2, 4, 3, 0);
                this.f10371l.v(bVar.f10269h);
                this.f10371l.flush();
            } else {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
        } else {
            throw new IOException("closed");
        }
    }

    public final synchronized void L(boolean z, int i2, e eVar, int i3) {
        if (!this.f10369j) {
            e(i2, i3, 0, z ? 1 : 0);
            if (i3 > 0) {
                f fVar = this.f10371l;
                i.c(eVar);
                fVar.j(eVar, (long) i3);
            }
        } else {
            throw new IOException("closed");
        }
    }

    public final void N(int i2, long j2) {
        while (j2 > 0) {
            long min = Math.min((long) this.f10368i, j2);
            j2 -= min;
            e(i2, (int) min, 9, j2 == 0 ? 4 : 0);
            this.f10371l.j(this.f10367h, min);
        }
    }

    public final synchronized void b(t tVar) {
        i.e(tVar, "peerSettings");
        if (!this.f10369j) {
            int i2 = this.f10368i;
            int i3 = tVar.a;
            if ((i3 & 32) != 0) {
                i2 = tVar.f10375b[5];
            }
            this.f10368i = i2;
            int i4 = i3 & 2;
            int i5 = -1;
            if ((i4 != 0 ? tVar.f10375b[1] : -1) != -1) {
                d.b bVar = this.f10370k;
                if (i4 != 0) {
                    i5 = tVar.f10375b[1];
                }
                bVar.f10283h = i5;
                int min = Math.min(i5, 16384);
                int i6 = bVar.c;
                if (i6 != min) {
                    if (min < i6) {
                        bVar.a = Math.min(bVar.a, min);
                    }
                    bVar.f10280b = true;
                    bVar.c = min;
                    int i7 = bVar.f10282g;
                    if (min < i7) {
                        if (min == 0) {
                            bVar.a();
                        } else {
                            bVar.b(i7 - min);
                        }
                    }
                }
            }
            e(0, 0, 4, 1);
            this.f10371l.flush();
        } else {
            throw new IOException("closed");
        }
    }

    public final synchronized void c(boolean z, int i2, int i3) {
        if (!this.f10369j) {
            e(0, 8, 6, z ? 1 : 0);
            this.f10371l.v(i2);
            this.f10371l.v(i3);
            this.f10371l.flush();
        } else {
            throw new IOException("closed");
        }
    }

    public synchronized void close() {
        this.f10369j = true;
        this.f10371l.close();
    }

    public final void e(int i2, int i3, int i4, int i5) {
        Logger logger = f10366n;
        if (logger.isLoggable(Level.FINE)) {
            logger.fine(e.f10287e.b(false, i2, i3, i4, i5));
        }
        boolean z = true;
        if (i3 <= this.f10368i) {
            if ((((int) 2147483648L) & i2) != 0) {
                z = false;
            }
            if (z) {
                f fVar = this.f10371l;
                byte[] bArr = c.a;
                i.e(fVar, "$this$writeMedium");
                fVar.E((i3 >>> 16) & 255);
                fVar.E((i3 >>> 8) & 255);
                fVar.E(i3 & 255);
                this.f10371l.E(i4 & 255);
                this.f10371l.E(i5 & 255);
                this.f10371l.v(i2 & ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED);
                return;
            }
            throw new IllegalArgumentException(a.g("reserved bit set: ", i2).toString());
        }
        StringBuilder y = a.y("FRAME_SIZE_ERROR length > ");
        y.append(this.f10368i);
        y.append(": ");
        y.append(i3);
        throw new IllegalArgumentException(y.toString().toString());
    }

    public final synchronized void flush() {
        if (!this.f10369j) {
            this.f10371l.flush();
        } else {
            throw new IOException("closed");
        }
    }

    public final synchronized void g(int i2, long j2) {
        if (!this.f10369j) {
            if (j2 != 0 && j2 <= 2147483647L) {
                e(i2, 4, 8, 0);
                this.f10371l.v((int) j2);
                this.f10371l.flush();
            } else {
                throw new IllegalArgumentException(("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: " + j2).toString());
            }
        } else {
            throw new IOException("closed");
        }
    }

    public final synchronized void q(int i2, b bVar, byte[] bArr) {
        i.e(bVar, "errorCode");
        i.e(bArr, "debugData");
        if (!this.f10369j) {
            boolean z = false;
            if (bVar.f10269h != -1) {
                e(0, bArr.length + 8, 7, 0);
                this.f10371l.v(i2);
                this.f10371l.v(bVar.f10269h);
                if (bArr.length == 0) {
                    z = true;
                }
                if (!z) {
                    this.f10371l.K(bArr);
                }
                this.f10371l.flush();
            } else {
                throw new IllegalArgumentException("errorCode.httpCode == -1".toString());
            }
        } else {
            throw new IOException("closed");
        }
    }

    public final synchronized void z(boolean z, int i2, List<c> list) {
        i.e(list, "headerBlock");
        if (!this.f10369j) {
            this.f10370k.e(list);
            long j2 = this.f10367h.f10453i;
            long min = Math.min((long) this.f10368i, j2);
            int i3 = (j2 > min ? 1 : (j2 == min ? 0 : -1));
            int i4 = i3 == 0 ? 4 : 0;
            if (z) {
                i4 |= 1;
            }
            e(i2, (int) min, 1, i4);
            this.f10371l.j(this.f10367h, min);
            if (i3 > 0) {
                N(i2, j2 - min);
            }
        } else {
            throw new IOException("closed");
        }
    }
}
