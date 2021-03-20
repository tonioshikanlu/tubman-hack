package b.l.b.a.b;

import com.google.api.client.http.HttpHeaders;
import java.io.IOException;
import java.util.Objects;

public class i extends IOException {
    public final int statusCode;

    public static class a {
        public int a;

        /* renamed from: b  reason: collision with root package name */
        public String f4741b;
        public HttpHeaders c;
        public String d;

        /* renamed from: e  reason: collision with root package name */
        public String f4742e;

        public a(int i2, String str, HttpHeaders httpHeaders) {
            b.l.a.c.b.a.q(i2 >= 0);
            this.a = i2;
            this.f4741b = str;
            Objects.requireNonNull(httpHeaders);
            this.c = httpHeaders;
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public i(b.l.b.a.b.h r5) {
        /*
            r4 = this;
            b.l.b.a.b.i$a r0 = new b.l.b.a.b.i$a
            int r1 = r5.f
            java.lang.String r2 = r5.f4736g
            b.l.b.a.b.f r3 = r5.f4737h
            com.google.api.client.http.HttpHeaders r3 = r3.c
            r0.<init>(r1, r2, r3)
            java.lang.String r1 = r5.f()     // Catch:{ IOException -> 0x0022, IllegalArgumentException -> 0x001d }
            r0.d = r1     // Catch:{ IOException -> 0x0022, IllegalArgumentException -> 0x001d }
            int r1 = r1.length()     // Catch:{ IOException -> 0x0022, IllegalArgumentException -> 0x001d }
            if (r1 != 0) goto L_0x0026
            r1 = 0
            r0.d = r1     // Catch:{ IOException -> 0x0022, IllegalArgumentException -> 0x001d }
            goto L_0x0026
        L_0x001d:
            r1 = move-exception
            r1.printStackTrace()
            goto L_0x0026
        L_0x0022:
            r1 = move-exception
            r1.printStackTrace()
        L_0x0026:
            java.lang.StringBuilder r5 = computeMessageBuffer(r5)
            java.lang.String r1 = r0.d
            if (r1 == 0) goto L_0x0038
            java.lang.String r1 = b.l.b.a.d.w.a
            r5.append(r1)
            java.lang.String r1 = r0.d
            r5.append(r1)
        L_0x0038:
            java.lang.String r5 = r5.toString()
            r0.f4742e = r5
            r4.<init>((b.l.b.a.b.i.a) r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: b.l.b.a.b.i.<init>(b.l.b.a.b.h):void");
    }

    public i(a aVar) {
        super(aVar.f4742e);
        this.statusCode = aVar.a;
    }

    public static StringBuilder computeMessageBuffer(h hVar) {
        StringBuilder sb = new StringBuilder();
        int i2 = hVar.f;
        if (i2 != 0) {
            sb.append(i2);
        }
        String str = hVar.f4736g;
        if (str != null) {
            if (i2 != 0) {
                sb.append(' ');
            }
            sb.append(str);
        }
        return sb;
    }
}
