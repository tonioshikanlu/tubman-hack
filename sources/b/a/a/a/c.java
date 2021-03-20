package b.a.a.a;

import android.app.Dialog;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.RelativeLayout;
import app.bravostudio.A01F175WZXYVE9FWM81EKWKN6FN.R;
import b.a.a.g.r0;
import b.a.a.g.s;
import b.a.a.h.o;
import b.a.a.i.j;
import b.a.a.n.f;
import com.appfoundry.previewer.model.Page;
import e.r;
import e.v.d;
import e.v.j.a.h;
import e.x.b.p;
import e.x.c.i;
import g.a.a.m;
import g.a.a0;
import g.a.i0;
import g.a.x;
import g.a.y0;
import g.a.z;
import k.a.a.a.e;

public final class c extends e {

    /* renamed from: i  reason: collision with root package name */
    public Page f77i;

    /* renamed from: j  reason: collision with root package name */
    public View f78j;

    @e.v.j.a.e(c = "com.appfoundry.previewer.fragments.BlurPopupFragment$getRemotePageWithCoroutines$1", f = "BlurPopupFragment.kt", l = {79}, m = "invokeSuspend")
    public static final class a extends h implements p<z, d<? super r>, Object> {

        /* renamed from: l  reason: collision with root package name */
        public z f79l;

        /* renamed from: m  reason: collision with root package name */
        public Object f80m;

        /* renamed from: n  reason: collision with root package name */
        public int f81n;

        /* renamed from: o  reason: collision with root package name */
        public final /* synthetic */ c f82o;

        /* renamed from: p  reason: collision with root package name */
        public final /* synthetic */ RelativeLayout f83p;

        @e.v.j.a.e(c = "com.appfoundry.previewer.fragments.BlurPopupFragment$getRemotePageWithCoroutines$1$remoteResponse$1", f = "BlurPopupFragment.kt", l = {}, m = "invokeSuspend")
        /* renamed from: b.a.a.a.c$a$a  reason: collision with other inner class name */
        public static final class C0004a extends h implements p<z, d<? super j>, Object> {

            /* renamed from: l  reason: collision with root package name */
            public z f84l;

            /* renamed from: m  reason: collision with root package name */
            public final /* synthetic */ a f85m;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C0004a(a aVar, d dVar) {
                super(2, dVar);
                this.f85m = aVar;
            }

            public final d<r> a(Object obj, d<?> dVar) {
                i.e(dVar, "completion");
                C0004a aVar = new C0004a(this.f85m, dVar);
                aVar.f84l = (z) obj;
                return aVar;
            }

            public final Object d(Object obj) {
                b.q.a.a.c3(obj);
                return b.a.a.n.c.i(this.f85m.f82o.f77i, false, 2);
            }

