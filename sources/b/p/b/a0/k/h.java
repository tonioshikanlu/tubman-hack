package b.p.b.a0.k;

import b.p.b.a0.i;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import o.a0;
import o.e;
import o.f;
import o.g;
import o.z;

public class h implements z {

    /* renamed from: h  reason: collision with root package name */
    public boolean f6651h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ g f6652i;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ b f6653j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ f f6654k;

    public h(g gVar, g gVar2, b bVar, f fVar) {
        this.f6652i = gVar2;
        this.f6653j = bVar;
        this.f6654k = fVar;
    }

    public long T(e eVar, long j2) {
        try {
            long T = this.f6652i.T(eVar, j2);
            if (T == -1) {
                if (!this.f6651h) {
                    this.f6651h = true;
                    this.f6654k.close();
                }
                return -1;
            }
            eVar.z(this.f6654k.a(), eVar.f10453i - T, T);
            this.f6654k.Q();
            return T;
        } catch (IOException e2) {
            if (!this.f6651h) {
                this.f6651h = true;
                this.f6653j.b();
            }
            throw e2;
        }
    }

    public void close() {
        if (!this.f6651h && !i.e(this, 100, TimeUnit.MILLISECONDS)) {
            this.f6651h = true;
            this.f6653j.b();
        }
        this.f6652i.close();
    }

    public a0 f() {
        return this.f6652i.f();
    }
}
