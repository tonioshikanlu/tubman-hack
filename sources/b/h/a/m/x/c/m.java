package b.h.a.m.x.c;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.util.DisplayMetrics;
import androidx.annotation.Nullable;
import b.h.a.m.o;
import b.h.a.m.p;
import b.h.a.m.q;
import b.h.a.m.v.c0.d;
import b.h.a.m.v.w;
import b.h.a.m.x.c.s;
import b.h.a.s.j;
import com.bumptech.glide.load.ImageHeaderParser;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Queue;
import java.util.Set;

public final class m {
    public static final o<b.h.a.m.b> f = o.a("com.bumptech.glide.load.resource.bitmap.Downsampler.DecodeFormat", b.h.a.m.b.PREFER_ARGB_8888);

    /* renamed from: g  reason: collision with root package name */
    public static final o<q> f864g = o.a("com.bumptech.glide.load.resource.bitmap.Downsampler.PreferredColorSpace", q.SRGB);

    /* renamed from: h  reason: collision with root package name */
    public static final o<Boolean> f865h;

    /* renamed from: i  reason: collision with root package name */
    public static final o<Boolean> f866i;

    /* renamed from: j  reason: collision with root package name */
    public static final Set<String> f867j = Collections.unmodifiableSet(new HashSet(Arrays.asList(new String[]{"image/vnd.wap.wbmp", "image/x-ico"})));

    /* renamed from: k  reason: collision with root package name */
    public static final b f868k = new a();

    /* renamed from: l  reason: collision with root package name */
    public static final Set<ImageHeaderParser.ImageType> f869l = Collections.unmodifiableSet(EnumSet.of(ImageHeaderParser.ImageType.JPEG, ImageHeaderParser.ImageType.PNG_A, ImageHeaderParser.ImageType.PNG));

    /* renamed from: m  reason: collision with root package name */
    public static final Queue<BitmapFactory.Options> f870m = new ArrayDeque(0);
    public final d a;

    /* renamed from: b  reason: collision with root package name */
    public final DisplayMetrics f871b;
    public final b.h.a.m.v.c0.b c;
    public final List<ImageHeaderParser> d;

    /* renamed from: e  reason: collision with root package name */
    public final r f872e = r.a();

    public class a implements b {
        public void a(d dVar, Bitmap bitmap) {
        }

        public void b() {
        }
    }

    public interface b {
        void a(d dVar, Bitmap bitmap);

        void b();
    }

    static {
        o<l> oVar = l.f;
        Boolean bool = Boolean.FALSE;
        f865h = o.a("com.bumptech.glide.load.resource.bitmap.Downsampler.FixBitmapSize", bool);
        f866i = o.a("com.bumptech.glide.load.resource.bitmap.Downsampler.AllowHardwareDecode", bool);
        char[] cArr = j.a;
    }

