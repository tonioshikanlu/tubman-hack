package n.m0.j;

import androidx.appcompat.widget.ActivityChooserView;
import androidx.exifinterface.media.ExifInterface;
import e.a.a.a.y0.m.o1.c;
import e.x.c.i;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import n.m0.j.q;
import o.e;
import o.g;
import o.h;
import o.z;

public final class d {
    public static final c[] a;

    /* renamed from: b  reason: collision with root package name */
    public static final Map<h, Integer> f10275b;
    public static final d c = new d();

    public static final class a {
        public final List<c> a;

        /* renamed from: b  reason: collision with root package name */
        public final g f10276b;
        public c[] c;
        public int d;

        /* renamed from: e  reason: collision with root package name */
        public int f10277e;
        public int f;

        /* renamed from: g  reason: collision with root package name */
        public final int f10278g;

        /* renamed from: h  reason: collision with root package name */
        public int f10279h;

        public a(z zVar, int i2, int i3, int i4) {
            i3 = (i4 & 4) != 0 ? i2 : i3;
            i.e(zVar, "source");
            this.f10278g = i2;
            this.f10279h = i3;
            this.a = new ArrayList();
            this.f10276b = c.m(zVar);
            this.c = new c[8];
            this.d = 7;
        }

        public final void a() {
            c[] cVarArr = this.c;
            int length = cVarArr.length;
            i.e(cVarArr, "$this$fill");
            Arrays.fill(cVarArr, 0, length, (Object) null);
            this.d = this.c.length - 1;
            this.f10277e = 0;
            this.f = 0;
        }

        public final int b(int i2) {
            return this.d + 1 + i2;
        }

        public final int c(int i2) {
            int i3;
            int i4 = 0;
            if (i2 > 0) {
                int length = this.c.length;
                while (true) {
                    length--;
                    i3 = this.d;
                    if (length < i3 || i2 <= 0) {
                        c[] cVarArr = this.c;
                        System.arraycopy(cVarArr, i3 + 1, cVarArr, i3 + 1 + i4, this.f10277e);
                        this.d += i4;
                    } else {
                        c cVar = this.c[length];
                        i.c(cVar);
                        int i5 = cVar.a;
                        i2 -= i5;
                        this.f -= i5;
                        this.f10277e--;
                        i4++;
                    }
                }
                c[] cVarArr2 = this.c;
                System.arraycopy(cVarArr2, i3 + 1, cVarArr2, i3 + 1 + i4, this.f10277e);
                this.d += i4;
            }
            return i4;
        }

