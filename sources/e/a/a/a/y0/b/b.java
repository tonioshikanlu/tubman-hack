package e.a.a.a.y0.b;

import java.util.Collection;

public interface b extends a, u {

    public enum a {
        DECLARATION,
        FAKE_OVERRIDE,
        DELEGATION,
        SYNTHESIZED;

        public boolean d() {
            return this != FAKE_OVERRIDE;
        }
    }

    b O0(k kVar, v vVar, z0 z0Var, a aVar, boolean z);

    b a();

    Collection<? extends b> g();

    a i();

    void s0(Collection<? extends b> collection);
}
