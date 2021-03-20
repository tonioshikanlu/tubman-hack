package e.a.a.a.y0.m;

public abstract class z0 implements y0 {
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y0)) {
            return false;
        }
        y0 y0Var = (y0) obj;
        return c() == y0Var.c() && b() == y0Var.b() && d().equals(y0Var.d());
    }

    public int hashCode() {
        int hashCode = b().hashCode() * 31;
        if (f1.q(d())) {
            return hashCode + 19;
        }
        return hashCode + (c() ? 17 : d().hashCode());
    }

    public String toString() {
        if (c()) {
            return "*";
        }
        if (b() == j1.INVARIANT) {
            return d().toString();
        }
        return b() + " " + d();
    }
}
