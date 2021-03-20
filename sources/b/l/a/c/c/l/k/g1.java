package b.l.a.c.c.l.k;

import android.os.RemoteException;
import android.os.TransactionTooLargeException;
import androidx.annotation.NonNull;
import b.l.a.c.c.l.k.g;
import com.google.android.gms.common.api.Status;

public abstract class g1 {
    public g1(int i2) {
    }

    public static Status d(RemoteException remoteException) {
        StringBuilder sb = new StringBuilder();
        if (remoteException instanceof TransactionTooLargeException) {
            sb.append("TransactionTooLargeException: ");
        }
        sb.append(remoteException.getLocalizedMessage());
        return new Status(8, sb.toString());
    }

    public abstract void a(@NonNull Status status);

    public abstract void b(@NonNull c2 c2Var, boolean z);

    public abstract void c(@NonNull RuntimeException runtimeException);

    public abstract void e(g.a<?> aVar);
}
