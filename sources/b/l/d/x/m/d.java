package b.l.d.x.m;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import b.l.d.x.m.c;
import com.google.auto.value.AutoValue;

@AutoValue
public abstract class d {
    public static final /* synthetic */ int a = 0;

    @AutoValue.Builder
    public static abstract class a {
        @NonNull
        public abstract d a();

        @NonNull
        public abstract a b(@NonNull c.a aVar);
    }

    static {
        Long l2 = 0L;
        String str = l2 == null ? " expiresInSecs" : "";
        if (l2 == null) {
            str = b.e.a.a.a.m(str, " tokenCreationEpochInSecs");
        }
        if (str.isEmpty()) {
            l2.longValue();
            l2.longValue();
            return;
        }
        throw new IllegalStateException(b.e.a.a.a.m("Missing required properties:", str));
    }

    @Nullable
    public abstract String a();

    public abstract long b();

    @Nullable
    public abstract String c();

    @Nullable
    public abstract String d();

    @Nullable
    public abstract String e();

    @NonNull
    public abstract c.a f();

    public abstract long g();

    public boolean h() {
        return f() == c.a.REGISTER_ERROR;
    }

    public boolean i() {
        c.a aVar = ((a) this).c;
        return aVar == c.a.NOT_GENERATED || aVar == c.a.ATTEMPT_MIGRATION;
    }

    @NonNull
    public abstract a j();
}
