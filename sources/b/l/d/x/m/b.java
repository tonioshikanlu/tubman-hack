package b.l.d.x.m;

import android.content.SharedPreferences;
import android.util.Base64;
import android.util.Log;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;

public class b {
    public static final String[] c = {"*", "FCM", "GCM", ""};
    @GuardedBy("iidPrefs")
    public final SharedPreferences a;

    /* renamed from: b  reason: collision with root package name */
    public final String f5383b;

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0046, code lost:
        if (r0.isEmpty() != false) goto L_0x0048;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public b(@androidx.annotation.NonNull b.l.d.d r4) {
        /*
            r3 = this;
            r3.<init>()
            r4.a()
            android.content.Context r0 = r4.a
            java.lang.String r1 = "com.google.android.gms.appid"
            r2 = 0
            android.content.SharedPreferences r0 = r0.getSharedPreferences(r1, r2)
            r3.a = r0
            r4.a()
            b.l.d.l r0 = r4.c
            java.lang.String r0 = r0.f4919e
            if (r0 == 0) goto L_0x001b
            goto L_0x0049
        L_0x001b:
            r4.a()
            b.l.d.l r4 = r4.c
            java.lang.String r0 = r4.f4918b
            java.lang.String r4 = "1:"
            boolean r4 = r0.startsWith(r4)
            if (r4 != 0) goto L_0x0033
            java.lang.String r4 = "2:"
            boolean r4 = r0.startsWith(r4)
            if (r4 != 0) goto L_0x0033
            goto L_0x0049
        L_0x0033:
            java.lang.String r4 = ":"
            java.lang.String[] r4 = r0.split(r4)
            int r0 = r4.length
            r1 = 4
            r2 = 0
            if (r0 == r1) goto L_0x003f
            goto L_0x0048
        L_0x003f:
            r0 = 1
            r0 = r4[r0]
            boolean r4 = r0.isEmpty()
            if (r4 == 0) goto L_0x0049
        L_0x0048:
            r0 = r2
        L_0x0049:
            r3.f5383b = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: b.l.d.x.m.b.<init>(b.l.d.d):void");
    }

    @Nullable
    public final String a() {
        String str;
        PublicKey publicKey;
        synchronized (this.a) {
            str = null;
            String string = this.a.getString("|S||P|", (String) null);
            if (string == null) {
                return null;
            }
            try {
                publicKey = KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64.decode(string, 8)));
            } catch (IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException e2) {
                Log.w("ContentValues", "Invalid key stored " + e2);
                publicKey = null;
            }
            if (publicKey == null) {
                return null;
            }
            try {
                byte[] digest = MessageDigest.getInstance("SHA1").digest(publicKey.getEncoded());
                digest[0] = (byte) (((digest[0] & 15) + 112) & 255);
                str = Base64.encodeToString(digest, 0, 8, 11);
            } catch (NoSuchAlgorithmException unused) {
                Log.w("ContentValues", "Unexpected error, device missing required algorithms");
            }
        }
        return str;
    }
}
