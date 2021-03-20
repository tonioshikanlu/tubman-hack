package e.a.a.a.y0.b.a1;

import e.a.a.a.y0.f.b;
import e.t.n;
import e.x.c.i;
import java.util.Iterator;
import java.util.List;

public interface h extends Iterable<c>, e.x.c.z.a {

    /* renamed from: e  reason: collision with root package name */
    public static final a f7785e = a.f7786b;

    public static final class a {
        public static final h a = new C0140a();

        /* renamed from: b  reason: collision with root package name */
        public static final /* synthetic */ a f7786b = new a();

        /* renamed from: e.a.a.a.y0.b.a1.h$a$a  reason: collision with other inner class name */
        public static final class C0140a implements h {
            public c i(b bVar) {
                i.e(bVar, "fqName");
                return null;
            }

            public boolean isEmpty() {
                return true;
            }

            public Iterator<c> iterator() {
                return n.f7933h;
            }

            public String toString() {
                return "EMPTY";
            }

            public boolean x(b bVar) {
                i.e(bVar, "fqName");
                return b.q.a.a.n1(this, bVar);
            }
        }

        public final h a(List<? extends c> list) {
            i.e(list, "annotations");
            return list.isEmpty() ? a : new i(list);
        }
    }

    c i(b bVar);

    boolean isEmpty();

    boolean x(b bVar);
}
