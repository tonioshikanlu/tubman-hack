package b.l.d.x;

import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import b.l.a.c.k.e0;
import b.l.a.c.k.i;
import b.l.d.a0.h;
import b.l.d.u.f;
import b.l.d.x.f;
import b.l.d.x.m.a;
import b.l.d.x.m.b;
import b.l.d.x.m.c;
import b.l.d.x.m.d;
import b.l.d.x.n.b;
import b.l.d.x.n.c;
import b.l.d.x.n.f;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Pattern;

public class d implements e {

    /* renamed from: m  reason: collision with root package name */
    public static final Object f5360m = new Object();

    /* renamed from: n  reason: collision with root package name */
    public static final ThreadFactory f5361n = new a();
    public final b.l.d.d a;

    /* renamed from: b  reason: collision with root package name */
    public final c f5362b;
    public final b.l.d.x.m.c c;
    public final k d;

    /* renamed from: e  reason: collision with root package name */
    public final b f5363e;
    public final i f;

    /* renamed from: g  reason: collision with root package name */
    public final Object f5364g = new Object();

    /* renamed from: h  reason: collision with root package name */
    public final ExecutorService f5365h;

    /* renamed from: i  reason: collision with root package name */
    public final ExecutorService f5366i;
    @GuardedBy("this")

    /* renamed from: j  reason: collision with root package name */
    public String f5367j;
    @GuardedBy("FirebaseInstallations.this")

    /* renamed from: k  reason: collision with root package name */
    public Set<b.l.d.x.l.a> f5368k = new HashSet();
    @GuardedBy("lock")

    /* renamed from: l  reason: collision with root package name */
    public final List<j> f5369l = new ArrayList();

    public class a implements ThreadFactory {
        public final AtomicInteger a = new AtomicInteger(1);

        public Thread newThread(Runnable runnable) {
            return new Thread(runnable, String.format("firebase-installations-executor-%d", new Object[]{Integer.valueOf(this.a.getAndIncrement())}));
        }
    }

