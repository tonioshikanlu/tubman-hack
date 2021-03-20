package b.l.d.q.f.o;

import android.content.Context;
import b.l.d.q.f.b;
import b.l.d.q.f.g.e;

public class a {
    public final Context a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f5288b = false;
    public String c;

    public a(Context context) {
        this.a = context;
    }

    public String a() {
        String str;
        if (!this.f5288b) {
            Context context = this.a;
            int g2 = e.g(context, "com.google.firebase.crashlytics.unity_version", "string");
            if (g2 != 0) {
                str = context.getResources().getString(g2);
                b.a.b("Unity Editor version is: " + str);
            } else {
                str = null;
            }
            this.c = str;
            this.f5288b = true;
        }
        String str2 = this.c;
        if (str2 != null) {
            return str2;
        }
        return null;
    }
}
