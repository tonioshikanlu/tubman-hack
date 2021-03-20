package n.m0.j;

import androidx.appcompat.widget.ActivityChooserView;
import androidx.exifinterface.media.ExifInterface;
import e.x.c.i;
import java.io.Closeable;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import n.m0.c;
import n.m0.j.d;
import o.a0;
import o.e;
import o.g;
import o.h;
import o.z;

public final class n implements Closeable {

    /* renamed from: l  reason: collision with root package name */
    public static final Logger f10333l;

    /* renamed from: m  reason: collision with root package name */
    public static final n f10334m = null;

    /* renamed from: h  reason: collision with root package name */
    public final a f10335h;

    /* renamed from: i  reason: collision with root package name */
    public final d.a f10336i;

    /* renamed from: j  reason: collision with root package name */
    public final g f10337j;

    /* renamed from: k  reason: collision with root package name */
    public final boolean f10338k;

    public static final class a implements z {

        /* renamed from: h  reason: collision with root package name */
        public int f10339h;

        /* renamed from: i  reason: collision with root package name */
        public int f10340i;

        /* renamed from: j  reason: collision with root package name */
        public int f10341j;

        /* renamed from: k  reason: collision with root package name */
        public int f10342k;

        /* renamed from: l  reason: collision with root package name */
        public int f10343l;

        /* renamed from: m  reason: collision with root package name */
        public final g f10344m;

        public a(g gVar) {
            i.e(gVar, "source");
            this.f10344m = gVar;
        }

        public long T(e eVar, long j2) {
            int i2;
            int readInt;
            i.e(eVar, "sink");
            do {
                int i3 = this.f10342k;
                if (i3 == 0) {
                    this.f10344m.skip((long) this.f10343l);
                    this.f10343l = 0;
                    if ((this.f10340i & 4) != 0) {
                        return -1;
                    }
                    i2 = this.f10341j;
                    int t = c.t(this.f10344m);
                    this.f10342k = t;
                    this.f10339h = t;
                    byte readByte = this.f10344m.readByte() & ExifInterface.MARKER;
                    this.f10340i = this.f10344m.readByte() & ExifInterface.MARKER;
                    n nVar = n.f10334m;
                    Logger logger = n.f10333l;
                    if (logger.isLoggable(Level.FINE)) {
                        logger.fine(e.f10287e.b(true, this.f10341j, this.f10339h, readByte, this.f10340i));
                    }
                    readInt = this.f10344m.readInt() & ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
                    this.f10341j = readInt;
                    if (readByte != 9) {
                        throw new IOException(readByte + " != TYPE_CONTINUATION");
                    }
                } else {
                    long T = this.f10344m.T(eVar, Math.min(j2, (long) i3));
                    if (T == -1) {
                        return -1;
                    }
                    this.f10342k -= (int) T;
                    return T;
                }
            } while (readInt == i2);
            throw new IOException("TYPE_CONTINUATION streamId changed");
        }

        public void close() {
        }

        public a0 f() {
            return this.f10344m.f();
        }
    }

    public interface b {
        void a();

        void b(boolean z, t tVar);

        void c(boolean z, int i2, int i3);

        void d(boolean z, int i2, g gVar, int i3);

        void f(int i2, int i3, int i4, boolean z);

        void g(int i2, long j2);

        void h(int i2, b bVar);

        void i(boolean z, int i2, int i3, List<c> list);

        void j(int i2, int i3, List<c> list);

        void k(int i2, b bVar, h hVar);
    }

    static {
        Logger logger = Logger.getLogger(e.class.getName());
        i.d(logger, "Logger.getLogger(Http2::class.java.name)");
        f10333l = logger;
    }

