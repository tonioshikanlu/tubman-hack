package b.l.b.a.a.b;

import com.google.api.client.auth.oauth2.TokenErrorResponse;
import com.google.api.client.auth.oauth2.TokenResponse;
import java.util.Objects;

@Deprecated
public final class i implements g {
    public final h a;

    /* renamed from: b  reason: collision with root package name */
    public final String f4712b;

    public i(String str, h hVar) {
        Objects.requireNonNull(str);
        this.f4712b = str;
        Objects.requireNonNull(hVar);
        this.a = hVar;
    }

    public void a(f fVar, TokenErrorResponse tokenErrorResponse) {
        this.a.store(this.f4712b, fVar);
    }

    public void b(f fVar, TokenResponse tokenResponse) {
        this.a.store(this.f4712b, fVar);
    }
}
