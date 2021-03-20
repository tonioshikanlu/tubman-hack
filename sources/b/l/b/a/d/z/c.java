package b.l.b.a.d.z;

public final class c {
    public static final ThreadLocal<char[]> a = new a();

    public static class a extends ThreadLocal<char[]> {
        public Object initialValue() {
            return new char[1024];
        }
    }
}
