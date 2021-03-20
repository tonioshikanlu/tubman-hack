package b.l.a.c.c.l.k;

import android.app.PendingIntent;
import android.os.DeadObjectException;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import b.l.a.c.c.l.a;
import b.l.a.c.c.l.a.b;
import b.l.a.c.c.l.h;
import b.l.a.c.c.m.u;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import java.util.Objects;

public abstract class d<R extends h, A extends a.b> extends BasePendingResult<R> implements e<R> {

    /* renamed from: o  reason: collision with root package name */
    public final a.c<A> f2624o;

    /* renamed from: p  reason: collision with root package name */
    public final a<?> f2625p;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d(@NonNull a<?> aVar, @NonNull GoogleApiClient googleApiClient) {
        super(googleApiClient);
        b.l.a.c.b.a.B(googleApiClient, "GoogleApiClient must not be null");
        b.l.a.c.b.a.B(aVar, "Api must not be null");
        this.f2624o = aVar.a();
        this.f2625p = aVar;
    }

    public abstract void j(@NonNull A a);

    public final void k(@NonNull A a) {
        if (a instanceof u) {
            Objects.requireNonNull((u) a);
            a = null;
        }
        try {
            j(a);
        } catch (DeadObjectException e2) {
            l(new Status(1, 8, e2.getLocalizedMessage(), (PendingIntent) null));
            throw e2;
        } catch (RemoteException e3) {
            l(new Status(1, 8, e3.getLocalizedMessage(), (PendingIntent) null));
        }
    }

    public final void l(@NonNull Status status) {
        b.l.a.c.b.a.k(!status.V(), "Failed result must not be success");
        e(b(status));
    }
}
