package b.j.a.c.d0;

import b.j.a.c.j0.g;
import java.io.Serializable;
import org.w3c.dom.Document;
import org.w3c.dom.Node;

public class e implements Serializable {

    /* renamed from: h  reason: collision with root package name */
    public static final Class<?> f1870h = Node.class;

    /* renamed from: i  reason: collision with root package name */
    public static final Class<?> f1871i;

    /* renamed from: j  reason: collision with root package name */
    public static final a f1872j;

    /* renamed from: k  reason: collision with root package name */
    public static final e f1873k = new e();

    static {
        a aVar = null;
        Class<Document> cls = Document.class;
        f1871i = cls;
        try {
            aVar = a.a;
        } catch (Throwable unused) {
        }
        f1872j = aVar;
    }

    public final boolean a(Class<?> cls, String str) {
        boolean startsWith;
        do {
            Class<? super Object> superclass = r3.getSuperclass();
            Class<? super Object> cls2 = cls;
            if (superclass == null || superclass == Object.class) {
                return false;
            }
            startsWith = superclass.getName().startsWith(str);
            cls2 = superclass;
        } while (!startsWith);
        return true;
    }

    public final Object b(String str) {
        try {
            return g.h(Class.forName(str), false);
        } catch (Exception | LinkageError unused) {
            return null;
        }
    }
}
