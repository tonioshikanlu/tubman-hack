package b.g.a.h;

import android.util.Base64;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.nio.charset.Charset;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.Signature;
import java.util.Collections;

public class c extends r {

    /* renamed from: b  reason: collision with root package name */
    public Signature f422b;

    public c(@Nullable PublicKey publicKey) {
        super(Collections.singletonList("RS256"));
        try {
            Signature instance = Signature.getInstance("SHA256withRSA");
            this.f422b = instance;
            instance.initVerify(publicKey);
        } catch (NoSuchAlgorithmException unused) {
        }
    }

    public void a(@NonNull String[] strArr) {
        StringBuilder sb = new StringBuilder();
        boolean z = false;
        sb.append(strArr[0]);
        sb.append(".");
        sb.append(strArr[1]);
        byte[] bytes = sb.toString().getBytes(Charset.defaultCharset());
        try {
            byte[] decode = Base64.decode(strArr[2], 10);
            this.f422b.update(bytes);
            z = this.f422b.verify(decode);
        } catch (Exception unused) {
        }
        if (!z) {
            throw new t("Invalid ID token signature.");
        }
    }
}
