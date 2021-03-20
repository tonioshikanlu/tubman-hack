package b.o;

import org.json.JSONObject;

public final class h3 implements Runnable {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ Thread[] f6110h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ String f6111i;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ String f6112j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ JSONObject f6113k;

    /* renamed from: l  reason: collision with root package name */
    public final /* synthetic */ l3 f6114l;

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ int f6115m;

    /* renamed from: n  reason: collision with root package name */
    public final /* synthetic */ String f6116n;

    public h3(Thread[] threadArr, String str, String str2, JSONObject jSONObject, l3 l3Var, int i2, String str3) {
        this.f6110h = threadArr;
        this.f6111i = str;
        this.f6112j = str2;
        this.f6113k = jSONObject;
        this.f6114l = l3Var;
        this.f6115m = i2;
        this.f6116n = str3;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v0, resolved type: java.lang.Thread[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v1, resolved type: java.lang.Thread} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v1, resolved type: java.lang.Thread[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v2, resolved type: java.lang.Thread} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v2, resolved type: java.lang.Thread[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v3, resolved type: java.lang.Thread} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v4, resolved type: java.lang.Thread} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v5, resolved type: java.lang.Thread} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v5, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v6, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v3, resolved type: java.lang.Thread[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v4, resolved type: java.lang.Thread[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v5, resolved type: java.lang.Thread[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v6, resolved type: java.lang.Thread[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v7, resolved type: java.lang.Thread[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v8, resolved type: java.lang.Thread[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v9, resolved type: java.lang.Thread[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v12, resolved type: java.lang.Thread} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v13, resolved type: java.lang.Thread} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v14, resolved type: java.lang.Thread} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x02c7 A[Catch:{ all -> 0x0320 }] */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x0306 A[Catch:{ all -> 0x0320 }] */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x0308 A[Catch:{ all -> 0x0320 }] */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x0318  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r21 = this;
            r1 = r21
            java.lang.Thread[] r2 = r1.f6110h
            java.lang.String r0 = r1.f6111i
            java.lang.String r3 = r1.f6112j
            org.json.JSONObject r4 = r1.f6113k
            b.o.l3 r5 = r1.f6114l
            int r6 = r1.f6115m
            java.lang.String r7 = r1.f6116n
            java.lang.String r8 = "OS_REST_FAILURE_CALLBACK"
            b.o.i2$k r9 = b.o.i2.k.WARN
            java.lang.String r10 = "OneSignalRestClient: "
            int r11 = android.os.Build.VERSION.SDK_INT
            r12 = 26
            if (r11 < r12) goto L_0x0021
            r11 = 10000(0x2710, float:1.4013E-41)
            android.net.TrafficStats.setThreadStatsTag(r11)
        L_0x0021:
            r12 = 0
            r13 = 0
            b.o.i2$k r14 = b.o.i2.k.DEBUG     // Catch:{ all -> 0x02be }
            java.lang.StringBuilder r15 = new java.lang.StringBuilder     // Catch:{ all -> 0x02be }
            r15.<init>()     // Catch:{ all -> 0x02be }
            java.lang.String r11 = "OneSignalRestClient: Making request to: https://api.onesignal.com/"
            r15.append(r11)     // Catch:{ all -> 0x02be }
            r15.append(r0)     // Catch:{ all -> 0x02be }
            java.lang.String r11 = r15.toString()     // Catch:{ all -> 0x02be }
            b.o.i2.a(r14, r11, r13)     // Catch:{ all -> 0x02be }
            java.net.URL r11 = new java.net.URL     // Catch:{ all -> 0x02be }
            java.lang.StringBuilder r15 = new java.lang.StringBuilder     // Catch:{ all -> 0x02be }
            r15.<init>()     // Catch:{ all -> 0x02be }
            java.lang.String r13 = "https://api.onesignal.com/"
            r15.append(r13)     // Catch:{ all -> 0x02be }
            r15.append(r0)     // Catch:{ all -> 0x02be }
            java.lang.String r13 = r15.toString()     // Catch:{ all -> 0x02be }
            r11.<init>(r13)     // Catch:{ all -> 0x02be }
            java.net.URLConnection r11 = r11.openConnection()     // Catch:{ all -> 0x02be }
            java.net.HttpURLConnection r11 = (java.net.HttpURLConnection) r11     // Catch:{ all -> 0x02be }
            r11.setUseCaches(r12)     // Catch:{ all -> 0x02b7 }
            r11.setConnectTimeout(r6)     // Catch:{ all -> 0x02b7 }
            r11.setReadTimeout(r6)     // Catch:{ all -> 0x02b7 }
            java.lang.String r6 = "SDK-Version"
            java.lang.String r13 = "onesignal/android/031507"
            r11.setRequestProperty(r6, r13)     // Catch:{ all -> 0x02b7 }
            java.lang.String r6 = "Accept"
            java.lang.String r13 = "application/vnd.onesignal.v1+json"
            r11.setRequestProperty(r6, r13)     // Catch:{ all -> 0x02b7 }
            r6 = 1
            if (r4 == 0) goto L_0x0072
            r11.setDoInput(r6)     // Catch:{ all -> 0x02b7 }
        L_0x0072:
            if (r3 == 0) goto L_0x0081
            java.lang.String r13 = "Content-Type"
            java.lang.String r15 = "application/json; charset=UTF-8"
            r11.setRequestProperty(r13, r15)     // Catch:{ all -> 0x02b7 }
            r11.setRequestMethod(r3)     // Catch:{ all -> 0x02b7 }
            r11.setDoOutput(r6)     // Catch:{ all -> 0x02b7 }
        L_0x0081:
            java.lang.String r6 = "UTF-8"
            if (r4 == 0) goto L_0x00b3
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x02b7 }
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch:{ all -> 0x02b7 }
            r13.<init>()     // Catch:{ all -> 0x02b7 }
            r13.append(r10)     // Catch:{ all -> 0x02b7 }
            r13.append(r3)     // Catch:{ all -> 0x02b7 }
            java.lang.String r15 = " SEND JSON: "
            r13.append(r15)     // Catch:{ all -> 0x02b7 }
            r13.append(r4)     // Catch:{ all -> 0x02b7 }
            java.lang.String r13 = r13.toString()     // Catch:{ all -> 0x02b7 }
            r15 = 0
            b.o.i2.a(r14, r13, r15)     // Catch:{ all -> 0x02b7 }
            byte[] r4 = r4.getBytes(r6)     // Catch:{ all -> 0x02b7 }
            int r13 = r4.length     // Catch:{ all -> 0x02b7 }
            r11.setFixedLengthStreamingMode(r13)     // Catch:{ all -> 0x02b7 }
            java.io.OutputStream r13 = r11.getOutputStream()     // Catch:{ all -> 0x02b7 }
            r13.write(r4)     // Catch:{ all -> 0x02b7 }
        L_0x00b3:
            java.lang.String r4 = "PREFS_OS_ETAG_PREFIX_"
            if (r7 == 0) goto L_0x00e9
            java.lang.String r13 = b.o.b3.a     // Catch:{ all -> 0x02b7 }
            java.lang.StringBuilder r15 = new java.lang.StringBuilder     // Catch:{ all -> 0x02b7 }
            r15.<init>()     // Catch:{ all -> 0x02b7 }
            r15.append(r4)     // Catch:{ all -> 0x02b7 }
            r15.append(r7)     // Catch:{ all -> 0x02b7 }
            java.lang.String r15 = r15.toString()     // Catch:{ all -> 0x02b7 }
            r12 = 0
            java.lang.String r13 = b.o.b3.f(r13, r15, r12)     // Catch:{ all -> 0x02b7 }
            if (r13 == 0) goto L_0x00e9
            java.lang.String r12 = "if-none-match"
            r11.setRequestProperty(r12, r13)     // Catch:{ all -> 0x02b7 }
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ all -> 0x02b7 }
            r12.<init>()     // Catch:{ all -> 0x02b7 }
            java.lang.String r15 = "OneSignalRestClient: Adding header if-none-match: "
            r12.append(r15)     // Catch:{ all -> 0x02b7 }
            r12.append(r13)     // Catch:{ all -> 0x02b7 }
            java.lang.String r12 = r12.toString()     // Catch:{ all -> 0x02b7 }
            r13 = 0
            b.o.i2.a(r14, r12, r13)     // Catch:{ all -> 0x02b7 }
        L_0x00e9:
            int r12 = r11.getResponseCode()     // Catch:{ all -> 0x02b7 }
            b.o.i2$k r13 = b.o.i2.k.VERBOSE     // Catch:{ all -> 0x02ae }
            java.lang.StringBuilder r15 = new java.lang.StringBuilder     // Catch:{ all -> 0x02ae }
            r15.<init>()     // Catch:{ all -> 0x02ae }
            java.lang.String r1 = "OneSignalRestClient: After con.getResponseCode to: https://api.onesignal.com/"
            r15.append(r1)     // Catch:{ all -> 0x02ae }
            r15.append(r0)     // Catch:{ all -> 0x02ae }
            java.lang.String r1 = r15.toString()     // Catch:{ all -> 0x02ae }
            r15 = 0
            b.o.i2.a(r13, r1, r15)     // Catch:{ all -> 0x02ae }
            r1 = 200(0xc8, float:2.8E-43)
            java.lang.String r13 = " RECEIVED JSON: "
            java.lang.String r15 = "OS_REST_SUCCESS_CALLBACK"
            java.lang.String r16 = ""
            java.lang.String r17 = "GET"
            r18 = r2
            java.lang.String r2 = "\\A"
            r19 = r4
            java.lang.String r4 = "PREFS_OS_HTTP_CACHE_PREFIX_"
            if (r12 == r1) goto L_0x01f8
            r1 = 202(0xca, float:2.83E-43)
            if (r12 == r1) goto L_0x01f8
            r1 = 304(0x130, float:4.26E-43)
            if (r12 == r1) goto L_0x01aa
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x01f5 }
            r1.<init>()     // Catch:{ all -> 0x01f5 }
            java.lang.String r4 = "OneSignalRestClient: Failed request to: https://api.onesignal.com/"
            r1.append(r4)     // Catch:{ all -> 0x01f5 }
            r1.append(r0)     // Catch:{ all -> 0x01f5 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x01f5 }
            r1 = 0
            b.o.i2.a(r14, r0, r1)     // Catch:{ all -> 0x01f5 }
            java.io.InputStream r0 = r11.getErrorStream()     // Catch:{ all -> 0x01f5 }
            if (r0 != 0) goto L_0x013f
            java.io.InputStream r0 = r11.getInputStream()     // Catch:{ all -> 0x01f5 }
        L_0x013f:
            if (r0 == 0) goto L_0x0175
            java.util.Scanner r1 = new java.util.Scanner     // Catch:{ all -> 0x01f5 }
            r1.<init>(r0, r6)     // Catch:{ all -> 0x01f5 }
            java.util.Scanner r0 = r1.useDelimiter(r2)     // Catch:{ all -> 0x01f5 }
            boolean r0 = r0.hasNext()     // Catch:{ all -> 0x01f5 }
            if (r0 == 0) goto L_0x0155
            java.lang.String r0 = r1.next()     // Catch:{ all -> 0x01f5 }
            goto L_0x0157
        L_0x0155:
            r0 = r16
        L_0x0157:
            r1.close()     // Catch:{ all -> 0x01f5 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x01f5 }
            r1.<init>()     // Catch:{ all -> 0x01f5 }
            r1.append(r10)     // Catch:{ all -> 0x01f5 }
            r1.append(r3)     // Catch:{ all -> 0x01f5 }
            r1.append(r13)     // Catch:{ all -> 0x01f5 }
            r1.append(r0)     // Catch:{ all -> 0x01f5 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x01f5 }
            r2 = 0
            b.o.i2.a(r9, r1, r2)     // Catch:{ all -> 0x01f5 }
            r1 = 0
            goto L_0x0196
        L_0x0175:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x01f5 }
            r0.<init>()     // Catch:{ all -> 0x01f5 }
            r0.append(r10)     // Catch:{ all -> 0x01f5 }
            r0.append(r3)     // Catch:{ all -> 0x01f5 }
            java.lang.String r1 = " HTTP Code: "
            r0.append(r1)     // Catch:{ all -> 0x01f5 }
            r0.append(r12)     // Catch:{ all -> 0x01f5 }
            java.lang.String r1 = " No response body!"
            r0.append(r1)     // Catch:{ all -> 0x01f5 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x01f5 }
            r1 = 0
            b.o.i2.a(r9, r0, r1)     // Catch:{ all -> 0x01f5 }
            r0 = r1
        L_0x0196:
            if (r5 != 0) goto L_0x019a
            goto L_0x0298
        L_0x019a:
            java.lang.Thread r2 = new java.lang.Thread     // Catch:{ all -> 0x01f5 }
            b.o.j3 r4 = new b.o.j3     // Catch:{ all -> 0x01f5 }
            r4.<init>(r5, r12, r0, r1)     // Catch:{ all -> 0x01f5 }
            r2.<init>(r4, r8)     // Catch:{ all -> 0x01f5 }
            r2.start()     // Catch:{ all -> 0x01f5 }
            r13 = r2
            goto L_0x0319
        L_0x01aa:
            java.lang.String r0 = b.o.b3.a     // Catch:{ all -> 0x01f5 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x01f5 }
            r1.<init>()     // Catch:{ all -> 0x01f5 }
            r1.append(r4)     // Catch:{ all -> 0x01f5 }
            r1.append(r7)     // Catch:{ all -> 0x01f5 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x01f5 }
            r2 = 0
            java.lang.String r0 = b.o.b3.f(r0, r1, r2)     // Catch:{ all -> 0x01f5 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x01f5 }
            r1.<init>()     // Catch:{ all -> 0x01f5 }
            r1.append(r10)     // Catch:{ all -> 0x01f5 }
            if (r3 != 0) goto L_0x01cd
            r2 = r17
            goto L_0x01ce
        L_0x01cd:
            r2 = r3
        L_0x01ce:
            r1.append(r2)     // Catch:{ all -> 0x01f5 }
            java.lang.String r2 = " - Using Cached response due to 304: "
            r1.append(r2)     // Catch:{ all -> 0x01f5 }
            r1.append(r0)     // Catch:{ all -> 0x01f5 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x01f5 }
            r2 = 0
            b.o.i2.a(r14, r1, r2)     // Catch:{ all -> 0x01f5 }
            if (r5 != 0) goto L_0x01e5
            goto L_0x0298
        L_0x01e5:
            java.lang.Thread r1 = new java.lang.Thread     // Catch:{ all -> 0x01f5 }
            b.o.i3 r2 = new b.o.i3     // Catch:{ all -> 0x01f5 }
            r2.<init>(r5, r0)     // Catch:{ all -> 0x01f5 }
            r1.<init>(r2, r15)     // Catch:{ all -> 0x01f5 }
            r1.start()     // Catch:{ all -> 0x01f5 }
        L_0x01f2:
            r13 = r1
            goto L_0x0319
        L_0x01f5:
            r0 = move-exception
            goto L_0x02bb
        L_0x01f8:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x02ac }
            r1.<init>()     // Catch:{ all -> 0x02ac }
            r20 = r12
            java.lang.String r12 = "OneSignalRestClient: Successfully finished request to: https://api.onesignal.com/"
            r1.append(r12)     // Catch:{ all -> 0x02aa }
            r1.append(r0)     // Catch:{ all -> 0x02aa }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x02aa }
            r1 = 0
            b.o.i2.a(r14, r0, r1)     // Catch:{ all -> 0x02aa }
            java.io.InputStream r0 = r11.getInputStream()     // Catch:{ all -> 0x02aa }
            java.util.Scanner r1 = new java.util.Scanner     // Catch:{ all -> 0x02aa }
            r1.<init>(r0, r6)     // Catch:{ all -> 0x02aa }
            java.util.Scanner r0 = r1.useDelimiter(r2)     // Catch:{ all -> 0x02aa }
            boolean r0 = r0.hasNext()     // Catch:{ all -> 0x02aa }
            if (r0 == 0) goto L_0x0226
            java.lang.String r16 = r1.next()     // Catch:{ all -> 0x02aa }
        L_0x0226:
            r0 = r16
            r1.close()     // Catch:{ all -> 0x02aa }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x02aa }
            r1.<init>()     // Catch:{ all -> 0x02aa }
            r1.append(r10)     // Catch:{ all -> 0x02aa }
            if (r3 != 0) goto L_0x0238
            r2 = r17
            goto L_0x0239
        L_0x0238:
            r2 = r3
        L_0x0239:
            r1.append(r2)     // Catch:{ all -> 0x02aa }
            r1.append(r13)     // Catch:{ all -> 0x02aa }
            r1.append(r0)     // Catch:{ all -> 0x02aa }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x02aa }
            r2 = 0
            b.o.i2.a(r14, r1, r2)     // Catch:{ all -> 0x02aa }
            if (r7 == 0) goto L_0x0296
            java.lang.String r1 = "etag"
            java.lang.String r1 = r11.getHeaderField(r1)     // Catch:{ all -> 0x02aa }
            if (r1 == 0) goto L_0x0296
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x02aa }
            r2.<init>()     // Catch:{ all -> 0x02aa }
            java.lang.String r6 = "OneSignalRestClient: Response has etag of "
            r2.append(r6)     // Catch:{ all -> 0x02aa }
            r2.append(r1)     // Catch:{ all -> 0x02aa }
            java.lang.String r6 = " so caching the response."
            r2.append(r6)     // Catch:{ all -> 0x02aa }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x02aa }
            r6 = 0
            b.o.i2.a(r14, r2, r6)     // Catch:{ all -> 0x02aa }
            java.lang.String r2 = b.o.b3.a     // Catch:{ all -> 0x02aa }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x02aa }
            r6.<init>()     // Catch:{ all -> 0x02aa }
            r12 = r19
            r6.append(r12)     // Catch:{ all -> 0x02aa }
            r6.append(r7)     // Catch:{ all -> 0x02aa }
            java.lang.String r6 = r6.toString()     // Catch:{ all -> 0x02aa }
            b.o.b3.h(r2, r6, r1)     // Catch:{ all -> 0x02aa }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x02aa }
            r1.<init>()     // Catch:{ all -> 0x02aa }
            r1.append(r4)     // Catch:{ all -> 0x02aa }
            r1.append(r7)     // Catch:{ all -> 0x02aa }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x02aa }
            b.o.b3.h(r2, r1, r0)     // Catch:{ all -> 0x02aa }
        L_0x0296:
            if (r5 != 0) goto L_0x029b
        L_0x0298:
            r13 = 0
            goto L_0x0319
        L_0x029b:
            java.lang.Thread r1 = new java.lang.Thread     // Catch:{ all -> 0x02aa }
            b.o.i3 r2 = new b.o.i3     // Catch:{ all -> 0x02aa }
            r2.<init>(r5, r0)     // Catch:{ all -> 0x02aa }
            r1.<init>(r2, r15)     // Catch:{ all -> 0x02aa }
            r1.start()     // Catch:{ all -> 0x02aa }
            goto L_0x01f2
        L_0x02aa:
            r0 = move-exception
            goto L_0x02b3
        L_0x02ac:
            r0 = move-exception
            goto L_0x02b1
        L_0x02ae:
            r0 = move-exception
            r18 = r2
        L_0x02b1:
            r20 = r12
        L_0x02b3:
            r1 = r11
            r11 = r20
            goto L_0x02c3
        L_0x02b7:
            r0 = move-exception
            r18 = r2
            r12 = -1
        L_0x02bb:
            r1 = r11
            r11 = r12
            goto L_0x02c3
        L_0x02be:
            r0 = move-exception
            r18 = r2
            r1 = 0
            r11 = -1
        L_0x02c3:
            boolean r2 = r0 instanceof java.net.ConnectException     // Catch:{ all -> 0x0320 }
            if (r2 != 0) goto L_0x02e5
            boolean r2 = r0 instanceof java.net.UnknownHostException     // Catch:{ all -> 0x0320 }
            if (r2 == 0) goto L_0x02cc
            goto L_0x02e5
        L_0x02cc:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0320 }
            r2.<init>()     // Catch:{ all -> 0x0320 }
            r2.append(r10)     // Catch:{ all -> 0x0320 }
            r2.append(r3)     // Catch:{ all -> 0x0320 }
            java.lang.String r3 = " Error thrown from network stack. "
            r2.append(r3)     // Catch:{ all -> 0x0320 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x0320 }
            b.o.i2.a(r9, r2, r0)     // Catch:{ all -> 0x0320 }
            r4 = 0
            goto L_0x0304
        L_0x02e5:
            b.o.i2$k r2 = b.o.i2.k.INFO     // Catch:{ all -> 0x0320 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0320 }
            r3.<init>()     // Catch:{ all -> 0x0320 }
            java.lang.String r4 = "OneSignalRestClient: Could not send last request, device is offline. Throwable: "
            r3.append(r4)     // Catch:{ all -> 0x0320 }
            java.lang.Class r4 = r0.getClass()     // Catch:{ all -> 0x0320 }
            java.lang.String r4 = r4.getName()     // Catch:{ all -> 0x0320 }
            r3.append(r4)     // Catch:{ all -> 0x0320 }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x0320 }
            r4 = 0
            b.o.i2.a(r2, r3, r4)     // Catch:{ all -> 0x0320 }
        L_0x0304:
            if (r5 != 0) goto L_0x0308
            r13 = r4
            goto L_0x0316
        L_0x0308:
            java.lang.Thread r2 = new java.lang.Thread     // Catch:{ all -> 0x0320 }
            b.o.j3 r3 = new b.o.j3     // Catch:{ all -> 0x0320 }
            r3.<init>(r5, r11, r4, r0)     // Catch:{ all -> 0x0320 }
            r2.<init>(r3, r8)     // Catch:{ all -> 0x0320 }
            r2.start()     // Catch:{ all -> 0x0320 }
            r13 = r2
        L_0x0316:
            if (r1 == 0) goto L_0x031c
            r11 = r1
        L_0x0319:
            r11.disconnect()
        L_0x031c:
            r1 = 0
            r18[r1] = r13
            return
        L_0x0320:
            r0 = move-exception
            if (r1 == 0) goto L_0x0326
            r1.disconnect()
        L_0x0326:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: b.o.h3.run():void");
    }
}
