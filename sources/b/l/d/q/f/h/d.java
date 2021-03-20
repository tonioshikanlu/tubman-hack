package b.l.d.q.f.h;

import b.l.d.q.f.h.c;
import java.io.InputStream;

public class d implements c.d {
    public final /* synthetic */ byte[] a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int[] f5146b;

    public d(e eVar, byte[] bArr, int[] iArr) {
        this.a = bArr;
        this.f5146b = iArr;
    }

    public void read(InputStream inputStream, int i2) {
        try {
            inputStream.read(this.a, this.f5146b[0], i2);
            int[] iArr = this.f5146b;
            iArr[0] = iArr[0] + i2;
        } finally {
            inputStream.close();
        }
    }
}
