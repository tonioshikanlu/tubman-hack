package b.l.d.q.f.g;

import android.content.Context;
import android.util.Log;
import b.l.d.d;
import b.l.d.q.f.h.b;
import b.l.d.q.f.k.h;
import b.l.d.q.f.m.e;
import b.l.d.q.f.m.f;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;

public class v {
    public final Context a;

    /* renamed from: b  reason: collision with root package name */
    public final b0 f5120b;
    public final long c = System.currentTimeMillis();
    public x d;

    /* renamed from: e  reason: collision with root package name */
    public x f5121e;
    public q f;

    /* renamed from: g  reason: collision with root package name */
    public final f0 f5122g;

    /* renamed from: h  reason: collision with root package name */
    public final b.l.d.q.f.f.a f5123h;

    /* renamed from: i  reason: collision with root package name */
    public final b.l.d.q.f.e.a f5124i;

    /* renamed from: j  reason: collision with root package name */
    public final ExecutorService f5125j;

    /* renamed from: k  reason: collision with root package name */
    public final f f5126k;

    /* renamed from: l  reason: collision with root package name */
    public final b.l.d.q.f.a f5127l;

    public class a implements Runnable {

        /* renamed from: h  reason: collision with root package name */
        public final /* synthetic */ f f5128h;

        public a(f fVar) {
            this.f5128h = fVar;
        }

        public void run() {
            v.a(v.this, this.f5128h);
        }
    }

    public class b implements Callable<Boolean> {
        public b() {
        }

        public Object call() {
            b.l.d.q.f.b bVar = b.l.d.q.f.b.a;
            try {
                boolean delete = v.this.d.b().delete();
                bVar.b("Initialization marker file removed: " + delete);
                return Boolean.valueOf(delete);
            } catch (Exception e2) {
                if (bVar.a(6)) {
                    Log.e("FirebaseCrashlytics", "Problem encountered deleting Crashlytics initialization marker.", e2);
                }
                return Boolean.FALSE;
            }
        }
    }

    public static final class c implements b.C0077b {
        public final h a;

        public c(h hVar) {
            this.a = hVar;
        }
    }

    public v(d dVar, f0 f0Var, b.l.d.q.f.a aVar, b0 b0Var, b.l.d.q.f.f.a aVar2, b.l.d.q.f.e.a aVar3, ExecutorService executorService) {
        this.f5120b = b0Var;
        dVar.a();
        this.a = dVar.a;
        this.f5122g = f0Var;
        this.f5127l = aVar;
        this.f5123h = aVar2;
        this.f5124i = aVar3;
        this.f5125j = executorService;
        this.f5126k = new f(executorService);
    }

    public static b.l.a.c.k.h a(v vVar, f fVar) {
        b.l.a.c.k.h<Void> hVar;
        b.l.d.q.f.b bVar = b.l.d.q.f.b.a;
        vVar.f5126k.a();
        vVar.d.a();
        bVar.b("Initialization marker file created.");
        try {
            vVar.f5123h.a(new t(vVar));
            e eVar = (e) fVar;
            if (!eVar.b().b().a) {
                bVar.b("Collection of crash reports disabled in Crashlytics settings.");
                hVar = b.l.a.c.b.a.W(new RuntimeException("Collection of crash reports disabled in Crashlytics settings."));
            } else {
                if (!vVar.f.e()) {
                    bVar.b("Could not finalize previous sessions.");
                }
                hVar = vVar.f.h(eVar.f5278i.get().a);
            }
        } catch (Exception e2) {
            if (bVar.a(6)) {
                Log.e("FirebaseCrashlytics", "Crashlytics encountered a problem during asynchronous initialization.", e2);
            }
            hVar = b.l.a.c.b.a.W(e2);
        } catch (Throwable th) {
            vVar.c();
            throw th;
        }
        vVar.c();
        return hVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0026, code lost:
        android.util.Log.e("FirebaseCrashlytics", r1, r7);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b(b.l.d.q.f.m.f r7) {
        /*
            r6 = this;
            java.lang.String r0 = "FirebaseCrashlytics"
            b.l.d.q.f.b r1 = b.l.d.q.f.b.a
            b.l.d.q.f.g.v$a r2 = new b.l.d.q.f.g.v$a
            r2.<init>(r7)
            java.util.concurrent.ExecutorService r7 = r6.f5125j
            java.util.concurrent.Future r7 = r7.submit(r2)
            java.lang.String r2 = "Crashlytics detected incomplete initialization on previous app launch. Will initialize synchronously."
            r1.b(r2)
            r2 = 4
            r4 = 6
            java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ InterruptedException -> 0x0034, ExecutionException -> 0x002a, TimeoutException -> 0x001d }
            r7.get(r2, r5)     // Catch:{ InterruptedException -> 0x0034, ExecutionException -> 0x002a, TimeoutException -> 0x001d }
            goto L_0x003e
        L_0x001d:
            r7 = move-exception
            boolean r1 = r1.a(r4)
            if (r1 == 0) goto L_0x003e
            java.lang.String r1 = "Crashlytics timed out during initialization."
        L_0x0026:
            android.util.Log.e(r0, r1, r7)
            goto L_0x003e
        L_0x002a:
            r7 = move-exception
            boolean r1 = r1.a(r4)
            if (r1 == 0) goto L_0x003e
            java.lang.String r1 = "Problem encountered during Crashlytics initialization."
            goto L_0x0026
        L_0x0034:
            r7 = move-exception
            boolean r1 = r1.a(r4)
            if (r1 == 0) goto L_0x003e
            java.lang.String r1 = "Crashlytics was interrupted during initialization."
            goto L_0x0026
        L_0x003e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: b.l.d.q.f.g.v.b(b.l.d.q.f.m.f):void");
    }

    public void c() {
        this.f5126k.b(new b());
    }
}
