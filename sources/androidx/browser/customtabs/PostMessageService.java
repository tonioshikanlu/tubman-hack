package androidx.browser.customtabs;

import android.app.Service;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import h.a.a.a;
import h.a.a.c;

public class PostMessageService extends Service {
    private c.a mBinder = new c.a() {
        public void onMessageChannelReady(a aVar, Bundle bundle) {
            aVar.onMessageChannelReady(bundle);
        }

        public void onPostMessage(a aVar, String str, Bundle bundle) {
            aVar.onPostMessage(str, bundle);
        }
    };

    public IBinder onBind(Intent intent) {
        return this.mBinder;
    }
}