    public m(List<ImageHeaderParser> list, DisplayMetrics displayMetrics, d dVar, b.h.a.m.v.c0.b bVar) {
        this.d = list;
        Objects.requireNonNull(displayMetrics, "Argument must not be null");
        this.f871b = displayMetrics;
        Objects.requireNonNull(dVar, "Argument must not be null");
        this.a = dVar;
        Objects.requireNonNull(bVar, "Argument must not be null");
        this.c = bVar;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:20|21) */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        throw r1;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:20:0x0046 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.Bitmap d(b.h.a.m.x.c.s r5, android.graphics.BitmapFactory.Options r6, b.h.a.m.x.c.m.b r7, b.h.a.m.v.c0.d r8) {
        /*
            java.lang.String r0 = "Downsampler"
            boolean r1 = r6.inJustDecodeBounds
            if (r1 != 0) goto L_0x000c
            r7.b()
            r5.b()
        L_0x000c:
            int r1 = r6.outWidth
            int r2 = r6.outHeight
            java.lang.String r3 = r6.outMimeType
            java.util.concurrent.locks.Lock r4 = b.h.a.m.x.c.z.d
            r4.lock()
            android.graphics.Bitmap r5 = r5.a(r6)     // Catch:{ IllegalArgumentException -> 0x0021 }
            r4.unlock()
            return r5
        L_0x001f:
            r5 = move-exception
            goto L_0x0048
        L_0x0021:
            r4 = move-exception
            java.io.IOException r1 = i(r4, r1, r2, r3, r6)     // Catch:{ all -> 0x001f }
            r2 = 3
            boolean r2 = android.util.Log.isLoggable(r0, r2)     // Catch:{ all -> 0x001f }
            if (r2 == 0) goto L_0x0032
            java.lang.String r2 = "Failed to decode with inBitmap, trying again without Bitmap re-use"
            android.util.Log.d(r0, r2, r1)     // Catch:{ all -> 0x001f }
        L_0x0032:
            android.graphics.Bitmap r0 = r6.inBitmap     // Catch:{ all -> 0x001f }
            if (r0 == 0) goto L_0x0047
            r8.e(r0)     // Catch:{ IOException -> 0x0046 }
            r0 = 0
            r6.inBitmap = r0     // Catch:{ IOException -> 0x0046 }
            android.graphics.Bitmap r5 = d(r5, r6, r7, r8)     // Catch:{ IOException -> 0x0046 }
            java.util.concurrent.locks.Lock r6 = b.h.a.m.x.c.z.d
            r6.unlock()
            return r5
        L_0x0046:
            throw r1     // Catch:{ all -> 0x001f }
        L_0x0047:
            throw r1     // Catch:{ all -> 0x001f }
        L_0x0048:
            java.util.concurrent.locks.Lock r6 = b.h.a.m.x.c.z.d
            r6.unlock()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: b.h.a.m.x.c.m.d(b.h.a.m.x.c.s, android.graphics.BitmapFactory$Options, b.h.a.m.x.c.m$b, b.h.a.m.v.c0.d):android.graphics.Bitmap");
    }

    @TargetApi(19)
    @Nullable
    public static String e(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        StringBuilder y = b.e.a.a.a.y(" (");
        y.append(bitmap.getAllocationByteCount());
        y.append(")");
        String sb = y.toString();
        StringBuilder y2 = b.e.a.a.a.y("[");
        y2.append(bitmap.getWidth());
        y2.append("x");
        y2.append(bitmap.getHeight());
        y2.append("] ");
        y2.append(bitmap.getConfig());
        y2.append(sb);
        return y2.toString();
    }

    public static int f(double d2) {
        if (d2 > 1.0d) {
            d2 = 1.0d / d2;
        }
        return (int) Math.round(d2 * 2.147483647E9d);
    }

    public static int[] g(s sVar, BitmapFactory.Options options, b bVar, d dVar) {
        options.inJustDecodeBounds = true;
        d(sVar, options, bVar, dVar);
        options.inJustDecodeBounds = false;
        return new int[]{options.outWidth, options.outHeight};
    }

    public static boolean h(int i2) {
        return i2 == 90 || i2 == 270;
    }

    public static IOException i(IllegalArgumentException illegalArgumentException, int i2, int i3, String str, BitmapFactory.Options options) {
        StringBuilder A = b.e.a.a.a.A("Exception decoding bitmap, outWidth: ", i2, ", outHeight: ", i3, ", outMimeType: ");
        A.append(str);
        A.append(", inBitmap: ");
        A.append(e(options.inBitmap));
        return new IOException(A.toString(), illegalArgumentException);
    }

    public static void j(BitmapFactory.Options options) {
        options.inTempStorage = null;
        options.inDither = false;
        options.inScaled = false;
        options.inSampleSize = 1;
        options.inPreferredConfig = null;
        options.inJustDecodeBounds = false;
        options.inDensity = 0;
        options.inTargetDensity = 0;
        if (Build.VERSION.SDK_INT >= 26) {
            options.inPreferredColorSpace = null;
            options.outColorSpace = null;
            options.outConfig = null;
        }
        options.outWidth = 0;
        options.outHeight = 0;
        options.outMimeType = null;
        options.inBitmap = null;
        options.inMutable = true;
    }

    public static int k(double d2) {
        return (int) (d2 + 0.5d);
    }

    public final w<Bitmap> a(s sVar, int i2, int i3, p pVar, b bVar) {
        Queue<BitmapFactory.Options> queue;
        BitmapFactory.Options poll;
        BitmapFactory.Options options;
        p pVar2 = pVar;
        byte[] bArr = (byte[]) this.c.e(65536, byte[].class);
        synchronized (m.class) {
            queue = f870m;
            synchronized (queue) {
                poll = queue.poll();
            }
            if (poll == null) {
                poll = new BitmapFactory.Options();
                j(poll);
            }
            options = poll;
        }
        options.inTempStorage = bArr;
        b.h.a.m.b bVar2 = (b.h.a.m.b) pVar2.c(f);
        q qVar = (q) pVar2.c(f864g);
        l lVar = (l) pVar2.c(l.f);
        boolean booleanValue = ((Boolean) pVar2.c(f865h)).booleanValue();
        o oVar = f866i;
        try {
            e c2 = e.c(c(sVar, options, lVar, bVar2, qVar, pVar2.c(oVar) != null && ((Boolean) pVar2.c(oVar)).booleanValue(), i2, i3, booleanValue, bVar), this.a);
            j(options);
            synchronized (queue) {
                queue.offer(options);
            }
            this.c.d(bArr);
            return c2;
        } catch (Throwable th) {
            j(options);
            Queue<BitmapFactory.Options> queue2 = f870m;
            synchronized (queue2) {
                queue2.offer(options);
                this.c.d(bArr);
                throw th;
            }
        }
    }

    public w<Bitmap> b(InputStream inputStream, int i2, int i3, p pVar, b bVar) {
        return a(new s.a(inputStream, this.d, this.c), i2, i3, pVar, bVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:158:0x03c6, code lost:
        if (r4 >= 26) goto L_0x03c8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:178:0x04a4, code lost:
        r2.postScale(-1.0f, 1.0f);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:181:0x04b3, code lost:
        r3 = new android.graphics.RectF(0.0f, 0.0f, (float) r0.getWidth(), (float) r0.getHeight());
        r2.mapRect(r3);
        r1 = r1.d(java.lang.Math.round(r3.width()), java.lang.Math.round(r3.height()), b.h.a.m.x.c.z.c(r0));
        r2.postTranslate(-r3.left, -r3.top);
        r1.setHasAlpha(r0.hasAlpha());
        b.h.a.m.x.c.z.a(r0, r1, r2);
     */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x0303 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x031b  */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x0321  */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x034b  */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x0388  */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x0395  */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x039f  */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x03a2  */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x03ae  */
    /* JADX WARNING: Removed duplicated region for block: B:158:0x03c6  */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x03e6  */
    /* JADX WARNING: Removed duplicated region for block: B:165:0x046c  */
    /* JADX WARNING: Removed duplicated region for block: B:185:0x04fd A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0199  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x019d  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x01ab  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x020f  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x02ad  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x02b6  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x02b8  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.graphics.Bitmap c(b.h.a.m.x.c.s r33, android.graphics.BitmapFactory.Options r34, b.h.a.m.x.c.l r35, b.h.a.m.b r36, b.h.a.m.q r37, boolean r38, int r39, int r40, boolean r41, b.h.a.m.x.c.m.b r42) {
        /*
            r32 = this;
            r1 = r32
            r2 = r33
            r3 = r34
            r0 = r35
            r4 = r36
            r5 = r39
            r6 = r40
            r7 = r42
            int r8 = b.h.a.s.f.f1014b
            long r8 = android.os.SystemClock.elapsedRealtimeNanos()
            b.h.a.m.v.c0.d r10 = r1.a
            int[] r10 = g(r2, r3, r7, r10)
            r11 = 0
            r12 = r10[r11]
            r13 = 1
            r10 = r10[r13]
            java.lang.String r14 = r3.outMimeType
            r15 = -1
            if (r12 == r15) goto L_0x002d
            if (r10 != r15) goto L_0x002a
            goto L_0x002d
        L_0x002a:
            r15 = r38
            goto L_0x002e
        L_0x002d:
            r15 = r11
        L_0x002e:
            int r16 = r33.c()
            switch(r16) {
                case 3: goto L_0x003e;
                case 4: goto L_0x003e;
                case 5: goto L_0x003b;
                case 6: goto L_0x003b;
                case 7: goto L_0x0038;
                case 8: goto L_0x0038;
                default: goto L_0x0035;
            }
        L_0x0035:
            r38 = r11
            goto L_0x0042
        L_0x0038:
            r17 = 270(0x10e, float:3.78E-43)
            goto L_0x0040
        L_0x003b:
            r17 = 90
            goto L_0x0040
        L_0x003e:
            r17 = 180(0xb4, float:2.52E-43)
        L_0x0040:
            r38 = r17
        L_0x0042:
            switch(r16) {
                case 2: goto L_0x0046;
                case 3: goto L_0x0046;
                case 4: goto L_0x0046;
                case 5: goto L_0x0046;
                case 6: goto L_0x0046;
                case 7: goto L_0x0046;
                case 8: goto L_0x0046;
                default: goto L_0x0045;
            }
        L_0x0045:
            goto L_0x0047
        L_0x0046:
            r11 = r13
        L_0x0047:
            r13 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r5 != r13) goto L_0x0059
            boolean r17 = h(r38)
            if (r17 == 0) goto L_0x0055
            r17 = r8
            r8 = r10
            goto L_0x005c
        L_0x0055:
            r17 = r8
            r8 = r12
            goto L_0x005c
        L_0x0059:
            r17 = r8
            r8 = r5
        L_0x005c:
            if (r6 != r13) goto L_0x0068
            boolean r9 = h(r38)
            if (r9 == 0) goto L_0x0066
            r9 = r12
            goto L_0x0069
        L_0x0066:
            r9 = r10
            goto L_0x0069
        L_0x0068:
            r9 = r6
        L_0x0069:
            com.bumptech.glide.load.ImageHeaderParser$ImageType r13 = r33.d()
            b.h.a.m.v.c0.d r6 = r1.a
            java.lang.String r5 = "]"
            r19 = r14
            java.lang.String r14 = ", target density: "
            java.lang.String r4 = ", density: "
            r20 = r11
            java.lang.String r11 = "x"
            r21 = r15
            java.lang.String r15 = "Downsampler"
            if (r12 <= 0) goto L_0x026b
            if (r10 > 0) goto L_0x008f
            r0 = 3
            r6 = r9
            r9 = r12
            r1 = r14
            r7 = r15
            r14 = r10
            r10 = r8
            r8 = r0
            r0 = r5
            r5 = r11
            goto L_0x0274
        L_0x008f:
            boolean r22 = h(r38)
            r23 = r4
            if (r22 == 0) goto L_0x009c
            r22 = r5
            r1 = r10
            r5 = r12
            goto L_0x00a0
        L_0x009c:
            r22 = r5
            r5 = r10
            r1 = r12
        L_0x00a0:
            float r4 = r0.b(r1, r5, r8, r9)
            r24 = 0
            int r24 = (r4 > r24 ? 1 : (r4 == r24 ? 0 : -1))
            if (r24 <= 0) goto L_0x0226
            r24 = r14
            b.h.a.m.x.c.l$e r14 = r0.a(r1, r5, r8, r9)
            if (r14 == 0) goto L_0x021e
            r25 = r10
            float r10 = (float) r1
            r26 = r11
            float r11 = r4 * r10
            r27 = r12
            double r11 = (double) r11
            int r11 = k(r11)
            float r12 = (float) r5
            r28 = r15
            float r15 = r4 * r12
            r29 = r8
            r30 = r9
            double r8 = (double) r15
            int r8 = k(r8)
            int r9 = r1 / r11
            int r8 = r5 / r8
            b.h.a.m.x.c.l$e r11 = b.h.a.m.x.c.l.e.MEMORY
            if (r14 != r11) goto L_0x00db
            int r8 = java.lang.Math.max(r9, r8)
            goto L_0x00df
        L_0x00db:
            int r8 = java.lang.Math.min(r9, r8)
        L_0x00df:
            int r8 = java.lang.Integer.highestOneBit(r8)
            r9 = 1
            int r8 = java.lang.Math.max(r9, r8)
            if (r14 != r11) goto L_0x00f4
            float r9 = (float) r8
            r11 = 1065353216(0x3f800000, float:1.0)
            float r11 = r11 / r4
            int r9 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r9 >= 0) goto L_0x00f4
            int r8 = r8 << 1
        L_0x00f4:
            r3.inSampleSize = r8
            com.bumptech.glide.load.ImageHeaderParser$ImageType r9 = com.bumptech.glide.load.ImageHeaderParser.ImageType.JPEG
            if (r13 != r9) goto L_0x011a
            r1 = 8
            int r1 = java.lang.Math.min(r8, r1)
            float r1 = (float) r1
            float r10 = r10 / r1
            double r5 = (double) r10
            double r5 = java.lang.Math.ceil(r5)
            int r5 = (int) r5
            float r12 = r12 / r1
            double r9 = (double) r12
            double r9 = java.lang.Math.ceil(r9)
            int r1 = (int) r9
            int r6 = r8 / 8
            if (r6 <= 0) goto L_0x0115
            int r5 = r5 / r6
            int r1 = r1 / r6
        L_0x0115:
            r10 = r29
            r6 = r30
            goto L_0x0168
        L_0x011a:
            com.bumptech.glide.load.ImageHeaderParser$ImageType r9 = com.bumptech.glide.load.ImageHeaderParser.ImageType.PNG
            if (r13 == r9) goto L_0x0158
            com.bumptech.glide.load.ImageHeaderParser$ImageType r9 = com.bumptech.glide.load.ImageHeaderParser.ImageType.PNG_A
            if (r13 != r9) goto L_0x0123
            goto L_0x0158
        L_0x0123:
            com.bumptech.glide.load.ImageHeaderParser$ImageType r9 = com.bumptech.glide.load.ImageHeaderParser.ImageType.WEBP
            if (r13 == r9) goto L_0x014c
            com.bumptech.glide.load.ImageHeaderParser$ImageType r9 = com.bumptech.glide.load.ImageHeaderParser.ImageType.WEBP_A
            if (r13 != r9) goto L_0x012c
            goto L_0x014c
        L_0x012c:
            int r9 = r1 % r8
            if (r9 != 0) goto L_0x0141
            int r9 = r5 % r8
            if (r9 == 0) goto L_0x0135
            goto L_0x0141
        L_0x0135:
            int r1 = r1 / r8
            int r5 = r5 / r8
            r10 = r29
            r6 = r30
            r31 = r5
            r5 = r1
            r1 = r31
            goto L_0x0168
        L_0x0141:
            int[] r1 = g(r2, r3, r7, r6)
            r5 = 0
            r5 = r1[r5]
            r6 = 1
            r1 = r1[r6]
            goto L_0x0115
        L_0x014c:
            float r1 = (float) r8
            float r10 = r10 / r1
            int r5 = java.lang.Math.round(r10)
            float r12 = r12 / r1
            int r1 = java.lang.Math.round(r12)
            goto L_0x0115
        L_0x0158:
            float r1 = (float) r8
            float r10 = r10 / r1
            double r5 = (double) r10
            double r5 = java.lang.Math.floor(r5)
            int r5 = (int) r5
            float r12 = r12 / r1
            double r9 = (double) r12
            double r9 = java.lang.Math.floor(r9)
            int r1 = (int) r9
            goto L_0x0115
        L_0x0168:
            float r0 = r0.b(r5, r1, r10, r6)
            double r11 = (double) r0
            int r0 = f(r11)
            double r13 = (double) r0
            double r13 = r13 * r11
            int r9 = k(r13)
            float r13 = (float) r9
            float r0 = (float) r0
            float r13 = r13 / r0
            double r13 = (double) r13
            double r13 = r11 / r13
            r15 = r8
            double r7 = (double) r9
            double r13 = r13 * r7
            int r0 = k(r13)
            r3.inTargetDensity = r0
            int r0 = f(r11)
            r3.inDensity = r0
            int r7 = r3.inTargetDensity
            if (r7 <= 0) goto L_0x0196
            if (r0 <= 0) goto L_0x0196
            if (r7 == r0) goto L_0x0196
            r0 = 1
            goto L_0x0197
        L_0x0196:
            r0 = 0
        L_0x0197:
            if (r0 == 0) goto L_0x019d
            r0 = 1
            r3.inScaled = r0
            goto L_0x01a2
        L_0x019d:
            r0 = 0
            r3.inTargetDensity = r0
            r3.inDensity = r0
        L_0x01a2:
            r0 = 2
            r7 = r28
            boolean r0 = android.util.Log.isLoggable(r7, r0)
            if (r0 == 0) goto L_0x020f
            java.lang.String r0 = "Calculate scaling, source: ["
            java.lang.String r8 = "], degreesToRotate: "
            r14 = r25
            r13 = r26
            r9 = r27
            java.lang.StringBuilder r0 = b.e.a.a.a.A(r0, r9, r13, r14, r8)
            r8 = r38
            r0.append(r8)
            java.lang.String r8 = ", target: ["
            r0.append(r8)
            r0.append(r10)
            r0.append(r13)
            r0.append(r6)
            java.lang.String r8 = "], power of two scaled: ["
            r0.append(r8)
            r0.append(r5)
            r0.append(r13)
            r0.append(r1)
            java.lang.String r1 = "], exact scale factor: "
            r0.append(r1)
            r0.append(r4)
            java.lang.String r1 = ", power of 2 sample size: "
            r0.append(r1)
            r8 = r15
            r0.append(r8)
            java.lang.String r1 = ", adjusted scale factor: "
            r0.append(r1)
            r0.append(r11)
            r1 = r24
            r0.append(r1)
            int r4 = r3.inTargetDensity
            r0.append(r4)
            r4 = r23
            r0.append(r4)
            int r5 = r3.inDensity
            r0.append(r5)
            java.lang.String r0 = r0.toString()
            android.util.Log.v(r7, r0)
            goto L_0x0219
        L_0x020f:
            r4 = r23
            r1 = r24
            r14 = r25
            r13 = r26
            r9 = r27
        L_0x0219:
            r8 = r32
            r5 = r13
            goto L_0x02a1
        L_0x021e:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Cannot round with null rounding"
            r0.<init>(r1)
            throw r0
        L_0x0226:
            r6 = r9
            r14 = r10
            r13 = r11
            r9 = r12
            r10 = r8
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Cannot scale with factor: "
            r2.append(r3)
            r2.append(r4)
            java.lang.String r3 = " from: "
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = ", source: ["
            r2.append(r0)
            r2.append(r9)
            r2.append(r13)
            r2.append(r14)
            java.lang.String r0 = "], target: ["
            r2.append(r0)
            r2.append(r10)
            r2.append(r13)
            r2.append(r6)
            r0 = r22
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
        L_0x026b:
            r0 = r5
            r6 = r9
            r5 = r11
            r9 = r12
            r1 = r14
            r7 = r15
            r14 = r10
            r10 = r8
            r8 = 3
        L_0x0274:
            boolean r8 = android.util.Log.isLoggable(r7, r8)
            if (r8 == 0) goto L_0x029f
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r11 = "Unable to determine dimensions for: "
            r8.append(r11)
            r8.append(r13)
            java.lang.String r11 = " with target ["
            r8.append(r11)
            r8.append(r10)
            r8.append(r5)
            r8.append(r6)
            r8.append(r0)
            java.lang.String r0 = r8.toString()
            android.util.Log.d(r7, r0)
        L_0x029f:
            r8 = r32
        L_0x02a1:
            b.h.a.m.x.c.r r0 = r8.f872e
            r13 = r20
            r11 = r21
            boolean r0 = r0.b(r10, r6, r11, r13)
            if (r0 == 0) goto L_0x02b4
            android.graphics.Bitmap$Config r11 = android.graphics.Bitmap.Config.HARDWARE
            r3.inPreferredConfig = r11
            r11 = 0
            r3.inMutable = r11
        L_0x02b4:
            if (r0 == 0) goto L_0x02b8
            r11 = r4
            goto L_0x02f6
        L_0x02b8:
            b.h.a.m.b r0 = b.h.a.m.b.PREFER_ARGB_8888
            r11 = r4
            r4 = r36
            if (r4 == r0) goto L_0x02f8
            com.bumptech.glide.load.ImageHeaderParser$ImageType r0 = r33.d()     // Catch:{ IOException -> 0x02c8 }
            boolean r0 = r0.hasAlpha()     // Catch:{ IOException -> 0x02c8 }
            goto L_0x02e5
        L_0x02c8:
            r0 = move-exception
            r12 = 3
            boolean r12 = android.util.Log.isLoggable(r7, r12)
            if (r12 == 0) goto L_0x02e4
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r13 = "Cannot determine whether the image has alpha or not from header, format "
            r12.append(r13)
            r12.append(r4)
            java.lang.String r4 = r12.toString()
            android.util.Log.d(r7, r4, r0)
        L_0x02e4:
            r0 = 0
        L_0x02e5:
            if (r0 == 0) goto L_0x02ea
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ARGB_8888
            goto L_0x02ec
        L_0x02ea:
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.RGB_565
        L_0x02ec:
            r3.inPreferredConfig = r0
            android.graphics.Bitmap$Config r4 = android.graphics.Bitmap.Config.RGB_565
            if (r0 != r4) goto L_0x02f6
            r0 = 1
            r3.inDither = r0
            goto L_0x02fd
        L_0x02f6:
            r0 = 1
            goto L_0x02fd
        L_0x02f8:
            r0 = 1
            android.graphics.Bitmap$Config r4 = android.graphics.Bitmap.Config.ARGB_8888
            r3.inPreferredConfig = r4
        L_0x02fd:
            int r4 = android.os.Build.VERSION.SDK_INT
            int r12 = r3.inSampleSize
            if (r9 < 0) goto L_0x030d
            if (r14 < 0) goto L_0x030d
            if (r41 == 0) goto L_0x030d
            r24 = r1
            r1 = r10
            r10 = r11
            goto L_0x038b
        L_0x030d:
            int r6 = r3.inTargetDensity
            if (r6 <= 0) goto L_0x0318
            int r10 = r3.inDensity
            if (r10 <= 0) goto L_0x0318
            if (r6 == r10) goto L_0x0318
            goto L_0x0319
        L_0x0318:
            r0 = 0
        L_0x0319:
            if (r0 == 0) goto L_0x0321
            float r0 = (float) r6
            int r6 = r3.inDensity
            float r6 = (float) r6
            float r0 = r0 / r6
            goto L_0x0323
        L_0x0321:
            r0 = 1065353216(0x3f800000, float:1.0)
        L_0x0323:
            float r6 = (float) r9
            float r10 = (float) r12
            float r6 = r6 / r10
            r24 = r1
            double r1 = (double) r6
            double r1 = java.lang.Math.ceil(r1)
            int r1 = (int) r1
            float r2 = (float) r14
            float r2 = r2 / r10
            r23 = r11
            double r10 = (double) r2
            double r10 = java.lang.Math.ceil(r10)
            int r2 = (int) r10
            float r1 = (float) r1
            float r1 = r1 * r0
            int r1 = java.lang.Math.round(r1)
            float r2 = (float) r2
            float r2 = r2 * r0
            int r2 = java.lang.Math.round(r2)
            r6 = 2
            boolean r6 = android.util.Log.isLoggable(r7, r6)
            if (r6 == 0) goto L_0x0388
            java.lang.String r6 = "Calculated target ["
            java.lang.String r10 = "] for source ["
            java.lang.StringBuilder r6 = b.e.a.a.a.A(r6, r1, r5, r2, r10)
            r6.append(r9)
            r6.append(r5)
            r6.append(r14)
            java.lang.String r10 = "], sampleSize: "
            r6.append(r10)
            r6.append(r12)
            java.lang.String r10 = ", targetDensity: "
            r6.append(r10)
            int r10 = r3.inTargetDensity
            r6.append(r10)
            r10 = r23
            r6.append(r10)
            int r11 = r3.inDensity
            r6.append(r11)
            java.lang.String r11 = ", density multiplier: "
            r6.append(r11)
            r6.append(r0)
            java.lang.String r0 = r6.toString()
            android.util.Log.v(r7, r0)
            goto L_0x038a
        L_0x0388:
            r10 = r23
        L_0x038a:
            r6 = r2
        L_0x038b:
            r0 = 26
            if (r1 <= 0) goto L_0x03aa
            if (r6 <= 0) goto L_0x03aa
            b.h.a.m.v.c0.d r2 = r8.a
            if (r4 < r0) goto L_0x039f
            android.graphics.Bitmap$Config r11 = r3.inPreferredConfig
            android.graphics.Bitmap$Config r12 = android.graphics.Bitmap.Config.HARDWARE
            if (r11 != r12) goto L_0x039c
            goto L_0x03aa
        L_0x039c:
            android.graphics.Bitmap$Config r11 = r3.outConfig
            goto L_0x03a0
        L_0x039f:
            r11 = 0
        L_0x03a0:
            if (r11 != 0) goto L_0x03a4
            android.graphics.Bitmap$Config r11 = r3.inPreferredConfig
        L_0x03a4:
            android.graphics.Bitmap r1 = r2.c(r1, r6, r11)
            r3.inBitmap = r1
        L_0x03aa:
            r1 = 28
            if (r4 < r1) goto L_0x03c6
            b.h.a.m.q r0 = b.h.a.m.q.DISPLAY_P3
            r1 = r37
            if (r1 != r0) goto L_0x03c0
            android.graphics.ColorSpace r0 = r3.outColorSpace
            if (r0 == 0) goto L_0x03c0
            boolean r0 = r0.isWideGamut()
            if (r0 == 0) goto L_0x03c0
            r0 = 1
            goto L_0x03c1
        L_0x03c0:
            r0 = 0
        L_0x03c1:
            if (r0 == 0) goto L_0x03c8
            android.graphics.ColorSpace$Named r0 = android.graphics.ColorSpace.Named.DISPLAY_P3
            goto L_0x03ca
        L_0x03c6:
            if (r4 < r0) goto L_0x03d0
        L_0x03c8:
            android.graphics.ColorSpace$Named r0 = android.graphics.ColorSpace.Named.SRGB
        L_0x03ca:
            android.graphics.ColorSpace r0 = android.graphics.ColorSpace.get(r0)
            r3.inPreferredColorSpace = r0
        L_0x03d0:
            b.h.a.m.v.c0.d r0 = r8.a
            r1 = r33
            r2 = r42
            android.graphics.Bitmap r0 = d(r1, r3, r2, r0)
            b.h.a.m.v.c0.d r1 = r8.a
            r2.a(r1, r0)
            r1 = 2
            boolean r1 = android.util.Log.isLoggable(r7, r1)
            if (r1 == 0) goto L_0x046a
            java.lang.String r1 = "Decoded "
            java.lang.StringBuilder r1 = b.e.a.a.a.y(r1)
            java.lang.String r2 = e(r0)
            r1.append(r2)
            java.lang.String r2 = " from ["
            r1.append(r2)
            r1.append(r9)
            r1.append(r5)
            r1.append(r14)
            java.lang.String r2 = "] "
            r1.append(r2)
            r2 = r19
            r1.append(r2)
            java.lang.String r2 = " with inBitmap "
            r1.append(r2)
            android.graphics.Bitmap r2 = r3.inBitmap
            java.lang.String r2 = e(r2)
            r1.append(r2)
            java.lang.String r2 = " for ["
            r1.append(r2)
            r2 = r39
            r1.append(r2)
            r1.append(r5)
            r2 = r40
            r1.append(r2)
            java.lang.String r2 = "], sample size: "
            r1.append(r2)
            int r2 = r3.inSampleSize
            r1.append(r2)
            r1.append(r10)
            int r2 = r3.inDensity
            r1.append(r2)
            r2 = r24
            r1.append(r2)
            int r2 = r3.inTargetDensity
            r1.append(r2)
            java.lang.String r2 = ", thread: "
            r1.append(r2)
            java.lang.Thread r2 = java.lang.Thread.currentThread()
            java.lang.String r2 = r2.getName()
            r1.append(r2)
            java.lang.String r2 = ", duration: "
            r1.append(r2)
            double r2 = b.h.a.s.f.a(r17)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            android.util.Log.v(r7, r1)
        L_0x046a:
            if (r0 == 0) goto L_0x04fd
            android.util.DisplayMetrics r1 = r8.f871b
            int r1 = r1.densityDpi
            r0.setDensity(r1)
            b.h.a.m.v.c0.d r1 = r8.a
            switch(r16) {
                case 2: goto L_0x047a;
                case 3: goto L_0x047a;
                case 4: goto L_0x047a;
                case 5: goto L_0x047a;
                case 6: goto L_0x047a;
                case 7: goto L_0x047a;
                case 8: goto L_0x047a;
                default: goto L_0x0478;
            }
        L_0x0478:
            r2 = 0
            goto L_0x047b
        L_0x047a:
            r2 = 1
        L_0x047b:
            if (r2 != 0) goto L_0x0480
            r1 = r0
            goto L_0x04f1
        L_0x0480:
            android.graphics.Matrix r2 = new android.graphics.Matrix
            r2.<init>()
            r3 = -1028390912(0xffffffffc2b40000, float:-90.0)
            r4 = 1119092736(0x42b40000, float:90.0)
            r5 = 1127481344(0x43340000, float:180.0)
            r6 = -1082130432(0xffffffffbf800000, float:-1.0)
            switch(r16) {
                case 2: goto L_0x04ae;
                case 3: goto L_0x04aa;
                case 4: goto L_0x04a1;
                case 5: goto L_0x049d;
                case 6: goto L_0x0499;
                case 7: goto L_0x0495;
                case 8: goto L_0x0491;
                default: goto L_0x0490;
            }
        L_0x0490:
            goto L_0x04b3
        L_0x0491:
            r2.setRotate(r3)
            goto L_0x04b3
        L_0x0495:
            r2.setRotate(r3)
            goto L_0x04a4
        L_0x0499:
            r2.setRotate(r4)
            goto L_0x04b3
        L_0x049d:
            r2.setRotate(r4)
            goto L_0x04a4
        L_0x04a1:
            r2.setRotate(r5)
        L_0x04a4:
            r3 = 1065353216(0x3f800000, float:1.0)
            r2.postScale(r6, r3)
            goto L_0x04b3
        L_0x04aa:
            r2.setRotate(r5)
            goto L_0x04b3
        L_0x04ae:
            r3 = 1065353216(0x3f800000, float:1.0)
            r2.setScale(r6, r3)
        L_0x04b3:
            android.graphics.RectF r3 = new android.graphics.RectF
            int r4 = r0.getWidth()
            float r4 = (float) r4
            int r5 = r0.getHeight()
            float r5 = (float) r5
            r6 = 0
            r3.<init>(r6, r6, r4, r5)
            r2.mapRect(r3)
            float r4 = r3.width()
            int r4 = java.lang.Math.round(r4)
            float r5 = r3.height()
            int r5 = java.lang.Math.round(r5)
            android.graphics.Bitmap$Config r6 = b.h.a.m.x.c.z.c(r0)
            android.graphics.Bitmap r1 = r1.d(r4, r5, r6)
            float r4 = r3.left
            float r4 = -r4
            float r3 = r3.top
            float r3 = -r3
            r2.postTranslate(r4, r3)
            boolean r3 = r0.hasAlpha()
            r1.setHasAlpha(r3)
            b.h.a.m.x.c.z.a(r0, r1, r2)
        L_0x04f1:
            boolean r2 = r0.equals(r1)
            if (r2 != 0) goto L_0x04fe
            b.h.a.m.v.c0.d r2 = r8.a
            r2.e(r0)
            goto L_0x04fe
        L_0x04fd:
            r1 = 0
        L_0x04fe:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: b.h.a.m.x.c.m.c(b.h.a.m.x.c.s, android.graphics.BitmapFactory$Options, b.h.a.m.x.c.l, b.h.a.m.b, b.h.a.m.q, boolean, int, int, boolean, b.h.a.m.x.c.m$b):android.graphics.Bitmap");
    }
}
