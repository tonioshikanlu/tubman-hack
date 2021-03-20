package b.o;

import android.app.Activity;
import android.content.Intent;
import androidx.annotation.NonNull;
import app.bravostudio.A01F175WZXYVE9FWM81EKWKN6FN.R;
import b.o.a;
import com.onesignal.PermissionsActivity;

public final class t3 extends a.b {
    public void a(@NonNull Activity activity) {
        if (!activity.getClass().equals(PermissionsActivity.class)) {
            Intent intent = new Intent(activity, PermissionsActivity.class);
            intent.setFlags(131072);
            activity.startActivity(intent);
            activity.overridePendingTransition(R.anim.onesignal_fade_in, R.anim.onesignal_fade_out);
        }
    }
}
