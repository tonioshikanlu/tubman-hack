package b.l.a.c.f.e;

import java.io.IOException;

public final class zm extends IOException {
    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public zm(java.lang.String r3, java.lang.Throwable r4) {
        /*
            r2 = this;
            java.lang.String r3 = java.lang.String.valueOf(r3)
            int r0 = r3.length()
            java.lang.String r1 = "CodedOutputStream was writing to a flat byte array and ran out of space.: "
            if (r0 == 0) goto L_0x0011
            java.lang.String r3 = r1.concat(r3)
            goto L_0x0016
        L_0x0011:
            java.lang.String r3 = new java.lang.String
            r3.<init>(r1)
        L_0x0016:
            r2.<init>(r3, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: b.l.a.c.f.e.zm.<init>(java.lang.String, java.lang.Throwable):void");
    }

    public zm(Throwable th) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.", th);
    }
}
