package b.m.a;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.util.Log;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import app.bravostudio.A01F175WZXYVE9FWM81EKWKN6FN.R;
import b.l.f.s;
import b.m.a.d;
import com.amplitude.api.Constants;
import com.journeyapps.barcodescanner.BarcodeView;
import com.journeyapps.barcodescanner.DecoratedBarcodeView;
import java.util.List;
import java.util.Objects;

public class f {

    /* renamed from: m  reason: collision with root package name */
    public static final String f5904m = "f";
    public Activity a;

    /* renamed from: b  reason: collision with root package name */
    public DecoratedBarcodeView f5905b;
    public int c = -1;
    public boolean d = false;

    /* renamed from: e  reason: collision with root package name */
    public boolean f5906e = false;
    public b.l.f.x.a.f f;

    /* renamed from: g  reason: collision with root package name */
    public b.l.f.x.a.c f5907g;

    /* renamed from: h  reason: collision with root package name */
    public Handler f5908h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f5909i = false;

    /* renamed from: j  reason: collision with root package name */
    public a f5910j = new a();

    /* renamed from: k  reason: collision with root package name */
    public final d.e f5911k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f5912l;

    public class a implements a {

        /* renamed from: b.m.a.f$a$a  reason: collision with other inner class name */
        public class C0101a implements Runnable {

            /* renamed from: h  reason: collision with root package name */
            public final /* synthetic */ b f5913h;

            public C0101a(b bVar) {
                this.f5913h = bVar;
            }

