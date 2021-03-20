package e.t;

import b.p.a.a0.a.a;
import e.a.k;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;

public abstract class c<K, V> extends AbstractMap<K, V> implements Map<K, V>, e.x.c.z.c {
    public final Set<Map.Entry<K, V>> entrySet() {
        a.b bVar = (a.b) this;
        List<k> list = bVar.f6374h;
        ArrayList arrayList = new ArrayList(b.q.a.a.C(list, 10));
        int i2 = 0;
        for (T next : list) {
            int i3 = i2 + 1;
            if (i2 >= 0) {
                arrayList.add(new AbstractMap.SimpleEntry((k) next, bVar.f6375i[i2]));
                i2 = i3;
            } else {
                g.S();
                throw null;
            }
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next2 = it.next();
            Object value = ((AbstractMap.SimpleEntry) next2).getValue();
            Class<Metadata> cls = b.p.a.a0.a.c.a;
            if (value != b.p.a.a0.a.c.f6376b) {
                linkedHashSet.add(next2);
            }
        }
        return linkedHashSet;
    }
}
