package b.h.a.m.v;

import androidx.annotation.NonNull;
import b.h.a.m.a;
import b.h.a.m.m;
import b.h.a.m.u.d;
import b.h.a.m.v.g;
import b.h.a.m.w.n;
import java.io.File;
import java.util.List;

public class d implements g, d.a<Object> {

    /* renamed from: h  reason: collision with root package name */
    public final List<m> f649h;

    /* renamed from: i  reason: collision with root package name */
    public final h<?> f650i;

    /* renamed from: j  reason: collision with root package name */
    public final g.a f651j;

    /* renamed from: k  reason: collision with root package name */
    public int f652k = -1;

    /* renamed from: l  reason: collision with root package name */
    public m f653l;

    /* renamed from: m  reason: collision with root package name */
    public List<n<File, ?>> f654m;

    /* renamed from: n  reason: collision with root package name */
    public int f655n;

    /* renamed from: o  reason: collision with root package name */
    public volatile n.a<?> f656o;

    /* renamed from: p  reason: collision with root package name */
    public File f657p;

    public d(h<?> hVar, g.a aVar) {
        List<m> a = hVar.a();
        this.f649h = a;
        this.f650i = hVar;
        this.f651j = aVar;
    }

    public d(List<m> list, h<?> hVar, g.a aVar) {
        this.f649h = list;
        this.f650i = hVar;
        this.f651j = aVar;
    }

    public boolean a() {
        while (true) {
            List<n<File, ?>> list = this.f654m;
            if (list != null) {
                if (this.f655n < list.size()) {
                    this.f656o = null;
                    boolean z = false;
                    while (!z) {
                        if (!(this.f655n < this.f654m.size())) {
                            break;
                        }
                        List<n<File, ?>> list2 = this.f654m;
                        int i2 = this.f655n;
                        this.f655n = i2 + 1;
                        File file = this.f657p;
                        h<?> hVar = this.f650i;
                        this.f656o = list2.get(i2).a(file, hVar.f679e, hVar.f, hVar.f682i);
                        if (this.f656o != null && this.f650i.g(this.f656o.c.a())) {
                            this.f656o.c.f(this.f650i.f688o, this);
                            z = true;
                        }
                    }
                    return z;
                }
            }
            int i3 = this.f652k + 1;
            this.f652k = i3;
            if (i3 >= this.f649h.size()) {
                return false;
            }
            m mVar = this.f649h.get(this.f652k);
            h<?> hVar2 = this.f650i;
            File b2 = hVar2.b().b(new e(mVar, hVar2.f687n));
            this.f657p = b2;
            if (b2 != null) {
                this.f653l = mVar;
                this.f654m = this.f650i.c.f487b.f(b2);
                this.f655n = 0;
            }
        }
    }

    public void c(@NonNull Exception exc) {
        this.f651j.e(this.f653l, exc, this.f656o.c, a.DATA_DISK_CACHE);
    }

    public void cancel() {
        n.a<?> aVar = this.f656o;
        if (aVar != null) {
            aVar.c.cancel();
        }
    }

    public void d(Object obj) {
        this.f651j.h(this.f653l, obj, this.f656o.c, a.DATA_DISK_CACHE, this.f653l);
    }
}
