package b.h.a.m;

import b.e.a.a.a;
import java.io.IOException;

public final class e extends IOException {
    public e(int i2) {
        super(a.g("Http request failed with status code: ", i2), (Throwable) null);
    }

    public e(String str) {
        super(str, (Throwable) null);
    }

    public e(String str, int i2) {
        super(str, (Throwable) null);
    }
}
