package b.l.a.c.c;

import java.lang.ref.WeakReference;

public abstract class w extends u {
    public static final WeakReference<byte[]> d = new WeakReference<>((Object) null);
    public WeakReference<byte[]> c = d;

    public w(byte[] bArr) {
        super(bArr);
    }

    public final byte[] k() {
        byte[] bArr;
        synchronized (this) {
            bArr = (byte[]) this.c.get();
            if (bArr == null) {
                bArr = o();
                this.c = new WeakReference<>(bArr);
            }
        }
        return bArr;
    }

    public abstract byte[] o();
}
