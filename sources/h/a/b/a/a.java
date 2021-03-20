package h.a.b.a;

import android.app.Notification;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public interface a extends IInterface {

    /* renamed from: h.a.b.a.a$a  reason: collision with other inner class name */
    public static abstract class C0151a extends Binder implements a {
        private static final String DESCRIPTOR = "android.support.v4.app.INotificationSideChannel";
        public static final int TRANSACTION_cancel = 2;
        public static final int TRANSACTION_cancelAll = 3;
        public static final int TRANSACTION_notify = 1;

        /* renamed from: h.a.b.a.a$a$a  reason: collision with other inner class name */
        public static class C0152a implements a {

            /* renamed from: b  reason: collision with root package name */
            public static a f8038b;
            public IBinder a;

            public C0152a(IBinder iBinder) {
                this.a = iBinder;
            }

            public IBinder asBinder() {
                return this.a;
            }

            public void cancel(String str, int i2, String str2) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(C0151a.DESCRIPTOR);
                    obtain.writeString(str);
                    obtain.writeInt(i2);
                    obtain.writeString(str2);
                    if (this.a.transact(2, obtain, (Parcel) null, 1) || C0151a.getDefaultImpl() == null) {
                        obtain.recycle();
                    } else {
                        C0151a.getDefaultImpl().cancel(str, i2, str2);
                    }
                } finally {
                    obtain.recycle();
                }
            }

            public void cancelAll(String str) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(C0151a.DESCRIPTOR);
                    obtain.writeString(str);
                    if (this.a.transact(3, obtain, (Parcel) null, 1) || C0151a.getDefaultImpl() == null) {
                        obtain.recycle();
                    } else {
                        C0151a.getDefaultImpl().cancelAll(str);
                    }
                } finally {
                    obtain.recycle();
                }
            }

            public void notify(String str, int i2, String str2, Notification notification) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(C0151a.DESCRIPTOR);
                    obtain.writeString(str);
                    obtain.writeInt(i2);
                    obtain.writeString(str2);
                    if (notification != null) {
                        obtain.writeInt(1);
                        notification.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (this.a.transact(1, obtain, (Parcel) null, 1) || C0151a.getDefaultImpl() == null) {
                        obtain.recycle();
                    } else {
                        C0151a.getDefaultImpl().notify(str, i2, str2, notification);
                    }
                } finally {
                    obtain.recycle();
                }
            }
        }

        public C0151a() {
            attachInterface(this, DESCRIPTOR);
        }

        public static a asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof a)) ? new C0152a(iBinder) : (a) queryLocalInterface;
        }

        public static a getDefaultImpl() {
            return C0152a.f8038b;
        }

        public static boolean setDefaultImpl(a aVar) {
            if (C0152a.f8038b != null || aVar == null) {
                return false;
            }
            C0152a.f8038b = aVar;
            return true;
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i2, Parcel parcel, Parcel parcel2, int i3) {
            if (i2 == 1) {
                parcel.enforceInterface(DESCRIPTOR);
                notify(parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readInt() != 0 ? (Notification) Notification.CREATOR.createFromParcel(parcel) : null);
                return true;
            } else if (i2 == 2) {
                parcel.enforceInterface(DESCRIPTOR);
                cancel(parcel.readString(), parcel.readInt(), parcel.readString());
                return true;
            } else if (i2 == 3) {
                parcel.enforceInterface(DESCRIPTOR);
                cancelAll(parcel.readString());
                return true;
            } else if (i2 != 1598968902) {
                return super.onTransact(i2, parcel, parcel2, i3);
            } else {
                parcel2.writeString(DESCRIPTOR);
                return true;
            }
        }
    }

    void cancel(String str, int i2, String str2);

    void cancelAll(String str);

    void notify(String str, int i2, String str2, Notification notification);
}
