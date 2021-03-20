package b.b.a.f;

import android.view.View;
import android.view.ViewTreeObserver;
import e.x.b.l;

public final class a implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: h  reason: collision with root package name */
    public Integer f365h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ View f366i;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ l f367j;

    public a(View view, TLe/x/b/l tle_x_b_l) {
        this.f366i = view;
        this.f367j = tle_x_b_l;
    }

    public void onGlobalLayout() {
        Integer num = this.f365h;
        if (num != null) {
            int measuredWidth = this.f366i.getMeasuredWidth();
            if (num != null && num.intValue() == measuredWidth) {
                this.f366i.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                return;
            }
        }
        if (this.f366i.getMeasuredWidth() > 0 && this.f366i.getMeasuredHeight() > 0) {
            Integer num2 = this.f365h;
            int measuredWidth2 = this.f366i.getMeasuredWidth();
            if (num2 == null || num2.intValue() != measuredWidth2) {
                this.f365h = Integer.valueOf(this.f366i.getMeasuredWidth());
                this.f367j.invoke(this.f366i);
            }
        }
    }
}
