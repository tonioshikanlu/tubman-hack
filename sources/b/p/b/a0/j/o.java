package b.p.b.a0.j;

import androidx.appcompat.widget.ActivityChooserView;
import androidx.exifinterface.media.ExifInterface;
import b.p.b.a0.j.n;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;
import o.a0;
import o.e;
import o.f;
import o.g;
import o.h;
import o.z;

public final class o implements v {
    public static final Logger a = Logger.getLogger(b.class.getName());

    /* renamed from: b  reason: collision with root package name */
    public static final h f6571b = h.j("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");

    public static final class a implements z {

        /* renamed from: h  reason: collision with root package name */
        public final g f6572h;

        /* renamed from: i  reason: collision with root package name */
        public int f6573i;

        /* renamed from: j  reason: collision with root package name */
        public byte f6574j;

        /* renamed from: k  reason: collision with root package name */
        public int f6575k;

        /* renamed from: l  reason: collision with root package name */
        public int f6576l;

        /* renamed from: m  reason: collision with root package name */
        public short f6577m;

        public a(g gVar) {
            this.f6572h = gVar;
        }

        public long T(e eVar, long j2) {
            int i2;
            int readInt;
            do {
                int i3 = this.f6576l;
                if (i3 == 0) {
                    this.f6572h.skip((long) this.f6577m);
                    this.f6577m = 0;
                    if ((this.f6574j & 4) != 0) {
                        return -1;
                    }
                    i2 = this.f6575k;
                    int d = o.d(this.f6572h);
                    this.f6576l = d;
                    this.f6573i = d;
                    byte readByte = (byte) (this.f6572h.readByte() & ExifInterface.MARKER);
                    this.f6574j = (byte) (this.f6572h.readByte() & ExifInterface.MARKER);
                    Logger logger = o.a;
                    if (logger.isLoggable(Level.FINE)) {
                        logger.fine(b.a(true, this.f6575k, this.f6573i, readByte, this.f6574j));
                    }
                    readInt = this.f6572h.readInt() & ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
                    this.f6575k = readInt;
                    if (readByte != 9) {
                        o.c("%s != TYPE_CONTINUATION", new Object[]{Byte.valueOf(readByte)});
                        throw null;
                    }
                } else {
                    long T = this.f6572h.T(eVar, Math.min(j2, (long) i3));
                    if (T == -1) {
                        return -1;
                    }
                    this.f6576l = (int) (((long) this.f6576l) - T);
                    return T;
                }
            } while (readInt == i2);
            o.c("TYPE_CONTINUATION streamId changed", new Object[0]);
            throw null;
        }

        public void close() {
        }

        public a0 f() {
            return this.f6572h.f();
        }
    }

    public static final class b {
        public static final String[] a = {"DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};

        /* renamed from: b  reason: collision with root package name */
        public static final String[] f6578b = new String[64];
        public static final String[] c = new String[256];

        static {
            int i2 = 0;
            int i3 = 0;
            while (true) {
                String[] strArr = c;
                if (i3 >= strArr.length) {
                    break;
                }
                strArr[i3] = String.format("%8s", new Object[]{Integer.toBinaryString(i3)}).replace(' ', '0');
                i3++;
            }
            String[] strArr2 = f6578b;
            strArr2[0] = "";
            strArr2[1] = "END_STREAM";
            int[] iArr = {1};
            strArr2[8] = "PADDED";
            for (int i4 = 0; i4 < 1; i4++) {
                int i5 = iArr[i4];
                String[] strArr3 = f6578b;
                strArr3[i5 | 8] = b.e.a.a.a.q(new StringBuilder(), strArr3[i5], "|PADDED");
            }
            String[] strArr4 = f6578b;
            strArr4[4] = "END_HEADERS";
            strArr4[32] = "PRIORITY";
            strArr4[36] = "END_HEADERS|PRIORITY";
            int[] iArr2 = {4, 32, 36};
            for (int i6 = 0; i6 < 3; i6++) {
                int i7 = iArr2[i6];
                for (int i8 = 0; i8 < 1; i8++) {
                    int i9 = iArr[i8];
                    String[] strArr5 = f6578b;
                    int i10 = i9 | i7;
                    strArr5[i10] = strArr5[i9] + '|' + strArr5[i7];
                    StringBuilder sb = new StringBuilder();
                    sb.append(strArr5[i9]);
                    sb.append('|');
                    strArr5[i10 | 8] = b.e.a.a.a.q(sb, strArr5[i7], "|PADDED");
                }
            }
            while (true) {
                String[] strArr6 = f6578b;
                if (i2 < strArr6.length) {
                    if (strArr6[i2] == null) {
                        strArr6[i2] = c[i2];
                    }
                    i2++;
                } else {
                    return;
                }
            }
        }

        public static String a(boolean z, int i2, int i3, byte b2, byte b3) {
            String str;
            String str2;
            String str3;
            String[] strArr = a;
            String format = b2 < strArr.length ? strArr[b2] : String.format("0x%02x", new Object[]{Byte.valueOf(b2)});
            String[] strArr2 = c;
            if (b3 == 0) {
                str = "";
            } else {
                if (!(b2 == 2 || b2 == 3)) {
                    if (b2 == 4 || b2 == 6) {
                        str = b3 == 1 ? "ACK" : strArr2[b3];
                    } else if (!(b2 == 7 || b2 == 8)) {
                        String[] strArr3 = f6578b;
                        String str4 = b3 < strArr3.length ? strArr3[b3] : strArr2[b3];
                        if (b2 == 5 && (b3 & 4) != 0) {
                            str3 = "HEADERS";
                            str2 = "PUSH_PROMISE";
                        } else if (b2 != 0 || (b3 & 32) == 0) {
                            str = str4;
                        } else {
                            str3 = "PRIORITY";
                            str2 = "COMPRESSED";
                        }
                        str = str4.replace(str3, str2);
                    }
                }
                str = strArr2[b3];
            }
            Object[] objArr = new Object[5];
            objArr[0] = z ? "<<" : ">>";
            objArr[1] = Integer.valueOf(i2);
            objArr[2] = Integer.valueOf(i3);
            objArr[3] = format;
            objArr[4] = str;
            return String.format("%s 0x%08x %5d %-13s %s", objArr);
        }
    }

