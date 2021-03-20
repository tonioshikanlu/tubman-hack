package b.d.a;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.annotation.LayoutRes;
import androidx.appcompat.app.AppCompatDialog;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import app.bravostudio.A01F175WZXYVE9FWM81EKWKN6FN.R;
import com.andrefrsousa.superbottomsheet.CornerRadiusFrameLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import e.x.c.i;

public final class c extends AppCompatDialog {

    /* renamed from: h  reason: collision with root package name */
    public b.d.a.g.a f375h;

    /* renamed from: i  reason: collision with root package name */
    public BottomSheetBehavior<FrameLayout> f376i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f377j = true;

    /* renamed from: k  reason: collision with root package name */
    public boolean f378k = true;

    /* renamed from: l  reason: collision with root package name */
    public boolean f379l;

    /* renamed from: m  reason: collision with root package name */
    public final b f380m = new b(this);

    public static final class a implements View.OnClickListener {

        /* renamed from: h  reason: collision with root package name */
        public final /* synthetic */ c f381h;

        public a(c cVar) {
            this.f381h = cVar;
        }

        public final void onClick(View view) {
            c cVar = this.f381h;
            if (cVar.f377j && cVar.isShowing()) {
                c cVar2 = this.f381h;
                if (!cVar2.f379l) {
                    if (a.a(11)) {
                        cVar2.f378k = true;
                    } else {
                        TypedArray obtainStyledAttributes = cVar2.getContext().obtainStyledAttributes(new int[]{16843611});
                        i.d(obtainStyledAttributes, "context.obtainStyledAttr…ndowCloseOnTouchOutside))");
                        cVar2.f378k = obtainStyledAttributes.getBoolean(0, true);
                        obtainStyledAttributes.recycle();
                    }
                    cVar2.f379l = true;
                }
                if (cVar2.f378k) {
                    this.f381h.cancel();
                }
            }
        }
    }

    public static final class b extends AccessibilityDelegateCompat {
        public final /* synthetic */ c a;

        public b(c cVar) {
            this.a = cVar;
        }

        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            boolean z;
            i.e(view, "host");
            i.e(accessibilityNodeInfoCompat, "info");
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
            if (this.a.f377j) {
                accessibilityNodeInfoCompat.addAction(1048576);
                z = true;
            } else {
                z = false;
            }
            accessibilityNodeInfoCompat.setDismissable(z);
        }

