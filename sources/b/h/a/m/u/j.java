package b.h.a.m.u;

import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import b.h.a.f;
import b.h.a.m.e;
import b.h.a.m.u.d;
import b.h.a.m.w.g;
import b.h.a.s.c;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Map;

public class j implements d<InputStream> {
    @VisibleForTesting

    /* renamed from: m  reason: collision with root package name */
    public static final b f603m = new a();

    /* renamed from: h  reason: collision with root package name */
    public final g f604h;

    /* renamed from: i  reason: collision with root package name */
    public final int f605i;

    /* renamed from: j  reason: collision with root package name */
    public HttpURLConnection f606j;

    /* renamed from: k  reason: collision with root package name */
    public InputStream f607k;

    /* renamed from: l  reason: collision with root package name */
    public volatile boolean f608l;

    public static class a implements b {
    }

    public interface b {
    }

    public j(g gVar, int i2) {
        this.f604h = gVar;
        this.f605i = i2;
    }

    @NonNull
    public Class<InputStream> a() {
        return InputStream.class;
    }

    public void b() {
        InputStream inputStream = this.f607k;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
        HttpURLConnection httpURLConnection = this.f606j;
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
        this.f606j = null;
    }

    public final InputStream c(URL url, int i2, URL url2, Map<String, String> map) {
        if (i2 < 5) {
            if (url2 != null) {
                try {
                    if (url.toURI().equals(url2.toURI())) {
                        throw new e("In re-direct loop");
                    }
                } catch (URISyntaxException unused) {
                }
            }
            this.f606j = (HttpURLConnection) url.openConnection();
            for (Map.Entry next : map.entrySet()) {
                this.f606j.addRequestProperty((String) next.getKey(), (String) next.getValue());
            }
            this.f606j.setConnectTimeout(this.f605i);
            this.f606j.setReadTimeout(this.f605i);
            boolean z = false;
            this.f606j.setUseCaches(false);
            this.f606j.setDoInput(true);
            this.f606j.setInstanceFollowRedirects(false);
            this.f606j.connect();
            this.f607k = this.f606j.getInputStream();
            if (this.f608l) {
                return null;
            }
            int responseCode = this.f606j.getResponseCode();
            int i3 = responseCode / 100;
            if (i3 == 2) {
                HttpURLConnection httpURLConnection = this.f606j;
                if (TextUtils.isEmpty(httpURLConnection.getContentEncoding())) {
                    this.f607k = new c(httpURLConnection.getInputStream(), (long) httpURLConnection.getContentLength());
                } else {
                    if (Log.isLoggable("HttpUrlFetcher", 3)) {
                        StringBuilder y = b.e.a.a.a.y("Got non empty content encoding: ");
                        y.append(httpURLConnection.getContentEncoding());
                        Log.d("HttpUrlFetcher", y.toString());
                    }
                    this.f607k = httpURLConnection.getInputStream();
                }
                return this.f607k;
            }
            if (i3 == 3) {
                z = true;
            }
            if (z) {
                String headerField = this.f606j.getHeaderField("Location");
                if (!TextUtils.isEmpty(headerField)) {
                    URL url3 = new URL(url, headerField);
                    b();
                    return c(url3, i2 + 1, url, map);
                }
                throw new e("Received empty or null redirect url");
            } else if (responseCode == -1) {
                throw new e(responseCode);
            } else {
                throw new e(this.f606j.getResponseMessage(), responseCode);
            }
        } else {
            throw new e("Too many (> 5) redirects!");
        }
    }

    public void cancel() {
        this.f608l = true;
    }

    @NonNull
    public b.h.a.m.a e() {
        return b.h.a.m.a.REMOTE;
    }

    public void f(@NonNull f fVar, @NonNull d.a<? super InputStream> aVar) {
        StringBuilder sb;
        int i2 = b.h.a.s.f.f1014b;
        long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        try {
            aVar.d(c(this.f604h.d(), 0, (URL) null, this.f604h.f800b.a()));
            if (Log.isLoggable("HttpUrlFetcher", 2)) {
                sb = new StringBuilder();
                sb.append("Finished http url fetcher fetch in ");
                sb.append(b.h.a.s.f.a(elapsedRealtimeNanos));
                Log.v("HttpUrlFetcher", sb.toString());
            }
        } catch (IOException e2) {
            if (Log.isLoggable("HttpUrlFetcher", 3)) {
                Log.d("HttpUrlFetcher", "Failed to load data for url", e2);
            }
            aVar.c(e2);
            if (Log.isLoggable("HttpUrlFetcher", 2)) {
                sb = new StringBuilder();
            }
        } catch (Throwable th) {
            if (Log.isLoggable("HttpUrlFetcher", 2)) {
                StringBuilder y = b.e.a.a.a.y("Finished http url fetcher fetch in ");
                y.append(b.h.a.s.f.a(elapsedRealtimeNanos));
                Log.v("HttpUrlFetcher", y.toString());
            }
            throw th;
        }
    }
}
