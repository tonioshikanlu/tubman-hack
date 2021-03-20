package com.androidbuffer.kotlinfilepicker;

import android.content.ClipData;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.ActivityChooserModel;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import app.bravostudio.A01F175WZXYVE9FWM81EKWKN6FN.R;
import b.f.a.b;
import b.f.a.c;
import b.q.a.a;
import e.a0.d;
import e.a0.e;
import e.t.u;
import e.x.c.i;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b<\u0010\bJ\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\bJ/\u0010\u0010\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t2\u000e\u0010\r\u001a\n\u0012\u0006\b\u0001\u0012\u00020\f0\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J)\u0010\u0015\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\t2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0017\u0010\bJ\u0017\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\fH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ+\u0010\"\u001a\u00020\u00042\u001a\u0010!\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u001f0\u001ej\n\u0012\u0006\u0012\u0004\u0018\u00010\u001f` H\u0002¢\u0006\u0004\b\"\u0010#J-\u0010$\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u001f0\u001ej\n\u0012\u0006\u0012\u0004\u0018\u00010\u001f` 2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0013H\u0002¢\u0006\u0004\b$\u0010%R\u0016\u0010(\u001a\u00020\t8\u0002@\u0002XD¢\u0006\u0006\n\u0004\b&\u0010'R\u0018\u0010+\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u0016\u0010-\u001a\u00020\t8\u0002@\u0002XD¢\u0006\u0006\n\u0004\b,\u0010'R\u001e\u00101\u001a\n .*\u0004\u0018\u00010\f0\f8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0016\u00105\u001a\u0002028\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b3\u00104R\u0016\u00107\u001a\u00020\t8\u0002@\u0002XD¢\u0006\u0006\n\u0004\b6\u0010'R\u0016\u00109\u001a\u00020\t8\u0002@\u0002XD¢\u0006\u0006\n\u0004\b8\u0010'R\u0016\u0010;\u001a\u00020\t8\u0002@\u0002XD¢\u0006\u0006\n\u0004\b:\u0010'¨\u0006="}, d2 = {"Lcom/androidbuffer/kotlinfilepicker/KotlinFilePicker;", "Landroidx/appcompat/app/AppCompatActivity;", "Landroid/os/Bundle;", "savedInstanceState", "Le/r;", "onCreate", "(Landroid/os/Bundle;)V", "onStart", "()V", "", "requestCode", "", "", "permissions", "", "grantResults", "onRequestPermissionsResult", "(I[Ljava/lang/String;[I)V", "resultCode", "Landroid/content/Intent;", "data", "onActivityResult", "(IILandroid/content/Intent;)V", "onBackPressed", "intent", "c", "(Landroid/content/Intent;)V", "msg", "d", "(Ljava/lang/String;)V", "Ljava/util/ArrayList;", "Landroid/net/Uri;", "Lkotlin/collections/ArrayList;", "uri", "a", "(Ljava/util/ArrayList;)V", "b", "(Landroid/content/Intent;)Ljava/util/ArrayList;", "i", "I", "REQUEST_MEDIA_CAPTURE", "n", "Landroid/content/Intent;", "intentPick", "m", "PERMISSION_REQUEST_STORAGE", "kotlin.jvm.PlatformType", "h", "Ljava/lang/String;", "TAG", "", "o", "Z", "isPermissionDenied", "j", "REQUEST_MEDIA_FILE", "k", "REQUEST_MEDIA_GALLERY", "l", "REQUEST_MEDIA_VIDEO", "<init>", "kotlinfilepicker_release"}, k = 1, mv = {1, 1, 15})
public final class KotlinFilePicker extends AppCompatActivity {

    /* renamed from: h  reason: collision with root package name */
    public final String f6900h = KotlinFilePicker.class.getCanonicalName();

    /* renamed from: i  reason: collision with root package name */
    public final int f6901i = 101;

    /* renamed from: j  reason: collision with root package name */
    public final int f6902j = 102;

    /* renamed from: k  reason: collision with root package name */
    public final int f6903k = 103;

    /* renamed from: l  reason: collision with root package name */
    public final int f6904l = 104;

