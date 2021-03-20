package b.p.a.a0.a;

import b.l.f.x.a.g;
import b.p.a.a0.a.a;
import b.p.a.l;
import b.p.a.q;
import b.p.a.x;
import b.q.a.a;
import e.a.a.a.a;
import e.a.a.a.n0;
import e.a.a.a.y0.b.j;
import e.a.a.a.y0.b.s;
import e.a.e;
import e.a.h;
import e.a.k;
import e.a.m;
import e.x.c.i;
import e.x.c.y;
import e.x.c.z.c;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import kotlin.Metadata;

public final class b implements l.a {
    public l<?> a(Type type, Set<? extends Annotation> set, x xVar) {
        Object obj;
        Iterator it;
        String str;
        String str2;
        T t;
        Type type2 = type;
        x xVar2 = xVar;
        i.e(type2, "type");
        i.e(set, "annotations");
        i.e(xVar2, "moshi");
        boolean z = true;
        T t2 = null;
        if (!set.isEmpty()) {
            return null;
        }
        i.e(type2, "$this$rawType");
        Class<?> B = g.B(type);
        i.d(B, "Types.getRawType(this)");
        if (B.isInterface() || B.isEnum()) {
            return null;
        }
        Class<Metadata> cls = c.a;
        if (!B.isAnnotationPresent(c.a) || b.p.a.z.b.e(B)) {
            return null;
        }
        try {
            l<?> c = b.p.a.z.b.c(xVar2, type2, B);
            if (c != null) {
                return c;
            }
        } catch (RuntimeException e2) {
            RuntimeException runtimeException = e2;
            if (!(runtimeException.getCause() instanceof ClassNotFoundException)) {
                throw runtimeException;
            }
        }
        if (!B.isLocalClass()) {
            e<?> U0 = a.U0(B);
            if (!(!U0.c())) {
                throw new IllegalArgumentException(b.e.a.a.a.d(B, b.e.a.a.a.y("Cannot serialize abstract class ")).toString());
            } else if (!U0.t()) {
                if (!(U0.y() == null)) {
                    throw new IllegalArgumentException(b.e.a.a.a.d(B, b.e.a.a.a.y("Cannot serialize object declaration ")).toString());
                } else if (!U0.w()) {
                    i.e(U0, "$this$primaryConstructor");
                    e.a.a.a.a aVar = (e.a.a.a.a) U0;
                    n0 n0Var = aVar.f7450j.e().f7454g;
                    e.a.l lVar = a.C0125a.f7452p[4];
                    Iterator it2 = ((Collection) n0Var.e()).iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            obj = null;
                            break;
                        }
                        obj = it2.next();
                        h hVar = (h) obj;
                        Objects.requireNonNull(hVar, "null cannot be cast to non-null type kotlin.reflect.jvm.internal.KFunctionImpl");
                        s J = ((e.a.a.a.b) hVar).D();
                        Objects.requireNonNull(J, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ConstructorDescriptor");
                        if (((j) J).S()) {
                            break;
                        }
                    }
                    h hVar2 = (h) obj;
                    if (hVar2 == null) {
                        return null;
                    }
                    List<k> g2 = hVar2.g();
                    int q2 = b.q.a.a.q2(b.q.a.a.C(g2, 10));
                    if (q2 < 16) {
                        q2 = 16;
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap(q2);
                    for (T next : g2) {
                        linkedHashMap.put(((k) next).getName(), next);
                    }
                    b.q.a.a.R2(hVar2, true);
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                    i.e(U0, "$this$memberProperties");
                    n0 n0Var2 = aVar.f7450j.e().f7460m;
                    e.a.l lVar2 = a.C0125a.f7452p[14];
                    ArrayList arrayList = new ArrayList();
                    for (Object next2 : (Collection) n0Var2.e()) {
                        e.a.a.a.g gVar = (e.a.a.a.g) next2;
                        if (((gVar.D().U() != null) ^ true) && (gVar instanceof m)) {
                            arrayList.add(next2);
                        }
                    }
                    Iterator it3 = arrayList.iterator();
                    while (it3.hasNext()) {
                        m mVar = (m) it3.next();
                        k kVar = (k) linkedHashMap.get(mVar.getName());
                        Field M0 = b.q.a.a.M0(mVar);
                        if (Modifier.isTransient(M0 != null ? M0.getModifiers() : 0)) {
                            if (kVar != null && !kVar.z()) {
                                z = false;
                            }
                            if (!z) {
                                throw new IllegalArgumentException(("No default value for transient constructor " + kVar).toString());
                            }
                        } else {
                            if (!((kVar == null || i.a(kVar.d(), mVar.f())) ? z : false)) {
                                k kVar2 = kVar;
                                StringBuilder v = b.e.a.a.a.v('\'');
                                v.append(mVar.getName());
                                v.append("' has a constructor parameter of type ");
                                i.c(kVar2);
                                v.append(kVar2.d());
                                v.append(" but a property of type ");
                                v.append(mVar.f());
                                v.append('.');
                                throw new IllegalArgumentException(v.toString().toString());
                            } else if ((mVar instanceof e.a.j) || kVar != null) {
                                b.q.a.a.R2(mVar, z);
                                List<T> a0 = e.t.g.a0(mVar.k());
                                Iterator<T> it4 = mVar.k().iterator();
                                while (true) {
                                    if (!it4.hasNext()) {
                                        break;
                                    }
                                    T next3 = it4.next();
                                    if (((Annotation) next3) instanceof b.p.a.k) {
                                        t2 = next3;
                                        break;
                                    }
                                }
                                b.p.a.k kVar3 = (b.p.a.k) t2;
                                if (kVar != null) {
                                    e.t.g.b(a0, kVar.k());
                                    if (kVar3 == null) {
                                        Iterator<T> it5 = kVar.k().iterator();
                                        while (true) {
                                            if (!it5.hasNext()) {
                                                t = null;
                                                break;
                                            }
                                            t = it5.next();
                                            if (((Annotation) t) instanceof b.p.a.k) {
                                                break;
                                            }
                                        }
                                        kVar3 = (b.p.a.k) t;
                                    }
                                }
                                if (kVar3 == null || (str = kVar3.name()) == null) {
                                    str = mVar.getName();
                                }
                                String str3 = str;
                                Type h2 = b.p.a.z.b.h(type2, B, b.q.a.a.Q0(mVar.f()));
                                it = it3;
                                Object[] array = ((ArrayList) a0).toArray(new Annotation[0]);
                                Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
                                l<T> d = xVar2.d(h2, b.p.a.z.b.f((Annotation[]) array), mVar.getName());
                                String name = mVar.getName();
                                if (kVar3 == null || (str2 = kVar3.name()) == null) {
                                    str2 = str3;
                                }
                                i.d(d, "adapter");
                                linkedHashMap2.put(name, new a.C0113a(str3, str2, d, mVar, kVar, kVar != null ? kVar.h() : -1));
                                z = true;
                                t2 = null;
                                it3 = it;
                            }
                        }
                        it = it3;
                        z = true;
                        t2 = null;
                        it3 = it;
                    }
                    ArrayList arrayList2 = new ArrayList();
                    for (k next4 : hVar2.g()) {
                        String name2 = next4.getName();
                        if (!(linkedHashMap2 instanceof e.x.c.z.a) || (linkedHashMap2 instanceof c)) {
                            a.C0113a aVar2 = (a.C0113a) linkedHashMap2.remove(name2);
                            if (aVar2 != null || next4.z()) {
                                arrayList2.add(aVar2);
                            } else {
                                throw new IllegalArgumentException(("No property for required constructor " + next4).toString());
                            }
                        } else {
                            y.c(linkedHashMap2, "kotlin.collections.MutableMap");
                            throw null;
                        }
                    }
                    int size = arrayList2.size();
                    int i2 = size;
                    for (Map.Entry value : linkedHashMap2.entrySet()) {
                        a.C0113a aVar3 = (a.C0113a) value.getValue();
                        String str4 = aVar3.a;
                        String str5 = aVar3.f6372b;
                        l<P> lVar3 = aVar3.c;
                        m<K, P> mVar2 = aVar3.d;
                        k kVar4 = aVar3.f6373e;
                        i.e(str4, "name");
                        i.e(lVar3, "adapter");
                        i.e(mVar2, "property");
                        arrayList2.add(new a.C0113a(str4, str5, lVar3, mVar2, kVar4, i2));
                        i2++;
                    }
                    i.e(arrayList2, "$this$filterNotNull");
                    ArrayList arrayList3 = new ArrayList();
                    i.e(arrayList2, "$this$filterNotNullTo");
                    i.e(arrayList3, "destination");
                    Iterator it6 = arrayList2.iterator();
                    while (it6.hasNext()) {
                        Object next5 = it6.next();
                        if (next5 != null) {
                            arrayList3.add(next5);
                        }
                    }
                    ArrayList arrayList4 = new ArrayList(b.q.a.a.C(arrayList3, 10));
                    Iterator it7 = arrayList3.iterator();
                    while (it7.hasNext()) {
                        arrayList4.add(((a.C0113a) it7.next()).a);
                    }
                    Object[] array2 = arrayList4.toArray(new String[0]);
                    Objects.requireNonNull(array2, "null cannot be cast to non-null type kotlin.Array<T>");
                    String[] strArr = (String[]) array2;
                    q.a a = q.a.a((String[]) Arrays.copyOf(strArr, strArr.length));
                    i.d(a, "options");
                    return new a(hVar2, arrayList2, arrayList3, a).c();
                } else {
                    throw new IllegalArgumentException(b.e.a.a.a.e(B, b.e.a.a.a.y("Cannot reflectively serialize sealed class "), ". Please register an adapter.").toString());
                }
            } else {
                throw new IllegalArgumentException(b.e.a.a.a.d(B, b.e.a.a.a.y("Cannot serialize inner class ")).toString());
            }
        } else {
            throw new IllegalArgumentException(b.e.a.a.a.d(B, b.e.a.a.a.y("Cannot serialize local class or object expression ")).toString());
        }
    }
}
