package b.l.d.o;

import android.net.Uri;
import androidx.annotation.Nullable;
import java.util.Set;

public class b {

    /* renamed from: e  reason: collision with root package name */
    public static final /* synthetic */ int f4939e = 0;
    public final String a;

    /* renamed from: b  reason: collision with root package name */
    public final String f4940b;
    public final String c;
    @Nullable
    public final String d;

    static {
        new m0();
    }

    public b(String str) {
        String a2 = a(str, "apiKey");
        this.a = a2;
        String a3 = a(str, "oobCode");
        this.f4940b = a3;
        String a4 = a(str, "mode");
        this.c = a4;
        if (a2 == null || a3 == null || a4 == null) {
            throw new IllegalArgumentException(String.format("%s, %s and %s are required in a valid action code URL", new Object[]{"apiKey", "oobCode", "mode"}));
        }
        a(str, "continueUrl");
        a(str, "languageCode");
        this.d = a(str, "tenantId");
    }

    public static final String a(String str, String str2) {
        Uri parse = Uri.parse(str);
        try {
            Set<String> queryParameterNames = parse.getQueryParameterNames();
            if (queryParameterNames.contains(str2)) {
                return parse.getQueryParameter(str2);
            }
            if (queryParameterNames.contains("link")) {
                return Uri.parse(parse.getQueryParameter("link")).getQueryParameter(str2);
            }
            return null;
        } catch (UnsupportedOperationException unused) {
            return null;
        }
    }
}
