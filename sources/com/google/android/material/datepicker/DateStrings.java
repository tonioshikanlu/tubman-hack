package com.google.android.material.datepicker;

import android.content.Context;
import android.text.format.DateUtils;
import androidx.annotation.Nullable;
import androidx.core.util.Pair;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

public class DateStrings {
    private DateStrings() {
    }

    public static Pair<String, String> getDateRangeString(@Nullable Long l2, @Nullable Long l3) {
        return getDateRangeString(l2, l3, (SimpleDateFormat) null);
    }

    public static Pair<String, String> getDateRangeString(@Nullable Long l2, @Nullable Long l3, @Nullable SimpleDateFormat simpleDateFormat) {
        if (l2 == null && l3 == null) {
            return Pair.create(null, null);
        }
        if (l2 == null) {
            return Pair.create(null, getDateString(l3.longValue(), simpleDateFormat));
        }
        if (l3 == null) {
            return Pair.create(getDateString(l2.longValue(), simpleDateFormat), null);
        }
        Calendar todayCalendar = UtcDates.getTodayCalendar();
        Calendar utcCalendar = UtcDates.getUtcCalendar();
        utcCalendar.setTimeInMillis(l2.longValue());
        Calendar utcCalendar2 = UtcDates.getUtcCalendar();
        utcCalendar2.setTimeInMillis(l3.longValue());
        if (simpleDateFormat == null) {
            return utcCalendar.get(1) == utcCalendar2.get(1) ? utcCalendar.get(1) == todayCalendar.get(1) ? Pair.create(getMonthDay(l2.longValue(), Locale.getDefault()), getMonthDay(l3.longValue(), Locale.getDefault())) : Pair.create(getMonthDay(l2.longValue(), Locale.getDefault()), getYearMonthDay(l3.longValue(), Locale.getDefault())) : Pair.create(getYearMonthDay(l2.longValue(), Locale.getDefault()), getYearMonthDay(l3.longValue(), Locale.getDefault()));
        }
        return Pair.create(simpleDateFormat.format(new Date(l2.longValue())), simpleDateFormat.format(new Date(l3.longValue())));
    }

    public static String getDateString(long j2) {
        return getDateString(j2, (SimpleDateFormat) null);
    }

    public static String getDateString(long j2, @Nullable SimpleDateFormat simpleDateFormat) {
        Calendar todayCalendar = UtcDates.getTodayCalendar();
        Calendar utcCalendar = UtcDates.getUtcCalendar();
        utcCalendar.setTimeInMillis(j2);
        return simpleDateFormat != null ? simpleDateFormat.format(new Date(j2)) : todayCalendar.get(1) == utcCalendar.get(1) ? getMonthDay(j2) : getYearMonthDay(j2);
    }

    public static String getMonthDay(long j2) {
        return getMonthDay(j2, Locale.getDefault());
    }

    public static String getMonthDay(long j2, Locale locale) {
        return UtcDates.getAbbrMonthDayFormat(locale).format(new Date(j2));
    }

    public static String getMonthDayOfWeekDay(long j2) {
        return getMonthDayOfWeekDay(j2, Locale.getDefault());
    }

    public static String getMonthDayOfWeekDay(long j2, Locale locale) {
        return UtcDates.getAbbrMonthWeekdayDayFormat(locale).format(new Date(j2));
    }

    public static String getYearMonth(Context context, long j2) {
        return DateUtils.formatDateTime(context, j2 - ((long) TimeZone.getDefault().getOffset(j2)), 36);
    }

    public static String getYearMonthDay(long j2) {
        return getYearMonthDay(j2, Locale.getDefault());
    }

    public static String getYearMonthDay(long j2, Locale locale) {
        return UtcDates.getYearAbbrMonthDayFormat(locale).format(new Date(j2));
    }

    public static String getYearMonthDayOfWeekDay(long j2) {
        return getYearMonthDayOfWeekDay(j2, Locale.getDefault());
    }

    public static String getYearMonthDayOfWeekDay(long j2, Locale locale) {
        return UtcDates.getYearAbbrMonthWeekdayDayFormat(locale).format(new Date(j2));
    }
}
