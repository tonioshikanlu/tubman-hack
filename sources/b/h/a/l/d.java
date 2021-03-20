package b.h.a.l;

import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.exifinterface.media.ExifInterface;
import b.e.a.a.a;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.util.Objects;

public class d {
    public final byte[] a = new byte[256];

    /* renamed from: b  reason: collision with root package name */
    public ByteBuffer f553b;
    public c c;
    public int d = 0;

    public final boolean a() {
        return this.c.f546b != 0;
    }

    @NonNull
    public c b() {
        if (this.f553b == null) {
            throw new IllegalStateException("You must call setData() before parseHeader()");
        } else if (a()) {
            return this.c;
        } else {
            StringBuilder sb = new StringBuilder();
            for (int i2 = 0; i2 < 6; i2++) {
                sb.append((char) c());
            }
            if (!sb.toString().startsWith("GIF")) {
                this.c.f546b = 1;
            } else {
                this.c.f = f();
                this.c.f548g = f();
                int c2 = c();
                c cVar = this.c;
                cVar.f549h = (c2 & 128) != 0;
                cVar.f550i = (int) Math.pow(2.0d, (double) ((c2 & 7) + 1));
                this.c.f551j = c();
                c cVar2 = this.c;
                c();
                Objects.requireNonNull(cVar2);
                if (this.c.f549h && !a()) {
                    c cVar3 = this.c;
                    cVar3.a = e(cVar3.f550i);
                    c cVar4 = this.c;
                    cVar4.f552k = cVar4.a[cVar4.f551j];
                }
            }
            if (!a()) {
                boolean z = false;
                while (!z && !a() && this.c.c <= Integer.MAX_VALUE) {
                    int c3 = c();
                    if (c3 == 33) {
                        int c4 = c();
                        if (c4 != 1) {
                            if (c4 == 249) {
                                this.c.d = new b();
                                c();
                                int c5 = c();
                                b bVar = this.c.d;
                                int i3 = (c5 & 28) >> 2;
                                bVar.f541g = i3;
                                if (i3 == 0) {
                                    bVar.f541g = 1;
                                }
                                bVar.f = (c5 & 1) != 0;
                                int f = f();
                                if (f < 2) {
                                    f = 10;
                                }
                                b bVar2 = this.c.d;
                                bVar2.f543i = f * 10;
                                bVar2.f542h = c();
                                c();
                            } else if (c4 != 254 && c4 == 255) {
                                d();
                                StringBuilder sb2 = new StringBuilder();
                                for (int i4 = 0; i4 < 11; i4++) {
                                    sb2.append((char) this.a[i4]);
                                }
                                if (sb2.toString().equals("NETSCAPE2.0")) {
                                    do {
                                        d();
                                        byte[] bArr = this.a;
                                        if (bArr[0] == 1) {
                                            byte b2 = bArr[1];
                                            byte b3 = bArr[2];
                                            Objects.requireNonNull(this.c);
                                        }
                                        if (this.d <= 0) {
                                            break;
                                        }
                                    } while (a());
                                }
                            }
                        }
                        g();
                    } else if (c3 == 44) {
                        c cVar5 = this.c;
                        if (cVar5.d == null) {
                            cVar5.d = new b();
                        }
                        cVar5.d.a = f();
                        this.c.d.f539b = f();
                        this.c.d.c = f();
                        this.c.d.d = f();
                        int c6 = c();
                        boolean z2 = (c6 & 128) != 0;
                        int pow = (int) Math.pow(2.0d, (double) ((c6 & 7) + 1));
                        b bVar3 = this.c.d;
                        bVar3.f540e = (c6 & 64) != 0;
                        if (z2) {
                            bVar3.f545k = e(pow);
                        } else {
                            bVar3.f545k = null;
                        }
                        this.c.d.f544j = this.f553b.position();
                        c();
                        g();
                        if (!a()) {
                            c cVar6 = this.c;
                            cVar6.c++;
                            cVar6.f547e.add(cVar6.d);
                        }
                    } else if (c3 != 59) {
                        this.c.f546b = 1;
                    } else {
                        z = true;
                    }
                }
                c cVar7 = this.c;
                if (cVar7.c < 0) {
                    cVar7.f546b = 1;
                }
            }
            return this.c;
        }
    }

    public final int c() {
        try {
            return this.f553b.get() & ExifInterface.MARKER;
        } catch (Exception unused) {
            this.c.f546b = 1;
            return 0;
        }
    }

    public final void d() {
        int c2 = c();
        this.d = c2;
        if (c2 > 0) {
            int i2 = 0;
            int i3 = 0;
            while (true) {
                try {
                    int i4 = this.d;
                    if (i2 < i4) {
                        i3 = i4 - i2;
                        this.f553b.get(this.a, i2, i3);
                        i2 += i3;
                    } else {
                        return;
                    }
                } catch (Exception e2) {
                    if (Log.isLoggable("GifHeaderParser", 3)) {
                        StringBuilder A = a.A("Error Reading Block n: ", i2, " count: ", i3, " blockSize: ");
                        A.append(this.d);
                        Log.d("GifHeaderParser", A.toString(), e2);
                    }
                    this.c.f546b = 1;
                    return;
                }
            }
        }
    }

    @Nullable
    public final int[] e(int i2) {
        byte[] bArr = new byte[(i2 * 3)];
        int[] iArr = null;
        try {
            this.f553b.get(bArr);
            iArr = new int[256];
            int i3 = 0;
            int i4 = 0;
            while (i3 < i2) {
                int i5 = i4 + 1;
                int i6 = i5 + 1;
                int i7 = i6 + 1;
                int i8 = i3 + 1;
                iArr[i3] = ((bArr[i4] & ExifInterface.MARKER) << 16) | -16777216 | ((bArr[i5] & ExifInterface.MARKER) << 8) | (bArr[i6] & ExifInterface.MARKER);
                i4 = i7;
                i3 = i8;
            }
        } catch (BufferUnderflowException e2) {
            if (Log.isLoggable("GifHeaderParser", 3)) {
                Log.d("GifHeaderParser", "Format Error Reading Color Table", e2);
            }
            this.c.f546b = 1;
        }
        return iArr;
    }

    public final int f() {
        return this.f553b.getShort();
    }

    public final void g() {
        int c2;
        do {
            c2 = c();
            this.f553b.position(Math.min(this.f553b.position() + c2, this.f553b.limit()));
        } while (c2 > 0);
    }
}
