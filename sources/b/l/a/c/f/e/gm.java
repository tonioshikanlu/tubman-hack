package b.l.a.c.f.e;

import b.e.a.a.a;
import b.l.a.c.f.e.fm;
import b.l.a.c.f.e.gm;
import java.io.IOException;
import java.util.logging.Logger;

public abstract class gm<MessageType extends gm<MessageType, BuilderType>, BuilderType extends fm<MessageType, BuilderType>> implements e0 {
    public int zza = 0;

    public final byte[] a() {
        e eVar = (e) this;
        try {
            int o2 = eVar.o();
            byte[] bArr = new byte[o2];
            Logger logger = bn.f2875b;
            ym ymVar = new ym(bArr, 0, o2);
            eVar.k(ymVar);
            if (ymVar.p() == 0) {
                return bArr;
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (IOException e2) {
            String name = getClass().getName();
            StringBuilder sb = new StringBuilder(name.length() + 72);
            a.L(sb, "Serializing ", name, " to a ", "byte array");
            sb.append(" threw an IOException (should never happen).");
            throw new RuntimeException(sb.toString(), e2);
        }
    }

    public int b() {
        throw null;
    }

    public void c(int i2) {
        throw null;
    }

    public final um n() {
        e eVar = (e) this;
        try {
            int o2 = eVar.o();
            um umVar = um.f3344i;
            byte[] bArr = new byte[o2];
            Logger logger = bn.f2875b;
            ym ymVar = new ym(bArr, 0, bArr.length);
            eVar.k(ymVar);
            if (ymVar.p() == 0) {
                return new rm(bArr);
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (IOException e2) {
            String name = getClass().getName();
            StringBuilder sb = new StringBuilder(name.length() + 72);
            a.L(sb, "Serializing ", name, " to a ", "ByteString");
            sb.append(" threw an IOException (should never happen).");
            throw new RuntimeException(sb.toString(), e2);
        }
    }
}
