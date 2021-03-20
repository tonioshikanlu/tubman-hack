package b.l.a.c.f.e;

import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Log;
import b.l.a.c.b.a;
import b.l.a.c.c.p.d;

public final class kj {
    public final String a;

    /* renamed from: b  reason: collision with root package name */
    public final String f3109b;

    public kj(Context context, String str) {
        a.x(str);
        this.a = str;
        try {
            byte[] a2 = b.l.a.c.c.p.a.a(context, str);
            if (a2 == null) {
                String valueOf = String.valueOf(str);
                Log.e("FBA-PackageInfo", valueOf.length() != 0 ? "single cert required: ".concat(valueOf) : new String("single cert required: "));
                this.f3109b = null;
                return;
            }
            this.f3109b = d.a(a2, false);
        } catch (PackageManager.NameNotFoundException unused) {
            String valueOf2 = String.valueOf(str);
            Log.e("FBA-PackageInfo", valueOf2.length() != 0 ? "no pkg: ".concat(valueOf2) : new String("no pkg: "));
            this.f3109b = null;
        }
    }
}
