package h.a.b.c;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import androidx.annotation.RestrictTo;
import h.a.b.c.a;
import java.util.Objects;

@SuppressLint({"BanParcelableUsage"})
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new a();

    /* renamed from: h  reason: collision with root package name */
    public a f8039h;

    public class a implements Parcelable.Creator<b> {
        public Object createFromParcel(Parcel parcel) {
            return new b(parcel);
        }

        public Object[] newArray(int i2) {
            return new b[i2];
        }
    }

    /* renamed from: h.a.b.c.b$b  reason: collision with other inner class name */
    public class C0157b extends a.C0155a {
        public C0157b() {
        }

        public void j1(int i2, Bundle bundle) {
            Objects.requireNonNull(b.this);
            b.this.a(i2, bundle);
        }
    }

    public b(Parcel parcel) {
        a aVar;
        IBinder readStrongBinder = parcel.readStrongBinder();
        int i2 = a.C0155a.a;
        if (readStrongBinder == null) {
            aVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("android.support.v4.os.IResultReceiver");
            aVar = (queryLocalInterface == null || !(queryLocalInterface instanceof a)) ? new a.C0155a.C0156a(readStrongBinder) : (a) queryLocalInterface;
        }
        this.f8039h = aVar;
    }

    public void a(int i2, Bundle bundle) {
    }

    public void b(int i2, Bundle bundle) {
        a aVar = this.f8039h;
        if (aVar != null) {
            try {
                aVar.j1(i2, bundle);
            } catch (RemoteException unused) {
            }
        }
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i2) {
        synchronized (this) {
            if (this.f8039h == null) {
                this.f8039h = new C0157b();
            }
            parcel.writeStrongBinder(this.f8039h.asBinder());
        }
    }
}
