package androidx.core.view;

import android.view.View;
import e.x.b.l;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Le/r;", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 1, 15})
public final class ViewKt$doOnPreDraw$1 implements Runnable {
    public final /* synthetic */ l $action;
    public final /* synthetic */ View $this_doOnPreDraw;

    public ViewKt$doOnPreDraw$1(View view, l lVar) {
        this.$this_doOnPreDraw = view;
        this.$action = lVar;
    }

    public final void run() {
        this.$action.invoke(this.$this_doOnPreDraw);
    }
}
