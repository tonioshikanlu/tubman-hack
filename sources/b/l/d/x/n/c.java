package b.l.d.x.n;

import android.content.Context;
import android.content.pm.PackageManager;
import android.util.JsonReader;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import b.l.a.c.b.a;
import b.l.a.c.c.p.d;
import b.l.d.a0.h;
import b.l.d.u.f;
import b.l.d.w.b;
import b.l.d.x.f;
import b.l.d.x.n.a;
import b.l.d.x.n.b;
import b.l.d.x.n.d;
import b.l.d.x.n.f;
import com.segment.analytics.AnalyticsContext;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.Charset;
import java.util.regex.Pattern;
import java.util.zip.GZIPOutputStream;
import org.json.JSONException;
import org.json.JSONObject;

public class c {

    /* renamed from: e  reason: collision with root package name */
    public static final Pattern f5395e = Pattern.compile("[0-9]+s");
    public static final Charset f = Charset.forName("UTF-8");
    public final Context a;

    /* renamed from: b  reason: collision with root package name */
    public final b<h> f5396b;
    public final b<f> c;
    public final e d = new e();

    public c(@NonNull Context context, @NonNull b<h> bVar, @NonNull b<f> bVar2) {
        this.a = context;
        this.f5396b = bVar;
        this.c = bVar2;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x004d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void b(java.net.HttpURLConnection r10, @androidx.annotation.Nullable java.lang.String r11, @androidx.annotation.NonNull java.lang.String r12, @androidx.annotation.NonNull java.lang.String r13) {
        /*
            java.io.InputStream r0 = r10.getErrorStream()
            r1 = 0
            r2 = 2
            r3 = 1
            r4 = 0
            r5 = 3
            if (r0 != 0) goto L_0x000c
            goto L_0x0050
        L_0x000c:
            java.io.BufferedReader r6 = new java.io.BufferedReader
            java.io.InputStreamReader r7 = new java.io.InputStreamReader
            java.nio.charset.Charset r8 = f
            r7.<init>(r0, r8)
            r6.<init>(r7)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x004d, all -> 0x0048 }
            r0.<init>()     // Catch:{ IOException -> 0x004d, all -> 0x0048 }
        L_0x001d:
            java.lang.String r7 = r6.readLine()     // Catch:{ IOException -> 0x004d, all -> 0x0048 }
            if (r7 == 0) goto L_0x002c
            r0.append(r7)     // Catch:{ IOException -> 0x004d, all -> 0x0048 }
            r7 = 10
            r0.append(r7)     // Catch:{ IOException -> 0x004d, all -> 0x0048 }
            goto L_0x001d
        L_0x002c:
            java.lang.String r7 = "Error when communicating with the Firebase Installations server API. HTTP response: [%d %s: %s]"
            java.lang.Object[] r8 = new java.lang.Object[r5]     // Catch:{ IOException -> 0x004d, all -> 0x0048 }
            int r9 = r10.getResponseCode()     // Catch:{ IOException -> 0x004d, all -> 0x0048 }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch:{ IOException -> 0x004d, all -> 0x0048 }
            r8[r4] = r9     // Catch:{ IOException -> 0x004d, all -> 0x0048 }
            java.lang.String r10 = r10.getResponseMessage()     // Catch:{ IOException -> 0x004d, all -> 0x0048 }
            r8[r3] = r10     // Catch:{ IOException -> 0x004d, all -> 0x0048 }
            r8[r2] = r0     // Catch:{ IOException -> 0x004d, all -> 0x0048 }
            java.lang.String r10 = java.lang.String.format(r7, r8)     // Catch:{ IOException -> 0x004d, all -> 0x0048 }
            r1 = r10
            goto L_0x004d
        L_0x0048:
            r10 = move-exception
            r6.close()     // Catch:{ IOException -> 0x004c }
        L_0x004c:
            throw r10
        L_0x004d:
            r6.close()     // Catch:{ IOException -> 0x0050 }
        L_0x0050:
            boolean r10 = android.text.TextUtils.isEmpty(r1)
            if (r10 != 0) goto L_0x007b
            java.lang.String r10 = "Firebase-Installations"
            android.util.Log.w(r10, r1)
            java.lang.Object[] r0 = new java.lang.Object[r5]
            r0[r4] = r12
            r0[r3] = r13
            boolean r12 = android.text.TextUtils.isEmpty(r11)
            if (r12 == 0) goto L_0x006a
            java.lang.String r11 = ""
            goto L_0x0070
        L_0x006a:
            java.lang.String r12 = ", "
            java.lang.String r11 = b.e.a.a.a.m(r12, r11)
        L_0x0070:
            r0[r2] = r11
            java.lang.String r11 = "Firebase options used while communicating with Firebase server APIs: %s, %s%s"
            java.lang.String r11 = java.lang.String.format(r11, r0)
            android.util.Log.w(r10, r11)
        L_0x007b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: b.l.d.x.n.c.b(java.net.HttpURLConnection, java.lang.String, java.lang.String, java.lang.String):void");
    }

    public static long d(String str) {
        a.k(f5395e.matcher(str).matches(), "Invalid Expiration Timestamp.");
        if (str == null || str.length() == 0) {
            return 0;
        }
        return Long.parseLong(str.substring(0, str.length() - 1));
    }

    public static void i(URLConnection uRLConnection, byte[] bArr) {
        OutputStream outputStream = uRLConnection.getOutputStream();
        if (outputStream != null) {
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
            try {
                gZIPOutputStream.write(bArr);
            } finally {
                try {
                    gZIPOutputStream.close();
                    outputStream.close();
                } catch (IOException unused) {
                }
            }
        } else {
            throw new IOException("Cannot send request to FIS servers. No OutputStream available.");
        }
    }

    public final URL a(String str) {
        try {
            return new URL(String.format("https://%s/%s/%s", new Object[]{"firebaseinstallations.googleapis.com", "v1", str}));
        } catch (MalformedURLException e2) {
            throw new b.l.d.x.f(e2.getMessage(), f.a.UNAVAILABLE);
        }
    }

    public final HttpURLConnection c(URL url, String str) {
        f.a a2;
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            httpURLConnection.setConnectTimeout(10000);
            httpURLConnection.setUseCaches(false);
            httpURLConnection.setReadTimeout(10000);
            httpURLConnection.addRequestProperty("Content-Type", "application/json");
            httpURLConnection.addRequestProperty("Accept", "application/json");
            httpURLConnection.addRequestProperty("Content-Encoding", "gzip");
            httpURLConnection.addRequestProperty("Cache-Control", "no-cache");
            httpURLConnection.addRequestProperty("X-Android-Package", this.a.getPackageName());
            if (!(this.c.get() == null || this.f5396b.get() == null || (a2 = this.c.get().a("fire-installations-id")) == f.a.NONE)) {
                httpURLConnection.addRequestProperty("x-firebase-client", this.f5396b.get().a());
                httpURLConnection.addRequestProperty("x-firebase-client-log-type", Integer.toString(a2.f5300h));
            }
            String str2 = null;
            try {
                Context context = this.a;
                byte[] a3 = b.l.a.c.c.p.a.a(context, context.getPackageName());
                if (a3 == null) {
                    Log.e("ContentValues", "Could not get fingerprint hash for package: " + this.a.getPackageName());
                } else {
                    str2 = d.a(a3, false);
                }
            } catch (PackageManager.NameNotFoundException e2) {
                StringBuilder y = b.e.a.a.a.y("No such package: ");
                y.append(this.a.getPackageName());
                Log.e("ContentValues", y.toString(), e2);
            }
            httpURLConnection.addRequestProperty("X-Android-Cert", str2);
            httpURLConnection.addRequestProperty("x-goog-api-key", str);
            return httpURLConnection;
        } catch (IOException unused) {
            throw new b.l.d.x.f("Firebase Installations Service is unavailable. Please try again later.", f.a.UNAVAILABLE);
        }
    }

    public final d e(HttpURLConnection httpURLConnection) {
        InputStream inputStream = httpURLConnection.getInputStream();
        JsonReader jsonReader = new JsonReader(new InputStreamReader(inputStream, f));
        f.a a2 = f.a();
        jsonReader.beginObject();
        String str = null;
        String str2 = null;
        String str3 = null;
        f fVar = null;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (nextName.equals("name")) {
                str = jsonReader.nextString();
            } else if (nextName.equals("fid")) {
                str2 = jsonReader.nextString();
            } else if (nextName.equals("refreshToken")) {
                str3 = jsonReader.nextString();
            } else if (nextName.equals("authToken")) {
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    String nextName2 = jsonReader.nextName();
                    if (nextName2.equals(AnalyticsContext.Device.DEVICE_TOKEN_KEY)) {
                        ((b.C0091b) a2).a = jsonReader.nextString();
                    } else if (nextName2.equals("expiresIn")) {
                        a2.b(d(jsonReader.nextString()));
                    } else {
                        jsonReader.skipValue();
                    }
                }
                fVar = a2.a();
                jsonReader.endObject();
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        jsonReader.close();
        inputStream.close();
        return new a(str, str2, str3, fVar, d.a.OK, (a.C0090a) null);
    }

    public final f f(HttpURLConnection httpURLConnection) {
        InputStream inputStream = httpURLConnection.getInputStream();
        JsonReader jsonReader = new JsonReader(new InputStreamReader(inputStream, f));
        f.a a2 = f.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (nextName.equals(AnalyticsContext.Device.DEVICE_TOKEN_KEY)) {
                ((b.C0091b) a2).a = jsonReader.nextString();
            } else if (nextName.equals("expiresIn")) {
                a2.b(d(jsonReader.nextString()));
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        jsonReader.close();
        inputStream.close();
        b.C0091b bVar = (b.C0091b) a2;
        bVar.c = f.b.OK;
        return bVar.a();
    }

    public final void g(HttpURLConnection httpURLConnection, @Nullable String str, @NonNull String str2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("fid", str);
            jSONObject.put("appId", str2);
            jSONObject.put("authVersion", "FIS_v2");
            jSONObject.put("sdkVersion", "a:16.3.5");
            i(httpURLConnection, jSONObject.toString().getBytes("UTF-8"));
        } catch (JSONException e2) {
            throw new IllegalStateException(e2);
        }
    }

    public final void h(HttpURLConnection httpURLConnection) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("sdkVersion", "a:16.3.5");
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("installation", jSONObject);
            i(httpURLConnection, jSONObject2.toString().getBytes("UTF-8"));
        } catch (JSONException e2) {
            throw new IllegalStateException(e2);
        }
    }
}
