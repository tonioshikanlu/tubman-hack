package b.a.a.a;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.graphics.Point;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.appcompat.app.AppCompatDialogFragment;
import app.bravostudio.A01F175WZXYVE9FWM81EKWKN6FN.R;
import b.a.a.g.r0;
import b.a.a.g.s;
import b.a.a.h.o;
import b.a.a.i.j;
import b.a.a.n.c;
import b.a.a.n.f;
import com.appfoundry.previewer.model.Page;
import com.appfoundry.previewer.model.Style;
import e.r;
import e.v.d;
import e.v.j.a.e;
import e.v.j.a.h;
import e.x.b.p;
import g.a.a.m;
import g.a.a0;
import g.a.i0;
import g.a.x;
import g.a.y0;
import g.a.z;

public final class i extends AppCompatDialogFragment {

    /* renamed from: h  reason: collision with root package name */
    public Page f111h;

    /* renamed from: i  reason: collision with root package name */
    public String f112i;

    /* renamed from: j  reason: collision with root package name */
    public View f113j;

    @e(c = "com.appfoundry.previewer.fragments.PopupFragment$getRemotePageWithCoroutines$1", f = "PopupFragment.kt", l = {138}, m = "invokeSuspend")
    public static final class a extends h implements p<z, d<? super r>, Object> {

        /* renamed from: l  reason: collision with root package name */
        public z f114l;

        /* renamed from: m  reason: collision with root package name */
        public Object f115m;

        /* renamed from: n  reason: collision with root package name */
        public int f116n;

        /* renamed from: o  reason: collision with root package name */
        public final /* synthetic */ i f117o;

        /* renamed from: p  reason: collision with root package name */
        public final /* synthetic */ RelativeLayout f118p;

        @e(c = "com.appfoundry.previewer.fragments.PopupFragment$getRemotePageWithCoroutines$1$remoteResponse$1", f = "PopupFragment.kt", l = {}, m = "invokeSuspend")
        /* renamed from: b.a.a.a.i$a$a  reason: collision with other inner class name */
        public static final class C0006a extends h implements p<z, d<? super j>, Object> {

            /* renamed from: l  reason: collision with root package name */
            public z f119l;

            /* renamed from: m  reason: collision with root package name */
            public final /* synthetic */ a f120m;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C0006a(a aVar, d dVar) {
                super(2, dVar);
                this.f120m = aVar;
            }

            public final d<r> a(Object obj, d<?> dVar) {
                e.x.c.i.e(dVar, "completion");
                C0006a aVar = new C0006a(this.f120m, dVar);
                aVar.f119l = (z) obj;
                return aVar;
            }

            public final Object d(Object obj) {
                b.q.a.a.c3(obj);
                return c.i(this.f120m.f117o.f111h, false, 2);
            }

