package b.a.a.a;

import android.content.res.Resources;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import b.a.a.b.l.b;
import b.a.a.b.l.c;
import b.a.a.g.f;
import b.a.a.g.k;
import b.f.a.e;
import com.appfoundry.previewer.BravoApp;
import com.appfoundry.previewer.model.Component;
import com.appfoundry.previewer.model.Container;
import com.appfoundry.previewer.model.Page;
import com.appfoundry.previewer.model.Text;
import e.x.c.i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import org.greenrobot.eventbus.ThreadMode;
import p.a.a.m;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\bD\u0010\u0004J\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J-\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000e\u0010\u0004J\u000f\u0010\u000f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0004J\u000f\u0010\u0010\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0004J\u0017\u0010\u0013\u001a\u00020\u00022\b\b\u0002\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J)\u0010\u001a\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001e\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u001cH\u0007¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010!\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020 H\u0007¢\u0006\u0004\b!\u0010\"J\u0017\u0010$\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020#H\u0007¢\u0006\u0004\b$\u0010%R\"\u0010,\u001a\u00020\u000b8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\u0018\u00100\u001a\u0004\u0018\u00010-8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b.\u0010/R$\u00108\u001a\u0004\u0018\u0001018\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b2\u00103\u001a\u0004\b4\u00105\"\u0004\b6\u00107R\"\u0010@\u001a\u0002098\u0006@\u0006X.¢\u0006\u0012\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R\u0016\u0010C\u001a\u00020\u00158\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bA\u0010B¨\u0006E"}, d2 = {"Lb/a/a/a/h;", "Lb/a/a/a/b;", "Le/r;", "g", "()V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "onStart", "onDestroy", "onPause", "", "fromPullToRefresh", "e", "(Z)V", "", "transit", "enter", "nextAnim", "Landroid/view/animation/Animation;", "onCreateAnimation", "(IZI)Landroid/view/animation/Animation;", "Lb/a/a/g/k;", "event", "onFilterEventOld", "(Lb/a/a/g/k;)V", "Lb/a/a/g/i;", "onEnableRotationEvent", "(Lb/a/a/g/i;)V", "Lb/a/a/g/f;", "onDisableRotationEvent", "(Lb/a/a/g/f;)V", "l", "Landroid/view/View;", "d", "()Landroid/view/View;", "setPageView", "(Landroid/view/View;)V", "pageView", "", "n", "Ljava/lang/String;", "originalRemoteUrl", "Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;", "m", "Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;", "getSwipeRefreshLayout", "()Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;", "setSwipeRefreshLayout", "(Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;)V", "swipeRefreshLayout", "Landroidx/recyclerview/widget/RecyclerView;", "k", "Landroidx/recyclerview/widget/RecyclerView;", "getRecyclerView", "()Landroidx/recyclerview/widget/RecyclerView;", "setRecyclerView", "(Landroidx/recyclerview/widget/RecyclerView;)V", "recyclerView", "o", "I", "currentScrollY", "<init>", "app_release"}, k = 1, mv = {1, 1, 15})
public final class h extends b {

    /* renamed from: p  reason: collision with root package name */
    public static final /* synthetic */ int f104p = 0;

    /* renamed from: k  reason: collision with root package name */
    public RecyclerView f105k;

    /* renamed from: l  reason: collision with root package name */
    public View f106l;

    /* renamed from: m  reason: collision with root package name */
    public SwipeRefreshLayout f107m;

    /* renamed from: n  reason: collision with root package name */
    public String f108n;

    /* renamed from: o  reason: collision with root package name */
    public int f109o;

    public static final class a extends RecyclerView.OnScrollListener {
        public final /* synthetic */ h a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ Toolbar f110b;

        public a(h hVar, Toolbar toolbar) {
            this.a = hVar;
            this.f110b = toolbar;
        }

        public void onScrolled(RecyclerView recyclerView, int i2, int i3) {
            i.e(recyclerView, "recyclerView");
            super.onScrolled(recyclerView, i2, i3);
            this.a.f109o += i3;
            int computeVerticalScrollExtent = recyclerView.computeVerticalScrollExtent();
            int computeVerticalScrollRange = recyclerView.computeVerticalScrollRange();
            Toolbar toolbar = this.f110b;
            int height = toolbar != null ? toolbar.getHeight() : 0;
            int i4 = computeVerticalScrollRange - computeVerticalScrollExtent;
            if (i4 > height) {
                i4 = height;
            }
            q.a.a.d.a("TOOLBAR extent = %d, range = %d, topbar = %d", Integer.valueOf(computeVerticalScrollExtent), Integer.valueOf(computeVerticalScrollRange), Integer.valueOf(height));
            float f = 1.0f;
            float f2 = (((float) this.a.f109o) * 1.0f) / ((float) i4);
            Toolbar toolbar2 = this.f110b;
            if (toolbar2 != null) {
                if (f2 <= 1.0f) {
                    f = f2;
                }
                toolbar2.setAlpha(f);
            }
        }
    }

    public static /* synthetic */ void f(h hVar, boolean z, int i2) {
        if ((i2 & 1) != 0) {
            z = false;
        }
        hVar.e(z);
    }

    public void c() {
    }

    public final View d() {
        View view = this.f106l;
        if (view != null) {
            return view;
        }
        i.m("pageView");
        throw null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00cc, code lost:
        if (e.x.c.i.a(r9 != null ? r9.f7131j : null, r2) != false) goto L_0x00ce;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void e(boolean r20) {
        /*
            r19 = this;
            r0 = r19
            r1 = r20
            android.content.Context r2 = b.f.a.e.c()
            java.lang.String r3 = "com.appfoundry.previewerLoaded"
            r4 = 0
            android.content.SharedPreferences r2 = r2.getSharedPreferences(r3, r4)
            java.lang.String r5 = "appContext().getSharedPr…ME, Context.MODE_PRIVATE)"
            e.x.c.i.d(r2, r5)
            java.lang.String r6 = "refreshToken"
            java.lang.String r7 = "key"
            e.x.c.i.e(r6, r7)
            java.lang.String r8 = ""
            java.lang.String r2 = r2.getString(r6, r8)
            android.content.Context r6 = b.f.a.e.c()
            android.content.SharedPreferences r3 = r6.getSharedPreferences(r3, r4)
            e.x.c.i.d(r3, r5)
            java.lang.String r5 = "expirationTimeMilliseconds"
            e.x.c.i.e(r5, r7)
            java.lang.String r3 = r3.getString(r5, r8)
            r5 = 1
            if (r2 == 0) goto L_0x005c
            boolean r2 = e.x.c.i.a(r2, r8)
            r2 = r2 ^ r5
            if (r2 == 0) goto L_0x005c
            if (r3 == 0) goto L_0x005c
            boolean r2 = e.x.c.i.a(r3, r8)
            r2 = r2 ^ r5
            if (r2 == 0) goto L_0x005c
            boolean r2 = b.f.a.e.U()
            if (r2 == 0) goto L_0x005c
            long r2 = java.lang.Long.parseLong(r3)
            long r6 = java.lang.System.currentTimeMillis()
            int r2 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r2 >= 0) goto L_0x005c
            r2 = r5
            goto L_0x005d
        L_0x005c:
            r2 = r4
        L_0x005d:
            java.lang.String r3 = "loading"
            r6 = 2131230945(0x7f0800e1, float:1.8077957E38)
            java.lang.String r7 = "pageView"
            r8 = 0
            if (r2 == 0) goto L_0x009b
            android.view.View r2 = r0.f106l
            if (r2 == 0) goto L_0x0097
            android.view.View r2 = r2.findViewById(r6)
            android.widget.RelativeLayout r2 = (android.widget.RelativeLayout) r2
            if (r1 != 0) goto L_0x0079
            e.x.c.i.d(r2, r3)
            b.a.a.h.o.l(r2)
        L_0x0079:
            g.a.x r3 = g.a.i0.a
            g.a.h1 r3 = g.a.a.m.f9916b
            g.a.p r4 = e.a.a.a.y0.m.o1.c.c(r8, r5, r8)
            e.v.f r3 = r3.plus(r4)
            g.a.z r9 = e.a.a.a.y0.m.o1.c.b(r3)
            r10 = 0
            r11 = 0
            b.a.a.a.a r12 = new b.a.a.a.a
            r12.<init>(r0, r1, r2, r8)
            r13 = 3
            r14 = 0
            e.a.a.a.y0.m.o1.c.S(r9, r10, r11, r12, r13, r14)
            goto L_0x015b
        L_0x0097:
            e.x.c.i.m(r7)
            throw r8
        L_0x009b:
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            android.view.View r9 = r0.f106l
            if (r9 == 0) goto L_0x015c
            android.view.View r6 = r9.findViewById(r6)
            android.widget.RelativeLayout r6 = (android.widget.RelativeLayout) r6
            if (r1 != 0) goto L_0x013f
            androidx.swiperefreshlayout.widget.SwipeRefreshLayout r9 = r0.f107m
            if (r9 == 0) goto L_0x00b0
            r9.setEnabled(r4)
        L_0x00b0:
            com.appfoundry.previewer.model.Page r4 = b.a.a.n.f.j()
            com.appfoundry.previewer.model.Page r9 = r0.f74h
            if (r9 == 0) goto L_0x00bd
            com.appfoundry.previewer.model.Page r9 = b.a.a.h.e.m(r9)
            goto L_0x00be
        L_0x00bd:
            r9 = r8
        L_0x00be:
            if (r9 == 0) goto L_0x00ce
            com.appfoundry.previewer.model.Page r9 = r0.f74h
            if (r9 == 0) goto L_0x00c7
            java.lang.Boolean r9 = r9.f7131j
            goto L_0x00c8
        L_0x00c7:
            r9 = r8
        L_0x00c8:
            boolean r9 = e.x.c.i.a(r9, r2)
            if (r9 == 0) goto L_0x013f
        L_0x00ce:
            if (r4 == 0) goto L_0x0139
            com.appfoundry.previewer.model.Page r9 = r0.f74h
            if (r9 == 0) goto L_0x00d7
            java.lang.Boolean r9 = r9.f7131j
            goto L_0x00d8
        L_0x00d7:
            r9 = r8
        L_0x00d8:
            boolean r2 = e.x.c.i.a(r9, r2)
            if (r2 == 0) goto L_0x00e5
            boolean r2 = b.a.a.n.c.b()
            if (r2 == 0) goto L_0x00e5
            goto L_0x0139
        L_0x00e5:
            android.view.View r2 = r0.f106l
            if (r2 == 0) goto L_0x0135
            b.a.a.h.o.i(r2)
            android.view.View r2 = r0.f106l
            if (r2 == 0) goto L_0x0131
            java.lang.String r3 = r4.a
            com.appfoundry.previewer.model.Container r9 = r4.f7130i
            java.lang.Boolean r14 = java.lang.Boolean.FALSE
            b.a.a.h.o.a(r2, r3, r9, r14)
            android.view.View r2 = r0.f106l
            if (r2 == 0) goto L_0x012d
            java.lang.String r3 = r4.a
            com.appfoundry.previewer.model.Container r9 = r4.d
            b.a.a.h.o.d(r2, r3, r9, r14)
            android.view.View r2 = r0.f106l
            if (r2 == 0) goto L_0x0129
            r3 = 2131231128(0x7f080198, float:1.8078328E38)
            android.view.View r2 = r2.findViewById(r3)
            java.lang.String r3 = "pageView.findViewById(R.id.recyclerView)"
            e.x.c.i.d(r2, r3)
            r10 = r2
            androidx.recyclerview.widget.RecyclerView r10 = (androidx.recyclerview.widget.RecyclerView) r10
            r0.f105k = r10
            java.lang.String r11 = r4.a
            java.util.List<com.appfoundry.previewer.model.Container> r12 = r4.f
            r13 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 116(0x74, float:1.63E-43)
            b.f.a.e.C0(r10, r11, r12, r13, r14, r15, r16, r17, r18)
            goto L_0x013f
        L_0x0129:
            e.x.c.i.m(r7)
            throw r8
        L_0x012d:
            e.x.c.i.m(r7)
            throw r8
        L_0x0131:
            e.x.c.i.m(r7)
            throw r8
        L_0x0135:
            e.x.c.i.m(r7)
            throw r8
        L_0x0139:
            e.x.c.i.d(r6, r3)
            b.a.a.h.o.l(r6)
        L_0x013f:
            g.a.x r2 = g.a.i0.a
            g.a.h1 r2 = g.a.a.m.f9916b
            g.a.p r3 = e.a.a.a.y0.m.o1.c.c(r8, r5, r8)
            e.v.f r2 = r2.plus(r3)
            g.a.z r9 = e.a.a.a.y0.m.o1.c.b(r2)
            r10 = 0
            r11 = 0
            b.a.a.a.d r12 = new b.a.a.a.d
            r12.<init>(r0, r1, r6, r8)
            r13 = 3
            r14 = 0
            e.a.a.a.y0.m.o1.c.S(r9, r10, r11, r12, r13, r14)
        L_0x015b:
            return
        L_0x015c:
            e.x.c.i.m(r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: b.a.a.a.h.e(boolean):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:123:0x022a  */
    /* JADX WARNING: Removed duplicated region for block: B:159:0x02ab  */
    /* JADX WARNING: Removed duplicated region for block: B:164:0x02be  */
    /* JADX WARNING: Removed duplicated region for block: B:184:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void g() {
        /*
            r31 = this;
            r0 = r31
            com.appfoundry.previewer.model.Page r1 = r0.f74h
            if (r1 == 0) goto L_0x000e
            java.lang.String r3 = "nomenu"
            boolean r1 = b.a.a.h.e.x(r1, r3)
            r9 = r1
            goto L_0x000f
        L_0x000e:
            r9 = 0
        L_0x000f:
            androidx.fragment.app.FragmentActivity r1 = r31.getActivity()
            java.lang.String r3 = "menu:tabs"
            r12 = 1
            if (r1 == 0) goto L_0x0065
            r4 = 2131231221(0x7f0801f5, float:1.8078517E38)
            java.lang.String r5 = "it"
            if (r9 != 0) goto L_0x0048
            com.appfoundry.previewer.model.Page r6 = r0.f74h
            if (r6 == 0) goto L_0x002a
            boolean r6 = b.a.a.h.e.A(r6)
            if (r6 != r12) goto L_0x002a
            goto L_0x0048
        L_0x002a:
            e.x.c.i.d(r1, r5)
            java.lang.String r5 = "$this$showTabMenu"
            e.x.c.i.e(r1, r5)
            java.lang.String r5 = b.f.a.e.K()
            boolean r5 = e.x.c.i.a(r5, r3)
            if (r5 == 0) goto L_0x0065
            android.view.View r1 = r1.findViewById(r4)
            android.widget.FrameLayout r1 = (android.widget.FrameLayout) r1
            if (r1 == 0) goto L_0x0065
            b.a.a.h.o.l(r1)
            goto L_0x0065
        L_0x0048:
            e.x.c.i.d(r1, r5)
            java.lang.String r5 = "$this$hideTabMenu"
            e.x.c.i.e(r1, r5)
            java.lang.String r5 = b.f.a.e.K()
            boolean r5 = e.x.c.i.a(r5, r3)
            if (r5 == 0) goto L_0x0065
            android.view.View r1 = r1.findViewById(r4)
            android.widget.FrameLayout r1 = (android.widget.FrameLayout) r1
            if (r1 == 0) goto L_0x0065
            b.a.a.h.o.e(r1)
        L_0x0065:
            android.view.View r1 = r0.f106l
            java.lang.String r13 = "pageView"
            if (r1 == 0) goto L_0x0302
            b.a.a.h.o.i(r1)
            android.view.View r1 = r0.f106l
            if (r1 == 0) goto L_0x02fd
            com.appfoundry.previewer.model.Page r4 = r0.f74h
            if (r4 == 0) goto L_0x0079
            java.lang.String r5 = r4.a
            goto L_0x007a
        L_0x0079:
            r5 = 0
        L_0x007a:
            if (r4 == 0) goto L_0x007f
            com.appfoundry.previewer.model.Container r6 = r4.f7130i
            goto L_0x0080
        L_0x007f:
            r6 = 0
        L_0x0080:
            if (r4 == 0) goto L_0x0089
            boolean r4 = r4.x
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            goto L_0x008a
        L_0x0089:
            r4 = 0
        L_0x008a:
            b.a.a.h.o.a(r1, r5, r6, r4)
            android.view.View r1 = r0.f106l
            if (r1 == 0) goto L_0x02f8
            com.appfoundry.previewer.model.Page r4 = r0.f74h
            if (r4 == 0) goto L_0x0098
            java.lang.String r5 = r4.a
            goto L_0x0099
        L_0x0098:
            r5 = 0
        L_0x0099:
            if (r4 == 0) goto L_0x009e
            com.appfoundry.previewer.model.Container r6 = r4.d
            goto L_0x009f
        L_0x009e:
            r6 = 0
        L_0x009f:
            if (r4 == 0) goto L_0x00a8
            boolean r4 = r4.x
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            goto L_0x00a9
        L_0x00a8:
            r4 = 0
        L_0x00a9:
            androidx.appcompat.widget.Toolbar r1 = b.a.a.h.o.d(r1, r5, r6, r4)
            android.view.View r4 = r0.f106l
            if (r4 == 0) goto L_0x02f3
            com.appfoundry.previewer.model.Page r5 = r0.f74h
            if (r5 == 0) goto L_0x00b8
            java.lang.String r6 = r5.a
            goto L_0x00b9
        L_0x00b8:
            r6 = 0
        L_0x00b9:
            if (r5 == 0) goto L_0x00be
            java.util.List<com.appfoundry.previewer.model.Container> r5 = r5.f7128g
            goto L_0x00bf
        L_0x00be:
            r5 = 0
        L_0x00bf:
            java.lang.String r7 = "$this$addLayers"
            e.x.c.i.e(r4, r7)
            if (r5 == 0) goto L_0x0172
            boolean r7 = r5.isEmpty()
            r7 = r7 ^ r12
            if (r7 == 0) goto L_0x0172
            r7 = 2131230989(0x7f08010d, float:1.8078046E38)
            android.view.View r7 = r4.findViewById(r7)
            android.widget.FrameLayout r7 = (android.widget.FrameLayout) r7
            java.util.Iterator r5 = r5.iterator()
        L_0x00da:
            boolean r8 = r5.hasNext()
            if (r8 == 0) goto L_0x0172
            java.lang.Object r8 = r5.next()
            com.appfoundry.previewer.model.Container r8 = (com.appfoundry.previewer.model.Container) r8
            android.content.Context r10 = r4.getContext()
            java.lang.String r11 = "context"
            e.x.c.i.d(r10, r11)
            java.lang.Boolean r15 = java.lang.Boolean.FALSE
            java.lang.String r2 = "$this$createLayerLayout"
            e.x.c.i.e(r8, r2)
            e.x.c.i.e(r10, r11)
            android.widget.FrameLayout r2 = new android.widget.FrameLayout
            r2.<init>(r10)
            java.lang.String r12 = r8.c
            com.appfoundry.previewer.model.Style r24 = b.a.a.n.f.t(r12, r15)
            java.lang.String r12 = "$this$setupAsLayer"
            e.x.c.i.e(r2, r12)
            com.appfoundry.previewer.BravoApp$b r12 = com.appfoundry.previewer.BravoApp.Q
            int r12 = com.appfoundry.previewer.BravoApp.N
            java.lang.String r14 = b.f.a.e.K()
            boolean r14 = e.x.c.i.a(r14, r3)
            if (r14 == 0) goto L_0x0123
            android.content.Context r14 = r2.getContext()
            e.x.c.i.d(r14, r11)
            int r11 = b.f.a.e.O(r14)
            int r12 = r12 - r11
        L_0x0123:
            r26 = r12
            int r25 = b.a.a.n.c.t()
            r27 = 0
            r28 = 0
            r29 = 0
            r30 = 56
            r23 = r2
            b.a.a.i.b r11 = b.a.a.h.o.h(r23, r24, r25, r26, r27, r28, r29, r30)
            java.lang.String r12 = "frameLayout"
            e.x.c.i.e(r2, r12)
            java.lang.String r12 = "dimensions"
            e.x.c.i.e(r11, r12)
            b.a.a.h.e.r(r8)
            int r12 = r11.a
            int r14 = r11.f308b
            r21 = r15
            r15 = r8
            r16 = r10
            r17 = r2
            r18 = r12
            r19 = r14
            r20 = r21
            b.a.a.h.e.a(r15, r16, r17, r18, r19, r20)
            int r12 = r11.a
            int r11 = r11.f308b
            r22 = 0
            r17 = r6
            r18 = r2
            r19 = r12
            r20 = r11
            b.a.a.h.e.b(r15, r16, r17, r18, r19, r20, r21, r22)
            b.a.a.h.e.s(r8, r6, r2)
            r7.addView(r2)
            r12 = 1
            goto L_0x00da
        L_0x0172:
            android.view.View r2 = r0.f106l
            if (r2 == 0) goto L_0x02ee
            r3 = 2131231128(0x7f080198, float:1.8078328E38)
            android.view.View r2 = r2.findViewById(r3)
            java.lang.String r3 = "pageView.findViewById(R.id.recyclerView)"
            e.x.c.i.d(r2, r3)
            r3 = r2
            androidx.recyclerview.widget.RecyclerView r3 = (androidx.recyclerview.widget.RecyclerView) r3
            r0.f105k = r3
            com.appfoundry.previewer.model.Page r2 = r0.f74h
            if (r2 == 0) goto L_0x018e
            java.lang.String r4 = r2.a
            goto L_0x018f
        L_0x018e:
            r4 = 0
        L_0x018f:
            if (r2 == 0) goto L_0x0194
            java.util.List<com.appfoundry.previewer.model.Container> r5 = r2.f
            goto L_0x0195
        L_0x0194:
            r5 = 0
        L_0x0195:
            if (r2 == 0) goto L_0x019a
            com.appfoundry.previewer.model.Animation r6 = r2.u
            goto L_0x019b
        L_0x019a:
            r6 = 0
        L_0x019b:
            if (r2 == 0) goto L_0x01a5
            boolean r2 = r2.x
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            r7 = r2
            goto L_0x01a6
        L_0x01a5:
            r7 = 0
        L_0x01a6:
            r8 = 0
            r10 = 0
            r11 = 80
            b.f.a.e.C0(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            com.appfoundry.previewer.model.Page r2 = r0.f74h
            if (r2 == 0) goto L_0x01b8
            com.appfoundry.previewer.model.Container r2 = r2.d
            if (r2 == 0) goto L_0x01b8
            java.lang.String r2 = r2.c
            goto L_0x01b9
        L_0x01b8:
            r2 = 0
        L_0x01b9:
            r3 = 2
            r4 = 0
            com.appfoundry.previewer.model.Style r2 = b.a.a.n.f.u(r2, r4, r3)
            java.lang.String r3 = "recyclerView"
            if (r2 == 0) goto L_0x01e2
            java.lang.String r2 = r2.G
            if (r2 == 0) goto L_0x01e2
            java.lang.String r4 = "showscroll"
            boolean r2 = r2.equals(r4)
            r4 = 1
            if (r2 != r4) goto L_0x01e2
            androidx.recyclerview.widget.RecyclerView r2 = r0.f105k
            if (r2 == 0) goto L_0x01dd
            b.a.a.a.h$a r4 = new b.a.a.a.h$a
            r4.<init>(r0, r1)
            r2.addOnScrollListener(r4)
            goto L_0x01e2
        L_0x01dd:
            e.x.c.i.m(r3)
            r1 = 0
            throw r1
        L_0x01e2:
            java.lang.Boolean r1 = r0.f76j
            if (r1 == 0) goto L_0x0202
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            boolean r1 = e.x.c.i.a(r1, r2)
            if (r1 == 0) goto L_0x0202
            androidx.recyclerview.widget.RecyclerView r1 = r0.f105k
            if (r1 == 0) goto L_0x01fd
            java.lang.String r2 = "$this$disableScroll"
            e.x.c.i.e(r1, r2)
            b.a.a.h.l r2 = b.a.a.h.l.f282h
            r1.setOnTouchListener(r2)
            goto L_0x0202
        L_0x01fd:
            e.x.c.i.m(r3)
            r1 = 0
            throw r1
        L_0x0202:
            com.appfoundry.previewer.model.Page r1 = r0.f74h
            java.lang.String r2 = ""
            if (r1 == 0) goto L_0x024e
            java.lang.String r4 = "$this$shouldHaveLoadMore"
            e.x.c.i.e(r1, r4)
            java.lang.String r4 = r1.f7132k
            if (r4 == 0) goto L_0x0226
            boolean r4 = e.x.c.i.a(r4, r2)
            r5 = 1
            r4 = r4 ^ r5
            if (r4 == 0) goto L_0x0227
            java.lang.String r1 = r1.f7133l
            if (r1 == 0) goto L_0x0227
            boolean r1 = e.x.c.i.a(r1, r2)
            r1 = r1 ^ r5
            if (r1 == 0) goto L_0x0227
            r1 = r5
            goto L_0x0228
        L_0x0226:
            r5 = 1
        L_0x0227:
            r1 = 0
        L_0x0228:
            if (r1 != r5) goto L_0x024e
            android.view.View r1 = r0.f106l
            if (r1 == 0) goto L_0x0249
            r4 = 2131231003(0x7f08011b, float:1.8078075E38)
            android.view.View r1 = r1.findViewById(r4)
            android.widget.FrameLayout r1 = (android.widget.FrameLayout) r1
            androidx.recyclerview.widget.RecyclerView r4 = r0.f105k
            if (r4 == 0) goto L_0x0244
            b.a.a.a.e r3 = new b.a.a.a.e
            r3.<init>(r0, r1)
            r4.addOnScrollListener(r3)
            goto L_0x02a7
        L_0x0244:
            e.x.c.i.m(r3)
            r1 = 0
            throw r1
        L_0x0249:
            r1 = 0
            e.x.c.i.m(r13)
            throw r1
        L_0x024e:
            com.appfoundry.previewer.model.Page r1 = r0.f74h
            if (r1 == 0) goto L_0x029f
            java.lang.String r3 = "$this$hasPullToRefresh"
            e.x.c.i.e(r1, r3)
            java.lang.String r3 = r1.f7132k
            if (r3 == 0) goto L_0x0275
            boolean r3 = e.x.c.i.a(r3, r2)
            r4 = 1
            r3 = r3 ^ r4
            if (r3 == 0) goto L_0x0275
            java.lang.String r3 = "refresh:pull"
            boolean r3 = b.a.a.h.e.x(r1, r3)
            if (r3 != 0) goto L_0x0273
            java.lang.String r3 = "dev:pullToRefresh"
            boolean r1 = b.a.a.h.e.x(r1, r3)
            if (r1 == 0) goto L_0x0275
        L_0x0273:
            r1 = 1
            goto L_0x0276
        L_0x0275:
            r1 = 0
        L_0x0276:
            r3 = 1
            if (r1 != r3) goto L_0x029f
            android.content.Context r1 = r31.getContext()
            if (r1 == 0) goto L_0x0292
            r4 = 2131034147(0x7f050023, float:1.7678803E38)
            int r1 = r1.getColor(r4)
            androidx.swiperefreshlayout.widget.SwipeRefreshLayout r4 = r0.f107m
            if (r4 == 0) goto L_0x0292
            int[] r5 = new int[r3]
            r3 = 0
            r5[r3] = r1
            r4.setColorSchemeColors(r5)
        L_0x0292:
            androidx.swiperefreshlayout.widget.SwipeRefreshLayout r1 = r0.f107m
            if (r1 == 0) goto L_0x02a7
            b.a.a.a.f r3 = new b.a.a.a.f
            r3.<init>(r0)
            r1.setOnRefreshListener(r3)
            goto L_0x02a7
        L_0x029f:
            androidx.swiperefreshlayout.widget.SwipeRefreshLayout r1 = r0.f107m
            if (r1 == 0) goto L_0x02a7
            r3 = 0
            r1.setEnabled(r3)
        L_0x02a7:
            com.appfoundry.previewer.model.Page r1 = r0.f74h
            if (r1 == 0) goto L_0x02bb
            java.lang.String r3 = "$this$hasRefreshInterval"
            e.x.c.i.e(r1, r3)
            java.util.List<java.lang.String> r1 = r1.f7134m
            if (r1 == 0) goto L_0x02bb
            java.lang.String r3 = "refresh:interval"
            java.lang.String r14 = b.f.a.e.P(r1, r3)
            goto L_0x02bc
        L_0x02bb:
            r14 = 0
        L_0x02bc:
            if (r14 == 0) goto L_0x02ed
            java.lang.String r1 = b.a.a.h.m.e(r14)
            boolean r2 = e.x.c.i.a(r1, r2)
            r3 = 1
            r2 = r2 ^ r3
            if (r2 == 0) goto L_0x02ed
            android.os.Handler r2 = new android.os.Handler     // Catch:{ Exception -> 0x02e0 }
            r2.<init>()     // Catch:{ Exception -> 0x02e0 }
            b.a.a.a.g r3 = new b.a.a.a.g     // Catch:{ Exception -> 0x02e0 }
            r3.<init>(r0)     // Catch:{ Exception -> 0x02e0 }
            long r4 = java.lang.Long.parseLong(r1)     // Catch:{ Exception -> 0x02e0 }
            r1 = 1000(0x3e8, float:1.401E-42)
            long r6 = (long) r1     // Catch:{ Exception -> 0x02e0 }
            long r4 = r4 * r6
            r2.postDelayed(r3, r4)     // Catch:{ Exception -> 0x02e0 }
            goto L_0x02ed
        L_0x02e0:
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r14
            q.a.a$b r2 = q.a.a.d
            java.lang.String r3 = "Wrong refresh interval: %s"
            r2.b(r3, r1)
        L_0x02ed:
            return
        L_0x02ee:
            e.x.c.i.m(r13)
            r1 = 0
            throw r1
        L_0x02f3:
            r1 = 0
            e.x.c.i.m(r13)
            throw r1
        L_0x02f8:
            r1 = 0
            e.x.c.i.m(r13)
            throw r1
        L_0x02fd:
            r1 = 0
            e.x.c.i.m(r13)
            throw r1
        L_0x0302:
            r1 = 0
            e.x.c.i.m(r13)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: b.a.a.a.h.g():void");
    }

    public Animation onCreateAnimation(int i2, boolean z, int i3) {
        c cVar = c.a;
        i.e(this, "fragment");
        Animation animation = null;
        if (!z) {
            BravoApp.b bVar = BravoApp.Q;
            if (BravoApp.J) {
                i.e(this, "fragment");
                if (i3 != 0) {
                    try {
                        animation = AnimationUtils.loadAnimation(getContext(), i3);
                        if (animation != null) {
                            animation.setAnimationListener(new b.a.a.b.l.a(this));
                        }
                    } catch (Resources.NotFoundException unused) {
                    }
                }
                return animation;
            }
        }
        animation = AnimationUtils.loadAnimation(getContext(), i3);
        if (animation != null) {
            animation.setAnimationListener(new b(this));
        }
        return animation;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0075, code lost:
        if (r4.equals(r6) != false) goto L_0x0080;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x007e, code lost:
        if (r4.equals(r6) != false) goto L_0x0080;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00d8, code lost:
        if ((r4 != null ? r4.f : null) == null) goto L_0x00cc;
     */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0097  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x009a  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00a4  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00e2 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00e3  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00e7  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View onCreateView(android.view.LayoutInflater r4, android.view.ViewGroup r5, android.os.Bundle r6) {
        /*
            r3 = this;
            java.lang.String r6 = "inflater"
            e.x.c.i.e(r4, r6)
            androidx.fragment.app.FragmentActivity r6 = r3.getActivity()
            if (r6 == 0) goto L_0x000f
            r0 = 5
            r6.setRequestedOrientation(r0)
        L_0x000f:
            r6 = 2131427393(0x7f0b0041, float:1.84764E38)
            r0 = 0
            android.view.View r4 = r4.inflate(r6, r5, r0)
            java.lang.String r5 = "inflater.inflate(R.layou…_solid, container, false)"
            e.x.c.i.d(r4, r5)
            r3.f106l = r4
            com.appfoundry.previewer.model.Page r4 = r3.f74h
            r5 = 0
            if (r4 == 0) goto L_0x003b
            java.lang.String r6 = "statusbar"
            java.lang.String r1 = "$this$getTag"
            e.x.c.i.e(r4, r1)
            java.lang.String r1 = "tag"
            e.x.c.i.e(r6, r1)
            java.util.List<java.lang.String> r4 = r4.f7134m
            if (r4 == 0) goto L_0x003b
            e.x.c.i.c(r4)
            java.lang.String r4 = b.f.a.e.P(r4, r6)
            goto L_0x003c
        L_0x003b:
            r4 = r5
        L_0x003c:
            java.lang.String r6 = "$this$setupStatusBar"
            e.x.c.i.e(r3, r6)
            androidx.fragment.app.FragmentActivity r6 = r3.getActivity()
            if (r6 == 0) goto L_0x0090
            androidx.fragment.app.FragmentActivity r6 = r3.getActivity()
            boolean r6 = r6 instanceof androidx.appcompat.app.AppCompatActivity
            if (r6 == 0) goto L_0x0090
            androidx.fragment.app.FragmentActivity r6 = r3.getActivity()
            java.lang.String r1 = "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity"
            java.util.Objects.requireNonNull(r6, r1)
            androidx.appcompat.app.AppCompatActivity r6 = (androidx.appcompat.app.AppCompatActivity) r6
            b.f.a.e.A0(r6)
            if (r4 != 0) goto L_0x0060
            goto L_0x0084
        L_0x0060:
            int r6 = r4.hashCode()
            r2 = -1046996881(0xffffffffc198186f, float:-19.01193)
            if (r6 == r2) goto L_0x0078
            r2 = 1910451005(0x71df2b3d, float:2.2101577E30)
            if (r6 == r2) goto L_0x006f
            goto L_0x0084
        L_0x006f:
            java.lang.String r6 = "statusbar:light"
            boolean r4 = r4.equals(r6)
            if (r4 == 0) goto L_0x0084
            goto L_0x0080
        L_0x0078:
            java.lang.String r6 = "statusbar:dark"
            boolean r4 = r4.equals(r6)
            if (r4 == 0) goto L_0x0084
        L_0x0080:
            b.a.a.h.e.J(r3, r6)
            goto L_0x0090
        L_0x0084:
            androidx.fragment.app.FragmentActivity r4 = r3.getActivity()
            java.util.Objects.requireNonNull(r4, r1)
            androidx.appcompat.app.AppCompatActivity r4 = (androidx.appcompat.app.AppCompatActivity) r4
            b.f.a.e.f0(r4)
        L_0x0090:
            r3.getContext()
            com.appfoundry.previewer.model.Page r4 = r3.f74h
            if (r4 == 0) goto L_0x009a
            java.lang.String r4 = r4.c
            goto L_0x009b
        L_0x009a:
            r4 = r5
        L_0x009b:
            b.a.a.n.c.c(r4)
            android.view.View r4 = r3.f106l
            java.lang.String r6 = "pageView"
            if (r4 == 0) goto L_0x00e7
            r1 = 2131231219(0x7f0801f3, float:1.8078513E38)
            android.view.View r4 = r4.findViewById(r1)
            androidx.swiperefreshlayout.widget.SwipeRefreshLayout r4 = (androidx.swiperefreshlayout.widget.SwipeRefreshLayout) r4
            r3.f107m = r4
            com.appfoundry.previewer.model.Page r4 = r3.f74h
            if (r4 == 0) goto L_0x00db
            boolean r4 = b.a.a.h.e.E(r4)
            r1 = 1
            if (r4 != r1) goto L_0x00db
            com.appfoundry.previewer.model.Page r4 = r3.f74h
            if (r4 == 0) goto L_0x00c1
            java.lang.String r2 = r4.f7132k
            goto L_0x00c2
        L_0x00c1:
            r2 = r5
        L_0x00c2:
            r3.f108n = r2
            if (r4 == 0) goto L_0x00d0
            boolean r4 = b.a.a.h.e.v(r4)
            if (r4 != r1) goto L_0x00d0
        L_0x00cc:
            r3.e(r0)
            goto L_0x00de
        L_0x00d0:
            com.appfoundry.previewer.model.Page r4 = r3.f74h
            if (r4 == 0) goto L_0x00d7
            java.util.List<com.appfoundry.previewer.model.Container> r4 = r4.f
            goto L_0x00d8
        L_0x00d7:
            r4 = r5
        L_0x00d8:
            if (r4 != 0) goto L_0x00db
            goto L_0x00cc
        L_0x00db:
            r3.g()
        L_0x00de:
            android.view.View r4 = r3.f106l
            if (r4 == 0) goto L_0x00e3
            return r4
        L_0x00e3:
            e.x.c.i.m(r6)
            throw r5
        L_0x00e7:
            e.x.c.i.m(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: b.a.a.a.h.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }

    public void onDestroy() {
        super.onDestroy();
        i.e(this, "$this$unregisterFromEventBus");
        if (p.a.a.c.b().f(this)) {
            p.a.a.c.b().m(this);
        }
    }

    public void onDestroyView() {
        super.onDestroyView();
    }

    @m(threadMode = ThreadMode.MAIN)
    public final void onDisableRotationEvent(f fVar) {
        i.e(fVar, "event");
        FragmentActivity activity = getActivity();
        if (activity != null) {
            activity.setRequestedOrientation(5);
        }
    }

    @m(threadMode = ThreadMode.MAIN)
    public final void onEnableRotationEvent(b.a.a.g.i iVar) {
        i.e(iVar, "event");
        FragmentActivity activity = getActivity();
        if (activity != null) {
            activity.setRequestedOrientation(4);
        }
    }

    @m(threadMode = ThreadMode.MAIN)
    public final void onFilterEventOld(k kVar) {
        Iterator<Container> it;
        k kVar2;
        ArrayList arrayList;
        Text text;
        String str;
        Text text2;
        String str2;
        h hVar = this;
        k kVar3 = kVar;
        i.e(kVar3, "event");
        Page page = hVar.f74h;
        if (i.a(page != null ? page.a : null, kVar3.f242b)) {
            Page page2 = hVar.f74h;
            if ((page2 != null ? page2.f : null) != null) {
                ArrayList arrayList2 = new ArrayList();
                Page page3 = hVar.f74h;
                List<Container> list = page3 != null ? page3.f : null;
                i.c(list);
                Iterator<Container> it2 = list.iterator();
                k kVar4 = kVar3;
                while (it2.hasNext()) {
                    Container next = it2.next();
                    List<Component> list2 = next.f;
                    if (list2 != null) {
                        i.c(list2);
                        Iterator<Component> it3 = list2.iterator();
                        while (true) {
                            if (it3.hasNext()) {
                                Component next2 = it3.next();
                                String str3 = next2.f7083b;
                                if (str3 != null && str3.equals("component:text") && (text2 = next2.c) != null && (str2 = text2.a) != null && e.c0.h.b(str2, kVar4.a, true)) {
                                    arrayList2.add(next);
                                    break;
                                }
                            } else {
                                break;
                            }
                        }
                    } else if (next.f7103l != null) {
                        i.e(next, "container");
                        it = it2;
                        ArrayList arrayList3 = arrayList2;
                        Container container = new Container(next.a, next.f7096b, next.c, next.d, next.f7097e, new ArrayList(), next.f7098g, next.f7099h, next.f7100i, next.f7101j, next.f7102k, new ArrayList(), next.f7104m, next.f7105n, next.f7106o);
                        for (Container next3 : next.f7103l) {
                            List<Component> list3 = next3.f;
                            if (list3 != null) {
                                i.c(list3);
                                Iterator<Component> it4 = list3.iterator();
                                while (true) {
                                    if (!it4.hasNext()) {
                                        break;
                                    }
                                    Component next4 = it4.next();
                                    String str4 = next4.f7083b;
                                    if (str4 == null || !str4.equals("component:text") || (text = next4.c) == null || (str = text.a) == null) {
                                        k kVar5 = kVar;
                                    } else if (e.c0.h.b(str, kVar.a, true)) {
                                        List<Container> list4 = container.f7103l;
                                        if (list4 != null) {
                                            list4.add(next3);
                                        }
                                    }
                                }
                            }
                            k kVar6 = kVar;
                        }
                        kVar2 = kVar;
                        List<Container> list5 = container.f7103l;
                        if (list5 == null || !(!list5.isEmpty())) {
                            arrayList = arrayList3;
                        } else {
                            arrayList = arrayList3;
                            arrayList.add(container);
                        }
                        kVar4 = kVar2;
                        arrayList2 = arrayList;
                        kVar3 = kVar2;
                        it2 = it;
                        hVar = this;
                    }
                    kVar2 = kVar3;
                    it = it2;
                    arrayList = arrayList2;
                    arrayList2 = arrayList;
                    kVar3 = kVar2;
                    it2 = it;
                    hVar = this;
                }
                h hVar2 = hVar;
                ArrayList arrayList4 = arrayList2;
                RecyclerView recyclerView = hVar2.f105k;
                if (recyclerView != null) {
                    Page page4 = hVar2.f74h;
                    e.C0(recyclerView, page4 != null ? page4.a : null, arrayList4, (com.appfoundry.previewer.model.Animation) null, page4 != null ? Boolean.valueOf(page4.x) : null, false, false, (Float) null, 116);
                    return;
                }
                i.m("recyclerView");
                throw null;
            }
        }
        h hVar3 = hVar;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: b.a.a.i.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: b.a.a.i.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: b.a.a.i.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: b.a.a.i.a} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onPause() {
        /*
            r6 = this;
            super.onPause()
            com.appfoundry.previewer.BravoApp$b r0 = com.appfoundry.previewer.BravoApp.Q
            r0.f()
            b.a.a.i.g r0 = com.appfoundry.previewer.BravoApp.G
            if (r0 == 0) goto L_0x00c3
            boolean r0 = r0.f317e
            if (r0 != 0) goto L_0x00c3
            java.util.Map<java.lang.String, java.util.List<b.a.a.i.a>> r0 = com.appfoundry.previewer.BravoApp.F
            b.a.a.i.g r1 = com.appfoundry.previewer.BravoApp.G
            r2 = 0
            if (r1 == 0) goto L_0x001a
            java.lang.String r1 = r1.a
            goto L_0x001b
        L_0x001a:
            r1 = r2
        L_0x001b:
            java.lang.Object r0 = r0.get(r1)
            java.util.List r0 = (java.util.List) r0
            r1 = 0
            if (r0 == 0) goto L_0x004c
            java.util.Iterator r0 = r0.iterator()
        L_0x0028:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x0040
            java.lang.Object r3 = r0.next()
            r4 = r3
            b.a.a.i.a r4 = (b.a.a.i.a) r4
            java.lang.String r4 = r4.c
            java.lang.String r5 = "action:play"
            boolean r4 = e.x.c.i.a(r4, r5)
            if (r4 == 0) goto L_0x0028
            goto L_0x0041
        L_0x0040:
            r3 = r2
        L_0x0041:
            b.a.a.i.a r3 = (b.a.a.i.a) r3
            if (r3 == 0) goto L_0x004c
            android.view.View r0 = r3.d
            if (r0 == 0) goto L_0x004c
            r0.setVisibility(r1)
        L_0x004c:
            java.util.Map<java.lang.String, java.util.List<b.a.a.i.a>> r0 = com.appfoundry.previewer.BravoApp.F
            b.a.a.i.g r3 = com.appfoundry.previewer.BravoApp.G
            if (r3 == 0) goto L_0x0055
            java.lang.String r3 = r3.a
            goto L_0x0056
        L_0x0055:
            r3 = r2
        L_0x0056:
            java.lang.Object r0 = r0.get(r3)
            java.util.List r0 = (java.util.List) r0
            if (r0 == 0) goto L_0x0086
            java.util.Iterator r0 = r0.iterator()
        L_0x0062:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x007a
            java.lang.Object r3 = r0.next()
            r4 = r3
            b.a.a.i.a r4 = (b.a.a.i.a) r4
            java.lang.String r4 = r4.c
            java.lang.String r5 = "action:pause"
            boolean r4 = e.x.c.i.a(r4, r5)
            if (r4 == 0) goto L_0x0062
            goto L_0x007b
        L_0x007a:
            r3 = r2
        L_0x007b:
            b.a.a.i.a r3 = (b.a.a.i.a) r3
            if (r3 == 0) goto L_0x0086
            android.view.View r0 = r3.d
            if (r0 == 0) goto L_0x0086
            r0.setVisibility(r1)
        L_0x0086:
            java.util.Map<java.lang.String, java.util.List<b.a.a.i.a>> r0 = com.appfoundry.previewer.BravoApp.F
            b.a.a.i.g r1 = com.appfoundry.previewer.BravoApp.G
            if (r1 == 0) goto L_0x008f
            java.lang.String r1 = r1.a
            goto L_0x0090
        L_0x008f:
            r1 = r2
        L_0x0090:
            java.lang.Object r0 = r0.get(r1)
            java.util.List r0 = (java.util.List) r0
            if (r0 == 0) goto L_0x00c3
            java.util.Iterator r0 = r0.iterator()
        L_0x009c:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x00b4
            java.lang.Object r1 = r0.next()
            r3 = r1
            b.a.a.i.a r3 = (b.a.a.i.a) r3
            java.lang.String r3 = r3.c
            java.lang.String r4 = "audio:currenttime"
            boolean r3 = e.x.c.i.a(r3, r4)
            if (r3 == 0) goto L_0x009c
            r2 = r1
        L_0x00b4:
            b.a.a.i.a r2 = (b.a.a.i.a) r2
            if (r2 == 0) goto L_0x00c3
            android.view.View r0 = r2.d
            if (r0 == 0) goto L_0x00c3
            android.widget.TextView r0 = (android.widget.TextView) r0
            java.lang.String r1 = "0:00"
            r0.setText(r1)
        L_0x00c3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: b.a.a.a.h.onPause():void");
    }

    public void onStart() {
        super.onStart();
        i.e(this, "$this$registerInEventBus");
        if (!p.a.a.c.b().f(this)) {
            p.a.a.c.b().k(this);
        }
    }
}
