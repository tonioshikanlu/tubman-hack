package androidx.core.app;

import android.app.AlarmManager;
import android.app.PendingIntent;
import androidx.annotation.NonNull;

public final class AlarmManagerCompat {
    private AlarmManagerCompat() {
    }

    public static void setAlarmClock(@NonNull AlarmManager alarmManager, long j2, @NonNull PendingIntent pendingIntent, @NonNull PendingIntent pendingIntent2) {
        alarmManager.setAlarmClock(new AlarmManager.AlarmClockInfo(j2, pendingIntent), pendingIntent2);
    }

    public static void setAndAllowWhileIdle(@NonNull AlarmManager alarmManager, int i2, long j2, @NonNull PendingIntent pendingIntent) {
        alarmManager.setAndAllowWhileIdle(i2, j2, pendingIntent);
    }

    public static void setExact(@NonNull AlarmManager alarmManager, int i2, long j2, @NonNull PendingIntent pendingIntent) {
        alarmManager.setExact(i2, j2, pendingIntent);
    }

    public static void setExactAndAllowWhileIdle(@NonNull AlarmManager alarmManager, int i2, long j2, @NonNull PendingIntent pendingIntent) {
        alarmManager.setExactAndAllowWhileIdle(i2, j2, pendingIntent);
    }
}
