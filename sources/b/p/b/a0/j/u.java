package b.p.b.a0.j;

import androidx.appcompat.widget.ActivityChooserView;
import androidx.core.view.ViewCompat;
import b.p.b.a0.j.b;
import b.p.b.a0.j.d;
import e.a.a.a.y0.m.o1.c;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.ProtocolException;
import java.util.List;
import java.util.zip.Deflater;
import o.e;
import o.f;
import o.g;
import o.h;
import o.i;

public final class u implements v {
    public static final byte[] a;

    public static final class a implements b {

        /* renamed from: h  reason: collision with root package name */
        public final g f6594h;

        /* renamed from: i  reason: collision with root package name */
        public final boolean f6595i;

        /* renamed from: j  reason: collision with root package name */
        public final q f6596j;

        public a(g gVar, boolean z) {
            this.f6594h = gVar;
            this.f6596j = new q(gVar);
            this.f6595i = z;
        }

        public static IOException b(String str, Object... objArr) {
            throw new IOException(String.format(str, objArr));
        }

        public boolean a0(b.a aVar) {
            a aVar2;
            a aVar3;
            boolean z = false;
            try {
                int readInt = this.f6594h.readInt();
                int readInt2 = this.f6594h.readInt();
                boolean z2 = (Integer.MIN_VALUE & readInt) != 0;
                int i2 = (readInt2 & ViewCompat.MEASURED_STATE_MASK) >>> 24;
                int i3 = readInt2 & ViewCompat.MEASURED_SIZE_MASK;
                if (z2) {
                    int i4 = (2147418112 & readInt) >>> 16;
                    int i5 = readInt & 65535;
                    if (i4 == 3) {
                        switch (i5) {
                            case 1:
                                int readInt3 = this.f6594h.readInt();
                                int readInt4 = this.f6594h.readInt();
                                int i6 = readInt3 & ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
                                int i7 = readInt4 & ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
                                this.f6594h.readShort();
                                ((d.e) aVar).d((i2 & 2) != 0, (i2 & 1) != 0, i6, i7, this.f6596j.a(i3 - 10), m.SPDY_SYN_STREAM);
                                return true;
                            case 2:
                                ((d.e) aVar).d(false, (i2 & 1) != 0, this.f6594h.readInt() & ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED, -1, this.f6596j.a(i3 - 4), m.SPDY_REPLY);
                                return true;
                            case 3:
                                if (i3 == 8) {
                                    int readInt5 = this.f6594h.readInt() & ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
                                    int readInt6 = this.f6594h.readInt();
                                    a[] values = a.values();
                                    int i8 = 0;
                                    while (true) {
                                        if (i8 < 18) {
                                            aVar2 = values[i8];
                                            if (aVar2.f6490i != readInt6) {
                                                i8++;
                                            }
                                        } else {
                                            aVar2 = null;
                                        }
                                    }
                                    if (aVar2 != null) {
                                        ((d.e) aVar).f(readInt5, aVar2);
                                        return true;
                                    }
                                    b("TYPE_RST_STREAM unexpected error code: %d", Integer.valueOf(readInt6));
                                    throw null;
                                }
                                b("TYPE_RST_STREAM length: %d != 8", Integer.valueOf(i3));
                                throw null;
                            case 4:
                                int readInt7 = this.f6594h.readInt();
                                if (i3 == (readInt7 * 8) + 4) {
                                    t tVar = new t();
                                    for (int i9 = 0; i9 < readInt7; i9++) {
                                        int readInt8 = this.f6594h.readInt();
                                        tVar.d(readInt8 & ViewCompat.MEASURED_SIZE_MASK, (readInt8 & ViewCompat.MEASURED_STATE_MASK) >>> 24, this.f6594h.readInt());
                                    }
                                    if ((i2 & 1) != 0) {
                                        z = true;
                                    }
                                    ((d.e) aVar).g(z, tVar);
                                    return true;
                                }
                                b("TYPE_SETTINGS length: %d != 4 + 8 * %d", Integer.valueOf(i3), Integer.valueOf(readInt7));
                                throw null;
                            case 6:
                                if (i3 == 4) {
                                    int readInt9 = this.f6594h.readInt();
                                    ((d.e) aVar).e(this.f6595i == ((readInt9 & 1) == 1), readInt9, 0);
                                    return true;
                                }
                                b("TYPE_PING length: %d != 4", Integer.valueOf(i3));
                                throw null;
                            case 7:
                                if (i3 == 8) {
                                    int readInt10 = this.f6594h.readInt() & ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
                                    int readInt11 = this.f6594h.readInt();
                                    a[] values2 = a.values();
                                    int i10 = 0;
                                    while (true) {
                                        if (i10 < 18) {
                                            aVar3 = values2[i10];
                                            if (aVar3.f6491j != readInt11) {
                                                i10++;
                                            }
                                        } else {
                                            aVar3 = null;
                                        }
                                    }
                                    if (aVar3 != null) {
                                        ((d.e) aVar).c(readInt10, aVar3, h.f10455k);
                                        return true;
                                    }
                                    b("TYPE_GOAWAY unexpected error code: %d", Integer.valueOf(readInt11));
                                    throw null;
                                }
                                b("TYPE_GOAWAY length: %d != 8", Integer.valueOf(i3));
                                throw null;
                            case 8:
                                ((d.e) aVar).d(false, false, this.f6594h.readInt() & ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED, -1, this.f6596j.a(i3 - 4), m.SPDY_HEADERS);
                                return true;
                            case 9:
                                if (i3 == 8) {
                                    int readInt12 = this.f6594h.readInt();
                                    int readInt13 = this.f6594h.readInt();
                                    int i11 = readInt12 & ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
                                    long j2 = (long) (readInt13 & ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED);
                                    if (j2 != 0) {
                                        ((d.e) aVar).h(i11, j2);
                                        return true;
                                    }
                                    b("windowSizeIncrement was 0", Long.valueOf(j2));
                                    throw null;
                                }
                                b("TYPE_WINDOW_UPDATE length: %d != 8", Integer.valueOf(i3));
                                throw null;
                            default:
                                this.f6594h.skip((long) i3);
                                return true;
                        }
                    } else {
                        throw new ProtocolException(b.e.a.a.a.g("version != 3: ", i4));
                    }
                } else {
                    int i12 = readInt & ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
                    if ((i2 & 1) != 0) {
                        z = true;
                    }
                    ((d.e) aVar).b(z, i12, this.f6594h, i3);
                    return true;
                }
            } catch (IOException unused) {
                return false;
            }
        }

