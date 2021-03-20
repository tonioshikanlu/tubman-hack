package b.l.a.c.c;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentManager;

public class k extends DialogFragment {

    /* renamed from: h  reason: collision with root package name */
    public Dialog f2604h = null;

    /* renamed from: i  reason: collision with root package name */
    public DialogInterface.OnCancelListener f2605i = null;

    public void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.f2605i;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    public Dialog onCreateDialog(Bundle bundle) {
        if (this.f2604h == null) {
            setShowsDialog(false);
        }
        return this.f2604h;
    }

    public void show(FragmentManager fragmentManager, String str) {
        super.show(fragmentManager, str);
    }
}
