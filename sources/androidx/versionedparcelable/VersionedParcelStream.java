package androidx.versionedparcelable;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcelable;
import androidx.annotation.RestrictTo;
import androidx.collection.ArrayMap;
import androidx.versionedparcelable.VersionedParcel;
import b.e.a.a.a;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.Method;
import java.nio.charset.Charset;
import java.util.Set;

@RestrictTo({RestrictTo.Scope.LIBRARY})
public class VersionedParcelStream extends VersionedParcel {
    private static final int TYPE_BOOLEAN = 5;
    private static final int TYPE_BOOLEAN_ARRAY = 6;
    private static final int TYPE_DOUBLE = 7;
    private static final int TYPE_DOUBLE_ARRAY = 8;
    private static final int TYPE_FLOAT = 13;
    private static final int TYPE_FLOAT_ARRAY = 14;
    private static final int TYPE_INT = 9;
    private static final int TYPE_INT_ARRAY = 10;
    private static final int TYPE_LONG = 11;
    private static final int TYPE_LONG_ARRAY = 12;
    private static final int TYPE_NULL = 0;
    private static final int TYPE_STRING = 3;
    private static final int TYPE_STRING_ARRAY = 4;
    private static final int TYPE_SUB_BUNDLE = 1;
    private static final int TYPE_SUB_PERSISTABLE_BUNDLE = 2;
    private static final Charset UTF_16 = Charset.forName("UTF-16");
    public int mCount;
    private DataInputStream mCurrentInput;
    private DataOutputStream mCurrentOutput;
    private FieldBuffer mFieldBuffer;
    private int mFieldId;
    public int mFieldSize;
    private boolean mIgnoreParcelables;
    private final DataInputStream mMasterInput;
    private final DataOutputStream mMasterOutput;

    public static class FieldBuffer {
        public final DataOutputStream mDataStream;
        private final int mFieldId;
        public final ByteArrayOutputStream mOutput;
        private final DataOutputStream mTarget;

        public FieldBuffer(int i2, DataOutputStream dataOutputStream) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            this.mOutput = byteArrayOutputStream;
            this.mDataStream = new DataOutputStream(byteArrayOutputStream);
            this.mFieldId = i2;
            this.mTarget = dataOutputStream;
        }