    public static final class c implements b {

        /* renamed from: h  reason: collision with root package name */
        public final g f6579h;

        /* renamed from: i  reason: collision with root package name */
        public final a f6580i;

        /* renamed from: j  reason: collision with root package name */
        public final boolean f6581j;

        /* renamed from: k  reason: collision with root package name */
        public final n.a f6582k;

        public c(g gVar, int i2, boolean z) {
            this.f6579h = gVar;
            this.f6581j = z;
            a aVar = new a(gVar);
            this.f6580i = aVar;
            this.f6582k = new n.a(i2, aVar);
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v0, resolved type: boolean} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: boolean} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: short} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v8, resolved type: boolean} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v12, resolved type: short} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v44, resolved type: boolean} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v45, resolved type: boolean} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v58, resolved type: boolean} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v59, resolved type: boolean} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean a0(b.p.b.a0.j.b.a r21) {
            /*
                r20 = this;
                r1 = r20
                r0 = 0
                o.g r2 = r1.f6579h     // Catch:{ IOException -> 0x0336 }
                r3 = 9
                r2.c0(r3)     // Catch:{ IOException -> 0x0336 }
                o.g r2 = r1.f6579h
                int r2 = b.p.b.a0.j.o.d(r2)
                r3 = 1
                r4 = 0
                if (r2 < 0) goto L_0x0328
                r5 = 16384(0x4000, float:2.2959E-41)
                if (r2 > r5) goto L_0x0328
                o.g r6 = r1.f6579h
                byte r6 = r6.readByte()
                r6 = r6 & 255(0xff, float:3.57E-43)
                byte r6 = (byte) r6
                o.g r7 = r1.f6579h
                byte r7 = r7.readByte()
                r7 = r7 & 255(0xff, float:3.57E-43)
                byte r7 = (byte) r7
                o.g r8 = r1.f6579h
                int r8 = r8.readInt()
                r9 = 2147483647(0x7fffffff, float:NaN)
                r13 = r8 & r9
                java.util.logging.Logger r8 = b.p.b.a0.j.o.a
                java.util.logging.Level r10 = java.util.logging.Level.FINE
                boolean r10 = r8.isLoggable(r10)
                if (r10 == 0) goto L_0x0046
                java.lang.String r10 = b.p.b.a0.j.o.b.a(r3, r13, r2, r6, r7)
                r8.fine(r10)
            L_0x0046:
                r8 = 2
                r10 = 4
                r11 = 8
                switch(r6) {
                    case 0: goto L_0x02ee;
                    case 1: goto L_0x02a8;
                    case 2: goto L_0x027d;
                    case 3: goto L_0x0240;
                    case 4: goto L_0x0181;
                    case 5: goto L_0x0110;
                    case 6: goto L_0x00dc;
                    case 7: goto L_0x008d;
                    case 8: goto L_0x0055;
                    default: goto L_0x004d;
                }
            L_0x004d:
                o.g r0 = r1.f6579h
                long r4 = (long) r2
                r0.skip(r4)
                goto L_0x0327
            L_0x0055:
                if (r2 != r10) goto L_0x007f
                o.g r2 = r1.f6579h
                int r2 = r2.readInt()
                long r5 = (long) r2
                r7 = 2147483647(0x7fffffff, double:1.060997895E-314)
                long r5 = r5 & r7
                r7 = 0
                int r2 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
                if (r2 == 0) goto L_0x0071
                r0 = r21
                b.p.b.a0.j.d$e r0 = (b.p.b.a0.j.d.e) r0
                r0.h(r13, r5)
                goto L_0x0327
            L_0x0071:
                java.lang.Object[] r2 = new java.lang.Object[r3]
                java.lang.Long r3 = java.lang.Long.valueOf(r5)
                r2[r0] = r3
                java.lang.String r0 = "windowSizeIncrement was 0"
                b.p.b.a0.j.o.c(r0, r2)
                throw r4
            L_0x007f:
                java.lang.Object[] r3 = new java.lang.Object[r3]
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                r3[r0] = r2
                java.lang.String r0 = "TYPE_WINDOW_UPDATE length !=4: %s"
                b.p.b.a0.j.o.c(r0, r3)
                throw r4
            L_0x008d:
                if (r2 < r11) goto L_0x00ce
                if (r13 != 0) goto L_0x00c6
                o.g r5 = r1.f6579h
                int r5 = r5.readInt()
                o.g r6 = r1.f6579h
                int r6 = r6.readInt()
                int r2 = r2 - r11
                b.p.b.a0.j.a r7 = b.p.b.a0.j.a.d(r6)
                if (r7 == 0) goto L_0x00b8
                o.h r0 = o.h.f10455k
                if (r2 <= 0) goto L_0x00af
                o.g r0 = r1.f6579h
                long r8 = (long) r2
                o.h r0 = r0.p(r8)
            L_0x00af:
                r2 = r21
                b.p.b.a0.j.d$e r2 = (b.p.b.a0.j.d.e) r2
                r2.c(r5, r7, r0)
                goto L_0x0327
            L_0x00b8:
                java.lang.Object[] r2 = new java.lang.Object[r3]
                java.lang.Integer r3 = java.lang.Integer.valueOf(r6)
                r2[r0] = r3
                java.lang.String r0 = "TYPE_GOAWAY unexpected error code: %d"
                b.p.b.a0.j.o.c(r0, r2)
                throw r4
            L_0x00c6:
                java.lang.Object[] r0 = new java.lang.Object[r0]
                java.lang.String r2 = "TYPE_GOAWAY streamId != 0"
                b.p.b.a0.j.o.c(r2, r0)
                throw r4
            L_0x00ce:
                java.lang.Object[] r3 = new java.lang.Object[r3]
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                r3[r0] = r2
                java.lang.String r0 = "TYPE_GOAWAY length < 8: %s"
                b.p.b.a0.j.o.c(r0, r3)
                throw r4
            L_0x00dc:
                if (r2 != r11) goto L_0x0102
                if (r13 != 0) goto L_0x00fa
                o.g r2 = r1.f6579h
                int r2 = r2.readInt()
                o.g r4 = r1.f6579h
                int r4 = r4.readInt()
                r5 = r7 & 1
                if (r5 == 0) goto L_0x00f1
                r0 = r3
            L_0x00f1:
                r5 = r21
                b.p.b.a0.j.d$e r5 = (b.p.b.a0.j.d.e) r5
                r5.e(r0, r2, r4)
                goto L_0x0327
            L_0x00fa:
                java.lang.Object[] r0 = new java.lang.Object[r0]
                java.lang.String r2 = "TYPE_PING streamId != 0"
                b.p.b.a0.j.o.c(r2, r0)
                throw r4
            L_0x0102:
                java.lang.Object[] r3 = new java.lang.Object[r3]
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                r3[r0] = r2
                java.lang.String r0 = "TYPE_PING length != 8: %s"
                b.p.b.a0.j.o.c(r0, r3)
                throw r4
            L_0x0110:
                if (r13 == 0) goto L_0x0179
                r4 = r7 & 8
                if (r4 == 0) goto L_0x0120
                o.g r4 = r1.f6579h
                byte r4 = r4.readByte()
                r4 = r4 & 255(0xff, float:3.57E-43)
                short r4 = (short) r4
                goto L_0x0121
            L_0x0120:
                r4 = r0
            L_0x0121:
                o.g r5 = r1.f6579h
                int r5 = r5.readInt()
                r5 = r5 & r9
                int r2 = r2 + -4
                int r2 = b.p.b.a0.j.o.e(r2, r7, r4)
                java.util.List r19 = r1.b(r2, r4, r7, r13)
                r2 = r21
                b.p.b.a0.j.d$e r2 = (b.p.b.a0.j.d.e) r2
                b.p.b.a0.j.d r15 = b.p.b.a0.j.d.this
                monitor-enter(r15)
                java.util.Set<java.lang.Integer> r2 = r15.A     // Catch:{ all -> 0x0176 }
                java.lang.Integer r4 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x0176 }
                boolean r2 = r2.contains(r4)     // Catch:{ all -> 0x0176 }
                if (r2 == 0) goto L_0x014d
                b.p.b.a0.j.a r0 = b.p.b.a0.j.a.PROTOCOL_ERROR     // Catch:{ all -> 0x0176 }
                r15.S(r5, r0)     // Catch:{ all -> 0x0176 }
                monitor-exit(r15)     // Catch:{ all -> 0x0176 }
                goto L_0x0327
            L_0x014d:
                java.util.Set<java.lang.Integer> r2 = r15.A     // Catch:{ all -> 0x0176 }
                java.lang.Integer r4 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x0176 }
                r2.add(r4)     // Catch:{ all -> 0x0176 }
                monitor-exit(r15)     // Catch:{ all -> 0x0176 }
                java.util.concurrent.ExecutorService r2 = r15.f6500p
                b.p.b.a0.j.f r4 = new b.p.b.a0.j.f
                java.lang.String r16 = "OkHttp %s Push Request[%s]"
                java.lang.Object[] r6 = new java.lang.Object[r8]
                java.lang.String r7 = r15.f6496l
                r6[r0] = r7
                java.lang.Integer r0 = java.lang.Integer.valueOf(r5)
                r6[r3] = r0
                r14 = r4
                r17 = r6
                r18 = r5
                r14.<init>(r15, r16, r17, r18, r19)
                r2.execute(r4)
                goto L_0x0327
            L_0x0176:
                r0 = move-exception
                monitor-exit(r15)     // Catch:{ all -> 0x0176 }
                throw r0
            L_0x0179:
                java.lang.String r2 = "PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0"
                java.lang.Object[] r0 = new java.lang.Object[r0]
                b.p.b.a0.j.o.c(r2, r0)
                throw r4
            L_0x0181:
                if (r13 != 0) goto L_0x0238
                r6 = r7 & 1
                if (r6 == 0) goto L_0x0197
                if (r2 != 0) goto L_0x018f
                r0 = r21
                b.p.b.a0.j.d$e r0 = (b.p.b.a0.j.d.e) r0
                goto L_0x0327
            L_0x018f:
                java.lang.Object[] r0 = new java.lang.Object[r0]
                java.lang.String r2 = "FRAME_SIZE_ERROR ack frame should be empty!"
                b.p.b.a0.j.o.c(r2, r0)
                throw r4
            L_0x0197:
                int r6 = r2 % 6
                if (r6 != 0) goto L_0x022a
                b.p.b.a0.j.t r6 = new b.p.b.a0.j.t
                r6.<init>()
                r7 = r0
            L_0x01a1:
                if (r7 >= r2) goto L_0x01f8
                o.g r9 = r1.f6579h
                short r9 = r9.readShort()
                o.g r11 = r1.f6579h
                int r11 = r11.readInt()
                switch(r9) {
                    case 1: goto L_0x01f1;
                    case 2: goto L_0x01e4;
                    case 3: goto L_0x01e2;
                    case 4: goto L_0x01d6;
                    case 5: goto L_0x01c0;
                    case 6: goto L_0x01f1;
                    default: goto L_0x01b2;
                }
            L_0x01b2:
                java.lang.Object[] r2 = new java.lang.Object[r3]
                java.lang.Short r3 = java.lang.Short.valueOf(r9)
                r2[r0] = r3
                java.lang.String r0 = "PROTOCOL_ERROR invalid settings id: %s"
                b.p.b.a0.j.o.c(r0, r2)
                goto L_0x01f7
            L_0x01c0:
                if (r11 < r5) goto L_0x01c8
                r12 = 16777215(0xffffff, float:2.3509886E-38)
                if (r11 > r12) goto L_0x01c8
                goto L_0x01f1
            L_0x01c8:
                java.lang.Object[] r2 = new java.lang.Object[r3]
                java.lang.Integer r3 = java.lang.Integer.valueOf(r11)
                r2[r0] = r3
                java.lang.String r0 = "PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: %s"
                b.p.b.a0.j.o.c(r0, r2)
                throw r4
            L_0x01d6:
                r9 = 7
                if (r11 < 0) goto L_0x01da
                goto L_0x01f1
            L_0x01da:
                java.lang.Object[] r0 = new java.lang.Object[r0]
                java.lang.String r2 = "PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1"
                b.p.b.a0.j.o.c(r2, r0)
                throw r4
            L_0x01e2:
                r9 = r10
                goto L_0x01f1
            L_0x01e4:
                if (r11 == 0) goto L_0x01f1
                if (r11 != r3) goto L_0x01e9
                goto L_0x01f1
            L_0x01e9:
                java.lang.Object[] r0 = new java.lang.Object[r0]
                java.lang.String r2 = "PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1"
                b.p.b.a0.j.o.c(r2, r0)
                throw r4
            L_0x01f1:
                r6.d(r9, r0, r11)
                int r7 = r7 + 6
                goto L_0x01a1
            L_0x01f7:
                throw r4
            L_0x01f8:
                r2 = r21
                b.p.b.a0.j.d$e r2 = (b.p.b.a0.j.d.e) r2
                r2.g(r0, r6)
                int r0 = r6.a
                r0 = r0 & r8
                r2 = -1
                if (r0 == 0) goto L_0x020a
                int[] r4 = r6.d
                r4 = r4[r3]
                goto L_0x020b
            L_0x020a:
                r4 = r2
            L_0x020b:
                if (r4 < 0) goto L_0x0327
                b.p.b.a0.j.n$a r4 = r1.f6582k
                if (r0 == 0) goto L_0x0215
                int[] r0 = r6.d
                r2 = r0[r3]
            L_0x0215:
                r4.c = r2
                r4.d = r2
                int r0 = r4.f6570h
                if (r2 >= r0) goto L_0x0327
                if (r2 != 0) goto L_0x0224
                r4.a()
                goto L_0x0327
            L_0x0224:
                int r0 = r0 - r2
                r4.c(r0)
                goto L_0x0327
            L_0x022a:
                java.lang.Object[] r3 = new java.lang.Object[r3]
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                r3[r0] = r2
                java.lang.String r0 = "TYPE_SETTINGS length %% 6 != 0: %s"
                b.p.b.a0.j.o.c(r0, r3)
                throw r4
            L_0x0238:
                java.lang.Object[] r0 = new java.lang.Object[r0]
                java.lang.String r2 = "TYPE_SETTINGS streamId != 0"
                b.p.b.a0.j.o.c(r2, r0)
                throw r4
            L_0x0240:
                if (r2 != r10) goto L_0x026f
                if (r13 == 0) goto L_0x0267
                o.g r2 = r1.f6579h
                int r2 = r2.readInt()
                b.p.b.a0.j.a r5 = b.p.b.a0.j.a.d(r2)
                if (r5 == 0) goto L_0x0259
                r0 = r21
                b.p.b.a0.j.d$e r0 = (b.p.b.a0.j.d.e) r0
                r0.f(r13, r5)
                goto L_0x0327
            L_0x0259:
                java.lang.Object[] r3 = new java.lang.Object[r3]
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                r3[r0] = r2
                java.lang.String r0 = "TYPE_RST_STREAM unexpected error code: %d"
                b.p.b.a0.j.o.c(r0, r3)
                throw r4
            L_0x0267:
                java.lang.Object[] r0 = new java.lang.Object[r0]
                java.lang.String r2 = "TYPE_RST_STREAM streamId == 0"
                b.p.b.a0.j.o.c(r2, r0)
                throw r4
            L_0x026f:
                java.lang.Object[] r3 = new java.lang.Object[r3]
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                r3[r0] = r2
                java.lang.String r0 = "TYPE_RST_STREAM length: %d != 4"
                b.p.b.a0.j.o.c(r0, r3)
                throw r4
            L_0x027d:
                r5 = 5
                if (r2 != r5) goto L_0x029a
                if (r13 == 0) goto L_0x0292
                o.g r0 = r1.f6579h
                r0.readInt()
                o.g r0 = r1.f6579h
                r0.readByte()
                r0 = r21
                b.p.b.a0.j.d$e r0 = (b.p.b.a0.j.d.e) r0
                goto L_0x0327
            L_0x0292:
                java.lang.Object[] r0 = new java.lang.Object[r0]
                java.lang.String r2 = "TYPE_PRIORITY streamId == 0"
                b.p.b.a0.j.o.c(r2, r0)
                throw r4
            L_0x029a:
                java.lang.Object[] r3 = new java.lang.Object[r3]
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                r3[r0] = r2
                java.lang.String r0 = "TYPE_PRIORITY length: %d != 5"
                b.p.b.a0.j.o.c(r0, r3)
                throw r4
            L_0x02a8:
                if (r13 == 0) goto L_0x02e6
                r4 = r7 & 1
                if (r4 == 0) goto L_0x02b0
                r12 = r3
                goto L_0x02b1
            L_0x02b0:
                r12 = r0
            L_0x02b1:
                r4 = r7 & 8
                if (r4 == 0) goto L_0x02be
                o.g r0 = r1.f6579h
                byte r0 = r0.readByte()
                r0 = r0 & 255(0xff, float:3.57E-43)
                short r0 = (short) r0
            L_0x02be:
                r4 = r7 & 32
                if (r4 == 0) goto L_0x02d2
                o.g r4 = r1.f6579h
                r4.readInt()
                o.g r4 = r1.f6579h
                r4.readByte()
                r4 = r21
                b.p.b.a0.j.d$e r4 = (b.p.b.a0.j.d.e) r4
                int r2 = r2 + -5
            L_0x02d2:
                int r2 = b.p.b.a0.j.o.e(r2, r7, r0)
                java.util.List r15 = r1.b(r2, r0, r7, r13)
                r11 = 0
                r14 = -1
                b.p.b.a0.j.m r16 = b.p.b.a0.j.m.HTTP_20_HEADERS
                r10 = r21
                b.p.b.a0.j.d$e r10 = (b.p.b.a0.j.d.e) r10
                r10.d(r11, r12, r13, r14, r15, r16)
                goto L_0x0327
            L_0x02e6:
                java.lang.Object[] r0 = new java.lang.Object[r0]
                java.lang.String r2 = "PROTOCOL_ERROR: TYPE_HEADERS streamId == 0"
                b.p.b.a0.j.o.c(r2, r0)
                throw r4
            L_0x02ee:
                r5 = r7 & 1
                if (r5 == 0) goto L_0x02f4
                r5 = r3
                goto L_0x02f5
            L_0x02f4:
                r5 = r0
            L_0x02f5:
                r6 = r7 & 32
                if (r6 == 0) goto L_0x02fb
                r6 = r3
                goto L_0x02fc
            L_0x02fb:
                r6 = r0
            L_0x02fc:
                if (r6 != 0) goto L_0x031f
                r4 = r7 & 8
                if (r4 == 0) goto L_0x030b
                o.g r0 = r1.f6579h
                byte r0 = r0.readByte()
                r0 = r0 & 255(0xff, float:3.57E-43)
                short r0 = (short) r0
            L_0x030b:
                int r2 = b.p.b.a0.j.o.e(r2, r7, r0)
                o.g r4 = r1.f6579h
                r6 = r21
                b.p.b.a0.j.d$e r6 = (b.p.b.a0.j.d.e) r6
                r6.b(r5, r13, r4, r2)
                o.g r2 = r1.f6579h
                long r4 = (long) r0
                r2.skip(r4)
                goto L_0x0327
            L_0x031f:
                java.lang.Object[] r0 = new java.lang.Object[r0]
                java.lang.String r2 = "PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA"
                b.p.b.a0.j.o.c(r2, r0)
                throw r4
            L_0x0327:
                return r3
            L_0x0328:
                java.lang.String r5 = "FRAME_SIZE_ERROR: %s"
                java.lang.Object[] r3 = new java.lang.Object[r3]
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                r3[r0] = r2
                b.p.b.a0.j.o.c(r5, r3)
                throw r4
            L_0x0336:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: b.p.b.a0.j.o.c.a0(b.p.b.a0.j.b$a):boolean");
        }

        public final List<l> b(int i2, short s, byte b2, int i3) {
            a aVar = this.f6580i;
            aVar.f6576l = i2;
            aVar.f6573i = i2;
            aVar.f6577m = s;
            aVar.f6574j = b2;
            aVar.f6575k = i3;
            n.a aVar2 = this.f6582k;
            while (!aVar2.f6567b.D()) {
                byte readByte = aVar2.f6567b.readByte() & ExifInterface.MARKER;
                if (readByte == 128) {
                    throw new IOException("index == 0");
                } else if ((readByte & 128) == 128) {
                    int g2 = aVar2.g(readByte, 127) - 1;
                    if (g2 >= 0 && g2 <= n.a.length - 1) {
                        aVar2.a.add(n.a[g2]);
                    } else {
                        int b3 = aVar2.b(g2 - n.a.length);
                        if (b3 >= 0) {
                            l[] lVarArr = aVar2.f6568e;
                            if (b3 <= lVarArr.length - 1) {
                                aVar2.a.add(lVarArr[b3]);
                            }
                        }
                        StringBuilder y = b.e.a.a.a.y("Header index too large ");
                        y.append(g2 + 1);
                        throw new IOException(y.toString());
                    }
                } else if (readByte == 64) {
                    h f = aVar2.f();
                    n.a(f);
                    aVar2.e(-1, new l(f, aVar2.f()));
                } else if ((readByte & 64) == 64) {
                    aVar2.e(-1, new l(aVar2.d(aVar2.g(readByte, 63) - 1), aVar2.f()));
                } else if ((readByte & 32) == 32) {
                    int g3 = aVar2.g(readByte, 31);
                    aVar2.d = g3;
                    if (g3 < 0 || g3 > aVar2.c) {
                        StringBuilder y2 = b.e.a.a.a.y("Invalid dynamic table size update ");
                        y2.append(aVar2.d);
                        throw new IOException(y2.toString());
                    }
                    int i4 = aVar2.f6570h;
                    if (g3 < i4) {
                        if (g3 == 0) {
                            aVar2.a();
                        } else {
                            aVar2.c(i4 - g3);
                        }
                    }
                } else if (readByte == 16 || readByte == 0) {
                    h f2 = aVar2.f();
                    n.a(f2);
                    aVar2.a.add(new l(f2, aVar2.f()));
                } else {
                    aVar2.a.add(new l(aVar2.d(aVar2.g(readByte, 15) - 1), aVar2.f()));
                }
            }
            n.a aVar3 = this.f6582k;
            Objects.requireNonNull(aVar3);
            ArrayList arrayList = new ArrayList(aVar3.a);
            aVar3.a.clear();
            return arrayList;
        }

        public void close() {
            this.f6579h.close();
        }

        public void u() {
            if (!this.f6581j) {
                g gVar = this.f6579h;
                h hVar = o.f6571b;
                h p2 = gVar.p((long) hVar.l());
                Logger logger = o.a;
                if (logger.isLoggable(Level.FINE)) {
                    logger.fine(String.format("<< CONNECTION %s", new Object[]{p2.m()}));
                }
                if (!hVar.equals(p2)) {
                    o.c("Expected a connection header but was %s", new Object[]{p2.y()});
                    throw null;
                }
            }
        }
    }

    public static final class d implements c {

        /* renamed from: h  reason: collision with root package name */
        public final f f6583h;

        /* renamed from: i  reason: collision with root package name */
        public final boolean f6584i;

        /* renamed from: j  reason: collision with root package name */
        public final e f6585j;

        /* renamed from: k  reason: collision with root package name */
        public final n.b f6586k;

        /* renamed from: l  reason: collision with root package name */
        public int f6587l = 16384;

        /* renamed from: m  reason: collision with root package name */
        public boolean f6588m;

        public d(f fVar, boolean z) {
            this.f6583h = fVar;
            this.f6584i = z;
            e eVar = new e();
            this.f6585j = eVar;
            this.f6586k = new n.b(eVar);
        }

        public synchronized void F() {
            if (this.f6588m) {
                throw new IOException("closed");
            } else if (this.f6584i) {
                Logger logger = o.a;
                if (logger.isLoggable(Level.FINE)) {
                    logger.fine(String.format(">> CONNECTION %s", new Object[]{o.f6571b.m()}));
                }
                this.f6583h.K(o.f6571b.x());
                this.f6583h.flush();
            }
        }

        public synchronized void L(boolean z, int i2, e eVar, int i3) {
            if (!this.f6588m) {
                b(i2, i3, (byte) 0, z ? (byte) 1 : 0);
                if (i3 > 0) {
                    this.f6583h.j(eVar, (long) i3);
                }
            } else {
                throw new IOException("closed");
            }
        }

        public int Z() {
            return this.f6587l;
        }

        public void b(int i2, int i3, byte b2, byte b3) {
            Logger logger = o.a;
            if (logger.isLoggable(Level.FINE)) {
                logger.fine(b.a(false, i2, i3, b2, b3));
            }
            int i4 = this.f6587l;
            if (i3 > i4) {
                o.f("FRAME_SIZE_ERROR length > %d: %d", new Object[]{Integer.valueOf(i4), Integer.valueOf(i3)});
                throw null;
            } else if ((Integer.MIN_VALUE & i2) == 0) {
                f fVar = this.f6583h;
                fVar.E((i3 >>> 16) & 255);
                fVar.E((i3 >>> 8) & 255);
                fVar.E(i3 & 255);
                this.f6583h.E(b2 & ExifInterface.MARKER);
                this.f6583h.E(b3 & ExifInterface.MARKER);
                this.f6583h.v(i2 & ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED);
            } else {
                o.f("reserved bit set: %s", new Object[]{Integer.valueOf(i2)});
                throw null;
            }
        }

        public synchronized void b0(boolean z, boolean z2, int i2, int i3, List<l> list) {
            if (z2) {
                throw new UnsupportedOperationException();
            } else if (!this.f6588m) {
                e(z, i2, list);
            } else {
                throw new IOException("closed");
            }
        }

        public synchronized void c(boolean z, int i2, int i3) {
            if (!this.f6588m) {
                b(0, 8, (byte) 6, z ? (byte) 1 : 0);
                this.f6583h.v(i2);
                this.f6583h.v(i3);
                this.f6583h.flush();
            } else {
                throw new IOException("closed");
            }
        }

        public synchronized void close() {
            this.f6588m = true;
            this.f6583h.close();
        }

        public void e(boolean z, int i2, List<l> list) {
            if (!this.f6588m) {
                this.f6586k.b(list);
                long j2 = this.f6585j.f10453i;
                int min = (int) Math.min((long) this.f6587l, j2);
                long j3 = (long) min;
                int i3 = (j2 > j3 ? 1 : (j2 == j3 ? 0 : -1));
                byte b2 = i3 == 0 ? (byte) 4 : 0;
                if (z) {
                    b2 = (byte) (b2 | 1);
                }
                b(i2, min, (byte) 1, b2);
                this.f6583h.j(this.f6585j, j3);
                if (i3 > 0) {
                    q(i2, j2 - j3);
                    return;
                }
                return;
            }
            throw new IOException("closed");
        }

        public synchronized void f0(t tVar) {
            if (!this.f6588m) {
                int i2 = 0;
                b(0, Integer.bitCount(tVar.a) * 6, (byte) 4, (byte) 0);
                while (i2 < 10) {
                    if (tVar.c(i2)) {
                        this.f6583h.r(i2 == 4 ? 3 : i2 == 7 ? 4 : i2);
                        this.f6583h.v(tVar.d[i2]);
                    }
                    i2++;
                }
                this.f6583h.flush();
            } else {
                throw new IOException("closed");
            }
        }

        public synchronized void flush() {
            if (!this.f6588m) {
                this.f6583h.flush();
            } else {
                throw new IOException("closed");
            }
        }

        public synchronized void g(int i2, long j2) {
            if (this.f6588m) {
                throw new IOException("closed");
            } else if (j2 == 0 || j2 > 2147483647L) {
                o.f("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: %s", new Object[]{Long.valueOf(j2)});
                throw null;
            } else {
                b(i2, 4, (byte) 8, (byte) 0);
                this.f6583h.v((int) j2);
                this.f6583h.flush();
            }
        }

        public synchronized void k(t tVar) {
            if (!this.f6588m) {
                int i2 = this.f6587l;
                if ((tVar.a & 32) != 0) {
                    i2 = tVar.d[5];
                }
                this.f6587l = i2;
                b(0, 0, (byte) 4, (byte) 1);
                this.f6583h.flush();
            } else {
                throw new IOException("closed");
            }
        }

        public final void q(int i2, long j2) {
            while (j2 > 0) {
                int min = (int) Math.min((long) this.f6587l, j2);
                long j3 = (long) min;
                j2 -= j3;
                b(i2, min, (byte) 9, j2 == 0 ? (byte) 4 : 0);
                this.f6583h.j(this.f6585j, j3);
            }
        }

        public synchronized void s(int i2, a aVar) {
            if (this.f6588m) {
                throw new IOException("closed");
            } else if (aVar.f6489h != -1) {
                b(i2, 4, (byte) 3, (byte) 0);
                this.f6583h.v(aVar.f6489h);
                this.f6583h.flush();
            } else {
                throw new IllegalArgumentException();
            }
        }

        public synchronized void w(int i2, a aVar, byte[] bArr) {
            if (this.f6588m) {
                throw new IOException("closed");
            } else if (aVar.f6489h != -1) {
                b(0, bArr.length + 8, (byte) 7, (byte) 0);
                this.f6583h.v(i2);
                this.f6583h.v(aVar.f6489h);
                if (bArr.length > 0) {
                    this.f6583h.K(bArr);
                }
                this.f6583h.flush();
            } else {
                o.f("errorCode.httpCode == -1", new Object[0]);
                throw null;
            }
        }
    }

    public static IOException c(String str, Object[] objArr) {
        throw new IOException(String.format(str, objArr));
    }

    public static int d(g gVar) {
        return (gVar.readByte() & ExifInterface.MARKER) | ((gVar.readByte() & ExifInterface.MARKER) << 16) | ((gVar.readByte() & ExifInterface.MARKER) << 8);
    }

    public static int e(int i2, byte b2, short s) {
        if ((b2 & 8) != 0) {
            i2--;
        }
        if (s <= i2) {
            return (short) (i2 - s);
        }
        throw new IOException(String.format("PROTOCOL_ERROR padding %s > remaining length %s", new Object[]{Short.valueOf(s), Integer.valueOf(i2)}));
    }

    public static IllegalArgumentException f(String str, Object[] objArr) {
        throw new IllegalArgumentException(String.format(str, objArr));
    }

    public b a(g gVar, boolean z) {
        return new c(gVar, 4096, z);
    }

    public c b(f fVar, boolean z) {
        return new d(fVar, z);
    }
}
