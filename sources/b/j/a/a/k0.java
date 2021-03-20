package b.j.a.a;

public abstract class k0 extends k0<Object> {

    /* renamed from: h  reason: collision with root package name */
    public final Class<?> f1333h;

    public k0(Class<?> cls) {
        this.f1333h = cls;
    }

    public boolean a(i0 i0Var) {
        return i0Var.getClass() == getClass() && i0Var.d() == this.f1333h;
    }

    public final Class d() {
        return this.f1333h;
    }
}
