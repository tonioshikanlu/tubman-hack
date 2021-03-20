package e.t;

import b.q.a.a;
import e.a.a.a.y0.m.o1.c;
import e.a0.d;
import e.b0.h;
import e.j;
import e.x.b.l;
import e.x.c.i;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import java.util.Set;

public class g extends e {
    public static final <T> T A(List<? extends T> list) {
        i.e(list, "$this$lastOrNull");
        if (list.isEmpty()) {
            return null;
        }
        return list.get(list.size() - 1);
    }

    public static final <T> List<T> B(T... tArr) {
        i.e(tArr, "elements");
        return tArr.length > 0 ? c(tArr) : o.f7934h;
    }

    public static final <T> List<T> C(T t) {
        return t != null ? a.l2(t) : o.f7934h;
    }

    public static final <T> List<T> D(T... tArr) {
        i.e(tArr, "elements");
        i.e(tArr, "$this$filterNotNull");
        ArrayList arrayList = new ArrayList();
        i.e(tArr, "$this$filterNotNullTo");
        i.e(arrayList, "destination");
        for (T t : tArr) {
            if (t != null) {
                arrayList.add(t);
            }
        }
        return arrayList;
    }

    public static final <K, V> Map<K, V> E(j<? extends K, ? extends V>... jVarArr) {
        i.e(jVarArr, "pairs");
        if (jVarArr.length <= 0) {
            return p.f7935h;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(a.q2(jVarArr.length));
        i.e(jVarArr, "$this$toMap");
        i.e(linkedHashMap, "destination");
        i.e(linkedHashMap, "$this$putAll");
        i.e(jVarArr, "pairs");
        for (j<? extends K, ? extends V> jVar : jVarArr) {
            linkedHashMap.put(jVar.f7906h, jVar.f7907i);
        }
        return linkedHashMap;
    }

    public static final <T> List<T> F(T... tArr) {
        i.e(tArr, "elements");
        return tArr.length == 0 ? new ArrayList() : new ArrayList(new d(tArr, true));
    }

    public static final <T> List<T> G(List<? extends T> list) {
        i.e(list, "$this$optimizeReadOnlyList");
        int size = list.size();
        return size != 0 ? size != 1 ? list : a.l2(list.get(0)) : o.f7934h;
    }

    public static final <T> List<T> H(Iterable<? extends T> iterable, T t) {
        i.e(iterable, "$this$plus");
        if (iterable instanceof Collection) {
            return J((Collection) iterable, t);
        }
        ArrayList arrayList = new ArrayList();
        b(arrayList, iterable);
        arrayList.add(t);
        return arrayList;
    }

    public static final <T> List<T> I(Collection<? extends T> collection, Iterable<? extends T> iterable) {
        i.e(collection, "$this$plus");
        i.e(iterable, "elements");
        if (iterable instanceof Collection) {
            Collection collection2 = (Collection) iterable;
            ArrayList arrayList = new ArrayList(collection2.size() + collection.size());
            arrayList.addAll(collection);
            arrayList.addAll(collection2);
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList(collection);
        b(arrayList2, iterable);
        return arrayList2;
    }

    public static final <T> List<T> J(Collection<? extends T> collection, T t) {
        i.e(collection, "$this$plus");
        ArrayList arrayList = new ArrayList(collection.size() + 1);
        arrayList.addAll(collection);
        arrayList.add(t);
        return arrayList;
    }

    public static final <T> Set<T> K(Set<? extends T> set, Iterable<? extends T> iterable) {
        i.e(set, "$this$plus");
        i.e(iterable, "elements");
        i.e(iterable, "$this$collectionSizeOrNull");
        Integer valueOf = iterable instanceof Collection ? Integer.valueOf(((Collection) iterable).size()) : null;
        LinkedHashSet linkedHashSet = new LinkedHashSet(a.q2(valueOf != null ? set.size() + valueOf.intValue() : set.size() * 2));
        linkedHashSet.addAll(set);
        b(linkedHashSet, iterable);
        return linkedHashSet;
    }

    public static final <T> Set<T> L(Set<? extends T> set, T t) {
        i.e(set, "$this$plus");
        LinkedHashSet linkedHashSet = new LinkedHashSet(a.q2(set.size() + 1));
        linkedHashSet.addAll(set);
        linkedHashSet.add(t);
        return linkedHashSet;
    }

    public static final <T> Set<T> M(T... tArr) {
        i.e(tArr, "elements");
        return tArr.length > 0 ? a.i3(tArr) : q.f7936h;
    }

    public static final <T> T N(Iterable<? extends T> iterable) {
        i.e(iterable, "$this$single");
        if (iterable instanceof List) {
            return O((List) iterable);
        }
        Iterator<? extends T> it = iterable.iterator();
        if (it.hasNext()) {
            T next = it.next();
            if (!it.hasNext()) {
                return next;
            }
            throw new IllegalArgumentException("Collection has more than one element.");
        }
        throw new NoSuchElementException("Collection is empty.");
    }

    public static final <T> T O(List<? extends T> list) {
        i.e(list, "$this$single");
        int size = list.size();
        if (size == 0) {
            throw new NoSuchElementException("List is empty.");
        } else if (size == 1) {
            return list.get(0);
        } else {
            throw new IllegalArgumentException("List has more than one element.");
        }
    }

    public static final <T> T P(Iterable<? extends T> iterable) {
        i.e(iterable, "$this$singleOrNull");
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.size() == 1) {
                return list.get(0);
            }
            return null;
        }
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        T next = it.next();
        if (it.hasNext()) {
            return null;
        }
        return next;
    }

