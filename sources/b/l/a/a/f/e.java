package b.l.a.a.f;

import androidx.annotation.Nullable;
import b.l.a.a.f.a;
import com.google.auto.value.AutoValue;
import java.util.HashMap;
import java.util.Map;

@AutoValue
public abstract class e {

    @AutoValue.Builder
    public static abstract class a {
        public final a a(String str, String str2) {
            c().put(str, str2);
            return this;
        }

        public abstract e b();

        public abstract Map<String, String> c();
    }

    public final String a(String str) {
        String str2 = b().get(str);
        return str2 == null ? "" : str2;
    }

    public abstract Map<String, String> b();

    @Nullable
    public abstract Integer c();

    public abstract d d();

    public abstract long e();

    public final int f(String str) {
        String str2 = b().get(str);
        if (str2 == null) {
            return 0;
        }
        return Integer.valueOf(str2).intValue();
    }

    public abstract String g();

    public abstract long h();

    public a i() {
        a.b bVar = new a.b();
        bVar.f(g());
        bVar.f2468b = c();
        bVar.d(d());
        bVar.e(e());
        bVar.g(h());
        bVar.f = new HashMap(b());
        return bVar;
    }
}
