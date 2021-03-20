package com.google.android.material.stateful;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.collection.SimpleArrayMap;
import androidx.customview.view.AbsSavedState;
import b.e.a.a.a;

public class ExtendableSavedState extends AbsSavedState {
    public static final Parcelable.Creator<ExtendableSavedState> CREATOR = new Parcelable.ClassLoaderCreator<ExtendableSavedState>() {
        @Nullable
        public ExtendableSavedState createFromParcel(@NonNull Parcel parcel) {
            return new ExtendableSavedState(parcel, (ClassLoader) null);
        }

        @NonNull
        public ExtendableSavedState createFromParcel(@NonNull Parcel parcel, ClassLoader classLoader) {
            return new ExtendableSavedState(parcel, classLoader);
        }

        @NonNull
        public ExtendableSavedState[] newArray(int i2) {
            return new ExtendableSavedState[i2];
        }
    };
    @NonNull
    public final SimpleArrayMap<String, Bundle> extendableStates;

    private ExtendableSavedState(@NonNull Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        int readInt = parcel.readInt();
        String[] strArr = new String[readInt];
        parcel.readStringArray(strArr);
        Bundle[] bundleArr = new Bundle[readInt];
        parcel.readTypedArray(bundleArr, Bundle.CREATOR);
        this.extendableStates = new SimpleArrayMap<>(readInt);
        for (int i2 = 0; i2 < readInt; i2++) {
            this.extendableStates.put(strArr[i2], bundleArr[i2]);
        }
    }

    public ExtendableSavedState(Parcelable parcelable) {
        super(parcelable);
        this.extendableStates = new SimpleArrayMap<>();
    }

    @NonNull
    public String toString() {
        StringBuilder y = a.y("ExtendableSavedState{");
        y.append(Integer.toHexString(System.identityHashCode(this)));
        y.append(" states=");
        y.append(this.extendableStates);
        y.append("}");
        return y.toString();
    }

    public void writeToParcel(@NonNull Parcel parcel, int i2) {
        super.writeToParcel(parcel, i2);
        int size = this.extendableStates.size();
        parcel.writeInt(size);
        String[] strArr = new String[size];
        Bundle[] bundleArr = new Bundle[size];
        for (int i3 = 0; i3 < size; i3++) {
            strArr[i3] = this.extendableStates.keyAt(i3);
            bundleArr[i3] = this.extendableStates.valueAt(i3);
        }
        parcel.writeStringArray(strArr);
        parcel.writeTypedArray(bundleArr, 0);
    }
}
