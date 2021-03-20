package com.wuman.android.auth.oauth2.explicit;

import b.l.b.a.c.c;
import com.google.api.client.auth.oauth2.AuthorizationCodeTokenRequest;
import com.google.api.client.http.HttpTransport;
import java.util.logging.Logger;

public class LenientAuthorizationCodeTokenRequest extends AuthorizationCodeTokenRequest {
    static {
        Logger.getLogger("OAuthAndroid");
    }

    public LenientAuthorizationCodeTokenRequest(HttpTransport httpTransport, c cVar, b.l.b.a.b.c cVar2, String str) {
        super(httpTransport, cVar, cVar2, str);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v9, resolved type: com.google.api.client.auth.oauth2.TokenErrorResponse} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v0, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v11, resolved type: com.google.api.client.auth.oauth2.TokenErrorResponse} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v12, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v14, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v23, resolved type: com.google.api.client.auth.oauth2.TokenErrorResponse} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v24, resolved type: java.lang.Object} */
    /* JADX WARNING: type inference failed for: r0v17, types: [com.google.api.client.auth.oauth2.TokenErrorResponse, b.l.b.a.c.b] */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0054, code lost:
        if (r2 != 304) goto L_0x005a;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00e6  */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.api.client.auth.oauth2.TokenResponse execute() {
        /*
            r9 = this;
            com.google.api.client.http.HttpTransport r0 = r9.transport
            com.wuman.android.auth.oauth2.explicit.LenientAuthorizationCodeTokenRequest$1 r1 = new com.wuman.android.auth.oauth2.explicit.LenientAuthorizationCodeTokenRequest$1
            r1.<init>()
            java.util.Objects.requireNonNull(r0)
            b.l.b.a.b.c r2 = r9.tokenServerUrl
            b.l.b.a.b.n r3 = new b.l.b.a.b.n
            r3.<init>(r9)
            b.l.b.a.b.f r4 = new b.l.b.a.b.f
            r5 = 0
            r4.<init>(r0, r5)
            r1.initialize(r4)
            java.lang.String r0 = "POST"
            r4.d(r0)
            if (r2 == 0) goto L_0x0023
            r4.f4727k = r2
        L_0x0023:
            r4.f4724h = r3
            b.l.b.a.c.e r0 = new b.l.b.a.c.e
            b.l.b.a.c.c r1 = r9.jsonFactory
            r0.<init>(r1)
            r4.f4731o = r0
            r0 = 0
            r4.f4733q = r0
            b.l.b.a.b.h r1 = r4.b()
            boolean r2 = r1.e()
            if (r2 == 0) goto L_0x0111
            int r2 = r1.f
            b.l.b.a.b.f r3 = r1.f4737h
            java.lang.String r3 = r3.f4726j
            java.lang.String r4 = "HEAD"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L_0x0056
            int r3 = r2 / 100
            r4 = 1
            if (r3 == r4) goto L_0x0056
            r3 = 204(0xcc, float:2.86E-43)
            if (r2 == r3) goto L_0x0056
            r3 = 304(0x130, float:4.26E-43)
            if (r2 != r3) goto L_0x005a
        L_0x0056:
            r1.d()
            r4 = r0
        L_0x005a:
            if (r4 != 0) goto L_0x005e
            goto L_0x0110
        L_0x005e:
            java.io.InputStream r2 = r1.b()
            if (r2 != 0) goto L_0x0067
            java.lang.String r0 = ""
            goto L_0x007b
        L_0x0067:
            java.io.ByteArrayOutputStream r3 = new java.io.ByteArrayOutputStream
            r3.<init>()
            b.l.b.a.d.l.a(r2, r3, r0)
            java.nio.charset.Charset r0 = r1.c()
            java.lang.String r0 = r0.name()
            java.lang.String r0 = r3.toString(r0)
        L_0x007b:
            b.l.b.a.b.f r2 = r1.f4737h
            b.l.b.a.d.t r2 = r2.f4731o
            java.io.StringReader r3 = new java.io.StringReader
            r3.<init>(r0)
            java.lang.Class<com.google.api.client.auth.oauth2.TokenResponse> r4 = com.google.api.client.auth.oauth2.TokenResponse.class
            b.l.b.a.c.e r2 = (b.l.b.a.c.e) r2
            java.lang.Object r2 = r2.b(r3, r4)
            com.google.api.client.auth.oauth2.TokenResponse r2 = (com.google.api.client.auth.oauth2.TokenResponse) r2
            java.lang.String r3 = "error"
            boolean r2 = r2.containsKey(r3)
            if (r2 == 0) goto L_0x00fc
            b.l.b.a.c.c r2 = r9.jsonFactory
            int r3 = com.wuman.android.auth.oauth2.explicit.LenientTokenResponseException.f7404h
            b.l.b.a.b.i$a r3 = new b.l.b.a.b.i$a
            int r4 = r1.f
            java.lang.String r6 = r1.f4736g
            b.l.b.a.b.f r7 = r1.f4737h
            com.google.api.client.http.HttpHeaders r7 = r7.c
            r3.<init>(r4, r6, r7)
            java.util.Objects.requireNonNull(r2)
            java.lang.String r2 = r1.c
            if (r2 == 0) goto L_0x00d9
            java.lang.String r4 = "application/json; charset=UTF-8"
            boolean r2 = b.l.b.a.b.e.c(r4, r2)     // Catch:{ IOException -> 0x00d2 }
            if (r2 == 0) goto L_0x00d9
            b.l.b.a.b.f r2 = r1.f4737h     // Catch:{ IOException -> 0x00d2 }
            b.l.b.a.d.t r2 = r2.f4731o     // Catch:{ IOException -> 0x00d2 }
            java.io.StringReader r4 = new java.io.StringReader     // Catch:{ IOException -> 0x00d2 }
            r4.<init>(r0)     // Catch:{ IOException -> 0x00d2 }
            java.lang.Class<com.google.api.client.auth.oauth2.TokenErrorResponse> r0 = com.google.api.client.auth.oauth2.TokenErrorResponse.class
            b.l.b.a.c.e r2 = (b.l.b.a.c.e) r2
            java.lang.Object r0 = r2.b(r4, r0)     // Catch:{ IOException -> 0x00d2 }
            com.google.api.client.auth.oauth2.TokenErrorResponse r0 = (com.google.api.client.auth.oauth2.TokenErrorResponse) r0     // Catch:{ IOException -> 0x00d2 }
            java.lang.String r2 = r0.toPrettyString()     // Catch:{ IOException -> 0x00d0 }
            r5 = r0
            r0 = r2
            goto L_0x00d9
        L_0x00d0:
            r2 = move-exception
            goto L_0x00d5
        L_0x00d2:
            r0 = move-exception
            r2 = r0
            r0 = r5
        L_0x00d5:
            r2.printStackTrace()
            goto L_0x00dc
        L_0x00d9:
            r8 = r5
            r5 = r0
            r0 = r8
        L_0x00dc:
            java.lang.StringBuilder r1 = b.l.b.a.b.i.computeMessageBuffer(r1)
            boolean r2 = b.l.a.c.b.a.g0(r5)
            if (r2 != 0) goto L_0x00f0
            java.lang.String r2 = b.l.b.a.d.w.a
            r1.append(r2)
            r1.append(r5)
            r3.d = r5
        L_0x00f0:
            java.lang.String r1 = r1.toString()
            r3.f4742e = r1
            com.wuman.android.auth.oauth2.explicit.LenientTokenResponseException r1 = new com.wuman.android.auth.oauth2.explicit.LenientTokenResponseException
            r1.<init>(r3, r0)
            throw r1
        L_0x00fc:
            b.l.b.a.b.f r1 = r1.f4737h
            b.l.b.a.d.t r1 = r1.f4731o
            java.io.StringReader r2 = new java.io.StringReader
            r2.<init>(r0)
            java.lang.Class<com.google.api.client.auth.oauth2.TokenResponse> r0 = com.google.api.client.auth.oauth2.TokenResponse.class
            b.l.b.a.c.e r1 = (b.l.b.a.c.e) r1
            java.lang.Object r0 = r1.b(r2, r0)
            r5 = r0
            com.google.api.client.auth.oauth2.TokenResponse r5 = (com.google.api.client.auth.oauth2.TokenResponse) r5
        L_0x0110:
            return r5
        L_0x0111:
            b.l.b.a.c.c r0 = r9.jsonFactory
            b.l.b.a.a.b.k r0 = b.l.b.a.a.b.k.a(r0, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.wuman.android.auth.oauth2.explicit.LenientAuthorizationCodeTokenRequest.execute():com.google.api.client.auth.oauth2.TokenResponse");
    }
}
