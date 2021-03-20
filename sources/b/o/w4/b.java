package b.o.w4;

public class b extends Exception {
    public b(String str) {
        super(str);
    }

    public b(String str, Exception exc) {
        super(str, exc);
    }
}
