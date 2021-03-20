package b.h.a.m.x.d;

import androidx.annotation.NonNull;
import b.h.a.m.v.w;
import java.util.Objects;

public class b implements w<byte[]> {

    /* renamed from: h  reason: collision with root package name */
    public final byte[] f892h;

    public b(byte[] bArr) {
        Objects.requireNonNull(bArr, "Argument must not be null");
        this.f892h = bArr;
    }

    public int a() {
        return this.f892h.length;
    }

    @NonNull
    public Class<byte[]> b() {
        return byte[].class;
    }

    @NonNull
    public Object get() {
        return this.f892h;
    }

    public void recycle() {
    }
}
