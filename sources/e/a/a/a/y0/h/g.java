package e.a.a.a.y0.h;

import e.a.a.a.y0.h.g.a;
import e.a.a.a.y0.h.h;
import e.a.a.a.y0.h.i;
import e.a.a.a.y0.h.p;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class g<FieldDescriptorType extends a<FieldDescriptorType>> {
    public static final g d = new g(true);
    public final u<FieldDescriptorType, Object> a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f9235b;
    public boolean c = false;

    public interface a<T extends a<T>> extends Comparable<T> {
        int f();

        p.a g(p.a aVar, p pVar);

        boolean i();

        y k();

        z o();

        boolean q();
    }

    public g() {
        int i2 = u.f9271m;
        this.a = new t(16);
    }

    public static int d(y yVar, Object obj) {
        switch (yVar.ordinal()) {
            case 0:
                ((Double) obj).doubleValue();
                return 8;
            case 1:
                ((Float) obj).floatValue();
                return 4;
            case 2:
                return e.h(((Long) obj).longValue());
            case 3:
                return e.h(((Long) obj).longValue());
            case 4:
                return e.d(((Integer) obj).intValue());
            case 5:
                ((Long) obj).longValue();
                return 8;
            case 6:
                ((Integer) obj).intValue();
                return 4;
            case 7:
                ((Boolean) obj).booleanValue();
                return 1;
            case 8:
                try {
                    byte[] bytes = ((String) obj).getBytes("UTF-8");
                    return e.g(bytes.length) + bytes.length;
                } catch (UnsupportedEncodingException e2) {
                    throw new RuntimeException("UTF-8 not supported.", e2);
                }
            case 9:
                return ((p) obj).a();
            case 10:
                if (!(obj instanceof k)) {
                    return e.f((p) obj);
                }
                k kVar = (k) obj;
                if (kVar.a) {
                    int a2 = kVar.f9251b.a();
                    return e.g(a2) + a2;
                }
                throw null;
            case 11:
                if (obj instanceof c) {
                    return e.a((c) obj);
                }
                byte[] bArr = (byte[]) obj;
                return e.g(bArr.length) + bArr.length;
            case 12:
                return e.g(((Integer) obj).intValue());
            case 13:
                if (obj instanceof i.a) {
                    return e.d(((i.a) obj).f());
                }
                return e.d(((Integer) obj).intValue());
            case 14:
                ((Integer) obj).intValue();
                return 4;
            case 15:
                ((Long) obj).longValue();
                return 8;
            case 16:
                int intValue = ((Integer) obj).intValue();
                return e.g((intValue >> 31) ^ (intValue << 1));
            case 17:
                long longValue = ((Long) obj).longValue();
                return e.h((longValue >> 63) ^ (longValue << 1));
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    public static int e(a<?> aVar, Object obj) {
        int i2;
        int d2;
        y k2 = aVar.k();
        int f = aVar.f();
        if (aVar.i()) {
            int i3 = 0;
            List<Object> list = (List) obj;
            if (aVar.q()) {
                for (Object d3 : list) {
                    i3 += d(k2, d3);
                }
                i2 = e.i(f) + i3;
                d2 = e.g(i3);
            } else {
                for (Object next : list) {
                    int i4 = e.i(f);
                    if (k2 == y.GROUP) {
                        i4 *= 2;
                    }
                    i3 += d(k2, next) + i4;
                }
                return i3;
            }
        } else {
            i2 = e.i(f);
            if (k2 == y.GROUP) {
                i2 *= 2;
            }
            d2 = d(k2, obj);
        }
        return d2 + i2;
    }

    public static int g(y yVar, boolean z) {
        if (z) {
            return 2;
        }
        return yVar.f9301i;
    }

    public static Object k(d dVar, y yVar, boolean z) {
        byte[] bArr;
        switch (yVar.ordinal()) {
            case 0:
                return Double.valueOf(Double.longBitsToDouble(dVar.k()));
            case 1:
                return Float.valueOf(Float.intBitsToFloat(dVar.j()));
            case 2:
                return Long.valueOf(dVar.m());
            case 3:
                return Long.valueOf(dVar.m());
            case 4:
                return Integer.valueOf(dVar.l());
            case 5:
                return Long.valueOf(dVar.k());
            case 6:
                return Integer.valueOf(dVar.j());
            case 7:
                return Boolean.valueOf(dVar.e());
            case 8:
                if (z) {
                    int l2 = dVar.l();
                    int i2 = dVar.f9226e;
                    if (l2 <= dVar.c - i2 && l2 > 0) {
                        bArr = dVar.a;
                        dVar.f9226e = i2 + l2;
                    } else if (l2 == 0) {
                        return "";
                    } else {
                        bArr = dVar.i(l2);
                        i2 = 0;
                    }
                    if (b.q.a.a.b2(bArr, i2, i2 + l2)) {
                        return new String(bArr, i2, l2, "UTF-8");
                    }
                    throw new j("Protocol message had invalid UTF-8.");
                }
                int l3 = dVar.l();
                if (l3 <= dVar.c - dVar.f9226e && l3 > 0) {
                    String str = new String(dVar.a, dVar.f9226e, l3, "UTF-8");
                    dVar.f9226e += l3;
                    return str;
                } else if (l3 == 0) {
                    return "";
                } else {
                    return new String(dVar.i(l3), "UTF-8");
                }
            case 9:
                throw new IllegalArgumentException("readPrimitiveField() cannot handle nested groups.");
            case 10:
                throw new IllegalArgumentException("readPrimitiveField() cannot handle embedded messages.");
            case 11:
                return dVar.f();
            case 12:
                return Integer.valueOf(dVar.l());
            case 13:
                throw new IllegalArgumentException("readPrimitiveField() cannot handle enums.");
            case 14:
                return Integer.valueOf(dVar.j());
            case 15:
                return Long.valueOf(dVar.k());
            case 16:
                int l4 = dVar.l();
                return Integer.valueOf((-(l4 & 1)) ^ (l4 >>> 1));
            case 17:
                long m2 = dVar.m();
                return Long.valueOf((-(m2 & 1)) ^ (m2 >>> 1));
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0026, code lost:
        if ((r2 instanceof byte[]) == false) goto L_0x003c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0028, code lost:
        r0 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0014, code lost:
        if ((r2 instanceof e.a.a.a.y0.h.k) == false) goto L_0x003c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001d, code lost:
        if ((r2 instanceof e.a.a.a.y0.h.i.a) == false) goto L_0x003c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m(e.a.a.a.y0.h.y r1, java.lang.Object r2) {
        /*
            java.util.Objects.requireNonNull(r2)
            e.a.a.a.y0.h.z r1 = r1.f9300h
            int r1 = r1.ordinal()
            r0 = 0
            switch(r1) {
                case 0: goto L_0x003a;
                case 1: goto L_0x0037;
                case 2: goto L_0x0034;
                case 3: goto L_0x0031;
                case 4: goto L_0x002e;
                case 5: goto L_0x002b;
                case 6: goto L_0x0020;
                case 7: goto L_0x0017;
                case 8: goto L_0x000e;
                default: goto L_0x000d;
            }
        L_0x000d:
            goto L_0x003c
        L_0x000e:
            boolean r1 = r2 instanceof e.a.a.a.y0.h.p
            if (r1 != 0) goto L_0x0028
            boolean r1 = r2 instanceof e.a.a.a.y0.h.k
            if (r1 == 0) goto L_0x003c
            goto L_0x0028
        L_0x0017:
            boolean r1 = r2 instanceof java.lang.Integer
            if (r1 != 0) goto L_0x0028
            boolean r1 = r2 instanceof e.a.a.a.y0.h.i.a
            if (r1 == 0) goto L_0x003c
            goto L_0x0028
        L_0x0020:
            boolean r1 = r2 instanceof e.a.a.a.y0.h.c
            if (r1 != 0) goto L_0x0028
            boolean r1 = r2 instanceof byte[]
            if (r1 == 0) goto L_0x003c
        L_0x0028:
            r1 = 1
            r0 = r1
            goto L_0x003c
        L_0x002b:
            boolean r0 = r2 instanceof java.lang.String
            goto L_0x003c
        L_0x002e:
            boolean r0 = r2 instanceof java.lang.Boolean
            goto L_0x003c
        L_0x0031:
            boolean r0 = r2 instanceof java.lang.Double
            goto L_0x003c
        L_0x0034:
            boolean r0 = r2 instanceof java.lang.Float
            goto L_0x003c
        L_0x0037:
            boolean r0 = r2 instanceof java.lang.Long
            goto L_0x003c
        L_0x003a:
            boolean r0 = r2 instanceof java.lang.Integer
        L_0x003c:
            if (r0 == 0) goto L_0x003f
            return
        L_0x003f:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "Wrong object type used with protocol message reflection."
            r1.<init>(r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: e.a.a.a.y0.h.g.m(e.a.a.a.y0.h.y, java.lang.Object):void");
    }

    public static void n(e eVar, y yVar, int i2, Object obj) {
        if (yVar == y.GROUP) {
            int i3 = i2 << 3;
            eVar.y(i3 | 3);
            ((p) obj).d(eVar);
            eVar.y(i3 | 4);
            return;
        }
        eVar.y((i2 << 3) | g(yVar, false));
        o(eVar, yVar, obj);
    }

    public static void o(e eVar, y yVar, Object obj) {
        switch (yVar.ordinal()) {
            case 0:
                eVar.x(Double.doubleToRawLongBits(((Double) obj).doubleValue()));
                return;
            case 1:
                eVar.w(Float.floatToRawIntBits(((Float) obj).floatValue()));
                return;
            case 2:
                eVar.z(((Long) obj).longValue());
                return;
            case 3:
                eVar.z(((Long) obj).longValue());
                return;
            case 4:
                eVar.q(((Integer) obj).intValue());
                return;
            case 5:
                eVar.x(((Long) obj).longValue());
                return;
            case 6:
                eVar.w(((Integer) obj).intValue());
                return;
            case 7:
                eVar.t(((Boolean) obj).booleanValue() ? 1 : 0);
                return;
            case 8:
                byte[] bytes = ((String) obj).getBytes("UTF-8");
                eVar.y(bytes.length);
                eVar.v(bytes);
                return;
            case 9:
                ((p) obj).d(eVar);
                return;
            case 10:
                eVar.s((p) obj);
                return;
            case 11:
                if (obj instanceof c) {
                    eVar.m((c) obj);
                    return;
                }
                byte[] bArr = (byte[]) obj;
                eVar.y(bArr.length);
                eVar.v(bArr);
                return;
            case 12:
                eVar.y(((Integer) obj).intValue());
                return;
            case 13:
                eVar.o(obj instanceof i.a ? ((i.a) obj).f() : ((Integer) obj).intValue());
                return;
            case 14:
                eVar.w(((Integer) obj).intValue());
                return;
            case 15:
                eVar.x(((Long) obj).longValue());
                return;
            case 16:
                int intValue = ((Integer) obj).intValue();
                eVar.y((intValue >> 31) ^ (intValue << 1));
                return;
            case 17:
                long longValue = ((Long) obj).longValue();
                eVar.z((longValue >> 63) ^ (longValue << 1));
                return;
            default:
                return;
        }
    }

    public void a(FieldDescriptorType fielddescriptortype, Object obj) {
        List list;
        if (((h.e) fielddescriptortype).f9244k) {
            m(((h.e) fielddescriptortype).f9243j, obj);
            Object f = f(fielddescriptortype);
            if (f == null) {
                list = new ArrayList();
                this.a.g(fielddescriptortype, list);
            } else {
                list = (List) f;
            }
            list.add(obj);
            return;
        }
        throw new IllegalArgumentException("addRepeatedField() can only be called on repeated fields.");
    }

    /* renamed from: b */
    public g<FieldDescriptorType> clone() {
        g<FieldDescriptorType> gVar = new g<>();
        for (int i2 = 0; i2 < this.a.d(); i2++) {
            Map.Entry<FieldDescriptorType, Object> c2 = this.a.c(i2);
            gVar.l((a) c2.getKey(), c2.getValue());
        }
        for (Map.Entry next : this.a.e()) {
            gVar.l((a) next.getKey(), next.getValue());
        }
        gVar.c = this.c;
        return gVar;
    }

    public final Object c(Object obj) {
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    public Object f(FieldDescriptorType fielddescriptortype) {
        Object obj = this.a.get(fielddescriptortype);
        return obj instanceof k ? ((k) obj).a() : obj;
    }

    public final boolean h(Map.Entry<FieldDescriptorType, Object> entry) {
        a aVar = (a) entry.getKey();
        if (aVar.o() == z.MESSAGE) {
            boolean i2 = aVar.i();
            Object value = entry.getValue();
            if (i2) {
                for (p g2 : (List) value) {
                    if (!g2.g()) {
                        return false;
                    }
                }
            } else if (value instanceof p) {
                if (!((p) value).g()) {
                    return false;
                }
            } else if (value instanceof k) {
                return true;
            } else {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
        }
        return true;
    }

    public void i() {
        if (!this.f9235b) {
            t tVar = (t) this.a;
            if (!tVar.f9275k) {
                for (int i2 = 0; i2 < tVar.d(); i2++) {
                    Map.Entry c2 = tVar.c(i2);
                    if (((a) c2.getKey()).i()) {
                        c2.setValue(Collections.unmodifiableList((List) c2.getValue()));
                    }
                }
                for (Map.Entry entry : tVar.e()) {
                    if (((a) entry.getKey()).i()) {
                        entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                    }
                }
            }
            if (!tVar.f9275k) {
                tVar.f9274j = tVar.f9274j.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(tVar.f9274j);
                tVar.f9275k = true;
            }
            this.f9235b = true;
        }
    }

    public final void j(Map.Entry<FieldDescriptorType, Object> entry) {
        Object obj;
        u<FieldDescriptorType, Object> uVar;
        Object f;
        a aVar = (a) entry.getKey();
        Object value = entry.getValue();
        if (value instanceof k) {
            value = ((k) value).a();
        }
        if (aVar.i()) {
            Object f2 = f(aVar);
            if (f2 == null) {
                f2 = new ArrayList();
            }
            for (Object c2 : (List) value) {
                ((List) f2).add(c(c2));
            }
            this.a.g(aVar, f2);
            return;
        }
        if (aVar.o() != z.MESSAGE || (f = f(aVar)) == null) {
            uVar = this.a;
            obj = c(value);
        } else {
            obj = aVar.g(((p) f).c(), (p) value).e();
            uVar = this.a;
        }
        uVar.g(aVar, obj);
    }

    public void l(FieldDescriptorType fielddescriptortype, Object obj) {
        if (!fielddescriptortype.i()) {
            m(fielddescriptortype.k(), obj);
        } else if (obj instanceof List) {
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                m(fielddescriptortype.k(), it.next());
            }
            obj = arrayList;
        } else {
            throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
        }
        if (obj instanceof k) {
            this.c = true;
        }
        this.a.g(fielddescriptortype, obj);
    }

    public g(boolean z) {
        int i2 = u.f9271m;
        this.a = new t(0);
        i();
    }
}
