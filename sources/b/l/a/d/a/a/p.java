package b.l.a.d.a.a;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import androidx.annotation.Nullable;
import b.l.a.d.a.c.b;
import b.l.a.d.a.d.a;
import b.l.a.d.a.e.f;
import b.l.a.d.a.e.l0;
import b.l.a.d.a.e.r;

public final class p {

    /* renamed from: e  reason: collision with root package name */
    public static final f f4461e = new f("AppUpdateService");
    public static final Intent f = new Intent("com.google.android.play.core.install.BIND_UPDATE_SERVICE").setPackage("com.android.vending");
    @Nullable
    public b.l.a.d.a.e.p<l0> a;

    /* renamed from: b  reason: collision with root package name */
    public final String f4462b;
    public final Context c;
    public final r d;

    public p(Context context, r rVar) {
        this.f4462b = context.getPackageName();
        this.c = context;
        this.d = rVar;
        if (r.a(context)) {
            Context applicationContext = context.getApplicationContext();
            this.a = new b.l.a.d.a.e.p(applicationContext != null ? applicationContext : context, f4461e, "AppUpdateService", f, j.a);
        }
    }

    public static Bundle a(p pVar, String str) {
        Integer num;
        Bundle bundle = new Bundle();
        Bundle bundle2 = new Bundle();
        bundle2.putAll(b.a("app_update"));
        bundle2.putInt("playcore.version.code", 10901);
        bundle.putAll(bundle2);
        bundle.putString("package.name", str);
        try {
            num = Integer.valueOf(pVar.c.getPackageManager().getPackageInfo(pVar.c.getPackageName(), 0).versionCode);
        } catch (PackageManager.NameNotFoundException unused) {
            f4461e.b(6, "The current version of the app could not be retrieved", new Object[0]);
            num = null;
        }
        if (num != null) {
            bundle.putInt("app.version.code", num.intValue());
        }
        return bundle;
    }

    public static <T> b.l.a.d.a.i.r<T> b() {
        f4461e.b(6, "onError(%d)", new Object[]{-9});
        a aVar = new a(-9);
        b.l.a.d.a.i.r<T> rVar = new b.l.a.d.a.i.r<>();
        rVar.d(aVar);
        return rVar;
    }
}
