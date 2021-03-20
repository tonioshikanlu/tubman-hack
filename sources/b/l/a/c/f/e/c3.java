package b.l.a.c.f.e;

import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;

public final class c3 {
    public static final String a = "type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey";

    /* renamed from: b  reason: collision with root package name */
    public static final String f2876b = "type.googleapis.com/google.crypto.tink.AesGcmKey";
    @Deprecated
    public static final ka c = ka.s();

    static {
        new i3();
        new s3();
        new v3();
        new p3();
        new b4();
        new f4();
        new y3();
        new i4();
        try {
            a();
        } catch (GeneralSecurityException e2) {
            throw new ExceptionInInitializerError(e2);
        }
    }

    public static void a() {
        boolean z;
        s5.a();
        a3.a(new i3(), true);
        a3.a(new p3(), true);
        a3.a(new s3(), true);
        try {
            Cipher.getInstance("AES/GCM-SIV/NoPadding");
            z = true;
        } catch (NoSuchAlgorithmException | NoSuchPaddingException unused) {
            z = false;
        }
        if (z) {
            a3.a(new v3(), true);
        }
        a3.a(new y3(), true);
        a3.a(new b4(), true);
        a3.a(new f4(), true);
        a3.a(new i4(), true);
        a3.b(new f3());
    }
}
