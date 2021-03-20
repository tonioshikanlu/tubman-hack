package b.j.a.c.h0.t;

import b.j.a.b.l;
import b.j.a.c.n;
import b.j.a.c.x;
import b.j.a.c.y;
import java.util.HashMap;

public class k0 {
    public static final HashMap<String, n<?>> a;

    @b.j.a.c.z.a
    public static class a extends a<boolean[]> {
        static {
            b.j.a.c.i0.n.f2184k.n(Boolean.class);
        }

        public a() {
            super(boolean[].class);
        }

        public a(a aVar, b.j.a.c.d dVar, Boolean bool) {
            super(aVar, dVar, bool);
        }

        public boolean d(y yVar, Object obj) {
            return ((boolean[]) obj).length == 0;
        }

        public void f(Object obj, b.j.a.b.f fVar, y yVar) {
            boolean[] zArr = (boolean[]) obj;
            int length = zArr.length;
            if (length != 1 || !r(yVar)) {
                fVar.M0(length);
                fVar.Y(zArr);
                v(zArr, fVar);
                fVar.q0();
                return;
            }
            v(zArr, fVar);
        }

        public b.j.a.c.h0.h<?> q(b.j.a.c.f0.f fVar) {
            return this;
        }

        public n<?> t(b.j.a.c.d dVar, Boolean bool) {
            return new a(this, dVar, bool);
        }

        public /* bridge */ /* synthetic */ void u(Object obj, b.j.a.b.f fVar, y yVar) {
            v((boolean[]) obj, fVar);
        }

        public void v(boolean[] zArr, b.j.a.b.f fVar) {
            for (boolean o0 : zArr) {
                fVar.o0(o0);
            }
        }
    }

    @b.j.a.c.z.a
    public static class b extends s0<char[]> {
        public b() {
            super(char[].class);
        }

        public boolean d(y yVar, Object obj) {
            return ((char[]) obj).length == 0;
        }

        public void f(Object obj, b.j.a.b.f fVar, y yVar) {
            char[] cArr = (char[]) obj;
            if (yVar.K(x.WRITE_CHAR_ARRAYS_AS_JSON_ARRAYS)) {
                fVar.M0(cArr.length);
                fVar.Y(cArr);
                int length = cArr.length;
                for (int i2 = 0; i2 < length; i2++) {
                    fVar.R0(cArr, i2, 1);
                }
                fVar.q0();
                return;
            }
            fVar.R0(cArr, 0, cArr.length);
        }

        public void g(Object obj, b.j.a.b.f fVar, y yVar, b.j.a.c.f0.f fVar2) {
            b.j.a.b.v.b bVar;
            char[] cArr = (char[]) obj;
            if (yVar.K(x.WRITE_CHAR_ARRAYS_AS_JSON_ARRAYS)) {
                bVar = fVar2.e(fVar, fVar2.d(cArr, l.START_ARRAY));
                int length = cArr.length;
                for (int i2 = 0; i2 < length; i2++) {
                    fVar.R0(cArr, i2, 1);
                }
            } else {
                bVar = fVar2.e(fVar, fVar2.d(cArr, l.VALUE_STRING));
                fVar.R0(cArr, 0, cArr.length);
            }
            fVar2.f(fVar, bVar);
        }
    }

    @b.j.a.c.z.a
    public static class c extends a<double[]> {
        static {
            b.j.a.c.i0.n.f2184k.n(Double.TYPE);
        }

        public c() {
            super(double[].class);
        }

        public c(c cVar, b.j.a.c.d dVar, Boolean bool) {
            super(cVar, dVar, bool);
        }

        public boolean d(y yVar, Object obj) {
            return ((double[]) obj).length == 0;
        }

        public void f(Object obj, b.j.a.b.f fVar, y yVar) {
            double[] dArr = (double[]) obj;
            int i2 = 0;
            if (dArr.length != 1 || !r(yVar)) {
                fVar.Y(dArr);
                int length = dArr.length;
                fVar.b(dArr.length, 0, length);
                fVar.M0(length);
                fVar.Y(dArr);
                int i3 = length + 0;
                while (i2 < i3) {
                    fVar.v0(dArr[i2]);
                    i2++;
                }
                fVar.q0();
                return;
            }
            int length2 = dArr.length;
            while (i2 < length2) {
                fVar.v0(dArr[i2]);
                i2++;
            }
        }

        public b.j.a.c.h0.h<?> q(b.j.a.c.f0.f fVar) {
            return this;
        }

        public n<?> t(b.j.a.c.d dVar, Boolean bool) {
            return new c(this, dVar, bool);
        }

        public void u(Object obj, b.j.a.b.f fVar, y yVar) {
            for (double v0 : (double[]) obj) {
                fVar.v0(v0);
            }
        }
    }

    @b.j.a.c.z.a
    public static class d extends h<float[]> {
        static {
            b.j.a.c.i0.n.f2184k.n(Float.TYPE);
        }

        public d() {
            super(float[].class);
        }

        public d(d dVar, b.j.a.c.d dVar2, Boolean bool) {
            super(dVar, dVar2, bool);
        }

        public boolean d(y yVar, Object obj) {
            return ((float[]) obj).length == 0;
        }

        public void f(Object obj, b.j.a.b.f fVar, y yVar) {
            float[] fArr = (float[]) obj;
            int length = fArr.length;
            if (length != 1 || !r(yVar)) {
                fVar.M0(length);
                fVar.Y(fArr);
                v(fArr, fVar);
                fVar.q0();
                return;
            }
            v(fArr, fVar);
        }

