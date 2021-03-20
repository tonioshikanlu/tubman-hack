package b.l.a.c.c.m;

import android.accounts.Account;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import b.l.a.c.c.d;
import b.l.a.c.c.f;
import b.l.a.c.c.m.n;
import b.l.a.c.c.m.v.a;
import com.google.android.gms.common.api.Scope;

public class h extends a {
    public static final Parcelable.Creator<h> CREATOR = new e0();

    /* renamed from: h  reason: collision with root package name */
    public final int f2779h;

    /* renamed from: i  reason: collision with root package name */
    public final int f2780i;

    /* renamed from: j  reason: collision with root package name */
    public int f2781j;

    /* renamed from: k  reason: collision with root package name */
    public String f2782k;

    /* renamed from: l  reason: collision with root package name */
    public IBinder f2783l;

    /* renamed from: m  reason: collision with root package name */
    public Scope[] f2784m;

    /* renamed from: n  reason: collision with root package name */
    public Bundle f2785n;

    /* renamed from: o  reason: collision with root package name */
    public Account f2786o;

    /* renamed from: p  reason: collision with root package name */
    public d[] f2787p;

    /* renamed from: q  reason: collision with root package name */
    public d[] f2788q;
    public boolean r;
    public int s;

    public h(int i2) {
        this.f2779h = 4;
        this.f2781j = f.a;
        this.f2780i = i2;
        this.r = true;
    }

    public h(int i2, int i3, int i4, String str, IBinder iBinder, Scope[] scopeArr, Bundle bundle, Account account, d[] dVarArr, d[] dVarArr2, boolean z, int i5) {
        this.f2779h = i2;
        this.f2780i = i3;
        this.f2781j = i4;
        if ("com.google.android.gms".equals(str)) {
            this.f2782k = "com.google.android.gms";
        } else {
            this.f2782k = str;
        }
        if (i2 < 2) {
            Account account2 = null;
            if (iBinder != null) {
                n k2 = n.a.k(iBinder);
                int i6 = a.a;
                if (k2 != null) {
                    long clearCallingIdentity = Binder.clearCallingIdentity();
                    try {
                        account2 = k2.a();
                    } catch (RemoteException unused) {
                        Log.w("AccountAccessor", "Remote account accessor probably died");
                    } catch (Throwable th) {
                        Binder.restoreCallingIdentity(clearCallingIdentity);
                        throw th;
                    }
                    Binder.restoreCallingIdentity(clearCallingIdentity);
                }
            }
            this.f2786o = account2;
        } else {
            this.f2783l = iBinder;
            this.f2786o = account;
        }
        this.f2784m = scopeArr;
        this.f2785n = bundle;
        this.f2787p = dVarArr;
        this.f2788q = dVarArr2;
        this.r = z;
        this.s = i5;
    }

    public void writeToParcel(Parcel parcel, int i2) {
        int P0 = b.l.a.c.b.a.P0(parcel, 20293);
        int i3 = this.f2779h;
        b.l.a.c.b.a.I1(parcel, 1, 4);
        parcel.writeInt(i3);
        int i4 = this.f2780i;
        b.l.a.c.b.a.I1(parcel, 2, 4);
        parcel.writeInt(i4);
        int i5 = this.f2781j;
        b.l.a.c.b.a.I1(parcel, 3, 4);
        parcel.writeInt(i5);
        b.l.a.c.b.a.K0(parcel, 4, this.f2782k, false);
        b.l.a.c.b.a.H0(parcel, 5, this.f2783l, false);
        b.l.a.c.b.a.M0(parcel, 6, this.f2784m, i2, false);
        b.l.a.c.b.a.F0(parcel, 7, this.f2785n, false);
        b.l.a.c.b.a.J0(parcel, 8, this.f2786o, i2, false);
        b.l.a.c.b.a.M0(parcel, 10, this.f2787p, i2, false);
        b.l.a.c.b.a.M0(parcel, 11, this.f2788q, i2, false);
        boolean z = this.r;
        b.l.a.c.b.a.I1(parcel, 12, 4);
        parcel.writeInt(z ? 1 : 0);
        int i6 = this.s;
        b.l.a.c.b.a.I1(parcel, 13, 4);
        parcel.writeInt(i6);
        b.l.a.c.b.a.H1(parcel, P0);
    }
}