        public void close() {
            this.f6596j.c.close();
        }

        public void u() {
        }
    }

    public static final class b implements c {

        /* renamed from: h  reason: collision with root package name */
        public final f f6597h;

        /* renamed from: i  reason: collision with root package name */
        public final e f6598i;

        /* renamed from: j  reason: collision with root package name */
        public final f f6599j;

        /* renamed from: k  reason: collision with root package name */
        public final boolean f6600k;

        /* renamed from: l  reason: collision with root package name */
        public boolean f6601l;

        public b(f fVar, boolean z) {
            this.f6597h = fVar;
            this.f6600k = z;
            Deflater deflater = new Deflater();
            deflater.setDictionary(u.a);
            e eVar = new e();
            this.f6598i = eVar;
            this.f6599j = c.l(new i(eVar, deflater));
        }

        public synchronized void F() {
        }

        public synchronized void L(boolean z, int i2, e eVar, int i3) {
            b(i2, z ? 1 : 0, eVar, i3);
        }

        public int Z() {
            return 16383;
        }

        public void b(int i2, int i3, e eVar, int i4) {
            if (!this.f6601l) {
                long j2 = (long) i4;
                if (j2 <= 16777215) {
                    this.f6597h.v(i2 & ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED);
                    this.f6597h.v(((i3 & 255) << 24) | (16777215 & i4));
                    if (i4 > 0) {
                        this.f6597h.j(eVar, j2);
                        return;
                    }
                    return;
                }
                throw new IllegalArgumentException(b.e.a.a.a.g("FRAME_TOO_LARGE max size is 16Mib: ", i4));
            }
            throw new IOException("closed");
        }

