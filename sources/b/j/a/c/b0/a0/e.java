package b.j.a.c.b0.a0;

import b.j.a.b.b;
import b.j.a.b.i;
import b.j.a.c.g;
import b.j.a.c.j0.f;
import java.nio.ByteBuffer;
import java.util.Objects;

public class e extends c0<ByteBuffer> {
    public e() {
        super((Class<?>) ByteBuffer.class);
    }

    public Object d(i iVar, g gVar) {
        Objects.requireNonNull(iVar);
        return ByteBuffer.wrap(iVar.N(b.f1372b));
    }

    public Object e(i iVar, g gVar, Object obj) {
        ByteBuffer byteBuffer = (ByteBuffer) obj;
        f fVar = new f(byteBuffer);
        iVar.W0(gVar.z(), fVar);
        fVar.close();
        return byteBuffer;
    }
}
