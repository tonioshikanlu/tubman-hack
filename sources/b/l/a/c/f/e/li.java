package b.l.a.c.f.e;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import b.l.a.c.c.n.a;
import com.google.android.gms.common.api.Status;
import java.net.HttpURLConnection;
import java.net.URL;

public interface li {
    public static final a c = new a("FirebaseAuth", "GetAuthDomainTaskResponseHandler");

    Context i();

    String j(String str);

    void k(Uri uri, String str);

    Uri.Builder l(Intent intent, String str, String str2);

    HttpURLConnection m(URL url);

    void n(String str, Status status);
}
