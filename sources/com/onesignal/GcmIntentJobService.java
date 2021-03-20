package com.onesignal;

import android.content.Intent;
import android.os.PersistableBundle;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import b.l.f.x.a.g;
import b.o.g0;
import b.o.j;

@RequiresApi(api = 21)
public class GcmIntentJobService extends JobIntentService {

    /* renamed from: o  reason: collision with root package name */
    public static final /* synthetic */ int f7381o = 0;

    public void d(@NonNull Intent intent) {
        j jVar = new j();
        jVar.a = (PersistableBundle) intent.getExtras().getParcelable("Bundle:Parcelable:Extras");
        g.b(this, jVar, (g0.a) null);
    }
}
