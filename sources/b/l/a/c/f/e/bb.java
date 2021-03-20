package b.l.a.c.f.e;

import b.l.a.c.b.a;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;
import javax.crypto.AEADBadTagException;

public abstract class bb implements x1 {
    public final za a;

    /* renamed from: b  reason: collision with root package name */
    public final za f2858b;

    public bb(byte[] bArr) {
        this.a = c(bArr, 1);
        this.f2858b = c(bArr, 0);
    }

    public final byte[] a(byte[] bArr, byte[] bArr2) {
        throw null;
    }

    public final byte[] b(byte[] bArr, byte[] bArr2) {
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        if (wrap.remaining() >= this.a.c() + 16) {
            int position = wrap.position();
            byte[] bArr3 = new byte[16];
            wrap.position(wrap.limit() - 16);
            wrap.get(bArr3);
            wrap.position(position);
            wrap.limit(wrap.limit() - 16);
            byte[] bArr4 = new byte[this.a.c()];
            wrap.get(bArr4);
            try {
                byte[] bArr5 = new byte[32];
                this.f2858b.e(bArr4, 0).get(bArr5);
                int length = bArr2.length;
                int i2 = length & 15;
                int i3 = i2 == 0 ? length : (length + 16) - i2;
                int remaining = wrap.remaining();
                int i4 = remaining % 16;
                int i5 = (i4 == 0 ? remaining : (remaining + 16) - i4) + i3;
                ByteBuffer order = ByteBuffer.allocate(i5 + 16).order(ByteOrder.LITTLE_ENDIAN);
                order.put(bArr2);
                order.position(i3);
                order.put(wrap);
                order.position(i5);
                order.putLong((long) length);
                order.putLong((long) remaining);
                if (a.q1(a.s1(bArr5, order.array()), bArr3)) {
                    wrap.position(position);
                    return this.a.d(wrap);
                }
                throw new GeneralSecurityException("invalid MAC");
            } catch (GeneralSecurityException e2) {
                throw new AEADBadTagException(e2.toString());
            }
        } else {
            throw new GeneralSecurityException("ciphertext too short");
        }
    }

    public abstract za c(byte[] bArr, int i2);
}
