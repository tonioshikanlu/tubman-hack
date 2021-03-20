package b.m.a;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.OrientationEventListener;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import androidx.core.view.ViewCompat;
import app.bravostudio.A01F175WZXYVE9FWM81EKWKN6FN.R;
import b.l.f.x.a.g;
import b.l.f.x.a.h;
import b.m.a.t.f;
import b.m.a.t.i;
import b.m.a.t.j;
import b.m.a.t.k;
import b.m.a.t.l;
import b.m.a.t.o;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class d extends ViewGroup {
    public static final String H = d.class.getSimpleName();
    public double A = 0.1d;
    public o B = null;
    public boolean C = false;
    public final SurfaceHolder.Callback D = new a();
    public final Handler.Callback E = new b();
    public o F = new c();
    public final e G = new C0100d();

    /* renamed from: h  reason: collision with root package name */
    public b.m.a.t.d f5893h;

    /* renamed from: i  reason: collision with root package name */
    public WindowManager f5894i;

    /* renamed from: j  reason: collision with root package name */
    public Handler f5895j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f5896k = false;

    /* renamed from: l  reason: collision with root package name */
    public SurfaceView f5897l;

    /* renamed from: m  reason: collision with root package name */
    public TextureView f5898m;

    /* renamed from: n  reason: collision with root package name */
    public boolean f5899n = false;

    /* renamed from: o  reason: collision with root package name */
    public q f5900o;

    /* renamed from: p  reason: collision with root package name */
    public int f5901p = -1;

    /* renamed from: q  reason: collision with root package name */
    public List<e> f5902q = new ArrayList();
    public j r;
    public f s = new f();
    public r t;
    public r u;
    public Rect v;
    public r w;
    public Rect x = null;
    public Rect y = null;
    public r z = null;

    public class a implements SurfaceHolder.Callback {
        public a() {
        }

        public void surfaceChanged(SurfaceHolder surfaceHolder, int i2, int i3, int i4) {
            if (surfaceHolder == null) {
                String str = d.H;
                Log.e(d.H, "*** WARNING *** surfaceChanged() gave us a null surface!");
                return;
            }
            d dVar = d.this;
            dVar.w = new r(i3, i4);
            dVar.h();
        }

        public void surfaceCreated(SurfaceHolder surfaceHolder) {
        }

        public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            d.this.w = null;
        }
    }

    public class b implements Handler.Callback {
        public b() {
        }

        public boolean handleMessage(Message message) {
            j jVar;
            int i2 = message.what;
            boolean z = true;
            if (i2 == R.id.zxing_prewiew_size_ready) {
                d dVar = d.this;
                r rVar = (r) message.obj;
                dVar.u = rVar;
                r rVar2 = dVar.t;
                if (rVar2 != null) {
                    if (rVar == null || (jVar = dVar.r) == null) {
                        dVar.y = null;
                        dVar.x = null;
                        dVar.v = null;
                        throw new IllegalStateException("containerSize or previewSize is not set yet");
                    }
                    int i3 = rVar.f5930h;
                    int i4 = rVar.f5931i;
                    int i5 = rVar2.f5930h;
                    int i6 = rVar2.f5931i;
                    Rect b2 = jVar.c.b(rVar, jVar.a);
                    if (b2.width() > 0 && b2.height() > 0) {
                        dVar.v = b2;
                        Rect rect = new Rect(0, 0, i5, i6);
                        Rect rect2 = dVar.v;
                        Rect rect3 = new Rect(rect);
                        rect3.intersect(rect2);
                        if (dVar.z != null) {
                            rect3.inset(Math.max(0, (rect3.width() - dVar.z.f5930h) / 2), Math.max(0, (rect3.height() - dVar.z.f5931i) / 2));
                        } else {
                            int min = (int) Math.min(((double) rect3.width()) * dVar.A, ((double) rect3.height()) * dVar.A);
                            rect3.inset(min, min);
                            if (rect3.height() > rect3.width()) {
                                rect3.inset(0, (rect3.height() - rect3.width()) / 2);
                            }
                        }
                        dVar.x = rect3;
                        Rect rect4 = new Rect(dVar.x);
                        Rect rect5 = dVar.v;
                        rect4.offset(-rect5.left, -rect5.top);
                        Rect rect6 = new Rect((rect4.left * i3) / dVar.v.width(), (rect4.top * i4) / dVar.v.height(), (rect4.right * i3) / dVar.v.width(), (rect4.bottom * i4) / dVar.v.height());
                        dVar.y = rect6;
                        if (rect6.width() <= 0 || dVar.y.height() <= 0) {
                            dVar.y = null;
                            dVar.x = null;
                            Log.w(d.H, "Preview frame is too small");
                        } else {
                            dVar.G.a();
                        }
                    }
                    dVar.requestLayout();
                    dVar.h();
                }
                return true;
            }
            if (i2 == R.id.zxing_camera_error) {
                Exception exc = (Exception) message.obj;
                d dVar2 = d.this;
                if (dVar2.f5893h == null) {
                    z = false;
                }
                if (z) {
                    dVar2.d();
                    d.this.G.b(exc);
                }
            } else if (i2 == R.id.zxing_camera_closed) {
                d.this.G.e();
            }
            return false;
        }
    }

    public class c implements o {
        public c() {
        }
    }

    /* renamed from: b.m.a.d$d  reason: collision with other inner class name */
    public class C0100d implements e {
        public C0100d() {
        }

        public void a() {
            for (e a2 : d.this.f5902q) {
                a2.a();
            }
        }

        public void b(Exception exc) {
            for (e b2 : d.this.f5902q) {
                b2.b(exc);
            }
        }

        public void c() {
            for (e c : d.this.f5902q) {
                c.c();
            }
        }

        public void d() {
            for (e d : d.this.f5902q) {
                d.d();
            }
        }

        public void e() {
            for (e e2 : d.this.f5902q) {
                e2.e();
            }
        }
    }

    public interface e {
        void a();

        void b(Exception exc);

        void c();

        void d();

        void e();
    }

    public d(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        b(context, attributeSet);
    }

    public static void a(d dVar) {
        if ((dVar.f5893h != null) && dVar.getDisplayRotation() != dVar.f5901p) {
            dVar.d();
            dVar.f();
        }
    }

    private int getDisplayRotation() {
        return this.f5894i.getDefaultDisplay().getRotation();
    }

    public final void b(Context context, AttributeSet attributeSet) {
        if (getBackground() == null) {
            setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
        }
        c(attributeSet);
        this.f5894i = (WindowManager) context.getSystemService("window");
        this.f5895j = new Handler(this.E);
        this.f5900o = new q();
    }

    public void c(AttributeSet attributeSet) {
        o oVar;
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, h.a);
        int dimension = (int) obtainStyledAttributes.getDimension(1, -1.0f);
        int dimension2 = (int) obtainStyledAttributes.getDimension(0, -1.0f);
        if (dimension > 0 && dimension2 > 0) {
            this.z = new r(dimension, dimension2);
        }
        this.f5896k = obtainStyledAttributes.getBoolean(3, true);
        int integer = obtainStyledAttributes.getInteger(2, -1);
        if (integer == 1) {
            oVar = new i();
        } else if (integer == 2) {
            oVar = new k();
        } else {
            if (integer == 3) {
                oVar = new l();
            }
            obtainStyledAttributes.recycle();
        }
        this.B = oVar;
        obtainStyledAttributes.recycle();
    }

    public void d() {
        TextureView textureView;
        SurfaceView surfaceView;
        g.r0();
        Log.d(H, "pause()");
        this.f5901p = -1;
        b.m.a.t.d dVar = this.f5893h;
        if (dVar != null) {
            g.r0();
            if (dVar.f) {
                dVar.a.b(dVar.f5954m);
            } else {
                dVar.f5948g = true;
            }
            dVar.f = false;
            this.f5893h = null;
            this.f5899n = false;
        } else {
            this.f5895j.sendEmptyMessage(R.id.zxing_camera_closed);
        }
        if (this.w == null && (surfaceView = this.f5897l) != null) {
            surfaceView.getHolder().removeCallback(this.D);
        }
        if (this.w == null && (textureView = this.f5898m) != null) {
            textureView.setSurfaceTextureListener((TextureView.SurfaceTextureListener) null);
        }
        this.t = null;
        this.u = null;
        this.y = null;
        q qVar = this.f5900o;
        OrientationEventListener orientationEventListener = qVar.c;
        if (orientationEventListener != null) {
            orientationEventListener.disable();
        }
        qVar.c = null;
        qVar.f5929b = null;
        qVar.d = null;
        this.G.d();
    }

    public void e() {
    }

    public void f() {
        g.r0();
        String str = H;
        Log.d(str, "resume()");
        if (this.f5893h != null) {
            Log.w(str, "initCamera called twice");
        } else {
            b.m.a.t.d dVar = new b.m.a.t.d(getContext());
            f fVar = this.s;
            if (!dVar.f) {
                dVar.f5950i = fVar;
                dVar.c.f5962g = fVar;
            }
            this.f5893h = dVar;
            dVar.d = this.f5895j;
            g.r0();
            dVar.f = true;
            dVar.f5948g = false;
            b.m.a.t.h hVar = dVar.a;
            Runnable runnable = dVar.f5951j;
            synchronized (hVar.d) {
                hVar.c++;
                hVar.b(runnable);
            }
            this.f5901p = getDisplayRotation();
        }
        if (this.w != null) {
            h();
        } else {
            SurfaceView surfaceView = this.f5897l;
            if (surfaceView != null) {
                surfaceView.getHolder().addCallback(this.D);
            } else {
                TextureView textureView = this.f5898m;
                if (textureView != null) {
                    if (textureView.isAvailable()) {
                        new c(this).onSurfaceTextureAvailable(this.f5898m.getSurfaceTexture(), this.f5898m.getWidth(), this.f5898m.getHeight());
                    } else {
                        this.f5898m.setSurfaceTextureListener(new c(this));
                    }
                }
            }
        }
        requestLayout();
        q qVar = this.f5900o;
        Context context = getContext();
        o oVar = this.F;
        OrientationEventListener orientationEventListener = qVar.c;
        if (orientationEventListener != null) {
            orientationEventListener.disable();
        }
        qVar.c = null;
        qVar.f5929b = null;
        qVar.d = null;
        Context applicationContext = context.getApplicationContext();
        qVar.d = oVar;
        qVar.f5929b = (WindowManager) applicationContext.getSystemService("window");
        p pVar = new p(qVar, applicationContext, 3);
        qVar.c = pVar;
        pVar.enable();
        qVar.a = qVar.f5929b.getDefaultDisplay().getRotation();
    }

    public final void g(b.m.a.t.g gVar) {
        if (!this.f5899n && this.f5893h != null) {
            Log.i(H, "Starting preview");
            b.m.a.t.d dVar = this.f5893h;
            dVar.f5946b = gVar;
            g.r0();
            if (dVar.f) {
                dVar.a.b(dVar.f5953l);
                this.f5899n = true;
                e();
                this.G.c();
                return;
            }
            throw new IllegalStateException("CameraInstance is not open");
        }
    }

    public b.m.a.t.d getCameraInstance() {
        return this.f5893h;
    }

    public f getCameraSettings() {
        return this.s;
    }

    public Rect getFramingRect() {
        return this.x;
    }

    public r getFramingRectSize() {
        return this.z;
    }

    public double getMarginFraction() {
        return this.A;
    }

    public Rect getPreviewFramingRect() {
        return this.y;
    }

    public o getPreviewScalingStrategy() {
        o oVar = this.B;
        return oVar != null ? oVar : this.f5898m != null ? new i() : new k();
    }

    public r getPreviewSize() {
        return this.u;
    }

    public final void h() {
        Rect rect;
        b.m.a.t.g gVar;
        float f;
        r rVar = this.w;
        if (rVar != null && this.u != null && (rect = this.v) != null) {
            if (this.f5897l == null || !rVar.equals(new r(rect.width(), this.v.height()))) {
                TextureView textureView = this.f5898m;
                if (textureView != null && textureView.getSurfaceTexture() != null) {
                    if (this.u != null) {
                        int width = this.f5898m.getWidth();
                        int height = this.f5898m.getHeight();
                        r rVar2 = this.u;
                        float f2 = ((float) width) / ((float) height);
                        float f3 = ((float) rVar2.f5930h) / ((float) rVar2.f5931i);
                        float f4 = 1.0f;
                        if (f2 < f3) {
                            float f5 = f3 / f2;
                            f = 1.0f;
                            f4 = f5;
                        } else {
                            f = f2 / f3;
                        }
                        Matrix matrix = new Matrix();
                        matrix.setScale(f4, f);
                        float f6 = (float) width;
                        float f7 = (float) height;
                        matrix.postTranslate((f6 - (f4 * f6)) / 2.0f, (f7 - (f * f7)) / 2.0f);
                        this.f5898m.setTransform(matrix);
                    }
                    gVar = new b.m.a.t.g(this.f5898m.getSurfaceTexture());
                } else {
                    return;
                }
            } else {
                gVar = new b.m.a.t.g(this.f5897l.getHolder());
            }
            g(gVar);
        }
    }

    public void onAttachedToWindow() {
        View view;
        super.onAttachedToWindow();
        if (this.f5896k) {
            TextureView textureView = new TextureView(getContext());
            this.f5898m = textureView;
            textureView.setSurfaceTextureListener(new c(this));
            view = this.f5898m;
        } else {
            SurfaceView surfaceView = new SurfaceView(getContext());
            this.f5897l = surfaceView;
            surfaceView.getHolder().addCallback(this.D);
            view = this.f5897l;
        }
        addView(view);
    }

    @SuppressLint({"DrawAllocation"})
    public void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        r rVar = new r(i4 - i2, i5 - i3);
        this.t = rVar;
        b.m.a.t.d dVar = this.f5893h;
        if (dVar != null && dVar.f5947e == null) {
            j jVar = new j(getDisplayRotation(), rVar);
            this.r = jVar;
            jVar.c = getPreviewScalingStrategy();
            b.m.a.t.d dVar2 = this.f5893h;
            j jVar2 = this.r;
            dVar2.f5947e = jVar2;
            dVar2.c.f5963h = jVar2;
            g.r0();
            if (dVar2.f) {
                dVar2.a.b(dVar2.f5952k);
                boolean z3 = this.C;
                if (z3) {
                    b.m.a.t.d dVar3 = this.f5893h;
                    Objects.requireNonNull(dVar3);
                    g.r0();
                    if (dVar3.f) {
                        dVar3.a.b(new b.m.a.t.b(dVar3, z3));
                    }
                }
            } else {
                throw new IllegalStateException("CameraInstance is not open");
            }
        }
        SurfaceView surfaceView = this.f5897l;
        if (surfaceView != null) {
            Rect rect = this.v;
            if (rect == null) {
                surfaceView.layout(0, 0, getWidth(), getHeight());
            } else {
                surfaceView.layout(rect.left, rect.top, rect.right, rect.bottom);
            }
        } else {
            TextureView textureView = this.f5898m;
            if (textureView != null) {
                textureView.layout(0, 0, getWidth(), getHeight());
            }
        }
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof Bundle)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        Bundle bundle = (Bundle) parcelable;
        super.onRestoreInstanceState(bundle.getParcelable("super"));
        setTorch(bundle.getBoolean("torch"));
    }

    public Parcelable onSaveInstanceState() {
        Parcelable onSaveInstanceState = super.onSaveInstanceState();
        Bundle bundle = new Bundle();
        bundle.putParcelable("super", onSaveInstanceState);
        bundle.putBoolean("torch", this.C);
        return bundle;
    }

    public void setCameraSettings(f fVar) {
        this.s = fVar;
    }

    public void setFramingRectSize(r rVar) {
        this.z = rVar;
    }

    public void setMarginFraction(double d) {
        if (d < 0.5d) {
            this.A = d;
            return;
        }
        throw new IllegalArgumentException("The margin fraction must be less than 0.5");
    }

    public void setPreviewScalingStrategy(o oVar) {
        this.B = oVar;
    }

    public void setTorch(boolean z2) {
        this.C = z2;
        b.m.a.t.d dVar = this.f5893h;
        if (dVar != null) {
            g.r0();
            if (dVar.f) {
                dVar.a.b(new b.m.a.t.b(dVar, z2));
            }
        }
    }

    public void setUseTextureView(boolean z2) {
        this.f5896k = z2;
    }
}
