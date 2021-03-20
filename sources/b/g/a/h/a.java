package b.g.a.h;

import android.util.Log;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class a {
    public static final String a = "a";

    public byte[] a(String str) {
        try {
            return str.getBytes("US-ASCII");
        } catch (UnsupportedEncodingException e2) {
            Log.e(a, "Could not convert string to an ASCII byte array", e2);
            throw new IllegalStateException("Could not convert string to an ASCII byte array", e2);
        }
    }

    public byte[] b(byte[] bArr) {
        try {
            MessageDigest instance = MessageDigest.getInstance("SHA-256");
            instance.update(bArr, 0, bArr.length);
            return instance.digest();
        } catch (NoSuchAlgorithmException e2) {
            Log.e(a, "Failed to get SHA-256 signature", e2);
            throw new IllegalStateException("Failed to get SHA-256 signature", e2);
        }
    }
}
