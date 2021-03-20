package b.l.a.c.f.e;

import android.content.Context;
import android.util.Log;
import androidx.annotation.NonNull;
import b.l.a.c.c.n.a;
import b.l.d.o.d;
import b.l.d.o.x;
import java.util.Objects;

public final class ii extends si {
    public static final a c = new a("FirebaseAuth", "FirebaseAuthFallback:");
    public final og a;

    /* renamed from: b  reason: collision with root package name */
    public final sj f3070b;

    public ii(Context context, String str) {
        Objects.requireNonNull(context, "null reference");
        cj cjVar = new cj(cj.b());
        b.l.a.c.b.a.x(str);
        this.a = new og(new dj(context, str, cjVar));
        this.f3070b = new sj(context);
    }

    public static boolean k(long j2, boolean z) {
        if (j2 > 0 && z) {
            return true;
        }
        a aVar = c;
        Log.w(aVar.a, aVar.c("App hash will not be appended to the request.", new Object[0]));
        return false;
    }

    public final void E0(vd vdVar, qi qiVar) {
        Objects.requireNonNull(vdVar, "null reference");
        Objects.requireNonNull(vdVar.f3353h, "null reference");
        Objects.requireNonNull(qiVar, "null reference");
        og ogVar = this.a;
        sl slVar = vdVar.f3353h;
        ei eiVar = new ei(qiVar, c);
        Objects.requireNonNull(ogVar);
        Objects.requireNonNull(slVar, "null reference");
        slVar.v = true;
        ogVar.a.c((Context) null, slVar, new hg(ogVar, eiVar));
    }

    public final void M(de deVar, qi qiVar) {
        Objects.requireNonNull(qiVar, "null reference");
        Objects.requireNonNull(deVar, "null reference");
        x xVar = deVar.f2911h;
        Objects.requireNonNull(xVar, "null reference");
        og ogVar = this.a;
        bm V0 = b.l.a.c.b.a.V0(xVar);
        ei eiVar = new ei(qiVar, c);
        Objects.requireNonNull(ogVar);
        ogVar.a.l((Context) null, V0, new kf(ogVar, eiVar));
    }

    public final void T(be beVar, qi qiVar) {
        Objects.requireNonNull(beVar, "null reference");
        Objects.requireNonNull(beVar.f2861h, "null reference");
        Objects.requireNonNull(qiVar, "null reference");
        og ogVar = this.a;
        d dVar = beVar.f2861h;
        ei eiVar = new ei(qiVar, c);
        Objects.requireNonNull(ogVar);
        Objects.requireNonNull(dVar, "null reference");
        if (dVar.f4950l) {
            ogVar.e(dVar.f4949k, new ze(ogVar, dVar, eiVar));
            return;
        }
        ogVar.a.o(new bk(dVar, (String) null), new af(ogVar, eiVar));
    }

    public final void a0(@NonNull nd ndVar, qi qiVar) {
        Objects.requireNonNull(ndVar, "null reference");
        b.l.a.c.b.a.x(ndVar.f3186h);
        Objects.requireNonNull(qiVar, "null reference");
        og ogVar = this.a;
        String str = ndVar.f3186h;
        b.l.d.o.a aVar = ndVar.f3187i;
        String str2 = ndVar.f3188j;
        ei eiVar = new ei(qiVar, c);
        Objects.requireNonNull(ogVar);
        b.l.a.c.b.a.x(str);
        pk pkVar = new pk(aVar.f4935p);
        b.l.a.c.b.a.x(str);
        pkVar.f3232i = str;
        pkVar.f3235l = aVar;
        pkVar.f3236m = str2;
        ogVar.a.j(pkVar, new ff(eiVar));
    }

    public final void e1(zc zcVar, qi qiVar) {
        Objects.requireNonNull(zcVar, "null reference");
        Objects.requireNonNull(qiVar, "null reference");
        b.l.a.c.b.a.x(zcVar.f3437h);
        og ogVar = this.a;
        String str = zcVar.f3437h;
        ei eiVar = new ei(qiVar, c);
        Objects.requireNonNull(ogVar);
        b.l.a.c.b.a.x(str);
        ogVar.a.a(new hk(str), new hf(eiVar));
    }

