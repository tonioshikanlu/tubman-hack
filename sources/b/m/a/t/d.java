package b.m.a.t;

import android.content.Context;
import android.hardware.Camera;
import android.os.Handler;
import android.util.Log;
import android.view.SurfaceHolder;
import app.bravostudio.A01F175WZXYVE9FWM81EKWKN6FN.R;
import b.l.f.x.a.g;
import b.m.a.r;

public class d {

    /* renamed from: n  reason: collision with root package name */
    public static final String f5945n = "d";
    public h a;

    /* renamed from: b  reason: collision with root package name */
    public g f5946b;
    public e c;
    public Handler d;

    /* renamed from: e  reason: collision with root package name */
    public j f5947e;
    public boolean f = false;

    /* renamed from: g  reason: collision with root package name */
    public boolean f5948g = true;

    /* renamed from: h  reason: collision with root package name */
    public Handler f5949h;

    /* renamed from: i  reason: collision with root package name */
    public f f5950i = new f();

    /* renamed from: j  reason: collision with root package name */
    public Runnable f5951j = new a();

    /* renamed from: k  reason: collision with root package name */
    public Runnable f5952k = new b();

    /* renamed from: l  reason: collision with root package name */
    public Runnable f5953l = new c();

    /* renamed from: m  reason: collision with root package name */
    public Runnable f5954m = new C0105d();

    public class a implements Runnable {
        public a() {
        }

        public void run() {
            try {
                Log.d(d.f5945n, "Opening camera");
                d.this.c.d();
            } catch (Exception e2) {
                d.a(d.this, e2);
                Log.e(d.f5945n, "Failed to open camera", e2);
            }
        }
    }

    public class b implements Runnable {
        public b() {
        }

        public void run() {
            r rVar;
            try {
                Log.d(d.f5945n, "Configuring camera");
                d.this.c.b();
                d dVar = d.this;
                Handler handler = dVar.d;
                if (handler != null) {
                    e eVar = dVar.c;
                    if (eVar.f5965j == null) {
                        rVar = null;
                    } else {
                        boolean c = eVar.c();
                        rVar = eVar.f5965j;
                        if (c) {
                            rVar = new r(rVar.f5931i, rVar.f5930h);
                        }
                    }
                    handler.obtainMessage(R.id.zxing_prewiew_size_ready, rVar).sendToTarget();
                }
            } catch (Exception e2) {
                d.a(d.this, e2);
                Log.e(d.f5945n, "Failed to configure camera", e2);
            }
        }
    }

    public class c implements Runnable {
        public c() {
        }

        public void run() {
            try {
                Log.d(d.f5945n, "Starting preview");
                d dVar = d.this;
                e eVar = dVar.c;
                g gVar = dVar.f5946b;
                Camera camera = eVar.a;
                SurfaceHolder surfaceHolder = gVar.a;
                if (surfaceHolder != null) {
                    camera.setPreviewDisplay(surfaceHolder);
                } else {
                    camera.setPreviewTexture(gVar.f5970b);
                }
                d.this.c.g();
            } catch (Exception e2) {
                d.a(d.this, e2);
                Log.e(d.f5945n, "Failed to start preview", e2);
            }
        }
    }

    /* renamed from: b.m.a.t.d$d  reason: collision with other inner class name */
    public class C0105d implements Runnable {
        public C0105d() {
        }

        public void run() {
            try {
                Log.d(d.f5945n, "Closing camera");
                e eVar = d.this.c;
                a aVar = eVar.c;
                if (aVar != null) {
                    aVar.c();
                    eVar.c = null;
                }
                if (eVar.d != null) {
                    eVar.d = null;
                }
                Camera camera = eVar.a;
                if (camera != null && eVar.f5961e) {
                    camera.stopPreview();
                    eVar.f5968m.a = null;
                    eVar.f5961e = false;
                }
                e eVar2 = d.this.c;
                Camera camera2 = eVar2.a;
                if (camera2 != null) {
                    camera2.release();
                    eVar2.a = null;
                }
            } catch (Exception e2) {
                Log.e(d.f5945n, "Failed to close camera", e2);
            }
            d dVar = d.this;
            dVar.f5948g = true;
            dVar.d.sendEmptyMessage(R.id.zxing_camera_closed);
            h hVar = d.this.a;
            synchronized (hVar.d) {
                int i2 = hVar.c - 1;
                hVar.c = i2;
                if (i2 == 0) {
                    synchronized (hVar.d) {
                        hVar.f5972b.quit();
                        hVar.f5972b = null;
                        hVar.a = null;
                    }
                }
            }
        }
    }

    public d(Context context) {
        g.r0();
        if (h.f5971e == null) {
            h.f5971e = new h();
        }
        this.a = h.f5971e;
        e eVar = new e(context);
        this.c = eVar;
        eVar.f5962g = this.f5950i;
        this.f5949h = new Handler();
    }

    public static void a(d dVar, Exception exc) {
        Handler handler = dVar.d;
        if (handler != null) {
            handler.obtainMessage(R.id.zxing_camera_error, exc).sendToTarget();
        }
    }
}
