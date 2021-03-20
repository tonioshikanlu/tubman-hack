package b.l.a.c.f.e;

import android.os.RemoteException;
import android.util.Log;
import androidx.annotation.Nullable;
import b.l.a.c.c.n.a;
import b.l.d.o.x;
import com.google.android.gms.common.api.Status;
import java.util.Objects;

public class ei {
    public final qi a;

    /* renamed from: b  reason: collision with root package name */
    public final a f2940b;

    public ei(qi qiVar, a aVar) {
        Objects.requireNonNull(qiVar, "null reference");
        this.a = qiVar;
        Objects.requireNonNull(aVar, "null reference");
        this.f2940b = aVar;
    }

    public final void a(sk skVar, lk lkVar) {
        try {
            this.a.f1(skVar, lkVar);
        } catch (RemoteException e2) {
            a aVar = this.f2940b;
            Log.e(aVar.a, aVar.c("RemoteException when sending get token and account info user response", new Object[0]), e2);
        }
    }

    public final void b(@Nullable dl dlVar) {
        try {
            this.a.t(dlVar);
        } catch (RemoteException e2) {
            a aVar = this.f2940b;
            Log.e(aVar.a, aVar.c("RemoteException when sending password reset response.", new Object[0]), e2);
        }
    }

    public void c(String str) {
        try {
            this.a.m(str);
        } catch (RemoteException e2) {
            a aVar = this.f2940b;
            Log.e(aVar.a, aVar.c("RemoteException when sending send verification code response.", new Object[0]), e2);
        }
    }

    public final void d(x xVar) {
        try {
            this.a.I(xVar);
        } catch (RemoteException e2) {
            a aVar = this.f2940b;
            Log.e(aVar.a, aVar.c("RemoteException when sending verification completed response.", new Object[0]), e2);
        }
    }

    public final void e(String str) {
        try {
            this.a.I0(str);
        } catch (RemoteException e2) {
            a aVar = this.f2940b;
            Log.e(aVar.a, aVar.c("RemoteException when sending auto retrieval timeout response.", new Object[0]), e2);
        }
    }

    public void f(Status status) {
        try {
            this.a.Z0(status);
        } catch (RemoteException e2) {
            a aVar = this.f2940b;
            Log.e(aVar.a, aVar.c("RemoteException when sending failure result.", new Object[0]), e2);
        }
    }

    public final void g() {
        try {
            this.a.l();
        } catch (RemoteException e2) {
            a aVar = this.f2940b;
            Log.e(aVar.a, aVar.c("RemoteException when setting FirebaseUI Version", new Object[0]), e2);
        }
    }

    public final void h(ve veVar) {
        try {
            this.a.m0(veVar);
        } catch (RemoteException e2) {
            a aVar = this.f2940b;
            Log.e(aVar.a, aVar.c("RemoteException when sending failure result for mfa", new Object[0]), e2);
        }
    }
}
