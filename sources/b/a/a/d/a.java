package b.a.a.d;

import b.l.a.d.a.d.b;
import com.appfoundry.previewer.activities.BravoActivity;
import com.google.android.play.core.install.InstallState;
import e.x.c.i;

public final class a implements b {
    public final /* synthetic */ BravoActivity.c a;

    public a(BravoActivity.c cVar) {
        this.a = cVar;
    }

    public void a(Object obj) {
        BravoActivity bravoActivity;
        int i2;
        InstallState installState = (InstallState) obj;
        i.e(installState, "installState");
        if (installState.c() == 4) {
            BravoActivity bravoActivity2 = this.a.f6937h;
            int i3 = BravoActivity.t;
            bravoActivity2.s().e(this);
            this.a.f6937h.f6929m = true;
            return;
        }
        if (installState.c() == 11) {
            bravoActivity = this.a.f6937h;
            i2 = 99;
        } else if (installState.c() == 2) {
            BravoActivity bravoActivity3 = this.a.f6937h;
            if (bravoActivity3.f6929m) {
                BravoActivity.f(bravoActivity3, 98);
                this.a.f6937h.f6929m = false;
                return;
            }
            return;
        } else if (installState.c() == 5) {
            bravoActivity = this.a.f6937h;
            i2 = 500;
        } else {
            q.a.a.d.a("InstallStateUpdatedListener: state: %s", Integer.valueOf(installState.c()));
            return;
        }
        BravoActivity.f(bravoActivity, i2);
    }
}