        public void flushField() {
            this.mDataStream.flush();
            int size = this.mOutput.size();
            this.mTarget.writeInt((this.mFieldId << 16) | (size >= 65535 ? 65535 : size));
            if (size >= 65535) {
                this.mTarget.writeInt(size);
            }
            this.mOutput.writeTo(this.mTarget);
        }
    }

    public VersionedParcelStream(InputStream inputStream, OutputStream outputStream) {
        this(inputStream, outputStream, new ArrayMap(), new ArrayMap(), new ArrayMap());
    }

    private VersionedParcelStream(InputStream inputStream, OutputStream outputStream, ArrayMap<String, Method> arrayMap, ArrayMap<String, Method> arrayMap2, ArrayMap<String, Class> arrayMap3) {
        super(arrayMap, arrayMap2, arrayMap3);
        this.mCount = 0;
        this.mFieldId = -1;
        this.mFieldSize = -1;
        DataOutputStream dataOutputStream = null;
        DataInputStream dataInputStream = inputStream != null ? new DataInputStream(new FilterInputStream(inputStream) {
            public int read() {
                VersionedParcelStream versionedParcelStream = VersionedParcelStream.this;
                int i2 = versionedParcelStream.mFieldSize;
                if (i2 == -1 || versionedParcelStream.mCount < i2) {
                    int read = super.read();
                    VersionedParcelStream.this.mCount++;
                    return read;
                }
                throw new IOException();
            }

            public int read(byte[] bArr, int i2, int i3) {
                VersionedParcelStream versionedParcelStream = VersionedParcelStream.this;
                int i4 = versionedParcelStream.mFieldSize;
                if (i4 == -1 || versionedParcelStream.mCount < i4) {
                    int read = super.read(bArr, i2, i3);
                    if (read > 0) {
                        VersionedParcelStream.this.mCount += read;
                    }
                    return read;
                }
                throw new IOException();
            }

            public long skip(long j2) {
                VersionedParcelStream versionedParcelStream = VersionedParcelStream.this;
                int i2 = versionedParcelStream.mFieldSize;
                if (i2 == -1 || versionedParcelStream.mCount < i2) {
                    long skip = super.skip(j2);
                    if (skip > 0) {
                        VersionedParcelStream.this.mCount += (int) skip;
                    }
                    return skip;
                }
                throw new IOException();
            }
        }) : null;
        this.mMasterInput = dataInputStream;
        dataOutputStream = outputStream != null ? new DataOutputStream(outputStream) : dataOutputStream;
        this.mMasterOutput = dataOutputStream;
        this.mCurrentInput = dataInputStream;
        this.mCurrentOutput = dataOutputStream;
    }

    private void readObject(int i2, String str, Bundle bundle) {
        switch (i2) {
            case 0:
                bundle.putParcelable(str, (Parcelable) null);
                return;
            case 1:
            case 2:
                bundle.putBundle(str, readBundle());
                return;
            case 3:
                bundle.putString(str, readString());
                return;
            case 4:
                bundle.putStringArray(str, (String[]) readArray(new String[0]));
                return;
            case 5:
                bundle.putBoolean(str, readBoolean());
                return;
            case 6:
                bundle.putBooleanArray(str, readBooleanArray());
                return;
            case 7:
                bundle.putDouble(str, readDouble());
                return;
            case 8:
                bundle.putDoubleArray(str, readDoubleArray());
                return;
            case 9:
                bundle.putInt(str, readInt());
                return;
            case 10:
                bundle.putIntArray(str, readIntArray());
                return;
            case 11:
                bundle.putLong(str, readLong());
                return;
            case 12:
                bundle.putLongArray(str, readLongArray());
                return;
            case 13:
                bundle.putFloat(str, readFloat());
                return;
            case 14:
                bundle.putFloatArray(str, readFloatArray());
                return;
            default:
                throw new RuntimeException(a.g("Unknown type ", i2));
        }
    }

    private void writeObject(Object obj) {
        int i2;
        if (obj == null) {
            i2 = 0;
        } else if (obj instanceof Bundle) {
            writeInt(1);
            writeBundle((Bundle) obj);
            return;
        } else if (obj instanceof String) {
            writeInt(3);
            writeString((String) obj);
            return;
        } else if (obj instanceof String[]) {
            writeInt(4);
            writeArray((String[]) obj);
            return;
        } else if (obj instanceof Boolean) {
            writeInt(5);
            writeBoolean(((Boolean) obj).booleanValue());
            return;
        } else if (obj instanceof boolean[]) {
            writeInt(6);
            writeBooleanArray((boolean[]) obj);
            return;
        } else if (obj instanceof Double) {
            writeInt(7);
            writeDouble(((Double) obj).doubleValue());
            return;
        } else if (obj instanceof double[]) {
            writeInt(8);
            writeDoubleArray((double[]) obj);
            return;
        } else if (obj instanceof Integer) {
            writeInt(9);
            i2 = ((Integer) obj).intValue();
        } else if (obj instanceof int[]) {
            writeInt(10);
            writeIntArray((int[]) obj);
            return;
        } else if (obj instanceof Long) {
            writeInt(11);
            writeLong(((Long) obj).longValue());
            return;
        } else if (obj instanceof long[]) {
            writeInt(12);
            writeLongArray((long[]) obj);
            return;
        } else if (obj instanceof Float) {
            writeInt(13);
            writeFloat(((Float) obj).floatValue());
            return;
        } else if (obj instanceof float[]) {
            writeInt(14);
            writeFloatArray((float[]) obj);
            return;
        } else {
            StringBuilder y = a.y("Unsupported type ");
            y.append(obj.getClass());
            throw new IllegalArgumentException(y.toString());
        }
        writeInt(i2);
    }

    public void closeField() {
        FieldBuffer fieldBuffer = this.mFieldBuffer;
        if (fieldBuffer != null) {
            try {
                if (fieldBuffer.mOutput.size() != 0) {
                    this.mFieldBuffer.flushField();
                }
                this.mFieldBuffer = null;
            } catch (IOException e2) {
                throw new VersionedParcel.ParcelException(e2);
            }
        }
    }

    public VersionedParcel createSubParcel() {
        return new VersionedParcelStream(this.mCurrentInput, this.mCurrentOutput, this.mReadCache, this.mWriteCache, this.mParcelizerCache);
    }

    public boolean isStream() {
        return true;
    }

    public boolean readBoolean() {
        try {
            return this.mCurrentInput.readBoolean();
        } catch (IOException e2) {
            throw new VersionedParcel.ParcelException(e2);
        }
    }

    public Bundle readBundle() {
        int readInt = readInt();
        if (readInt < 0) {
            return null;
        }
        Bundle bundle = new Bundle();
        for (int i2 = 0; i2 < readInt; i2++) {
            readObject(readInt(), readString(), bundle);
        }
        return bundle;
    }

    public byte[] readByteArray() {
        try {
            int readInt = this.mCurrentInput.readInt();
            if (readInt <= 0) {
                return null;
            }
            byte[] bArr = new byte[readInt];
            this.mCurrentInput.readFully(bArr);
            return bArr;
        } catch (IOException e2) {
            throw new VersionedParcel.ParcelException(e2);
        }
    }

    public CharSequence readCharSequence() {
        return null;
    }

    public double readDouble() {
        try {
            return this.mCurrentInput.readDouble();
        } catch (IOException e2) {
            throw new VersionedParcel.ParcelException(e2);
        }
    }

    public boolean readField(int i2) {
        while (true) {
            try {
                int i3 = this.mFieldId;
                if (i3 == i2) {
                    return true;
                }
                if (String.valueOf(i3).compareTo(String.valueOf(i2)) > 0) {
                    return false;
                }
                int i4 = this.mCount;
                int i5 = this.mFieldSize;
                if (i4 < i5) {
                    this.mMasterInput.skip((long) (i5 - i4));
                }
                this.mFieldSize = -1;
                int readInt = this.mMasterInput.readInt();
                this.mCount = 0;
                int i6 = readInt & 65535;
                if (i6 == 65535) {
                    i6 = this.mMasterInput.readInt();
                }
                this.mFieldId = (readInt >> 16) & 65535;
                this.mFieldSize = i6;
            } catch (IOException unused) {
                return false;
            }
        }
    }

    public float readFloat() {
        try {
            return this.mCurrentInput.readFloat();
        } catch (IOException e2) {
            throw new VersionedParcel.ParcelException(e2);
        }
    }

    public int readInt() {
        try {
            return this.mCurrentInput.readInt();
        } catch (IOException e2) {
            throw new VersionedParcel.ParcelException(e2);
        }
    }

    public long readLong() {
        try {
            return this.mCurrentInput.readLong();
        } catch (IOException e2) {
            throw new VersionedParcel.ParcelException(e2);
        }
    }

    public <T extends Parcelable> T readParcelable() {
        return null;
    }

    public String readString() {
        try {
            int readInt = this.mCurrentInput.readInt();
            if (readInt <= 0) {
                return null;
            }
            byte[] bArr = new byte[readInt];
            this.mCurrentInput.readFully(bArr);
            return new String(bArr, UTF_16);
        } catch (IOException e2) {
            throw new VersionedParcel.ParcelException(e2);
        }
    }

    public IBinder readStrongBinder() {
        return null;
    }

    public void setOutputField(int i2) {
        closeField();
        FieldBuffer fieldBuffer = new FieldBuffer(i2, this.mMasterOutput);
        this.mFieldBuffer = fieldBuffer;
        this.mCurrentOutput = fieldBuffer.mDataStream;
    }

    public void setSerializationFlags(boolean z, boolean z2) {
        if (z) {
            this.mIgnoreParcelables = z2;
            return;
        }
        throw new RuntimeException("Serialization of this object is not allowed");
    }

    public void writeBoolean(boolean z) {
        try {
            this.mCurrentOutput.writeBoolean(z);
        } catch (IOException e2) {
            throw new VersionedParcel.ParcelException(e2);
        }
    }

    public void writeBundle(Bundle bundle) {
        if (bundle != null) {
            try {
                Set<String> keySet = bundle.keySet();
                this.mCurrentOutput.writeInt(keySet.size());
                for (String str : keySet) {
                    writeString(str);
                    writeObject(bundle.get(str));
                }
            } catch (IOException e2) {
                throw new VersionedParcel.ParcelException(e2);
            }
        } else {
            this.mCurrentOutput.writeInt(-1);
        }
    }

    public void writeByteArray(byte[] bArr) {
        if (bArr != null) {
            try {
                this.mCurrentOutput.writeInt(bArr.length);
                this.mCurrentOutput.write(bArr);
            } catch (IOException e2) {
                throw new VersionedParcel.ParcelException(e2);
            }
        } else {
            this.mCurrentOutput.writeInt(-1);
        }
    }

    public void writeByteArray(byte[] bArr, int i2, int i3) {
        if (bArr != null) {
            try {
                this.mCurrentOutput.writeInt(i3);
                this.mCurrentOutput.write(bArr, i2, i3);
            } catch (IOException e2) {
                throw new VersionedParcel.ParcelException(e2);
            }
        } else {
            this.mCurrentOutput.writeInt(-1);
        }
    }

    public void writeCharSequence(CharSequence charSequence) {
        if (!this.mIgnoreParcelables) {
            throw new RuntimeException("CharSequence cannot be written to an OutputStream");
        }
    }

    public void writeDouble(double d) {
        try {
            this.mCurrentOutput.writeDouble(d);
        } catch (IOException e2) {
            throw new VersionedParcel.ParcelException(e2);
        }
    }

    public void writeFloat(float f) {
        try {
            this.mCurrentOutput.writeFloat(f);
        } catch (IOException e2) {
            throw new VersionedParcel.ParcelException(e2);
        }
    }

    public void writeInt(int i2) {
        try {
            this.mCurrentOutput.writeInt(i2);
        } catch (IOException e2) {
            throw new VersionedParcel.ParcelException(e2);
        }
    }

    public void writeLong(long j2) {
        try {
            this.mCurrentOutput.writeLong(j2);
        } catch (IOException e2) {
            throw new VersionedParcel.ParcelException(e2);
        }
    }

    public void writeParcelable(Parcelable parcelable) {
        if (!this.mIgnoreParcelables) {
            throw new RuntimeException("Parcelables cannot be written to an OutputStream");
        }
    }

    public void writeString(String str) {
        if (str != null) {
            try {
                byte[] bytes = str.getBytes(UTF_16);
                this.mCurrentOutput.writeInt(bytes.length);
                this.mCurrentOutput.write(bytes);
            } catch (IOException e2) {
                throw new VersionedParcel.ParcelException(e2);
            }
        } else {
            this.mCurrentOutput.writeInt(-1);
        }
    }

    public void writeStrongBinder(IBinder iBinder) {
        if (!this.mIgnoreParcelables) {
            throw new RuntimeException("Binders cannot be written to an OutputStream");
        }
    }

    public void writeStrongInterface(IInterface iInterface) {
        if (!this.mIgnoreParcelables) {
            throw new RuntimeException("Binders cannot be written to an OutputStream");
        }
    }
}
