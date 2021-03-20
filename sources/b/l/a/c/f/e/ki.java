package b.l.a.c.f.e;

import android.content.Intent;
import android.net.Uri;
import android.os.AsyncTask;
import android.text.TextUtils;
import android.util.Log;
import b.l.a.c.c.n.a;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.util.Objects;

public final class ki extends AsyncTask<Void, Void, ji> {
    public static final a f = new a("FirebaseAuth", "GetAuthDomainTask");
    public final String a;

    /* renamed from: b  reason: collision with root package name */
    public final String f3107b;
    public final WeakReference<li> c;
    public final Uri.Builder d;

    /* renamed from: e  reason: collision with root package name */
    public final String f3108e;

    public ki(String str, String str2, Intent intent, li liVar) {
        b.l.a.c.b.a.x(str);
        this.a = str;
        b.l.a.c.b.a.x(str2);
        Objects.requireNonNull(intent, "null reference");
        String stringExtra = intent.getStringExtra("com.google.firebase.auth.KEY_API_KEY");
        b.l.a.c.b.a.x(stringExtra);
        Uri.Builder buildUpon = Uri.parse(liVar.j(stringExtra)).buildUpon();
        Uri.Builder appendQueryParameter = buildUpon.appendPath("getProjectConfig").appendQueryParameter("key", stringExtra).appendQueryParameter("androidPackageName", str);
        Objects.requireNonNull(str2, "null reference");
        appendQueryParameter.appendQueryParameter("sha1Cert", str2);
        this.f3107b = buildUpon.build().toString();
        this.c = new WeakReference<>(liVar);
        this.d = liVar.l(intent, str, str2);
        this.f3108e = intent.getStringExtra("com.google.firebase.auth.KEY_CUSTOM_AUTH_DOMAIN");
    }

