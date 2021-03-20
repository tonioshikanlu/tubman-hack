package b.a.a.l;

import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import app.bravostudio.A01F175WZXYVE9FWM81EKWKN6FN.R;
import e.x.c.i;

public final class b extends RecyclerView.ViewHolder {
    public final FrameLayout a;

    /* renamed from: b  reason: collision with root package name */
    public final Boolean f336b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b(View view, Boolean bool) {
        super(view);
        i.e(view, "itemView");
        View findViewById = view.findViewById(R.id.container_parent);
        i.d(findViewById, "itemView.findViewById(R.id.container_parent)");
        this.a = (FrameLayout) findViewById;
        this.f336b = bool;
    }
}
