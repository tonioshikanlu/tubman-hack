package b.l.a.c.f.e;

public final class ya extends za {
    public ya(byte[] bArr, int i2) {
        super(bArr, i2);
    }

    public final int[] b(int[] iArr, int i2) {
        int length = iArr.length;
        if (length == 3) {
            int[] iArr2 = new int[16];
            za.f(iArr2, this.a);
            iArr2[12] = i2;
            System.arraycopy(iArr, 0, iArr2, 13, 3);
            return iArr2;
        }
        throw new IllegalArgumentException(String.format("ChaCha20 uses 96-bit nonces, but got a %d-bit nonce", new Object[]{Integer.valueOf(length * 32)}));
    }

    public final int c() {
        return 12;
    }
}
