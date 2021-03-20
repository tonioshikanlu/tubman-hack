package b.o;

import android.content.Context;
import android.database.Cursor;
import android.service.notification.StatusBarNotification;
import androidx.annotation.RequiresApi;
import b.l.f.x.a.g;
import java.util.Map;
import java.util.TreeMap;

public class i0 {
    public static final String a = Integer.toString(49);

    public static void a(Context context, int i2) {
        z2 e2 = z2.e(context);
        Cursor cursor = null;
        try {
            cursor = e2.Y("notification", new String[]{"android_notification_id"}, z2.e0().toString(), (String[]) null, (String) null, (String) null, "_id", a + i2);
            int count = (cursor.getCount() - 49) + i2;
            if (count >= 1) {
                do {
                    if (!cursor.moveToNext()) {
                        break;
                    }
                    i2.f(cursor.getInt(cursor.getColumnIndex("android_notification_id")));
                    count--;
                } while (count > 0);
                if (cursor.isClosed()) {
                    return;
                }
                cursor.close();
            } else if (!cursor.isClosed()) {
                cursor.close();
            }
        } catch (Throwable th) {
            if (cursor != null && !cursor.isClosed()) {
                cursor.close();
            }
            throw th;
        }
    }

    @RequiresApi(api = 23)
    public static void b(Context context, int i2) {
        StatusBarNotification[] s = g.s(context);
        int length = (s.length - 49) + i2;
        if (length >= 1) {
            TreeMap treeMap = new TreeMap();
            for (StatusBarNotification statusBarNotification : s) {
                if (!c(statusBarNotification)) {
                    treeMap.put(Long.valueOf(statusBarNotification.getNotification().when), Integer.valueOf(statusBarNotification.getId()));
                }
            }
            for (Map.Entry value : treeMap.entrySet()) {
                i2.f(((Integer) value.getValue()).intValue());
                length--;
                if (length <= 0) {
                    return;
                }
            }
        }
    }

    @RequiresApi(api = 21)
    public static boolean c(StatusBarNotification statusBarNotification) {
        return (statusBarNotification.getNotification().flags & 512) != 0;
    }
}
