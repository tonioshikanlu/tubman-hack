package b.j.a.c.h0.t;

import b.j.a.b.b;
import b.j.a.b.f;
import b.j.a.c.j0.e;
import b.j.a.c.y;
import java.nio.ByteBuffer;
import java.util.Objects;

public class g extends r0<ByteBuffer> {
    public g() {
        super(ByteBuffer.class);
    }

    public void f(Object obj, f fVar, y yVar) {
        ByteBuffer byteBuffer = (ByteBuffer) obj;
        if (byteBuffer.hasArray()) {
            byte[] array = byteBuffer.array();
            int arrayOffset = byteBuffer.arrayOffset();
            int limit = byteBuffer.limit();
            Objects.requireNonNull(fVar);
            fVar.m0(b.f1372b, array, arrayOffset, limit);
            return;
        }
        ByteBuffer asReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
        if (asReadOnlyBuffer.position() > 0) {
            asReadOnlyBuffer.rewind();
        }
        e eVar = new e(asReadOnlyBuffer);
        int remaining = asReadOnlyBuffer.remaining();
        Objects.requireNonNull(fVar);
        fVar.k0(b.f1372b, eVar, remaining);
        eVar.close();
    }
}
