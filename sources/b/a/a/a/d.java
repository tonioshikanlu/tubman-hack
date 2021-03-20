package b.a.a.a;

import android.widget.RelativeLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import b.a.a.g.r0;
import b.a.a.g.s;
import b.a.a.h.o;
import b.a.a.i.j;
import b.a.a.n.c;
import com.appfoundry.previewer.BravoApp;
import com.appfoundry.previewer.model.Page;
import e.r;
import e.v.j.a.e;
import e.v.j.a.h;
import e.x.b.p;
import e.x.c.i;
import g.a.i0;
import g.a.x;
import g.a.z;

@e(c = "com.appfoundry.previewer.fragments.BravoFragment$getRemotePageWithCoroutines$1", f = "BravoFragment.kt", l = {195}, m = "invokeSuspend")
public final class d extends h implements p<z, e.v.d<? super r>, Object> {

    /* renamed from: l  reason: collision with root package name */
    public z f86l;

    /* renamed from: m  reason: collision with root package name */
    public Object f87m;

    /* renamed from: n  reason: collision with root package name */
    public int f88n;

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ h f89o;

    /* renamed from: p  reason: collision with root package name */
    public final /* synthetic */ boolean f90p;

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ RelativeLayout f91q;

    @e(c = "com.appfoundry.previewer.fragments.BravoFragment$getRemotePageWithCoroutines$1$remoteResponse$1", f = "BravoFragment.kt", l = {}, m = "invokeSuspend")
    public static final class a extends h implements p<z, e.v.d<? super j>, Object> {

        /* renamed from: l  reason: collision with root package name */
        public z f92l;

        /* renamed from: m  reason: collision with root package name */
        public final /* synthetic */ d f93m;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(d dVar, e.v.d dVar2) {
            super(2, dVar2);
            this.f93m = dVar;
        }

        public final e.v.d<r> a(Object obj, e.v.d<?> dVar) {
            i.e(dVar, "completion");
            a aVar = new a(this.f93m, dVar);
            aVar.f92l = (z) obj;
            return aVar;
        }

        public final Object d(Object obj) {
            b.q.a.a.c3(obj);
            return c.i(this.f93m.f89o.f74h, false, 2);
        }

        public final Object invoke(Object obj, Object obj2) {
            e.v.d dVar = (e.v.d) obj2;
            i.e(dVar, "completion");
            d dVar2 = this.f93m;
            dVar.getContext();
            z zVar = (z) obj;
            b.q.a.a.c3(r.a);
            return c.i(dVar2.f89o.f74h, false, 2);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d(h hVar, boolean z, RelativeLayout relativeLayout, e.v.d dVar) {
        super(2, dVar);
        this.f89o = hVar;
        this.f90p = z;
        this.f91q = relativeLayout;
    }

    public final e.v.d<r> a(Object obj, e.v.d<?> dVar) {
        i.e(dVar, "completion");
        d dVar2 = new d(this.f89o, this.f90p, this.f91q, dVar);
        dVar2.f86l = (z) obj;
        return dVar2;
    }

    public final Object d(Object obj) {
        FragmentActivity activity;
        e.v.i.a aVar = e.v.i.a.COROUTINE_SUSPENDED;
        int i2 = this.f88n;
        Page page = null;
        if (i2 == 0) {
            b.q.a.a.c3(obj);
            z zVar = this.f86l;
            x xVar = i0.f9955b;
            a aVar2 = new a(this, (e.v.d) null);
            this.f87m = zVar;
            this.f88n = 1;
            obj = e.a.a.a.y0.m.o1.c.u0(xVar, aVar2, this);
            if (obj == aVar) {
                return aVar;
            }
        } else if (i2 == 1) {
            z zVar2 = (z) this.f87m;
            b.q.a.a.c3(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        j jVar = (j) obj;
        h hVar = this.f89o;
        if (jVar != null) {
            page = jVar.a;
        }
        hVar.f74h = page;
        if (page != null) {
            page.f7132k = hVar.f108n;
        }
        if (jVar != null && jVar.f320b) {
            p.a.a.c.b().g(new r0());
        } else if (page == null) {
            p.a.a.c.b().g(new s(false, 1));
        } else {
            if (!this.f90p) {
                SwipeRefreshLayout swipeRefreshLayout = hVar.f107m;
                if (swipeRefreshLayout != null) {
                    swipeRefreshLayout.setEnabled(true);
                }
                RelativeLayout relativeLayout = this.f91q;
                if (relativeLayout != null) {
                    o.e(relativeLayout);
                }
                FragmentActivity activity2 = this.f89o.getActivity();
                if (activity2 != null) {
                    BravoApp.b bVar = BravoApp.Q;
                    Fragment t = b.f.a.e.t(activity2, BravoApp.O);
                    if (!(t == null || (activity = this.f89o.getActivity()) == null)) {
                        b.f.a.e.s0(activity, t);
                    }
                }
            } else {
                SwipeRefreshLayout swipeRefreshLayout2 = hVar.f107m;
                if (swipeRefreshLayout2 != null) {
                    swipeRefreshLayout2.setRefreshing(false);
                }
            }
            h hVar2 = this.f89o;
            int i3 = h.f104p;
            hVar2.g();
        }
        return r.a;
    }

    public final Object invoke(Object obj, Object obj2) {
        e.v.d dVar = (e.v.d) obj2;
        i.e(dVar, "completion");
        d dVar2 = new d(this.f89o, this.f90p, this.f91q, dVar);
        dVar2.f86l = (z) obj;
        return dVar2.d(r.a);
    }
}
