package b.l.d.o;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import b.l.a.c.b.a;

public class s extends c {
    public static final Parcelable.Creator<s> CREATOR = new f0();

    /* renamed from: h  reason: collision with root package name */
    public final String f5014h;

    /* renamed from: i  reason: collision with root package name */
    public final String f5015i;

    public s(@Nullable String str, @Nullable String str2) {
        if (str == null && str2 == null) {
            throw new IllegalArgumentException("Must specify an idToken or an accessToken.");
        }
        V(str, "idToken");
        this.f5014h = str;
        V(str2, "accessToken");
        this.f5015i = str2;
    }

    public static String V(String str, String str2) {
        if (str == null || !TextUtils.isEmpty(str)) {
            return str;
        }
        throw new IllegalArgumentException(str2.concat(" must not be empty"));
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int P0 = a.P0(parcel, 20293);
        a.K0(parcel, 1, this.f5014h, false);
        a.K0(parcel, 2, this.f5015i, false);
        a.H1(parcel, P0);
    }
}
