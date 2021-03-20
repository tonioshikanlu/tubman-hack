package androidx.viewpager2.widget;

import android.animation.LayoutTransition;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

public final class AnimateLayoutChangeDetector {
    private static final ViewGroup.MarginLayoutParams ZERO_MARGIN_LAYOUT_PARAMS;
    private LinearLayoutManager mLayoutManager;

    static {
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -1);
        ZERO_MARGIN_LAYOUT_PARAMS = marginLayoutParams;
        marginLayoutParams.setMargins(0, 0, 0, 0);
    }

    public AnimateLayoutChangeDetector(@NonNull LinearLayoutManager linearLayoutManager) {
        this.mLayoutManager = linearLayoutManager;
    }

    private boolean arePagesLaidOutContiguously() {
        int i2;
        int i3;
        int i4;
        int i5;
        int childCount = this.mLayoutManager.getChildCount();
        if (childCount == 0) {
            return true;
        }
        boolean z = this.mLayoutManager.getOrientation() == 0;
        int[] iArr = new int[2];
        iArr[1] = 2;
        iArr[0] = childCount;
        int[][] iArr2 = (int[][]) Array.newInstance(int.class, iArr);
        int i6 = 0;
        while (i6 < childCount) {
            View childAt = this.mLayoutManager.getChildAt(i6);
            if (childAt != null) {
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : ZERO_MARGIN_LAYOUT_PARAMS;
                int[] iArr3 = iArr2[i6];
                if (z) {
                    i3 = childAt.getLeft();
                    i2 = marginLayoutParams.leftMargin;
                } else {
                    i3 = childAt.getTop();
                    i2 = marginLayoutParams.topMargin;
                }
                iArr3[0] = i3 - i2;
                int[] iArr4 = iArr2[i6];
                if (z) {
                    i5 = childAt.getRight();
                    i4 = marginLayoutParams.rightMargin;
                } else {
                    i5 = childAt.getBottom();
                    i4 = marginLayoutParams.bottomMargin;
                }
                iArr4[1] = i5 + i4;
                i6++;
            } else {
                throw new IllegalStateException("null view contained in the view hierarchy");
            }
        }
        Arrays.sort(iArr2, new Comparator<int[]>() {
            public int compare(int[] iArr, int[] iArr2) {
                return iArr[0] - iArr2[0];
            }
        });
        for (int i7 = 1; i7 < childCount; i7++) {
            if (iArr2[i7 - 1][1] != iArr2[i7][0]) {
                return false;
            }
        }
        return iArr2[0][0] <= 0 && iArr2[childCount - 1][1] >= iArr2[0][1] - iArr2[0][0];
    }

    private boolean hasRunningChangingLayoutTransition() {
        int childCount = this.mLayoutManager.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            if (hasRunningChangingLayoutTransition(this.mLayoutManager.getChildAt(i2))) {
                return true;
            }
        }
        return false;
    }

    private static boolean hasRunningChangingLayoutTransition(View view) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            LayoutTransition layoutTransition = viewGroup.getLayoutTransition();
            if (layoutTransition != null && layoutTransition.isChangingLayout()) {
                return true;
            }
            int childCount = viewGroup.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                if (hasRunningChangingLayoutTransition(viewGroup.getChildAt(i2))) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean mayHaveInterferingAnimations() {
        return (!arePagesLaidOutContiguously() || this.mLayoutManager.getChildCount() <= 1) && hasRunningChangingLayoutTransition();
    }
}
