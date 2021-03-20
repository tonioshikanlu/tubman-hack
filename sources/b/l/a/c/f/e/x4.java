package b.l.a.c.f.e;

import java.security.GeneralSecurityException;
import java.util.concurrent.ConcurrentMap;
import java.util.logging.Level;
import java.util.logging.Logger;

public final class x4 {
    static {
        new w4();
        new u4();
        ka.s();
        ka.s();
        ka.s();
        try {
            a();
        } catch (GeneralSecurityException e2) {
            throw new ExceptionInInitializerError(e2);
        }
    }

    public static void a() {
        Class<?> e2;
        c3.a();
        u4 u4Var = new u4();
        w4 w4Var = new w4();
        synchronized (a3.class) {
            a3.h("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey", u4Var.getClass(), true);
            a3.h("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPublicKey", w4Var.getClass(), false);
            ConcurrentMap<String, z2> concurrentMap = a3.f2840b;
            if (concurrentMap.containsKey("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey") && (e2 = ((z2) concurrentMap.get("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey")).e()) != null) {
                if (!e2.equals(w4Var.getClass())) {
                    Logger logger = a3.a;
                    Level level = Level.WARNING;
                    StringBuilder sb = new StringBuilder(219);
                    sb.append("Attempted overwrite of a registered key manager for key type ");
                    sb.append("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey");
                    sb.append(" with inconsistent public key type ");
                    sb.append("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPublicKey");
                    logger.logp(level, "com.google.crypto.tink.Registry", "registerAsymmetricKeyManagers", sb.toString());
                    throw new GeneralSecurityException(String.format("public key manager corresponding to %s is already registered with %s, cannot be re-registered with %s", new Object[]{u4Var.getClass().getName(), e2.getName(), w4Var.getClass().getName()}));
                }
            }
            if (!concurrentMap.containsKey("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey") || ((z2) concurrentMap.get("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey")).e() == null) {
                concurrentMap.put("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey", new x2(u4Var, w4Var));
                a3.c.put("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey", new y2(u4Var));
            }
            ConcurrentMap<String, Boolean> concurrentMap2 = a3.d;
            concurrentMap2.put("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey", Boolean.TRUE);
            if (!concurrentMap.containsKey("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPublicKey")) {
                concurrentMap.put("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPublicKey", new w2(w4Var));
            }
            concurrentMap2.put("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPublicKey", Boolean.FALSE);
        }
        a3.b(new z4());
        a3.b(new b5());
    }
}
