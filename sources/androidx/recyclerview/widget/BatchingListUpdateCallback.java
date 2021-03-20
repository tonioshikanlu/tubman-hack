package androidx.recyclerview.widget;

import androidx.annotation.NonNull;

public class BatchingListUpdateCallback implements ListUpdateCallback {
    private static final int TYPE_ADD = 1;
    private static final int TYPE_CHANGE = 3;
    private static final int TYPE_NONE = 0;
    private static final int TYPE_REMOVE = 2;
    public int mLastEventCount = -1;
    public Object mLastEventPayload = null;
    public int mLastEventPosition = -1;
    public int mLastEventType = 0;
    public final ListUpdateCallback mWrapped;

    public BatchingListUpdateCallback(@NonNull ListUpdateCallback listUpdateCallback) {
        this.mWrapped = listUpdateCallback;
    }

    public void dispatchLastEvent() {
        int i2 = this.mLastEventType;
        if (i2 != 0) {
            if (i2 == 1) {
                this.mWrapped.onInserted(this.mLastEventPosition, this.mLastEventCount);
            } else if (i2 == 2) {
                this.mWrapped.onRemoved(this.mLastEventPosition, this.mLastEventCount);
            } else if (i2 == 3) {
                this.mWrapped.onChanged(this.mLastEventPosition, this.mLastEventCount, this.mLastEventPayload);
            }
            this.mLastEventPayload = null;
            this.mLastEventType = 0;
        }
    }

    public void onChanged(int i2, int i3, Object obj) {
        int i4;
        if (this.mLastEventType == 3) {
            int i5 = this.mLastEventPosition;
            int i6 = this.mLastEventCount;
            if (i2 <= i5 + i6 && (i4 = i2 + i3) >= i5 && this.mLastEventPayload == obj) {
                this.mLastEventPosition = Math.min(i2, i5);
                this.mLastEventCount = Math.max(i6 + i5, i4) - this.mLastEventPosition;
                return;
            }
        }
        dispatchLastEvent();
        this.mLastEventPosition = i2;
        this.mLastEventCount = i3;
        this.mLastEventPayload = obj;
        this.mLastEventType = 3;
    }

    public void onInserted(int i2, int i3) {
        int i4;
        if (this.mLastEventType == 1 && i2 >= (i4 = this.mLastEventPosition)) {
            int i5 = this.mLastEventCount;
            if (i2 <= i4 + i5) {
                this.mLastEventCount = i5 + i3;
                this.mLastEventPosition = Math.min(i2, i4);
                return;
            }
        }
        dispatchLastEvent();
        this.mLastEventPosition = i2;
        this.mLastEventCount = i3;
        this.mLastEventType = 1;
    }

    public void onMoved(int i2, int i3) {
        dispatchLastEvent();
        this.mWrapped.onMoved(i2, i3);
    }

    public void onRemoved(int i2, int i3) {
        int i4;
        if (this.mLastEventType != 2 || (i4 = this.mLastEventPosition) < i2 || i4 > i2 + i3) {
            dispatchLastEvent();
            this.mLastEventPosition = i2;
            this.mLastEventCount = i3;
            this.mLastEventType = 2;
            return;
        }
        this.mLastEventCount += i3;
        this.mLastEventPosition = i2;
    }
}
