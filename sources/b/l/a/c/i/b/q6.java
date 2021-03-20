package b.l.a.c.i.b;

import androidx.annotation.WorkerThread;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;

public final class q6 extends g5 {
    public q6(l4 l4Var) {
        super(l4Var);
    }

    public final boolean i() {
        return false;
    }

    @WorkerThread
    public final HttpURLConnection o(URL url) {
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
