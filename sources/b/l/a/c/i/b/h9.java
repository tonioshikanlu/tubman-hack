package b.l.a.c.i.b;

import android.os.Parcel;
import android.os.Parcelable;
import b.l.a.c.b.a;

public final class h9 implements Parcelable.Creator<g9> {
    public static void a(g9 g9Var, Parcel parcel, int i2) {
        int P0 = a.P0(parcel, 20293);
        int i3 = g9Var.f4020h;
        a.I1(parcel, 1, 4);
        parcel.writeInt(i3);
        a.K0(parcel, 2, g9Var.f4021i, false);
        long j2 = g9Var.f4022j;
        a.I1(parcel, 3, 8);
        parcel.writeLong(j2);
        a.I0(parcel, 4, g9Var.f4023k, false);
        a.G0(parcel, 5, (Float) null, false);
        a.K0(parcel, 6, g9Var.f4024l, false);
        a.K0(parcel, 7, g9Var.f4025m, false);
        Double d = g9Var.f4026n;
        if (d != null) {
            a.I1(parcel, 8, 8);
            parcel.writeDouble(d.doubleValue());
        }
        a.H1(parcel, P0);
    }

    public final Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int C0 = a.C0(parcel);
        String str = null;
        Long l2 = null;
        Float f = null;
        String str2 = null;
        String str3 = null;
        Double d = null;
        int i2 = 0;
        long j2 = 0;
        while (parcel.dataPosition() < C0) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 1:
                    i2 = a.t0(parcel2, readInt);
                    break;
                case 2:
                    str = a.L(parcel2, readInt);
                    break;
                case 3:
                    j2 = a.u0(parcel2, readInt);
                    break;
                case 4:
                    l2 = a.v0(parcel2, readInt);
                    break;
                case 5:
                    f = a.r0(parcel2, readInt);
                    break;
                case 6:
                    str2 = a.L(parcel2, readInt);
                    break;
                case 7:
                    str3 = a.L(parcel2, readInt);
                    break;
                case 8:
                    int w0 = a.w0(parcel2, readInt);
                    if (w0 != 0) {
                        a.v1(parcel2, w0, 8);
                        d = Double.valueOf(parcel.readDouble());
                        break;
                    } else {
                        d = null;
                        break;
                    }
                default:
                    a.z0(parcel2, readInt);
                    break;
            }
        }
        a.S(parcel2, C0);
        return new g9(i2, str, j2, l2, f, str2, str3, d);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i2) {
        return new g9[i2];
    }
}
