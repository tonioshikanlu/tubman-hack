package b.l.a.c.f.f;

import java.io.OutputStream;
import java.util.Objects;

public final class b extends OutputStream {
    public final String toString() {
        return "ByteStreams.nullOutputStream()";
    }

    public final void write(int i2) {
    }

    public final void write(byte[] bArr) {
        Objects.requireNonNull(bArr);
    }

    public final void write(byte[] bArr, int i2, int i3) {
        Objects.requireNonNull(bArr);
    }
}
