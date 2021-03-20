package b.l.a.c.f.e;

import b.l.a.c.b.a;
import java.math.BigInteger;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.ECPublicKeySpec;

public final class v4 extends h2<c2, l8> {
    public v4(Class cls) {
        super(cls);
    }

    public final Object a(Object obj) {
        l8 l8Var = (l8) obj;
        f8 t = l8Var.t();
        o8 s = t.s();
        int Q1 = a.Q1(s.s());
        byte[] L = l8Var.u().L();
        byte[] L2 = l8Var.v().L();
        ECParameterSpec i2 = a.i2(Q1);
        ECPoint eCPoint = new ECPoint(new BigInteger(1, L), new BigInteger(1, L2));
        a.n1(eCPoint, i2.getCurve());
        ECPublicKeySpec eCPublicKeySpec = new ECPublicKeySpec(eCPoint, i2);
        return new db((ECPublicKey) gb.f3012i.a("EC").generatePublic(eCPublicKeySpec), s.u().L(), a.D1(s.t()), a.Z1(t.u()), new d5(t.t().s()));
    }
}
