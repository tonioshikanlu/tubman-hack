package b.l.a.c.c.m;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import b.l.a.c.b.a;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;

public final class a0 implements Parcelable.Creator<s> {
    public final Object createFromParcel(Parcel parcel) {
        int C0 = a.C0(parcel);
        Account account = null;
        int i2 = 0;
        int i3 = 0;
        GoogleSignInAccount googleSignInAccount = null;
        while (parcel.dataPosition() < C0) {
            int readInt = parcel.readInt();
            int i4 = 65535 & readInt;
            if (i4 == 1) {
                i2 = a.t0(parcel, readInt);
            } else if (i4 == 2) {
                account = (Account) a.K(parcel, readInt, Account.CREATOR);
            } else if (i4 == 3) {
                i3 = a.t0(parcel, readInt);
            } else if (i4 != 4) {
                a.z0(parcel, readInt);
            } else {
                googleSignInAccount = (GoogleSignInAccount) a.K(parcel, readInt, GoogleSignInAccount.CREATOR);
            }
        }
        a.S(parcel, C0);
        return new s(i2, account, i3, googleSignInAccount);
    }

    public final /* synthetic */ Object[] newArray(int i2) {
        return new s[i2];
    }
}
