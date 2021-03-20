package b.l.b.a.a.b;

import b.l.b.a.b.i;
import com.google.api.client.auth.oauth2.TokenErrorResponse;

public class k extends i {

    /* renamed from: h  reason: collision with root package name */
    public final transient TokenErrorResponse f4714h;

    public k(i.a aVar, TokenErrorResponse tokenErrorResponse) {
        super(aVar);
        this.f4714h = tokenErrorResponse;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v1, resolved type: com.google.api.client.auth.oauth2.TokenErrorResponse} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v0, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v6, resolved type: com.google.api.client.auth.oauth2.TokenErrorResponse} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v14, resolved type: com.google.api.client.auth.oauth2.TokenErrorResponse} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v15, resolved type: java.lang.Object} */
    /* JADX WARNING: type inference failed for: r10v10, types: [com.google.api.client.auth.oauth2.TokenErrorResponse, b.l.b.a.c.b] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00b4  */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static b.l.b.a.a.b.k a(b.l.b.a.c.c r10, b.l.b.a.b.h r11) {
        /*
            b.l.b.a.b.i$a r0 = new b.l.b.a.b.i$a
            int r1 = r11.f
            java.lang.String r2 = r11.f4736g
            b.l.b.a.b.f r3 = r11.f4737h
            com.google.api.client.http.HttpHeaders r3 = r3.c
            r0.<init>(r1, r2, r3)
            java.util.Objects.requireNonNull(r10)
            java.lang.String r1 = r11.c
            r2 = 0
            boolean r3 = r11.e()     // Catch:{ IOException -> 0x00a4 }
            if (r3 != 0) goto L_0x009c
            if (r1 == 0) goto L_0x009c
            java.io.InputStream r3 = r11.b()     // Catch:{ IOException -> 0x00a4 }
            if (r3 == 0) goto L_0x009c
            java.lang.String r3 = "application/json; charset=UTF-8"
            boolean r1 = b.l.b.a.b.e.c(r3, r1)     // Catch:{ IOException -> 0x00a4 }
            if (r1 == 0) goto L_0x009c
            java.util.HashSet r1 = new java.util.HashSet     // Catch:{ IOException -> 0x00a4 }
            r1.<init>()     // Catch:{ IOException -> 0x00a4 }
            java.util.HashSet r3 = new java.util.HashSet     // Catch:{ IOException -> 0x00a4 }
            r3.<init>(r1)     // Catch:{ IOException -> 0x00a4 }
            java.io.InputStream r1 = r11.b()     // Catch:{ IOException -> 0x00a4 }
            java.nio.charset.Charset r4 = r11.c()     // Catch:{ IOException -> 0x00a4 }
            java.lang.Class<com.google.api.client.auth.oauth2.TokenErrorResponse> r5 = com.google.api.client.auth.oauth2.TokenErrorResponse.class
            b.l.b.a.c.f r10 = r10.b(r1, r4)     // Catch:{ IOException -> 0x00a4 }
            boolean r1 = r3.isEmpty()     // Catch:{ IOException -> 0x00a4 }
            r4 = 1
            if (r1 == 0) goto L_0x0049
            goto L_0x0084
        L_0x0049:
            b.l.b.a.c.i r1 = r10.e0()     // Catch:{ all -> 0x0093 }
        L_0x004d:
            b.l.b.a.c.i r6 = b.l.b.a.c.i.FIELD_NAME     // Catch:{ all -> 0x0093 }
            if (r1 != r6) goto L_0x006c
            java.lang.String r1 = r10.q()     // Catch:{ all -> 0x0093 }
            r10.z()     // Catch:{ all -> 0x0093 }
            boolean r6 = r3.contains(r1)     // Catch:{ all -> 0x0093 }
            if (r6 == 0) goto L_0x005f
            goto L_0x006d
        L_0x005f:
            r1 = r10
            b.l.b.a.c.j.c r1 = (b.l.b.a.c.j.c) r1     // Catch:{ all -> 0x0093 }
            b.j.a.b.i r1 = r1.f4768j     // Catch:{ all -> 0x0093 }
            r1.a1()     // Catch:{ all -> 0x0093 }
            b.l.b.a.c.i r1 = r10.z()     // Catch:{ all -> 0x0093 }
            goto L_0x004d
        L_0x006c:
            r1 = r2
        L_0x006d:
            r6 = 0
            if (r1 == 0) goto L_0x007a
            b.l.b.a.c.i r1 = r10.e()     // Catch:{ all -> 0x0093 }
            b.l.b.a.c.i r7 = b.l.b.a.c.i.END_OBJECT     // Catch:{ all -> 0x0093 }
            if (r1 == r7) goto L_0x007a
            r1 = r4
            goto L_0x007b
        L_0x007a:
            r1 = r6
        L_0x007b:
            java.lang.String r7 = "wrapper key(s) not found: %s"
            java.lang.Object[] r8 = new java.lang.Object[r4]     // Catch:{ all -> 0x0093 }
            r8[r6] = r3     // Catch:{ all -> 0x0093 }
            b.l.a.c.b.a.p(r1, r7, r8)     // Catch:{ all -> 0x0093 }
        L_0x0084:
            java.lang.Object r10 = r10.H(r5, r4, r2)     // Catch:{ IOException -> 0x00a4 }
            com.google.api.client.auth.oauth2.TokenErrorResponse r10 = (com.google.api.client.auth.oauth2.TokenErrorResponse) r10     // Catch:{ IOException -> 0x00a4 }
            java.lang.String r1 = r10.toPrettyString()     // Catch:{ IOException -> 0x0091 }
            r2 = r10
            r10 = r1
            goto L_0x00a0
        L_0x0091:
            r1 = move-exception
            goto L_0x00a7
        L_0x0093:
            r1 = move-exception
            b.l.b.a.c.j.c r10 = (b.l.b.a.c.j.c) r10     // Catch:{ IOException -> 0x00a4 }
            b.j.a.b.i r10 = r10.f4768j     // Catch:{ IOException -> 0x00a4 }
            r10.close()     // Catch:{ IOException -> 0x00a4 }
            throw r1     // Catch:{ IOException -> 0x00a4 }
        L_0x009c:
            java.lang.String r10 = r11.f()     // Catch:{ IOException -> 0x00a4 }
        L_0x00a0:
            r9 = r2
            r2 = r10
            r10 = r9
            goto L_0x00aa
        L_0x00a4:
            r10 = move-exception
            r1 = r10
            r10 = r2
        L_0x00a7:
            r1.printStackTrace()
        L_0x00aa:
            java.lang.StringBuilder r11 = b.l.b.a.b.i.computeMessageBuffer(r11)
            boolean r1 = b.l.a.c.b.a.g0(r2)
            if (r1 != 0) goto L_0x00be
            java.lang.String r1 = b.l.b.a.d.w.a
            r11.append(r1)
            r11.append(r2)
            r0.d = r2
        L_0x00be:
            java.lang.String r11 = r11.toString()
            r0.f4742e = r11
            b.l.b.a.a.b.k r11 = new b.l.b.a.a.b.k
            r11.<init>(r0, r10)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: b.l.b.a.a.b.k.a(b.l.b.a.c.c, b.l.b.a.b.h):b.l.b.a.a.b.k");
    }
}