        public synchronized void b0(boolean z, boolean z2, int i2, int i3, List<l> list) {
            if (!this.f6601l) {
                e(list);
                int i4 = (int) (this.f6598i.f10453i + 10);
                boolean z3 = z | (z2 ? (char) 2 : 0);
                this.f6597h.v(-2147287039);
                this.f6597h.v(((z3 & true ? 1 : 0) << true) | (i4 & ViewCompat.MEASURED_SIZE_MASK));
                this.f6597h.v(i2 & ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED);
                this.f6597h.v(Integer.MAX_VALUE & i3);
                this.f6597h.r(0);
                this.f6597h.n(this.f6598i);
                this.f6597h.flush();
            } else {
                throw new IOException("closed");
            }
        }

        public synchronized void c(boolean z, int i2, int i3) {
            if (!this.f6601l) {
                boolean z2 = false;
                if (this.f6600k != ((i2 & 1) == 1)) {
                    z2 = true;
                }
                if (z == z2) {
                    this.f6597h.v(-2147287034);
                    this.f6597h.v(4);
                    this.f6597h.v(i2);
                    this.f6597h.flush();
                } else {
                    throw new IllegalArgumentException("payload != reply");
                }
            } else {
                throw new IOException("closed");
            }
        }

        public synchronized void close() {
            this.f6601l = true;
            b.p.b.a0.i.b(this.f6597h, this.f6599j);
        }

        public final void e(List<l> list) {
            this.f6599j.v(list.size());
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                h hVar = list.get(i2).a;
                this.f6599j.v(hVar.l());
                this.f6599j.M(hVar);
                h hVar2 = list.get(i2).f6560b;
                this.f6599j.v(hVar2.l());
                this.f6599j.M(hVar2);
            }
            this.f6599j.flush();
        }

        public synchronized void f0(t tVar) {
            if (!this.f6601l) {
                int bitCount = Integer.bitCount(tVar.a);
                this.f6597h.v(-2147287036);
                this.f6597h.v((((bitCount * 8) + 4) & ViewCompat.MEASURED_SIZE_MASK) | 0);
                this.f6597h.v(bitCount);
                for (int i2 = 0; i2 <= 10; i2++) {
                    if (tVar.c(i2)) {
                        this.f6597h.v(((tVar.a(i2) & 255) << 24) | (i2 & ViewCompat.MEASURED_SIZE_MASK));
                        this.f6597h.v(tVar.d[i2]);
                    }
                }
                this.f6597h.flush();
            } else {
                throw new IOException("closed");
            }
        }

        public synchronized void flush() {
            if (!this.f6601l) {
                this.f6597h.flush();
            } else {
                throw new IOException("closed");
            }
        }

        public synchronized void g(int i2, long j2) {
            if (this.f6601l) {
                throw new IOException("closed");
            } else if (j2 == 0 || j2 > 2147483647L) {
                throw new IllegalArgumentException("windowSizeIncrement must be between 1 and 0x7fffffff: " + j2);
            } else {
                this.f6597h.v(-2147287031);
                this.f6597h.v(8);
                this.f6597h.v(i2);
                this.f6597h.v((int) j2);
                this.f6597h.flush();
            }
        }

        public void k(t tVar) {
        }

        public synchronized void s(int i2, a aVar) {
            if (this.f6601l) {
                throw new IOException("closed");
            } else if (aVar.f6490i != -1) {
                this.f6597h.v(-2147287037);
                this.f6597h.v(8);
                this.f6597h.v(i2 & ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED);
                this.f6597h.v(aVar.f6490i);
                this.f6597h.flush();
            } else {
                throw new IllegalArgumentException();
            }
        }

