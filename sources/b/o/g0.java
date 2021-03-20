package b.o;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import com.onesignal.JobIntentService;
import java.util.List;

public abstract class g0 extends JobIntentService {

    public static class a {
        public Integer a;
    }

    public static Intent f(Context context) {
        PackageManager packageManager = context.getPackageManager();
        Intent intent = new Intent().setAction("com.onesignal.NotificationExtender").setPackage(context.getPackageName());
        List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(intent, 128);
        if (queryIntentServices.size() < 1) {
            return null;
        }
        intent.setComponent(new ComponentName(context, queryIntentServices.get(0).serviceInfo.name));
        return intent;
    }
}
