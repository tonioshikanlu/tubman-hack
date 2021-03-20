package b.l.d.s;

import androidx.annotation.NonNull;

public final class c extends RuntimeException {
    public c(@NonNull String str) {
        super(str);
    }

    public c(@NonNull String str, @NonNull Exception exc) {
        super(str, exc);
    }
}
