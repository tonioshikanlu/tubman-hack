package h.a.a;

import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import java.util.List;

public interface b extends IInterface {

    public static abstract class a extends Binder implements b {
        private static final String DESCRIPTOR = "android.support.customtabs.ICustomTabsService";
        public static final int TRANSACTION_extraCommand = 5;
        public static final int TRANSACTION_mayLaunchUrl = 4;
        public static final int TRANSACTION_newSession = 3;
        public static final int TRANSACTION_postMessage = 8;
        public static final int TRANSACTION_requestPostMessageChannel = 7;
        public static final int TRANSACTION_updateVisuals = 6;
        public static final int TRANSACTION_validateRelationship = 9;
        public static final int TRANSACTION_warmup = 2;

        /* renamed from: h.a.a.b$a$a  reason: collision with other inner class name */
        public static class C0149a implements b {
            public IBinder a;

            public C0149a(IBinder iBinder) {
                this.a = iBinder;
            }

            public IBinder asBinder() {
                return this.a;
            }

            public Bundle extraCommand(String str, Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(a.DESCRIPTOR);
                    obtain.writeString(str);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.a.transact(5, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(obtain2) : null;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public boolean mayLaunchUrl(a aVar, Uri uri, Bundle bundle, List<Bundle> list) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(a.DESCRIPTOR);
                    obtain.writeStrongBinder(aVar != null ? aVar.asBinder() : null);
                    boolean z = true;
                    if (uri != null) {
                        obtain.writeInt(1);
                        uri.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeTypedList(list);
                    this.a.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() == 0) {
                        z = false;
                    }
                    return z;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public boolean newSession(a aVar) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(a.DESCRIPTOR);
                    obtain.writeStrongBinder(aVar.asBinder());
                    boolean z = false;
                    this.a.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        z = true;
                    }
                    return z;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public int postMessage(a aVar, String str, Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(a.DESCRIPTOR);
                    obtain.writeStrongBinder(aVar != null ? aVar.asBinder() : null);
                    obtain.writeString(str);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.a.transact(8, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public boolean requestPostMessageChannel(a aVar, Uri uri) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(a.DESCRIPTOR);
                    obtain.writeStrongBinder(aVar != null ? aVar.asBinder() : null);
                    boolean z = true;
                    if (uri != null) {
                        obtain.writeInt(1);
                        uri.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.a.transact(7, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() == 0) {
                        z = false;
                    }
                    return z;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public boolean updateVisuals(a aVar, Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(a.DESCRIPTOR);
                    obtain.writeStrongBinder(aVar != null ? aVar.asBinder() : null);
                    boolean z = true;
                    obtain.writeInt(1);
                    bundle.writeToParcel(obtain, 0);
                    this.a.transact(6, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() == 0) {
                        z = false;
                    }
                    return z;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public boolean validateRelationship(a aVar, int i2, Uri uri, Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(a.DESCRIPTOR);
                    obtain.writeStrongBinder(aVar != null ? aVar.asBinder() : null);
                    obtain.writeInt(i2);
                    boolean z = true;
                    if (uri != null) {
                        obtain.writeInt(1);
                        uri.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.a.transact(9, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() == 0) {
                        z = false;
                    }
                    return z;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public boolean warmup(long j2) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(a.DESCRIPTOR);
                    obtain.writeLong(j2);
                    boolean z = false;
                    this.a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        z = true;
                    }
                    return z;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public a() {
            attachInterface(this, DESCRIPTOR);
        }

        public static b asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof b)) ? new C0149a(iBinder) : (b) queryLocalInterface;
        }

        public IBinder asBinder() {
            return this;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: android.os.Bundle} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: android.os.Bundle} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v9, resolved type: android.os.Bundle} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v12, resolved type: android.net.Uri} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v15, resolved type: android.os.Bundle} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v19, resolved type: android.os.Bundle} */
        /* JADX WARNING: type inference failed for: r0v1 */
        /* JADX WARNING: type inference failed for: r0v23 */
        /* JADX WARNING: type inference failed for: r0v24 */
        /* JADX WARNING: type inference failed for: r0v25 */
        /* JADX WARNING: type inference failed for: r0v26 */
        /* JADX WARNING: type inference failed for: r0v27 */
        /* JADX WARNING: type inference failed for: r0v28 */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean onTransact(int r5, android.os.Parcel r6, android.os.Parcel r7, int r8) {
            /*
                r4 = this;
                r0 = 1598968902(0x5f4e5446, float:1.4867585E19)
                java.lang.String r1 = "android.support.customtabs.ICustomTabsService"
                r2 = 1
                if (r5 == r0) goto L_0x014a
                r0 = 0
                switch(r5) {
                    case 2: goto L_0x0138;
                    case 3: goto L_0x0122;
                    case 4: goto L_0x00e8;
                    case 5: goto L_0x00bd;
                    case 6: goto L_0x0098;
                    case 7: goto L_0x0073;
                    case 8: goto L_0x004a;
                    case 9: goto L_0x0011;
                    default: goto L_0x000c;
                }
            L_0x000c:
                boolean r5 = super.onTransact(r5, r6, r7, r8)
                return r5
            L_0x0011:
                r6.enforceInterface(r1)
                android.os.IBinder r5 = r6.readStrongBinder()
                h.a.a.a r5 = h.a.a.a.C0147a.asInterface(r5)
                int r8 = r6.readInt()
                int r1 = r6.readInt()
                if (r1 == 0) goto L_0x002f
                android.os.Parcelable$Creator r1 = android.net.Uri.CREATOR
                java.lang.Object r1 = r1.createFromParcel(r6)
                android.net.Uri r1 = (android.net.Uri) r1
                goto L_0x0030
            L_0x002f:
                r1 = r0
            L_0x0030:
                int r3 = r6.readInt()
                if (r3 == 0) goto L_0x003f
                android.os.Parcelable$Creator r0 = android.os.Bundle.CREATOR
                java.lang.Object r6 = r0.createFromParcel(r6)
                r0 = r6
                android.os.Bundle r0 = (android.os.Bundle) r0
            L_0x003f:
                boolean r5 = r4.validateRelationship(r5, r8, r1, r0)
                r7.writeNoException()
                r7.writeInt(r5)
                return r2
            L_0x004a:
                r6.enforceInterface(r1)
                android.os.IBinder r5 = r6.readStrongBinder()
                h.a.a.a r5 = h.a.a.a.C0147a.asInterface(r5)
                java.lang.String r8 = r6.readString()
                int r1 = r6.readInt()
                if (r1 == 0) goto L_0x0068
                android.os.Parcelable$Creator r0 = android.os.Bundle.CREATOR
                java.lang.Object r6 = r0.createFromParcel(r6)
                r0 = r6
                android.os.Bundle r0 = (android.os.Bundle) r0
            L_0x0068:
                int r5 = r4.postMessage(r5, r8, r0)
                r7.writeNoException()
                r7.writeInt(r5)
                return r2
            L_0x0073:
                r6.enforceInterface(r1)
                android.os.IBinder r5 = r6.readStrongBinder()
                h.a.a.a r5 = h.a.a.a.C0147a.asInterface(r5)
                int r8 = r6.readInt()
                if (r8 == 0) goto L_0x008d
                android.os.Parcelable$Creator r8 = android.net.Uri.CREATOR
                java.lang.Object r6 = r8.createFromParcel(r6)
                r0 = r6
                android.net.Uri r0 = (android.net.Uri) r0
            L_0x008d:
                boolean r5 = r4.requestPostMessageChannel(r5, r0)
                r7.writeNoException()
                r7.writeInt(r5)
                return r2
            L_0x0098:
                r6.enforceInterface(r1)
                android.os.IBinder r5 = r6.readStrongBinder()
                h.a.a.a r5 = h.a.a.a.C0147a.asInterface(r5)
                int r8 = r6.readInt()
                if (r8 == 0) goto L_0x00b2
                android.os.Parcelable$Creator r8 = android.os.Bundle.CREATOR
                java.lang.Object r6 = r8.createFromParcel(r6)
                r0 = r6
                android.os.Bundle r0 = (android.os.Bundle) r0
            L_0x00b2:
                boolean r5 = r4.updateVisuals(r5, r0)
                r7.writeNoException()
                r7.writeInt(r5)
                return r2
            L_0x00bd:
                r6.enforceInterface(r1)
                java.lang.String r5 = r6.readString()
                int r8 = r6.readInt()
                if (r8 == 0) goto L_0x00d3
                android.os.Parcelable$Creator r8 = android.os.Bundle.CREATOR
                java.lang.Object r6 = r8.createFromParcel(r6)
                r0 = r6
                android.os.Bundle r0 = (android.os.Bundle) r0
            L_0x00d3:
                android.os.Bundle r5 = r4.extraCommand(r5, r0)
                r7.writeNoException()
                if (r5 == 0) goto L_0x00e3
                r7.writeInt(r2)
                r5.writeToParcel(r7, r2)
                goto L_0x00e7
            L_0x00e3:
                r5 = 0
                r7.writeInt(r5)
            L_0x00e7:
                return r2
            L_0x00e8:
                r6.enforceInterface(r1)
                android.os.IBinder r5 = r6.readStrongBinder()
                h.a.a.a r5 = h.a.a.a.C0147a.asInterface(r5)
                int r8 = r6.readInt()
                if (r8 == 0) goto L_0x0102
                android.os.Parcelable$Creator r8 = android.net.Uri.CREATOR
                java.lang.Object r8 = r8.createFromParcel(r6)
                android.net.Uri r8 = (android.net.Uri) r8
                goto L_0x0103
            L_0x0102:
                r8 = r0
            L_0x0103:
                int r1 = r6.readInt()
                if (r1 == 0) goto L_0x0111
                android.os.Parcelable$Creator r0 = android.os.Bundle.CREATOR
                java.lang.Object r0 = r0.createFromParcel(r6)
                android.os.Bundle r0 = (android.os.Bundle) r0
            L_0x0111:
                android.os.Parcelable$Creator r1 = android.os.Bundle.CREATOR
                java.util.ArrayList r6 = r6.createTypedArrayList(r1)
                boolean r5 = r4.mayLaunchUrl(r5, r8, r0, r6)
                r7.writeNoException()
                r7.writeInt(r5)
                return r2
            L_0x0122:
                r6.enforceInterface(r1)
                android.os.IBinder r5 = r6.readStrongBinder()
                h.a.a.a r5 = h.a.a.a.C0147a.asInterface(r5)
                boolean r5 = r4.newSession(r5)
                r7.writeNoException()
                r7.writeInt(r5)
                return r2
            L_0x0138:
                r6.enforceInterface(r1)
                long r5 = r6.readLong()
                boolean r5 = r4.warmup(r5)
                r7.writeNoException()
                r7.writeInt(r5)
                return r2
            L_0x014a:
                r7.writeString(r1)
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: h.a.a.b.a.onTransact(int, android.os.Parcel, android.os.Parcel, int):boolean");
        }
    }

    Bundle extraCommand(String str, Bundle bundle);

    boolean mayLaunchUrl(a aVar, Uri uri, Bundle bundle, List<Bundle> list);

    boolean newSession(a aVar);

    int postMessage(a aVar, String str, Bundle bundle);

    boolean requestPostMessageChannel(a aVar, Uri uri);

    boolean updateVisuals(a aVar, Bundle bundle);

    boolean validateRelationship(a aVar, int i2, Uri uri, Bundle bundle);

    boolean warmup(long j2);
}
