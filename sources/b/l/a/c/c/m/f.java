package b.l.a.c.c.m;

import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.util.Log;

public abstract class f implements DialogInterface.OnClickListener {
    public abstract void a();

    public void onClick(DialogInterface dialogInterface, int i2) {
        try {
            a();
        } catch (ActivityNotFoundException e2) {
            Log.e("DialogRedirect", "Failed to start resolution intent", e2);
        } finally {
            dialogInterface.dismiss();
        }
    }
}
