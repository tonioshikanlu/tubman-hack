package b.l.d.q.f.h;

import android.util.Log;
import b.l.d.q.f.b;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Locale;

public class e implements a {
    public static final Charset d = Charset.forName("UTF-8");
    public final File a;

    /* renamed from: b  reason: collision with root package name */
    public final int f5147b;
    public c c;

    public static class a {
        public final byte[] a;

        /* renamed from: b  reason: collision with root package name */
        public final int f5148b;

        public a(byte[] bArr, int i2) {
            this.a = bArr;
            this.f5148b = i2;
        }
    }

    public e(File file, int i2) {
        this.a = file;
        this.f5147b = i2;
    }

    public void a() {
        b.l.d.q.f.g.e.a(this.c, "There was a problem closing the Crashlytics log file.");
        this.c = null;
    }

    public String b() {
        byte[] d2 = d();
        if (d2 != null) {
            return new String(d2, d);
        }
        return null;
    }

    public void c(long j2, String str) {
        e();
        if (this.c != null) {
            if (str == null) {
                str = "null";
            }
            try {
                int i2 = this.f5147b / 4;
                if (str.length() > i2) {
                    str = "..." + str.substring(str.length() - i2);
                }
                this.c.e(String.format(Locale.US, "%d %s%n", new Object[]{Long.valueOf(j2), str.replaceAll("\r", " ").replaceAll("\n", " ")}).getBytes(d));
                while (!this.c.N() && this.c.k0() > this.f5147b) {
                    this.c.Y();
                }
            } catch (IOException e2) {
                if (b.a.a(6)) {
                    Log.e("FirebaseCrashlytics", "There was a problem writing to the Crashlytics log.", e2);
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0044 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0045  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public byte[] d() {
        /*
            r7 = this;
            java.io.File r0 = r7.a
            boolean r0 = r0.exists()
            r1 = 0
            r2 = 0
            if (r0 != 0) goto L_0x000c
        L_0x000a:
            r4 = r1
            goto L_0x0042
        L_0x000c:
            r7.e()
            b.l.d.q.f.h.c r0 = r7.c
            if (r0 != 0) goto L_0x0014
            goto L_0x000a
        L_0x0014:
            r3 = 1
            int[] r3 = new int[r3]
            r3[r2] = r2
            int r0 = r0.k0()
            byte[] r0 = new byte[r0]
            b.l.d.q.f.h.c r4 = r7.c     // Catch:{ IOException -> 0x002a }
            b.l.d.q.f.h.d r5 = new b.l.d.q.f.h.d     // Catch:{ IOException -> 0x002a }
            r5.<init>(r7, r0, r3)     // Catch:{ IOException -> 0x002a }
            r4.H(r5)     // Catch:{ IOException -> 0x002a }
            goto L_0x003b
        L_0x002a:
            r4 = move-exception
            b.l.d.q.f.b r5 = b.l.d.q.f.b.a
            r6 = 6
            boolean r5 = r5.a(r6)
            if (r5 == 0) goto L_0x003b
            java.lang.String r5 = "FirebaseCrashlytics"
            java.lang.String r6 = "A problem occurred while reading the Crashlytics log file."
            android.util.Log.e(r5, r6, r4)
        L_0x003b:
            b.l.d.q.f.h.e$a r4 = new b.l.d.q.f.h.e$a
            r3 = r3[r2]
            r4.<init>(r0, r3)
        L_0x0042:
            if (r4 != 0) goto L_0x0045
            return r1
        L_0x0045:
            int r0 = r4.f5148b
            byte[] r1 = new byte[r0]
            byte[] r3 = r4.a
            java.lang.System.arraycopy(r3, r2, r1, r2, r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: b.l.d.q.f.h.e.d():byte[]");
    }

    public final void e() {
        if (this.c == null) {
            try {
                this.c = new c(this.a);
            } catch (IOException e2) {
                b bVar = b.a;
                StringBuilder y = b.e.a.a.a.y("Could not open log file: ");
                y.append(this.a);
                bVar.e(y.toString(), e2);
            }
        }
    }
}