        /* JADX WARNING: Removed duplicated region for block: B:7:0x0010  */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x0017  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final o.h d(int r5) {
            /*
                r4 = this;
                r0 = 1
                if (r5 < 0) goto L_0x000d
                n.m0.j.d r1 = n.m0.j.d.c
                n.m0.j.c[] r1 = n.m0.j.d.a
                int r1 = r1.length
                int r1 = r1 - r0
                if (r5 > r1) goto L_0x000d
                r1 = r0
                goto L_0x000e
            L_0x000d:
                r1 = 0
            L_0x000e:
                if (r1 == 0) goto L_0x0017
                n.m0.j.d r0 = n.m0.j.d.c
                n.m0.j.c[] r0 = n.m0.j.d.a
                r5 = r0[r5]
                goto L_0x002e
            L_0x0017:
                n.m0.j.d r1 = n.m0.j.d.c
                n.m0.j.c[] r1 = n.m0.j.d.a
                int r1 = r1.length
                int r1 = r5 - r1
                int r1 = r4.b(r1)
                if (r1 < 0) goto L_0x0031
                n.m0.j.c[] r2 = r4.c
                int r3 = r2.length
                if (r1 >= r3) goto L_0x0031
                r5 = r2[r1]
                e.x.c.i.c(r5)
            L_0x002e:
                o.h r5 = r5.f10274b
                return r5
            L_0x0031:
                java.io.IOException r1 = new java.io.IOException
                java.lang.String r2 = "Header index too large "
                java.lang.StringBuilder r2 = b.e.a.a.a.y(r2)
                int r5 = r5 + r0
                r2.append(r5)
                java.lang.String r5 = r2.toString()
                r1.<init>(r5)
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: n.m0.j.d.a.d(int):o.h");
        }

        public final void e(int i2, c cVar) {
            this.a.add(cVar);
            int i3 = cVar.a;
            if (i2 != -1) {
                c cVar2 = this.c[this.d + 1 + i2];
                i.c(cVar2);
                i3 -= cVar2.a;
            }
            int i4 = this.f10279h;
            if (i3 > i4) {
                a();
                return;
            }
            int c2 = c((this.f + i3) - i4);
            if (i2 == -1) {
                int i5 = this.f10277e + 1;
                c[] cVarArr = this.c;
                if (i5 > cVarArr.length) {
                    c[] cVarArr2 = new c[(cVarArr.length * 2)];
                    System.arraycopy(cVarArr, 0, cVarArr2, cVarArr.length, cVarArr.length);
                    this.d = this.c.length - 1;
                    this.c = cVarArr2;
                }
                int i6 = this.d;
                this.d = i6 - 1;
                this.c[i6] = cVar;
                this.f10277e++;
            } else {
                this.c[this.d + 1 + i2 + c2 + i2] = cVar;
            }
            this.f += i3;
        }

        public final h f() {
            byte readByte = this.f10276b.readByte();
            byte[] bArr = n.m0.c.a;
            byte b2 = readByte & ExifInterface.MARKER;
            byte b3 = 0;
            boolean z = (b2 & 128) == 128;
            long g2 = (long) g(b2, 127);
            if (!z) {
                return this.f10276b.p(g2);
            }
            e eVar = new e();
            q qVar = q.d;
            g gVar = this.f10276b;
            q.a aVar = q.c;
            i.e(gVar, "source");
            i.e(eVar, "sink");
            q.a aVar2 = aVar;
            int i2 = 0;
            for (long j2 = 0; j2 < g2; j2++) {
                byte readByte2 = gVar.readByte();
                byte[] bArr2 = n.m0.c.a;
                b3 = (b3 << 8) | (readByte2 & ExifInterface.MARKER);
                i2 += 8;
                while (i2 >= 8) {
                    int i3 = i2 - 8;
                    q.a[] aVarArr = aVar2.a;
                    i.c(aVarArr);
                    aVar2 = aVarArr[(b3 >>> i3) & 255];
                    i.c(aVar2);
                    if (aVar2.a == null) {
                        eVar.u0(aVar2.f10374b);
                        i2 -= aVar2.c;
                        aVar2 = aVar;
                    } else {
                        i2 = i3;
                    }
                }
            }
            while (i2 > 0) {
                q.a[] aVarArr2 = aVar2.a;
                i.c(aVarArr2);
                q.a aVar3 = aVarArr2[(b3 << (8 - i2)) & 255];
                i.c(aVar3);
                if (aVar3.a != null || aVar3.c > i2) {
                    break;
                }
                eVar.u0(aVar3.f10374b);
                i2 -= aVar3.c;
                aVar2 = aVar;
            }
            return eVar.e0();
        }

        public final int g(int i2, int i3) {
            int i4 = i2 & i3;
            if (i4 < i3) {
                return i4;
            }
            int i5 = 0;
            while (true) {
                byte readByte = this.f10276b.readByte();
                byte[] bArr = n.m0.c.a;
                byte b2 = readByte & ExifInterface.MARKER;
                if ((b2 & 128) == 0) {
                    return i3 + (b2 << i5);
                }
                i3 += (b2 & Byte.MAX_VALUE) << i5;
                i5 += 7;
            }
        }
    }

    public static final class b {
        public int a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f10280b;
        public int c;
        public c[] d;

        /* renamed from: e  reason: collision with root package name */
        public int f10281e;
        public int f;

        /* renamed from: g  reason: collision with root package name */
        public int f10282g;

        /* renamed from: h  reason: collision with root package name */
        public int f10283h;

        /* renamed from: i  reason: collision with root package name */
        public final boolean f10284i;

        /* renamed from: j  reason: collision with root package name */
        public final e f10285j;

        public b(int i2, boolean z, e eVar, int i3) {
            i2 = (i3 & 1) != 0 ? 4096 : i2;
            z = (i3 & 2) != 0 ? true : z;
            i.e(eVar, "out");
            this.f10283h = i2;
            this.f10284i = z;
            this.f10285j = eVar;
            this.a = ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
            this.c = i2;
            this.d = new c[8];
            this.f10281e = 7;
        }

        public final void a() {
            c[] cVarArr = this.d;
            int length = cVarArr.length;
            i.e(cVarArr, "$this$fill");
            Arrays.fill(cVarArr, 0, length, (Object) null);
            this.f10281e = this.d.length - 1;
            this.f = 0;
            this.f10282g = 0;
        }

        public final int b(int i2) {
            int i3;
            int i4 = 0;
            if (i2 > 0) {
                int length = this.d.length;
                while (true) {
                    length--;
                    i3 = this.f10281e;
                    if (length < i3 || i2 <= 0) {
                        c[] cVarArr = this.d;
                        System.arraycopy(cVarArr, i3 + 1, cVarArr, i3 + 1 + i4, this.f);
                        c[] cVarArr2 = this.d;
                        int i5 = this.f10281e;
                        Arrays.fill(cVarArr2, i5 + 1, i5 + 1 + i4, (Object) null);
                        this.f10281e += i4;
                    } else {
                        c cVar = this.d[length];
                        i.c(cVar);
                        i2 -= cVar.a;
                        int i6 = this.f10282g;
                        c cVar2 = this.d[length];
                        i.c(cVar2);
                        this.f10282g = i6 - cVar2.a;
                        this.f--;
                        i4++;
                    }
                }
                c[] cVarArr3 = this.d;
                System.arraycopy(cVarArr3, i3 + 1, cVarArr3, i3 + 1 + i4, this.f);
                c[] cVarArr22 = this.d;
                int i52 = this.f10281e;
                Arrays.fill(cVarArr22, i52 + 1, i52 + 1 + i4, (Object) null);
                this.f10281e += i4;
            }
            return i4;
        }

        public final void c(c cVar) {
            int i2 = cVar.a;
            int i3 = this.c;
            if (i2 > i3) {
                a();
                return;
            }
            b((this.f10282g + i2) - i3);
            int i4 = this.f + 1;
            c[] cVarArr = this.d;
            if (i4 > cVarArr.length) {
                c[] cVarArr2 = new c[(cVarArr.length * 2)];
                System.arraycopy(cVarArr, 0, cVarArr2, cVarArr.length, cVarArr.length);
                this.f10281e = this.d.length - 1;
                this.d = cVarArr2;
            }
            int i5 = this.f10281e;
            this.f10281e = i5 - 1;
            this.d[i5] = cVar;
            this.f++;
            this.f10282g += i2;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: byte} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v5, resolved type: long} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v6, resolved type: byte} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v7, resolved type: byte} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v8, resolved type: byte} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void d(o.h r11) {
            /*
                r10 = this;
                java.lang.String r0 = "data"
                e.x.c.i.e(r11, r0)
                boolean r0 = r10.f10284i
                r1 = 127(0x7f, float:1.78E-43)
                r2 = 0
                if (r0 == 0) goto L_0x0092
                n.m0.j.q r0 = n.m0.j.q.d
                java.lang.String r0 = "bytes"
                e.x.c.i.e(r11, r0)
                int r0 = r11.l()
                r3 = 0
                r5 = r2
                r6 = r3
            L_0x001b:
                if (r5 >= r0) goto L_0x002e
                byte r8 = r11.r(r5)
                byte[] r9 = n.m0.c.a
                r8 = r8 & 255(0xff, float:3.57E-43)
                byte[] r9 = n.m0.j.q.f10373b
                byte r8 = r9[r8]
                long r8 = (long) r8
                long r6 = r6 + r8
                int r5 = r5 + 1
                goto L_0x001b
            L_0x002e:
                r0 = 7
                long r8 = (long) r0
                long r6 = r6 + r8
                r0 = 3
                long r5 = r6 >> r0
                int r0 = (int) r5
                int r5 = r11.l()
                if (r0 >= r5) goto L_0x0092
                o.e r0 = new o.e
                r0.<init>()
                n.m0.j.q r5 = n.m0.j.q.d
                java.lang.String r5 = "source"
                e.x.c.i.e(r11, r5)
                java.lang.String r5 = "sink"
                e.x.c.i.e(r0, r5)
                int r5 = r11.l()
                r6 = r3
                r3 = r2
            L_0x0052:
                if (r2 >= r5) goto L_0x0078
                byte r4 = r11.r(r2)
                byte[] r8 = n.m0.c.a
                r4 = r4 & 255(0xff, float:3.57E-43)
                int[] r8 = n.m0.j.q.a
                r8 = r8[r4]
                byte[] r9 = n.m0.j.q.f10373b
                byte r4 = r9[r4]
                long r6 = r6 << r4
                long r8 = (long) r8
                long r6 = r6 | r8
                int r3 = r3 + r4
            L_0x0068:
                r4 = 8
                if (r3 < r4) goto L_0x0075
                int r3 = r3 + -8
                long r8 = r6 >> r3
                int r4 = (int) r8
                r0.E(r4)
                goto L_0x0068
            L_0x0075:
                int r2 = r2 + 1
                goto L_0x0052
            L_0x0078:
                if (r3 <= 0) goto L_0x0087
                int r11 = 8 - r3
                long r4 = r6 << r11
                r6 = 255(0xff, double:1.26E-321)
                long r2 = r6 >>> r3
                long r2 = r2 | r4
                int r11 = (int) r2
                r0.E(r11)
            L_0x0087:
                o.h r11 = r0.e0()
                int r0 = r11.l()
                r2 = 128(0x80, float:1.794E-43)
                goto L_0x0096
            L_0x0092:
                int r0 = r11.l()
            L_0x0096:
                r10.f(r0, r1, r2)
                o.e r0 = r10.f10285j
                r0.r0(r11)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: n.m0.j.d.b.d(o.h):void");
        }

        /* JADX WARNING: Removed duplicated region for block: B:22:0x0074  */
        /* JADX WARNING: Removed duplicated region for block: B:33:0x00b6  */
        /* JADX WARNING: Removed duplicated region for block: B:34:0x00be  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void e(java.util.List<n.m0.j.c> r13) {
            /*
                r12 = this;
                java.lang.String r0 = "headerBlock"
                e.x.c.i.e(r13, r0)
                boolean r0 = r12.f10280b
                r1 = 0
                if (r0 == 0) goto L_0x0023
                int r0 = r12.a
                int r2 = r12.c
                r3 = 32
                r4 = 31
                if (r0 >= r2) goto L_0x0017
                r12.f(r0, r4, r3)
            L_0x0017:
                r12.f10280b = r1
                r0 = 2147483647(0x7fffffff, float:NaN)
                r12.a = r0
                int r0 = r12.c
                r12.f(r0, r4, r3)
            L_0x0023:
                int r0 = r13.size()
                r2 = r1
            L_0x0028:
                if (r2 >= r0) goto L_0x0101
                java.lang.Object r3 = r13.get(r2)
                n.m0.j.c r3 = (n.m0.j.c) r3
                o.h r4 = r3.f10274b
                o.h r4 = r4.w()
                o.h r5 = r3.c
                n.m0.j.d r6 = n.m0.j.d.c
                java.util.Map<o.h, java.lang.Integer> r6 = n.m0.j.d.f10275b
                java.lang.Object r6 = r6.get(r4)
                java.lang.Integer r6 = (java.lang.Integer) r6
                r7 = -1
                if (r6 == 0) goto L_0x0070
                int r6 = r6.intValue()
                int r6 = r6 + 1
                r8 = 7
                r9 = 2
                if (r9 <= r6) goto L_0x0050
                goto L_0x006e
            L_0x0050:
                if (r8 < r6) goto L_0x006e
                n.m0.j.c[] r8 = n.m0.j.d.a
                int r9 = r6 + -1
                r9 = r8[r9]
                o.h r9 = r9.c
                boolean r9 = e.x.c.i.a(r9, r5)
                if (r9 == 0) goto L_0x0061
                goto L_0x0071
            L_0x0061:
                r8 = r8[r6]
                o.h r8 = r8.c
                boolean r8 = e.x.c.i.a(r8, r5)
                if (r8 == 0) goto L_0x006e
                int r8 = r6 + 1
                goto L_0x0072
            L_0x006e:
                r8 = r7
                goto L_0x0072
            L_0x0070:
                r6 = r7
            L_0x0071:
                r8 = r6
            L_0x0072:
                if (r8 != r7) goto L_0x00b4
                int r9 = r12.f10281e
                int r9 = r9 + 1
                n.m0.j.c[] r10 = r12.d
                int r10 = r10.length
            L_0x007b:
                if (r9 >= r10) goto L_0x00b4
                n.m0.j.c[] r11 = r12.d
                r11 = r11[r9]
                e.x.c.i.c(r11)
                o.h r11 = r11.f10274b
                boolean r11 = e.x.c.i.a(r11, r4)
                if (r11 == 0) goto L_0x00b1
                n.m0.j.c[] r11 = r12.d
                r11 = r11[r9]
                e.x.c.i.c(r11)
                o.h r11 = r11.c
                boolean r11 = e.x.c.i.a(r11, r5)
                if (r11 == 0) goto L_0x00a5
                int r8 = r12.f10281e
                int r9 = r9 - r8
                n.m0.j.d r8 = n.m0.j.d.c
                n.m0.j.c[] r8 = n.m0.j.d.a
                int r8 = r8.length
                int r8 = r8 + r9
                goto L_0x00b4
            L_0x00a5:
                if (r6 != r7) goto L_0x00b1
                int r6 = r12.f10281e
                int r6 = r9 - r6
                n.m0.j.d r11 = n.m0.j.d.c
                n.m0.j.c[] r11 = n.m0.j.d.a
                int r11 = r11.length
                int r6 = r6 + r11
            L_0x00b1:
                int r9 = r9 + 1
                goto L_0x007b
            L_0x00b4:
                if (r8 == r7) goto L_0x00be
                r3 = 127(0x7f, float:1.78E-43)
                r4 = 128(0x80, float:1.794E-43)
                r12.f(r8, r3, r4)
                goto L_0x00fd
            L_0x00be:
                r8 = 64
                if (r6 != r7) goto L_0x00cb
                o.e r6 = r12.f10285j
                r6.u0(r8)
                r12.d(r4)
                goto L_0x00f7
            L_0x00cb:
                o.h r7 = n.m0.j.c.d
                java.util.Objects.requireNonNull(r4)
                java.lang.String r9 = "prefix"
                e.x.c.i.e(r7, r9)
                int r9 = r7.l()
                boolean r7 = r4.u(r1, r7, r1, r9)
                if (r7 == 0) goto L_0x00f2
                o.h r7 = n.m0.j.c.f10273i
                boolean r4 = e.x.c.i.a(r7, r4)
                r4 = r4 ^ 1
                if (r4 == 0) goto L_0x00f2
                r3 = 15
                r12.f(r6, r3, r1)
                r12.d(r5)
                goto L_0x00fd
            L_0x00f2:
                r4 = 63
                r12.f(r6, r4, r8)
            L_0x00f7:
                r12.d(r5)
                r12.c(r3)
            L_0x00fd:
                int r2 = r2 + 1
                goto L_0x0028
            L_0x0101:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: n.m0.j.d.b.e(java.util.List):void");
        }

        public final void f(int i2, int i3, int i4) {
            int i5;
            e eVar;
            if (i2 < i3) {
                eVar = this.f10285j;
                i5 = i2 | i4;
            } else {
                this.f10285j.u0(i4 | i3);
                i5 = i2 - i3;
                while (i5 >= 128) {
                    this.f10285j.u0(128 | (i5 & 127));
                    i5 >>>= 7;
                }
                eVar = this.f10285j;
            }
            eVar.u0(i5);
        }
    }

    static {
        c cVar = new c(c.f10273i, "");
        h hVar = c.f;
        h hVar2 = c.f10271g;
        h hVar3 = c.f10272h;
        h hVar4 = c.f10270e;
        c[] cVarArr = {cVar, new c(hVar, "GET"), new c(hVar, "POST"), new c(hVar2, "/"), new c(hVar2, "/index.html"), new c(hVar3, "http"), new c(hVar3, "https"), new c(hVar4, "200"), new c(hVar4, "204"), new c(hVar4, "206"), new c(hVar4, "304"), new c(hVar4, "400"), new c(hVar4, "404"), new c(hVar4, "500"), new c("accept-charset", ""), new c("accept-encoding", "gzip, deflate"), new c("accept-language", ""), new c("accept-ranges", ""), new c("accept", ""), new c("access-control-allow-origin", ""), new c("age", ""), new c("allow", ""), new c("authorization", ""), new c("cache-control", ""), new c("content-disposition", ""), new c("content-encoding", ""), new c("content-language", ""), new c("content-length", ""), new c("content-location", ""), new c("content-range", ""), new c("content-type", ""), new c("cookie", ""), new c("date", ""), new c("etag", ""), new c("expect", ""), new c("expires", ""), new c("from", ""), new c("host", ""), new c("if-match", ""), new c("if-modified-since", ""), new c("if-none-match", ""), new c("if-range", ""), new c("if-unmodified-since", ""), new c("last-modified", ""), new c("link", ""), new c("location", ""), new c("max-forwards", ""), new c("proxy-authenticate", ""), new c("proxy-authorization", ""), new c("range", ""), new c("referer", ""), new c("refresh", ""), new c("retry-after", ""), new c("server", ""), new c("set-cookie", ""), new c("strict-transport-security", ""), new c("transfer-encoding", ""), new c("user-agent", ""), new c("vary", ""), new c("via", ""), new c("www-authenticate", "")};
        a = cVarArr;
        LinkedHashMap linkedHashMap = new LinkedHashMap(cVarArr.length);
        int length = cVarArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            c[] cVarArr2 = a;
            if (!linkedHashMap.containsKey(cVarArr2[i2].f10274b)) {
                linkedHashMap.put(cVarArr2[i2].f10274b, Integer.valueOf(i2));
            }
        }
        Map<h, Integer> unmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        i.d(unmodifiableMap, "Collections.unmodifiableMap(result)");
        f10275b = unmodifiableMap;
    }

    public final h a(h hVar) {
        i.e(hVar, "name");
        int l2 = hVar.l();
        for (int i2 = 0; i2 < l2; i2++) {
            byte b2 = (byte) 65;
            byte b3 = (byte) 90;
            byte r = hVar.r(i2);
            if (b2 <= r && b3 >= r) {
                StringBuilder y = b.e.a.a.a.y("PROTOCOL_ERROR response malformed: mixed case name: ");
                y.append(hVar.y());
                throw new IOException(y.toString());
            }
        }
        return hVar;
    }
}
