package b.l.b.a.a.b;

import b.l.b.a.a.b.f;
import com.google.api.client.http.HttpHeaders;
import java.util.List;
import java.util.regex.Pattern;

public class c {
    public static final Pattern a = Pattern.compile("\\s*error\\s*=\\s*\"?invalid_token\"?");

    public static final class a implements f.a {
        public void a(b.l.b.a.b.f fVar, String str) {
            HttpHeaders httpHeaders = fVar.f4721b;
            httpHeaders.o("Bearer " + str);
        }

        public String b(b.l.b.a.b.f fVar) {
            List<String> f = fVar.f4721b.f();
            if (f == null) {
                return null;
            }
            for (String next : f) {
                if (next.startsWith("Bearer ")) {
                    return next.substring(7);
                }
            }
            return null;
        }
    }
}
