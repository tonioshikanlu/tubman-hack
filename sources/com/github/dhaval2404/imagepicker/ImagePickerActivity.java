package com.github.dhaval2404.imagepicker;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import app.bravostudio.A01F175WZXYVE9FWM81EKWKN6FN.R;
import b.k.b.a.c.a;
import b.k.b.a.e.b;
import b.k.b.a.e.d;
import b.k.b.a.e.e;
import b.k.b.a.e.f;
import com.segment.analytics.integrations.BasePayload;
import e.x.c.i;
import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Objects;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b4\u0010\u0018J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\u0006J-\u0010\u0010\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J)\u0010\u0015\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\t2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\r\u0010\u001d\u001a\u00020\u0004¢\u0006\u0004\b\u001d\u0010\u0018J\u0017\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001e\u0010\u001cR\u0018\u0010!\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0018\u0010#\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\"\u0010 R\u0016\u0010'\u001a\u00020$8\u0002@\u0002X.¢\u0006\u0006\n\u0004\b%\u0010&R\u0018\u0010+\u001a\u0004\u0018\u00010(8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u0018\u0010/\u001a\u0004\u0018\u00010,8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b-\u0010.R\u0016\u00103\u001a\u0002008\u0002@\u0002X.¢\u0006\u0006\n\u0004\b1\u00102¨\u00065"}, d2 = {"Lcom/github/dhaval2404/imagepicker/ImagePickerActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Landroid/os/Bundle;", "savedInstanceState", "Le/r;", "onCreate", "(Landroid/os/Bundle;)V", "outState", "onSaveInstanceState", "", "requestCode", "", "", "permissions", "", "grantResults", "onRequestPermissionsResult", "(I[Ljava/lang/String;[I)V", "resultCode", "Landroid/content/Intent;", "data", "onActivityResult", "(IILandroid/content/Intent;)V", "onBackPressed", "()V", "Ljava/io/File;", "file", "a", "(Ljava/io/File;)V", "c", "b", "m", "Ljava/io/File;", "mCropFile", "l", "mImageFile", "Lb/k/b/a/e/e;", "j", "Lb/k/b/a/e/e;", "mCropProvider", "Lb/k/b/a/e/f;", "h", "Lb/k/b/a/e/f;", "mGalleryProvider", "Lb/k/b/a/e/b;", "i", "Lb/k/b/a/e/b;", "mCameraProvider", "Lb/k/b/a/e/d;", "k", "Lb/k/b/a/e/d;", "mCompressionProvider", "<init>", "imagepicker_release"}, k = 1, mv = {1, 1, 15})
public final class ImagePickerActivity extends AppCompatActivity {

    /* renamed from: h  reason: collision with root package name */
    public f f7194h;

    /* renamed from: i  reason: collision with root package name */
    public b f7195i;

    /* renamed from: j  reason: collision with root package name */
    public e f7196j;

    /* renamed from: k  reason: collision with root package name */
    public d f7197k;

    /* renamed from: l  reason: collision with root package name */
    public File f7198l;

