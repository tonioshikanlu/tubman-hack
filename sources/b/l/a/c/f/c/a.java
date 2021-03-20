package b.l.a.c.f.c;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import b.l.a.c.c.b;
import b.l.a.c.j.b.c;
import b.l.a.c.j.b.g;
import b.l.a.c.j.b.l;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Status;

public class a extends Binder implements IInterface {
    public a(String str) {
        attachInterface(this, str);
    }

    public IBinder asBinder() {
        return this;
    }

    public boolean onTransact(int i2, Parcel parcel, Parcel parcel2, int i3) {
        boolean z;
        if (i2 > 16777215) {
            z = super.onTransact(i2, parcel, parcel2, i3);
        } else {
            parcel.enforceInterface(getInterfaceDescriptor());
            z = false;
        }
        if (z) {
            return true;
        }
        g gVar = (g) this;
        if (i2 == 3) {
            b bVar = (b) b.a(parcel, b.CREATOR);
            c cVar = (c) b.a(parcel, c.CREATOR);
        } else if (i2 == 4 || i2 == 6) {
            Status status = (Status) b.a(parcel, Status.CREATOR);
        } else if (i2 == 7) {
            Status status2 = (Status) b.a(parcel, Status.CREATOR);
            GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) b.a(parcel, GoogleSignInAccount.CREATOR);
        } else if (i2 != 8) {
            return false;
        } else {
            gVar.h0((l) b.a(parcel, l.CREATOR));
        }
        parcel2.writeNoException();
        return true;
    }
}
