package b.q.a.k;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.RectF;
import android.net.Uri;
import android.os.AsyncTask;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import b.q.a.h;
import b.q.a.j.b;
import b.q.a.j.d;
import com.yalantis.ucrop.UCropActivity;
import java.io.File;
import java.lang.ref.WeakReference;

public class a extends AsyncTask<Void, Void, Throwable> {
    public final WeakReference<Context> a;

    /* renamed from: b  reason: collision with root package name */
    public Bitmap f6795b;
    public final RectF c;
    public final RectF d;

    /* renamed from: e  reason: collision with root package name */
    public float f6796e;
    public float f;

    /* renamed from: g  reason: collision with root package name */
    public final int f6797g;

    /* renamed from: h  reason: collision with root package name */
    public final int f6798h;

    /* renamed from: i  reason: collision with root package name */
    public final Bitmap.CompressFormat f6799i;

    /* renamed from: j  reason: collision with root package name */
    public final int f6800j;

    /* renamed from: k  reason: collision with root package name */
    public final String f6801k;

    /* renamed from: l  reason: collision with root package name */
    public final String f6802l;

    /* renamed from: m  reason: collision with root package name */
    public final b.q.a.i.a f6803m;

    /* renamed from: n  reason: collision with root package name */
    public int f6804n;

    /* renamed from: o  reason: collision with root package name */
    public int f6805o;

    /* renamed from: p  reason: collision with root package name */
    public int f6806p;

    /* renamed from: q  reason: collision with root package name */
    public int f6807q;

