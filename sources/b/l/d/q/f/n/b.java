package b.l.d.q.f.n;

public class b implements d {
    public final int a;

    public b(int i2) {
        this.a = i2;
    }

    public StackTraceElement[] a(StackTraceElement[] stackTraceElementArr) {
        int length = stackTraceElementArr.length;
        int i2 = this.a;
        if (length <= i2) {
            return stackTraceElementArr;
        }
        int i3 = i2 / 2;
        int i4 = i2 - i3;
        StackTraceElement[] stackTraceElementArr2 = new StackTraceElement[i2];
        System.arraycopy(stackTraceElementArr, 0, stackTraceElementArr2, 0, i4);
        System.arraycopy(stackTraceElementArr, stackTraceElementArr.length - i3, stackTraceElementArr2, i4, i3);
        return stackTraceElementArr2;
    }
}
