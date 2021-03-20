package com.google.android.material.datepicker;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.GridView;
import android.widget.ListAdapter;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.util.Pair;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.google.android.material.R;
import com.google.android.material.internal.ViewUtils;
import java.util.Calendar;

public final class MaterialCalendarGridView extends GridView {
    private final Calendar dayCompute;
    private final boolean nestedScrollable;

    public MaterialCalendarGridView(Context context) {
        this(context, (AttributeSet) null);
    }

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.dayCompute = UtcDates.getUtcCalendar();
        if (MaterialDatePicker.isFullscreen(getContext())) {
            setNextFocusLeftId(R.id.cancel_button);
            setNextFocusRightId(R.id.confirm_button);
        }
        this.nestedScrollable = MaterialDatePicker.isNestedScrollable(getContext());
        ViewCompat.setAccessibilityDelegate(this, new AccessibilityDelegateCompat() {
            public void onInitializeAccessibilityNodeInfo(View view, @NonNull AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
                super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
                accessibilityNodeInfoCompat.setCollectionInfo((Object) null);
            }
        });
    }

    private void gainFocus(int i2, Rect rect) {
        int firstPositionInMonth;
        if (i2 == 33) {
            firstPositionInMonth = getAdapter().lastPositionInMonth();
        } else if (i2 == 130) {
            firstPositionInMonth = getAdapter().firstPositionInMonth();
        } else {
            super.onFocusChanged(true, i2, rect);
            return;
        }
        setSelection(firstPositionInMonth);
    }

    private static int horizontalMidPoint(@NonNull View view) {
        return (view.getWidth() / 2) + view.getLeft();
    }

    private static boolean skipMonth(@Nullable Long l2, @Nullable Long l3, @Nullable Long l4, @Nullable Long l5) {
        return l2 == null || l3 == null || l4 == null || l5 == null || l4.longValue() > l3.longValue() || l5.longValue() < l2.longValue();
    }

    @NonNull
    public MonthAdapter getAdapter() {
        return (MonthAdapter) super.getAdapter();
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        getAdapter().notifyDataSetChanged();
    }

    public final void onDraw(@NonNull Canvas canvas) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        MaterialCalendarGridView materialCalendarGridView = this;
        super.onDraw(canvas);
        MonthAdapter adapter = getAdapter();
        DateSelector<?> dateSelector = adapter.dateSelector;
        CalendarStyle calendarStyle = adapter.calendarStyle;
        Long item = adapter.getItem(adapter.firstPositionInMonth());
        Long item2 = adapter.getItem(adapter.lastPositionInMonth());
        for (Pair next : dateSelector.getSelectedRanges()) {
            F f = next.first;
            if (f != null) {
                if (next.second != null) {
                    long longValue = ((Long) f).longValue();
                    long longValue2 = ((Long) next.second).longValue();
                    if (!skipMonth(item, item2, Long.valueOf(longValue), Long.valueOf(longValue2))) {
                        boolean isLayoutRtl = ViewUtils.isLayoutRtl(this);
                        if (longValue < item.longValue()) {
                            i3 = adapter.firstPositionInMonth();
                            if (adapter.isFirstInRow(i3)) {
                                i2 = 0;
                            } else {
                                View childAt = materialCalendarGridView.getChildAt(i3 - 1);
                                i2 = !isLayoutRtl ? childAt.getRight() : childAt.getLeft();
                            }
                        } else {
                            materialCalendarGridView.dayCompute.setTimeInMillis(longValue);
                            i3 = adapter.dayToPosition(materialCalendarGridView.dayCompute.get(5));
                            i2 = horizontalMidPoint(materialCalendarGridView.getChildAt(i3));
                        }
                        if (longValue2 > item2.longValue()) {
                            i5 = Math.min(adapter.lastPositionInMonth(), getChildCount() - 1);
                            if (adapter.isLastInRow(i5)) {
                                i4 = getWidth();
                            } else {
                                View childAt2 = materialCalendarGridView.getChildAt(i5);
                                i4 = !isLayoutRtl ? childAt2.getRight() : childAt2.getLeft();
                            }
                        } else {
                            materialCalendarGridView.dayCompute.setTimeInMillis(longValue2);
                            i5 = adapter.dayToPosition(materialCalendarGridView.dayCompute.get(5));
                            i4 = horizontalMidPoint(materialCalendarGridView.getChildAt(i5));
                        }
                        int itemId = (int) adapter.getItemId(i3);
                        int itemId2 = (int) adapter.getItemId(i5);
                        while (itemId <= itemId2) {
                            int numColumns = getNumColumns() * itemId;
                            int numColumns2 = (getNumColumns() + numColumns) - 1;
                            View childAt3 = materialCalendarGridView.getChildAt(numColumns);
                            int topInset = calendarStyle.day.getTopInset() + childAt3.getTop();
                            int bottom = childAt3.getBottom() - calendarStyle.day.getBottomInset();
                            if (!isLayoutRtl) {
                                i7 = numColumns > i3 ? 0 : i2;
                                i6 = i5 > numColumns2 ? getWidth() : i4;
                            } else {
                                int i8 = i5 > numColumns2 ? 0 : i4;
                                i6 = numColumns > i3 ? getWidth() : i2;
                                i7 = i8;
                            }
                            canvas.drawRect((float) i7, (float) topInset, (float) i6, (float) bottom, calendarStyle.rangeFill);
                            itemId++;
                            materialCalendarGridView = this;
                            adapter = adapter;
                        }
                    }
                }
            }
            materialCalendarGridView = this;
        }
    }

    public void onFocusChanged(boolean z, int i2, Rect rect) {
        if (z) {
            gainFocus(i2, rect);
        } else {
            super.onFocusChanged(false, i2, rect);
        }
    }

    public boolean onKeyDown(int i2, KeyEvent keyEvent) {
        if (!super.onKeyDown(i2, keyEvent)) {
            return false;
        }
        if (getSelectedItemPosition() == -1 || getSelectedItemPosition() >= getAdapter().firstPositionInMonth()) {
            return true;
        }
        if (19 != i2) {
            return false;
        }
        setSelection(getAdapter().firstPositionInMonth());
        return true;
    }

    public void onMeasure(int i2, int i3) {
        if (this.nestedScrollable) {
            super.onMeasure(i2, View.MeasureSpec.makeMeasureSpec(ViewCompat.MEASURED_SIZE_MASK, Integer.MIN_VALUE));
            getLayoutParams().height = getMeasuredHeight();
            return;
        }
        super.onMeasure(i2, i3);
    }

    public final void setAdapter(ListAdapter listAdapter) {
        if (listAdapter instanceof MonthAdapter) {
            super.setAdapter(listAdapter);
        } else {
            throw new IllegalArgumentException(String.format("%1$s must have its Adapter set to a %2$s", new Object[]{MaterialCalendarGridView.class.getCanonicalName(), MonthAdapter.class.getCanonicalName()}));
        }
    }

    public void setSelection(int i2) {
        if (i2 < getAdapter().firstPositionInMonth()) {
            i2 = getAdapter().firstPositionInMonth();
        }
        super.setSelection(i2);
    }
}
