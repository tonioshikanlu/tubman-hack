package b.j.a.c.b0.z;

import b.j.a.a.i0;
import b.j.a.a.l0;
import b.j.a.c.b0.v;
import b.j.a.c.i;
import java.util.Iterator;
import java.util.LinkedList;

public class y {
    public Object a;

    /* renamed from: b  reason: collision with root package name */
    public final i0.a f1855b;
    public LinkedList<a> c;
    public l0 d;

    public static abstract class a {
        public final v a;

        /* renamed from: b  reason: collision with root package name */
        public final Class<?> f1856b;

        public a(v vVar, i iVar) {
            this.a = vVar;
            this.f1856b = iVar.f2152h;
        }

        public a(v vVar, Class<?> cls) {
            this.a = vVar;
            this.f1856b = cls;
        }

        public abstract void a(Object obj, Object obj2);
    }

    public y(i0.a aVar) {
        this.f1855b = aVar;
    }

    public void a(a aVar) {
        if (this.c == null) {
            this.c = new LinkedList<>();
        }
        this.c.add(aVar);
    }

    public void b(Object obj) {
        this.d.a(this.f1855b, obj);
        this.a = obj;
        Object obj2 = this.f1855b.f1304j;
        LinkedList<a> linkedList = this.c;
        if (linkedList != null) {
            Iterator it = linkedList.iterator();
            this.c = null;
            while (it.hasNext()) {
                ((a) it.next()).a(obj2, obj);
            }
        }
    }

    public String toString() {
        return String.valueOf(this.f1855b);
    }
}
