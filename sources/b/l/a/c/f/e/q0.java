package b.l.a.c.f.e;

import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.RandomAccess;

public final class q0 {
    public static final Class<?> a;

    /* renamed from: b  reason: collision with root package name */
    public static final c1<?, ?> f3240b = v(false);
    public static final c1<?, ?> c = v(true);
    public static final c1<?, ?> d = new e1();

    static {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            cls = null;
        }
        a = cls;
    }

    public static int A(List<Long> list) {
        int i2;
        int size = list.size();
        int i3 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof t) {
            t tVar = (t) list;
            i2 = 0;
            while (i3 < size) {
                i2 += bn.c(bn.h(tVar.e(i3)));
                i3++;
            }
        } else {
            int i4 = 0;
            while (i3 < size) {
                i4 = i2 + bn.c(bn.h(list.get(i3).longValue()));
                i3++;
            }
        }
        return i2;
    }

    public static int B(int i2, List<Long> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (bn.B(i2) * size) + A(list);
    }

    public static int C(List<Integer> list) {
        int i2;
        int size = list.size();
        int i3 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof f) {
            f fVar = (f) list;
            i2 = 0;
            while (i3 < size) {
                i2 += bn.C(fVar.e(i3));
                i3++;
            }
        } else {
            int i4 = 0;
            while (i3 < size) {
                i4 = i2 + bn.C(list.get(i3).intValue());
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
        return (bn.B(i2) * size) + C(list);
    }

    public static int E(List<Integer> list) {
        int i2;
        int size = list.size();
        int i3 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof f) {
            f fVar = (f) list;
            i2 = 0;
            while (i3 < size) {
                i2 += bn.C(fVar.e(i3));
                i3++;
            }
        } else {
            int i4 = 0;
            while (i3 < size) {
                i4 = i2 + bn.C(list.get(i3).intValue());
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
        return (bn.B(i2) * size) + E(list);
    }

    public static int G(List<Integer> list) {
        int i2;
        int size = list.size();
        int i3 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof f) {
            f fVar = (f) list;
            i2 = 0;
            while (i3 < size) {
                i2 += bn.b(fVar.e(i3));
                i3++;
            }
        } else {
            int i4 = 0;
            while (i3 < size) {
                i4 = i2 + bn.b(list.get(i3).intValue());
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
        return (bn.B(i2) * size) + G(list);
    }

    public static int I(List<Integer> list) {
        int i2;
        int size = list.size();
        int i3 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof f) {
            f fVar = (f) list;
            i2 = 0;
            while (i3 < size) {
                i2 += bn.b(bn.g(fVar.e(i3)));
                i3++;
            }
        } else {
            int i4 = 0;
            while (i3 < size) {
                i4 = i2 + bn.b(bn.g(list.get(i3).intValue()));
                i3++;
            }
        }
        return i2;
    }

    public static int J(int i2, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (bn.B(i2) * size) + I(list);
    }

    public static int K(List<?> list) {
        return list.size() * 4;
    }

    public static int L(int i2, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (bn.B(i2) + 4) * size;
    }

    public static int M(List<?> list) {
        return list.size() * 8;
    }

    public static int N(int i2, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (bn.B(i2) + 8) * size;
    }

    public static int O(int i2, List<?> list) {
        int size = list.size();
        int i3 = 0;
        if (size == 0) {
            return 0;
        }
        int B = bn.B(i2) * size;
        if (list instanceof p) {
            p pVar = (p) list;
            while (i3 < size) {
                Object j2 = pVar.j(i3);
                B = (j2 instanceof um ? bn.e((um) j2) : bn.d((String) j2)) + B;
                i3++;
            }
        } else {
            while (i3 < size) {
                Object obj = list.get(i3);
                B = (obj instanceof um ? bn.e((um) obj) : bn.d((String) obj)) + B;
                i3++;
            }
        }
        return B;
    }

    public static int P(int i2, Object obj, o0 o0Var) {
        if (obj instanceof n) {
            int B = bn.B(i2);
            int a2 = ((n) obj).a();
            return bn.b(a2) + a2 + B;
        }
        return bn.f((e0) obj, o0Var) + bn.B(i2);
    }

    public static int Q(int i2, List<?> list, o0 o0Var) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int B = bn.B(i2) * size;
        for (int i3 = 0; i3 < size; i3++) {
            Object obj = list.get(i3);
            if (obj instanceof n) {
                int a2 = ((n) obj).a();
                B += bn.b(a2) + a2;
            } else {
                B = bn.f((e0) obj, o0Var) + B;
            }
        }
        return B;
    }

    public static int R(int i2, List<um> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int B = bn.B(i2) * size;
        for (int i3 = 0; i3 < list.size(); i3++) {
            B += bn.e(list.get(i3));
        }
        return B;
    }

    public static int S(int i2, List<e0> list, o0 o0Var) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            i3 += bn.j(i2, list.get(i4), o0Var);
        }
        return i3;
    }

    public static boolean a(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public static <UT, UB> UB b(int i2, List<Integer> list, h hVar, UB ub, c1<UT, UB> c1Var) {
        if (hVar == null) {
            return ub;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i3 = 0;
            for (int i4 = 0; i4 < size; i4++) {
                int intValue = list.get(i4).intValue();
                if (hVar.a()) {
                    if (i4 != i3) {
                        list.set(i3, Integer.valueOf(intValue));
                    }
                    i3++;
                } else {
                    if (ub == null) {
                        ub = c1Var.g();
                    }
                    c1Var.b(ub, i2, (long) intValue);
                }
            }
            if (i3 != size) {
                list.subList(i3, size).clear();
                return ub;
            }
        } else {
            Iterator<Integer> it = list.iterator();
            while (it.hasNext()) {
                int intValue2 = it.next().intValue();
                if (!hVar.a()) {
                    if (ub == null) {
                        ub = c1Var.g();
                    }
                    c1Var.b(ub, i2, (long) intValue2);
                    it.remove();
                }
            }
        }
        return ub;
    }

    public static <UT, UB> UB c(int i2, int i3, UB ub, c1<UT, UB> c1Var) {
        if (ub == null) {
            ub = c1Var.g();
        }
        c1Var.b(ub, i2, (long) i3);
        return ub;
    }

    public static void d(int i2, List<Double> list, cn cnVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            Objects.requireNonNull(cnVar);
            int i3 = 0;
            if (z) {
                cnVar.a.k(i2, 2);
                int i4 = 0;
                for (int i5 = 0; i5 < list.size(); i5++) {
                    list.get(i5).doubleValue();
                    i4 += 8;
                }
                cnVar.a.x(i4);
                while (i3 < list.size()) {
                    cnVar.a.A(Double.doubleToRawLongBits(list.get(i3).doubleValue()));
                    i3++;
                }
                return;
            }
            while (i3 < list.size()) {
                cnVar.a.q(i2, Double.doubleToRawLongBits(list.get(i3).doubleValue()));
                i3++;
            }
        }
    }

    public static void e(int i2, List<Float> list, cn cnVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            Objects.requireNonNull(cnVar);
            int i3 = 0;
            if (z) {
                cnVar.a.k(i2, 2);
                int i4 = 0;
                for (int i5 = 0; i5 < list.size(); i5++) {
                    list.get(i5).floatValue();
                    i4 += 4;
                }
                cnVar.a.x(i4);
                while (i3 < list.size()) {
                    cnVar.a.y(Float.floatToRawIntBits(list.get(i3).floatValue()));
                    i3++;
                }
                return;
            }
            while (i3 < list.size()) {
                cnVar.a.n(i2, Float.floatToRawIntBits(list.get(i3).floatValue()));
                i3++;
            }
        }
    }

    public static void f(int i2, List<Long> list, cn cnVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            Objects.requireNonNull(cnVar);
            int i3 = 0;
            if (z) {
                cnVar.a.k(i2, 2);
                int i4 = 0;
                for (int i5 = 0; i5 < list.size(); i5++) {
                    i4 += bn.c(list.get(i5).longValue());
                }
                cnVar.a.x(i4);
                while (i3 < list.size()) {
                    cnVar.a.z(list.get(i3).longValue());
                    i3++;
                }
                return;
            }
            while (i3 < list.size()) {
                cnVar.a.o(i2, list.get(i3).longValue());
                i3++;
            }
        }
    }

    public static void g(int i2, List<Long> list, cn cnVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            Objects.requireNonNull(cnVar);
            int i3 = 0;
            if (z) {
                cnVar.a.k(i2, 2);
                int i4 = 0;
                for (int i5 = 0; i5 < list.size(); i5++) {
                    i4 += bn.c(list.get(i5).longValue());
                }
                cnVar.a.x(i4);
                while (i3 < list.size()) {
                    cnVar.a.z(list.get(i3).longValue());
                    i3++;
                }
                return;
            }
            while (i3 < list.size()) {
                cnVar.a.o(i2, list.get(i3).longValue());
                i3++;
            }
        }
    }

    public static void h(int i2, List<Long> list, cn cnVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            Objects.requireNonNull(cnVar);
            int i3 = 0;
            if (z) {
                cnVar.a.k(i2, 2);
                int i4 = 0;
                for (int i5 = 0; i5 < list.size(); i5++) {
                    i4 += bn.c(bn.h(list.get(i5).longValue()));
                }
                cnVar.a.x(i4);
                while (i3 < list.size()) {
                    cnVar.a.z(bn.h(list.get(i3).longValue()));
                    i3++;
                }
                return;
            }
            while (i3 < list.size()) {
                cnVar.a.o(i2, bn.h(list.get(i3).longValue()));
                i3++;
            }
        }
    }

    public static void i(int i2, List<Long> list, cn cnVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            Objects.requireNonNull(cnVar);
            int i3 = 0;
            if (z) {
                cnVar.a.k(i2, 2);
                int i4 = 0;
                for (int i5 = 0; i5 < list.size(); i5++) {
                    list.get(i5).longValue();
                    i4 += 8;
                }
                cnVar.a.x(i4);
                while (i3 < list.size()) {
                    cnVar.a.A(list.get(i3).longValue());
                    i3++;
                }
                return;
            }
            while (i3 < list.size()) {
                cnVar.a.q(i2, list.get(i3).longValue());
                i3++;
            }
        }
    }

    public static void j(int i2, List<Long> list, cn cnVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            Objects.requireNonNull(cnVar);
            int i3 = 0;
            if (z) {
                cnVar.a.k(i2, 2);
                int i4 = 0;
                for (int i5 = 0; i5 < list.size(); i5++) {
                    list.get(i5).longValue();
                    i4 += 8;
                }
                cnVar.a.x(i4);
                while (i3 < list.size()) {
                    cnVar.a.A(list.get(i3).longValue());
                    i3++;
                }
                return;
            }
            while (i3 < list.size()) {
                cnVar.a.q(i2, list.get(i3).longValue());
                i3++;
            }
        }
    }

    public static void k(int i2, List<Integer> list, cn cnVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            Objects.requireNonNull(cnVar);
            int i3 = 0;
            if (z) {
                cnVar.a.k(i2, 2);
                int i4 = 0;
                for (int i5 = 0; i5 < list.size(); i5++) {
                    i4 += bn.C(list.get(i5).intValue());
                }
                cnVar.a.x(i4);
                while (i3 < list.size()) {
                    cnVar.a.w(list.get(i3).intValue());
                    i3++;
                }
                return;
            }
            while (i3 < list.size()) {
                cnVar.a.l(i2, list.get(i3).intValue());
                i3++;
            }
        }
    }

    public static void l(int i2, List<Integer> list, cn cnVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            Objects.requireNonNull(cnVar);
            int i3 = 0;
            if (z) {
                cnVar.a.k(i2, 2);
                int i4 = 0;
                for (int i5 = 0; i5 < list.size(); i5++) {
                    i4 += bn.b(list.get(i5).intValue());
                }
                cnVar.a.x(i4);
                while (i3 < list.size()) {
                    cnVar.a.x(list.get(i3).intValue());
                    i3++;
                }
                return;
            }
            while (i3 < list.size()) {
                cnVar.a.m(i2, list.get(i3).intValue());
                i3++;
            }
        }
    }

    public static void m(int i2, List<Integer> list, cn cnVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            Objects.requireNonNull(cnVar);
            int i3 = 0;
            if (z) {
                cnVar.a.k(i2, 2);
                int i4 = 0;
                for (int i5 = 0; i5 < list.size(); i5++) {
                    i4 += bn.b(bn.g(list.get(i5).intValue()));
                }
                cnVar.a.x(i4);
                while (i3 < list.size()) {
                    cnVar.a.x(bn.g(list.get(i3).intValue()));
                    i3++;
                }
                return;
            }
            while (i3 < list.size()) {
                cnVar.a.m(i2, bn.g(list.get(i3).intValue()));
                i3++;
            }
        }
    }

    public static void n(int i2, List<Integer> list, cn cnVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            Objects.requireNonNull(cnVar);
            int i3 = 0;
            if (z) {
                cnVar.a.k(i2, 2);
                int i4 = 0;
                for (int i5 = 0; i5 < list.size(); i5++) {
                    list.get(i5).intValue();
                    i4 += 4;
                }
                cnVar.a.x(i4);
                while (i3 < list.size()) {
                    cnVar.a.y(list.get(i3).intValue());
                    i3++;
                }
                return;
            }
            while (i3 < list.size()) {
                cnVar.a.n(i2, list.get(i3).intValue());
                i3++;
            }
        }
    }

    public static void o(int i2, List<Integer> list, cn cnVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            Objects.requireNonNull(cnVar);
            int i3 = 0;
            if (z) {
                cnVar.a.k(i2, 2);
                int i4 = 0;
                for (int i5 = 0; i5 < list.size(); i5++) {
                    list.get(i5).intValue();
                    i4 += 4;
                }
                cnVar.a.x(i4);
                while (i3 < list.size()) {
                    cnVar.a.y(list.get(i3).intValue());
                    i3++;
                }
                return;
            }
            while (i3 < list.size()) {
                cnVar.a.n(i2, list.get(i3).intValue());
                i3++;
            }
        }
    }

    public static void p(int i2, List<Integer> list, cn cnVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            Objects.requireNonNull(cnVar);
            int i3 = 0;
            if (z) {
                cnVar.a.k(i2, 2);
                int i4 = 0;
                for (int i5 = 0; i5 < list.size(); i5++) {
                    i4 += bn.C(list.get(i5).intValue());
                }
                cnVar.a.x(i4);
                while (i3 < list.size()) {
                    cnVar.a.w(list.get(i3).intValue());
                    i3++;
                }
                return;
            }
            while (i3 < list.size()) {
                cnVar.a.l(i2, list.get(i3).intValue());
                i3++;
            }
        }
    }

    public static void q(int i2, List<Boolean> list, cn cnVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            Objects.requireNonNull(cnVar);
            int i3 = 0;
            if (z) {
                cnVar.a.k(i2, 2);
                int i4 = 0;
                for (int i5 = 0; i5 < list.size(); i5++) {
                    list.get(i5).booleanValue();
                    i4++;
                }
                cnVar.a.x(i4);
                while (i3 < list.size()) {
                    cnVar.a.v(list.get(i3).booleanValue() ? (byte) 1 : 0);
                    i3++;
                }
                return;
            }
            while (i3 < list.size()) {
                cnVar.a.r(i2, list.get(i3).booleanValue());
                i3++;
            }
        }
    }

    public static void r(int i2, List<String> list, cn cnVar) {
        if (list != null && !list.isEmpty()) {
            Objects.requireNonNull(cnVar);
            int i3 = 0;
            if (list instanceof p) {
                p pVar = (p) list;
                while (i3 < list.size()) {
                    Object j2 = pVar.j(i3);
                    if (j2 instanceof String) {
                        cnVar.a.s(i2, (String) j2);
                    } else {
                        cnVar.a.t(i2, (um) j2);
                    }
                    i3++;
                }
                return;
            }
            while (i3 < list.size()) {
                cnVar.a.s(i2, list.get(i3));
                i3++;
            }
        }
    }

    public static void s(int i2, List<um> list, cn cnVar) {
        if (list != null && !list.isEmpty()) {
            Objects.requireNonNull(cnVar);
            for (int i3 = 0; i3 < list.size(); i3++) {
                cnVar.a.t(i2, list.get(i3));
            }
        }
    }

    public static void t(int i2, List<?> list, cn cnVar, o0 o0Var) {
        if (list != null && !list.isEmpty()) {
            for (int i3 = 0; i3 < list.size(); i3++) {
                cnVar.a.u(i2, (e0) list.get(i3), o0Var);
            }
        }
    }

    public static void u(int i2, List<?> list, cn cnVar, o0 o0Var) {
        if (list != null && !list.isEmpty()) {
            for (int i3 = 0; i3 < list.size(); i3++) {
                cnVar.f(i2, list.get(i3), o0Var);
            }
        }
    }

    public static c1<?, ?> v(boolean z) {
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
            return (c1) cls.getConstructor(new Class[]{Boolean.TYPE}).newInstance(new Object[]{Boolean.valueOf(z)});
        } catch (Throwable unused2) {
            return null;
        }
    }

    public static int w(List<Long> list) {
        int i2;
        int size = list.size();
        int i3 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof t) {
            t tVar = (t) list;
            i2 = 0;
            while (i3 < size) {
                i2 += bn.c(tVar.e(i3));
                i3++;
            }
        } else {
            int i4 = 0;
            while (i3 < size) {
                i4 = i2 + bn.c(list.get(i3).longValue());
                i3++;
            }
        }
        return i2;
    }

    public static int x(int i2, List list) {
        if (list.size() == 0) {
            return 0;
        }
        return (bn.B(i2) * list.size()) + w(list);
    }

    public static int y(List<Long> list) {
        int i2;
        int size = list.size();
        int i3 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof t) {
            t tVar = (t) list;
            i2 = 0;
            while (i3 < size) {
                i2 += bn.c(tVar.e(i3));
                i3++;
            }
        } else {
            int i4 = 0;
            while (i3 < size) {
                i4 = i2 + bn.c(list.get(i3).longValue());
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
        return (bn.B(i2) * size) + y(list);
    }
}
