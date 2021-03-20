package o;

import java.io.InputStream;
import java.nio.channels.ReadableByteChannel;
import java.nio.charset.Charset;

public interface g extends z, ReadableByteChannel {
    byte[] A();

    long C(h hVar);

    boolean D();

    byte[] G(long j2);

    long P(h hVar);

    String U(long j2);

    long V(x xVar);

    e a();

    void c0(long j2);

    e d();

    long h0();

    String i0(Charset charset);

    InputStream j0();

    int l0(q qVar);

    h p(long j2);

    byte readByte();

    int readInt();

    short readShort();

    void skip(long j2);

    boolean t(long j2);

    String y();
}
