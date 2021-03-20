package b.l.d.u;

import android.content.Context;
import android.content.SharedPreferences;
import java.text.SimpleDateFormat;
import java.util.Date;

public class g {

    /* renamed from: b  reason: collision with root package name */
    public static g f5301b;
    public static final SimpleDateFormat c = new SimpleDateFormat("dd/MM/yyyy z");
    public final SharedPreferences a;

    public g(Context context) {
        this.a = context.getSharedPreferences("FirebaseAppHeartBeat", 0);
        context.getSharedPreferences("FirebaseAppHeartBeatStorage", 0);
    }

    public synchronized boolean a(String str, long j2) {
        if (this.a.contains(str)) {
            Date date = new Date(this.a.getLong(str, -1));
            Date date2 = new Date(j2);
            SimpleDateFormat simpleDateFormat = c;
            if (!(!simpleDateFormat.format(date).equals(simpleDateFormat.format(date2)))) {
                return false;
            }
            this.a.edit().putLong(str, j2).apply();
            return true;
        }
        this.a.edit().putLong(str, j2).apply();
        return true;
    }
}
