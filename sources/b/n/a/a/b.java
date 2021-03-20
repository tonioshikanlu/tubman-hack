package b.n.a.a;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import b.h.a.c;
import b.h.a.m.p;
import b.h.a.m.v.c0.d;
import b.h.a.m.v.w;
import b.h.a.m.x.c.l;
import b.h.a.m.x.c.u;
import b.h.a.m.x.g.i;
import b.h.a.m.x.h.e;
import b.i.a.f;
import b.i.a.g;
import java.util.Stack;

@RestrictTo({RestrictTo.Scope.LIBRARY})
public final class b implements e<f, BitmapDrawable> {
    public final d a;

    /* renamed from: b  reason: collision with root package name */
    public final Resources f5978b;
    public final b.n.a.a.f.a c;

    public static final class a implements b.n.a.a.f.a {
        public final d a;

        public a(@NonNull d dVar) {
            this.a = dVar;
        }
    }

    public b(@NonNull Context context, @NonNull c cVar) {
        this.f5978b = context.getResources();
        d dVar = cVar.f467h;
        this.a = dVar;
        this.c = new a(dVar);
    }

    public w<BitmapDrawable> a(@NonNull w<f> wVar, @Nullable p pVar) {
        b.h.a.m.b bVar;
        if (wVar instanceof d) {
            l lVar = pVar == null ? null : (l) pVar.c(l.f);
            if (lVar != null) {
                d dVar = (d) wVar;
                float b2 = lVar.b(Math.round(wVar.get().d()), Math.round(wVar.get().c()), dVar.f5980i, dVar.f5981j);
                f fVar = wVar.get();
                fVar.i(fVar.d() * b2);
                fVar.h(fVar.c() * b2);
            }
        }
        f fVar2 = wVar.get();
        b.n.a.a.f.a aVar = this.c;
        if (pVar == null) {
            bVar = null;
        } else {
            bVar = (b.h.a.m.b) pVar.c(i.a);
        }
        Bitmap d = ((a) aVar).a.d(Math.round(fVar2.d()), Math.round(fVar2.c()), (bVar != null && bVar.ordinal() == 1) ? Bitmap.Config.RGB_565 : Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(d);
        f.a aVar2 = new f.a(0.0f, 0.0f, (float) canvas.getWidth(), (float) canvas.getHeight());
        g gVar = new g(canvas, 96.0f);
        gVar.f1223b = fVar2;
        f.e0 e0Var = fVar2.a;
        if (e0Var == null) {
            g.a0("Nothing to render. Document is empty.", new Object[0]);
        } else {
            f.a aVar3 = e0Var.f1200o;
            b.i.a.e eVar = e0Var.f1189n;
            gVar.c = new g.h(gVar);
            gVar.d = new Stack<>();
            gVar.W(gVar.c, f.d0.a());
            g.h hVar = gVar.c;
            hVar.f = null;
            hVar.f1239h = false;
            gVar.d.push(new g.h(gVar, hVar));
            gVar.f = new Stack<>();
            gVar.f1224e = new Stack<>();
            gVar.i(e0Var);
            gVar.T();
            f.a aVar4 = new f.a(aVar2);
            f.o oVar = e0Var.r;
            if (oVar != null) {
                aVar4.c = oVar.c(gVar, aVar4.c);
            }
            f.o oVar2 = e0Var.s;
            if (oVar2 != null) {
                aVar4.d = oVar2.c(gVar, aVar4.d);
            }
            gVar.K(e0Var, aVar4, aVar3, eVar);
            gVar.S();
        }
        return u.c(this.f5978b, new b.h.a.m.x.c.e(d, this.a));
    }
}
