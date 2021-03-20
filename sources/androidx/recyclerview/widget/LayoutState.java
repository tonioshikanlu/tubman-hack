package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import b.e.a.a.a;

public class LayoutState {
    public static final int INVALID_LAYOUT = Integer.MIN_VALUE;
    public static final int ITEM_DIRECTION_HEAD = -1;
    public static final int ITEM_DIRECTION_TAIL = 1;
    public static final int LAYOUT_END = 1;
    public static final int LAYOUT_START = -1;
    public int mAvailable;
    public int mCurrentPosition;
    public int mEndLine = 0;
    public boolean mInfinite;
    public int mItemDirection;
    public int mLayoutDirection;
    public boolean mRecycle = true;
    public int mStartLine = 0;
    public boolean mStopInFocusable;

    public boolean hasMore(RecyclerView.State state) {
        int i2 = this.mCurrentPosition;
        return i2 >= 0 && i2 < state.getItemCount();
    }

    public View next(RecyclerView.Recycler recycler) {
        View viewForPosition = recycler.getViewForPosition(this.mCurrentPosition);
        this.mCurrentPosition += this.mItemDirection;
        return viewForPosition;
    }

    public String toString() {
        StringBuilder y = a.y("LayoutState{mAvailable=");
        y.append(this.mAvailable);
        y.append(", mCurrentPosition=");
        y.append(this.mCurrentPosition);
        y.append(", mItemDirection=");
        y.append(this.mItemDirection);
        y.append(", mLayoutDirection=");
        y.append(this.mLayoutDirection);
        y.append(", mStartLine=");
        y.append(this.mStartLine);
        y.append(", mEndLine=");
        y.append(this.mEndLine);
        y.append('}');
        return y.toString();
    }
}
