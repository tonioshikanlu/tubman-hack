package b.l.b.a.b.p;

import b.l.b.a.b.k;
import b.l.b.a.d.v;
import java.io.IOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public final class c extends k {

    /* renamed from: g  reason: collision with root package name */
    public static final C0069c f4747g = new b();

    /* renamed from: e  reason: collision with root package name */
    public final HttpURLConnection f4748e;
    public int f = 0;

    public class a implements Callable<Boolean> {
        public final /* synthetic */ C0069c a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ OutputStream f4749b;
        public final /* synthetic */ v c;

        public a(c cVar, C0069c cVar2, OutputStream outputStream, v vVar) {
            this.a = cVar2;
            this.f4749b = outputStream;
            this.c = vVar;
        }

        public Object call() {
            C0069c cVar = this.a;
            OutputStream outputStream = this.f4749b;
            v vVar = this.c;
            Objects.requireNonNull((b) cVar);
            vVar.a(outputStream);
            return Boolean.TRUE;
        }
    }

    public static class b implements C0069c {
    }

    /* renamed from: b.l.b.a.b.p.c$c  reason: collision with other inner class name */
    public interface C0069c {
    }

    public c(HttpURLConnection httpURLConnection) {
        this.f4748e = httpURLConnection;
        httpURLConnection.setInstanceFollowRedirects(false);
    }

    public void a(String str, String str2) {
        this.f4748e.addRequestProperty(str, str2);
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:48:0x0089 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public b.l.b.a.b.l b() {
        /*
            r9 = this;
            b.l.b.a.b.p.c$c r0 = f4747g
            java.net.HttpURLConnection r1 = r9.f4748e
            b.l.b.a.d.v r2 = r9.d
            if (r2 == 0) goto L_0x0089
            java.lang.String r2 = r9.c
            if (r2 == 0) goto L_0x0011
            java.lang.String r3 = "Content-Type"
            r1.addRequestProperty(r3, r2)
        L_0x0011:
            java.lang.String r2 = r9.f4743b
            if (r2 == 0) goto L_0x001c
            java.net.HttpURLConnection r3 = r9.f4748e
            java.lang.String r4 = "Content-Encoding"
            r3.addRequestProperty(r4, r2)
        L_0x001c:
            long r2 = r9.a
            r4 = 0
            int r4 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r4 < 0) goto L_0x002d
            java.lang.String r5 = java.lang.Long.toString(r2)
            java.lang.String r6 = "Content-Length"
            r1.setRequestProperty(r6, r5)
        L_0x002d:
            java.lang.String r5 = r1.getRequestMethod()
            java.lang.String r6 = "POST"
            boolean r6 = r6.equals(r5)
            r7 = 0
            r8 = 1
            if (r6 != 0) goto L_0x0053
            java.lang.String r6 = "PUT"
            boolean r6 = r6.equals(r5)
            if (r6 == 0) goto L_0x0044
            goto L_0x0053
        L_0x0044:
            if (r4 != 0) goto L_0x0048
            r0 = r8
            goto L_0x0049
        L_0x0048:
            r0 = r7
        L_0x0049:
            java.lang.Object[] r2 = new java.lang.Object[r8]
            r2[r7] = r5
            java.lang.String r3 = "%s with non-zero content length is not supported"
            b.l.a.c.b.a.p(r0, r3, r2)
            goto L_0x0089
        L_0x0053:
            r1.setDoOutput(r8)
            if (r4 < 0) goto L_0x0064
            r4 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r4 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r4 > 0) goto L_0x0064
            int r2 = (int) r2
            r1.setFixedLengthStreamingMode(r2)
            goto L_0x0067
        L_0x0064:
            r1.setChunkedStreamingMode(r7)
        L_0x0067:
            java.io.OutputStream r2 = r1.getOutputStream()
            r9.e(r0, r2)     // Catch:{ IOException -> 0x0076 }
            r2.close()     // Catch:{ IOException -> 0x0072 }
            goto L_0x0089
        L_0x0072:
            r0 = move-exception
            throw r0
        L_0x0074:
            r0 = move-exception
            goto L_0x0085
        L_0x0076:
            r0 = move-exception
            int r3 = r1.getResponseCode()     // Catch:{ IOException -> 0x007e }
            if (r3 <= 0) goto L_0x007e
            r7 = r8
        L_0x007e:
            if (r7 == 0) goto L_0x0084
            r2.close()     // Catch:{ IOException -> 0x0089 }
            goto L_0x0089
        L_0x0084:
            throw r0     // Catch:{ all -> 0x0074 }
        L_0x0085:
            r2.close()     // Catch:{ IOException -> 0x0088 }
        L_0x0088:
            throw r0
        L_0x0089:
            r1.connect()     // Catch:{ all -> 0x0092 }
            b.l.b.a.b.p.d r0 = new b.l.b.a.b.p.d     // Catch:{ all -> 0x0092 }
            r0.<init>(r1)     // Catch:{ all -> 0x0092 }
            return r0
        L_0x0092:
            r0 = move-exception
            r1.disconnect()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: b.l.b.a.b.p.c.b():b.l.b.a.b.l");
    }

    public void c(int i2, int i3) {
        this.f4748e.setReadTimeout(i3);
        this.f4748e.setConnectTimeout(i2);
    }

    public void d(int i2) {
        this.f = i2;
    }

    public final void e(C0069c cVar, OutputStream outputStream) {
        if (this.f == 0) {
            v vVar = this.d;
            Objects.requireNonNull((b) cVar);
            vVar.a(outputStream);
            return;
        }
        a aVar = new a(this, cVar, outputStream, this.d);
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor();
        Future submit = newSingleThreadExecutor.submit(new FutureTask(aVar), (Object) null);
        newSingleThreadExecutor.shutdown();
        try {
            submit.get((long) this.f, TimeUnit.MILLISECONDS);
            if (!newSingleThreadExecutor.isTerminated()) {
                newSingleThreadExecutor.shutdown();
            }
        } catch (InterruptedException e2) {
            throw new IOException("Socket write interrupted", e2);
        } catch (ExecutionException e3) {
            throw new IOException("Exception in socket write", e3);
        } catch (TimeoutException e4) {
            throw new IOException("Socket write timed out", e4);
        }
    }
}
