package b.l.a.c.c.q;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Binder;
import android.os.Process;

public class a {
    public final Context a;

    public a(Context context) {
        this.a = context;
    }

    public ApplicationInfo a(String str, int i2) {
        return this.a.getPackageManager().getApplicationInfo(str, i2);
    }

    public PackageInfo b(String str, int i2) {
        return this.a.getPackageManager().getPackageInfo(str, i2);
    }

    public boolean c() {
        String nameForUid;
        if (Binder.getCallingUid() == Process.myUid()) {
            return b.l.a.c.b.a.f0(this.a);
        }
        if (!b.l.a.c.b.a.d0() || (nameForUid = this.a.getPackageManager().getNameForUid(Binder.getCallingUid())) == null) {
            return false;
        }
        return this.a.getPackageManager().isInstantApp(nameForUid);
    }
}
