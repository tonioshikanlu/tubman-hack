package b.n.a.a.e;

import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import java.nio.ByteBuffer;

@RestrictTo({RestrictTo.Scope.LIBRARY})
public final class a extends h<ByteBuffer> {
    public int d(@NonNull Object obj) {
        return ((ByteBuffer) obj).limit();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0019, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0022, code lost:
        throw r3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public b.i.a.f e(@androidx.annotation.NonNull java.lang.Object r1, int r2, int r3, @androidx.annotation.NonNull b.h.a.m.p r4) {
        /*
            r0 = this;
            java.nio.ByteBuffer r1 = (java.nio.ByteBuffer) r1
            java.util.concurrent.atomic.AtomicReference<byte[]> r2 = b.h.a.s.a.a     // Catch:{ IOException -> 0x0025, h -> 0x0023 }
            b.h.a.s.a$a r2 = new b.h.a.s.a$a     // Catch:{ IOException -> 0x0025, h -> 0x0023 }
            r2.<init>(r1)     // Catch:{ IOException -> 0x0025, h -> 0x0023 }
            b.i.a.i r1 = new b.i.a.i     // Catch:{ all -> 0x0017 }
            r1.<init>()     // Catch:{ all -> 0x0017 }
            r3 = 1
            b.i.a.f r1 = r1.h(r2, r3)     // Catch:{ all -> 0x0017 }
            r2.close()     // Catch:{ IOException -> 0x0025, h -> 0x0023 }
            return r1
        L_0x0017:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0019 }
        L_0x0019:
            r3 = move-exception
            r2.close()     // Catch:{ all -> 0x001e }
            goto L_0x0022
        L_0x001e:
            r2 = move-exception
            r1.addSuppressed(r2)     // Catch:{ IOException -> 0x0025, h -> 0x0023 }
        L_0x0022:
            throw r3     // Catch:{ IOException -> 0x0025, h -> 0x0023 }
        L_0x0023:
            r1 = move-exception
            goto L_0x0026
        L_0x0025:
            r1 = move-exception
        L_0x0026:
            b.n.a.a.e.i r2 = new b.n.a.a.e.i
            r2.<init>(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: b.n.a.a.e.a.e(java.lang.Object, int, int, b.h.a.m.p):b.i.a.f");
    }
}
