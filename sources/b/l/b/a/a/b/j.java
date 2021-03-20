package b.l.b.a.a.b;

import b.l.b.a.b.d;
import b.l.b.a.b.f;
import b.l.b.a.b.g;
import com.google.api.client.auth.oauth2.TokenRequest;

public class j implements g {
    public final /* synthetic */ TokenRequest a;

    public class a implements d {
        public final /* synthetic */ d a;

        public a(d dVar) {
            this.a = dVar;
        }

        public void intercept(f fVar) {
            d dVar = this.a;
            if (dVar != null) {
                dVar.intercept(fVar);
            }
            d dVar2 = j.this.a.clientAuthentication;
            if (dVar2 != null) {
                dVar2.intercept(fVar);
            }
        }
    }

    public j(TokenRequest tokenRequest) {
        this.a = tokenRequest;
    }

    public void initialize(f fVar) {
        g gVar = this.a.requestInitializer;
        if (gVar != null) {
            gVar.initialize(fVar);
        }
        fVar.a = new a(fVar.a);
    }
}
