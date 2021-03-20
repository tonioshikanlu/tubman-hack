package b.l.e;

public class u extends RuntimeException {
    public u(String str) {
        super(str);
    }

    public u(String str, Throwable th) {
        super(str, th);
    }

    public u(Throwable th) {
        super(th);
    }
}