    /* renamed from: m  reason: collision with root package name */
    public File f7199m;

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x004e, code lost:
        if ((r0.length() == 0) != false) goto L_0x0050;
     */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x009a A[Catch:{ IOException -> 0x00bc }] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x009b A[Catch:{ IOException -> 0x00bc }] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00af A[Catch:{ IOException -> 0x00bc }] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00cc  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x015f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(java.io.File r12) {
        /*
            r11 = this;
            java.lang.String r0 = "file"
            e.x.c.i.f(r12, r0)
            r11.f7198l = r12
            b.k.b.a.e.e r1 = r11.f7196j
            r2 = 0
            if (r1 == 0) goto L_0x0199
            boolean r3 = r1.d
            r4 = 1
            r5 = 0
            if (r3 == 0) goto L_0x016d
            e.x.c.i.f(r12, r0)
            android.net.Uri r12 = android.net.Uri.fromFile(r12)
            java.lang.String r0 = "uri"
            e.x.c.i.b(r12, r0)
            java.lang.String r0 = "."
            java.lang.String r3 = "uriImage"
            e.x.c.i.f(r12, r3)
            java.lang.String r3 = r12.getPath()     // Catch:{ Exception -> 0x0042 }
            if (r3 == 0) goto L_0x0042
            r6 = 6
            int r7 = e.c0.h.p(r3, r0, r5, r5, r6)     // Catch:{ Exception -> 0x0042 }
            r8 = -1
            if (r7 == r8) goto L_0x0042
            int r0 = e.c0.h.p(r3, r0, r5, r5, r6)     // Catch:{ Exception -> 0x0042 }
            int r0 = r0 + r4
            java.lang.String r0 = r3.substring(r0)     // Catch:{ Exception -> 0x0042 }
            java.lang.String r3 = "(this as java.lang.String).substring(startIndex)"
            e.x.c.i.b(r0, r3)     // Catch:{ Exception -> 0x0042 }
            goto L_0x0043
        L_0x0042:
            r0 = r2
        L_0x0043:
            if (r0 == 0) goto L_0x0050
            int r3 = r0.length()
            if (r3 != 0) goto L_0x004d
            r3 = r4
            goto L_0x004e
        L_0x004d:
            r3 = r5
        L_0x004e:
            if (r3 == 0) goto L_0x0052
        L_0x0050:
            java.lang.String r0 = "jpg"
        L_0x0052:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r6 = 46
            r3.append(r6)
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            java.io.File r3 = r1.f2381h
            if (r0 == 0) goto L_0x0069
            r6 = r0
            goto L_0x006b
        L_0x0069:
            java.lang.String r6 = ".jpg"
        L_0x006b:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x00bc }
            r7.<init>()     // Catch:{ IOException -> 0x00bc }
            java.lang.String r8 = "IMG_"
            r7.append(r8)     // Catch:{ IOException -> 0x00bc }
            java.text.SimpleDateFormat r8 = new java.text.SimpleDateFormat     // Catch:{ IOException -> 0x00bc }
            java.util.Locale r9 = java.util.Locale.getDefault()     // Catch:{ IOException -> 0x00bc }
            java.lang.String r10 = "yyyyMMdd_HHmmssSSS"
            r8.<init>(r10, r9)     // Catch:{ IOException -> 0x00bc }
            java.util.Date r9 = new java.util.Date     // Catch:{ IOException -> 0x00bc }
            r9.<init>()     // Catch:{ IOException -> 0x00bc }
            java.lang.String r8 = r8.format(r9)     // Catch:{ IOException -> 0x00bc }
            java.lang.String r9 = "SimpleDateFormat(timeFor…Default()).format(Date())"
            e.x.c.i.b(r8, r9)     // Catch:{ IOException -> 0x00bc }
            r7.append(r8)     // Catch:{ IOException -> 0x00bc }
            r7.append(r6)     // Catch:{ IOException -> 0x00bc }
            java.lang.String r6 = r7.toString()     // Catch:{ IOException -> 0x00bc }
            if (r3 == 0) goto L_0x009b
            goto L_0x00a9
        L_0x009b:
            java.lang.String r3 = android.os.Environment.DIRECTORY_DCIM     // Catch:{ IOException -> 0x00bc }
            java.io.File r3 = android.os.Environment.getExternalStoragePublicDirectory(r3)     // Catch:{ IOException -> 0x00bc }
            java.io.File r7 = new java.io.File     // Catch:{ IOException -> 0x00bc }
            java.lang.String r8 = "Camera"
            r7.<init>(r3, r8)     // Catch:{ IOException -> 0x00bc }
            r3 = r7
        L_0x00a9:
            boolean r7 = r3.exists()     // Catch:{ IOException -> 0x00bc }
            if (r7 != 0) goto L_0x00b2
            r3.mkdirs()     // Catch:{ IOException -> 0x00bc }
        L_0x00b2:
            java.io.File r7 = new java.io.File     // Catch:{ IOException -> 0x00bc }
            r7.<init>(r3, r6)     // Catch:{ IOException -> 0x00bc }
            r7.createNewFile()     // Catch:{ IOException -> 0x00bc }
            r2 = r7
            goto L_0x00c0
        L_0x00bc:
            r3 = move-exception
            r3.printStackTrace()
        L_0x00c0:
            r1.f2380g = r2
            if (r2 == 0) goto L_0x015f
            boolean r2 = r2.exists()
            if (r2 != 0) goto L_0x00cc
            goto L_0x015f
        L_0x00cc:
            android.os.Bundle r2 = new android.os.Bundle
            r2.<init>()
            java.lang.String r3 = "extension"
            e.x.c.i.f(r0, r3)
            java.lang.String r3 = "png"
            boolean r3 = e.c0.h.b(r0, r3, r4)
            if (r3 == 0) goto L_0x00e1
            android.graphics.Bitmap$CompressFormat r0 = android.graphics.Bitmap.CompressFormat.PNG
            goto L_0x00ee
        L_0x00e1:
            java.lang.String r3 = "webp"
            boolean r0 = e.c0.h.b(r0, r3, r4)
            if (r0 == 0) goto L_0x00ec
            android.graphics.Bitmap$CompressFormat r0 = android.graphics.Bitmap.CompressFormat.WEBP
            goto L_0x00ee
        L_0x00ec:
            android.graphics.Bitmap$CompressFormat r0 = android.graphics.Bitmap.CompressFormat.JPEG
        L_0x00ee:
            java.lang.String r0 = r0.name()
            java.lang.String r3 = "com.yalantis.ucrop.CompressionFormatName"
            r2.putString(r3, r0)
            java.io.File r0 = r1.f2380g
            android.net.Uri r0 = android.net.Uri.fromFile(r0)
            android.content.Intent r3 = new android.content.Intent
            r3.<init>()
            android.os.Bundle r4 = new android.os.Bundle
            r4.<init>()
            java.lang.String r6 = "com.yalantis.ucrop.InputUri"
            r4.putParcelable(r6, r12)
            java.lang.String r12 = "com.yalantis.ucrop.OutputUri"
            r4.putParcelable(r12, r0)
            r4.putAll(r2)
            float r12 = r1.f2379e
            float r0 = (float) r5
            int r2 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r2 <= 0) goto L_0x012b
            float r2 = r1.f
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x012b
            java.lang.String r0 = "com.yalantis.ucrop.AspectRatioX"
            r4.putFloat(r0, r12)
            java.lang.String r12 = "com.yalantis.ucrop.AspectRatioY"
            r4.putFloat(r12, r2)
        L_0x012b:
            int r12 = r1.f2378b
            if (r12 <= 0) goto L_0x0145
            int r0 = r1.c
            if (r0 <= 0) goto L_0x0145
            r2 = 10
            if (r12 >= r2) goto L_0x0138
            r12 = r2
        L_0x0138:
            if (r0 >= r2) goto L_0x013b
            r0 = r2
        L_0x013b:
            java.lang.String r2 = "com.yalantis.ucrop.MaxSizeX"
            r4.putInt(r2, r12)
            java.lang.String r12 = "com.yalantis.ucrop.MaxSizeY"
            r4.putInt(r12, r0)
        L_0x0145:
            com.github.dhaval2404.imagepicker.ImagePickerActivity r12 = r1.a     // Catch:{ ActivityNotFoundException -> 0x0155 }
            r0 = 69
            java.lang.Class<com.yalantis.ucrop.UCropActivity> r2 = com.yalantis.ucrop.UCropActivity.class
            r3.setClass(r12, r2)     // Catch:{ ActivityNotFoundException -> 0x0155 }
            r3.putExtras(r4)     // Catch:{ ActivityNotFoundException -> 0x0155 }
            r12.startActivityForResult(r3, r0)     // Catch:{ ActivityNotFoundException -> 0x0155 }
            goto L_0x0194
        L_0x0155:
            r12 = move-exception
            java.lang.String r0 = "uCrop not specified in manifest file.Add UCropActivity in Manifest<activity\n    android:name=\"com.yalantis.ucrop.UCropActivity\"\n    android:screenOrientation=\"portrait\"\n    android:theme=\"@style/Theme.AppCompat.Light.NoActionBar\"/>"
            r1.c(r0)
            r12.printStackTrace()
            goto L_0x0194
        L_0x015f:
            java.lang.String r12 = b.k.b.a.e.e.f2377i
            java.lang.String r0 = "Failed to create crop image file"
            android.util.Log.e(r12, r0)
            r12 = 2131755093(0x7f100055, float:1.9141056E38)
            r1.b(r12)
            goto L_0x0194
        L_0x016d:
            b.k.b.a.e.d r1 = r11.f7197k
            java.lang.String r3 = "mCompressionProvider"
            if (r1 == 0) goto L_0x0195
            boolean r1 = r1.f(r12)
            if (r1 == 0) goto L_0x0191
            b.k.b.a.e.d r1 = r11.f7197k
            if (r1 == 0) goto L_0x018d
            e.x.c.i.f(r12, r0)
            b.k.b.a.e.c r0 = new b.k.b.a.e.c
            r0.<init>(r1)
            java.io.File[] r1 = new java.io.File[r4]
            r1[r5] = r12
            r0.execute(r1)
            goto L_0x0194
        L_0x018d:
            e.x.c.i.m(r3)
            throw r2
        L_0x0191:
            r11.b(r12)
        L_0x0194:
            return
        L_0x0195:
            e.x.c.i.m(r3)
            throw r2
        L_0x0199:
            java.lang.String r12 = "mCropProvider"
            e.x.c.i.m(r12)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.dhaval2404.imagepicker.ImagePickerActivity.a(java.io.File):void");
    }

    public final void b(File file) {
        Intent intent = new Intent();
        intent.setData(Uri.fromFile(file));
        intent.putExtra("extra.file_path", file.getAbsolutePath());
        setResult(-1, intent);
        finish();
    }

    public final void c() {
        i.f(this, BasePayload.CONTEXT_KEY);
        Intent intent = new Intent();
        intent.putExtra("extra.error", getString(R.string.error_task_cancelled));
        setResult(0, intent);
        finish();
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(9:138|139|(4:141|142|143|144)(1:146)|(2:148|149)|150|151|(1:(2:183|188)(2:184|185))|186|188) */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x02c2, code lost:
        r15 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:?, code lost:
        r15.printStackTrace();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x02c6, code lost:
        r5 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x02e9, code lost:
        r15 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x02eb, code lost:
        r13 = th;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:150:0x02e5 */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x025d A[SYNTHETIC, Splitter:B:115:0x025d] */
    /* JADX WARNING: Removed duplicated region for block: B:154:0x02eb A[ExcHandler: all (th java.lang.Throwable), Splitter:B:117:0x0269] */
    /* JADX WARNING: Removed duplicated region for block: B:159:0x02f3 A[SYNTHETIC, Splitter:B:159:0x02f3] */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x02f8 A[SYNTHETIC, Splitter:B:163:0x02f8] */
    /* JADX WARNING: Removed duplicated region for block: B:173:0x0301 A[SYNTHETIC, Splitter:B:173:0x0301] */
    /* JADX WARNING: Removed duplicated region for block: B:177:0x0306 A[SYNTHETIC, Splitter:B:177:0x0306] */
    /* JADX WARNING: Removed duplicated region for block: B:182:0x030c  */
    /* JADX WARNING: Removed duplicated region for block: B:192:0x0323  */
    /* JADX WARNING: Removed duplicated region for block: B:193:0x0325  */
    /* JADX WARNING: Removed duplicated region for block: B:195:0x0328  */
    /* JADX WARNING: Removed duplicated region for block: B:204:0x034b  */
    /* JADX WARNING: Removed duplicated region for block: B:230:0x03ab  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x014c  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x016b  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0191  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onActivityResult(int r13, int r14, android.content.Intent r15) {
        /*
            r12 = this;
            super.onActivityResult(r13, r14, r15)
            b.k.b.a.e.b r0 = r12.f7195i
            r1 = -1
            r2 = 0
            if (r0 == 0) goto L_0x0020
            r3 = 4281(0x10b9, float:5.999E-42)
            if (r13 != r3) goto L_0x0020
            if (r14 != r1) goto L_0x001d
            com.github.dhaval2404.imagepicker.ImagePickerActivity r3 = r0.a
            java.io.File r0 = r0.f2374b
            if (r0 == 0) goto L_0x0019
            r3.a(r0)
            goto L_0x0020
        L_0x0019:
            e.x.c.i.l()
            throw r2
        L_0x001d:
            r0.d()
        L_0x0020:
            b.k.b.a.e.f r0 = r12.f7194h
            java.lang.String r3 = "file"
            r4 = 0
            r5 = 1
            if (r0 == 0) goto L_0x0347
            r6 = 4261(0x10a5, float:5.971E-42)
            if (r13 != r6) goto L_0x0347
            if (r14 != r1) goto L_0x0344
            if (r15 == 0) goto L_0x0034
            android.net.Uri r2 = r15.getData()
        L_0x0034:
            if (r2 == 0) goto L_0x033d
            com.github.dhaval2404.imagepicker.ImagePickerActivity r15 = r0.a
            java.lang.String r1 = "context"
            e.x.c.i.f(r15, r1)
            java.lang.String r1 = "uri"
            e.x.c.i.f(r2, r1)
            e.t.o r1 = e.t.o.f7934h
            boolean r6 = android.provider.DocumentsContract.isDocumentUri(r15, r2)
            if (r6 == 0) goto L_0x0222
            java.lang.String r6 = r2.getAuthority()
            java.lang.String r7 = "com.android.externalstorage.documents"
            boolean r6 = e.x.c.i.a(r7, r6)
            java.lang.String r7 = "null cannot be cast to non-null type kotlin.Array<T>"
            java.lang.String r8 = "docId"
            java.lang.String r9 = ":"
            if (r6 == 0) goto L_0x0110
            java.lang.String r6 = android.provider.DocumentsContract.getDocumentId(r2)
            e.x.c.i.b(r6, r8)
            e.c0.d r8 = new e.c0.d
            r8.<init>(r9)
            java.util.List r8 = r8.c(r6, r4)
            boolean r10 = r8.isEmpty()
            if (r10 != 0) goto L_0x009a
            int r10 = r8.size()
            java.util.ListIterator r10 = r8.listIterator(r10)
        L_0x007a:
            boolean r11 = r10.hasPrevious()
            if (r11 == 0) goto L_0x009a
            java.lang.Object r11 = r10.previous()
            java.lang.String r11 = (java.lang.String) r11
            int r11 = r11.length()
            if (r11 != 0) goto L_0x008e
            r11 = r5
            goto L_0x008f
        L_0x008e:
            r11 = r4
        L_0x008f:
            if (r11 != 0) goto L_0x007a
            int r1 = r10.nextIndex()
            int r1 = r1 + r5
            java.util.List r1 = e.t.g.R(r8, r1)
        L_0x009a:
            java.lang.String[] r8 = new java.lang.String[r4]
            java.lang.Object[] r1 = r1.toArray(r8)
            if (r1 == 0) goto L_0x010a
            java.lang.String[] r1 = (java.lang.String[]) r1
            r7 = r1[r4]
            java.lang.String r8 = "primary"
            boolean r7 = e.c0.h.f(r8, r7, r5)
            java.lang.String r8 = "/"
            if (r7 == 0) goto L_0x00de
            int r6 = r1.length
            if (r6 <= r5) goto L_0x00c9
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.io.File r7 = android.os.Environment.getExternalStorageDirectory()
            java.lang.String r7 = r7.toString()
            r6.append(r7)
            r6.append(r8)
            r1 = r1[r5]
            goto L_0x0105
        L_0x00c9:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.io.File r5 = android.os.Environment.getExternalStorageDirectory()
            java.lang.String r5 = r5.toString()
            r1.append(r5)
            r1.append(r8)
            goto L_0x0165
        L_0x00de:
            java.lang.String r7 = "storage/"
            java.lang.StringBuilder r7 = b.e.a.a.a.y(r7)
            r10 = 4
            java.lang.String r6 = e.c0.h.w(r6, r9, r8, r4, r10)
            r7.append(r6)
            java.lang.String r6 = r7.toString()
            java.io.File r7 = new java.io.File
            r7.<init>(r6)
            boolean r7 = r7.exists()
            if (r7 == 0) goto L_0x00fd
            goto L_0x025b
        L_0x00fd:
            java.lang.String r6 = "/storage/sdcard/"
            java.lang.StringBuilder r6 = b.e.a.a.a.y(r6)
            r1 = r1[r5]
        L_0x0105:
            r6.append(r1)
            r1 = r6
            goto L_0x0165
        L_0x010a:
            e.o r13 = new e.o
            r13.<init>(r7)
            throw r13
        L_0x0110:
            java.lang.String r5 = r2.getAuthority()
            java.lang.String r6 = "com.android.providers.downloads.documents"
            boolean r5 = e.x.c.i.a(r6, r5)
            if (r5 == 0) goto L_0x0195
            java.lang.String r1 = "_display_name"
            java.lang.String[] r8 = new java.lang.String[]{r1}
            android.content.ContentResolver r6 = r15.getContentResolver()     // Catch:{ all -> 0x018d }
            r9 = 0
            r10 = 0
            r11 = 0
            r7 = r2
            android.database.Cursor r5 = r6.query(r7, r8, r9, r10, r11)     // Catch:{ all -> 0x018d }
            if (r5 == 0) goto L_0x0144
            boolean r6 = r5.moveToFirst()     // Catch:{ all -> 0x0142 }
            if (r6 == 0) goto L_0x0144
            int r1 = r5.getColumnIndexOrThrow(r1)     // Catch:{ all -> 0x0142 }
            java.lang.String r1 = r5.getString(r1)     // Catch:{ all -> 0x0142 }
            r5.close()
            goto L_0x014a
        L_0x0142:
            r13 = move-exception
            goto L_0x018f
        L_0x0144:
            if (r5 == 0) goto L_0x0149
            r5.close()
        L_0x0149:
            r1 = 0
        L_0x014a:
            if (r1 == 0) goto L_0x016b
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.io.File r6 = android.os.Environment.getExternalStorageDirectory()
            java.lang.String r6 = r6.toString()
            r5.append(r6)
            java.lang.String r6 = "/Download/"
            r5.append(r6)
            r5.append(r1)
            r1 = r5
        L_0x0165:
            java.lang.String r6 = r1.toString()
            goto L_0x025b
        L_0x016b:
            java.lang.String r1 = android.provider.DocumentsContract.getDocumentId(r2)
            java.lang.String r5 = "content://downloads/public_downloads"
            android.net.Uri r5 = android.net.Uri.parse(r5)
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            java.lang.String r6 = "java.lang.Long.valueOf(id)"
            e.x.c.i.b(r1, r6)
            long r6 = r1.longValue()
            android.net.Uri r1 = android.content.ContentUris.withAppendedId(r5, r6)
            r5 = 0
            java.lang.String r6 = b.k.b.a.f.c.a(r15, r1, r5, r5)
            goto L_0x025b
        L_0x018d:
            r13 = move-exception
            r5 = 0
        L_0x018f:
            if (r5 == 0) goto L_0x0194
            r5.close()
        L_0x0194:
            throw r13
        L_0x0195:
            java.lang.String r5 = r2.getAuthority()
            java.lang.String r6 = "com.android.providers.media.documents"
            boolean r5 = e.x.c.i.a(r6, r5)
            if (r5 == 0) goto L_0x025a
            java.lang.String r5 = android.provider.DocumentsContract.getDocumentId(r2)
            e.x.c.i.b(r5, r8)
            e.c0.d r6 = new e.c0.d
            r6.<init>(r9)
            java.util.List r5 = r6.c(r5, r4)
            boolean r6 = r5.isEmpty()
            if (r6 != 0) goto L_0x01e0
            int r6 = r5.size()
            java.util.ListIterator r6 = r5.listIterator(r6)
        L_0x01bf:
            boolean r8 = r6.hasPrevious()
            if (r8 == 0) goto L_0x01e0
            java.lang.Object r8 = r6.previous()
            java.lang.String r8 = (java.lang.String) r8
            int r8 = r8.length()
            if (r8 != 0) goto L_0x01d3
            r8 = 1
            goto L_0x01d4
        L_0x01d3:
            r8 = r4
        L_0x01d4:
            if (r8 != 0) goto L_0x01bf
            int r1 = r6.nextIndex()
            int r1 = r1 + 1
            java.util.List r1 = e.t.g.R(r5, r1)
        L_0x01e0:
            java.lang.String[] r5 = new java.lang.String[r4]
            java.lang.Object[] r1 = r1.toArray(r5)
            if (r1 == 0) goto L_0x021c
            java.lang.String[] r1 = (java.lang.String[]) r1
            r5 = r1[r4]
            java.lang.String r6 = "image"
            boolean r6 = e.x.c.i.a(r6, r5)
            if (r6 == 0) goto L_0x01f7
            android.net.Uri r5 = android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI
            goto L_0x020e
        L_0x01f7:
            java.lang.String r6 = "video"
            boolean r6 = e.x.c.i.a(r6, r5)
            if (r6 == 0) goto L_0x0202
            android.net.Uri r5 = android.provider.MediaStore.Video.Media.EXTERNAL_CONTENT_URI
            goto L_0x020e
        L_0x0202:
            java.lang.String r6 = "audio"
            boolean r5 = e.x.c.i.a(r6, r5)
            if (r5 == 0) goto L_0x020d
            android.net.Uri r5 = android.provider.MediaStore.Audio.Media.EXTERNAL_CONTENT_URI
            goto L_0x020e
        L_0x020d:
            r5 = 0
        L_0x020e:
            r6 = 1
            java.lang.String[] r7 = new java.lang.String[r6]
            r1 = r1[r6]
            r7[r4] = r1
            java.lang.String r1 = "_id=?"
            java.lang.String r6 = b.k.b.a.f.c.a(r15, r5, r1, r7)
            goto L_0x025b
        L_0x021c:
            e.o r13 = new e.o
            r13.<init>(r7)
            throw r13
        L_0x0222:
            java.lang.String r1 = r2.getScheme()
            if (r1 == 0) goto L_0x0338
            java.lang.String r5 = "content"
            r6 = 1
            boolean r1 = e.c0.h.f(r5, r1, r6)
            if (r1 == 0) goto L_0x0248
            java.lang.String r1 = r2.getAuthority()
            java.lang.String r5 = "com.google.android.apps.photos.content"
            boolean r1 = e.x.c.i.a(r5, r1)
            if (r1 == 0) goto L_0x0242
            java.lang.String r6 = r2.getLastPathSegment()
            goto L_0x025b
        L_0x0242:
            r1 = 0
            java.lang.String r6 = b.k.b.a.f.c.a(r15, r2, r1, r1)
            goto L_0x025b
        L_0x0248:
            java.lang.String r1 = r2.getScheme()
            if (r1 == 0) goto L_0x0333
            r5 = 1
            boolean r1 = e.c0.h.f(r3, r1, r5)
            if (r1 == 0) goto L_0x025a
            java.lang.String r6 = r2.getPath()
            goto L_0x025b
        L_0x025a:
            r6 = 0
        L_0x025b:
            if (r6 != 0) goto L_0x031a
            java.lang.String r1 = b.k.b.a.f.c.b(r2)     // Catch:{ IOException -> 0x02fc, all -> 0x02ed }
            android.content.ContentResolver r5 = r15.getContentResolver()     // Catch:{ IOException -> 0x02fc, all -> 0x02ed }
            java.io.InputStream r2 = r5.openInputStream(r2)     // Catch:{ IOException -> 0x02fc, all -> 0x02ed }
            java.io.File r15 = r15.getCacheDir()     // Catch:{ IOException -> 0x02fd, all -> 0x02eb }
            if (r1 == 0) goto L_0x0270
            goto L_0x0272
        L_0x0270:
            java.lang.String r1 = ".jpg"
        L_0x0272:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x02c2, all -> 0x02eb }
            r5.<init>()     // Catch:{ IOException -> 0x02c2, all -> 0x02eb }
            java.lang.String r6 = "IMG_"
            r5.append(r6)     // Catch:{ IOException -> 0x02c2, all -> 0x02eb }
            java.text.SimpleDateFormat r6 = new java.text.SimpleDateFormat     // Catch:{ IOException -> 0x02c2, all -> 0x02eb }
            java.util.Locale r7 = java.util.Locale.getDefault()     // Catch:{ IOException -> 0x02c2, all -> 0x02eb }
            java.lang.String r8 = "yyyyMMdd_HHmmssSSS"
            r6.<init>(r8, r7)     // Catch:{ IOException -> 0x02c2, all -> 0x02eb }
            java.util.Date r7 = new java.util.Date     // Catch:{ IOException -> 0x02c2, all -> 0x02eb }
            r7.<init>()     // Catch:{ IOException -> 0x02c2, all -> 0x02eb }
            java.lang.String r6 = r6.format(r7)     // Catch:{ IOException -> 0x02c2, all -> 0x02eb }
            java.lang.String r7 = "SimpleDateFormat(timeFor…Default()).format(Date())"
            e.x.c.i.b(r6, r7)     // Catch:{ IOException -> 0x02c2, all -> 0x02eb }
            r5.append(r6)     // Catch:{ IOException -> 0x02c2, all -> 0x02eb }
            r5.append(r1)     // Catch:{ IOException -> 0x02c2, all -> 0x02eb }
            java.lang.String r1 = r5.toString()     // Catch:{ IOException -> 0x02c2, all -> 0x02eb }
            if (r15 == 0) goto L_0x02a2
            goto L_0x02b0
        L_0x02a2:
            java.lang.String r15 = android.os.Environment.DIRECTORY_DCIM     // Catch:{ IOException -> 0x02c2, all -> 0x02eb }
            java.io.File r15 = android.os.Environment.getExternalStoragePublicDirectory(r15)     // Catch:{ IOException -> 0x02c2, all -> 0x02eb }
            java.io.File r5 = new java.io.File     // Catch:{ IOException -> 0x02c2, all -> 0x02eb }
            java.lang.String r6 = "Camera"
            r5.<init>(r15, r6)     // Catch:{ IOException -> 0x02c2, all -> 0x02eb }
            r15 = r5
        L_0x02b0:
            boolean r5 = r15.exists()     // Catch:{ IOException -> 0x02c2, all -> 0x02eb }
            if (r5 != 0) goto L_0x02b9
            r15.mkdirs()     // Catch:{ IOException -> 0x02c2, all -> 0x02eb }
        L_0x02b9:
            java.io.File r5 = new java.io.File     // Catch:{ IOException -> 0x02c2, all -> 0x02eb }
            r5.<init>(r15, r1)     // Catch:{ IOException -> 0x02c2, all -> 0x02eb }
            r5.createNewFile()     // Catch:{ IOException -> 0x02c2, all -> 0x02eb }
            goto L_0x02c7
        L_0x02c2:
            r15 = move-exception
            r15.printStackTrace()     // Catch:{ IOException -> 0x02fd, all -> 0x02eb }
            r5 = 0
        L_0x02c7:
            if (r5 != 0) goto L_0x02cf
            if (r2 == 0) goto L_0x0318
            r2.close()     // Catch:{ IOException -> 0x0318 }
            goto L_0x0318
        L_0x02cf:
            java.io.FileOutputStream r15 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x02e9, all -> 0x02eb }
            r15.<init>(r5)     // Catch:{ IOException -> 0x02e9, all -> 0x02eb }
            if (r2 == 0) goto L_0x02df
            r1 = 4096(0x1000, float:5.74E-42)
            b.q.a.a.O(r2, r15, r1)     // Catch:{ IOException -> 0x02ff, all -> 0x02dd }
            r1 = 1
            goto L_0x02e0
        L_0x02dd:
            r13 = move-exception
            goto L_0x02f1
        L_0x02df:
            r1 = r4
        L_0x02e0:
            if (r2 == 0) goto L_0x02e5
            r2.close()     // Catch:{ IOException -> 0x02e5 }
        L_0x02e5:
            r15.close()     // Catch:{ IOException -> 0x0309 }
            goto L_0x030a
        L_0x02e9:
            r15 = 0
            goto L_0x02ff
        L_0x02eb:
            r13 = move-exception
            goto L_0x02f0
        L_0x02ed:
            r13 = move-exception
            r14 = 0
            r2 = r14
        L_0x02f0:
            r15 = 0
        L_0x02f1:
            if (r2 == 0) goto L_0x02f6
            r2.close()     // Catch:{ IOException -> 0x02f6 }
        L_0x02f6:
            if (r15 == 0) goto L_0x02fb
            r15.close()     // Catch:{ IOException -> 0x02fb }
        L_0x02fb:
            throw r13
        L_0x02fc:
            r2 = 0
        L_0x02fd:
            r15 = 0
            r5 = 0
        L_0x02ff:
            if (r2 == 0) goto L_0x0304
            r2.close()     // Catch:{ IOException -> 0x0304 }
        L_0x0304:
            if (r15 == 0) goto L_0x0309
            r15.close()     // Catch:{ IOException -> 0x0309 }
        L_0x0309:
            r1 = r4
        L_0x030a:
            if (r1 == 0) goto L_0x0318
            if (r5 == 0) goto L_0x0313
            java.lang.String r15 = r5.getPath()
            goto L_0x0319
        L_0x0313:
            e.x.c.i.l()
            r13 = 0
            throw r13
        L_0x0318:
            r15 = 0
        L_0x0319:
            r6 = r15
        L_0x031a:
            if (r6 == 0) goto L_0x0325
            int r15 = r6.length()
            if (r15 != 0) goto L_0x0323
            goto L_0x0325
        L_0x0323:
            r15 = r4
            goto L_0x0326
        L_0x0325:
            r15 = 1
        L_0x0326:
            if (r15 != 0) goto L_0x033d
            com.github.dhaval2404.imagepicker.ImagePickerActivity r15 = r0.a
            java.io.File r0 = new java.io.File
            r0.<init>(r6)
            r15.a(r0)
            goto L_0x0347
        L_0x0333:
            e.x.c.i.l()
            r13 = 0
            throw r13
        L_0x0338:
            r13 = 0
            e.x.c.i.l()
            throw r13
        L_0x033d:
            r15 = 2131755090(0x7f100052, float:1.914105E38)
            r0.b(r15)
            goto L_0x0347
        L_0x0344:
            r0.d()
        L_0x0347:
            b.k.b.a.e.e r15 = r12.f7196j
            if (r15 == 0) goto L_0x03ab
            java.util.Objects.requireNonNull(r15)
            r0 = 69
            if (r13 != r0) goto L_0x03aa
            r13 = -1
            if (r14 != r13) goto L_0x03a7
            java.io.File r13 = r15.f2380g
            if (r13 == 0) goto L_0x03a0
            com.github.dhaval2404.imagepicker.ImagePickerActivity r14 = r15.a
            java.util.Objects.requireNonNull(r14)
            e.x.c.i.f(r13, r3)
            r14.f7199m = r13
            b.k.b.a.e.b r15 = r14.f7195i
            if (r15 == 0) goto L_0x0371
            java.io.File r15 = r14.f7198l
            if (r15 == 0) goto L_0x036e
            r15.delete()
        L_0x036e:
            r15 = 0
            r14.f7198l = r15
        L_0x0371:
            b.k.b.a.e.d r15 = r14.f7197k
            java.lang.String r0 = "mCompressionProvider"
            if (r15 == 0) goto L_0x039b
            boolean r15 = r15.f(r13)
            if (r15 == 0) goto L_0x0397
            b.k.b.a.e.d r14 = r14.f7197k
            if (r14 == 0) goto L_0x0392
            e.x.c.i.f(r13, r3)
            b.k.b.a.e.c r15 = new b.k.b.a.e.c
            r15.<init>(r14)
            r14 = 1
            java.io.File[] r14 = new java.io.File[r14]
            r14[r4] = r13
            r15.execute(r14)
            goto L_0x03aa
        L_0x0392:
            e.x.c.i.m(r0)
            r13 = 0
            throw r13
        L_0x0397:
            r14.b(r13)
            goto L_0x03aa
        L_0x039b:
            r13 = 0
            e.x.c.i.m(r0)
            throw r13
        L_0x03a0:
            r13 = 2131755093(0x7f100055, float:1.9141056E38)
            r15.b(r13)
            goto L_0x03aa
        L_0x03a7:
            r15.d()
        L_0x03aa:
            return
        L_0x03ab:
            java.lang.String r13 = "mCropProvider"
            e.x.c.i.m(r13)
            r13 = 0
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.dhaval2404.imagepicker.ImagePickerActivity.onActivityResult(int, int, android.content.Intent):void");
    }

    public void onBackPressed() {
        c();
    }

    public void onCreate(Bundle bundle) {
        b bVar;
        super.onCreate(bundle);
        if (bundle != null) {
            this.f7198l = (File) bundle.getSerializable("state.image_file");
        }
        e eVar = new e(this);
        this.f7196j = eVar;
        Serializable serializable = null;
        eVar.f2380g = (File) (bundle != null ? bundle.getSerializable("state.crop_file") : null);
        this.f7197k = new d(this);
        Intent intent = getIntent();
        a aVar = (a) (intent != null ? intent.getSerializableExtra("extra.image_provider") : null);
        if (aVar != null) {
            int ordinal = aVar.ordinal();
            boolean z = true;
            if (ordinal == 0) {
                f fVar = new f(this);
                this.f7194h = fVar;
                if (bundle == null) {
                    String[] strArr = f.c;
                    i.f(fVar, BasePayload.CONTEXT_KEY);
                    i.f(strArr, "permissions");
                    ArrayList arrayList = new ArrayList();
                    for (String str : strArr) {
                        if (ContextCompat.checkSelfPermission(fVar, str) == 0) {
                            arrayList.add(str);
                        }
                    }
                    if (arrayList.size() != strArr.length) {
                        z = false;
                    }
                    if (!z) {
                        ActivityCompat.requestPermissions(fVar.a, strArr, 4262);
                        return;
                    } else {
                        fVar.e();
                        return;
                    }
                } else {
                    return;
                }
            } else if (ordinal == 1) {
                b bVar2 = new b(this);
                this.f7195i = bVar2;
                if (bundle != null) {
                    serializable = bundle.getSerializable("state.camera_file");
                }
                bVar2.f2374b = (File) serializable;
                if (bundle != null || (bVar = this.f7195i) == null) {
                    return;
                }
                if (bVar.e(bVar)) {
                    bVar.f();
                    return;
                } else if (bVar.c) {
                    ActivityCompat.requestPermissions(bVar.a, b.f, 4282);
                    return;
                } else {
                    ActivityCompat.requestPermissions(bVar.a, b.f2373e, 4282);
                    return;
                }
            }
        }
        Log.e("image_picker", "Image provider can not be null");
        String string = getString(R.string.error_task_cancelled);
        i.b(string, "getString(R.string.error_task_cancelled)");
        i.f(string, "message");
        Intent intent2 = new Intent();
        intent2.putExtra("extra.error", string);
        setResult(64, intent2);
        finish();
    }

    public void onRequestPermissionsResult(int i2, String[] strArr, int[] iArr) {
        i.f(strArr, "permissions");
        i.f(iArr, "grantResults");
        super.onRequestPermissionsResult(i2, strArr, iArr);
        b bVar = this.f7195i;
        if (bVar != null && i2 == 4282) {
            if (bVar.e(bVar)) {
                bVar.f();
            } else {
                String string = bVar.getString(bVar.c ? R.string.permission_camera_extended_denied : R.string.permission_camera_denied);
                i.b(string, "getString(errorRes)");
                bVar.c(string);
            }
        }
        f fVar = this.f7194h;
        if (fVar != null && i2 == 4262) {
            String[] strArr2 = f.c;
            i.f(fVar, BasePayload.CONTEXT_KEY);
            i.f(strArr2, "permissions");
            ArrayList arrayList = new ArrayList();
            int length = strArr2.length;
            boolean z = false;
            int i3 = 0;
            while (true) {
                boolean z2 = true;
                if (i3 >= length) {
                    break;
                }
                String str = strArr2[i3];
                if (ContextCompat.checkSelfPermission(fVar, str) != 0) {
                    z2 = false;
                }
                if (z2) {
                    arrayList.add(str);
                }
                i3++;
            }
            if (arrayList.size() == strArr2.length) {
                z = true;
            }
            if (z) {
                fVar.e();
                return;
            }
            String string2 = fVar.getString(R.string.permission_gallery_denied);
            i.b(string2, "getString(R.string.permission_gallery_denied)");
            fVar.c(string2);
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
        i.f(bundle, "outState");
        bundle.putSerializable("state.image_file", this.f7198l);
        b bVar = this.f7195i;
        if (bVar != null) {
            i.f(bundle, "outState");
            bundle.putSerializable("state.camera_file", bVar.f2374b);
        }
        e eVar = this.f7196j;
        if (eVar != null) {
            Objects.requireNonNull(eVar);
            i.f(bundle, "outState");
            bundle.putSerializable("state.crop_file", eVar.f2380g);
            super.onSaveInstanceState(bundle);
            return;
        }
        i.m("mCropProvider");
        throw null;
    }
}
