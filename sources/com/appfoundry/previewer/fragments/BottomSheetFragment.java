package com.appfoundry.previewer.fragments;

import android.app.Dialog;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.RelativeLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import app.bravostudio.A01F175WZXYVE9FWM81EKWKN6FN.R;
import b.a.a.g.r0;
import b.a.a.g.s;
import b.a.a.h.o;
import b.a.a.i.j;
import b.a.a.n.c;
import b.d.a.f;
import com.appfoundry.previewer.model.Page;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.segment.analytics.integrations.BasePayload;
import e.r;
import e.v.d;
import e.v.j.a.e;
import e.v.j.a.h;
import e.x.b.p;
import e.x.c.i;
import g.a.a.m;
import g.a.a0;
import g.a.i0;
import g.a.x;
import g.a.y0;
import g.a.z;
import kotlin.Metadata;

public final class BottomSheetFragment extends f {
    public Page t;
    public int u;
    public boolean v = true;
    public View w;
    public String x;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0017\u0012\u0006\u0010'\u001a\u00020&\u0012\u0006\u0010)\u001a\u00020(¢\u0006\u0004\b*\u0010+J'\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\f\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\f\u0010\u000bJ?\u0010\u0013\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\u000e\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014JG\u0010\u001a\u001a\u00020\u00192\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\u000f\u001a\u00020\u00012\u0006\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ/\u0010\u001c\u001a\u00020\u00192\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\u000f\u001a\u00020\u00012\u0006\u0010\u0012\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ7\u0010!\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\u000f\u001a\u00020\u00012\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u001eH\u0016¢\u0006\u0004\b!\u0010\"R\u0016\u0010%\u001a\u00020\t8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b#\u0010$¨\u0006,"}, d2 = {"Lcom/appfoundry/previewer/fragments/BottomSheetFragment$LockedBottomSheetBehavior;", "Landroid/view/View;", "V", "Lcom/google/android/material/bottomsheet/BottomSheetBehavior;", "Landroidx/coordinatorlayout/widget/CoordinatorLayout;", "parent", "child", "Landroid/view/MotionEvent;", "event", "", "onInterceptTouchEvent", "(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/view/View;Landroid/view/MotionEvent;)Z", "onTouchEvent", "coordinatorLayout", "directTargetChild", "target", "", "axes", "type", "onStartNestedScroll", "(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/view/View;Landroid/view/View;Landroid/view/View;II)Z", "dx", "dy", "", "consumed", "Le/r;", "onNestedPreScroll", "(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/view/View;Landroid/view/View;II[II)V", "onStopNestedScroll", "(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/view/View;Landroid/view/View;I)V", "", "velocityX", "velocityY", "onNestedPreFling", "(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/view/View;Landroid/view/View;FF)Z", "a", "Z", "mLocked", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "app_release"}, k = 1, mv = {1, 1, 15})
    public static final class LockedBottomSheetBehavior<V extends View> extends BottomSheetBehavior<V> {
        public boolean a = true;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public LockedBottomSheetBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            i.e(context, BasePayload.CONTEXT_KEY);
            i.e(attributeSet, "attrs");
        }

        public boolean onInterceptTouchEvent(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
            i.e(coordinatorLayout, "parent");
            i.e(v, "child");
            i.e(motionEvent, "event");
            if (!this.a) {
                return super.onInterceptTouchEvent(coordinatorLayout, v, motionEvent);
            }
            return false;
        }

        public boolean onNestedPreFling(CoordinatorLayout coordinatorLayout, V v, View view, float f, float f2) {
            i.e(coordinatorLayout, "coordinatorLayout");
            i.e(v, "child");
            i.e(view, "target");
            if (!this.a) {
                return super.onNestedPreFling(coordinatorLayout, v, view, f, f2);
            }
            return false;
        }

        public void onNestedPreScroll(CoordinatorLayout coordinatorLayout, V v, View view, int i2, int i3, int[] iArr, int i4) {
            i.e(coordinatorLayout, "coordinatorLayout");
            i.e(v, "child");
            i.e(view, "target");
            i.e(iArr, "consumed");
            if (!this.a) {
                super.onNestedPreScroll(coordinatorLayout, v, view, i2, i3, iArr, i4);
            }
        }

        public boolean onStartNestedScroll(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i2, int i3) {
            i.e(coordinatorLayout, "coordinatorLayout");
            i.e(v, "child");
            i.e(view, "directTargetChild");
            i.e(view2, "target");
            if (!this.a) {
                return super.onStartNestedScroll(coordinatorLayout, v, view, view2, i2, i3);
            }
            return false;
        }

        public void onStopNestedScroll(CoordinatorLayout coordinatorLayout, V v, View view, int i2) {
            i.e(coordinatorLayout, "coordinatorLayout");
            i.e(v, "child");
            i.e(view, "target");
            if (!this.a) {
                super.onStopNestedScroll(coordinatorLayout, v, view, i2);
            }
        }

        public boolean onTouchEvent(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
            i.e(coordinatorLayout, "parent");
            i.e(v, "child");
            i.e(motionEvent, "event");
            if (!this.a) {
                return super.onTouchEvent(coordinatorLayout, v, motionEvent);
            }
            return false;
        }
    }

    @e(c = "com.appfoundry.previewer.fragments.BottomSheetFragment$getRemotePageWithCoroutines$2", f = "BottomSheetFragment.kt", l = {121}, m = "invokeSuspend")
    public static final class a extends h implements p<z, d<? super r>, Object> {

        /* renamed from: l  reason: collision with root package name */
        public z f7054l;

        /* renamed from: m  reason: collision with root package name */
        public Object f7055m;

        /* renamed from: n  reason: collision with root package name */
        public int f7056n;

        /* renamed from: o  reason: collision with root package name */
        public final /* synthetic */ BottomSheetFragment f7057o;

        /* renamed from: p  reason: collision with root package name */
        public final /* synthetic */ RelativeLayout f7058p;

        @e(c = "com.appfoundry.previewer.fragments.BottomSheetFragment$getRemotePageWithCoroutines$2$remoteResponse$1", f = "BottomSheetFragment.kt", l = {}, m = "invokeSuspend")
        /* renamed from: com.appfoundry.previewer.fragments.BottomSheetFragment$a$a  reason: collision with other inner class name */
        public static final class C0123a extends h implements p<z, d<? super j>, Object> {

            /* renamed from: l  reason: collision with root package name */
            public z f7059l;

            /* renamed from: m  reason: collision with root package name */
            public final /* synthetic */ a f7060m;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C0123a(a aVar, d dVar) {
                super(2, dVar);
                this.f7060m = aVar;
            }

            public final d<r> a(Object obj, d<?> dVar) {
                i.e(dVar, "completion");
                C0123a aVar = new C0123a(this.f7060m, dVar);
                aVar.f7059l = (z) obj;
                return aVar;
            }

            public final Object d(Object obj) {
                b.q.a.a.c3(obj);
                return c.i(this.f7060m.f7057o.t, false, 2);
            }

            public final Object invoke(Object obj, Object obj2) {
                d dVar = (d) obj2;
                i.e(dVar, "completion");
                a aVar = this.f7060m;
                dVar.getContext();
                z zVar = (z) obj;
                b.q.a.a.c3(r.a);
                return c.i(aVar.f7057o.t, false, 2);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(BottomSheetFragment bottomSheetFragment, RelativeLayout relativeLayout, d dVar) {
            super(2, dVar);
            this.f7057o = bottomSheetFragment;
            this.f7058p = relativeLayout;
        }

        public final d<r> a(Object obj, d<?> dVar) {
            i.e(dVar, "completion");
            a aVar = new a(this.f7057o, this.f7058p, dVar);
            aVar.f7054l = (z) obj;
            return aVar;
        }

        public final Object d(Object obj) {
            p.a.a.c cVar;
            Object obj2;
            e.v.i.a aVar = e.v.i.a.COROUTINE_SUSPENDED;
            int i2 = this.f7056n;
            if (i2 == 0) {
                b.q.a.a.c3(obj);
                z zVar = this.f7054l;
                x xVar = i0.f9955b;
                C0123a aVar2 = new C0123a(this, (d) null);
                this.f7055m = zVar;
                this.f7056n = 1;
                obj = e.a.a.a.y0.m.o1.c.u0(xVar, aVar2, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else if (i2 == 1) {
                z zVar2 = (z) this.f7055m;
                b.q.a.a.c3(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j jVar = (j) obj;
            BottomSheetFragment bottomSheetFragment = this.f7057o;
            Page page = jVar != null ? jVar.a : null;
            bottomSheetFragment.t = page;
            if (page != null) {
                page.f7132k = bottomSheetFragment.x;
            }
            if (jVar != null && jVar.f320b) {
                cVar = p.a.a.c.b();
                obj2 = new r0();
            } else if (page == null) {
                cVar = p.a.a.c.b();
                obj2 = new s(false, 1);
            } else {
                RelativeLayout relativeLayout = this.f7058p;
                if (relativeLayout != null) {
                    o.e(relativeLayout);
                }
                BottomSheetFragment bottomSheetFragment2 = this.f7057o;
                View view = bottomSheetFragment2.w;
                if (view != null) {
                    o.k(view, bottomSheetFragment2.t, (Float) null, 2);
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
            a aVar = new a(this.f7057o, this.f7058p, dVar);
            aVar.f7054l = (z) obj;
            return aVar.d(r.a);
        }
    }

    public int c() {
        int i2;
        if (this.v && (i2 = this.u) != 0) {
            return i2;
        }
        Context context = getContext();
        i.c(context);
        i.d(context, "context!!");
        int b2 = b.b.a.c.b(context, R.attr.superBottomSheet_expandedHeight);
        if (b2 != -1) {
            return getResources().getInteger(b2);
        }
        Context context2 = getContext();
        i.c(context2);
        i.d(context2, "context!!");
        return context2.getResources().getInteger(R.integer.super_bottom_expanded_behaviour);
    }

    public int d() {
        int i2 = this.u;
        if (i2 != 0) {
            return i2;
        }
        Context context = getContext();
        i.c(context);
        i.d(context, "context!!");
        int b2 = b.b.a.c.b(context, R.attr.superBottomSheet_peekHeight);
        int dimensionPixelSize = b2 != -1 ? getResources().getDimensionPixelSize(b2) : getResources().getDimensionPixelSize(R.dimen.super_bottom_sheet_peek_height);
        Resources resources = getResources();
        i.d(resources, "resources");
        int i3 = resources.getDisplayMetrics().heightPixels;
        int i4 = i3 - ((i3 * 9) / 16);
        return dimensionPixelSize < i4 ? i4 : dimensionPixelSize;
    }

    public final void g() {
        View view = this.w;
        if (view != null) {
            RelativeLayout relativeLayout = (RelativeLayout) view.findViewById(R.id.fragment_loading);
            i.d(relativeLayout, "loadingLayout");
            ViewGroup.LayoutParams layoutParams = relativeLayout.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.height = d();
                relativeLayout.setLayoutParams(layoutParams);
                Page o2 = b.a.a.n.f.o("state:loading");
                if (o2 != null) {
                    View view2 = this.w;
                    if (view2 != null) {
                        o.k(view2, o2, (Float) null, 2);
                    } else {
                        i.m("pageLayout");
                        throw null;
                    }
                } else {
                    o.l(relativeLayout);
                }
                x xVar = i0.a;
                e.a.a.a.y0.m.o1.c.S(e.a.a.a.y0.m.o1.c.b(m.f9916b.plus(e.a.a.a.y0.m.o1.c.c((y0) null, 1, (Object) null))), (e.v.f) null, (a0) null, new a(this, relativeLayout, (d) null), 3, (Object) null);
                return;
            }
            throw new e.o("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        i.m("pageLayout");
        throw null;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        float f;
        float f2;
        int i2;
        boolean z;
        boolean z2;
        boolean z3;
        String str;
        View view;
        i.e(layoutInflater, "inflater");
        i.e(layoutInflater, "inflater");
        boolean a2 = b.d.a.a.a(21);
        this.s = !b.b.a.c.e(getContext()) && a2;
        Context context = getContext();
        i.c(context);
        i.d(context, "context!!");
        int b2 = b.b.a.c.b(context, R.attr.superBottomSheet_dim);
        if (b2 != -1) {
            TypedValue typedValue = new TypedValue();
            getResources().getValue(b2, typedValue, true);
            f = typedValue.getFloat();
        } else {
            TypedValue typedValue2 = new TypedValue();
            getResources().getValue(R.dimen.super_bottom_sheet_dim, typedValue2, true);
            f = typedValue2.getFloat();
        }
        this.f388l = f;
        Context context2 = getContext();
        i.c(context2);
        i.d(context2, "context!!");
        int b3 = b.b.a.c.b(context2, R.attr.superBottomSheet_cornerRadius);
        if (b3 != -1) {
            f2 = getResources().getDimension(b3);
        } else {
            Context context3 = getContext();
            i.c(context3);
            i.d(context3, "context!!");
            f2 = context3.getResources().getDimension(R.dimen.super_bottom_sheet_radius);
        }
        this.f389m = f2;
        Context context4 = getContext();
        i.c(context4);
        i.d(context4, "context!!");
        int b4 = b.b.a.c.b(context4, R.attr.superBottomSheet_statusBarColor);
        if (b4 != -1) {
            Context context5 = getContext();
            i.c(context5);
            i2 = ContextCompat.getColor(context5, b4);
        } else {
            Context context6 = getContext();
            i.c(context6);
            Context context7 = getContext();
            i.c(context7);
            i.d(context7, "context!!");
            i2 = ContextCompat.getColor(context6, b.b.a.c.b(context7, R.attr.colorPrimaryDark));
        }
        this.f390n = i2;
        this.f391o = this.u == 0;
        Context context8 = getContext();
        i.c(context8);
        i.d(context8, "context!!");
        int b5 = b.b.a.c.b(context8, R.attr.superBottomSheet_cancelable);
        if (b5 != -1) {
            z = getResources().getBoolean(b5);
        } else {
            Context context9 = getContext();
            i.c(context9);
            i.d(context9, "context!!");
            z = context9.getResources().getBoolean(R.bool.super_bottom_sheet_cancelable);
        }
        this.f393q = z;
        Context context10 = getContext();
        i.c(context10);
        i.d(context10, "context!!");
        int b6 = b.b.a.c.b(context10, R.attr.superBottomSheet_cancelableOnTouchOutside);
        if (b6 != -1) {
            z2 = getResources().getBoolean(b6);
        } else {
            Context context11 = getContext();
            i.c(context11);
            i.d(context11, "context!!");
            z2 = context11.getResources().getBoolean(R.bool.super_bottom_sheet_cancelableOnTouchOutside);
        }
        this.f392p = z2;
        Context context12 = getContext();
        i.c(context12);
        i.d(context12, "context!!");
        int b7 = b.b.a.c.b(context12, R.attr.superBottomSheet_animateCornerRadius);
        if (b7 != -1) {
            z3 = getResources().getBoolean(b7);
        } else {
            Context context13 = getContext();
            i.c(context13);
            i.d(context13, "context!!");
            z3 = context13.getResources().getBoolean(R.bool.super_bottom_sheet_animate_corner_radius);
        }
        this.r = z3;
        Dialog dialog = getDialog();
        if (dialog != null) {
            dialog.setCancelable(this.f393q);
            dialog.setCanceledOnTouchOutside(this.f393q && this.f392p);
            Window window = dialog.getWindow();
            if (window != null) {
                window.setBackgroundDrawable(new ColorDrawable(0));
                window.setDimAmount(this.f388l);
                if (a2) {
                    window.addFlags(67108864);
                    window.addFlags(Integer.MIN_VALUE);
                    f(1.0f);
                }
                if (b.b.a.c.e(window.getContext()) && !b.b.a.c.c(window.getContext())) {
                    window.setGravity(1);
                    window.setLayout(getResources().getDimensionPixelSize(R.dimen.super_bottom_sheet_width), -2);
                }
            }
        }
        Page page = this.t;
        if (i.a(page != null ? page.c : null, "menu:modal")) {
            view = layoutInflater.inflate(R.layout.bottomsheet_fragment_list_original, viewGroup, false);
            str = "inflater.inflate(R.layou…iginal, container, false)";
        } else {
            view = layoutInflater.inflate(R.layout.dialog_fragment_list_simplified, viewGroup, false);
            str = "inflater.inflate(R.layou…lified, container, false)";
        }
        i.d(view, str);
        this.w = view;
        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) view.findViewById(R.id.swipeRefreshLayout);
        if (swipeRefreshLayout != null) {
            swipeRefreshLayout.setEnabled(false);
        }
        getContext();
        Page page2 = this.t;
        c.c(page2 != null ? page2.c : null);
        Page page3 = this.t;
        if (page3 == null || !b.a.a.h.e.E(page3)) {
            View view2 = this.w;
            if (view2 != null) {
                o.k(view2, this.t, (Float) null, 2);
            } else {
                i.m("pageLayout");
                throw null;
            }
        } else {
            Page page4 = this.t;
            this.x = page4 != null ? page4.f7132k : null;
            if (page4 == null || !b.a.a.h.e.v(page4)) {
                Page page5 = this.t;
                if ((page5 != null ? page5.f : null) != null) {
                    View view3 = this.w;
                    if (view3 != null) {
                        o.k(view3, page5, (Float) null, 2);
                    } else {
                        i.m("pageLayout");
                        throw null;
                    }
                }
            }
            g();
        }
        View view4 = this.w;
        if (view4 != null) {
            return view4;
        }
        i.m("pageLayout");
        throw null;
    }

    public void onDestroyView() {
        super.onDestroyView();
    }

    public void show(FragmentManager fragmentManager, String str) {
        i.e(fragmentManager, "manager");
        try {
            FragmentTransaction beginTransaction = fragmentManager.beginTransaction();
            i.d(beginTransaction, "manager.beginTransaction()");
            beginTransaction.add((Fragment) this, str);
            beginTransaction.commitAllowingStateLoss();
        } catch (IllegalStateException e2) {
            Object[] objArr = new Object[2];
            Page page = this.t;
            objArr[0] = page != null ? page.a : null;
            objArr[1] = e2.getLocalizedMessage();
            q.a.a.d.b("Error showing BottomSheetFragment with pageID: %s. Exception: %s", objArr);
        }
    }
}
