package b.l.a.d.a.b;

import android.content.Context;
import android.util.Base64;
import androidx.exifinterface.media.ExifInterface;
import b.l.a.c.b.a;
import b.l.a.d.a.e.b0;
import java.io.File;
import java.io.FileInputStream;
import java.security.MessageDigest;
import java.util.List;

public final class e1 {
    public static d0 a;

    public static String a(List<File> list) {
        int read;
        MessageDigest instance = MessageDigest.getInstance("SHA256");
        byte[] bArr = new byte[8192];
        for (File fileInputStream : list) {
            FileInputStream fileInputStream2 = new FileInputStream(fileInputStream);
            do {
                try {
                    read = fileInputStream2.read(bArr);
                    if (read > 0) {
                        instance.update(bArr, 0, read);
                    }
                } catch (Throwable th) {
                    b0.a.a(th, th);
                }
            } while (read != -1);
            fileInputStream2.close();
        }
        return Base64.encodeToString(instance.digest(), 11);
        throw th;
    }

    public static long b(byte[] bArr, int i2) {
        return ((long) ((c(bArr, i2 + 2) << 16) | c(bArr, i2))) & 4294967295L;
    }

    public static int c(byte[] bArr, int i2) {
        return ((bArr[i2 + 1] & ExifInterface.MARKER) << 8) | (bArr[i2] & ExifInterface.MARKER);
    }

    public static boolean d(int i2) {
        return i2 == 1 || i2 == 7 || i2 == 2 || i2 == 3;
    }

    public static boolean e(int i2) {
        return i2 == 5 || i2 == 6 || i2 == 4;
    }

    public static boolean f(int i2) {
        return i2 == 2 || i2 == 7 || i2 == 3;
    }

    public static boolean g(int i2, int i3) {
        if (i2 == 5) {
            if (i3 != 5) {
                return true;
            }
            i2 = 5;
        }
        if (i2 == 6 && i3 != 6 && i3 != 5) {
            return true;
        }
        if (i2 == 4 && i3 != 4) {
            return true;
        }
        if (i2 == 3 && (i3 == 2 || i3 == 7 || i3 == 1 || i3 == 8)) {
            return true;
        }
        if (i2 == 2) {
            return i3 == 1 || i3 == 8;
        }
        return false;
    }

    public static synchronized d0 h(Context context) {
        d0 d0Var;
        synchronized (e1.class) {
            if (a == null) {
                Context applicationContext = context.getApplicationContext();
                if (applicationContext != null) {
                    context = applicationContext;
                }
                f2 f2Var = new f2(context);
                a.c0(f2Var, f2.class);
                a = new d0(f2Var);
            }
            d0Var = a;
        }
        return d0Var;
    }
}
