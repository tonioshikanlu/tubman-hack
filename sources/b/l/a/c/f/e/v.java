package b.l.a.c.f.e;

public final class v implements d0 {
    public final d0[] a;

    public v(d0... d0VarArr) {
        this.a = d0VarArr;
    }

    public final boolean a(Class<?> cls) {
        d0[] d0VarArr = this.a;
        for (int i2 = 0; i2 < 2; i2++) {
            if (d0VarArr[i2].a(cls)) {
                return true;
            }
        }
        return false;
    }

    public final c0 b(Class<?> cls) {
        d0[] d0VarArr = this.a;
        for (int i2 = 0; i2 < 2; i2++) {
            d0 d0Var = d0VarArr[i2];
            if (d0Var.a(cls)) {
                return d0Var.b(cls);
            }
        }
        String name = cls.getName();
        throw new UnsupportedOperationException(name.length() != 0 ? "No factory is available for message type: ".concat(name) : new String("No factory is available for message type: "));
    }
}
