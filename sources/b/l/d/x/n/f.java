package b.l.d.x.n;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import b.l.d.x.n.b;
import com.google.auto.value.AutoValue;

@AutoValue
public abstract class f {

    @AutoValue.Builder
    public static abstract class a {
        @NonNull
        public abstract f a();

        @NonNull
        public abstract a b(long j2);
    }

    public enum b {
        OK,
        BAD_CONFIG,
        AUTH_ERROR
    }

    @NonNull
    public static a a() {
        b.C0091b bVar = new b.C0091b();
        bVar.b(0);
        return bVar;
    }

    @Nullable
    public abstract b b();

    @Nullable
    public abstract String c();

    @NonNull
    public abstract long d();
}
