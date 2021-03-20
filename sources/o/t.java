package o;

import androidx.appcompat.widget.ActivityChooserView;
import androidx.exifinterface.media.ExifInterface;
import androidx.recyclerview.widget.RecyclerView;
import e.a.a.a.y0.m.o1.c;
import e.x.c.i;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

public final class t implements g {

    /* renamed from: h  reason: collision with root package name */
    public final e f10485h = new e();

    /* renamed from: i  reason: collision with root package name */
    public boolean f10486i;

    /* renamed from: j  reason: collision with root package name */
    public final z f10487j;

    public t(z zVar) {
        i.e(zVar, "source");
        this.f10487j = zVar;
    }

    public byte[] A() {
        this.f10485h.n(this.f10487j);
        return this.f10485h.A();
    }

    public long C(h hVar) {
        i.e(hVar, "bytes");
        i.e(hVar, "bytes");
        if (!this.f10486i) {
            long j2 = 0;
            while (true) {
                long S = this.f10485h.S(hVar, j2);
                if (S != -1) {
                    return S;
                }
                e eVar = this.f10485h;
                long j3 = eVar.f10453i;
                if (this.f10487j.T(eVar, (long) 8192) == -1) {
                    return -1;
                }
                j2 = Math.max(j2, (j3 - ((long) hVar.l())) + 1);
            }
        } else {
            throw new IllegalStateException("closed".toString());
        }
    }

    public boolean D() {
        if (!this.f10486i) {
            return this.f10485h.D() && this.f10487j.T(this.f10485h, (long) 8192) == -1;
        }
        throw new IllegalStateException("closed".toString());
    }

    public byte[] G(long j2) {
        c0(j2);
        return this.f10485h.G(j2);
    }

    public long P(h hVar) {
        i.e(hVar, "targetBytes");
        i.e(hVar, "targetBytes");
        if (!this.f10486i) {
            long j2 = 0;
            while (true) {
                long Y = this.f10485h.Y(hVar, j2);
                if (Y != -1) {
                    return Y;
                }
                e eVar = this.f10485h;
                long j3 = eVar.f10453i;
                if (this.f10487j.T(eVar, (long) 8192) == -1) {
                    return -1;
                }
                j2 = Math.max(j2, j3);
            }
        } else {
            throw new IllegalStateException("closed".toString());
        }
    }

    public long T(e eVar, long j2) {
        i.e(eVar, "sink");
        if (!(j2 >= 0)) {
            throw new IllegalArgumentException(b.e.a.a.a.j("byteCount < 0: ", j2).toString());
        } else if (!this.f10486i) {
            e eVar2 = this.f10485h;
            if (eVar2.f10453i == 0 && this.f10487j.T(eVar2, (long) 8192) == -1) {
                return -1;
            }
            return this.f10485h.T(eVar, Math.min(j2, this.f10485h.f10453i));
        } else {
            throw new IllegalStateException("closed".toString());
        }
    }

    public String U(long j2) {
        if (j2 >= 0) {
            long j3 = j2 == RecyclerView.FOREVER_NS ? Long.MAX_VALUE : j2 + 1;
            byte b2 = (byte) 10;
            long b3 = b(b2, 0, j3);
            if (b3 != -1) {
                return o.b0.a.b(this.f10485h, b3);
            }
            if (j3 < RecyclerView.FOREVER_NS && t(j3) && this.f10485h.N(j3 - 1) == ((byte) 13) && t(1 + j3) && this.f10485h.N(j3) == b2) {
                return o.b0.a.b(this.f10485h, j3);
            }
            e eVar = new e();
            e eVar2 = this.f10485h;
            eVar2.z(eVar, 0, Math.min((long) 32, eVar2.f10453i));
            StringBuilder y = b.e.a.a.a.y("\\n not found: limit=");
            y.append(Math.min(this.f10485h.f10453i, j2));
            y.append(" content=");
            y.append(eVar.e0().m());
            y.append("…");
            throw new EOFException(y.toString());
        }
        throw new IllegalArgumentException(b.e.a.a.a.j("limit < 0: ", j2).toString());
    }

