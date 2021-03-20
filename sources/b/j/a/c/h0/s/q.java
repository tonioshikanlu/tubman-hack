package b.j.a.c.h0.s;

import b.j.a.b.f;
import b.j.a.b.l;
import b.j.a.c.h0.t.s0;
import b.j.a.c.x;
import b.j.a.c.y;

public class q extends s0<Object> {
    public q() {
        super(Object.class);
    }

    public q(Class<?> cls) {
        super(cls, false);
    }

    public boolean d(y yVar, Object obj) {
        return true;
    }

    public void f(Object obj, f fVar, y yVar) {
        if (yVar.K(x.FAIL_ON_EMPTY_BEANS)) {
            q(yVar, obj);
        }
        fVar.N0();
        fVar.r0();
    }

    public final void g(Object obj, f fVar, y yVar, b.j.a.c.f0.f fVar2) {
        if (yVar.K(x.FAIL_ON_EMPTY_BEANS)) {
            q(yVar, obj);
        }
        fVar2.f(fVar, fVar2.e(fVar, fVar2.d(obj, l.START_OBJECT)));
    }

    public void q(y yVar, Object obj) {
        yVar.m(this.f2137h, String.format("No serializer found for class %s and no properties discovered to create BeanSerializer (to avoid exception, disable SerializationFeature.FAIL_ON_EMPTY_BEANS)", new Object[]{obj.getClass().getName()}));
    }
}
