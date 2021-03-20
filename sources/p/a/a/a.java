package p.a.a;

public class a implements Runnable, l {

    /* renamed from: h  reason: collision with root package name */
    public final k f10500h = new k();

    /* renamed from: i  reason: collision with root package name */
    public final c f10501i;

    public a(c cVar) {
        this.f10501i = cVar;
    }

    public void a(q qVar, Object obj) {
        this.f10500h.a(j.a(qVar, obj));
        this.f10501i.f10511j.execute(this);
    }

    public void run() {
        j b2 = this.f10500h.b();
        if (b2 != null) {
            this.f10501i.c(b2);
            return;
        }
        throw new IllegalStateException("No pending post available");
    }
}
