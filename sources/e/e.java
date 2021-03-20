package e;

import e.x.c.i;

public final class e implements Comparable<e> {

    /* renamed from: l  reason: collision with root package name */
    public static final e f7897l = new e(1, 4, 10);

    /* renamed from: h  reason: collision with root package name */
    public final int f7898h;

    /* renamed from: i  reason: collision with root package name */
    public final int f7899i;

    /* renamed from: j  reason: collision with root package name */
    public final int f7900j;

    /* renamed from: k  reason: collision with root package name */
    public final int f7901k;

    public e(int i2, int i3, int i4) {
        this.f7899i = i2;
        this.f7900j = i3;
        this.f7901k = i4;
        if (i2 >= 0 && 255 >= i2 && i3 >= 0 && 255 >= i3 && i4 >= 0 && 255 >= i4) {
            this.f7898h = (i2 << 16) + (i3 << 8) + i4;
            return;
        }
        throw new IllegalArgumentException(("Version components are out of range: " + i2 + '.' + i3 + '.' + i4).toString());
    }

    public int compareTo(Object obj) {
        e eVar = (e) obj;
        i.e(eVar, "other");
        return this.f7898h - eVar.f7898h;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            obj = null;
        }
        e eVar = (e) obj;
        if (eVar != null) {
            return this.f7898h == eVar.f7898h;
        }
        return false;
    }

    public int hashCode() {
        return this.f7898h;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f7899i);
        sb.append('.');
        sb.append(this.f7900j);
        sb.append('.');
        sb.append(this.f7901k);
        return sb.toString();
    }
}
