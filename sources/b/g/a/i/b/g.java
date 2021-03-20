package b.g.a.i.b;

import android.util.Base64;
import android.util.Log;
import b.l.e.e0.s;
import b.l.e.e0.z.m;
import b.l.e.n;
import b.l.e.o;
import b.l.e.p;
import b.l.e.q;
import b.l.e.s;
import b.l.e.t;
import b.l.e.u;
import java.lang.reflect.Type;
import java.math.BigInteger;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.RSAPublicKeySpec;
import java.util.AbstractCollection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

public class g implements p<Map<String, PublicKey>> {
    public Object a(q qVar, Type type, o oVar) {
        Class<String> cls = String.class;
        Objects.requireNonNull(qVar);
        if (!(qVar instanceof t) || (qVar instanceof s) || ((AbstractCollection) qVar.e().entrySet()).isEmpty()) {
            throw new u("jwks json must be a valid and non-empty json object");
        }
        HashMap hashMap = new HashMap();
        s.e<String, q> c = qVar.e().a.c("keys");
        Iterator<q> it = ((n) (c != null ? c.f5457n : null)).iterator();
        while (it.hasNext()) {
            t e2 = it.next().e();
            m.b bVar = (m.b) oVar;
            String str = (String) bVar.a(e2.s("use"), cls);
            if ("RS256".equals((String) bVar.a(e2.s("alg"), cls)) && "sig".equals(str)) {
                String str2 = (String) bVar.a(e2.s("kty"), cls);
                String str3 = (String) bVar.a(e2.s("kid"), cls);
                try {
                    hashMap.put(str3, KeyFactory.getInstance(str2).generatePublic(new RSAPublicKeySpec(new BigInteger(1, Base64.decode((String) bVar.a(e2.s(b.g.a.h.n.f437k), cls), 11)), new BigInteger(1, Base64.decode((String) bVar.a(e2.s("e"), cls), 11)))));
                } catch (NoSuchAlgorithmException | InvalidKeySpecException e3) {
                    String simpleName = g.class.getSimpleName();
                    Log.e(simpleName, "Could not parse the JWK with ID " + str3, e3);
                }
            }
        }
        return Collections.unmodifiableMap(hashMap);
    }
}
