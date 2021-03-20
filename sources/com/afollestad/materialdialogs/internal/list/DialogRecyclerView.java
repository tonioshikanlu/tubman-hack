package com.afollestad.materialdialogs.internal.list;

import android.content.Context;
import android.util.AttributeSet;
import androidx.annotation.RestrictTo;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.segment.analytics.integrations.BasePayload;
import e.r;
import e.x.b.l;
import e.x.c.i;
import e.x.c.k;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0012\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\r\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u0005\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u0006\u0010\u0004J/\u0010\f\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0010R\u0016\u0010\u0015\u001a\u00020\u00128\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u001c"}, d2 = {"Lcom/afollestad/materialdialogs/internal/list/DialogRecyclerView;", "Landroidx/recyclerview/widget/RecyclerView;", "Le/r;", "a", "()V", "onAttachedToWindow", "onDetachedFromWindow", "", "left", "top", "oldl", "oldt", "onScrollChanged", "(IIII)V", "", "c", "()Z", "b", "com/afollestad/materialdialogs/internal/list/DialogRecyclerView$b", "h", "Lcom/afollestad/materialdialogs/internal/list/DialogRecyclerView$b;", "scrollListeners", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "core"}, k = 1, mv = {1, 1, 15})
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class DialogRecyclerView extends RecyclerView {

    /* renamed from: h  reason: collision with root package name */
    public final b f6868h = new b(this);

    public static final class a extends k implements l<DialogRecyclerView, r> {

        /* renamed from: h  reason: collision with root package name */
        public static final a f6869h = new a();

        public a() {
            super(1);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:10:0x0028, code lost:
            if ((r4.b() && r4.c()) != false) goto L_0x002a;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object invoke(java.lang.Object r4) {
            /*
                r3 = this;
                com.afollestad.materialdialogs.internal.list.DialogRecyclerView r4 = (com.afollestad.materialdialogs.internal.list.DialogRecyclerView) r4
                java.lang.String r0 = "$receiver"
                e.x.c.i.f(r4, r0)
                r4.a()
                int r0 = r4.getChildCount()
                r1 = 1
                r2 = 2
                if (r0 == 0) goto L_0x002a
                int r0 = r4.getMeasuredHeight()
                if (r0 != 0) goto L_0x0019
                goto L_0x002a
            L_0x0019:
                boolean r0 = r4.b()
                if (r0 == 0) goto L_0x0027
                boolean r0 = r4.c()
                if (r0 == 0) goto L_0x0027
                r0 = r1
                goto L_0x0028
            L_0x0027:
                r0 = 0
            L_0x0028:
                if (r0 == 0) goto L_0x002b
            L_0x002a:
                r1 = r2
            L_0x002b:
                r4.setOverScrollMode(r1)
                e.r r4 = e.r.a
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: com.afollestad.materialdialogs.internal.list.DialogRecyclerView.a.invoke(java.lang.Object):java.lang.Object");
        }
    }

    public static final class b extends RecyclerView.OnScrollListener {
        public final /* synthetic */ DialogRecyclerView a;

        public b(DialogRecyclerView dialogRecyclerView) {
            this.a = dialogRecyclerView;
        }

        public void onScrolled(RecyclerView recyclerView, int i2, int i3) {
            i.f(recyclerView, "recyclerView");
            super.onScrolled(recyclerView, i2, i3);
            this.a.a();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DialogRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        i.f(context, BasePayload.CONTEXT_KEY);
    }

    public final void a() {
        if (getChildCount() == 0 || getMeasuredHeight() == 0) {
        }
    }

    public final boolean b() {
        RecyclerView.Adapter adapter = getAdapter();
        if (adapter != null) {
            i.b(adapter, "adapter!!");
            int itemCount = adapter.getItemCount() - 1;
            RecyclerView.LayoutManager layoutManager = getLayoutManager();
            if (layoutManager instanceof LinearLayoutManager) {
                if (((LinearLayoutManager) layoutManager).findLastCompletelyVisibleItemPosition() == itemCount) {
                    return true;
                }
            } else if ((layoutManager instanceof GridLayoutManager) && ((GridLayoutManager) layoutManager).findLastCompletelyVisibleItemPosition() == itemCount) {
                return true;
            }
            return false;
        }
        i.l();
        throw null;
    }

    public final boolean c() {
        RecyclerView.LayoutManager layoutManager = getLayoutManager();
        if (layoutManager instanceof LinearLayoutManager) {
            if (((LinearLayoutManager) layoutManager).findFirstCompletelyVisibleItemPosition() == 0) {
                return true;
            }
        } else if ((layoutManager instanceof GridLayoutManager) && ((GridLayoutManager) layoutManager).findFirstCompletelyVisibleItemPosition() == 0) {
            return true;
        }
        return false;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        a aVar = a.f6869h;
        i.f(this, "$this$waitForWidth");
        i.f(aVar, "block");
        if (getMeasuredWidth() <= 0 || getMeasuredHeight() <= 0) {
            getViewTreeObserver().addOnGlobalLayoutListener(new b.b.a.f.a(this, aVar));
        } else {
            aVar.invoke(this);
        }
        addOnScrollListener(this.f6868h);
    }

    public void onDetachedFromWindow() {
        removeOnScrollListener(this.f6868h);
        super.onDetachedFromWindow();
    }

    public void onScrollChanged(int i2, int i3, int i4, int i5) {
        super.onScrollChanged(i2, i3, i4, i5);
        a();
    }
}
