package b.j.a.c.j0;

import b.e.a.a.a;
import b.j.a.c.i;

public class b0 {
    public int a;

    /* renamed from: b  reason: collision with root package name */
    public Class<?> f2200b;
    public i c;
    public boolean d;

    public b0() {
    }

    public b0(i iVar, boolean z) {
        int i2;
        this.c = iVar;
        this.f2200b = null;
        this.d = z;
        if (z) {
            i2 = iVar.f2153i - 2;
        } else {
            i2 = iVar.f2153i - 1;
        }
        this.a = i2;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (obj.getClass() != b0.class) {
            return false;
        }
        b0 b0Var = (b0) obj;
        if (b0Var.d != this.d) {
            return false;
        }
        Class<?> cls = this.f2200b;
        return cls != null ? b0Var.f2200b == cls : this.c.equals(b0Var.c);
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        StringBuilder sb;
        if (this.f2200b != null) {
            sb = a.y("{class: ");
            sb.append(this.f2200b.getName());
        } else {
            sb = a.y("{type: ");
            sb.append(this.c);
        }
        sb.append(", typed? ");
        return a.s(sb, this.d, "}");
    }

    public b0(Class<?> cls, boolean z) {
        int i2;
        this.f2200b = cls;
        this.c = null;
        this.d = z;
        if (z) {
            i2 = cls.getName().hashCode() + 1;
        } else {
            i2 = cls.getName().hashCode();
        }
        this.a = i2;
    }
}
