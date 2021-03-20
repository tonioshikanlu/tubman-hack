package b.i.a;

public class e {
    public static final e c = new e(a.none, (b) null);
    public static final e d = new e(a.xMidYMid, b.meet);
    public a a;

    /* renamed from: b  reason: collision with root package name */
    public b f1063b;

    public enum a {
        none,
        xMinYMin,
        xMidYMin,
        xMaxYMin,
        xMinYMid,
        xMidYMid,
        xMaxYMid,
        xMinYMax,
        xMidYMax,
        xMaxYMax
    }

    public enum b {
        meet,
        slice
    }

    public e(a aVar, b bVar) {
        this.a = aVar;
        this.f1063b = bVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || e.class != obj.getClass()) {
            return false;
        }
        e eVar = (e) obj;
        return this.a == eVar.a && this.f1063b == eVar.f1063b;
    }

    public String toString() {
        return this.a + " " + this.f1063b;
    }
}
