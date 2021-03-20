package b.l.b.a.a.b;

import b.l.b.a.b.d;
import b.l.b.a.b.g;
import b.l.b.a.b.h;
import b.l.b.a.b.j;
import b.l.b.a.c.c;
import com.google.api.client.auth.oauth2.RefreshTokenRequest;
import com.google.api.client.auth.oauth2.TokenResponse;
import com.google.api.client.http.HttpTransport;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.logging.Level;
import java.util.logging.Logger;

public class f implements d, g, j {
    public static final Logger LOGGER = Logger.getLogger(f.class.getName());
    public String accessToken;
    public final d clientAuthentication;
    public final b.l.b.a.d.f clock;
    public Long expirationTimeMilliseconds;
    public final c jsonFactory;
    public final Lock lock = new ReentrantLock();
    public final a method;
    public final Collection<g> refreshListeners;
    public String refreshToken;
    public final g requestInitializer;
    public final String tokenServerEncodedUrl;
    public final HttpTransport transport;

    public interface a {
        void a(b.l.b.a.b.f fVar, String str);

        String b(b.l.b.a.b.f fVar);
    }

    public static class b {
        public d clientAuthentication;
        public b.l.b.a.d.f clock = b.l.b.a.d.f.a;
        public c jsonFactory;
        public final a method;
        public Collection<g> refreshListeners = new ArrayList();
        public g requestInitializer;
        public b.l.b.a.b.c tokenServerUrl;
        public HttpTransport transport;

        public b(a aVar) {
            Objects.requireNonNull(aVar);
            this.method = aVar;
        }
    }

    public f(b bVar) {
        a aVar = bVar.method;
        Objects.requireNonNull(aVar);
        this.method = aVar;
        this.transport = bVar.transport;
        this.jsonFactory = bVar.jsonFactory;
        b.l.b.a.b.c cVar = bVar.tokenServerUrl;
        this.tokenServerEncodedUrl = cVar == null ? null : cVar.build();
        this.clientAuthentication = bVar.clientAuthentication;
        this.requestInitializer = bVar.requestInitializer;
        this.refreshListeners = Collections.unmodifiableCollection(bVar.refreshListeners);
        b.l.b.a.d.f fVar = bVar.clock;
        Objects.requireNonNull(fVar);
        this.clock = fVar;
    }

    public TokenResponse executeRefreshToken() {
        if (this.refreshToken == null) {
            return null;
        }
        RefreshTokenRequest refreshTokenRequest = new RefreshTokenRequest(this.transport, this.jsonFactory, new b.l.b.a.b.c(this.tokenServerEncodedUrl), this.refreshToken);
        refreshTokenRequest.clientAuthentication = this.clientAuthentication;
        refreshTokenRequest.requestInitializer = this.requestInitializer;
        return refreshTokenRequest.execute();
    }

    public final String getAccessToken() {
        this.lock.lock();
        try {
            return this.accessToken;
        } finally {
            this.lock.unlock();
        }
    }

    public final Long getExpirationTimeMilliseconds() {
        this.lock.lock();
        try {
            return this.expirationTimeMilliseconds;
        } finally {
            this.lock.unlock();
        }
    }

    public final Long getExpiresInSeconds() {
        this.lock.lock();
        try {
            Long l2 = this.expirationTimeMilliseconds;
            return l2 == null ? null : Long.valueOf((l2.longValue() - this.clock.a()) / 1000);
        } finally {
            this.lock.unlock();
        }
    }

    public final String getRefreshToken() {
        this.lock.lock();
        try {
            return this.refreshToken;
        } finally {
            this.lock.unlock();
        }
    }

