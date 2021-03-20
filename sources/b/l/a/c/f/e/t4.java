package b.l.a.c.f.e;

import b.l.a.c.b.a;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;

public final class t4 extends g2<c8, i8> {
    public t4(u4 u4Var, Class cls) {
        super(cls);
    }

    public final /* bridge */ /* synthetic */ void a(e0 e0Var) {
        a.i1(((c8) e0Var).s());
    }

    public final /* bridge */ /* synthetic */ e0 b(um umVar) {
        return c8.t(umVar, fn.a());
    }

    public final Object c(e0 e0Var) {
        c8 c8Var = (c8) e0Var;
        ECParameterSpec i2 = a.i2(a.Q1(c8Var.s().s().s()));
        KeyPairGenerator a = gb.f3011h.a("EC");
        a.initialize(i2);
        KeyPair generateKeyPair = a.generateKeyPair();
        ECPrivateKey eCPrivateKey = (ECPrivateKey) generateKeyPair.getPrivate();
        ECPoint w = ((ECPublicKey) generateKeyPair.getPublic()).getW();
        k8 x = l8.x();
        if (x.f3216j) {
            x.a();
            x.f3216j = false;
        }
        ((l8) x.f3215i).zzb = 0;
        f8 s = c8Var.s();
        if (x.f3216j) {
            x.a();
            x.f3216j = false;
        }
        l8.B((l8) x.f3215i, s);
        um K = um.K(w.getAffineX().toByteArray());
        if (x.f3216j) {
            x.a();
            x.f3216j = false;
        }
        ((l8) x.f3215i).zzf = K;
        um K2 = um.K(w.getAffineY().toByteArray());
        if (x.f3216j) {
            x.a();
            x.f3216j = false;
        }
        ((l8) x.f3215i).zzg = K2;
        l8 l8Var = (l8) x.c();
        h8 w2 = i8.w();
        if (w2.f3216j) {
            w2.a();
            w2.f3216j = false;
        }
        ((i8) w2.f3215i).zzb = 0;
        if (w2.f3216j) {
            w2.a();
            w2.f3216j = false;
        }
        i8.z((i8) w2.f3215i, l8Var);
        um K3 = um.K(eCPrivateKey.getS().toByteArray());
        if (w2.f3216j) {
            w2.a();
            w2.f3216j = false;
        }
        ((i8) w2.f3215i).zzf = K3;
        return (i8) w2.c();
    }
}
