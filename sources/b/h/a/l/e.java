package b.h.a.l;

import android.graphics.Bitmap;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import b.h.a.l.a;
import b.h.a.m.x.g.b;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Iterator;

public class e implements a {
    public static final String u = "e";
    @ColorInt
    public int[] a;
    @ColorInt

    /* renamed from: b  reason: collision with root package name */
    public final int[] f554b = new int[256];
    public final a.C0019a c;
    public ByteBuffer d;

    /* renamed from: e  reason: collision with root package name */
    public byte[] f555e;
    public short[] f;

    /* renamed from: g  reason: collision with root package name */
    public byte[] f556g;

    /* renamed from: h  reason: collision with root package name */
    public byte[] f557h;

    /* renamed from: i  reason: collision with root package name */
    public byte[] f558i;
    @ColorInt

    /* renamed from: j  reason: collision with root package name */
    public int[] f559j;

    /* renamed from: k  reason: collision with root package name */
    public int f560k;

    /* renamed from: l  reason: collision with root package name */
    public c f561l;

    /* renamed from: m  reason: collision with root package name */
    public Bitmap f562m;

    /* renamed from: n  reason: collision with root package name */
    public boolean f563n;

    /* renamed from: o  reason: collision with root package name */
    public int f564o;

    /* renamed from: p  reason: collision with root package name */
    public int f565p;

    /* renamed from: q  reason: collision with root package name */
    public int f566q;
    public int r;
    @Nullable
    public Boolean s;
    @NonNull
    public Bitmap.Config t = Bitmap.Config.ARGB_8888;

