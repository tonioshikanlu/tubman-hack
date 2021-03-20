package b.h.a.m.u;

import androidx.annotation.NonNull;
import b.h.a.m.v.c0.b;
import java.io.OutputStream;

public final class c extends OutputStream {
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final OutputStream f593h;

    /* renamed from: i  reason: collision with root package name */
    public byte[] f594i;

    /* renamed from: j  reason: collision with root package name */
    public b f595j;

    /* renamed from: k  reason: collision with root package name */
    public int f596k;

    public c(@NonNull OutputStream outputStream, @NonNull b bVar) {
        this.f593h = outputStream;
        this.f595j = bVar;
        this.f594i = (byte[]) bVar.e(65536, byte[].class);
    }

    /* JADX INFO: finally extract failed */
    public void close() {
        try {
            flush();
            this.f593h.close();
            byte[] bArr = this.f594i;
            if (bArr != null) {
                this.f595j.d(bArr);
                this.f594i = null;
            }
        } catch (Throwable th) {
            this.f593h.close();
            throw th;
        }
    }

    public void flush() {
        int i2 = this.f596k;
        if (i2 > 0) {
            this.f593h.write(this.f594i, 0, i2);
            this.f596k = 0;
        }
        this.f593h.flush();
    }

    public void write(int i2) {
        byte[] bArr = this.f594i;
        int i3 = this.f596k;
        int i4 = i3 + 1;
        this.f596k = i4;
        bArr[i3] = (byte) i2;
        if (i4 == bArr.length && i4 > 0) {
            this.f593h.write(bArr, 0, i4);
            this.f596k = 0;
        }
    }

    public void write(@NonNull byte[] bArr) {
        write(bArr, 0, bArr.length);
    }

    public void write(@NonNull byte[] bArr, int i2, int i3) {
        int i4 = 0;
        do {
            int i5 = i3 - i4;
            int i6 = i2 + i4;
            int i7 = this.f596k;
            if (i7 != 0 || i5 < this.f594i.length) {
                int min = Math.min(i5, this.f594i.length - i7);
                System.arraycopy(bArr, i6, this.f594i, this.f596k, min);
                int i8 = this.f596k + min;
                this.f596k = i8;
                i4 += min;
                byte[] bArr2 = this.f594i;
                if (i8 == bArr2.length && i8 > 0) {
                    this.f593h.write(bArr2, 0, i8);
                    this.f596k = 0;
                    continue;
                }
            } else {
                this.f593h.write(bArr, i6, i5);
                return;
            }
        } while (i4 < i3);
    }
}
