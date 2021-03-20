package b.h.a.m.x.g;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import b.h.a.m.v.s;
import b.h.a.m.x.e.b;
import b.h.a.m.x.g.g;

public class e extends b<c> implements s {
    public e(c cVar) {
        super(cVar);
    }

    public int a() {
        g gVar = ((c) this.f893h).f899h.a;
        return gVar.a.f() + gVar.f920o;
    }

    @NonNull
    public Class<c> b() {
        return c.class;
    }

    public void initialize() {
        ((c) this.f893h).b().prepareToDraw();
    }

    public void recycle() {
        ((c) this.f893h).stop();
        c cVar = (c) this.f893h;
        cVar.f902k = true;
        g gVar = cVar.f899h.a;
        gVar.c.clear();
        Bitmap bitmap = gVar.f917l;
        if (bitmap != null) {
            gVar.f911e.e(bitmap);
            gVar.f917l = null;
        }
        gVar.f = false;
        g.a aVar = gVar.f914i;
        if (aVar != null) {
            gVar.d.n(aVar);
            gVar.f914i = null;
        }
        g.a aVar2 = gVar.f916k;
        if (aVar2 != null) {
            gVar.d.n(aVar2);
            gVar.f916k = null;
        }
        g.a aVar3 = gVar.f919n;
        if (aVar3 != null) {
            gVar.d.n(aVar3);
            gVar.f919n = null;
        }
        gVar.a.clear();
        gVar.f915j = true;
    }
}