    public long V(x xVar) {
        i.e(xVar, "sink");
        long j2 = 0;
        while (this.f10487j.T(this.f10485h, (long) 8192) != -1) {
            long q2 = this.f10485h.q();
            if (q2 > 0) {
                j2 += q2;
                ((r) xVar).j(this.f10485h, q2);
            }
        }
        e eVar = this.f10485h;
        long j3 = eVar.f10453i;
        if (j3 <= 0) {
            return j2;
        }
        long j4 = j2 + j3;
        ((r) xVar).j(eVar, j3);
        return j4;
    }

    public e a() {
        return this.f10485h;
    }

    public long b(byte b2, long j2, long j3) {
        boolean z = true;
        if (!this.f10486i) {
            if (0 > j2 || j3 < j2) {
                z = false;
            }
            if (z) {
                while (j2 < j3) {
                    long O = this.f10485h.O(b2, j2, j3);
                    if (O != -1) {
                        return O;
                    }
                    e eVar = this.f10485h;
                    long j4 = eVar.f10453i;
                    if (j4 >= j3 || this.f10487j.T(eVar, (long) 8192) == -1) {
                        return -1;
                    }
                    j2 = Math.max(j2, j4);
                }
                return -1;
            }
            throw new IllegalArgumentException(("fromIndex=" + j2 + " toIndex=" + j3).toString());
        }
        throw new IllegalStateException("closed".toString());
    }

    public void c0(long j2) {
        if (!t(j2)) {
            throw new EOFException();
        }
    }

    public void close() {
        if (!this.f10486i) {
            this.f10486i = true;
            this.f10487j.close();
            e eVar = this.f10485h;
            eVar.skip(eVar.f10453i);
        }
    }

    public e d() {
        return this.f10485h;
    }

    public int e() {
        c0(4);
        int readInt = this.f10485h.readInt();
        return ((readInt & 255) << 24) | ((-16777216 & readInt) >>> 24) | ((16711680 & readInt) >>> 8) | ((65280 & readInt) << 8);
    }

