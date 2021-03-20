package b.i.a;

import android.annotation.TargetApi;
import android.graphics.Canvas;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.DashPathEffect;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.util.Log;
import androidx.core.view.ViewCompat;
import b.i.a.b;
import b.i.a.f;
import com.google.android.material.shadow.ShadowDrawableWrapper;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;

public class g {

    /* renamed from: g  reason: collision with root package name */
    public static HashSet<String> f1222g;
    public Canvas a;

    /* renamed from: b  reason: collision with root package name */
    public f f1223b;
    public h c;
    public Stack<h> d;

    /* renamed from: e  reason: collision with root package name */
    public Stack<f.i0> f1224e;
    public Stack<Matrix> f;

    public class b implements f.w {
        public List<c> a = new ArrayList();

        /* renamed from: b  reason: collision with root package name */
        public float f1225b;
        public float c;
        public c d = null;

        /* renamed from: e  reason: collision with root package name */
        public boolean f1226e = false;
        public boolean f = true;

        /* renamed from: g  reason: collision with root package name */
        public int f1227g = -1;

        /* renamed from: h  reason: collision with root package name */
        public boolean f1228h;

        public b(f.v vVar) {
            if (vVar != null) {
                vVar.h(this);
                if (this.f1228h) {
                    this.d.b(this.a.get(this.f1227g));
                    this.a.set(this.f1227g, this.d);
                    this.f1228h = false;
                }
                c cVar = this.d;
                if (cVar != null) {
                    this.a.add(cVar);
                }
            }
        }

        public void a(float f2, float f3) {
            if (this.f1228h) {
                this.d.b(this.a.get(this.f1227g));
                this.a.set(this.f1227g, this.d);
                this.f1228h = false;
            }
            c cVar = this.d;
            if (cVar != null) {
                this.a.add(cVar);
            }
            this.f1225b = f2;
            this.c = f3;
            this.d = new c(g.this, f2, f3, 0.0f, 0.0f);
            this.f1227g = this.a.size();
        }

        public void b(float f2, float f3, float f4, float f5, float f6, float f7) {
            if (this.f || this.f1226e) {
                this.d.a(f2, f3);
                this.a.add(this.d);
                this.f1226e = false;
            }
            this.d = new c(g.this, f6, f7, f6 - f4, f7 - f5);
            this.f1228h = false;
        }

        public void c(float f2, float f3, float f4, boolean z, boolean z2, float f5, float f6) {
            this.f1226e = true;
            this.f = false;
            c cVar = this.d;
            g.a(cVar.a, cVar.f1230b, f2, f3, f4, z, z2, f5, f6, this);
            this.f = true;
            this.f1228h = false;
        }

        public void close() {
            this.a.add(this.d);
            e(this.f1225b, this.c);
            this.f1228h = true;
        }

        public void d(float f2, float f3, float f4, float f5) {
            this.d.a(f2, f3);
            this.a.add(this.d);
            this.d = new c(g.this, f4, f5, f4 - f2, f5 - f3);
            this.f1228h = false;
        }

        public void e(float f2, float f3) {
            this.d.a(f2, f3);
            this.a.add(this.d);
            g gVar = g.this;
            c cVar = this.d;
            this.d = new c(gVar, f2, f3, f2 - cVar.a, f3 - cVar.f1230b);
            this.f1228h = false;
        }
    }

    public class c {
        public float a;

        /* renamed from: b  reason: collision with root package name */
        public float f1230b;
        public float c = 0.0f;
        public float d = 0.0f;

        /* renamed from: e  reason: collision with root package name */
        public boolean f1231e = false;

        public c(g gVar, float f, float f2, float f3, float f4) {
            this.a = f;
            this.f1230b = f2;
            double sqrt = Math.sqrt((double) ((f4 * f4) + (f3 * f3)));
            if (sqrt != ShadowDrawableWrapper.COS_45) {
                this.c = (float) (((double) f3) / sqrt);
                this.d = (float) (((double) f4) / sqrt);
            }
        }

        public void a(float f, float f2) {
            float f3 = f - this.a;
            float f4 = f2 - this.f1230b;
            double sqrt = Math.sqrt((double) ((f4 * f4) + (f3 * f3)));
            if (sqrt != ShadowDrawableWrapper.COS_45) {
                f3 = (float) (((double) f3) / sqrt);
                f4 = (float) (((double) f4) / sqrt);
            }
            float f5 = this.c;
            if (f3 == (-f5) && f4 == (-this.d)) {
                this.f1231e = true;
                this.c = -f4;
            } else {
                this.c = f5 + f3;
                f3 = this.d + f4;
            }
            this.d = f3;
        }

        public void b(c cVar) {
            float f = cVar.c;
            float f2 = this.c;
            if (f == (-f2)) {
                float f3 = cVar.d;
                if (f3 == (-this.d)) {
                    this.f1231e = true;
                    this.c = -f3;
                    this.d = cVar.c;
                    return;
                }
            }
            this.c = f2 + f;
            this.d += cVar.d;
        }

        public String toString() {
            StringBuilder y = b.e.a.a.a.y("(");
            y.append(this.a);
            y.append(",");
            y.append(this.f1230b);
            y.append(" ");
            y.append(this.c);
            y.append(",");
            y.append(this.d);
            y.append(")");
            return y.toString();
        }
    }

    public class d implements f.w {
        public Path a = new Path();

        /* renamed from: b  reason: collision with root package name */
        public float f1232b;
        public float c;

        public d(g gVar, f.v vVar) {
            if (vVar != null) {
                vVar.h(this);
            }
        }

        public void a(float f, float f2) {
            this.a.moveTo(f, f2);
            this.f1232b = f;
            this.c = f2;
        }

        public void b(float f, float f2, float f3, float f4, float f5, float f6) {
            this.a.cubicTo(f, f2, f3, f4, f5, f6);
            this.f1232b = f5;
            this.c = f6;
        }

        public void c(float f, float f2, float f3, boolean z, boolean z2, float f4, float f5) {
            g.a(this.f1232b, this.c, f, f2, f3, z, z2, f4, f5, this);
            this.f1232b = f4;
            this.c = f5;
        }

        public void close() {
            this.a.close();
        }

        public void d(float f, float f2, float f3, float f4) {
            this.a.quadTo(f, f2, f3, f4);
            this.f1232b = f3;
            this.c = f4;
        }

        public void e(float f, float f2) {
            this.a.lineTo(f, f2);
            this.f1232b = f;
            this.c = f2;
        }
    }

    public class e extends f {
        public Path d;

        public e(Path path, float f, float f2) {
            super(f, f2);
            this.d = path;
        }

        public void b(String str) {
            if (g.this.Z()) {
                g gVar = g.this;
                h hVar = gVar.c;
                if (hVar.f1236b) {
                    gVar.a.drawTextOnPath(str, this.d, this.a, this.f1234b, hVar.d);
                }
                g gVar2 = g.this;
                h hVar2 = gVar2.c;
                if (hVar2.c) {
                    gVar2.a.drawTextOnPath(str, this.d, this.a, this.f1234b, hVar2.f1237e);
                }
            }
            this.a = g.this.c.d.measureText(str) + this.a;
        }
    }

    public class f extends j {
        public float a;

        /* renamed from: b  reason: collision with root package name */
        public float f1234b;

        public f(float f, float f2) {
            super(g.this, (a) null);
            this.a = f;
            this.f1234b = f2;
        }

        public void b(String str) {
            if (g.this.Z()) {
                g gVar = g.this;
                h hVar = gVar.c;
                if (hVar.f1236b) {
                    gVar.a.drawText(str, this.a, this.f1234b, hVar.d);
                }
                g gVar2 = g.this;
                h hVar2 = gVar2.c;
                if (hVar2.c) {
                    gVar2.a.drawText(str, this.a, this.f1234b, hVar2.f1237e);
                }
            }
            this.a = g.this.c.d.measureText(str) + this.a;
        }
    }

    /* renamed from: b.i.a.g$g  reason: collision with other inner class name */
    public class C0044g extends j {
        public float a;

        /* renamed from: b  reason: collision with root package name */
        public float f1235b;
        public Path c;

        public C0044g(float f, float f2, Path path) {
            super(g.this, (a) null);
            this.a = f;
            this.f1235b = f2;
            this.c = path;
        }

        public boolean a(f.x0 x0Var) {
            if (!(x0Var instanceof f.y0)) {
                return true;
            }
            g.a0("Using <textPath> elements in a clip path is not supported.", new Object[0]);
            return false;
        }

        public void b(String str) {
            if (g.this.Z()) {
                Path path = new Path();
                g.this.c.d.getTextPath(str, 0, str.length(), this.a, this.f1235b, path);
                this.c.addPath(path);
            }
            this.a = g.this.c.d.measureText(str) + this.a;
        }
    }

    public class h {
        public f.d0 a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f1236b;
        public boolean c;
        public Paint d;

        /* renamed from: e  reason: collision with root package name */
        public Paint f1237e;
        public f.a f;

        /* renamed from: g  reason: collision with root package name */
        public f.a f1238g;

        /* renamed from: h  reason: collision with root package name */
        public boolean f1239h;

        public h(g gVar) {
            Paint paint = new Paint();
            this.d = paint;
            paint.setFlags(193);
            this.d.setHinting(0);
            this.d.setStyle(Paint.Style.FILL);
            this.d.setTypeface(Typeface.DEFAULT);
            Paint paint2 = new Paint();
            this.f1237e = paint2;
            paint2.setFlags(193);
            this.f1237e.setHinting(0);
            this.f1237e.setStyle(Paint.Style.STROKE);
            this.f1237e.setTypeface(Typeface.DEFAULT);
            this.a = f.d0.a();
        }

        public h(g gVar, h hVar) {
            this.f1236b = hVar.f1236b;
            this.c = hVar.c;
            this.d = new Paint(hVar.d);
            this.f1237e = new Paint(hVar.f1237e);
            f.a aVar = hVar.f;
            if (aVar != null) {
                this.f = new f.a(aVar);
            }
            f.a aVar2 = hVar.f1238g;
            if (aVar2 != null) {
                this.f1238g = new f.a(aVar2);
            }
            this.f1239h = hVar.f1239h;
            try {
                this.a = (f.d0) hVar.a.clone();
            } catch (CloneNotSupportedException e2) {
                Log.e("SVGAndroidRenderer", "Unexpected clone error", e2);
                this.a = f.d0.a();
            }
        }
    }

    public class i extends j {
        public float a;

        /* renamed from: b  reason: collision with root package name */
        public float f1240b;
        public RectF c = new RectF();

        public i(float f, float f2) {
            super(g.this, (a) null);
            this.a = f;
            this.f1240b = f2;
        }

        public boolean a(f.x0 x0Var) {
            if (!(x0Var instanceof f.y0)) {
                return true;
            }
            f.y0 y0Var = (f.y0) x0Var;
            f.m0 g2 = x0Var.a.g(y0Var.f1215n);
            if (g2 == null) {
                g.q("TextPath path reference '%s' not found", y0Var.f1215n);
                return false;
            }
            f.u uVar = (f.u) g2;
            Path path = new d(g.this, uVar.f1209o).a;
            Matrix matrix = uVar.f1175n;
            if (matrix != null) {
                path.transform(matrix);
            }
            RectF rectF = new RectF();
            path.computeBounds(rectF, true);
            this.c.union(rectF);
            return false;
        }

        public void b(String str) {
            if (g.this.Z()) {
                Rect rect = new Rect();
                g.this.c.d.getTextBounds(str, 0, str.length(), rect);
                RectF rectF = new RectF(rect);
                rectF.offset(this.a, this.f1240b);
                this.c.union(rectF);
            }
            this.a = g.this.c.d.measureText(str) + this.a;
        }
    }

    public abstract class j {
        public j(g gVar, a aVar) {
        }

        public boolean a(f.x0 x0Var) {
            return true;
        }

        public abstract void b(String str);
    }

    public class k extends j {
        public float a = 0.0f;

        public k(a aVar) {
            super(g.this, (a) null);
        }

        public void b(String str) {
            this.a = g.this.c.d.measureText(str) + this.a;
        }
    }

    public g(Canvas canvas, float f2) {
        this.a = canvas;
    }

    public static void a(float f2, float f3, float f4, float f5, float f6, boolean z, boolean z2, float f7, float f8, f.w wVar) {
        float f9 = f6;
        boolean z3 = z2;
        float f10 = f7;
        float f11 = f8;
        if (f2 != f10 || f3 != f11) {
            if (f4 == 0.0f || f5 == 0.0f) {
                wVar.e(f10, f11);
                return;
            }
            float abs = Math.abs(f4);
            float abs2 = Math.abs(f5);
            double radians = Math.toRadians(((double) f9) % 360.0d);
            double cos = Math.cos(radians);
            double sin = Math.sin(radians);
            double d2 = ((double) (f2 - f10)) / 2.0d;
            double d3 = ((double) (f3 - f11)) / 2.0d;
            double d4 = (sin * d3) + (cos * d2);
            double d5 = (d3 * cos) + ((-sin) * d2);
            double d6 = (double) (abs * abs);
            double d7 = (double) (abs2 * abs2);
            double d8 = d4 * d4;
            double d9 = d5 * d5;
            double d10 = (d9 / d7) + (d8 / d6);
            if (d10 > 0.99999d) {
                double sqrt = Math.sqrt(d10) * 1.00001d;
                abs = (float) (((double) abs) * sqrt);
                abs2 = (float) (sqrt * ((double) abs2));
                d6 = (double) (abs * abs);
                d7 = (double) (abs2 * abs2);
            }
            double d11 = z == z3 ? -1.0d : 1.0d;
            double d12 = d6 * d7;
            double d13 = d6 * d9;
            double d14 = d7 * d8;
            double d15 = ((d12 - d13) - d14) / (d13 + d14);
            if (d15 < ShadowDrawableWrapper.COS_45) {
                d15 = 0.0d;
            }
            double sqrt2 = Math.sqrt(d15) * d11;
            double d16 = (double) abs;
            double d17 = (double) abs2;
            double d18 = ((d16 * d5) / d17) * sqrt2;
            float f12 = abs;
            float f13 = abs2;
            double d19 = sqrt2 * (-((d17 * d4) / d16));
            double d20 = d17;
            double d21 = ((cos * d18) - (sin * d19)) + (((double) (f2 + f7)) / 2.0d);
            double d22 = (cos * d19) + (sin * d18) + (((double) (f3 + f8)) / 2.0d);
            double d23 = (d4 - d18) / d16;
            double d24 = (d5 - d19) / d20;
            double d25 = ((-d4) - d18) / d16;
            double d26 = ((-d5) - d19) / d20;
            double d27 = (d24 * d24) + (d23 * d23);
            double acos = Math.acos(d23 / Math.sqrt(d27)) * (d24 < ShadowDrawableWrapper.COS_45 ? -1.0d : 1.0d);
            double sqrt3 = ((d24 * d26) + (d23 * d25)) / Math.sqrt(((d26 * d26) + (d25 * d25)) * d27);
            double acos2 = ((d23 * d26) - (d24 * d25) < ShadowDrawableWrapper.COS_45 ? -1.0d : 1.0d) * (sqrt3 < -1.0d ? 3.141592653589793d : sqrt3 > 1.0d ? ShadowDrawableWrapper.COS_45 : Math.acos(sqrt3));
            if (!z2 && acos2 > ShadowDrawableWrapper.COS_45) {
                acos2 -= 6.283185307179586d;
            } else if (z2 && acos2 < ShadowDrawableWrapper.COS_45) {
                acos2 += 6.283185307179586d;
            }
            double d28 = acos2 % 6.283185307179586d;
            double d29 = acos % 6.283185307179586d;
            int ceil = (int) Math.ceil((Math.abs(d28) * 2.0d) / 3.141592653589793d);
            double d30 = d28 / ((double) ceil);
            double d31 = d30 / 2.0d;
            double sin2 = (Math.sin(d31) * 1.3333333333333333d) / (Math.cos(d31) + 1.0d);
            int i2 = ceil * 6;
            float[] fArr = new float[i2];
            int i3 = 0;
            int i4 = 0;
            while (i3 < ceil) {
                double d32 = (((double) i3) * d30) + d29;
                double cos2 = Math.cos(d32);
                double sin3 = Math.sin(d32);
                int i5 = i4 + 1;
                double d33 = d29;
                fArr[i4] = (float) (cos2 - (sin2 * sin3));
                int i6 = i5 + 1;
                int i7 = ceil;
                fArr[i5] = (float) ((cos2 * sin2) + sin3);
                double d34 = d32 + d30;
                double cos3 = Math.cos(d34);
                double sin4 = Math.sin(d34);
                int i8 = i6 + 1;
                double d35 = d30;
                fArr[i6] = (float) ((sin2 * sin4) + cos3);
                int i9 = i8 + 1;
                fArr[i8] = (float) (sin4 - (sin2 * cos3));
                int i10 = i9 + 1;
                fArr[i9] = (float) cos3;
                i4 = i10 + 1;
                fArr[i10] = (float) sin4;
                i3++;
                d22 = d22;
                i2 = i2;
                d29 = d33;
                ceil = i7;
                d30 = d35;
            }
            int i11 = i2;
            double d36 = d22;
            Matrix matrix = new Matrix();
            matrix.postScale(f12, f13);
            matrix.postRotate(f6);
            matrix.postTranslate((float) d21, (float) d22);
            matrix.mapPoints(fArr);
            fArr[i11 - 2] = f7;
            fArr[i11 - 1] = f8;
            int i12 = i11;
            for (int i13 = 0; i13 < i12; i13 += 6) {
                wVar.b(fArr[i13], fArr[i13 + 1], fArr[i13 + 2], fArr[i13 + 3], fArr[i13 + 4], fArr[i13 + 5]);
            }
        }
    }

    public static void a0(String str, Object... objArr) {
        Log.w("SVGAndroidRenderer", String.format(str, objArr));
    }

    public static int j(float f2) {
        int i2 = (int) (f2 * 256.0f);
        if (i2 < 0) {
            return 0;
        }
        if (i2 > 255) {
            return 255;
        }
        return i2;
    }

    public static int k(int i2, float f2) {
        int i3 = 255;
        int round = Math.round(((float) ((i2 >> 24) & 255)) * f2);
        if (round < 0) {
            i3 = 0;
        } else if (round <= 255) {
            i3 = round;
        }
        return (i2 & ViewCompat.MEASURED_SIZE_MASK) | (i3 << 24);
    }

    public static void q(String str, Object... objArr) {
        Log.e("SVGAndroidRenderer", String.format(str, objArr));
    }

    public final boolean A(f.d0 d0Var, long j2) {
        return (d0Var.f1098h & j2) != 0;
    }

    public final Path B(f.c cVar) {
        f.c cVar2 = cVar;
        f.o oVar = cVar2.f1083o;
        float f2 = 0.0f;
        float d2 = oVar != null ? oVar.d(this) : 0.0f;
        f.o oVar2 = cVar2.f1084p;
        if (oVar2 != null) {
            f2 = oVar2.f(this);
        }
        float b2 = cVar2.f1085q.b(this);
        float f3 = d2 - b2;
        float f4 = f2 - b2;
        float f5 = d2 + b2;
        float f6 = f2 + b2;
        if (cVar2.f1174h == null) {
            float f7 = 2.0f * b2;
            cVar2.f1174h = new f.a(f3, f4, f7, f7);
        }
        float f8 = 0.5522848f * b2;
        Path path = new Path();
        path.moveTo(d2, f4);
        float f9 = d2 + f8;
        float f10 = f2 - f8;
        Path path2 = path;
        path2.cubicTo(f9, f4, f5, f10, f5, f2);
        float f11 = f2 + f8;
        path2.cubicTo(f5, f11, f9, f6, d2, f6);
        float f12 = d2 - f8;
        path2.cubicTo(f12, f6, f3, f11, f3, f2);
        path2.cubicTo(f3, f10, f12, f4, d2, f4);
        path.close();
        return path;
    }

