package b.l.d;

import android.content.Context;
import b.l.d.a0.g;
import com.google.firebase.FirebaseCommonRegistrar;

public final /* synthetic */ class h implements g {
    public static final h a = new h();

    public String a(Object obj) {
        Context context = (Context) obj;
        String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
        return installerPackageName != null ? FirebaseCommonRegistrar.a(installerPackageName) : "";
    }
}
