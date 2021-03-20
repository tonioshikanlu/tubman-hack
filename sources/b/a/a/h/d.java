package b.a.a.h;

import android.widget.Toast;
import com.appfoundry.previewer.activities.BravoActivity;
import e.x.c.i;

public final class d implements Runnable {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ BravoActivity f257h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ String f258i;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ String f259j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ int f260k;

    public d(BravoActivity bravoActivity, String str, String str2, int i2) {
        this.f257h = bravoActivity;
        this.f258i = str;
        this.f259j = str2;
        this.f260k = i2;
    }

    public final void run() {
        String str;
        BravoActivity bravoActivity = this.f257h;
        String str2 = this.f258i;
        if (str2 == null || !(!i.a(str2, ""))) {
            str = this.f259j;
        } else {
            str = this.f259j + ": " + this.f258i;
        }
        Toast.makeText(bravoActivity, str, this.f260k).show();
    }
}