    public a0 f() {
        return this.f10487j.f();
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x003a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long h0() {
        /*
            r5 = this;
            r0 = 1
            r5.c0(r0)
            r0 = 0
        L_0x0006:
            int r1 = r0 + 1
            long r2 = (long) r1
            boolean r2 = r5.t(r2)
            if (r2 == 0) goto L_0x0062
            o.e r2 = r5.f10485h
            long r3 = (long) r0
            byte r2 = r2.N(r3)
            r3 = 48
            byte r3 = (byte) r3
            if (r2 < r3) goto L_0x0020
            r3 = 57
            byte r3 = (byte) r3
            if (r2 <= r3) goto L_0x0035
        L_0x0020:
            r3 = 97
            byte r3 = (byte) r3
            if (r2 < r3) goto L_0x002a
            r3 = 102(0x66, float:1.43E-43)
            byte r3 = (byte) r3
            if (r2 <= r3) goto L_0x0035
        L_0x002a:
            r3 = 65
            byte r3 = (byte) r3
            if (r2 < r3) goto L_0x0037
            r3 = 70
            byte r3 = (byte) r3
            if (r2 <= r3) goto L_0x0035
            goto L_0x0037
        L_0x0035:
            r0 = r1
            goto L_0x0006
        L_0x0037:
            if (r0 == 0) goto L_0x003a
            goto L_0x0062
        L_0x003a:
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "Expected leading [0-9a-fA-F] character but was 0x"
            r1.append(r3)
            r3 = 16
            e.a.a.a.y0.m.o1.c.q(r3)
            e.a.a.a.y0.m.o1.c.q(r3)
            java.lang.String r2 = java.lang.Integer.toString(r2, r3)
            java.lang.String r3 = "java.lang.Integer.toStri…(this, checkRadix(radix))"
            e.x.c.i.d(r2, r3)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x0062:
            o.e r0 = r5.f10485h
            long r0 = r0.h0()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.t.h0():long");
    }

    public String i0(Charset charset) {
        i.e(charset, "charset");
        this.f10485h.n(this.f10487j);
        return this.f10485h.i0(charset);
    }

    public boolean isOpen() {
        return !this.f10486i;
    }

    public InputStream j0() {
        return new a(this);
    }

    public int l0(q qVar) {
        i.e(qVar, "options");
        if (!this.f10486i) {
            while (true) {
                int c = o.b0.a.c(this.f10485h, qVar, true);
                if (c == -2) {
                    if (this.f10487j.T(this.f10485h, (long) 8192) == -1) {
                        break;
                    }
                } else if (c != -1) {
                    this.f10485h.skip((long) qVar.f10478h[c].l());
                    return c;
                }
            }
            return -1;
        }
        throw new IllegalStateException("closed".toString());
    }

    public h p(long j2) {
        if (t(j2)) {
            return this.f10485h.p(j2);
        }
        throw new EOFException();
    }

    public int read(ByteBuffer byteBuffer) {
        i.e(byteBuffer, "sink");
        e eVar = this.f10485h;
        if (eVar.f10453i == 0 && this.f10487j.T(eVar, (long) 8192) == -1) {
            return -1;
        }
        return this.f10485h.read(byteBuffer);
    }

    public byte readByte() {
        c0(1);
        return this.f10485h.readByte();
    }

    public int readInt() {
        c0(4);
        return this.f10485h.readInt();
    }

    public short readShort() {
        c0(2);
        return this.f10485h.readShort();
    }

    public void skip(long j2) {
        if (!this.f10486i) {
            while (j2 > 0) {
                e eVar = this.f10485h;
                if (eVar.f10453i == 0 && this.f10487j.T(eVar, (long) 8192) == -1) {
                    throw new EOFException();
                }
                long min = Math.min(j2, this.f10485h.f10453i);
                this.f10485h.skip(min);
                j2 -= min;
            }
            return;
        }
        throw new IllegalStateException("closed".toString());
    }

    public boolean t(long j2) {
        e eVar;
        if (!(j2 >= 0)) {
            throw new IllegalArgumentException(b.e.a.a.a.j("byteCount < 0: ", j2).toString());
        } else if (!this.f10486i) {
            do {
                eVar = this.f10485h;
                if (eVar.f10453i >= j2) {
                    return true;
                }
            } while (this.f10487j.T(eVar, (long) 8192) != -1);
            return false;
        } else {
            throw new IllegalStateException("closed".toString());
        }
    }

    public String toString() {
        StringBuilder y = b.e.a.a.a.y("buffer(");
        y.append(this.f10487j);
        y.append(')');
        return y.toString();
    }

    public String y() {
        return U(RecyclerView.FOREVER_NS);
    }

    public static final class a extends InputStream {

        /* renamed from: h  reason: collision with root package name */
        public final /* synthetic */ t f10488h;

        public a(t tVar) {
            this.f10488h = tVar;
        }

        public int available() {
            t tVar = this.f10488h;
            if (!tVar.f10486i) {
                return (int) Math.min(tVar.f10485h.f10453i, (long) ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED);
            }
            throw new IOException("closed");
        }

        public void close() {
            this.f10488h.close();
        }

        public int read() {
            t tVar = this.f10488h;
            if (!tVar.f10486i) {
                e eVar = tVar.f10485h;
                if (eVar.f10453i == 0 && tVar.f10487j.T(eVar, (long) 8192) == -1) {
                    return -1;
                }
                return this.f10488h.f10485h.readByte() & ExifInterface.MARKER;
            }
            throw new IOException("closed");
        }

        public String toString() {
            return this.f10488h + ".inputStream()";
        }

        public int read(byte[] bArr, int i2, int i3) {
            i.e(bArr, "data");
            if (!this.f10488h.f10486i) {
                c.p((long) bArr.length, (long) i2, (long) i3);
                t tVar = this.f10488h;
                e eVar = tVar.f10485h;
                if (eVar.f10453i == 0 && tVar.f10487j.T(eVar, (long) 8192) == -1) {
                    return -1;
                }
                return this.f10488h.f10485h.read(bArr, i2, i3);
            }
            throw new IOException("closed");
        }
    }
}
