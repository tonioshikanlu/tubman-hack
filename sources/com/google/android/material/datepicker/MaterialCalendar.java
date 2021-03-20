package com.google.android.material.datepicker;

import android.content.Context;
import android.graphics.Canvas;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.annotation.RestrictTo;
import androidx.annotation.StyleRes;
import androidx.annotation.VisibleForTesting;
import androidx.core.util.Pair;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.PagerSnapHelper;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.R;
import com.google.android.material.button.MaterialButton;
import java.util.Calendar;
import java.util.Iterator;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class MaterialCalendar<S> extends PickerFragment<S> {
    private static final String CALENDAR_CONSTRAINTS_KEY = "CALENDAR_CONSTRAINTS_KEY";
    private static final String CURRENT_MONTH_KEY = "CURRENT_MONTH_KEY";
    private static final String GRID_SELECTOR_KEY = "GRID_SELECTOR_KEY";
    @VisibleForTesting
    public static final Object MONTHS_VIEW_GROUP_TAG = "MONTHS_VIEW_GROUP_TAG";
    @VisibleForTesting
    public static final Object NAVIGATION_NEXT_TAG = "NAVIGATION_NEXT_TAG";
    @VisibleForTesting
    public static final Object NAVIGATION_PREV_TAG = "NAVIGATION_PREV_TAG";
    @VisibleForTesting
    public static final Object SELECTOR_TOGGLE_TAG = "SELECTOR_TOGGLE_TAG";
    private static final int SMOOTH_SCROLL_MAX = 3;
    private static final String THEME_RES_ID_KEY = "THEME_RES_ID_KEY";
    /* access modifiers changed from: private */
    @Nullable
    public CalendarConstraints calendarConstraints;
    private CalendarSelector calendarSelector;
    /* access modifiers changed from: private */
    public CalendarStyle calendarStyle;
    /* access modifiers changed from: private */
    @Nullable
    public Month current;
    /* access modifiers changed from: private */
    @Nullable
    public DateSelector<S> dateSelector;
    /* access modifiers changed from: private */
    public View dayFrame;
    /* access modifiers changed from: private */
    public RecyclerView recyclerView;
    @StyleRes
    private int themeResId;
    private View yearFrame;
    /* access modifiers changed from: private */
    public RecyclerView yearSelector;

    public enum CalendarSelector {
        DAY,
        YEAR
    }

    public interface OnDayClickListener {
        void onDayClick(long j2);
    }

    private void addActionsToMonthNavigation(@NonNull View view, @NonNull final MonthsPagerAdapter monthsPagerAdapter) {
        final MaterialButton materialButton = (MaterialButton) view.findViewById(R.id.month_navigation_fragment_toggle);
        materialButton.setTag(SELECTOR_TOGGLE_TAG);
        ViewCompat.setAccessibilityDelegate(materialButton, new AccessibilityDelegateCompat() {
            public void onInitializeAccessibilityNodeInfo(View view, @NonNull AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
                MaterialCalendar materialCalendar;
                int i2;
                super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
                if (MaterialCalendar.this.dayFrame.getVisibility() == 0) {
                    materialCalendar = MaterialCalendar.this;
                    i2 = R.string.mtrl_picker_toggle_to_year_selection;
                } else {
                    materialCalendar = MaterialCalendar.this;
                    i2 = R.string.mtrl_picker_toggle_to_day_selection;
                }
                accessibilityNodeInfoCompat.setHintText(materialCalendar.getString(i2));
            }
        });
        MaterialButton materialButton2 = (MaterialButton) view.findViewById(R.id.month_navigation_previous);
        materialButton2.setTag(NAVIGATION_PREV_TAG);
        MaterialButton materialButton3 = (MaterialButton) view.findViewById(R.id.month_navigation_next);
        materialButton3.setTag(NAVIGATION_NEXT_TAG);
        this.yearFrame = view.findViewById(R.id.mtrl_calendar_year_selector_frame);
        this.dayFrame = view.findViewById(R.id.mtrl_calendar_day_selector_frame);
        setSelector(CalendarSelector.DAY);
        materialButton.setText(this.current.getLongName(view.getContext()));
        this.recyclerView.addOnScrollListener(new RecyclerView.OnScrollListener() {
            public void onScrollStateChanged(@NonNull RecyclerView recyclerView, int i2) {
                if (i2 == 0) {
                    recyclerView.announceForAccessibility(materialButton.getText());
                }
            }

            public void onScrolled(@NonNull RecyclerView recyclerView, int i2, int i3) {
                LinearLayoutManager layoutManager = MaterialCalendar.this.getLayoutManager();
                int findFirstVisibleItemPosition = i2 < 0 ? layoutManager.findFirstVisibleItemPosition() : layoutManager.findLastVisibleItemPosition();
                Month unused = MaterialCalendar.this.current = monthsPagerAdapter.getPageMonth(findFirstVisibleItemPosition);
                materialButton.setText(monthsPagerAdapter.getPageTitle(findFirstVisibleItemPosition));
            }
        });
        materialButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                MaterialCalendar.this.toggleVisibleSelector();
            }
        });
        materialButton3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                int findFirstVisibleItemPosition = MaterialCalendar.this.getLayoutManager().findFirstVisibleItemPosition() + 1;
                if (findFirstVisibleItemPosition < MaterialCalendar.this.recyclerView.getAdapter().getItemCount()) {
                    MaterialCalendar.this.setCurrentMonth(monthsPagerAdapter.getPageMonth(findFirstVisibleItemPosition));
                }
            }
        });
        materialButton2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                int findLastVisibleItemPosition = MaterialCalendar.this.getLayoutManager().findLastVisibleItemPosition() - 1;
                if (findLastVisibleItemPosition >= 0) {
                    MaterialCalendar.this.setCurrentMonth(monthsPagerAdapter.getPageMonth(findLastVisibleItemPosition));
                }
            }
        });
    }

    @NonNull
    private RecyclerView.ItemDecoration createItemDecoration() {
        return new RecyclerView.ItemDecoration() {
            private final Calendar endItem = UtcDates.getUtcCalendar();
            private final Calendar startItem = UtcDates.getUtcCalendar();

            public void onDraw(@NonNull Canvas canvas, @NonNull RecyclerView recyclerView, @NonNull RecyclerView.State state) {
                int i2;
                int i3;
                if ((recyclerView.getAdapter() instanceof YearGridAdapter) && (recyclerView.getLayoutManager() instanceof GridLayoutManager)) {
                    YearGridAdapter yearGridAdapter = (YearGridAdapter) recyclerView.getAdapter();
                    GridLayoutManager gridLayoutManager = (GridLayoutManager) recyclerView.getLayoutManager();
                    for (Pair next : MaterialCalendar.this.dateSelector.getSelectedRanges()) {
                        F f = next.first;
                        if (!(f == null || next.second == null)) {
                            this.startItem.setTimeInMillis(((Long) f).longValue());
                            this.endItem.setTimeInMillis(((Long) next.second).longValue());
                            int positionForYear = yearGridAdapter.getPositionForYear(this.startItem.get(1));
                            int positionForYear2 = yearGridAdapter.getPositionForYear(this.endItem.get(1));
                            View findViewByPosition = gridLayoutManager.findViewByPosition(positionForYear);
                            View findViewByPosition2 = gridLayoutManager.findViewByPosition(positionForYear2);
                            int spanCount = positionForYear / gridLayoutManager.getSpanCount();
                            int spanCount2 = positionForYear2 / gridLayoutManager.getSpanCount();
                            for (int i4 = spanCount; i4 <= spanCount2; i4++) {
                                View findViewByPosition3 = gridLayoutManager.findViewByPosition(gridLayoutManager.getSpanCount() * i4);
                                if (findViewByPosition3 != null) {
                                    int topInset = MaterialCalendar.this.calendarStyle.year.getTopInset() + findViewByPosition3.getTop();
                                    int bottom = findViewByPosition3.getBottom() - MaterialCalendar.this.calendarStyle.year.getBottomInset();
                                    if (i4 == spanCount) {
                                        i2 = (findViewByPosition.getWidth() / 2) + findViewByPosition.getLeft();
                                    } else {
                                        i2 = 0;
                                    }
                                    if (i4 == spanCount2) {
                                        i3 = (findViewByPosition2.getWidth() / 2) + findViewByPosition2.getLeft();
                                    } else {
                                        i3 = recyclerView.getWidth();
                                    }
                                    Canvas canvas2 = canvas;
                                    canvas2.drawRect((float) i2, (float) topInset, (float) i3, (float) bottom, MaterialCalendar.this.calendarStyle.rangeFill);
                                }
                            }
                        }
                    }
                }
            }
        };
    }

    @Px
    public static int getDayHeight(@NonNull Context context) {
        return context.getResources().getDimensionPixelSize(R.dimen.mtrl_calendar_day_height);
    }

    @NonNull
    public static <T> MaterialCalendar<T> newInstance(@NonNull DateSelector<T> dateSelector2, @StyleRes int i2, @NonNull CalendarConstraints calendarConstraints2) {
        MaterialCalendar<T> materialCalendar = new MaterialCalendar<>();
        Bundle bundle = new Bundle();
        bundle.putInt(THEME_RES_ID_KEY, i2);
        bundle.putParcelable(GRID_SELECTOR_KEY, dateSelector2);
        bundle.putParcelable(CALENDAR_CONSTRAINTS_KEY, calendarConstraints2);
        bundle.putParcelable(CURRENT_MONTH_KEY, calendarConstraints2.getOpenAt());
        materialCalendar.setArguments(bundle);
        return materialCalendar;
    }

    private void postSmoothRecyclerViewScroll(final int i2) {
        this.recyclerView.post(new Runnable() {
            public void run() {
                MaterialCalendar.this.recyclerView.smoothScrollToPosition(i2);
            }
        });
    }

    public boolean addOnSelectionChangedListener(@NonNull OnSelectionChangedListener<S> onSelectionChangedListener) {
        return super.addOnSelectionChangedListener(onSelectionChangedListener);
    }

    @Nullable
    public CalendarConstraints getCalendarConstraints() {
        return this.calendarConstraints;
    }

    public CalendarStyle getCalendarStyle() {
        return this.calendarStyle;
    }

    @Nullable
    public Month getCurrentMonth() {
        return this.current;
    }

    @Nullable
    public DateSelector<S> getDateSelector() {
        return this.dateSelector;
    }

    @NonNull
    public LinearLayoutManager getLayoutManager() {
        return (LinearLayoutManager) this.recyclerView.getLayoutManager();
    }

    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        this.themeResId = bundle.getInt(THEME_RES_ID_KEY);
        this.dateSelector = (DateSelector) bundle.getParcelable(GRID_SELECTOR_KEY);
        this.calendarConstraints = (CalendarConstraints) bundle.getParcelable(CALENDAR_CONSTRAINTS_KEY);
        this.current = (Month) bundle.getParcelable(CURRENT_MONTH_KEY);
    }

    @NonNull
    public View onCreateView(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        final int i2;
        int i3;
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(getContext(), this.themeResId);
        this.calendarStyle = new CalendarStyle(contextThemeWrapper);
        LayoutInflater cloneInContext = layoutInflater.cloneInContext(contextThemeWrapper);
        Month start = this.calendarConstraints.getStart();
        if (MaterialDatePicker.isFullscreen(contextThemeWrapper)) {
            i3 = R.layout.mtrl_calendar_vertical;
            i2 = 1;
        } else {
            i3 = R.layout.mtrl_calendar_horizontal;
            i2 = 0;
        }
        View inflate = cloneInContext.inflate(i3, viewGroup, false);
        GridView gridView = (GridView) inflate.findViewById(R.id.mtrl_calendar_days_of_week);
        ViewCompat.setAccessibilityDelegate(gridView, new AccessibilityDelegateCompat() {
            public void onInitializeAccessibilityNodeInfo(View view, @NonNull AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
                super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
                accessibilityNodeInfoCompat.setCollectionInfo((Object) null);
            }
        });
        gridView.setAdapter(new DaysOfWeekAdapter());
        gridView.setNumColumns(start.daysInWeek);
        gridView.setEnabled(false);
        this.recyclerView = (RecyclerView) inflate.findViewById(R.id.mtrl_calendar_months);
        this.recyclerView.setLayoutManager(new SmoothCalendarLayoutManager(getContext(), i2, false) {
            public void calculateExtraLayoutSpace(@NonNull RecyclerView.State state, @NonNull int[] iArr) {
                if (i2 == 0) {
                    iArr[0] = MaterialCalendar.this.recyclerView.getWidth();
                    iArr[1] = MaterialCalendar.this.recyclerView.getWidth();
                    return;
                }
                iArr[0] = MaterialCalendar.this.recyclerView.getHeight();
                iArr[1] = MaterialCalendar.this.recyclerView.getHeight();
            }
        });
        this.recyclerView.setTag(MONTHS_VIEW_GROUP_TAG);
        MonthsPagerAdapter monthsPagerAdapter = new MonthsPagerAdapter(contextThemeWrapper, this.dateSelector, this.calendarConstraints, new OnDayClickListener() {
            public void onDayClick(long j2) {
                if (MaterialCalendar.this.calendarConstraints.getDateValidator().isValid(j2)) {
                    MaterialCalendar.this.dateSelector.select(j2);
                    Iterator it = MaterialCalendar.this.onSelectionChangedListeners.iterator();
                    while (it.hasNext()) {
                        ((OnSelectionChangedListener) it.next()).onSelectionChanged(MaterialCalendar.this.dateSelector.getSelection());
                    }
                    MaterialCalendar.this.recyclerView.getAdapter().notifyDataSetChanged();
                    if (MaterialCalendar.this.yearSelector != null) {
                        MaterialCalendar.this.yearSelector.getAdapter().notifyDataSetChanged();
                    }
                }
            }
        });
        this.recyclerView.setAdapter(monthsPagerAdapter);
        int integer = contextThemeWrapper.getResources().getInteger(R.integer.mtrl_calendar_year_selector_span);
        RecyclerView recyclerView2 = (RecyclerView) inflate.findViewById(R.id.mtrl_calendar_year_selector_frame);
        this.yearSelector = recyclerView2;
        if (recyclerView2 != null) {
            recyclerView2.setHasFixedSize(true);
            this.yearSelector.setLayoutManager(new GridLayoutManager((Context) contextThemeWrapper, integer, 1, false));
            this.yearSelector.setAdapter(new YearGridAdapter(this));
            this.yearSelector.addItemDecoration(createItemDecoration());
        }
        if (inflate.findViewById(R.id.month_navigation_fragment_toggle) != null) {
            addActionsToMonthNavigation(inflate, monthsPagerAdapter);
        }
        if (!MaterialDatePicker.isFullscreen(contextThemeWrapper)) {
            new PagerSnapHelper().attachToRecyclerView(this.recyclerView);
        }
        this.recyclerView.scrollToPosition(monthsPagerAdapter.getPosition(this.current));
        return inflate;
    }

    public void onSaveInstanceState(@NonNull Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt(THEME_RES_ID_KEY, this.themeResId);
        bundle.putParcelable(GRID_SELECTOR_KEY, this.dateSelector);
        bundle.putParcelable(CALENDAR_CONSTRAINTS_KEY, this.calendarConstraints);
        bundle.putParcelable(CURRENT_MONTH_KEY, this.current);
    }

    public void setCurrentMonth(Month month) {
        RecyclerView recyclerView2;
        int i2;
        MonthsPagerAdapter monthsPagerAdapter = (MonthsPagerAdapter) this.recyclerView.getAdapter();
        int position = monthsPagerAdapter.getPosition(month);
        int position2 = position - monthsPagerAdapter.getPosition(this.current);
        boolean z = true;
        boolean z2 = Math.abs(position2) > 3;
        if (position2 <= 0) {
            z = false;
        }
        this.current = month;
        if (!z2 || !z) {
            if (z2) {
                recyclerView2 = this.recyclerView;
                i2 = position + 3;
            }
            postSmoothRecyclerViewScroll(position);
        }
        recyclerView2 = this.recyclerView;
        i2 = position - 3;
        recyclerView2.scrollToPosition(i2);
        postSmoothRecyclerViewScroll(position);
    }

    public void setSelector(CalendarSelector calendarSelector2) {
        this.calendarSelector = calendarSelector2;
        if (calendarSelector2 == CalendarSelector.YEAR) {
            this.yearSelector.getLayoutManager().scrollToPosition(((YearGridAdapter) this.yearSelector.getAdapter()).getPositionForYear(this.current.year));
            this.yearFrame.setVisibility(0);
            this.dayFrame.setVisibility(8);
        } else if (calendarSelector2 == CalendarSelector.DAY) {
            this.yearFrame.setVisibility(8);
            this.dayFrame.setVisibility(0);
            setCurrentMonth(this.current);
        }
    }

    public void toggleVisibleSelector() {
        CalendarSelector calendarSelector2 = this.calendarSelector;
        CalendarSelector calendarSelector3 = CalendarSelector.YEAR;
        if (calendarSelector2 == calendarSelector3) {
            setSelector(CalendarSelector.DAY);
        } else if (calendarSelector2 == CalendarSelector.DAY) {
            setSelector(calendarSelector3);
        }
    }
}
