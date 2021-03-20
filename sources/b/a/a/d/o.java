package b.a.a.d;

import android.content.DialogInterface;
import com.appfoundry.previewer.activities.BravoActivity;

public final class o implements DialogInterface.OnClickListener {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ BravoActivity f233h;

    public o(BravoActivity bravoActivity) {
        this.f233h = bravoActivity;
    }

    public final void onClick(DialogInterface dialogInterface, int i2) {
        this.f233h.finish();
    }
}
