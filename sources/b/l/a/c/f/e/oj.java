package b.l.a.c.f.e;

import androidx.annotation.NonNull;
import b.l.a.c.c.n.a;
import b.l.a.c.k.d;

public final class oj implements d {
    public final void b(@NonNull Exception exc) {
        a aVar = sj.d;
        String valueOf = String.valueOf(exc.getMessage());
        aVar.b(valueOf.length() != 0 ? "SmsRetrieverClient failed to start: ".concat(valueOf) : new String("SmsRetrieverClient failed to start: "), new Object[0]);
    }
}
