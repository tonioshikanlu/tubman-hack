package e.a.a.a.y0.h;

import e.a.a.a.y0.h.p;
import java.io.FilterInputStream;
import java.io.InputStream;

public abstract class a implements p {

    /* renamed from: e.a.a.a.y0.h.a$a  reason: collision with other inner class name */
    public static abstract class C0205a<BuilderType extends C0205a> implements p.a {

        /* renamed from: e.a.a.a.y0.h.a$a$a  reason: collision with other inner class name */
        public static final class C0206a extends FilterInputStream {

            /* renamed from: h  reason: collision with root package name */
            public int f9217h;

            public C0206a(InputStream inputStream, int i2) {
                super(inputStream);
                this.f9217h = i2;
            }

            public int available() {
                return Math.min(super.available(), this.f9217h);
            }

            public int read() {
                if (this.f9217h <= 0) {
                    return -1;
                }
                int read = super.read();
                if (read >= 0) {
                    this.f9217h--;
                }
                return read;
            }

            public int read(byte[] bArr, int i2, int i3) {
                int i4 = this.f9217h;
                if (i4 <= 0) {
                    return -1;
                }
                int read = super.read(bArr, i2, Math.min(i3, i4));
                if (read >= 0) {
                    this.f9217h -= read;
                }
                return read;
            }

            public long skip(long j2) {
                long skip = super.skip(Math.min(j2, (long) this.f9217h));
                if (skip >= 0) {
                    this.f9217h = (int) (((long) this.f9217h) - skip);
                }
                return skip;
            }
        }

        /* renamed from: h */
        public abstract BuilderType H(d dVar, f fVar);
    }
}
