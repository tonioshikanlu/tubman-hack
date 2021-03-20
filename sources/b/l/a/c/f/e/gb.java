package b.l.a.c.f.e;

import b.l.a.c.b.a;
import b.l.a.c.f.e.mb;
import java.security.KeyFactory;
import java.security.KeyPairGenerator;
import java.security.Provider;
import java.security.Security;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.crypto.Cipher;
import javax.crypto.KeyAgreement;
import javax.crypto.Mac;

public final class gb<T_WRAPPER extends mb<T_ENGINE>, T_ENGINE> {
    public static final Logger c = Logger.getLogger(gb.class.getName());
    public static final List<Provider> d;

    /* renamed from: e  reason: collision with root package name */
    public static final gb<hb, Cipher> f3009e = new gb<>(new hb());
    public static final gb<lb, Mac> f = new gb<>(new lb());

    /* renamed from: g  reason: collision with root package name */
    public static final gb<ib, KeyAgreement> f3010g = new gb<>(new ib());

    /* renamed from: h  reason: collision with root package name */
    public static final gb<kb, KeyPairGenerator> f3011h = new gb<>(new kb());

    /* renamed from: i  reason: collision with root package name */
    public static final gb<jb, KeyFactory> f3012i = new gb<>(new jb());
    public final T_WRAPPER a;

    /* renamed from: b  reason: collision with root package name */
    public final List<Provider> f3013b = d;

    static {
        if (a.o1()) {
            String[] strArr = {"GmsCore_OpenSSL", "AndroidOpenSSL"};
            ArrayList arrayList = new ArrayList();
            for (int i2 = 0; i2 < 2; i2++) {
                String str = strArr[i2];
                Provider provider = Security.getProvider(str);
                if (provider != null) {
                    arrayList.add(provider);
                } else {
                    c.logp(Level.INFO, "com.google.crypto.tink.subtle.EngineFactory", "toProviderList", String.format("Provider %s not available", new Object[]{str}));
                }
            }
            d = arrayList;
        } else {
            d = new ArrayList();
        }
    }

    public gb(T_WRAPPER t_wrapper) {
        this.a = t_wrapper;
    }

    public final T_ENGINE a(String str) {
        for (Provider a2 : this.f3013b) {
            try {
                return this.a.a(str, a2);
            } catch (Exception unused) {
            }
        }
        return this.a.a(str, (Provider) null);
    }
}
