package b.h.a.m.x.h;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import b.h.a.m.p;
import b.h.a.m.v.w;
import b.h.a.m.x.d.b;
import b.h.a.m.x.g.c;
import b.h.a.s.a;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicReference;

public class d implements e<c, byte[]> {
    @Nullable
    public w<byte[]> a(@NonNull w<c> wVar, @NonNull p pVar) {
        byte[] bArr;
        ByteBuffer asReadOnlyBuffer = wVar.get().f899h.a.a.g().asReadOnlyBuffer();
        AtomicReference<byte[]> atomicReference = a.a;
        a.b bVar = (asReadOnlyBuffer.isReadOnly() || !asReadOnlyBuffer.hasArray()) ? null : new a.b(asReadOnlyBuffer.array(), asReadOnlyBuffer.arrayOffset(), asReadOnlyBuffer.limit());
        if (bVar != null && bVar.a == 0 && bVar.f1005b == bVar.c.length) {
            bArr = asReadOnlyBuffer.array();
        } else {
            ByteBuffer asReadOnlyBuffer2 = asReadOnlyBuffer.asReadOnlyBuffer();
            byte[] bArr2 = new byte[asReadOnlyBuffer2.limit()];
            asReadOnlyBuffer2.position(0);
            asReadOnlyBuffer2.get(bArr2);
            bArr = bArr2;
        }
        return new b(bArr);
    }
}
