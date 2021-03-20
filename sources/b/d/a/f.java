package b.d.a;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.annotation.CallSuper;
import androidx.annotation.IntRange;
import androidx.annotation.UiThread;
import androidx.core.content.ContextCompat;
import app.bravostudio.A01F175WZXYVE9FWM81EKWKN6FN.R;
import b.b.a.c;
import com.andrefrsousa.superbottomsheet.CornerRadiusFrameLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import e.x.c.i;

public abstract class f extends BottomSheetDialogFragment {

    /* renamed from: h  reason: collision with root package name */
    public View f384h;

    /* renamed from: i  reason: collision with root package name */
    public CornerRadiusFrameLayout f385i;

    /* renamed from: j  reason: collision with root package name */
    public BottomSheetBehavior<?> f386j;

    /* renamed from: k  reason: collision with root package name */
    public BottomSheetBehavior.BottomSheetCallback f387k;

    /* renamed from: l  reason: collision with root package name */
    public float f388l;

    /* renamed from: m  reason: collision with root package name */
    public float f389m;

    /* renamed from: n  reason: collision with root package name */
    public int f390n;

    /* renamed from: o  reason: collision with root package name */
    public boolean f391o;

    /* renamed from: p  reason: collision with root package name */
    public boolean f392p = true;

    /* renamed from: q  reason: collision with root package name */
    public boolean f393q = true;
    public boolean r = true;
    public boolean s;

    @IntRange(from = -2, to = -1)
    public abstract int c();

    public abstract int d();

    public final CornerRadiusFrameLayout e() {
        CornerRadiusFrameLayout cornerRadiusFrameLayout = this.f385i;
        if (cornerRadiusFrameLayout != null) {
            return cornerRadiusFrameLayout;
        }
        i.m("sheetContainer");
        throw null;
    }

    @UiThread
    @SuppressLint({"NewApi"})
    public final void f(float f) {
        Window window;
        if (this.s) {
            int i2 = this.f390n;
            float f2 = (float) 255;
            int argb = Color.argb((int) (f2 - (f * f2)), Color.red(i2), Color.green(i2), Color.blue(i2));
            Dialog dialog = getDialog();
            if (dialog != null && (window = dialog.getWindow()) != null) {
                window.setStatusBarColor(argb);
            }
        }
    }

    public final Dialog onCreateDialog(Bundle bundle) {
        boolean z;
        Context context = getContext();
        i.c(context);
        i.d(context, "context!!");
        int b2 = c.b(context, R.attr.superBottomSheet_animateStatusBar);
        if (b2 != -1) {
            z = getResources().getBoolean(b2);
        } else {
            Context context2 = getContext();
            i.c(context2);
            i.d(context2, "context!!");
            z = context2.getResources().getBoolean(R.bool.super_bottom_sheet_animate_status_bar);
        }
        return z ? new c(getContext(), R.style.superBottomSheetDialog) : new c(getContext());
    }

    public void onDestroyView() {
        super.onDestroyView();
    }

    public void onPause() {
        BottomSheetBehavior<?> bottomSheetBehavior = this.f386j;
        if (bottomSheetBehavior != null) {
            BottomSheetBehavior.BottomSheetCallback bottomSheetCallback = this.f387k;
            if (bottomSheetCallback != null) {
                bottomSheetBehavior.removeBottomSheetCallback(bottomSheetCallback);
                super.onPause();
                return;
            }
            i.m("callback");
            throw null;
        }
        i.m("behavior");
        throw null;
    }

    public void onResume() {
        super.onResume();
        BottomSheetBehavior<?> bottomSheetBehavior = this.f386j;
        if (bottomSheetBehavior != null) {
            BottomSheetBehavior.BottomSheetCallback bottomSheetCallback = this.f387k;
            if (bottomSheetCallback != null) {
                bottomSheetBehavior.addBottomSheetCallback(bottomSheetCallback);
            } else {
                i.m("callback");
                throw null;
            }
        } else {
            i.m("behavior");
            throw null;
        }
    }

