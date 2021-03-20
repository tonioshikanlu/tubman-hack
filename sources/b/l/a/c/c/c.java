package b.l.a.c.c;

import android.app.Dialog;
import android.app.DialogFragment;
import android.app.FragmentManager;
import android.content.DialogInterface;
import android.os.Bundle;

public class c extends DialogFragment {

    /* renamed from: h  reason: collision with root package name */
    public Dialog f2591h = null;

    /* renamed from: i  reason: collision with root package name */
    public DialogInterface.OnCancelListener f2592i = null;

    public void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.f2592i;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    public Dialog onCreateDialog(Bundle bundle) {
        if (this.f2591h == null) {
            setShowsDialog(false);
        }
        return this.f2591h;
    }

    public void show(FragmentManager fragmentManager, String str) {
        super.show(fragmentManager, str);
    }
}
