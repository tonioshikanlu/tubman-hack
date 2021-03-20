package b.h.a.m.u;

import androidx.annotation.NonNull;
import androidx.exifinterface.media.ExifInterface;
import b.e.a.a.a;
import java.io.FilterInputStream;
import java.io.InputStream;

public final class g extends FilterInputStream {

    /* renamed from: j  reason: collision with root package name */
    public static final byte[] f598j;

    /* renamed from: k  reason: collision with root package name */
    public static final int f599k;

    /* renamed from: l  reason: collision with root package name */
    public static final int f600l;

    /* renamed from: h  reason: collision with root package name */
    public final byte f601h;

    /* renamed from: i  reason: collision with root package name */
    public int f602i;

    static {
        byte[] bArr = {-1, ExifInterface.MARKER_APP1, 0, 28, 69, 120, 105, 102, 0, 0, 77, 77, 0, 0, 0, 0, 0, 8, 0, 1, 1, 18, 0, 2, 0, 0, 0, 1, 0};
        f598j = bArr;
        int length = bArr.length;
        f599k = length;
        f600l = length + 2;
    }

    public g(InputStream inputStream, int i2) {
        super(inputStream);
        if (i2 < -1 || i2 > 8) {
            throw new IllegalArgumentException(a.g("Cannot add invalid orientation: ", i2));
        }
        this.f601h = (byte) i2;
    }

    public void mark(int i2) {
        throw new UnsupportedOperationException();
    }

    public boolean markSupported() {
        return false;
    }

    public int read() {
        int i2;
        int i3 = this.f602i;
        int read = (i3 < 2 || i3 > (i2 = f600l)) ? super.read() : i3 == i2 ? this.f601h : f598j[i3 - 2] & ExifInterface.MARKER;
        if (read != -1) {
            this.f602i++;
        }
        return read;
    }

    public int read(@NonNull byte[] bArr, int i2, int i3) {
        int i4;
        int i5 = this.f602i;
        int i6 = f600l;
        if (i5 > i6) {
            i4 = super.read(bArr, i2, i3);
        } else if (i5 == i6) {
            bArr[i2] = this.f601h;
            i4 = 1;
        } else if (i5 < 2) {
            i4 = super.read(bArr, i2, 2 - i5);
        } else {
            int min = Math.min(i6 - i5, i3);
            System.arraycopy(f598j, this.f602i - 2, bArr, i2, min);
            i4 = min;
        }
        if (i4 > 0) {
            this.f602i += i4;
        }
        return i4;
    }

    public void reset() {
        throw new UnsupportedOperationException();
    }

    public long skip(long j2) {
        long skip = super.skip(j2);
        if (skip > 0) {
            this.f602i = (int) (((long) this.f602i) + skip);
        }
        return skip;
    }
}
