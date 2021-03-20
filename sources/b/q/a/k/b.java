package b.q.a.k;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.AsyncTask;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import b.q.a.j.c;
import b.q.a.m.c;
import com.yalantis.ucrop.UCropActivity;
import java.io.IOException;
import java.util.Objects;

public class b extends AsyncTask<Void, Void, a> {
    public final Context a;

    /* renamed from: b  reason: collision with root package name */
    public Uri f6808b;
    public Uri c;
    public final int d;

    /* renamed from: e  reason: collision with root package name */
    public final int f6809e;
    public final b.q.a.i.b f;

    public static class a {
        public Bitmap a;

        /* renamed from: b  reason: collision with root package name */
        public c f6810b;
        public Exception c;

        public a(@NonNull Bitmap bitmap, @NonNull c cVar) {
            this.a = bitmap;
            this.f6810b = cVar;
        }

        public a(@NonNull Exception exc) {
            this.c = exc;
        }
    }

    public b(@NonNull Context context, @NonNull Uri uri, @Nullable Uri uri2, int i2, int i3, b.q.a.i.b bVar) {
        this.a = context;
        this.f6808b = uri;
        this.c = uri2;
        this.d = i2;
        this.f6809e = i3;
        this.f = bVar;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:12|13|14|15|16|18) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x0039 */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0052 A[SYNTHETIC, Splitter:B:28:0x0052] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0057 A[SYNTHETIC, Splitter:B:32:0x0057] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(@androidx.annotation.NonNull android.net.Uri r4, @androidx.annotation.Nullable android.net.Uri r5) {
        /*
            r3 = this;
            java.lang.String r0 = "BitmapWorkerTask"
            java.lang.String r1 = "copyFile"
            android.util.Log.d(r0, r1)
            java.lang.String r0 = "Output Uri is null - cannot copy image"
            java.util.Objects.requireNonNull(r5, r0)
            r0 = 0
            android.content.Context r1 = r3.a     // Catch:{ all -> 0x004e }
            android.content.ContentResolver r1 = r1.getContentResolver()     // Catch:{ all -> 0x004e }
            java.io.InputStream r4 = r1.openInputStream(r4)     // Catch:{ all -> 0x004e }
            java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch:{ all -> 0x004c }
            java.io.File r2 = new java.io.File     // Catch:{ all -> 0x004c }
            java.lang.String r5 = r5.getPath()     // Catch:{ all -> 0x004c }
            r2.<init>(r5)     // Catch:{ all -> 0x004c }
            r1.<init>(r2)     // Catch:{ all -> 0x004c }
            if (r4 == 0) goto L_0x0044
            r5 = 1024(0x400, float:1.435E-42)
            byte[] r5 = new byte[r5]     // Catch:{ all -> 0x0041 }
        L_0x002b:
            int r0 = r4.read(r5)     // Catch:{ all -> 0x0041 }
            if (r0 <= 0) goto L_0x0036
            r2 = 0
            r1.write(r5, r2, r0)     // Catch:{ all -> 0x0041 }
            goto L_0x002b
        L_0x0036:
            r1.close()     // Catch:{ IOException -> 0x0039 }
        L_0x0039:
            r4.close()     // Catch:{ IOException -> 0x003c }
        L_0x003c:
            android.net.Uri r4 = r3.c
            r3.f6808b = r4
            return
        L_0x0041:
            r5 = move-exception
            r0 = r1
            goto L_0x0050
        L_0x0044:
            java.lang.NullPointerException r5 = new java.lang.NullPointerException     // Catch:{ all -> 0x0041 }
            java.lang.String r0 = "InputStream for given input Uri is null"
            r5.<init>(r0)     // Catch:{ all -> 0x0041 }
            throw r5     // Catch:{ all -> 0x0041 }
        L_0x004c:
            r5 = move-exception
            goto L_0x0050
        L_0x004e:
            r5 = move-exception
            r4 = r0
        L_0x0050:
            if (r0 == 0) goto L_0x0055
            r0.close()     // Catch:{ IOException -> 0x0055 }
        L_0x0055:
            if (r4 == 0) goto L_0x005a
            r4.close()     // Catch:{ IOException -> 0x005a }
        L_0x005a:
            android.net.Uri r4 = r3.c
            r3.f6808b = r4
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: b.q.a.k.b.a(android.net.Uri, android.net.Uri):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: o.g} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v0, resolved type: o.r} */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x005a */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0063 A[SYNTHETIC, Splitter:B:21:0x0063] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x008b A[SYNTHETIC, Splitter:B:38:0x008b] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0090 A[SYNTHETIC, Splitter:B:42:0x0090] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b(@androidx.annotation.NonNull android.net.Uri r7, @androidx.annotation.Nullable android.net.Uri r8) {
        /*
            r6 = this;
            java.lang.String r0 = "BitmapWorkerTask"
            java.lang.String r1 = "downloadFile"
            android.util.Log.d(r0, r1)
            java.lang.String r0 = "Output Uri is null - cannot download image"
            java.util.Objects.requireNonNull(r8, r0)
            n.c0 r0 = new n.c0
            n.c0$a r1 = new n.c0$a
            r1.<init>()
            r0.<init>(r1)
            r1 = 0
            n.e0$a r2 = new n.e0$a     // Catch:{ all -> 0x0085 }
            r2.<init>()     // Catch:{ all -> 0x0085 }
            java.lang.String r7 = r7.toString()     // Catch:{ all -> 0x0085 }
            r2.g(r7)     // Catch:{ all -> 0x0085 }
            n.e0 r7 = r2.b()     // Catch:{ all -> 0x0085 }
            n.f r7 = r0.a(r7)     // Catch:{ all -> 0x0085 }
            n.m0.g.e r7 = (n.m0.g.e) r7
            n.h0 r7 = r7.h()     // Catch:{ all -> 0x0085 }
            n.j0 r2 = r7.f10106n     // Catch:{ all -> 0x0081 }
            o.g r2 = r2.q()     // Catch:{ all -> 0x0081 }
            android.content.Context r3 = r6.a     // Catch:{ all -> 0x007b }
            android.content.ContentResolver r3 = r3.getContentResolver()     // Catch:{ all -> 0x007b }
            java.io.OutputStream r8 = r3.openOutputStream(r8)     // Catch:{ all -> 0x007b }
            if (r8 == 0) goto L_0x0073
            java.util.logging.Logger r3 = o.p.a     // Catch:{ all -> 0x007b }
            java.lang.String r3 = "$this$sink"
            e.x.c.i.e(r8, r3)     // Catch:{ all -> 0x007b }
            o.r r3 = new o.r     // Catch:{ all -> 0x007b }
            o.a0 r4 = new o.a0     // Catch:{ all -> 0x007b }
            r4.<init>()     // Catch:{ all -> 0x007b }
            r3.<init>(r8, r4)     // Catch:{ all -> 0x007b }
            r2.V(r3)     // Catch:{ all -> 0x0070 }
            r2.close()     // Catch:{ IOException -> 0x005a }
        L_0x005a:
            java.io.OutputStream r8 = r3.f10480h     // Catch:{ IOException -> 0x005f }
            r8.close()     // Catch:{ IOException -> 0x005f }
        L_0x005f:
            n.j0 r7 = r7.f10106n
            if (r7 == 0) goto L_0x0066
            r7.close()     // Catch:{ IOException -> 0x0066 }
        L_0x0066:
            n.r r7 = r0.f10050h
            r7.a()
            android.net.Uri r7 = r6.c
            r6.f6808b = r7
            return
        L_0x0070:
            r8 = move-exception
            r1 = r3
            goto L_0x007c
        L_0x0073:
            java.lang.NullPointerException r8 = new java.lang.NullPointerException     // Catch:{ all -> 0x007b }
            java.lang.String r3 = "OutputStream for given output Uri is null"
            r8.<init>(r3)     // Catch:{ all -> 0x007b }
            throw r8     // Catch:{ all -> 0x007b }
        L_0x007b:
            r8 = move-exception
        L_0x007c:
            r5 = r2
            r2 = r7
            r7 = r1
            r1 = r5
            goto L_0x0089
        L_0x0081:
            r8 = move-exception
            r2 = r7
            r7 = r1
            goto L_0x0089
        L_0x0085:
            r7 = move-exception
            r8 = r7
            r7 = r1
            r2 = r7
        L_0x0089:
            if (r1 == 0) goto L_0x008e
            r1.close()     // Catch:{ IOException -> 0x008e }
        L_0x008e:
            if (r7 == 0) goto L_0x0095
            java.io.OutputStream r7 = r7.f10480h     // Catch:{ IOException -> 0x0095 }
            r7.close()     // Catch:{ IOException -> 0x0095 }
        L_0x0095:
            if (r2 == 0) goto L_0x009e
            n.j0 r7 = r2.f10106n
            if (r7 == 0) goto L_0x009e
            r7.close()     // Catch:{ IOException -> 0x009e }
        L_0x009e:
            n.r r7 = r0.f10050h
            r7.a()
            android.net.Uri r7 = r6.c
            r6.f6808b = r7
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: b.q.a.k.b.b(android.net.Uri, android.net.Uri):void");
    }

    public final void c() {
        String scheme = this.f6808b.getScheme();
        Log.d("BitmapWorkerTask", "Uri scheme: " + scheme);
        if ("http".equals(scheme) || "https".equals(scheme)) {
            try {
                b(this.f6808b, this.c);
            } catch (IOException | NullPointerException e2) {
                Log.e("BitmapWorkerTask", "Downloading failed", e2);
                throw e2;
            }
        } else if ("content".equals(scheme)) {
            try {
                a(this.f6808b, this.c);
            } catch (IOException | NullPointerException e3) {
                Log.e("BitmapWorkerTask", "Copying failed", e3);
                throw e3;
            }
        } else if (!"file".equals(scheme)) {
            Log.e("BitmapWorkerTask", "Invalid Uri scheme " + scheme);
            throw new IllegalArgumentException(b.e.a.a.a.m("Invalid Uri scheme", scheme));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:104:?, code lost:
        return new b.q.a.k.b.a(new java.lang.IllegalArgumentException(r2.toString(), r0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0094, code lost:
        r7 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0095, code lost:
        if (r9 != null) goto L_0x0097;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:?, code lost:
        r9.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x009b, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x009c, code lost:
        android.util.Log.e("BitmapWorkerTask", "doInBackground: ImageDecoder.createSource: ", r0);
        r2 = b.e.a.a.a.y("Bitmap could not be decoded from the Uri: [");
        r2.append(r14.f6808b);
        r2.append("]");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00bd, code lost:
        r5 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00be, code lost:
        android.util.Log.e("BitmapWorkerTask", "doInBackground: BitmapFactory.decodeFileDescriptor: ", r5);
        r1.inSampleSize *= 2;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:40:0x009a */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00bd A[ExcHandler: OutOfMemoryError (r5v3 'e' java.lang.OutOfMemoryError A[CUSTOM_DECLARE]), PHI: r12 
      PHI: (r12v5 android.graphics.Bitmap) = (r12v1 android.graphics.Bitmap), (r12v6 android.graphics.Bitmap), (r12v6 android.graphics.Bitmap), (r12v6 android.graphics.Bitmap), (r12v6 android.graphics.Bitmap), (r12v7 android.graphics.Bitmap), (r12v7 android.graphics.Bitmap), (r12v7 android.graphics.Bitmap), (r12v7 android.graphics.Bitmap) binds: [B:17:0x004c, B:40:0x009a, B:41:?, B:38:0x0097, B:39:?, B:32:0x008e, B:33:?, B:25:0x0067, B:26:?] A[DONT_GENERATE, DONT_INLINE], Splitter:B:17:0x004c] */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x011d  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x011f  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0122  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0125  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x013f  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0145  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x0151  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0175  */
    @androidx.annotation.NonNull
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object doInBackground(java.lang.Object[] r15) {
        /*
            r14 = this;
            java.lang.Void[] r15 = (java.lang.Void[]) r15
            java.lang.String r15 = "BitmapWorkerTask"
            java.lang.String r0 = "BitmapLoadUtils"
            android.net.Uri r1 = r14.f6808b
            if (r1 != 0) goto L_0x0018
            b.q.a.k.b$a r15 = new b.q.a.k.b$a
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Input Uri cannot be null"
            r0.<init>(r1)
            r15.<init>(r0)
            goto L_0x0188
        L_0x0018:
            r14.c()     // Catch:{ NullPointerException -> 0x0181, IOException -> 0x017f }
            android.graphics.BitmapFactory$Options r1 = new android.graphics.BitmapFactory$Options
            r1.<init>()
            r2 = 1
            r1.inJustDecodeBounds = r2
            int r3 = r14.d
            int r4 = r14.f6809e
            int r5 = r1.outHeight
            int r6 = r1.outWidth
            if (r5 > r4) goto L_0x0032
            if (r6 <= r3) goto L_0x0030
            goto L_0x0032
        L_0x0030:
            r7 = r2
            goto L_0x003d
        L_0x0032:
            r7 = r2
        L_0x0033:
            int r8 = r5 / r7
            if (r8 > r4) goto L_0x017b
            int r8 = r6 / r7
            if (r8 <= r3) goto L_0x003d
            goto L_0x017b
        L_0x003d:
            r1.inSampleSize = r7
            r3 = 0
            r1.inJustDecodeBounds = r3
            r4 = 0
            r12 = r4
        L_0x0044:
            java.lang.String r5 = "Bitmap could not be decoded from the Uri: ["
            java.lang.String r6 = "]"
            r7 = -1
            r8 = 2
            if (r3 != 0) goto L_0x00ca
            android.content.Context r9 = r14.a     // Catch:{ OutOfMemoryError -> 0x00bd, IOException -> 0x009b }
            android.content.ContentResolver r9 = r9.getContentResolver()     // Catch:{ OutOfMemoryError -> 0x00bd, IOException -> 0x009b }
            android.net.Uri r10 = r14.f6808b     // Catch:{ OutOfMemoryError -> 0x00bd, IOException -> 0x009b }
            java.io.InputStream r9 = r9.openInputStream(r10)     // Catch:{ OutOfMemoryError -> 0x00bd, IOException -> 0x009b }
            android.graphics.Bitmap r12 = android.graphics.BitmapFactory.decodeStream(r9, r4, r1)     // Catch:{ all -> 0x0094 }
            int r10 = r1.outWidth     // Catch:{ all -> 0x0094 }
            if (r10 == r7) goto L_0x006c
            int r10 = r1.outHeight     // Catch:{ all -> 0x0094 }
            if (r10 != r7) goto L_0x0065
            goto L_0x006c
        L_0x0065:
            if (r9 == 0) goto L_0x006a
            r9.close()     // Catch:{ IOException -> 0x006a, OutOfMemoryError -> 0x00bd }
        L_0x006a:
            r3 = r2
            goto L_0x0044
        L_0x006c:
            b.q.a.k.b$a r7 = new b.q.a.k.b$a     // Catch:{ all -> 0x0094 }
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x0094 }
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ all -> 0x0094 }
            r11.<init>()     // Catch:{ all -> 0x0094 }
            java.lang.String r13 = "Bounds for bitmap could not be retrieved from the Uri: ["
            r11.append(r13)     // Catch:{ all -> 0x0094 }
            android.net.Uri r13 = r14.f6808b     // Catch:{ all -> 0x0094 }
            r11.append(r13)     // Catch:{ all -> 0x0094 }
            r11.append(r6)     // Catch:{ all -> 0x0094 }
            java.lang.String r11 = r11.toString()     // Catch:{ all -> 0x0094 }
            r10.<init>(r11)     // Catch:{ all -> 0x0094 }
            r7.<init>(r10)     // Catch:{ all -> 0x0094 }
            if (r9 == 0) goto L_0x0091
            r9.close()     // Catch:{ IOException -> 0x0091, OutOfMemoryError -> 0x00bd }
        L_0x0091:
            r15 = r7
            goto L_0x0188
        L_0x0094:
            r7 = move-exception
            if (r9 == 0) goto L_0x009a
            r9.close()     // Catch:{ IOException -> 0x009a, OutOfMemoryError -> 0x00bd }
        L_0x009a:
            throw r7     // Catch:{ OutOfMemoryError -> 0x00bd, IOException -> 0x009b }
        L_0x009b:
            r0 = move-exception
            java.lang.String r1 = "doInBackground: ImageDecoder.createSource: "
            android.util.Log.e(r15, r1, r0)
            b.q.a.k.b$a r15 = new b.q.a.k.b$a
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = b.e.a.a.a.y(r5)
            android.net.Uri r3 = r14.f6808b
            r2.append(r3)
            r2.append(r6)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2, r0)
            r15.<init>(r1)
            goto L_0x0188
        L_0x00bd:
            r5 = move-exception
            java.lang.String r6 = "doInBackground: BitmapFactory.decodeFileDescriptor: "
            android.util.Log.e(r15, r6, r5)
            int r5 = r1.inSampleSize
            int r5 = r5 * r8
            r1.inSampleSize = r5
            goto L_0x0044
        L_0x00ca:
            if (r12 != 0) goto L_0x00e8
            b.q.a.k.b$a r15 = new b.q.a.k.b$a
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = b.e.a.a.a.y(r5)
            android.net.Uri r2 = r14.f6808b
            r1.append(r2)
            r1.append(r6)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            r15.<init>(r0)
            goto L_0x0188
        L_0x00e8:
            android.content.Context r15 = r14.a
            android.net.Uri r1 = r14.f6808b
            android.content.ContentResolver r15 = r15.getContentResolver()     // Catch:{ IOException -> 0x0104 }
            java.io.InputStream r15 = r15.openInputStream(r1)     // Catch:{ IOException -> 0x0104 }
            if (r15 != 0) goto L_0x00f7
            goto L_0x0119
        L_0x00f7:
            b.q.a.l.b r3 = new b.q.a.l.b     // Catch:{ IOException -> 0x0104 }
            r3.<init>(r15)     // Catch:{ IOException -> 0x0104 }
            int r1 = r3.a()     // Catch:{ IOException -> 0x0104 }
            r15.close()     // Catch:{ IOException -> 0x011a }
            goto L_0x011a
        L_0x0104:
            r15 = move-exception
            java.lang.String r3 = "getExifOrientation: "
            java.lang.StringBuilder r3 = b.e.a.a.a.y(r3)
            java.lang.String r1 = r1.toString()
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            android.util.Log.e(r0, r1, r15)
        L_0x0119:
            r1 = 0
        L_0x011a:
            switch(r1) {
                case 3: goto L_0x0125;
                case 4: goto L_0x0125;
                case 5: goto L_0x0122;
                case 6: goto L_0x0122;
                case 7: goto L_0x011f;
                case 8: goto L_0x011f;
                default: goto L_0x011d;
            }
        L_0x011d:
            r15 = 0
            goto L_0x0127
        L_0x011f:
            r15 = 270(0x10e, float:3.78E-43)
            goto L_0x0127
        L_0x0122:
            r15 = 90
            goto L_0x0127
        L_0x0125:
            r15 = 180(0xb4, float:2.52E-43)
        L_0x0127:
            if (r1 == r8) goto L_0x0133
            r3 = 7
            if (r1 == r3) goto L_0x0133
            r3 = 4
            if (r1 == r3) goto L_0x0133
            r3 = 5
            if (r1 == r3) goto L_0x0133
            r7 = r2
        L_0x0133:
            b.q.a.j.c r3 = new b.q.a.j.c
            r3.<init>(r1, r15, r7)
            android.graphics.Matrix r10 = new android.graphics.Matrix
            r10.<init>()
            if (r15 == 0) goto L_0x0143
            float r15 = (float) r15
            r10.preRotate(r15)
        L_0x0143:
            if (r7 == r2) goto L_0x014b
            float r15 = (float) r7
            r1 = 1065353216(0x3f800000, float:1.0)
            r10.postScale(r15, r1)
        L_0x014b:
            boolean r15 = r10.isIdentity()
            if (r15 != 0) goto L_0x0175
            b.q.a.k.b$a r15 = new b.q.a.k.b$a
            r6 = 0
            r7 = 0
            int r8 = r12.getWidth()     // Catch:{ OutOfMemoryError -> 0x016b }
            int r9 = r12.getHeight()     // Catch:{ OutOfMemoryError -> 0x016b }
            r11 = 1
            r5 = r12
            android.graphics.Bitmap r1 = android.graphics.Bitmap.createBitmap(r5, r6, r7, r8, r9, r10, r11)     // Catch:{ OutOfMemoryError -> 0x016b }
            boolean r0 = r12.sameAs(r1)     // Catch:{ OutOfMemoryError -> 0x016b }
            if (r0 != 0) goto L_0x0171
            r12 = r1
            goto L_0x0171
        L_0x016b:
            r1 = move-exception
            java.lang.String r2 = "transformBitmap: "
            android.util.Log.e(r0, r2, r1)
        L_0x0171:
            r15.<init>(r12, r3)
            goto L_0x0188
        L_0x0175:
            b.q.a.k.b$a r15 = new b.q.a.k.b$a
            r15.<init>(r12, r3)
            goto L_0x0188
        L_0x017b:
            int r7 = r7 * 2
            goto L_0x0033
        L_0x017f:
            r15 = move-exception
            goto L_0x0182
        L_0x0181:
            r15 = move-exception
        L_0x0182:
            b.q.a.k.b$a r0 = new b.q.a.k.b$a
            r0.<init>(r15)
            r15 = r0
        L_0x0188:
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: b.q.a.k.b.doInBackground(java.lang.Object[]):java.lang.Object");
    }

    public void onPostExecute(@NonNull Object obj) {
        a aVar = (a) obj;
        Exception exc = aVar.c;
        if (exc == null) {
            b.q.a.i.b bVar = this.f;
            Bitmap bitmap = aVar.a;
            c cVar = aVar.f6810b;
            String path = this.f6808b.getPath();
            Uri uri = this.c;
            String path2 = uri == null ? null : uri.getPath();
            b.q.a.m.c cVar2 = ((b.q.a.m.b) bVar).a;
            cVar2.t = path;
            cVar2.u = path2;
            cVar2.v = cVar;
            cVar2.f6846q = true;
            cVar2.setImageBitmap(bitmap);
            return;
        }
        b.q.a.m.b bVar2 = (b.q.a.m.b) this.f;
        Objects.requireNonNull(bVar2);
        Log.e("TransformImageView", "onFailure: setImageUri", exc);
        c.a aVar2 = bVar2.a.f6843n;
        if (aVar2 != null) {
            UCropActivity.a aVar3 = (UCropActivity.a) aVar2;
            UCropActivity.this.b(exc);
            UCropActivity.this.finish();
        }
    }
}
