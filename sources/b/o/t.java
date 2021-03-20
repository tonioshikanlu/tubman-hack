package b.o;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.PendingIntent;
import android.content.DialogInterface;
import android.content.Intent;
import b.l.a.c.c.e;
import java.util.Objects;

public final class t implements Runnable {

    public class a implements DialogInterface.OnClickListener {
        public a(t tVar) {
        }

        public void onClick(DialogInterface dialogInterface, int i2) {
            b3.i(b3.a, "GT_DO_NOT_SHOW_MISSING_GPS", true);
        }
    }

    public class b implements DialogInterface.OnClickListener {

        /* renamed from: h  reason: collision with root package name */
        public final /* synthetic */ Activity f6285h;

        public b(t tVar, Activity activity) {
            this.f6285h = activity;
        }

        public void onClick(DialogInterface dialogInterface, int i2) {
            Activity activity = this.f6285h;
            try {
                Object obj = e.c;
                e eVar = e.d;
                PendingIntent pendingIntent = null;
                Intent a = eVar.a(activity, eVar.d(i2.c), (String) null);
                if (a != null) {
                    pendingIntent = PendingIntent.getActivity(activity, 9000, a, 134217728);
                }
                if (pendingIntent != null) {
                    pendingIntent.send();
                }
            } catch (PendingIntent.CanceledException e2) {
                e2.printStackTrace();
            }
        }
    }

    public void run() {
        Activity k2 = i2.k();
        if (k2 != null) {
            Objects.requireNonNull(i2.H);
            String f = f2.f(k2, "onesignal_gms_missing_alert_text", "To receive push notifications please press 'Update' to enable 'Google Play services'.");
            String f2 = f2.f(k2, "onesignal_gms_missing_alert_button_update", "Update");
            String f3 = f2.f(k2, "onesignal_gms_missing_alert_button_skip", "Skip");
            new AlertDialog.Builder(k2).setMessage(f).setPositiveButton(f2, new b(this, k2)).setNegativeButton(f3, new a(this)).setNeutralButton(f2.f(k2, "onesignal_gms_missing_alert_button_close", "Close"), (DialogInterface.OnClickListener) null).create().show();
        }
    }
}