        public boolean performAccessibilityAction(View view, int i2, Bundle bundle) {
            i.e(view, "host");
            i.e(bundle, "args");
            if (i2 == 1048576) {
                c cVar = this.a;
                if (cVar.f377j) {
                    cVar.cancel();
                    return true;
                }
            }
            return super.performAccessibilityAction(view, i2, bundle);
        }
    }

    /* renamed from: b.d.a.c$c  reason: collision with other inner class name */
    public static final class C0016c implements View.OnTouchListener {

        /* renamed from: h  reason: collision with root package name */
        public static final C0016c f382h = new C0016c();

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            return true;
        }
    }

    public c(Context context) {
        super(context, 0);
        supportRequestWindowFeature(1);
    }

    public c(Context context, int i2) {
        super(context, i2);
        supportRequestWindowFeature(1);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        if (window != null) {
            if (a.a(21)) {
                window.addFlags(67108864);
                window.addFlags(Integer.MIN_VALUE);
            }
            window.setLayout(-1, -1);
        }
    }

    public void onStart() {
        super.onStart();
        BottomSheetBehavior<FrameLayout> bottomSheetBehavior = this.f376i;
        if (bottomSheetBehavior == null) {
            return;
        }
        if (bottomSheetBehavior != null) {
            bottomSheetBehavior.setState(4);
            BottomSheetBehavior<FrameLayout> bottomSheetBehavior2 = this.f376i;
            if (bottomSheetBehavior2 != null) {
                bottomSheetBehavior2.addBottomSheetCallback(this.f380m);
            } else {
                i.m("behavior");
                throw null;
            }
        } else {
            i.m("behavior");
            throw null;
        }
    }

    public void onStop() {
        BottomSheetBehavior<FrameLayout> bottomSheetBehavior = this.f376i;
        if (bottomSheetBehavior != null) {
            bottomSheetBehavior.removeBottomSheetCallback(this.f380m);
            super.onStop();
            return;
        }
        i.m("behavior");
        throw null;
    }

    public void setCancelable(boolean z) {
        super.setCancelable(z);
        if (this.f377j != z) {
            this.f377j = z;
            BottomSheetBehavior<FrameLayout> bottomSheetBehavior = this.f376i;
            if (bottomSheetBehavior == null) {
                return;
            }
            if (bottomSheetBehavior != null) {
                bottomSheetBehavior.setHideable(z);
            } else {
                i.m("behavior");
                throw null;
            }
        }
    }

    public void setCanceledOnTouchOutside(boolean z) {
        super.setCanceledOnTouchOutside(z);
        if (z && !this.f377j) {
            this.f377j = true;
        }
        this.f378k = z;
        this.f379l = true;
    }

    public void setContentView(@LayoutRes int i2) {
        super.setContentView(wrapInBottomSheet(i2, (View) null, (ViewGroup.LayoutParams) null));
    }

    public void setContentView(View view) {
        i.e(view, "view");
        super.setContentView(wrapInBottomSheet(0, view, (ViewGroup.LayoutParams) null));
    }

    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        i.e(view, "view");
        super.setContentView(wrapInBottomSheet(0, view, layoutParams));
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public final View wrapInBottomSheet(int i2, View view, ViewGroup.LayoutParams layoutParams) {
        View inflate = getLayoutInflater().inflate(R.layout.super_bottom_sheet_dialog, (ViewGroup) null, false);
        FrameLayout frameLayout = (FrameLayout) inflate;
        int i3 = R.id.coordinator;
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) inflate.findViewById(R.id.coordinator);
        if (coordinatorLayout != null) {
            i3 = R.id.super_bottom_sheet;
            CornerRadiusFrameLayout cornerRadiusFrameLayout = (CornerRadiusFrameLayout) inflate.findViewById(R.id.super_bottom_sheet);
            if (cornerRadiusFrameLayout != null) {
                i3 = R.id.touch_outside;
                View findViewById = inflate.findViewById(R.id.touch_outside);
                if (findViewById != null) {
                    b.d.a.g.a aVar = new b.d.a.g.a((FrameLayout) inflate, frameLayout, coordinatorLayout, cornerRadiusFrameLayout, findViewById);
                    i.d(aVar, "SuperBottomSheetDialogBi…g.inflate(layoutInflater)");
                    this.f375h = aVar;
                    if (i2 != 0 && view == null) {
                        LayoutInflater layoutInflater = getLayoutInflater();
                        b.d.a.g.a aVar2 = this.f375h;
                        if (aVar2 != null) {
                            view = layoutInflater.inflate(i2, aVar2.c, false);
                        } else {
                            i.m("binding");
                            throw null;
                        }
                    }
                    b.d.a.g.a aVar3 = this.f375h;
                    if (aVar3 != null) {
                        BottomSheetBehavior<FrameLayout> from = BottomSheetBehavior.from(aVar3.d);
                        i.d(from, "BottomSheetBehavior.from(binding.superBottomSheet)");
                        this.f376i = from;
                        if (from != null) {
                            from.setHideable(this.f377j);
                            b.d.a.g.a aVar4 = this.f375h;
                            if (layoutParams == null) {
                                if (aVar4 != null) {
                                    aVar4.d.addView(view);
                                } else {
                                    i.m("binding");
                                    throw null;
                                }
                            } else if (aVar4 != null) {
                                aVar4.d.addView(view, layoutParams);
                            } else {
                                i.m("binding");
                                throw null;
                            }
                            b.d.a.g.a aVar5 = this.f375h;
                            if (aVar5 != null) {
                                aVar5.f395e.setOnClickListener(new a(this));
                                b.d.a.g.a aVar6 = this.f375h;
                                if (aVar6 != null) {
                                    ViewCompat.setAccessibilityDelegate(aVar6.d, new b(this));
                                    b.d.a.g.a aVar7 = this.f375h;
                                    if (aVar7 != null) {
                                        aVar7.d.setOnTouchListener(C0016c.f382h);
                                        b.d.a.g.a aVar8 = this.f375h;
                                        if (aVar8 != null) {
                                            FrameLayout frameLayout2 = aVar8.f394b;
                                            i.d(frameLayout2, "binding.container");
                                            return frameLayout2;
                                        }
                                        i.m("binding");
                                        throw null;
                                    }
                                    i.m("binding");
                                    throw null;
                                }
                                i.m("binding");
                                throw null;
                            }
                            i.m("binding");
                            throw null;
                        }
                        i.m("behavior");
                        throw null;
                    }
                    i.m("binding");
                    throw null;
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i3)));
    }
}
