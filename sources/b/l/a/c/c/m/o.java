package b.l.a.c.c.m;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.util.Log;
import b.l.a.c.c.m.b;
import b.l.a.c.f.d.c;
import java.util.Objects;

public interface o extends IInterface {

    public static abstract class a extends b.l.a.c.f.d.a implements o {
        public a() {
            super("com.google.android.gms.common.internal.IGmsCallbacks");
        }

        public final boolean g(int i2, Parcel parcel, Parcel parcel2, int i3) {
            if (i2 == 1) {
                ((b.i) this).k1(parcel.readInt(), parcel.readStrongBinder(), (Bundle) c.a(parcel, Bundle.CREATOR));
            } else if (i2 == 2) {
                parcel.readInt();
                Bundle bundle = (Bundle) c.a(parcel, Bundle.CREATOR);
                Log.wtf("GmsClient", "received deprecated onAccountValidationComplete callback, ignoring", new Exception());
            } else if (i2 != 3) {
                return false;
            } else {
                int readInt = parcel.readInt();
                IBinder readStrongBinder = parcel.readStrongBinder();
                c0 c0Var = (c0) c.a(parcel, c0.CREATOR);
                b.i iVar = (b.i) this;
                b.l.a.c.b.a.B(iVar.a, "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService");
                Objects.requireNonNull(c0Var, "null reference");
                iVar.a.y = c0Var;
                iVar.k1(readInt, readStrongBinder, c0Var.f2767h);
            }
            parcel2.writeNoException();
            return true;
        }
    }

    void k1(int i2, IBinder iBinder, Bundle bundle);
}