    /* renamed from: m  reason: collision with root package name */
    public final int f6905m = 100;

    /* renamed from: n  reason: collision with root package name */
    public Intent f6906n;

    /* renamed from: o  reason: collision with root package name */
    public boolean f6907o;

    /* JADX WARNING: Removed duplicated region for block: B:39:0x0100  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0102  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0105  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(java.util.ArrayList<android.net.Uri> r14) {
        /*
            r13 = this;
            android.content.Intent r0 = new android.content.Intent
            r0.<init>()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r14 = r14.iterator()
        L_0x000e:
            boolean r2 = r14.hasNext()
            if (r2 == 0) goto L_0x015e
            java.lang.Object r2 = r14.next()
            r4 = r2
            android.net.Uri r4 = (android.net.Uri) r4
            if (r4 == 0) goto L_0x0159
            java.lang.String r2 = "item!!"
            e.x.c.i.b(r4, r2)
            java.lang.String r2 = "context"
            e.x.c.i.f(r13, r2)
            java.lang.String r2 = "uri"
            e.x.c.i.f(r4, r2)
            java.io.File r2 = new java.io.File     // Catch:{ CursorIndexOutOfBoundsException -> 0x0052, NullPointerException -> 0x0044, NumberFormatException -> 0x0036 }
            java.lang.String r3 = b.f.a.d.b(r13, r4)     // Catch:{ CursorIndexOutOfBoundsException -> 0x0052, NullPointerException -> 0x0044, NumberFormatException -> 0x0036 }
            r2.<init>(r3)     // Catch:{ CursorIndexOutOfBoundsException -> 0x0052, NullPointerException -> 0x0044, NumberFormatException -> 0x0036 }
            goto L_0x005f
        L_0x0036:
            r2 = move-exception
            r2.printStackTrace()
            java.io.File r2 = new java.io.File
            java.lang.String r3 = r4.getPath()
            r2.<init>(r3)
            goto L_0x005f
        L_0x0044:
            r2 = move-exception
            r2.printStackTrace()
            java.io.File r2 = new java.io.File
            java.lang.String r3 = r4.getPath()
            r2.<init>(r3)
            goto L_0x005f
        L_0x0052:
            r2 = move-exception
            r2.printStackTrace()
            java.io.File r2 = new java.io.File
            java.lang.String r3 = r4.getPath()
            r2.<init>(r3)
        L_0x005f:
            r3 = 1
            java.lang.Object[] r5 = new java.lang.Object[r3]
            long r6 = r2.length()
            r8 = 1024(0x400, float:1.435E-42)
            long r8 = (long) r8
            long r6 = r6 / r8
            java.lang.Long r6 = java.lang.Long.valueOf(r6)
            r7 = 0
            r5[r7] = r6
            java.lang.Object[] r5 = java.util.Arrays.copyOf(r5, r3)
            java.lang.String r6 = "%1d KB"
            java.lang.String r6 = java.lang.String.format(r6, r5)
            java.lang.String r5 = "java.lang.String.format(format, *args)"
            e.x.c.i.b(r6, r5)
            java.lang.String r5 = r2.getName()
            java.lang.String r10 = r2.getPath()
            java.lang.String r8 = "fileLocation"
            e.x.c.i.b(r10, r8)
            java.lang.String r8 = "url"
            e.x.c.i.f(r10, r8)
            java.lang.String r8 = "passedUrl"
            e.x.c.i.f(r10, r8)
            boolean r8 = android.text.TextUtils.isEmpty(r10)
            if (r8 != 0) goto L_0x00f8
            r8 = 35
            r9 = 6
            int r8 = e.c0.h.o(r10, r8, r7, r7, r9)
            java.lang.String r11 = "(this as java.lang.Strin…ing(startIndex, endIndex)"
            if (r8 <= 0) goto L_0x00b0
            java.lang.String r8 = r10.substring(r7, r8)
            e.x.c.i.b(r8, r11)
            goto L_0x00b1
        L_0x00b0:
            r8 = r10
        L_0x00b1:
            r12 = 63
            int r12 = e.c0.h.o(r8, r12, r7, r7, r9)
            if (r12 <= 0) goto L_0x00c0
            java.lang.String r8 = r8.substring(r7, r12)
            e.x.c.i.b(r8, r11)
        L_0x00c0:
            r11 = 47
            int r11 = e.c0.h.o(r8, r11, r7, r7, r9)
            java.lang.String r12 = "(this as java.lang.String).substring(startIndex)"
            if (r11 < 0) goto L_0x00d3
            int r11 = r11 + 1
            java.lang.String r8 = r8.substring(r11)
            e.x.c.i.b(r8, r12)
        L_0x00d3:
            int r11 = r8.length()
            if (r11 != 0) goto L_0x00db
            r11 = r3
            goto L_0x00dc
        L_0x00db:
            r11 = r7
        L_0x00dc:
            if (r11 != 0) goto L_0x00f8
            java.lang.String r11 = "[\\sa-zA-Z_0-9\\.\\-\\(\\)\\%]+"
            boolean r11 = java.util.regex.Pattern.matches(r11, r8)
            if (r11 == 0) goto L_0x00f8
            r11 = 46
            int r9 = e.c0.h.o(r8, r11, r7, r7, r9)
            if (r9 < 0) goto L_0x00f8
            int r9 = r9 + 1
            java.lang.String r8 = r8.substring(r9)
            e.x.c.i.b(r8, r12)
            goto L_0x00fa
        L_0x00f8:
            java.lang.String r8 = ""
        L_0x00fa:
            int r9 = r8.length()
            if (r9 != 0) goto L_0x0102
            r9 = r3
            goto L_0x0103
        L_0x0102:
            r9 = r7
        L_0x0103:
            if (r9 != 0) goto L_0x0129
            android.webkit.MimeTypeMap r9 = android.webkit.MimeTypeMap.getSingleton()
            java.lang.String r8 = r8.toLowerCase()
            java.lang.String r11 = "(this as java.lang.String).toLowerCase()"
            e.x.c.i.b(r8, r11)
            java.lang.String r8 = r9.getMimeTypeFromExtension(r8)
            if (r8 == 0) goto L_0x0120
            boolean r9 = e.c0.h.n(r8)
            if (r9 == 0) goto L_0x011f
            goto L_0x0120
        L_0x011f:
            r3 = r7
        L_0x0120:
            if (r3 == 0) goto L_0x0123
            goto L_0x0129
        L_0x0123:
            java.lang.String r3 = "type"
            e.x.c.i.b(r8, r3)
            goto L_0x012c
        L_0x0129:
            java.lang.String r3 = "*/*"
            r8 = r3
        L_0x012c:
            long r2 = r2.lastModified()
            java.text.SimpleDateFormat r7 = new java.text.SimpleDateFormat
            java.util.Locale r9 = java.util.Locale.getDefault()
            java.lang.String r11 = "dd/MM/yyyy"
            r7.<init>(r11, r9)
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            java.lang.String r9 = r7.format(r2)
            java.lang.String r2 = "simpleDate.format(date)"
            e.x.c.i.b(r9, r2)
            b.f.a.a r2 = new b.f.a.a
            r3 = r2
            r7 = r10
            r3.<init>(r4, r5, r6, r7, r8, r9)
            r1.add(r2)
            java.lang.String r2 = r13.f6900h
            android.util.Log.d(r2, r10)
            goto L_0x000e
        L_0x0159:
            e.x.c.i.l()
            r14 = 0
            throw r14
        L_0x015e:
            java.lang.String r14 = "extraFileResults"
            r0.putParcelableArrayListExtra(r14, r1)
            r14 = -1
            r13.setResult(r14, r0)
            r13.finish()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.androidbuffer.kotlinfilepicker.KotlinFilePicker.a(java.util.ArrayList):void");
    }

    public final ArrayList<Uri> b(Intent intent) {
        ArrayList<Uri> arrayList = new ArrayList<>();
        if ((intent != null ? intent.getData() : null) == null) {
            ClipData clipData = intent != null ? intent.getClipData() : null;
            Integer valueOf = clipData != null ? Integer.valueOf(clipData.getItemCount()) : null;
            if (valueOf != null) {
                d d = e.d(0, valueOf.intValue());
                ArrayList<ClipData.Item> arrayList2 = new ArrayList<>(a.C(d, 10));
                Iterator it = d.iterator();
                while (it.hasNext()) {
                    arrayList2.add(clipData.getItemAt(((u) it).nextInt()));
                }
                for (ClipData.Item item : arrayList2) {
                    i.b(item, "it");
                    arrayList.add(item.getUri());
                }
            } else {
                i.l();
                throw null;
            }
        } else {
            arrayList.add(intent.getData());
        }
        return arrayList;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:39:0x016a, code lost:
        r1 = getString(app.bravostudio.A01F175WZXYVE9FWM81EKWKN6FN.R.string.exception_msg_no_activity);
        e.x.c.i.b(r1, "getString(R.string.exception_msg_no_activity)");
        d(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0179, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x017e, code lost:
        startActivityForResult(r1, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x01b5, code lost:
        startActivityForResult(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c(android.content.Intent r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            java.lang.String r2 = "extraFileSelection"
            java.lang.String r2 = r1.getStringExtra(r2)
            java.lang.String r3 = "extraMultipleEnabled"
            r4 = 0
            boolean r3 = r1.getBooleanExtra(r3, r4)
            if (r2 != 0) goto L_0x0015
            goto L_0x01b9
        L_0x0015:
            int r4 = r2.hashCode()
            java.lang.String r5 = "android.intent.category.OPENABLE"
            java.lang.String r6 = "android.intent.extra.ALLOW_MULTIPLE"
            java.lang.String r7 = "android.intent.action.OPEN_DOCUMENT"
            java.lang.String r8 = "output"
            java.lang.String r9 = "FileProvider.getUriForFi…authority(context), file)"
            java.lang.String r10 = ".fileprovider"
            java.lang.String r11 = "SimpleDateFormat(\"ddMMyy…Default()).format(Date())"
            java.lang.String r12 = "ddMMyyyy_HHmmssSS"
            java.lang.String r13 = "context"
            java.lang.String r14 = "mimeType"
            java.lang.String r15 = "extraFileMimeType"
            r16 = r8
            r8 = 1
            switch(r4) {
                case 2189724: goto L_0x0182;
                case 82650203: goto L_0x00f0;
                case 1468337970: goto L_0x006c;
                case 2011082565: goto L_0x0037;
                default: goto L_0x0035;
            }
        L_0x0035:
            goto L_0x01b9
        L_0x0037:
            java.lang.String r4 = "Camera"
            boolean r2 = r2.equals(r4)
            if (r2 == 0) goto L_0x01b9
            boolean r2 = r1.hasExtra(r15)
            if (r2 == 0) goto L_0x004a
            java.lang.String r1 = r1.getStringExtra(r15)
            goto L_0x004c
        L_0x004a:
            java.lang.String r1 = "image/*"
        L_0x004c:
            e.x.c.i.b(r1, r14)
            e.x.c.i.f(r1, r14)
            android.content.Intent r2 = new android.content.Intent
            r2.<init>(r7)
            r4 = 64
            r2.addFlags(r4)
            r2.setType(r1)
            r2.putExtra(r6, r3)
            r2.addFlags(r8)
            r2.addCategory(r5)
            int r1 = r0.f6903k
            goto L_0x01b5
        L_0x006c:
            java.lang.String r1 = "Gallery"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x01b9
            e.x.c.i.f(r0, r13)
            android.content.Intent r1 = new android.content.Intent
            java.lang.String r2 = "android.media.action.IMAGE_CAPTURE"
            r1.<init>(r2)
            android.content.pm.PackageManager r2 = r17.getPackageManager()
            android.content.ComponentName r2 = r1.resolveActivity(r2)
            if (r2 != 0) goto L_0x008a
            r1 = 0
            goto L_0x00e6
        L_0x008a:
            java.lang.String r2 = "image_"
            java.lang.StringBuilder r2 = b.e.a.a.a.y(r2)
            java.text.SimpleDateFormat r3 = new java.text.SimpleDateFormat
            java.util.Locale r4 = java.util.Locale.getDefault()
            r3.<init>(r12, r4)
            java.util.Date r4 = new java.util.Date
            r4.<init>()
            java.lang.String r3 = r3.format(r4)
            e.x.c.i.b(r3, r11)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = android.os.Environment.DIRECTORY_PICTURES
            java.io.File r3 = r0.getExternalFilesDir(r3)
            if (r3 != 0) goto L_0x00b6
            r2 = 0
            goto L_0x00bc
        L_0x00b6:
            java.lang.String r4 = ".jpg"
            java.io.File r2 = java.io.File.createTempFile(r2, r4, r3)
        L_0x00bc:
            if (r2 == 0) goto L_0x00e2
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = r17.getPackageName()
            r3.append(r4)
            r3.append(r10)
            java.lang.String r3 = r3.toString()
            android.net.Uri r2 = androidx.core.content.FileProvider.getUriForFile(r0, r3, r2)
            e.x.c.i.b(r2, r9)
            r3 = 2
            r1.addFlags(r3)
            r4 = r16
            r1.putExtra(r4, r2)
            goto L_0x00e3
        L_0x00e2:
            r3 = 2
        L_0x00e3:
            r1.addFlags(r3)
        L_0x00e6:
            if (r1 != 0) goto L_0x00ea
            goto L_0x016a
        L_0x00ea:
            r0.f6906n = r1
            int r2 = r0.f6901i
            goto L_0x017e
        L_0x00f0:
            r4 = r16
            java.lang.String r1 = "Video"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x01b9
            e.x.c.i.f(r0, r13)
            android.content.Intent r1 = new android.content.Intent
            java.lang.String r2 = "android.media.action.VIDEO_CAPTURE"
            r1.<init>(r2)
            android.content.pm.PackageManager r2 = r17.getPackageManager()
            android.content.ComponentName r2 = r1.resolveActivity(r2)
            if (r2 != 0) goto L_0x0110
            r1 = 0
            goto L_0x0168
        L_0x0110:
            java.lang.String r2 = "video"
            java.lang.StringBuilder r2 = b.e.a.a.a.y(r2)
            java.text.SimpleDateFormat r3 = new java.text.SimpleDateFormat
            java.util.Locale r5 = java.util.Locale.getDefault()
            r3.<init>(r12, r5)
            java.util.Date r5 = new java.util.Date
            r5.<init>()
            java.lang.String r3 = r3.format(r5)
            e.x.c.i.b(r3, r11)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = android.os.Environment.DIRECTORY_MOVIES
            java.io.File r3 = r0.getExternalFilesDir(r3)
            if (r3 != 0) goto L_0x013c
            r2 = 0
            goto L_0x0142
        L_0x013c:
            java.lang.String r5 = ".mp4"
            java.io.File r2 = java.io.File.createTempFile(r2, r5, r3)
        L_0x0142:
            if (r2 == 0) goto L_0x0165
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r5 = r17.getPackageName()
            r3.append(r5)
            r3.append(r10)
            java.lang.String r3 = r3.toString()
            android.net.Uri r2 = androidx.core.content.FileProvider.getUriForFile(r0, r3, r2)
            e.x.c.i.b(r2, r9)
            r3 = 2
            r1.addFlags(r3)
            r1.putExtra(r4, r2)
        L_0x0165:
            r1.addFlags(r8)
        L_0x0168:
            if (r1 != 0) goto L_0x017a
        L_0x016a:
            r1 = 2131755098(0x7f10005a, float:1.9141066E38)
            java.lang.String r1 = r0.getString(r1)
            java.lang.String r2 = "getString(R.string.exception_msg_no_activity)"
            e.x.c.i.b(r1, r2)
            r0.d(r1)
            return
        L_0x017a:
            r0.f6906n = r1
            int r2 = r0.f6904l
        L_0x017e:
            r0.startActivityForResult(r1, r2)
            goto L_0x01c8
        L_0x0182:
            java.lang.String r4 = "File"
            boolean r2 = r2.equals(r4)
            if (r2 == 0) goto L_0x01b9
            boolean r2 = r1.hasExtra(r15)
            if (r2 == 0) goto L_0x0195
            java.lang.String r1 = r1.getStringExtra(r15)
            goto L_0x0197
        L_0x0195:
            java.lang.String r1 = "*/*"
        L_0x0197:
            e.x.c.i.b(r1, r14)
            e.x.c.i.f(r1, r14)
            android.content.Intent r2 = new android.content.Intent
            r2.<init>(r7)
            r4 = 64
            r2.addFlags(r4)
            r2.setType(r1)
            r2.putExtra(r6, r3)
            r2.addFlags(r8)
            r2.addCategory(r5)
            int r1 = r0.f6902j
        L_0x01b5:
            r0.startActivityForResult(r2, r1)
            goto L_0x01c8
        L_0x01b9:
            r1 = 2131755097(0x7f100059, float:1.9141064E38)
            java.lang.String r1 = r0.getString(r1)
            java.lang.String r2 = "getString(R.string.exception_msg_illegal_)"
            e.x.c.i.b(r1, r2)
            r0.d(r1)
        L_0x01c8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.androidbuffer.kotlinfilepicker.KotlinFilePicker.c(android.content.Intent):void");
    }

    public final void d(String str) {
        try {
            finish();
            throw new IllegalArgumentException(str);
        } catch (IllegalArgumentException e2) {
            e2.printStackTrace();
        }
    }

    public void onActivityResult(int i2, int i3, Intent intent) {
        ArrayList<Uri> arrayList;
        super.onActivityResult(i2, i3, intent);
        if (!(this.f6901i == i2 && i3 == -1)) {
            if ((this.f6902j == i2 && i3 == -1) || (this.f6903k == i2 && i3 == -1)) {
                arrayList = b(intent);
                a(arrayList);
            } else if (!(this.f6904l == i2 && i3 == -1)) {
                setResult(0, new Intent());
                finish();
                return;
            }
        }
        arrayList = b(this.f6906n);
        a(arrayList);
    }

    public void onBackPressed() {
        super.onBackPressed();
        setResult(0, new Intent());
        finish();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (ContextCompat.checkSelfPermission(this, "android.permission.WRITE_EXTERNAL_STORAGE") == 0) {
            Intent intent = getIntent();
            i.b(intent, "intent");
            c(intent);
            return;
        }
        ActivityCompat.requestPermissions(this, new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, this.f6905m);
    }

    public void onRequestPermissionsResult(int i2, String[] strArr, int[] iArr) {
        i.f(strArr, "permissions");
        i.f(iArr, "grantResults");
        super.onRequestPermissionsResult(i2, strArr, iArr);
        if (this.f6905m == i2) {
            for (int i3 : iArr) {
                if (i3 == -1) {
                    this.f6907o = true;
                    i.f(this, ActivityChooserModel.ATTRIBUTE_ACTIVITY);
                    AlertDialog.Builder builder = new AlertDialog.Builder(this);
                    builder.setPositiveButton((int) R.string.dialog_settings_button, (DialogInterface.OnClickListener) new b(this));
                    builder.setNegativeButton((int) R.string.dialog_finish_button, (DialogInterface.OnClickListener) new c(true, this));
                    builder.setMessage((int) R.string.dialog_permissions_message);
                    builder.setCancelable(false);
                    builder.create().show();
                    return;
                }
            }
            Intent intent = getIntent();
            i.b(intent, "intent");
            c(intent);
        }
    }

    public void onStart() {
        super.onStart();
        if (this.f6907o) {
            i.f(this, ActivityChooserModel.ATTRIBUTE_ACTIVITY);
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setPositiveButton((int) R.string.dialog_settings_button, (DialogInterface.OnClickListener) new b(this));
            builder.setNegativeButton((int) R.string.dialog_finish_button, (DialogInterface.OnClickListener) new c(true, this));
            builder.setMessage((int) R.string.dialog_permissions_message);
            builder.setCancelable(false);
            builder.create().show();
        }
    }
}
