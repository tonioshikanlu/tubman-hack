package b.g.a.h;

import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import b.g.a.g.d;
import b.g.a.g.e;
import b.g.a.i.b.i;
import b.g.a.i.b.j;
import b.l.e.k;
import b.p.b.o;
import b.p.b.r;
import java.security.SecureRandom;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class n extends p {

    /* renamed from: k  reason: collision with root package name */
    public static final String f437k = "n";
    public final b.g.a.a a;

    /* renamed from: b  reason: collision with root package name */
    public final d f438b;
    public final Map<String, String> c;
    public final b.g.a.e.b d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f439e;
    public boolean f = true;

    /* renamed from: g  reason: collision with root package name */
    public int f440g;

    /* renamed from: h  reason: collision with root package name */
    public o f441h;

    /* renamed from: i  reason: collision with root package name */
    public i f442i;

    /* renamed from: j  reason: collision with root package name */
    public Integer f443j;

    public class a implements b.g.a.f.a<Void, t> {
        public final /* synthetic */ b.g.a.j.a a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ Map f444b;

        public a(b.g.a.j.a aVar, Map map) {
            this.a = aVar;
            this.f444b = map;
        }

        public void a(Object obj) {
            Void voidR = (Void) obj;
            if (!n.this.f()) {
                n.this.f438b.a(this.a);
            } else {
                n.this.f441h.a((String) this.f444b.get("code"), new m(this, n.this.f438b));
            }
        }

        public void b(b.g.a.b bVar) {
            n.this.f438b.b(new b.g.a.e.c("Could not verify the ID token", (b.g.a.b) (t) bVar));
        }
    }

    public class b extends s {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ b.g.a.j.a f445b;

        public class a implements b.g.a.f.a<Void, t> {
            public final /* synthetic */ b.g.a.j.a a;

            public a(b.g.a.j.a aVar) {
                this.a = aVar;
            }

            public void a(Object obj) {
                Void voidR = (Void) obj;
                n.this.f438b.a(n.e(b.this.f445b, this.a));
            }

            public void b(b.g.a.b bVar) {
                n.this.f438b.b(new b.g.a.e.c("Could not verify the ID token", (b.g.a.b) (t) bVar));
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(d dVar, b.g.a.j.a aVar) {
            super(dVar);
            this.f445b = aVar;
        }

        public void a(@NonNull b.g.a.j.a aVar) {
            n.this.c(aVar.c, new a(aVar));
        }
    }

    public class c implements b.g.a.f.a<r, t> {
        public final /* synthetic */ b.g.a.f.a a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ e f447b;

        public c(b.g.a.f.a aVar, e eVar) {
            this.a = aVar;
            this.f447b = eVar;
        }

        public void a(Object obj) {
            n nVar = n.this;
            b.g.a.a aVar = nVar.d.a;
            j jVar = new j(aVar.f405b.f6728i, aVar.a, (r) obj);
            String str = nVar.c.get("max_age");
            if (!TextUtils.isEmpty(str)) {
                jVar.f433e = Integer.valueOf(str);
            }
            n nVar2 = n.this;
            jVar.f = nVar2.f443j;
            jVar.d = nVar2.c.get("nonce");
            Objects.requireNonNull(n.this);
            jVar.f434g = new Date(System.currentTimeMillis());
            try {
                new k().a(this.f447b, jVar);
                Objects.requireNonNull(n.this.a);
                this.a.a(null);
            } catch (t e2) {
                this.a.b(e2);
            }
        }

        public void b(b.g.a.b bVar) {
            this.a.b((t) bVar);
        }
    }

    public n(@NonNull b.g.a.a aVar, @NonNull d dVar, @NonNull Map<String, String> map) {
        this.a = aVar;
        this.f438b = dVar;
        this.c = new HashMap(map);
        this.d = new b.g.a.e.b(aVar);
    }

    @VisibleForTesting
    public static String d(@Nullable String str) {
        if (str != null) {
            return str;
        }
        byte[] bArr = new byte[32];
        new SecureRandom().nextBytes(bArr);
        return Base64.encodeToString(bArr, 11);
    }

    @VisibleForTesting
    public static b.g.a.j.a e(b.g.a.j.a aVar, b.g.a.j.a aVar2) {
        String str = TextUtils.isEmpty(aVar.c) ? aVar2.c : aVar.c;
        String str2 = TextUtils.isEmpty(aVar2.a) ? aVar.a : aVar2.a;
        String str3 = TextUtils.isEmpty(aVar2.f458b) ? aVar.f458b : aVar2.f458b;
        String str4 = aVar2.d;
        Date date = aVar2.f;
        if (date == null) {
            date = aVar.f;
        }
        return new b.g.a.j.a(str, str2, str3, str4, date, TextUtils.isEmpty(aVar2.f459e) ? aVar.f459e : aVar2.f459e);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v16, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v12, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0027  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x002d  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x001b  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x001d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean a(b.g.a.h.e r19) {
        /*
            r18 = this;
            r1 = r18
            java.lang.String r0 = "state"
            boolean r2 = r19.b()
            r3 = 1
            r4 = 0
            if (r2 != 0) goto L_0x0016
            r2 = r19
            int r5 = r2.a
            r6 = -1
            if (r5 != r6) goto L_0x0014
            goto L_0x0018
        L_0x0014:
            r5 = r4
            goto L_0x0019
        L_0x0016:
            r2 = r19
        L_0x0018:
            r5 = r3
        L_0x0019:
            if (r5 == 0) goto L_0x001d
            r5 = r3
            goto L_0x0025
        L_0x001d:
            java.lang.String r5 = b.g.a.h.e.c
            java.lang.String r6 = "Result is invalid: Either the received Intent is null or the Request Code doesn't match the expected one."
            android.util.Log.d(r5, r6)
            r5 = r4
        L_0x0025:
            if (r5 != 0) goto L_0x002d
            java.lang.String r0 = f437k
            java.lang.String r2 = "The Authorize Result is invalid."
            goto L_0x00a0
        L_0x002d:
            boolean r5 = r19.b()
            if (r5 == 0) goto L_0x0042
            b.g.a.e.c r0 = new b.g.a.e.c
            java.lang.String r2 = "a0.authentication_canceled"
            java.lang.String r4 = "The user closed the browser app and the authentication was canceled."
            r0.<init>((java.lang.String) r2, (java.lang.String) r4)
            b.g.a.h.d r2 = r1.f438b
            r2.b(r0)
            return r3
        L_0x0042:
            android.net.Uri r2 = r19.a()
            java.lang.String r5 = b.g.a.h.f.a
            r5 = 2
            if (r2 != 0) goto L_0x0050
            java.util.Map r2 = java.util.Collections.emptyMap()
            goto L_0x0096
        L_0x0050:
            java.lang.String r6 = r2.getQuery()
            if (r6 == 0) goto L_0x005b
            java.lang.String r2 = r2.getQuery()
            goto L_0x005f
        L_0x005b:
            java.lang.String r2 = r2.getFragment()
        L_0x005f:
            if (r2 != 0) goto L_0x0067
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            goto L_0x0096
        L_0x0067:
            int r6 = r2.length()
            if (r6 <= 0) goto L_0x0074
            java.lang.String r6 = "&"
            java.lang.String[] r2 = r2.split(r6)
            goto L_0x0076
        L_0x0074:
            java.lang.String[] r2 = new java.lang.String[r4]
        L_0x0076:
            java.util.HashMap r6 = new java.util.HashMap
            int r7 = r2.length
            r6.<init>(r7)
            int r7 = r2.length
            r8 = r4
        L_0x007e:
            if (r8 >= r7) goto L_0x0095
            r9 = r2[r8]
            java.lang.String r10 = "="
            java.lang.String[] r9 = r9.split(r10)
            int r10 = r9.length
            if (r10 != r5) goto L_0x0092
            r10 = r9[r4]
            r9 = r9[r3]
            r6.put(r10, r9)
        L_0x0092:
            int r8 = r8 + 1
            goto L_0x007e
        L_0x0095:
            r2 = r6
        L_0x0096:
            boolean r6 = r2.isEmpty()
            if (r6 == 0) goto L_0x00a4
            java.lang.String r0 = f437k
            java.lang.String r2 = "The response didn't contain any of these values: code, state, id_token, access_token, token_type, refresh_token"
        L_0x00a0:
            android.util.Log.w(r0, r2)
            return r4
        L_0x00a4:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "The parsed CallbackURI contains the following values: "
            r6.append(r7)
            r6.append(r2)
            r6.toString()
            b.g.a.a r6 = r1.a
            java.util.Objects.requireNonNull(r6)
            java.lang.String r6 = "error"
            java.lang.Object r6 = r2.get(r6)     // Catch:{ c -> 0x0198 }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ c -> 0x0198 }
            java.lang.String r7 = "error_description"
            java.lang.Object r7 = r2.get(r7)     // Catch:{ c -> 0x0198 }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ c -> 0x0198 }
            r1.b(r6, r7)     // Catch:{ c -> 0x0198 }
            java.util.Map<java.lang.String, java.lang.String> r6 = r1.c     // Catch:{ c -> 0x0198 }
            java.lang.Object r6 = r6.get(r0)     // Catch:{ c -> 0x0198 }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ c -> 0x0198 }
            java.lang.Object r0 = r2.get(r0)     // Catch:{ c -> 0x0198 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ c -> 0x0198 }
            boolean r7 = r6.equals(r0)     // Catch:{ c -> 0x0198 }
            if (r7 == 0) goto L_0x017d
            java.lang.String r0 = "expires_in"
            boolean r5 = r2.containsKey(r0)
            r6 = 0
            if (r5 != 0) goto L_0x00ec
            r16 = r6
            goto L_0x0109
        L_0x00ec:
            java.util.Date r5 = new java.util.Date
            long r7 = java.lang.System.currentTimeMillis()
            java.lang.Object r0 = r2.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            long r9 = r0.longValue()
            r11 = 1000(0x3e8, double:4.94E-321)
            long r9 = r9 * r11
            long r9 = r9 + r7
            r5.<init>(r9)
            r16 = r5
        L_0x0109:
            java.util.Map<java.lang.String, java.lang.String> r0 = r1.c
            java.lang.String r5 = "response_type"
            boolean r0 = r0.containsKey(r5)
            java.lang.String r7 = "id_token"
            if (r0 == 0) goto L_0x0124
            java.util.Map<java.lang.String, java.lang.String> r0 = r1.c
            java.lang.Object r0 = r0.get(r5)
            java.lang.String r0 = (java.lang.String) r0
            boolean r0 = r0.contains(r7)
            if (r0 == 0) goto L_0x0124
            r4 = r3
        L_0x0124:
            b.g.a.j.a r0 = new b.g.a.j.a
            if (r4 == 0) goto L_0x012f
            java.lang.Object r5 = r2.get(r7)
            r6 = r5
            java.lang.String r6 = (java.lang.String) r6
        L_0x012f:
            java.lang.String r5 = "access_token"
            java.lang.Object r5 = r2.get(r5)
            r13 = r5
            java.lang.String r13 = (java.lang.String) r13
            java.lang.String r5 = "token_type"
            java.lang.Object r5 = r2.get(r5)
            r14 = r5
            java.lang.String r14 = (java.lang.String) r14
            r15 = 0
            java.lang.String r5 = "scope"
            java.lang.Object r5 = r2.get(r5)
            r17 = r5
            java.lang.String r17 = (java.lang.String) r17
            r11 = r0
            r12 = r6
            r11.<init>(r12, r13, r14, r15, r16, r17)
            if (r4 == 0) goto L_0x015c
            b.g.a.h.n$a r4 = new b.g.a.h.n$a
            r4.<init>(r0, r2)
            r1.c(r6, r4)
            return r3
        L_0x015c:
            boolean r4 = r18.f()
            if (r4 != 0) goto L_0x0168
            b.g.a.h.d r2 = r1.f438b
            r2.a(r0)
            return r3
        L_0x0168:
            b.g.a.h.o r4 = r1.f441h
            java.lang.String r5 = "code"
            java.lang.Object r2 = r2.get(r5)
            java.lang.String r2 = (java.lang.String) r2
            b.g.a.h.n$b r5 = new b.g.a.h.n$b
            b.g.a.h.d r6 = r1.f438b
            r5.<init>(r6, r0)
            r4.a(r2, r5)
            return r3
        L_0x017d:
            java.lang.String r2 = f437k     // Catch:{ c -> 0x0198 }
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch:{ c -> 0x0198 }
            r5[r4] = r0     // Catch:{ c -> 0x0198 }
            r5[r3] = r6     // Catch:{ c -> 0x0198 }
            java.lang.String r0 = "Received state doesn't match. Received %s but expected %s"
            java.lang.String r0 = java.lang.String.format(r0, r5)     // Catch:{ c -> 0x0198 }
            android.util.Log.e(r2, r0)     // Catch:{ c -> 0x0198 }
            b.g.a.e.c r0 = new b.g.a.e.c     // Catch:{ c -> 0x0198 }
            java.lang.String r2 = "access_denied"
            java.lang.String r4 = "The received state is invalid. Try again."
            r0.<init>((java.lang.String) r2, (java.lang.String) r4)     // Catch:{ c -> 0x0198 }
            throw r0     // Catch:{ c -> 0x0198 }
        L_0x0198:
            r0 = move-exception
            b.g.a.h.d r2 = r1.f438b
            r2.b(r0)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: b.g.a.h.n.a(b.g.a.h.e):boolean");
    }

    public final void b(String str, String str2) {
        if (str != null) {
            Log.e(f437k, "Error, access denied. Check that the required Permissions are granted and that the Application has this Connection configured in Auth0 Dashboard.");
            if ("access_denied".equalsIgnoreCase(str)) {
                throw new b.g.a.e.c("access_denied", "Permissions were not granted. Try again.");
            } else if ("unauthorized".equalsIgnoreCase(str)) {
                throw new b.g.a.e.c("unauthorized", str2);
            } else if ("login_required".equals(str)) {
                throw new b.g.a.e.c(str, str2);
            } else {
                throw new b.g.a.e.c("a0.invalid_configuration", "The application isn't configured properly for the social connection. Please check your Auth0's application configuration");
            }
        }
    }

    /* JADX WARNING: type inference failed for: r1v9, types: [b.g.a.h.q, b.g.a.f.a] */
    public final void c(String str, b.g.a.f.a<Void, t> aVar) {
        t tVar;
        if (TextUtils.isEmpty(str)) {
            tVar = new t("ID token is required but missing");
        } else {
            try {
                e eVar = new e(str);
                c cVar = new c(aVar, eVar);
                String str2 = eVar.f418i.get("alg");
                if (this.a.d || "RS256".equals(str2)) {
                    b.g.a.e.b bVar = this.d;
                    o.b k2 = o.l(bVar.a.f405b.f6728i).k();
                    k2.b(".well-known");
                    k2.b("jwks.json");
                    o c2 = k2.c();
                    b.g.a.e.a aVar2 = new b.g.a.e.a(bVar);
                    i iVar = bVar.d;
                    r rVar = bVar.f406b;
                    k kVar = bVar.c;
                    b.g.a.i.b.a<b.g.a.e.c> aVar3 = bVar.f407e;
                    Objects.requireNonNull(iVar);
                    j jVar = new j(c2, rVar, kVar, "GET", aVar2, aVar3);
                    iVar.b(jVar);
                    jVar.c(new q(eVar.f418i.get("kid"), cVar));
                    return;
                }
                cVar.a(new b());
                return;
            } catch (d unused) {
                tVar = new t("ID token could not be decoded");
            }
        }
        aVar.b(tVar);
    }

    public final boolean f() {
        boolean z;
        if (this.c.containsKey("response_type") && this.c.get("response_type").contains("code")) {
            String str = o.f448e;
            a aVar = new a();
            try {
                aVar.b(aVar.a("test"));
                z = true;
            } catch (Exception unused) {
                z = false;
            }
            if (z) {
                return true;
            }
        }
        return false;
    }
}
