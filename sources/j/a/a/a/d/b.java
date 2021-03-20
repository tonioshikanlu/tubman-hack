package j.a.a.a.d;

import android.os.Handler;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class b implements Runnable {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ String f8064h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ String f8065i;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ f f8066j;

    public b(f fVar, String str, String str2) {
        this.f8066j = fVar;
        this.f8064h = str;
        this.f8065i = str2;
    }

    public void run() {
        d dVar;
        Handler handler;
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(new File(this.f8064h));
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(this.f8065i).openConnection();
            int contentLength = httpURLConnection.getContentLength();
            byte[] bArr = new byte[1024];
            BufferedInputStream bufferedInputStream = new BufferedInputStream(httpURLConnection.getInputStream());
            int i2 = 0;
            int i3 = 0;
            while (true) {
                int read = bufferedInputStream.read(bArr);
                if (read <= 0) {
                    break;
                }
                fileOutputStream.write(bArr, 0, read);
                i2 += read;
                i3 += read;
                f fVar = this.f8066j;
                if (fVar.f8075b != null && i3 > 153600) {
                    Handler handler2 = fVar.a;
                    if (handler2 != null) {
                        handler2.post(new e(fVar, i2, contentLength));
                    }
                    i3 = 0;
                }
            }
            httpURLConnection.disconnect();
            fileOutputStream.close();
            f fVar2 = this.f8066j;
            String str = this.f8065i;
            String str2 = this.f8064h;
            Handler handler3 = fVar2.a;
            if (handler3 != null) {
                handler3.post(new c(fVar2, str, str2));
            }
        } catch (MalformedURLException e2) {
            f fVar3 = this.f8066j;
            handler = fVar3.a;
            if (handler != null) {
                dVar = new d(fVar3, e2);
                handler.post(dVar);
            }
        } catch (IOException e3) {
            f fVar4 = this.f8066j;
            handler = fVar4.a;
            if (handler != null) {
                dVar = new d(fVar4, e3);
                handler.post(dVar);
            }
        }
    }
}
