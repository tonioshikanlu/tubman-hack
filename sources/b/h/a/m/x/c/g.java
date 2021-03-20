package b.h.a.m.x.c;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import b.h.a.m.p;
import b.h.a.m.r;
import b.h.a.m.v.w;
import b.h.a.s.a;
import java.nio.ByteBuffer;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

public class g implements r<ByteBuffer, Bitmap> {
    public final m a;

    public g(m mVar) {
        this.a = mVar;
    }

    public w a(@NonNull Object obj, int i2, int i3, @NonNull p pVar) {
        AtomicReference<byte[]> atomicReference = a.a;
        return this.a.b(new a.C0039a((ByteBuffer) obj), i2, i3, pVar, m.f868k);
    }

    public boolean b(@NonNull Object obj, @NonNull p pVar) {
        ByteBuffer byteBuffer = (ByteBuffer) obj;
        Objects.requireNonNull(this.a);
        return true;
    }
}
