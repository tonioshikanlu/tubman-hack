package b.l.a.c.f.e;

import androidx.annotation.Nullable;
import b.l.a.c.b.a;
import b.l.d.o.c;
import b.l.d.o.e0.l;
import b.l.d.o.x;
import com.google.android.gms.common.api.Status;
import java.util.Objects;

public final class fj extends pi {
    public final /* synthetic */ hj a;

    public fj(hj hjVar) {
        this.a = hjVar;
    }

    public final void H(yj yjVar) {
        int i2 = this.a.a;
        boolean z = i2 == 3;
        StringBuilder sb = new StringBuilder(36);
        sb.append("Unexpected response type ");
        sb.append(i2);
        a.G(z, sb.toString());
        hj hjVar = this.a;
        Objects.requireNonNull(hjVar);
        hjVar.c();
        a.G(hjVar.f3045n, "no success or failure set on method implementation");
    }

    public final void I(x xVar) {
        int i2 = this.a.a;
        boolean z = i2 == 8;
        StringBuilder sb = new StringBuilder(36);
        sb.append("Unexpected response type ");
        sb.append(i2);
        a.G(z, sb.toString());
        hj hjVar = this.a;
        hjVar.f3045n = true;
        Objects.requireNonNull(hjVar);
        throw null;
    }

    public final void I0(String str) {
        int i2 = this.a.a;
        boolean z = i2 == 8;
        StringBuilder sb = new StringBuilder(36);
        sb.append("Unexpected response type ");
        sb.append(i2);
        a.G(z, sb.toString());
        hj hjVar = this.a;
        Objects.requireNonNull(hjVar);
        hjVar.f3045n = true;
        Objects.requireNonNull(this.a);
        throw null;
    }

    public final void O(te teVar) {
        k(teVar.f3313h, teVar.f3314i, teVar.f3315j, teVar.f3316k);
    }

    public final void Z0(Status status) {
        String str = status.f7264j;
        if (str != null) {
            if (str.contains("MISSING_MFA_PENDING_CREDENTIAL")) {
                status = new Status(17081);
            } else if (str.contains("MISSING_MFA_ENROLLMENT_ID")) {
                status = new Status(17082);
            } else if (str.contains("INVALID_MFA_PENDING_CREDENTIAL")) {
                status = new Status(17083);
            } else if (str.contains("MFA_ENROLLMENT_NOT_FOUND")) {
                status = new Status(17084);
            } else if (str.contains("ADMIN_ONLY_OPERATION")) {
                status = new Status(17085);
            } else if (str.contains("UNVERIFIED_EMAIL")) {
                status = new Status(17086);
            } else if (str.contains("SECOND_FACTOR_EXISTS")) {
                status = new Status(17087);
            } else if (str.contains("SECOND_FACTOR_LIMIT_EXCEEDED")) {
                status = new Status(17088);
            } else if (str.contains("UNSUPPORTED_FIRST_FACTOR")) {
                status = new Status(17089);
            } else if (str.contains("EMAIL_CHANGE_NEEDS_VERIFICATION")) {
                status = new Status(17090);
            }
        }
        hj hjVar = this.a;
        if (hjVar.a != 8) {
            l lVar = hjVar.f;
            if (lVar != null) {
                lVar.a(status);
            }
            hj hjVar2 = this.a;
            hjVar2.f3045n = true;
            hjVar2.f3046o.a(null, status);
            return;
        }
        hjVar.f3045n = true;
        throw null;
    }

    public final void f() {
        int i2 = this.a.a;
        boolean z = i2 == 5;
        StringBuilder sb = new StringBuilder(36);
        sb.append("Unexpected response type ");
        sb.append(i2);
        a.G(z, sb.toString());
        hj.i(this.a);
    }

    public final void f1(sk skVar, lk lkVar) {
        int i2 = this.a.a;
        boolean z = i2 == 2;
        StringBuilder sb = new StringBuilder(37);
        sb.append("Unexpected response type: ");
        sb.append(i2);
        a.G(z, sb.toString());
        hj hjVar = this.a;
        hjVar.f3039h = skVar;
        hjVar.f3040i = lkVar;
        hjVar.c();
        a.G(hjVar.f3045n, "no success or failure set on method implementation");
    }

    public final void h() {
        int i2 = this.a.a;
        boolean z = i2 == 6;
        StringBuilder sb = new StringBuilder(36);
        sb.append("Unexpected response type ");
        sb.append(i2);
        a.G(z, sb.toString());
        hj.i(this.a);
    }

    public final void i1(Status status, x xVar) {
        int i2 = this.a.a;
        boolean z = i2 == 2;
        StringBuilder sb = new StringBuilder(36);
        sb.append("Unexpected response type ");
        sb.append(i2);
        a.G(z, sb.toString());
        k(status, xVar, (String) null, (String) null);
    }

    public final void k(Status status, c cVar, @Nullable String str, @Nullable String str2) {
        l lVar = this.a.f;
        if (lVar != null) {
            lVar.a(status);
        }
        hj hjVar = this.a;
        hjVar.f3041j = cVar;
        hjVar.f3042k = str;
        hjVar.f3043l = str2;
        l lVar2 = hjVar.f;
        if (lVar2 != null) {
            lVar2.a(status);
        }
        hj hjVar2 = this.a;
        hjVar2.f3045n = true;
        hjVar2.f3046o.a(null, status);
    }

    public final void l() {
        int i2 = this.a.a;
        boolean z = i2 == 9;
        StringBuilder sb = new StringBuilder(36);
        sb.append("Unexpected response type ");
        sb.append(i2);
        a.G(z, sb.toString());
        hj.i(this.a);
    }

    public final void m(String str) {
        int i2 = this.a.a;
        boolean z = i2 == 8;
        StringBuilder sb = new StringBuilder(36);
        sb.append("Unexpected response type ");
        sb.append(i2);
        a.G(z, sb.toString());
        Objects.requireNonNull(this.a);
        Objects.requireNonNull(this.a);
        throw null;
    }

    public final void m0(ve veVar) {
        hj hjVar = this.a;
        hjVar.f3044m = veVar;
        Status T0 = a.T0("REQUIRES_SECOND_FACTOR_AUTH");
        hjVar.f3045n = true;
        hjVar.f3046o.a(null, T0);
    }

    public final void n0(String str) {
        int i2 = this.a.a;
        boolean z = i2 == 7;
        StringBuilder sb = new StringBuilder(36);
        sb.append("Unexpected response type ");
        sb.append(i2);
        a.G(z, sb.toString());
        hj hjVar = this.a;
        Objects.requireNonNull(hjVar);
        hjVar.c();
        a.G(hjVar.f3045n, "no success or failure set on method implementation");
    }

    public final void t(@Nullable dl dlVar) {
        int i2 = this.a.a;
        boolean z = i2 == 4;
        StringBuilder sb = new StringBuilder(36);
        sb.append("Unexpected response type ");
        sb.append(i2);
        a.G(z, sb.toString());
        hj hjVar = this.a;
        Objects.requireNonNull(hjVar);
        hjVar.c();
        a.G(hjVar.f3045n, "no success or failure set on method implementation");
    }

    public final void w0(sk skVar) {
        int i2 = this.a.a;
        boolean z = true;
        if (i2 != 1) {
            z = false;
        }
        StringBuilder sb = new StringBuilder(37);
        sb.append("Unexpected response type: ");
        sb.append(i2);
        a.G(z, sb.toString());
        hj hjVar = this.a;
        hjVar.f3039h = skVar;
        hjVar.c();
        a.G(hjVar.f3045n, "no success or failure set on method implementation");
    }
}
