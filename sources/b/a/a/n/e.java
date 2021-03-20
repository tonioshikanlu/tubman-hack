package b.a.a.n;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.RemoteException;
import b.h.a.q.h.c;
import b.h.a.q.i.d;
import b.l.a.c.h.a;
import b.l.a.c.h.g.b;
import com.appfoundry.previewer.model.Marker;
import e.x.c.i;
import e.x.c.u;
import java.util.Objects;

public final class e extends c<Bitmap> {

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ u f352k;

    /* renamed from: l  reason: collision with root package name */
    public final /* synthetic */ a f353l;

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ Marker f354m;

    public e(u uVar, a aVar, Marker marker) {
        this.f352k = uVar;
        this.f353l = aVar;
        this.f354m = marker;
    }

    public void b(Object obj, d dVar) {
        Bitmap bitmap = (Bitmap) obj;
        i.e(bitmap, "resource");
        u uVar = this.f352k;
        T a = this.f353l.a(c.w(this.f354m));
        i.d(a, "map.addMarker(withMarkerOptions(marker))");
        uVar.f7989h = a;
        b bVar = (b) this.f352k.f7989h;
        String I = b.f.a.e.I(this.f354m);
        Objects.requireNonNull(bVar);
        try {
            bVar.a.W(new b.l.a.c.d.d(I));
            b bVar2 = (b) this.f352k.f7989h;
            Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, 100, 100, false);
            try {
                b.l.a.c.f.h.d dVar2 = b.l.a.c.b.a.f2579g;
                b.l.a.c.b.a.B(dVar2, "IBitmapDescriptorFactory is not initialized");
                b.l.a.c.d.b T0 = dVar2.T0(createScaledBitmap);
                Objects.requireNonNull(T0, "null reference");
                Objects.requireNonNull(bVar2);
                try {
                    bVar2.a.W0(T0);
                } catch (RemoteException e2) {
                    throw new b.l.a.c.h.g.d(e2);
                }
            } catch (RemoteException e3) {
                throw new b.l.a.c.h.g.d(e3);
            }
        } catch (RemoteException e4) {
            throw new b.l.a.c.h.g.d(e4);
        }
    }

    public void g(Drawable drawable) {
    }
}
