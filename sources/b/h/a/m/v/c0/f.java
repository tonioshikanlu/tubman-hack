package b.h.a.m.v.c0;

public final class f implements a<byte[]> {
    public String a() {
        return "ByteArrayPool";
    }

    public int b(Object obj) {
        return ((byte[]) obj).length;
    }

    public int c() {
        return 1;
    }

    public Object newArray(int i2) {
        return new byte[i2];
    }
}
