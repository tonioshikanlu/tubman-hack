package b.l.d.q.f.n;

public class a implements d {
    public final d[] a;

    /* renamed from: b  reason: collision with root package name */
    public final b f5286b;

    public a(int i2, d... dVarArr) {
        this.a = dVarArr;
        this.f5286b = new b(i2);
    }

    public StackTraceElement[] a(StackTraceElement[] stackTraceElementArr) {
        if (stackTraceElementArr.length <= 1024) {
            return stackTraceElementArr;
        }
        StackTraceElement[] stackTraceElementArr2 = stackTraceElementArr;
        for (d dVar : this.a) {
            if (stackTraceElementArr2.length <= 1024) {
                break;
            }
            stackTraceElementArr2 = dVar.a(stackTraceElementArr);
        }
        return stackTraceElementArr2.length > 1024 ? this.f5286b.a(stackTraceElementArr2) : stackTraceElementArr2;
    }
}
