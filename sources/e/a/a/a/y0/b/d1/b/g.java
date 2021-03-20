package e.a.a.a.y0.b.d1.b;

import e.a.a.a.y0.d.a.d0.e;
import e.a.a.a.y0.f.d;
import e.x.c.i;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.List;

public final class g extends d implements e {

    /* renamed from: b  reason: collision with root package name */
    public final Object[] f8294b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public g(d dVar, Object[] objArr) {
        super(dVar);
        i.e(objArr, "values");
        this.f8294b = objArr;
    }

    public List<d> c() {
        Object[] objArr = this.f8294b;
        ArrayList arrayList = new ArrayList(objArr.length);
        for (Object obj : objArr) {
            i.c(obj);
            i.e(obj, "value");
            Class<?> cls = obj.getClass();
            List<e.a.e<? extends Object>> list = b.a;
            i.e(cls, "$this$isEnumClassOrSpecializedEnumEntryClass");
            arrayList.add(Enum.class.isAssignableFrom(cls) ? new v((d) null, (Enum) obj) : obj instanceof Annotation ? new e((d) null, (Annotation) obj) : obj instanceof Object[] ? new g((d) null, (Object[]) obj) : obj instanceof Class ? new r((d) null, (Class) obj) : new x((d) null, obj));
        }
        return arrayList;
    }
}
