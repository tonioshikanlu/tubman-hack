package b.l.a.c.f.i;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

public final class b6 extends h4<String> implements RandomAccess, c6 {

    /* renamed from: j  reason: collision with root package name */
    public static final b6 f3496j;

    /* renamed from: i  reason: collision with root package name */
    public final List<Object> f3497i;

    static {
        b6 b6Var = new b6(10);
        f3496j = b6Var;
        b6Var.f3587h = false;
    }

    public b6() {
        this(10);
    }

    public b6(int i2) {
        this.f3497i = new ArrayList(i2);
    }

    public b6(ArrayList<Object> arrayList) {
        this.f3497i = arrayList;
    }

    public static String l(Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof t4) {
            t4 t4Var = (t4) obj;
            return t4Var.l() == 0 ? "" : t4Var.y(w5.a);
        }
        Charset charset = w5.a;
        return new String((byte[]) obj, w5.a);
    }

    public final /* bridge */ /* synthetic */ void add(int i2, Object obj) {
        d();
        this.f3497i.add(i2, (String) obj);
        this.modCount++;
    }

    public final boolean addAll(int i2, Collection<? extends String> collection) {
        d();
        if (collection instanceof c6) {
            collection = ((c6) collection).g();
        }
        boolean addAll = this.f3497i.addAll(i2, collection);
        this.modCount++;
        return addAll;
    }

    public final boolean addAll(Collection<? extends String> collection) {
        return addAll(size(), collection);
    }

    public final void clear() {
        d();
        this.f3497i.clear();
        this.modCount++;
    }

    /* renamed from: e */
    public final String get(int i2) {
        Object obj = this.f3497i.get(i2);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof t4) {
            t4 t4Var = (t4) obj;
            String y = t4Var.l() == 0 ? "" : t4Var.y(w5.a);
            if (t4Var.D()) {
                this.f3497i.set(i2, y);
            }
            return y;
        }
        byte[] bArr = (byte[]) obj;
        Charset charset = w5.a;
        String str = new String(bArr, w5.a);
        boolean z = false;
        if (d8.a.a(0, bArr, 0, bArr.length) == 0) {
            z = true;
        }
        if (z) {
            this.f3497i.set(i2, str);
        }
        return str;
    }

    public final c6 f() {
        return this.f3587h ? new s7(this) : this;
    }

    public final List<?> g() {
        return Collections.unmodifiableList(this.f3497i);
    }

    public final /* bridge */ /* synthetic */ v5 h(int i2) {
        if (i2 >= size()) {
            ArrayList arrayList = new ArrayList(i2);
            arrayList.addAll(this.f3497i);
            return new b6((ArrayList<Object>) arrayList);
        }
        throw new IllegalArgumentException();
    }

    public final Object j(int i2) {
        return this.f3497i.get(i2);
    }

    public final /* bridge */ /* synthetic */ Object remove(int i2) {
        d();
        Object remove = this.f3497i.remove(i2);
        this.modCount++;
        return l(remove);
    }

    public final /* bridge */ /* synthetic */ Object set(int i2, Object obj) {
        d();
        return l(this.f3497i.set(i2, (String) obj));
    }

    public final int size() {
        return this.f3497i.size();
    }

    public final void w(t4 t4Var) {
        d();
        this.f3497i.add(t4Var);
        this.modCount++;
    }
}
