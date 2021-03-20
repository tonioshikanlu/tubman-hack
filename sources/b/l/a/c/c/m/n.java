package b.l.a.c.c.m;

import android.accounts.Account;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import b.l.a.c.f.d.b;
import b.l.a.c.f.d.c;

public interface n extends IInterface {

    public static abstract class a extends b.l.a.c.f.d.a implements n {

        /* renamed from: b.l.a.c.c.m.n$a$a  reason: collision with other inner class name */
        public static class C0061a extends b implements n {
            public C0061a(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.common.internal.IAccountAccessor");
            }

            public final Account a() {
                Parcel k2 = k(2, g());
                Account account = (Account) c.a(k2, Account.CREATOR);
                k2.recycle();
                return account;
            }
        }

        public static n k(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
            return queryLocalInterface instanceof n ? (n) queryLocalInterface : new C0061a(iBinder);
        }
    }

    Account a();
}
