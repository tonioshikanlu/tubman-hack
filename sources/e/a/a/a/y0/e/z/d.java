package e.a.a.a.y0.e.z;

import e.a.a.a.y0.e.o;
import e.a.a.a.y0.e.p;
import e.n;
import e.t.g;
import e.x.b.l;
import e.x.c.i;
import java.util.LinkedList;
import java.util.List;

public final class d implements c {
    public final p a;

    /* renamed from: b  reason: collision with root package name */
    public final o f9199b;

    public d(p pVar, o oVar) {
        i.e(pVar, "strings");
        i.e(oVar, "qualifiedNames");
        this.a = pVar;
        this.f9199b = oVar;
    }

    public String a(int i2) {
        String str = (String) this.a.f9027i.get(i2);
        i.d(str, "strings.getString(index)");
        return str;
    }

    public boolean b(int i2) {
        return ((Boolean) d(i2).f7917j).booleanValue();
    }

    public String c(int i2) {
        n<List<String>, List<String>, Boolean> d = d(i2);
        List list = (List) d.f7915h;
        String x = g.x((List) d.f7916i, ".", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (l) null, 62);
        if (list.isEmpty()) {
            return x;
        }
        return g.x(list, "/", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (l) null, 62) + '/' + x;
    }

    public final n<List<String>, List<String>, Boolean> d(int i2) {
        LinkedList linkedList = new LinkedList();
        LinkedList linkedList2 = new LinkedList();
        boolean z = false;
        while (i2 != -1) {
            o.c cVar = this.f9199b.f9001i.get(i2);
            p pVar = this.a;
            i.d(cVar, "proto");
            String str = (String) pVar.f9027i.get(cVar.f9011k);
            o.c.C0200c cVar2 = cVar.f9012l;
            i.c(cVar2);
            int ordinal = cVar2.ordinal();
            if (ordinal == 0) {
                linkedList2.addFirst(str);
            } else if (ordinal == 1) {
                linkedList.addFirst(str);
            } else if (ordinal == 2) {
                linkedList2.addFirst(str);
                z = true;
            }
            i2 = cVar.f9010j;
        }
        return new n<>(linkedList, linkedList2, Boolean.valueOf(z));
    }
}
