package b.o;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.service.notification.StatusBarNotification;
import android.text.TextUtils;
import androidx.annotation.WorkerThread;
import b.e.a.a.a;
import b.l.f.x.a.g;
import b.o.i2;
import com.onesignal.JobIntentService;
import com.onesignal.RestoreJobService;
import com.onesignal.RestoreKickoffJobService;
import com.segment.analytics.integrations.BasePayload;
import java.util.ArrayList;

public class n0 {
    public static final String[] a = {"android_notification_id", "full_data", "created_time"};

    /* renamed from: b  reason: collision with root package name */
    public static boolean f6208b;

    public static Intent a(Intent intent, Cursor cursor) {
        int i2 = cursor.getInt(cursor.getColumnIndex("android_notification_id"));
        String string = cursor.getString(cursor.getColumnIndex("full_data"));
        intent.putExtra("json_payload", string).putExtra("android_notif_id", i2).putExtra("restoring", true).putExtra(BasePayload.TIMESTAMP_KEY, Long.valueOf(cursor.getLong(cursor.getColumnIndex("created_time"))));
        return intent;
    }

    @WorkerThread
    public static void b(Context context) {
        i2.k kVar = i2.k.INFO;
        if (f2.a() && !f6208b) {
            f6208b = true;
            Cursor cursor = null;
            i2.a(kVar, "Restoring notifications", (Throwable) null);
            z2 e2 = z2.e(context);
            StringBuilder e0 = z2.e0();
            StatusBarNotification[] s = g.s(context);
            if (s.length != 0) {
                ArrayList arrayList = new ArrayList();
                for (StatusBarNotification id : s) {
                    arrayList.add(Integer.valueOf(id.getId()));
                }
                e0.append(" AND android_notification_id NOT IN (");
                e0.append(TextUtils.join(",", arrayList));
                e0.append(")");
            }
            StringBuilder y = a.y("Querying DB for notifs to restore: ");
            y.append(e0.toString());
            i2.a(kVar, y.toString(), (Throwable) null);
            try {
                cursor = e2.Y("notification", a, e0.toString(), (String[]) null, (String) null, (String) null, "_id DESC", i0.a);
                c(context, cursor, 200);
                g.b(e2, context);
                if (cursor.isClosed()) {
                    return;
                }
            } catch (Throwable th) {
                if (cursor != null && !cursor.isClosed()) {
                    cursor.close();
                }
                throw th;
            }
            cursor.close();
        }
    }

    public static void c(Context context, Cursor cursor, int i2) {
        int i3;
        ComponentName componentName;
        Intent intent;
        if (cursor.moveToFirst()) {
            boolean z = g0.f(context) != null;
            do {
                if (z) {
                    intent = g0.f(context);
                    a(intent, cursor);
                    componentName = intent.getComponent();
                    i3 = 2071862121;
                } else {
                    intent = new Intent();
                    a(intent, cursor);
                    componentName = new ComponentName(context, RestoreJobService.class);
                    i3 = 2071862122;
                }
                JobIntentService.a(context, componentName, i3, intent, false);
                if (i2 > 0) {
                    f2.v(i2);
                }
            } while (cursor.moveToNext());
        }
    }

    public static void d(Context context) {
        i2.a(i2.k.INFO, "scheduleRestoreKickoffJob", (Throwable) null);
        ((JobScheduler) context.getSystemService("jobscheduler")).schedule(new JobInfo.Builder(2071862120, new ComponentName(context, RestoreKickoffJobService.class)).setOverrideDeadline(15000).setMinimumLatency(15000).build());
    }
}
