package b.o;

import android.content.DialogInterface;
import b.o.i2;
import com.onesignal.PermissionsActivity;

public class r3 implements DialogInterface.OnClickListener {
    public r3(PermissionsActivity permissionsActivity) {
    }

    public void onClick(DialogInterface dialogInterface, int i2) {
        c0.i(true, i2.s.PERMISSION_DENIED);
    }
}
