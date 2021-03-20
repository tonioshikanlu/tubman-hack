package b.l.d;

import androidx.annotation.NonNull;
import b.l.a.c.b.a;

public class i extends Exception {
    @Deprecated
    public i() {
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public i(@NonNull String str) {
        super(str);
        a.y(str, "Detail message must not be empty");
    }
}
