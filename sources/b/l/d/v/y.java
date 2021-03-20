package b.l.d.v;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import java.util.ArrayDeque;
import java.util.Queue;

public final class y {

    /* renamed from: e  reason: collision with root package name */
    public static y f5350e;
    @Nullable
    public String a = null;

    /* renamed from: b  reason: collision with root package name */
    public Boolean f5351b = null;
    public Boolean c = null;
    @VisibleForTesting
    public final Queue<Intent> d = new ArrayDeque();

    public static synchronized y a() {
        y yVar;
        synchronized (y.class) {
            if (f5350e == null) {
                f5350e = new y();
            }
            yVar = f5350e;
        }
        return yVar;
    }

    public final boolean b(Context context) {
        if (this.f5351b == null) {
            this.f5351b = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.WAKE_LOCK") == 0);
        }
        if (!this.f5351b.booleanValue() && Log.isLoggable("FirebaseInstanceId", 3)) {
            Log.d("FirebaseInstanceId", "Missing Permission: android.permission.WAKE_LOCK this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return this.f5351b.booleanValue();
    }
}
