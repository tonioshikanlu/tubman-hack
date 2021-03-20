package b.l.a.c.f.e;

import java.io.OutputStream;
import java.util.Objects;
import java.util.logging.Logger;

public final class y1 implements l2 {
    public final OutputStream a;

    public y1(OutputStream outputStream) {
        this.a = outputStream;
    }

    public final void a(s8 s8Var) {
        throw null;
    }

    public final void b(s9 s9Var) {
        try {
            OutputStream outputStream = this.a;
            Objects.requireNonNull(s9Var);
            int o2 = s9Var.o();
            Logger logger = bn.f2875b;
            if (o2 > 4096) {
                o2 = 4096;
            }
            an anVar = new an(outputStream, o2);
            s9Var.k(anVar);
            if (anVar.f > 0) {
                anVar.E();
            }
        } finally {
            this.a.close();
        }
    }
}
