package e.a.a.a.y0.h;

import java.io.UnsupportedEncodingException;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

public class m extends AbstractList<String> implements RandomAccess, n {

    /* renamed from: i  reason: collision with root package name */
    public static final n f9252i = new w(new m());

    /* renamed from: h  reason: collision with root package name */
    public final List<Object> f9253h;

    public m() {
        this.f9253h = new ArrayList();
    }

    public m(n nVar) {
        this.f9253h = new ArrayList(nVar.size());
        addAll(size(), nVar);
    }

    public static String d(Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof c) {
            return ((c) obj).K();
        }
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = i.a;
        try {
            return new String(bArr, "UTF-8");
        } catch (UnsupportedEncodingException e2) {
            throw new RuntimeException("UTF-8 not supported?", e2);
        }
    }

    public n B() {
        return new w(this);
    }

    public List<?> M() {
        return Collections.unmodifiableList(this.f9253h);
    }

    public void P(c cVar) {
        this.f9253h.add(cVar);
        this.modCount++;
    }

    public void add(int i2, Object obj) {
        this.f9253h.add(i2, (String) obj);
        this.modCount++;
    }

    public boolean addAll(int i2, Collection<? extends String> collection) {
        if (collection instanceof n) {
            collection = ((n) collection).M();
        }
        boolean addAll = this.f9253h.addAll(i2, collection);
        this.modCount++;
        return addAll;
    }

    public boolean addAll(Collection<? extends String> collection) {
        return addAll(size(), collection);
    }

    public void clear() {
        this.f9253h.clear();
        this.modCount++;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0035, code lost:
        if (b.q.a.a.b2(r0, 0, r0.length) != false) goto L_0x001d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001b, code lost:
        if (r0.y() != false) goto L_0x001d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object get(int r5) {
        /*
            r4 = this;
            java.util.List<java.lang.Object> r0 = r4.f9253h
            java.lang.Object r0 = r0.get(r5)
            boolean r1 = r0 instanceof java.lang.String
            if (r1 == 0) goto L_0x000d
            java.lang.String r0 = (java.lang.String) r0
            goto L_0x0038
        L_0x000d:
            boolean r1 = r0 instanceof e.a.a.a.y0.h.c
            if (r1 == 0) goto L_0x0024
            e.a.a.a.y0.h.c r0 = (e.a.a.a.y0.h.c) r0
            java.lang.String r1 = r0.K()
            boolean r0 = r0.y()
            if (r0 == 0) goto L_0x0022
        L_0x001d:
            java.util.List<java.lang.Object> r0 = r4.f9253h
            r0.set(r5, r1)
        L_0x0022:
            r0 = r1
            goto L_0x0038
        L_0x0024:
            byte[] r0 = (byte[]) r0
            byte[] r1 = e.a.a.a.y0.h.i.a
            java.lang.String r1 = new java.lang.String     // Catch:{ UnsupportedEncodingException -> 0x0039 }
            java.lang.String r2 = "UTF-8"
            r1.<init>(r0, r2)     // Catch:{ UnsupportedEncodingException -> 0x0039 }
            int r2 = r0.length
            r3 = 0
            boolean r0 = b.q.a.a.b2(r0, r3, r2)
            if (r0 == 0) goto L_0x0022
            goto L_0x001d
        L_0x0038:
            return r0
        L_0x0039:
            r5 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "UTF-8 not supported?"
            r0.<init>(r1, r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: e.a.a.a.y0.h.m.get(int):java.lang.Object");
    }

    public Object remove(int i2) {
        Object remove = this.f9253h.remove(i2);
        this.modCount++;
        return d(remove);
    }

    public Object set(int i2, Object obj) {
        return d(this.f9253h.set(i2, (String) obj));
    }

    public int size() {
        return this.f9253h.size();
    }

    public c u(int i2) {
        c cVar;
        Object obj = this.f9253h.get(i2);
        if (obj instanceof c) {
            cVar = (c) obj;
        } else if (obj instanceof String) {
            cVar = c.l((String) obj);
        } else {
            byte[] bArr = (byte[]) obj;
            c cVar2 = c.f9218h;
            int length = bArr.length;
            byte[] bArr2 = new byte[length];
            System.arraycopy(bArr, 0, bArr2, 0, length);
            cVar = new o(bArr2);
        }
        if (cVar != obj) {
            this.f9253h.set(i2, cVar);
        }
        return cVar;
    }
}
