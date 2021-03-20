package h.a.b.b.g;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import h.a.b.b.g.a;

public interface b extends IInterface {

    public static abstract class a extends Binder implements b {

        /* renamed from: h.a.b.b.g.b$a$a  reason: collision with other inner class name */
        public static class C0154a implements b {
            public IBinder a;

            public C0154a(IBinder iBinder) {
                this.a = iBinder;
            }

            public IBinder asBinder() {
                return this.a;
            }

            public void y(a aVar) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    obtain.writeStrongBinder((a.C0153a) aVar);
                    this.a.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public static b g(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("android.support.v4.media.session.IMediaSession");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof b)) ? new C0154a(iBinder) : (b) queryLocalInterface;
        }
    }

    void y(a aVar);
}
