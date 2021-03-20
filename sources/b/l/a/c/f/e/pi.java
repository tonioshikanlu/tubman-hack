package b.l.a.c.f.e;

import android.os.Parcel;
import b.l.d.o.x;
import com.google.android.gms.common.api.Status;

public abstract class pi extends p2 implements qi {
    public pi() {
        super("com.google.firebase.auth.api.internal.IFirebaseAuthCallbacks");
    }

    public final boolean g(int i2, Parcel parcel, Parcel parcel2, int i3) {
        switch (i2) {
            case 1:
                ((fj) this).w0((sk) o3.a(parcel, sk.CREATOR));
                return true;
            case 2:
                ((fj) this).f1((sk) o3.a(parcel, sk.CREATOR), (lk) o3.a(parcel, lk.CREATOR));
                return true;
            case 3:
                ((fj) this).H((yj) o3.a(parcel, yj.CREATOR));
                return true;
            case 4:
                ((fj) this).t((dl) o3.a(parcel, dl.CREATOR));
                return true;
            case 5:
                ((fj) this).Z0((Status) o3.a(parcel, Status.CREATOR));
                return true;
            case 6:
                ((fj) this).f();
                return true;
            case 7:
                ((fj) this).h();
                return true;
            case 8:
                ((fj) this).n0(parcel.readString());
                return true;
            case 9:
                ((fj) this).m(parcel.readString());
                throw null;
            case 10:
                ((fj) this).I((x) o3.a(parcel, x.CREATOR));
                throw null;
            case 11:
                ((fj) this).I0(parcel.readString());
                throw null;
            case 12:
                ((fj) this).i1((Status) o3.a(parcel, Status.CREATOR), (x) o3.a(parcel, x.CREATOR));
                return true;
            case 13:
                ((fj) this).l();
                return true;
            case 14:
                te teVar = (te) o3.a(parcel, te.CREATOR);
                ((fj) this).k(teVar.f3313h, teVar.f3314i, teVar.f3315j, teVar.f3316k);
                return true;
            case 15:
                ((fj) this).m0((ve) o3.a(parcel, ve.CREATOR));
                return true;
            default:
                return false;
        }
    }
}
