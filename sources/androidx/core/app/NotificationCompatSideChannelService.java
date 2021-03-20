package androidx.core.app;

import android.app.Notification;
import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import h.a.b.a.a;

public abstract class NotificationCompatSideChannelService extends Service {

    public class NotificationSideChannelStub extends a.C0151a {
        public NotificationSideChannelStub() {
        }

        public void cancel(String str, int i2, String str2) {
            NotificationCompatSideChannelService.this.checkPermission(Binder.getCallingUid(), str);
            long clearCallingIdentity = Binder.clearCallingIdentity();
            try {
                NotificationCompatSideChannelService.this.cancel(str, i2, str2);
            } finally {
                Binder.restoreCallingIdentity(clearCallingIdentity);
            }
        }

        public void cancelAll(String str) {
            NotificationCompatSideChannelService.this.checkPermission(Binder.getCallingUid(), str);
            long clearCallingIdentity = Binder.clearCallingIdentity();
            try {
                NotificationCompatSideChannelService.this.cancelAll(str);
            } finally {
                Binder.restoreCallingIdentity(clearCallingIdentity);
            }
        }

        public void notify(String str, int i2, String str2, Notification notification) {
            NotificationCompatSideChannelService.this.checkPermission(Binder.getCallingUid(), str);
            long clearCallingIdentity = Binder.clearCallingIdentity();
            try {
                NotificationCompatSideChannelService.this.notify(str, i2, str2, notification);
            } finally {
                Binder.restoreCallingIdentity(clearCallingIdentity);
            }
        }
    }

    public abstract void cancel(String str, int i2, String str2);

    public abstract void cancelAll(String str);

    public void checkPermission(int i2, String str) {
        String[] packagesForUid = getPackageManager().getPackagesForUid(i2);
        int length = packagesForUid.length;
        int i3 = 0;
        while (i3 < length) {
            if (!packagesForUid[i3].equals(str)) {
                i3++;
            } else {
                return;
            }
        }
        throw new SecurityException("NotificationSideChannelService: Uid " + i2 + " is not authorized for package " + str);
    }

    public abstract void notify(String str, int i2, String str2, Notification notification);

    public IBinder onBind(Intent intent) {
        boolean equals = intent.getAction().equals(NotificationManagerCompat.ACTION_BIND_SIDE_CHANNEL);
        return null;
    }
}
