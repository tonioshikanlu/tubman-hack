package k.a.a.a;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.os.AsyncTask;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.solver.widgets.analyzer.BasicMeasure;
import app.bravostudio.A01F175WZXYVE9FWM81EKWKN6FN.R;

public class c {

    /* renamed from: l  reason: collision with root package name */
    public static final String f8087l = "c";
    public ImageView a;

    /* renamed from: b  reason: collision with root package name */
    public FrameLayout.LayoutParams f8088b;
    public a c;
    public boolean d = false;

    /* renamed from: e  reason: collision with root package name */
    public float f8089e = 4.0f;
    public int f = 8;

    /* renamed from: g  reason: collision with root package name */
    public Activity f8090g;

    /* renamed from: h  reason: collision with root package name */
    public Toolbar f8091h;

    /* renamed from: i  reason: collision with root package name */
    public int f8092i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f8093j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f8094k;

    public class a extends AsyncTask<Void, Void, Void> {
        public Bitmap a;

        /* renamed from: b  reason: collision with root package name */
        public View f8095b;

        public a(a aVar) {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:19:0x0062, code lost:
            r8 = r1.f8090g.getResources().getIdentifier("status_bar_height", "dimen", com.amplitude.api.DeviceInfo.OS_NAME);
         */
        /* JADX WARNING: Removed duplicated region for block: B:103:0x046d  */
        /* JADX WARNING: Removed duplicated region for block: B:21:0x0070  */
        /* JADX WARNING: Removed duplicated region for block: B:22:0x007b  */
        /* JADX WARNING: Removed duplicated region for block: B:25:0x009a  */
        /* JADX WARNING: Removed duplicated region for block: B:28:0x00aa  */
        /* JADX WARNING: Removed duplicated region for block: B:29:0x00af  */
        /* JADX WARNING: Removed duplicated region for block: B:32:0x00bf  */
        /* JADX WARNING: Removed duplicated region for block: B:33:0x00c2  */
        /* JADX WARNING: Removed duplicated region for block: B:36:0x00fb  */
        /* JADX WARNING: Removed duplicated region for block: B:37:0x00fe  */
        /* JADX WARNING: Removed duplicated region for block: B:42:0x010a A[Catch:{ NoClassDefFoundError -> 0x0117 }] */
        /* JADX WARNING: Removed duplicated region for block: B:47:0x0142  */
        /* JADX WARNING: Removed duplicated region for block: B:55:0x018f  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object doInBackground(java.lang.Object[] r38) {
            /*
                r37 = this;
                r0 = r37
                r1 = r38
                java.lang.Void[] r1 = (java.lang.Void[]) r1
                boolean r1 = r37.isCancelled()
                if (r1 != 0) goto L_0x0579
                android.graphics.Bitmap r1 = r0.a
                boolean r1 = r1.isRecycled()
                if (r1 != 0) goto L_0x0579
                k.a.a.a.c r1 = k.a.a.a.c.this
                android.graphics.Bitmap r2 = r0.a
                android.view.View r3 = r0.f8095b
                java.lang.String r4 = k.a.a.a.c.f8087l
                java.util.Objects.requireNonNull(r1)
                long r4 = java.lang.System.currentTimeMillis()
                android.widget.FrameLayout$LayoutParams r6 = new android.widget.FrameLayout$LayoutParams
                r7 = -1
                r6.<init>(r7, r7)
                r1.f8088b = r6
                boolean r6 = r1.f8093j
                r7 = 0
                if (r6 == 0) goto L_0x0031
                goto L_0x004d
            L_0x0031:
                androidx.appcompat.widget.Toolbar r6 = r1.f8091h     // Catch:{ NoClassDefFoundError -> 0x004d }
                if (r6 == 0) goto L_0x003a
                int r6 = r6.getHeight()     // Catch:{ NoClassDefFoundError -> 0x004d }
                goto L_0x004e
            L_0x003a:
                android.app.Activity r6 = r1.f8090g     // Catch:{ NoClassDefFoundError -> 0x004d }
                boolean r8 = r6 instanceof androidx.appcompat.app.AppCompatActivity     // Catch:{ NoClassDefFoundError -> 0x004d }
                if (r8 == 0) goto L_0x004d
                androidx.appcompat.app.AppCompatActivity r6 = (androidx.appcompat.app.AppCompatActivity) r6     // Catch:{ NoClassDefFoundError -> 0x004d }
                androidx.appcompat.app.ActionBar r6 = r6.getSupportActionBar()     // Catch:{ NoClassDefFoundError -> 0x004d }
                if (r6 == 0) goto L_0x004d
                int r6 = r6.getHeight()     // Catch:{ NoClassDefFoundError -> 0x004d }
                goto L_0x004e
            L_0x004d:
                r6 = r7
            L_0x004e:
                android.app.Activity r8 = r1.f8090g
                android.view.Window r8 = r8.getWindow()
                android.view.WindowManager$LayoutParams r8 = r8.getAttributes()
                int r8 = r8.flags
                r8 = r8 & 1024(0x400, float:1.435E-42)
                java.lang.String r9 = "android"
                java.lang.String r10 = "dimen"
                if (r8 != 0) goto L_0x007b
                android.app.Activity r8 = r1.f8090g
                android.content.res.Resources r8 = r8.getResources()
                java.lang.String r11 = "status_bar_height"
                int r8 = r8.getIdentifier(r11, r10, r9)
                if (r8 <= 0) goto L_0x007b
                android.app.Activity r11 = r1.f8090g
                android.content.res.Resources r11 = r11.getResources()
                int r8 = r11.getDimensionPixelSize(r8)
                goto L_0x007c
            L_0x007b:
                r8 = r7
            L_0x007c:
                android.util.TypedValue r11 = new android.util.TypedValue
                r11.<init>()
                r12 = 1
                int[] r13 = new int[r12]
                r14 = 16843759(0x10103ef, float:2.369638E-38)
                r13[r7] = r14
                android.app.Activity r14 = r1.f8090g
                int r11 = r11.resourceId
                android.content.res.TypedArray r11 = r14.obtainStyledAttributes(r11, r13)
                boolean r13 = r11.getBoolean(r7, r7)
                r11.recycle()
                if (r13 == 0) goto L_0x009b
                r8 = r7
            L_0x009b:
                int r8 = r8 + r6
                android.app.Activity r11 = r1.f8090g
                android.content.res.Resources r11 = r11.getResources()
                java.lang.String r13 = "navigation_bar_height"
                int r9 = r11.getIdentifier(r13, r10, r9)
                if (r9 <= 0) goto L_0x00af
                int r9 = r11.getDimensionPixelSize(r9)
                goto L_0x00b0
            L_0x00af:
                r9 = r7
            L_0x00b0:
                android.app.Activity r10 = r1.f8090g
                android.content.res.Resources r10 = r10.getResources()
                r11 = 2130968579(0x7f040003, float:1.7545816E38)
                boolean r10 = r10.getBoolean(r11)
                if (r10 == 0) goto L_0x00c2
                r10 = r9
                r9 = r7
                goto L_0x00c3
            L_0x00c2:
                r10 = r7
            L_0x00c3:
                android.graphics.Rect r11 = new android.graphics.Rect
                int r13 = r2.getWidth()
                int r13 = r13 - r9
                int r14 = r2.getHeight()
                int r14 = r14 - r10
                r11.<init>(r7, r8, r13, r14)
                int r13 = r3.getHeight()
                int r13 = r13 - r8
                int r13 = r13 - r10
                float r13 = (float) r13
                float r14 = r1.f8089e
                float r13 = r13 / r14
                double r13 = (double) r13
                double r13 = java.lang.Math.ceil(r13)
                int r15 = r3.getWidth()
                int r15 = r15 - r9
                r9 = r8
                double r7 = (double) r15
                double r7 = r7 * r13
                int r3 = r3.getHeight()
                int r3 = r3 - r9
                int r3 = r3 - r10
                double r9 = (double) r3
                double r7 = r7 / r9
                double r7 = java.lang.Math.ceil(r7)
                boolean r3 = r1.f8094k
                int r7 = (int) r7
                int r8 = (int) r13
                if (r3 == 0) goto L_0x00fe
                android.graphics.Bitmap$Config r3 = android.graphics.Bitmap.Config.ARGB_8888
                goto L_0x0100
            L_0x00fe:
                android.graphics.Bitmap$Config r3 = android.graphics.Bitmap.Config.RGB_565
            L_0x0100:
                android.graphics.Bitmap r3 = android.graphics.Bitmap.createBitmap(r7, r8, r3)
                android.app.Activity r7 = r1.f8090g     // Catch:{ NoClassDefFoundError -> 0x0117 }
                boolean r7 = r7 instanceof androidx.appcompat.app.AppCompatActivity     // Catch:{ NoClassDefFoundError -> 0x0117 }
                if (r7 == 0) goto L_0x011d
                android.widget.FrameLayout$LayoutParams r7 = r1.f8088b     // Catch:{ NoClassDefFoundError -> 0x0117 }
                r8 = 0
                r7.setMargins(r8, r6, r8, r8)     // Catch:{ NoClassDefFoundError -> 0x0117 }
                android.widget.FrameLayout$LayoutParams r6 = r1.f8088b     // Catch:{ NoClassDefFoundError -> 0x0117 }
                r7 = 48
                r6.gravity = r7     // Catch:{ NoClassDefFoundError -> 0x0117 }
                goto L_0x011d
            L_0x0117:
                android.widget.FrameLayout$LayoutParams r6 = r1.f8088b
                r7 = 0
                r6.setMargins(r7, r7, r7, r7)
            L_0x011d:
                android.graphics.Canvas r6 = new android.graphics.Canvas
                r6.<init>(r3)
                android.graphics.Paint r7 = new android.graphics.Paint
                r7.<init>()
                r8 = 2
                r7.setFlags(r8)
                android.graphics.RectF r8 = new android.graphics.RectF
                int r9 = r3.getWidth()
                float r9 = (float) r9
                int r10 = r3.getHeight()
                float r10 = (float) r10
                r13 = 0
                r8.<init>(r13, r13, r9, r10)
                r6.drawBitmap(r2, r11, r8, r7)
                boolean r6 = r1.f8094k
                if (r6 == 0) goto L_0x018f
                int r6 = r1.f
                android.app.Activity r8 = r1.f8090g
                java.lang.String r9 = k.a.a.a.d.a
                android.graphics.Bitmap$Config r9 = r3.getConfig()
                android.graphics.Bitmap$Config r10 = android.graphics.Bitmap.Config.RGB_565
                if (r9 != r10) goto L_0x0156
                android.graphics.Bitmap$Config r9 = android.graphics.Bitmap.Config.ARGB_8888
                android.graphics.Bitmap r3 = r3.copy(r9, r12)
            L_0x0156:
                androidx.renderscript.RenderScript r8 = androidx.renderscript.RenderScript.create(r8)     // Catch:{ RSRuntimeException -> 0x017e }
                androidx.renderscript.Allocation$MipmapControl r9 = androidx.renderscript.Allocation.MipmapControl.MIPMAP_NONE     // Catch:{ RSRuntimeException -> 0x017e }
                androidx.renderscript.Allocation r9 = androidx.renderscript.Allocation.createFromBitmap(r8, r3, r9, r12)     // Catch:{ RSRuntimeException -> 0x017e }
                androidx.renderscript.Type r10 = r9.getType()     // Catch:{ RSRuntimeException -> 0x017e }
                androidx.renderscript.Allocation r10 = androidx.renderscript.Allocation.createTyped(r8, r10)     // Catch:{ RSRuntimeException -> 0x017e }
                androidx.renderscript.Element r11 = androidx.renderscript.Element.U8_4(r8)     // Catch:{ RSRuntimeException -> 0x017e }
                androidx.renderscript.ScriptIntrinsicBlur r8 = androidx.renderscript.ScriptIntrinsicBlur.create(r8, r11)     // Catch:{ RSRuntimeException -> 0x017e }
                float r6 = (float) r6     // Catch:{ RSRuntimeException -> 0x017e }
                r8.setRadius(r6)     // Catch:{ RSRuntimeException -> 0x017e }
                r8.setInput(r9)     // Catch:{ RSRuntimeException -> 0x017e }
                r8.forEach(r10)     // Catch:{ RSRuntimeException -> 0x017e }
                r10.copyTo((android.graphics.Bitmap) r3)     // Catch:{ RSRuntimeException -> 0x017e }
                goto L_0x0186
            L_0x017e:
                java.lang.String r3 = k.a.a.a.d.a
                java.lang.String r6 = "RenderScript known error : https://code.google.com/p/android/issues/detail?id=71347 continue with the FastBlur approach."
                android.util.Log.e(r3, r6)
                r3 = 0
            L_0x0186:
                r0 = r1
                r21 = r2
                r22 = r4
                r38 = r7
                goto L_0x0469
            L_0x018f:
                int r6 = r1.f
                if (r6 >= r12) goto L_0x019e
                r3 = 0
                r31 = r1
                r21 = r2
                r22 = r4
                r38 = r7
                goto L_0x0467
            L_0x019e:
                int r8 = r3.getWidth()
                int r9 = r3.getHeight()
                int r10 = r8 * r9
                int[] r10 = new int[r10]
                r15 = 0
                r17 = 0
                r18 = 0
                r13 = r3
                r14 = r10
                r16 = r8
                r19 = r8
                r20 = r9
                r13.getPixels(r14, r15, r16, r17, r18, r19, r20)
                int r11 = r8 + -1
                int r12 = r9 + -1
                int r13 = r6 + r6
                int r13 = r13 + 1
                int r14 = java.lang.Math.max(r8, r9)
                int[] r14 = new int[r14]
                int r15 = r13 + 1
                int r15 = r15 >> 1
                int r15 = r15 * r15
                int r0 = r15 * 256
                r38 = r7
                int[] r7 = new int[r0]
                r16 = 0
                r21 = r2
                r2 = r16
            L_0x01d9:
                if (r2 >= r0) goto L_0x01e2
                int r16 = r2 / r15
                r7[r2] = r16
                int r2 = r2 + 1
                goto L_0x01d9
            L_0x01e2:
                r0 = 3
                r2 = 2
                int[] r2 = new int[r2]
                r15 = 1
                r2[r15] = r0
                r0 = 0
                r2[r0] = r13
                java.lang.Class<int> r0 = int.class
                java.lang.Object r0 = java.lang.reflect.Array.newInstance(r0, r2)
                int[][] r0 = (int[][]) r0
                int r2 = r6 + 1
                r15 = 0
                r16 = 0
                r17 = 0
            L_0x01fb:
                r18 = 65280(0xff00, float:9.1477E-41)
                r19 = 16711680(0xff0000, float:2.3418052E-38)
                if (r15 >= r9) goto L_0x0330
                r22 = r4
                int r4 = -r6
                r5 = 0
                r20 = 0
                r24 = 0
                r25 = 0
                r26 = 0
                r27 = 0
                r28 = 0
                r29 = 0
                r30 = 0
            L_0x0216:
                r31 = r1
                if (r4 > r6) goto L_0x027b
                r1 = 0
                r32 = r3
                int r3 = java.lang.Math.max(r4, r1)
                int r3 = java.lang.Math.min(r11, r3)
                int r3 = r3 + r16
                r3 = r10[r3]
                int r33 = r4 + r6
                r33 = r0[r33]
                r34 = r3 & r19
                int r34 = r34 >> 16
                r33[r1] = r34
                r34 = r3 & r18
                int r34 = r34 >> 8
                r35 = 1
                r33[r35] = r34
                r3 = r3 & 255(0xff, float:3.57E-43)
                r34 = 2
                r33[r34] = r3
                int r3 = java.lang.Math.abs(r4)
                int r3 = r2 - r3
                r36 = r33[r1]
                int r36 = r36 * r3
                int r5 = r36 + r5
                r36 = r33[r35]
                int r36 = r36 * r3
                int r20 = r36 + r20
                r36 = r33[r34]
                int r36 = r36 * r3
                int r24 = r36 + r24
                if (r4 <= 0) goto L_0x0268
                r1 = r33[r1]
                int r28 = r28 + r1
                r1 = r33[r35]
                int r29 = r29 + r1
                r1 = r33[r34]
                int r30 = r30 + r1
                goto L_0x0274
            L_0x0268:
                r1 = r33[r1]
                int r25 = r25 + r1
                r1 = r33[r35]
                int r26 = r26 + r1
                r1 = r33[r34]
                int r27 = r27 + r1
            L_0x0274:
                int r4 = r4 + 1
                r1 = r31
                r3 = r32
                goto L_0x0216
            L_0x027b:
                r32 = r3
                r1 = 0
                r3 = r6
            L_0x027f:
                if (r1 >= r8) goto L_0x0322
                r4 = r10[r16]
                r33 = -16777216(0xffffffffff000000, float:-1.7014118E38)
                r4 = r4 & r33
                r33 = r7[r5]
                int r33 = r33 << 16
                r4 = r4 | r33
                r33 = r7[r20]
                int r33 = r33 << 8
                r4 = r4 | r33
                r33 = r7[r24]
                r4 = r4 | r33
                r10[r16] = r4
                int r5 = r5 - r25
                int r20 = r20 - r26
                int r24 = r24 - r27
                int r4 = r3 - r6
                int r4 = r4 + r13
                int r4 = r4 % r13
                r4 = r0[r4]
                r33 = 0
                r33 = r4[r33]
                int r25 = r25 - r33
                r33 = 1
                r33 = r4[r33]
                int r26 = r26 - r33
                r33 = 2
                r33 = r4[r33]
                int r27 = r27 - r33
                if (r15 != 0) goto L_0x02c6
                int r33 = r1 + r6
                r34 = r7
                int r7 = r33 + 1
                int r7 = java.lang.Math.min(r7, r11)
                r14[r1] = r7
                goto L_0x02c8
            L_0x02c6:
                r34 = r7
            L_0x02c8:
                r7 = r14[r1]
                int r7 = r17 + r7
                r7 = r10[r7]
                r33 = r7 & r19
                int r33 = r33 >> 16
                r35 = 0
                r4[r35] = r33
                r33 = r7 & r18
                int r33 = r33 >> 8
                r36 = 1
                r4[r36] = r33
                r7 = r7 & 255(0xff, float:3.57E-43)
                r33 = 2
                r4[r33] = r7
                r7 = r4[r35]
                int r28 = r28 + r7
                r7 = r4[r36]
                int r29 = r29 + r7
                r4 = r4[r33]
                int r30 = r30 + r4
                int r5 = r5 + r28
                int r20 = r20 + r29
                int r24 = r24 + r30
                int r3 = r3 + 1
                int r3 = r3 % r13
                int r4 = r3 % r13
                r4 = r0[r4]
                r7 = 0
                r33 = r4[r7]
                int r25 = r25 + r33
                r33 = 1
                r35 = r4[r33]
                int r26 = r26 + r35
                r35 = 2
                r36 = r4[r35]
                int r27 = r27 + r36
                r7 = r4[r7]
                int r28 = r28 - r7
                r7 = r4[r33]
                int r29 = r29 - r7
                r4 = r4[r35]
                int r30 = r30 - r4
                int r16 = r16 + 1
                int r1 = r1 + 1
                r7 = r34
                goto L_0x027f
            L_0x0322:
                r34 = r7
                int r17 = r17 + r8
                int r15 = r15 + 1
                r4 = r22
                r1 = r31
                r3 = r32
                goto L_0x01fb
            L_0x0330:
                r31 = r1
                r32 = r3
                r22 = r4
                r34 = r7
                r1 = 0
            L_0x0339:
                if (r1 >= r8) goto L_0x0454
                int r3 = -r6
                int r4 = r3 * r8
                r5 = 0
                r7 = 0
                r11 = 0
                r15 = 0
                r16 = 0
                r17 = 0
                r20 = 0
                r24 = 0
                r25 = 0
            L_0x034c:
                r26 = r14
                if (r3 > r6) goto L_0x03ac
                r14 = 0
                int r14 = java.lang.Math.max(r14, r4)
                int r14 = r14 + r1
                int r27 = r3 + r6
                r27 = r0[r27]
                r14 = r10[r14]
                r28 = r14 & r19
                int r28 = r28 >> 16
                r29 = 0
                r27[r29] = r28
                r28 = r14 & r18
                int r28 = r28 >> 8
                r30 = 1
                r27[r30] = r28
                r14 = r14 & 255(0xff, float:3.57E-43)
                r28 = 2
                r27[r28] = r14
                int r14 = java.lang.Math.abs(r3)
                int r14 = r2 - r14
                r33 = r27[r29]
                int r33 = r33 * r14
                int r5 = r33 + r5
                r33 = r27[r30]
                int r33 = r33 * r14
                int r7 = r33 + r7
                r33 = r27[r28]
                int r33 = r33 * r14
                int r11 = r33 + r11
                if (r3 <= 0) goto L_0x0399
                r14 = r27[r29]
                int r20 = r20 + r14
                r14 = r27[r30]
                int r24 = r24 + r14
                r14 = r27[r28]
                int r25 = r25 + r14
                goto L_0x03a4
            L_0x0399:
                r14 = r27[r29]
                int r15 = r15 + r14
                r14 = r27[r30]
                int r16 = r16 + r14
                r14 = r27[r28]
                int r17 = r17 + r14
            L_0x03a4:
                if (r3 >= r12) goto L_0x03a7
                int r4 = r4 + r8
            L_0x03a7:
                int r3 = r3 + 1
                r14 = r26
                goto L_0x034c
            L_0x03ac:
                r3 = 0
                r4 = r1
                r14 = r6
            L_0x03af:
                if (r3 >= r9) goto L_0x044c
                r27 = r10[r4]
                r28 = -16777216(0xffffffffff000000, float:-1.7014118E38)
                r27 = r27 & r28
                r28 = r34[r5]
                int r28 = r28 << 16
                r27 = r27 | r28
                r28 = r34[r7]
                int r28 = r28 << 8
                r27 = r27 | r28
                r28 = r34[r11]
                r27 = r27 | r28
                r10[r4] = r27
                int r5 = r5 - r15
                int r7 = r7 - r16
                int r11 = r11 - r17
                int r27 = r14 - r6
                int r27 = r27 + r13
                int r27 = r27 % r13
                r27 = r0[r27]
                r28 = 0
                r28 = r27[r28]
                int r15 = r15 - r28
                r28 = 1
                r28 = r27[r28]
                int r16 = r16 - r28
                r28 = 2
                r28 = r27[r28]
                int r17 = r17 - r28
                r28 = r6
                if (r1 != 0) goto L_0x03f5
                int r6 = r3 + r2
                int r6 = java.lang.Math.min(r6, r12)
                int r6 = r6 * r8
                r26[r3] = r6
            L_0x03f5:
                r6 = r26[r3]
                int r6 = r6 + r1
                r6 = r10[r6]
                r29 = r6 & r19
                int r29 = r29 >> 16
                r30 = 0
                r27[r30] = r29
                r29 = r6 & r18
                int r29 = r29 >> 8
                r33 = 1
                r27[r33] = r29
                r6 = r6 & 255(0xff, float:3.57E-43)
                r29 = 2
                r27[r29] = r6
                r6 = r27[r30]
                int r20 = r20 + r6
                r6 = r27[r33]
                int r24 = r24 + r6
                r6 = r27[r29]
                int r25 = r25 + r6
                int r5 = r5 + r20
                int r7 = r7 + r24
                int r11 = r11 + r25
                int r14 = r14 + 1
                int r14 = r14 % r13
                r6 = r0[r14]
                r27 = 0
                r29 = r6[r27]
                int r15 = r15 + r29
                r29 = 1
                r30 = r6[r29]
                int r16 = r16 + r30
                r30 = 2
                r33 = r6[r30]
                int r17 = r17 + r33
                r27 = r6[r27]
                int r20 = r20 - r27
                r27 = r6[r29]
                int r24 = r24 - r27
                r6 = r6[r30]
                int r25 = r25 - r6
                int r4 = r4 + r8
                int r3 = r3 + 1
                r6 = r28
                goto L_0x03af
            L_0x044c:
                r28 = r6
                int r1 = r1 + 1
                r14 = r26
                goto L_0x0339
            L_0x0454:
                r15 = 0
                r17 = 0
                r18 = 0
                r13 = r32
                r14 = r10
                r16 = r8
                r19 = r8
                r20 = r9
                r13.setPixels(r14, r15, r16, r17, r18, r19, r20)
                r3 = r32
            L_0x0467:
                r0 = r31
            L_0x0469:
                boolean r1 = r0.d
                if (r1 == 0) goto L_0x0554
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                long r4 = java.lang.System.currentTimeMillis()
                long r4 = r4 - r22
                r1.append(r4)
                java.lang.String r2 = " ms"
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                java.lang.String r2 = k.a.a.a.c.f8087l
                java.lang.String r4 = "Blur method : "
                java.lang.StringBuilder r4 = b.e.a.a.a.y(r4)
                boolean r5 = r0.f8094k
                if (r5 == 0) goto L_0x0493
                java.lang.String r5 = "RenderScript"
                goto L_0x0495
            L_0x0493:
                java.lang.String r5 = "FastBlur"
            L_0x0495:
                r4.append(r5)
                java.lang.String r4 = r4.toString()
                android.util.Log.d(r2, r4)
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                java.lang.String r5 = "Radius : "
                r4.append(r5)
                int r5 = r0.f
                r4.append(r5)
                java.lang.String r4 = r4.toString()
                android.util.Log.d(r2, r4)
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                java.lang.String r5 = "Down Scale Factor : "
                r4.append(r5)
                float r5 = r0.f8089e
                r4.append(r5)
                java.lang.String r4 = r4.toString()
                android.util.Log.d(r2, r4)
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                java.lang.String r5 = "Blurred achieved in : "
                r4.append(r5)
                r4.append(r1)
                java.lang.String r4 = r4.toString()
                android.util.Log.d(r2, r4)
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                java.lang.String r5 = "Allocation : "
                r4.append(r5)
                int r5 = r21.getRowBytes()
                r4.append(r5)
                java.lang.String r5 = "ko (screen capture) + "
                r4.append(r5)
                int r5 = r3.getRowBytes()
                r4.append(r5)
                java.lang.String r5 = "ko (blurred bitmap)"
                r4.append(r5)
                boolean r5 = r0.f8094k
                if (r5 != 0) goto L_0x051c
                java.lang.String r5 = " + temp buff "
                java.lang.StringBuilder r5 = b.e.a.a.a.y(r5)
                int r6 = r3.getRowBytes()
                r5.append(r6)
                java.lang.String r6 = "ko."
                r5.append(r6)
                java.lang.String r5 = r5.toString()
                goto L_0x051e
            L_0x051c:
                java.lang.String r5 = "."
            L_0x051e:
                r4.append(r5)
                java.lang.String r4 = r4.toString()
                android.util.Log.d(r2, r4)
                android.graphics.Rect r2 = new android.graphics.Rect
                r2.<init>()
                android.graphics.Canvas r4 = new android.graphics.Canvas
                r4.<init>(r3)
                r5 = -16777216(0xffffffffff000000, float:-1.7014118E38)
                r6 = r38
                r6.setColor(r5)
                r5 = 1
                r6.setAntiAlias(r5)
                r5 = 1101004800(0x41a00000, float:20.0)
                r6.setTextSize(r5)
                int r5 = r1.length()
                r7 = 0
                r6.getTextBounds(r1, r7, r5, r2)
                r5 = 1073741824(0x40000000, float:2.0)
                int r2 = r2.height()
                float r2 = (float) r2
                r4.drawText(r1, r5, r2, r6)
            L_0x0554:
                android.widget.ImageView r1 = new android.widget.ImageView
                android.app.Activity r2 = r0.f8090g
                r1.<init>(r2)
                r0.a = r1
                android.widget.ImageView$ScaleType r2 = android.widget.ImageView.ScaleType.CENTER_CROP
                r1.setScaleType(r2)
                android.widget.ImageView r1 = r0.a
                android.graphics.drawable.BitmapDrawable r2 = new android.graphics.drawable.BitmapDrawable
                android.app.Activity r0 = r0.f8090g
                android.content.res.Resources r0 = r0.getResources()
                r2.<init>(r0, r3)
                r1.setImageDrawable(r2)
                r0 = r37
                android.graphics.Bitmap r1 = r0.a
                r1.recycle()
            L_0x0579:
                r1 = 0
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: k.a.a.a.c.a.doInBackground(java.lang.Object[]):java.lang.Object");
        }

        @SuppressLint({"NewApi"})
        public void onPostExecute(Object obj) {
            super.onPostExecute((Void) obj);
            this.f8095b.destroyDrawingCache();
            this.f8095b.setDrawingCacheEnabled(false);
            c cVar = c.this;
            if (cVar.a != null) {
                Window window = cVar.f8090g.getWindow();
                c cVar2 = c.this;
                window.addContentView(cVar2.a, cVar2.f8088b);
                c.this.a.setAlpha(0.0f);
                c.this.a.animate().alpha(1.0f).setDuration((long) c.this.f8092i).setInterpolator(new LinearInterpolator()).start();
            }
            this.f8095b = null;
            this.a = null;
        }

        public void onPreExecute() {
            super.onPreExecute();
            this.f8095b = c.this.f8090g.getWindow().getDecorView();
            Rect rect = new Rect();
            this.f8095b.getWindowVisibleDisplayFrame(rect);
            this.f8095b.destroyDrawingCache();
            this.f8095b.setDrawingCacheEnabled(true);
            this.f8095b.buildDrawingCache(true);
            Bitmap drawingCache = this.f8095b.getDrawingCache(true);
            this.a = drawingCache;
            if (drawingCache == null) {
                this.f8095b.measure(View.MeasureSpec.makeMeasureSpec(rect.width(), BasicMeasure.EXACTLY), View.MeasureSpec.makeMeasureSpec(rect.height(), BasicMeasure.EXACTLY));
                View view = this.f8095b;
                view.layout(0, 0, view.getMeasuredWidth(), this.f8095b.getMeasuredHeight());
                this.f8095b.destroyDrawingCache();
                this.f8095b.setDrawingCacheEnabled(true);
                this.f8095b.buildDrawingCache(true);
                this.a = this.f8095b.getDrawingCache(true);
            }
        }
    }

    public c(Activity activity) {
        this.f8090g = activity;
        this.f8092i = activity.getResources().getInteger(R.integer.blur_dialog_animation_duration);
    }

    public final void a() {
        ImageView imageView = this.a;
        if (imageView != null) {
            ViewGroup viewGroup = (ViewGroup) imageView.getParent();
            if (viewGroup != null) {
                viewGroup.removeView(this.a);
            }
            this.a = null;
        }
    }
}
