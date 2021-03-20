package b.a.a.h;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import e.x.c.i;

public final class n extends RecyclerView.ItemDecoration {
    public final int a;

    public n(int i2) {
        this.a = i2;
    }

    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
        i.e(rect, "outRect");
        i.e(view, "view");
        i.e(recyclerView, "parent");
        i.e(state, "state");
        if (recyclerView.getChildAdapterPosition(view) != -1 && recyclerView.getAdapter() != null) {
            int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
            RecyclerView.Adapter adapter = recyclerView.getAdapter();
            Integer valueOf = adapter != null ? Integer.valueOf(adapter.getItemCount()) : null;
            i.c(valueOf);
            if (childAdapterPosition == valueOf.intValue() - 1) {
                rect.bottom = this.a;
            }
        }
    }
}