    public n(g gVar, boolean z) {
        i.e(gVar, "source");
        this.f10337j = gVar;
        this.f10338k = z;
        a aVar = new a(gVar);
        this.f10335h = aVar;
        this.f10336i = new d.a(aVar, 4096, 0, 4);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v45, resolved type: boolean} */
    /* JADX WARNING: type inference failed for: r2v1 */
    /* JADX WARNING: type inference failed for: r2v6, types: [int] */
    /* JADX WARNING: type inference failed for: r2v13, types: [int] */
    /* JADX WARNING: type inference failed for: r2v36, types: [int] */
    /* JADX WARNING: type inference failed for: r2v46 */
    /* JADX WARNING: type inference failed for: r2v66 */
    /* JADX WARNING: type inference failed for: r2v67 */
    /* JADX WARNING: type inference failed for: r2v68 */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x01d8, code lost:
        throw new java.io.IOException(b.e.a.a.a.g("PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: ", r11));
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean b(boolean r17, n.m0.j.n.b r18) {
        /*
            r16 = this;
            r0 = r16
            r1 = r18
            java.lang.String r2 = "handler"
            e.x.c.i.e(r1, r2)
            r2 = 0
            o.g r3 = r0.f10337j     // Catch:{ EOFException -> 0x0319 }
            r4 = 9
            r3.c0(r4)     // Catch:{ EOFException -> 0x0319 }
            o.g r3 = r0.f10337j
            int r3 = n.m0.c.t(r3)
            r10 = 16384(0x4000, float:2.2959E-41)
            if (r3 > r10) goto L_0x030d
            o.g r4 = r0.f10337j
            byte r4 = r4.readByte()
            r11 = r4 & 255(0xff, float:3.57E-43)
            o.g r4 = r0.f10337j
            byte r4 = r4.readByte()
            r12 = r4 & 255(0xff, float:3.57E-43)
            o.g r4 = r0.f10337j
            int r4 = r4.readInt()
            r13 = 2147483647(0x7fffffff, float:NaN)
            r14 = r4 & r13
            java.util.logging.Logger r15 = f10333l
            java.util.logging.Level r4 = java.util.logging.Level.FINE
            boolean r4 = r15.isLoggable(r4)
            if (r4 == 0) goto L_0x004e
            n.m0.j.e r4 = n.m0.j.e.f10287e
            r5 = 1
            r6 = r14
            r7 = r3
            r8 = r11
            r9 = r12
            java.lang.String r4 = r4.b(r5, r6, r7, r8, r9)
            r15.fine(r4)
        L_0x004e:
            r4 = 4
            if (r17 == 0) goto L_0x006d
            if (r11 != r4) goto L_0x0054
            goto L_0x006d
        L_0x0054:
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r2 = "Expected a SETTINGS frame but was "
            java.lang.StringBuilder r2 = b.e.a.a.a.y(r2)
            n.m0.j.e r3 = n.m0.j.e.f10287e
            java.lang.String r3 = r3.a(r11)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x006d:
            r5 = 14
            r6 = 5
            java.lang.String r7 = " > remaining length "
            java.lang.String r8 = "PROTOCOL_ERROR padding "
            r9 = 8
            r15 = 1
            switch(r11) {
                case 0: goto L_0x02bf;
                case 1: goto L_0x027d;
                case 2: goto L_0x025e;
                case 3: goto L_0x0214;
                case 4: goto L_0x0174;
                case 5: goto L_0x0139;
                case 6: goto L_0x010b;
                case 7: goto L_0x00b1;
                case 8: goto L_0x0082;
                default: goto L_0x007a;
            }
        L_0x007a:
            o.g r1 = r0.f10337j
            long r2 = (long) r3
            r1.skip(r2)
            goto L_0x030c
        L_0x0082:
            if (r3 != r4) goto L_0x00a5
            o.g r2 = r0.f10337j
            int r2 = r2.readInt()
            r3 = 2147483647(0x7fffffff, double:1.060997895E-314)
            byte[] r5 = n.m0.c.a
            long r5 = (long) r2
            long r2 = r5 & r3
            r4 = 0
            int r4 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r4 == 0) goto L_0x009d
            r1.g(r14, r2)
            goto L_0x030c
        L_0x009d:
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r2 = "windowSizeIncrement was 0"
            r1.<init>(r2)
            throw r1
        L_0x00a5:
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r2 = "TYPE_WINDOW_UPDATE length !=4: "
            java.lang.String r2 = b.e.a.a.a.g(r2, r3)
            r1.<init>(r2)
            throw r1
        L_0x00b1:
            if (r3 < r9) goto L_0x00ff
            if (r14 != 0) goto L_0x00f7
            o.g r4 = r0.f10337j
            int r4 = r4.readInt()
            o.g r6 = r0.f10337j
            int r6 = r6.readInt()
            int r3 = r3 - r9
            n.m0.j.b[] r7 = n.m0.j.b.values()
            r8 = r2
        L_0x00c7:
            if (r8 >= r5) goto L_0x00d8
            r9 = r7[r8]
            int r10 = r9.f10269h
            if (r10 != r6) goto L_0x00d1
            r10 = r15
            goto L_0x00d2
        L_0x00d1:
            r10 = r2
        L_0x00d2:
            if (r10 == 0) goto L_0x00d5
            goto L_0x00d9
        L_0x00d5:
            int r8 = r8 + 1
            goto L_0x00c7
        L_0x00d8:
            r9 = 0
        L_0x00d9:
            if (r9 == 0) goto L_0x00eb
            o.h r2 = o.h.f10455k
            if (r3 <= 0) goto L_0x00e6
            o.g r2 = r0.f10337j
            long r5 = (long) r3
            o.h r2 = r2.p(r5)
        L_0x00e6:
            r1.k(r4, r9, r2)
            goto L_0x030c
        L_0x00eb:
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r2 = "TYPE_GOAWAY unexpected error code: "
            java.lang.String r2 = b.e.a.a.a.g(r2, r6)
            r1.<init>(r2)
            throw r1
        L_0x00f7:
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r2 = "TYPE_GOAWAY streamId != 0"
            r1.<init>(r2)
            throw r1
        L_0x00ff:
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r2 = "TYPE_GOAWAY length < 8: "
            java.lang.String r2 = b.e.a.a.a.g(r2, r3)
            r1.<init>(r2)
            throw r1
        L_0x010b:
            if (r3 != r9) goto L_0x012d
            if (r14 != 0) goto L_0x0125
            o.g r3 = r0.f10337j
            int r3 = r3.readInt()
            o.g r4 = r0.f10337j
            int r4 = r4.readInt()
            r5 = r12 & 1
            if (r5 == 0) goto L_0x0120
            r2 = r15
        L_0x0120:
            r1.c(r2, r3, r4)
            goto L_0x030c
        L_0x0125:
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r2 = "TYPE_PING streamId != 0"
            r1.<init>(r2)
            throw r1
        L_0x012d:
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r2 = "TYPE_PING length != 8: "
            java.lang.String r2 = b.e.a.a.a.g(r2, r3)
            r1.<init>(r2)
            throw r1
        L_0x0139:
            if (r14 == 0) goto L_0x016c
            r4 = r12 & 8
            if (r4 == 0) goto L_0x0149
            o.g r2 = r0.f10337j
            byte r2 = r2.readByte()
            byte[] r5 = n.m0.c.a
            r2 = r2 & 255(0xff, float:3.57E-43)
        L_0x0149:
            o.g r5 = r0.f10337j
            int r5 = r5.readInt()
            r5 = r5 & r13
            int r3 = r3 + -4
            if (r4 == 0) goto L_0x0156
            int r3 = r3 + -1
        L_0x0156:
            if (r2 > r3) goto L_0x0162
            int r3 = r3 - r2
            java.util.List r2 = r0.q(r3, r2, r12, r14)
            r1.j(r14, r5, r2)
            goto L_0x030c
        L_0x0162:
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r2 = b.e.a.a.a.i(r8, r2, r7, r3)
            r1.<init>(r2)
            throw r1
        L_0x016c:
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r2 = "PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0"
            r1.<init>(r2)
            throw r1
        L_0x0174:
            if (r14 != 0) goto L_0x020c
            r5 = r12 & 1
            if (r5 == 0) goto L_0x0189
            if (r3 != 0) goto L_0x0181
            r18.a()
            goto L_0x030c
        L_0x0181:
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r2 = "FRAME_SIZE_ERROR ack frame should be empty!"
            r1.<init>(r2)
            throw r1
        L_0x0189:
            int r5 = r3 % 6
            if (r5 != 0) goto L_0x0200
            n.m0.j.t r5 = new n.m0.j.t
            r5.<init>()
            e.a0.d r3 = e.a0.e.d(r2, r3)
            r7 = 6
            e.a0.b r3 = e.a0.e.c(r3, r7)
            int r7 = r3.f7883h
            int r8 = r3.f7884i
            int r3 = r3.f7885j
            if (r3 < 0) goto L_0x01a6
            if (r7 > r8) goto L_0x01fb
            goto L_0x01a8
        L_0x01a6:
            if (r7 < r8) goto L_0x01fb
        L_0x01a8:
            o.g r9 = r0.f10337j
            short r9 = r9.readShort()
            r11 = 65535(0xffff, float:9.1834E-41)
            byte[] r12 = n.m0.c.a
            r9 = r9 & r11
            o.g r11 = r0.f10337j
            int r11 = r11.readInt()
            r12 = 2
            if (r9 == r12) goto L_0x01e7
            r12 = 3
            if (r9 == r12) goto L_0x01e5
            if (r9 == r4) goto L_0x01d9
            if (r9 == r6) goto L_0x01c5
            goto L_0x01f4
        L_0x01c5:
            if (r11 < r10) goto L_0x01cd
            r12 = 16777215(0xffffff, float:2.3509886E-38)
            if (r11 > r12) goto L_0x01cd
            goto L_0x01f4
        L_0x01cd:
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r2 = "PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: "
            java.lang.String r2 = b.e.a.a.a.g(r2, r11)
            r1.<init>(r2)
            throw r1
        L_0x01d9:
            r9 = 7
            if (r11 < 0) goto L_0x01dd
            goto L_0x01f4
        L_0x01dd:
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r2 = "PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1"
            r1.<init>(r2)
            throw r1
        L_0x01e5:
            r9 = r4
            goto L_0x01f4
        L_0x01e7:
            if (r11 == 0) goto L_0x01f4
            if (r11 != r15) goto L_0x01ec
            goto L_0x01f4
        L_0x01ec:
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r2 = "PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1"
            r1.<init>(r2)
            throw r1
        L_0x01f4:
            r5.c(r9, r11)
            if (r7 == r8) goto L_0x01fb
            int r7 = r7 + r3
            goto L_0x01a8
        L_0x01fb:
            r1.b(r2, r5)
            goto L_0x030c
        L_0x0200:
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r2 = "TYPE_SETTINGS length % 6 != 0: "
            java.lang.String r2 = b.e.a.a.a.g(r2, r3)
            r1.<init>(r2)
            throw r1
        L_0x020c:
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r2 = "TYPE_SETTINGS streamId != 0"
            r1.<init>(r2)
            throw r1
        L_0x0214:
            if (r3 != r4) goto L_0x0250
            if (r14 == 0) goto L_0x0248
            o.g r3 = r0.f10337j
            int r3 = r3.readInt()
            n.m0.j.b[] r4 = n.m0.j.b.values()
            r6 = r2
        L_0x0223:
            if (r6 >= r5) goto L_0x0234
            r7 = r4[r6]
            int r8 = r7.f10269h
            if (r8 != r3) goto L_0x022d
            r8 = r15
            goto L_0x022e
        L_0x022d:
            r8 = r2
        L_0x022e:
            if (r8 == 0) goto L_0x0231
            goto L_0x0235
        L_0x0231:
            int r6 = r6 + 1
            goto L_0x0223
        L_0x0234:
            r7 = 0
        L_0x0235:
            if (r7 == 0) goto L_0x023c
            r1.h(r14, r7)
            goto L_0x030c
        L_0x023c:
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r2 = "TYPE_RST_STREAM unexpected error code: "
            java.lang.String r2 = b.e.a.a.a.g(r2, r3)
            r1.<init>(r2)
            throw r1
        L_0x0248:
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r2 = "TYPE_RST_STREAM streamId == 0"
            r1.<init>(r2)
            throw r1
        L_0x0250:
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r2 = "TYPE_RST_STREAM length: "
            java.lang.String r4 = " != 4"
            java.lang.String r2 = b.e.a.a.a.h(r2, r3, r4)
            r1.<init>(r2)
            throw r1
        L_0x025e:
            if (r3 != r6) goto L_0x026f
            if (r14 == 0) goto L_0x0267
            r0.z(r1, r14)
            goto L_0x030c
        L_0x0267:
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r2 = "TYPE_PRIORITY streamId == 0"
            r1.<init>(r2)
            throw r1
        L_0x026f:
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r2 = "TYPE_PRIORITY length: "
            java.lang.String r4 = " != 5"
            java.lang.String r2 = b.e.a.a.a.h(r2, r3, r4)
            r1.<init>(r2)
            throw r1
        L_0x027d:
            if (r14 == 0) goto L_0x02b7
            r4 = r12 & 1
            if (r4 == 0) goto L_0x0285
            r4 = r15
            goto L_0x0286
        L_0x0285:
            r4 = r2
        L_0x0286:
            r5 = r12 & 8
            if (r5 == 0) goto L_0x0294
            o.g r2 = r0.f10337j
            byte r2 = r2.readByte()
            byte[] r6 = n.m0.c.a
            r2 = r2 & 255(0xff, float:3.57E-43)
        L_0x0294:
            r6 = r12 & 32
            if (r6 == 0) goto L_0x029d
            r0.z(r1, r14)
            int r3 = r3 + -5
        L_0x029d:
            if (r5 == 0) goto L_0x02a1
            int r3 = r3 + -1
        L_0x02a1:
            if (r2 > r3) goto L_0x02ad
            int r3 = r3 - r2
            java.util.List r2 = r0.q(r3, r2, r12, r14)
            r3 = -1
            r1.i(r4, r14, r3, r2)
            goto L_0x030c
        L_0x02ad:
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r2 = b.e.a.a.a.i(r8, r2, r7, r3)
            r1.<init>(r2)
            throw r1
        L_0x02b7:
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r2 = "PROTOCOL_ERROR: TYPE_HEADERS streamId == 0"
            r1.<init>(r2)
            throw r1
        L_0x02bf:
            if (r14 == 0) goto L_0x0304
            r4 = r12 & 1
            if (r4 == 0) goto L_0x02c7
            r4 = r15
            goto L_0x02c8
        L_0x02c7:
            r4 = r2
        L_0x02c8:
            r5 = r12 & 32
            if (r5 == 0) goto L_0x02ce
            r5 = r15
            goto L_0x02cf
        L_0x02ce:
            r5 = r2
        L_0x02cf:
            if (r5 != 0) goto L_0x02fc
            r5 = r12 & 8
            if (r5 == 0) goto L_0x02df
            o.g r2 = r0.f10337j
            byte r2 = r2.readByte()
            byte[] r6 = n.m0.c.a
            r2 = r2 & 255(0xff, float:3.57E-43)
        L_0x02df:
            if (r5 == 0) goto L_0x02e3
            int r3 = r3 + -1
        L_0x02e3:
            if (r2 > r3) goto L_0x02f2
            int r3 = r3 - r2
            o.g r5 = r0.f10337j
            r1.d(r4, r14, r5, r3)
            o.g r1 = r0.f10337j
            long r2 = (long) r2
            r1.skip(r2)
            goto L_0x030c
        L_0x02f2:
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r2 = b.e.a.a.a.i(r8, r2, r7, r3)
            r1.<init>(r2)
            throw r1
        L_0x02fc:
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r2 = "PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA"
            r1.<init>(r2)
            throw r1
        L_0x0304:
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r2 = "PROTOCOL_ERROR: TYPE_DATA streamId == 0"
            r1.<init>(r2)
            throw r1
        L_0x030c:
            return r15
        L_0x030d:
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r2 = "FRAME_SIZE_ERROR: "
            java.lang.String r2 = b.e.a.a.a.g(r2, r3)
            r1.<init>(r2)
            throw r1
        L_0x0319:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: n.m0.j.n.b(boolean, n.m0.j.n$b):boolean");
    }

    public void close() {
        this.f10337j.close();
    }

    public final void e(b bVar) {
        i.e(bVar, "handler");
        if (!this.f10338k) {
            g gVar = this.f10337j;
            h hVar = e.a;
            h p2 = gVar.p((long) hVar.l());
            Logger logger = f10333l;
            if (logger.isLoggable(Level.FINE)) {
                StringBuilder y = b.e.a.a.a.y("<< CONNECTION ");
                y.append(p2.m());
                logger.fine(c.i(y.toString(), new Object[0]));
            }
            if (!i.a(hVar, p2)) {
                StringBuilder y2 = b.e.a.a.a.y("Expected a connection header but was ");
                y2.append(p2.y());
                throw new IOException(y2.toString());
            }
        } else if (!b(true, bVar)) {
            throw new IOException("Required SETTINGS preface not received");
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x004b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<n.m0.j.c> q(int r3, int r4, int r5, int r6) {
        /*
            r2 = this;
            n.m0.j.n$a r0 = r2.f10335h
            r0.f10342k = r3
            r0.f10339h = r3
            r0.f10343l = r4
            r0.f10340i = r5
            r0.f10341j = r6
            n.m0.j.d$a r3 = r2.f10336i
        L_0x000e:
            o.g r4 = r3.f10276b
            boolean r4 = r4.D()
            if (r4 != 0) goto L_0x0132
            o.g r4 = r3.f10276b
            byte r4 = r4.readByte()
            byte[] r5 = n.m0.c.a
            r4 = r4 & 255(0xff, float:3.57E-43)
            r5 = 128(0x80, float:1.794E-43)
            if (r4 == r5) goto L_0x012a
            r6 = r4 & 128(0x80, float:1.794E-43)
            r0 = 1
            if (r6 != r5) goto L_0x007c
            r5 = 127(0x7f, float:1.78E-43)
            int r4 = r3.g(r4, r5)
            int r4 = r4 - r0
            if (r4 < 0) goto L_0x003c
            n.m0.j.d r5 = n.m0.j.d.c
            n.m0.j.c[] r5 = n.m0.j.d.a
            int r5 = r5.length
            int r5 = r5 - r0
            if (r4 > r5) goto L_0x003c
            r5 = r0
            goto L_0x003d
        L_0x003c:
            r5 = 0
        L_0x003d:
            if (r5 == 0) goto L_0x004b
            n.m0.j.d r5 = n.m0.j.d.c
            n.m0.j.c[] r5 = n.m0.j.d.a
            r4 = r5[r4]
            java.util.List<n.m0.j.c> r5 = r3.a
            r5.add(r4)
            goto L_0x000e
        L_0x004b:
            n.m0.j.d r5 = n.m0.j.d.c
            n.m0.j.c[] r5 = n.m0.j.d.a
            int r5 = r5.length
            int r5 = r4 - r5
            int r5 = r3.b(r5)
            if (r5 < 0) goto L_0x0068
            n.m0.j.c[] r6 = r3.c
            int r1 = r6.length
            if (r5 >= r1) goto L_0x0068
            java.util.List<n.m0.j.c> r4 = r3.a
            r5 = r6[r5]
            e.x.c.i.c(r5)
            r4.add(r5)
            goto L_0x000e
        L_0x0068:
            java.io.IOException r3 = new java.io.IOException
            java.lang.String r5 = "Header index too large "
            java.lang.StringBuilder r5 = b.e.a.a.a.y(r5)
            int r4 = r4 + r0
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            r3.<init>(r4)
            throw r3
        L_0x007c:
            r5 = -1
            r6 = 64
            if (r4 != r6) goto L_0x0098
            n.m0.j.d r4 = n.m0.j.d.c
            o.h r6 = r3.f()
            r4.a(r6)
            o.h r4 = r3.f()
            n.m0.j.c r0 = new n.m0.j.c
            r0.<init>((o.h) r6, (o.h) r4)
            r3.e(r5, r0)
            goto L_0x000e
        L_0x0098:
            r1 = r4 & 64
            if (r1 != r6) goto L_0x00b5
            r6 = 63
            int r4 = r3.g(r4, r6)
            int r4 = r4 - r0
            o.h r4 = r3.d(r4)
            o.h r6 = r3.f()
            n.m0.j.c r0 = new n.m0.j.c
            r0.<init>((o.h) r4, (o.h) r6)
            r3.e(r5, r0)
            goto L_0x000e
        L_0x00b5:
            r5 = r4 & 32
            r6 = 32
            if (r5 != r6) goto L_0x00ef
            r5 = 31
            int r4 = r3.g(r4, r5)
            r3.f10279h = r4
            if (r4 < 0) goto L_0x00da
            int r5 = r3.f10278g
            if (r4 > r5) goto L_0x00da
            int r5 = r3.f
            if (r4 >= r5) goto L_0x000e
            if (r4 != 0) goto L_0x00d4
            r3.a()
            goto L_0x000e
        L_0x00d4:
            int r5 = r5 - r4
            r3.c(r5)
            goto L_0x000e
        L_0x00da:
            java.io.IOException r4 = new java.io.IOException
            java.lang.String r5 = "Invalid dynamic table size update "
            java.lang.StringBuilder r5 = b.e.a.a.a.y(r5)
            int r3 = r3.f10279h
            r5.append(r3)
            java.lang.String r3 = r5.toString()
            r4.<init>(r3)
            throw r4
        L_0x00ef:
            r5 = 16
            if (r4 == r5) goto L_0x0111
            if (r4 != 0) goto L_0x00f6
            goto L_0x0111
        L_0x00f6:
            r5 = 15
            int r4 = r3.g(r4, r5)
            int r4 = r4 - r0
            o.h r4 = r3.d(r4)
            o.h r5 = r3.f()
            java.util.List<n.m0.j.c> r6 = r3.a
            n.m0.j.c r0 = new n.m0.j.c
            r0.<init>((o.h) r4, (o.h) r5)
            r6.add(r0)
            goto L_0x000e
        L_0x0111:
            n.m0.j.d r4 = n.m0.j.d.c
            o.h r5 = r3.f()
            r4.a(r5)
            o.h r4 = r3.f()
            java.util.List<n.m0.j.c> r6 = r3.a
            n.m0.j.c r0 = new n.m0.j.c
            r0.<init>((o.h) r5, (o.h) r4)
            r6.add(r0)
            goto L_0x000e
        L_0x012a:
            java.io.IOException r3 = new java.io.IOException
            java.lang.String r4 = "index == 0"
            r3.<init>(r4)
            throw r3
        L_0x0132:
            n.m0.j.d$a r3 = r2.f10336i
            java.util.List<n.m0.j.c> r4 = r3.a
            java.util.List r4 = e.t.g.W(r4)
            java.util.List<n.m0.j.c> r3 = r3.a
            r3.clear()
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: n.m0.j.n.q(int, int, int, int):java.util.List");
    }

    public final void z(b bVar, int i2) {
        int readInt = this.f10337j.readInt();
        boolean z = (((int) 2147483648L) & readInt) != 0;
        int i3 = readInt & ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
        byte readByte = this.f10337j.readByte();
        byte[] bArr = c.a;
        bVar.f(i2, i3, (readByte & ExifInterface.MARKER) + 1, z);
    }
}
