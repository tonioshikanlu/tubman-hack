package b.p.b.a0;

public abstract class d implements Runnable {

    /* renamed from: h  reason: collision with root package name */
    public final String f6472h;

    public d(String str, Object... objArr) {
        this.f6472h = String.format(str, objArr);
    }

    public abstract void a();

    public final void run() {
        String name = Thread.currentThread().getName();
        Thread.currentThread().setName(this.f6472h);
        try {
            a();
        } finally {
            Thread.currentThread().setName(name);
        }
    }
}
