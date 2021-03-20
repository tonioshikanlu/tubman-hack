package b.h.a.m;

import androidx.annotation.NonNull;
import java.nio.charset.Charset;
import java.security.MessageDigest;

public interface m {
    public static final Charset a = Charset.forName("UTF-8");

    void b(@NonNull MessageDigest messageDigest);

    boolean equals(Object obj);

    int hashCode();
}
