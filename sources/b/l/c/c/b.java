package b.l.c.c;

import java.io.OutputStream;
import java.util.Objects;

public final class b {
    public static final /* synthetic */ int a = 0;

    public static class a extends OutputStream {
        public String toString() {
            return "ByteStreams.nullOutputStream()";
        }

        public void write(int i2) {
        }

        public void write(byte[] bArr) {
            Objects.requireNonNull(bArr);
        }

        public void write(byte[] bArr, int i2, int i3) {
            Objects.requireNonNull(bArr);
        }
    }

    static {
        new a();
    }
}
