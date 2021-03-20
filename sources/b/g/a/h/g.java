package b.g.a.h;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.Log;
import androidx.browser.customtabs.CustomTabsIntent;
import androidx.core.content.ContextCompat;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

public class g implements Runnable {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ Context f424h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ Uri f425i;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ h f426j;

    public g(h hVar, Context context, Uri uri) {
        this.f426j = hVar;
        this.f424h = context;
        this.f425i = uri;
    }

    public void run() {
        boolean z;
        try {
            h hVar = this.f426j;
            z = hVar.c.await(hVar.d == null ? 0 : 1, TimeUnit.SECONDS);
        } catch (InterruptedException unused) {
            z = false;
        }
        String str = h.f427g;
        String str2 = h.f427g;
        Log.d(str2, "Launching URI. Custom Tabs available: " + z);
        h hVar2 = this.f426j;
        i iVar = hVar2.f429e;
        Context context = this.f424h;
        Objects.requireNonNull(iVar);
        CustomTabsIntent.Builder showTitle = new CustomTabsIntent.Builder(hVar2.f428b.get()).setShowTitle(iVar.f430h);
        int i2 = iVar.f431i;
        if (i2 > 0) {
            showTitle.setToolbarColor(ContextCompat.getColor(context, i2));
        }
        Intent intent = showTitle.build().intent;
        intent.setData(this.f425i);
        try {
            this.f424h.startActivity(intent);
        } catch (ActivityNotFoundException unused2) {
            String str3 = h.f427g;
            Log.e(h.f427g, "Could not find any Browser application installed in this device to handle the intent.");
        }
    }
}
