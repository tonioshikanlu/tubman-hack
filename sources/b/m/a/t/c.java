package b.m.a.t;

import android.hardware.Camera;
import android.util.Log;
import b.m.a.t.e;

public class c implements Runnable {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ m f5942h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ d f5943i;

    public class a implements Runnable {
        public a() {
        }

        public void run() {
            c cVar = c.this;
            e eVar = cVar.f5943i.c;
            m mVar = cVar.f5942h;
            Camera camera = eVar.a;
            if (camera != null && eVar.f5961e) {
                e.a aVar = eVar.f5968m;
                aVar.a = mVar;
                camera.setOneShotPreviewCallback(aVar);
            }
        }
    }

    public c(d dVar, m mVar) {
        this.f5943i = dVar;
        this.f5942h = mVar;
    }

    public void run() {
        d dVar = this.f5943i;
        if (!dVar.f) {
            Log.d(d.f5945n, "Camera is closed, not requesting preview");
        } else {
            dVar.a.b(new a());
        }
    }
}
