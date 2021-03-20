package b.l.a.c.i.b;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import androidx.annotation.WorkerThread;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;

public final class p3 extends u8 {
    public p3(d9 d9Var) {
        super(d9Var);
    }

    public final boolean k() {
        return false;
    }

    public final boolean l() {
        i();
        ConnectivityManager connectivityManager = (ConnectivityManager) this.a.a.getSystemService("connectivity");
        NetworkInfo networkInfo = null;
        if (connectivityManager != null) {
            try {
                networkInfo = connectivityManager.getActiveNetworkInfo();
            } catch (SecurityException unused) {
            }
        }
        return networkInfo != null && networkInfo.isConnected();
    }

    @WorkerThread
    public final HttpURLConnection m(URL url) {
        URLConnection openConnection = url.openConnection();
        if (openConnection instanceof HttpURLConnection) {
            HttpURLConnection httpURLConnection = (HttpURLConnection) openConnection;
            httpURLConnection.setDefaultUseCaches(false);
            f fVar = this.a.f4114g;
            httpURLConnection.setConnectTimeout(60000);
            f fVar2 = this.a.f4114g;
            httpURLConnection.setReadTimeout(61000);
            httpURLConnection.setInstanceFollowRedirects(false);
            httpURLConnection.setDoInput(true);
            return httpURLConnection;
        }
        throw new IOException("Failed to obtain HTTP connection");
    }
}
