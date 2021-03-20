package b.l.a.c.c.p;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import b.l.a.c.c.q.b;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class a {
    public static byte[] a(Context context, String str) {
        MessageDigest b2;
        PackageInfo packageInfo = b.a(context).a.getPackageManager().getPackageInfo(str, 64);
        Signature[] signatureArr = packageInfo.signatures;
        if (signatureArr == null || signatureArr.length != 1 || (b2 = b("SHA1")) == null) {
            return null;
        }
        return b2.digest(packageInfo.signatures[0].toByteArray());
    }

    public static MessageDigest b(String str) {
        int i2 = 0;
        while (i2 < 2) {
            try {
                MessageDigest instance = MessageDigest.getInstance(str);
                if (instance != null) {
                    return instance;
                }
                i2++;
            } catch (NoSuchAlgorithmException unused) {
            }
        }
        return null;
    }
}