    public e(@NonNull a.C0019a aVar, c cVar, ByteBuffer byteBuffer, int i2) {
        this.c = aVar;
        this.f561l = new c();
        synchronized (this) {
            if (i2 > 0) {
                int highestOneBit = Integer.highestOneBit(i2);
                this.f564o = 0;
                this.f561l = cVar;
                this.f560k = -1;
                ByteBuffer asReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
                this.d = asReadOnlyBuffer;
                asReadOnlyBuffer.position(0);
                this.d.order(ByteOrder.LITTLE_ENDIAN);
                this.f563n = false;
                Iterator<b> it = cVar.f547e.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (it.next().f541g == 3) {
                            this.f563n = true;
                            break;
                        }
                    } else {
                        break;
                    }
                }
                this.f565p = highestOneBit;
                int i3 = cVar.f;
                this.r = i3 / highestOneBit;
                int i4 = cVar.f548g;
                this.f566q = i4 / highestOneBit;
                this.f558i = ((b) this.c).a(i3 * i4);
                a.C0019a aVar2 = this.c;
                int i5 = this.r * this.f566q;
                b.h.a.m.v.c0.b bVar = ((b) aVar2).f898b;
                this.f559j = bVar == null ? new int[i5] : (int[]) bVar.e(i5, int[].class);
            } else {
                throw new IllegalArgumentException("Sample size must be >=0, not: " + i2);
            }
        }
    }

    public int a() {
        return this.f560k;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00e5, code lost:
        return null;
     */
    @androidx.annotation.Nullable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized android.graphics.Bitmap b() {
        /*
            r8 = this;
            monitor-enter(r8)
            b.h.a.l.c r0 = r8.f561l     // Catch:{ all -> 0x00e6 }
            int r0 = r0.c     // Catch:{ all -> 0x00e6 }
            r1 = 3
            r2 = 1
            if (r0 <= 0) goto L_0x000d
            int r0 = r8.f560k     // Catch:{ all -> 0x00e6 }
            if (r0 >= 0) goto L_0x0039
        L_0x000d:
            java.lang.String r0 = u     // Catch:{ all -> 0x00e6 }
            boolean r3 = android.util.Log.isLoggable(r0, r1)     // Catch:{ all -> 0x00e6 }
            if (r3 == 0) goto L_0x0037
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x00e6 }
            r3.<init>()     // Catch:{ all -> 0x00e6 }
            java.lang.String r4 = "Unable to decode frame, frameCount="
            r3.append(r4)     // Catch:{ all -> 0x00e6 }
            b.h.a.l.c r4 = r8.f561l     // Catch:{ all -> 0x00e6 }
            int r4 = r4.c     // Catch:{ all -> 0x00e6 }
            r3.append(r4)     // Catch:{ all -> 0x00e6 }
            java.lang.String r4 = ", framePointer="
            r3.append(r4)     // Catch:{ all -> 0x00e6 }
            int r4 = r8.f560k     // Catch:{ all -> 0x00e6 }
            r3.append(r4)     // Catch:{ all -> 0x00e6 }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x00e6 }
            android.util.Log.d(r0, r3)     // Catch:{ all -> 0x00e6 }
        L_0x0037:
            r8.f564o = r2     // Catch:{ all -> 0x00e6 }
        L_0x0039:
            int r0 = r8.f564o     // Catch:{ all -> 0x00e6 }
            r3 = 0
            if (r0 == r2) goto L_0x00c6
            r4 = 2
            if (r0 != r4) goto L_0x0043
            goto L_0x00c6
        L_0x0043:
            r0 = 0
            r8.f564o = r0     // Catch:{ all -> 0x00e6 }
            byte[] r5 = r8.f555e     // Catch:{ all -> 0x00e6 }
            if (r5 != 0) goto L_0x0056
            b.h.a.l.a$a r5 = r8.c     // Catch:{ all -> 0x00e6 }
            r6 = 255(0xff, float:3.57E-43)
            b.h.a.m.x.g.b r5 = (b.h.a.m.x.g.b) r5
            byte[] r5 = r5.a(r6)     // Catch:{ all -> 0x00e6 }
            r8.f555e = r5     // Catch:{ all -> 0x00e6 }
        L_0x0056:
            b.h.a.l.c r5 = r8.f561l     // Catch:{ all -> 0x00e6 }
            java.util.List<b.h.a.l.b> r5 = r5.f547e     // Catch:{ all -> 0x00e6 }
            int r6 = r8.f560k     // Catch:{ all -> 0x00e6 }
            java.lang.Object r5 = r5.get(r6)     // Catch:{ all -> 0x00e6 }
            b.h.a.l.b r5 = (b.h.a.l.b) r5     // Catch:{ all -> 0x00e6 }
            int r6 = r8.f560k     // Catch:{ all -> 0x00e6 }
            int r6 = r6 - r2
            if (r6 < 0) goto L_0x0072
            b.h.a.l.c r7 = r8.f561l     // Catch:{ all -> 0x00e6 }
            java.util.List<b.h.a.l.b> r7 = r7.f547e     // Catch:{ all -> 0x00e6 }
            java.lang.Object r6 = r7.get(r6)     // Catch:{ all -> 0x00e6 }
            b.h.a.l.b r6 = (b.h.a.l.b) r6     // Catch:{ all -> 0x00e6 }
            goto L_0x0073
        L_0x0072:
            r6 = r3
        L_0x0073:
            int[] r7 = r5.f545k     // Catch:{ all -> 0x00e6 }
            if (r7 == 0) goto L_0x0078
            goto L_0x007c
        L_0x0078:
            b.h.a.l.c r7 = r8.f561l     // Catch:{ all -> 0x00e6 }
            int[] r7 = r7.a     // Catch:{ all -> 0x00e6 }
        L_0x007c:
            r8.a = r7     // Catch:{ all -> 0x00e6 }
            if (r7 != 0) goto L_0x00a2
            java.lang.String r0 = u     // Catch:{ all -> 0x00e6 }
            boolean r1 = android.util.Log.isLoggable(r0, r1)     // Catch:{ all -> 0x00e6 }
            if (r1 == 0) goto L_0x009e
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00e6 }
            r1.<init>()     // Catch:{ all -> 0x00e6 }
            java.lang.String r4 = "No valid color table found for frame #"
            r1.append(r4)     // Catch:{ all -> 0x00e6 }
            int r4 = r8.f560k     // Catch:{ all -> 0x00e6 }
            r1.append(r4)     // Catch:{ all -> 0x00e6 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x00e6 }
            android.util.Log.d(r0, r1)     // Catch:{ all -> 0x00e6 }
        L_0x009e:
            r8.f564o = r2     // Catch:{ all -> 0x00e6 }
            monitor-exit(r8)
            return r3
        L_0x00a2:
            boolean r1 = r5.f     // Catch:{ all -> 0x00e6 }
            if (r1 == 0) goto L_0x00c0
            int[] r1 = r8.f554b     // Catch:{ all -> 0x00e6 }
            int r2 = r7.length     // Catch:{ all -> 0x00e6 }
            java.lang.System.arraycopy(r7, r0, r1, r0, r2)     // Catch:{ all -> 0x00e6 }
            int[] r1 = r8.f554b     // Catch:{ all -> 0x00e6 }
            r8.a = r1     // Catch:{ all -> 0x00e6 }
            int r2 = r5.f542h     // Catch:{ all -> 0x00e6 }
            r1[r2] = r0     // Catch:{ all -> 0x00e6 }
            int r0 = r5.f541g     // Catch:{ all -> 0x00e6 }
            if (r0 != r4) goto L_0x00c0
            int r0 = r8.f560k     // Catch:{ all -> 0x00e6 }
            if (r0 != 0) goto L_0x00c0
            java.lang.Boolean r0 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x00e6 }
            r8.s = r0     // Catch:{ all -> 0x00e6 }
        L_0x00c0:
            android.graphics.Bitmap r0 = r8.j(r5, r6)     // Catch:{ all -> 0x00e6 }
            monitor-exit(r8)
            return r0
        L_0x00c6:
            java.lang.String r0 = u     // Catch:{ all -> 0x00e6 }
            boolean r1 = android.util.Log.isLoggable(r0, r1)     // Catch:{ all -> 0x00e6 }
            if (r1 == 0) goto L_0x00e4
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00e6 }
            r1.<init>()     // Catch:{ all -> 0x00e6 }
            java.lang.String r2 = "Unable to decode frame, status="
            r1.append(r2)     // Catch:{ all -> 0x00e6 }
            int r2 = r8.f564o     // Catch:{ all -> 0x00e6 }
            r1.append(r2)     // Catch:{ all -> 0x00e6 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x00e6 }
            android.util.Log.d(r0, r1)     // Catch:{ all -> 0x00e6 }
        L_0x00e4:
            monitor-exit(r8)
            return r3
        L_0x00e6:
            r0 = move-exception
            monitor-exit(r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: b.h.a.l.e.b():android.graphics.Bitmap");
    }

    public void c() {
        this.f560k = (this.f560k + 1) % this.f561l.c;
    }

    public void clear() {
        b.h.a.m.v.c0.b bVar;
        b.h.a.m.v.c0.b bVar2;
        b.h.a.m.v.c0.b bVar3;
        this.f561l = null;
        byte[] bArr = this.f558i;
        if (!(bArr == null || (bVar3 = ((b) this.c).f898b) == null)) {
            bVar3.d(bArr);
        }
        int[] iArr = this.f559j;
        if (!(iArr == null || (bVar2 = ((b) this.c).f898b) == null)) {
            bVar2.d(iArr);
        }
        Bitmap bitmap = this.f562m;
        if (bitmap != null) {
            ((b) this.c).a.e(bitmap);
        }
        this.f562m = null;
        this.d = null;
        this.s = null;
        byte[] bArr2 = this.f555e;
        if (bArr2 != null && (bVar = ((b) this.c).f898b) != null) {
            bVar.d(bArr2);
        }
    }

    public int d() {
        return this.f561l.c;
    }

    public int e() {
        int i2;
        c cVar = this.f561l;
        int i3 = cVar.c;
        if (i3 <= 0 || (i2 = this.f560k) < 0) {
            return 0;
        }
        if (i2 < 0 || i2 >= i3) {
            return -1;
        }
        return cVar.f547e.get(i2).f543i;
    }

    public int f() {
        return (this.f559j.length * 4) + this.d.limit() + this.f558i.length;
    }

    @NonNull
    public ByteBuffer g() {
        return this.d;
    }

    public final Bitmap h() {
        Boolean bool = this.s;
        Bitmap.Config config = (bool == null || bool.booleanValue()) ? Bitmap.Config.ARGB_8888 : this.t;
        Bitmap c2 = ((b) this.c).a.c(this.r, this.f566q, config);
        c2.setHasAlpha(true);
        return c2;
    }

    public void i(@NonNull Bitmap.Config config) {
        if (config == Bitmap.Config.ARGB_8888 || config == Bitmap.Config.RGB_565) {
            this.t = config;
            return;
        }
        throw new IllegalArgumentException("Unsupported format: " + config + ", must be one of " + Bitmap.Config.ARGB_8888 + " or " + Bitmap.Config.RGB_565);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v23, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v12, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v15, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v39, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v40, resolved type: byte} */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0045, code lost:
        if (r3.f551j == r1.f542h) goto L_0x0047;
     */
    /* JADX WARNING: Incorrect type for immutable var: ssa=short, code=int, for r0v24, types: [short] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:222:0x0409  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x005e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.graphics.Bitmap j(b.h.a.l.b r34, b.h.a.l.b r35) {
        /*
            r33 = this;
            r0 = r33
            r1 = r34
            r2 = r35
            int[] r10 = r0.f559j
            r11 = 0
            if (r2 != 0) goto L_0x001e
            android.graphics.Bitmap r3 = r0.f562m
            if (r3 == 0) goto L_0x0018
            b.h.a.l.a$a r4 = r0.c
            b.h.a.m.x.g.b r4 = (b.h.a.m.x.g.b) r4
            b.h.a.m.v.c0.d r4 = r4.a
            r4.e(r3)
        L_0x0018:
            r3 = 0
            r0.f562m = r3
            java.util.Arrays.fill(r10, r11)
        L_0x001e:
            r3 = 3
            if (r2 == 0) goto L_0x002c
            int r4 = r2.f541g
            if (r4 != r3) goto L_0x002c
            android.graphics.Bitmap r4 = r0.f562m
            if (r4 != 0) goto L_0x002c
            java.util.Arrays.fill(r10, r11)
        L_0x002c:
            r4 = 2
            if (r2 == 0) goto L_0x007e
            int r5 = r2.f541g
            if (r5 <= 0) goto L_0x007e
            if (r5 != r4) goto L_0x006c
            boolean r3 = r1.f
            if (r3 != 0) goto L_0x0047
            b.h.a.l.c r3 = r0.f561l
            int r4 = r3.f552k
            int[] r5 = r1.f545k
            if (r5 == 0) goto L_0x0048
            int r3 = r3.f551j
            int r5 = r1.f542h
            if (r3 != r5) goto L_0x0048
        L_0x0047:
            r4 = r11
        L_0x0048:
            int r3 = r2.d
            int r5 = r0.f565p
            int r3 = r3 / r5
            int r6 = r2.f539b
            int r6 = r6 / r5
            int r7 = r2.c
            int r7 = r7 / r5
            int r2 = r2.a
            int r2 = r2 / r5
            int r5 = r0.r
            int r6 = r6 * r5
            int r6 = r6 + r2
            int r3 = r3 * r5
            int r3 = r3 + r6
        L_0x005c:
            if (r6 >= r3) goto L_0x007e
            int r2 = r6 + r7
            r5 = r6
        L_0x0061:
            if (r5 >= r2) goto L_0x0068
            r10[r5] = r4
            int r5 = r5 + 1
            goto L_0x0061
        L_0x0068:
            int r2 = r0.r
            int r6 = r6 + r2
            goto L_0x005c
        L_0x006c:
            if (r5 != r3) goto L_0x007e
            android.graphics.Bitmap r2 = r0.f562m
            if (r2 == 0) goto L_0x007e
            r4 = 0
            int r8 = r0.r
            r6 = 0
            r7 = 0
            int r9 = r0.f566q
            r3 = r10
            r5 = r8
            r2.getPixels(r3, r4, r5, r6, r7, r8, r9)
        L_0x007e:
            java.nio.ByteBuffer r2 = r0.d
            int r3 = r1.f544j
            r2.position(r3)
            int r2 = r1.c
            int r3 = r1.d
            int r2 = r2 * r3
            byte[] r3 = r0.f558i
            if (r3 == 0) goto L_0x0091
            int r3 = r3.length
            if (r3 >= r2) goto L_0x009b
        L_0x0091:
            b.h.a.l.a$a r3 = r0.c
            b.h.a.m.x.g.b r3 = (b.h.a.m.x.g.b) r3
            byte[] r3 = r3.a(r2)
            r0.f558i = r3
        L_0x009b:
            byte[] r3 = r0.f558i
            short[] r4 = r0.f
            r5 = 4096(0x1000, float:5.74E-42)
            if (r4 != 0) goto L_0x00a7
            short[] r4 = new short[r5]
            r0.f = r4
        L_0x00a7:
            short[] r4 = r0.f
            byte[] r6 = r0.f556g
            if (r6 != 0) goto L_0x00b1
            byte[] r5 = new byte[r5]
            r0.f556g = r5
        L_0x00b1:
            byte[] r5 = r0.f556g
            byte[] r6 = r0.f557h
            if (r6 != 0) goto L_0x00bd
            r6 = 4097(0x1001, float:5.741E-42)
            byte[] r6 = new byte[r6]
            r0.f557h = r6
        L_0x00bd:
            byte[] r6 = r0.f557h
            java.nio.ByteBuffer r7 = r0.d
            byte r7 = r7.get()
            r7 = r7 & 255(0xff, float:3.57E-43)
            r8 = 1
            int r9 = r8 << r7
            int r12 = r9 + 1
            int r13 = r9 + 2
            int r7 = r7 + r8
            int r8 = r8 << r7
            int r8 = r8 + -1
            r14 = r11
        L_0x00d3:
            if (r14 >= r9) goto L_0x00dd
            r4[r14] = r11
            byte r15 = (byte) r14
            r5[r14] = r15
            int r14 = r14 + 1
            goto L_0x00d3
        L_0x00dd:
            byte[] r14 = r0.f555e
            r15 = -1
            r35 = r7
            r25 = r35
            r23 = r8
            r26 = r23
            r7 = r11
            r16 = r7
            r17 = r16
            r18 = r17
            r19 = r18
            r20 = r19
            r21 = r20
            r24 = r13
            r22 = r15
            r8 = r0
            r15 = r21
        L_0x00fc:
            r27 = 8
            if (r11 >= r2) goto L_0x0200
            if (r16 != 0) goto L_0x0136
            java.nio.ByteBuffer r15 = r8.d
            byte r15 = r15.get()
            r15 = r15 & 255(0xff, float:3.57E-43)
            if (r15 > 0) goto L_0x0113
            r30 = r10
            r28 = r11
            r29 = r13
            goto L_0x0129
        L_0x0113:
            r28 = r11
            java.nio.ByteBuffer r11 = r8.d
            r29 = r13
            byte[] r13 = r8.f555e
            r30 = r10
            int r10 = r11.remaining()
            int r10 = java.lang.Math.min(r15, r10)
            r0 = 0
            r11.get(r13, r0, r10)
        L_0x0129:
            if (r15 > 0) goto L_0x0131
            r0 = 3
            r8.f564o = r0
            r15 = 0
            goto L_0x0202
        L_0x0131:
            r17 = 0
            r16 = r15
            goto L_0x013c
        L_0x0136:
            r30 = r10
            r28 = r11
            r29 = r13
        L_0x013c:
            byte r0 = r14[r17]
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r0 = r0 << r18
            int r19 = r19 + r0
            int r18 = r18 + 8
            int r17 = r17 + 1
            int r16 = r16 + -1
            r0 = r18
            r10 = r20
            r13 = r22
            r15 = r24
            r11 = r28
            r18 = r8
            r8 = r25
        L_0x0158:
            if (r0 < r8) goto L_0x01e0
            r20 = r14
            r14 = r19 & r26
            int r19 = r19 >> r8
            int r0 = r0 - r8
            if (r14 != r9) goto L_0x0175
            r8 = -1
            r22 = r6
            r13 = r8
            r26 = r23
            r15 = r29
            r8 = r35
            r32 = r18
            r18 = r0
            r0 = r32
            goto L_0x01d4
        L_0x0175:
            if (r14 != r12) goto L_0x017b
            r22 = r6
            goto L_0x01e6
        L_0x017b:
            r18 = r0
            r0 = -1
            if (r13 != r0) goto L_0x0191
            byte r0 = r5[r14]
            r3[r7] = r0
            int r7 = r7 + 1
            int r11 = r11 + 1
            r10 = r14
            r13 = r10
            r0 = r18
            r14 = r20
            r18 = r33
            goto L_0x0158
        L_0x0191:
            if (r14 < r15) goto L_0x019a
            byte r0 = (byte) r10
            r6[r21] = r0
            int r21 = r21 + 1
            r0 = r13
            goto L_0x019b
        L_0x019a:
            r0 = r14
        L_0x019b:
            if (r0 < r9) goto L_0x01a6
            byte r10 = r5[r0]
            r6[r21] = r10
            int r21 = r21 + 1
            short r0 = r4[r0]
            goto L_0x019b
        L_0x01a6:
            byte r0 = r5[r0]
            r10 = r0 & 255(0xff, float:3.57E-43)
            byte r0 = (byte) r10
            r3[r7] = r0
        L_0x01ad:
            int r7 = r7 + 1
            int r11 = r11 + 1
            if (r21 <= 0) goto L_0x01ba
            int r21 = r21 + -1
            byte r22 = r6[r21]
            r3[r7] = r22
            goto L_0x01ad
        L_0x01ba:
            r22 = r6
            r6 = 4096(0x1000, float:5.74E-42)
            if (r15 >= r6) goto L_0x01d1
            short r13 = (short) r13
            r4[r15] = r13
            r5[r15] = r0
            int r15 = r15 + 1
            r0 = r15 & r26
            if (r0 != 0) goto L_0x01d1
            if (r15 >= r6) goto L_0x01d1
            int r8 = r8 + 1
            int r26 = r26 + r15
        L_0x01d1:
            r0 = r33
            r13 = r14
        L_0x01d4:
            r14 = r20
            r6 = r22
            r32 = r18
            r18 = r0
            r0 = r32
            goto L_0x0158
        L_0x01e0:
            r22 = r6
            r20 = r14
            r18 = r33
        L_0x01e6:
            r6 = 0
            r25 = r8
            r24 = r15
            r8 = r18
            r14 = r20
            r18 = r0
            r15 = r6
            r20 = r10
            r6 = r22
            r10 = r30
            r0 = r33
            r22 = r13
            r13 = r29
            goto L_0x00fc
        L_0x0200:
            r30 = r10
        L_0x0202:
            java.util.Arrays.fill(r3, r7, r2, r15)
            boolean r0 = r1.f540e
            if (r0 != 0) goto L_0x027a
            r0 = r33
            int r2 = r0.f565p
            r3 = 1
            if (r2 == r3) goto L_0x0212
            goto L_0x027c
        L_0x0212:
            int[] r2 = r0.f559j
            int r3 = r1.d
            int r4 = r1.f539b
            int r5 = r1.c
            int r6 = r1.a
            int r7 = r0.f560k
            if (r7 != 0) goto L_0x0222
            r7 = 1
            goto L_0x0223
        L_0x0222:
            r7 = r15
        L_0x0223:
            int r8 = r0.r
            byte[] r9 = r0.f558i
            int[] r10 = r0.a
            r11 = -1
        L_0x022a:
            if (r15 >= r3) goto L_0x025c
            int r12 = r15 + r4
            int r12 = r12 * r8
            int r13 = r12 + r6
            int r14 = r13 + r5
            int r12 = r12 + r8
            if (r12 >= r14) goto L_0x0237
            r14 = r12
        L_0x0237:
            int r12 = r1.c
            int r12 = r12 * r15
        L_0x023a:
            r16 = r3
            if (r13 >= r14) goto L_0x0257
            byte r3 = r9[r12]
            r17 = r4
            r4 = r3 & 255(0xff, float:3.57E-43)
            if (r4 == r11) goto L_0x024e
            r4 = r10[r4]
            if (r4 == 0) goto L_0x024d
            r2[r13] = r4
            goto L_0x024e
        L_0x024d:
            r11 = r3
        L_0x024e:
            int r12 = r12 + 1
            int r13 = r13 + 1
            r3 = r16
            r4 = r17
            goto L_0x023a
        L_0x0257:
            r17 = r4
            int r15 = r15 + 1
            goto L_0x022a
        L_0x025c:
            java.lang.Boolean r2 = r0.s
            if (r2 == 0) goto L_0x0266
            boolean r2 = r2.booleanValue()
            if (r2 != 0) goto L_0x026f
        L_0x0266:
            java.lang.Boolean r2 = r0.s
            if (r2 != 0) goto L_0x0271
            if (r7 == 0) goto L_0x0271
            r2 = -1
            if (r11 == r2) goto L_0x0271
        L_0x026f:
            r2 = 1
            goto L_0x0272
        L_0x0271:
            r2 = 0
        L_0x0272:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            r0.s = r2
            goto L_0x03fa
        L_0x027a:
            r0 = r33
        L_0x027c:
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            int[] r3 = r0.f559j
            int r4 = r1.d
            int r5 = r0.f565p
            int r4 = r4 / r5
            int r6 = r1.f539b
            int r6 = r6 / r5
            int r7 = r1.c
            int r7 = r7 / r5
            int r8 = r1.a
            int r8 = r8 / r5
            int r9 = r0.f560k
            if (r9 != 0) goto L_0x0294
            r9 = 1
            goto L_0x0295
        L_0x0294:
            r9 = 0
        L_0x0295:
            int r10 = r0.r
            int r11 = r0.f566q
            byte[] r12 = r0.f558i
            int[] r13 = r0.a
            java.lang.Boolean r14 = r0.s
            r15 = 0
            r16 = 0
            r17 = 1
            r35 = r2
            r2 = r16
        L_0x02a8:
            r16 = r14
            if (r2 >= r4) goto L_0x03e8
            boolean r14 = r1.f540e
            if (r14 == 0) goto L_0x02d1
            if (r15 < r4) goto L_0x02cc
            int r14 = r17 + 1
            r18 = r4
            r4 = 2
            if (r14 == r4) goto L_0x02c8
            r4 = 3
            if (r14 == r4) goto L_0x02c4
            r4 = 4
            if (r14 == r4) goto L_0x02c0
            goto L_0x02c9
        L_0x02c0:
            r27 = 2
            r15 = 1
            goto L_0x02c9
        L_0x02c4:
            r27 = 4
            r15 = 2
            goto L_0x02c9
        L_0x02c8:
            r15 = 4
        L_0x02c9:
            r17 = r14
            goto L_0x02ce
        L_0x02cc:
            r18 = r4
        L_0x02ce:
            int r4 = r15 + r27
            goto L_0x02d5
        L_0x02d1:
            r18 = r4
            r4 = r15
            r15 = r2
        L_0x02d5:
            int r15 = r15 + r6
            r14 = 1
            if (r5 != r14) goto L_0x02db
            r14 = 1
            goto L_0x02dc
        L_0x02db:
            r14 = 0
        L_0x02dc:
            if (r15 >= r11) goto L_0x03c8
            int r15 = r15 * r10
            r19 = r4
            int r4 = r15 + r8
            r20 = r6
            int r6 = r4 + r7
            int r15 = r15 + r10
            if (r15 >= r6) goto L_0x02eb
            r6 = r15
        L_0x02eb:
            int r15 = r2 * r5
            r21 = r7
            int r7 = r1.c
            int r15 = r15 * r7
            if (r14 == 0) goto L_0x0315
            r14 = r16
        L_0x02f6:
            if (r4 >= r6) goto L_0x030d
            byte r7 = r12[r15]
            r7 = r7 & 255(0xff, float:3.57E-43)
            r7 = r13[r7]
            if (r7 == 0) goto L_0x0303
            r3[r4] = r7
            goto L_0x0309
        L_0x0303:
            if (r9 == 0) goto L_0x0309
            if (r14 != 0) goto L_0x0309
            r14 = r35
        L_0x0309:
            int r15 = r15 + r5
            int r4 = r4 + 1
            goto L_0x02f6
        L_0x030d:
            r28 = r8
            r29 = r10
            r31 = r11
            goto L_0x03d6
        L_0x0315:
            int r7 = b.e.a.a.a.w(r6, r4, r5, r15)
            r14 = r16
        L_0x031b:
            if (r4 >= r6) goto L_0x030d
            r22 = r6
            int r6 = r1.c
            r16 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r28 = r8
            r29 = r10
            r8 = r15
        L_0x0330:
            int r10 = r0.f565p
            int r10 = r10 + r15
            if (r8 >= r10) goto L_0x0365
            byte[] r10 = r0.f558i
            r31 = r11
            int r11 = r10.length
            if (r8 >= r11) goto L_0x0367
            if (r8 >= r7) goto L_0x0367
            byte r10 = r10[r8]
            r10 = r10 & 255(0xff, float:3.57E-43)
            int[] r11 = r0.a
            r10 = r11[r10]
            if (r10 == 0) goto L_0x0360
            int r11 = r10 >> 24
            r11 = r11 & 255(0xff, float:3.57E-43)
            int r16 = r16 + r11
            int r11 = r10 >> 16
            r11 = r11 & 255(0xff, float:3.57E-43)
            int r23 = r23 + r11
            int r11 = r10 >> 8
            r11 = r11 & 255(0xff, float:3.57E-43)
            int r24 = r24 + r11
            r10 = r10 & 255(0xff, float:3.57E-43)
            int r25 = r25 + r10
            int r26 = r26 + 1
        L_0x0360:
            int r8 = r8 + 1
            r11 = r31
            goto L_0x0330
        L_0x0365:
            r31 = r11
        L_0x0367:
            int r6 = r6 + r15
            r8 = r6
        L_0x0369:
            int r10 = r0.f565p
            int r10 = r10 + r6
            if (r8 >= r10) goto L_0x039a
            byte[] r10 = r0.f558i
            int r11 = r10.length
            if (r8 >= r11) goto L_0x039a
            if (r8 >= r7) goto L_0x039a
            byte r10 = r10[r8]
            r10 = r10 & 255(0xff, float:3.57E-43)
            int[] r11 = r0.a
            r10 = r11[r10]
            if (r10 == 0) goto L_0x0397
            int r11 = r10 >> 24
            r11 = r11 & 255(0xff, float:3.57E-43)
            int r16 = r16 + r11
            int r11 = r10 >> 16
            r11 = r11 & 255(0xff, float:3.57E-43)
            int r23 = r23 + r11
            int r11 = r10 >> 8
            r11 = r11 & 255(0xff, float:3.57E-43)
            int r24 = r24 + r11
            r10 = r10 & 255(0xff, float:3.57E-43)
            int r25 = r25 + r10
            int r26 = r26 + 1
        L_0x0397:
            int r8 = r8 + 1
            goto L_0x0369
        L_0x039a:
            if (r26 != 0) goto L_0x039e
            r6 = 0
            goto L_0x03b0
        L_0x039e:
            int r16 = r16 / r26
            int r6 = r16 << 24
            int r23 = r23 / r26
            int r8 = r23 << 16
            r6 = r6 | r8
            int r24 = r24 / r26
            int r8 = r24 << 8
            r6 = r6 | r8
            int r25 = r25 / r26
            r6 = r6 | r25
        L_0x03b0:
            if (r6 == 0) goto L_0x03b5
            r3[r4] = r6
            goto L_0x03bb
        L_0x03b5:
            if (r9 == 0) goto L_0x03bb
            if (r14 != 0) goto L_0x03bb
            r14 = r35
        L_0x03bb:
            int r15 = r15 + r5
            int r4 = r4 + 1
            r6 = r22
            r8 = r28
            r10 = r29
            r11 = r31
            goto L_0x031b
        L_0x03c8:
            r19 = r4
            r20 = r6
            r21 = r7
            r28 = r8
            r29 = r10
            r31 = r11
            r14 = r16
        L_0x03d6:
            int r2 = r2 + 1
            r4 = r18
            r15 = r19
            r6 = r20
            r7 = r21
            r8 = r28
            r10 = r29
            r11 = r31
            goto L_0x02a8
        L_0x03e8:
            java.lang.Boolean r2 = r0.s
            if (r2 != 0) goto L_0x03fa
            if (r16 != 0) goto L_0x03f0
            r2 = 0
            goto L_0x03f4
        L_0x03f0:
            boolean r2 = r16.booleanValue()
        L_0x03f4:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            r0.s = r2
        L_0x03fa:
            boolean r2 = r0.f563n
            if (r2 == 0) goto L_0x041e
            int r1 = r1.f541g
            if (r1 == 0) goto L_0x0405
            r2 = 1
            if (r1 != r2) goto L_0x041e
        L_0x0405:
            android.graphics.Bitmap r1 = r0.f562m
            if (r1 != 0) goto L_0x040f
            android.graphics.Bitmap r1 = r33.h()
            r0.f562m = r1
        L_0x040f:
            android.graphics.Bitmap r1 = r0.f562m
            r3 = 0
            int r7 = r0.r
            r5 = 0
            r6 = 0
            int r8 = r0.f566q
            r2 = r30
            r4 = r7
            r1.setPixels(r2, r3, r4, r5, r6, r7, r8)
        L_0x041e:
            android.graphics.Bitmap r9 = r33.h()
            r3 = 0
            int r7 = r0.r
            r5 = 0
            r6 = 0
            int r8 = r0.f566q
            r1 = r9
            r2 = r30
            r4 = r7
            r1.setPixels(r2, r3, r4, r5, r6, r7, r8)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: b.h.a.l.e.j(b.h.a.l.b, b.h.a.l.b):android.graphics.Bitmap");
    }
}
