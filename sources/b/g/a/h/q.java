package b.g.a.h;

import b.g.a.b;
import b.g.a.e.c;
import b.g.a.f.a;
import java.security.InvalidKeyException;
import java.security.PublicKey;
import java.util.Map;

public final class q implements Object<Map<String, PublicKey>> {
    public final /* synthetic */ String a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ a f451b;

    public q(String str, a aVar) {
        this.a = str;
        this.f451b = aVar;
    }

    public void a(Object obj) {
        try {
            this.f451b.a(new c((PublicKey) ((Map) obj).get(this.a)));
        } catch (InvalidKeyException unused) {
            this.f451b.b(new t(String.format("Could not find a public key for kid \"%s\"", new Object[]{this.a})));
        }
    }

    public void b(b bVar) {
        c cVar = (c) bVar;
        this.f451b.b(new t(String.format("Could not find a public key for kid \"%s\"", new Object[]{this.a})));
    }
}
