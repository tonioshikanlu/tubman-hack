package e.a.a.a.y0.j.t;

import e.a.a.a.y0.b.w;
import e.a.a.a.y0.m.d0;
import e.a.a.a.y0.m.k0;
import e.t.g;
import e.t.o;
import e.x.b.l;
import e.x.c.k;
import java.util.ArrayList;
import java.util.List;

public final class i {

    public static final class a extends k implements l<w, d0> {

        /* renamed from: h  reason: collision with root package name */
        public final /* synthetic */ e.a.a.a.y0.a.i f9413h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(e.a.a.a.y0.a.i iVar) {
            super(1);
            this.f9413h = iVar;
        }

        public Object invoke(Object obj) {
            w wVar = (w) obj;
            e.x.c.i.e(wVar, "module");
            k0 r = wVar.v().r(this.f9413h);
            e.x.c.i.d(r, "module.builtIns.getPrimi…KotlinType(componentType)");
            return r;
        }
    }

    public static final b a(List<?> list, e.a.a.a.y0.a.i iVar) {
        List<T> W = g.W(list);
        ArrayList arrayList = new ArrayList();
        for (T b2 : W) {
            g<?> b3 = b(b2);
            if (b3 != null) {
                arrayList.add(b3);
            }
        }
        return new b(arrayList, new a(iVar));
    }

