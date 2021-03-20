package e.a.a.a.y0.o;

import e.x.b.a;
import e.x.c.k;
import java.util.ArrayList;
import java.util.Map;
import java.util.Objects;

public final class h extends k implements a<String[]> {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ i f9815h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public h(i iVar) {
        super(0);
        this.f9815h = iVar;
    }

    public Object e() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.f9815h.f9816b.f9823h);
        k kVar = this.f9815h.c;
        if (kVar != null) {
            StringBuilder y = b.e.a.a.a.y("under-migration:");
            y.append(kVar.f9823h);
            arrayList.add(y.toString());
        }
        for (Map.Entry next : this.f9815h.d.entrySet()) {
            StringBuilder v = b.e.a.a.a.v('@');
            v.append((String) next.getKey());
            v.append(':');
            v.append(((k) next.getValue()).f9823h);
            arrayList.add(v.toString());
        }
        Object[] array = arrayList.toArray(new String[0]);
        Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
        return (String[]) array;
    }
}
