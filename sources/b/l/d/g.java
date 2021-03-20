package b.l.d;

import android.content.Context;
import android.os.Build;

public final /* synthetic */ class g implements b.l.d.a0.g {
    public static final g a = new g();

    public String a(Object obj) {
        Context context = (Context) obj;
        int i2 = Build.VERSION.SDK_INT;
        if (context.getPackageManager().hasSystemFeature("android.hardware.type.television")) {
            return "tv";
        }
        if (context.getPackageManager().hasSystemFeature("android.hardware.type.watch")) {
            return "watch";
        }
        if (context.getPackageManager().hasSystemFeature("android.hardware.type.automotive")) {
            return "auto";
        }
        return (i2 < 26 || !context.getPackageManager().hasSystemFeature("android.hardware.type.embedded")) ? "" : "embedded";
    }
}
