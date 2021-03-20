package b.f.a;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;

public final class b implements DialogInterface.OnClickListener {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ Activity f402h;

    public b(Activity activity) {
        this.f402h = activity;
    }

    public final void onClick(DialogInterface dialogInterface, int i2) {
        Intent intent = new Intent();
        intent.setAction("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.setData(Uri.fromParts("package", this.f402h.getPackageName(), (String) null));
        this.f402h.startActivity(intent);
    }
}