    public static final <T> T Q(List<? extends T> list) {
        i.e(list, "$this$singleOrNull");
        if (list.size() == 1) {
            return list.get(0);
        }
        return null;
    }

    public static final <T> List<T> R(Iterable<? extends T> iterable, int i2) {
        i.e(iterable, "$this$take");
        int i3 = 0;
        if (!(i2 >= 0)) {
            throw new IllegalArgumentException(b.e.a.a.a.h("Requested element count ", i2, " is less than zero.").toString());
        } else if (i2 == 0) {
            return o.f7934h;
        } else {
            if (i2 >= ((Collection) iterable).size()) {
                return W(iterable);
            }
            if (i2 == 1) {
                return a.l2(n(iterable));
            }
            ArrayList arrayList = new ArrayList(i2);
            for (Object add : iterable) {
                arrayList.add(add);
                i3++;
                if (i3 == i2) {
                    break;
                }
            }
            return G(arrayList);
        }
    }

    public static final void S() {
        throw new ArithmeticException("Index overflow has happened.");
    }

    public static final <T, C extends Collection<? super T>> C T(Iterable<? extends T> iterable, C c) {
        i.e(iterable, "$this$toCollection");
        i.e(c, "destination");
        for (Object add : iterable) {
            c.add(add);
        }
        return c;
    }

    public static final <T> HashSet<T> U(Iterable<? extends T> iterable) {
        i.e(iterable, "$this$toHashSet");
        HashSet<T> hashSet = new HashSet<>(a.q2(a.C(iterable, 12)));
        T(iterable, hashSet);
        return hashSet;
    }

    public static final int[] V(Collection<Integer> collection) {
        i.e(collection, "$this$toIntArray");
        int[] iArr = new int[collection.size()];
        int i2 = 0;
        for (Integer intValue : collection) {
            iArr[i2] = intValue.intValue();
            i2++;
        }
        return iArr;
    }

    public static final <T> List<T> W(Iterable<? extends T> iterable) {
        i.e(iterable, "$this$toList");
        if (!(iterable instanceof Collection)) {
            return G(Z(iterable));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return o.f7934h;
        }
        if (size != 1) {
            return a0(collection);
        }
        return a.l2(iterable instanceof List ? ((List) iterable).get(0) : iterable.iterator().next());
    }

    public static final <K, V> Map<K, V> X(Iterable<? extends j<? extends K, ? extends V>> iterable) {
        p pVar = p.f7935h;
        i.e(iterable, "$this$toMap");
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return pVar;
        }
        if (size == 1) {
            return a.r2((j) ((List) iterable).get(0));
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(a.q2(collection.size()));
        Y(iterable, linkedHashMap);
        return linkedHashMap;
    }

    public static final <K, V, M extends Map<? super K, ? super V>> M Y(Iterable<? extends j<? extends K, ? extends V>> iterable, M m2) {
        i.e(iterable, "$this$toMap");
        i.e(m2, "destination");
        i.e(m2, "$this$putAll");
        i.e(iterable, "pairs");
        for (j jVar : iterable) {
            m2.put(jVar.f7906h, jVar.f7907i);
        }
        return m2;
    }

