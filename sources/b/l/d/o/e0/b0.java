package b.l.d.o.e0;

import android.content.Context;
import android.util.Base64;
import android.util.Log;
import androidx.annotation.Nullable;
import b.l.a.c.f.e.c5;
import b.l.a.c.f.e.f5;
import b.l.a.c.f.e.g5;
import b.l.a.c.f.e.j2;
import b.l.a.c.f.e.x4;
import b.l.a.c.f.e.y1;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.security.GeneralSecurityException;

public final class b0 {
    public static b0 c;
    public final String a;

    /* renamed from: b  reason: collision with root package name */
    public g5 f4952b;

    public b0(Context context, String str, boolean z) {
        this.a = str;
        try {
            x4.a();
            f5 f5Var = new f5();
            f5Var.a(context, "GenericIdpKeyset", String.format("com.google.firebase.auth.api.crypto.%s", new Object[]{str}));
            f5Var.b(c5.f2878b);
            String format = String.format("android-keystore://firebear_master_key_id.%s", new Object[]{str});
            if (format.startsWith("android-keystore://")) {
                f5Var.f2956b = format;
                this.f4952b = f5Var.c();
                return;
            }
            throw new IllegalArgumentException("key URI must start with android-keystore://");
        } catch (IOException | GeneralSecurityException e2) {
            String valueOf = String.valueOf(e2.getMessage());
            Log.e("FirebearCryptoHelper", valueOf.length() != 0 ? "Exception encountered during crypto setup:\n".concat(valueOf) : new String("Exception encountered during crypto setup:\n"));
        }
    }

    public static b0 a(Context context, String str) {
        String str2;
        b0 b0Var = c;
        if (b0Var == null || ((str2 = b0Var.a) != str && (str2 == null || !str2.equals(str)))) {
            c = new b0(context, str, true);
        }
        return c;
    }

    @Nullable
    public final String b() {
        j2 b2;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        y1 y1Var = new y1(byteArrayOutputStream);
        try {
            g5 g5Var = this.f4952b;
            synchronized (g5Var) {
                b2 = g5Var.f3000b.b();
            }
            b2.d().c(y1Var);
            return Base64.encodeToString(byteArrayOutputStream.toByteArray(), 8);
        } catch (IOException | GeneralSecurityException e2) {
            String valueOf = String.valueOf(e2.getMessage());
            Log.e("FirebearCryptoHelper", valueOf.length() != 0 ? "Exception encountered when attempting to get Public Key:\n".concat(valueOf) : new String("Exception encountered when attempting to get Public Key:\n"));
            return null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0028, code lost:
        r5 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002b, code lost:
        r5 = java.lang.String.valueOf(r5.getMessage());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0039, code lost:
        if (r5.length() != 0) goto L_0x003b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003b, code lost:
        r5 = "Exception encountered while decrypting bytes:\n".concat(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0040, code lost:
        r5 = new java.lang.String("Exception encountered while decrypting bytes:\n");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0045, code lost:
        android.util.Log.e("FirebearCryptoHelper", r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x004a, code lost:
        return null;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    @androidx.annotation.Nullable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String c(java.lang.String r5) {
        /*
            r4 = this;
            r0 = 0
            b.l.a.c.f.e.g5 r1 = r4.f4952b     // Catch:{ GeneralSecurityException -> 0x002a, UnsupportedEncodingException -> 0x0028 }
            monitor-enter(r1)     // Catch:{ GeneralSecurityException -> 0x002a, UnsupportedEncodingException -> 0x0028 }
            b.l.a.c.f.e.k2 r2 = r1.f3000b     // Catch:{ all -> 0x0025 }
            b.l.a.c.f.e.j2 r2 = r2.b()     // Catch:{ all -> 0x0025 }
            monitor-exit(r1)     // Catch:{ GeneralSecurityException -> 0x002a, UnsupportedEncodingException -> 0x0028 }
            java.lang.Class<b.l.a.c.f.e.b2> r1 = b.l.a.c.f.e.b2.class
            java.lang.Object r1 = r2.e(r1)     // Catch:{ GeneralSecurityException -> 0x002a, UnsupportedEncodingException -> 0x0028 }
            b.l.a.c.f.e.b2 r1 = (b.l.a.c.f.e.b2) r1     // Catch:{ GeneralSecurityException -> 0x002a, UnsupportedEncodingException -> 0x0028 }
            java.lang.String r2 = new java.lang.String     // Catch:{ GeneralSecurityException -> 0x002a, UnsupportedEncodingException -> 0x0028 }
            r3 = 8
            byte[] r5 = android.util.Base64.decode(r5, r3)     // Catch:{ GeneralSecurityException -> 0x002a, UnsupportedEncodingException -> 0x0028 }
            byte[] r5 = r1.a(r5, r0)     // Catch:{ GeneralSecurityException -> 0x002a, UnsupportedEncodingException -> 0x0028 }
            java.lang.String r1 = "UTF-8"
            r2.<init>(r5, r1)     // Catch:{ GeneralSecurityException -> 0x002a, UnsupportedEncodingException -> 0x0028 }
            return r2
        L_0x0025:
            r5 = move-exception
            monitor-exit(r1)     // Catch:{ GeneralSecurityException -> 0x002a, UnsupportedEncodingException -> 0x0028 }
            throw r5     // Catch:{ GeneralSecurityException -> 0x002a, UnsupportedEncodingException -> 0x0028 }
        L_0x0028:
            r5 = move-exception
            goto L_0x002b
        L_0x002a:
            r5 = move-exception
        L_0x002b:
            java.lang.String r5 = r5.getMessage()
            java.lang.String r5 = java.lang.String.valueOf(r5)
            java.lang.String r1 = "Exception encountered while decrypting bytes:\n"
            int r2 = r5.length()
            if (r2 == 0) goto L_0x0040
            java.lang.String r5 = r1.concat(r5)
            goto L_0x0045
        L_0x0040:
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1)
        L_0x0045:
            java.lang.String r1 = "FirebearCryptoHelper"
            android.util.Log.e(r1, r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: b.l.d.o.e0.b0.c(java.lang.String):java.lang.String");
    }
}
