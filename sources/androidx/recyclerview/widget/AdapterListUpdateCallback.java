package androidx.recyclerview.widget;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public final class AdapterListUpdateCallback implements ListUpdateCallback {
    @NonNull
    private final RecyclerView.Adapter mAdapter;

    public AdapterListUpdateCallback(@NonNull RecyclerView.Adapter adapter) {
        this.mAdapter = adapter;
    }

    public void onChanged(int i2, int i3, Object obj) {
        this.mAdapter.notifyItemRangeChanged(i2, i3, obj);
    }

    public void onInserted(int i2, int i3) {
        this.mAdapter.notifyItemRangeInserted(i2, i3);
    }

    public void onMoved(int i2, int i3) {
        this.mAdapter.notifyItemMoved(i2, i3);
    }

    public void onRemoved(int i2, int i3) {
        this.mAdapter.notifyItemRangeRemoved(i2, i3);
    }
}