            /* JADX WARNING: Removed duplicated region for block: B:18:0x00d5  */
            /* JADX WARNING: Removed duplicated region for block: B:34:0x013f  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public void run() {
                /*
                    r14 = this;
                    b.m.a.f$a r0 = b.m.a.f.a.this
                    b.m.a.f r0 = b.m.a.f.this
                    b.m.a.b r1 = r14.f5913h
                    boolean r2 = r0.d
                    r3 = 0
                    if (r2 == 0) goto L_0x009e
                    b.m.a.s r2 = r1.f5891b
                    java.util.Objects.requireNonNull(r2)
                    android.graphics.Rect r4 = new android.graphics.Rect
                    b.m.a.n r5 = r2.a
                    int r6 = r5.f5928b
                    int r5 = r5.c
                    r4.<init>(r3, r3, r6, r5)
                    android.graphics.YuvImage r5 = new android.graphics.YuvImage
                    b.m.a.n r6 = r2.a
                    byte[] r8 = r6.a
                    int r9 = r2.f5932b
                    int r10 = r6.f5928b
                    int r11 = r6.c
                    r12 = 0
                    r7 = r5
                    r7.<init>(r8, r9, r10, r11, r12)
                    java.io.ByteArrayOutputStream r6 = new java.io.ByteArrayOutputStream
                    r6.<init>()
                    r7 = 90
                    r5.compressToJpeg(r4, r7, r6)
                    byte[] r4 = r6.toByteArray()
                    android.graphics.BitmapFactory$Options r5 = new android.graphics.BitmapFactory$Options
                    r5.<init>()
                    r6 = 2
                    r5.inSampleSize = r6
                    int r6 = r4.length
                    android.graphics.Bitmap r7 = android.graphics.BitmapFactory.decodeByteArray(r4, r3, r6, r5)
                    int r4 = r2.c
                    if (r4 == 0) goto L_0x0065
                    android.graphics.Matrix r12 = new android.graphics.Matrix
                    r12.<init>()
                    int r2 = r2.c
                    float r2 = (float) r2
                    r12.postRotate(r2)
                    r8 = 0
                    r9 = 0
                    int r10 = r7.getWidth()
                    int r11 = r7.getHeight()
                    r13 = 0
                    android.graphics.Bitmap r7 = android.graphics.Bitmap.createBitmap(r7, r8, r9, r10, r11, r12, r13)
                L_0x0065:
                    java.lang.String r2 = "barcodeimage"
                    java.lang.String r4 = ".jpg"
                    android.app.Activity r5 = r0.a     // Catch:{ IOException -> 0x0087 }
                    java.io.File r5 = r5.getCacheDir()     // Catch:{ IOException -> 0x0087 }
                    java.io.File r2 = java.io.File.createTempFile(r2, r4, r5)     // Catch:{ IOException -> 0x0087 }
                    java.io.FileOutputStream r4 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x0087 }
                    r4.<init>(r2)     // Catch:{ IOException -> 0x0087 }
                    android.graphics.Bitmap$CompressFormat r5 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch:{ IOException -> 0x0087 }
                    r6 = 100
                    r7.compress(r5, r6, r4)     // Catch:{ IOException -> 0x0087 }
                    r4.close()     // Catch:{ IOException -> 0x0087 }
                    java.lang.String r2 = r2.getAbsolutePath()     // Catch:{ IOException -> 0x0087 }
                    goto L_0x009f
                L_0x0087:
                    r2 = move-exception
                    java.lang.String r4 = b.m.a.f.f5904m
                    java.lang.StringBuilder r5 = new java.lang.StringBuilder
                    r5.<init>()
                    java.lang.String r6 = "Unable to create temporary file and store bitmap! "
                    r5.append(r6)
                    r5.append(r2)
                    java.lang.String r2 = r5.toString()
                    android.util.Log.w(r4, r2)
                L_0x009e:
                    r2 = 0
                L_0x009f:
                    android.content.Intent r4 = new android.content.Intent
                    java.lang.String r5 = "com.google.zxing.client.android.SCAN"
                    r4.<init>(r5)
                    r5 = 524288(0x80000, float:7.34684E-40)
                    r4.addFlags(r5)
                    b.l.f.q r5 = r1.a
                    java.lang.String r5 = r5.a
                    java.lang.String r6 = "SCAN_RESULT"
                    r4.putExtra(r6, r5)
                    b.l.f.q r5 = r1.a
                    b.l.f.a r5 = r5.d
                    java.lang.String r5 = r5.toString()
                    java.lang.String r6 = "SCAN_RESULT_FORMAT"
                    r4.putExtra(r6, r5)
                    b.l.f.q r5 = r1.a
                    byte[] r5 = r5.f5763b
                    if (r5 == 0) goto L_0x00cf
                    int r6 = r5.length
                    if (r6 <= 0) goto L_0x00cf
                    java.lang.String r6 = "SCAN_RESULT_BYTES"
                    r4.putExtra(r6, r5)
                L_0x00cf:
                    b.l.f.q r1 = r1.a
                    java.util.Map<b.l.f.r, java.lang.Object> r1 = r1.f5764e
                    if (r1 == 0) goto L_0x013d
                    b.l.f.r r5 = b.l.f.r.UPC_EAN_EXTENSION
                    boolean r6 = r1.containsKey(r5)
                    if (r6 == 0) goto L_0x00ea
                    java.lang.Object r5 = r1.get(r5)
                    java.lang.String r5 = r5.toString()
                    java.lang.String r6 = "SCAN_RESULT_UPC_EAN_EXTENSION"
                    r4.putExtra(r6, r5)
                L_0x00ea:
                    b.l.f.r r5 = b.l.f.r.ORIENTATION
                    java.lang.Object r5 = r1.get(r5)
                    java.lang.Number r5 = (java.lang.Number) r5
                    if (r5 == 0) goto L_0x00fd
                    int r5 = r5.intValue()
                    java.lang.String r6 = "SCAN_RESULT_ORIENTATION"
                    r4.putExtra(r6, r5)
                L_0x00fd:
                    b.l.f.r r5 = b.l.f.r.ERROR_CORRECTION_LEVEL
                    java.lang.Object r5 = r1.get(r5)
                    java.lang.String r5 = (java.lang.String) r5
                    if (r5 == 0) goto L_0x010c
                    java.lang.String r6 = "SCAN_RESULT_ERROR_CORRECTION_LEVEL"
                    r4.putExtra(r6, r5)
                L_0x010c:
                    b.l.f.r r5 = b.l.f.r.BYTE_SEGMENTS
                    java.lang.Object r1 = r1.get(r5)
                    java.lang.Iterable r1 = (java.lang.Iterable) r1
                    if (r1 == 0) goto L_0x013d
                    java.util.Iterator r1 = r1.iterator()
                L_0x011a:
                    boolean r5 = r1.hasNext()
                    if (r5 == 0) goto L_0x013d
                    java.lang.Object r5 = r1.next()
                    byte[] r5 = (byte[]) r5
                    java.lang.StringBuilder r6 = new java.lang.StringBuilder
                    r6.<init>()
                    java.lang.String r7 = "SCAN_RESULT_BYTE_SEGMENTS_"
                    r6.append(r7)
                    r6.append(r3)
                    java.lang.String r6 = r6.toString()
                    r4.putExtra(r6, r5)
                    int r3 = r3 + 1
                    goto L_0x011a
                L_0x013d:
                    if (r2 == 0) goto L_0x0144
                    java.lang.String r1 = "SCAN_RESULT_IMAGE_PATH"
                    r4.putExtra(r1, r2)
                L_0x0144:
                    android.app.Activity r1 = r0.a
                    r2 = -1
                    r1.setResult(r2, r4)
                    r0.a()
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: b.m.a.f.a.C0101a.run():void");
            }
        }

        public a() {
        }

        public void a(b bVar) {
            f.this.f5905b.f7366h.d();
            b.l.f.x.a.c cVar = f.this.f5907g;
            synchronized (cVar) {
                if (cVar.f5798b) {
                    cVar.a();
                }
            }
            f.this.f5908h.post(new C0101a(bVar));
        }

        public void b(List<s> list) {
        }
    }

    public class b implements d.e {
        public b() {
        }

        public void a() {
        }

        public void b(Exception exc) {
            f.this.b();
        }

        public void c() {
        }

        public void d() {
        }

        public void e() {
            if (f.this.f5909i) {
                Log.d(f.f5904m, "Camera closed; finishing activity");
                f.this.a.finish();
            }
        }
    }

    public class c implements Runnable {
        public c() {
        }

        public void run() {
            Log.d(f.f5904m, "Finishing due to inactivity");
            f.this.a.finish();
        }
    }

    public class d implements Runnable {
        public d() {
        }

        public void run() {
            f fVar = f.this;
            Objects.requireNonNull(fVar);
            Intent intent = new Intent("com.google.zxing.client.android.SCAN");
            intent.putExtra("TIMEOUT", true);
            fVar.a.setResult(0, intent);
            fVar.a();
        }
    }

    public class e implements DialogInterface.OnClickListener {
        public e() {
        }

        public void onClick(DialogInterface dialogInterface, int i2) {
            f.this.a.finish();
        }
    }

    /* renamed from: b.m.a.f$f  reason: collision with other inner class name */
    public class C0102f implements DialogInterface.OnCancelListener {
        public C0102f() {
        }

