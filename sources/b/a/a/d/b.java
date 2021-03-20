package b.a.a.d;

import android.content.IntentSender;
import android.os.Build;
import b.l.a.d.a.a.a;
import b.l.a.d.a.i.c;
import com.appfoundry.previewer.activities.BravoActivity;

public final class b<ResultT> implements c<a> {
    public final /* synthetic */ BravoActivity a;

    public b(BravoActivity bravoActivity) {
        this.a = bravoActivity;
    }

    public void a(Object obj) {
        a aVar = (a) obj;
        if (aVar.o() == 2) {
            try {
                Integer num = aVar.j(b.l.a.d.a.a.c.c(0)) != null ? 0 : null;
                if (num != null) {
                    if (num.intValue() == 0) {
                        BravoActivity bravoActivity = this.a;
                        int i2 = BravoActivity.t;
                        bravoActivity.s().c((b.l.a.d.a.d.b) this.a.f6931o.getValue());
                    }
                }
                if (num != null) {
                    BravoActivity bravoActivity2 = this.a;
                    int i3 = BravoActivity.t;
                    bravoActivity2.s().d(aVar, num.intValue(), this.a, 55);
                    return;
                }
                q.a.a.d.b("Device does not allow Google Play In-App Updates: %s - %s - %s", Build.BRAND, Build.MODEL, Build.PRODUCT);
            } catch (IntentSender.SendIntentException e2) {
                e2.printStackTrace();
            }
        }
    }
}