    public final Path C(f.h hVar) {
        f.h hVar2 = hVar;
        f.o oVar = hVar2.f1157o;
        float f2 = 0.0f;
        float d2 = oVar != null ? oVar.d(this) : 0.0f;
        f.o oVar2 = hVar2.f1158p;
        if (oVar2 != null) {
            f2 = oVar2.f(this);
        }
        float d3 = hVar2.f1159q.d(this);
        float f3 = hVar2.r.f(this);
        float f4 = d2 - d3;
        float f5 = f2 - f3;
        float f6 = d2 + d3;
        float f7 = f2 + f3;
        if (hVar2.f1174h == null) {
            hVar2.f1174h = new f.a(f4, f5, d3 * 2.0f, 2.0f * f3);
        }
        float f8 = d3 * 0.5522848f;
        float f9 = 0.5522848f * f3;
        Path path = new Path();
        path.moveTo(d2, f5);
        float f10 = d2 + f8;
        float f11 = f2 - f9;
        Path path2 = path;
        path.cubicTo(f10, f5, f6, f11, f6, f2);
        float f12 = f9 + f2;
        Path path3 = path2;
        path3.cubicTo(f6, f12, f10, f7, d2, f7);
        float f13 = d2 - f8;
        path3.cubicTo(f13, f7, f4, f12, f4, f2);
        path3.cubicTo(f4, f11, f13, f5, d2, f5);
        path2.close();
        return path2;
    }

