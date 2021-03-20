package b.a.a.d;

import android.content.Intent;
import b.l.a.d.a.g.b;
import b.l.a.d.a.g.c;
import b.l.a.d.a.i.a;
import b.l.a.d.a.i.e;
import b.l.a.d.a.i.g;
import b.l.a.d.a.i.n;
import b.l.a.d.a.i.r;
import com.appfoundry.previewer.activities.BravoActivity;
import com.google.android.play.core.common.PlayCoreDialogWrapperActivity;
import com.google.android.play.core.review.ReviewInfo;
import e.x.c.i;
import java.util.Objects;
import java.util.concurrent.Executor;

public final class m<ResultT> implements a<ReviewInfo> {
    public final /* synthetic */ BravoActivity a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ c f231b;
    public final /* synthetic */ int c;

    public m(BravoActivity bravoActivity, c cVar, int i2) {
        this.a = bravoActivity;
        this.f231b = cVar;
        this.c = i2;
    }

    public final void a(r<ReviewInfo> rVar) {
        i.e(rVar, "request");
        if (rVar.g()) {
            ReviewInfo f = rVar.f();
            i.d(f, "request.result");
            c cVar = this.f231b;
            BravoActivity bravoActivity = this.a;
            Objects.requireNonNull(cVar);
            Intent intent = new Intent(bravoActivity, PlayCoreDialogWrapperActivity.class);
            intent.putExtra("confirmation_intent", f.a());
            intent.putExtra("window_flags", bravoActivity.getWindow().getDecorView().getWindowSystemUiVisibility());
            n nVar = new n();
            intent.putExtra("result_receiver", new b(cVar.f4684b, nVar));
            bravoActivity.startActivity(intent);
            r<ResultT> rVar2 = nVar.a;
            i.d(rVar2, "manager.launchReviewFlow(this, reviewInfo)");
            j jVar = new j(this);
            Executor executor = e.a;
            rVar2.f4701b.a(new g(executor, jVar));
            rVar2.e();
            rVar2.b(executor, new k(this));
            rVar2.c(executor, new l(this));
        }
    }
}
