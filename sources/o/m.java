package o;

import androidx.recyclerview.widget.RecyclerView;
import b.e.a.a.a;
import e.x.c.i;
import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;
import java.util.zip.CRC32;
import java.util.zip.Inflater;

public final class m implements z {

    /* renamed from: h  reason: collision with root package name */
    public byte f10466h;

    /* renamed from: i  reason: collision with root package name */
    public final t f10467i;

    /* renamed from: j  reason: collision with root package name */
    public final Inflater f10468j;

    /* renamed from: k  reason: collision with root package name */
    public final n f10469k;

    /* renamed from: l  reason: collision with root package name */
    public final CRC32 f10470l = new CRC32();

    public m(z zVar) {
        i.e(zVar, "source");
        t tVar = new t(zVar);
        this.f10467i = tVar;
        Inflater inflater = new Inflater(true);
        this.f10468j = inflater;
        this.f10469k = new n((g) tVar, inflater);
    }

    public long T(e eVar, long j2) {
        long j3;
        e eVar2 = eVar;
        long j4 = j2;
        i.e(eVar2, "sink");
        int i2 = (j4 > 0 ? 1 : (j4 == 0 ? 0 : -1));
        boolean z = false;
        if (!(i2 >= 0)) {
            throw new IllegalArgumentException(a.j("byteCount < 0: ", j4).toString());
        } else if (i2 == 0) {
            return 0;
        } else {
            if (this.f10466h == 0) {
                this.f10467i.c0(10);
                byte N = this.f10467i.f10485h.N(3);
                boolean z2 = ((N >> 1) & 1) == 1;
                if (z2) {
                    e(this.f10467i.f10485h, 0, 10);
                }
                b("ID1ID2", 8075, this.f10467i.readShort());
                this.f10467i.skip(8);
                if (((N >> 2) & 1) == 1) {
                    this.f10467i.c0(2);
                    if (z2) {
                        e(this.f10467i.f10485h, 0, 2);
                    }
                    long g0 = (long) this.f10467i.f10485h.g0();
                    this.f10467i.c0(g0);
                    if (z2) {
                        j3 = g0;
                        e(this.f10467i.f10485h, 0, g0);
                    } else {
                        j3 = g0;
                    }
                    this.f10467i.skip(j3);
                }
                if (((N >> 3) & 1) == 1) {
                    long b2 = this.f10467i.b((byte) 0, 0, RecyclerView.FOREVER_NS);
                    if (b2 != -1) {
                        if (z2) {
                            e(this.f10467i.f10485h, 0, b2 + 1);
                        }
                        this.f10467i.skip(b2 + 1);
                    } else {
                        throw new EOFException();
                    }
                }
                if (((N >> 4) & 1) == 1) {
                    z = true;
                }
                if (z) {
                    long b3 = this.f10467i.b((byte) 0, 0, RecyclerView.FOREVER_NS);
                    if (b3 != -1) {
                        if (z2) {
                            e(this.f10467i.f10485h, 0, b3 + 1);
                        }
                        this.f10467i.skip(b3 + 1);
                    } else {
                        throw new EOFException();
                    }
                }
                if (z2) {
                    t tVar = this.f10467i;
                    tVar.c0(2);
                    b("FHCRC", tVar.f10485h.g0(), (short) ((int) this.f10470l.getValue()));
                    this.f10470l.reset();
                }
                this.f10466h = 1;
            }
            if (this.f10466h == 1) {
                long j5 = eVar2.f10453i;
                long T = this.f10469k.T(eVar2, j4);
                if (T != -1) {
                    e(eVar, j5, T);
                    return T;
                }
                this.f10466h = 2;
            }
            if (this.f10466h == 2) {
                b("CRC", this.f10467i.e(), (int) this.f10470l.getValue());
                b("ISIZE", this.f10467i.e(), (int) this.f10468j.getBytesWritten());
                this.f10466h = 3;
                if (!this.f10467i.D()) {
                    throw new IOException("gzip finished without exhausting source");
                }
            }
            return -1;
        }
    }

    public final void b(String str, int i2, int i3) {
        if (i3 != i2) {
            String format = String.format("%s: actual 0x%08x != expected 0x%08x", Arrays.copyOf(new Object[]{str, Integer.valueOf(i3), Integer.valueOf(i2)}, 3));
            i.d(format, "java.lang.String.format(this, *args)");
            throw new IOException(format);
        }
    }

    public void close() {
        this.f10469k.close();
    }

    public final void e(e eVar, long j2, long j3) {
        u uVar = eVar.f10452h;
        while (true) {
            i.c(uVar);
            int i2 = uVar.c;
            int i3 = uVar.f10489b;
            if (j2 < ((long) (i2 - i3))) {
                break;
            }
            j2 -= (long) (i2 - i3);
            uVar = uVar.f;
        }
        while (j3 > 0) {
            int i4 = (int) (((long) uVar.f10489b) + j2);
            int min = (int) Math.min((long) (uVar.c - i4), j3);
            this.f10470l.update(uVar.a, i4, min);
            j3 -= (long) min;
            uVar = uVar.f;
            i.c(uVar);
            j2 = 0;
        }
    }

    public a0 f() {
        return this.f10467i.f();
    }
}
