package b.j.a.c;

import b.j.a.a.o;
import b.j.a.b.g;
import b.j.a.b.i;
import b.j.a.b.j;
import java.io.Closeable;
import java.io.Serializable;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Objects;

public class k extends j {

    /* renamed from: i  reason: collision with root package name */
    public LinkedList<a> f2266i;

    /* renamed from: j  reason: collision with root package name */
    public transient Closeable f2267j;

    public static class a implements Serializable {

        /* renamed from: h  reason: collision with root package name */
        public transient Object f2268h;

        /* renamed from: i  reason: collision with root package name */
        public String f2269i;

        /* renamed from: j  reason: collision with root package name */
        public int f2270j = -1;

        /* renamed from: k  reason: collision with root package name */
        public String f2271k;

        public a() {
        }

        public a(Object obj, int i2) {
            this.f2268h = obj;
            this.f2270j = i2;
        }

        public a(Object obj, String str) {
            this.f2268h = obj;
            Objects.requireNonNull(str, "Cannot pass null fieldName");
            this.f2269i = str;
        }

        public String toString() {
            char c;
            if (this.f2271k == null) {
                StringBuilder sb = new StringBuilder();
                Object obj = this.f2268h;
                if (obj != null) {
                    Class<?> cls = obj instanceof Class ? (Class) obj : obj.getClass();
                    int i2 = 0;
                    while (cls.isArray()) {
                        cls = cls.getComponentType();
                        i2++;
                    }
                    String name = cls.getName();
                    while (true) {
                        sb.append(name);
                        i2--;
                        if (i2 < 0) {
                            break;
                        }
                        name = "[]";
                    }
                } else {
                    sb.append("UNKNOWN");
                }
                sb.append('[');
                if (this.f2269i != null) {
                    c = '\"';
                    sb.append('\"');
                    sb.append(this.f2269i);
                } else {
                    int i3 = this.f2270j;
                    if (i3 >= 0) {
                        sb.append(i3);
                        sb.append(']');
                        this.f2271k = sb.toString();
                    } else {
                        c = '?';
                    }
                }
                sb.append(c);
                sb.append(']');
                this.f2271k = sb.toString();
            }
            return this.f2271k;
        }
    }

    public k(Closeable closeable, String str) {
        super(str);
        this.f2267j = closeable;
        if (closeable instanceof i) {
            this.f1434h = ((i) closeable).B0();
        }
    }

    public k(Closeable closeable, String str, g gVar) {
        super(str, gVar);
        this.f2267j = closeable;
    }

    public k(Closeable closeable, String str, Throwable th) {
        super(str, th);
        this.f2267j = closeable;
        if (closeable instanceof i) {
            this.f1434h = ((i) closeable).B0();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: java.io.Closeable} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static b.j.a.c.k f(java.lang.Throwable r4, b.j.a.c.k.a r5) {
        /*
            boolean r0 = r4 instanceof b.j.a.c.k
            if (r0 == 0) goto L_0x0007
            b.j.a.c.k r4 = (b.j.a.c.k) r4
            goto L_0x0046
        L_0x0007:
            java.lang.String r0 = b.j.a.c.j0.g.i(r4)
            if (r0 == 0) goto L_0x0013
            int r1 = r0.length()
            if (r1 != 0) goto L_0x002d
        L_0x0013:
            java.lang.String r0 = "(was "
            java.lang.StringBuilder r0 = b.e.a.a.a.y(r0)
            java.lang.Class r1 = r4.getClass()
            java.lang.String r1 = r1.getName()
            r0.append(r1)
            java.lang.String r1 = ")"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
        L_0x002d:
            r1 = 0
            boolean r2 = r4 instanceof b.j.a.b.j
            if (r2 == 0) goto L_0x0040
            r2 = r4
            b.j.a.b.j r2 = (b.j.a.b.j) r2
            java.lang.Object r2 = r2.c()
            boolean r3 = r2 instanceof java.io.Closeable
            if (r3 == 0) goto L_0x0040
            r1 = r2
            java.io.Closeable r1 = (java.io.Closeable) r1
        L_0x0040:
            b.j.a.c.k r2 = new b.j.a.c.k
            r2.<init>((java.io.Closeable) r1, (java.lang.String) r0, (java.lang.Throwable) r4)
            r4 = r2
        L_0x0046:
            r4.e(r5)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: b.j.a.c.k.f(java.lang.Throwable, b.j.a.c.k$a):b.j.a.c.k");
    }

    public static k g(Throwable th, Object obj, int i2) {
        return f(th, new a(obj, i2));
    }

    public static k h(Throwable th, Object obj, String str) {
        return f(th, new a(obj, str));
    }

    @o
    public Object c() {
        return this.f2267j;
    }

    public String d() {
        String message = super.getMessage();
        if (this.f2266i == null) {
            return message;
        }
        StringBuilder sb = message == null ? new StringBuilder() : new StringBuilder(message);
        sb.append(" (through reference chain: ");
        LinkedList<a> linkedList = this.f2266i;
        if (linkedList != null) {
            Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                sb.append(((a) it.next()).toString());
                if (it.hasNext()) {
                    sb.append("->");
                }
            }
        }
        sb.append(')');
        return sb.toString();
    }

    public void e(a aVar) {
        if (this.f2266i == null) {
            this.f2266i = new LinkedList<>();
        }
        if (this.f2266i.size() < 1000) {
            this.f2266i.addFirst(aVar);
        }
    }

    public String getLocalizedMessage() {
        return d();
    }

    public String getMessage() {
        return d();
    }

    public String toString() {
        return getClass().getName() + ": " + getMessage();
    }
}
