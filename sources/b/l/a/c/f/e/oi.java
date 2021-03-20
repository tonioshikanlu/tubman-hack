package b.l.a.c.f.e;

import android.os.IBinder;
import android.os.Parcel;
import b.l.d.o.x;
import com.google.android.gms.common.api.Status;

public final class oi extends a implements qi {
    public oi(IBinder iBinder) {
        super(iBinder, "com.google.firebase.auth.api.internal.IFirebaseAuthCallbacks");
    }

    public final void H(yj yjVar) {
        Parcel n2 = n();
        o3.b(n2, yjVar);
        k(3, n2);
    }

    public final void I(x xVar) {
        Parcel n2 = n();
        o3.b(n2, xVar);
        k(10, n2);
    }

    public final void I0(String str) {
        Parcel n2 = n();
        n2.writeString(str);
        k(11, n2);
    }

    public final void O(te teVar) {
        Parcel n2 = n();
        o3.b(n2, teVar);
        k(14, n2);
    }

    public final void Z0(Status status) {
        Parcel n2 = n();
        o3.b(n2, status);
        k(5, n2);
    }

    public final void f() {
        k(6, n());
    }

    public final void f1(sk skVar, lk lkVar) {
        Parcel n2 = n();
        o3.b(n2, skVar);
        o3.b(n2, lkVar);
        k(2, n2);
    }

    public final void h() {
        k(7, n());
    }

    public final void i1(Status status, x xVar) {
        Parcel n2 = n();
        o3.b(n2, status);
        o3.b(n2, xVar);
        k(12, n2);
    }

    public final void l() {
        k(13, n());
    }

    public final void m(String str) {
        Parcel n2 = n();
        n2.writeString(str);
        k(9, n2);
    }

    public final void m0(ve veVar) {
        Parcel n2 = n();
        o3.b(n2, veVar);
        k(15, n2);
    }

    public final void n0(String str) {
        Parcel n2 = n();
        n2.writeString(str);
        k(8, n2);
    }

    public final void t(dl dlVar) {
        Parcel n2 = n();
        o3.b(n2, dlVar);
        k(4, n2);
    }

    public final void w0(sk skVar) {
        Parcel n2 = n();
        o3.b(n2, skVar);
        k(1, n2);
    }
}