    public d(b.l.d.d dVar, @NonNull b.l.d.w.b<h> bVar, @NonNull b.l.d.w.b<f> bVar2) {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        ThreadFactory threadFactory = f5361n;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 30, timeUnit, linkedBlockingQueue, threadFactory);
        dVar.a();
        c cVar = new c(dVar.a, bVar, bVar2);
        b.l.d.x.m.c cVar2 = new b.l.d.x.m.c(dVar);
        k c2 = k.c();
        b bVar3 = new b(dVar);
        i iVar = new i();
        this.a = dVar;
        this.f5362b = cVar;
        this.c = cVar2;
        this.d = c2;
        this.f5363e = bVar3;
        this.f = iVar;
        this.f5365h = threadPoolExecutor;
        this.f5366i = new ThreadPoolExecutor(0, 1, 30, timeUnit, new LinkedBlockingQueue(), threadFactory);
    }

    @NonNull
    public static d d() {
        b.l.d.d c2 = b.l.d.d.c();
        b.l.a.c.b.a.k(true, "Null is not a valid value of FirebaseApp.");
        c2.a();
        return (d) c2.d.a(e.class);
    }

    public final b.l.d.x.m.d a(@NonNull b.l.d.x.m.d dVar) {
        b.l.d.x.n.f f2;
        f.b bVar;
        b.C0091b bVar2;
        f.a aVar = f.a.UNAVAILABLE;
        c cVar = this.f5362b;
        String b2 = b();
        b.l.d.x.m.a aVar2 = (b.l.d.x.m.a) dVar;
        String str = aVar2.f5376b;
        String e2 = e();
        String str2 = aVar2.f5377e;
        if (cVar.d.a()) {
            URL a2 = cVar.a(String.format("projects/%s/installations/%s/authTokens:generate", new Object[]{e2, str}));
            int i2 = 0;
            while (i2 <= 1) {
                HttpURLConnection c2 = cVar.c(a2, b2);
                try {
                    c2.setRequestMethod("POST");
                    c2.addRequestProperty("Authorization", "FIS_v2 " + str2);
                    c2.setDoOutput(true);
                    cVar.h(c2);
                    int responseCode = c2.getResponseCode();
                    cVar.d.b(responseCode);
                    if (responseCode >= 200 && responseCode < 300) {
                        f2 = cVar.f(c2);
                    } else {
                        c.b(c2, (String) null, b2, e2);
                        if (responseCode == 401) {
                            f.a a3 = b.l.d.x.n.f.a();
                            bVar = f.b.AUTH_ERROR;
                            bVar2 = (b.C0091b) a3;
                        } else if (responseCode == 404) {
                            f.a a32 = b.l.d.x.n.f.a();
                            bVar = f.b.AUTH_ERROR;
                            bVar2 = (b.C0091b) a32;
                        } else if (responseCode == 429) {
                            throw new f("Firebase servers have received too many requests from this client in a short period of time. Please try again later.", f.a.TOO_MANY_REQUESTS);
                        } else if (responseCode < 500 || responseCode >= 600) {
                            Log.e("Firebase-Installations", "Firebase Installations can not communicate with Firebase server APIs due to invalid configuration. Please update your Firebase initialization process and set valid Firebase options (API key, Project ID, Application ID) when initializing Firebase.");
                            f.a a4 = b.l.d.x.n.f.a();
                            bVar = f.b.BAD_CONFIG;
                            bVar2 = (b.C0091b) a4;
                        } else {
                            c2.disconnect();
                            i2++;
                        }
                        bVar2.c = bVar;
                        f2 = bVar2.a();
                    }
                    c2.disconnect();
                    b.l.d.x.n.b bVar3 = (b.l.d.x.n.b) f2;
                    int ordinal = bVar3.c.ordinal();
                    if (ordinal == 0) {
                        String str3 = bVar3.a;
                        long j2 = bVar3.f5393b;
                        long b3 = this.d.b();
                        a.b bVar4 = (a.b) dVar.j();
                        bVar4.c = str3;
                        bVar4.f5381e = Long.valueOf(j2);
                        bVar4.f = Long.valueOf(b3);
                        return bVar4.a();
                    } else if (ordinal == 1) {
                        a.b bVar5 = (a.b) dVar.j();
                        bVar5.f5382g = "BAD CONFIG";
                        bVar5.b(c.a.REGISTER_ERROR);
                        return bVar5.a();
                    } else if (ordinal == 2) {
                        synchronized (this) {
                            try {
                                this.f5367j = null;
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        d.a j3 = dVar.j();
                        j3.b(c.a.NOT_GENERATED);
                        return j3.a();
                    } else {
                        throw new f("Firebase Installations Service is unavailable. Please try again later.", aVar);
                    }
                } catch (IOException | AssertionError unused) {
                } catch (Throwable th2) {
                    c2.disconnect();
                    throw th2;
                }
            }
            throw new f("Firebase Installations Service is unavailable. Please try again later.", aVar);
        }
        throw new f("Firebase Installations Service is unavailable. Please try again later.", aVar);
    }

    @Nullable
    public String b() {
        b.l.d.d dVar = this.a;
        dVar.a();
        return dVar.c.a;
    }

    @VisibleForTesting
    public String c() {
        b.l.d.d dVar = this.a;
        dVar.a();
        return dVar.c.f4918b;
    }

    @Nullable
    public String e() {
        b.l.d.d dVar = this.a;
        dVar.a();
        return dVar.c.f4920g;
    }

    public final String f(b.l.d.x.m.d dVar) {
        String string;
        b.l.d.d dVar2 = this.a;
        dVar2.a();
        if (dVar2.f4912b.equals("CHIME_ANDROID_SDK") || this.a.i()) {
            if (((b.l.d.x.m.a) dVar).c == c.a.ATTEMPT_MIGRATION) {
                b.l.d.x.m.b bVar = this.f5363e;
                synchronized (bVar.a) {
                    synchronized (bVar.a) {
                        string = bVar.a.getString("|S|id", (String) null);
                    }
                    if (string == null) {
                        string = bVar.a();
                    }
                }
                return TextUtils.isEmpty(string) ? this.f.a() : string;
            }
        }
        return this.f.a();
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:18|19|20) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:18:0x0061 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final b.l.d.x.m.d g(b.l.d.x.m.d r24) {
        /*
            r23 = this;
            r1 = r23
            b.l.d.x.f$a r0 = b.l.d.x.f.a.UNAVAILABLE
            r2 = r24
            b.l.d.x.m.a r2 = (b.l.d.x.m.a) r2
            java.lang.String r3 = r2.f5376b
            r4 = 0
            r5 = 0
            if (r3 == 0) goto L_0x0069
            int r3 = r3.length()
            r6 = 11
            if (r3 != r6) goto L_0x0069
            b.l.d.x.m.b r3 = r1.f5363e
            android.content.SharedPreferences r6 = r3.a
            monitor-enter(r6)
            java.lang.String[] r7 = b.l.d.x.m.b.c     // Catch:{ all -> 0x0066 }
            int r8 = r7.length     // Catch:{ all -> 0x0066 }
            r9 = r5
        L_0x001f:
            if (r9 >= r8) goto L_0x0061
            r10 = r7[r9]     // Catch:{ all -> 0x0066 }
            java.lang.String r11 = r3.f5383b     // Catch:{ all -> 0x0066 }
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ all -> 0x0066 }
            r12.<init>()     // Catch:{ all -> 0x0066 }
            java.lang.String r13 = "|T|"
            r12.append(r13)     // Catch:{ all -> 0x0066 }
            r12.append(r11)     // Catch:{ all -> 0x0066 }
            java.lang.String r11 = "|"
            r12.append(r11)     // Catch:{ all -> 0x0066 }
            r12.append(r10)     // Catch:{ all -> 0x0066 }
            java.lang.String r10 = r12.toString()     // Catch:{ all -> 0x0066 }
            android.content.SharedPreferences r11 = r3.a     // Catch:{ all -> 0x0066 }
            java.lang.String r10 = r11.getString(r10, r4)     // Catch:{ all -> 0x0066 }
            if (r10 == 0) goto L_0x0063
            boolean r11 = r10.isEmpty()     // Catch:{ all -> 0x0066 }
            if (r11 != 0) goto L_0x0063
            java.lang.String r3 = "{"
            boolean r3 = r10.startsWith(r3)     // Catch:{ all -> 0x0066 }
            if (r3 == 0) goto L_0x0060
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0061 }
            r3.<init>(r10)     // Catch:{ JSONException -> 0x0061 }
            java.lang.String r7 = "token"
            java.lang.String r4 = r3.getString(r7)     // Catch:{ JSONException -> 0x0061 }
            goto L_0x0061
        L_0x0060:
            r4 = r10
        L_0x0061:
            monitor-exit(r6)     // Catch:{ all -> 0x0066 }
            goto L_0x0069
        L_0x0063:
            int r9 = r9 + 1
            goto L_0x001f
        L_0x0066:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x0066 }
            throw r0
        L_0x0069:
            b.l.d.x.n.c r3 = r1.f5362b
            java.lang.String r6 = r23.b()
            java.lang.String r2 = r2.f5376b
            java.lang.String r7 = r23.e()
            java.lang.String r8 = r23.c()
            b.l.d.x.n.e r9 = r3.d
            boolean r9 = r9.a()
            java.lang.String r10 = "Firebase Installations Service is unavailable. Please try again later."
            if (r9 == 0) goto L_0x0175
            r9 = 1
            java.lang.Object[] r11 = new java.lang.Object[r9]
            r11[r5] = r7
            java.lang.String r12 = "projects/%s/installations"
            java.lang.String r11 = java.lang.String.format(r12, r11)
            java.net.URL r11 = r3.a(r11)
            r12 = r5
        L_0x0093:
            if (r12 > r9) goto L_0x016f
            java.net.HttpURLConnection r13 = r3.c(r11, r6)
            java.lang.String r14 = "POST"
            r13.setRequestMethod(r14)     // Catch:{ IOException | AssertionError -> 0x0167, all -> 0x0162 }
            r13.setDoOutput(r9)     // Catch:{ IOException | AssertionError -> 0x0167, all -> 0x0162 }
            if (r4 == 0) goto L_0x00a8
            java.lang.String r14 = "x-goog-fis-android-iid-migration-auth"
            r13.addRequestProperty(r14, r4)     // Catch:{ IOException | AssertionError -> 0x0167, all -> 0x0162 }
        L_0x00a8:
            r3.g(r13, r2, r8)     // Catch:{ IOException | AssertionError -> 0x0167, all -> 0x0162 }
            int r14 = r13.getResponseCode()     // Catch:{ IOException | AssertionError -> 0x0167, all -> 0x0162 }
            b.l.d.x.n.e r15 = r3.d     // Catch:{ IOException | AssertionError -> 0x0167, all -> 0x0162 }
            r15.b(r14)     // Catch:{ IOException | AssertionError -> 0x0167, all -> 0x0162 }
            r15 = 200(0xc8, float:2.8E-43)
            if (r14 < r15) goto L_0x00be
            r15 = 300(0x12c, float:4.2E-43)
            if (r14 >= r15) goto L_0x00be
            r15 = r9
            goto L_0x00bf
        L_0x00be:
            r15 = r5
        L_0x00bf:
            if (r15 == 0) goto L_0x00c9
            b.l.d.x.n.d r2 = r3.e(r13)     // Catch:{ IOException | AssertionError -> 0x0167, all -> 0x0162 }
            r13.disconnect()
            goto L_0x00f8
        L_0x00c9:
            b.l.d.x.n.c.b(r13, r8, r6, r7)     // Catch:{ IOException | AssertionError -> 0x0167, all -> 0x0162 }
            r15 = 429(0x1ad, float:6.01E-43)
            if (r14 == r15) goto L_0x0158
            r15 = 500(0x1f4, float:7.0E-43)
            if (r14 < r15) goto L_0x00da
            r15 = 600(0x258, float:8.41E-43)
            if (r14 >= r15) goto L_0x00da
            goto L_0x0167
        L_0x00da:
            java.lang.String r14 = "Firebase-Installations"
            java.lang.String r15 = "Firebase Installations can not communicate with Firebase server APIs due to invalid configuration. Please update your Firebase initialization process and set valid Firebase options (API key, Project ID, Application ID) when initializing Firebase."
            android.util.Log.e(r14, r15)     // Catch:{ IOException | AssertionError -> 0x0167, all -> 0x0162 }
            r20 = 0
            r19 = 0
            r18 = 0
            r17 = 0
            b.l.d.x.n.d$a r21 = b.l.d.x.n.d.a.BAD_CONFIG     // Catch:{ IOException | AssertionError -> 0x0167, all -> 0x0162 }
            b.l.d.x.n.a r14 = new b.l.d.x.n.a     // Catch:{ IOException | AssertionError -> 0x0167, all -> 0x0162 }
            r22 = 0
            r16 = r14
            r16.<init>(r17, r18, r19, r20, r21, r22)     // Catch:{ IOException | AssertionError -> 0x0167, all -> 0x0162 }
            r13.disconnect()
            r2 = r14
        L_0x00f8:
            b.l.d.x.n.a r2 = (b.l.d.x.n.a) r2
            b.l.d.x.n.d$a r3 = r2.f5392e
            int r3 = r3.ordinal()
            if (r3 == 0) goto L_0x0120
            if (r3 != r9) goto L_0x0118
            java.lang.String r0 = "BAD CONFIG"
            b.l.d.x.m.d$a r2 = r24.j()
            b.l.d.x.m.a$b r2 = (b.l.d.x.m.a.b) r2
            r2.f5382g = r0
            b.l.d.x.m.c$a r0 = b.l.d.x.m.c.a.REGISTER_ERROR
            r2.b(r0)
            b.l.d.x.m.d r0 = r2.a()
            return r0
        L_0x0118:
            b.l.d.x.f r2 = new b.l.d.x.f
            java.lang.String r3 = "Firebase Installations Service is unavailable. Please try again later."
            r2.<init>(r3, r0)
            throw r2
        L_0x0120:
            java.lang.String r0 = r2.f5391b
            java.lang.String r3 = r2.c
            b.l.d.x.k r4 = r1.d
            long r4 = r4.b()
            b.l.d.x.n.f r6 = r2.d
            java.lang.String r6 = r6.c()
            b.l.d.x.n.f r2 = r2.d
            long r7 = r2.d()
            b.l.d.x.m.d$a r2 = r24.j()
            b.l.d.x.m.a$b r2 = (b.l.d.x.m.a.b) r2
            r2.a = r0
            b.l.d.x.m.c$a r0 = b.l.d.x.m.c.a.REGISTERED
            r2.b(r0)
            r2.c = r6
            r2.d = r3
            java.lang.Long r0 = java.lang.Long.valueOf(r7)
            r2.f5381e = r0
            java.lang.Long r0 = java.lang.Long.valueOf(r4)
            r2.f = r0
            b.l.d.x.m.d r0 = r2.a()
            return r0
        L_0x0158:
            b.l.d.x.f r14 = new b.l.d.x.f     // Catch:{ IOException | AssertionError -> 0x0167, all -> 0x0162 }
            java.lang.String r15 = "Firebase servers have received too many requests from this client in a short period of time. Please try again later."
            b.l.d.x.f$a r5 = b.l.d.x.f.a.TOO_MANY_REQUESTS     // Catch:{ IOException | AssertionError -> 0x0167, all -> 0x0162 }
            r14.<init>(r15, r5)     // Catch:{ IOException | AssertionError -> 0x0167, all -> 0x0162 }
            throw r14     // Catch:{ IOException | AssertionError -> 0x0167, all -> 0x0162 }
        L_0x0162:
            r0 = move-exception
            r13.disconnect()
            throw r0
        L_0x0167:
            r13.disconnect()
            int r12 = r12 + 1
            r5 = 0
            goto L_0x0093
        L_0x016f:
            b.l.d.x.f r2 = new b.l.d.x.f
            r2.<init>(r10, r0)
            throw r2
        L_0x0175:
            b.l.d.x.f r2 = new b.l.d.x.f
            r2.<init>(r10, r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: b.l.d.x.d.g(b.l.d.x.m.d):b.l.d.x.m.d");
    }

    @NonNull
    public b.l.a.c.k.h<String> getId() {
        String str;
        b.l.a.c.b.a.y(c(), "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        b.l.a.c.b.a.y(e(), "Please set your Project ID. A valid Firebase Project ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        b.l.a.c.b.a.y(b(), "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
        String c2 = c();
        Pattern pattern = k.c;
        b.l.a.c.b.a.k(c2.contains(":"), "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        b.l.a.c.b.a.k(k.c.matcher(b()).matches(), "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
        synchronized (this) {
            str = this.f5367j;
        }
        if (str != null) {
            return b.l.a.c.b.a.X(str);
        }
        i iVar = new i();
        h hVar = new h(iVar);
        synchronized (this.f5364g) {
            this.f5369l.add(hVar);
        }
        e0<TResult> e0Var = iVar.a;
        this.f5365h.execute(new b(this));
        return e0Var;
    }

    public final void h(Exception exc) {
        synchronized (this.f5364g) {
            Iterator<j> it = this.f5369l.iterator();
            while (it.hasNext()) {
                if (it.next().a(exc)) {
                    it.remove();
                }
            }
        }
    }

    public final void i(b.l.d.x.m.d dVar) {
        synchronized (this.f5364g) {
            Iterator<j> it = this.f5369l.iterator();
            while (it.hasNext()) {
                if (it.next().b(dVar)) {
                    it.remove();
                }
            }
        }
    }
}
