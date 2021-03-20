package b.l.a.c.c;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import b.l.a.c.c.m.q0;
import b.l.a.c.c.m.r;
import b.l.a.c.c.m.v.a;
import java.util.Arrays;

public final class b extends a {
    public static final Parcelable.Creator<b> CREATOR = new r();

    /* renamed from: l  reason: collision with root package name */
    public static final b f2586l = new b(0);

    /* renamed from: h  reason: collision with root package name */
    public final int f2587h;

    /* renamed from: i  reason: collision with root package name */
    public final int f2588i;

    /* renamed from: j  reason: collision with root package name */
    public final PendingIntent f2589j;

    /* renamed from: k  reason: collision with root package name */
    public final String f2590k;

    public b(int i2) {
        this.f2587h = 1;
        this.f2588i = i2;
        this.f2589j = null;
        this.f2590k = null;
    }

    public b(int i2, int i3, PendingIntent pendingIntent, String str) {
        this.f2587h = i2;
        this.f2588i = i3;
        this.f2589j = pendingIntent;
        this.f2590k = str;
    }

    public static String X(int i2) {
        if (i2 == 99) {
            return "UNFINISHED";
        }
        if (i2 == 1500) {
            return "DRIVE_EXTERNAL_STORAGE_REQUIRED";
        }
        switch (i2) {
            case -1:
                return "UNKNOWN";
            case 0:
                return "SUCCESS";
            case 1:
                return "SERVICE_MISSING";
            case 2:
                return "SERVICE_VERSION_UPDATE_REQUIRED";
            case 3:
                return "SERVICE_DISABLED";
            case 4:
                return "SIGN_IN_REQUIRED";
            case 5:
                return "INVALID_ACCOUNT";
            case 6:
                return "RESOLUTION_REQUIRED";
            case 7:
                return "NETWORK_ERROR";
            case 8:
                return "INTERNAL_ERROR";
            case 9:
                return "SERVICE_INVALID";
            case 10:
                return "DEVELOPER_ERROR";
            case 11:
                return "LICENSE_CHECK_FAILED";
            default:
                switch (i2) {
                    case 13:
                        return "CANCELED";
                    case 14:
                        return "TIMEOUT";
                    case 15:
                        return "INTERRUPTED";
                    case 16:
                        return "API_UNAVAILABLE";
                    case 17:
                        return "SIGN_IN_FAILED";
                    case 18:
                        return "SERVICE_UPDATING";
                    case 19:
                        return "SERVICE_MISSING_PERMISSION";
                    case 20:
                        return "RESTRICTED_PROFILE";
                    case 21:
                        return "API_VERSION_UPDATE_REQUIRED";
                    default:
                        StringBuilder sb = new StringBuilder(31);
                        sb.append("UNKNOWN_ERROR_CODE(");
                        sb.append(i2);
                        sb.append(")");
                        return sb.toString();
                }
        }
    }

    public final boolean V() {
        return (this.f2588i == 0 || this.f2589j == null) ? false : true;
    }

    public final boolean W() {
        return this.f2588i == 0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f2588i == bVar.f2588i && b.l.a.c.b.a.T(this.f2589j, bVar.f2589j) && b.l.a.c.b.a.T(this.f2590k, bVar.f2590k);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f2588i), this.f2589j, this.f2590k});
    }

    public final String toString() {
        r rVar = new r(this, (q0) null);
        rVar.a("statusCode", X(this.f2588i));
        rVar.a("resolution", this.f2589j);
        rVar.a("message", this.f2590k);
        return rVar.toString();
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int P0 = b.l.a.c.b.a.P0(parcel, 20293);
        int i3 = this.f2587h;
        b.l.a.c.b.a.I1(parcel, 1, 4);
        parcel.writeInt(i3);
        int i4 = this.f2588i;
        b.l.a.c.b.a.I1(parcel, 2, 4);
        parcel.writeInt(i4);
        b.l.a.c.b.a.J0(parcel, 3, this.f2589j, i2, false);
        b.l.a.c.b.a.K0(parcel, 4, this.f2590k, false);
        b.l.a.c.b.a.H1(parcel, P0);
    }

    public b(int i2, @Nullable PendingIntent pendingIntent) {
        this.f2587h = 1;
        this.f2588i = i2;
        this.f2589j = pendingIntent;
        this.f2590k = null;
    }
}
