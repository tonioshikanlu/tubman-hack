package b.l.a.c.f.e;

import android.content.Context;
import b.l.a.c.b.a;
import java.net.URLConnection;
import java.util.Objects;

public final class ej {
    public final Context a;

    /* renamed from: b  reason: collision with root package name */
    public kj f2941b;
    public final String c;
    public boolean d = false;

    /* renamed from: e  reason: collision with root package name */
    public String f2942e;

    public ej(Context context, String str) {
        Objects.requireNonNull(context, "null reference");
        this.a = context.getApplicationContext();
        this.c = String.format("Android/%s/%s", new Object[]{"Fallback", str});
    }

    public final void a(URLConnection uRLConnection) {
        StringBuilder sb;
        String str;
        if (this.d) {
            String str2 = this.c;
            sb = new StringBuilder(String.valueOf(str2).length() + 19);
            sb.append(str2);
            sb.append("/");
            str = "FirebaseUI-Android";
        } else {
            String str3 = this.c;
            sb = new StringBuilder(String.valueOf(str3).length() + 21);
            sb.append(str3);
            sb.append("/");
            str = "FirebaseCore-Android";
        }
        sb.append(str);
        String sb2 = sb.toString();
        if (this.f2941b == null) {
            Context context = this.a;
            this.f2941b = new kj(context, context.getPackageName());
        }
        uRLConnection.setRequestProperty("X-Android-Package", this.f2941b.a);
        uRLConnection.setRequestProperty("X-Android-Cert", this.f2941b.f3109b);
        uRLConnection.setRequestProperty("Accept-Language", a.Z0());
        uRLConnection.setRequestProperty("X-Client-Version", sb2);
        uRLConnection.setRequestProperty("X-Firebase-Locale", this.f2942e);
        this.f2942e = null;
    }
}
