package b.l.b.a.b;

import b.l.b.a.d.d;
import b.l.b.a.d.g;
import b.l.b.a.d.j;
import b.l.b.a.d.l;
import b.l.b.a.d.z.a;
import java.io.BufferedWriter;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.Map;

public class n extends a {
    public Object c;

    public n(Object obj) {
        super(o.a);
        this.c = obj;
    }

    public static boolean b(boolean z, Writer writer, String str, Object obj) {
        String str2;
        if (obj != null && !g.c(obj)) {
            if (z) {
                z = false;
            } else {
                writer.write("&");
            }
            writer.write(str);
            if (obj instanceof Enum) {
                str2 = j.c((Enum) obj).d;
            } else {
                str2 = obj.toString();
            }
            String a = a.a.a(str2);
            if (a.length() != 0) {
                writer.write("=");
                writer.write(a);
            }
        }
        return z;
    }

    public void a(OutputStream outputStream) {
        e eVar = this.a;
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream, (eVar == null || eVar.d() == null) ? d.f4781b : this.a.d()));
        boolean z = true;
        for (Map.Entry next : g.e(this.c).entrySet()) {
            Object value = next.getValue();
            if (value != null) {
                String a = a.a.a((String) next.getKey());
                Class<?> cls = value.getClass();
                if ((value instanceof Iterable) || cls.isArray()) {
                    for (Object b2 : l.l(value)) {
                        z = b(z, bufferedWriter, a, b2);
                    }
                } else {
                    z = b(z, bufferedWriter, a, value);
                }
            }
        }
        bufferedWriter.flush();
    }
}