    public static final <T> List<T> Z(Iterable<? extends T> iterable) {
        i.e(iterable, "$this$toMutableList");
        if (iterable instanceof Collection) {
            return a0((Collection) iterable);
        }
        ArrayList arrayList = new ArrayList();
        T(iterable, arrayList);
        return arrayList;
    }

    public static final int a(List list, int i2) {
        int s = s(list);
        if (i2 >= 0 && s >= i2) {
            return s(list) - i2;
        }
        StringBuilder z = b.e.a.a.a.z("Element index ", i2, " must be in range [");
        z.append(new d(0, s(list)));
        z.append("].");
        throw new IndexOutOfBoundsException(z.toString());
    }

    public static final <T> List<T> a0(Collection<? extends T> collection) {
        i.e(collection, "$this$toMutableList");
        return new ArrayList(collection);
    }

    public static final <T> boolean b(Collection<? super T> collection, Iterable<? extends T> iterable) {
        i.e(collection, "$this$addAll");
        i.e(iterable, "elements");
        if (iterable instanceof Collection) {
            return collection.addAll((Collection) iterable);
        }
        boolean z = false;
        for (Object add : iterable) {
            if (collection.add(add)) {
                z = true;
            }
        }
        return z;
    }

    public static final <K, V> Map<K, V> b0(Map<? extends K, ? extends V> map) {
        i.e(map, "$this$toMutableMap");
        return new LinkedHashMap(map);
    }

    public static final <T> List<T> c(T[] tArr) {
        i.e(tArr, "$this$asList");
        List<T> asList = Arrays.asList(tArr);
        i.d(asList, "ArraysUtilJVM.asList(this)");
        return asList;
    }

    public static final <T> Set<T> c0(Iterable<? extends T> iterable) {
        i.e(iterable, "$this$toMutableSet");
        if (iterable instanceof Collection) {
            return new LinkedHashSet((Collection) iterable);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        T(iterable, linkedHashSet);
        return linkedHashSet;
    }

    public static final <T> h<T> d(Iterable<? extends T> iterable) {
        i.e(iterable, "$this$asSequence");
        return new l(iterable);
    }

    public static final <T> Set<T> d0(Iterable<? extends T> iterable) {
        q qVar = q.f7936h;
        i.e(iterable, "$this$toSet");
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            int size = collection.size();
            if (size == 0) {
                return qVar;
            }
            if (size != 1) {
                LinkedHashSet linkedHashSet = new LinkedHashSet(a.q2(collection.size()));
                T(iterable, linkedHashSet);
                return linkedHashSet;
            }
            return a.S2(iterable instanceof List ? ((List) iterable).get(0) : iterable.iterator().next());
        }
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        T(iterable, linkedHashSet2);
        Set<T> set = linkedHashSet2;
        i.e(set, "$this$optimizeReadOnlySet");
        int size2 = set.size();
        if (size2 != 0) {
            return size2 != 1 ? set : a.S2(set.iterator().next());
        }
        return qVar;
    }

