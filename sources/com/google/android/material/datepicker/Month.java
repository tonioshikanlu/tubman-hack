package com.google.android.material.datepicker;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;

public final class Month implements Comparable<Month>, Parcelable {
    public static final Parcelable.Creator<Month> CREATOR = new Parcelable.Creator<Month>() {
        @NonNull
        public Month createFromParcel(@NonNull Parcel parcel) {
            return Month.create(parcel.readInt(), parcel.readInt());
        }

        @NonNull
        public Month[] newArray(int i2) {
            return new Month[i2];
        }
    };
    public final int daysInMonth;
    public final int daysInWeek;
    @NonNull
    private final Calendar firstOfMonth;
    @Nullable
    private String longName;
    public final int month;
    public final long timeInMillis;
    public final int year;

    private Month(@NonNull Calendar calendar) {
        calendar.set(5, 1);
        Calendar dayCopy = UtcDates.getDayCopy(calendar);
        this.firstOfMonth = dayCopy;
        this.month = dayCopy.get(2);
        this.year = dayCopy.get(1);
        this.daysInWeek = dayCopy.getMaximum(7);
        this.daysInMonth = dayCopy.getActualMaximum(5);
        this.timeInMillis = dayCopy.getTimeInMillis();
    }

    @NonNull
    public static Month create(int i2, int i3) {
        Calendar utcCalendar = UtcDates.getUtcCalendar();
        utcCalendar.set(1, i2);
        utcCalendar.set(2, i3);
        return new Month(utcCalendar);
    }

    @NonNull
    public static Month create(long j2) {
        Calendar utcCalendar = UtcDates.getUtcCalendar();
        utcCalendar.setTimeInMillis(j2);
        return new Month(utcCalendar);
    }

    @NonNull
    public static Month current() {
        return new Month(UtcDates.getTodayCalendar());
    }

    public int compareTo(@NonNull Month month2) {
        return this.firstOfMonth.compareTo(month2.firstOfMonth);
    }

    public int daysFromStartOfWeekToFirstOfMonth() {
        int firstDayOfWeek = this.firstOfMonth.get(7) - this.firstOfMonth.getFirstDayOfWeek();
        return firstDayOfWeek < 0 ? firstDayOfWeek + this.daysInWeek : firstDayOfWeek;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Month)) {
            return false;
        }
        Month month2 = (Month) obj;
        return this.month == month2.month && this.year == month2.year;
    }

    public long getDay(int i2) {
        Calendar dayCopy = UtcDates.getDayCopy(this.firstOfMonth);
        dayCopy.set(5, i2);
        return dayCopy.getTimeInMillis();
    }

    public int getDayOfMonth(long j2) {
        Calendar dayCopy = UtcDates.getDayCopy(this.firstOfMonth);
        dayCopy.setTimeInMillis(j2);
        return dayCopy.get(5);
    }

    @NonNull
    public String getLongName(Context context) {
        if (this.longName == null) {
            this.longName = DateStrings.getYearMonth(context, this.firstOfMonth.getTimeInMillis());
        }
        return this.longName;
    }

    public long getStableId() {
        return this.firstOfMonth.getTimeInMillis();
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.month), Integer.valueOf(this.year)});
    }

    @NonNull
    public Month monthsLater(int i2) {
        Calendar dayCopy = UtcDates.getDayCopy(this.firstOfMonth);
        dayCopy.add(2, i2);
        return new Month(dayCopy);
    }

    public int monthsUntil(@NonNull Month month2) {
        if (this.firstOfMonth instanceof GregorianCalendar) {
            return (month2.month - this.month) + ((month2.year - this.year) * 12);
        }
        throw new IllegalArgumentException("Only Gregorian calendars are supported.");
    }

    public void writeToParcel(@NonNull Parcel parcel, int i2) {
        parcel.writeInt(this.year);
        parcel.writeInt(this.month);
    }
}