    public a(@NonNull Context context, @Nullable Bitmap bitmap, @NonNull d dVar, @NonNull b bVar, @Nullable b.q.a.i.a aVar) {
        this.a = new WeakReference<>(context);
        this.f6795b = bitmap;
        this.c = dVar.a;
        this.d = dVar.f6794b;
        this.f6796e = dVar.c;
        this.f = dVar.d;
        this.f6797g = bVar.a;
        this.f6798h = bVar.f6790b;
        this.f6799i = bVar.c;
        this.f6800j = bVar.d;
        this.f6801k = bVar.f6791e;
        this.f6802l = bVar.f;
        this.f6803m = aVar;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: java.nio.channels.FileChannel} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: java.nio.channels.FileChannel} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v5, resolved type: java.nio.channels.FileChannel} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v6, resolved type: java.nio.channels.FileChannel} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v11, resolved type: java.nio.channels.FileChannel} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v12, resolved type: java.io.OutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v21, resolved type: java.nio.channels.FileChannel} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v22, resolved type: java.nio.channels.FileChannel} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0160  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x022e  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x0274  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x0279  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a() {
        /*
            r30 = this;
            r1 = r30
            int r0 = r1.f6797g
            r2 = 0
            if (r0 <= 0) goto L_0x005f
            int r0 = r1.f6798h
            if (r0 <= 0) goto L_0x005f
            android.graphics.RectF r0 = r1.c
            float r0 = r0.width()
            float r3 = r1.f6796e
            float r0 = r0 / r3
            android.graphics.RectF r3 = r1.c
            float r3 = r3.height()
            float r4 = r1.f6796e
            float r3 = r3 / r4
            int r4 = r1.f6797g
            float r5 = (float) r4
            int r5 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r5 > 0) goto L_0x002b
            int r5 = r1.f6798h
            float r5 = (float) r5
            int r5 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r5 <= 0) goto L_0x005f
        L_0x002b:
            float r4 = (float) r4
            float r4 = r4 / r0
            int r0 = r1.f6798h
            float r0 = (float) r0
            float r0 = r0 / r3
            float r0 = java.lang.Math.min(r4, r0)
            android.graphics.Bitmap r3 = r1.f6795b
            int r4 = r3.getWidth()
            float r4 = (float) r4
            float r4 = r4 * r0
            int r4 = java.lang.Math.round(r4)
            android.graphics.Bitmap r5 = r1.f6795b
            int r5 = r5.getHeight()
            float r5 = (float) r5
            float r5 = r5 * r0
            int r5 = java.lang.Math.round(r5)
            android.graphics.Bitmap r3 = android.graphics.Bitmap.createScaledBitmap(r3, r4, r5, r2)
            android.graphics.Bitmap r4 = r1.f6795b
            if (r4 == r3) goto L_0x0058
            r4.recycle()
        L_0x0058:
            r1.f6795b = r3
            float r3 = r1.f6796e
            float r3 = r3 / r0
            r1.f6796e = r3
        L_0x005f:
            float r0 = r1.f
            r3 = 0
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 == 0) goto L_0x009e
            android.graphics.Matrix r9 = new android.graphics.Matrix
            r9.<init>()
            float r0 = r1.f
            android.graphics.Bitmap r4 = r1.f6795b
            int r4 = r4.getWidth()
            int r4 = r4 / 2
            float r4 = (float) r4
            android.graphics.Bitmap r5 = r1.f6795b
            int r5 = r5.getHeight()
            int r5 = r5 / 2
            float r5 = (float) r5
            r9.setRotate(r0, r4, r5)
            android.graphics.Bitmap r4 = r1.f6795b
            r5 = 0
            r6 = 0
            int r7 = r4.getWidth()
            android.graphics.Bitmap r0 = r1.f6795b
            int r8 = r0.getHeight()
            r10 = 1
            android.graphics.Bitmap r0 = android.graphics.Bitmap.createBitmap(r4, r5, r6, r7, r8, r9, r10)
            android.graphics.Bitmap r4 = r1.f6795b
            if (r4 == r0) goto L_0x009c
            r4.recycle()
        L_0x009c:
            r1.f6795b = r0
        L_0x009e:
            android.graphics.RectF r0 = r1.c
            float r0 = r0.left
            android.graphics.RectF r4 = r1.d
            float r4 = r4.left
            float r0 = r0 - r4
            float r4 = r1.f6796e
            float r0 = r0 / r4
            int r0 = java.lang.Math.round(r0)
            r1.f6806p = r0
            android.graphics.RectF r0 = r1.c
            float r0 = r0.top
            android.graphics.RectF r4 = r1.d
            float r4 = r4.top
            float r0 = r0 - r4
            float r4 = r1.f6796e
            float r0 = r0 / r4
            int r0 = java.lang.Math.round(r0)
            r1.f6807q = r0
            android.graphics.RectF r0 = r1.c
            float r0 = r0.width()
            float r4 = r1.f6796e
            float r0 = r0 / r4
            int r0 = java.lang.Math.round(r0)
            r1.f6804n = r0
            android.graphics.RectF r0 = r1.c
            float r0 = r0.height()
            float r4 = r1.f6796e
            float r0 = r0 / r4
            int r0 = java.lang.Math.round(r0)
            r1.f6805o = r0
            int r4 = r1.f6804n
            int r0 = java.lang.Math.max(r4, r0)
            float r0 = (float) r0
            r4 = 1148846080(0x447a0000, float:1000.0)
            float r0 = r0 / r4
            int r0 = java.lang.Math.round(r0)
            r4 = 1
            int r0 = r0 + r4
            int r5 = r1.f6797g
            if (r5 <= 0) goto L_0x00f8
            int r5 = r1.f6798h
            if (r5 > 0) goto L_0x0146
        L_0x00f8:
            android.graphics.RectF r5 = r1.c
            float r5 = r5.left
            android.graphics.RectF r6 = r1.d
            float r6 = r6.left
            float r5 = r5 - r6
            float r5 = java.lang.Math.abs(r5)
            float r0 = (float) r0
            int r5 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r5 > 0) goto L_0x0146
            android.graphics.RectF r5 = r1.c
            float r5 = r5.top
            android.graphics.RectF r6 = r1.d
            float r6 = r6.top
            float r5 = r5 - r6
            float r5 = java.lang.Math.abs(r5)
            int r5 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r5 > 0) goto L_0x0146
            android.graphics.RectF r5 = r1.c
            float r5 = r5.bottom
            android.graphics.RectF r6 = r1.d
            float r6 = r6.bottom
            float r5 = r5 - r6
            float r5 = java.lang.Math.abs(r5)
            int r5 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r5 > 0) goto L_0x0146
            android.graphics.RectF r5 = r1.c
            float r5 = r5.right
            android.graphics.RectF r6 = r1.d
            float r6 = r6.right
            float r5 = r5 - r6
            float r5 = java.lang.Math.abs(r5)
            int r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r0 > 0) goto L_0x0146
            float r0 = r1.f
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 == 0) goto L_0x0144
            goto L_0x0146
        L_0x0144:
            r0 = r2
            goto L_0x0147
        L_0x0146:
            r0 = r4
        L_0x0147:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r5 = "Should crop: "
            r3.append(r5)
            r3.append(r0)
            java.lang.String r3 = r3.toString()
            java.lang.String r5 = "BitmapCropTask"
            android.util.Log.i(r5, r3)
            r3 = 0
            if (r0 == 0) goto L_0x022e
            androidx.exifinterface.media.ExifInterface r0 = new androidx.exifinterface.media.ExifInterface
            java.lang.String r5 = r1.f6801k
            r0.<init>((java.lang.String) r5)
            android.graphics.Bitmap r5 = r1.f6795b
            int r6 = r1.f6806p
            int r7 = r1.f6807q
            int r8 = r1.f6804n
            int r9 = r1.f6805o
            android.graphics.Bitmap r5 = android.graphics.Bitmap.createBitmap(r5, r6, r7, r8, r9)
            java.lang.ref.WeakReference<android.content.Context> r6 = r1.a
            java.lang.Object r6 = r6.get()
            android.content.Context r6 = (android.content.Context) r6
            if (r6 != 0) goto L_0x0180
            goto L_0x01a2
        L_0x0180:
            android.content.ContentResolver r6 = r6.getContentResolver()     // Catch:{ all -> 0x0227 }
            java.io.File r7 = new java.io.File     // Catch:{ all -> 0x0227 }
            java.lang.String r8 = r1.f6802l     // Catch:{ all -> 0x0227 }
            r7.<init>(r8)     // Catch:{ all -> 0x0227 }
            android.net.Uri r7 = android.net.Uri.fromFile(r7)     // Catch:{ all -> 0x0227 }
            java.io.OutputStream r3 = r6.openOutputStream(r7)     // Catch:{ all -> 0x0227 }
            android.graphics.Bitmap$CompressFormat r6 = r1.f6799i     // Catch:{ all -> 0x0227 }
            int r7 = r1.f6800j     // Catch:{ all -> 0x0227 }
            r5.compress(r6, r7, r3)     // Catch:{ all -> 0x0227 }
            r5.recycle()     // Catch:{ all -> 0x0227 }
            if (r3 == 0) goto L_0x01a2
            r3.close()     // Catch:{ IOException -> 0x01a2 }
        L_0x01a2:
            android.graphics.Bitmap$CompressFormat r3 = r1.f6799i
            android.graphics.Bitmap$CompressFormat r5 = android.graphics.Bitmap.CompressFormat.JPEG
            boolean r3 = r3.equals(r5)
            if (r3 == 0) goto L_0x0226
            int r3 = r1.f6804n
            int r5 = r1.f6805o
            java.lang.String r6 = r1.f6802l
            byte[] r7 = b.q.a.l.b.f6813b
            java.lang.String r8 = "FNumber"
            java.lang.String r9 = "DateTime"
            java.lang.String r10 = "DateTimeDigitized"
            java.lang.String r11 = "ExposureTime"
            java.lang.String r12 = "Flash"
            java.lang.String r13 = "FocalLength"
            java.lang.String r14 = "GPSAltitude"
            java.lang.String r15 = "GPSAltitudeRef"
            java.lang.String r16 = "GPSDateStamp"
            java.lang.String r17 = "GPSLatitude"
            java.lang.String r18 = "GPSLatitudeRef"
            java.lang.String r19 = "GPSLongitude"
            java.lang.String r20 = "GPSLongitudeRef"
            java.lang.String r21 = "GPSProcessingMethod"
            java.lang.String r22 = "GPSTimeStamp"
            java.lang.String r23 = "PhotographicSensitivity"
            java.lang.String r24 = "Make"
            java.lang.String r25 = "Model"
            java.lang.String r26 = "SubSecTime"
            java.lang.String r27 = "SubSecTimeDigitized"
            java.lang.String r28 = "SubSecTimeOriginal"
            java.lang.String r29 = "WhiteBalance"
            java.lang.String[] r7 = new java.lang.String[]{r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29}
            androidx.exifinterface.media.ExifInterface r8 = new androidx.exifinterface.media.ExifInterface     // Catch:{ IOException -> 0x021c }
            r8.<init>((java.lang.String) r6)     // Catch:{ IOException -> 0x021c }
        L_0x01e9:
            r6 = 22
            if (r2 >= r6) goto L_0x01ff
            r6 = r7[r2]     // Catch:{ IOException -> 0x021c }
            java.lang.String r9 = r0.getAttribute(r6)     // Catch:{ IOException -> 0x021c }
            boolean r10 = android.text.TextUtils.isEmpty(r9)     // Catch:{ IOException -> 0x021c }
            if (r10 != 0) goto L_0x01fc
            r8.setAttribute(r6, r9)     // Catch:{ IOException -> 0x021c }
        L_0x01fc:
            int r2 = r2 + 1
            goto L_0x01e9
        L_0x01ff:
            java.lang.String r0 = "ImageWidth"
            java.lang.String r2 = java.lang.String.valueOf(r3)     // Catch:{ IOException -> 0x021c }
            r8.setAttribute(r0, r2)     // Catch:{ IOException -> 0x021c }
            java.lang.String r0 = "ImageLength"
            java.lang.String r2 = java.lang.String.valueOf(r5)     // Catch:{ IOException -> 0x021c }
            r8.setAttribute(r0, r2)     // Catch:{ IOException -> 0x021c }
            java.lang.String r0 = "Orientation"
            java.lang.String r2 = "0"
            r8.setAttribute(r0, r2)     // Catch:{ IOException -> 0x021c }
            r8.saveAttributes()     // Catch:{ IOException -> 0x021c }
            goto L_0x0226
        L_0x021c:
            r0 = move-exception
            java.lang.String r0 = r0.getMessage()
            java.lang.String r2 = "ImageHeaderParser"
            android.util.Log.d(r2, r0)
        L_0x0226:
            return r4
        L_0x0227:
            r0 = move-exception
            if (r3 == 0) goto L_0x022d
            r3.close()     // Catch:{ IOException -> 0x022d }
        L_0x022d:
            throw r0
        L_0x022e:
            java.lang.String r0 = r1.f6801k
            java.lang.String r4 = r1.f6802l
            boolean r5 = r0.equalsIgnoreCase(r4)
            if (r5 == 0) goto L_0x0239
            goto L_0x026b
        L_0x0239:
            java.io.FileInputStream r5 = new java.io.FileInputStream     // Catch:{ all -> 0x0270 }
            java.io.File r6 = new java.io.File     // Catch:{ all -> 0x0270 }
            r6.<init>(r0)     // Catch:{ all -> 0x0270 }
            r5.<init>(r6)     // Catch:{ all -> 0x0270 }
            java.nio.channels.FileChannel r5 = r5.getChannel()     // Catch:{ all -> 0x0270 }
            java.io.FileOutputStream r0 = new java.io.FileOutputStream     // Catch:{ all -> 0x026c }
            java.io.File r6 = new java.io.File     // Catch:{ all -> 0x026c }
            r6.<init>(r4)     // Catch:{ all -> 0x026c }
            r0.<init>(r6)     // Catch:{ all -> 0x026c }
            java.nio.channels.FileChannel r3 = r0.getChannel()     // Catch:{ all -> 0x026c }
            r8 = 0
            long r10 = r5.size()     // Catch:{ all -> 0x026c }
            r7 = r5
            r12 = r3
            r7.transferTo(r8, r10, r12)     // Catch:{ all -> 0x026c }
            r5.close()     // Catch:{ all -> 0x026c }
            r5.close()
            if (r3 == 0) goto L_0x026b
            r3.close()
        L_0x026b:
            return r2
        L_0x026c:
            r0 = move-exception
            r2 = r3
            r3 = r5
            goto L_0x0272
        L_0x0270:
            r0 = move-exception
            r2 = r3
        L_0x0272:
            if (r3 == 0) goto L_0x0277
            r3.close()
        L_0x0277:
            if (r2 == 0) goto L_0x027c
            r2.close()
        L_0x027c:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: b.q.a.k.a.a():boolean");
    }

    @Nullable
    public Object doInBackground(Object[] objArr) {
        Void[] voidArr = (Void[]) objArr;
        Bitmap bitmap = this.f6795b;
        if (bitmap == null) {
            return new NullPointerException("ViewBitmap is null");
        }
        if (bitmap.isRecycled()) {
            return new NullPointerException("ViewBitmap is recycled");
        }
        if (this.d.isEmpty()) {
            return new NullPointerException("CurrentImageRect is empty");
        }
        try {
            a();
            this.f6795b = null;
            return null;
        } catch (Throwable th) {
            return th;
        }
    }

    public void onPostExecute(@Nullable Object obj) {
        Throwable th = (Throwable) obj;
        b.q.a.i.a aVar = this.f6803m;
        if (aVar == null) {
            return;
        }
        if (th == null) {
            Uri fromFile = Uri.fromFile(new File(this.f6802l));
            b.q.a.i.a aVar2 = this.f6803m;
            int i2 = this.f6806p;
            int i3 = this.f6807q;
            int i4 = this.f6804n;
            int i5 = this.f6805o;
            h hVar = (h) aVar2;
            UCropActivity uCropActivity = hVar.a;
            uCropActivity.setResult(-1, new Intent().putExtra("com.yalantis.ucrop.OutputUri", fromFile).putExtra("com.yalantis.ucrop.CropAspectRatio", uCropActivity.t.getTargetAspectRatio()).putExtra("com.yalantis.ucrop.ImageWidth", i4).putExtra("com.yalantis.ucrop.ImageHeight", i5).putExtra("com.yalantis.ucrop.OffsetX", i2).putExtra("com.yalantis.ucrop.OffsetY", i3));
            hVar.a.finish();
            return;
        }
        h hVar2 = (h) aVar;
        hVar2.a.b(th);
        hVar2.a.finish();
    }
}
