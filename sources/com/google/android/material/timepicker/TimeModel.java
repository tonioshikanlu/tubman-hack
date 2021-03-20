package com.google.android.material.timepicker;

import android.content.res.Resources;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.IntRange;
import java.util.Arrays;

public class TimeModel implements Parcelable {
    public static final Parcelable.Creator<TimeModel> CREATOR = new Parcelable.Creator<TimeModel>() {
        public TimeModel createFromParcel(Parcel parcel) {
            return new TimeModel(parcel);
        }

        public TimeModel[] newArray(int i2) {
            return new TimeModel[i2];
        }
    };
    public static final String NUMBER_FORMAT = "%d";
    public static final String ZERO_LEADING_NUMBER_FORMAT = "%02d";
    public final int format;
    public int hour;
    private final MaxInputValidator hourInputValidator;
    public int minute;
    private final MaxInputValidator minuteInputValidator;
    public int period;
    public int selection;

    public TimeModel() {
        this(0);
    }

    public TimeModel(int i2) {
        this(0, 0, 10, i2);
    }

    public TimeModel(int i2, int i3, int i4, int i5) {
        this.hour = i2;
        this.minute = i3;
        this.selection = i4;
        this.format = i5;
        this.period = getPeriod(i2);
        this.minuteInputValidator = new MaxInputValidator(59);
        this.hourInputValidator = new MaxInputValidator(i5 == 1 ? 24 : 12);
    }

    public TimeModel(Parcel parcel) {
        this(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt());
    }

    public static String formatText(Resources resources, CharSequence charSequence) {
        return formatText(resources, charSequence, ZERO_LEADING_NUMBER_FORMAT);
    }

    public static String formatText(Resources resources, CharSequence charSequence, String str) {
        return String.format(resources.getConfiguration().locale, str, new Object[]{Integer.valueOf(Integer.parseInt(String.valueOf(charSequence)))});
    }

    private static int getPeriod(int i2) {
        return i2 >= 12 ? 1 : 0;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TimeModel)) {
            return false;
        }
        TimeModel timeModel = (TimeModel) obj;
        return this.hour == timeModel.hour && this.minute == timeModel.minute && this.format == timeModel.format && this.selection == timeModel.selection;
    }

    public int getHourForDisplay() {
        if (this.format == 1) {
            return this.hour % 24;
        }
        int i2 = this.hour;
        if (i2 % 12 == 0) {
            return 12;
        }
        return this.period == 1 ? i2 - 12 : i2;
    }

    public MaxInputValidator getHourInputValidator() {
        return this.hourInputValidator;
    }

    public MaxInputValidator getMinuteInputValidator() {
        return this.minuteInputValidator;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.format), Integer.valueOf(this.hour), Integer.valueOf(this.minute), Integer.valueOf(this.selection)});
    }

    public void setHour(int i2) {
        if (this.format == 1) {
            this.hour = i2;
            return;
        }
        int i3 = 12;
        int i4 = i2 % 12;
        if (this.period != 1) {
            i3 = 0;
        }
        this.hour = i4 + i3;
    }

    public void setHourOfDay(int i2) {
        this.period = getPeriod(i2);
        this.hour = i2;
    }

    public void setMinute(@IntRange(from = 0, to = 60) int i2) {
        this.minute = i2 % 60;
    }

    public void setPeriod(int i2) {
        int i3;
        if (i2 != this.period) {
            this.period = i2;
            int i4 = this.hour;
            if (i4 < 12 && i2 == 1) {
                i3 = i4 + 12;
            } else if (i4 >= 12 && i2 == 0) {
                i3 = i4 - 12;
            } else {
                return;
            }
            this.hour = i3;
        }
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(this.hour);
        parcel.writeInt(this.minute);
        parcel.writeInt(this.selection);
        parcel.writeInt(this.format);
    }
}
