package b.o;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import b.e.a.a.a;
import b.o.i2;
import com.onesignal.PermissionsActivity;

public class s3 implements DialogInterface.OnClickListener {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ PermissionsActivity f6281h;

    public s3(PermissionsActivity permissionsActivity) {
        this.f6281h = permissionsActivity;
    }

    public void onClick(DialogInterface dialogInterface, int i2) {
        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
        StringBuilder y = a.y("package:");
        y.append(this.f6281h.getPackageName());
        intent.setData(Uri.parse(y.toString()));
        this.f6281h.startActivity(intent);
        c0.i(true, i2.s.PERMISSION_DENIED);
    }
}
