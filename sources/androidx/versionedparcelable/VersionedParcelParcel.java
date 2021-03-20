package androidx.versionedparcelable;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.SparseIntArray;
import androidx.annotation.RestrictTo;
import androidx.collection.ArrayMap;
import b.e.a.a.a;
import java.lang.reflect.Method;

@RestrictTo({RestrictTo.Scope.LIBRARY})
public class VersionedParcelParcel extends VersionedParcel {
    private static final boolean DEBUG = false;
    private static final String TAG = "VersionedParcelParcel";
    private int mCurrentField;
    private final int mEnd;
    private int mFieldId;
    private int mNextRead;
    private final int mOffset;
    private final Parcel mParcel;
    private final SparseIntArray mPositionLookup;
    private final String mPrefix;

    public VersionedParcelParcel(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new ArrayMap(), new ArrayMap(), new ArrayMap());
    }

    private VersionedParcelParcel(Parcel parcel, int i2, int i3, String str, ArrayMap<String, Method> arrayMap, ArrayMap<String, Method> arrayMap2, ArrayMap<String, Class> arrayMap3) {
        super(arrayMap, arrayMap2, arrayMap3);
        this.mPositionLookup = new SparseIntArray();
        this.mCurrentField = -1;
        this.mNextRead = 0;
        this.mFieldId = -1;
        this.mParcel = parcel;
        this.mOffset = i2;
        this.mEnd = i3;
        this.mNextRead = i2;
        this.mPrefix = str;
    }

    public void closeField() {
        int i2 = this.mCurrentField;
        if (i2 >= 0) {
            int i3 = this.mPositionLookup.get(i2);
            int dataPosition = this.mParcel.dataPosition();
            this.mParcel.setDataPosition(i3);
            this.mParcel.writeInt(dataPosition - i3);
            this.mParcel.setDataPosition(dataPosition);
        }
    }

    public VersionedParcel createSubParcel() {
        Parcel parcel = this.mParcel;
        int dataPosition = parcel.dataPosition();
        int i2 = this.mNextRead;
        if (i2 == this.mOffset) {
            i2 = this.mEnd;
        }
        return new VersionedParcelParcel(parcel, dataPosition, i2, a.q(new StringBuilder(), this.mPrefix, "  "), this.mReadCache, this.mWriteCache, this.mParcelizerCache);
    }

    public boolean readBoolean() {
        return this.mParcel.readInt() != 0;
    }

    public Bundle readBundle() {
        return this.mParcel.readBundle(getClass().getClassLoader());
    }

    public byte[] readByteArray() {
        int readInt = this.mParcel.readInt();
        if (readInt < 0) {
            return null;
        }
        byte[] bArr = new byte[readInt];
        this.mParcel.readByteArray(bArr);
        return bArr;
    }

    public CharSequence readCharSequence() {
        return (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(this.mParcel);
    }

    public double readDouble() {
        return this.mParcel.readDouble();
    }

    public boolean readField(int i2) {
        while (this.mNextRead < this.mEnd) {
            int i3 = this.mFieldId;
            if (i3 == i2) {
                return true;
            }
            if (String.valueOf(i3).compareTo(String.valueOf(i2)) > 0) {
                return false;
            }
            this.mParcel.setDataPosition(this.mNextRead);
            int readInt = this.mParcel.readInt();
            this.mFieldId = this.mParcel.readInt();
            this.mNextRead += readInt;
        }
        return this.mFieldId == i2;
    }

    public float readFloat() {
        return this.mParcel.readFloat();
    }

    public int readInt() {
        return this.mParcel.readInt();
    }

    public long readLong() {
        return this.mParcel.readLong();
    }

    public <T extends Parcelable> T readParcelable() {
        return this.mParcel.readParcelable(getClass().getClassLoader());
    }

    public String readString() {
        return this.mParcel.readString();
    }

    public IBinder readStrongBinder() {
        return this.mParcel.readStrongBinder();
    }

    public void setOutputField(int i2) {
        closeField();
        this.mCurrentField = i2;
        this.mPositionLookup.put(i2, this.mParcel.dataPosition());
        writeInt(0);
        writeInt(i2);
    }

    public void writeBoolean(boolean z) {
        this.mParcel.writeInt(z ? 1 : 0);
    }

    public void writeBundle(Bundle bundle) {
        this.mParcel.writeBundle(bundle);
    }

    public void writeByteArray(byte[] bArr) {
        if (bArr != null) {
            this.mParcel.writeInt(bArr.length);
            this.mParcel.writeByteArray(bArr);
            return;
        }
        this.mParcel.writeInt(-1);
    }

    public void writeByteArray(byte[] bArr, int i2, int i3) {
        if (bArr != null) {
            this.mParcel.writeInt(bArr.length);
            this.mParcel.writeByteArray(bArr, i2, i3);
            return;
        }
        this.mParcel.writeInt(-1);
    }

    public void writeCharSequence(CharSequence charSequence) {
        TextUtils.writeToParcel(charSequence, this.mParcel, 0);
    }

    public void writeDouble(double d) {
        this.mParcel.writeDouble(d);
    }

    public void writeFloat(float f) {
        this.mParcel.writeFloat(f);
    }

    public void writeInt(int i2) {
        this.mParcel.writeInt(i2);
    }

    public void writeLong(long j2) {
        this.mParcel.writeLong(j2);
    }

    public void writeParcelable(Parcelable parcelable) {
        this.mParcel.writeParcelable(parcelable, 0);
    }

    public void writeString(String str) {
        this.mParcel.writeString(str);
    }

    public void writeStrongBinder(IBinder iBinder) {
        this.mParcel.writeStrongBinder(iBinder);
    }

    public void writeStrongInterface(IInterface iInterface) {
        this.mParcel.writeStrongInterface(iInterface);
    }
}
