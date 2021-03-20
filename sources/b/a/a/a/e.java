package b.a.a.a;

import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import b.a.a.h.o;
import b.a.a.i.j;
import b.a.a.n.c;
import com.appfoundry.previewer.model.Container;
import com.appfoundry.previewer.model.Page;
import com.google.android.flexbox.FlexboxLayoutManager;
import e.r;
import e.v.d;
import e.v.f;
import e.v.j.a.h;
import e.x.b.p;
import e.x.c.i;
import g.a.a.m;
import g.a.a0;
import g.a.i0;
import g.a.x;
import g.a.y0;
import g.a.z;
import java.util.List;
import java.util.Objects;

public final class e extends RecyclerView.OnScrollListener {
    public final /* synthetic */ h a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ FrameLayout f94b;

    @e.v.j.a.e(c = "com.appfoundry.previewer.fragments.BravoFragment$setupLoadMore$1$onScrolled$1", f = "BravoFragment.kt", l = {365}, m = "invokeSuspend")
    public static final class a extends h implements p<z, d<? super r>, Object> {

        /* renamed from: l  reason: collision with root package name */
        public z f95l;

        /* renamed from: m  reason: collision with root package name */
        public Object f96m;

        /* renamed from: n  reason: collision with root package name */
        public Object f97n;

        /* renamed from: o  reason: collision with root package name */
        public int f98o;

        /* renamed from: p  reason: collision with root package name */
        public final /* synthetic */ e f99p;

        /* renamed from: q  reason: collision with root package name */
        public final /* synthetic */ RecyclerView f100q;

        @e.v.j.a.e(c = "com.appfoundry.previewer.fragments.BravoFragment$setupLoadMore$1$onScrolled$1$1", f = "BravoFragment.kt", l = {}, m = "invokeSuspend")
        /* renamed from: b.a.a.a.e$a$a  reason: collision with other inner class name */
        public static final class C0005a extends h implements p<z, d<? super Page>, Object> {

            /* renamed from: l  reason: collision with root package name */
            public z f101l;

            /* renamed from: m  reason: collision with root package name */
            public final /* synthetic */ a f102m;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C0005a(a aVar, d dVar) {
                super(2, dVar);
                this.f102m = aVar;
            }

            public final d<r> a(Object obj, d<?> dVar) {
                i.e(dVar, "completion");
                C0005a aVar = new C0005a(this.f102m, dVar);
                aVar.f101l = (z) obj;
                return aVar;
            }

            public final Object d(Object obj) {
                b.q.a.a.c3(obj);
                j i2 = c.i(this.f102m.f99p.a.f74h, false, 2);
                if (i2 != null) {
                    return i2.a;
                }
                return null;
            }

            public final Object invoke(Object obj, Object obj2) {
                d dVar = (d) obj2;
                i.e(dVar, "completion");
                a aVar = this.f102m;
                dVar.getContext();
                z zVar = (z) obj;
                b.q.a.a.c3(r.a);
                j i2 = c.i(aVar.f99p.a.f74h, false, 2);
                if (i2 != null) {
                    return i2.a;
                }
                return null;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(e eVar, RecyclerView recyclerView, d dVar) {
            super(2, dVar);
            this.f99p = eVar;
            this.f100q = recyclerView;
        }

        public final d<r> a(Object obj, d<?> dVar) {
            i.e(dVar, "completion");
            a aVar = new a(this.f99p, this.f100q, dVar);
            aVar.f95l = (z) obj;
            return aVar;
        }

        public final Object d(Object obj) {
            h hVar;
            e.v.i.a aVar = e.v.i.a.COROUTINE_SUSPENDED;
            int i2 = this.f98o;
            List<Container> list = null;
            if (i2 == 0) {
                b.q.a.a.c3(obj);
                z zVar = this.f95l;
                h hVar2 = this.f99p.a;
                x xVar = i0.f9955b;
                C0005a aVar2 = new C0005a(this, (d) null);
                this.f96m = zVar;
                this.f97n = hVar2;
                this.f98o = 1;
                obj = e.a.a.a.y0.m.o1.c.u0(xVar, aVar2, this);
                if (obj == aVar) {
                    return aVar;
                }
                hVar = hVar2;
            } else if (i2 == 1) {
                hVar = (h) this.f97n;
                z zVar2 = (z) this.f96m;
                b.q.a.a.c3(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            hVar.f74h = (Page) obj;
            Page page = this.f99p.a.f74h;
            if ((page != null ? page.w : null) != null) {
                RecyclerView.Adapter adapter = this.f100q.getAdapter();
                Objects.requireNonNull(adapter, "null cannot be cast to non-null type com.appfoundry.previewer.recycler.ContainerAdapter");
                b.a.a.l.a aVar3 = (b.a.a.l.a) adapter;
                Page page2 = this.f99p.a.f74h;
                if (page2 != null) {
                    list = page2.w;
                }
                if (list != null) {
                    int size = list.size();
                    List<Container> list2 = aVar3.f334b;
                    if (list2 != null) {
                        list2.addAll(list);
                    }
                    aVar3.notifyItemInserted(size);
                }
            }
            FrameLayout frameLayout = this.f99p.f94b;
            if (frameLayout != null) {
                o.e(frameLayout);
            }
            return r.a;
        }

        public final Object invoke(Object obj, Object obj2) {
            d dVar = (d) obj2;
            i.e(dVar, "completion");
            a aVar = new a(this.f99p, this.f100q, dVar);
            aVar.f95l = (z) obj;
            return aVar.d(r.a);
        }
    }

    public e(h hVar, FrameLayout frameLayout) {
        this.a = hVar;
        this.f94b = frameLayout;
    }

    public void onScrolled(RecyclerView recyclerView, int i2, int i3) {
        i.e(recyclerView, "recyclerView");
        super.onScrolled(recyclerView, i2, i3);
        h hVar = this.a;
        int i4 = h.f104p;
        Page page = hVar.f74h;
        boolean z = false;
        if ((page != null ? page.f : null) != null) {
            RecyclerView recyclerView2 = hVar.f105k;
            if (recyclerView2 != null) {
                RecyclerView.LayoutManager layoutManager = recyclerView2.getLayoutManager();
                Objects.requireNonNull(layoutManager, "null cannot be cast to non-null type com.google.android.flexbox.FlexboxLayoutManager");
                int findLastVisibleItemPosition = ((FlexboxLayoutManager) layoutManager).findLastVisibleItemPosition();
                Page page2 = hVar.f74h;
                i.c(page2);
                List<Container> list = page2.f;
                i.c(list);
                if (findLastVisibleItemPosition == list.size() - 1) {
                    z = true;
                }
            } else {
                i.m("recyclerView");
                throw null;
            }
        }
        if (z) {
            FrameLayout frameLayout = this.f94b;
            if (frameLayout != null) {
                o.l(frameLayout);
            }
            x xVar = i0.a;
            e.a.a.a.y0.m.o1.c.S(e.a.a.a.y0.m.o1.c.b(m.f9916b.plus(e.a.a.a.y0.m.o1.c.c((y0) null, 1, (Object) null))), (f) null, (a0) null, new a(this, recyclerView, (d) null), 3, (Object) null);
        }
    }
}
