package b.l.b.a.b;

import b.l.b.a.d.t;
import b.l.b.a.d.u;
import b.q.a.a;
import com.google.api.client.http.HttpHeaders;
import com.google.api.client.http.HttpTransport;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Objects;
import l.b.c.b;
import l.b.c.o;
import l.b.c.v;

public final class f {
    public static final String t;
    public static final String u;
    public d a;

    /* renamed from: b  reason: collision with root package name */
    public HttpHeaders f4721b = new HttpHeaders();
    public HttpHeaders c = new HttpHeaders();
    public int d = 10;

    /* renamed from: e  reason: collision with root package name */
    public int f4722e = 16384;
    public boolean f = true;

    /* renamed from: g  reason: collision with root package name */
    public boolean f4723g = true;

    /* renamed from: h  reason: collision with root package name */
    public a f4724h;

    /* renamed from: i  reason: collision with root package name */
    public final HttpTransport f4725i;

    /* renamed from: j  reason: collision with root package name */
    public String f4726j;

    /* renamed from: k  reason: collision with root package name */
    public c f4727k;

    /* renamed from: l  reason: collision with root package name */
    public int f4728l = 20000;

    /* renamed from: m  reason: collision with root package name */
    public int f4729m = 20000;

    /* renamed from: n  reason: collision with root package name */
    public j f4730n;

    /* renamed from: o  reason: collision with root package name */
    public t f4731o;

    /* renamed from: p  reason: collision with root package name */
    public boolean f4732p = true;

    /* renamed from: q  reason: collision with root package name */
    public boolean f4733q = true;
    public u r = u.a;
    public final v s = m.c;

