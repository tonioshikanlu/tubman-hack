package b.l.a.c.f.i;

import java.util.List;
import java.util.Objects;

public final class c7 {
    public static final Class<?> a;

    /* renamed from: b  reason: collision with root package name */
    public static final n7<?, ?> f3509b = t(false);
    public static final n7<?, ?> c = t(true);
    public static final n7<?, ?> d = new p7();

    static {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            cls = null;
        }
        a = cls;
    }

    public static int A(List<Integer> list) {
        int i2;
        int size = list.size();
        int i3 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof q5) {
            q5 q5Var = (q5) list;
            i2 = 0;
            while (i3 < size) {
                i2 += y4.t(q5Var.l(i3));
                i3++;
            }
        } else {
            int i4 = 0;
            while (i3 < size) {
                i4 = i2 + y4.t(list.get(i3).intValue());
                i3++;
            }
        }
        return i2;
    }

    public static int B(int i2, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (y4.s(i2) * size) + A(list);
    }

    public static int C(List<Integer> list) {
        int i2;
        int size = list.size();
        int i3 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof q5) {
            q5 q5Var = (q5) list;
            i2 = 0;
            while (i3 < size) {
                i2 += y4.t(q5Var.l(i3));
                i3++;
            }
        } else {
            int i4 = 0;
            while (i3 < size) {
                i4 = i2 + y4.t(list.get(i3).intValue());
                i3++;
            }
        }
        return i2;
    }

    public static int D(int i2, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (y4.s(i2) * size) + C(list);
    }

    public static int E(List<Integer> list) {
        int i2;
        int size = list.size();
        int i3 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof q5) {
            q5 q5Var = (q5) list;
            i2 = 0;
            while (i3 < size) {
                i2 += y4.u(q5Var.l(i3));
                i3++;
            }
        } else {
            int i4 = 0;
            while (i3 < size) {
                i4 = i2 + y4.u(list.get(i3).intValue());
                i3++;
            }
        }
        return i2;
    }

    public static int F(int i2, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (y4.s(i2) * size) + E(list);
    }

    public static int G(List<Integer> list) {
        int i2;
        int size = list.size();
        int i3 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof q5) {
            q5 q5Var = (q5) list;
            i2 = 0;
            while (i3 < size) {
                int l2 = q5Var.l(i3);
                i2 += y4.u((l2 >> 31) ^ (l2 + l2));
                i3++;
            }
        } else {
            int i4 = 0;
            while (i3 < size) {
                int intValue = list.get(i3).intValue();
                i4 = i2 + y4.u((intValue >> 31) ^ (intValue + intValue));
                i3++;
            }
        }
        return i2;
    }

    public static int H(int i2, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (y4.s(i2) * size) + G(list);
    }

    public static int I(List<?> list) {
        return list.size() * 4;
    }

    public static int J(int i2, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (y4.u(i2 << 3) + 4) * size;
    }

    public static int K(List<?> list) {
        return list.size() * 8;
    }

    public static int L(int i2, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (y4.u(i2 << 3) + 8) * size;
    }

    public static int M(int i2, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (y4.u(i2 << 3) + 1) * size;
    }

    public static int N(int i2, List<?> list) {
        int size = list.size();
        int i3 = 0;
        if (size == 0) {
            return 0;
        }
        int s = y4.s(i2) * size;
        if (list instanceof c6) {
            c6 c6Var = (c6) list;
            while (i3 < size) {
                Object j2 = c6Var.j(i3);
                s = (j2 instanceof t4 ? y4.a((t4) j2) : y4.w((String) j2)) + s;
                i3++;
            }
        } else {
            while (i3 < size) {
                Object obj = list.get(i3);
                s = (obj instanceof t4 ? y4.a((t4) obj) : y4.w((String) obj)) + s;
                i3++;
            }
        }
        return s;
    }

    public static int O(int i2, Object obj, a7 a7Var) {
        if (obj instanceof a6) {
            int u = y4.u(i2 << 3);
            int a2 = ((a6) obj).a();
            return y4.u(a2) + a2 + u;
        }
        return y4.b((q6) obj, a7Var) + y4.u(i2 << 3);
    }

    public static int P(int i2, List<?> list, a7 a7Var) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int s = y4.s(i2) * size;
        for (int i3 = 0; i3 < size; i3++) {
            Object obj = list.get(i3);
            if (obj instanceof a6) {
                int a2 = ((a6) obj).a();
                s += y4.u(a2) + a2;
            } else {
                s = y4.b((q6) obj, a7Var) + s;
            }
        }
        return s;
    }

    public static int Q(int i2, List<t4> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int s = y4.s(i2) * size;
        for (int i3 = 0; i3 < list.size(); i3++) {
            s += y4.a(list.get(i3));
        }
        return s;
    }

    public static int R(int i2, List<q6> list, a7 a7Var) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            i3 += y4.c(i2, list.get(i4), a7Var);
        }
        return i3;
    }

    public static boolean a(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public static void b(int i2, List<Double> list, z4 z4Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            Objects.requireNonNull(z4Var);
            int i3 = 0;
            if (z) {
                z4Var.a.d(i2, 2);
                int i4 = 0;
                for (int i5 = 0; i5 < list.size(); i5++) {
                    list.get(i5).doubleValue();
                    i4 += 8;
                }
                z4Var.a.o(i4);
                while (i3 < list.size()) {
                    z4Var.a.r(Double.doubleToRawLongBits(list.get(i3).doubleValue()));
                    i3++;
                }
                return;
            }
            while (i3 < list.size()) {
                z4Var.a.i(i2, Double.doubleToRawLongBits(list.get(i3).doubleValue()));
                i3++;
            }
        }
    }

    public static void c(int i2, List<Float> list, z4 z4Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            Objects.requireNonNull(z4Var);
            int i3 = 0;
            if (z) {
                z4Var.a.d(i2, 2);
                int i4 = 0;
                for (int i5 = 0; i5 < list.size(); i5++) {
                    list.get(i5).floatValue();
                    i4 += 4;
                }
                z4Var.a.o(i4);
                while (i3 < list.size()) {
                    z4Var.a.p(Float.floatToRawIntBits(list.get(i3).floatValue()));
                    i3++;
                }
                return;
            }
            while (i3 < list.size()) {
                z4Var.a.g(i2, Float.floatToRawIntBits(list.get(i3).floatValue()));
                i3++;
            }
        }
    }

    public static void d(int i2, List<Long> list, z4 z4Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            Objects.requireNonNull(z4Var);
            int i3 = 0;
            if (z) {
                z4Var.a.d(i2, 2);
                int i4 = 0;
                for (int i5 = 0; i5 < list.size(); i5++) {
                    i4 += y4.v(list.get(i5).longValue());
                }
                z4Var.a.o(i4);
                while (i3 < list.size()) {
                    z4Var.a.q(list.get(i3).longValue());
                    i3++;
                }
                return;
            }
            while (i3 < list.size()) {
                z4Var.a.h(i2, list.get(i3).longValue());
                i3++;
            }
        }
    }

    public static void e(int i2, List<Long> list, z4 z4Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            Objects.requireNonNull(z4Var);
            int i3 = 0;
            if (z) {
                z4Var.a.d(i2, 2);
                int i4 = 0;
                for (int i5 = 0; i5 < list.size(); i5++) {
                    i4 += y4.v(list.get(i5).longValue());
                }
                z4Var.a.o(i4);
                while (i3 < list.size()) {
                    z4Var.a.q(list.get(i3).longValue());
                    i3++;
                }
                return;
            }
            while (i3 < list.size()) {
                z4Var.a.h(i2, list.get(i3).longValue());
                i3++;
            }
        }
    }

    public static void f(int i2, List<Long> list, z4 z4Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            Objects.requireNonNull(z4Var);
            int i3 = 0;
            if (z) {
                z4Var.a.d(i2, 2);
                int i4 = 0;
                for (int i5 = 0; i5 < list.size(); i5++) {
                    long longValue = list.get(i5).longValue();
                    i4 += y4.v((longValue >> 63) ^ (longValue + longValue));
                }
                z4Var.a.o(i4);
                while (i3 < list.size()) {
                    y4 y4Var = z4Var.a;
                    long longValue2 = list.get(i3).longValue();
                    y4Var.q((longValue2 >> 63) ^ (longValue2 + longValue2));
                    i3++;
                }
                return;
            }
            while (i3 < list.size()) {
                y4 y4Var2 = z4Var.a;
                long longValue3 = list.get(i3).longValue();
                y4Var2.h(i2, (longValue3 >> 63) ^ (longValue3 + longValue3));
                i3++;
            }
        }
    }

    public static void g(int i2, List<Long> list, z4 z4Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            Objects.requireNonNull(z4Var);
            int i3 = 0;
            if (z) {
                z4Var.a.d(i2, 2);
                int i4 = 0;
                for (int i5 = 0; i5 < list.size(); i5++) {
                    list.get(i5).longValue();
                    i4 += 8;
                }
                z4Var.a.o(i4);
                while (i3 < list.size()) {
                    z4Var.a.r(list.get(i3).longValue());
                    i3++;
                }
                return;
            }
            while (i3 < list.size()) {
                z4Var.a.i(i2, list.get(i3).longValue());
                i3++;
            }
        }
    }

    public static void h(int i2, List<Long> list, z4 z4Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            Objects.requireNonNull(z4Var);
            int i3 = 0;
            if (z) {
                z4Var.a.d(i2, 2);
                int i4 = 0;
                for (int i5 = 0; i5 < list.size(); i5++) {
                    list.get(i5).longValue();
                    i4 += 8;
                }
                z4Var.a.o(i4);
                while (i3 < list.size()) {
                    z4Var.a.r(list.get(i3).longValue());
                    i3++;
                }
                return;
            }
            while (i3 < list.size()) {
                z4Var.a.i(i2, list.get(i3).longValue());
                i3++;
            }
        }
    }

    public static void i(int i2, List<Integer> list, z4 z4Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            Objects.requireNonNull(z4Var);
            int i3 = 0;
            if (z) {
                z4Var.a.d(i2, 2);
                int i4 = 0;
                for (int i5 = 0; i5 < list.size(); i5++) {
                    i4 += y4.t(list.get(i5).intValue());
                }
                z4Var.a.o(i4);
                while (i3 < list.size()) {
                    z4Var.a.n(list.get(i3).intValue());
                    i3++;
                }
                return;
            }
            while (i3 < list.size()) {
                z4Var.a.e(i2, list.get(i3).intValue());
                i3++;
            }
        }
    }

    public static void j(int i2, List<Integer> list, z4 z4Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            Objects.requireNonNull(z4Var);
            int i3 = 0;
            if (z) {
                z4Var.a.d(i2, 2);
                int i4 = 0;
                for (int i5 = 0; i5 < list.size(); i5++) {
                    i4 += y4.u(list.get(i5).intValue());
                }
                z4Var.a.o(i4);
                while (i3 < list.size()) {
                    z4Var.a.o(list.get(i3).intValue());
                    i3++;
                }
                return;
            }
            while (i3 < list.size()) {
                z4Var.a.f(i2, list.get(i3).intValue());
                i3++;
            }
        }
    }

    public static void k(int i2, List<Integer> list, z4 z4Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            Objects.requireNonNull(z4Var);
            int i3 = 0;
            if (z) {
                z4Var.a.d(i2, 2);
                int i4 = 0;
                for (int i5 = 0; i5 < list.size(); i5++) {
                    int intValue = list.get(i5).intValue();
                    i4 += y4.u((intValue >> 31) ^ (intValue + intValue));
                }
                z4Var.a.o(i4);
                while (i3 < list.size()) {
                    y4 y4Var = z4Var.a;
                    int intValue2 = list.get(i3).intValue();
                    y4Var.o((intValue2 >> 31) ^ (intValue2 + intValue2));
                    i3++;
                }
                return;
            }
            while (i3 < list.size()) {
                y4 y4Var2 = z4Var.a;
                int intValue3 = list.get(i3).intValue();
                y4Var2.f(i2, (intValue3 >> 31) ^ (intValue3 + intValue3));
                i3++;
            }
        }
    }

    public static void l(int i2, List<Integer> list, z4 z4Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            Objects.requireNonNull(z4Var);
            int i3 = 0;
            if (z) {
                z4Var.a.d(i2, 2);
                int i4 = 0;
                for (int i5 = 0; i5 < list.size(); i5++) {
                    list.get(i5).intValue();
                    i4 += 4;
                }
                z4Var.a.o(i4);
                while (i3 < list.size()) {
                    z4Var.a.p(list.get(i3).intValue());
                    i3++;
                }
                return;
            }
            while (i3 < list.size()) {
                z4Var.a.g(i2, list.get(i3).intValue());
                i3++;
            }
        }
    }

    public static void m(int i2, List<Integer> list, z4 z4Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            Objects.requireNonNull(z4Var);
            int i3 = 0;
            if (z) {
                z4Var.a.d(i2, 2);
                int i4 = 0;
                for (int i5 = 0; i5 < list.size(); i5++) {
                    list.get(i5).intValue();
                    i4 += 4;
                }
                z4Var.a.o(i4);
                while (i3 < list.size()) {
                    z4Var.a.p(list.get(i3).intValue());
                    i3++;
                }
                return;
            }
            while (i3 < list.size()) {
                z4Var.a.g(i2, list.get(i3).intValue());
                i3++;
            }
        }
    }

    public static void n(int i2, List<Integer> list, z4 z4Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            Objects.requireNonNull(z4Var);
            int i3 = 0;
            if (z) {
                z4Var.a.d(i2, 2);
                int i4 = 0;
                for (int i5 = 0; i5 < list.size(); i5++) {
                    i4 += y4.t(list.get(i5).intValue());
                }
                z4Var.a.o(i4);
                while (i3 < list.size()) {
                    z4Var.a.n(list.get(i3).intValue());
                    i3++;
                }
                return;
            }
            while (i3 < list.size()) {
                z4Var.a.e(i2, list.get(i3).intValue());
                i3++;
            }
        }
    }

    public static void o(int i2, List<Boolean> list, z4 z4Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            Objects.requireNonNull(z4Var);
            int i3 = 0;
            if (z) {
                z4Var.a.d(i2, 2);
                int i4 = 0;
                for (int i5 = 0; i5 < list.size(); i5++) {
                    list.get(i5).booleanValue();
                    i4++;
                }
                z4Var.a.o(i4);
                while (i3 < list.size()) {
                    z4Var.a.m(list.get(i3).booleanValue() ? (byte) 1 : 0);
                    i3++;
                }
                return;
            }
            while (i3 < list.size()) {
                z4Var.a.j(i2, list.get(i3).booleanValue());
                i3++;
            }
        }
    }

    public static void p(int i2, List<String> list, z4 z4Var) {
        if (list != null && !list.isEmpty()) {
            Objects.requireNonNull(z4Var);
            int i3 = 0;
            if (list instanceof c6) {
                c6 c6Var = (c6) list;
                while (i3 < list.size()) {
                    Object j2 = c6Var.j(i3);
                    if (j2 instanceof String) {
                        z4Var.a.k(i2, (String) j2);
                    } else {
                        z4Var.a.l(i2, (t4) j2);
                    }
                    i3++;
                }
                return;
            }
            while (i3 < list.size()) {
                z4Var.a.k(i2, list.get(i3));
                i3++;
            }
        }
    }

    public static void q(int i2, List<t4> list, z4 z4Var) {
        if (list != null && !list.isEmpty()) {
            Objects.requireNonNull(z4Var);
            for (int i3 = 0; i3 < list.size(); i3++) {
                z4Var.a.l(i2, list.get(i3));
            }
        }
    }

    public static void r(int i2, List<?> list, z4 z4Var, a7 a7Var) {
        if (list != null && !list.isEmpty()) {
            for (int i3 = 0; i3 < list.size(); i3++) {
                z4Var.e(i2, list.get(i3), a7Var);
            }
        }
    }

    public static void s(int i2, List<?> list, z4 z4Var, a7 a7Var) {
        if (list != null && !list.isEmpty()) {
            for (int i3 = 0; i3 < list.size(); i3++) {
                z4Var.f(i2, list.get(i3), a7Var);
            }
        }
    }

    public static n7<?, ?> t(boolean z) {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            cls = null;
        }
        if (cls == null) {
            return null;
        }
        try {
            return (n7) cls.getConstructor(new Class[]{Boolean.TYPE}).newInstance(new Object[]{Boolean.valueOf(z)});
        } catch (Throwable unused2) {
            return null;
        }
    }

    public static int u(List<Long> list) {
        int i2;
        int size = list.size();
        int i3 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof g6) {
            g6 g6Var = (g6) list;
            i2 = 0;
            while (i3 < size) {
                i2 += y4.v(g6Var.e(i3));
                i3++;
            }
        } else {
            int i4 = 0;
            while (i3 < size) {
                i4 = i2 + y4.v(list.get(i3).longValue());
                i3++;
            }
        }
        return i2;
    }

    public static int v(int i2, List list) {
        if (list.size() == 0) {
            return 0;
        }
        return (y4.s(i2) * list.size()) + u(list);
    }

    public static int w(List<Long> list) {
        int i2;
        int size = list.size();
        int i3 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof g6) {
            g6 g6Var = (g6) list;
            i2 = 0;
            while (i3 < size) {
                i2 += y4.v(g6Var.e(i3));
                i3++;
            }
        } else {
            int i4 = 0;
            while (i3 < size) {
                i4 = i2 + y4.v(list.get(i3).longValue());
                i3++;
            }
        }
        return i2;
    }

    public static int x(int i2, List<Long> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (y4.s(i2) * size) + w(list);
    }

    public static int y(List<Long> list) {
        int i2;
        int size = list.size();
        int i3 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof g6) {
            g6 g6Var = (g6) list;
            i2 = 0;
            while (i3 < size) {
                long e2 = g6Var.e(i3);
                i2 += y4.v((e2 >> 63) ^ (e2 + e2));
                i3++;
            }
        } else {
            int i4 = 0;
            while (i3 < size) {
                long longValue = list.get(i3).longValue();
                i4 = i2 + y4.v((longValue >> 63) ^ (longValue + longValue));
                i3++;
            }
        }
        return i2;
    }

    public static int z(int i2, List<Long> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (y4.s(i2) * size) + y(list);
    }
}