        public synchronized void w(int i2, a aVar, byte[] bArr) {
            if (this.f6601l) {
                throw new IOException("closed");
            } else if (aVar.f6491j != -1) {
                this.f6597h.v(-2147287033);
                this.f6597h.v(8);
                this.f6597h.v(i2);
                this.f6597h.v(aVar.f6491j);
                this.f6597h.flush();
            } else {
                throw new IllegalArgumentException("errorCode.spdyGoAwayCode == -1");
            }
        }
    }

    static {
        try {
            a = "\u0000\u0000\u0000\u0007options\u0000\u0000\u0000\u0004head\u0000\u0000\u0000\u0004post\u0000\u0000\u0000\u0003put\u0000\u0000\u0000\u0006delete\u0000\u0000\u0000\u0005trace\u0000\u0000\u0000\u0006accept\u0000\u0000\u0000\u000eaccept-charset\u0000\u0000\u0000\u000faccept-encoding\u0000\u0000\u0000\u000faccept-language\u0000\u0000\u0000\raccept-ranges\u0000\u0000\u0000\u0003age\u0000\u0000\u0000\u0005allow\u0000\u0000\u0000\rauthorization\u0000\u0000\u0000\rcache-control\u0000\u0000\u0000\nconnection\u0000\u0000\u0000\fcontent-base\u0000\u0000\u0000\u0010content-encoding\u0000\u0000\u0000\u0010content-language\u0000\u0000\u0000\u000econtent-length\u0000\u0000\u0000\u0010content-location\u0000\u0000\u0000\u000bcontent-md5\u0000\u0000\u0000\rcontent-range\u0000\u0000\u0000\fcontent-type\u0000\u0000\u0000\u0004date\u0000\u0000\u0000\u0004etag\u0000\u0000\u0000\u0006expect\u0000\u0000\u0000\u0007expires\u0000\u0000\u0000\u0004from\u0000\u0000\u0000\u0004host\u0000\u0000\u0000\bif-match\u0000\u0000\u0000\u0011if-modified-since\u0000\u0000\u0000\rif-none-match\u0000\u0000\u0000\bif-range\u0000\u0000\u0000\u0013if-unmodified-since\u0000\u0000\u0000\rlast-modified\u0000\u0000\u0000\blocation\u0000\u0000\u0000\fmax-forwards\u0000\u0000\u0000\u0006pragma\u0000\u0000\u0000\u0012proxy-authenticate\u0000\u0000\u0000\u0013proxy-authorization\u0000\u0000\u0000\u0005range\u0000\u0000\u0000\u0007referer\u0000\u0000\u0000\u000bretry-after\u0000\u0000\u0000\u0006server\u0000\u0000\u0000\u0002te\u0000\u0000\u0000\u0007trailer\u0000\u0000\u0000\u0011transfer-encoding\u0000\u0000\u0000\u0007upgrade\u0000\u0000\u0000\nuser-agent\u0000\u0000\u0000\u0004vary\u0000\u0000\u0000\u0003via\u0000\u0000\u0000\u0007warning\u0000\u0000\u0000\u0010www-authenticate\u0000\u0000\u0000\u0006method\u0000\u0000\u0000\u0003get\u0000\u0000\u0000\u0006status\u0000\u0000\u0000\u0006200 OK\u0000\u0000\u0000\u0007version\u0000\u0000\u0000\bHTTP/1.1\u0000\u0000\u0000\u0003url\u0000\u0000\u0000\u0006public\u0000\u0000\u0000\nset-cookie\u0000\u0000\u0000\nkeep-alive\u0000\u0000\u0000\u0006origin100101201202205206300302303304305306307402405406407408409410411412413414415416417502504505203 Non-Authoritative Information204 No Content301 Moved Permanently400 Bad Request401 Unauthorized403 Forbidden404 Not Found500 Internal Server Error501 Not Implemented503 Service UnavailableJan Feb Mar Apr May Jun Jul Aug Sept Oct Nov Dec 00:00:00 Mon, Tue, Wed, Thu, Fri, Sat, Sun, GMTchunked,text/html,image/png,image/jpg,image/gif,application/xml,application/xhtml+xml,text/plain,text/javascript,publicprivatemax-age=gzip,deflate,sdchcharset=utf-8charset=iso-8859-1,utf-,*,enq=0.".getBytes(b.p.b.a0.i.c.name());
        } catch (UnsupportedEncodingException unused) {
            throw new AssertionError();
        }
    }

    public b a(g gVar, boolean z) {
        return new a(gVar, z);
    }

    public c b(f fVar, boolean z) {
        return new b(fVar, z);
    }
}
