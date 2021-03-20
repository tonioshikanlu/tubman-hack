package com.google.android.material.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseBooleanArray;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class ParcelableSparseBooleanArray extends SparseBooleanArray implements Parcelable {
    public static final Parcelable.Creator<ParcelableSparseBooleanArray> CREATOR = new Parcelable.Creator<ParcelableSparseBooleanArray>() {
        @NonNull
        public ParcelableSparseBooleanArray createFromParcel(@NonNull Parcel parcel) {
            int readInt = parcel.readInt();
            ParcelableSparseBooleanArray parcelableSparseBooleanArray = new ParcelableSparseBooleanArray(readInt);
            int[] iArr = new int[readInt];
            boolean[] zArr = new boolean[readInt];
            parcel.readIntArray(iArr);
            parcel.readBooleanArray(zArr);
            for (int i2 = 0; i2 < readInt; i2++) {
                parcelableSparseBooleanArray.put(iArr[i2], zArr[i2]);
            }
            return parcelableSparseBooleanArray;
        }

        @NonNull
        public ParcelableSparseBooleanArray[] newArray(int i2) {
            return new ParcelableSparseBooleanArray[i2];
        }
    };

    public ParcelableSparseBooleanArray() {
    }

    public ParcelableSparseBooleanArray(int i2) {
        super(i2);
    }

    public ParcelableSparseBooleanArray(@NonNull SparseBooleanArray sparseBooleanArray) {
        super(sparseBooleanArray.size());
        for (int i2 = 0; i2 < sparseBooleanArray.size(); i2++) {
            put(sparseBooleanArray.keyAt(i2), sparseBooleanArray.valueAt(i2));
        }
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(@NonNull Parcel parcel, int i2) {
        int[] iArr = new int[size()];
        boolean[] zArr = new boolean[size()];
        for (int i3 = 0; i3 < size(); i3++) {
            iArr[i3] = keyAt(i3);
            zArr[i3] = valueAt(i3);
        }
        parcel.writeInt(size());
        parcel.writeIntArray(iArr);
        parcel.writeBooleanArray(zArr);
    }
}
