package b.j.a.b.s;

import androidx.exifinterface.media.ExifInterface;
import java.io.InputStream;

public final class e extends InputStream {

    /* renamed from: h  reason: collision with root package name */
    public final b f1474h;

    /* renamed from: i  reason: collision with root package name */
    public final InputStream f1475i;

    /* renamed from: j  reason: collision with root package name */
    public byte[] f1476j;

    /* renamed from: k  reason: collision with root package name */
    public int f1477k;

    /* renamed from: l  reason: collision with root package name */
    public final int f1478l;

    public e(b bVar, InputStream inputStream, byte[] bArr, int i2, int i3) {
        this.f1474h = bVar;
        this.f1475i = inputStream;
        this.f1476j = bArr;
        this.f1477k = i2;
        this.f1478l = i3;
    }

    public int available() {
        return this.f1476j != null ? this.f1478l - this.f1477k : this.f1475i.available();
    }

    public final void b() {
        byte[] bArr = this.f1476j;
        if (bArr != null) {
            this.f1476j = null;
            b bVar = this.f1474h;
            if (bVar != null) {
                bVar.f(bArr);
            }
        }
    }

    public void close() {
        b();
        this.f1475i.close();
    }

    public void mark(int i2) {
        if (this.f1476j == null) {
            this.f1475i.mark(i2);
        }
    }

    public boolean markSupported() {
        return this.f1476j == null && this.f1475i.markSupported();
    }

    public int read() {
        byte[] bArr = this.f1476j;
        if (bArr == null) {
            return this.f1475i.read();
        }
        int i2 = this.f1477k;
        int i3 = i2 + 1;
        this.f1477k = i3;
        byte b2 = bArr[i2] & ExifInterface.MARKER;
        if (i3 >= this.f1478l) {
            b();
        }
        return b2;
    }

    public int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    public int read(byte[] bArr, int i2, int i3) {
        byte[] bArr2 = this.f1476j;
        if (bArr2 == null) {
            return this.f1475i.read(bArr, i2, i3);
        }
        int i4 = this.f1478l;
        int i5 = this.f1477k;
        int i6 = i4 - i5;
        if (i3 > i6) {
            i3 = i6;
        }
        System.arraycopy(bArr2, i5, bArr, i2, i3);
        int i7 = this.f1477k + i3;
        this.f1477k = i7;
        if (i7 >= this.f1478l) {
            b();
        }
        return i3;
    }

    public void reset() {
        if (this.f1476j == null) {
            this.f1475i.reset();
        }
    }

    public long skip(long j2) {
        long j3;
        if (this.f1476j != null) {
            int i2 = this.f1478l;
            int i3 = this.f1477k;
            long j4 = (long) (i2 - i3);
            if (j4 > j2) {
                this.f1477k = i3 + ((int) j2);
                return j2;
            }
            b();
            j3 = j4 + 0;
            j2 -= j4;
        } else {
            j3 = 0;
        }
        return j2 > 0 ? j3 + this.f1475i.skip(j2) : j3;
    }
}