    public final Path D(f.y yVar) {
        Path path = new Path();
        float[] fArr = yVar.f1214o;
        path.moveTo(fArr[0], fArr[1]);
        int i2 = 2;
        while (true) {
            float[] fArr2 = yVar.f1214o;
            if (i2 >= fArr2.length) {
                break;
            }
            path.lineTo(fArr2[i2], fArr2[i2 + 1]);
            i2 += 2;
        }
        if (yVar instanceof f.z) {
            path.close();
        }
        if (yVar.f1174h == null) {
            yVar.f1174h = c(path);
        }
        return path;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0044  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0054  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00d6  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.graphics.Path E(b.i.a.f.a0 r24) {
        /*
            r23 = this;
            r0 = r23
            r1 = r24
            b.i.a.f$o r2 = r1.s
            r3 = 0
            if (r2 != 0) goto L_0x000f
            b.i.a.f$o r4 = r1.t
            if (r4 != 0) goto L_0x000f
            r2 = r3
            goto L_0x0020
        L_0x000f:
            if (r2 != 0) goto L_0x0018
            b.i.a.f$o r2 = r1.t
            float r2 = r2.f(r0)
            goto L_0x0020
        L_0x0018:
            b.i.a.f$o r4 = r1.t
            float r2 = r2.d(r0)
            if (r4 != 0) goto L_0x0022
        L_0x0020:
            r4 = r2
            goto L_0x0028
        L_0x0022:
            b.i.a.f$o r4 = r1.t
            float r4 = r4.f(r0)
        L_0x0028:
            b.i.a.f$o r5 = r1.f1081q
            float r5 = r5.d(r0)
            r6 = 1073741824(0x40000000, float:2.0)
            float r5 = r5 / r6
            float r2 = java.lang.Math.min(r2, r5)
            b.i.a.f$o r5 = r1.r
            float r5 = r5.f(r0)
            float r5 = r5 / r6
            float r4 = java.lang.Math.min(r4, r5)
            b.i.a.f$o r5 = r1.f1079o
            if (r5 == 0) goto L_0x0049
            float r5 = r5.d(r0)
            goto L_0x004a
        L_0x0049:
            r5 = r3
        L_0x004a:
            b.i.a.f$o r6 = r1.f1080p
            if (r6 == 0) goto L_0x0054
            float r6 = r6.f(r0)
            r13 = r6
            goto L_0x0055
        L_0x0054:
            r13 = r3
        L_0x0055:
            b.i.a.f$o r6 = r1.f1081q
            float r6 = r6.d(r0)
            b.i.a.f$o r7 = r1.r
            float r7 = r7.f(r0)
            b.i.a.f$a r8 = r1.f1174h
            if (r8 != 0) goto L_0x006c
            b.i.a.f$a r8 = new b.i.a.f$a
            r8.<init>(r5, r13, r6, r7)
            r1.f1174h = r8
        L_0x006c:
            float r15 = r5 + r6
            float r1 = r13 + r7
            android.graphics.Path r14 = new android.graphics.Path
            r14.<init>()
            int r6 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r6 == 0) goto L_0x00d6
            int r3 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1))
            if (r3 != 0) goto L_0x007f
            goto L_0x00d6
        L_0x007f:
            r3 = 1057841801(0x3f0d6289, float:0.5522848)
            float r16 = r2 * r3
            float r3 = r3 * r4
            float r12 = r13 + r4
            r14.moveTo(r5, r12)
            float r17 = r12 - r3
            float r11 = r5 + r2
            float r21 = r11 - r16
            r6 = r14
            r7 = r5
            r8 = r17
            r9 = r21
            r10 = r13
            r24 = r11
            r22 = r12
            r12 = r13
            r6.cubicTo(r7, r8, r9, r10, r11, r12)
            float r2 = r15 - r2
            r14.lineTo(r2, r13)
            float r6 = r2 + r16
            r7 = r14
            r8 = r6
            r9 = r13
            r10 = r15
            r11 = r17
            r12 = r15
            r13 = r22
            r7.cubicTo(r8, r9, r10, r11, r12, r13)
            float r12 = r1 - r4
            r14.lineTo(r15, r12)
            float r10 = r12 + r3
            r3 = r14
            r16 = r10
            r17 = r6
            r18 = r1
            r19 = r2
            r20 = r1
            r14.cubicTo(r15, r16, r17, r18, r19, r20)
            r2 = r24
            r3.lineTo(r2, r1)
            r6 = r3
            r7 = r21
            r8 = r1
            r9 = r5
            r11 = r5
            r6.cubicTo(r7, r8, r9, r10, r11, r12)
            goto L_0x00e3
        L_0x00d6:
            r3 = r14
            r3.moveTo(r5, r13)
            r3.lineTo(r15, r13)
            r3.lineTo(r15, r1)
            r3.lineTo(r5, r1)
        L_0x00e3:
            r3.lineTo(r5, r13)
            r3.close()
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: b.i.a.g.E(b.i.a.f$a0):android.graphics.Path");
    }

    public final f.a F(f.o oVar, f.o oVar2, f.o oVar3, f.o oVar4) {
        float f2 = 0.0f;
        float d2 = oVar != null ? oVar.d(this) : 0.0f;
        if (oVar2 != null) {
            f2 = oVar2.f(this);
        }
        f.a z = z();
        return new f.a(d2, f2, oVar3 != null ? oVar3.d(this) : z.c, oVar4 != null ? oVar4.f(this) : z.d);
    }

    @TargetApi(19)
    public final Path G(f.j0 j0Var, boolean z) {
        Path path;
        Path b2;
        this.d.push(this.c);
        h hVar = new h(this, this.c);
        this.c = hVar;
        X(hVar, j0Var);
        if (!m() || !Z()) {
            this.c = this.d.pop();
            return null;
        }
        if (j0Var instanceof f.d1) {
            if (!z) {
                q("<use> elements inside a <clipPath> cannot reference another <use>", new Object[0]);
            }
            f.d1 d1Var = (f.d1) j0Var;
            f.m0 g2 = j0Var.a.g(d1Var.f1143o);
            if (g2 == null) {
                q("Use reference '%s' not found", d1Var.f1143o);
                this.c = this.d.pop();
                return null;
            } else if (!(g2 instanceof f.j0)) {
                this.c = this.d.pop();
                return null;
            } else {
                path = G((f.j0) g2, false);
                if (path == null) {
                    return null;
                }
                if (d1Var.f1174h == null) {
                    d1Var.f1174h = c(path);
                }
                Matrix matrix = d1Var.f1178n;
                if (matrix != null) {
                    path.transform(matrix);
                }
            }
        } else if (j0Var instanceof f.k) {
            f.k kVar = (f.k) j0Var;
            if (j0Var instanceof f.u) {
                path = new d(this, ((f.u) j0Var).f1209o).a;
                if (j0Var.f1174h == null) {
                    j0Var.f1174h = c(path);
                }
            } else {
                path = j0Var instanceof f.a0 ? E((f.a0) j0Var) : j0Var instanceof f.c ? B((f.c) j0Var) : j0Var instanceof f.h ? C((f.h) j0Var) : j0Var instanceof f.y ? D((f.y) j0Var) : null;
            }
            if (path == null) {
                return null;
            }
            if (kVar.f1174h == null) {
                kVar.f1174h = c(path);
            }
            Matrix matrix2 = kVar.f1175n;
            if (matrix2 != null) {
                path.transform(matrix2);
            }
            path.setFillType(y());
        } else if (j0Var instanceof f.v0) {
            f.v0 v0Var = (f.v0) j0Var;
            List<f.o> list = v0Var.f1218n;
            float f2 = 0.0f;
            float d2 = (list == null || list.size() == 0) ? 0.0f : v0Var.f1218n.get(0).d(this);
            List<f.o> list2 = v0Var.f1219o;
            float f3 = (list2 == null || list2.size() == 0) ? 0.0f : v0Var.f1219o.get(0).f(this);
            List<f.o> list3 = v0Var.f1220p;
            float d3 = (list3 == null || list3.size() == 0) ? 0.0f : v0Var.f1220p.get(0).d(this);
            List<f.o> list4 = v0Var.f1221q;
            if (!(list4 == null || list4.size() == 0)) {
                f2 = v0Var.f1221q.get(0).f(this);
            }
            if (this.c.a.B != f.d0.C0042f.Start) {
                k kVar2 = new k((a) null);
                p(v0Var, kVar2);
                float f4 = kVar2.a;
                if (this.c.a.B == f.d0.C0042f.Middle) {
                    f4 /= 2.0f;
                }
                d2 -= f4;
            }
            if (v0Var.f1174h == null) {
                i iVar = new i(d2, f3);
                p(v0Var, iVar);
                RectF rectF = iVar.c;
                v0Var.f1174h = new f.a(rectF.left, rectF.top, rectF.width(), iVar.c.height());
            }
            Path path2 = new Path();
            p(v0Var, new C0044g(d2 + d3, f3 + f2, path2));
            Matrix matrix3 = v0Var.r;
            if (matrix3 != null) {
                path2.transform(matrix3);
            }
            path2.setFillType(y());
            path = path2;
        } else {
            q("Invalid %s element found in clipPath definition", j0Var.o());
            return null;
        }
        if (!(this.c.a.L == null || (b2 = b(j0Var, j0Var.f1174h)) == null)) {
            path.op(b2, Path.Op.INTERSECT);
        }
        this.c = this.d.pop();
        return path;
    }

    public final void H(f.j0 j0Var) {
        I(j0Var, j0Var.f1174h);
    }

    public final void I(f.j0 j0Var, f.a aVar) {
        if (this.c.a.N != null) {
            Paint paint = new Paint();
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
            this.a.saveLayer((RectF) null, paint, 31);
            Paint paint2 = new Paint();
            paint2.setColorFilter(new ColorMatrixColorFilter(new ColorMatrix(new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.2127f, 0.7151f, 0.0722f, 0.0f, 0.0f})));
            this.a.saveLayer((RectF) null, paint2, 31);
            f.r rVar = (f.r) this.f1223b.g(this.c.a.N);
            P(rVar, j0Var, aVar);
            this.a.restore();
            Paint paint3 = new Paint();
            paint3.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
            this.a.saveLayer((RectF) null, paint3, 31);
            P(rVar, j0Var, aVar);
            this.a.restore();
            this.a.restore();
        }
        S();
    }

    public final boolean J() {
        f.m0 g2;
        if (!(this.c.a.t.floatValue() < 1.0f || this.c.a.N != null)) {
            return false;
        }
        this.a.saveLayerAlpha((RectF) null, j(this.c.a.t.floatValue()), 31);
        this.d.push(this.c);
        h hVar = new h(this, this.c);
        this.c = hVar;
        String str = hVar.a.N;
        if (str != null && ((g2 = this.f1223b.g(str)) == null || !(g2 instanceof f.r))) {
            q("Mask reference '%s' not found", this.c.a.N);
            this.c.a.N = null;
        }
        return true;
    }

    public final void K(f.e0 e0Var, f.a aVar, f.a aVar2, e eVar) {
        if (aVar.c != 0.0f && aVar.d != 0.0f) {
            if (eVar == null && (eVar = e0Var.f1189n) == null) {
                eVar = e.d;
            }
            X(this.c, e0Var);
            if (m()) {
                h hVar = this.c;
                hVar.f = aVar;
                if (!hVar.a.C.booleanValue()) {
                    f.a aVar3 = this.c.f;
                    Q(aVar3.a, aVar3.f1078b, aVar3.c, aVar3.d);
                }
                f(e0Var, this.c.f);
                Canvas canvas = this.a;
                if (aVar2 != null) {
                    canvas.concat(e(this.c.f, aVar2, eVar));
                    this.c.f1238g = e0Var.f1200o;
                } else {
                    f.a aVar4 = this.c.f;
                    canvas.translate(aVar4.a, aVar4.f1078b);
                }
                boolean J = J();
                Y();
                M(e0Var, true);
                if (J) {
                    I(e0Var, e0Var.f1174h);
                }
                V(e0Var);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:65:0x0163  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void L(b.i.a.f.m0 r13) {
        /*
            r12 = this;
            b.i.a.f$d0$a r0 = b.i.a.f.d0.a.EvenOdd
            b.i.a.e r1 = b.i.a.e.d
            boolean r2 = r13 instanceof b.i.a.f.s
            if (r2 == 0) goto L_0x0009
            return
        L_0x0009:
            r12.T()
            r12.i(r13)
            boolean r2 = r13 instanceof b.i.a.f.e0
            if (r2 == 0) goto L_0x002a
            b.i.a.f$e0 r13 = (b.i.a.f.e0) r13
            b.i.a.f$o r0 = r13.f1149p
            b.i.a.f$o r1 = r13.f1150q
            b.i.a.f$o r2 = r13.r
            b.i.a.f$o r3 = r13.s
            b.i.a.f$a r0 = r12.F(r0, r1, r2, r3)
            b.i.a.f$a r1 = r13.f1200o
            b.i.a.e r2 = r13.f1189n
            r12.K(r13, r0, r1, r2)
            goto L_0x07ee
        L_0x002a:
            boolean r2 = r13 instanceof b.i.a.f.d1
            r3 = 0
            r4 = 0
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L_0x016b
            b.i.a.f$d1 r13 = (b.i.a.f.d1) r13
            b.i.a.f$c1 r0 = b.i.a.f.c1.percent
            b.i.a.f$o r2 = r13.r
            if (r2 == 0) goto L_0x0040
            boolean r2 = r2.h()
            if (r2 != 0) goto L_0x07ee
        L_0x0040:
            b.i.a.f$o r2 = r13.s
            if (r2 == 0) goto L_0x004c
            boolean r2 = r2.h()
            if (r2 == 0) goto L_0x004c
            goto L_0x07ee
        L_0x004c:
            b.i.a.g$h r2 = r12.c
            r12.X(r2, r13)
            boolean r2 = r12.m()
            if (r2 != 0) goto L_0x0059
            goto L_0x07ee
        L_0x0059:
            b.i.a.f r2 = r13.a
            java.lang.String r7 = r13.f1143o
            b.i.a.f$m0 r2 = r2.g(r7)
            if (r2 != 0) goto L_0x0070
            java.lang.Object[] r0 = new java.lang.Object[r5]
            java.lang.String r13 = r13.f1143o
            r0[r4] = r13
            java.lang.String r13 = "Use reference '%s' not found"
            q(r13, r0)
            goto L_0x07ee
        L_0x0070:
            android.graphics.Matrix r4 = r13.f1178n
            if (r4 == 0) goto L_0x0079
            android.graphics.Canvas r7 = r12.a
            r7.concat(r4)
        L_0x0079:
            b.i.a.f$o r4 = r13.f1144p
            if (r4 == 0) goto L_0x0082
            float r4 = r4.d(r12)
            goto L_0x0083
        L_0x0082:
            r4 = r6
        L_0x0083:
            b.i.a.f$o r7 = r13.f1145q
            if (r7 == 0) goto L_0x008c
            float r7 = r7.f(r12)
            goto L_0x008d
        L_0x008c:
            r7 = r6
        L_0x008d:
            android.graphics.Canvas r8 = r12.a
            r8.translate(r4, r7)
            b.i.a.f$a r4 = r13.f1174h
            r12.f(r13, r4)
            boolean r4 = r12.J()
            java.util.Stack<b.i.a.f$i0> r7 = r12.f1224e
            r7.push(r13)
            java.util.Stack<android.graphics.Matrix> r7 = r12.f
            android.graphics.Canvas r8 = r12.a
            android.graphics.Matrix r8 = r8.getMatrix()
            r7.push(r8)
            boolean r7 = r2 instanceof b.i.a.f.e0
            if (r7 == 0) goto L_0x00c5
            b.i.a.f$e0 r2 = (b.i.a.f.e0) r2
            b.i.a.f$o r0 = r13.r
            b.i.a.f$o r1 = r13.s
            b.i.a.f$a r0 = r12.F(r3, r3, r0, r1)
            r12.T()
            b.i.a.f$a r1 = r2.f1200o
            b.i.a.e r3 = r2.f1189n
            r12.K(r2, r0, r1, r3)
            goto L_0x0150
        L_0x00c5:
            boolean r7 = r2 instanceof b.i.a.f.s0
            if (r7 == 0) goto L_0x0154
            b.i.a.f$o r7 = r13.r
            r8 = 1120403456(0x42c80000, float:100.0)
            if (r7 == 0) goto L_0x00d0
            goto L_0x00d5
        L_0x00d0:
            b.i.a.f$o r7 = new b.i.a.f$o
            r7.<init>(r8, r0)
        L_0x00d5:
            b.i.a.f$o r9 = r13.s
            if (r9 == 0) goto L_0x00da
            goto L_0x00df
        L_0x00da:
            b.i.a.f$o r9 = new b.i.a.f$o
            r9.<init>(r8, r0)
        L_0x00df:
            b.i.a.f$a r0 = r12.F(r3, r3, r7, r9)
            r12.T()
            b.i.a.f$s0 r2 = (b.i.a.f.s0) r2
            float r3 = r0.c
            int r3 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r3 == 0) goto L_0x0150
            float r3 = r0.d
            int r3 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r3 != 0) goto L_0x00f5
            goto L_0x0150
        L_0x00f5:
            b.i.a.e r3 = r2.f1189n
            if (r3 == 0) goto L_0x00fa
            r1 = r3
        L_0x00fa:
            b.i.a.g$h r3 = r12.c
            r12.X(r3, r2)
            b.i.a.g$h r3 = r12.c
            r3.f = r0
            b.i.a.f$d0 r0 = r3.a
            java.lang.Boolean r0 = r0.C
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x011c
            b.i.a.g$h r0 = r12.c
            b.i.a.f$a r0 = r0.f
            float r3 = r0.a
            float r6 = r0.f1078b
            float r7 = r0.c
            float r0 = r0.d
            r12.Q(r3, r6, r7, r0)
        L_0x011c:
            b.i.a.f$a r0 = r2.f1200o
            if (r0 == 0) goto L_0x0134
            android.graphics.Canvas r3 = r12.a
            b.i.a.g$h r6 = r12.c
            b.i.a.f$a r6 = r6.f
            android.graphics.Matrix r0 = r12.e(r6, r0, r1)
            r3.concat(r0)
            b.i.a.g$h r0 = r12.c
            b.i.a.f$a r1 = r2.f1200o
            r0.f1238g = r1
            goto L_0x0141
        L_0x0134:
            android.graphics.Canvas r0 = r12.a
            b.i.a.g$h r1 = r12.c
            b.i.a.f$a r1 = r1.f
            float r3 = r1.a
            float r1 = r1.f1078b
            r0.translate(r3, r1)
        L_0x0141:
            boolean r0 = r12.J()
            r12.M(r2, r5)
            if (r0 == 0) goto L_0x014d
            r12.H(r2)
        L_0x014d:
            r12.V(r2)
        L_0x0150:
            r12.S()
            goto L_0x0157
        L_0x0154:
            r12.L(r2)
        L_0x0157:
            java.util.Stack<b.i.a.f$i0> r0 = r12.f1224e
            r0.pop()
            java.util.Stack<android.graphics.Matrix> r0 = r12.f
            r0.pop()
            if (r4 == 0) goto L_0x0166
            r12.H(r13)
        L_0x0166:
            r12.V(r13)
            goto L_0x07ee
        L_0x016b:
            boolean r2 = r13 instanceof b.i.a.f.r0
            if (r2 == 0) goto L_0x029b
            b.i.a.f$r0 r13 = (b.i.a.f.r0) r13
            b.i.a.g$h r0 = r12.c
            r12.X(r0, r13)
            boolean r0 = r12.m()
            if (r0 != 0) goto L_0x017e
            goto L_0x07ee
        L_0x017e:
            android.graphics.Matrix r0 = r13.f1178n
            if (r0 == 0) goto L_0x0187
            android.graphics.Canvas r1 = r12.a
            r1.concat(r0)
        L_0x0187:
            b.i.a.f$a r0 = r13.f1174h
            r12.f(r13, r0)
            boolean r0 = r12.J()
            java.util.Locale r1 = java.util.Locale.getDefault()
            java.lang.String r1 = r1.getLanguage()
            java.util.List<b.i.a.f$m0> r2 = r13.f1152i
            java.util.Iterator r2 = r2.iterator()
        L_0x019e:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0291
            java.lang.Object r3 = r2.next()
            b.i.a.f$m0 r3 = (b.i.a.f.m0) r3
            boolean r4 = r3 instanceof b.i.a.f.f0
            if (r4 != 0) goto L_0x01af
            goto L_0x019e
        L_0x01af:
            r4 = r3
            b.i.a.f$f0 r4 = (b.i.a.f.f0) r4
            java.lang.String r5 = r4.h()
            if (r5 == 0) goto L_0x01b9
            goto L_0x019e
        L_0x01b9:
            java.util.Set r5 = r4.e()
            if (r5 == 0) goto L_0x01cc
            boolean r6 = r5.isEmpty()
            if (r6 != 0) goto L_0x019e
            boolean r5 = r5.contains(r1)
            if (r5 != 0) goto L_0x01cc
            goto L_0x019e
        L_0x01cc:
            java.util.Set r5 = r4.a()
            if (r5 == 0) goto L_0x0278
            java.util.HashSet<java.lang.String> r6 = f1222g
            if (r6 != 0) goto L_0x0268
            java.lang.Class<b.i.a.g> r6 = b.i.a.g.class
            monitor-enter(r6)
            java.util.HashSet r7 = new java.util.HashSet     // Catch:{ all -> 0x0265 }
            r7.<init>()     // Catch:{ all -> 0x0265 }
            f1222g = r7     // Catch:{ all -> 0x0265 }
            java.lang.String r8 = "Structure"
            r7.add(r8)     // Catch:{ all -> 0x0265 }
            java.util.HashSet<java.lang.String> r7 = f1222g     // Catch:{ all -> 0x0265 }
            java.lang.String r8 = "BasicStructure"
            r7.add(r8)     // Catch:{ all -> 0x0265 }
            java.util.HashSet<java.lang.String> r7 = f1222g     // Catch:{ all -> 0x0265 }
            java.lang.String r8 = "ConditionalProcessing"
            r7.add(r8)     // Catch:{ all -> 0x0265 }
            java.util.HashSet<java.lang.String> r7 = f1222g     // Catch:{ all -> 0x0265 }
            java.lang.String r8 = "Image"
            r7.add(r8)     // Catch:{ all -> 0x0265 }
            java.util.HashSet<java.lang.String> r7 = f1222g     // Catch:{ all -> 0x0265 }
            java.lang.String r8 = "Style"
            r7.add(r8)     // Catch:{ all -> 0x0265 }
            java.util.HashSet<java.lang.String> r7 = f1222g     // Catch:{ all -> 0x0265 }
            java.lang.String r8 = "ViewportAttribute"
            r7.add(r8)     // Catch:{ all -> 0x0265 }
            java.util.HashSet<java.lang.String> r7 = f1222g     // Catch:{ all -> 0x0265 }
            java.lang.String r8 = "Shape"
            r7.add(r8)     // Catch:{ all -> 0x0265 }
            java.util.HashSet<java.lang.String> r7 = f1222g     // Catch:{ all -> 0x0265 }
            java.lang.String r8 = "BasicText"
            r7.add(r8)     // Catch:{ all -> 0x0265 }
            java.util.HashSet<java.lang.String> r7 = f1222g     // Catch:{ all -> 0x0265 }
            java.lang.String r8 = "PaintAttribute"
            r7.add(r8)     // Catch:{ all -> 0x0265 }
            java.util.HashSet<java.lang.String> r7 = f1222g     // Catch:{ all -> 0x0265 }
            java.lang.String r8 = "BasicPaintAttribute"
            r7.add(r8)     // Catch:{ all -> 0x0265 }
            java.util.HashSet<java.lang.String> r7 = f1222g     // Catch:{ all -> 0x0265 }
            java.lang.String r8 = "OpacityAttribute"
            r7.add(r8)     // Catch:{ all -> 0x0265 }
            java.util.HashSet<java.lang.String> r7 = f1222g     // Catch:{ all -> 0x0265 }
            java.lang.String r8 = "BasicGraphicsAttribute"
            r7.add(r8)     // Catch:{ all -> 0x0265 }
            java.util.HashSet<java.lang.String> r7 = f1222g     // Catch:{ all -> 0x0265 }
            java.lang.String r8 = "Marker"
            r7.add(r8)     // Catch:{ all -> 0x0265 }
            java.util.HashSet<java.lang.String> r7 = f1222g     // Catch:{ all -> 0x0265 }
            java.lang.String r8 = "Gradient"
            r7.add(r8)     // Catch:{ all -> 0x0265 }
            java.util.HashSet<java.lang.String> r7 = f1222g     // Catch:{ all -> 0x0265 }
            java.lang.String r8 = "Pattern"
            r7.add(r8)     // Catch:{ all -> 0x0265 }
            java.util.HashSet<java.lang.String> r7 = f1222g     // Catch:{ all -> 0x0265 }
            java.lang.String r8 = "Clip"
            r7.add(r8)     // Catch:{ all -> 0x0265 }
            java.util.HashSet<java.lang.String> r7 = f1222g     // Catch:{ all -> 0x0265 }
            java.lang.String r8 = "BasicClip"
            r7.add(r8)     // Catch:{ all -> 0x0265 }
            java.util.HashSet<java.lang.String> r7 = f1222g     // Catch:{ all -> 0x0265 }
            java.lang.String r8 = "Mask"
            r7.add(r8)     // Catch:{ all -> 0x0265 }
            java.util.HashSet<java.lang.String> r7 = f1222g     // Catch:{ all -> 0x0265 }
            java.lang.String r8 = "View"
            r7.add(r8)     // Catch:{ all -> 0x0265 }
            monitor-exit(r6)
            goto L_0x0268
        L_0x0265:
            r13 = move-exception
            monitor-exit(r6)
            throw r13
        L_0x0268:
            boolean r6 = r5.isEmpty()
            if (r6 != 0) goto L_0x019e
            java.util.HashSet<java.lang.String> r6 = f1222g
            boolean r5 = r6.containsAll(r5)
            if (r5 != 0) goto L_0x0278
            goto L_0x019e
        L_0x0278:
            java.util.Set r5 = r4.m()
            if (r5 == 0) goto L_0x0283
            r5.isEmpty()
            goto L_0x019e
        L_0x0283:
            java.util.Set r4 = r4.n()
            if (r4 == 0) goto L_0x028e
            r4.isEmpty()
            goto L_0x019e
        L_0x028e:
            r12.L(r3)
        L_0x0291:
            if (r0 == 0) goto L_0x0296
            r12.H(r13)
        L_0x0296:
            r12.V(r13)
            goto L_0x07ee
        L_0x029b:
            boolean r2 = r13 instanceof b.i.a.f.l
            if (r2 == 0) goto L_0x02cd
            b.i.a.f$l r13 = (b.i.a.f.l) r13
            b.i.a.g$h r0 = r12.c
            r12.X(r0, r13)
            boolean r0 = r12.m()
            if (r0 != 0) goto L_0x02ae
            goto L_0x07ee
        L_0x02ae:
            android.graphics.Matrix r0 = r13.f1178n
            if (r0 == 0) goto L_0x02b7
            android.graphics.Canvas r1 = r12.a
            r1.concat(r0)
        L_0x02b7:
            b.i.a.f$a r0 = r13.f1174h
            r12.f(r13, r0)
            boolean r0 = r12.J()
            r12.M(r13, r5)
            if (r0 == 0) goto L_0x02c8
            r12.H(r13)
        L_0x02c8:
            r12.V(r13)
            goto L_0x07ee
        L_0x02cd:
            boolean r2 = r13 instanceof b.i.a.f.n
            r7 = 2
            if (r2 == 0) goto L_0x03f4
            b.i.a.f$n r13 = (b.i.a.f.n) r13
            b.i.a.f$o r0 = r13.r
            if (r0 == 0) goto L_0x07ee
            boolean r0 = r0.h()
            if (r0 != 0) goto L_0x07ee
            b.i.a.f$o r0 = r13.s
            if (r0 == 0) goto L_0x07ee
            boolean r0 = r0.h()
            if (r0 == 0) goto L_0x02ea
            goto L_0x07ee
        L_0x02ea:
            java.lang.String r0 = r13.f1184o
            if (r0 != 0) goto L_0x02f0
            goto L_0x07ee
        L_0x02f0:
            b.i.a.e r2 = r13.f1189n
            if (r2 == 0) goto L_0x02f5
            r1 = r2
        L_0x02f5:
            java.lang.String r2 = "data:"
            boolean r2 = r0.startsWith(r2)
            if (r2 != 0) goto L_0x02fe
            goto L_0x0338
        L_0x02fe:
            int r2 = r0.length()
            r8 = 14
            if (r2 >= r8) goto L_0x0307
            goto L_0x0338
        L_0x0307:
            r2 = 44
            int r2 = r0.indexOf(r2)
            r8 = 12
            if (r2 >= r8) goto L_0x0312
            goto L_0x0338
        L_0x0312:
            int r8 = r2 + -7
            java.lang.String r8 = r0.substring(r8, r2)
            java.lang.String r9 = ";base64"
            boolean r8 = r9.equals(r8)
            if (r8 != 0) goto L_0x0321
            goto L_0x0338
        L_0x0321:
            int r2 = r2 + r5
            java.lang.String r0 = r0.substring(r2)     // Catch:{ Exception -> 0x0330 }
            byte[] r0 = android.util.Base64.decode(r0, r4)     // Catch:{ Exception -> 0x0330 }
            int r2 = r0.length     // Catch:{ Exception -> 0x0330 }
            android.graphics.Bitmap r3 = android.graphics.BitmapFactory.decodeByteArray(r0, r4, r2)     // Catch:{ Exception -> 0x0330 }
            goto L_0x0338
        L_0x0330:
            r0 = move-exception
            java.lang.String r2 = "SVGAndroidRenderer"
            java.lang.String r5 = "Could not decode bad Data URL"
            android.util.Log.e(r2, r5, r0)
        L_0x0338:
            if (r3 != 0) goto L_0x033c
            goto L_0x07ee
        L_0x033c:
            b.i.a.f$a r0 = new b.i.a.f$a
            int r2 = r3.getWidth()
            float r2 = (float) r2
            int r5 = r3.getHeight()
            float r5 = (float) r5
            r0.<init>(r6, r6, r2, r5)
            b.i.a.g$h r2 = r12.c
            r12.X(r2, r13)
            boolean r2 = r12.m()
            if (r2 != 0) goto L_0x0358
            goto L_0x07ee
        L_0x0358:
            boolean r2 = r12.Z()
            if (r2 != 0) goto L_0x0360
            goto L_0x07ee
        L_0x0360:
            android.graphics.Matrix r2 = r13.t
            if (r2 == 0) goto L_0x0369
            android.graphics.Canvas r5 = r12.a
            r5.concat(r2)
        L_0x0369:
            b.i.a.f$o r2 = r13.f1185p
            if (r2 == 0) goto L_0x0372
            float r2 = r2.d(r12)
            goto L_0x0373
        L_0x0372:
            r2 = r6
        L_0x0373:
            b.i.a.f$o r5 = r13.f1186q
            if (r5 == 0) goto L_0x037c
            float r5 = r5.f(r12)
            goto L_0x037d
        L_0x037c:
            r5 = r6
        L_0x037d:
            b.i.a.f$o r8 = r13.r
            float r8 = r8.d(r12)
            b.i.a.f$o r9 = r13.s
            float r9 = r9.d(r12)
            b.i.a.g$h r10 = r12.c
            b.i.a.f$a r11 = new b.i.a.f$a
            r11.<init>(r2, r5, r8, r9)
            r10.f = r11
            b.i.a.f$d0 r2 = r10.a
            java.lang.Boolean r2 = r2.C
            boolean r2 = r2.booleanValue()
            if (r2 != 0) goto L_0x03ab
            b.i.a.g$h r2 = r12.c
            b.i.a.f$a r2 = r2.f
            float r5 = r2.a
            float r8 = r2.f1078b
            float r9 = r2.c
            float r2 = r2.d
            r12.Q(r5, r8, r9, r2)
        L_0x03ab:
            b.i.a.g$h r2 = r12.c
            b.i.a.f$a r2 = r2.f
            r13.f1174h = r2
            r12.V(r13)
            b.i.a.f$a r2 = r13.f1174h
            r12.f(r13, r2)
            boolean r2 = r12.J()
            r12.Y()
            android.graphics.Canvas r5 = r12.a
            r5.save()
            android.graphics.Canvas r5 = r12.a
            b.i.a.g$h r8 = r12.c
            b.i.a.f$a r8 = r8.f
            android.graphics.Matrix r0 = r12.e(r8, r0, r1)
            r5.concat(r0)
            android.graphics.Paint r0 = new android.graphics.Paint
            b.i.a.g$h r1 = r12.c
            b.i.a.f$d0 r1 = r1.a
            b.i.a.f$d0$e r1 = r1.T
            b.i.a.f$d0$e r5 = b.i.a.f.d0.e.optimizeSpeed
            if (r1 != r5) goto L_0x03df
            goto L_0x03e0
        L_0x03df:
            r4 = r7
        L_0x03e0:
            r0.<init>(r4)
            android.graphics.Canvas r1 = r12.a
            r1.drawBitmap(r3, r6, r6, r0)
            android.graphics.Canvas r0 = r12.a
            r0.restore()
            if (r2 == 0) goto L_0x07ee
            r12.H(r13)
            goto L_0x07ee
        L_0x03f4:
            boolean r1 = r13 instanceof b.i.a.f.u
            if (r1 == 0) goto L_0x0478
            b.i.a.f$u r13 = (b.i.a.f.u) r13
            b.i.a.f$v r1 = r13.f1209o
            if (r1 != 0) goto L_0x0400
            goto L_0x07ee
        L_0x0400:
            b.i.a.g$h r1 = r12.c
            r12.X(r1, r13)
            boolean r1 = r12.m()
            if (r1 != 0) goto L_0x040d
            goto L_0x07ee
        L_0x040d:
            boolean r1 = r12.Z()
            if (r1 != 0) goto L_0x0415
            goto L_0x07ee
        L_0x0415:
            b.i.a.g$h r1 = r12.c
            boolean r2 = r1.c
            if (r2 != 0) goto L_0x0421
            boolean r1 = r1.f1236b
            if (r1 != 0) goto L_0x0421
            goto L_0x07ee
        L_0x0421:
            android.graphics.Matrix r1 = r13.f1175n
            if (r1 == 0) goto L_0x042a
            android.graphics.Canvas r2 = r12.a
            r2.concat(r1)
        L_0x042a:
            b.i.a.g$d r1 = new b.i.a.g$d
            b.i.a.f$v r2 = r13.f1209o
            r1.<init>(r12, r2)
            android.graphics.Path r1 = r1.a
            b.i.a.f$a r2 = r13.f1174h
            if (r2 != 0) goto L_0x043d
            b.i.a.f$a r2 = r12.c(r1)
            r13.f1174h = r2
        L_0x043d:
            r12.V(r13)
            r12.g(r13)
            b.i.a.f$a r2 = r13.f1174h
            r12.f(r13, r2)
            boolean r2 = r12.J()
            b.i.a.g$h r3 = r12.c
            boolean r4 = r3.f1236b
            if (r4 == 0) goto L_0x0465
            b.i.a.f$d0 r3 = r3.a
            b.i.a.f$d0$a r3 = r3.f1100j
            if (r3 == 0) goto L_0x045d
            if (r3 != r0) goto L_0x045d
            android.graphics.Path$FillType r0 = android.graphics.Path.FillType.EVEN_ODD
            goto L_0x045f
        L_0x045d:
            android.graphics.Path$FillType r0 = android.graphics.Path.FillType.WINDING
        L_0x045f:
            r1.setFillType(r0)
            r12.n(r13, r1)
        L_0x0465:
            b.i.a.g$h r0 = r12.c
            boolean r0 = r0.c
            if (r0 == 0) goto L_0x046e
            r12.o(r1)
        L_0x046e:
            r12.O(r13)
            if (r2 == 0) goto L_0x07ee
            r12.H(r13)
            goto L_0x07ee
        L_0x0478:
            boolean r1 = r13 instanceof b.i.a.f.a0
            if (r1 == 0) goto L_0x04e0
            b.i.a.f$a0 r13 = (b.i.a.f.a0) r13
            b.i.a.f$o r0 = r13.f1081q
            if (r0 == 0) goto L_0x07ee
            b.i.a.f$o r1 = r13.r
            if (r1 == 0) goto L_0x07ee
            boolean r0 = r0.h()
            if (r0 != 0) goto L_0x07ee
            b.i.a.f$o r0 = r13.r
            boolean r0 = r0.h()
            if (r0 == 0) goto L_0x0496
            goto L_0x07ee
        L_0x0496:
            b.i.a.g$h r0 = r12.c
            r12.X(r0, r13)
            boolean r0 = r12.m()
            if (r0 != 0) goto L_0x04a3
            goto L_0x07ee
        L_0x04a3:
            boolean r0 = r12.Z()
            if (r0 != 0) goto L_0x04ab
            goto L_0x07ee
        L_0x04ab:
            android.graphics.Matrix r0 = r13.f1175n
            if (r0 == 0) goto L_0x04b4
            android.graphics.Canvas r1 = r12.a
            r1.concat(r0)
        L_0x04b4:
            android.graphics.Path r0 = r12.E(r13)
            r12.V(r13)
            r12.g(r13)
            b.i.a.f$a r1 = r13.f1174h
            r12.f(r13, r1)
            boolean r1 = r12.J()
            b.i.a.g$h r2 = r12.c
            boolean r2 = r2.f1236b
            if (r2 == 0) goto L_0x04d0
            r12.n(r13, r0)
        L_0x04d0:
            b.i.a.g$h r2 = r12.c
            boolean r2 = r2.c
            if (r2 == 0) goto L_0x04d9
            r12.o(r0)
        L_0x04d9:
            if (r1 == 0) goto L_0x07ee
            r12.H(r13)
            goto L_0x07ee
        L_0x04e0:
            boolean r1 = r13 instanceof b.i.a.f.c
            if (r1 == 0) goto L_0x053c
            b.i.a.f$c r13 = (b.i.a.f.c) r13
            b.i.a.f$o r0 = r13.f1085q
            if (r0 == 0) goto L_0x07ee
            boolean r0 = r0.h()
            if (r0 == 0) goto L_0x04f2
            goto L_0x07ee
        L_0x04f2:
            b.i.a.g$h r0 = r12.c
            r12.X(r0, r13)
            boolean r0 = r12.m()
            if (r0 != 0) goto L_0x04ff
            goto L_0x07ee
        L_0x04ff:
            boolean r0 = r12.Z()
            if (r0 != 0) goto L_0x0507
            goto L_0x07ee
        L_0x0507:
            android.graphics.Matrix r0 = r13.f1175n
            if (r0 == 0) goto L_0x0510
            android.graphics.Canvas r1 = r12.a
            r1.concat(r0)
        L_0x0510:
            android.graphics.Path r0 = r12.B(r13)
            r12.V(r13)
            r12.g(r13)
            b.i.a.f$a r1 = r13.f1174h
            r12.f(r13, r1)
            boolean r1 = r12.J()
            b.i.a.g$h r2 = r12.c
            boolean r2 = r2.f1236b
            if (r2 == 0) goto L_0x052c
            r12.n(r13, r0)
        L_0x052c:
            b.i.a.g$h r2 = r12.c
            boolean r2 = r2.c
            if (r2 == 0) goto L_0x0535
            r12.o(r0)
        L_0x0535:
            if (r1 == 0) goto L_0x07ee
            r12.H(r13)
            goto L_0x07ee
        L_0x053c:
            boolean r1 = r13 instanceof b.i.a.f.h
            if (r1 == 0) goto L_0x05a4
            b.i.a.f$h r13 = (b.i.a.f.h) r13
            b.i.a.f$o r0 = r13.f1159q
            if (r0 == 0) goto L_0x07ee
            b.i.a.f$o r1 = r13.r
            if (r1 == 0) goto L_0x07ee
            boolean r0 = r0.h()
            if (r0 != 0) goto L_0x07ee
            b.i.a.f$o r0 = r13.r
            boolean r0 = r0.h()
            if (r0 == 0) goto L_0x055a
            goto L_0x07ee
        L_0x055a:
            b.i.a.g$h r0 = r12.c
            r12.X(r0, r13)
            boolean r0 = r12.m()
            if (r0 != 0) goto L_0x0567
            goto L_0x07ee
        L_0x0567:
            boolean r0 = r12.Z()
            if (r0 != 0) goto L_0x056f
            goto L_0x07ee
        L_0x056f:
            android.graphics.Matrix r0 = r13.f1175n
            if (r0 == 0) goto L_0x0578
            android.graphics.Canvas r1 = r12.a
            r1.concat(r0)
        L_0x0578:
            android.graphics.Path r0 = r12.C(r13)
            r12.V(r13)
            r12.g(r13)
            b.i.a.f$a r1 = r13.f1174h
            r12.f(r13, r1)
            boolean r1 = r12.J()
            b.i.a.g$h r2 = r12.c
            boolean r2 = r2.f1236b
            if (r2 == 0) goto L_0x0594
            r12.n(r13, r0)
        L_0x0594:
            b.i.a.g$h r2 = r12.c
            boolean r2 = r2.c
            if (r2 == 0) goto L_0x059d
            r12.o(r0)
        L_0x059d:
            if (r1 == 0) goto L_0x07ee
            r12.H(r13)
            goto L_0x07ee
        L_0x05a4:
            boolean r1 = r13 instanceof b.i.a.f.p
            if (r1 == 0) goto L_0x063d
            b.i.a.f$p r13 = (b.i.a.f.p) r13
            b.i.a.g$h r0 = r12.c
            r12.X(r0, r13)
            boolean r0 = r12.m()
            if (r0 != 0) goto L_0x05b7
            goto L_0x07ee
        L_0x05b7:
            boolean r0 = r12.Z()
            if (r0 != 0) goto L_0x05bf
            goto L_0x07ee
        L_0x05bf:
            b.i.a.g$h r0 = r12.c
            boolean r0 = r0.c
            if (r0 != 0) goto L_0x05c7
            goto L_0x07ee
        L_0x05c7:
            android.graphics.Matrix r0 = r13.f1175n
            if (r0 == 0) goto L_0x05d0
            android.graphics.Canvas r1 = r12.a
            r1.concat(r0)
        L_0x05d0:
            b.i.a.f$o r0 = r13.f1190o
            if (r0 != 0) goto L_0x05d6
            r0 = r6
            goto L_0x05da
        L_0x05d6:
            float r0 = r0.d(r12)
        L_0x05da:
            b.i.a.f$o r1 = r13.f1191p
            if (r1 != 0) goto L_0x05e0
            r1 = r6
            goto L_0x05e4
        L_0x05e0:
            float r1 = r1.f(r12)
        L_0x05e4:
            b.i.a.f$o r2 = r13.f1192q
            if (r2 != 0) goto L_0x05ea
            r2 = r6
            goto L_0x05ee
        L_0x05ea:
            float r2 = r2.d(r12)
        L_0x05ee:
            b.i.a.f$o r3 = r13.r
            if (r3 != 0) goto L_0x05f3
            goto L_0x05f7
        L_0x05f3:
            float r6 = r3.f(r12)
        L_0x05f7:
            b.i.a.f$a r3 = r13.f1174h
            if (r3 != 0) goto L_0x0616
            b.i.a.f$a r3 = new b.i.a.f$a
            float r4 = java.lang.Math.min(r0, r2)
            float r5 = java.lang.Math.min(r1, r6)
            float r7 = r2 - r0
            float r7 = java.lang.Math.abs(r7)
            float r8 = r6 - r1
            float r8 = java.lang.Math.abs(r8)
            r3.<init>(r4, r5, r7, r8)
            r13.f1174h = r3
        L_0x0616:
            android.graphics.Path r3 = new android.graphics.Path
            r3.<init>()
            r3.moveTo(r0, r1)
            r3.lineTo(r2, r6)
            r12.V(r13)
            r12.g(r13)
            b.i.a.f$a r0 = r13.f1174h
            r12.f(r13, r0)
            boolean r0 = r12.J()
            r12.o(r3)
            r12.O(r13)
            if (r0 == 0) goto L_0x07ee
            r12.H(r13)
            goto L_0x07ee
        L_0x063d:
            boolean r1 = r13 instanceof b.i.a.f.z
            if (r1 == 0) goto L_0x06a3
            b.i.a.f$z r13 = (b.i.a.f.z) r13
            b.i.a.g$h r0 = r12.c
            r12.X(r0, r13)
            boolean r0 = r12.m()
            if (r0 != 0) goto L_0x0650
            goto L_0x07ee
        L_0x0650:
            boolean r0 = r12.Z()
            if (r0 != 0) goto L_0x0658
            goto L_0x07ee
        L_0x0658:
            b.i.a.g$h r0 = r12.c
            boolean r1 = r0.c
            if (r1 != 0) goto L_0x0664
            boolean r0 = r0.f1236b
            if (r0 != 0) goto L_0x0664
            goto L_0x07ee
        L_0x0664:
            android.graphics.Matrix r0 = r13.f1175n
            if (r0 == 0) goto L_0x066d
            android.graphics.Canvas r1 = r12.a
            r1.concat(r0)
        L_0x066d:
            float[] r0 = r13.f1214o
            int r0 = r0.length
            if (r0 >= r7) goto L_0x0674
            goto L_0x07ee
        L_0x0674:
            android.graphics.Path r0 = r12.D(r13)
            r12.V(r13)
            r12.g(r13)
            b.i.a.f$a r1 = r13.f1174h
            r12.f(r13, r1)
            boolean r1 = r12.J()
            b.i.a.g$h r2 = r12.c
            boolean r2 = r2.f1236b
            if (r2 == 0) goto L_0x0690
            r12.n(r13, r0)
        L_0x0690:
            b.i.a.g$h r2 = r12.c
            boolean r2 = r2.c
            if (r2 == 0) goto L_0x0699
            r12.o(r0)
        L_0x0699:
            r12.O(r13)
            if (r1 == 0) goto L_0x07ee
            r12.H(r13)
            goto L_0x07ee
        L_0x06a3:
            boolean r1 = r13 instanceof b.i.a.f.y
            if (r1 == 0) goto L_0x071b
            b.i.a.f$y r13 = (b.i.a.f.y) r13
            b.i.a.g$h r1 = r12.c
            r12.X(r1, r13)
            boolean r1 = r12.m()
            if (r1 != 0) goto L_0x06b6
            goto L_0x07ee
        L_0x06b6:
            boolean r1 = r12.Z()
            if (r1 != 0) goto L_0x06be
            goto L_0x07ee
        L_0x06be:
            b.i.a.g$h r1 = r12.c
            boolean r2 = r1.c
            if (r2 != 0) goto L_0x06ca
            boolean r1 = r1.f1236b
            if (r1 != 0) goto L_0x06ca
            goto L_0x07ee
        L_0x06ca:
            android.graphics.Matrix r1 = r13.f1175n
            if (r1 == 0) goto L_0x06d3
            android.graphics.Canvas r2 = r12.a
            r2.concat(r1)
        L_0x06d3:
            float[] r1 = r13.f1214o
            int r1 = r1.length
            if (r1 >= r7) goto L_0x06da
            goto L_0x07ee
        L_0x06da:
            android.graphics.Path r1 = r12.D(r13)
            r12.V(r13)
            b.i.a.g$h r2 = r12.c
            b.i.a.f$d0 r2 = r2.a
            b.i.a.f$d0$a r2 = r2.f1100j
            if (r2 == 0) goto L_0x06ee
            if (r2 != r0) goto L_0x06ee
            android.graphics.Path$FillType r0 = android.graphics.Path.FillType.EVEN_ODD
            goto L_0x06f0
        L_0x06ee:
            android.graphics.Path$FillType r0 = android.graphics.Path.FillType.WINDING
        L_0x06f0:
            r1.setFillType(r0)
            r12.g(r13)
            b.i.a.f$a r0 = r13.f1174h
            r12.f(r13, r0)
            boolean r0 = r12.J()
            b.i.a.g$h r2 = r12.c
            boolean r2 = r2.f1236b
            if (r2 == 0) goto L_0x0708
            r12.n(r13, r1)
        L_0x0708:
            b.i.a.g$h r2 = r12.c
            boolean r2 = r2.c
            if (r2 == 0) goto L_0x0711
            r12.o(r1)
        L_0x0711:
            r12.O(r13)
            if (r0 == 0) goto L_0x07ee
            r12.H(r13)
            goto L_0x07ee
        L_0x071b:
            boolean r0 = r13 instanceof b.i.a.f.v0
            if (r0 == 0) goto L_0x07ee
            b.i.a.f$v0 r13 = (b.i.a.f.v0) r13
            b.i.a.g$h r0 = r12.c
            r12.X(r0, r13)
            boolean r0 = r12.m()
            if (r0 != 0) goto L_0x072e
            goto L_0x07ee
        L_0x072e:
            android.graphics.Matrix r0 = r13.r
            if (r0 == 0) goto L_0x0737
            android.graphics.Canvas r1 = r12.a
            r1.concat(r0)
        L_0x0737:
            java.util.List<b.i.a.f$o> r0 = r13.f1218n
            if (r0 == 0) goto L_0x074f
            int r0 = r0.size()
            if (r0 != 0) goto L_0x0742
            goto L_0x074f
        L_0x0742:
            java.util.List<b.i.a.f$o> r0 = r13.f1218n
            java.lang.Object r0 = r0.get(r4)
            b.i.a.f$o r0 = (b.i.a.f.o) r0
            float r0 = r0.d(r12)
            goto L_0x0750
        L_0x074f:
            r0 = r6
        L_0x0750:
            java.util.List<b.i.a.f$o> r1 = r13.f1219o
            if (r1 == 0) goto L_0x0768
            int r1 = r1.size()
            if (r1 != 0) goto L_0x075b
            goto L_0x0768
        L_0x075b:
            java.util.List<b.i.a.f$o> r1 = r13.f1219o
            java.lang.Object r1 = r1.get(r4)
            b.i.a.f$o r1 = (b.i.a.f.o) r1
            float r1 = r1.f(r12)
            goto L_0x0769
        L_0x0768:
            r1 = r6
        L_0x0769:
            java.util.List<b.i.a.f$o> r2 = r13.f1220p
            if (r2 == 0) goto L_0x0781
            int r2 = r2.size()
            if (r2 != 0) goto L_0x0774
            goto L_0x0781
        L_0x0774:
            java.util.List<b.i.a.f$o> r2 = r13.f1220p
            java.lang.Object r2 = r2.get(r4)
            b.i.a.f$o r2 = (b.i.a.f.o) r2
            float r2 = r2.d(r12)
            goto L_0x0782
        L_0x0781:
            r2 = r6
        L_0x0782:
            java.util.List<b.i.a.f$o> r3 = r13.f1221q
            if (r3 == 0) goto L_0x0799
            int r3 = r3.size()
            if (r3 != 0) goto L_0x078d
            goto L_0x0799
        L_0x078d:
            java.util.List<b.i.a.f$o> r3 = r13.f1221q
            java.lang.Object r3 = r3.get(r4)
            b.i.a.f$o r3 = (b.i.a.f.o) r3
            float r6 = r3.f(r12)
        L_0x0799:
            b.i.a.f$d0$f r3 = r12.x()
            b.i.a.f$d0$f r4 = b.i.a.f.d0.C0042f.Start
            if (r3 == r4) goto L_0x07ad
            float r4 = r12.d(r13)
            b.i.a.f$d0$f r5 = b.i.a.f.d0.C0042f.Middle
            if (r3 != r5) goto L_0x07ac
            r3 = 1073741824(0x40000000, float:2.0)
            float r4 = r4 / r3
        L_0x07ac:
            float r0 = r0 - r4
        L_0x07ad:
            b.i.a.f$a r3 = r13.f1174h
            if (r3 != 0) goto L_0x07d0
            b.i.a.g$i r3 = new b.i.a.g$i
            r3.<init>(r0, r1)
            r12.p(r13, r3)
            b.i.a.f$a r4 = new b.i.a.f$a
            android.graphics.RectF r5 = r3.c
            float r7 = r5.left
            float r8 = r5.top
            float r5 = r5.width()
            android.graphics.RectF r3 = r3.c
            float r3 = r3.height()
            r4.<init>(r7, r8, r5, r3)
            r13.f1174h = r4
        L_0x07d0:
            r12.V(r13)
            r12.g(r13)
            b.i.a.f$a r3 = r13.f1174h
            r12.f(r13, r3)
            boolean r3 = r12.J()
            b.i.a.g$f r4 = new b.i.a.g$f
            float r0 = r0 + r2
            float r1 = r1 + r6
            r4.<init>(r0, r1)
            r12.p(r13, r4)
            if (r3 == 0) goto L_0x07ee
            r12.H(r13)
        L_0x07ee:
            r12.S()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: b.i.a.g.L(b.i.a.f$m0):void");
    }

    public final void M(f.i0 i0Var, boolean z) {
        if (z) {
            this.f1224e.push(i0Var);
            this.f.push(this.a.getMatrix());
        }
        for (f.m0 L : ((f.g0) i0Var).f1152i) {
            L(L);
        }
        if (z) {
            this.f1224e.pop();
            this.f.pop();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:62:0x00fd, code lost:
        r1 = 0.0f - r13;
     */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0079  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x007e  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00f7  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x00fa  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x00fe A[PHI: r1 
      PHI: (r1v1 float) = (r1v0 float), (r1v2 float) binds: [B:59:0x00f3, B:62:0x00fd] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0119  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x013c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void N(b.i.a.f.q r12, b.i.a.g.c r13) {
        /*
            r11 = this;
            r11.T()
            java.lang.Float r0 = r12.u
            r1 = 0
            if (r0 == 0) goto L_0x0033
            float r0 = r0.floatValue()
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 == 0) goto L_0x002c
            float r0 = r13.c
            int r2 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r2 != 0) goto L_0x001e
            float r2 = r13.d
            int r2 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r2 == 0) goto L_0x0033
        L_0x001e:
            float r2 = r13.d
            double r2 = (double) r2
            double r4 = (double) r0
            double r2 = java.lang.Math.atan2(r2, r4)
            double r2 = java.lang.Math.toDegrees(r2)
            float r0 = (float) r2
            goto L_0x0034
        L_0x002c:
            java.lang.Float r0 = r12.u
            float r0 = r0.floatValue()
            goto L_0x0034
        L_0x0033:
            r0 = r1
        L_0x0034:
            boolean r2 = r12.f1198p
            if (r2 == 0) goto L_0x003b
            r2 = 1065353216(0x3f800000, float:1.0)
            goto L_0x0047
        L_0x003b:
            b.i.a.g$h r2 = r11.c
            b.i.a.f$d0 r2 = r2.a
            b.i.a.f$o r2 = r2.f1104n
            r3 = 1119879168(0x42c00000, float:96.0)
            float r2 = r2.a(r3)
        L_0x0047:
            b.i.a.g$h r3 = r11.v(r12)
            r11.c = r3
            android.graphics.Matrix r3 = new android.graphics.Matrix
            r3.<init>()
            float r4 = r13.a
            float r13 = r13.f1230b
            r3.preTranslate(r4, r13)
            r3.preRotate(r0)
            r3.preScale(r2, r2)
            b.i.a.f$o r13 = r12.f1199q
            if (r13 == 0) goto L_0x0068
            float r13 = r13.d(r11)
            goto L_0x0069
        L_0x0068:
            r13 = r1
        L_0x0069:
            b.i.a.f$o r0 = r12.r
            if (r0 == 0) goto L_0x0072
            float r0 = r0.f(r11)
            goto L_0x0073
        L_0x0072:
            r0 = r1
        L_0x0073:
            b.i.a.f$o r2 = r12.s
            r4 = 1077936128(0x40400000, float:3.0)
            if (r2 == 0) goto L_0x007e
            float r2 = r2.d(r11)
            goto L_0x007f
        L_0x007e:
            r2 = r4
        L_0x007f:
            b.i.a.f$o r5 = r12.t
            if (r5 == 0) goto L_0x0087
            float r4 = r5.f(r11)
        L_0x0087:
            b.i.a.f$a r5 = r12.f1200o
            if (r5 == 0) goto L_0x0119
            float r6 = r5.c
            float r6 = r2 / r6
            float r5 = r5.d
            float r5 = r4 / r5
            b.i.a.e r7 = r12.f1189n
            if (r7 == 0) goto L_0x0098
            goto L_0x009a
        L_0x0098:
            b.i.a.e r7 = b.i.a.e.d
        L_0x009a:
            b.i.a.e r8 = b.i.a.e.c
            boolean r8 = r7.equals(r8)
            if (r8 != 0) goto L_0x00b3
            b.i.a.e$b r8 = r7.f1063b
            b.i.a.e$b r9 = b.i.a.e.b.slice
            if (r8 != r9) goto L_0x00ad
            float r5 = java.lang.Math.max(r6, r5)
            goto L_0x00b1
        L_0x00ad:
            float r5 = java.lang.Math.min(r6, r5)
        L_0x00b1:
            r6 = r5
            r5 = r6
        L_0x00b3:
            float r13 = -r13
            float r13 = r13 * r6
            float r0 = -r0
            float r0 = r0 * r5
            r3.preTranslate(r13, r0)
            android.graphics.Canvas r13 = r11.a
            r13.concat(r3)
            b.i.a.f$a r13 = r12.f1200o
            float r0 = r13.c
            float r0 = r0 * r6
            float r13 = r13.d
            float r13 = r13 * r5
            b.i.a.e$a r8 = r7.a
            int r8 = r8.ordinal()
            r9 = 2
            r10 = 1073741824(0x40000000, float:2.0)
            if (r8 == r9) goto L_0x00e8
            r9 = 3
            if (r8 == r9) goto L_0x00e5
            r9 = 5
            if (r8 == r9) goto L_0x00e8
            r9 = 6
            if (r8 == r9) goto L_0x00e5
            r9 = 8
            if (r8 == r9) goto L_0x00e8
            r9 = 9
            if (r8 == r9) goto L_0x00e5
            r0 = r1
            goto L_0x00ed
        L_0x00e5:
            float r0 = r2 - r0
            goto L_0x00eb
        L_0x00e8:
            float r0 = r2 - r0
            float r0 = r0 / r10
        L_0x00eb:
            float r0 = r1 - r0
        L_0x00ed:
            b.i.a.e$a r7 = r7.a
            int r7 = r7.ordinal()
            switch(r7) {
                case 4: goto L_0x00fa;
                case 5: goto L_0x00fa;
                case 6: goto L_0x00fa;
                case 7: goto L_0x00f7;
                case 8: goto L_0x00f7;
                case 9: goto L_0x00f7;
                default: goto L_0x00f6;
            }
        L_0x00f6:
            goto L_0x00fe
        L_0x00f7:
            float r13 = r4 - r13
            goto L_0x00fd
        L_0x00fa:
            float r13 = r4 - r13
            float r13 = r13 / r10
        L_0x00fd:
            float r1 = r1 - r13
        L_0x00fe:
            b.i.a.g$h r13 = r11.c
            b.i.a.f$d0 r13 = r13.a
            java.lang.Boolean r13 = r13.C
            boolean r13 = r13.booleanValue()
            if (r13 != 0) goto L_0x010d
            r11.Q(r0, r1, r2, r4)
        L_0x010d:
            r3.reset()
            r3.preScale(r6, r5)
            android.graphics.Canvas r13 = r11.a
            r13.concat(r3)
            goto L_0x0132
        L_0x0119:
            float r13 = -r13
            float r0 = -r0
            r3.preTranslate(r13, r0)
            android.graphics.Canvas r13 = r11.a
            r13.concat(r3)
            b.i.a.g$h r13 = r11.c
            b.i.a.f$d0 r13 = r13.a
            java.lang.Boolean r13 = r13.C
            boolean r13 = r13.booleanValue()
            if (r13 != 0) goto L_0x0132
            r11.Q(r1, r1, r2, r4)
        L_0x0132:
            boolean r13 = r11.J()
            r0 = 0
            r11.M(r12, r0)
            if (r13 == 0) goto L_0x0141
            b.i.a.f$a r13 = r12.f1174h
            r11.I(r12, r13)
        L_0x0141:
            r11.S()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: b.i.a.g.N(b.i.a.f$q, b.i.a.g$c):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x007e  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0188 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0189  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void O(b.i.a.f.k r23) {
        /*
            r22 = this;
            r6 = r22
            r0 = r23
            b.i.a.g$h r1 = r6.c
            b.i.a.f$d0 r1 = r1.a
            java.lang.String r2 = r1.E
            if (r2 != 0) goto L_0x0015
            java.lang.String r3 = r1.F
            if (r3 != 0) goto L_0x0015
            java.lang.String r1 = r1.G
            if (r1 != 0) goto L_0x0015
            return
        L_0x0015:
            java.lang.String r1 = "Marker reference '%s' not found"
            r7 = 0
            r8 = 1
            if (r2 == 0) goto L_0x0034
            b.i.a.f r3 = r0.a
            b.i.a.f$m0 r2 = r3.g(r2)
            if (r2 == 0) goto L_0x0027
            b.i.a.f$q r2 = (b.i.a.f.q) r2
            r10 = r2
            goto L_0x0035
        L_0x0027:
            java.lang.Object[] r2 = new java.lang.Object[r8]
            b.i.a.g$h r3 = r6.c
            b.i.a.f$d0 r3 = r3.a
            java.lang.String r3 = r3.E
            r2[r7] = r3
            q(r1, r2)
        L_0x0034:
            r10 = 0
        L_0x0035:
            b.i.a.g$h r2 = r6.c
            b.i.a.f$d0 r2 = r2.a
            java.lang.String r2 = r2.F
            if (r2 == 0) goto L_0x0056
            b.i.a.f r3 = r0.a
            b.i.a.f$m0 r2 = r3.g(r2)
            if (r2 == 0) goto L_0x0049
            b.i.a.f$q r2 = (b.i.a.f.q) r2
            r11 = r2
            goto L_0x0057
        L_0x0049:
            java.lang.Object[] r2 = new java.lang.Object[r8]
            b.i.a.g$h r3 = r6.c
            b.i.a.f$d0 r3 = r3.a
            java.lang.String r3 = r3.F
            r2[r7] = r3
            q(r1, r2)
        L_0x0056:
            r11 = 0
        L_0x0057:
            b.i.a.g$h r2 = r6.c
            b.i.a.f$d0 r2 = r2.a
            java.lang.String r2 = r2.G
            if (r2 == 0) goto L_0x0078
            b.i.a.f r3 = r0.a
            b.i.a.f$m0 r2 = r3.g(r2)
            if (r2 == 0) goto L_0x006b
            b.i.a.f$q r2 = (b.i.a.f.q) r2
            r12 = r2
            goto L_0x0079
        L_0x006b:
            java.lang.Object[] r2 = new java.lang.Object[r8]
            b.i.a.g$h r3 = r6.c
            b.i.a.f$d0 r3 = r3.a
            java.lang.String r3 = r3.G
            r2[r7] = r3
            q(r1, r2)
        L_0x0078:
            r12 = 0
        L_0x0079:
            boolean r1 = r0 instanceof b.i.a.f.u
            r13 = 2
            if (r1 == 0) goto L_0x008b
            b.i.a.g$b r1 = new b.i.a.g$b
            b.i.a.f$u r0 = (b.i.a.f.u) r0
            b.i.a.f$v r0 = r0.f1209o
            r1.<init>(r0)
            java.util.List<b.i.a.g$c> r0 = r1.a
            goto L_0x017f
        L_0x008b:
            boolean r1 = r0 instanceof b.i.a.f.p
            if (r1 == 0) goto L_0x00e8
            b.i.a.f$p r0 = (b.i.a.f.p) r0
            b.i.a.f$o r1 = r0.f1190o
            if (r1 == 0) goto L_0x009b
            float r1 = r1.d(r6)
            r2 = r1
            goto L_0x009c
        L_0x009b:
            r2 = 0
        L_0x009c:
            b.i.a.f$o r1 = r0.f1191p
            if (r1 == 0) goto L_0x00a6
            float r1 = r1.f(r6)
            r3 = r1
            goto L_0x00a7
        L_0x00a6:
            r3 = 0
        L_0x00a7:
            b.i.a.f$o r1 = r0.f1192q
            if (r1 == 0) goto L_0x00b1
            float r1 = r1.d(r6)
            r15 = r1
            goto L_0x00b2
        L_0x00b1:
            r15 = 0
        L_0x00b2:
            b.i.a.f$o r0 = r0.r
            if (r0 == 0) goto L_0x00bd
            float r0 = r0.f(r6)
            r16 = r0
            goto L_0x00bf
        L_0x00bd:
            r16 = 0
        L_0x00bf:
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>(r13)
            b.i.a.g$c r4 = new b.i.a.g$c
            float r17 = r15 - r2
            float r18 = r16 - r3
            r0 = r4
            r1 = r22
            r14 = r4
            r4 = r17
            r9 = r5
            r5 = r18
            r0.<init>(r1, r2, r3, r4, r5)
            r9.add(r14)
            b.i.a.g$c r14 = new b.i.a.g$c
            r0 = r14
            r2 = r15
            r3 = r16
            r0.<init>(r1, r2, r3, r4, r5)
            r9.add(r14)
            r0 = r9
            goto L_0x017f
        L_0x00e8:
            r9 = r0
            b.i.a.f$y r9 = (b.i.a.f.y) r9
            float[] r0 = r9.f1214o
            int r14 = r0.length
            if (r14 >= r13) goto L_0x00f3
            r0 = 0
            goto L_0x017f
        L_0x00f3:
            java.util.ArrayList r15 = new java.util.ArrayList
            r15.<init>()
            b.i.a.g$c r16 = new b.i.a.g$c
            float[] r0 = r9.f1214o
            r2 = r0[r7]
            r3 = r0[r8]
            r4 = 0
            r5 = 0
            r0 = r16
            r1 = r22
            r0.<init>(r1, r2, r3, r4, r5)
            r5 = r13
            r1 = 0
            r2 = 0
        L_0x010c:
            if (r5 >= r14) goto L_0x013f
            float[] r1 = r9.f1214o
            r4 = r1[r5]
            int r2 = r5 + 1
            r3 = r1[r2]
            r0.a(r4, r3)
            r15.add(r0)
            b.i.a.g$c r16 = new b.i.a.g$c
            float r1 = r0.a
            float r17 = r4 - r1
            float r0 = r0.f1230b
            float r18 = r3 - r0
            r0 = r16
            r1 = r22
            r2 = r4
            r19 = r3
            r20 = r4
            r4 = r17
            r17 = r5
            r5 = r18
            r0.<init>(r1, r2, r3, r4, r5)
            int r5 = r17 + 2
            r2 = r19
            r1 = r20
            goto L_0x010c
        L_0x013f:
            boolean r3 = r9 instanceof b.i.a.f.z
            if (r3 == 0) goto L_0x017b
            float[] r3 = r9.f1214o
            r4 = r3[r7]
            int r1 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r1 == 0) goto L_0x017e
            r1 = r3[r8]
            int r1 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r1 == 0) goto L_0x017e
            r2 = r3[r7]
            r3 = r3[r8]
            r0.a(r2, r3)
            r15.add(r0)
            b.i.a.g$c r9 = new b.i.a.g$c
            float r1 = r0.a
            float r4 = r2 - r1
            float r0 = r0.f1230b
            float r5 = r3 - r0
            r0 = r9
            r1 = r22
            r0.<init>(r1, r2, r3, r4, r5)
            java.lang.Object r0 = r15.get(r7)
            b.i.a.g$c r0 = (b.i.a.g.c) r0
            r9.b(r0)
            r15.add(r9)
            r15.set(r7, r9)
            goto L_0x017e
        L_0x017b:
            r15.add(r0)
        L_0x017e:
            r0 = r15
        L_0x017f:
            if (r0 != 0) goto L_0x0182
            return
        L_0x0182:
            int r1 = r0.size()
            if (r1 != 0) goto L_0x0189
            return
        L_0x0189:
            b.i.a.g$h r2 = r6.c
            b.i.a.f$d0 r2 = r2.a
            r3 = 0
            r2.G = r3
            r2.F = r3
            r2.E = r3
            if (r10 == 0) goto L_0x019f
            java.lang.Object r2 = r0.get(r7)
            b.i.a.g$c r2 = (b.i.a.g.c) r2
            r6.N(r10, r2)
        L_0x019f:
            if (r11 == 0) goto L_0x0208
            int r2 = r0.size()
            if (r2 <= r13) goto L_0x0208
            java.lang.Object r2 = r0.get(r7)
            b.i.a.g$c r2 = (b.i.a.g.c) r2
            java.lang.Object r3 = r0.get(r8)
            b.i.a.g$c r3 = (b.i.a.g.c) r3
            r4 = r8
            r21 = r3
            r3 = r2
            r2 = r21
        L_0x01b9:
            int r5 = r1 + -1
            if (r4 >= r5) goto L_0x0208
            int r4 = r4 + 1
            java.lang.Object r5 = r0.get(r4)
            b.i.a.g$c r5 = (b.i.a.g.c) r5
            boolean r7 = r2.f1231e
            if (r7 == 0) goto L_0x0201
            float r7 = r2.c
            float r9 = r2.d
            float r10 = r2.a
            float r13 = r3.a
            float r13 = r10 - r13
            float r14 = r2.f1230b
            float r3 = r3.f1230b
            float r3 = r14 - r3
            float r13 = r13 * r7
            float r3 = r3 * r9
            float r3 = r3 + r13
            r13 = 0
            int r15 = (r3 > r13 ? 1 : (r3 == r13 ? 0 : -1))
            if (r15 != 0) goto L_0x01ea
            float r3 = r5.a
            float r3 = r3 - r10
            float r10 = r5.f1230b
            float r10 = r10 - r14
            float r3 = r3 * r7
            float r10 = r10 * r9
            float r3 = r3 + r10
        L_0x01ea:
            int r3 = (r3 > r13 ? 1 : (r3 == r13 ? 0 : -1))
            if (r3 <= 0) goto L_0x01ef
            goto L_0x0202
        L_0x01ef:
            if (r3 != 0) goto L_0x01fa
            int r3 = (r7 > r13 ? 1 : (r7 == r13 ? 0 : -1))
            if (r3 > 0) goto L_0x0202
            int r3 = (r9 > r13 ? 1 : (r9 == r13 ? 0 : -1))
            if (r3 < 0) goto L_0x01fa
            goto L_0x0202
        L_0x01fa:
            float r3 = -r7
            r2.c = r3
            float r3 = -r9
            r2.d = r3
            goto L_0x0202
        L_0x0201:
            r13 = 0
        L_0x0202:
            r6.N(r11, r2)
            r3 = r2
            r2 = r5
            goto L_0x01b9
        L_0x0208:
            if (r12 == 0) goto L_0x0214
            int r1 = r1 - r8
            java.lang.Object r0 = r0.get(r1)
            b.i.a.g$c r0 = (b.i.a.g.c) r0
            r6.N(r12, r0)
        L_0x0214:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: b.i.a.g.O(b.i.a.f$k):void");
    }

    public final void P(f.r rVar, f.j0 j0Var, f.a aVar) {
        float f2;
        float f3;
        Boolean bool = rVar.f1201n;
        boolean z = true;
        if (bool != null && bool.booleanValue()) {
            f.o oVar = rVar.f1203p;
            f3 = oVar != null ? oVar.d(this) : aVar.c;
            f.o oVar2 = rVar.f1204q;
            f2 = oVar2 != null ? oVar2.f(this) : aVar.d;
        } else {
            f.o oVar3 = rVar.f1203p;
            float f4 = 1.2f;
            float c2 = oVar3 != null ? oVar3.c(this, 1.0f) : 1.2f;
            f.o oVar4 = rVar.f1204q;
            if (oVar4 != null) {
                f4 = oVar4.c(this, 1.0f);
            }
            f3 = c2 * aVar.c;
            f2 = f4 * aVar.d;
        }
        if (f3 != 0.0f && f2 != 0.0f) {
            T();
            h v = v(rVar);
            this.c = v;
            v.a.t = Float.valueOf(1.0f);
            boolean J = J();
            this.a.save();
            Boolean bool2 = rVar.f1202o;
            if (bool2 != null && !bool2.booleanValue()) {
                z = false;
            }
            if (!z) {
                this.a.translate(aVar.a, aVar.f1078b);
                this.a.scale(aVar.c, aVar.d);
            }
            M(rVar, false);
            this.a.restore();
            if (J) {
                I(j0Var, aVar);
            }
            S();
        }
    }

    public final void Q(float f2, float f3, float f4, float f5) {
        float f6 = f4 + f2;
        float f7 = f5 + f3;
        f.b bVar = this.c.a.D;
        if (bVar != null) {
            f2 += bVar.d.d(this);
            f3 += this.c.a.D.a.f(this);
            f6 -= this.c.a.D.f1082b.d(this);
            f7 -= this.c.a.D.c.f(this);
        }
        this.a.clipRect(f2, f3, f6, f7);
    }

    public final void R(h hVar, boolean z, f.n0 n0Var) {
        f.e eVar;
        f.d0 d0Var = hVar.a;
        float floatValue = (z ? d0Var.f1101k : d0Var.f1103m).floatValue();
        if (n0Var instanceof f.e) {
            eVar = (f.e) n0Var;
        } else if (n0Var instanceof f.C0043f) {
            eVar = hVar.a.u;
        } else {
            return;
        }
        (z ? hVar.d : hVar.f1237e).setColor(k(eVar.f1148h, floatValue));
    }

    public final void S() {
        this.a.restore();
        this.c = this.d.pop();
    }

    public final void T() {
        this.a.save();
        this.d.push(this.c);
        this.c = new h(this, this.c);
    }

    public final String U(String str, boolean z, boolean z2) {
        String str2;
        if (this.c.f1239h) {
            str2 = "[\\n\\t]";
        } else {
            str = str.replaceAll("\\n", "").replaceAll("\\t", " ");
            if (z) {
                str = str.replaceAll("^\\s+", "");
            }
            if (z2) {
                str = str.replaceAll("\\s+$", "");
            }
            str2 = "\\s{2,}";
        }
        return str.replaceAll(str2, " ");
    }

    public final void V(f.j0 j0Var) {
        if (j0Var.f1183b != null && j0Var.f1174h != null) {
            Matrix matrix = new Matrix();
            if (this.f.peek().invert(matrix)) {
                f.a aVar = j0Var.f1174h;
                f.a aVar2 = j0Var.f1174h;
                f.a aVar3 = j0Var.f1174h;
                float[] fArr = {aVar.a, aVar.f1078b, aVar.a(), aVar2.f1078b, aVar2.a(), j0Var.f1174h.b(), aVar3.a, aVar3.b()};
                matrix.preConcat(this.a.getMatrix());
                matrix.mapPoints(fArr);
                RectF rectF = new RectF(fArr[0], fArr[1], fArr[0], fArr[1]);
                for (int i2 = 2; i2 <= 6; i2 += 2) {
                    if (fArr[i2] < rectF.left) {
                        rectF.left = fArr[i2];
                    }
                    if (fArr[i2] > rectF.right) {
                        rectF.right = fArr[i2];
                    }
                    int i3 = i2 + 1;
                    if (fArr[i3] < rectF.top) {
                        rectF.top = fArr[i3];
                    }
                    if (fArr[i3] > rectF.bottom) {
                        rectF.bottom = fArr[i3];
                    }
                }
                f.j0 j0Var2 = (f.j0) this.f1224e.peek();
                f.a aVar4 = j0Var2.f1174h;
                if (aVar4 == null) {
                    float f2 = rectF.left;
                    float f3 = rectF.top;
                    j0Var2.f1174h = new f.a(f2, f3, rectF.right - f2, rectF.bottom - f3);
                    return;
                }
                float f4 = rectF.left;
                float f5 = rectF.top;
                float f6 = rectF.right - f4;
                float f7 = rectF.bottom - f5;
                if (f4 < aVar4.a) {
                    aVar4.a = f4;
                }
                if (f5 < aVar4.f1078b) {
                    aVar4.f1078b = f5;
                }
                float f8 = f4 + f6;
                if (f8 > aVar4.a()) {
                    aVar4.c = f8 - aVar4.a;
                }
                float f9 = f5 + f7;
                if (f9 > aVar4.b()) {
                    aVar4.d = f9 - aVar4.f1078b;
                }
            }
        }
    }

    public final void W(h hVar, f.d0 d0Var) {
        Integer num;
        f.d0 d0Var2;
        int i2;
        Paint.Join join;
        Paint paint;
        Paint.Cap cap;
        Paint paint2;
        f.e eVar = f.e.f1147j;
        if (A(d0Var, 4096)) {
            hVar.a.u = d0Var.u;
        }
        if (A(d0Var, 2048)) {
            hVar.a.t = d0Var.t;
        }
        boolean z = false;
        if (A(d0Var, 1)) {
            hVar.a.f1099i = d0Var.f1099i;
            f.n0 n0Var = d0Var.f1099i;
            hVar.f1236b = (n0Var == null || n0Var == eVar) ? false : true;
        }
        if (A(d0Var, 4)) {
            hVar.a.f1101k = d0Var.f1101k;
        }
        if (A(d0Var, 6149)) {
            R(hVar, true, hVar.a.f1099i);
        }
        if (A(d0Var, 2)) {
            hVar.a.f1100j = d0Var.f1100j;
        }
        if (A(d0Var, 8)) {
            hVar.a.f1102l = d0Var.f1102l;
            f.n0 n0Var2 = d0Var.f1102l;
            hVar.c = (n0Var2 == null || n0Var2 == eVar) ? false : true;
        }
        if (A(d0Var, 16)) {
            hVar.a.f1103m = d0Var.f1103m;
        }
        if (A(d0Var, 6168)) {
            R(hVar, false, hVar.a.f1102l);
        }
        if (A(d0Var, 34359738368L)) {
            hVar.a.S = d0Var.S;
        }
        if (A(d0Var, 32)) {
            f.d0 d0Var3 = hVar.a;
            f.o oVar = d0Var.f1104n;
            d0Var3.f1104n = oVar;
            hVar.f1237e.setStrokeWidth(oVar.b(this));
        }
        if (A(d0Var, 64)) {
            hVar.a.f1105o = d0Var.f1105o;
            int ordinal = d0Var.f1105o.ordinal();
            if (ordinal == 0) {
                paint2 = hVar.f1237e;
                cap = Paint.Cap.BUTT;
            } else if (ordinal == 1) {
                paint2 = hVar.f1237e;
                cap = Paint.Cap.ROUND;
            } else if (ordinal == 2) {
                paint2 = hVar.f1237e;
                cap = Paint.Cap.SQUARE;
            }
            paint2.setStrokeCap(cap);
        }
        if (A(d0Var, 128)) {
            hVar.a.f1106p = d0Var.f1106p;
            int ordinal2 = d0Var.f1106p.ordinal();
            if (ordinal2 == 0) {
                paint = hVar.f1237e;
                join = Paint.Join.MITER;
            } else if (ordinal2 == 1) {
                paint = hVar.f1237e;
                join = Paint.Join.ROUND;
            } else if (ordinal2 == 2) {
                paint = hVar.f1237e;
                join = Paint.Join.BEVEL;
            }
            paint.setStrokeJoin(join);
        }
        if (A(d0Var, 256)) {
            hVar.a.f1107q = d0Var.f1107q;
            hVar.f1237e.setStrokeMiter(d0Var.f1107q.floatValue());
        }
        if (A(d0Var, 512)) {
            hVar.a.r = d0Var.r;
        }
        if (A(d0Var, 1024)) {
            hVar.a.s = d0Var.s;
        }
        Typeface typeface = null;
        if (A(d0Var, 1536)) {
            f.o[] oVarArr = hVar.a.r;
            if (oVarArr != null) {
                int length = oVarArr.length;
                int i3 = length % 2 == 0 ? length : length * 2;
                float[] fArr = new float[i3];
                float f2 = 0.0f;
                for (int i4 = 0; i4 < i3; i4++) {
                    fArr[i4] = hVar.a.r[i4 % length].b(this);
                    f2 += fArr[i4];
                }
                if (f2 != 0.0f) {
                    float b2 = hVar.a.s.b(this);
                    if (b2 < 0.0f) {
                        b2 = (b2 % f2) + f2;
                    }
                    hVar.f1237e.setPathEffect(new DashPathEffect(fArr, b2));
                }
            }
            hVar.f1237e.setPathEffect((PathEffect) null);
        }
        if (A(d0Var, 16384)) {
            float textSize = this.c.d.getTextSize();
            hVar.a.w = d0Var.w;
            hVar.d.setTextSize(d0Var.w.c(this, textSize));
            hVar.f1237e.setTextSize(d0Var.w.c(this, textSize));
        }
        if (A(d0Var, 8192)) {
            hVar.a.v = d0Var.v;
        }
        if (A(d0Var, 32768)) {
            if (d0Var.x.intValue() == -1 && hVar.a.x.intValue() > 100) {
                d0Var2 = hVar.a;
                i2 = d0Var2.x.intValue() - 100;
            } else if (d0Var.x.intValue() != 1 || hVar.a.x.intValue() >= 900) {
                d0Var2 = hVar.a;
                num = d0Var.x;
                d0Var2.x = num;
            } else {
                d0Var2 = hVar.a;
                i2 = d0Var2.x.intValue() + 100;
            }
            num = Integer.valueOf(i2);
            d0Var2.x = num;
        }
        if (A(d0Var, 65536)) {
            hVar.a.y = d0Var.y;
        }
        if (A(d0Var, 106496)) {
            List<String> list = hVar.a.v;
            if (list != null && this.f1223b != null) {
                for (String h2 : list) {
                    f.d0 d0Var4 = hVar.a;
                    typeface = h(h2, d0Var4.x, d0Var4.y);
                    if (typeface != null) {
                        break;
                    }
                }
            }
            if (typeface == null) {
                f.d0 d0Var5 = hVar.a;
                typeface = h("serif", d0Var5.x, d0Var5.y);
            }
            hVar.d.setTypeface(typeface);
            hVar.f1237e.setTypeface(typeface);
        }
        if (A(d0Var, 131072)) {
            hVar.a.z = d0Var.z;
            Paint paint3 = hVar.d;
            f.d0.g gVar = d0Var.z;
            f.d0.g gVar2 = f.d0.g.LineThrough;
            paint3.setStrikeThruText(gVar == gVar2);
            Paint paint4 = hVar.d;
            f.d0.g gVar3 = d0Var.z;
            f.d0.g gVar4 = f.d0.g.Underline;
            paint4.setUnderlineText(gVar3 == gVar4);
            hVar.f1237e.setStrikeThruText(d0Var.z == gVar2);
            Paint paint5 = hVar.f1237e;
            if (d0Var.z == gVar4) {
                z = true;
            }
            paint5.setUnderlineText(z);
        }
        if (A(d0Var, 68719476736L)) {
            hVar.a.A = d0Var.A;
        }
        if (A(d0Var, 262144)) {
            hVar.a.B = d0Var.B;
        }
        if (A(d0Var, 524288)) {
            hVar.a.C = d0Var.C;
        }
        if (A(d0Var, 2097152)) {
            hVar.a.E = d0Var.E;
        }
        if (A(d0Var, 4194304)) {
            hVar.a.F = d0Var.F;
        }
        if (A(d0Var, 8388608)) {
            hVar.a.G = d0Var.G;
        }
        if (A(d0Var, 16777216)) {
            hVar.a.H = d0Var.H;
        }
        if (A(d0Var, 33554432)) {
            hVar.a.I = d0Var.I;
        }
        if (A(d0Var, 1048576)) {
            hVar.a.D = d0Var.D;
        }
        if (A(d0Var, 268435456)) {
            hVar.a.L = d0Var.L;
        }
        if (A(d0Var, 536870912)) {
            hVar.a.M = d0Var.M;
        }
        if (A(d0Var, 1073741824)) {
            hVar.a.N = d0Var.N;
        }
        if (A(d0Var, 67108864)) {
            hVar.a.J = d0Var.J;
        }
        if (A(d0Var, 134217728)) {
            hVar.a.K = d0Var.K;
        }
        if (A(d0Var, 8589934592L)) {
            hVar.a.Q = d0Var.Q;
        }
        if (A(d0Var, 17179869184L)) {
            hVar.a.R = d0Var.R;
        }
        if (A(d0Var, 137438953472L)) {
            hVar.a.T = d0Var.T;
        }
    }

    public final void X(h hVar, f.k0 k0Var) {
        boolean z = false;
        boolean z2 = k0Var.f1183b == null;
        f.d0 d0Var = hVar.a;
        Boolean bool = Boolean.TRUE;
        d0Var.H = bool;
        if (!z2) {
            bool = Boolean.FALSE;
        }
        d0Var.C = bool;
        d0Var.D = null;
        d0Var.L = null;
        d0Var.t = Float.valueOf(1.0f);
        d0Var.J = f.e.f1146i;
        d0Var.K = Float.valueOf(1.0f);
        d0Var.N = null;
        d0Var.O = null;
        d0Var.P = Float.valueOf(1.0f);
        d0Var.Q = null;
        d0Var.R = Float.valueOf(1.0f);
        d0Var.S = f.d0.i.None;
        f.d0 d0Var2 = k0Var.f1176e;
        if (d0Var2 != null) {
            W(hVar, d0Var2);
        }
        List<b.p> list = this.f1223b.f1077b.a;
        if (list == null || list.isEmpty()) {
            z = true;
        }
        if (true ^ z) {
            for (b.p next : this.f1223b.f1077b.a) {
                if (b.h((b.q) null, next.a, k0Var)) {
                    W(hVar, next.f1055b);
                }
            }
        }
        f.d0 d0Var3 = k0Var.f;
        if (d0Var3 != null) {
            W(hVar, d0Var3);
        }
    }

    public final void Y() {
        f.e eVar;
        f.d0 d0Var = this.c.a;
        f.n0 n0Var = d0Var.Q;
        if (n0Var instanceof f.e) {
            eVar = (f.e) n0Var;
        } else if (n0Var instanceof f.C0043f) {
            eVar = d0Var.u;
        } else {
            return;
        }
        int i2 = eVar.f1148h;
        Float f2 = d0Var.R;
        if (f2 != null) {
            i2 = k(i2, f2.floatValue());
        }
        this.a.drawColor(i2);
    }

    public final boolean Z() {
        Boolean bool = this.c.a.I;
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    @TargetApi(19)
    public final Path b(f.j0 j0Var, f.a aVar) {
        Path G;
        f.m0 g2 = j0Var.a.g(this.c.a.L);
        boolean z = false;
        if (g2 == null) {
            q("ClipPath reference '%s' not found", this.c.a.L);
            return null;
        }
        f.d dVar = (f.d) g2;
        this.d.push(this.c);
        this.c = v(dVar);
        Boolean bool = dVar.f1097o;
        if (bool == null || bool.booleanValue()) {
            z = true;
        }
        Matrix matrix = new Matrix();
        if (!z) {
            matrix.preTranslate(aVar.a, aVar.f1078b);
            matrix.preScale(aVar.c, aVar.d);
        }
        Matrix matrix2 = dVar.f1178n;
        if (matrix2 != null) {
            matrix.preConcat(matrix2);
        }
        Path path = new Path();
        for (f.m0 next : dVar.f1152i) {
            if ((next instanceof f.j0) && (G = G((f.j0) next, true)) != null) {
                path.op(G, Path.Op.UNION);
            }
        }
        if (this.c.a.L != null) {
            if (dVar.f1174h == null) {
                dVar.f1174h = c(path);
            }
            Path b2 = b(dVar, dVar.f1174h);
            if (b2 != null) {
                path.op(b2, Path.Op.INTERSECT);
            }
        }
        path.transform(matrix);
        this.c = this.d.pop();
        return path;
    }

    public final f.a c(Path path) {
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        return new f.a(rectF.left, rectF.top, rectF.width(), rectF.height());
    }

    public final float d(f.x0 x0Var) {
        k kVar = new k((a) null);
        p(x0Var, kVar);
        return kVar.a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x005f, code lost:
        if (r6 != 9) goto L_0x006b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x007d, code lost:
        r4 = r4 - r11;
     */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0075  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0079  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x007e A[PHI: r4 
      PHI: (r4v3 float) = (r4v1 float), (r4v4 float) binds: [B:27:0x0071, B:30:0x007d] A[DONT_GENERATE, DONT_INLINE]] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.graphics.Matrix e(b.i.a.f.a r10, b.i.a.f.a r11, b.i.a.e r12) {
        /*
            r9 = this;
            android.graphics.Matrix r0 = new android.graphics.Matrix
            r0.<init>()
            if (r12 == 0) goto L_0x008b
            b.i.a.e$a r1 = r12.a
            if (r1 != 0) goto L_0x000d
            goto L_0x008b
        L_0x000d:
            float r1 = r10.c
            float r2 = r11.c
            float r1 = r1 / r2
            float r2 = r10.d
            float r3 = r11.d
            float r2 = r2 / r3
            float r3 = r11.a
            float r3 = -r3
            float r4 = r11.f1078b
            float r4 = -r4
            b.i.a.e r5 = b.i.a.e.c
            boolean r5 = r12.equals(r5)
            if (r5 == 0) goto L_0x0030
            float r11 = r10.a
            float r10 = r10.f1078b
            r0.preTranslate(r11, r10)
            r0.preScale(r1, r2)
            goto L_0x0088
        L_0x0030:
            b.i.a.e$b r5 = r12.f1063b
            b.i.a.e$b r6 = b.i.a.e.b.slice
            if (r5 != r6) goto L_0x003b
            float r1 = java.lang.Math.max(r1, r2)
            goto L_0x003f
        L_0x003b:
            float r1 = java.lang.Math.min(r1, r2)
        L_0x003f:
            float r2 = r10.c
            float r2 = r2 / r1
            float r5 = r10.d
            float r5 = r5 / r1
            b.i.a.e$a r6 = r12.a
            int r6 = r6.ordinal()
            r7 = 2
            r8 = 1073741824(0x40000000, float:2.0)
            if (r6 == r7) goto L_0x0066
            r7 = 3
            if (r6 == r7) goto L_0x0062
            r7 = 5
            if (r6 == r7) goto L_0x0066
            r7 = 6
            if (r6 == r7) goto L_0x0062
            r7 = 8
            if (r6 == r7) goto L_0x0066
            r7 = 9
            if (r6 == r7) goto L_0x0062
            goto L_0x006b
        L_0x0062:
            float r6 = r11.c
            float r6 = r6 - r2
            goto L_0x006a
        L_0x0066:
            float r6 = r11.c
            float r6 = r6 - r2
            float r6 = r6 / r8
        L_0x006a:
            float r3 = r3 - r6
        L_0x006b:
            b.i.a.e$a r12 = r12.a
            int r12 = r12.ordinal()
            switch(r12) {
                case 4: goto L_0x0079;
                case 5: goto L_0x0079;
                case 6: goto L_0x0079;
                case 7: goto L_0x0075;
                case 8: goto L_0x0075;
                case 9: goto L_0x0075;
                default: goto L_0x0074;
            }
        L_0x0074:
            goto L_0x007e
        L_0x0075:
            float r11 = r11.d
            float r11 = r11 - r5
            goto L_0x007d
        L_0x0079:
            float r11 = r11.d
            float r11 = r11 - r5
            float r11 = r11 / r8
        L_0x007d:
            float r4 = r4 - r11
        L_0x007e:
            float r11 = r10.a
            float r10 = r10.f1078b
            r0.preTranslate(r11, r10)
            r0.preScale(r1, r1)
        L_0x0088:
            r0.preTranslate(r3, r4)
        L_0x008b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: b.i.a.g.e(b.i.a.f$a, b.i.a.f$a, b.i.a.e):android.graphics.Matrix");
    }

    public final void f(f.j0 j0Var, f.a aVar) {
        Path b2;
        if (this.c.a.L != null && (b2 = b(j0Var, aVar)) != null) {
            this.a.clipPath(b2);
        }
    }

    public final void g(f.j0 j0Var) {
        f.n0 n0Var = this.c.a.f1099i;
        if (n0Var instanceof f.t) {
            l(true, j0Var.f1174h, (f.t) n0Var);
        }
        f.n0 n0Var2 = this.c.a.f1102l;
        if (n0Var2 instanceof f.t) {
            l(false, j0Var.f1174h, (f.t) n0Var2);
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0052, code lost:
        if (r6.equals("monospace") == false) goto L_0x0029;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.graphics.Typeface h(java.lang.String r6, java.lang.Integer r7, b.i.a.f.d0.b r8) {
        /*
            r5 = this;
            b.i.a.f$d0$b r0 = b.i.a.f.d0.b.Italic
            r1 = 1
            r2 = 0
            if (r8 != r0) goto L_0x0008
            r8 = r1
            goto L_0x0009
        L_0x0008:
            r8 = r2
        L_0x0009:
            int r7 = r7.intValue()
            r0 = 500(0x1f4, float:7.0E-43)
            r3 = 3
            r4 = 2
            if (r7 <= r0) goto L_0x0019
            if (r8 == 0) goto L_0x0017
            r7 = r3
            goto L_0x001e
        L_0x0017:
            r7 = r1
            goto L_0x001e
        L_0x0019:
            if (r8 == 0) goto L_0x001d
            r7 = r4
            goto L_0x001e
        L_0x001d:
            r7 = r2
        L_0x001e:
            r6.hashCode()
            r8 = -1
            int r0 = r6.hashCode()
            switch(r0) {
                case -1536685117: goto L_0x0055;
                case -1431958525: goto L_0x004c;
                case -1081737434: goto L_0x0041;
                case 109326717: goto L_0x0036;
                case 1126973893: goto L_0x002b;
                default: goto L_0x0029;
            }
        L_0x0029:
            r1 = r8
            goto L_0x005f
        L_0x002b:
            java.lang.String r0 = "cursive"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L_0x0034
            goto L_0x0029
        L_0x0034:
            r1 = 4
            goto L_0x005f
        L_0x0036:
            java.lang.String r0 = "serif"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L_0x003f
            goto L_0x0029
        L_0x003f:
            r1 = r3
            goto L_0x005f
        L_0x0041:
            java.lang.String r0 = "fantasy"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L_0x004a
            goto L_0x0029
        L_0x004a:
            r1 = r4
            goto L_0x005f
        L_0x004c:
            java.lang.String r0 = "monospace"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L_0x005f
            goto L_0x0029
        L_0x0055:
            java.lang.String r0 = "sans-serif"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L_0x005e
            goto L_0x0029
        L_0x005e:
            r1 = r2
        L_0x005f:
            switch(r1) {
                case 0: goto L_0x006e;
                case 1: goto L_0x006b;
                case 2: goto L_0x006e;
                case 3: goto L_0x0064;
                case 4: goto L_0x006e;
                default: goto L_0x0062;
            }
        L_0x0062:
            r6 = 0
            goto L_0x0071
        L_0x0064:
            android.graphics.Typeface r6 = android.graphics.Typeface.SERIF
        L_0x0066:
            android.graphics.Typeface r6 = android.graphics.Typeface.create(r6, r7)
            goto L_0x0071
        L_0x006b:
            android.graphics.Typeface r6 = android.graphics.Typeface.MONOSPACE
            goto L_0x0066
        L_0x006e:
            android.graphics.Typeface r6 = android.graphics.Typeface.SANS_SERIF
            goto L_0x0066
        L_0x0071:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: b.i.a.g.h(java.lang.String, java.lang.Integer, b.i.a.f$d0$b):android.graphics.Typeface");
    }

    public final void i(f.m0 m0Var) {
        Boolean bool;
        if ((m0Var instanceof f.k0) && (bool = ((f.k0) m0Var).d) != null) {
            this.c.f1239h = bool.booleanValue();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v2, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v4, resolved type: boolean} */
    /* JADX WARNING: type inference failed for: r8v1 */
    /* JADX WARNING: type inference failed for: r8v3 */
    /* JADX WARNING: type inference failed for: r8v5 */
    /* JADX WARNING: type inference failed for: r8v6, types: [int] */
    /* JADX WARNING: type inference failed for: r8v9, types: [int] */
    /* JADX WARNING: type inference failed for: r8v11 */
    /* JADX WARNING: type inference failed for: r8v12 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x00da  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00ec  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00f7  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0106  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void l(boolean r25, b.i.a.f.a r26, b.i.a.f.t r27) {
        /*
            r24 = this;
            r0 = r24
            r1 = r25
            r2 = r26
            r3 = r27
            b.i.a.f$e r4 = b.i.a.f.e.f1146i
            b.i.a.f$j r5 = b.i.a.f.j.repeat
            b.i.a.f$j r6 = b.i.a.f.j.reflect
            b.i.a.f r7 = r0.f1223b
            java.lang.String r8 = r3.f1205h
            b.i.a.f$m0 r7 = r7.g(r8)
            r8 = 0
            r9 = 1
            if (r7 != 0) goto L_0x0045
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            if (r1 == 0) goto L_0x0022
            java.lang.String r4 = "Fill"
            goto L_0x0024
        L_0x0022:
            java.lang.String r4 = "Stroke"
        L_0x0024:
            r2[r8] = r4
            java.lang.String r4 = r3.f1205h
            r2[r9] = r4
            java.lang.String r4 = "%s reference '%s' not found"
            q(r4, r2)
            b.i.a.f$n0 r2 = r3.f1206i
            if (r2 == 0) goto L_0x0039
            b.i.a.g$h r3 = r0.c
            r0.R(r3, r1, r2)
            goto L_0x0044
        L_0x0039:
            if (r1 == 0) goto L_0x0040
            b.i.a.g$h r1 = r0.c
            r1.f1236b = r8
            goto L_0x0044
        L_0x0040:
            b.i.a.g$h r1 = r0.c
            r1.c = r8
        L_0x0044:
            return
        L_0x0045:
            boolean r3 = r7 instanceof b.i.a.f.l0
            r11 = 1065353216(0x3f800000, float:1.0)
            if (r3 == 0) goto L_0x01ab
            b.i.a.f$l0 r7 = (b.i.a.f.l0) r7
            java.lang.String r3 = r7.f1169l
            if (r3 == 0) goto L_0x0054
            r0.s(r7, r3)
        L_0x0054:
            java.lang.Boolean r3 = r7.f1166i
            if (r3 == 0) goto L_0x0060
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto L_0x0060
            r3 = r9
            goto L_0x0061
        L_0x0060:
            r3 = r8
        L_0x0061:
            b.i.a.g$h r13 = r0.c
            if (r1 == 0) goto L_0x0068
            android.graphics.Paint r13 = r13.d
            goto L_0x006a
        L_0x0068:
            android.graphics.Paint r13 = r13.f1237e
        L_0x006a:
            if (r3 == 0) goto L_0x0098
            b.i.a.f$a r11 = r24.z()
            b.i.a.f$o r14 = r7.f1179m
            if (r14 == 0) goto L_0x0079
            float r14 = r14.d(r0)
            goto L_0x007a
        L_0x0079:
            r14 = 0
        L_0x007a:
            b.i.a.f$o r15 = r7.f1180n
            if (r15 == 0) goto L_0x0083
            float r15 = r15.f(r0)
            goto L_0x0084
        L_0x0083:
            r15 = 0
        L_0x0084:
            b.i.a.f$o r10 = r7.f1181o
            if (r10 == 0) goto L_0x008d
            float r10 = r10.d(r0)
            goto L_0x008f
        L_0x008d:
            float r10 = r11.c
        L_0x008f:
            b.i.a.f$o r11 = r7.f1182p
            if (r11 == 0) goto L_0x00c1
            float r11 = r11.f(r0)
            goto L_0x00c2
        L_0x0098:
            b.i.a.f$o r10 = r7.f1179m
            if (r10 == 0) goto L_0x00a2
            float r10 = r10.c(r0, r11)
            r14 = r10
            goto L_0x00a3
        L_0x00a2:
            r14 = 0
        L_0x00a3:
            b.i.a.f$o r10 = r7.f1180n
            if (r10 == 0) goto L_0x00ad
            float r10 = r10.c(r0, r11)
            r15 = r10
            goto L_0x00ae
        L_0x00ad:
            r15 = 0
        L_0x00ae:
            b.i.a.f$o r10 = r7.f1181o
            if (r10 == 0) goto L_0x00b7
            float r10 = r10.c(r0, r11)
            goto L_0x00b8
        L_0x00b7:
            r10 = r11
        L_0x00b8:
            b.i.a.f$o r12 = r7.f1182p
            if (r12 == 0) goto L_0x00c1
            float r11 = r12.c(r0, r11)
            goto L_0x00c2
        L_0x00c1:
            r11 = 0
        L_0x00c2:
            r19 = r10
            r20 = r11
            r17 = r14
            r18 = r15
            r24.T()
            b.i.a.g$h r10 = r0.v(r7)
            r0.c = r10
            android.graphics.Matrix r10 = new android.graphics.Matrix
            r10.<init>()
            if (r3 != 0) goto L_0x00e8
            float r3 = r2.a
            float r11 = r2.f1078b
            r10.preTranslate(r3, r11)
            float r3 = r2.c
            float r2 = r2.d
            r10.preScale(r3, r2)
        L_0x00e8:
            android.graphics.Matrix r2 = r7.f1167j
            if (r2 == 0) goto L_0x00ef
            r10.preConcat(r2)
        L_0x00ef:
            java.util.List<b.i.a.f$m0> r2 = r7.f1165h
            int r2 = r2.size()
            if (r2 != 0) goto L_0x0106
            r24.S()
            b.i.a.g$h r2 = r0.c
            if (r1 == 0) goto L_0x0102
            r2.f1236b = r8
            goto L_0x038f
        L_0x0102:
            r2.c = r8
            goto L_0x038f
        L_0x0106:
            int[] r1 = new int[r2]
            float[] r3 = new float[r2]
            java.util.List<b.i.a.f$m0> r11 = r7.f1165h
            java.util.Iterator r11 = r11.iterator()
            r12 = -1082130432(0xffffffffbf800000, float:-1.0)
        L_0x0112:
            boolean r14 = r11.hasNext()
            if (r14 == 0) goto L_0x015e
            java.lang.Object r14 = r11.next()
            b.i.a.f$m0 r14 = (b.i.a.f.m0) r14
            b.i.a.f$c0 r14 = (b.i.a.f.c0) r14
            java.lang.Float r15 = r14.f1086h
            if (r15 == 0) goto L_0x0129
            float r15 = r15.floatValue()
            goto L_0x012a
        L_0x0129:
            r15 = 0
        L_0x012a:
            if (r8 == 0) goto L_0x0134
            int r16 = (r15 > r12 ? 1 : (r15 == r12 ? 0 : -1))
            if (r16 < 0) goto L_0x0131
            goto L_0x0134
        L_0x0131:
            r3[r8] = r12
            goto L_0x0137
        L_0x0134:
            r3[r8] = r15
            r12 = r15
        L_0x0137:
            r24.T()
            b.i.a.g$h r15 = r0.c
            r0.X(r15, r14)
            b.i.a.g$h r14 = r0.c
            b.i.a.f$d0 r14 = r14.a
            b.i.a.f$n0 r15 = r14.J
            b.i.a.f$e r15 = (b.i.a.f.e) r15
            if (r15 != 0) goto L_0x014a
            r15 = r4
        L_0x014a:
            int r15 = r15.f1148h
            java.lang.Float r14 = r14.K
            float r14 = r14.floatValue()
            int r14 = k(r15, r14)
            r1[r8] = r14
            int r8 = r8 + 1
            r24.S()
            goto L_0x0112
        L_0x015e:
            int r4 = (r17 > r19 ? 1 : (r17 == r19 ? 0 : -1))
            if (r4 != 0) goto L_0x0166
            int r4 = (r18 > r20 ? 1 : (r18 == r20 ? 0 : -1))
            if (r4 == 0) goto L_0x0168
        L_0x0166:
            if (r2 != r9) goto L_0x0173
        L_0x0168:
            r24.S()
            int r2 = r2 - r9
            r1 = r1[r2]
            r13.setColor(r1)
            goto L_0x038f
        L_0x0173:
            android.graphics.Shader$TileMode r2 = android.graphics.Shader.TileMode.CLAMP
            b.i.a.f$j r4 = r7.f1168k
            if (r4 == 0) goto L_0x0182
            if (r4 != r6) goto L_0x017e
            android.graphics.Shader$TileMode r2 = android.graphics.Shader.TileMode.MIRROR
            goto L_0x0182
        L_0x017e:
            if (r4 != r5) goto L_0x0182
            android.graphics.Shader$TileMode r2 = android.graphics.Shader.TileMode.REPEAT
        L_0x0182:
            r23 = r2
            r24.S()
            android.graphics.LinearGradient r2 = new android.graphics.LinearGradient
            r16 = r2
            r21 = r1
            r22 = r3
            r16.<init>(r17, r18, r19, r20, r21, r22, r23)
            r2.setLocalMatrix(r10)
            r13.setShader(r2)
            b.i.a.g$h r1 = r0.c
            b.i.a.f$d0 r1 = r1.a
            java.lang.Float r1 = r1.f1101k
            float r1 = r1.floatValue()
            int r1 = j(r1)
            r13.setAlpha(r1)
            goto L_0x038f
        L_0x01ab:
            boolean r3 = r7 instanceof b.i.a.f.p0
            if (r3 == 0) goto L_0x030c
            b.i.a.f$p0 r7 = (b.i.a.f.p0) r7
            java.lang.String r3 = r7.f1169l
            if (r3 == 0) goto L_0x01b8
            r0.s(r7, r3)
        L_0x01b8:
            java.lang.Boolean r3 = r7.f1166i
            if (r3 == 0) goto L_0x01c4
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto L_0x01c4
            r3 = r9
            goto L_0x01c5
        L_0x01c4:
            r3 = r8
        L_0x01c5:
            b.i.a.g$h r10 = r0.c
            if (r1 == 0) goto L_0x01cc
            android.graphics.Paint r10 = r10.d
            goto L_0x01ce
        L_0x01cc:
            android.graphics.Paint r10 = r10.f1237e
        L_0x01ce:
            if (r3 == 0) goto L_0x0207
            b.i.a.f$o r11 = new b.i.a.f$o
            r12 = 1112014848(0x42480000, float:50.0)
            b.i.a.f$c1 r13 = b.i.a.f.c1.percent
            r11.<init>(r12, r13)
            b.i.a.f$o r12 = r7.f1193m
            if (r12 == 0) goto L_0x01e2
            float r12 = r12.d(r0)
            goto L_0x01e6
        L_0x01e2:
            float r12 = r11.d(r0)
        L_0x01e6:
            b.i.a.f$o r13 = r7.f1194n
            if (r13 == 0) goto L_0x01ef
            float r13 = r13.f(r0)
            goto L_0x01f3
        L_0x01ef:
            float r13 = r11.f(r0)
        L_0x01f3:
            b.i.a.f$o r14 = r7.f1195o
            if (r14 == 0) goto L_0x01fc
            float r11 = r14.b(r0)
            goto L_0x0200
        L_0x01fc:
            float r11 = r11.b(r0)
        L_0x0200:
            r19 = r11
            r17 = r12
            r18 = r13
            goto L_0x022d
        L_0x0207:
            b.i.a.f$o r12 = r7.f1193m
            r13 = 1056964608(0x3f000000, float:0.5)
            if (r12 == 0) goto L_0x0212
            float r12 = r12.c(r0, r11)
            goto L_0x0213
        L_0x0212:
            r12 = r13
        L_0x0213:
            b.i.a.f$o r14 = r7.f1194n
            if (r14 == 0) goto L_0x021c
            float r14 = r14.c(r0, r11)
            goto L_0x021d
        L_0x021c:
            r14 = r13
        L_0x021d:
            b.i.a.f$o r15 = r7.f1195o
            if (r15 == 0) goto L_0x0226
            float r11 = r15.c(r0, r11)
            goto L_0x0227
        L_0x0226:
            r11 = r13
        L_0x0227:
            r19 = r11
            r17 = r12
            r18 = r14
        L_0x022d:
            r24.T()
            b.i.a.g$h r11 = r0.v(r7)
            r0.c = r11
            android.graphics.Matrix r11 = new android.graphics.Matrix
            r11.<init>()
            if (r3 != 0) goto L_0x024b
            float r3 = r2.a
            float r12 = r2.f1078b
            r11.preTranslate(r3, r12)
            float r3 = r2.c
            float r2 = r2.d
            r11.preScale(r3, r2)
        L_0x024b:
            android.graphics.Matrix r2 = r7.f1167j
            if (r2 == 0) goto L_0x0252
            r11.preConcat(r2)
        L_0x0252:
            java.util.List<b.i.a.f$m0> r2 = r7.f1165h
            int r2 = r2.size()
            if (r2 != 0) goto L_0x0269
            r24.S()
            b.i.a.g$h r2 = r0.c
            if (r1 == 0) goto L_0x0265
            r2.f1236b = r8
            goto L_0x038f
        L_0x0265:
            r2.c = r8
            goto L_0x038f
        L_0x0269:
            int[] r1 = new int[r2]
            float[] r3 = new float[r2]
            java.util.List<b.i.a.f$m0> r12 = r7.f1165h
            java.util.Iterator r12 = r12.iterator()
            r13 = -1082130432(0xffffffffbf800000, float:-1.0)
        L_0x0275:
            boolean r14 = r12.hasNext()
            if (r14 == 0) goto L_0x02c1
            java.lang.Object r14 = r12.next()
            b.i.a.f$m0 r14 = (b.i.a.f.m0) r14
            b.i.a.f$c0 r14 = (b.i.a.f.c0) r14
            java.lang.Float r15 = r14.f1086h
            if (r15 == 0) goto L_0x028c
            float r15 = r15.floatValue()
            goto L_0x028d
        L_0x028c:
            r15 = 0
        L_0x028d:
            if (r8 == 0) goto L_0x0297
            int r16 = (r15 > r13 ? 1 : (r15 == r13 ? 0 : -1))
            if (r16 < 0) goto L_0x0294
            goto L_0x0297
        L_0x0294:
            r3[r8] = r13
            goto L_0x029a
        L_0x0297:
            r3[r8] = r15
            r13 = r15
        L_0x029a:
            r24.T()
            b.i.a.g$h r15 = r0.c
            r0.X(r15, r14)
            b.i.a.g$h r14 = r0.c
            b.i.a.f$d0 r14 = r14.a
            b.i.a.f$n0 r15 = r14.J
            b.i.a.f$e r15 = (b.i.a.f.e) r15
            if (r15 != 0) goto L_0x02ad
            r15 = r4
        L_0x02ad:
            int r15 = r15.f1148h
            java.lang.Float r14 = r14.K
            float r14 = r14.floatValue()
            int r14 = k(r15, r14)
            r1[r8] = r14
            int r8 = r8 + 1
            r24.S()
            goto L_0x0275
        L_0x02c1:
            r8 = 0
            int r4 = (r19 > r8 ? 1 : (r19 == r8 ? 0 : -1))
            if (r4 == 0) goto L_0x0301
            if (r2 != r9) goto L_0x02c9
            goto L_0x0301
        L_0x02c9:
            android.graphics.Shader$TileMode r2 = android.graphics.Shader.TileMode.CLAMP
            b.i.a.f$j r4 = r7.f1168k
            if (r4 == 0) goto L_0x02d8
            if (r4 != r6) goto L_0x02d4
            android.graphics.Shader$TileMode r2 = android.graphics.Shader.TileMode.MIRROR
            goto L_0x02d8
        L_0x02d4:
            if (r4 != r5) goto L_0x02d8
            android.graphics.Shader$TileMode r2 = android.graphics.Shader.TileMode.REPEAT
        L_0x02d8:
            r22 = r2
            r24.S()
            android.graphics.RadialGradient r2 = new android.graphics.RadialGradient
            r16 = r2
            r20 = r1
            r21 = r3
            r16.<init>(r17, r18, r19, r20, r21, r22)
            r2.setLocalMatrix(r11)
            r10.setShader(r2)
            b.i.a.g$h r1 = r0.c
            b.i.a.f$d0 r1 = r1.a
            java.lang.Float r1 = r1.f1101k
            float r1 = r1.floatValue()
            int r1 = j(r1)
            r10.setAlpha(r1)
            goto L_0x038f
        L_0x0301:
            r24.S()
            int r2 = r2 - r9
            r1 = r1[r2]
            r10.setColor(r1)
            goto L_0x038f
        L_0x030c:
            boolean r2 = r7 instanceof b.i.a.f.b0
            if (r2 == 0) goto L_0x038f
            b.i.a.f$b0 r7 = (b.i.a.f.b0) r7
            r2 = 6442450944(0x180000000, double:3.1829936864E-314)
            r4 = 4294967296(0x100000000, double:2.121995791E-314)
            r10 = 2147483648(0x80000000, double:1.0609978955E-314)
            b.i.a.f$d0 r6 = r7.f1176e
            boolean r6 = r0.A(r6, r10)
            if (r1 == 0) goto L_0x035b
            if (r6 == 0) goto L_0x033a
            b.i.a.g$h r6 = r0.c
            b.i.a.f$d0 r10 = r6.a
            b.i.a.f$d0 r11 = r7.f1176e
            b.i.a.f$n0 r11 = r11.O
            r10.f1099i = r11
            if (r11 == 0) goto L_0x0338
            r8 = r9
        L_0x0338:
            r6.f1236b = r8
        L_0x033a:
            b.i.a.f$d0 r6 = r7.f1176e
            boolean r4 = r0.A(r6, r4)
            if (r4 == 0) goto L_0x034c
            b.i.a.g$h r4 = r0.c
            b.i.a.f$d0 r4 = r4.a
            b.i.a.f$d0 r5 = r7.f1176e
            java.lang.Float r5 = r5.P
            r4.f1101k = r5
        L_0x034c:
            b.i.a.f$d0 r4 = r7.f1176e
            boolean r2 = r0.A(r4, r2)
            if (r2 == 0) goto L_0x038f
            b.i.a.g$h r2 = r0.c
            b.i.a.f$d0 r3 = r2.a
            b.i.a.f$n0 r3 = r3.f1099i
            goto L_0x038c
        L_0x035b:
            if (r6 == 0) goto L_0x036c
            b.i.a.g$h r6 = r0.c
            b.i.a.f$d0 r10 = r6.a
            b.i.a.f$d0 r11 = r7.f1176e
            b.i.a.f$n0 r11 = r11.O
            r10.f1102l = r11
            if (r11 == 0) goto L_0x036a
            r8 = r9
        L_0x036a:
            r6.c = r8
        L_0x036c:
            b.i.a.f$d0 r6 = r7.f1176e
            boolean r4 = r0.A(r6, r4)
            if (r4 == 0) goto L_0x037e
            b.i.a.g$h r4 = r0.c
            b.i.a.f$d0 r4 = r4.a
            b.i.a.f$d0 r5 = r7.f1176e
            java.lang.Float r5 = r5.P
            r4.f1103m = r5
        L_0x037e:
            b.i.a.f$d0 r4 = r7.f1176e
            boolean r2 = r0.A(r4, r2)
            if (r2 == 0) goto L_0x038f
            b.i.a.g$h r2 = r0.c
            b.i.a.f$d0 r3 = r2.a
            b.i.a.f$n0 r3 = r3.f1102l
        L_0x038c:
            r0.R(r2, r1, r3)
        L_0x038f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: b.i.a.g.l(boolean, b.i.a.f$a, b.i.a.f$t):void");
    }

    public final boolean m() {
        Boolean bool = this.c.a.H;
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    public final void n(f.j0 j0Var, Path path) {
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        f.j0 j0Var2 = j0Var;
        Path path2 = path;
        f.n0 n0Var = this.c.a.f1099i;
        if (n0Var instanceof f.t) {
            f.m0 g2 = this.f1223b.g(((f.t) n0Var).f1205h);
            if (g2 instanceof f.x) {
                f.x xVar = (f.x) g2;
                Boolean bool = xVar.f1212p;
                boolean z = bool != null && bool.booleanValue();
                String str = xVar.w;
                if (str != null) {
                    u(xVar, str);
                }
                if (z) {
                    f.o oVar = xVar.s;
                    f5 = oVar != null ? oVar.d(this) : 0.0f;
                    f.o oVar2 = xVar.t;
                    f4 = oVar2 != null ? oVar2.f(this) : 0.0f;
                    f.o oVar3 = xVar.u;
                    f3 = oVar3 != null ? oVar3.d(this) : 0.0f;
                    f.o oVar4 = xVar.v;
                    f2 = oVar4 != null ? oVar4.f(this) : 0.0f;
                } else {
                    f.o oVar5 = xVar.s;
                    float c2 = oVar5 != null ? oVar5.c(this, 1.0f) : 0.0f;
                    f.o oVar6 = xVar.t;
                    float c3 = oVar6 != null ? oVar6.c(this, 1.0f) : 0.0f;
                    f.o oVar7 = xVar.u;
                    float c4 = oVar7 != null ? oVar7.c(this, 1.0f) : 0.0f;
                    f.o oVar8 = xVar.v;
                    float c5 = oVar8 != null ? oVar8.c(this, 1.0f) : 0.0f;
                    f.a aVar = j0Var2.f1174h;
                    float f7 = aVar.a;
                    float f8 = aVar.c;
                    f5 = (c2 * f8) + f7;
                    float f9 = aVar.f1078b;
                    float f10 = aVar.d;
                    float f11 = c4 * f8;
                    f2 = c5 * f10;
                    f4 = (c3 * f10) + f9;
                    f3 = f11;
                }
                if (f3 != 0.0f && f2 != 0.0f) {
                    e eVar = xVar.f1189n;
                    if (eVar == null) {
                        eVar = e.d;
                    }
                    T();
                    this.a.clipPath(path2);
                    h hVar = new h(this);
                    W(hVar, f.d0.a());
                    hVar.a.C = Boolean.FALSE;
                    w(xVar, hVar);
                    this.c = hVar;
                    f.a aVar2 = j0Var2.f1174h;
                    Matrix matrix = xVar.r;
                    if (matrix != null) {
                        this.a.concat(matrix);
                        Matrix matrix2 = new Matrix();
                        if (xVar.r.invert(matrix2)) {
                            f.a aVar3 = j0Var2.f1174h;
                            f.a aVar4 = j0Var2.f1174h;
                            f.a aVar5 = j0Var2.f1174h;
                            float[] fArr = {aVar3.a, aVar3.f1078b, aVar3.a(), aVar4.f1078b, aVar4.a(), j0Var2.f1174h.b(), aVar5.a, aVar5.b()};
                            matrix2.mapPoints(fArr);
                            RectF rectF = new RectF(fArr[0], fArr[1], fArr[0], fArr[1]);
                            for (int i2 = 2; i2 <= 6; i2 += 2) {
                                if (fArr[i2] < rectF.left) {
                                    rectF.left = fArr[i2];
                                }
                                if (fArr[i2] > rectF.right) {
                                    rectF.right = fArr[i2];
                                }
                                int i3 = i2 + 1;
                                if (fArr[i3] < rectF.top) {
                                    rectF.top = fArr[i3];
                                }
                                if (fArr[i3] > rectF.bottom) {
                                    rectF.bottom = fArr[i3];
                                }
                            }
                            float f12 = rectF.left;
                            float f13 = rectF.top;
                            aVar2 = new f.a(f12, f13, rectF.right - f12, rectF.bottom - f13);
                        }
                    }
                    float floor = (((float) Math.floor((double) ((aVar2.a - f5) / f3))) * f3) + f5;
                    float a2 = aVar2.a();
                    float b2 = aVar2.b();
                    f.a aVar6 = new f.a(0.0f, 0.0f, f3, f2);
                    boolean J = J();
                    for (float floor2 = (((float) Math.floor((double) ((aVar2.f1078b - f4) / f2))) * f2) + f4; floor2 < b2; floor2 += f2) {
                        float f14 = floor;
                        while (f14 < a2) {
                            aVar6.a = f14;
                            aVar6.f1078b = floor2;
                            T();
                            if (!this.c.a.C.booleanValue()) {
                                f6 = b2;
                                Q(aVar6.a, aVar6.f1078b, aVar6.c, aVar6.d);
                            } else {
                                f6 = b2;
                            }
                            f.a aVar7 = xVar.f1200o;
                            if (aVar7 != null) {
                                this.a.concat(e(aVar6, aVar7, eVar));
                            } else {
                                Boolean bool2 = xVar.f1213q;
                                boolean z2 = bool2 == null || bool2.booleanValue();
                                this.a.translate(f14, floor2);
                                if (!z2) {
                                    Canvas canvas = this.a;
                                    f.a aVar8 = j0Var2.f1174h;
                                    canvas.scale(aVar8.c, aVar8.d);
                                }
                            }
                            for (f.m0 L : xVar.f1152i) {
                                L(L);
                            }
                            S();
                            f14 += f3;
                            b2 = f6;
                        }
                        float f15 = b2;
                    }
                    if (J) {
                        I(xVar, xVar.f1174h);
                    }
                    S();
                    return;
                }
                return;
            }
        }
        this.a.drawPath(path2, this.c.d);
    }

    public final void o(Path path) {
        h hVar = this.c;
        if (hVar.a.S == f.d0.i.NonScalingStroke) {
            Matrix matrix = this.a.getMatrix();
            Path path2 = new Path();
            path.transform(matrix, path2);
            this.a.setMatrix(new Matrix());
            Shader shader = this.c.f1237e.getShader();
            Matrix matrix2 = new Matrix();
            if (shader != null) {
                shader.getLocalMatrix(matrix2);
                Matrix matrix3 = new Matrix(matrix2);
                matrix3.postConcat(matrix);
                shader.setLocalMatrix(matrix3);
            }
            this.a.drawPath(path2, this.c.f1237e);
            this.a.setMatrix(matrix);
            if (shader != null) {
                shader.setLocalMatrix(matrix2);
                return;
            }
            return;
        }
        this.a.drawPath(path, hVar.f1237e);
    }

    public final void p(f.x0 x0Var, j jVar) {
        float f2;
        float f3;
        float f4;
        float f5;
        f.d0.C0042f x;
        j jVar2 = jVar;
        if (m()) {
            Iterator<f.m0> it = x0Var.f1152i.iterator();
            boolean z = true;
            while (it.hasNext()) {
                f.m0 next = it.next();
                if (next instanceof f.b1) {
                    jVar2.b(U(((f.b1) next).c, z, !it.hasNext()));
                } else {
                    f.d0.C0042f fVar = f.d0.C0042f.Middle;
                    f.d0.C0042f fVar2 = f.d0.C0042f.Start;
                    if (jVar2.a((f.x0) next)) {
                        if (next instanceof f.y0) {
                            T();
                            f.y0 y0Var = (f.y0) next;
                            X(this.c, y0Var);
                            if (m() && Z()) {
                                f.m0 g2 = y0Var.a.g(y0Var.f1215n);
                                if (g2 == null) {
                                    q("TextPath reference '%s' not found", y0Var.f1215n);
                                } else {
                                    f.u uVar = (f.u) g2;
                                    Path path = new d(this, uVar.f1209o).a;
                                    Matrix matrix = uVar.f1175n;
                                    if (matrix != null) {
                                        path.transform(matrix);
                                    }
                                    PathMeasure pathMeasure = new PathMeasure(path, false);
                                    f.o oVar = y0Var.f1216o;
                                    float c2 = oVar != null ? oVar.c(this, pathMeasure.getLength()) : 0.0f;
                                    f.d0.C0042f x2 = x();
                                    if (x2 != fVar2) {
                                        k kVar = new k((a) null);
                                        p(y0Var, kVar);
                                        float f6 = kVar.a;
                                        if (x2 == fVar) {
                                            f6 /= 2.0f;
                                        }
                                        c2 -= f6;
                                    }
                                    g((f.j0) y0Var.f1217p);
                                    boolean J = J();
                                    p(y0Var, new e(path, c2, 0.0f));
                                    if (J) {
                                        I(y0Var, y0Var.f1174h);
                                    }
                                }
                            }
                        } else if (next instanceof f.u0) {
                            T();
                            f.u0 u0Var = (f.u0) next;
                            X(this.c, u0Var);
                            if (m()) {
                                List<f.o> list = u0Var.f1218n;
                                boolean z2 = list != null && list.size() > 0;
                                boolean z3 = jVar2 instanceof f;
                                if (z3) {
                                    float d2 = !z2 ? ((f) jVar2).a : u0Var.f1218n.get(0).d(this);
                                    List<f.o> list2 = u0Var.f1219o;
                                    f3 = (list2 == null || list2.size() == 0) ? ((f) jVar2).f1234b : u0Var.f1219o.get(0).f(this);
                                    List<f.o> list3 = u0Var.f1220p;
                                    f2 = (list3 == null || list3.size() == 0) ? 0.0f : u0Var.f1220p.get(0).d(this);
                                    List<f.o> list4 = u0Var.f1221q;
                                    float f7 = d2;
                                    f4 = (list4 == null || list4.size() == 0) ? 0.0f : u0Var.f1221q.get(0).f(this);
                                    f5 = f7;
                                } else {
                                    f5 = 0.0f;
                                    f4 = 0.0f;
                                    f3 = 0.0f;
                                    f2 = 0.0f;
                                }
                                if (z2 && (x = x()) != fVar2) {
                                    k kVar2 = new k((a) null);
                                    p(u0Var, kVar2);
                                    float f8 = kVar2.a;
                                    if (x == fVar) {
                                        f8 /= 2.0f;
                                    }
                                    f5 -= f8;
                                }
                                g((f.j0) u0Var.r);
                                if (z3) {
                                    f fVar3 = (f) jVar2;
                                    fVar3.a = f5 + f2;
                                    fVar3.f1234b = f3 + f4;
                                }
                                boolean J2 = J();
                                p(u0Var, jVar2);
                                if (J2) {
                                    I(u0Var, u0Var.f1174h);
                                }
                            }
                        } else if (next instanceof f.t0) {
                            T();
                            f.t0 t0Var = (f.t0) next;
                            X(this.c, t0Var);
                            if (m()) {
                                g((f.j0) t0Var.f1208o);
                                f.m0 g3 = next.a.g(t0Var.f1207n);
                                if (g3 == null || !(g3 instanceof f.x0)) {
                                    q("Tref reference '%s' not found", t0Var.f1207n);
                                } else {
                                    StringBuilder sb = new StringBuilder();
                                    r((f.x0) g3, sb);
                                    if (sb.length() > 0) {
                                        jVar2.b(sb.toString());
                                    }
                                }
                            }
                        }
                        S();
                    }
                }
                z = false;
            }
        }
    }

    public final void r(f.x0 x0Var, StringBuilder sb) {
        Iterator<f.m0> it = x0Var.f1152i.iterator();
        boolean z = true;
        while (it.hasNext()) {
            f.m0 next = it.next();
            if (next instanceof f.x0) {
                r((f.x0) next, sb);
            } else if (next instanceof f.b1) {
                sb.append(U(((f.b1) next).c, z, !it.hasNext()));
            }
            z = false;
        }
    }

    public final void s(f.i iVar, String str) {
        f.m0 g2 = iVar.a.g(str);
        if (g2 == null) {
            a0("Gradient reference '%s' not found", str);
        } else if (!(g2 instanceof f.i)) {
            q("Gradient href attributes must point to other gradient elements", new Object[0]);
        } else if (g2 == iVar) {
            q("Circular reference in gradient href attribute '%s'", str);
        } else {
            f.i iVar2 = (f.i) g2;
            if (iVar.f1166i == null) {
                iVar.f1166i = iVar2.f1166i;
            }
            if (iVar.f1167j == null) {
                iVar.f1167j = iVar2.f1167j;
            }
            if (iVar.f1168k == null) {
                iVar.f1168k = iVar2.f1168k;
            }
            if (iVar.f1165h.isEmpty()) {
                iVar.f1165h = iVar2.f1165h;
            }
            try {
                if (iVar instanceof f.l0) {
                    f.l0 l0Var = (f.l0) iVar;
                    f.l0 l0Var2 = (f.l0) g2;
                    if (l0Var.f1179m == null) {
                        l0Var.f1179m = l0Var2.f1179m;
                    }
                    if (l0Var.f1180n == null) {
                        l0Var.f1180n = l0Var2.f1180n;
                    }
                    if (l0Var.f1181o == null) {
                        l0Var.f1181o = l0Var2.f1181o;
                    }
                    if (l0Var.f1182p == null) {
                        l0Var.f1182p = l0Var2.f1182p;
                    }
                } else {
                    t((f.p0) iVar, (f.p0) g2);
                }
            } catch (ClassCastException unused) {
            }
            String str2 = iVar2.f1169l;
            if (str2 != null) {
                s(iVar, str2);
            }
        }
    }

    public final void t(f.p0 p0Var, f.p0 p0Var2) {
        if (p0Var.f1193m == null) {
            p0Var.f1193m = p0Var2.f1193m;
        }
        if (p0Var.f1194n == null) {
            p0Var.f1194n = p0Var2.f1194n;
        }
        if (p0Var.f1195o == null) {
            p0Var.f1195o = p0Var2.f1195o;
        }
        if (p0Var.f1196p == null) {
            p0Var.f1196p = p0Var2.f1196p;
        }
        if (p0Var.f1197q == null) {
            p0Var.f1197q = p0Var2.f1197q;
        }
    }

    public final void u(f.x xVar, String str) {
        f.m0 g2 = xVar.a.g(str);
        if (g2 == null) {
            a0("Pattern reference '%s' not found", str);
        } else if (!(g2 instanceof f.x)) {
            q("Pattern href attributes must point to other pattern elements", new Object[0]);
        } else if (g2 == xVar) {
            q("Circular reference in pattern href attribute '%s'", str);
        } else {
            f.x xVar2 = (f.x) g2;
            if (xVar.f1212p == null) {
                xVar.f1212p = xVar2.f1212p;
            }
            if (xVar.f1213q == null) {
                xVar.f1213q = xVar2.f1213q;
            }
            if (xVar.r == null) {
                xVar.r = xVar2.r;
            }
            if (xVar.s == null) {
                xVar.s = xVar2.s;
            }
            if (xVar.t == null) {
                xVar.t = xVar2.t;
            }
            if (xVar.u == null) {
                xVar.u = xVar2.u;
            }
            if (xVar.v == null) {
                xVar.v = xVar2.v;
            }
            if (xVar.f1152i.isEmpty()) {
                xVar.f1152i = xVar2.f1152i;
            }
            if (xVar.f1200o == null) {
                xVar.f1200o = xVar2.f1200o;
            }
            if (xVar.f1189n == null) {
                xVar.f1189n = xVar2.f1189n;
            }
            String str2 = xVar2.w;
            if (str2 != null) {
                u(xVar, str2);
            }
        }
    }

    public final h v(f.m0 m0Var) {
        h hVar = new h(this);
        W(hVar, f.d0.a());
        w(m0Var, hVar);
        return hVar;
    }

    public final h w(f.m0 m0Var, h hVar) {
        ArrayList arrayList = new ArrayList();
        while (true) {
            if (m0Var instanceof f.k0) {
                arrayList.add(0, (f.k0) m0Var);
            }
            f.i0 i0Var = m0Var.f1183b;
            if (i0Var == null) {
                break;
            }
            m0Var = (f.m0) i0Var;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            X(hVar, (f.k0) it.next());
        }
        h hVar2 = this.c;
        hVar.f1238g = hVar2.f1238g;
        hVar.f = hVar2.f;
        return hVar;
    }

    public final f.d0.C0042f x() {
        f.d0.C0042f fVar;
        f.d0 d0Var = this.c.a;
        if (d0Var.A == f.d0.h.LTR || (fVar = d0Var.B) == f.d0.C0042f.Middle) {
            return d0Var.B;
        }
        f.d0.C0042f fVar2 = f.d0.C0042f.Start;
        return fVar == fVar2 ? f.d0.C0042f.End : fVar2;
    }

    public final Path.FillType y() {
        f.d0.a aVar = this.c.a.M;
        return (aVar == null || aVar != f.d0.a.EvenOdd) ? Path.FillType.WINDING : Path.FillType.EVEN_ODD;
    }

    public f.a z() {
        h hVar = this.c;
        f.a aVar = hVar.f1238g;
        return aVar != null ? aVar : hVar.f;
    }
}
