package b.k.b.a.e;

import android.content.Intent;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import androidx.appcompat.widget.ActivityChooserModel;
import com.github.dhaval2404.imagepicker.ImagePickerActivity;
import e.x.c.i;
import java.io.File;

public final class d extends a {

    /* renamed from: b  reason: collision with root package name */
    public final int f2375b;
    public final int c;
    public final long d;

    /* renamed from: e  reason: collision with root package name */
    public File f2376e;

    static {
        Class<d> cls = d.class;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d(ImagePickerActivity imagePickerActivity) {
        super(imagePickerActivity);
        i.f(imagePickerActivity, ActivityChooserModel.ATTRIBUTE_ACTIVITY);
        Intent intent = imagePickerActivity.getIntent();
        i.b(intent, "activity.intent");
        Bundle extras = intent.getExtras();
        if (extras != null) {
            this.f2375b = extras.getInt("extra.max_width", 0);
            this.c = extras.getInt("extra.max_height", 0);
            this.d = extras.getLong("extra.image_max_size", 0);
            String string = extras.getString("extra.save_directory");
            if (string != null) {
                this.f2376e = new File(string);
                return;
            }
            return;
        }
        i.l();
        throw null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00f9, code lost:
        if (r3 != false) goto L_0x00fb;
     */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00f2  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0113  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0144 A[Catch:{ IOException -> 0x0165 }] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0145 A[Catch:{ IOException -> 0x0165 }] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0159 A[Catch:{ IOException -> 0x0165 }] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x016c  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x01bc  */
    /* JADX WARNING: Removed duplicated region for block: B:62:? A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.io.File e(java.io.File r12, int r13) {
        /*
            r11 = this;
            r0 = 15
            int[][] r0 = new int[r0][]
            r1 = 2
            int[] r2 = new int[r1]
            r2 = {2448, 3264} // fill-array
            r3 = 0
            r0[r3] = r2
            int[] r2 = new int[r1]
            r2 = {2008, 3032} // fill-array
            r4 = 1
            r0[r4] = r2
            int[] r2 = new int[r1]
            r2 = {1944, 2580} // fill-array
            r0[r1] = r2
            int[] r2 = new int[r1]
            r2 = {1680, 2240} // fill-array
            r5 = 3
            r0[r5] = r2
            int[] r2 = new int[r1]
            r2 = {1536, 2048} // fill-array
            r5 = 4
            r0[r5] = r2
            int[] r2 = new int[r1]
            r2 = {1200, 1600} // fill-array
            r5 = 5
            r0[r5] = r2
            int[] r2 = new int[r1]
            r2 = {1024, 1392} // fill-array
            r5 = 6
            r0[r5] = r2
            int[] r2 = new int[r1]
            r2 = {960, 1280} // fill-array
            r6 = 7
            r0[r6] = r2
            int[] r2 = new int[r1]
            r2 = {768, 1024} // fill-array
            r6 = 8
            r0[r6] = r2
            int[] r2 = new int[r1]
            r2 = {600, 800} // fill-array
            r6 = 9
            r0[r6] = r2
            int[] r2 = new int[r1]
            r2 = {480, 640} // fill-array
            r6 = 10
            r0[r6] = r2
            int[] r2 = new int[r1]
            r2 = {240, 320} // fill-array
            r6 = 11
            r0[r6] = r2
            int[] r2 = new int[r1]
            r2 = {120, 160} // fill-array
            r6 = 12
            r0[r6] = r2
            int[] r2 = new int[r1]
            r2 = {60, 80} // fill-array
            r6 = 13
            r0[r6] = r2
            int[] r2 = new int[r1]
            r2 = {30, 40} // fill-array
            r6 = 14
            r0[r6] = r2
            java.util.List r0 = e.t.g.B(r0)
            int r2 = r0.size()
            r6 = 0
            if (r13 < r2) goto L_0x008f
            return r6
        L_0x008f:
            java.lang.Object r13 = r0.get(r13)
            int[] r13 = (int[]) r13
            r0 = r13[r3]
            r13 = r13[r4]
            int r2 = r11.f2375b
            if (r2 <= 0) goto L_0x00a7
            int r7 = r11.c
            if (r7 <= 0) goto L_0x00a7
            if (r0 > r2) goto L_0x00a5
            if (r13 <= r7) goto L_0x00a7
        L_0x00a5:
            r0 = r2
            r13 = r7
        L_0x00a7:
            android.graphics.Bitmap$CompressFormat r2 = android.graphics.Bitmap.CompressFormat.JPEG
            java.lang.String r7 = r12.getAbsolutePath()
            java.lang.String r8 = "file.absolutePath"
            e.x.c.i.b(r7, r8)
            java.lang.String r8 = ".png"
            boolean r1 = e.c0.h.e(r7, r8, r3, r1)
            if (r1 == 0) goto L_0x00bc
            android.graphics.Bitmap$CompressFormat r2 = android.graphics.Bitmap.CompressFormat.PNG
        L_0x00bc:
            r1 = 100
            java.lang.String r7 = "file"
            e.x.c.i.f(r12, r7)
            android.net.Uri r7 = android.net.Uri.fromFile(r12)
            java.lang.String r8 = "Uri.fromFile(file)"
            e.x.c.i.b(r7, r8)
            java.lang.String r8 = "."
            java.lang.String r9 = "uriImage"
            e.x.c.i.f(r7, r9)
            java.lang.String r7 = r7.getPath()     // Catch:{ Exception -> 0x00ef }
            if (r7 == 0) goto L_0x00ef
            int r9 = e.c0.h.p(r7, r8, r3, r3, r5)     // Catch:{ Exception -> 0x00ef }
            r10 = -1
            if (r9 == r10) goto L_0x00ef
            int r5 = e.c0.h.p(r7, r8, r3, r3, r5)     // Catch:{ Exception -> 0x00ef }
            int r5 = r5 + r4
            java.lang.String r5 = r7.substring(r5)     // Catch:{ Exception -> 0x00ef }
            java.lang.String r7 = "(this as java.lang.String).substring(startIndex)"
            e.x.c.i.b(r5, r7)     // Catch:{ Exception -> 0x00ef }
            goto L_0x00f0
        L_0x00ef:
            r5 = r6
        L_0x00f0:
            if (r5 == 0) goto L_0x00fb
            int r7 = r5.length()
            if (r7 != 0) goto L_0x00f9
            r3 = r4
        L_0x00f9:
            if (r3 == 0) goto L_0x00fd
        L_0x00fb:
            java.lang.String r5 = "jpg"
        L_0x00fd:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r4 = 46
            r3.append(r4)
            r3.append(r5)
            java.lang.String r3 = r3.toString()
            java.io.File r4 = r11.f2376e
            if (r3 == 0) goto L_0x0113
            goto L_0x0115
        L_0x0113:
            java.lang.String r3 = ".jpg"
        L_0x0115:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0165 }
            r5.<init>()     // Catch:{ IOException -> 0x0165 }
            java.lang.String r7 = "IMG_"
            r5.append(r7)     // Catch:{ IOException -> 0x0165 }
            java.text.SimpleDateFormat r7 = new java.text.SimpleDateFormat     // Catch:{ IOException -> 0x0165 }
            java.util.Locale r8 = java.util.Locale.getDefault()     // Catch:{ IOException -> 0x0165 }
            java.lang.String r9 = "yyyyMMdd_HHmmssSSS"
            r7.<init>(r9, r8)     // Catch:{ IOException -> 0x0165 }
            java.util.Date r8 = new java.util.Date     // Catch:{ IOException -> 0x0165 }
            r8.<init>()     // Catch:{ IOException -> 0x0165 }
            java.lang.String r7 = r7.format(r8)     // Catch:{ IOException -> 0x0165 }
            java.lang.String r8 = "SimpleDateFormat(timeFor…Default()).format(Date())"
            e.x.c.i.b(r7, r8)     // Catch:{ IOException -> 0x0165 }
            r5.append(r7)     // Catch:{ IOException -> 0x0165 }
            r5.append(r3)     // Catch:{ IOException -> 0x0165 }
            java.lang.String r3 = r5.toString()     // Catch:{ IOException -> 0x0165 }
            if (r4 == 0) goto L_0x0145
            goto L_0x0153
        L_0x0145:
            java.lang.String r4 = android.os.Environment.DIRECTORY_DCIM     // Catch:{ IOException -> 0x0165 }
            java.io.File r4 = android.os.Environment.getExternalStoragePublicDirectory(r4)     // Catch:{ IOException -> 0x0165 }
            java.io.File r5 = new java.io.File     // Catch:{ IOException -> 0x0165 }
            java.lang.String r7 = "Camera"
            r5.<init>(r4, r7)     // Catch:{ IOException -> 0x0165 }
            r4 = r5
        L_0x0153:
            boolean r5 = r4.exists()     // Catch:{ IOException -> 0x0165 }
            if (r5 != 0) goto L_0x015c
            r4.mkdirs()     // Catch:{ IOException -> 0x0165 }
        L_0x015c:
            java.io.File r5 = new java.io.File     // Catch:{ IOException -> 0x0165 }
            r5.<init>(r4, r3)     // Catch:{ IOException -> 0x0165 }
            r5.createNewFile()     // Catch:{ IOException -> 0x0165 }
            goto L_0x016a
        L_0x0165:
            r3 = move-exception
            r3.printStackTrace()
            r5 = r6
        L_0x016a:
            if (r5 == 0) goto L_0x01c3
            float r0 = (float) r0
            float r13 = (float) r13
            java.lang.String r3 = r5.getAbsolutePath()
            java.lang.String r4 = "compressFile.absolutePath"
            e.x.c.i.b(r3, r4)
            java.lang.String r4 = "imageFile"
            e.x.c.i.f(r12, r4)
            java.lang.String r4 = "compressFormat"
            e.x.c.i.f(r2, r4)
            java.lang.String r4 = "destinationPath"
            e.x.c.i.f(r3, r4)
            java.io.File r4 = new java.io.File
            r4.<init>(r3)
            java.io.File r4 = r4.getParentFile()
            boolean r5 = r4.exists()
            if (r5 != 0) goto L_0x0198
            r4.mkdirs()
        L_0x0198:
            java.io.FileOutputStream r4 = new java.io.FileOutputStream     // Catch:{ all -> 0x01b9 }
            r4.<init>(r3)     // Catch:{ all -> 0x01b9 }
            android.graphics.Bitmap r12 = b.k.b.a.f.e.a(r12, r0, r13)     // Catch:{ all -> 0x01b6 }
            if (r12 == 0) goto L_0x01b2
            r12.compress(r2, r1, r4)     // Catch:{ all -> 0x01b6 }
            r4.flush()
            r4.close()
            java.io.File r6 = new java.io.File
            r6.<init>(r3)
            goto L_0x01c3
        L_0x01b2:
            e.x.c.i.l()     // Catch:{ all -> 0x01b6 }
            throw r6
        L_0x01b6:
            r12 = move-exception
            r6 = r4
            goto L_0x01ba
        L_0x01b9:
            r12 = move-exception
        L_0x01ba:
            if (r6 == 0) goto L_0x01c2
            r6.flush()
            r6.close()
        L_0x01c2:
            throw r12
        L_0x01c3:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: b.k.b.a.e.d.e(java.io.File, int):java.io.File");
    }

    public final boolean f(File file) {
        i.f(file, "file");
        boolean z = ((this.d > 0 ? 1 : (this.d == 0 ? 0 : -1)) > 0) && file.length() - this.d > 0;
        if (z || this.f2375b <= 0 || this.c <= 0) {
            return z;
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(file.getAbsolutePath(), options);
        int[] iArr = {options.outWidth, options.outHeight};
        if (iArr[0] > this.f2375b || iArr[1] > this.c) {
            return true;
        }
        return false;
    }
}
