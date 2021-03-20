package b.l.a.c.f.e;

import b.l.a.c.b.a;
import java.math.BigInteger;
import java.security.interfaces.ECPrivateKey;
import java.security.spec.ECPrivateKeySpec;

public final class s4 extends h2<b2, i8> {
    public s4(Class cls) {
        super(cls);
    }

    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        i8 i8Var = (i8) obj;
        f8 t = i8Var.t().t();
        o8 s = t.s();
        int Q1 = a.Q1(s.s());
        byte[] L = i8Var.u().L();
        ECPrivateKeySpec eCPrivateKeySpec = new ECPrivateKeySpec(new BigInteger(1, L), a.i2(Q1));
        return new cb((ECPrivateKey) gb.f3012i.a("EC").generatePrivate(eCPrivateKeySpec), s.u().L(), a.D1(s.t()), a.Z1(t.u()), new d5(t.t().s()));
    }
}
