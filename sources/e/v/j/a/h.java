package e.v.j.a;

import e.v.d;
import e.x.c.f;
import e.x.c.i;
import e.x.c.v;

public abstract class h extends c implements f<Object> {

    /* renamed from: k  reason: collision with root package name */
    public final int f7967k;

    public h(int i2, d<Object> dVar) {
        super(dVar);
        this.f7967k = i2;
    }

    public int getArity() {
        return this.f7967k;
    }

    public String toString() {
        if (this.f7961h != null) {
            return super.toString();
        }
        String f = v.a.f(this);
        i.d(f, "Reflection.renderLambdaToString(this)");
        return f;
    }
}