    public static final <T> boolean e(Iterable<? extends T> iterable, T t) {
        int i2;
        i.e(iterable, "$this$contains");
        if (iterable instanceof Collection) {
            return ((Collection) iterable).contains(t);
        }
        i.e(iterable, "$this$indexOf");
        if (!(iterable instanceof List)) {
            Iterator<? extends T> it = iterable.iterator();
            int i3 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i2 = -1;
                    break;
                }
                Object next = it.next();
                if (i3 < 0) {
                    S();
                    throw null;
                } else if (i.a(t, next)) {
                    i2 = i3;
                    break;
                } else {
                    i3++;
                }
            }
        } else {
            i2 = ((List) iterable).indexOf(t);
        }
        return i2 >= 0;
    }

    public static final <T> Iterable<r<T>> e0(Iterable<? extends T> iterable) {
        i.e(iterable, "$this$withIndex");
        return new s(new m(iterable));
    }

    public static final byte[] f(byte[] bArr, byte[] bArr2, int i2, int i3, int i4) {
        i.e(bArr, "$this$copyInto");
        i.e(bArr2, "destination");
        System.arraycopy(bArr, i3, bArr2, i2, i4 - i3);
        return bArr2;
    }

    public static final <T, R> List<j<T, R>> f0(Iterable<? extends T> iterable, Iterable<? extends R> iterable2) {
        i.e(iterable, "$this$zip");
        i.e(iterable2, "other");
        Iterator<? extends T> it = iterable.iterator();
        Iterator<? extends R> it2 = iterable2.iterator();
        ArrayList arrayList = new ArrayList(Math.min(a.C(iterable, 10), a.C(iterable2, 10)));
        while (it.hasNext() && it2.hasNext()) {
            arrayList.add(new j(it.next(), it2.next()));
        }
        return arrayList;
    }

    public static /* synthetic */ byte[] g(byte[] bArr, byte[] bArr2, int i2, int i3, int i4, int i5) {
        if ((i5 & 2) != 0) {
            i2 = 0;
        }
        if ((i5 & 4) != 0) {
            i3 = 0;
        }
        if ((i5 & 8) != 0) {
            i4 = bArr.length;
        }
        f(bArr, bArr2, i2, i3, i4);
        return bArr2;
    }

    public static Object[] h(Object[] objArr, Object[] objArr2, int i2, int i3, int i4, int i5) {
        if ((i5 & 2) != 0) {
            i2 = 0;
        }
        if ((i5 & 4) != 0) {
            i3 = 0;
        }
        if ((i5 & 8) != 0) {
            i4 = objArr.length;
        }
        i.e(objArr, "$this$copyInto");
        i.e(objArr2, "destination");
        System.arraycopy(objArr, i3, objArr2, i2, i4 - i3);
        return objArr2;
    }

    public static final <T> T[] i(T[] tArr, int i2, int i3) {
        i.e(tArr, "$this$copyOfRangeImpl");
        a.N(i3, tArr.length);
        T[] copyOfRange = Arrays.copyOfRange(tArr, i2, i3);
        i.d(copyOfRange, "java.util.Arrays.copyOfR…this, fromIndex, toIndex)");
        return copyOfRange;
    }

    public static final <T> List<T> j(Iterable<? extends T> iterable) {
        i.e(iterable, "$this$distinct");
        return W(c0(iterable));
    }

    public static final <T> List<T> k(Iterable<? extends T> iterable, int i2) {
        ArrayList arrayList;
        i.e(iterable, "$this$drop");
        int i3 = 0;
        if (!(i2 >= 0)) {
            throw new IllegalArgumentException(b.e.a.a.a.h("Requested element count ", i2, " is less than zero.").toString());
        } else if (i2 == 0) {
            return W(iterable);
        } else {
            if (iterable instanceof Collection) {
                Collection collection = (Collection) iterable;
                int size = collection.size() - i2;
                if (size <= 0) {
                    return o.f7934h;
                }
                if (size == 1) {
                    return a.l2(y(iterable));
                }
                arrayList = new ArrayList(size);
                if (iterable instanceof List) {
                    if (iterable instanceof RandomAccess) {
                        int size2 = collection.size();
                        while (i2 < size2) {
                            arrayList.add(((List) iterable).get(i2));
                            i2++;
                        }
                    } else {
                        ListIterator listIterator = ((List) iterable).listIterator(i2);
                        while (listIterator.hasNext()) {
                            arrayList.add(listIterator.next());
                        }
                    }
                    return arrayList;
                }
            } else {
                arrayList = new ArrayList();
            }
            for (Object next : iterable) {
                if (i3 >= i2) {
                    arrayList.add(next);
                } else {
                    i3++;
                }
            }
            return G(arrayList);
        }
    }

    public static final <T> List<T> l(List<? extends T> list, int i2) {
        i.e(list, "$this$dropLast");
        int i3 = 0;
        if (i2 >= 0) {
            int size = list.size() - i2;
            if (size >= 0) {
                i3 = size;
            }
            return R(list, i3);
        }
        throw new IllegalArgumentException(b.e.a.a.a.h("Requested element count ", i2, " is less than zero.").toString());
    }

    public static final <T> List<T> m(Iterable<? extends T> iterable, l<? super T, Boolean> lVar) {
        i.e(iterable, "$this$filter");
        i.e(lVar, "predicate");
        ArrayList arrayList = new ArrayList();
        for (Object next : iterable) {
            if (lVar.invoke(next).booleanValue()) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    public static final <T> T n(Iterable<? extends T> iterable) {
        i.e(iterable, "$this$first");
        if (iterable instanceof List) {
            return o((List) iterable);
        }
        Iterator<? extends T> it = iterable.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        throw new NoSuchElementException("Collection is empty.");
    }

    public static final <T> T o(List<? extends T> list) {
        i.e(list, "$this$first");
        if (!list.isEmpty()) {
            return list.get(0);
        }
        throw new NoSuchElementException("List is empty.");
    }

    public static final <T> T p(Iterable<? extends T> iterable) {
        i.e(iterable, "$this$firstOrNull");
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.isEmpty()) {
                return null;
            }
            return list.get(0);
        }
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        return it.next();
    }

    public static final <T> T q(List<? extends T> list) {
        i.e(list, "$this$firstOrNull");
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    public static final d r(Collection<?> collection) {
        i.e(collection, "$this$indices");
        return new d(0, collection.size() - 1);
    }

    public static final <T> int s(List<? extends T> list) {
        i.e(list, "$this$lastIndex");
        return list.size() - 1;
    }

    public static final <T> T t(List<? extends T> list, int i2) {
        i.e(list, "$this$getOrNull");
        if (i2 < 0 || i2 > s(list)) {
            return null;
        }
        return list.get(i2);
    }

    public static final <T, A extends Appendable> A u(Iterable<? extends T> iterable, A a, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i2, CharSequence charSequence4, l<? super T, ? extends CharSequence> lVar) {
        i.e(iterable, "$this$joinTo");
        i.e(a, "buffer");
        i.e(charSequence, "separator");
        i.e(charSequence2, "prefix");
        i.e(charSequence3, "postfix");
        i.e(charSequence4, "truncated");
        a.append(charSequence2);
        int i3 = 0;
        for (Object next : iterable) {
            i3++;
            if (i3 > 1) {
                a.append(charSequence);
            }
            if (i2 >= 0 && i3 > i2) {
                break;
            }
            c.f(a, next, lVar);
        }
        if (i2 >= 0 && i3 > i2) {
            a.append(charSequence4);
        }
        a.append(charSequence3);
        return a;
    }

    public static /* synthetic */ Appendable v(Iterable iterable, Appendable appendable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i2, CharSequence charSequence4, l lVar, int i3) {
        u(iterable, appendable, (i3 & 2) != 0 ? ", " : charSequence, (i3 & 4) != 0 ? "" : charSequence2, (i3 & 8) != 0 ? "" : charSequence3, (i3 & 16) != 0 ? -1 : i2, (i3 & 32) != 0 ? "..." : null, (i3 & 64) != 0 ? null : lVar);
        return appendable;
    }

    public static final <T> String w(Iterable<? extends T> iterable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i2, CharSequence charSequence4, l<? super T, ? extends CharSequence> lVar) {
        i.e(iterable, "$this$joinToString");
        i.e(charSequence, "separator");
        i.e(charSequence2, "prefix");
        i.e(charSequence3, "postfix");
        i.e(charSequence4, "truncated");
        StringBuilder sb = new StringBuilder();
        u(iterable, sb, charSequence, charSequence2, charSequence3, i2, charSequence4, lVar);
        String sb2 = sb.toString();
        i.d(sb2, "joinTo(StringBuilder(), …ed, transform).toString()");
        return sb2;
    }

    public static /* synthetic */ String x(Iterable iterable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i2, CharSequence charSequence4, l lVar, int i3) {
        if ((i3 & 1) != 0) {
            charSequence = ", ";
        }
        CharSequence charSequence5 = charSequence;
        String str = (i3 & 2) != 0 ? "" : charSequence2;
        String str2 = (i3 & 4) != 0 ? "" : charSequence3;
        if ((i3 & 8) != 0) {
            i2 = -1;
        }
        return w(iterable, charSequence5, str, str2, i2, (i3 & 16) != 0 ? "..." : null, (i3 & 32) != 0 ? null : lVar);
    }

    public static final <T> T y(Iterable<? extends T> iterable) {
        T next;
        i.e(iterable, "$this$last");
        if (iterable instanceof List) {
            return z((List) iterable);
        }
        Iterator<? extends T> it = iterable.iterator();
        if (it.hasNext()) {
            do {
                next = it.next();
            } while (it.hasNext());
            return next;
        }
        throw new NoSuchElementException("Collection is empty.");
    }

    public static final <T> T z(List<? extends T> list) {
        i.e(list, "$this$last");
        if (!list.isEmpty()) {
            return list.get(s(list));
        }
        throw new NoSuchElementException("List is empty.");
    }
}
