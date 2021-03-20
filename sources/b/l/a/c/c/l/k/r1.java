package b.l.a.c.c.l.k;

import android.os.DeadObjectException;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import b.l.a.c.c.l.b;
import b.l.a.c.c.l.k.g;
import b.l.a.c.k.i;
import com.google.android.gms.common.api.Status;

public abstract class r1<T> extends l0 {
    public final i<T> a;

    public r1(int i2, i<T> iVar) {
        super(i2);
        this.a = iVar;
    }

    public void a(@NonNull Status status) {
        this.a.a(new b(status));
    }

    public void c(@NonNull RuntimeException runtimeException) {
        this.a.a(runtimeException);
    }

    public final void e(g.a<?> aVar) {
        try {
            h(aVar);
        } catch (DeadObjectException e2) {
            this.a.a(new b(g1.d(e2)));
            throw e2;
        } catch (RemoteException e3) {
            this.a.a(new b(g1.d(e3)));
        } catch (RuntimeException e4) {
            this.a.a(e4);
        }
    }

    public abstract void h(g.a<?> aVar);
}
