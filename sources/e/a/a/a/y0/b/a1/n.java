package e.a.a.a.y0.b.a1;

import b.q.a.a;
import e.j;
import e.t.g;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public enum n {
    CLASS("class", false, 2),
    ANNOTATION_CLASS("annotation class", false, 2),
    TYPE_PARAMETER("type parameter", false),
    PROPERTY("property", false, 2),
    FIELD("field", false, 2),
    LOCAL_VARIABLE("local variable", false, 2),
    VALUE_PARAMETER("value parameter", false, 2),
    CONSTRUCTOR("constructor", false, 2),
    FUNCTION("function", false, 2),
    PROPERTY_GETTER("getter", false, 2),
    PROPERTY_SETTER("setter", false, 2),
    TYPE("type usage", false),
    FILE("file", false);
    
    public static final HashMap<String, n> w = null;
    public static final Map<e, n> x = null;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f7809h;

    /* access modifiers changed from: public */
    static {
        w = new HashMap<>();
        n[] values = values();
        for (int i2 = 0; i2 < 41; i2++) {
            n nVar = values[i2];
            w.put(nVar.name(), nVar);
        }
        n[] values2 = values();
        ArrayList arrayList = new ArrayList();
        for (int i3 = 0; i3 < 41; i3++) {
            n nVar2 = values2[i3];
            if (nVar2.f7809h) {
                arrayList.add(nVar2);
            }
        }
        g.d0(arrayList);
        a.i3(values());
        e eVar = e.CONSTRUCTOR_PARAMETER;
        n nVar3 = VALUE_PARAMETER;
        e eVar2 = e.FIELD;
        n nVar4 = FIELD;
        x = g.E(new j(eVar, nVar3), new j(eVar2, nVar4), new j(e.PROPERTY, PROPERTY), new j(e.FILE, FILE), new j(e.PROPERTY_GETTER, PROPERTY_GETTER), new j(e.PROPERTY_SETTER, PROPERTY_SETTER), new j(e.RECEIVER, nVar3), new j(e.SETTER_PARAMETER, nVar3), new j(e.PROPERTY_DELEGATE_FIELD, nVar4));
    }

    /* access modifiers changed from: public */
    n(String str, boolean z) {
        this.f7809h = z;
    }

    /* access modifiers changed from: public */
    n(String str, boolean z, int i2) {
        this.f7809h = (i2 & 2) != 0 ? true : z;
    }
}