            public final Object invoke(Object obj, Object obj2) {
                d dVar = (d) obj2;
                e.x.c.i.e(dVar, "completion");
                a aVar = this.f120m;
                dVar.getContext();
                z zVar = (z) obj;
                b.q.a.a.c3(r.a);
                return c.i(aVar.f117o.f111h, false, 2);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(i iVar, RelativeLayout relativeLayout, d dVar) {
            super(2, dVar);
            this.f117o = iVar;
            this.f118p = relativeLayout;
        }

        public final d<r> a(Object obj, d<?> dVar) {
            e.x.c.i.e(dVar, "completion");
            a aVar = new a(this.f117o, this.f118p, dVar);
            aVar.f114l = (z) obj;
            return aVar;
        }

        public final Object d(Object obj) {
            p.a.a.c cVar;
            Object obj2;
            e.v.i.a aVar = e.v.i.a.COROUTINE_SUSPENDED;
            int i2 = this.f116n;
            Float f = null;
            if (i2 == 0) {
                b.q.a.a.c3(obj);
                z zVar = this.f114l;
                x xVar = i0.f9955b;
                C0006a aVar2 = new C0006a(this, (d) null);
                this.f115m = zVar;
                this.f116n = 1;
                obj = e.a.a.a.y0.m.o1.c.u0(xVar, aVar2, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else if (i2 == 1) {
                z zVar2 = (z) this.f115m;
                b.q.a.a.c3(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j jVar = (j) obj;
            i iVar = this.f117o;
            Page page = jVar != null ? jVar.a : null;
            iVar.f111h = page;
            if (jVar != null && jVar.f320b) {
                cVar = p.a.a.c.b();
                obj2 = new r0();
            } else if (page == null) {
                cVar = p.a.a.c.b();
                obj2 = new s(false, 1);
            } else {
                RelativeLayout relativeLayout = this.f118p;
                if (relativeLayout != null) {
                    o.e(relativeLayout);
                }
                i iVar2 = this.f117o;
                View view = iVar2.f113j;
                if (view != null) {
                    Page page2 = iVar2.f111h;
                    if (page2 != null) {
                        f = b.a.a.h.e.q(page2);
                    }
                    o.j(view, page2, f);
                    return r.a;
                }
                e.x.c.i.m("pageLayout");
                throw null;
            }
            cVar.g(obj2);
            return r.a;
        }

        public final Object invoke(Object obj, Object obj2) {
            d dVar = (d) obj2;
            e.x.c.i.e(dVar, "completion");
            a aVar = new a(this.f117o, this.f118p, dVar);
            aVar.f114l = (z) obj;
            return aVar.d(r.a);
        }
    }

    public static final class b implements View.OnTouchListener {

        /* renamed from: h  reason: collision with root package name */
        public final /* synthetic */ FrameLayout f121h;

        /* renamed from: i  reason: collision with root package name */
        public final /* synthetic */ i f122i;

        public static final class a implements Runnable {

            /* renamed from: h  reason: collision with root package name */
            public final /* synthetic */ b f123h;

            public a(b bVar) {
                this.f123h = bVar;
            }

            public final void run() {
                Dialog dialog = this.f123h.f122i.getDialog();
                if (dialog != null) {
                    dialog.dismiss();
                }
            }
        }

        public b(FrameLayout frameLayout, i iVar) {
            this.f121h = frameLayout;
            this.f122i = iVar;
        }

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            ViewPropertyAnimator alpha;
            ViewPropertyAnimator duration;
            ViewPropertyAnimator animate = this.f121h.animate();
            if (!(animate == null || (alpha = animate.alpha(0.0f)) == null || (duration = alpha.setDuration(100)) == null)) {
                duration.start();
            }
            new Handler().postDelayed(new a(this), 50);
            return false;
        }
    }

    public final void c() {
        View view = this.f113j;
        if (view != null) {
            RelativeLayout relativeLayout = (RelativeLayout) view.findViewById(R.id.fragment_loading);
            Page o2 = f.o("state:loading");
            if (o2 != null) {
                View view2 = this.f113j;
                if (view2 != null) {
                    Page page = this.f111h;
                    o.j(view2, o2, page != null ? b.a.a.h.e.q(page) : null);
                } else {
                    e.x.c.i.m("pageLayout");
                    throw null;
                }
            } else if (relativeLayout != null) {
                o.l(relativeLayout);
            }
            x xVar = i0.a;
            e.a.a.a.y0.m.o1.c.S(e.a.a.a.y0.m.o1.c.b(m.f9916b.plus(e.a.a.a.y0.m.o1.c.c((y0) null, 1, (Object) null))), (e.v.f) null, (a0) null, new a(this, relativeLayout, (d) null), 3, (Object) null);
            return;
        }
        e.x.c.i.m("pageLayout");
        throw null;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        String str = this.f112i;
        if (str != null && b.a.a.h.m.i(str)) {
            setStyle(1, R.style.CustomDialogTheme);
        }
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Window window;
        e.x.c.i.e(layoutInflater, "inflater");
        super.onCreateView(layoutInflater, viewGroup, bundle);
        String str = this.f112i;
        View inflate = layoutInflater.inflate((str == null || !b.a.a.h.m.i(str)) ? R.layout.dialog_fragment_list_simplified : R.layout.dialog_fragment_list_simplified_custom_bg, viewGroup, false);
        e.x.c.i.d(inflate, "inflater.inflate(layoutRes, container, false)");
        this.f113j = inflate;
        getContext();
        Page page = this.f111h;
        c.c(page != null ? page.c : null);
        Page page2 = this.f111h;
        if (page2 == null || !b.a.a.h.e.E(page2)) {
            View view = this.f113j;
            if (view != null) {
                Page page3 = this.f111h;
                o.j(view, page3, page3 != null ? b.a.a.h.e.q(page3) : null);
            } else {
                e.x.c.i.m("pageLayout");
                throw null;
            }
        } else {
            Page page4 = this.f111h;
            if (page4 == null || !b.a.a.h.e.v(page4)) {
                Page page5 = this.f111h;
                if ((page5 != null ? page5.f : null) != null) {
                    View view2 = this.f113j;
                    if (view2 != null) {
                        o.j(view2, page5, page5 != null ? b.a.a.h.e.q(page5) : null);
                    } else {
                        e.x.c.i.m("pageLayout");
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
        String str2 = this.f112i;
        if (str2 != null && b.a.a.h.m.i(str2)) {
            View view3 = this.f113j;
            if (view3 != null) {
                FrameLayout frameLayout = (FrameLayout) view3.findViewById(R.id.popup_parent);
                if (frameLayout != null) {
                    String str3 = this.f112i;
                    e.x.c.i.c(str3);
                    frameLayout.setBackgroundColor(b.a.a.h.m.m(str3));
                    frameLayout.animate().alpha(1.0f).setDuration(300).start();
                    frameLayout.setOnTouchListener(new b(frameLayout, this));
                }
            } else {
                e.x.c.i.m("pageLayout");
                throw null;
            }
        }
        View view4 = this.f113j;
        if (view4 != null) {
            return view4;
        }
        e.x.c.i.m("pageLayout");
        throw null;
    }

    public void onDestroyView() {
        super.onDestroyView();
    }

    public void onResume() {
        Window window;
        Window window2;
        Window window3;
        WindowManager windowManager;
        Display defaultDisplay;
        super.onResume();
        Page page = this.f111h;
        Style u = f.u(page != null ? page.r : null, (Boolean) null, 2);
        if (u != null) {
            Point point = new Point();
            Dialog dialog = getDialog();
            if (!(dialog == null || (window3 = dialog.getWindow()) == null || (windowManager = window3.getWindowManager()) == null || (defaultDisplay = windowManager.getDefaultDisplay()) == null)) {
                defaultDisplay.getSize(point);
            }
            if (u.f7172i != null && u.f7173j != null) {
                int i2 = point.x;
                if (this.f112i == null) {
                    Dialog dialog2 = getDialog();
                    if (!(dialog2 == null || (window2 = dialog2.getWindow()) == null)) {
                        float f = (float) i2;
                        Float f2 = u.f7172i;
                        e.x.c.i.c(f2);
                        float f3 = (float) 100;
                        window2.setLayout((int) ((f2.floatValue() / f3) * f), (int) ((u.f7173j.floatValue() / f3) * f));
                    }
                    Dialog dialog3 = getDialog();
                    if (dialog3 != null && (window = dialog3.getWindow()) != null) {
                        window.setGravity(17);
                    }
                }
            }
        }
    }
}
