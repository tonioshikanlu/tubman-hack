package b.a.a.k;

import b.l.b.a.a.b.f;
import b.l.b.a.a.b.g;
import com.google.api.client.auth.oauth2.TokenErrorResponse;
import com.google.api.client.auth.oauth2.TokenResponse;

public final class e implements g {
    public final /* synthetic */ b a;

    public e(b bVar) {
        this.a = bVar;
    }

    public void a(f fVar, TokenErrorResponse tokenErrorResponse) {
        i iVar = this.a.d;
        if (iVar != null && iVar != null) {
            iVar.a(String.valueOf(tokenErrorResponse));
        }
    }

    public void b(f fVar, TokenResponse tokenResponse) {
        i iVar = this.a.d;
        if (iVar != null) {
            iVar.b(fVar);
        }
    }
}
