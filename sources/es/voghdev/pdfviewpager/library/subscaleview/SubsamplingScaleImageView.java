package es.voghdev.pdfviewpager.library.subscaleview;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.TypedValue;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import androidx.annotation.AnyThread;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.ActivityChooserView;
import es.voghdev.pdfviewpager.library.subscaleview.decoder.SkiaImageDecoder;
import es.voghdev.pdfviewpager.library.subscaleview.decoder.SkiaImageRegionDecoder;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class SubsamplingScaleImageView extends View {
    public static Bitmap.Config y0;
    public float A = 1.0f;
    public int B = 1;
    public int C = 500;
    public float D;
    public float E;
    public PointF F;
    public PointF G;
    public PointF H;
    public Float I;
    public PointF J;
    public PointF K;
    public int L;
    public int M;
    public int N;
    public boolean O;
    public boolean P;
    public boolean Q;
    public int R;
    public GestureDetector S;
    public GestureDetector T;
    public j.a.a.a.e.g.d U;
    public final ReadWriteLock V = new ReentrantReadWriteLock(true);
    public j.a.a.a.e.g.b<? extends j.a.a.a.e.g.c> W = new j.a.a.a.e.g.a(SkiaImageDecoder.class);
    public j.a.a.a.e.g.b<? extends j.a.a.a.e.g.d> a0 = new j.a.a.a.e.g.a(SkiaImageRegionDecoder.class);
    public PointF b0;
    public float c0;
    public final float d0;
    public float e0;
    public boolean f0;
    public PointF g0;

    /* renamed from: h  reason: collision with root package name */
    public Bitmap f7992h;
    public PointF h0;

    /* renamed from: i  reason: collision with root package name */
    public boolean f7993i;
    public PointF i0;

    /* renamed from: j  reason: collision with root package name */
    public boolean f7994j;
    public d j0;

    /* renamed from: k  reason: collision with root package name */
    public Uri f7995k;
    public boolean k0;

    /* renamed from: l  reason: collision with root package name */
    public int f7996l;
    public boolean l0;

    /* renamed from: m  reason: collision with root package name */
    public Map<Integer, List<h>> f7997m;
    public j.a.a.a.e.d m0;

    /* renamed from: n  reason: collision with root package name */
    public int f7998n = 0;
    public j.a.a.a.e.e n0;

    /* renamed from: o  reason: collision with root package name */
    public float f7999o = 2.0f;
    public View.OnLongClickListener o0;

    /* renamed from: p  reason: collision with root package name */
    public float f8000p = q();
    public final Handler p0;

    /* renamed from: q  reason: collision with root package name */
    public int f8001q = -1;
    public Paint q0;
    public int r = 1;
    public Paint r0;
    public int s = 1;
    public g s0;
    public int t = ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
    public Matrix t0;
    public int u = ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
    public RectF u0;
    public Executor v = AsyncTask.THREAD_POOL_EXECUTOR;
    public final float[] v0 = new float[8];
    public boolean w = true;
    public final float[] w0 = new float[8];
    public boolean x = true;
    public final float x0 = getResources().getDisplayMetrics().density;
    public boolean y = true;
    public boolean z = true;

    public class a implements Handler.Callback {
        public a() {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:2:0x0005, code lost:
            r4 = r3.a;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean handleMessage(android.os.Message r4) {
            /*
                r3 = this;
                int r4 = r4.what
                r0 = 1
                if (r4 != r0) goto L_0x001c
                es.voghdev.pdfviewpager.library.subscaleview.SubsamplingScaleImageView r4 = es.voghdev.pdfviewpager.library.subscaleview.SubsamplingScaleImageView.this
                android.view.View$OnLongClickListener r1 = r4.o0
                if (r1 == 0) goto L_0x001c
                r2 = 0
                r4.R = r2
                es.voghdev.pdfviewpager.library.subscaleview.SubsamplingScaleImageView.super.setOnLongClickListener(r1)
                es.voghdev.pdfviewpager.library.subscaleview.SubsamplingScaleImageView r4 = es.voghdev.pdfviewpager.library.subscaleview.SubsamplingScaleImageView.this
                r4.performLongClick()
                es.voghdev.pdfviewpager.library.subscaleview.SubsamplingScaleImageView r4 = es.voghdev.pdfviewpager.library.subscaleview.SubsamplingScaleImageView.this
                r1 = 0
                es.voghdev.pdfviewpager.library.subscaleview.SubsamplingScaleImageView.super.setOnLongClickListener((android.view.View.OnLongClickListener) null)
            L_0x001c:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: es.voghdev.pdfviewpager.library.subscaleview.SubsamplingScaleImageView.a.handleMessage(android.os.Message):boolean");
        }
    }

    public class b extends GestureDetector.SimpleOnGestureListener {
        public final /* synthetic */ Context a;

        public b(Context context) {
            this.a = context;
        }

        public boolean onDoubleTap(MotionEvent motionEvent) {
            SubsamplingScaleImageView subsamplingScaleImageView = SubsamplingScaleImageView.this;
            if (!subsamplingScaleImageView.y || !subsamplingScaleImageView.k0 || subsamplingScaleImageView.F == null) {
                return onDoubleTapEvent(motionEvent);
            }
            subsamplingScaleImageView.setGestureDetector(this.a);
            SubsamplingScaleImageView subsamplingScaleImageView2 = SubsamplingScaleImageView.this;
            if (subsamplingScaleImageView2.z) {
                subsamplingScaleImageView2.b0 = new PointF(motionEvent.getX(), motionEvent.getY());
                SubsamplingScaleImageView subsamplingScaleImageView3 = SubsamplingScaleImageView.this;
                PointF pointF = SubsamplingScaleImageView.this.F;
                subsamplingScaleImageView3.G = new PointF(pointF.x, pointF.y);
                SubsamplingScaleImageView subsamplingScaleImageView4 = SubsamplingScaleImageView.this;
                subsamplingScaleImageView4.E = subsamplingScaleImageView4.D;
                subsamplingScaleImageView4.Q = true;
                subsamplingScaleImageView4.O = true;
                subsamplingScaleImageView4.e0 = -1.0f;
                subsamplingScaleImageView4.h0 = subsamplingScaleImageView4.F(subsamplingScaleImageView4.b0);
                SubsamplingScaleImageView.this.i0 = new PointF(motionEvent.getX(), motionEvent.getY());
                SubsamplingScaleImageView subsamplingScaleImageView5 = SubsamplingScaleImageView.this;
                PointF pointF2 = SubsamplingScaleImageView.this.h0;
                subsamplingScaleImageView5.g0 = new PointF(pointF2.x, pointF2.y);
                SubsamplingScaleImageView.this.f0 = false;
                return false;
            }
            subsamplingScaleImageView2.j(subsamplingScaleImageView2.F(new PointF(motionEvent.getX(), motionEvent.getY())), new PointF(motionEvent.getX(), motionEvent.getY()));
            return true;
        }

        public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            SubsamplingScaleImageView subsamplingScaleImageView = SubsamplingScaleImageView.this;
            if (!subsamplingScaleImageView.x || !subsamplingScaleImageView.k0 || subsamplingScaleImageView.F == null || motionEvent == null || motionEvent2 == null || ((Math.abs(motionEvent.getX() - motionEvent2.getX()) <= 50.0f && Math.abs(motionEvent.getY() - motionEvent2.getY()) <= 50.0f) || ((Math.abs(f) <= 500.0f && Math.abs(f2) <= 500.0f) || SubsamplingScaleImageView.this.O))) {
                return super.onFling(motionEvent, motionEvent2, f, f2);
            }
            PointF pointF = SubsamplingScaleImageView.this.F;
            PointF pointF2 = new PointF((f * 0.25f) + pointF.x, (f2 * 0.25f) + pointF.y);
            float width = ((float) (SubsamplingScaleImageView.this.getWidth() / 2)) - pointF2.x;
            SubsamplingScaleImageView subsamplingScaleImageView2 = SubsamplingScaleImageView.this;
            float height = ((float) (subsamplingScaleImageView2.getHeight() / 2)) - pointF2.y;
            SubsamplingScaleImageView subsamplingScaleImageView3 = SubsamplingScaleImageView.this;
            e eVar = new e(new PointF(width / subsamplingScaleImageView2.D, height / subsamplingScaleImageView3.D), (a) null);
            if (j.a.a.a.e.f.d.contains(1)) {
                eVar.f8012e = 1;
                eVar.f8014h = false;
                eVar.f = 3;
                eVar.a();
                return true;
            }
            throw new IllegalArgumentException("Unknown easing type: 1");
        }

        public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
            SubsamplingScaleImageView.this.performClick();
            return true;
        }
    }

    public class c extends GestureDetector.SimpleOnGestureListener {
        public c() {
        }

        public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
            SubsamplingScaleImageView.this.performClick();
            return true;
        }
    }

    public static class d {
        public float a;

        /* renamed from: b  reason: collision with root package name */
        public float f8003b;
        public PointF c;
        public PointF d;

        /* renamed from: e  reason: collision with root package name */
        public PointF f8004e;
        public PointF f;

        /* renamed from: g  reason: collision with root package name */
        public long f8005g = 500;

        /* renamed from: h  reason: collision with root package name */
        public boolean f8006h = true;

        /* renamed from: i  reason: collision with root package name */
        public int f8007i = 2;

        /* renamed from: j  reason: collision with root package name */
        public int f8008j = 1;

        /* renamed from: k  reason: collision with root package name */
        public long f8009k = System.currentTimeMillis();

        /* renamed from: l  reason: collision with root package name */
        public j.a.a.a.e.c f8010l;

        public d(a aVar) {
        }
    }

    public final class e {
        public final float a;

        /* renamed from: b  reason: collision with root package name */
        public final PointF f8011b;
        public final PointF c;
        public long d = 500;

        /* renamed from: e  reason: collision with root package name */
        public int f8012e = 2;
        public int f = 1;

        /* renamed from: g  reason: collision with root package name */
        public boolean f8013g = true;

        /* renamed from: h  reason: collision with root package name */
        public boolean f8014h = true;

        public e(float f2, PointF pointF, PointF pointF2, a aVar) {
            this.a = f2;
            this.f8011b = pointF;
            this.c = pointF2;
        }

        public void a() {
            PointF pointF;
            j.a.a.a.e.c cVar;
            d dVar = SubsamplingScaleImageView.this.j0;
            if (!(dVar == null || (cVar = dVar.f8010l) == null)) {
                try {
                    cVar.c();
                } catch (Exception e2) {
                    Log.w(j.a.a.a.e.f.a, "Error thrown by animation listener", e2);
                }
            }
            int width = (((SubsamplingScaleImageView.this.getWidth() - SubsamplingScaleImageView.this.getPaddingRight()) - SubsamplingScaleImageView.this.getPaddingLeft()) / 2) + SubsamplingScaleImageView.this.getPaddingLeft();
            int height = (((SubsamplingScaleImageView.this.getHeight() - SubsamplingScaleImageView.this.getPaddingBottom()) - SubsamplingScaleImageView.this.getPaddingTop()) / 2) + SubsamplingScaleImageView.this.getPaddingTop();
            SubsamplingScaleImageView subsamplingScaleImageView = SubsamplingScaleImageView.this;
            float min = Math.min(subsamplingScaleImageView.f7999o, Math.max(subsamplingScaleImageView.q(), this.a));
            if (this.f8014h) {
                SubsamplingScaleImageView subsamplingScaleImageView2 = SubsamplingScaleImageView.this;
                PointF pointF2 = this.f8011b;
                float f2 = pointF2.x;
                float f3 = pointF2.y;
                pointF = new PointF();
                PointF E = subsamplingScaleImageView2.E(f2, f3, min);
                pointF.set((((float) ((((subsamplingScaleImageView2.getWidth() - subsamplingScaleImageView2.getPaddingRight()) - subsamplingScaleImageView2.getPaddingLeft()) / 2) + subsamplingScaleImageView2.getPaddingLeft())) - E.x) / min, (((float) ((((subsamplingScaleImageView2.getHeight() - subsamplingScaleImageView2.getPaddingBottom()) - subsamplingScaleImageView2.getPaddingTop()) / 2) + subsamplingScaleImageView2.getPaddingTop())) - E.y) / min);
            } else {
                pointF = this.f8011b;
            }
            SubsamplingScaleImageView.this.j0 = new d((a) null);
            SubsamplingScaleImageView subsamplingScaleImageView3 = SubsamplingScaleImageView.this;
            d dVar2 = subsamplingScaleImageView3.j0;
            dVar2.a = subsamplingScaleImageView3.D;
            dVar2.f8003b = min;
            dVar2.f8009k = System.currentTimeMillis();
            Objects.requireNonNull(SubsamplingScaleImageView.this.j0);
            SubsamplingScaleImageView subsamplingScaleImageView4 = SubsamplingScaleImageView.this;
            subsamplingScaleImageView4.j0.c = subsamplingScaleImageView4.getCenter();
            SubsamplingScaleImageView subsamplingScaleImageView5 = SubsamplingScaleImageView.this;
            d dVar3 = subsamplingScaleImageView5.j0;
            dVar3.d = pointF;
            dVar3.f8004e = subsamplingScaleImageView5.B(pointF);
            SubsamplingScaleImageView.this.j0.f = new PointF((float) width, (float) height);
            d dVar4 = SubsamplingScaleImageView.this.j0;
            dVar4.f8005g = this.d;
            dVar4.f8006h = this.f8013g;
            dVar4.f8007i = this.f8012e;
            dVar4.f8008j = this.f;
            dVar4.f8009k = System.currentTimeMillis();
            d dVar5 = SubsamplingScaleImageView.this.j0;
            dVar5.f8010l = null;
            PointF pointF3 = this.c;
            if (pointF3 != null) {
                float f4 = pointF3.x;
                PointF pointF4 = dVar5.c;
                float f5 = f4 - (pointF4.x * min);
                float f6 = pointF3.y - (pointF4.y * min);
                g gVar = new g(min, new PointF(f5, f6), (a) null);
                SubsamplingScaleImageView.this.m(true, gVar);
                d dVar6 = SubsamplingScaleImageView.this.j0;
                PointF pointF5 = this.c;
                float f7 = pointF5.x;
                PointF pointF6 = gVar.f8019b;
                dVar6.f = new PointF((pointF6.x - f5) + f7, (pointF6.y - f6) + pointF5.y);
            }
            SubsamplingScaleImageView.this.invalidate();
        }

        public e(float f2, PointF pointF, a aVar) {
            this.a = f2;
            this.f8011b = pointF;
            this.c = null;
        }

        public e(PointF pointF, a aVar) {
            this.a = SubsamplingScaleImageView.this.D;
            this.f8011b = pointF;
            this.c = null;
        }
    }

    public static class f extends AsyncTask<Void, Void, Integer> {
        public final WeakReference<SubsamplingScaleImageView> a;

        /* renamed from: b  reason: collision with root package name */
        public final WeakReference<Context> f8016b;
        public final WeakReference<j.a.a.a.e.g.b<? extends j.a.a.a.e.g.c>> c;
        public final Uri d;

        /* renamed from: e  reason: collision with root package name */
        public final boolean f8017e;
        public Bitmap f;

        /* renamed from: g  reason: collision with root package name */
        public Exception f8018g;

        public f(SubsamplingScaleImageView subsamplingScaleImageView, Context context, j.a.a.a.e.g.b<? extends j.a.a.a.e.g.c> bVar, Uri uri, boolean z) {
            this.a = new WeakReference<>(subsamplingScaleImageView);
            this.f8016b = new WeakReference<>(context);
            this.c = new WeakReference<>(bVar);
            this.d = uri;
            this.f8017e = z;
        }

        public Object doInBackground(Object[] objArr) {
            Void[] voidArr = (Void[]) objArr;
            try {
                String uri = this.d.toString();
                Context context = (Context) this.f8016b.get();
                j.a.a.a.e.g.b bVar = (j.a.a.a.e.g.b) this.c.get();
                SubsamplingScaleImageView subsamplingScaleImageView = (SubsamplingScaleImageView) this.a.get();
                if (!(context == null || bVar == null || subsamplingScaleImageView == null)) {
                    this.f = ((j.a.a.a.e.g.c) bVar.a()).a(context, this.d);
                    return Integer.valueOf(SubsamplingScaleImageView.d(subsamplingScaleImageView, context, uri));
                }
            } catch (Exception e2) {
                Log.e(j.a.a.a.e.f.a, "Failed to load bitmap", e2);
                this.f8018g = e2;
            } catch (OutOfMemoryError e3) {
                Log.e(j.a.a.a.e.f.a, "Failed to load bitmap - OutOfMemoryError", e3);
                this.f8018g = new RuntimeException(e3);
            }
            return null;
        }

        public void onPostExecute(Object obj) {
            j.a.a.a.e.d dVar;
            Integer num = (Integer) obj;
            SubsamplingScaleImageView subsamplingScaleImageView = (SubsamplingScaleImageView) this.a.get();
            if (subsamplingScaleImageView != null) {
                Bitmap bitmap = this.f;
                if (bitmap == null || num == null) {
                    Exception exc = this.f8018g;
                    if (exc != null && (dVar = subsamplingScaleImageView.m0) != null) {
                        if (this.f8017e) {
                            dVar.a(exc);
                        } else {
                            dVar.f(exc);
                        }
                    }
                } else if (this.f8017e) {
                    Bitmap.Config config = SubsamplingScaleImageView.y0;
                    subsamplingScaleImageView.s(bitmap);
                } else {
                    int intValue = num.intValue();
                    Bitmap.Config config2 = SubsamplingScaleImageView.y0;
                    subsamplingScaleImageView.r(bitmap, intValue, false);
                }
            }
        }
    }

    public static class g {
        public float a;

        /* renamed from: b  reason: collision with root package name */
        public final PointF f8019b;

        public g(float f, PointF pointF, a aVar) {
            this.a = f;
            this.f8019b = pointF;
        }
    }

    public static class h {
        public Rect a;

        /* renamed from: b  reason: collision with root package name */
        public int f8020b;
        public Bitmap c;
        public boolean d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f8021e;
        public Rect f;

        /* renamed from: g  reason: collision with root package name */
        public Rect f8022g;

        public h() {
        }

        public h(a aVar) {
        }
    }

    public static class i extends AsyncTask<Void, Void, Bitmap> {
        public final WeakReference<SubsamplingScaleImageView> a;

        /* renamed from: b  reason: collision with root package name */
        public final WeakReference<j.a.a.a.e.g.d> f8023b;
        public final WeakReference<h> c;
        public Exception d;

        public i(SubsamplingScaleImageView subsamplingScaleImageView, j.a.a.a.e.g.d dVar, h hVar) {
            this.a = new WeakReference<>(subsamplingScaleImageView);
            this.f8023b = new WeakReference<>(dVar);
            this.c = new WeakReference<>(hVar);
            hVar.d = true;
        }

        public Object doInBackground(Object[] objArr) {
            SubsamplingScaleImageView subsamplingScaleImageView;
            Void[] voidArr = (Void[]) objArr;
            try {
                subsamplingScaleImageView = (SubsamplingScaleImageView) this.a.get();
                j.a.a.a.e.g.d dVar = (j.a.a.a.e.g.d) this.f8023b.get();
                h hVar = (h) this.c.get();
                if (dVar == null || hVar == null || subsamplingScaleImageView == null || !dVar.a() || !hVar.f8021e) {
                    if (hVar != null) {
                        hVar.d = false;
                    }
                    return null;
                }
                subsamplingScaleImageView.V.readLock().lock();
                if (dVar.a()) {
                    SubsamplingScaleImageView.e(subsamplingScaleImageView, hVar.a, hVar.f8022g);
                    Bitmap b2 = dVar.b(hVar.f8022g, hVar.f8020b);
                    subsamplingScaleImageView.V.readLock().unlock();
                    return b2;
                }
                hVar.d = false;
                subsamplingScaleImageView.V.readLock().unlock();
                return null;
            } catch (Exception e2) {
                Log.e(j.a.a.a.e.f.a, "Failed to decode tile", e2);
                this.d = e2;
            } catch (OutOfMemoryError e3) {
                Log.e(j.a.a.a.e.f.a, "Failed to decode tile - OutOfMemoryError", e3);
                this.d = new RuntimeException(e3);
            } catch (Throwable th) {
                subsamplingScaleImageView.V.readLock().unlock();
                throw th;
            }
        }

        public void onPostExecute(Object obj) {
            j.a.a.a.e.d dVar;
            Bitmap bitmap;
            Bitmap bitmap2 = (Bitmap) obj;
            SubsamplingScaleImageView subsamplingScaleImageView = (SubsamplingScaleImageView) this.a.get();
            h hVar = (h) this.c.get();
            if (subsamplingScaleImageView != null && hVar != null) {
                if (bitmap2 != null) {
                    hVar.c = bitmap2;
                    hVar.d = false;
                    Bitmap.Config config = SubsamplingScaleImageView.y0;
                    synchronized (subsamplingScaleImageView) {
                        subsamplingScaleImageView.h();
                        subsamplingScaleImageView.g();
                        if (subsamplingScaleImageView.p() && (bitmap = subsamplingScaleImageView.f7992h) != null) {
                            if (!subsamplingScaleImageView.f7994j) {
                                bitmap.recycle();
                            }
                            subsamplingScaleImageView.f7992h = null;
                            j.a.a.a.e.d dVar2 = subsamplingScaleImageView.m0;
                            if (dVar2 != null && subsamplingScaleImageView.f7994j) {
                                dVar2.d();
                            }
                            subsamplingScaleImageView.f7993i = false;
                            subsamplingScaleImageView.f7994j = false;
                        }
                        subsamplingScaleImageView.invalidate();
                    }
                    return;
                }
                Exception exc = this.d;
                if (exc != null && (dVar = subsamplingScaleImageView.m0) != null) {
                    dVar.c(exc);
                }
            }
        }
    }

    public static class j extends AsyncTask<Void, Void, int[]> {
        public final WeakReference<SubsamplingScaleImageView> a;

        /* renamed from: b  reason: collision with root package name */
        public final WeakReference<Context> f8024b;
        public final WeakReference<j.a.a.a.e.g.b<? extends j.a.a.a.e.g.d>> c;
        public final Uri d;

        /* renamed from: e  reason: collision with root package name */
        public j.a.a.a.e.g.d f8025e;
        public Exception f;

        public j(SubsamplingScaleImageView subsamplingScaleImageView, Context context, j.a.a.a.e.g.b<? extends j.a.a.a.e.g.d> bVar, Uri uri) {
            this.a = new WeakReference<>(subsamplingScaleImageView);
            this.f8024b = new WeakReference<>(context);
            this.c = new WeakReference<>(bVar);
            this.d = uri;
        }

        public Object doInBackground(Object[] objArr) {
            Void[] voidArr = (Void[]) objArr;
            try {
                String uri = this.d.toString();
                Context context = (Context) this.f8024b.get();
                j.a.a.a.e.g.b bVar = (j.a.a.a.e.g.b) this.c.get();
                SubsamplingScaleImageView subsamplingScaleImageView = (SubsamplingScaleImageView) this.a.get();
                if (!(context == null || bVar == null || subsamplingScaleImageView == null)) {
                    j.a.a.a.e.g.d dVar = (j.a.a.a.e.g.d) bVar.a();
                    this.f8025e = dVar;
                    Point c2 = dVar.c(context, this.d);
                    return new int[]{c2.x, c2.y, SubsamplingScaleImageView.d(subsamplingScaleImageView, context, uri)};
                }
            } catch (Exception e2) {
                Log.e(j.a.a.a.e.f.a, "Failed to initialise bitmap decoder", e2);
                this.f = e2;
            }
            return null;
        }

        public void onPostExecute(Object obj) {
            j.a.a.a.e.d dVar;
            int i2;
            int i3;
            int i4;
            int[] iArr = (int[]) obj;
            SubsamplingScaleImageView subsamplingScaleImageView = (SubsamplingScaleImageView) this.a.get();
            if (subsamplingScaleImageView != null) {
                j.a.a.a.e.g.d dVar2 = this.f8025e;
                if (dVar2 == null || iArr == null || iArr.length != 3) {
                    Exception exc = this.f;
                    if (exc != null && (dVar = subsamplingScaleImageView.m0) != null) {
                        dVar.f(exc);
                        return;
                    }
                    return;
                }
                int i5 = iArr[0];
                int i6 = iArr[1];
                int i7 = iArr[2];
                Bitmap.Config config = SubsamplingScaleImageView.y0;
                synchronized (subsamplingScaleImageView) {
                    int i8 = subsamplingScaleImageView.L;
                    if (i8 > 0 && (i4 = subsamplingScaleImageView.M) > 0 && !(i8 == i5 && i4 == i6)) {
                        subsamplingScaleImageView.w(false);
                        Bitmap bitmap = subsamplingScaleImageView.f7992h;
                        if (bitmap != null) {
                            if (!subsamplingScaleImageView.f7994j) {
                                bitmap.recycle();
                            }
                            subsamplingScaleImageView.f7992h = null;
                            j.a.a.a.e.d dVar3 = subsamplingScaleImageView.m0;
                            if (dVar3 != null && subsamplingScaleImageView.f7994j) {
                                dVar3.d();
                            }
                            subsamplingScaleImageView.f7993i = false;
                            subsamplingScaleImageView.f7994j = false;
                        }
                    }
                    subsamplingScaleImageView.U = dVar2;
                    subsamplingScaleImageView.L = i5;
                    subsamplingScaleImageView.M = i6;
                    subsamplingScaleImageView.N = i7;
                    subsamplingScaleImageView.h();
                    if (!subsamplingScaleImageView.g() && (i2 = subsamplingScaleImageView.t) > 0 && i2 != Integer.MAX_VALUE && (i3 = subsamplingScaleImageView.u) > 0 && i3 != Integer.MAX_VALUE && subsamplingScaleImageView.getWidth() > 0 && subsamplingScaleImageView.getHeight() > 0) {
                        subsamplingScaleImageView.n(new Point(subsamplingScaleImageView.t, subsamplingScaleImageView.u));
                    }
                    subsamplingScaleImageView.invalidate();
                    subsamplingScaleImageView.requestLayout();
                }
            }
        }
    }

    public SubsamplingScaleImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        int resourceId;
        String string;
        setMinimumDpi(160);
        setDoubleTapZoomDpi(160);
        setMinimumTileDpi(320);
        setGestureDetector(context);
        this.p0 = new Handler(new a());
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, j.a.a.a.a.a);
            if (obtainStyledAttributes.hasValue(0) && (string = obtainStyledAttributes.getString(0)) != null && string.length() > 0) {
                String str = "file:///android_asset/" + string;
                Objects.requireNonNull(str, "Uri must not be null");
                if (!str.contains("://")) {
                    str = b.e.a.a.a.m("file:///", str.startsWith("/") ? str.substring(1) : str);
                }
                j.a.a.a.e.a aVar = new j.a.a.a.e.a(Uri.parse(str));
                aVar.d = true;
                setImage(aVar);
            }
            if (obtainStyledAttributes.hasValue(3) && (resourceId = obtainStyledAttributes.getResourceId(3, 0)) > 0) {
                j.a.a.a.e.a aVar2 = new j.a.a.a.e.a(resourceId);
                aVar2.d = true;
                setImage(aVar2);
            }
            if (obtainStyledAttributes.hasValue(1)) {
                setPanEnabled(obtainStyledAttributes.getBoolean(1, true));
            }
            if (obtainStyledAttributes.hasValue(5)) {
                setZoomEnabled(obtainStyledAttributes.getBoolean(5, true));
            }
            if (obtainStyledAttributes.hasValue(2)) {
                setQuickScaleEnabled(obtainStyledAttributes.getBoolean(2, true));
            }
            if (obtainStyledAttributes.hasValue(4)) {
                setTileBackgroundColor(obtainStyledAttributes.getColor(4, Color.argb(0, 0, 0, 0)));
            }
            obtainStyledAttributes.recycle();
        }
        this.d0 = TypedValue.applyDimension(1, 20.0f, context.getResources().getDisplayMetrics());
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:16|17|(1:47)) */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0055, code lost:
        r9 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        android.util.Log.w(j.a.a.a.e.f.a, "Could not get orientation of image from media store");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0064, code lost:
        if (r8 != null) goto L_0x0066;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0066, code lost:
        r8.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0069, code lost:
        throw r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:?, code lost:
        return 0;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x0057 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int d(es.voghdev.pdfviewpager.library.subscaleview.SubsamplingScaleImageView r8, android.content.Context r9, java.lang.String r10) {
        /*
            java.lang.String r8 = "content"
            boolean r8 = r10.startsWith(r8)
            r0 = 0
            if (r8 == 0) goto L_0x006a
            r8 = 0
            java.lang.String r1 = "orientation"
            java.lang.String[] r4 = new java.lang.String[]{r1}     // Catch:{ Exception -> 0x0057 }
            android.content.ContentResolver r2 = r9.getContentResolver()     // Catch:{ Exception -> 0x0057 }
            android.net.Uri r3 = android.net.Uri.parse(r10)     // Catch:{ Exception -> 0x0057 }
            r5 = 0
            r6 = 0
            r7 = 0
            android.database.Cursor r8 = r2.query(r3, r4, r5, r6, r7)     // Catch:{ Exception -> 0x0057 }
            if (r8 == 0) goto L_0x0052
            boolean r9 = r8.moveToFirst()     // Catch:{ Exception -> 0x0057 }
            if (r9 == 0) goto L_0x0052
            int r9 = r8.getInt(r0)     // Catch:{ Exception -> 0x0057 }
            java.util.List<java.lang.Integer> r10 = j.a.a.a.e.f.f8083b     // Catch:{ Exception -> 0x0057 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r9)     // Catch:{ Exception -> 0x0057 }
            boolean r10 = r10.contains(r1)     // Catch:{ Exception -> 0x0057 }
            if (r10 == 0) goto L_0x003c
            r10 = -1
            if (r9 == r10) goto L_0x003c
            r0 = r9
            goto L_0x0052
        L_0x003c:
            java.lang.String r10 = j.a.a.a.e.f.a     // Catch:{ Exception -> 0x0057 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0057 }
            r1.<init>()     // Catch:{ Exception -> 0x0057 }
            java.lang.String r2 = "Unsupported orientation: "
            r1.append(r2)     // Catch:{ Exception -> 0x0057 }
            r1.append(r9)     // Catch:{ Exception -> 0x0057 }
            java.lang.String r9 = r1.toString()     // Catch:{ Exception -> 0x0057 }
            android.util.Log.w(r10, r9)     // Catch:{ Exception -> 0x0057 }
        L_0x0052:
            if (r8 == 0) goto L_0x00c2
            goto L_0x0060
        L_0x0055:
            r9 = move-exception
            goto L_0x0064
        L_0x0057:
            java.lang.String r9 = j.a.a.a.e.f.a     // Catch:{ all -> 0x0055 }
            java.lang.String r10 = "Could not get orientation of image from media store"
            android.util.Log.w(r9, r10)     // Catch:{ all -> 0x0055 }
            if (r8 == 0) goto L_0x00c2
        L_0x0060:
            r8.close()
            goto L_0x00c2
        L_0x0064:
            if (r8 == 0) goto L_0x0069
            r8.close()
        L_0x0069:
            throw r9
        L_0x006a:
            java.lang.String r8 = "file:///"
            boolean r8 = r10.startsWith(r8)
            if (r8 == 0) goto L_0x00c2
            java.lang.String r8 = "file:///android_asset/"
            boolean r8 = r10.startsWith(r8)
            if (r8 != 0) goto L_0x00c2
            android.media.ExifInterface r8 = new android.media.ExifInterface     // Catch:{ Exception -> 0x00bb }
            r9 = 7
            java.lang.String r9 = r10.substring(r9)     // Catch:{ Exception -> 0x00bb }
            r8.<init>(r9)     // Catch:{ Exception -> 0x00bb }
            java.lang.String r9 = "Orientation"
            r10 = 1
            int r8 = r8.getAttributeInt(r9, r10)     // Catch:{ Exception -> 0x00bb }
            if (r8 == r10) goto L_0x00c2
            if (r8 != 0) goto L_0x0090
            goto L_0x00c2
        L_0x0090:
            r9 = 6
            if (r8 != r9) goto L_0x0097
            r8 = 90
        L_0x0095:
            r0 = r8
            goto L_0x00c2
        L_0x0097:
            r9 = 3
            if (r8 != r9) goto L_0x009d
            r8 = 180(0xb4, float:2.52E-43)
            goto L_0x0095
        L_0x009d:
            r9 = 8
            if (r8 != r9) goto L_0x00a4
            r8 = 270(0x10e, float:3.78E-43)
            goto L_0x0095
        L_0x00a4:
            java.lang.String r9 = j.a.a.a.e.f.a     // Catch:{ Exception -> 0x00bb }
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00bb }
            r10.<init>()     // Catch:{ Exception -> 0x00bb }
            java.lang.String r1 = "Unsupported EXIF orientation: "
            r10.append(r1)     // Catch:{ Exception -> 0x00bb }
            r10.append(r8)     // Catch:{ Exception -> 0x00bb }
            java.lang.String r8 = r10.toString()     // Catch:{ Exception -> 0x00bb }
            android.util.Log.w(r9, r8)     // Catch:{ Exception -> 0x00bb }
            goto L_0x00c2
        L_0x00bb:
            java.lang.String r8 = j.a.a.a.e.f.a
            java.lang.String r9 = "Could not get EXIF orientation of image"
            android.util.Log.w(r8, r9)
        L_0x00c2:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: es.voghdev.pdfviewpager.library.subscaleview.SubsamplingScaleImageView.d(es.voghdev.pdfviewpager.library.subscaleview.SubsamplingScaleImageView, android.content.Context, java.lang.String):int");
    }

    public static void e(SubsamplingScaleImageView subsamplingScaleImageView, Rect rect, Rect rect2) {
        if (subsamplingScaleImageView.getRequiredRotation() == 0) {
            rect2.set(rect);
        } else if (subsamplingScaleImageView.getRequiredRotation() == 90) {
            int i2 = rect.top;
            int i3 = subsamplingScaleImageView.M;
            rect2.set(i2, i3 - rect.right, rect.bottom, i3 - rect.left);
        } else if (subsamplingScaleImageView.getRequiredRotation() == 180) {
            int i4 = subsamplingScaleImageView.L;
            int i5 = subsamplingScaleImageView.M;
            rect2.set(i4 - rect.right, i5 - rect.bottom, i4 - rect.left, i5 - rect.top);
        } else {
            int i6 = subsamplingScaleImageView.L;
            rect2.set(i6 - rect.bottom, rect.left, i6 - rect.top, rect.right);
        }
    }

    public static Bitmap.Config getPreferredBitmapConfig() {
        return y0;
    }

    @AnyThread
    private int getRequiredRotation() {
        int i2 = this.f7998n;
        return i2 == -1 ? this.N : i2;
    }

    /* access modifiers changed from: private */
    public void setGestureDetector(Context context) {
        this.S = new GestureDetector(context, new b(context));
        this.T = new GestureDetector(context, new c());
    }

    public static void setPreferredBitmapConfig(Bitmap.Config config) {
        y0 = config;
    }

    public final void A(float[] fArr, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9) {
        fArr[0] = f2;
        fArr[1] = f3;
        fArr[2] = f4;
        fArr[3] = f5;
        fArr[4] = f6;
        fArr[5] = f7;
        fArr[6] = f8;
        fArr[7] = f9;
    }

    public final PointF B(PointF pointF) {
        float f2 = pointF.x;
        float f3 = pointF.y;
        PointF pointF2 = new PointF();
        if (this.F == null) {
            return null;
        }
        pointF2.set(C(f2), D(f3));
        return pointF2;
    }

    public final float C(float f2) {
        PointF pointF = this.F;
        if (pointF == null) {
            return Float.NaN;
        }
        return (f2 * this.D) + pointF.x;
    }

    public final float D(float f2) {
        PointF pointF = this.F;
        if (pointF == null) {
            return Float.NaN;
        }
        return (f2 * this.D) + pointF.y;
    }

    @NonNull
    public final PointF E(float f2, float f3, float f4) {
        int width = (((getWidth() - getPaddingRight()) - getPaddingLeft()) / 2) + getPaddingLeft();
        int height = (((getHeight() - getPaddingBottom()) - getPaddingTop()) / 2) + getPaddingTop();
        if (this.s0 == null) {
            this.s0 = new g(0.0f, new PointF(0.0f, 0.0f), (a) null);
        }
        g gVar = this.s0;
        gVar.a = f4;
        gVar.f8019b.set(((float) width) - (f2 * f4), ((float) height) - (f3 * f4));
        m(true, this.s0);
        return this.s0.f8019b;
    }

    public final PointF F(PointF pointF) {
        float f2 = pointF.x;
        float f3 = pointF.y;
        PointF pointF2 = new PointF();
        if (this.F == null) {
            return null;
        }
        pointF2.set(G(f2), H(f3));
        return pointF2;
    }

    public final float G(float f2) {
        PointF pointF = this.F;
        if (pointF == null) {
            return Float.NaN;
        }
        return (f2 - pointF.x) / this.D;
    }

    public final float H(float f2) {
        PointF pointF = this.F;
        if (pointF == null) {
            return Float.NaN;
        }
        return (f2 - pointF.y) / this.D;
    }

    public final int f(float f2) {
        int i2;
        if (this.f8001q > 0) {
            DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
            f2 *= ((float) this.f8001q) / ((displayMetrics.xdpi + displayMetrics.ydpi) / 2.0f);
        }
        int y2 = (int) (((float) y()) * f2);
        int x2 = (int) (((float) x()) * f2);
        if (y2 == 0 || x2 == 0) {
            return 32;
        }
        int i3 = 1;
        if (x() > x2 || y() > y2) {
            i2 = Math.round(((float) x()) / ((float) x2));
            int round = Math.round(((float) y()) / ((float) y2));
            if (i2 >= round) {
                i2 = round;
            }
        } else {
            i2 = 1;
        }
        while (true) {
            int i4 = i3 * 2;
            if (i4 >= i2) {
                return i3;
            }
            i3 = i4;
        }
    }

    public final boolean g() {
        boolean p2 = p();
        if (!this.l0 && p2) {
            t();
            this.l0 = true;
            j.a.a.a.e.d dVar = this.m0;
            if (dVar != null) {
                dVar.e();
            }
        }
        return p2;
    }

    public final int getAppliedOrientation() {
        return getRequiredRotation();
    }

    public final PointF getCenter() {
        float width = (float) (getWidth() / 2);
        float height = (float) (getHeight() / 2);
        PointF pointF = new PointF();
        if (this.F == null) {
            return null;
        }
        pointF.set(G(width), H(height));
        return pointF;
    }

    public float getMaxScale() {
        return this.f7999o;
    }

    public final float getMinScale() {
        return q();
    }

    public final int getOrientation() {
        return this.f7998n;
    }

    public final int getSHeight() {
        return this.M;
    }

    public final int getSWidth() {
        return this.L;
    }

    public final float getScale() {
        return this.D;
    }

    public final j.a.a.a.e.b getState() {
        if (this.F == null || this.L <= 0 || this.M <= 0) {
            return null;
        }
        return new j.a.a.a.e.b(getScale(), getCenter(), getOrientation());
    }

    public final boolean h() {
        boolean z2 = getWidth() > 0 && getHeight() > 0 && this.L > 0 && this.M > 0 && (this.f7992h != null || p());
        if (!this.k0 && z2) {
            t();
            this.k0 = true;
            j.a.a.a.e.d dVar = this.m0;
            if (dVar != null) {
                dVar.b();
            }
        }
        return z2;
    }

    public final float i(float f2, float f3, float f4, float f5) {
        float f6 = f2 - f3;
        float f7 = f4 - f5;
        return (float) Math.sqrt((double) ((f7 * f7) + (f6 * f6)));
    }

    public final void j(PointF pointF, PointF pointF2) {
        float f2;
        if (!this.x) {
            PointF pointF3 = this.K;
            if (pointF3 != null) {
                pointF.x = pointF3.x;
                f2 = pointF3.y;
            } else {
                pointF.x = (float) (y() / 2);
                f2 = (float) (x() / 2);
            }
            pointF.y = f2;
        }
        float min = Math.min(this.f7999o, this.A);
        float f3 = this.D;
        boolean z2 = ((double) f3) <= ((double) min) * 0.9d || f3 == this.f8000p;
        if (!z2) {
            min = q();
        }
        float f4 = min;
        int i2 = this.B;
        if (i2 == 3) {
            this.j0 = null;
            this.I = Float.valueOf(f4);
            this.J = pointF;
            this.K = pointF;
            invalidate();
        } else if (i2 == 2 || !z2 || !this.x) {
            e eVar = new e(f4, pointF, (a) null);
            eVar.f8013g = false;
            eVar.d = (long) this.C;
            eVar.f = 4;
            eVar.a();
        } else if (i2 == 1) {
            e eVar2 = new e(f4, pointF, pointF2, (a) null);
            eVar2.f8013g = false;
            eVar2.d = (long) this.C;
            eVar2.f = 4;
            eVar2.a();
        }
        invalidate();
    }

    public final float k(int i2, long j2, float f2, float f3, long j3) {
        float f4;
        if (i2 == 1) {
            float f5 = ((float) j2) / ((float) j3);
            return b.e.a.a.a.a(f5, 2.0f, (-f3) * f5, f2);
        } else if (i2 == 2) {
            float f6 = ((float) j2) / (((float) j3) / 2.0f);
            if (f6 < 1.0f) {
                f4 = (f3 / 2.0f) * f6 * f6;
            } else {
                float f7 = f6 - 1.0f;
                f4 = (((f7 - 2.0f) * f7) - 1.0f) * ((-f3) / 2.0f);
            }
            return f4 + f2;
        } else {
            throw new IllegalStateException(b.e.a.a.a.g("Unexpected easing type: ", i2));
        }
    }

    public final void l(boolean z2) {
        boolean z3;
        if (this.F == null) {
            z3 = true;
            this.F = new PointF(0.0f, 0.0f);
        } else {
            z3 = false;
        }
        if (this.s0 == null) {
            this.s0 = new g(0.0f, new PointF(0.0f, 0.0f), (a) null);
        }
        g gVar = this.s0;
        gVar.a = this.D;
        gVar.f8019b.set(this.F);
        m(z2, this.s0);
        g gVar2 = this.s0;
        this.D = gVar2.a;
        this.F.set(gVar2.f8019b);
        if (z3 && this.s != 4) {
            this.F.set(E((float) (y() / 2), (float) (x() / 2), this.D));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0081  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00b7  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00cb  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void m(boolean r12, es.voghdev.pdfviewpager.library.subscaleview.SubsamplingScaleImageView.g r13) {
        /*
            r11 = this;
            int r0 = r11.r
            r1 = 0
            r2 = 2
            if (r0 != r2) goto L_0x000b
            boolean r0 = r11.k0
            if (r0 == 0) goto L_0x000b
            r12 = r1
        L_0x000b:
            android.graphics.PointF r0 = r13.f8019b
            float r3 = r13.a
            float r4 = r11.q()
            float r3 = java.lang.Math.max(r4, r3)
            float r4 = r11.f7999o
            float r3 = java.lang.Math.min(r4, r3)
            int r4 = r11.y()
            float r4 = (float) r4
            float r4 = r4 * r3
            int r5 = r11.x()
            float r5 = (float) r5
            float r5 = r5 * r3
            int r6 = r11.r
            r7 = 3
            if (r6 != r7) goto L_0x0049
            boolean r6 = r11.k0
            if (r6 == 0) goto L_0x0049
            float r6 = r0.x
            int r8 = r11.getWidth()
            int r8 = r8 / r2
            float r8 = (float) r8
            float r8 = r8 - r4
            float r6 = java.lang.Math.max(r6, r8)
            r0.x = r6
            float r6 = r0.y
            int r8 = r11.getHeight()
            int r8 = r8 / r2
            goto L_0x005f
        L_0x0049:
            float r6 = r0.x
            if (r12 == 0) goto L_0x0062
            int r8 = r11.getWidth()
            float r8 = (float) r8
            float r8 = r8 - r4
            float r6 = java.lang.Math.max(r6, r8)
            r0.x = r6
            float r6 = r0.y
            int r8 = r11.getHeight()
        L_0x005f:
            float r8 = (float) r8
            float r8 = r8 - r5
            goto L_0x006c
        L_0x0062:
            float r8 = -r4
            float r6 = java.lang.Math.max(r6, r8)
            r0.x = r6
            float r6 = r0.y
            float r8 = -r5
        L_0x006c:
            float r6 = java.lang.Math.max(r6, r8)
            r0.y = r6
            int r6 = r11.getPaddingLeft()
            r8 = 1056964608(0x3f000000, float:0.5)
            if (r6 > 0) goto L_0x0083
            int r6 = r11.getPaddingRight()
            if (r6 <= 0) goto L_0x0081
            goto L_0x0083
        L_0x0081:
            r6 = r8
            goto L_0x0093
        L_0x0083:
            int r6 = r11.getPaddingLeft()
            float r6 = (float) r6
            int r9 = r11.getPaddingLeft()
            int r10 = r11.getPaddingRight()
            int r10 = r10 + r9
            float r9 = (float) r10
            float r6 = r6 / r9
        L_0x0093:
            int r9 = r11.getPaddingTop()
            if (r9 > 0) goto L_0x009f
            int r9 = r11.getPaddingBottom()
            if (r9 <= 0) goto L_0x00af
        L_0x009f:
            int r8 = r11.getPaddingTop()
            float r8 = (float) r8
            int r9 = r11.getPaddingTop()
            int r10 = r11.getPaddingBottom()
            int r10 = r10 + r9
            float r9 = (float) r10
            float r8 = r8 / r9
        L_0x00af:
            int r9 = r11.r
            if (r9 != r7) goto L_0x00cb
            boolean r7 = r11.k0
            if (r7 == 0) goto L_0x00cb
            int r12 = r11.getWidth()
            int r12 = r12 / r2
            int r12 = java.lang.Math.max(r1, r12)
            float r12 = (float) r12
            int r4 = r11.getHeight()
            int r4 = r4 / r2
            int r1 = java.lang.Math.max(r1, r4)
            goto L_0x00f6
        L_0x00cb:
            if (r12 == 0) goto L_0x00e5
            int r12 = r11.getWidth()
            float r12 = (float) r12
            float r12 = r12 - r4
            float r12 = r12 * r6
            r1 = 0
            float r12 = java.lang.Math.max(r1, r12)
            int r2 = r11.getHeight()
            float r2 = (float) r2
            float r2 = r2 - r5
            float r2 = r2 * r8
            float r1 = java.lang.Math.max(r1, r2)
            goto L_0x00f7
        L_0x00e5:
            int r12 = r11.getWidth()
            int r12 = java.lang.Math.max(r1, r12)
            float r12 = (float) r12
            int r2 = r11.getHeight()
            int r1 = java.lang.Math.max(r1, r2)
        L_0x00f6:
            float r1 = (float) r1
        L_0x00f7:
            float r2 = r0.x
            float r12 = java.lang.Math.min(r2, r12)
            r0.x = r12
            float r12 = r0.y
            float r12 = java.lang.Math.min(r12, r1)
            r0.y = r12
            r13.a = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: es.voghdev.pdfviewpager.library.subscaleview.SubsamplingScaleImageView.m(boolean, es.voghdev.pdfviewpager.library.subscaleview.SubsamplingScaleImageView$g):void");
    }

    public final synchronized void n(@NonNull Point point) {
        g gVar = new g(0.0f, new PointF(0.0f, 0.0f), (a) null);
        this.s0 = gVar;
        m(true, gVar);
        int f2 = f(this.s0.a);
        this.f7996l = f2;
        if (f2 > 1) {
            this.f7996l = f2 / 2;
        }
        if (this.f7996l != 1 || y() >= point.x || x() >= point.y) {
            o(point);
            for (h iVar : this.f7997m.get(Integer.valueOf(this.f7996l))) {
                new i(this, this.U, iVar).executeOnExecutor(this.v, new Void[0]);
            }
            u(true);
        } else {
            this.U.recycle();
            this.U = null;
            new f(this, getContext(), this.W, this.f7995k, false).executeOnExecutor(this.v, new Void[0]);
        }
    }

    public final void o(Point point) {
        Point point2 = point;
        this.f7997m = new LinkedHashMap();
        int i2 = this.f7996l;
        boolean z2 = true;
        int i3 = 1;
        int i4 = 1;
        while (true) {
            int y2 = y() / i3;
            int x2 = x() / i4;
            int i5 = y2 / i2;
            int i6 = x2 / i2;
            while (true) {
                if (i5 + i3 + (z2 ? 1 : 0) > point2.x || (((double) i5) > ((double) getWidth()) * 1.25d && i2 < this.f7996l)) {
                    i3++;
                    y2 = y() / i3;
                    i5 = y2 / i2;
                }
            }
            while (true) {
                if (i6 + i4 + z2 > point2.y || (((double) i6) > ((double) getHeight()) * 1.25d && i2 < this.f7996l)) {
                    i4++;
                    x2 = x() / i4;
                    i6 = x2 / i2;
                }
            }
            ArrayList arrayList = new ArrayList(i3 * i4);
            int i7 = 0;
            while (i7 < i3) {
                int i8 = 0;
                while (i8 < i4) {
                    h hVar = new h((a) null);
                    hVar.f8020b = i2;
                    hVar.f8021e = i2 == this.f7996l ? z2 : false;
                    hVar.a = new Rect(i7 * y2, i8 * x2, i7 == i3 + -1 ? y() : (i7 + 1) * y2, i8 == i4 + -1 ? x() : (i8 + 1) * x2);
                    hVar.f = new Rect(0, 0, 0, 0);
                    hVar.f8022g = new Rect(hVar.a);
                    arrayList.add(hVar);
                    i8++;
                    z2 = true;
                }
                i7++;
                z2 = true;
            }
            this.f7997m.put(Integer.valueOf(i2), arrayList);
            z2 = true;
            if (i2 != 1) {
                i2 /= 2;
            } else {
                return;
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:38:0x0121  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onDraw(android.graphics.Canvas r29) {
        /*
            r28 = this;
            r11 = r28
            r12 = r29
            super.onDraw(r29)
            android.graphics.Paint r0 = r11.q0
            r9 = 1
            if (r0 != 0) goto L_0x0020
            android.graphics.Paint r0 = new android.graphics.Paint
            r0.<init>()
            r11.q0 = r0
            r0.setAntiAlias(r9)
            android.graphics.Paint r0 = r11.q0
            r0.setFilterBitmap(r9)
            android.graphics.Paint r0 = r11.q0
            r0.setDither(r9)
        L_0x0020:
            int r0 = r11.L
            if (r0 == 0) goto L_0x03dd
            int r0 = r11.M
            if (r0 == 0) goto L_0x03dd
            int r0 = r28.getWidth()
            if (r0 == 0) goto L_0x03dd
            int r0 = r28.getHeight()
            if (r0 != 0) goto L_0x0036
            goto L_0x03dd
        L_0x0036:
            java.util.Map<java.lang.Integer, java.util.List<es.voghdev.pdfviewpager.library.subscaleview.SubsamplingScaleImageView$h>> r0 = r11.f7997m
            if (r0 != 0) goto L_0x005a
            j.a.a.a.e.g.d r0 = r11.U
            if (r0 == 0) goto L_0x005a
            android.graphics.Point r0 = new android.graphics.Point
            int r1 = r29.getMaximumBitmapWidth()
            int r2 = r11.t
            int r1 = java.lang.Math.min(r1, r2)
            int r2 = r29.getMaximumBitmapHeight()
            int r3 = r11.u
            int r2 = java.lang.Math.min(r2, r3)
            r0.<init>(r1, r2)
            r11.n(r0)
        L_0x005a:
            boolean r0 = r28.h()
            if (r0 != 0) goto L_0x0061
            return
        L_0x0061:
            r28.t()
            es.voghdev.pdfviewpager.library.subscaleview.SubsamplingScaleImageView$d r0 = r11.j0
            r10 = 0
            r13 = 0
            if (r0 == 0) goto L_0x013a
            android.graphics.PointF r0 = r0.f8004e
            if (r0 == 0) goto L_0x013a
            float r0 = r11.D
            android.graphics.PointF r1 = r11.H
            if (r1 != 0) goto L_0x007b
            android.graphics.PointF r1 = new android.graphics.PointF
            r1.<init>(r13, r13)
            r11.H = r1
        L_0x007b:
            android.graphics.PointF r1 = r11.H
            android.graphics.PointF r2 = r11.F
            r1.set(r2)
            long r1 = java.lang.System.currentTimeMillis()
            es.voghdev.pdfviewpager.library.subscaleview.SubsamplingScaleImageView$d r3 = r11.j0
            long r4 = r3.f8009k
            long r1 = r1 - r4
            long r3 = r3.f8005g
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 <= 0) goto L_0x0093
            r14 = r9
            goto L_0x0094
        L_0x0093:
            r14 = r10
        L_0x0094:
            long r15 = java.lang.Math.min(r1, r3)
            es.voghdev.pdfviewpager.library.subscaleview.SubsamplingScaleImageView$d r1 = r11.j0
            int r2 = r1.f8007i
            float r5 = r1.a
            float r3 = r1.f8003b
            float r6 = r3 - r5
            long r7 = r1.f8005g
            r1 = r28
            r3 = r15
            float r1 = r1.k(r2, r3, r5, r6, r7)
            r11.D = r1
            es.voghdev.pdfviewpager.library.subscaleview.SubsamplingScaleImageView$d r1 = r11.j0
            int r2 = r1.f8007i
            android.graphics.PointF r3 = r1.f8004e
            float r5 = r3.x
            android.graphics.PointF r3 = r1.f
            float r3 = r3.x
            float r6 = r3 - r5
            long r7 = r1.f8005g
            r1 = r28
            r3 = r15
            float r17 = r1.k(r2, r3, r5, r6, r7)
            es.voghdev.pdfviewpager.library.subscaleview.SubsamplingScaleImageView$d r1 = r11.j0
            int r2 = r1.f8007i
            android.graphics.PointF r3 = r1.f8004e
            float r5 = r3.y
            android.graphics.PointF r3 = r1.f
            float r3 = r3.y
            float r6 = r3 - r5
            long r7 = r1.f8005g
            r1 = r28
            r3 = r15
            float r1 = r1.k(r2, r3, r5, r6, r7)
            android.graphics.PointF r2 = r11.F
            float r3 = r2.x
            es.voghdev.pdfviewpager.library.subscaleview.SubsamplingScaleImageView$d r4 = r11.j0
            android.graphics.PointF r4 = r4.d
            float r4 = r4.x
            float r4 = r11.C(r4)
            float r4 = r4 - r17
            float r3 = r3 - r4
            r2.x = r3
            android.graphics.PointF r2 = r11.F
            float r3 = r2.y
            es.voghdev.pdfviewpager.library.subscaleview.SubsamplingScaleImageView$d r4 = r11.j0
            android.graphics.PointF r4 = r4.d
            float r4 = r4.y
            float r4 = r11.D(r4)
            float r4 = r4 - r1
            float r3 = r3 - r4
            r2.y = r3
            if (r14 != 0) goto L_0x010f
            es.voghdev.pdfviewpager.library.subscaleview.SubsamplingScaleImageView$d r1 = r11.j0
            float r2 = r1.a
            float r1 = r1.f8003b
            int r1 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r1 != 0) goto L_0x010d
            goto L_0x010f
        L_0x010d:
            r1 = r10
            goto L_0x0110
        L_0x010f:
            r1 = r9
        L_0x0110:
            r11.l(r1)
            android.graphics.PointF r1 = r11.H
            es.voghdev.pdfviewpager.library.subscaleview.SubsamplingScaleImageView$d r2 = r11.j0
            int r2 = r2.f8008j
            r11.z(r0, r1, r2)
            r11.u(r14)
            if (r14 == 0) goto L_0x0137
            es.voghdev.pdfviewpager.library.subscaleview.SubsamplingScaleImageView$d r0 = r11.j0
            j.a.a.a.e.c r0 = r0.f8010l
            if (r0 == 0) goto L_0x0134
            r0.a()     // Catch:{ Exception -> 0x012b }
            goto L_0x0134
        L_0x012b:
            r0 = move-exception
            r1 = r0
            java.lang.String r0 = j.a.a.a.e.f.a
            java.lang.String r2 = "Error thrown by animation listener"
            android.util.Log.w(r0, r2, r1)
        L_0x0134:
            r0 = 0
            r11.j0 = r0
        L_0x0137:
            r28.invalidate()
        L_0x013a:
            java.util.Map<java.lang.Integer, java.util.List<es.voghdev.pdfviewpager.library.subscaleview.SubsamplingScaleImageView$h>> r0 = r11.f7997m
            r14 = 90
            r15 = 180(0xb4, float:2.52E-43)
            r8 = 270(0x10e, float:3.78E-43)
            if (r0 == 0) goto L_0x0307
            boolean r0 = r28.p()
            if (r0 == 0) goto L_0x0307
            int r0 = r11.f7996l
            float r1 = r11.D
            int r1 = r11.f(r1)
            int r0 = java.lang.Math.min(r0, r1)
            java.util.Map<java.lang.Integer, java.util.List<es.voghdev.pdfviewpager.library.subscaleview.SubsamplingScaleImageView$h>> r1 = r11.f7997m
            java.util.Set r1 = r1.entrySet()
            java.util.Iterator r1 = r1.iterator()
            r13 = r10
        L_0x0161:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x019d
            java.lang.Object r2 = r1.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r3 = r2.getKey()
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            if (r3 != r0) goto L_0x0161
            java.lang.Object r2 = r2.getValue()
            java.util.List r2 = (java.util.List) r2
            java.util.Iterator r2 = r2.iterator()
        L_0x0183:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0161
            java.lang.Object r3 = r2.next()
            es.voghdev.pdfviewpager.library.subscaleview.SubsamplingScaleImageView$h r3 = (es.voghdev.pdfviewpager.library.subscaleview.SubsamplingScaleImageView.h) r3
            boolean r4 = r3.f8021e
            if (r4 == 0) goto L_0x0183
            boolean r4 = r3.d
            if (r4 != 0) goto L_0x019b
            android.graphics.Bitmap r3 = r3.c
            if (r3 != 0) goto L_0x0183
        L_0x019b:
            r13 = r9
            goto L_0x0183
        L_0x019d:
            java.util.Map<java.lang.Integer, java.util.List<es.voghdev.pdfviewpager.library.subscaleview.SubsamplingScaleImageView$h>> r1 = r11.f7997m
            java.util.Set r1 = r1.entrySet()
            java.util.Iterator r16 = r1.iterator()
        L_0x01a7:
            boolean r1 = r16.hasNext()
            if (r1 == 0) goto L_0x03dd
            java.lang.Object r1 = r16.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getKey()
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            if (r2 == r0) goto L_0x01c6
            if (r13 == 0) goto L_0x01c2
            goto L_0x01c6
        L_0x01c2:
            r20 = r13
            goto L_0x0301
        L_0x01c6:
            java.lang.Object r1 = r1.getValue()
            java.util.List r1 = (java.util.List) r1
            java.util.Iterator r17 = r1.iterator()
        L_0x01d0:
            boolean r1 = r17.hasNext()
            if (r1 == 0) goto L_0x01c2
            java.lang.Object r1 = r17.next()
            r10 = r1
            es.voghdev.pdfviewpager.library.subscaleview.SubsamplingScaleImageView$h r10 = (es.voghdev.pdfviewpager.library.subscaleview.SubsamplingScaleImageView.h) r10
            android.graphics.Rect r1 = r10.a
            android.graphics.Rect r2 = r10.f
            int r3 = r1.left
            float r3 = (float) r3
            float r3 = r11.C(r3)
            int r3 = (int) r3
            int r4 = r1.top
            float r4 = (float) r4
            float r4 = r11.D(r4)
            int r4 = (int) r4
            int r5 = r1.right
            float r5 = (float) r5
            float r5 = r11.C(r5)
            int r5 = (int) r5
            int r1 = r1.bottom
            float r1 = (float) r1
            float r1 = r11.D(r1)
            int r1 = (int) r1
            r2.set(r3, r4, r5, r1)
            boolean r1 = r10.d
            if (r1 != 0) goto L_0x02f9
            android.graphics.Bitmap r1 = r10.c
            if (r1 == 0) goto L_0x02f9
            android.graphics.Paint r1 = r11.r0
            if (r1 == 0) goto L_0x0215
            android.graphics.Rect r2 = r10.f
            r12.drawRect(r2, r1)
        L_0x0215:
            android.graphics.Matrix r1 = r11.t0
            if (r1 != 0) goto L_0x0220
            android.graphics.Matrix r1 = new android.graphics.Matrix
            r1.<init>()
            r11.t0 = r1
        L_0x0220:
            android.graphics.Matrix r1 = r11.t0
            r1.reset()
            float[] r2 = r11.v0
            r3 = 0
            r4 = 0
            android.graphics.Bitmap r1 = r10.c
            int r1 = r1.getWidth()
            float r5 = (float) r1
            r6 = 0
            android.graphics.Bitmap r1 = r10.c
            int r1 = r1.getWidth()
            float r7 = (float) r1
            android.graphics.Bitmap r1 = r10.c
            int r1 = r1.getHeight()
            float r9 = (float) r1
            r18 = 0
            android.graphics.Bitmap r1 = r10.c
            int r1 = r1.getHeight()
            float r1 = (float) r1
            r19 = r1
            r1 = r28
            r20 = r13
            r13 = r8
            r8 = r9
            r9 = r18
            r13 = r10
            r10 = r19
            r1.A(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            int r1 = r28.getRequiredRotation()
            if (r1 != 0) goto L_0x0279
            float[] r2 = r11.w0
            android.graphics.Rect r1 = r13.f
            int r3 = r1.left
            float r9 = (float) r3
            int r3 = r1.top
            float r6 = (float) r3
            int r3 = r1.right
            float r7 = (float) r3
            int r1 = r1.bottom
            float r10 = (float) r1
            r1 = r28
            r3 = r9
            r4 = r6
            r5 = r7
            r8 = r10
            r1.A(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            goto L_0x02da
        L_0x0279:
            int r1 = r28.getRequiredRotation()
            if (r1 != r14) goto L_0x0299
            float[] r2 = r11.w0
            android.graphics.Rect r1 = r13.f
            int r3 = r1.right
            float r5 = (float) r3
            int r3 = r1.top
            float r10 = (float) r3
            int r3 = r1.bottom
            float r8 = (float) r3
            int r1 = r1.left
            float r9 = (float) r1
            r1 = r28
            r3 = r5
            r4 = r10
            r6 = r8
            r7 = r9
            r1.A(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            goto L_0x02da
        L_0x0299:
            int r1 = r28.getRequiredRotation()
            if (r1 != r15) goto L_0x02b9
            float[] r2 = r11.w0
            android.graphics.Rect r1 = r13.f
            int r3 = r1.right
            float r9 = (float) r3
            int r3 = r1.bottom
            float r6 = (float) r3
            int r3 = r1.left
            float r7 = (float) r3
            int r1 = r1.top
            float r10 = (float) r1
            r1 = r28
            r3 = r9
            r4 = r6
            r5 = r7
            r8 = r10
            r1.A(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            goto L_0x02da
        L_0x02b9:
            int r1 = r28.getRequiredRotation()
            r2 = 270(0x10e, float:3.78E-43)
            if (r1 != r2) goto L_0x02da
            float[] r2 = r11.w0
            android.graphics.Rect r1 = r13.f
            int r3 = r1.left
            float r5 = (float) r3
            int r3 = r1.bottom
            float r10 = (float) r3
            int r3 = r1.top
            float r8 = (float) r3
            int r1 = r1.right
            float r9 = (float) r1
            r1 = r28
            r3 = r5
            r4 = r10
            r6 = r8
            r7 = r9
            r1.A(r2, r3, r4, r5, r6, r7, r8, r9, r10)
        L_0x02da:
            android.graphics.Matrix r1 = r11.t0
            float[] r2 = r11.v0
            r23 = 0
            float[] r3 = r11.w0
            r25 = 0
            r26 = 4
            r21 = r1
            r22 = r2
            r24 = r3
            r21.setPolyToPoly(r22, r23, r24, r25, r26)
            android.graphics.Bitmap r1 = r13.c
            android.graphics.Matrix r2 = r11.t0
            android.graphics.Paint r3 = r11.q0
            r12.drawBitmap(r1, r2, r3)
            goto L_0x02fb
        L_0x02f9:
            r20 = r13
        L_0x02fb:
            r13 = r20
            r8 = 270(0x10e, float:3.78E-43)
            goto L_0x01d0
        L_0x0301:
            r13 = r20
            r8 = 270(0x10e, float:3.78E-43)
            goto L_0x01a7
        L_0x0307:
            r1 = r13
            android.graphics.Bitmap r0 = r11.f7992h
            if (r0 == 0) goto L_0x03dd
            float r2 = r11.D
            boolean r3 = r11.f7993i
            if (r3 == 0) goto L_0x0330
            int r3 = r11.L
            float r3 = (float) r3
            int r0 = r0.getWidth()
            float r0 = (float) r0
            float r3 = r3 / r0
            float r2 = r2 * r3
            float r0 = r11.D
            int r3 = r11.M
            float r3 = (float) r3
            android.graphics.Bitmap r4 = r11.f7992h
            int r4 = r4.getHeight()
            float r4 = (float) r4
            float r3 = r3 / r4
            float r0 = r0 * r3
            r27 = r2
            r2 = r0
            r0 = r27
            goto L_0x0331
        L_0x0330:
            r0 = r2
        L_0x0331:
            android.graphics.Matrix r3 = r11.t0
            if (r3 != 0) goto L_0x033c
            android.graphics.Matrix r3 = new android.graphics.Matrix
            r3.<init>()
            r11.t0 = r3
        L_0x033c:
            android.graphics.Matrix r3 = r11.t0
            r3.reset()
            android.graphics.Matrix r3 = r11.t0
            r3.postScale(r0, r2)
            android.graphics.Matrix r0 = r11.t0
            int r2 = r28.getRequiredRotation()
            float r2 = (float) r2
            r0.postRotate(r2)
            android.graphics.Matrix r0 = r11.t0
            android.graphics.PointF r2 = r11.F
            float r3 = r2.x
            float r2 = r2.y
            r0.postTranslate(r3, r2)
            int r0 = r28.getRequiredRotation()
            if (r0 != r15) goto L_0x0371
            android.graphics.Matrix r0 = r11.t0
            float r2 = r11.D
            int r3 = r11.L
            float r3 = (float) r3
            float r3 = r3 * r2
            int r4 = r11.M
            float r4 = (float) r4
            float r2 = r2 * r4
            r0.postTranslate(r3, r2)
            goto L_0x0396
        L_0x0371:
            int r0 = r28.getRequiredRotation()
            if (r0 != r14) goto L_0x0383
            android.graphics.Matrix r0 = r11.t0
            float r2 = r11.D
            int r3 = r11.M
            float r3 = (float) r3
            float r2 = r2 * r3
            r0.postTranslate(r2, r1)
            goto L_0x0396
        L_0x0383:
            int r0 = r28.getRequiredRotation()
            r2 = 270(0x10e, float:3.78E-43)
            if (r0 != r2) goto L_0x0396
            android.graphics.Matrix r0 = r11.t0
            float r2 = r11.D
            int r3 = r11.L
            float r3 = (float) r3
            float r2 = r2 * r3
            r0.postTranslate(r1, r2)
        L_0x0396:
            android.graphics.Paint r0 = r11.r0
            if (r0 == 0) goto L_0x03d4
            android.graphics.RectF r0 = r11.u0
            if (r0 != 0) goto L_0x03a5
            android.graphics.RectF r0 = new android.graphics.RectF
            r0.<init>()
            r11.u0 = r0
        L_0x03a5:
            android.graphics.RectF r0 = r11.u0
            boolean r2 = r11.f7993i
            if (r2 == 0) goto L_0x03b2
            android.graphics.Bitmap r2 = r11.f7992h
            int r2 = r2.getWidth()
            goto L_0x03b4
        L_0x03b2:
            int r2 = r11.L
        L_0x03b4:
            float r2 = (float) r2
            boolean r3 = r11.f7993i
            if (r3 == 0) goto L_0x03c0
            android.graphics.Bitmap r3 = r11.f7992h
            int r3 = r3.getHeight()
            goto L_0x03c2
        L_0x03c0:
            int r3 = r11.M
        L_0x03c2:
            float r3 = (float) r3
            r0.set(r1, r1, r2, r3)
            android.graphics.Matrix r0 = r11.t0
            android.graphics.RectF r1 = r11.u0
            r0.mapRect(r1)
            android.graphics.RectF r0 = r11.u0
            android.graphics.Paint r1 = r11.r0
            r12.drawRect(r0, r1)
        L_0x03d4:
            android.graphics.Bitmap r0 = r11.f7992h
            android.graphics.Matrix r1 = r11.t0
            android.graphics.Paint r2 = r11.q0
            r12.drawBitmap(r0, r1, r2)
        L_0x03dd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: es.voghdev.pdfviewpager.library.subscaleview.SubsamplingScaleImageView.onDraw(android.graphics.Canvas):void");
    }

    public void onMeasure(int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i2);
        int mode2 = View.MeasureSpec.getMode(i3);
        int size = View.MeasureSpec.getSize(i2);
        int size2 = View.MeasureSpec.getSize(i3);
        boolean z2 = true;
        boolean z3 = mode != 1073741824;
        if (mode2 == 1073741824) {
            z2 = false;
        }
        if (this.L > 0 && this.M > 0) {
            if (z3 && z2) {
                size = y();
                size2 = x();
            } else if (z2) {
                size2 = (int) ((((double) x()) / ((double) y())) * ((double) size));
            } else if (z3) {
                size = (int) ((((double) y()) / ((double) x())) * ((double) size2));
            }
        }
        setMeasuredDimension(Math.max(size, getSuggestedMinimumWidth()), Math.max(size2, getSuggestedMinimumHeight()));
    }

    public void onSizeChanged(int i2, int i3, int i4, int i5) {
        PointF center = getCenter();
        if (this.k0 && center != null) {
            this.j0 = null;
            this.I = Float.valueOf(this.D);
            this.J = center;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0087, code lost:
        if (r8 != 262) goto L_0x03fd;
     */
    /* JADX WARNING: Removed duplicated region for block: B:165:0x03da  */
    /* JADX WARNING: Removed duplicated region for block: B:169:0x03f3  */
    /* JADX WARNING: Removed duplicated region for block: B:216:0x0504  */
    /* JADX WARNING: Removed duplicated region for block: B:219:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(@androidx.annotation.NonNull android.view.MotionEvent r17) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            es.voghdev.pdfviewpager.library.subscaleview.SubsamplingScaleImageView$d r2 = r0.j0
            r3 = 1
            if (r2 == 0) goto L_0x0011
            boolean r4 = r2.f8006h
            if (r4 != 0) goto L_0x0011
            r0.v(r3)
            return r3
        L_0x0011:
            if (r2 == 0) goto L_0x001a
            j.a.a.a.e.c r2 = r2.f8010l
            if (r2 == 0) goto L_0x001a
            r2.b()     // Catch:{ Exception -> 0x001a }
        L_0x001a:
            r2 = 0
            r0.j0 = r2
            android.graphics.PointF r4 = r0.F
            if (r4 != 0) goto L_0x0029
            android.view.GestureDetector r2 = r0.T
            if (r2 == 0) goto L_0x0028
            r2.onTouchEvent(r1)
        L_0x0028:
            return r3
        L_0x0029:
            boolean r4 = r0.Q
            r5 = 0
            if (r4 != 0) goto L_0x003f
            android.view.GestureDetector r4 = r0.S
            if (r4 == 0) goto L_0x0038
            boolean r4 = r4.onTouchEvent(r1)
            if (r4 == 0) goto L_0x003f
        L_0x0038:
            r0.O = r5
            r0.P = r5
            r0.R = r5
            return r3
        L_0x003f:
            android.graphics.PointF r4 = r0.G
            r6 = 0
            if (r4 != 0) goto L_0x004b
            android.graphics.PointF r4 = new android.graphics.PointF
            r4.<init>(r6, r6)
            r0.G = r4
        L_0x004b:
            android.graphics.PointF r4 = r0.H
            if (r4 != 0) goto L_0x0056
            android.graphics.PointF r4 = new android.graphics.PointF
            r4.<init>(r6, r6)
            r0.H = r4
        L_0x0056:
            android.graphics.PointF r4 = r0.b0
            if (r4 != 0) goto L_0x0061
            android.graphics.PointF r4 = new android.graphics.PointF
            r4.<init>(r6, r6)
            r0.b0 = r4
        L_0x0061:
            float r4 = r0.D
            android.graphics.PointF r7 = r0.H
            android.graphics.PointF r8 = r0.F
            r7.set(r8)
            int r7 = r17.getPointerCount()
            int r8 = r17.getAction()
            r9 = 1073741824(0x40000000, float:2.0)
            r10 = 2
            if (r8 == 0) goto L_0x0474
            if (r8 == r3) goto L_0x0400
            if (r8 == r10) goto L_0x008b
            r6 = 5
            if (r8 == r6) goto L_0x0474
            r6 = 6
            if (r8 == r6) goto L_0x0400
            r6 = 261(0x105, float:3.66E-43)
            if (r8 == r6) goto L_0x0474
            r2 = 262(0x106, float:3.67E-43)
            if (r8 == r2) goto L_0x0400
            goto L_0x03fd
        L_0x008b:
            int r2 = r0.R
            if (r2 <= 0) goto L_0x03f0
            r2 = 1084227584(0x40a00000, float:5.0)
            if (r7 < r10) goto L_0x01db
            float r6 = r1.getX(r5)
            float r7 = r1.getX(r3)
            float r8 = r1.getY(r5)
            float r11 = r1.getY(r3)
            float r6 = r0.i(r6, r7, r8, r11)
            float r7 = r1.getX(r5)
            float r8 = r1.getX(r3)
            float r8 = r8 + r7
            float r8 = r8 / r9
            float r7 = r1.getY(r5)
            float r11 = r1.getY(r3)
            float r11 = r11 + r7
            float r11 = r11 / r9
            boolean r7 = r0.y
            if (r7 == 0) goto L_0x03f0
            android.graphics.PointF r7 = r0.b0
            float r9 = r7.x
            float r7 = r7.y
            float r7 = r0.i(r9, r8, r7, r11)
            int r7 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r7 > 0) goto L_0x00dd
            float r7 = r0.c0
            float r7 = r6 - r7
            float r7 = java.lang.Math.abs(r7)
            int r2 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r2 > 0) goto L_0x00dd
            boolean r2 = r0.P
            if (r2 == 0) goto L_0x03f0
        L_0x00dd:
            r0.O = r3
            r0.P = r3
            float r2 = r0.D
            double r12 = (double) r2
            float r2 = r0.f7999o
            float r7 = r0.c0
            float r7 = r6 / r7
            float r9 = r0.E
            float r7 = r7 * r9
            float r2 = java.lang.Math.min(r2, r7)
            r0.D = r2
            float r7 = r16.q()
            int r2 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r2 > 0) goto L_0x0111
            r0.c0 = r6
            float r2 = r16.q()
            r0.E = r2
            android.graphics.PointF r2 = r0.b0
            r2.set(r8, r11)
            android.graphics.PointF r2 = r0.G
            android.graphics.PointF r6 = r0.F
            r2.set(r6)
            goto L_0x0318
        L_0x0111:
            boolean r2 = r0.x
            if (r2 == 0) goto L_0x018c
            android.graphics.PointF r2 = r0.b0
            float r7 = r2.x
            android.graphics.PointF r9 = r0.G
            float r14 = r9.x
            float r7 = r7 - r14
            float r2 = r2.y
            float r9 = r9.y
            float r2 = r2 - r9
            float r9 = r0.D
            float r14 = r0.E
            float r9 = r9 / r14
            float r7 = r7 * r9
            float r9 = r9 * r2
            android.graphics.PointF r2 = r0.F
            float r7 = r8 - r7
            r2.x = r7
            float r7 = r11 - r9
            r2.y = r7
            int r2 = r16.x()
            double r14 = (double) r2
            double r14 = r14 * r12
            int r2 = r16.getHeight()
            r7 = r6
            double r5 = (double) r2
            int r2 = (r14 > r5 ? 1 : (r14 == r5 ? 0 : -1))
            if (r2 >= 0) goto L_0x0155
            float r2 = r0.D
            int r5 = r16.x()
            float r5 = (float) r5
            float r2 = r2 * r5
            int r5 = r16.getHeight()
            float r5 = (float) r5
            int r2 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r2 >= 0) goto L_0x0175
        L_0x0155:
            int r2 = r16.y()
            double r5 = (double) r2
            double r12 = r12 * r5
            int r2 = r16.getWidth()
            double r5 = (double) r2
            int r2 = (r12 > r5 ? 1 : (r12 == r5 ? 0 : -1))
            if (r2 >= 0) goto L_0x0318
            float r2 = r0.D
            int r5 = r16.y()
            float r5 = (float) r5
            float r2 = r2 * r5
            int r5 = r16.getWidth()
            float r5 = (float) r5
            int r2 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r2 < 0) goto L_0x0318
        L_0x0175:
            r0.l(r3)
            android.graphics.PointF r2 = r0.b0
            r2.set(r8, r11)
            android.graphics.PointF r2 = r0.G
            android.graphics.PointF r5 = r0.F
            r2.set(r5)
            float r2 = r0.D
            r0.E = r2
            r0.c0 = r7
            goto L_0x0318
        L_0x018c:
            android.graphics.PointF r2 = r0.K
            if (r2 == 0) goto L_0x01b1
            android.graphics.PointF r2 = r0.F
            int r5 = r16.getWidth()
            int r5 = r5 / r10
            float r5 = (float) r5
            float r6 = r0.D
            android.graphics.PointF r7 = r0.K
            float r7 = r7.x
            float r6 = r6 * r7
            float r5 = r5 - r6
            r2.x = r5
            android.graphics.PointF r2 = r0.F
            int r5 = r16.getHeight()
            int r5 = r5 / r10
            float r5 = (float) r5
            float r6 = r0.D
            android.graphics.PointF r7 = r0.K
            float r7 = r7.y
            goto L_0x01d5
        L_0x01b1:
            android.graphics.PointF r2 = r0.F
            int r5 = r16.getWidth()
            int r5 = r5 / r10
            float r5 = (float) r5
            float r6 = r0.D
            int r7 = r16.y()
            int r7 = r7 / r10
            float r7 = (float) r7
            float r6 = r6 * r7
            float r5 = r5 - r6
            r2.x = r5
            android.graphics.PointF r2 = r0.F
            int r5 = r16.getHeight()
            int r5 = r5 / r10
            float r5 = (float) r5
            float r6 = r0.D
            int r7 = r16.x()
            int r7 = r7 / r10
            float r7 = (float) r7
        L_0x01d5:
            float r6 = r6 * r7
            float r5 = r5 - r6
            r2.y = r5
            goto L_0x0318
        L_0x01db:
            boolean r5 = r0.Q
            if (r5 == 0) goto L_0x031d
            android.graphics.PointF r2 = r0.i0
            float r2 = r2.y
            float r5 = r17.getY()
            float r2 = r2 - r5
            float r2 = java.lang.Math.abs(r2)
            float r2 = r2 * r9
            float r5 = r0.d0
            float r2 = r2 + r5
            float r5 = r0.e0
            r7 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r5 != 0) goto L_0x01fa
            r0.e0 = r2
        L_0x01fa:
            float r5 = r17.getY()
            android.graphics.PointF r7 = r0.g0
            float r8 = r7.y
            int r5 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r5 <= 0) goto L_0x0208
            r5 = r3
            goto L_0x0209
        L_0x0208:
            r5 = 0
        L_0x0209:
            float r8 = r17.getY()
            r7.set(r6, r8)
            float r7 = r0.e0
            float r7 = r2 / r7
            r8 = 1065353216(0x3f800000, float:1.0)
            float r7 = r8 - r7
            float r7 = java.lang.Math.abs(r7)
            r9 = 1056964608(0x3f000000, float:0.5)
            float r7 = r7 * r9
            r9 = 1022739087(0x3cf5c28f, float:0.03)
            int r9 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r9 > 0) goto L_0x022a
            boolean r9 = r0.f0
            if (r9 == 0) goto L_0x0315
        L_0x022a:
            r0.f0 = r3
            float r9 = r0.e0
            int r9 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r9 <= 0) goto L_0x0237
            if (r5 == 0) goto L_0x0236
            float r8 = r8 + r7
            goto L_0x0237
        L_0x0236:
            float r8 = r8 - r7
        L_0x0237:
            float r5 = r0.D
            double r11 = (double) r5
            float r5 = r16.q()
            float r7 = r0.f7999o
            float r9 = r0.D
            float r9 = r9 * r8
            float r7 = java.lang.Math.min(r7, r9)
            float r5 = java.lang.Math.max(r5, r7)
            r0.D = r5
            boolean r7 = r0.x
            if (r7 == 0) goto L_0x02c8
            android.graphics.PointF r7 = r0.b0
            float r8 = r7.x
            android.graphics.PointF r9 = r0.G
            float r13 = r9.x
            float r13 = r8 - r13
            float r7 = r7.y
            float r9 = r9.y
            float r9 = r7 - r9
            float r14 = r0.E
            float r5 = r5 / r14
            float r13 = r13 * r5
            float r5 = r5 * r9
            android.graphics.PointF r9 = r0.F
            float r8 = r8 - r13
            r9.x = r8
            float r7 = r7 - r5
            r9.y = r7
            int r5 = r16.x()
            double r7 = (double) r5
            double r7 = r7 * r11
            int r5 = r16.getHeight()
            double r13 = (double) r5
            int r5 = (r7 > r13 ? 1 : (r7 == r13 ? 0 : -1))
            if (r5 >= 0) goto L_0x028e
            float r5 = r0.D
            int r7 = r16.x()
            float r7 = (float) r7
            float r5 = r5 * r7
            int r7 = r16.getHeight()
            float r7 = (float) r7
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r5 >= 0) goto L_0x02ae
        L_0x028e:
            int r5 = r16.y()
            double r7 = (double) r5
            double r11 = r11 * r7
            int r5 = r16.getWidth()
            double r7 = (double) r5
            int r5 = (r11 > r7 ? 1 : (r11 == r7 ? 0 : -1))
            if (r5 >= 0) goto L_0x0315
            float r5 = r0.D
            int r7 = r16.y()
            float r7 = (float) r7
            float r5 = r5 * r7
            int r7 = r16.getWidth()
            float r7 = (float) r7
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r5 < 0) goto L_0x0315
        L_0x02ae:
            r0.l(r3)
            android.graphics.PointF r2 = r0.b0
            android.graphics.PointF r5 = r0.h0
            android.graphics.PointF r5 = r0.B(r5)
            r2.set(r5)
            android.graphics.PointF r2 = r0.G
            android.graphics.PointF r5 = r0.F
            r2.set(r5)
            float r2 = r0.D
            r0.E = r2
            goto L_0x0316
        L_0x02c8:
            android.graphics.PointF r5 = r0.K
            if (r5 == 0) goto L_0x02ed
            android.graphics.PointF r5 = r0.F
            int r6 = r16.getWidth()
            int r6 = r6 / r10
            float r6 = (float) r6
            float r7 = r0.D
            android.graphics.PointF r8 = r0.K
            float r8 = r8.x
            float r7 = r7 * r8
            float r6 = r6 - r7
            r5.x = r6
            android.graphics.PointF r5 = r0.F
            int r6 = r16.getHeight()
            int r6 = r6 / r10
            float r6 = (float) r6
            float r7 = r0.D
            android.graphics.PointF r8 = r0.K
            float r8 = r8.y
            goto L_0x0311
        L_0x02ed:
            android.graphics.PointF r5 = r0.F
            int r6 = r16.getWidth()
            int r6 = r6 / r10
            float r6 = (float) r6
            float r7 = r0.D
            int r8 = r16.y()
            int r8 = r8 / r10
            float r8 = (float) r8
            float r7 = r7 * r8
            float r6 = r6 - r7
            r5.x = r6
            android.graphics.PointF r5 = r0.F
            int r6 = r16.getHeight()
            int r6 = r6 / r10
            float r6 = (float) r6
            float r7 = r0.D
            int r8 = r16.x()
            int r8 = r8 / r10
            float r8 = (float) r8
        L_0x0311:
            float r7 = r7 * r8
            float r6 = r6 - r7
            r5.y = r6
        L_0x0315:
            r6 = r2
        L_0x0316:
            r0.e0 = r6
        L_0x0318:
            r0.l(r3)
            goto L_0x03e9
        L_0x031d:
            boolean r5 = r0.O
            if (r5 != 0) goto L_0x03f0
            float r5 = r17.getX()
            android.graphics.PointF r6 = r0.b0
            float r6 = r6.x
            float r5 = r5 - r6
            float r5 = java.lang.Math.abs(r5)
            float r6 = r17.getY()
            android.graphics.PointF r7 = r0.b0
            float r7 = r7.y
            float r6 = r6 - r7
            float r6 = java.lang.Math.abs(r6)
            float r7 = r0.x0
            float r7 = r7 * r2
            int r2 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r2 > 0) goto L_0x034a
            int r8 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r8 > 0) goto L_0x034a
            boolean r8 = r0.P
            if (r8 == 0) goto L_0x03f0
        L_0x034a:
            android.graphics.PointF r8 = r0.F
            android.graphics.PointF r9 = r0.G
            float r9 = r9.x
            float r11 = r17.getX()
            android.graphics.PointF r12 = r0.b0
            float r12 = r12.x
            float r11 = r11 - r12
            float r11 = r11 + r9
            r8.x = r11
            android.graphics.PointF r8 = r0.F
            android.graphics.PointF r9 = r0.G
            float r9 = r9.y
            float r11 = r17.getY()
            android.graphics.PointF r12 = r0.b0
            float r12 = r12.y
            float r11 = r11 - r12
            float r11 = r11 + r9
            r8.y = r11
            android.graphics.PointF r8 = r0.F
            float r9 = r8.x
            float r8 = r8.y
            r0.l(r3)
            android.graphics.PointF r11 = r0.F
            float r12 = r11.x
            int r9 = (r9 > r12 ? 1 : (r9 == r12 ? 0 : -1))
            if (r9 == 0) goto L_0x0381
            r9 = r3
            goto L_0x0382
        L_0x0381:
            r9 = 0
        L_0x0382:
            float r11 = r11.y
            int r8 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r8 == 0) goto L_0x038a
            r11 = r3
            goto L_0x038b
        L_0x038a:
            r11 = 0
        L_0x038b:
            if (r9 == 0) goto L_0x0397
            int r12 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r12 <= 0) goto L_0x0397
            boolean r12 = r0.P
            if (r12 != 0) goto L_0x0397
            r12 = r3
            goto L_0x0398
        L_0x0397:
            r12 = 0
        L_0x0398:
            if (r11 == 0) goto L_0x03a4
            int r5 = (r6 > r5 ? 1 : (r6 == r5 ? 0 : -1))
            if (r5 <= 0) goto L_0x03a4
            boolean r5 = r0.P
            if (r5 != 0) goto L_0x03a4
            r5 = r3
            goto L_0x03a5
        L_0x03a4:
            r5 = 0
        L_0x03a5:
            if (r8 != 0) goto L_0x03b0
            r8 = 1077936128(0x40400000, float:3.0)
            float r8 = r8 * r7
            int r8 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r8 <= 0) goto L_0x03b0
            r8 = r3
            goto L_0x03b1
        L_0x03b0:
            r8 = 0
        L_0x03b1:
            if (r12 != 0) goto L_0x03c2
            if (r5 != 0) goto L_0x03c2
            if (r9 == 0) goto L_0x03bf
            if (r11 == 0) goto L_0x03bf
            if (r8 != 0) goto L_0x03bf
            boolean r5 = r0.P
            if (r5 == 0) goto L_0x03c2
        L_0x03bf:
            r0.P = r3
            goto L_0x03c9
        L_0x03c2:
            if (r2 > 0) goto L_0x03cb
            int r2 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r2 <= 0) goto L_0x03c9
            goto L_0x03cb
        L_0x03c9:
            r2 = 0
            goto L_0x03d6
        L_0x03cb:
            r2 = 0
            r0.R = r2
            android.os.Handler r5 = r0.p0
            r5.removeMessages(r3)
            r0.v(r2)
        L_0x03d6:
            boolean r5 = r0.x
            if (r5 != 0) goto L_0x03e9
            android.graphics.PointF r5 = r0.F
            android.graphics.PointF r6 = r0.G
            float r7 = r6.x
            r5.x = r7
            float r6 = r6.y
            r5.y = r6
            r0.v(r2)
        L_0x03e9:
            boolean r2 = r0.w
            r0.u(r2)
            r2 = r3
            goto L_0x03f1
        L_0x03f0:
            r2 = 0
        L_0x03f1:
            if (r2 == 0) goto L_0x03fd
            android.os.Handler r2 = r0.p0
            r2.removeMessages(r3)
            r16.invalidate()
            goto L_0x0470
        L_0x03fd:
            r2 = 0
            goto L_0x0471
        L_0x0400:
            android.os.Handler r2 = r0.p0
            r2.removeMessages(r3)
            boolean r2 = r0.Q
            if (r2 == 0) goto L_0x0417
            r2 = 0
            r0.Q = r2
            boolean r2 = r0.f0
            if (r2 != 0) goto L_0x0417
            android.graphics.PointF r2 = r0.h0
            android.graphics.PointF r5 = r0.b0
            r0.j(r2, r5)
        L_0x0417:
            int r2 = r0.R
            if (r2 <= 0) goto L_0x0467
            boolean r2 = r0.O
            if (r2 != 0) goto L_0x0423
            boolean r5 = r0.P
            if (r5 == 0) goto L_0x0467
        L_0x0423:
            if (r2 == 0) goto L_0x0453
            if (r7 != r10) goto L_0x0453
            r0.P = r3
            android.graphics.PointF r2 = r0.G
            android.graphics.PointF r5 = r0.F
            float r6 = r5.x
            float r5 = r5.y
            r2.set(r6, r5)
            int r2 = r17.getActionIndex()
            if (r2 != r3) goto L_0x0446
            android.graphics.PointF r2 = r0.b0
            r5 = 0
            float r6 = r1.getX(r5)
            float r8 = r1.getY(r5)
            goto L_0x0450
        L_0x0446:
            android.graphics.PointF r2 = r0.b0
            float r6 = r1.getX(r3)
            float r8 = r1.getY(r3)
        L_0x0450:
            r2.set(r6, r8)
        L_0x0453:
            r2 = 3
            if (r7 >= r2) goto L_0x045a
            r2 = 0
            r0.O = r2
            goto L_0x045b
        L_0x045a:
            r2 = 0
        L_0x045b:
            if (r7 >= r10) goto L_0x0461
            r0.P = r2
            r0.R = r2
        L_0x0461:
            r0.u(r3)
            r5 = r2
            goto L_0x04f5
        L_0x0467:
            r2 = 0
            if (r7 != r3) goto L_0x0470
            r0.O = r2
            r0.P = r2
            r0.R = r2
        L_0x0470:
            r2 = r3
        L_0x0471:
            r5 = 0
            goto L_0x04f6
        L_0x0474:
            r0.j0 = r2
            r0.v(r3)
            int r2 = r0.R
            int r2 = java.lang.Math.max(r2, r7)
            r0.R = r2
            if (r7 < r10) goto L_0x04d1
            boolean r2 = r0.y
            if (r2 == 0) goto L_0x04c8
            r2 = 0
            float r5 = r1.getX(r2)
            float r6 = r1.getX(r3)
            float r7 = r1.getY(r2)
            float r2 = r1.getY(r3)
            float r2 = r0.i(r5, r6, r7, r2)
            float r5 = r0.D
            r0.E = r5
            r0.c0 = r2
            android.graphics.PointF r2 = r0.G
            android.graphics.PointF r5 = r0.F
            float r6 = r5.x
            float r5 = r5.y
            r2.set(r6, r5)
            android.graphics.PointF r2 = r0.b0
            r5 = 0
            float r6 = r1.getX(r5)
            float r7 = r1.getX(r3)
            float r7 = r7 + r6
            float r7 = r7 / r9
            float r6 = r1.getY(r5)
            float r8 = r1.getY(r3)
            float r8 = r8 + r6
            float r8 = r8 / r9
            r2.set(r7, r8)
            goto L_0x04cb
        L_0x04c8:
            r5 = 0
            r0.R = r5
        L_0x04cb:
            android.os.Handler r2 = r0.p0
            r2.removeMessages(r3)
            goto L_0x04f5
        L_0x04d1:
            r5 = 0
            boolean r2 = r0.Q
            if (r2 != 0) goto L_0x04f5
            android.graphics.PointF r2 = r0.G
            android.graphics.PointF r6 = r0.F
            float r7 = r6.x
            float r6 = r6.y
            r2.set(r7, r6)
            android.graphics.PointF r2 = r0.b0
            float r6 = r17.getX()
            float r7 = r17.getY()
            r2.set(r6, r7)
            android.os.Handler r2 = r0.p0
            r6 = 600(0x258, double:2.964E-321)
            r2.sendEmptyMessageDelayed(r3, r6)
        L_0x04f5:
            r2 = r3
        L_0x04f6:
            android.graphics.PointF r6 = r0.H
            r0.z(r4, r6, r10)
            if (r2 != 0) goto L_0x0505
            boolean r1 = super.onTouchEvent(r17)
            if (r1 == 0) goto L_0x0504
            goto L_0x0505
        L_0x0504:
            r3 = r5
        L_0x0505:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: es.voghdev.pdfviewpager.library.subscaleview.SubsamplingScaleImageView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final boolean p() {
        boolean z2 = true;
        if (this.f7992h != null && !this.f7993i) {
            return true;
        }
        Map<Integer, List<h>> map = this.f7997m;
        if (map == null) {
            return false;
        }
        for (Map.Entry next : map.entrySet()) {
            if (((Integer) next.getKey()).intValue() == this.f7996l) {
                for (h hVar : (List) next.getValue()) {
                    if (hVar.d || hVar.c == null) {
                        z2 = false;
                    }
                }
            }
        }
        return z2;
    }

    public final float q() {
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int i2 = this.s;
        if (i2 == 2 || i2 == 4) {
            return Math.max(((float) (getWidth() - paddingRight)) / ((float) y()), ((float) (getHeight() - paddingTop)) / ((float) x()));
        }
        if (i2 == 3) {
            float f2 = this.f8000p;
            if (f2 > 0.0f) {
                return f2;
            }
        }
        return Math.min(((float) (getWidth() - paddingRight)) / ((float) y()), ((float) (getHeight() - paddingTop)) / ((float) x()));
    }

    public final synchronized void r(Bitmap bitmap, int i2, boolean z2) {
        j.a.a.a.e.d dVar;
        int i3 = this.L;
        if (i3 > 0 && this.M > 0 && !(i3 == bitmap.getWidth() && this.M == bitmap.getHeight())) {
            w(false);
        }
        Bitmap bitmap2 = this.f7992h;
        if (bitmap2 != null && !this.f7994j) {
            bitmap2.recycle();
        }
        if (!(this.f7992h == null || !this.f7994j || (dVar = this.m0) == null)) {
            dVar.d();
        }
        this.f7993i = false;
        this.f7994j = z2;
        this.f7992h = bitmap;
        this.L = bitmap.getWidth();
        this.M = bitmap.getHeight();
        this.N = i2;
        boolean h2 = h();
        boolean g2 = g();
        if (h2 || g2) {
            invalidate();
            requestLayout();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001c, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void s(android.graphics.Bitmap r2) {
        /*
            r1 = this;
            monitor-enter(r1)
            android.graphics.Bitmap r0 = r1.f7992h     // Catch:{ all -> 0x0022 }
            if (r0 != 0) goto L_0x001d
            boolean r0 = r1.l0     // Catch:{ all -> 0x0022 }
            if (r0 == 0) goto L_0x000a
            goto L_0x001d
        L_0x000a:
            r1.f7992h = r2     // Catch:{ all -> 0x0022 }
            r2 = 1
            r1.f7993i = r2     // Catch:{ all -> 0x0022 }
            boolean r2 = r1.h()     // Catch:{ all -> 0x0022 }
            if (r2 == 0) goto L_0x001b
            r1.invalidate()     // Catch:{ all -> 0x0022 }
            r1.requestLayout()     // Catch:{ all -> 0x0022 }
        L_0x001b:
            monitor-exit(r1)
            return
        L_0x001d:
            r2.recycle()     // Catch:{ all -> 0x0022 }
            monitor-exit(r1)
            return
        L_0x0022:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: es.voghdev.pdfviewpager.library.subscaleview.SubsamplingScaleImageView.s(android.graphics.Bitmap):void");
    }

    public final void setBitmapDecoderClass(@NonNull Class<? extends j.a.a.a.e.g.c> cls) {
        if (cls != null) {
            this.W = new j.a.a.a.e.g.a(cls);
            return;
        }
        throw new IllegalArgumentException("Decoder class cannot be set to null");
    }

    public final void setBitmapDecoderFactory(@NonNull j.a.a.a.e.g.b<? extends j.a.a.a.e.g.c> bVar) {
        if (bVar != null) {
            this.W = bVar;
            return;
        }
        throw new IllegalArgumentException("Decoder factory cannot be set to null");
    }

    public final void setDoubleTapZoomDpi(int i2) {
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        setDoubleTapZoomScale(((displayMetrics.xdpi + displayMetrics.ydpi) / 2.0f) / ((float) i2));
    }

    public final void setDoubleTapZoomDuration(int i2) {
        this.C = Math.max(0, i2);
    }

    public final void setDoubleTapZoomScale(float f2) {
        this.A = f2;
    }

    public final void setDoubleTapZoomStyle(int i2) {
        if (j.a.a.a.e.f.c.contains(Integer.valueOf(i2))) {
            this.B = i2;
            return;
        }
        throw new IllegalArgumentException(b.e.a.a.a.g("Invalid zoom style: ", i2));
    }

    public void setEagerLoadingEnabled(boolean z2) {
        this.w = z2;
    }

    public void setExecutor(@NonNull Executor executor) {
        Objects.requireNonNull(executor, "Executor must not be null");
        this.v = executor;
    }

    public final void setImage(@NonNull j.a.a.a.e.a aVar) {
        Objects.requireNonNull(aVar, "imageSource must not be null");
        w(true);
        Bitmap bitmap = aVar.f8076b;
        if (bitmap != null) {
            r(bitmap, 0, aVar.f8078g);
            return;
        }
        Uri uri = aVar.a;
        this.f7995k = uri;
        if (uri == null && aVar.c != null) {
            StringBuilder y2 = b.e.a.a.a.y("android.resource://");
            y2.append(getContext().getPackageName());
            y2.append("/");
            y2.append(aVar.c);
            this.f7995k = Uri.parse(y2.toString());
        }
        if (!aVar.d) {
            new f(this, getContext(), this.W, this.f7995k, false).executeOnExecutor(this.v, new Void[0]);
            return;
        }
        new j(this, getContext(), this.a0, this.f7995k).executeOnExecutor(this.v, new Void[0]);
    }

    public final void setMaxScale(float f2) {
        this.f7999o = f2;
    }

    public void setMaxTileSize(int i2) {
        this.t = i2;
        this.u = i2;
    }

    public final void setMaximumDpi(int i2) {
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        setMinScale(((displayMetrics.xdpi + displayMetrics.ydpi) / 2.0f) / ((float) i2));
    }

    public final void setMinScale(float f2) {
        this.f8000p = f2;
    }

    public final void setMinimumDpi(int i2) {
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        setMaxScale(((displayMetrics.xdpi + displayMetrics.ydpi) / 2.0f) / ((float) i2));
    }

    public final void setMinimumScaleType(int i2) {
        if (j.a.a.a.e.f.f.contains(Integer.valueOf(i2))) {
            this.s = i2;
            if (this.k0) {
                l(true);
                invalidate();
                return;
            }
            return;
        }
        throw new IllegalArgumentException(b.e.a.a.a.g("Invalid scale type: ", i2));
    }

    public void setMinimumTileDpi(int i2) {
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        this.f8001q = (int) Math.min((displayMetrics.xdpi + displayMetrics.ydpi) / 2.0f, (float) i2);
        if (this.k0) {
            w(false);
            invalidate();
        }
    }

    public void setOnImageEventListener(j.a.a.a.e.d dVar) {
        this.m0 = dVar;
    }

    public void setOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.o0 = onLongClickListener;
    }

    public void setOnStateChangedListener(j.a.a.a.e.e eVar) {
        this.n0 = eVar;
    }

    public final void setOrientation(int i2) {
        if (j.a.a.a.e.f.f8083b.contains(Integer.valueOf(i2))) {
            this.f7998n = i2;
            w(false);
            invalidate();
            requestLayout();
            return;
        }
        throw new IllegalArgumentException(b.e.a.a.a.g("Invalid orientation: ", i2));
    }

    public final void setPanEnabled(boolean z2) {
        PointF pointF;
        this.x = z2;
        if (!z2 && (pointF = this.F) != null) {
            pointF.x = ((float) (getWidth() / 2)) - (this.D * ((float) (y() / 2)));
            this.F.y = ((float) (getHeight() / 2)) - (this.D * ((float) (x() / 2)));
            if (this.k0) {
                u(true);
                invalidate();
            }
        }
    }

    public final void setPanLimit(int i2) {
        if (j.a.a.a.e.f.f8084e.contains(Integer.valueOf(i2))) {
            this.r = i2;
            if (this.k0) {
                l(true);
                invalidate();
                return;
            }
            return;
        }
        throw new IllegalArgumentException(b.e.a.a.a.g("Invalid pan limit: ", i2));
    }

    public final void setQuickScaleEnabled(boolean z2) {
        this.z = z2;
    }

    public final void setRegionDecoderClass(@NonNull Class<? extends j.a.a.a.e.g.d> cls) {
        if (cls != null) {
            this.a0 = new j.a.a.a.e.g.a(cls);
            return;
        }
        throw new IllegalArgumentException("Decoder class cannot be set to null");
    }

    public final void setRegionDecoderFactory(@NonNull j.a.a.a.e.g.b<? extends j.a.a.a.e.g.d> bVar) {
        if (bVar != null) {
            this.a0 = bVar;
            return;
        }
        throw new IllegalArgumentException("Decoder factory cannot be set to null");
    }

    public final void setTileBackgroundColor(int i2) {
        if (Color.alpha(i2) == 0) {
            this.r0 = null;
        } else {
            Paint paint = new Paint();
            this.r0 = paint;
            paint.setStyle(Paint.Style.FILL);
            this.r0.setColor(i2);
        }
        invalidate();
    }

    public final void setZoomEnabled(boolean z2) {
        this.y = z2;
    }

    public final void t() {
        Float f2;
        if (getWidth() != 0 && getHeight() != 0 && this.L > 0 && this.M > 0) {
            if (!(this.J == null || (f2 = this.I) == null)) {
                this.D = f2.floatValue();
                if (this.F == null) {
                    this.F = new PointF();
                }
                this.F.x = ((float) (getWidth() / 2)) - (this.D * this.J.x);
                this.F.y = ((float) (getHeight() / 2)) - (this.D * this.J.y);
                this.J = null;
                this.I = null;
                l(true);
                u(true);
            }
            l(false);
        }
    }

    public final void u(boolean z2) {
        if (this.U != null && this.f7997m != null) {
            int min = Math.min(this.f7996l, f(this.D));
            for (Map.Entry<Integer, List<h>> value : this.f7997m.entrySet()) {
                for (h hVar : (List) value.getValue()) {
                    int i2 = hVar.f8020b;
                    if (i2 < min || (i2 > min && i2 != this.f7996l)) {
                        hVar.f8021e = false;
                        Bitmap bitmap = hVar.c;
                        if (bitmap != null) {
                            bitmap.recycle();
                            hVar.c = null;
                        }
                    }
                    int i3 = hVar.f8020b;
                    if (i3 == min) {
                        float G2 = G(0.0f);
                        float G3 = G((float) getWidth());
                        float H2 = H(0.0f);
                        float H3 = H((float) getHeight());
                        Rect rect = hVar.a;
                        if (G2 <= ((float) rect.right) && ((float) rect.left) <= G3 && H2 <= ((float) rect.bottom) && ((float) rect.top) <= H3) {
                            hVar.f8021e = true;
                            if (!hVar.d && hVar.c == null && z2) {
                                new i(this, this.U, hVar).executeOnExecutor(this.v, new Void[0]);
                            }
                        } else if (hVar.f8020b != this.f7996l) {
                            hVar.f8021e = false;
                            Bitmap bitmap2 = hVar.c;
                            if (bitmap2 != null) {
                                bitmap2.recycle();
                                hVar.c = null;
                            }
                        }
                    } else if (i3 == this.f7996l) {
                        hVar.f8021e = true;
                    }
                }
            }
        }
    }

    public final void v(boolean z2) {
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(z2);
        }
    }

    /* JADX INFO: finally extract failed */
    public final void w(boolean z2) {
        j.a.a.a.e.d dVar;
        this.D = 0.0f;
        this.E = 0.0f;
        this.F = null;
        this.G = null;
        this.H = null;
        this.I = Float.valueOf(0.0f);
        this.J = null;
        this.K = null;
        this.O = false;
        this.P = false;
        this.Q = false;
        this.R = 0;
        this.f7996l = 0;
        this.b0 = null;
        this.c0 = 0.0f;
        this.e0 = 0.0f;
        this.f0 = false;
        this.h0 = null;
        this.g0 = null;
        this.i0 = null;
        this.j0 = null;
        this.s0 = null;
        this.t0 = null;
        this.u0 = null;
        if (z2) {
            this.f7995k = null;
            this.V.writeLock().lock();
            try {
                j.a.a.a.e.g.d dVar2 = this.U;
                if (dVar2 != null) {
                    dVar2.recycle();
                    this.U = null;
                }
                this.V.writeLock().unlock();
                Bitmap bitmap = this.f7992h;
                if (bitmap != null && !this.f7994j) {
                    bitmap.recycle();
                }
                if (!(this.f7992h == null || !this.f7994j || (dVar = this.m0) == null)) {
                    dVar.d();
                }
                this.L = 0;
                this.M = 0;
                this.N = 0;
                this.k0 = false;
                this.l0 = false;
                this.f7992h = null;
                this.f7993i = false;
                this.f7994j = false;
            } catch (Throwable th) {
                this.V.writeLock().unlock();
                throw th;
            }
        }
        Map<Integer, List<h>> map = this.f7997m;
        if (map != null) {
            for (Map.Entry<Integer, List<h>> value : map.entrySet()) {
                for (h hVar : (List) value.getValue()) {
                    hVar.f8021e = false;
                    Bitmap bitmap2 = hVar.c;
                    if (bitmap2 != null) {
                        bitmap2.recycle();
                        hVar.c = null;
                    }
                }
            }
            this.f7997m = null;
        }
        setGestureDetector(getContext());
    }

    public final int x() {
        int requiredRotation = getRequiredRotation();
        return (requiredRotation == 90 || requiredRotation == 270) ? this.L : this.M;
    }

    public final int y() {
        int requiredRotation = getRequiredRotation();
        return (requiredRotation == 90 || requiredRotation == 270) ? this.M : this.L;
    }

    public final void z(float f2, PointF pointF, int i2) {
        j.a.a.a.e.e eVar = this.n0;
        if (eVar != null) {
            float f3 = this.D;
            if (f3 != f2) {
                eVar.a(f3, i2);
            }
        }
        if (this.n0 != null && !this.F.equals(pointF)) {
            this.n0.b(getCenter(), i2);
        }
    }
}
