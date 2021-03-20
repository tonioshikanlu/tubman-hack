package b.l.a.c.c.l.k;

import android.os.DeadObjectException;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import b.l.a.c.c.d;
import b.l.a.c.c.l.a;
import b.l.a.c.c.l.k.g;
import b.l.a.c.k.i;
import com.google.android.gms.common.api.Status;

public final class s1<ResultT> extends l0 {
    public final p<a.b, ResultT> a;

    /* renamed from: b  reason: collision with root package name */
    public final i<ResultT> f2705b;
    public final o c;

    public s1(int i2, p<a.b, ResultT> pVar, i<ResultT> iVar, o oVar) {
        super(i2);
        this.f2705b = iVar;
        this.a = pVar;
        this.c = oVar;
    }

    public final void a(@NonNull Status status) {
        this.f2705b.a(this.c.a(status));
    }

    public final void b(@NonNull c2 c2Var, boolean z) {
        i<ResultT> iVar = this.f2705b;
        c2Var.f2623b.put(iVar, Boolean.valueOf(z));
        iVar.a.c(new q(c2Var, iVar));
    }

    public final void c(@NonNull RuntimeException runtimeException) {
        this.f2705b.a(runtimeException);
    }

    public final void e(g.a<?> aVar) {
        try {
            p<a.b, ResultT> pVar = this.a;
            ((m1) pVar).c.a.a(aVar.f2650b, this.f2705b);
        } catch (DeadObjectException e2) {
            throw e2;
        } catch (RemoteException e3) {
            this.f2705b.a(this.c.a(g1.d(e3)));
        } catch (RuntimeException e4) {
            this.f2705b.a(e4);
        }
    }

    @Nullable
    public final d[] f(g.a<?> aVar) {
        return this.a.a;
    }

    public final boolean g(g.a<?> aVar) {
        return this.a.f2691b;
    }
}
