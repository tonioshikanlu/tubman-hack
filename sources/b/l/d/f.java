package b.l.d;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import b.l.d.a0.g;

public final /* synthetic */ class f implements g {
    public static final f a = new f();

    public String a(Object obj) {
        ApplicationInfo applicationInfo = ((Context) obj).getApplicationInfo();
        return applicationInfo != null ? String.valueOf(applicationInfo.minSdkVersion) : "";
    }
}
