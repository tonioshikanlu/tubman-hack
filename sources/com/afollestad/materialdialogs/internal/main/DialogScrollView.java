package com.afollestad.materialdialogs.internal.main;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ScrollView;
import androidx.annotation.RestrictTo;
import e.r;
import e.x.b.l;
import e.x.c.i;
import e.x.c.k;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u001d\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u0003\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u0003\u0010\u0004J/\u0010\n\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\f\u001a\u00020\u0002¢\u0006\u0004\b\f\u0010\u0004R$\u0010\u0014\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0018\u001a\u00020\u00158B@\u0002X\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001f"}, d2 = {"Lcom/afollestad/materialdialogs/internal/main/DialogScrollView;", "Landroid/widget/ScrollView;", "Le/r;", "onAttachedToWindow", "()V", "", "left", "top", "oldl", "oldt", "onScrollChanged", "(IIII)V", "a", "Lcom/afollestad/materialdialogs/internal/main/DialogLayout;", "h", "Lcom/afollestad/materialdialogs/internal/main/DialogLayout;", "getRootView", "()Lcom/afollestad/materialdialogs/internal/main/DialogLayout;", "setRootView", "(Lcom/afollestad/materialdialogs/internal/main/DialogLayout;)V", "rootView", "", "b", "()Z", "isScrollable", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "core"}, k = 1, mv = {1, 1, 15})
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class DialogScrollView extends ScrollView {

    /* renamed from: h  reason: collision with root package name */
    public DialogLayout f6880h;

    public static final class a extends k implements l<DialogScrollView, r> {

        /* renamed from: h  reason: collision with root package name */
        public static final a f6881h = new a();

        public a() {
            super(1);
        }

        public Object invoke(Object obj) {
            DialogScrollView dialogScrollView = (DialogScrollView) obj;
            i.f(dialogScrollView, "$receiver");
            dialogScrollView.a();
            dialogScrollView.setOverScrollMode((dialogScrollView.getChildCount() == 0 || dialogScrollView.getMeasuredHeight() == 0 || !dialogScrollView.b()) ? 2 : 1);
            return r.a;
        }
    }

    public DialogScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public final void a() {
        boolean z = false;
        if (getChildCount() == 0 || getMeasuredHeight() == 0 || !b()) {
            DialogLayout dialogLayout = this.f6880h;
            if (dialogLayout != null) {
                dialogLayout.b(false, false);
                return;
            }
            return;
        }
        View childAt = getChildAt(getChildCount() - 1);
        i.b(childAt, "view");
        int bottom = childAt.getBottom() - (getScrollY() + getMeasuredHeight());
        DialogLayout dialogLayout2 = this.f6880h;
        if (dialogLayout2 != null) {
            boolean z2 = getScrollY() > 0;
            if (bottom > 0) {
                z = true;
            }
            dialogLayout2.b(z2, z);
        }
    }

    public final boolean b() {
        View childAt = getChildAt(0);
        i.b(childAt, "getChildAt(0)");
        return childAt.getMeasuredHeight() > getHeight();
    }

    public final DialogLayout getRootView() {
        return this.f6880h;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        a aVar = a.f6881h;
        i.f(this, "$this$waitForWidth");
        i.f(aVar, "block");
        if (getMeasuredWidth() <= 0 || getMeasuredHeight() <= 0) {
            getViewTreeObserver().addOnGlobalLayoutListener(new b.b.a.f.a(this, aVar));
        } else {
            aVar.invoke(this);
        }
    }

    public void onScrollChanged(int i2, int i3, int i4, int i5) {
        super.onScrollChanged(i2, i3, i4, i5);
        a();
    }

    public final void setRootView(DialogLayout dialogLayout) {
        this.f6880h = dialogLayout;
    }
}
