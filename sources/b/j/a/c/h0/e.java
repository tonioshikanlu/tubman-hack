package b.j.a.c.h0;

import b.j.a.c.c;
import b.j.a.c.e0.h;
import b.j.a.c.h0.s.j;
import b.j.a.c.n;
import b.j.a.c.p;
import b.j.a.c.w;
import java.util.Collections;
import java.util.List;

public class e {

    /* renamed from: i  reason: collision with root package name */
    public static final c[] f2044i = new c[0];
    public final c a;

    /* renamed from: b  reason: collision with root package name */
    public w f2045b;
    public List<c> c = Collections.emptyList();
    public c[] d;

    /* renamed from: e  reason: collision with root package name */
    public a f2046e;
    public Object f;

    /* renamed from: g  reason: collision with root package name */
    public h f2047g;

    /* renamed from: h  reason: collision with root package name */
    public j f2048h;

    public e(c cVar) {
        this.a = cVar;
    }

    public n<?> a() {
        c[] cVarArr;
        List<c> list = this.c;
        if (list != null && !list.isEmpty()) {
            List<c> list2 = this.c;
            cVarArr = (c[]) list2.toArray(new c[list2.size()]);
            if (this.f2045b.o(p.CAN_OVERRIDE_ACCESS_MODIFIERS)) {
                for (c cVar : cVarArr) {
                    cVar.f2043q.g(this.f2045b.o(p.OVERRIDE_PUBLIC_ACCESS_MODIFIERS));
                }
            }
        } else if (this.f2046e == null && this.f2048h == null) {
            return null;
        } else {
            cVarArr = f2044i;
        }
        c[] cVarArr2 = this.d;
        if (cVarArr2 == null || cVarArr2.length == this.c.size()) {
            a aVar = this.f2046e;
            if (aVar != null) {
                aVar.f2033b.g(this.f2045b.o(p.OVERRIDE_PUBLIC_ACCESS_MODIFIERS));
            }
            if (this.f2047g != null && this.f2045b.o(p.CAN_OVERRIDE_ACCESS_MODIFIERS)) {
                this.f2047g.g(this.f2045b.o(p.OVERRIDE_PUBLIC_ACCESS_MODIFIERS));
            }
            return new d(this.a.a, this, cVarArr, this.d);
        }
        throw new IllegalStateException(String.format("Mismatch between `properties` size (%d), `filteredProperties` (%s): should have as many (or `null` for latter)", new Object[]{Integer.valueOf(this.c.size()), Integer.valueOf(this.d.length)}));
    }
}
