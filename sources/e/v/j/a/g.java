package e.v.j.a;

import e.v.d;
import e.v.f;
import e.v.h;

public abstract class g extends a {
    public g(d<Object> dVar) {
        super(dVar);
        if (dVar != null) {
            if (!(dVar.getContext() == h.f7949h)) {
                throw new IllegalArgumentException("Coroutines with restricted suspension must have EmptyCoroutineContext".toString());
            }
        }
    }

    public f getContext() {
        return h.f7949h;
    }
}