    public static final g<?> b(Object obj) {
        e.a.a.a.y0.a.i iVar;
        List list;
        List list2 = o.f7934h;
        if (obj instanceof Byte) {
            return new d(((Number) obj).byteValue());
        }
        if (obj instanceof Short) {
            return new w(((Number) obj).shortValue());
        }
        if (obj instanceof Integer) {
            return new n(((Number) obj).intValue());
        }
        if (obj instanceof Long) {
            return new u(((Number) obj).longValue());
        }
        if (obj instanceof Character) {
            return new e(((Character) obj).charValue());
        }
        if (obj instanceof Float) {
            return new m(((Number) obj).floatValue());
        }
        if (obj instanceof Double) {
            return new j(((Number) obj).doubleValue());
        }
        if (obj instanceof Boolean) {
            return new c(((Boolean) obj).booleanValue());
        }
        if (obj instanceof String) {
            return new x((String) obj);
        }
        int i2 = 0;
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            e.x.c.i.e(bArr, "$this$toList");
            int length = bArr.length;
            ArrayList arrayList = list2;
            if (length != 0) {
                if (length != 1) {
                    e.x.c.i.e(bArr, "$this$toMutableList");
                    ArrayList arrayList2 = new ArrayList(bArr.length);
                    int length2 = bArr.length;
                    while (i2 < length2) {
                        arrayList2.add(Byte.valueOf(bArr[i2]));
                        i2++;
                    }
                    arrayList = arrayList2;
                } else {
                    arrayList = b.q.a.a.l2(Byte.valueOf(bArr[0]));
                }
            }
            iVar = e.a.a.a.y0.a.i.BYTE;
            list = arrayList;
        } else if (obj instanceof short[]) {
            short[] sArr = (short[]) obj;
            e.x.c.i.e(sArr, "$this$toList");
            int length3 = sArr.length;
            ArrayList arrayList3 = list2;
            if (length3 != 0) {
                if (length3 != 1) {
                    e.x.c.i.e(sArr, "$this$toMutableList");
                    ArrayList arrayList4 = new ArrayList(sArr.length);
                    int length4 = sArr.length;
                    while (i2 < length4) {
                        arrayList4.add(Short.valueOf(sArr[i2]));
                        i2++;
                    }
                    arrayList3 = arrayList4;
                } else {
                    arrayList3 = b.q.a.a.l2(Short.valueOf(sArr[0]));
                }
            }
            iVar = e.a.a.a.y0.a.i.SHORT;
            list = arrayList3;
        } else if (obj instanceof int[]) {
            int[] iArr = (int[]) obj;
            e.x.c.i.e(iArr, "$this$toList");
            int length5 = iArr.length;
            ArrayList arrayList5 = list2;
            if (length5 != 0) {
                if (length5 != 1) {
                    e.x.c.i.e(iArr, "$this$toMutableList");
                    ArrayList arrayList6 = new ArrayList(iArr.length);
                    int length6 = iArr.length;
                    while (i2 < length6) {
                        arrayList6.add(Integer.valueOf(iArr[i2]));
                        i2++;
                    }
                    arrayList5 = arrayList6;
                } else {
                    arrayList5 = b.q.a.a.l2(Integer.valueOf(iArr[0]));
                }
            }
            iVar = e.a.a.a.y0.a.i.INT;
            list = arrayList5;
        } else if (obj instanceof long[]) {
            long[] jArr = (long[]) obj;
            e.x.c.i.e(jArr, "$this$toList");
            int length7 = jArr.length;
            ArrayList arrayList7 = list2;
            if (length7 != 0) {
                if (length7 != 1) {
                    e.x.c.i.e(jArr, "$this$toMutableList");
                    ArrayList arrayList8 = new ArrayList(jArr.length);
                    int length8 = jArr.length;
                    while (i2 < length8) {
                        arrayList8.add(Long.valueOf(jArr[i2]));
                        i2++;
                    }
                    arrayList7 = arrayList8;
                } else {
                    arrayList7 = b.q.a.a.l2(Long.valueOf(jArr[0]));
                }
            }
            iVar = e.a.a.a.y0.a.i.LONG;
            list = arrayList7;
        } else if (obj instanceof char[]) {
            char[] cArr = (char[]) obj;
            e.x.c.i.e(cArr, "$this$toList");
            int length9 = cArr.length;
            ArrayList arrayList9 = list2;
            if (length9 != 0) {
                if (length9 != 1) {
                    e.x.c.i.e(cArr, "$this$toMutableList");
                    ArrayList arrayList10 = new ArrayList(cArr.length);
                    int length10 = cArr.length;
                    while (i2 < length10) {
                        arrayList10.add(Character.valueOf(cArr[i2]));
                        i2++;
                    }
                    arrayList9 = arrayList10;
                } else {
                    arrayList9 = b.q.a.a.l2(Character.valueOf(cArr[0]));
                }
            }
            iVar = e.a.a.a.y0.a.i.CHAR;
            list = arrayList9;
        } else if (obj instanceof float[]) {
            float[] fArr = (float[]) obj;
            e.x.c.i.e(fArr, "$this$toList");
            int length11 = fArr.length;
            ArrayList arrayList11 = list2;
            if (length11 != 0) {
                if (length11 != 1) {
                    e.x.c.i.e(fArr, "$this$toMutableList");
                    ArrayList arrayList12 = new ArrayList(fArr.length);
                    int length12 = fArr.length;
                    while (i2 < length12) {
                        arrayList12.add(Float.valueOf(fArr[i2]));
                        i2++;
                    }
                    arrayList11 = arrayList12;
                } else {
                    arrayList11 = b.q.a.a.l2(Float.valueOf(fArr[0]));
                }
            }
            iVar = e.a.a.a.y0.a.i.FLOAT;
            list = arrayList11;
        } else if (obj instanceof double[]) {
            double[] dArr = (double[]) obj;
            e.x.c.i.e(dArr, "$this$toList");
            int length13 = dArr.length;
            ArrayList arrayList13 = list2;
            if (length13 != 0) {
                if (length13 != 1) {
                    e.x.c.i.e(dArr, "$this$toMutableList");
                    ArrayList arrayList14 = new ArrayList(dArr.length);
                    int length14 = dArr.length;
                    while (i2 < length14) {
                        arrayList14.add(Double.valueOf(dArr[i2]));
                        i2++;
                    }
                    arrayList13 = arrayList14;
                } else {
                    arrayList13 = b.q.a.a.l2(Double.valueOf(dArr[0]));
                }
            }
            iVar = e.a.a.a.y0.a.i.DOUBLE;
            list = arrayList13;
        } else if (obj instanceof boolean[]) {
            boolean[] zArr = (boolean[]) obj;
            e.x.c.i.e(zArr, "$this$toList");
            int length15 = zArr.length;
            ArrayList arrayList15 = list2;
            if (length15 != 0) {
                if (length15 != 1) {
                    e.x.c.i.e(zArr, "$this$toMutableList");
                    ArrayList arrayList16 = new ArrayList(zArr.length);
                    int length16 = zArr.length;
                    while (i2 < length16) {
                        arrayList16.add(Boolean.valueOf(zArr[i2]));
                        i2++;
                    }
                    arrayList15 = arrayList16;
                } else {
                    arrayList15 = b.q.a.a.l2(Boolean.valueOf(zArr[0]));
                }
            }
            iVar = e.a.a.a.y0.a.i.BOOLEAN;
            list = arrayList15;
        } else if (obj == null) {
            return new v();
        } else {
            return null;
        }
        return a(list, iVar);
    }
}