        public n<?> t(b.j.a.c.d dVar, Boolean bool) {
            return new d(this, dVar, bool);
        }

        public /* bridge */ /* synthetic */ void u(Object obj, b.j.a.b.f fVar, y yVar) {
            v((float[]) obj, fVar);
        }

        public void v(float[] fArr, b.j.a.b.f fVar) {
            for (float w0 : fArr) {
                fVar.w0(w0);
            }
        }
    }

    @b.j.a.c.z.a
    public static class e extends a<int[]> {
        static {
            b.j.a.c.i0.n.f2184k.n(Integer.TYPE);
        }

        public e() {
            super(int[].class);
        }

        public e(e eVar, b.j.a.c.d dVar, Boolean bool) {
            super(eVar, dVar, bool);
        }

        public boolean d(y yVar, Object obj) {
            return ((int[]) obj).length == 0;
        }

        public void f(Object obj, b.j.a.b.f fVar, y yVar) {
            int[] iArr = (int[]) obj;
            int i2 = 0;
            if (iArr.length != 1 || !r(yVar)) {
                fVar.Y(iArr);
                int length = iArr.length;
                fVar.b(iArr.length, 0, length);
                fVar.M0(length);
                fVar.Y(iArr);
                int i3 = length + 0;
                while (i2 < i3) {
                    fVar.x0(iArr[i2]);
                    i2++;
                }
                fVar.q0();
                return;
            }
            int length2 = iArr.length;
            while (i2 < length2) {
                fVar.x0(iArr[i2]);
                i2++;
            }
        }

        public b.j.a.c.h0.h<?> q(b.j.a.c.f0.f fVar) {
            return this;
        }

        public n<?> t(b.j.a.c.d dVar, Boolean bool) {
            return new e(this, dVar, bool);
        }

        public void u(Object obj, b.j.a.b.f fVar, y yVar) {
            for (int x0 : (int[]) obj) {
                fVar.x0(x0);
            }
        }
    }

    @b.j.a.c.z.a
    public static class f extends h<long[]> {
        static {
            b.j.a.c.i0.n.f2184k.n(Long.TYPE);
        }

        public f() {
            super(long[].class);
        }

        public f(f fVar, b.j.a.c.d dVar, Boolean bool) {
            super(fVar, dVar, bool);
        }

        public boolean d(y yVar, Object obj) {
            return ((long[]) obj).length == 0;
        }

        public void f(Object obj, b.j.a.b.f fVar, y yVar) {
            long[] jArr = (long[]) obj;
            int i2 = 0;
            if (jArr.length != 1 || !r(yVar)) {
                fVar.Y(jArr);
                int length = jArr.length;
                fVar.b(jArr.length, 0, length);
                fVar.M0(length);
                fVar.Y(jArr);
                int i3 = length + 0;
                while (i2 < i3) {
                    fVar.y0(jArr[i2]);
                    i2++;
                }
                fVar.q0();
                return;
            }
            int length2 = jArr.length;
            while (i2 < length2) {
                fVar.y0(jArr[i2]);
                i2++;
            }
        }

        public n<?> t(b.j.a.c.d dVar, Boolean bool) {
            return new f(this, dVar, bool);
        }

        public void u(Object obj, b.j.a.b.f fVar, y yVar) {
            for (long y0 : (long[]) obj) {
                fVar.y0(y0);
            }
        }
    }

    @b.j.a.c.z.a
    public static class g extends h<short[]> {
        static {
            b.j.a.c.i0.n.f2184k.n(Short.TYPE);
        }

        public g() {
            super(short[].class);
        }

        public g(g gVar, b.j.a.c.d dVar, Boolean bool) {
            super(gVar, dVar, bool);
        }

        public boolean d(y yVar, Object obj) {
            return ((short[]) obj).length == 0;
        }

        public void f(Object obj, b.j.a.b.f fVar, y yVar) {
            short[] sArr = (short[]) obj;
            int length = sArr.length;
            if (length != 1 || !r(yVar)) {
                fVar.M0(length);
                fVar.Y(sArr);
                v(sArr, fVar);
                fVar.q0();
                return;
            }
            v(sArr, fVar);
        }

        public n<?> t(b.j.a.c.d dVar, Boolean bool) {
            return new g(this, dVar, bool);
        }

        public /* bridge */ /* synthetic */ void u(Object obj, b.j.a.b.f fVar, y yVar) {
            v((short[]) obj, fVar);
        }

        public void v(short[] sArr, b.j.a.b.f fVar) {
            for (short x0 : sArr) {
                fVar.x0(x0);
            }
        }
    }

    public static abstract class h<T> extends a<T> {
        public h(h<T> hVar, b.j.a.c.d dVar, Boolean bool) {
            super(hVar, dVar, bool);
        }

        public h(Class<T> cls) {
            super(cls);
        }

        public final b.j.a.c.h0.h<?> q(b.j.a.c.f0.f fVar) {
            return this;
        }
    }

    static {
        HashMap<String, n<?>> hashMap = new HashMap<>();
        a = hashMap;
        hashMap.put(boolean[].class.getName(), new a());
        hashMap.put(byte[].class.getName(), new f());
        hashMap.put(char[].class.getName(), new b());
        hashMap.put(short[].class.getName(), new g());
        hashMap.put(int[].class.getName(), new e());
        hashMap.put(long[].class.getName(), new f());
        hashMap.put(float[].class.getName(), new d());
        hashMap.put(double[].class.getName(), new c());
    }
}
