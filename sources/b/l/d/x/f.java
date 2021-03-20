package b.l.d.x;

import androidx.annotation.NonNull;
import b.l.d.i;

public class f extends i {

    public enum a {
        BAD_CONFIG,
        UNAVAILABLE,
        TOO_MANY_REQUESTS
    }

    public f(@NonNull a aVar) {
    }

    public f(@NonNull String str, @NonNull a aVar) {
        super(str);
    }
}