    public final void h1(fd fdVar, qi qiVar) {
        Objects.requireNonNull(fdVar, "null reference");
        b.l.a.c.b.a.x(fdVar.f2959h);
        Objects.requireNonNull(fdVar.f2960i, "null reference");
        Objects.requireNonNull(qiVar, "null reference");
        og ogVar = this.a;
        String str = fdVar.f2959h;
        sl slVar = fdVar.f2960i;
        ei eiVar = new ei(qiVar, c);
        Objects.requireNonNull(ogVar);
        b.l.a.c.b.a.x(str);
        Objects.requireNonNull(slVar, "null reference");
        ogVar.e(str, new pf(ogVar, slVar, eiVar));
    }

    public final void u(rc rcVar, qi qiVar) {
        Objects.requireNonNull(rcVar, "null reference");
        b.l.a.c.b.a.x(rcVar.f3249h);
        b.l.a.c.b.a.x(rcVar.f3250i);
        Objects.requireNonNull(qiVar, "null reference");
        og ogVar = this.a;
        String str = rcVar.f3249h;
        String str2 = rcVar.f3250i;
        String str3 = rcVar.f3251j;
        ei eiVar = new ei(qiVar, c);
        Objects.requireNonNull(ogVar);
        b.l.a.c.b.a.x(str);
        b.l.a.c.b.a.x(str2);
        ogVar.a.d(new kl(str, str2, str3), new xe(ogVar, eiVar));
    }

    public final void w(dd ddVar, qi qiVar) {
        Objects.requireNonNull(ddVar, "null reference");
        b.l.a.c.b.a.x(ddVar.f2908h);
        b.l.a.c.b.a.x(ddVar.f2909i);
        b.l.a.c.b.a.x(ddVar.f2910j);
        Objects.requireNonNull(qiVar, "null reference");
        og ogVar = this.a;
        String str = ddVar.f2908h;
        String str2 = ddVar.f2909i;
        String str3 = ddVar.f2910j;
        ei eiVar = new ei(qiVar, c);
        Objects.requireNonNull(ogVar);
        b.l.a.c.b.a.x(str);
        b.l.a.c.b.a.x(str2);
        b.l.a.c.b.a.x(str3);
        ogVar.e(str3, new lf(ogVar, str, str2, eiVar));
    }

    public final void x(zd zdVar, qi qiVar) {
        Objects.requireNonNull(zdVar, "null reference");
        b.l.a.c.b.a.x(zdVar.f3438h);
        b.l.a.c.b.a.x(zdVar.f3439i);
        Objects.requireNonNull(qiVar, "null reference");
        og ogVar = this.a;
        String str = zdVar.f3438h;
        String str2 = zdVar.f3439i;
        String str3 = zdVar.f3440j;
        ei eiVar = new ei(qiVar, c);
        Objects.requireNonNull(ogVar);
        b.l.a.c.b.a.x(str);
        b.l.a.c.b.a.x(str2);
        ogVar.a.e((Context) null, new zl(str, str2, str3), new ye(ogVar, eiVar));
    }

    public final void z(hd hdVar, qi qiVar) {
        Objects.requireNonNull(qiVar, "null reference");
        Objects.requireNonNull(hdVar, "null reference");
        x xVar = hdVar.f3024i;
        Objects.requireNonNull(xVar, "null reference");
        String str = hdVar.f3023h;
        b.l.a.c.b.a.x(str);
        og ogVar = this.a;
        bm V0 = b.l.a.c.b.a.V0(xVar);
        ei eiVar = new ei(qiVar, c);
        Objects.requireNonNull(ogVar);
        b.l.a.c.b.a.x(str);
        ogVar.e(str, new nf(ogVar, V0, eiVar));
    }
}
