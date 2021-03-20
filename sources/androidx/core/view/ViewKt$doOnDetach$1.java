package androidx.core.view;

import android.view.View;
import e.x.b.l;
import e.x.c.i;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"androidx/core/view/ViewKt$doOnDetach$1", "Landroid/view/View$OnAttachStateChangeListener;", "Landroid/view/View;", "view", "Le/r;", "onViewAttachedToWindow", "(Landroid/view/View;)V", "onViewDetachedFromWindow", "core-ktx_release"}, k = 1, mv = {1, 1, 15})
public final class ViewKt$doOnDetach$1 implements View.OnAttachStateChangeListener {
    public final /* synthetic */ l $action;
    public final /* synthetic */ View $this_doOnDetach;

    public ViewKt$doOnDetach$1(View view, l lVar) {
        this.$this_doOnDetach = view;
        this.$action = lVar;
    }

    public void onViewAttachedToWindow(View view) {
        i.f(view, "view");
    }

    public void onViewDetachedFromWindow(View view) {
        i.f(view, "view");
        this.$this_doOnDetach.removeOnAttachStateChangeListener(this);
        this.$action.invoke(view);
    }
}
