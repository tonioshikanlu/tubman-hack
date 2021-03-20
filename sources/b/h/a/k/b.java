package b.h.a.k;

import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

public class b implements Closeable {

    /* renamed from: h  reason: collision with root package name */
    public final InputStream f533h;

    /* renamed from: i  reason: collision with root package name */
    public final Charset f534i;

    /* renamed from: j  reason: collision with root package name */
    public byte[] f535j;

    /* renamed from: k  reason: collision with root package name */
    public int f536k;

    /* renamed from: l  reason: collision with root package name */
    public int f537l;

    public class a extends ByteArrayOutputStream {
        public a(int i2) {
            super(i2);
        }

        public String toString() {
            int i2 = this.count;
            if (i2 > 0 && this.buf[i2 - 1] == 13) {
                i2--;
            }
            try {
                return new String(this.buf, 0, i2, b.this.f534i.name());
            } catch (UnsupportedEncodingException e2) {
                throw new AssertionError(e2);
            }
        }
    }

    public b(InputStream inputStream, Charset charset) {
        if (charset == null) {
            throw null;
        } else if (charset.equals(c.a)) {
            this.f533h = inputStream;
            this.f534i = charset;
            this.f535j = new byte[8192];
        } else {
            throw new IllegalArgumentException("Unsupported encoding");
        }
    }

    public final void b() {
        InputStream inputStream = this.f533h;
        byte[] bArr = this.f535j;
        int read = inputStream.read(bArr, 0, bArr.length);
        if (read != -1) {
            this.f536k = 0;
            this.f537l = read;
            return;
        }
        throw new EOFException();
    }

    public void close() {
        synchronized (this.f533h) {
            if (this.f535j != null) {
                this.f535j = null;
                this.f533h.close();
            }
        }
    }

    public String e() {
        int i2;
        byte[] bArr;
        int i3;
        synchronized (this.f533h) {
            if (this.f535j != null) {
                if (this.f536k >= this.f537l) {
                    b();
                }
                for (int i4 = this.f536k; i4 != this.f537l; i4++) {
                    byte[] bArr2 = this.f535j;
                    if (bArr2[i4] == 10) {
                        if (i4 != this.f536k) {
                            i3 = i4 - 1;
                            if (bArr2[i3] == 13) {
                                byte[] bArr3 = this.f535j;
                                int i5 = this.f536k;
                                String str = new String(bArr3, i5, i3 - i5, this.f534i.name());
                                this.f536k = i4 + 1;
                                return str;
                            }
                        }
                        i3 = i4;
                        byte[] bArr32 = this.f535j;
                        int i52 = this.f536k;
                        String str2 = new String(bArr32, i52, i3 - i52, this.f534i.name());
                        this.f536k = i4 + 1;
                        return str2;
                    }
                }
                a aVar = new a((this.f537l - this.f536k) + 80);
                loop1:
                while (true) {
                    byte[] bArr4 = this.f535j;
                    int i6 = this.f536k;
                    aVar.write(bArr4, i6, this.f537l - i6);
                    this.f537l = -1;
                    b();
                    i2 = this.f536k;
                    while (true) {
                        if (i2 != this.f537l) {
                            bArr = this.f535j;
                            if (bArr[i2] == 10) {
                                break loop1;
                            }
                            i2++;
                        }
                    }
                }
                int i7 = this.f536k;
                if (i2 != i7) {
                    aVar.write(bArr, i7, i2 - i7);
                }
                this.f536k = i2 + 1;
                String aVar2 = aVar.toString();
                return aVar2;
            }
            throw new IOException("LineReader is closed");
        }
    }
}
