package b.l.d.o;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import b.l.a.c.b.a;

public class x extends c implements Cloneable {
    public static final Parcelable.Creator<x> CREATOR = new g0();

    /* renamed from: h  reason: collision with root package name */
    public String f5017h;

    /* renamed from: i  reason: collision with root package name */
    public String f5018i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f5019j;

    /* renamed from: k  reason: collision with root package name */
    public String f5020k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f5021l;

    /* renamed from: m  reason: collision with root package name */
    public String f5022m;
    @Nullable

    /* renamed from: n  reason: collision with root package name */
    public String f5023n;

    public x(@Nullable String str, @Nullable String str2, boolean z, @Nullable String str3, boolean z2, @Nullable String str4, @Nullable String str5) {
        boolean z3 = false;
        if ((z && !TextUtils.isEmpty(str3) && TextUtils.isEmpty(str5)) || ((z && TextUtils.isEmpty(str3) && !TextUtils.isEmpty(str5)) || ((!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) || (!TextUtils.isEmpty(str3) && !TextUtils.isEmpty(str4))))) {
            z3 = true;
        }
        a.k(z3, "Cannot create PhoneAuthCredential without either verificationProof, sessionInfo, temporary proof, or enrollment ID.");
        this.f5017h = str;
        this.f5018i = str2;
        this.f5019j = z;
        this.f5020k = str3;
        this.f5021l = z2;
        this.f5022m = str4;
        this.f5023n = str5;
    }

    public static x V(String str, String str2) {
        return new x(str, str2, false, (String) null, true, (String) null, (String) null);
    }

    /* renamed from: W */
    public final x clone() {
        return new x(this.f5017h, this.f5018i, this.f5019j, this.f5020k, this.f5021l, this.f5022m, this.f5023n);
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int P0 = a.P0(parcel, 20293);
        a.K0(parcel, 1, this.f5017h, false);
        a.K0(parcel, 2, this.f5018i, false);
        boolean z = this.f5019j;
        a.I1(parcel, 3, 4);
        parcel.writeInt(z ? 1 : 0);
        a.K0(parcel, 4, this.f5020k, false);
        boolean z2 = this.f5021l;
        a.I1(parcel, 5, 4);
        parcel.writeInt(z2 ? 1 : 0);
        a.K0(parcel, 6, this.f5022m, false);
        a.K0(parcel, 7, this.f5023n, false);
        a.H1(parcel, P0);
    }
}
