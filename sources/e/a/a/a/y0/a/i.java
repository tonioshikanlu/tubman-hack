package e.a.a.a.y0.a;

import e.a.a.a.y0.f.b;
import e.a.a.a.y0.f.d;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Set;

public enum i {
    BOOLEAN("Boolean"),
    CHAR("Char"),
    BYTE("Byte"),
    SHORT("Short"),
    INT("Int"),
    FLOAT("Float"),
    LONG("Long"),
    DOUBLE("Double");
    
    public static final Set<i> t = null;

    /* renamed from: h  reason: collision with root package name */
    public final d f7675h;

    /* renamed from: i  reason: collision with root package name */
    public final d f7676i;

    /* renamed from: j  reason: collision with root package name */
    public b f7677j;

    /* renamed from: k  reason: collision with root package name */
    public b f7678k;

    /* access modifiers changed from: public */
    static {
        i iVar;
        i iVar2;
        i iVar3;
        i iVar4;
        i iVar5;
        i iVar6;
        i iVar7;
        t = Collections.unmodifiableSet(EnumSet.of(iVar, new i[]{iVar2, iVar3, iVar4, iVar5, iVar6, iVar7}));
    }

    /* access modifiers changed from: public */
    i(String str) {
        this.f7677j = null;
        this.f7678k = null;
        this.f7675h = d.l(str);
        this.f7676i = d.l(str + "Array");
    }

    public d e() {
        d dVar = this.f7676i;
        if (dVar != null) {
            return dVar;
        }
        d(3);
        throw null;
    }

    public d h() {
        d dVar = this.f7675h;
        if (dVar != null) {
            return dVar;
        }
        d(0);
        throw null;
    }
}