    public boolean handleResponse(b.l.b.a.b.f fVar, h hVar, boolean z) {
        boolean z2;
        boolean z3;
        List<String> d = hVar.f4737h.c.d();
        boolean z4 = true;
        if (d != null) {
            Iterator<String> it = d.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                String next = it.next();
                if (next.startsWith("Bearer ")) {
                    z2 = c.a.matcher(next).find();
                    z3 = true;
                    break;
                }
            }
        }
        z2 = false;
        z3 = false;
        if (!z3) {
            z2 = hVar.f == 401;
        }
        if (z2) {
            try {
                this.lock.lock();
                if (b.l.a.c.b.a.U(this.accessToken, this.method.b(fVar)) && !refreshToken()) {
                    z4 = false;
                }
                this.lock.unlock();
                return z4;
            } catch (IOException e2) {
                LOGGER.log(Level.SEVERE, "unable to refresh token", e2);
            } catch (Throwable th) {
                this.lock.unlock();
                throw th;
            }
        }
        return false;
    }

    public void initialize(b.l.b.a.b.f fVar) {
        fVar.a = this;
        fVar.f4730n = this;
    }

    public void intercept(b.l.b.a.b.f fVar) {
        this.lock.lock();
        try {
            Long expiresInSeconds = getExpiresInSeconds();
            if (this.accessToken == null || (expiresInSeconds != null && expiresInSeconds.longValue() <= 60)) {
                refreshToken();
                if (this.accessToken == null) {
                    return;
                }
            }
            this.method.a(fVar, this.accessToken);
            this.lock.unlock();
        } finally {
            this.lock.unlock();
        }
    }

    public final boolean refreshToken() {
        this.lock.lock();
        boolean z = true;
        try {
            TokenResponse executeRefreshToken = executeRefreshToken();
            if (executeRefreshToken != null) {
                setFromTokenResponse(executeRefreshToken);
                for (g b2 : this.refreshListeners) {
                    b2.b(this, executeRefreshToken);
                }
                this.lock.unlock();
                return true;
            }
        } catch (k e2) {
            int i2 = e2.statusCode;
            if (400 > i2 || i2 >= 500) {
                z = false;
            }
            if (e2.f4714h != null && z) {
                setAccessToken((String) null);
                setExpiresInSeconds((Long) null);
            }
            for (g a2 : this.refreshListeners) {
                a2.a(this, e2.f4714h);
            }
            if (z) {
                throw e2;
            }
        } catch (Throwable th) {
            this.lock.unlock();
            throw th;
        }
        this.lock.unlock();
        return false;
    }

    public f setAccessToken(String str) {
        this.lock.lock();
        try {
            this.accessToken = str;
            return this;
        } finally {
            this.lock.unlock();
        }
    }

    public f setExpirationTimeMilliseconds(Long l2) {
        this.lock.lock();
        try {
            this.expirationTimeMilliseconds = l2;
            return this;
        } finally {
            this.lock.unlock();
        }
    }

    public f setExpiresInSeconds(Long l2) {
        Long l3;
        if (l2 == null) {
            l3 = null;
        } else {
            l3 = Long.valueOf((l2.longValue() * 1000) + this.clock.a());
        }
        return setExpirationTimeMilliseconds(l3);
    }

    public f setFromTokenResponse(TokenResponse tokenResponse) {
        setAccessToken(tokenResponse.getAccessToken());
        if (tokenResponse.b() != null) {
            setRefreshToken(tokenResponse.b());
        }
        setExpiresInSeconds(tokenResponse.getExpiresInSeconds());
        return this;
    }

    public f setRefreshToken(String str) {
        this.lock.lock();
        if (str != null) {
            try {
                b.l.a.c.b.a.o((this.jsonFactory == null || this.transport == null || this.clientAuthentication == null || this.tokenServerEncodedUrl == null) ? false : true, "Please use the Builder and call setJsonFactory, setTransport, setClientAuthentication and setTokenServerUrl/setTokenServerEncodedUrl");
            } catch (Throwable th) {
                this.lock.unlock();
                throw th;
            }
        }
        this.refreshToken = str;
        this.lock.unlock();
        return this;
    }
}