        public void onCancel(DialogInterface dialogInterface) {
            f.this.a.finish();
        }
    }

    public f(Activity activity, DecoratedBarcodeView decoratedBarcodeView) {
        b bVar = new b();
        this.f5911k = bVar;
        this.f5912l = false;
        this.a = activity;
        this.f5905b = decoratedBarcodeView;
        decoratedBarcodeView.getBarcodeView().f5902q.add(bVar);
        this.f5908h = new Handler();
        this.f = new b.l.f.x.a.f(activity, new c());
        this.f5907g = new b.l.f.x.a.c(activity);
    }

    public void a() {
        b.m.a.t.d dVar = this.f5905b.getBarcodeView().f5893h;
        if (dVar == null || dVar.f5948g) {
            this.a.finish();
        } else {
            this.f5909i = true;
        }
        this.f5905b.f7366h.d();
        this.f.a();
    }

    public void b() {
        if (!this.a.isFinishing() && !this.f5906e && !this.f5909i) {
            AlertDialog.Builder builder = new AlertDialog.Builder(this.a);
            builder.setTitle(this.a.getString(R.string.zxing_app_name));
            builder.setMessage(this.a.getString(R.string.zxing_msg_camera_framework_bug));
            builder.setPositiveButton(R.string.zxing_button_ok, new e());
            builder.setOnCancelListener(new C0102f());
            builder.show();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v12, resolved type: java.util.Set} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00e3  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x017e  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0189  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void c(android.content.Intent r17, android.os.Bundle r18) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = r18
            android.app.Activity r3 = r0.a
            android.view.Window r3 = r3.getWindow()
            r4 = 128(0x80, float:1.794E-43)
            r3.addFlags(r4)
            r3 = -1
            if (r2 == 0) goto L_0x001c
            java.lang.String r4 = "SAVED_ORIENTATION_LOCK"
            int r2 = r2.getInt(r4, r3)
            r0.c = r2
        L_0x001c:
            if (r1 == 0) goto L_0x01dd
            java.lang.String r2 = "SCAN_ORIENTATION_LOCKED"
            r4 = 1
            boolean r2 = r1.getBooleanExtra(r2, r4)
            r5 = 0
            if (r2 == 0) goto L_0x0068
            int r2 = r0.c
            if (r2 != r3) goto L_0x0061
            android.app.Activity r2 = r0.a
            android.view.WindowManager r2 = r2.getWindowManager()
            android.view.Display r2 = r2.getDefaultDisplay()
            int r2 = r2.getRotation()
            android.app.Activity r6 = r0.a
            android.content.res.Resources r6 = r6.getResources()
            android.content.res.Configuration r6 = r6.getConfiguration()
            int r6 = r6.orientation
            r7 = 2
            if (r6 != r7) goto L_0x0051
            if (r2 == 0) goto L_0x005e
            if (r2 != r4) goto L_0x004e
            goto L_0x005e
        L_0x004e:
            r2 = 8
            goto L_0x005f
        L_0x0051:
            if (r6 != r4) goto L_0x005e
            if (r2 == 0) goto L_0x005c
            r6 = 3
            if (r2 != r6) goto L_0x0059
            goto L_0x005c
        L_0x0059:
            r2 = 9
            goto L_0x005f
        L_0x005c:
            r2 = r4
            goto L_0x005f
        L_0x005e:
            r2 = r5
        L_0x005f:
            r0.c = r2
        L_0x0061:
            android.app.Activity r2 = r0.a
            int r6 = r0.c
            r2.setRequestedOrientation(r6)
        L_0x0068:
            java.lang.String r2 = r17.getAction()
            java.lang.String r6 = "com.google.zxing.client.android.SCAN"
            boolean r2 = r6.equals(r2)
            if (r2 == 0) goto L_0x01af
            com.journeyapps.barcodescanner.DecoratedBarcodeView r2 = r0.f5905b
            java.util.Objects.requireNonNull(r2)
            java.util.regex.Pattern r6 = b.l.f.x.a.d.a
            java.lang.String r6 = "SCAN_FORMATS"
            java.lang.String r6 = r1.getStringExtra(r6)
            r7 = 0
            if (r6 == 0) goto L_0x008f
            java.util.regex.Pattern r8 = b.l.f.x.a.d.a
            java.lang.String[] r6 = r8.split(r6)
            java.util.List r6 = java.util.Arrays.asList(r6)
            goto L_0x0090
        L_0x008f:
            r6 = r7
        L_0x0090:
            java.lang.String r8 = "SCAN_MODE"
            java.lang.String r8 = r1.getStringExtra(r8)
            if (r6 == 0) goto L_0x00b6
            java.lang.Class<b.l.f.a> r9 = b.l.f.a.class
            java.util.EnumSet r9 = java.util.EnumSet.noneOf(r9)
            java.util.Iterator r6 = r6.iterator()     // Catch:{ IllegalArgumentException -> 0x00b6 }
        L_0x00a2:
            boolean r10 = r6.hasNext()     // Catch:{ IllegalArgumentException -> 0x00b6 }
            if (r10 == 0) goto L_0x00c3
            java.lang.Object r10 = r6.next()     // Catch:{ IllegalArgumentException -> 0x00b6 }
            java.lang.String r10 = (java.lang.String) r10     // Catch:{ IllegalArgumentException -> 0x00b6 }
            b.l.f.a r10 = b.l.f.a.valueOf(r10)     // Catch:{ IllegalArgumentException -> 0x00b6 }
            r9.add(r10)     // Catch:{ IllegalArgumentException -> 0x00b6 }
            goto L_0x00a2
        L_0x00b6:
            if (r8 == 0) goto L_0x00c2
            java.util.Map<java.lang.String, java.util.Set<b.l.f.a>> r6 = b.l.f.x.a.d.f5803i
            java.lang.Object r6 = r6.get(r8)
            r9 = r6
            java.util.Set r9 = (java.util.Set) r9
            goto L_0x00c3
        L_0x00c2:
            r9 = r7
        L_0x00c3:
            java.lang.String r6 = b.l.f.x.a.e.a
            android.os.Bundle r6 = r17.getExtras()
            if (r6 == 0) goto L_0x0152
            boolean r8 = r6.isEmpty()
            if (r8 == 0) goto L_0x00d3
            goto L_0x0152
        L_0x00d3:
            java.util.EnumMap r7 = new java.util.EnumMap
            java.lang.Class<b.l.f.e> r8 = b.l.f.e.class
            r7.<init>(r8)
            b.l.f.e[] r8 = b.l.f.e.values()
            r10 = 11
            r11 = r5
        L_0x00e1:
            if (r11 >= r10) goto L_0x013c
            r12 = r8[r11]
            b.l.f.e r13 = b.l.f.e.CHARACTER_SET
            if (r12 == r13) goto L_0x0137
            b.l.f.e r13 = b.l.f.e.NEED_RESULT_POINT_CALLBACK
            if (r12 == r13) goto L_0x0137
            b.l.f.e r13 = b.l.f.e.POSSIBLE_FORMATS
            if (r12 != r13) goto L_0x00f2
            goto L_0x0137
        L_0x00f2:
            java.lang.String r13 = r12.name()
            boolean r14 = r6.containsKey(r13)
            if (r14 == 0) goto L_0x0137
            java.lang.Class<?> r14 = r12.f5699h
            java.lang.Class<java.lang.Void> r15 = java.lang.Void.class
            boolean r14 = r14.equals(r15)
            if (r14 == 0) goto L_0x0109
            java.lang.Boolean r13 = java.lang.Boolean.TRUE
            goto L_0x0115
        L_0x0109:
            java.lang.Object r13 = r6.get(r13)
            java.lang.Class<?> r14 = r12.f5699h
            boolean r14 = r14.isInstance(r13)
            if (r14 == 0) goto L_0x0119
        L_0x0115:
            r7.put(r12, r13)
            goto L_0x0137
        L_0x0119:
            java.lang.String r14 = b.l.f.x.a.e.a
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
            java.lang.String r10 = "Ignoring hint "
            r15.append(r10)
            r15.append(r12)
            java.lang.String r10 = " because it is not assignable from "
            r15.append(r10)
            r15.append(r13)
            java.lang.String r10 = r15.toString()
            android.util.Log.w(r14, r10)
        L_0x0137:
            int r11 = r11 + 1
            r10 = 11
            goto L_0x00e1
        L_0x013c:
            java.lang.String r6 = b.l.f.x.a.e.a
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r10 = "Hints from the Intent: "
            r8.append(r10)
            r8.append(r7)
            java.lang.String r8 = r8.toString()
            android.util.Log.i(r6, r8)
        L_0x0152:
            b.m.a.t.f r6 = new b.m.a.t.f
            r6.<init>()
            java.lang.String r8 = "SCAN_CAMERA_ID"
            boolean r10 = r1.hasExtra(r8)
            if (r10 == 0) goto L_0x0167
            int r3 = r1.getIntExtra(r8, r3)
            if (r3 < 0) goto L_0x0167
            r6.a = r3
        L_0x0167:
            java.lang.String r3 = "TORCH_ENABLED"
            boolean r8 = r1.hasExtra(r3)
            if (r8 == 0) goto L_0x0181
            boolean r3 = r1.getBooleanExtra(r3, r5)
            if (r3 == 0) goto L_0x0181
            com.journeyapps.barcodescanner.BarcodeView r3 = r2.f7366h
            r3.setTorch(r4)
            com.journeyapps.barcodescanner.DecoratedBarcodeView$a r3 = r2.f7369k
            if (r3 == 0) goto L_0x0181
            r3.b()
        L_0x0181:
            java.lang.String r3 = "PROMPT_MESSAGE"
            java.lang.String r3 = r1.getStringExtra(r3)
            if (r3 == 0) goto L_0x018c
            r2.setStatusText(r3)
        L_0x018c:
            java.lang.String r3 = "SCAN_TYPE"
            int r3 = r1.getIntExtra(r3, r5)
            java.lang.String r8 = "CHARACTER_SET"
            java.lang.String r8 = r1.getStringExtra(r8)
            b.l.f.k r10 = new b.l.f.k
            r10.<init>()
            r10.e(r7)
            com.journeyapps.barcodescanner.BarcodeView r10 = r2.f7366h
            r10.setCameraSettings(r6)
            com.journeyapps.barcodescanner.BarcodeView r2 = r2.f7366h
            b.m.a.k r6 = new b.m.a.k
            r6.<init>(r9, r7, r8, r3)
            r2.setDecoderFactory(r6)
        L_0x01af:
            java.lang.String r2 = "BEEP_ENABLED"
            boolean r2 = r1.getBooleanExtra(r2, r4)
            if (r2 != 0) goto L_0x01bb
            b.l.f.x.a.c r2 = r0.f5907g
            r2.f5798b = r5
        L_0x01bb:
            java.lang.String r2 = "TIMEOUT"
            boolean r3 = r1.hasExtra(r2)
            if (r3 == 0) goto L_0x01d3
            b.m.a.f$d r3 = new b.m.a.f$d
            r3.<init>()
            android.os.Handler r6 = r0.f5908h
            r7 = 0
            long r7 = r1.getLongExtra(r2, r7)
            r6.postDelayed(r3, r7)
        L_0x01d3:
            java.lang.String r2 = "BARCODE_IMAGE_ENABLED"
            boolean r1 = r1.getBooleanExtra(r2, r5)
            if (r1 == 0) goto L_0x01dd
            r0.d = r4
        L_0x01dd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: b.m.a.f.c(android.content.Intent, android.os.Bundle):void");
    }

    public void d() {
        this.f.a();
        BarcodeView barcodeView = this.f5905b.f7366h;
        b.m.a.t.d cameraInstance = barcodeView.getCameraInstance();
        barcodeView.d();
        long nanoTime = System.nanoTime();
        while (cameraInstance != null && !cameraInstance.f5948g && System.nanoTime() - nanoTime <= 2000000000) {
            try {
                Thread.sleep(1);
            } catch (InterruptedException unused) {
                return;
            }
        }
    }

    public void e() {
        if (ContextCompat.checkSelfPermission(this.a, "android.permission.CAMERA") == 0) {
            this.f5905b.f7366h.f();
        } else if (!this.f5912l) {
            ActivityCompat.requestPermissions(this.a, new String[]{"android.permission.CAMERA"}, 250);
            this.f5912l = true;
        }
        b.l.f.x.a.f fVar = this.f;
        if (!fVar.c) {
            fVar.a.registerReceiver(fVar.f5804b, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            fVar.c = true;
        }
        fVar.d.removeCallbacksAndMessages((Object) null);
        if (fVar.f) {
            fVar.d.postDelayed(fVar.f5805e, Constants.MIN_TIME_BETWEEN_SESSIONS_MILLIS);
        }
    }
}
