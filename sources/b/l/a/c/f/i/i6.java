package b.l.a.c.f.i;

public final class i6 implements p6 {
    public final p6[] a;

    public i6(p6... p6VarArr) {
        this.a = p6VarArr;
    }

    public final boolean a(Class<?> cls) {
        p6[] p6VarArr = this.a;
        for (int i2 = 0; i2 < 2; i2++) {
            if (p6VarArr[i2].a(cls)) {
                return true;
            }
        }
        return false;
    }

    public final o6 b(Class<?> cls) {
        p6[] p6VarArr = this.a;
        for (int i2 = 0; i2 < 2; i2++) {
            p6 p6Var = p6VarArr[i2];
            if (p6Var.a(cls)) {
                return p6Var.b(cls);
            }
        }
        String name = cls.getName();
        throw new UnsupportedOperationException(name.length() != 0 ? "No factory is available for message type: ".concat(name) : new String("No factory is available for message type: "));
    }
}
