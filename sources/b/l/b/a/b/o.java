package b.l.b.a.b;

import b.l.b.a.d.b;
import b.l.b.a.d.d;
import b.l.b.a.d.e;
import b.l.b.a.d.g;
import b.l.b.a.d.j;
import b.l.b.a.d.k;
import b.l.b.a.d.l;
import b.l.b.a.d.t;
import b.l.b.a.d.z.a;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.lang.reflect.Type;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;

public class o implements t {
    public static final String a;

    static {
        e eVar = new e("application/x-www-form-urlencoded");
        Charset charset = d.a;
        eVar.e("charset", charset == null ? null : charset.name());
        a = eVar.a();
    }

    public static void a(Reader reader, Object obj, boolean z) {
        int read;
        Object obj2 = obj;
        Class<?> cls = obj.getClass();
        e b2 = e.b(cls);
        List asList = Arrays.asList(new Type[]{cls});
        k kVar = k.class.isAssignableFrom(cls) ? (k) obj2 : null;
        Map map = Map.class.isAssignableFrom(cls) ? (Map) obj2 : null;
        b bVar = new b(obj2);
        StringWriter stringWriter = new StringWriter();
        StringWriter stringWriter2 = new StringWriter();
        do {
            boolean z2 = true;
            while (true) {
                read = reader.read();
                if (read == -1 || read == 38) {
                    String stringWriter3 = stringWriter.toString();
                } else {
                    if (read != 61) {
                        if (z2) {
                            stringWriter.write(read);
                        }
                    } else if (z2) {
                        z2 = false;
                    }
                    stringWriter2.write(read);
                }
            }
            String stringWriter32 = stringWriter.toString();
            if (z) {
                stringWriter32 = a.a(stringWriter32);
            }
            if (stringWriter32.length() != 0) {
                String stringWriter4 = stringWriter2.toString();
                if (z) {
                    stringWriter4 = a.a(stringWriter4);
                }
                j a2 = b2.a(stringWriter32);
                if (a2 != null) {
                    Type j2 = g.j(asList, a2.a());
                    if (l.j(j2)) {
                        Class<?> f = l.f(asList, l.c(j2));
                        bVar.a(a2.f4812b, f, c(f, asList, stringWriter4));
                    } else if (l.k(l.f(asList, j2), Iterable.class)) {
                        Collection<Object> collection = (Collection) a2.b(obj2);
                        if (collection == null) {
                            collection = g.f(j2);
                            a2.f(obj2, collection);
                        }
                        collection.add(c(j2 == Object.class ? null : l.e(j2), asList, stringWriter4));
                    } else {
                        a2.f(obj2, c(j2, asList, stringWriter4));
                    }
                } else if (map != null) {
                    ArrayList arrayList = (ArrayList) map.get(stringWriter32);
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                        if (kVar != null) {
                            kVar.set(stringWriter32, arrayList);
                        } else {
                            map.put(stringWriter32, arrayList);
                        }
                    }
                    arrayList.add(stringWriter4);
                }
            }
            stringWriter = new StringWriter();
            stringWriter2 = new StringWriter();
        } while (read != -1);
        bVar.b();
    }

    public static void b(String str, Object obj) {
        try {
            a(new StringReader(str), obj, true);
        } catch (IOException e2) {
            b.l.a.c.b.a.l0(e2);
            throw null;
        }
    }

    public static Object c(Type type, List<Type> list, String str) {
        return g.i(g.j(list, type), str);
    }
}
