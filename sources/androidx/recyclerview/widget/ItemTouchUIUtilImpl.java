package androidx.recyclerview.widget;

import android.graphics.Canvas;
import android.view.View;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.R;

public class ItemTouchUIUtilImpl implements ItemTouchUIUtil {
    public static final ItemTouchUIUtil INSTANCE = new ItemTouchUIUtilImpl();

    private static float findMaxElevation(RecyclerView recyclerView, View view) {
        int childCount = recyclerView.getChildCount();
        float f = 0.0f;
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = recyclerView.getChildAt(i2);
            if (childAt != view) {
                float elevation = ViewCompat.getElevation(childAt);
                if (elevation > f) {
                    f = elevation;
                }
            }
        }
        return f;
    }

    public void clearView(View view) {
        int i2 = R.id.item_touch_helper_previous_elevation;
        Object tag = view.getTag(i2);
        if (tag instanceof Float) {
            ViewCompat.setElevation(view, ((Float) tag).floatValue());
        }
        view.setTag(i2, (Object) null);
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
    }

    public void onDraw(Canvas canvas, RecyclerView recyclerView, View view, float f, float f2, int i2, boolean z) {
        if (z) {
            int i3 = R.id.item_touch_helper_previous_elevation;
            if (view.getTag(i3) == null) {
                Float valueOf = Float.valueOf(ViewCompat.getElevation(view));
                ViewCompat.setElevation(view, findMaxElevation(recyclerView, view) + 1.0f);
                view.setTag(i3, valueOf);
            }
        }
        view.setTranslationX(f);
        view.setTranslationY(f2);
    }

    public void onDrawOver(Canvas canvas, RecyclerView recyclerView, View view, float f, float f2, int i2, boolean z) {
    }

    public void onSelected(View view) {
    }
}
