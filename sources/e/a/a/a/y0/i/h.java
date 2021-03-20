package e.a.a.a.y0.i;

import b.q.a.a;
import e.t.g;
import java.util.ArrayList;
import java.util.Set;

public enum h {
    VISIBILITY(true),
    MODALITY(true),
    OVERRIDE(true),
    ANNOTATIONS(false),
    INNER(true),
    MEMBER_KIND(true),
    DATA(true),
    INLINE(true),
    EXPECT(true),
    ACTUAL(true),
    CONST(true),
    LATEINIT(true),
    FUN(true);
    
    public static final Set<h> w = null;
    public static final Set<h> x = null;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f9343h;

    /* access modifiers changed from: public */
    static {
        h[] values = values();
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < 13; i2++) {
            h hVar = values[i2];
            if (hVar.f9343h) {
                arrayList.add(hVar);
            }
        }
        w = g.d0(arrayList);
        x = a.i3(values());
    }

    /* access modifiers changed from: public */
    h(boolean z) {
        this.f9343h = z;
    }
}
