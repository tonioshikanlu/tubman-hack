package b.k.b.a.e;

import android.content.Context;
import android.content.Intent;
import android.os.Environment;
import androidx.core.content.ContextCompat;
import androidx.core.content.FileProvider;
import app.bravostudio.A01F175WZXYVE9FWM81EKWKN6FN.R;
import com.segment.analytics.integrations.BasePayload;
import e.x.c.i;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;

public final class b extends a {

    /* renamed from: e  reason: collision with root package name */
    public static final String[] f2373e = {"android.permission.WRITE_EXTERNAL_STORAGE"};
    public static final String[] f = {"android.permission.WRITE_EXTERNAL_STORAGE", "android.permission.CAMERA"};

    /* renamed from: b  reason: collision with root package name */
    public File f2374b;
    public final boolean c;
    public File d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0059  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0069  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public b(com.github.dhaval2404.imagepicker.ImagePickerActivity r8) {
        /*
            r7 = this;
            java.lang.String r0 = "activity"
            e.x.c.i.f(r8, r0)
            r7.<init>(r8)
            java.lang.String r0 = "context"
            e.x.c.i.f(r7, r0)
            java.lang.String r0 = "android.permission.CAMERA"
            java.lang.String r1 = "permission"
            e.x.c.i.f(r0, r1)
            android.content.pm.PackageManager r1 = r7.getPackageManager()
            java.lang.String r2 = r7.getPackageName()
            r3 = 4096(0x1000, float:5.74E-42)
            android.content.pm.PackageInfo r1 = r1.getPackageInfo(r2, r3)
            java.lang.String[] r1 = r1.requestedPermissions
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L_0x0033
            int r4 = r1.length
            if (r4 != 0) goto L_0x002d
            r4 = r2
            goto L_0x002e
        L_0x002d:
            r4 = r3
        L_0x002e:
            if (r4 == 0) goto L_0x0031
            goto L_0x0033
        L_0x0031:
            r4 = r3
            goto L_0x0034
        L_0x0033:
            r4 = r2
        L_0x0034:
            if (r4 == 0) goto L_0x0037
            goto L_0x0047
        L_0x0037:
            int r4 = r1.length
            r5 = r3
        L_0x0039:
            if (r5 >= r4) goto L_0x0047
            r6 = r1[r5]
            boolean r6 = e.x.c.i.a(r6, r0)
            if (r6 == 0) goto L_0x0044
            goto L_0x0048
        L_0x0044:
            int r5 = r5 + 1
            goto L_0x0039
        L_0x0047:
            r2 = r3
        L_0x0048:
            r7.c = r2
            android.content.Intent r8 = r8.getIntent()
            java.lang.String r0 = "activity.intent"
            e.x.c.i.b(r8, r0)
            android.os.Bundle r8 = r8.getExtras()
            if (r8 == 0) goto L_0x0069
            java.lang.String r0 = "extra.save_directory"
            java.lang.String r8 = r8.getString(r0)
            if (r8 == 0) goto L_0x0068
            java.io.File r0 = new java.io.File
            r0.<init>(r8)
            r7.d = r0
        L_0x0068:
            return
        L_0x0069:
            e.x.c.i.l()
            r8 = 0
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: b.k.b.a.e.b.<init>(com.github.dhaval2404.imagepicker.ImagePickerActivity):void");
    }

    public void a() {
        File file = this.f2374b;
        if (file != null) {
            file.delete();
        }
    }

    public final boolean e(Context context) {
        if (this.c) {
            String[] strArr = f;
            i.f(context, BasePayload.CONTEXT_KEY);
            i.f(strArr, "permissions");
            ArrayList arrayList = new ArrayList();
            for (String str : strArr) {
                if (ContextCompat.checkSelfPermission(context, str) == 0) {
                    arrayList.add(str);
                }
            }
            if (arrayList.size() == strArr.length) {
                return true;
            }
        }
        if (!this.c) {
            String[] strArr2 = f2373e;
            i.f(context, BasePayload.CONTEXT_KEY);
            i.f(strArr2, "permissions");
            ArrayList arrayList2 = new ArrayList();
            for (String str2 : strArr2) {
                if (ContextCompat.checkSelfPermission(context, str2) == 0) {
                    arrayList2.add(str2);
                }
            }
            if (arrayList2.size() == strArr2.length) {
                return true;
            }
        }
        return false;
    }

    public final void f() {
        File file;
        File file2 = this.d;
        try {
            StringBuilder sb = new StringBuilder();
            sb.append("IMG_");
            String format = new SimpleDateFormat("yyyyMMdd_HHmmssSSS", Locale.getDefault()).format(new Date());
            i.b(format, "SimpleDateFormat(timeFor…Default()).format(Date())");
            sb.append(format);
            sb.append(".jpg");
            String sb2 = sb.toString();
            if (file2 == null) {
                file2 = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DCIM), "Camera");
            }
            if (!file2.exists()) {
                file2.mkdirs();
            }
            file = new File(file2, sb2);
            file.createNewFile();
        } catch (IOException e2) {
            e2.printStackTrace();
            file = null;
        }
        this.f2374b = file;
        if (file == null || !file.exists()) {
            b(R.string.error_failed_to_create_camera_image_file);
            return;
        }
        i.f(this, BasePayload.CONTEXT_KEY);
        i.f(file, "file");
        Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
        intent.putExtra("output", FileProvider.getUriForFile(this, getPackageName() + getString(R.string.image_picker_provider_authority_suffix), file));
        this.a.startActivityForResult(intent, 4281);
    }
}
