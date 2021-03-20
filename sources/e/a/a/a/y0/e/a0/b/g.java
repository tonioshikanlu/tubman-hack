package e.a.a.a.y0.e.a0.b;

import e.a.a.a.y0.e.a0.a;
import e.a.a.a.y0.e.z.c;
import e.c0.h;
import e.t.q;
import e.t.r;
import e.t.s;
import e.t.t;
import e.x.b.l;
import e.x.c.i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;

public final class g implements c {

    /* renamed from: e  reason: collision with root package name */
    public static final String f8768e;
    public static final List<String> f;
    public final Set<Integer> a;

    /* renamed from: b  reason: collision with root package name */
    public final List<a.e.c> f8769b;
    public final a.e c;
    public final String[] d;

    static {
        String x = e.t.g.x(e.t.g.B('k', 'o', 't', 'l', 'i', 'n'), "", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (l) null, 62);
        f8768e = x;
        int i2 = 16;
        List<String> B = e.t.g.B(b.e.a.a.a.m(x, "/Any"), b.e.a.a.a.m(x, "/Nothing"), b.e.a.a.a.m(x, "/Unit"), b.e.a.a.a.m(x, "/Throwable"), b.e.a.a.a.m(x, "/Number"), b.e.a.a.a.m(x, "/Byte"), b.e.a.a.a.m(x, "/Double"), b.e.a.a.a.m(x, "/Float"), b.e.a.a.a.m(x, "/Int"), b.e.a.a.a.m(x, "/Long"), b.e.a.a.a.m(x, "/Short"), b.e.a.a.a.m(x, "/Boolean"), b.e.a.a.a.m(x, "/Char"), b.e.a.a.a.m(x, "/CharSequence"), b.e.a.a.a.m(x, "/String"), b.e.a.a.a.m(x, "/Comparable"), b.e.a.a.a.m(x, "/Enum"), b.e.a.a.a.m(x, "/Array"), b.e.a.a.a.m(x, "/ByteArray"), b.e.a.a.a.m(x, "/DoubleArray"), b.e.a.a.a.m(x, "/FloatArray"), b.e.a.a.a.m(x, "/IntArray"), b.e.a.a.a.m(x, "/LongArray"), b.e.a.a.a.m(x, "/ShortArray"), b.e.a.a.a.m(x, "/BooleanArray"), b.e.a.a.a.m(x, "/CharArray"), b.e.a.a.a.m(x, "/Cloneable"), b.e.a.a.a.m(x, "/Annotation"), b.e.a.a.a.m(x, "/collections/Iterable"), b.e.a.a.a.m(x, "/collections/MutableIterable"), b.e.a.a.a.m(x, "/collections/Collection"), b.e.a.a.a.m(x, "/collections/MutableCollection"), b.e.a.a.a.m(x, "/collections/List"), b.e.a.a.a.m(x, "/collections/MutableList"), b.e.a.a.a.m(x, "/collections/Set"), b.e.a.a.a.m(x, "/collections/MutableSet"), b.e.a.a.a.m(x, "/collections/Map"), b.e.a.a.a.m(x, "/collections/MutableMap"), b.e.a.a.a.m(x, "/collections/Map.Entry"), b.e.a.a.a.m(x, "/collections/MutableMap.MutableEntry"), b.e.a.a.a.m(x, "/collections/Iterator"), b.e.a.a.a.m(x, "/collections/MutableIterator"), b.e.a.a.a.m(x, "/collections/ListIterator"), b.e.a.a.a.m(x, "/collections/MutableListIterator"));
        f = B;
        Iterable<r<T>> e0 = e.t.g.e0(B);
        int q2 = b.q.a.a.q2(b.q.a.a.C(e0, 10));
        if (q2 >= 16) {
            i2 = q2;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(i2);
        Iterator it = ((s) e0).iterator();
        while (true) {
            t tVar = (t) it;
            if (tVar.hasNext()) {
                r rVar = (r) tVar.next();
                linkedHashMap.put((String) rVar.f7937b, Integer.valueOf(rVar.a));
            } else {
                return;
            }
        }
    }

    public g(a.e eVar, String[] strArr) {
        i.e(eVar, "types");
        i.e(strArr, "strings");
        this.c = eVar;
        this.d = strArr;
        List<Integer> list = eVar.f8733j;
        this.a = list.isEmpty() ? q.f7936h : e.t.g.d0(list);
        ArrayList arrayList = new ArrayList();
        List<a.e.c> list2 = eVar.f8732i;
        arrayList.ensureCapacity(list2.size());
        for (a.e.c next : list2) {
            i.d(next, "record");
            int i2 = next.f8742j;
            for (int i3 = 0; i3 < i2; i3++) {
                arrayList.add(next);
            }
        }
        arrayList.trimToSize();
        this.f8769b = arrayList;
    }

    public String a(int i2) {
        String str;
        a.e.c cVar = this.f8769b.get(i2);
        int i3 = cVar.f8741i;
        if ((i3 & 4) == 4) {
            Object obj = cVar.f8744l;
            if (obj instanceof String) {
                str = (String) obj;
            } else {
                e.a.a.a.y0.h.c cVar2 = (e.a.a.a.y0.h.c) obj;
                String K = cVar2.K();
                if (cVar2.y()) {
                    cVar.f8744l = K;
                }
                str = K;
            }
        } else {
            if ((i3 & 2) == 2) {
                List<String> list = f;
                int size = list.size();
                int i4 = cVar.f8743k;
                if (i4 >= 0 && size > i4) {
                    str = list.get(i4);
                }
            }
            str = this.d[i2];
        }
        if (cVar.f8746n.size() >= 2) {
            List<Integer> list2 = cVar.f8746n;
            Integer num = list2.get(0);
            Integer num2 = list2.get(1);
            i.d(num, "begin");
            if (num.intValue() >= 0) {
                int intValue = num.intValue();
                i.d(num2, "end");
                if (intValue <= num2.intValue() && num2.intValue() <= str.length()) {
                    i.d(str, "string");
                    str = str.substring(num.intValue(), num2.intValue());
                    i.d(str, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                }
            }
        }
        if (cVar.f8748p.size() >= 2) {
            List<Integer> list3 = cVar.f8748p;
            i.d(str, "string");
            str = h.v(str, (char) list3.get(0).intValue(), (char) list3.get(1).intValue(), false, 4);
        }
        a.e.c.C0194c cVar3 = cVar.f8745m;
        if (cVar3 == null) {
            cVar3 = a.e.c.C0194c.NONE;
        }
        int ordinal = cVar3.ordinal();
        if (ordinal != 1) {
            if (ordinal == 2) {
                if (str.length() >= 2) {
                    i.d(str, "string");
                    str = str.substring(1, str.length() - 1);
                    i.d(str, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                }
            }
            i.d(str, "string");
            return str;
        }
        i.d(str, "string");
        str = h.v(str, '$', '.', false, 4);
        i.d(str, "string");
        return str;
    }

    public boolean b(int i2) {
        return this.a.contains(Integer.valueOf(i2));
    }

    public String c(int i2) {
        return a(i2);
    }
}
