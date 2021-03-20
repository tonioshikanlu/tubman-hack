package b.p.b;

import b.p.b.a0.i;
import java.nio.charset.Charset;

public abstract class v {
    public static v a(q qVar, String str) {
        Charset charset = i.c;
        if (qVar != null) {
            String str2 = qVar.f6739b;
            Charset forName = str2 != null ? Charset.forName(str2) : null;
            if (forName == null) {
                qVar = q.b(qVar + "; charset=utf-8");
            } else {
                charset = forName;
            }
        }
        byte[] bytes = str.getBytes(charset);
        int length = bytes.length;
        i.a((long) bytes.length, (long) 0, (long) length);
        return new u(qVar, length, bytes, 0);
    }
}