            public final Object invoke(Object obj, Object obj2) {
                d dVar = (d) obj2;
                i.e(dVar, "completion");
                a aVar = this.f85m;
                dVar.getContext();
                z zVar = (z) obj;
                b.q.a.a.c3(r.a);
                return b.a.a.n.c.i(aVar.f82o.f77i, false, 2);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(c cVar, RelativeLayout relativeLayout, d dVar) {
            super(2, dVar);
            this.f82o = cVar;
            this.f83p = relativeLayout;
        }

        public final d<r> a(Object obj, d<?> dVar) {
            i.e(dVar, "completion");
            a aVar = new a(this.f82o, this.f83p, dVar);
            aVar.f79l = (z) obj;
            return aVar;
        }

        public final Object d(Object obj) {
            p.a.a.c cVar;
            Object obj2;
            e.v.i.a aVar = e.v.i.a.COROUTINE_SUSPENDED;
            int i2 = this.f81n;
            Float f = null;
            if (i2 == 0) {
                b.q.a.a.c3(obj);
                z zVar = this.f79l;
                x xVar = i0.f9955b;
                C0004a aVar2 = new C0004a(this, (d) null);
                this.f80m = zVar;
                this.f81n = 1;
                obj = e.a.a.a.y0.m.o1.c.u0(xVar, aVar2, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else if (i2 == 1) {
                z zVar2 = (z) this.f80m;
                b.q.a.a.c3(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j jVar = (j) obj;
            c cVar2 = this.f82o;
            Page page = jVar != null ? jVar.a : null;
            cVar2.f77i = page;
            if (jVar != null && jVar.f320b) {
                cVar = p.a.a.c.b();
                obj2 = new r0();
            } else if (page == null) {
                cVar = p.a.a.c.b();
                obj2 = new s(false, 1);
            } else {
                RelativeLayout relativeLayout = this.f83p;
                if (relativeLayout != null) {
                    o.e(relativeLayout);
                }
                c cVar3 = this.f82o;
                View view = cVar3.f78j;
                if (view != null) {
                    Page page2 = cVar3.f77i;
                    if (page2 != null) {
                        f = b.a.a.h.e.q(page2);
                    }
                    o.j(view, page2, f);
                    return r.a;
                }
                i.m("pageLayout");
                throw null;
            }
            cVar.g(obj2);
            return r.a;
        }

        public final Object invoke(Object obj, Object obj2) {
            d dVar = (d) obj2;
            i.e(dVar, "completion");
            a aVar = new a(this.f82o, this.f83p, dVar);
            aVar.f79l = (z) obj;
            return aVar.d(r.a);
        }
    }

    public final void c() {
        View view = this.f78j;
        if (view != null) {
            RelativeLayout relativeLayout = (RelativeLayout) view.findViewById(R.id.fragment_loading);
            Page o2 = f.o("state:loading");
            if (o2 != null) {
                View view2 = this.f78j;
                if (view2 != null) {
                    Page page = this.f77i;
                    o.j(view2, o2, page != null ? b.a.a.h.e.q(page) : null);
                } else {
                    i.m("pageLayout");
                    throw null;
                }
            } else if (relativeLayout != null) {
                o.l(relativeLayout);
            }
            x xVar = i0.a;
            e.a.a.a.y0.m.o1.c.S(e.a.a.a.y0.m.o1.c.b(m.f9916b.plus(e.a.a.a.y0.m.o1.c.c((y0) null, 1, (Object) null))), (e.v.f) null, (a0) null, new a(this, relativeLayout, (d) null), 3, (Object) null);
            return;
        }
        i.m("pageLayout");
        throw null;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Window window;
        i.e(layoutInflater, "inflater");
        super.onCreateView(layoutInflater, viewGroup, bundle);
        View inflate = layoutInflater.inflate(R.layout.dialog_fragment_list_simplified, viewGroup, false);
        i.d(inflate, "inflater.inflate(R.layou…lified, container, false)");
        this.f78j = inflate;
        getContext();
        Page page = this.f77i;
        b.a.a.n.c.c(page != null ? page.c : null);
        Page page2 = this.f77i;
        if (page2 == null || !b.a.a.h.e.E(page2)) {
            View view = this.f78j;
            if (view != null) {
                Page page3 = this.f77i;
                o.j(view, page3, page3 != null ? b.a.a.h.e.q(page3) : null);
            } else {
                i.m("pageLayout");
                throw null;
            }
        } else {
            Page page4 = this.f77i;
            if (page4 == null || !b.a.a.h.e.v(page4)) {
                Page page5 = this.f77i;
                if ((page5 != null ? page5.f : null) != null) {
                    View view2 = this.f78j;
                    if (view2 != null) {
                        o.j(view2, page5, page5 != null ? b.a.a.h.e.q(page5) : null);
                    } else {
                        i.m("pageLayout");
                        throw null;
                    }
                }
            }
            c();
        }
        Dialog dialog = getDialog();
        if (!(dialog == null || (window = dialog.getWindow()) == null)) {
            window.setBackgroundDrawable(new ColorDrawable(0));
        }
        View view3 = this.f78j;
        if (view3 != null) {
            return view3;
        }
        i.m("pageLayout");
        throw null;
    }

    public void onDestroyView() {
        super.onDestroyView();
    }
}
