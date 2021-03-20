package b.j.a.c.f0.g;

import b.j.a.c.a0.g;
import b.j.a.c.e0.c;
import b.j.a.c.e0.h;
import b.j.a.c.f0.a;
import b.j.a.c.f0.b;
import b.j.a.c.i;
import java.io.Serializable;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class l extends b implements Serializable {
    public Collection<a> a(g<?> gVar, h hVar, i iVar) {
        List<a> W;
        b.j.a.c.b e2 = gVar.e();
        Class<?> e3 = iVar == null ? hVar.e() : iVar.f2152h;
        HashMap hashMap = new HashMap();
        if (!(hVar == null || (W = e2.W(hVar)) == null)) {
            for (a next : W) {
                d(c.e(gVar, next.f1973h), next, gVar, e2, hashMap);
            }
        }
        d(c.e(gVar, e3), new a(e3, (String) null), gVar, e2, hashMap);
        return new ArrayList(hashMap.values());
    }

    public Collection<a> b(g<?> gVar, b.j.a.c.e0.b bVar) {
        Class<?> cls = bVar.f1887i;
        HashSet hashSet = new HashSet();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        e(bVar, new a(cls, (String) null), gVar, hashSet, linkedHashMap);
        return f(cls, hashSet, linkedHashMap);
    }

    public Collection<a> c(g<?> gVar, h hVar, i iVar) {
        List<a> W;
        b.j.a.c.b e2 = gVar.e();
        Class<?> cls = iVar.f2152h;
        HashSet hashSet = new HashSet();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        e(c.e(gVar, cls), new a(cls, (String) null), gVar, hashSet, linkedHashMap);
        if (!(hVar == null || (W = e2.W(hVar)) == null)) {
            for (a next : W) {
                e(c.e(gVar, next.f1973h), next, gVar, hashSet, linkedHashMap);
            }
        }
        return f(cls, hashSet, linkedHashMap);
    }

    public void d(b.j.a.c.e0.b bVar, a aVar, g<?> gVar, b.j.a.c.b bVar2, HashMap<a, a> hashMap) {
        String X;
        if (!aVar.a() && (X = bVar2.X(bVar)) != null) {
            aVar = new a(aVar.f1973h, X);
        }
        if (!hashMap.containsKey(aVar)) {
            hashMap.put(aVar, aVar);
            List<a> W = bVar2.W(bVar);
            if (W != null && !W.isEmpty()) {
                for (a next : W) {
                    d(c.e(gVar, next.f1973h), next, gVar, bVar2, hashMap);
                }
            }
        } else if (aVar.a() && !hashMap.get(aVar).a()) {
            hashMap.put(aVar, aVar);
        }
    }

    public void e(b.j.a.c.e0.b bVar, a aVar, g<?> gVar, Set<Class<?>> set, Map<String, a> map) {
        List<a> W;
        String X;
        b.j.a.c.b e2 = gVar.e();
        if (!aVar.a() && (X = e2.X(bVar)) != null) {
            aVar = new a(aVar.f1973h, X);
        }
        if (aVar.a()) {
            map.put(aVar.f1975j, aVar);
        }
        if (set.add(aVar.f1973h) && (W = e2.W(bVar)) != null && !W.isEmpty()) {
            for (a next : W) {
                e(c.e(gVar, next.f1973h), next, gVar, set, map);
            }
        }
    }

    public Collection<a> f(Class<?> cls, Set<Class<?>> set, Map<String, a> map) {
        ArrayList arrayList = new ArrayList(map.values());
        for (a aVar : map.values()) {
            set.remove(aVar.f1973h);
        }
        for (Class<?> next : set) {
            if (next != cls || !Modifier.isAbstract(next.getModifiers())) {
                arrayList.add(new a(next, (String) null));
            }
        }
        return arrayList;
    }
}
