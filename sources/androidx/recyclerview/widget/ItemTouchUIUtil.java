package androidx.recyclerview.widget;

import android.graphics.Canvas;
import android.view.View;

public interface ItemTouchUIUtil {
    void clearView(View view);

    void onDraw(Canvas canvas, RecyclerView recyclerView, View view, float f, float f2, int i2, boolean z);

    void onDrawOver(Canvas canvas, RecyclerView recyclerView, View view, float f, float f2, int i2, boolean z);

    void onSelected(View view);
}
