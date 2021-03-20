package h.a.b.c;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import h.a.b.c.b;

public interface a extends IInterface {

    /* renamed from: h.a.b.c.a$a  reason: collision with other inner class name */
    public static abstract class C0155a extends Binder implements a {
        public static final /* synthetic */ int a = 0;

        /* renamed from: h.a.b.c.a$a$a  reason: collision with other inner class name */
        public static class C0156a implements a {
            public IBinder a;

            public C0156a(IBinder iBinder) {
                this.a = iBinder;
            }

            public IBinder asBinder() {
                return this.a;
            }

            public void j1(int i2, Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.os.IResultReceiver");
                    obtain.writeInt(i2);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (!this.a.transact(1, obtain, (Parcel) null, 1)) {
                        int i3 = C0155a.a;
                    }
                } finally {
                    obtain.recycle();
                }
            }
        }

        public C0155a() {
            attachInterface(this, "android.support.v4.os.IResultReceiver");
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i2, Parcel parcel, Parcel parcel2, int i3) {
            if (i2 == 1) {
                parcel.enforceInterface("android.support.v4.os.IResultReceiver");
                ((b.C0157b) this).j1(parcel.readInt(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                return true;
            } else if (i2 != 1598968902) {
                return super.onTransact(i2, parcel, parcel2, i3);
            } else {
                parcel2.writeString("android.support.v4.os.IResultReceiver");
                return true;
            }
        }
    }

    void j1(int i2, Bundle bundle);
}
