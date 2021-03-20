package e.a.a.a.y0.d.a.b0;

import e.a.a.a.y0.b.k;
import e.a.a.a.y0.b.r0;
import e.a.a.a.y0.d.a.b0.n.t;
import e.a.a.a.y0.d.a.d0.w;
import e.a.a.a.y0.d.a.d0.x;
import e.a.a.a.y0.l.h;
import e.x.b.l;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public final class i implements m {
    public final Map<w, Integer> a;

    /* renamed from: b  reason: collision with root package name */
    public final h<w, t> f8368b;
    public final h c;
    public final k d;

    /* renamed from: e  reason: collision with root package name */
    public final int f8369e;

    public static final class a extends e.x.c.k implements l<w, t> {

        /* renamed from: h  reason: collision with root package name */
        public final /* synthetic */ i f8370h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(i iVar) {
            super(1);
            this.f8370h = iVar;
        }

        public Object invoke(Object obj) {
            w wVar = (w) obj;
            e.x.c.i.e(wVar, "typeParameter");
            Integer num = this.f8370h.a.get(wVar);
            if (num == null) {
                return null;
            }
            int intValue = num.intValue();
            i iVar = this.f8370h;
            h hVar = iVar.c;
            e.x.c.i.e(hVar, "$this$child");
            e.x.c.i.e(iVar, "typeParameterResolver");
            h hVar2 = new h(hVar.c, iVar, hVar.f8367e);
            i iVar2 = this.f8370h;
            return new t(hVar2, wVar, iVar2.f8369e + intValue, iVar2.d);
        }
    }

    public i(h hVar, k kVar, x xVar, int i2) {
        e.x.c.i.e(hVar, "c");
        e.x.c.i.e(kVar, "containingDeclaration");
        e.x.c.i.e(xVar, "typeParameterOwner");
        this.c = hVar;
        this.d = kVar;
        this.f8369e = i2;
        List<w> B = xVar.B();
        e.x.c.i.e(B, "$this$mapToIndex");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<T> it = B.iterator();
        int i3 = 0;
        while (it.hasNext()) {
            linkedHashMap.put(it.next(), Integer.valueOf(i3));
            i3++;
        }
        this.a = linkedHashMap;
        this.f8368b = this.c.c.a.i(new a(this));
    }

    public r0 a(w wVar) {
        e.x.c.i.e(wVar, "javaTypeParameter");
        t invoke = this.f8368b.invoke(wVar);
        return invoke != null ? invoke : this.c.d.a(wVar);
    }
}
