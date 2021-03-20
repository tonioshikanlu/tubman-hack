package e.a.a.a.y0.m;

import e.a.a.a.y0.a.g;
import e.a.a.a.y0.f.b;
import e.x.b.l;

public final class c1 implements l<b, Boolean> {
    public Object invoke(Object obj) {
        b bVar = (b) obj;
        if (bVar != null) {
            return Boolean.valueOf(!bVar.equals(g.f7647k.F));
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", new Object[]{"name", "kotlin/reflect/jvm/internal/impl/types/TypeSubstitutor$1", "invoke"}));
    }
}