    /* JADX WARNING: Code restructure failed: missing block: B:11:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0026, code lost:
        throw r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001d, code lost:
        r3 = move-exception;
     */
    static {
        /*
            java.lang.String r0 = "unknown-version"
            java.lang.Class<b.l.b.a.b.f> r1 = b.l.b.a.b.f.class
            java.lang.String r2 = "/google-http-client.properties"
            java.io.InputStream r1 = r1.getResourceAsStream(r2)     // Catch:{ IOException -> 0x002c }
            if (r1 == 0) goto L_0x0027
            java.util.Properties r2 = new java.util.Properties     // Catch:{ all -> 0x001b }
            r2.<init>()     // Catch:{ all -> 0x001b }
            r2.load(r1)     // Catch:{ all -> 0x001b }
            java.lang.String r3 = "google-http-client.version"
            java.lang.String r0 = r2.getProperty(r3)     // Catch:{ all -> 0x001b }
            goto L_0x0027
        L_0x001b:
            r2 = move-exception
            throw r2     // Catch:{ all -> 0x001d }
        L_0x001d:
            r3 = move-exception
            r1.close()     // Catch:{ all -> 0x0022 }
            goto L_0x0026
        L_0x0022:
            r1 = move-exception
            r2.addSuppressed(r1)     // Catch:{ IOException -> 0x002c }
        L_0x0026:
            throw r3     // Catch:{ IOException -> 0x002c }
        L_0x0027:
            if (r1 == 0) goto L_0x002c
            r1.close()     // Catch:{ IOException -> 0x002c }
        L_0x002c:
            t = r0
            java.lang.String r1 = "Google-HTTP-Java-Client/"
            java.lang.String r2 = " (gzip)"
            java.lang.String r0 = b.e.a.a.a.n(r1, r0, r2)
            u = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: b.l.b.a.b.f.<clinit>():void");
    }

    public f(HttpTransport httpTransport, String str) {
        this.f4725i = httpTransport;
        d((String) null);
    }

    public static void a(o oVar, String str, String str2) {
        if (str2 != null) {
            a.x(str2, "stringValue");
            oVar.d(str, new b(str2));
        }
    }

    /* JADX WARNING: type inference failed for: r12v4, types: [b.l.b.a.d.r] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x02ac  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public b.l.b.a.b.h b() {
        /*
            r25 = this;
            r1 = r25
            java.lang.String r2 = "options"
            int r0 = r1.d
            r3 = 1
            r4 = 0
            if (r0 < 0) goto L_0x000c
            r0 = r3
            goto L_0x000d
        L_0x000c:
            r0 = r4
        L_0x000d:
            b.l.a.c.b.a.q(r0)
            int r0 = r1.d
            java.lang.String r5 = r1.f4726j
            java.util.Objects.requireNonNull(r5)
            b.l.b.a.b.c r5 = r1.f4727k
            java.util.Objects.requireNonNull(r5)
            l.b.c.v r5 = r1.s
            java.lang.String r6 = b.l.b.a.b.m.f4744b
            java.util.Objects.requireNonNull(r5)
            l.a.b r5 = l.a.b.e()
            l.a.b$c<l.b.c.o> r7 = l.b.c.a0.a.a
            java.lang.String r8 = "context"
            b.q.a.a.x(r5, r8)
            java.util.Objects.requireNonNull(r7)
            l.a.c<l.a.b$c<?>, java.lang.Object> r5 = r5.f8102j
            l.a.c$d<K, V> r5 = r5.a
            if (r5 != 0) goto L_0x0039
            r5 = 0
            goto L_0x0041
        L_0x0039:
            int r8 = r7.hashCode()
            java.lang.Object r5 = r5.a(r7, r8, r4)
        L_0x0041:
            if (r5 != 0) goto L_0x0044
            r5 = 0
        L_0x0044:
            l.b.c.o r5 = (l.b.c.o) r5
            if (r5 != 0) goto L_0x004a
            l.b.c.i r5 = l.b.c.i.f8114e
        L_0x004a:
            java.lang.String r5 = "name"
            b.q.a.a.x(r6, r5)
            boolean r5 = b.l.b.a.b.m.f4745e
            l.b.c.i r5 = l.b.c.i.f8114e
            r6 = 0
        L_0x0054:
            java.lang.String r7 = "retry #"
            java.lang.StringBuilder r7 = b.e.a.a.a.y(r7)
            int r8 = r1.d
            int r8 = r8 - r0
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            java.util.Objects.requireNonNull(r5)
            java.lang.String r8 = "description"
            b.q.a.a.x(r7, r8)
            java.util.Map<java.lang.String, l.b.c.a> r8 = l.b.c.o.c
            r5.f(r7, r8)
            if (r6 == 0) goto L_0x0076
            r6.d()
        L_0x0076:
            b.l.b.a.b.d r6 = r1.a
            if (r6 == 0) goto L_0x007d
            r6.intercept(r1)
        L_0x007d:
            b.l.b.a.b.c r6 = r1.f4727k
            java.lang.String r6 = r6.build()
            java.lang.String r7 = r1.f4726j
            java.lang.String r8 = "http.method"
            a(r5, r8, r7)
            b.l.b.a.b.c r7 = r1.f4727k
            java.lang.String r7 = r7.host
            java.lang.String r8 = "http.host"
            a(r5, r8, r7)
            b.l.b.a.b.c r7 = r1.f4727k
            java.util.List<java.lang.String> r8 = r7.pathParts
            if (r8 != 0) goto L_0x009b
            r7 = 0
            goto L_0x00a7
        L_0x009b:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r7.appendRawPathFromParts(r8)
            java.lang.String r7 = r8.toString()
        L_0x00a7:
            java.lang.String r8 = "http.path"
            a(r5, r8, r7)
            java.lang.String r7 = "http.url"
            a(r5, r7, r6)
            com.google.api.client.http.HttpTransport r7 = r1.f4725i
            java.lang.String r8 = r1.f4726j
            b.l.b.a.b.k r7 = r7.a(r8, r6)
            java.util.logging.Logger r8 = com.google.api.client.http.HttpTransport.a
            boolean r9 = r1.f
            if (r9 == 0) goto L_0x00ca
            java.util.logging.Level r9 = java.util.logging.Level.CONFIG
            boolean r9 = r8.isLoggable(r9)
            if (r9 == 0) goto L_0x00ca
            r16 = r3
            goto L_0x00cc
        L_0x00ca:
            r16 = r4
        L_0x00cc:
            if (r16 == 0) goto L_0x010b
            java.lang.String r9 = "-------------- REQUEST  --------------"
            java.lang.StringBuilder r9 = b.e.a.a.a.y(r9)
            java.lang.String r10 = b.l.b.a.d.w.a
            r9.append(r10)
            java.lang.String r11 = r1.f4726j
            r9.append(r11)
            r11 = 32
            r9.append(r11)
            r9.append(r6)
            r9.append(r10)
            boolean r10 = r1.f4723g
            if (r10 == 0) goto L_0x0109
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r11 = "curl -v --compressed"
            r10.<init>(r11)
            java.lang.String r11 = r1.f4726j
            java.lang.String r12 = "GET"
            boolean r11 = r11.equals(r12)
            if (r11 != 0) goto L_0x010d
            java.lang.String r11 = " -X "
            r10.append(r11)
            java.lang.String r11 = r1.f4726j
            r10.append(r11)
            goto L_0x010d
        L_0x0109:
            r10 = 0
            goto L_0x010d
        L_0x010b:
            r10 = 0
            r9 = 0
        L_0x010d:
            r15 = r9
            r14 = r10
            com.google.api.client.http.HttpHeaders r9 = r1.f4721b
            java.lang.String r13 = r9.j()
            java.lang.String r9 = "http.user_agent"
            if (r13 != 0) goto L_0x0124
            com.google.api.client.http.HttpHeaders r10 = r1.f4721b
            java.lang.String r11 = u
            r10.u(r11)
            a(r5, r9, r11)
            goto L_0x013b
        L_0x0124:
            java.lang.String r10 = " "
            java.lang.StringBuilder r10 = b.e.a.a.a.B(r13, r10)
            java.lang.String r11 = u
            r10.append(r11)
            java.lang.String r10 = r10.toString()
            com.google.api.client.http.HttpHeaders r11 = r1.f4721b
            r11.u(r10)
            a(r5, r9, r10)
        L_0x013b:
            com.google.api.client.http.HttpHeaders r9 = r1.f4721b
            java.lang.String r10 = "span should not be null."
            b.l.a.c.b.a.o(r3, r10)
            if (r9 == 0) goto L_0x0146
            r10 = r3
            goto L_0x0147
        L_0x0146:
            r10 = r4
        L_0x0147:
            java.lang.String r11 = "headers should not be null."
            b.l.a.c.b.a.o(r10, r11)
            l.b.c.z.a r10 = b.l.b.a.b.m.f
            if (r10 == 0) goto L_0x0165
            l.b.c.z.a$a r10 = b.l.b.a.b.m.f4746g
            if (r10 == 0) goto L_0x0165
            l.b.c.i r10 = l.b.c.i.f8114e
            boolean r10 = r5.equals(r10)
            if (r10 != 0) goto L_0x0165
            l.b.c.z.a r10 = b.l.b.a.b.m.f
            l.b.c.p r11 = r5.a
            l.b.c.z.a$a r12 = b.l.b.a.b.m.f4746g
            r10.a(r11, r9, r12)
        L_0x0165:
            com.google.api.client.http.HttpHeaders r12 = r1.f4721b
            java.util.HashSet r11 = new java.util.HashSet
            r11.<init>()
            java.util.Set r9 = r12.entrySet()
            java.util.Iterator r17 = r9.iterator()
        L_0x0174:
            boolean r9 = r17.hasNext()
            if (r9 == 0) goto L_0x021d
            java.lang.Object r9 = r17.next()
            java.util.Map$Entry r9 = (java.util.Map.Entry) r9
            java.lang.Object r10 = r9.getKey()
            java.lang.String r10 = (java.lang.String) r10
            r18 = r13
            boolean r13 = r11.add(r10)
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r3[r4] = r10
            java.lang.String r4 = "multiple headers of the same name (headers are case insensitive): %s"
            b.l.a.c.b.a.p(r13, r4, r3)
            java.lang.Object r3 = r9.getValue()
            if (r3 == 0) goto L_0x0207
            b.l.b.a.d.e r4 = r12.classInfo
            b.l.b.a.d.j r4 = r4.a(r10)
            if (r4 == 0) goto L_0x01a6
            java.lang.String r4 = r4.d
            goto L_0x01a7
        L_0x01a6:
            r4 = r10
        L_0x01a7:
            java.lang.Class r9 = r3.getClass()
            boolean r10 = r3 instanceof java.lang.Iterable
            if (r10 != 0) goto L_0x01cc
            boolean r9 = r9.isArray()
            if (r9 == 0) goto L_0x01b6
            goto L_0x01cc
        L_0x01b6:
            r19 = 0
            r9 = r8
            r10 = r15
            r20 = r11
            r11 = r14
            r21 = r12
            r12 = r7
            r22 = r18
            r13 = r4
            r4 = r14
            r14 = r3
            r3 = r15
            r15 = r19
            com.google.api.client.http.HttpHeaders.a(r9, r10, r11, r12, r13, r14, r15)
            goto L_0x020f
        L_0x01cc:
            r20 = r11
            r21 = r12
            r22 = r18
            r24 = r15
            r15 = r14
            r14 = r24
            java.lang.Iterable r3 = b.l.b.a.d.l.l(r3)
            java.util.Iterator r3 = r3.iterator()
        L_0x01df:
            boolean r9 = r3.hasNext()
            if (r9 == 0) goto L_0x0204
            java.lang.Object r18 = r3.next()
            r19 = 0
            r9 = r8
            r10 = r14
            r11 = r15
            r12 = r7
            r13 = r4
            r23 = r3
            r3 = r14
            r14 = r18
            r18 = r4
            r4 = r15
            r15 = r19
            com.google.api.client.http.HttpHeaders.a(r9, r10, r11, r12, r13, r14, r15)
            r14 = r3
            r15 = r4
            r4 = r18
            r3 = r23
            goto L_0x01df
        L_0x0204:
            r3 = r14
            r4 = r15
            goto L_0x020f
        L_0x0207:
            r20 = r11
            r21 = r12
            r4 = r14
            r3 = r15
            r22 = r18
        L_0x020f:
            r9 = 1
            r10 = 0
            r15 = r3
            r14 = r4
            r3 = r9
            r4 = r10
            r11 = r20
            r12 = r21
            r13 = r22
            goto L_0x0174
        L_0x021d:
            r22 = r13
            r4 = r14
            r3 = r15
            com.google.api.client.http.HttpHeaders r9 = r1.f4721b
            r10 = r22
            r9.u(r10)
            b.l.b.a.b.a r9 = r1.f4724h
            java.lang.String r10 = "'"
            if (r9 == 0) goto L_0x02d9
            b.l.b.a.b.e r11 = r9.a
            if (r11 != 0) goto L_0x0234
            r11 = 0
            goto L_0x0238
        L_0x0234:
            java.lang.String r11 = r11.a()
        L_0x0238:
            if (r16 == 0) goto L_0x0246
            b.l.b.a.d.r r12 = new b.l.b.a.d.r
            java.util.logging.Logger r13 = com.google.api.client.http.HttpTransport.a
            java.util.logging.Level r14 = java.util.logging.Level.CONFIG
            int r15 = r1.f4722e
            r12.<init>(r9, r13, r14, r15)
            r9 = r12
        L_0x0246:
            b.l.b.a.b.a r12 = r1.f4724h
            long r13 = r12.f4715b
            r17 = -1
            int r13 = (r13 > r17 ? 1 : (r13 == r17 ? 0 : -1))
            if (r13 != 0) goto L_0x0269
            b.l.b.a.d.c r13 = new b.l.b.a.d.c
            r13.<init>()
            r14 = r12
            b.l.b.a.b.n r14 = (b.l.b.a.b.n) r14
            r14.a(r13)     // Catch:{ all -> 0x0263 }
            r13.close()
            long r13 = r13.f4780h
            r12.f4715b = r13
            goto L_0x0269
        L_0x0263:
            r0 = move-exception
            r2 = r0
            r13.close()
            throw r2
        L_0x0269:
            long r12 = r12.f4715b
            if (r16 == 0) goto L_0x02c6
            if (r11 == 0) goto L_0x02a4
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            java.lang.String r15 = "Content-Type: "
            r14.append(r15)
            r14.append(r11)
            java.lang.String r14 = r14.toString()
            r3.append(r14)
            java.lang.String r15 = b.l.b.a.d.w.a
            r3.append(r15)
            if (r4 == 0) goto L_0x02a4
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
            r17 = r2
            java.lang.String r2 = " -H '"
            r15.append(r2)
            r15.append(r14)
            r15.append(r10)
            java.lang.String r2 = r15.toString()
            r4.append(r2)
            goto L_0x02a6
        L_0x02a4:
            r17 = r2
        L_0x02a6:
            r14 = 0
            int r2 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r2 < 0) goto L_0x02c8
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r14 = "Content-Length: "
            r2.append(r14)
            r2.append(r12)
            java.lang.String r2 = r2.toString()
            r3.append(r2)
            java.lang.String r2 = b.l.b.a.d.w.a
            r3.append(r2)
            goto L_0x02c8
        L_0x02c6:
            r17 = r2
        L_0x02c8:
            if (r4 == 0) goto L_0x02cf
            java.lang.String r2 = " -d '@-'"
            r4.append(r2)
        L_0x02cf:
            r7.c = r11
            r2 = 0
            r7.f4743b = r2
            r7.a = r12
            r7.d = r9
            goto L_0x02db
        L_0x02d9:
            r17 = r2
        L_0x02db:
            if (r16 == 0) goto L_0x0305
            java.lang.String r2 = r3.toString()
            r8.config(r2)
            if (r4 == 0) goto L_0x0305
            java.lang.String r2 = " -- '"
            r4.append(r2)
            java.lang.String r2 = "'\"'\"'"
            java.lang.String r2 = r6.replaceAll(r10, r2)
            r4.append(r2)
            r4.append(r10)
            if (r9 == 0) goto L_0x02fe
            java.lang.String r2 = " << $$$"
            r4.append(r2)
        L_0x02fe:
            java.lang.String r2 = r4.toString()
            r8.config(r2)
        L_0x0305:
            if (r0 <= 0) goto L_0x0309
            r2 = 1
            goto L_0x030a
        L_0x0309:
            r2 = 0
        L_0x030a:
            int r3 = r1.f4728l
            int r4 = r1.f4729m
            r7.c(r3, r4)
            r4 = 0
            r7.d(r4)
            l.b.c.v r3 = r1.s
            java.util.Objects.requireNonNull(r3)
            java.lang.String r3 = "span"
            b.q.a.a.x(r5, r3)
            l.b.c.k r3 = new l.b.c.k
            r6 = 0
            r3.<init>(r5, r4, r6)
            long r8 = r7.a
            l.b.c.m$b r6 = l.b.c.m.b.SENT
            b.l.b.a.b.m.b(r5, r8, r6)
            b.l.b.a.b.l r6 = r7.b()     // Catch:{ IOException -> 0x03b1 }
            if (r6 == 0) goto L_0x033b
            long r7 = r6.d()     // Catch:{ IOException -> 0x03b1 }
            l.b.c.m$b r9 = l.b.c.m.b.RECEIVED     // Catch:{ IOException -> 0x03b1 }
            b.l.b.a.b.m.b(r5, r7, r9)     // Catch:{ IOException -> 0x03b1 }
        L_0x033b:
            b.l.b.a.b.h r7 = new b.l.b.a.b.h     // Catch:{ all -> 0x03a0 }
            r7.<init>(r1, r6)     // Catch:{ all -> 0x03a0 }
            r3.close()
            boolean r3 = r7.e()     // Catch:{ all -> 0x039b }
            if (r3 != 0) goto L_0x0369
            b.l.b.a.b.j r3 = r1.f4730n     // Catch:{ all -> 0x039b }
            if (r3 == 0) goto L_0x0352
            boolean r3 = r3.handleResponse(r1, r7, r2)     // Catch:{ all -> 0x039b }
            goto L_0x0353
        L_0x0352:
            r3 = r4
        L_0x0353:
            if (r3 != 0) goto L_0x0362
            int r6 = r7.f     // Catch:{ all -> 0x039b }
            b.l.b.a.b.f r8 = r7.f4737h     // Catch:{ all -> 0x039b }
            com.google.api.client.http.HttpHeaders r8 = r8.c     // Catch:{ all -> 0x039b }
            boolean r6 = r1.c(r6, r8)     // Catch:{ all -> 0x039b }
            if (r6 == 0) goto L_0x0362
            r3 = 1
        L_0x0362:
            r2 = r2 & r3
            if (r2 == 0) goto L_0x036b
            r7.d()     // Catch:{ all -> 0x039b }
            goto L_0x036b
        L_0x0369:
            r2 = r2 & 0
        L_0x036b:
            int r0 = r0 + -1
            if (r2 != 0) goto L_0x0395
            int r0 = r7.f
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            l.b.c.l r0 = b.l.b.a.b.m.a(r0)
            r2 = r17
            b.q.a.a.x(r0, r2)
            boolean r0 = r1.f4733q
            if (r0 == 0) goto L_0x0394
            boolean r0 = r7.e()
            if (r0 == 0) goto L_0x0389
            goto L_0x0394
        L_0x0389:
            b.l.b.a.b.i r0 = new b.l.b.a.b.i     // Catch:{ all -> 0x038f }
            r0.<init>((b.l.b.a.b.h) r7)     // Catch:{ all -> 0x038f }
            throw r0     // Catch:{ all -> 0x038f }
        L_0x038f:
            r0 = move-exception
            r7.a()
            throw r0
        L_0x0394:
            return r7
        L_0x0395:
            r2 = r17
            r3 = 1
            r6 = r7
            goto L_0x0054
        L_0x039b:
            r0 = move-exception
            r7.a()
            throw r0
        L_0x03a0:
            r0 = move-exception
            r2 = r17
            java.io.InputStream r4 = r6.b()     // Catch:{ IOException -> 0x03ad }
            if (r4 == 0) goto L_0x03ac
            r4.close()     // Catch:{ IOException -> 0x03ad }
        L_0x03ac:
            throw r0     // Catch:{ IOException -> 0x03ad }
        L_0x03ad:
            r0 = move-exception
            goto L_0x03b4
        L_0x03af:
            r0 = move-exception
            goto L_0x03bd
        L_0x03b1:
            r0 = move-exception
            r2 = r17
        L_0x03b4:
            r4 = 0
            l.b.c.l r4 = b.l.b.a.b.m.a(r4)     // Catch:{ all -> 0x03af }
            b.q.a.a.x(r4, r2)     // Catch:{ all -> 0x03af }
            throw r0     // Catch:{ all -> 0x03af }
        L_0x03bd:
            r3.close()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: b.l.b.a.b.f.b():b.l.b.a.b.h");
    }

    public boolean c(int i2, HttpHeaders httpHeaders) {
        boolean z;
        String i3 = httpHeaders.i();
        if (this.f4732p) {
            if (!(i2 == 307 || i2 == 308)) {
                switch (i2) {
                    case 301:
                    case 302:
                    case 303:
                        break;
                    default:
                        z = false;
                        break;
                }
            }
            z = true;
            if (z && i3 != null) {
                c cVar = this.f4727k;
                Objects.requireNonNull(cVar);
                try {
                    this.f4727k = new c(new URL(new URL(cVar.build()), i3), false);
                    if (i2 == 303) {
                        d("GET");
                        this.f4724h = null;
                    }
                    this.f4721b.o((String) null);
                    this.f4721b.p((String) null);
                    this.f4721b.r((String) null);
                    this.f4721b.q((String) null);
                    this.f4721b.t((String) null);
                    this.f4721b.s((String) null);
                    return true;
                } catch (MalformedURLException e2) {
                    throw new IllegalArgumentException(e2);
                } catch (MalformedURLException e3) {
                    throw new IllegalArgumentException(e3);
                }
            }
        }
        return false;
    }

    public f d(String str) {
        b.l.a.c.b.a.q(str == null || e.f.matcher(str).matches());
        this.f4726j = str;
        return this;
    }
}
