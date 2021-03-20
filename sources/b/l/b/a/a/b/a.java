package b.l.b.a.a.b;

import b.l.b.a.a.b.f;
import b.l.b.a.b.d;
import b.l.b.a.b.g;
import b.l.b.a.c.c;
import b.l.b.a.d.f;
import com.google.api.client.http.HttpTransport;
import com.wuman.android.auth.AuthorizationFlow;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Objects;

public class a {
    public final String authorizationServerEncodedUrl;
    public final d clientAuthentication;
    public final String clientId;
    public final f clock;
    @Deprecated
    public final h credentialStore;
    public final c jsonFactory;
    public final f.a method;
    public final Collection<g> refreshListeners;
    public final g requestInitializer;
    public final Collection<String> scopes;
    public final String tokenServerEncodedUrl;
    public final HttpTransport transport;

    /* renamed from: b.l.b.a.a.b.a$a  reason: collision with other inner class name */
    public static class C0068a {
        public String authorizationServerEncodedUrl;
        public d clientAuthentication;
        public String clientId;
        public b.l.b.a.d.f clock = b.l.b.a.d.f.a;
        @Deprecated
        public h credentialStore;
        public c jsonFactory;
        public f.a method;
        public Collection<g> refreshListeners = new ArrayList();
        public g requestInitializer;
        public Collection<String> scopes = new ArrayList();
        public b.l.b.a.b.c tokenServerUrl;
        public HttpTransport transport;

        public C0068a(f.a aVar, HttpTransport httpTransport, c cVar, b.l.b.a.b.c cVar2, d dVar, String str, String str2) {
            AuthorizationFlow.Builder builder = (AuthorizationFlow.Builder) this;
            Objects.requireNonNull(aVar);
            builder.method = aVar;
            Objects.requireNonNull(httpTransport);
            builder.transport = httpTransport;
            Objects.requireNonNull(cVar);
            builder.jsonFactory = cVar;
            Objects.requireNonNull(cVar2);
            builder.tokenServerUrl = cVar2;
            builder.clientAuthentication = dVar;
            Objects.requireNonNull(str);
            builder.clientId = str;
            Objects.requireNonNull(str2);
            builder.authorizationServerEncodedUrl = str2;
        }
    }

    public a(C0068a aVar) {
        f.a aVar2 = aVar.method;
        Objects.requireNonNull(aVar2);
        this.method = aVar2;
        HttpTransport httpTransport = aVar.transport;
        Objects.requireNonNull(httpTransport);
        this.transport = httpTransport;
        c cVar = aVar.jsonFactory;
        Objects.requireNonNull(cVar);
        this.jsonFactory = cVar;
        b.l.b.a.b.c cVar2 = aVar.tokenServerUrl;
        Objects.requireNonNull(cVar2);
        this.tokenServerEncodedUrl = cVar2.build();
        this.clientAuthentication = aVar.clientAuthentication;
        String str = aVar.clientId;
        Objects.requireNonNull(str);
        this.clientId = str;
        String str2 = aVar.authorizationServerEncodedUrl;
        Objects.requireNonNull(str2);
        this.authorizationServerEncodedUrl = str2;
        this.requestInitializer = aVar.requestInitializer;
        this.credentialStore = aVar.credentialStore;
        this.scopes = Collections.unmodifiableCollection(aVar.scopes);
        b.l.b.a.d.f fVar = aVar.clock;
        Objects.requireNonNull(fVar);
        this.clock = fVar;
        this.refreshListeners = Collections.unmodifiableCollection(aVar.refreshListeners);
    }

    public f loadCredential(String str) {
        if (b.l.a.c.b.a.g0(str) || this.credentialStore == null) {
            return null;
        }
        f newCredential = newCredential(str);
        if (!this.credentialStore.load(str, newCredential)) {
            return null;
        }
        return newCredential;
    }

    public final f newCredential(String str) {
        b.l.b.a.b.c cVar;
        f.b bVar = new f.b(this.method);
        bVar.transport = this.transport;
        bVar.jsonFactory = this.jsonFactory;
        String str2 = this.tokenServerEncodedUrl;
        if (str2 == null) {
            cVar = null;
        } else {
            cVar = new b.l.b.a.b.c(str2);
        }
        bVar.tokenServerUrl = cVar;
        bVar.clientAuthentication = this.clientAuthentication;
        bVar.requestInitializer = this.requestInitializer;
        b.l.b.a.d.f fVar = this.clock;
        Objects.requireNonNull(fVar);
        bVar.clock = fVar;
        h hVar = this.credentialStore;
        if (hVar != null) {
            bVar.refreshListeners.add(new i(str, hVar));
        }
        bVar.refreshListeners.addAll(this.refreshListeners);
        return new f(bVar);
    }
}
