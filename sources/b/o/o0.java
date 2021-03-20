package b.o;

import java.util.TimerTask;

public class o0 extends TimerTask {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ String f6213h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ p0 f6214i;

    public o0(p0 p0Var, String str) {
        this.f6214i = p0Var;
        this.f6213h = str;
    }

    public void run() {
        this.f6214i.f6225b.remove(this.f6213h);
        this.f6214i.a.a();
    }
}
