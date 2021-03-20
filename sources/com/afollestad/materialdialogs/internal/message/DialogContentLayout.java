package com.afollestad.materialdialogs.internal.message;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.annotation.RestrictTo;
import androidx.constraintlayout.solver.widgets.analyzer.BasicMeasure;
import app.bravostudio.A01F175WZXYVE9FWM81EKWKN6FN.R;
import com.afollestad.materialdialogs.internal.list.DialogRecyclerView;
import com.afollestad.materialdialogs.internal.main.DialogLayout;
import com.afollestad.materialdialogs.internal.main.DialogScrollView;
import com.segment.analytics.integrations.BasePayload;
import e.a.l;
import e.f;
import e.o;
import e.x.c.i;
import e.x.c.k;
import e.x.c.q;
import e.x.c.v;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u00102\u001a\u000201\u0012\n\b\u0002\u00104\u001a\u0004\u0018\u000103¢\u0006\u0004\b5\u00106J\u001f\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u0006\u0010\u0007J7\u0010\u000e\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u000e\u0010\u000fR\u001d\u0010\u0014\u001a\u00020\u00028B@\u0002X\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R$\u0010\u001c\u001a\u0004\u0018\u00010\u00158\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u0018\u0010 \u001a\u0004\u0018\u00010\u001d8B@\u0002X\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR$\u0010(\u001a\u0004\u0018\u00010!8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R$\u00100\u001a\u0004\u0018\u00010)8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/¨\u00067"}, d2 = {"Lcom/afollestad/materialdialogs/internal/message/DialogContentLayout;", "Landroid/widget/FrameLayout;", "", "widthMeasureSpec", "heightMeasureSpec", "Le/r;", "onMeasure", "(II)V", "", "changed", "left", "top", "right", "bottom", "onLayout", "(ZIIII)V", "h", "Le/f;", "getFrameHorizontalMargin", "()I", "frameHorizontalMargin", "Lcom/afollestad/materialdialogs/internal/main/DialogScrollView;", "i", "Lcom/afollestad/materialdialogs/internal/main/DialogScrollView;", "getScrollView", "()Lcom/afollestad/materialdialogs/internal/main/DialogScrollView;", "setScrollView", "(Lcom/afollestad/materialdialogs/internal/main/DialogScrollView;)V", "scrollView", "Lcom/afollestad/materialdialogs/internal/main/DialogLayout;", "getRootLayout", "()Lcom/afollestad/materialdialogs/internal/main/DialogLayout;", "rootLayout", "Lcom/afollestad/materialdialogs/internal/list/DialogRecyclerView;", "j", "Lcom/afollestad/materialdialogs/internal/list/DialogRecyclerView;", "getRecyclerView", "()Lcom/afollestad/materialdialogs/internal/list/DialogRecyclerView;", "setRecyclerView", "(Lcom/afollestad/materialdialogs/internal/list/DialogRecyclerView;)V", "recyclerView", "Landroid/view/View;", "k", "Landroid/view/View;", "getCustomView", "()Landroid/view/View;", "setCustomView", "(Landroid/view/View;)V", "customView", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "core"}, k = 1, mv = {1, 1, 15})
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class DialogContentLayout extends FrameLayout {

    /* renamed from: l  reason: collision with root package name */
    public static final /* synthetic */ l[] f6889l = {v.c(new q(v.a(DialogContentLayout.class), "frameHorizontalMargin", "getFrameHorizontalMargin()I"))};

    /* renamed from: h  reason: collision with root package name */
    public final f f6890h = b.q.a.a.h2(new a(this));

    /* renamed from: i  reason: collision with root package name */
    public DialogScrollView f6891i;

    /* renamed from: j  reason: collision with root package name */
    public DialogRecyclerView f6892j;

    /* renamed from: k  reason: collision with root package name */
    public View f6893k;

    public static final class a extends k implements e.x.b.a<Integer> {

        /* renamed from: h  reason: collision with root package name */
        public final /* synthetic */ DialogContentLayout f6894h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(DialogContentLayout dialogContentLayout) {
            super(0);
            this.f6894h = dialogContentLayout;
        }

        public Object e() {
            return Integer.valueOf(this.f6894h.getResources().getDimensionPixelSize(R.dimen.md_dialog_frame_margin_horizontal));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DialogContentLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        i.f(context, BasePayload.CONTEXT_KEY);
    }

    private final int getFrameHorizontalMargin() {
        f fVar = this.f6890h;
        l lVar = f6889l[0];
        return ((Number) fVar.getValue()).intValue();
    }

    private final DialogLayout getRootLayout() {
        ViewParent parent = getParent();
        if (parent != null) {
            return (DialogLayout) parent;
        }
        throw new o("null cannot be cast to non-null type com.afollestad.materialdialogs.internal.main.DialogLayout");
    }

    public final View getCustomView() {
        return this.f6893k;
    }

    public final DialogRecyclerView getRecyclerView() {
        return this.f6892j;
    }

    public final DialogScrollView getScrollView() {
        return this.f6891i;
    }

    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        int childCount = getChildCount();
        int i6 = 0;
        int i7 = 0;
        while (i6 < childCount) {
            View childAt = getChildAt(i6);
            i.b(childAt, "currentChild");
            int measuredHeight = childAt.getMeasuredHeight() + i7;
            boolean a2 = i.a(childAt, this.f6893k);
            childAt.layout(0, i7, getMeasuredWidth(), measuredHeight);
            i6++;
            i7 = measuredHeight;
        }
    }

    public void onMeasure(int i2, int i3) {
        int size = View.MeasureSpec.getSize(i2);
        int size2 = View.MeasureSpec.getSize(i3);
        DialogScrollView dialogScrollView = this.f6891i;
        if (dialogScrollView != null) {
            dialogScrollView.measure(View.MeasureSpec.makeMeasureSpec(size, BasicMeasure.EXACTLY), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
        }
        DialogScrollView dialogScrollView2 = this.f6891i;
        int measuredHeight = dialogScrollView2 != null ? dialogScrollView2.getMeasuredHeight() : 0;
        int i4 = size2 - measuredHeight;
        int childCount = this.f6891i != null ? getChildCount() - 1 : getChildCount();
        if (childCount == 0) {
            setMeasuredDimension(size, measuredHeight);
            return;
        }
        int i5 = i4 / childCount;
        int childCount2 = getChildCount();
        for (int i6 = 0; i6 < childCount2; i6++) {
            View childAt = getChildAt(i6);
            i.b(childAt, "currentChild");
            int id = childAt.getId();
            DialogScrollView dialogScrollView3 = this.f6891i;
            if (dialogScrollView3 == null || id != dialogScrollView3.getId()) {
                boolean a2 = i.a(childAt, this.f6893k);
                childAt.measure(View.MeasureSpec.makeMeasureSpec(size, BasicMeasure.EXACTLY), View.MeasureSpec.makeMeasureSpec(i5, Integer.MIN_VALUE));
                measuredHeight = childAt.getMeasuredHeight() + measuredHeight;
            }
        }
        setMeasuredDimension(size, measuredHeight);
    }

    public final void setCustomView(View view) {
        this.f6893k = view;
    }

    public final void setRecyclerView(DialogRecyclerView dialogRecyclerView) {
        this.f6892j = dialogRecyclerView;
    }

    public final void setScrollView(DialogScrollView dialogScrollView) {
        this.f6891i = dialogScrollView;
    }
}
