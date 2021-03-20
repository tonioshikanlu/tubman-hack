package b.g.a.i.b;

import b.g.a.b;
import b.g.a.d;
import b.g.a.i.a;
import b.l.e.k;
import b.p.b.e;
import b.p.b.o;
import b.p.b.q;
import b.p.b.r;
import b.p.b.t;
import b.p.b.v;
import java.util.Map;

public class j<T, U extends b> extends c<T, U> implements a<T, U>, e {

    /* renamed from: i  reason: collision with root package name */
    public final String f457i;

    public j(o oVar, r rVar, k kVar, String str, b.l.e.f0.a<T> aVar, a<U> aVar2) {
        super(oVar, rVar, kVar, kVar.e(aVar), aVar2);
        this.f457i = str;
    }

    public j(o oVar, r rVar, k kVar, String str, Class<T> cls, a<U> aVar) {
        super(oVar, rVar, kVar, kVar.f(cls), aVar);
        this.f457i = str;
    }

    public t b() {
        boolean z = this.f457i.equals("HEAD") || this.f457i.equals("GET");
        t.b bVar = new t.b();
        bVar.d(this.f453b);
        for (Map.Entry next : this.a.entrySet()) {
            bVar.c.a((String) next.getKey(), (String) next.getValue());
        }
        String str = this.f457i;
        v vVar = null;
        if (!z) {
            Map<String, Object> a = this.f455g.a();
            if (!a.isEmpty()) {
                k kVar = this.f;
                q qVar = f.a;
                try {
                    vVar = v.a(f.a, kVar.i(a));
                } catch (Exception e2) {
                    StringBuilder y = b.e.a.a.a.y("Failed to convert ");
                    y.append(a.getClass().getName());
                    y.append(" to JSON");
                    throw new d(y.toString(), e2);
                }
            }
        }
        bVar.c(str, vVar);
        return bVar.a();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0031, code lost:
        r5 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
        r1 = new b.g.a.b("Error parsing the server response", r5);
        java.util.Objects.requireNonNull(r4.f454e);
        r3 = new b.g.a.e.c("Request to " + r4.f453b.f6728i + " failed", r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x005e, code lost:
        r1 = null;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0031 A[ExcHandler: IOException (r5v4 'e' java.io.IOException A[CUSTOM_DECLARE]), Splitter:B:8:0x0011] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void d(b.p.b.w r5) {
        /*
            r4 = this;
            int r0 = r5.c
            r1 = 200(0xc8, float:2.8E-43)
            if (r0 < r1) goto L_0x000c
            r1 = 300(0x12c, float:4.2E-43)
            if (r0 >= r1) goto L_0x000c
            r0 = 1
            goto L_0x000d
        L_0x000c:
            r0 = 0
        L_0x000d:
            if (r0 != 0) goto L_0x0078
            b.p.b.x r0 = r5.f6764g
            java.lang.String r1 = r0.H()     // Catch:{ y -> 0x005e, IOException -> 0x0031 }
            b.g.a.i.b.b r2 = new b.g.a.i.b.b     // Catch:{ y -> 0x005f, IOException -> 0x0031 }
            r2.<init>(r4)     // Catch:{ y -> 0x005f, IOException -> 0x0031 }
            java.lang.reflect.Type r2 = r2.f5519b     // Catch:{ y -> 0x005f, IOException -> 0x0031 }
            b.l.e.k r3 = r4.f     // Catch:{ y -> 0x005f, IOException -> 0x0031 }
            java.lang.Object r2 = r3.d(r1, r2)     // Catch:{ y -> 0x005f, IOException -> 0x0031 }
            java.util.Map r2 = (java.util.Map) r2     // Catch:{ y -> 0x005f, IOException -> 0x0031 }
            b.g.a.i.b.a<U> r3 = r4.f454e     // Catch:{ y -> 0x005f, IOException -> 0x0031 }
            java.util.Objects.requireNonNull(r3)     // Catch:{ y -> 0x005f, IOException -> 0x0031 }
            b.g.a.e.c r3 = new b.g.a.e.c     // Catch:{ y -> 0x005f, IOException -> 0x0031 }
            r3.<init>(r2)     // Catch:{ y -> 0x005f, IOException -> 0x0031 }
            goto L_0x006b
        L_0x002f:
            r5 = move-exception
            goto L_0x0074
        L_0x0031:
            r5 = move-exception
            b.g.a.b r1 = new b.g.a.b     // Catch:{ all -> 0x002f }
            java.lang.String r2 = "Error parsing the server response"
            r1.<init>(r2, r5)     // Catch:{ all -> 0x002f }
            b.g.a.i.b.a<U> r5 = r4.f454e     // Catch:{ all -> 0x002f }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x002f }
            r2.<init>()     // Catch:{ all -> 0x002f }
            java.lang.String r3 = "Request to "
            r2.append(r3)     // Catch:{ all -> 0x002f }
            b.p.b.o r3 = r4.f453b     // Catch:{ all -> 0x002f }
            java.lang.String r3 = r3.f6728i     // Catch:{ all -> 0x002f }
            r2.append(r3)     // Catch:{ all -> 0x002f }
            java.lang.String r3 = " failed"
            r2.append(r3)     // Catch:{ all -> 0x002f }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x002f }
            java.util.Objects.requireNonNull(r5)     // Catch:{ all -> 0x002f }
            b.g.a.e.c r3 = new b.g.a.e.c     // Catch:{ all -> 0x002f }
            r3.<init>((java.lang.String) r2, (b.g.a.b) r1)     // Catch:{ all -> 0x002f }
            goto L_0x006b
        L_0x005e:
            r1 = 0
        L_0x005f:
            b.g.a.i.b.a<U> r2 = r4.f454e     // Catch:{ all -> 0x002f }
            int r5 = r5.c     // Catch:{ all -> 0x002f }
            java.util.Objects.requireNonNull(r2)     // Catch:{ all -> 0x002f }
            b.g.a.e.c r3 = new b.g.a.e.c     // Catch:{ all -> 0x002f }
            r3.<init>((java.lang.String) r1, (int) r5)     // Catch:{ all -> 0x002f }
        L_0x006b:
            r0.close()     // Catch:{ IOException -> 0x006e }
        L_0x006e:
            b.g.a.f.a<T, U> r5 = r4.f456h
            r5.b(r3)
            return
        L_0x0074:
            r0.close()     // Catch:{ IOException -> 0x0077 }
        L_0x0077:
            throw r5
        L_0x0078:
            b.p.b.x r5 = r5.f6764g
            java.io.Reader r0 = r5.b()     // Catch:{ IOException -> 0x0094 }
            b.l.e.b0<T> r1 = r4.d     // Catch:{ IOException -> 0x0094 }
            java.util.Objects.requireNonNull(r1)     // Catch:{ IOException -> 0x0094 }
            b.l.e.g0.a r2 = new b.l.e.g0.a     // Catch:{ IOException -> 0x0094 }
            r2.<init>(r0)     // Catch:{ IOException -> 0x0094 }
            java.lang.Object r0 = r1.a(r2)     // Catch:{ IOException -> 0x0094 }
            b.g.a.f.a<T, U> r1 = r4.f456h     // Catch:{ IOException -> 0x0094 }
            r1.a(r0)     // Catch:{ IOException -> 0x0094 }
            goto L_0x00be
        L_0x0092:
            r0 = move-exception
            goto L_0x00c2
        L_0x0094:
            r0 = move-exception
            b.g.a.b r1 = new b.g.a.b     // Catch:{ all -> 0x0092 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0092 }
            r2.<init>()     // Catch:{ all -> 0x0092 }
            java.lang.String r3 = "Failed to parse response to request to "
            r2.append(r3)     // Catch:{ all -> 0x0092 }
            b.p.b.o r3 = r4.f453b     // Catch:{ all -> 0x0092 }
            r2.append(r3)     // Catch:{ all -> 0x0092 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x0092 }
            r1.<init>(r2, r0)     // Catch:{ all -> 0x0092 }
            b.g.a.i.b.a<U> r0 = r4.f454e     // Catch:{ all -> 0x0092 }
            java.lang.String r2 = "Failed to parse a successful response"
            java.util.Objects.requireNonNull(r0)     // Catch:{ all -> 0x0092 }
            b.g.a.e.c r0 = new b.g.a.e.c     // Catch:{ all -> 0x0092 }
            r0.<init>((java.lang.String) r2, (b.g.a.b) r1)     // Catch:{ all -> 0x0092 }
            b.g.a.f.a<T, U> r1 = r4.f456h     // Catch:{ all -> 0x0092 }
            r1.b(r0)     // Catch:{ all -> 0x0092 }
        L_0x00be:
            r5.close()     // Catch:{ IOException -> 0x00c1 }
        L_0x00c1:
            return
        L_0x00c2:
            r5.close()     // Catch:{ IOException -> 0x00c5 }
        L_0x00c5:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: b.g.a.i.b.j.d(b.p.b.w):void");
    }
}
