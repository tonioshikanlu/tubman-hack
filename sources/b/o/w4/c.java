package b.o.w4;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.Build;
import android.util.Log;
import b.e.a.a.a;
import com.onesignal.shortcutbadger.impl.AdwHomeBadger;
import com.onesignal.shortcutbadger.impl.ApexHomeBadger;
import com.onesignal.shortcutbadger.impl.AsusHomeBadger;
import com.onesignal.shortcutbadger.impl.DefaultBadger;
import com.onesignal.shortcutbadger.impl.EverythingMeHomeBadger;
import com.onesignal.shortcutbadger.impl.HuaweiHomeBadger;
import com.onesignal.shortcutbadger.impl.NewHtcHomeBadger;
import com.onesignal.shortcutbadger.impl.NovaHomeBadger;
import com.onesignal.shortcutbadger.impl.OPPOHomeBader;
import com.onesignal.shortcutbadger.impl.SamsungHomeBadger;
import com.onesignal.shortcutbadger.impl.SonyHomeBadger;
import com.onesignal.shortcutbadger.impl.VivoHomeBadger;
import com.onesignal.shortcutbadger.impl.ZukHomeBadger;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class c {
    public static final List<Class<? extends a>> a;

    /* renamed from: b  reason: collision with root package name */
    public static a f6345b;
    public static ComponentName c;

    static {
        LinkedList linkedList = new LinkedList();
        a = linkedList;
        linkedList.add(AdwHomeBadger.class);
        linkedList.add(ApexHomeBadger.class);
        linkedList.add(NewHtcHomeBadger.class);
        linkedList.add(NovaHomeBadger.class);
        linkedList.add(SonyHomeBadger.class);
        linkedList.add(AsusHomeBadger.class);
        linkedList.add(HuaweiHomeBadger.class);
        linkedList.add(OPPOHomeBader.class);
        linkedList.add(SamsungHomeBadger.class);
        linkedList.add(ZukHomeBadger.class);
        linkedList.add(VivoHomeBadger.class);
        linkedList.add(EverythingMeHomeBadger.class);
    }

    public static void a(Context context, int i2) {
        if (f6345b == null) {
            Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(context.getPackageName());
            boolean z = false;
            if (launchIntentForPackage == null) {
                StringBuilder y = a.y("Unable to find launch intent for package ");
                y.append(context.getPackageName());
                Log.e("ShortcutBadger", y.toString());
            } else {
                c = launchIntentForPackage.getComponent();
                Intent intent = new Intent("android.intent.action.MAIN");
                intent.addCategory("android.intent.category.HOME");
                ResolveInfo resolveActivity = context.getPackageManager().resolveActivity(intent, 65536);
                if (resolveActivity != null && !resolveActivity.activityInfo.name.toLowerCase().contains("resolver")) {
                    String str = resolveActivity.activityInfo.packageName;
                    Iterator<Class<? extends a>> it = a.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        a aVar = null;
                        try {
                            aVar = (a) it.next().newInstance();
                        } catch (Exception unused) {
                        }
                        if (aVar != null && aVar.a().contains(str)) {
                            f6345b = aVar;
                            break;
                        }
                    }
                    if (f6345b == null) {
                        String str2 = Build.MANUFACTURER;
                        f6345b = str2.equalsIgnoreCase("ZUK") ? new ZukHomeBadger() : str2.equalsIgnoreCase("OPPO") ? new OPPOHomeBader() : str2.equalsIgnoreCase("VIVO") ? new VivoHomeBadger() : new DefaultBadger();
                    }
                    z = true;
                }
            }
            if (!z) {
                throw new b("No default launcher available");
            }
        }
        try {
            f6345b.b(context, c, i2);
        } catch (Exception e2) {
            throw new b("Unable to execute badge", e2);
        }
    }
}