    @CallSuper
    public void onStart() {
        super.onStart();
        Dialog dialog = getDialog();
        CornerRadiusFrameLayout cornerRadiusFrameLayout = dialog != null ? (CornerRadiusFrameLayout) dialog.findViewById(R.id.super_bottom_sheet) : null;
        i.c(cornerRadiusFrameLayout);
        this.f385i = cornerRadiusFrameLayout;
        Dialog dialog2 = getDialog();
        View findViewById = dialog2 != null ? dialog2.findViewById(R.id.touch_outside) : null;
        i.c(findViewById);
        this.f384h = findViewById;
        CornerRadiusFrameLayout cornerRadiusFrameLayout2 = this.f385i;
        if (cornerRadiusFrameLayout2 != null) {
            Context context = getContext();
            i.c(context);
            i.d(context, "context!!");
            int b2 = c.b(context, R.attr.superBottomSheet_backgroundColor);
            int i2 = -1;
            if (b2 != -1) {
                Context context2 = getContext();
                i.c(context2);
                i2 = ContextCompat.getColor(context2, b2);
            }
            cornerRadiusFrameLayout2.setBackgroundColor(i2);
            CornerRadiusFrameLayout cornerRadiusFrameLayout3 = this.f385i;
            if (cornerRadiusFrameLayout3 != null) {
                cornerRadiusFrameLayout3.setCornerRadius$lib_release(this.f389m);
                CornerRadiusFrameLayout cornerRadiusFrameLayout4 = this.f385i;
                if (cornerRadiusFrameLayout4 != null) {
                    BottomSheetBehavior<?> from = BottomSheetBehavior.from(cornerRadiusFrameLayout4);
                    i.d(from, "BottomSheetBehavior.from(sheetContainer)");
                    this.f386j = from;
                    if (c.e(getContext()) && !c.c(getContext())) {
                        CornerRadiusFrameLayout cornerRadiusFrameLayout5 = this.f385i;
                        if (cornerRadiusFrameLayout5 != null) {
                            ViewGroup.LayoutParams layoutParams = cornerRadiusFrameLayout5.getLayoutParams();
                            layoutParams.width = getResources().getDimensionPixelSize(R.dimen.super_bottom_sheet_width);
                            layoutParams.height = c();
                            cornerRadiusFrameLayout5.setLayoutParams(layoutParams);
                        } else {
                            i.m("sheetContainer");
                            throw null;
                        }
                    }
                    if (this.f391o) {
                        CornerRadiusFrameLayout cornerRadiusFrameLayout6 = this.f385i;
                        if (cornerRadiusFrameLayout6 != null) {
                            ViewGroup.LayoutParams layoutParams2 = cornerRadiusFrameLayout6.getLayoutParams();
                            layoutParams2.height = c();
                            cornerRadiusFrameLayout6.setLayoutParams(layoutParams2);
                        } else {
                            i.m("sheetContainer");
                            throw null;
                        }
                    } else {
                        BottomSheetBehavior<?> bottomSheetBehavior = this.f386j;
                        if (bottomSheetBehavior != null) {
                            bottomSheetBehavior.setPeekHeight(d());
                            CornerRadiusFrameLayout cornerRadiusFrameLayout7 = this.f385i;
                            if (cornerRadiusFrameLayout7 != null) {
                                BottomSheetBehavior<?> bottomSheetBehavior2 = this.f386j;
                                if (bottomSheetBehavior2 != null) {
                                    cornerRadiusFrameLayout7.setMinimumHeight(bottomSheetBehavior2.getPeekHeight());
                                } else {
                                    i.m("behavior");
                                    throw null;
                                }
                            } else {
                                i.m("sheetContainer");
                                throw null;
                            }
                        } else {
                            i.m("behavior");
                            throw null;
                        }
                    }
                    boolean z = (!c.e(getContext()) && !c.c(getContext())) || this.f391o;
                    BottomSheetBehavior<?> bottomSheetBehavior3 = this.f386j;
                    if (bottomSheetBehavior3 != null) {
                        bottomSheetBehavior3.setSkipCollapsed(z);
                        if (z) {
                            BottomSheetBehavior<?> bottomSheetBehavior4 = this.f386j;
                            if (bottomSheetBehavior4 != null) {
                                bottomSheetBehavior4.setState(3);
                                f(1.0f);
                                CornerRadiusFrameLayout cornerRadiusFrameLayout8 = this.f385i;
                                if (cornerRadiusFrameLayout8 != null) {
                                    cornerRadiusFrameLayout8.getViewTreeObserver().addOnPreDrawListener(new d(this));
                                } else {
                                    i.m("sheetContainer");
                                    throw null;
                                }
                            } else {
                                i.m("behavior");
                                throw null;
                            }
                        }
                        this.f387k = new e(this);
                        return;
                    }
                    i.m("behavior");
                    throw null;
                }
                i.m("sheetContainer");
                throw null;
            }
            i.m("sheetContainer");
            throw null;
        }
        i.m("sheetContainer");
        throw null;
    }
}
