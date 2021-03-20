package e.a.a.a.y0.h;

import e.a.a.a.y0.h.p;
import java.io.InputStream;

public abstract class b<MessageType extends p> implements r<MessageType> {
    static {
        f fVar = f.f9233b;
    }

    public final MessageType b(MessageType messagetype) {
        v vVar;
        if (messagetype == null || messagetype.g()) {
            return messagetype;
        }
        if (messagetype instanceof a) {
            a aVar = (a) messagetype;
            vVar = new v();
        } else {
            vVar = new v();
        }
        j jVar = new j(vVar.getMessage());
        jVar.f9248h = messagetype;
        throw jVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x002e, code lost:
        if (r2 >= 64) goto L_0x004f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0030, code lost:
        r3 = r6.read();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0034, code lost:
        if (r3 == -1) goto L_0x004a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0038, code lost:
        if ((r3 & 128) != 0) goto L_0x0047;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0047, code lost:
        r2 = r2 + 7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x004e, code lost:
        throw e.a.a.a.y0.h.j.d();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0056, code lost:
        throw new e.a.a.a.y0.h.j("CodedInputStream encountered a malformed varint.");
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object c(java.io.InputStream r6, e.a.a.a.y0.h.f r7) {
        /*
            r5 = this;
            int r0 = r6.read()     // Catch:{ IOException -> 0x0057 }
            r1 = -1
            if (r0 != r1) goto L_0x0009
            r6 = 0
            goto L_0x0043
        L_0x0009:
            r2 = r0 & 128(0x80, float:1.794E-43)
            if (r2 != 0) goto L_0x000e
            goto L_0x003a
        L_0x000e:
            r0 = r0 & 127(0x7f, float:1.78E-43)
            r2 = 7
        L_0x0011:
            r3 = 32
            if (r2 >= r3) goto L_0x002c
            int r3 = r6.read()     // Catch:{ IOException -> 0x0057 }
            if (r3 == r1) goto L_0x0027
            r4 = r3 & 127(0x7f, float:1.78E-43)
            int r4 = r4 << r2
            r0 = r0 | r4
            r3 = r3 & 128(0x80, float:1.794E-43)
            if (r3 != 0) goto L_0x0024
            goto L_0x003a
        L_0x0024:
            int r2 = r2 + 7
            goto L_0x0011
        L_0x0027:
            e.a.a.a.y0.h.j r6 = e.a.a.a.y0.h.j.d()     // Catch:{ IOException -> 0x0057 }
            throw r6     // Catch:{ IOException -> 0x0057 }
        L_0x002c:
            r3 = 64
            if (r2 >= r3) goto L_0x004f
            int r3 = r6.read()     // Catch:{ IOException -> 0x0057 }
            if (r3 == r1) goto L_0x004a
            r3 = r3 & 128(0x80, float:1.794E-43)
            if (r3 != 0) goto L_0x0047
        L_0x003a:
            e.a.a.a.y0.h.a$a$a r1 = new e.a.a.a.y0.h.a$a$a
            r1.<init>(r6, r0)
            e.a.a.a.y0.h.p r6 = r5.d(r1, r7)
        L_0x0043:
            r5.b(r6)
            return r6
        L_0x0047:
            int r2 = r2 + 7
            goto L_0x002c
        L_0x004a:
            e.a.a.a.y0.h.j r6 = e.a.a.a.y0.h.j.d()     // Catch:{ IOException -> 0x0057 }
            throw r6     // Catch:{ IOException -> 0x0057 }
        L_0x004f:
            e.a.a.a.y0.h.j r6 = new e.a.a.a.y0.h.j     // Catch:{ IOException -> 0x0057 }
            java.lang.String r7 = "CodedInputStream encountered a malformed varint."
            r6.<init>(r7)     // Catch:{ IOException -> 0x0057 }
            throw r6     // Catch:{ IOException -> 0x0057 }
        L_0x0057:
            r6 = move-exception
            e.a.a.a.y0.h.j r7 = new e.a.a.a.y0.h.j
            java.lang.String r6 = r6.getMessage()
            r7.<init>(r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: e.a.a.a.y0.h.b.c(java.io.InputStream, e.a.a.a.y0.h.f):java.lang.Object");
    }

    public MessageType d(InputStream inputStream, f fVar) {
        d dVar = new d(inputStream);
        MessageType messagetype = (p) a(dVar, fVar);
        try {
            dVar.a(0);
            return messagetype;
        } catch (j e2) {
            e2.f9248h = messagetype;
            throw e2;
        }
    }
}