    public static byte[] a(InputStream inputStream, int i2) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            byte[] bArr = new byte[128];
            while (true) {
                int read = inputStream.read(bArr);
                if (read == -1) {
                    return byteArrayOutputStream.toByteArray();
                }
                byteArrayOutputStream.write(bArr, 0, read);
            }
        } finally {
            byteArrayOutputStream.close();
        }
    }

    /* renamed from: b */
    public final void onPostExecute(ji jiVar) {
        String str;
        Uri.Builder builder;
        li liVar = (li) this.c.get();
        String str2 = null;
        if (jiVar != null) {
            str2 = jiVar.a;
            str = jiVar.f3091b;
        } else {
            str = null;
        }
        if (liVar == null) {
            a aVar = f;
            Log.e(aVar.a, aVar.c("An error has occurred: the handler reference has returned null.", new Object[0]));
        } else if (TextUtils.isEmpty(str2) || (builder = this.d) == null) {
            liVar.n(this.a, b.l.a.c.b.a.T0(str));
        } else {
            builder.authority(str2);
            liVar.k(this.d.build(), this.a);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x007d, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
        r3 = f;
        r1 = java.lang.String.valueOf(r1);
        r5 = new java.lang.StringBuilder(r1.length() + 75);
        r5.append("Error parsing error message from response body in getErrorMessageFromBody. ");
        r5.append(r1);
        r3.e(r5.toString(), new java.lang.Object[0]);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0104, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0105, code lost:
        r2 = f;
        r1 = java.lang.String.valueOf(r1);
        r2.b(b.e.a.a.a.q(new java.lang.StringBuilder(r1.length() + 33), "ConversionException encountered: ", r1), new java.lang.Object[0]);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0122, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0123, code lost:
        r2 = f;
        r1 = java.lang.String.valueOf(r1);
        r2.b(b.e.a.a.a.q(new java.lang.StringBuilder(r1.length() + 26), "Null pointer encountered: ", r1), new java.lang.Object[0]);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:?, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:?, code lost:
        return null;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00e5 A[Catch:{ IOException -> 0x0140, NullPointerException -> 0x0122, vg -> 0x0104 }] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0104 A[ExcHandler: vg (r1v6 'e' b.l.a.c.f.e.vg A[CUSTOM_DECLARE]), Splitter:B:4:0x0017] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0122 A[ExcHandler: NullPointerException (r1v3 'e' java.lang.NullPointerException A[CUSTOM_DECLARE]), Splitter:B:4:0x0017] */
    @androidx.annotation.Nullable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object doInBackground(java.lang.Object[] r7) {
        /*
            r6 = this;
            java.lang.Void[] r7 = (java.lang.Void[]) r7
            java.lang.String r7 = r6.f3108e
            boolean r7 = android.text.TextUtils.isEmpty(r7)
            r0 = 0
            if (r7 != 0) goto L_0x0016
            java.lang.String r7 = r6.f3108e
            b.l.a.c.f.e.ji r0 = new b.l.a.c.f.e.ji
            r0.<init>()
            r0.a = r7
            goto L_0x015d
        L_0x0016:
            r7 = 0
            java.net.URL r1 = new java.net.URL     // Catch:{ IOException -> 0x0140, NullPointerException -> 0x0122, vg -> 0x0104 }
            java.lang.String r2 = r6.f3107b     // Catch:{ IOException -> 0x0140, NullPointerException -> 0x0122, vg -> 0x0104 }
            r1.<init>(r2)     // Catch:{ IOException -> 0x0140, NullPointerException -> 0x0122, vg -> 0x0104 }
            java.lang.ref.WeakReference<b.l.a.c.f.e.li> r2 = r6.c     // Catch:{ IOException -> 0x0140, NullPointerException -> 0x0122, vg -> 0x0104 }
            java.lang.Object r2 = r2.get()     // Catch:{ IOException -> 0x0140, NullPointerException -> 0x0122, vg -> 0x0104 }
            b.l.a.c.f.e.li r2 = (b.l.a.c.f.e.li) r2     // Catch:{ IOException -> 0x0140, NullPointerException -> 0x0122, vg -> 0x0104 }
            java.net.HttpURLConnection r1 = r2.m(r1)     // Catch:{ IOException -> 0x0140, NullPointerException -> 0x0122, vg -> 0x0104 }
            java.lang.String r3 = "Content-Type"
            java.lang.String r4 = "application/json; charset=UTF-8"
            r1.addRequestProperty(r3, r4)     // Catch:{ IOException -> 0x0140, NullPointerException -> 0x0122, vg -> 0x0104 }
            r3 = 60000(0xea60, float:8.4078E-41)
            r1.setConnectTimeout(r3)     // Catch:{ IOException -> 0x0140, NullPointerException -> 0x0122, vg -> 0x0104 }
            b.l.a.c.f.e.ej r3 = new b.l.a.c.f.e.ej     // Catch:{ IOException -> 0x0140, NullPointerException -> 0x0122, vg -> 0x0104 }
            android.content.Context r2 = r2.i()     // Catch:{ IOException -> 0x0140, NullPointerException -> 0x0122, vg -> 0x0104 }
            b.l.a.c.f.e.cj r4 = new b.l.a.c.f.e.cj     // Catch:{ IOException -> 0x0140, NullPointerException -> 0x0122, vg -> 0x0104 }
            java.lang.String r5 = b.l.a.c.f.e.cj.b()     // Catch:{ IOException -> 0x0140, NullPointerException -> 0x0122, vg -> 0x0104 }
            r4.<init>(r5)     // Catch:{ IOException -> 0x0140, NullPointerException -> 0x0122, vg -> 0x0104 }
            java.lang.String r4 = r4.a()     // Catch:{ IOException -> 0x0140, NullPointerException -> 0x0122, vg -> 0x0104 }
            r3.<init>(r2, r4)     // Catch:{ IOException -> 0x0140, NullPointerException -> 0x0122, vg -> 0x0104 }
            r3.a(r1)     // Catch:{ IOException -> 0x0140, NullPointerException -> 0x0122, vg -> 0x0104 }
            int r2 = r1.getResponseCode()     // Catch:{ IOException -> 0x0140, NullPointerException -> 0x0122, vg -> 0x0104 }
            r3 = 200(0xc8, float:2.8E-43)
            r4 = 128(0x80, float:1.794E-43)
            if (r2 == r3) goto L_0x00c4
            int r3 = r1.getResponseCode()     // Catch:{ IOException -> 0x007d, NullPointerException -> 0x0122, vg -> 0x0104 }
            r5 = 400(0x190, float:5.6E-43)
            if (r3 < r5) goto L_0x00a0
            java.io.InputStream r1 = r1.getErrorStream()     // Catch:{ IOException -> 0x007d, NullPointerException -> 0x0122, vg -> 0x0104 }
            if (r1 != 0) goto L_0x006b
            java.lang.String r1 = "WEB_INTERNAL_ERROR:Could not retrieve the authDomain for this project but did not receive an error response from the network request. Please try again."
            goto L_0x00a1
        L_0x006b:
            java.lang.String r3 = new java.lang.String     // Catch:{ IOException -> 0x007d, NullPointerException -> 0x0122, vg -> 0x0104 }
            byte[] r1 = a(r1, r4)     // Catch:{ IOException -> 0x007d, NullPointerException -> 0x0122, vg -> 0x0104 }
            r3.<init>(r1)     // Catch:{ IOException -> 0x007d, NullPointerException -> 0x0122, vg -> 0x0104 }
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            java.lang.Object r1 = b.l.a.c.f.e.zi.a(r3, r1)     // Catch:{ IOException -> 0x007d, NullPointerException -> 0x0122, vg -> 0x0104 }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ IOException -> 0x007d, NullPointerException -> 0x0122, vg -> 0x0104 }
            goto L_0x00a1
        L_0x007d:
            r1 = move-exception
            b.l.a.c.c.n.a r3 = f     // Catch:{ IOException -> 0x0140, NullPointerException -> 0x0122, vg -> 0x0104 }
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch:{ IOException -> 0x0140, NullPointerException -> 0x0122, vg -> 0x0104 }
            int r4 = r1.length()     // Catch:{ IOException -> 0x0140, NullPointerException -> 0x0122, vg -> 0x0104 }
            int r4 = r4 + 75
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0140, NullPointerException -> 0x0122, vg -> 0x0104 }
            r5.<init>(r4)     // Catch:{ IOException -> 0x0140, NullPointerException -> 0x0122, vg -> 0x0104 }
            java.lang.String r4 = "Error parsing error message from response body in getErrorMessageFromBody. "
            r5.append(r4)     // Catch:{ IOException -> 0x0140, NullPointerException -> 0x0122, vg -> 0x0104 }
            r5.append(r1)     // Catch:{ IOException -> 0x0140, NullPointerException -> 0x0122, vg -> 0x0104 }
            java.lang.String r1 = r5.toString()     // Catch:{ IOException -> 0x0140, NullPointerException -> 0x0122, vg -> 0x0104 }
            java.lang.Object[] r4 = new java.lang.Object[r7]     // Catch:{ IOException -> 0x0140, NullPointerException -> 0x0122, vg -> 0x0104 }
            r3.e(r1, r4)     // Catch:{ IOException -> 0x0140, NullPointerException -> 0x0122, vg -> 0x0104 }
        L_0x00a0:
            r1 = r0
        L_0x00a1:
            b.l.a.c.c.n.a r3 = f     // Catch:{ IOException -> 0x0140, NullPointerException -> 0x0122, vg -> 0x0104 }
            r4 = 2
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch:{ IOException -> 0x0140, NullPointerException -> 0x0122, vg -> 0x0104 }
            r4[r7] = r1     // Catch:{ IOException -> 0x0140, NullPointerException -> 0x0122, vg -> 0x0104 }
            r5 = 1
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ IOException -> 0x0140, NullPointerException -> 0x0122, vg -> 0x0104 }
            r4[r5] = r2     // Catch:{ IOException -> 0x0140, NullPointerException -> 0x0122, vg -> 0x0104 }
            java.lang.String r2 = "Error getting project config. Failed with %s %s"
            java.lang.String r2 = java.lang.String.format(r2, r4)     // Catch:{ IOException -> 0x0140, NullPointerException -> 0x0122, vg -> 0x0104 }
            java.lang.Object[] r4 = new java.lang.Object[r7]     // Catch:{ IOException -> 0x0140, NullPointerException -> 0x0122, vg -> 0x0104 }
            r3.b(r2, r4)     // Catch:{ IOException -> 0x0140, NullPointerException -> 0x0122, vg -> 0x0104 }
            b.l.a.c.f.e.ji r2 = new b.l.a.c.f.e.ji     // Catch:{ IOException -> 0x0140, NullPointerException -> 0x0122, vg -> 0x0104 }
            r2.<init>()     // Catch:{ IOException -> 0x0140, NullPointerException -> 0x0122, vg -> 0x0104 }
            r2.f3091b = r1     // Catch:{ IOException -> 0x0140, NullPointerException -> 0x0122, vg -> 0x0104 }
            r0 = r2
            goto L_0x015d
        L_0x00c4:
            b.l.a.c.f.e.rk r2 = new b.l.a.c.f.e.rk     // Catch:{ IOException -> 0x0140, NullPointerException -> 0x0122, vg -> 0x0104 }
            r2.<init>()     // Catch:{ IOException -> 0x0140, NullPointerException -> 0x0122, vg -> 0x0104 }
            java.lang.String r3 = new java.lang.String     // Catch:{ IOException -> 0x0140, NullPointerException -> 0x0122, vg -> 0x0104 }
            java.io.InputStream r1 = r1.getInputStream()     // Catch:{ IOException -> 0x0140, NullPointerException -> 0x0122, vg -> 0x0104 }
            byte[] r1 = a(r1, r4)     // Catch:{ IOException -> 0x0140, NullPointerException -> 0x0122, vg -> 0x0104 }
            r3.<init>(r1)     // Catch:{ IOException -> 0x0140, NullPointerException -> 0x0122, vg -> 0x0104 }
            r2.a(r3)     // Catch:{ IOException -> 0x0140, NullPointerException -> 0x0122, vg -> 0x0104 }
            java.util.List<java.lang.String> r1 = r2.f3264h     // Catch:{ IOException -> 0x0140, NullPointerException -> 0x0122, vg -> 0x0104 }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ IOException -> 0x0140, NullPointerException -> 0x0122, vg -> 0x0104 }
        L_0x00df:
            boolean r2 = r1.hasNext()     // Catch:{ IOException -> 0x0140, NullPointerException -> 0x0122, vg -> 0x0104 }
            if (r2 == 0) goto L_0x015d
            java.lang.Object r2 = r1.next()     // Catch:{ IOException -> 0x0140, NullPointerException -> 0x0122, vg -> 0x0104 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ IOException -> 0x0140, NullPointerException -> 0x0122, vg -> 0x0104 }
            java.lang.String r3 = "firebaseapp.com"
            boolean r3 = r2.endsWith(r3)     // Catch:{ IOException -> 0x0140, NullPointerException -> 0x0122, vg -> 0x0104 }
            if (r3 != 0) goto L_0x00fb
            java.lang.String r3 = "web.app"
            boolean r3 = r2.endsWith(r3)     // Catch:{ IOException -> 0x0140, NullPointerException -> 0x0122, vg -> 0x0104 }
            if (r3 == 0) goto L_0x00df
        L_0x00fb:
            b.l.a.c.f.e.ji r1 = new b.l.a.c.f.e.ji     // Catch:{ IOException -> 0x0140, NullPointerException -> 0x0122, vg -> 0x0104 }
            r1.<init>()     // Catch:{ IOException -> 0x0140, NullPointerException -> 0x0122, vg -> 0x0104 }
            r1.a = r2     // Catch:{ IOException -> 0x0140, NullPointerException -> 0x0122, vg -> 0x0104 }
            r0 = r1
            goto L_0x015d
        L_0x0104:
            r1 = move-exception
            b.l.a.c.c.n.a r2 = f
            java.lang.String r1 = java.lang.String.valueOf(r1)
            int r3 = r1.length()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            int r3 = r3 + 33
            r4.<init>(r3)
            java.lang.String r3 = "ConversionException encountered: "
            java.lang.String r1 = b.e.a.a.a.q(r4, r3, r1)
            java.lang.Object[] r7 = new java.lang.Object[r7]
            r2.b(r1, r7)
            goto L_0x015d
        L_0x0122:
            r1 = move-exception
            b.l.a.c.c.n.a r2 = f
            java.lang.String r1 = java.lang.String.valueOf(r1)
            int r3 = r1.length()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            int r3 = r3 + 26
            r4.<init>(r3)
            java.lang.String r3 = "Null pointer encountered: "
            java.lang.String r1 = b.e.a.a.a.q(r4, r3, r1)
            java.lang.Object[] r7 = new java.lang.Object[r7]
            r2.b(r1, r7)
            goto L_0x015d
        L_0x0140:
            r1 = move-exception
            b.l.a.c.c.n.a r2 = f
            java.lang.String r1 = java.lang.String.valueOf(r1)
            int r3 = r1.length()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            int r3 = r3 + 22
            r4.<init>(r3)
            java.lang.String r3 = "IOException occurred: "
            java.lang.String r1 = b.e.a.a.a.q(r4, r3, r1)
            java.lang.Object[] r7 = new java.lang.Object[r7]
            r2.b(r1, r7)
        L_0x015d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: b.l.a.c.f.e.ki.doInBackground(java.lang.Object[]):java.lang.Object");
    }

    public final /* bridge */ /* synthetic */ void onCancelled(Object obj) {
        ji jiVar = (ji) obj;
        onPostExecute((ji) null);
    }
}
