package b.l.a.c.c;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import b.l.a.c.c.m.j0;
import b.l.a.c.c.m.k0;
import b.l.a.c.c.m.v.a;
import b.l.a.c.d.b;
import b.l.a.c.d.d;
import java.util.Objects;

public final class a0 extends a {
    public static final Parcelable.Creator<a0> CREATOR = new d0();

    /* renamed from: h  reason: collision with root package name */
    public final String f2582h;

    /* renamed from: i  reason: collision with root package name */
    public final u f2583i;

    /* renamed from: j  reason: collision with root package name */
    public final boolean f2584j;

    /* renamed from: k  reason: collision with root package name */
    public final boolean f2585k;

    public a0(String str, IBinder iBinder, boolean z, boolean z2) {
        this.f2582h = str;
        x xVar = null;
        if (iBinder != null) {
            try {
                int i2 = u.f2829b;
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.ICertData");
                b b2 = (queryLocalInterface instanceof j0 ? (j0) queryLocalInterface : new k0(iBinder)).b();
                byte[] bArr = b2 == null ? null : (byte[]) d.n(b2);
                if (bArr != null) {
                    xVar = new x(bArr);
                } else {
                    Log.e("GoogleCertificatesQuery", "Could not unwrap certificate");
                }
            } catch (RemoteException e2) {
                Log.e("GoogleCertificatesQuery", "Could not unwrap certificate", e2);
            }
        }
        this.f2583i = xVar;
        this.f2584j = z;
        this.f2585k = z2;
    }

    public a0(String str, u uVar, boolean z, boolean z2) {
        this.f2582h = str;
        this.f2583i = uVar;
        this.f2584j = z;
        this.f2585k = z2;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int P0 = b.l.a.c.b.a.P0(parcel, 20293);
        b.l.a.c.b.a.K0(parcel, 1, this.f2582h, false);
        u uVar = this.f2583i;
        if (uVar == null) {
            Log.w("GoogleCertificatesQuery", "certificate binder is null");
            uVar = null;
        } else {
            Objects.requireNonNull(uVar);
        }
        b.l.a.c.b.a.H0(parcel, 2, uVar, false);
        boolean z = this.f2584j;
        b.l.a.c.b.a.I1(parcel, 3, 4);
        parcel.writeInt(z ? 1 : 0);
        boolean z2 = this.f2585k;
        b.l.a.c.b.a.I1(parcel, 4, 4);
        parcel.writeInt(z2 ? 1 : 0);
        b.l.a.c.b.a.H1(parcel, P0);
    }
}
