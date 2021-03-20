package b.l.d.x.n;

import androidx.annotation.Nullable;
import com.google.auto.value.AutoValue;

@AutoValue
public abstract class d {

    public enum a {
        OK,
        BAD_CONFIG
    }

    @Nullable
    public abstract f a();

    @Nullable
    public abstract String b();

    @Nullable
    public abstract String c();

    @Nullable
    public abstract a d();

    @Nullable
    public abstract String e();
}
