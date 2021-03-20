package n.m0.g;

import androidx.core.app.NotificationCompat;
import e.t.o;
import e.x.c.i;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import n.f;
import n.k0;
import n.u;
import n.z;

public final class m {
    public List<? extends Proxy> a;

    /* renamed from: b  reason: collision with root package name */
    public int f10222b;
    public List<? extends InetSocketAddress> c;
    public final List<k0> d = new ArrayList();

    /* renamed from: e  reason: collision with root package name */
    public final n.a f10223e;
    public final k f;

    /* renamed from: g  reason: collision with root package name */
    public final f f10224g;

    /* renamed from: h  reason: collision with root package name */
    public final u f10225h;

    public static final class a {
        public int a;

        /* renamed from: b  reason: collision with root package name */
        public final List<k0> f10226b;

        public a(List<k0> list) {
            i.e(list, "routes");
            this.f10226b = list;
        }

        public final boolean a() {
            return this.a < this.f10226b.size();
        }

        public final k0 b() {
            if (a()) {
                List<k0> list = this.f10226b;
                int i2 = this.a;
                this.a = i2 + 1;
                return list.get(i2);
            }
            throw new NoSuchElementException();
        }
    }

    public m(n.a aVar, k kVar, f fVar, u uVar) {
        i.e(aVar, "address");
        i.e(kVar, "routeDatabase");
        i.e(fVar, NotificationCompat.CATEGORY_CALL);
        i.e(uVar, "eventListener");
        this.f10223e = aVar;
        this.f = kVar;
        this.f10224g = fVar;
        this.f10225h = uVar;
        o oVar = o.f7934h;
        this.a = oVar;
        this.c = oVar;
        z zVar = aVar.a;
        n nVar = new n(this, aVar.f10046j, zVar);
        i.e(fVar, NotificationCompat.CATEGORY_CALL);
        i.e(zVar, "url");
        List<Proxy> a2 = nVar.e();
        this.a = a2;
        this.f10222b = 0;
        i.e(fVar, NotificationCompat.CATEGORY_CALL);
        i.e(zVar, "url");
        i.e(a2, "proxies");
    }

    public final boolean a() {
        return b() || (this.d.isEmpty() ^ true);
    }

    public final boolean b() {
        return this.f10222b < this.a.size();
    }
}
