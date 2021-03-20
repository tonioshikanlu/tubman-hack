package b.l.a.d.a.e;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.Parcel;
import b.l.a.d.a.g.a;
import b.l.a.d.a.g.f;

public abstract class d extends h0 implements e {
    public d() {
        super("com.google.android.play.core.inappreview.protocol.IInAppReviewServiceCallback");
    }

    public final boolean g(int i2, Parcel parcel) {
        if (i2 != 2) {
            return false;
        }
        f fVar = (f) this;
        fVar.c.a.b();
        fVar.a.b(4, "onGetLaunchReviewFlowInfo", new Object[0]);
        fVar.f4687b.b(new a((PendingIntent) ((Bundle) i0.a(parcel, Bundle.CREATOR)).get("confirmation_intent")));
        return true;
    }
}
