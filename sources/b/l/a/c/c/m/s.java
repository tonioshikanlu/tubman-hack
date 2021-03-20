package b.l.a.c.c.m;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import b.l.a.c.c.m.v.a;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;

public class s extends a {
    public static final Parcelable.Creator<s> CREATOR = new a0();

    /* renamed from: h  reason: collision with root package name */
    public final int f2806h;

    /* renamed from: i  reason: collision with root package name */
    public final Account f2807i;

    /* renamed from: j  reason: collision with root package name */
    public final int f2808j;

    /* renamed from: k  reason: collision with root package name */
    public final GoogleSignInAccount f2809k;

    public s(int i2, Account account, int i3, GoogleSignInAccount googleSignInAccount) {
        this.f2806h = i2;
        this.f2807i = account;
        this.f2808j = i3;
        this.f2809k = googleSignInAccount;
    }

    public s(Account account, int i2, GoogleSignInAccount googleSignInAccount) {
        this.f2806h = 2;
        this.f2807i = account;
        this.f2808j = i2;
        this.f2809k = googleSignInAccount;
    }

    public void writeToParcel(Parcel parcel, int i2) {
        int P0 = b.l.a.c.b.a.P0(parcel, 20293);
        int i3 = this.f2806h;
        b.l.a.c.b.a.I1(parcel, 1, 4);
        parcel.writeInt(i3);
        b.l.a.c.b.a.J0(parcel, 2, this.f2807i, i2, false);
        int i4 = this.f2808j;
        b.l.a.c.b.a.I1(parcel, 3, 4);
        parcel.writeInt(i4);
        b.l.a.c.b.a.J0(parcel, 4, this.f2809k, i2, false);
        b.l.a.c.b.a.H1(parcel, P0);
    }
}
