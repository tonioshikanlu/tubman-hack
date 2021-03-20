package b.f.a;

import android.app.Activity;
import android.content.DialogInterface;

public final class c implements DialogInterface.OnClickListener {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ boolean f403h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ Activity f404i;

    public c(boolean z, Activity activity) {
        this.f403h = z;
        this.f404i = activity;
    }

    public final void onClick(DialogInterface dialogInterface, int i2) {
        dialogInterface.dismiss();
        if (this.f403h) {
            this.f404i.finish();
        }
    }
}
