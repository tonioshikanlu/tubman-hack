package b.l.a.c.f.e;

import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public final class n2 {
    public static final CopyOnWriteArrayList<m2> a = new CopyOnWriteArrayList<>();

    public static m2 a(String str) {
        Iterator<m2> it = a.iterator();
        while (it.hasNext()) {
            m2 next = it.next();
            if (next.d(str)) {
                return next;
            }
        }
        String valueOf = String.valueOf(str);
        throw new GeneralSecurityException(valueOf.length() != 0 ? "No KMS client does support: ".concat(valueOf) : new String("No KMS client does support: "));
    }
}
