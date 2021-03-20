package b.l.a.c.f.e;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

public final class o extends hm<String> implements RandomAccess, p {

    /* renamed from: j  reason: collision with root package name */
    public static final o f3199j;

    /* renamed from: i  reason: collision with root package name */
    public final List<Object> f3200i;

    static {
        o oVar = new o(10);
        f3199j = oVar;
        oVar.f3050h = false;
    }

    public o() {
        this(10);
    }

    public o(int i2) {
        this.f3200i = new ArrayList(i2);
    }

    public o(ArrayList<Object> arrayList) {
        this.f3200i = arrayList;
    }

    public static String l(Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof um) {
            um umVar = (um) obj;
            return umVar.l() == 0 ? "" : umVar.D(j.a);
        }
        Charset charset = j.a;
        return new String((byte[]) obj, j.a);
    }

    public final /* bridge */ /* synthetic */ void add(int i2, Object obj) {
        d();
        this.f3200i.add(i2, (String) obj);
        this.modCount++;
    }

    public final boolean addAll(int i2, Collection<? extends String> collection) {
        d();
        if (collection instanceof p) {
            collection = ((p) collection).g();
        }
        boolean addAll = this.f3200i.addAll(i2, collection);
        this.modCount++;
        return addAll;
    }

    public final boolean addAll(Collection<? extends String> collection) {
        return addAll(size(), collection);
    }

    public final void clear() {
        d();
        this.f3200i.clear();
        this.modCount++;
    }

    /* renamed from: e */
    public final String get(int i2) {
        Object obj = this.f3200i.get(i2);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof um) {
            um umVar = (um) obj;
            String D = umVar.l() == 0 ? "" : umVar.D(j.a);
            if (umVar.G()) {
                this.f3200i.set(i2, D);
            }
            return D;
        }
        byte[] bArr = (byte[]) obj;
        Charset charset = j.a;
        String str = new String(bArr, j.a);
        boolean z = false;
        if (s1.a.a(0, bArr, 0, bArr.length) == 0) {
            z = true;
        }
        if (z) {
            this.f3200i.set(i2, str);
        }
        return str;
    }

    public final p f() {
        return this.f3050h ? new h1(this) : this;
    }

    public final List<?> g() {
        return Collections.unmodifiableList(this.f3200i);
    }

    public final /* bridge */ /* synthetic */ i h(int i2) {
        if (i2 >= size()) {
            ArrayList arrayList = new ArrayList(i2);
            arrayList.addAll(this.f3200i);
            return new o((ArrayList<Object>) arrayList);
        }
        throw new IllegalArgumentException();
    }

    public final Object j(int i2) {
        return this.f3200i.get(i2);
    }

    public final void q(um umVar) {
        d();
        this.f3200i.add(umVar);
        this.modCount++;
    }

    public final /* bridge */ /* synthetic */ Object remove(int i2) {
        d();
        Object remove = this.f3200i.remove(i2);
        this.modCount++;
        return l(remove);
    }

    public final /* bridge */ /* synthetic */ Object set(int i2, Object obj) {
        d();
        return l(this.f3200i.set(i2, (String) obj));
    }

    public final int size() {
        return this.f3200i.size();
    }
}
