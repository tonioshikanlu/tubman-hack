package b.l.a.c.f.e;

import b.l.a.c.b.a;
import b.l.d.d;
import b.l.d.o.c;
import b.l.d.o.e0.l;
import b.l.d.o.p;
import com.google.android.gms.common.api.Status;
import java.util.ArrayList;
import java.util.List;

public abstract class hj<ResultT, CallbackT> implements tg<fi, ResultT> {
    public final int a;

    /* renamed from: b  reason: collision with root package name */
    public final fj f3036b = new fj(this);
    public d c;
    public p d;

    /* renamed from: e  reason: collision with root package name */
    public CallbackT f3037e;
    public l f;

    /* renamed from: g  reason: collision with root package name */
    public final List<Object> f3038g = new ArrayList();

    /* renamed from: h  reason: collision with root package name */
    public sk f3039h;

    /* renamed from: i  reason: collision with root package name */
    public lk f3040i;

    /* renamed from: j  reason: collision with root package name */
    public c f3041j;

    /* renamed from: k  reason: collision with root package name */
    public String f3042k;

    /* renamed from: l  reason: collision with root package name */
    public String f3043l;

    /* renamed from: m  reason: collision with root package name */
    public ve f3044m;

    /* renamed from: n  reason: collision with root package name */
    public boolean f3045n;

    /* renamed from: o  reason: collision with root package name */
    public gj f3046o;

    public hj(int i2) {
        this.a = i2;
    }

    public static /* synthetic */ void i(hj hjVar) {
        hjVar.c();
        a.G(hjVar.f3045n, "no success or failure set on method implementation");
    }

    public abstract void c();

    public final hj<ResultT, CallbackT> d(d dVar) {
        a.B(dVar, "firebaseApp cannot be null");
        this.c = dVar;
        return this;
    }

    public final hj<ResultT, CallbackT> e(p pVar) {
        a.B(pVar, "firebaseUser cannot be null");
        this.d = pVar;
        return this;
    }

    public final hj<ResultT, CallbackT> f(CallbackT callbackt) {
        a.B(callbackt, "external callback cannot be null");
        this.f3037e = callbackt;
        return this;
    }

    public final hj<ResultT, CallbackT> g(l lVar) {
        a.B(lVar, "external failure callback cannot be null");
        this.f = lVar;
        return this;
    }

    public final void h(ResultT resultt) {
        this.f3045n = true;
        this.f3046o.a(null, (Status) null);
    }
}
