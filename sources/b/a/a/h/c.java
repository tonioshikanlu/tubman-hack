package b.a.a.h;

import android.content.DialogInterface;
import com.appfoundry.previewer.activities.BravoActivity;

public final class c implements DialogInterface.OnClickListener {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ BravoActivity f256h;

    public c(BravoActivity bravoActivity) {
        this.f256h = bravoActivity;
    }

    public final void onClick(DialogInterface dialogInterface, int i2) {
        this.f256h.finish();
    }
}
