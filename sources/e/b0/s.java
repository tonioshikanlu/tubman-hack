package e.b0;

import e.a.a.a.y0.m.o1.c;
import e.t.g;
import e.x.b.l;
import e.x.c.h;
import e.x.c.i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class s extends p {

    public static final /* synthetic */ class a extends h implements l<h<? extends R>, Iterator<? extends R>> {

        /* renamed from: q  reason: collision with root package name */
        public static final a f9868q = new a();

        public a() {
            super(1, h.class, "iterator", "iterator()Ljava/util/Iterator;", 0);
        }

        public Object invoke(Object obj) {
            h hVar = (h) obj;
            i.e(hVar, "p1");
            return hVar.iterator();
        }
    }

    public static final <T> int a(h<? extends T> hVar) {
        i.e(hVar, "$this$count");
        Iterator<? extends T> it = hVar.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            it.next();
            i2++;
            if (i2 < 0) {
                throw new ArithmeticException("Count overflow has happened.");
            }
        }
        return i2;
    }

    public static final <T> h<T> b(h<? extends T> hVar, int i2) {
        i.e(hVar, "$this$drop");
        if (i2 >= 0) {
            return i2 == 0 ? hVar : hVar instanceof c ? ((c) hVar).a(i2) : new b(hVar, i2);
        }
        throw new IllegalArgumentException(b.e.a.a.a.h("Requested element count ", i2, " is less than zero.").toString());
    }

    public static final <T> h<T> c(h<? extends T> hVar, l<? super T, Boolean> lVar) {
        i.e(hVar, "$this$filter");
        i.e(lVar, "predicate");
        return new e(hVar, true, lVar);
    }

    public static final <T> h<T> d(h<? extends T> hVar, l<? super T, Boolean> lVar) {
        i.e(hVar, "$this$filterNot");
        i.e(lVar, "predicate");
        return new e(hVar, false, lVar);
    }

    public static final <T, R> h<R> e(h<? extends T> hVar, l<? super T, ? extends h<? extends R>> lVar) {
        i.e(hVar, "$this$flatMap");
        i.e(lVar, "transform");
        return new f(hVar, lVar, a.f9868q);
    }

    public static String f(h hVar, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i2, CharSequence charSequence4, l lVar, int i3) {
        if ((i3 & 1) != 0) {
            charSequence = ", ";
        }
        String str = "";
        String str2 = (i3 & 2) != 0 ? str : null;
        if ((i3 & 4) == 0) {
            str = null;
        }
        if ((i3 & 8) != 0) {
            i2 = -1;
        }
        String str3 = (i3 & 16) != 0 ? "..." : null;
        int i4 = i3 & 32;
        i.e(hVar, "$this$joinToString");
        i.e(charSequence, "separator");
        i.e(str2, "prefix");
        i.e(str, "postfix");
        i.e(str3, "truncated");
        StringBuilder sb = new StringBuilder();
        i.e(hVar, "$this$joinTo");
        i.e(sb, "buffer");
        i.e(charSequence, "separator");
        i.e(str2, "prefix");
        i.e(str, "postfix");
        i.e(str3, "truncated");
        sb.append(str2);
        int i5 = 0;
        for (Object next : hVar) {
            i5++;
            if (i5 > 1) {
                sb.append(charSequence);
            }
            if (i2 >= 0 && i5 > i2) {
                break;
            }
            c.f(sb, next, (l) null);
        }
        if (i2 >= 0 && i5 > i2) {
            sb.append(str3);
        }
        sb.append(str);
        String sb2 = sb.toString();
        i.d(sb2, "joinTo(StringBuilder(), …ed, transform).toString()");
        return sb2;
    }

    public static final <T, R> h<R> g(h<? extends T> hVar, l<? super T, ? extends R> lVar) {
        i.e(hVar, "$this$map");
        i.e(lVar, "transform");
        return new u(hVar, lVar);
    }

    public static final <T, R> h<R> h(h<? extends T> hVar, l<? super T, ? extends R> lVar) {
        i.e(hVar, "$this$mapNotNull");
        i.e(lVar, "transform");
        u uVar = new u(hVar, lVar);
        i.e(uVar, "$this$filterNotNull");
        return d(uVar, r.f9867h);
    }

    public static final <T> h<T> i(h<? extends T> hVar, T t) {
        i.e(hVar, "$this$plus");
        return c.z(c.d0(hVar, c.d0(t)));
    }

    public static final <T> List<T> j(h<? extends T> hVar) {
        i.e(hVar, "$this$toList");
        return g.G(k(hVar));
    }

    public static final <T> List<T> k(h<? extends T> hVar) {
        i.e(hVar, "$this$toMutableList");
        ArrayList arrayList = new ArrayList();
        i.e(hVar, "$this$toCollection");
        i.e(arrayList, "destination");
        for (Object add : hVar) {
            arrayList.add(add);
        }
        return arrayList;
    }
}
