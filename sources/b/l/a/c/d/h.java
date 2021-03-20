package b.l.a.c.d;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.View;

public final class h implements View.OnClickListener {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ Context f2833h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ Intent f2834i;

    public h(Context context, Intent intent) {
        this.f2833h = context;
        this.f2834i = intent;
    }

    public final void onClick(View view) {
        try {
            this.f2833h.startActivity(this.f2834i);
        } catch (ActivityNotFoundException e2) {
            Log.e("DeferredLifecycleHelper", "Failed to start resolution intent", e2);
        }
    }
}
