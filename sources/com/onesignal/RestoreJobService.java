package com.onesignal;

import android.content.Intent;
import android.os.Bundle;
import b.l.f.x.a.g;
import b.o.g0;
import b.o.i;

public class RestoreJobService extends JobIntentService {
    public final void d(Intent intent) {
        Bundle extras;
        if (intent != null && (extras = intent.getExtras()) != null) {
            g.b(getApplicationContext(), new i(extras), (g0.a) null);
        }
    }
}
