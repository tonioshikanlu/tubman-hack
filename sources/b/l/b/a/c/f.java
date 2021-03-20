package b.l.b.a.c;

import b.l.a.c.b.a;
import b.l.b.a.c.g;
import b.l.b.a.c.j.c;
import b.l.b.a.d.e;
import b.l.b.a.d.g;
import b.l.b.a.d.j;
import b.l.b.a.d.k;
import b.l.b.a.d.l;
import java.io.Closeable;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public abstract class f implements Closeable {

    /* renamed from: h  reason: collision with root package name */
    public static WeakHashMap<Class<?>, Field> f4755h = new WeakHashMap<>();

    /* renamed from: i  reason: collision with root package name */
    public static final Lock f4756i = new ReentrantLock();

    public static Field b(Class<?> cls) {
        Field field = null;
        if (cls == null) {
            return null;
        }
        Lock lock = f4756i;
        lock.lock();
        try {
            if (f4755h.containsKey(cls)) {
                Field field2 = f4755h.get(cls);
                lock.unlock();
                return field2;
            }
            for (T t : Collections.unmodifiableCollection(e.b(cls).f4783b.values())) {
                Field field3 = t.f4812b;
                g gVar = (g) field3.getAnnotation(g.class);
                if (gVar != null) {
                    a.p(field == null, "Class contains more than one field with @JsonPolymorphicTypeMap annotation: %s", cls);
                    a.p(g.d(field3.getType()), "Field which has the @JsonPolymorphicTypeMap, %s, is not a supported type: %s", cls, field3.getType());
                    g.a[] typeDefinitions = gVar.typeDefinitions();
                    HashSet hashSet = new HashSet();
                    a.o(typeDefinitions.length > 0, "@JsonPolymorphicTypeMap must have at least one @TypeDef");
                    for (g.a aVar : typeDefinitions) {
                        a.p(hashSet.add(aVar.key()), "Class contains two @TypeDef annotations with identical key: %s", aVar.key());
                    }
                    field = field3;
                }
            }
            f4755h.put(cls, field);
            return field;
        } finally {
            f4756i.unlock();
        }
    }

    public Object H(Type type, boolean z, a aVar) {
        try {
            if (!Void.class.equals(type)) {
                Y();
            }
            return S((Field) null, type, new ArrayList(), (Object) null, aVar, true);
        } finally {
            if (z) {
                ((c) this).f4768j.close();
            }
        }
    }

    public final void N(ArrayList<Type> arrayList, Object obj, a aVar) {
        if (obj instanceof b) {
            ((b) obj).jsonFactory = ((c) this).f4769k;
        }
        i e0 = e0();
        Class<?> cls = obj.getClass();
        e b2 = e.b(cls);
        boolean isAssignableFrom = k.class.isAssignableFrom(cls);
        if (isAssignableFrom || !Map.class.isAssignableFrom(cls)) {
            while (e0 == i.FIELD_NAME) {
                String q2 = q();
                z();
                if (aVar == null) {
                    j a = b2.a(q2);
                    if (a != null) {
                        if (!Modifier.isFinal(a.f4812b.getModifiers()) || a.a) {
                            Field field = a.f4812b;
                            int size = arrayList.size();
                            arrayList.add(field.getGenericType());
                            Object S = S(field, a.a(), arrayList, obj, aVar, true);
                            arrayList.remove(size);
                            a.f(obj, S);
                        } else {
                            throw new IllegalArgumentException("final array/object fields are not supported");
                        }
                    } else if (isAssignableFrom) {
                        ((k) obj).set(q2, S((Field) null, (Type) null, arrayList, obj, aVar, true));
                    } else if (aVar == null) {
                        ((c) this).f4768j.a1();
                    } else {
                        throw null;
                    }
                    e0 = z();
                } else {
                    throw null;
                }
            }
            return;
        }
        O((Field) null, (Map) obj, l.b(cls, Map.class, 1), arrayList, aVar);
    }

    public final void O(Field field, Map<String, Object> map, Type type, ArrayList<Type> arrayList, a aVar) {
        i e0 = e0();
        while (e0 == i.FIELD_NAME) {
            String q2 = q();
            z();
            if (aVar == null) {
                map.put(q2, S(field, type, arrayList, map, aVar, true));
                e0 = z();
            } else {
                throw null;
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:194:0x02f2 A[Catch:{ IllegalArgumentException -> 0x034f }] */
    /* JADX WARNING: Removed duplicated region for block: B:199:0x02fc A[Catch:{ IllegalArgumentException -> 0x034f }] */
    /* JADX WARNING: Removed duplicated region for block: B:200:0x0301 A[ADDED_TO_REGION, Catch:{ IllegalArgumentException -> 0x034f }] */
    /* JADX WARNING: Removed duplicated region for block: B:207:0x031b A[Catch:{ IllegalArgumentException -> 0x034f }, LOOP:1: B:205:0x0317->B:207:0x031b, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:209:0x0330 A[Catch:{ IllegalArgumentException -> 0x034f }] */
    /* JADX WARNING: Removed duplicated region for block: B:211:0x0339 A[Catch:{ IllegalArgumentException -> 0x034f }, RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00ab A[Catch:{ IllegalArgumentException -> 0x034f }] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00ae A[Catch:{ IllegalArgumentException -> 0x034f }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object S(java.lang.reflect.Field r8, java.lang.reflect.Type r9, java.util.ArrayList<java.lang.reflect.Type> r10, java.lang.Object r11, b.l.b.a.c.a r12, boolean r13) {
        /*
            r7 = this;
            java.lang.Class<java.lang.Double> r11 = java.lang.Double.class
            java.lang.Class<java.lang.Float> r0 = java.lang.Float.class
            java.lang.reflect.Type r9 = b.l.b.a.d.g.j(r10, r9)
            boolean r1 = r9 instanceof java.lang.Class
            r2 = 0
            if (r1 == 0) goto L_0x0011
            r1 = r9
            java.lang.Class r1 = (java.lang.Class) r1
            goto L_0x0012
        L_0x0011:
            r1 = r2
        L_0x0012:
            boolean r3 = r9 instanceof java.lang.reflect.ParameterizedType
            if (r3 == 0) goto L_0x001d
            r1 = r9
            java.lang.reflect.ParameterizedType r1 = (java.lang.reflect.ParameterizedType) r1
            java.lang.Class r1 = b.l.b.a.d.l.g(r1)
        L_0x001d:
            java.lang.Class<java.lang.Void> r3 = java.lang.Void.class
            if (r1 != r3) goto L_0x002a
            r8 = r7
            b.l.b.a.c.j.c r8 = (b.l.b.a.c.j.c) r8
            b.j.a.b.i r8 = r8.f4768j
            r8.a1()
            return r2
        L_0x002a:
            b.l.b.a.c.i r3 = r7.e()
            b.l.b.a.c.i r4 = r7.e()     // Catch:{ IllegalArgumentException -> 0x034f }
            int r4 = r4.ordinal()     // Catch:{ IllegalArgumentException -> 0x034f }
            r5 = 0
            r6 = 1
            switch(r4) {
                case 0: goto L_0x02d1;
                case 1: goto L_0x02d1;
                case 2: goto L_0x01d9;
                case 3: goto L_0x01d9;
                case 4: goto L_0x01d9;
                case 5: goto L_0x0184;
                case 6: goto L_0x00b1;
                case 7: goto L_0x00b1;
                case 8: goto L_0x008a;
                case 9: goto L_0x008a;
                case 10: goto L_0x003f;
                default: goto L_0x003b;
            }     // Catch:{ IllegalArgumentException -> 0x034f }
        L_0x003b:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException     // Catch:{ IllegalArgumentException -> 0x034f }
            goto L_0x033a
        L_0x003f:
            if (r1 == 0) goto L_0x0047
            boolean r11 = r1.isPrimitive()     // Catch:{ IllegalArgumentException -> 0x034f }
            if (r11 != 0) goto L_0x0048
        L_0x0047:
            r5 = r6
        L_0x0048:
            java.lang.String r11 = "primitive number field but found a JSON null"
            b.l.a.c.b.a.o(r5, r11)     // Catch:{ IllegalArgumentException -> 0x034f }
            if (r1 == 0) goto L_0x0081
            int r11 = r1.getModifiers()     // Catch:{ IllegalArgumentException -> 0x034f }
            r11 = r11 & 1536(0x600, float:2.152E-42)
            if (r11 == 0) goto L_0x0081
            java.lang.Class<java.util.Collection> r11 = java.util.Collection.class
            boolean r11 = b.l.b.a.d.l.k(r1, r11)     // Catch:{ IllegalArgumentException -> 0x034f }
            if (r11 == 0) goto L_0x006c
            java.util.Collection r9 = b.l.b.a.d.g.f(r9)     // Catch:{ IllegalArgumentException -> 0x034f }
            java.lang.Class r9 = r9.getClass()     // Catch:{ IllegalArgumentException -> 0x034f }
            java.lang.Object r8 = b.l.b.a.d.g.h(r9)     // Catch:{ IllegalArgumentException -> 0x034f }
            return r8
        L_0x006c:
            java.lang.Class<java.util.Map> r11 = java.util.Map.class
            boolean r11 = b.l.b.a.d.l.k(r1, r11)     // Catch:{ IllegalArgumentException -> 0x034f }
            if (r11 == 0) goto L_0x0081
            java.util.Map r9 = b.l.b.a.d.g.g(r1)     // Catch:{ IllegalArgumentException -> 0x034f }
            java.lang.Class r9 = r9.getClass()     // Catch:{ IllegalArgumentException -> 0x034f }
            java.lang.Object r8 = b.l.b.a.d.g.h(r9)     // Catch:{ IllegalArgumentException -> 0x034f }
            return r8
        L_0x0081:
            java.lang.Class r9 = b.l.b.a.d.l.f(r10, r9)     // Catch:{ IllegalArgumentException -> 0x034f }
            java.lang.Object r8 = b.l.b.a.d.g.h(r9)     // Catch:{ IllegalArgumentException -> 0x034f }
            return r8
        L_0x008a:
            if (r9 == 0) goto L_0x009d
            java.lang.Class r10 = java.lang.Boolean.TYPE     // Catch:{ IllegalArgumentException -> 0x034f }
            if (r1 == r10) goto L_0x009d
            if (r1 == 0) goto L_0x009b
            java.lang.Class<java.lang.Boolean> r10 = java.lang.Boolean.class
            boolean r10 = r1.isAssignableFrom(r10)     // Catch:{ IllegalArgumentException -> 0x034f }
            if (r10 == 0) goto L_0x009b
            goto L_0x009d
        L_0x009b:
            r10 = r5
            goto L_0x009e
        L_0x009d:
            r10 = r6
        L_0x009e:
            java.lang.String r11 = "expected type Boolean or boolean but got %s"
            java.lang.Object[] r12 = new java.lang.Object[r6]     // Catch:{ IllegalArgumentException -> 0x034f }
            r12[r5] = r9     // Catch:{ IllegalArgumentException -> 0x034f }
            b.l.a.c.b.a.p(r10, r11, r12)     // Catch:{ IllegalArgumentException -> 0x034f }
            b.l.b.a.c.i r9 = b.l.b.a.c.i.VALUE_TRUE     // Catch:{ IllegalArgumentException -> 0x034f }
            if (r3 != r9) goto L_0x00ae
            java.lang.Boolean r8 = java.lang.Boolean.TRUE     // Catch:{ IllegalArgumentException -> 0x034f }
            goto L_0x00b0
        L_0x00ae:
            java.lang.Boolean r8 = java.lang.Boolean.FALSE     // Catch:{ IllegalArgumentException -> 0x034f }
        L_0x00b0:
            return r8
        L_0x00b1:
            if (r8 == 0) goto L_0x00bb
            java.lang.Class<b.l.b.a.c.h> r10 = b.l.b.a.c.h.class
            java.lang.annotation.Annotation r10 = r8.getAnnotation(r10)     // Catch:{ IllegalArgumentException -> 0x034f }
            if (r10 != 0) goto L_0x00bc
        L_0x00bb:
            r5 = r6
        L_0x00bc:
            java.lang.String r10 = "number type formatted as a JSON number cannot use @JsonString annotation"
            b.l.a.c.b.a.o(r5, r10)     // Catch:{ IllegalArgumentException -> 0x034f }
            if (r1 == 0) goto L_0x017a
            java.lang.Class<java.math.BigDecimal> r10 = java.math.BigDecimal.class
            boolean r10 = r1.isAssignableFrom(r10)     // Catch:{ IllegalArgumentException -> 0x034f }
            if (r10 == 0) goto L_0x00cd
            goto L_0x017a
        L_0x00cd:
            java.lang.Class<java.math.BigInteger> r10 = java.math.BigInteger.class
            if (r1 != r10) goto L_0x00db
            r9 = r7
            b.l.b.a.c.j.c r9 = (b.l.b.a.c.j.c) r9     // Catch:{ IllegalArgumentException -> 0x034f }
            b.j.a.b.i r9 = r9.f4768j     // Catch:{ IllegalArgumentException -> 0x034f }
            java.math.BigInteger r8 = r9.H()     // Catch:{ IllegalArgumentException -> 0x034f }
            return r8
        L_0x00db:
            if (r1 == r11) goto L_0x016c
            java.lang.Class r10 = java.lang.Double.TYPE     // Catch:{ IllegalArgumentException -> 0x034f }
            if (r1 != r10) goto L_0x00e3
            goto L_0x016c
        L_0x00e3:
            java.lang.Class<java.lang.Long> r10 = java.lang.Long.class
            if (r1 == r10) goto L_0x015e
            java.lang.Class r10 = java.lang.Long.TYPE     // Catch:{ IllegalArgumentException -> 0x034f }
            if (r1 != r10) goto L_0x00ed
            goto L_0x015e
        L_0x00ed:
            if (r1 == r0) goto L_0x0150
            java.lang.Class r10 = java.lang.Float.TYPE     // Catch:{ IllegalArgumentException -> 0x034f }
            if (r1 != r10) goto L_0x00f4
            goto L_0x0150
        L_0x00f4:
            java.lang.Class<java.lang.Integer> r10 = java.lang.Integer.class
            if (r1 == r10) goto L_0x0142
            java.lang.Class r10 = java.lang.Integer.TYPE     // Catch:{ IllegalArgumentException -> 0x034f }
            if (r1 != r10) goto L_0x00fd
            goto L_0x0142
        L_0x00fd:
            java.lang.Class<java.lang.Short> r10 = java.lang.Short.class
            if (r1 == r10) goto L_0x0134
            java.lang.Class r10 = java.lang.Short.TYPE     // Catch:{ IllegalArgumentException -> 0x034f }
            if (r1 != r10) goto L_0x0106
            goto L_0x0134
        L_0x0106:
            java.lang.Class<java.lang.Byte> r10 = java.lang.Byte.class
            if (r1 == r10) goto L_0x0126
            java.lang.Class r10 = java.lang.Byte.TYPE     // Catch:{ IllegalArgumentException -> 0x034f }
            if (r1 != r10) goto L_0x010f
            goto L_0x0126
        L_0x010f:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException     // Catch:{ IllegalArgumentException -> 0x034f }
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ IllegalArgumentException -> 0x034f }
            r11.<init>()     // Catch:{ IllegalArgumentException -> 0x034f }
            java.lang.String r12 = "expected numeric type but got "
            r11.append(r12)     // Catch:{ IllegalArgumentException -> 0x034f }
            r11.append(r9)     // Catch:{ IllegalArgumentException -> 0x034f }
            java.lang.String r9 = r11.toString()     // Catch:{ IllegalArgumentException -> 0x034f }
            r10.<init>(r9)     // Catch:{ IllegalArgumentException -> 0x034f }
            throw r10     // Catch:{ IllegalArgumentException -> 0x034f }
        L_0x0126:
            r9 = r7
            b.l.b.a.c.j.c r9 = (b.l.b.a.c.j.c) r9     // Catch:{ IllegalArgumentException -> 0x034f }
            b.j.a.b.i r9 = r9.f4768j     // Catch:{ IllegalArgumentException -> 0x034f }
            byte r9 = r9.O()     // Catch:{ IllegalArgumentException -> 0x034f }
            java.lang.Byte r8 = java.lang.Byte.valueOf(r9)     // Catch:{ IllegalArgumentException -> 0x034f }
            return r8
        L_0x0134:
            r9 = r7
            b.l.b.a.c.j.c r9 = (b.l.b.a.c.j.c) r9     // Catch:{ IllegalArgumentException -> 0x034f }
            b.j.a.b.i r9 = r9.f4768j     // Catch:{ IllegalArgumentException -> 0x034f }
            short r9 = r9.w0()     // Catch:{ IllegalArgumentException -> 0x034f }
            java.lang.Short r8 = java.lang.Short.valueOf(r9)     // Catch:{ IllegalArgumentException -> 0x034f }
            return r8
        L_0x0142:
            r9 = r7
            b.l.b.a.c.j.c r9 = (b.l.b.a.c.j.c) r9     // Catch:{ IllegalArgumentException -> 0x034f }
            b.j.a.b.i r9 = r9.f4768j     // Catch:{ IllegalArgumentException -> 0x034f }
            int r9 = r9.q0()     // Catch:{ IllegalArgumentException -> 0x034f }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r9)     // Catch:{ IllegalArgumentException -> 0x034f }
            return r8
        L_0x0150:
            r9 = r7
            b.l.b.a.c.j.c r9 = (b.l.b.a.c.j.c) r9     // Catch:{ IllegalArgumentException -> 0x034f }
            b.j.a.b.i r9 = r9.f4768j     // Catch:{ IllegalArgumentException -> 0x034f }
            float r9 = r9.p0()     // Catch:{ IllegalArgumentException -> 0x034f }
            java.lang.Float r8 = java.lang.Float.valueOf(r9)     // Catch:{ IllegalArgumentException -> 0x034f }
            return r8
        L_0x015e:
            r9 = r7
            b.l.b.a.c.j.c r9 = (b.l.b.a.c.j.c) r9     // Catch:{ IllegalArgumentException -> 0x034f }
            b.j.a.b.i r9 = r9.f4768j     // Catch:{ IllegalArgumentException -> 0x034f }
            long r9 = r9.r0()     // Catch:{ IllegalArgumentException -> 0x034f }
            java.lang.Long r8 = java.lang.Long.valueOf(r9)     // Catch:{ IllegalArgumentException -> 0x034f }
            return r8
        L_0x016c:
            r9 = r7
            b.l.b.a.c.j.c r9 = (b.l.b.a.c.j.c) r9     // Catch:{ IllegalArgumentException -> 0x034f }
            b.j.a.b.i r9 = r9.f4768j     // Catch:{ IllegalArgumentException -> 0x034f }
            double r9 = r9.n0()     // Catch:{ IllegalArgumentException -> 0x034f }
            java.lang.Double r8 = java.lang.Double.valueOf(r9)     // Catch:{ IllegalArgumentException -> 0x034f }
            return r8
        L_0x017a:
            r9 = r7
            b.l.b.a.c.j.c r9 = (b.l.b.a.c.j.c) r9     // Catch:{ IllegalArgumentException -> 0x034f }
            b.j.a.b.i r9 = r9.f4768j     // Catch:{ IllegalArgumentException -> 0x034f }
            java.math.BigDecimal r8 = r9.m0()     // Catch:{ IllegalArgumentException -> 0x034f }
            return r8
        L_0x0184:
            java.lang.String r10 = r7.q()     // Catch:{ IllegalArgumentException -> 0x034f }
            java.lang.String r10 = r10.trim()     // Catch:{ IllegalArgumentException -> 0x034f }
            java.util.Locale r12 = java.util.Locale.US     // Catch:{ IllegalArgumentException -> 0x034f }
            java.lang.String r10 = r10.toLowerCase(r12)     // Catch:{ IllegalArgumentException -> 0x034f }
            java.lang.Class r12 = java.lang.Float.TYPE     // Catch:{ IllegalArgumentException -> 0x034f }
            if (r1 == r12) goto L_0x019e
            if (r1 == r0) goto L_0x019e
            java.lang.Class r12 = java.lang.Double.TYPE     // Catch:{ IllegalArgumentException -> 0x034f }
            if (r1 == r12) goto L_0x019e
            if (r1 != r11) goto L_0x01b6
        L_0x019e:
            java.lang.String r11 = "nan"
            boolean r11 = r10.equals(r11)     // Catch:{ IllegalArgumentException -> 0x034f }
            if (r11 != 0) goto L_0x01d0
            java.lang.String r11 = "infinity"
            boolean r11 = r10.equals(r11)     // Catch:{ IllegalArgumentException -> 0x034f }
            if (r11 != 0) goto L_0x01d0
            java.lang.String r11 = "-infinity"
            boolean r10 = r10.equals(r11)     // Catch:{ IllegalArgumentException -> 0x034f }
            if (r10 != 0) goto L_0x01d0
        L_0x01b6:
            if (r1 == 0) goto L_0x01ca
            java.lang.Class<java.lang.Number> r10 = java.lang.Number.class
            boolean r10 = r10.isAssignableFrom(r1)     // Catch:{ IllegalArgumentException -> 0x034f }
            if (r10 == 0) goto L_0x01ca
            if (r8 == 0) goto L_0x01cb
            java.lang.Class<b.l.b.a.c.h> r10 = b.l.b.a.c.h.class
            java.lang.annotation.Annotation r10 = r8.getAnnotation(r10)     // Catch:{ IllegalArgumentException -> 0x034f }
            if (r10 == 0) goto L_0x01cb
        L_0x01ca:
            r5 = r6
        L_0x01cb:
            java.lang.String r10 = "number field formatted as a JSON string must use the @JsonString annotation"
            b.l.a.c.b.a.o(r5, r10)     // Catch:{ IllegalArgumentException -> 0x034f }
        L_0x01d0:
            java.lang.String r10 = r7.q()     // Catch:{ IllegalArgumentException -> 0x034f }
            java.lang.Object r8 = b.l.b.a.d.g.i(r9, r10)     // Catch:{ IllegalArgumentException -> 0x034f }
            return r8
        L_0x01d9:
            boolean r11 = b.l.b.a.d.l.j(r9)     // Catch:{ IllegalArgumentException -> 0x034f }
            if (r11 != 0) goto L_0x01e1
            r11 = r6
            goto L_0x01e2
        L_0x01e1:
            r11 = r5
        L_0x01e2:
            java.lang.String r0 = "expected object or map type but got %s"
            java.lang.Object[] r3 = new java.lang.Object[r6]     // Catch:{ IllegalArgumentException -> 0x034f }
            r3[r5] = r9     // Catch:{ IllegalArgumentException -> 0x034f }
            b.l.a.c.b.a.p(r11, r0, r3)     // Catch:{ IllegalArgumentException -> 0x034f }
            if (r13 == 0) goto L_0x01f2
            java.lang.reflect.Field r11 = b(r1)     // Catch:{ IllegalArgumentException -> 0x034f }
            goto L_0x01f3
        L_0x01f2:
            r11 = r2
        L_0x01f3:
            if (r1 == 0) goto L_0x01f9
            if (r12 != 0) goto L_0x01f8
            goto L_0x01f9
        L_0x01f8:
            throw r2     // Catch:{ IllegalArgumentException -> 0x034f }
        L_0x01f9:
            if (r1 == 0) goto L_0x0205
            java.lang.Class<java.util.Map> r13 = java.util.Map.class
            boolean r13 = b.l.b.a.d.l.k(r1, r13)     // Catch:{ IllegalArgumentException -> 0x034f }
            if (r13 == 0) goto L_0x0205
            r13 = r6
            goto L_0x0206
        L_0x0205:
            r13 = r5
        L_0x0206:
            if (r11 == 0) goto L_0x020e
            b.l.b.a.c.b r0 = new b.l.b.a.c.b     // Catch:{ IllegalArgumentException -> 0x034f }
            r0.<init>()     // Catch:{ IllegalArgumentException -> 0x034f }
            goto L_0x021c
        L_0x020e:
            if (r13 != 0) goto L_0x0218
            if (r1 != 0) goto L_0x0213
            goto L_0x0218
        L_0x0213:
            java.lang.Object r0 = b.l.b.a.d.l.m(r1)     // Catch:{ IllegalArgumentException -> 0x034f }
            goto L_0x021c
        L_0x0218:
            java.util.Map r0 = b.l.b.a.d.g.g(r1)     // Catch:{ IllegalArgumentException -> 0x034f }
        L_0x021c:
            int r3 = r10.size()     // Catch:{ IllegalArgumentException -> 0x034f }
            if (r9 == 0) goto L_0x0225
            r10.add(r9)     // Catch:{ IllegalArgumentException -> 0x034f }
        L_0x0225:
            if (r13 == 0) goto L_0x024d
            java.lang.Class<b.l.b.a.d.k> r13 = b.l.b.a.d.k.class
            boolean r13 = r13.isAssignableFrom(r1)     // Catch:{ IllegalArgumentException -> 0x034f }
            if (r13 != 0) goto L_0x024d
            java.lang.Class<java.util.Map> r13 = java.util.Map.class
            boolean r13 = r13.isAssignableFrom(r1)     // Catch:{ IllegalArgumentException -> 0x034f }
            if (r13 == 0) goto L_0x023f
            java.lang.Class<java.util.Map> r13 = java.util.Map.class
            java.lang.reflect.Type r13 = b.l.b.a.d.l.b(r9, r13, r6)     // Catch:{ IllegalArgumentException -> 0x034f }
            r4 = r13
            goto L_0x0240
        L_0x023f:
            r4 = r2
        L_0x0240:
            if (r4 == 0) goto L_0x024d
            r3 = r0
            java.util.Map r3 = (java.util.Map) r3     // Catch:{ IllegalArgumentException -> 0x034f }
            r1 = r7
            r2 = r8
            r5 = r10
            r6 = r12
            r1.O(r2, r3, r4, r5, r6)     // Catch:{ IllegalArgumentException -> 0x034f }
            return r0
        L_0x024d:
            r7.N(r10, r0, r12)     // Catch:{ IllegalArgumentException -> 0x034f }
            if (r9 == 0) goto L_0x0255
            r10.remove(r3)     // Catch:{ IllegalArgumentException -> 0x034f }
        L_0x0255:
            if (r11 != 0) goto L_0x0258
            return r0
        L_0x0258:
            r9 = r0
            b.l.b.a.c.b r9 = (b.l.b.a.c.b) r9     // Catch:{ IllegalArgumentException -> 0x034f }
            java.lang.String r12 = r11.getName()     // Catch:{ IllegalArgumentException -> 0x034f }
            java.lang.Object r9 = r9.get(r12)     // Catch:{ IllegalArgumentException -> 0x034f }
            if (r9 == 0) goto L_0x0267
            r12 = r6
            goto L_0x0268
        L_0x0267:
            r12 = r5
        L_0x0268:
            java.lang.String r13 = "No value specified for @JsonPolymorphicTypeMap field"
            b.l.a.c.b.a.o(r12, r13)     // Catch:{ IllegalArgumentException -> 0x034f }
            java.lang.String r9 = r9.toString()     // Catch:{ IllegalArgumentException -> 0x034f }
            java.lang.Class<b.l.b.a.c.g> r12 = b.l.b.a.c.g.class
            java.lang.annotation.Annotation r11 = r11.getAnnotation(r12)     // Catch:{ IllegalArgumentException -> 0x034f }
            b.l.b.a.c.g r11 = (b.l.b.a.c.g) r11     // Catch:{ IllegalArgumentException -> 0x034f }
            b.l.b.a.c.g$a[] r11 = r11.typeDefinitions()     // Catch:{ IllegalArgumentException -> 0x034f }
            int r12 = r11.length     // Catch:{ IllegalArgumentException -> 0x034f }
            r13 = r5
        L_0x027f:
            if (r13 >= r12) goto L_0x0295
            r1 = r11[r13]     // Catch:{ IllegalArgumentException -> 0x034f }
            java.lang.String r3 = r1.key()     // Catch:{ IllegalArgumentException -> 0x034f }
            boolean r3 = r3.equals(r9)     // Catch:{ IllegalArgumentException -> 0x034f }
            if (r3 == 0) goto L_0x0292
            java.lang.Class r2 = r1.ref()     // Catch:{ IllegalArgumentException -> 0x034f }
            goto L_0x0295
        L_0x0292:
            int r13 = r13 + 1
            goto L_0x027f
        L_0x0295:
            if (r2 == 0) goto L_0x0298
            goto L_0x0299
        L_0x0298:
            r6 = r5
        L_0x0299:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ IllegalArgumentException -> 0x034f }
            r11.<init>()     // Catch:{ IllegalArgumentException -> 0x034f }
            java.lang.String r12 = "No TypeDef annotation found with key: "
            r11.append(r12)     // Catch:{ IllegalArgumentException -> 0x034f }
            r11.append(r9)     // Catch:{ IllegalArgumentException -> 0x034f }
            java.lang.String r9 = r11.toString()     // Catch:{ IllegalArgumentException -> 0x034f }
            b.l.a.c.b.a.o(r6, r9)     // Catch:{ IllegalArgumentException -> 0x034f }
            r9 = r7
            b.l.b.a.c.j.c r9 = (b.l.b.a.c.j.c) r9     // Catch:{ IllegalArgumentException -> 0x034f }
            b.l.b.a.c.j.a r9 = r9.f4769k     // Catch:{ IllegalArgumentException -> 0x034f }
            java.lang.String r11 = r9.e(r0, r5)     // Catch:{ IllegalArgumentException -> 0x034f }
            java.util.Objects.requireNonNull(r11)     // Catch:{ IllegalArgumentException -> 0x034f }
            b.l.b.a.c.j.c r0 = new b.l.b.a.c.j.c     // Catch:{ IllegalArgumentException -> 0x034f }
            b.j.a.b.d r12 = r9.a     // Catch:{ IllegalArgumentException -> 0x034f }
            b.j.a.b.i r11 = r12.d(r11)     // Catch:{ IllegalArgumentException -> 0x034f }
            r0.<init>(r9, r11)     // Catch:{ IllegalArgumentException -> 0x034f }
            r0.Y()     // Catch:{ IllegalArgumentException -> 0x034f }
            r4 = 0
            r5 = 0
            r6 = 0
            r1 = r8
            r3 = r10
            java.lang.Object r8 = r0.S(r1, r2, r3, r4, r5, r6)     // Catch:{ IllegalArgumentException -> 0x034f }
            return r8
        L_0x02d1:
            boolean r11 = b.l.b.a.d.l.j(r9)     // Catch:{ IllegalArgumentException -> 0x034f }
            if (r9 == 0) goto L_0x02e6
            if (r11 != 0) goto L_0x02e6
            if (r1 == 0) goto L_0x02e4
            java.lang.Class<java.util.Collection> r13 = java.util.Collection.class
            boolean r13 = b.l.b.a.d.l.k(r1, r13)     // Catch:{ IllegalArgumentException -> 0x034f }
            if (r13 == 0) goto L_0x02e4
            goto L_0x02e6
        L_0x02e4:
            r13 = r5
            goto L_0x02e7
        L_0x02e6:
            r13 = r6
        L_0x02e7:
            java.lang.String r0 = "expected collection or array type but got %s"
            java.lang.Object[] r3 = new java.lang.Object[r6]     // Catch:{ IllegalArgumentException -> 0x034f }
            r3[r5] = r9     // Catch:{ IllegalArgumentException -> 0x034f }
            b.l.a.c.b.a.p(r13, r0, r3)     // Catch:{ IllegalArgumentException -> 0x034f }
            if (r12 == 0) goto L_0x02f6
            if (r8 != 0) goto L_0x02f5
            goto L_0x02f6
        L_0x02f5:
            throw r2     // Catch:{ IllegalArgumentException -> 0x034f }
        L_0x02f6:
            java.util.Collection r13 = b.l.b.a.d.g.f(r9)     // Catch:{ IllegalArgumentException -> 0x034f }
            if (r11 == 0) goto L_0x0301
            java.lang.reflect.Type r2 = b.l.b.a.d.l.c(r9)     // Catch:{ IllegalArgumentException -> 0x034f }
            goto L_0x030f
        L_0x0301:
            if (r1 == 0) goto L_0x030f
            java.lang.Class<java.lang.Iterable> r0 = java.lang.Iterable.class
            boolean r0 = r0.isAssignableFrom(r1)     // Catch:{ IllegalArgumentException -> 0x034f }
            if (r0 == 0) goto L_0x030f
            java.lang.reflect.Type r2 = b.l.b.a.d.l.e(r9)     // Catch:{ IllegalArgumentException -> 0x034f }
        L_0x030f:
            java.lang.reflect.Type r9 = b.l.b.a.d.g.j(r10, r2)     // Catch:{ IllegalArgumentException -> 0x034f }
            b.l.b.a.c.i r0 = r7.e0()     // Catch:{ IllegalArgumentException -> 0x034f }
        L_0x0317:
            b.l.b.a.c.i r1 = b.l.b.a.c.i.END_ARRAY     // Catch:{ IllegalArgumentException -> 0x034f }
            if (r0 == r1) goto L_0x032e
            r6 = 1
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r13
            r5 = r12
            java.lang.Object r0 = r0.S(r1, r2, r3, r4, r5, r6)     // Catch:{ IllegalArgumentException -> 0x034f }
            r13.add(r0)     // Catch:{ IllegalArgumentException -> 0x034f }
            b.l.b.a.c.i r0 = r7.z()     // Catch:{ IllegalArgumentException -> 0x034f }
            goto L_0x0317
        L_0x032e:
            if (r11 == 0) goto L_0x0339
            java.lang.Class r9 = b.l.b.a.d.l.f(r10, r9)     // Catch:{ IllegalArgumentException -> 0x034f }
            java.lang.Object r8 = b.l.b.a.d.l.o(r13, r9)     // Catch:{ IllegalArgumentException -> 0x034f }
            return r8
        L_0x0339:
            return r13
        L_0x033a:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ IllegalArgumentException -> 0x034f }
            r10.<init>()     // Catch:{ IllegalArgumentException -> 0x034f }
            java.lang.String r11 = "unexpected JSON node type: "
            r10.append(r11)     // Catch:{ IllegalArgumentException -> 0x034f }
            r10.append(r3)     // Catch:{ IllegalArgumentException -> 0x034f }
            java.lang.String r10 = r10.toString()     // Catch:{ IllegalArgumentException -> 0x034f }
            r9.<init>(r10)     // Catch:{ IllegalArgumentException -> 0x034f }
            throw r9     // Catch:{ IllegalArgumentException -> 0x034f }
        L_0x034f:
            r9 = move-exception
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r11 = r7
            b.l.b.a.c.j.c r11 = (b.l.b.a.c.j.c) r11
            b.j.a.b.i r11 = r11.f4768j
            java.lang.String r11 = r11.e0()
            if (r11 == 0) goto L_0x0368
            java.lang.String r12 = "key "
            r10.append(r12)
            r10.append(r11)
        L_0x0368:
            if (r8 == 0) goto L_0x0379
            if (r11 == 0) goto L_0x0371
            java.lang.String r11 = ", "
            r10.append(r11)
        L_0x0371:
            java.lang.String r11 = "field "
            r10.append(r11)
            r10.append(r8)
        L_0x0379:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.String r10 = r10.toString()
            r8.<init>(r10, r9)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: b.l.b.a.c.f.S(java.lang.reflect.Field, java.lang.reflect.Type, java.util.ArrayList, java.lang.Object, b.l.b.a.c.a, boolean):java.lang.Object");
    }

    public final i Y() {
        i e2 = e();
        if (e2 == null) {
            e2 = z();
        }
        a.o(e2 != null, "no JSON input found");
        return e2;
    }

    public abstract i e();

    public final i e0() {
        i Y = Y();
        int ordinal = Y.ordinal();
        if (ordinal == 0) {
            return z();
        }
        if (ordinal != 2) {
            return Y;
        }
        i z = z();
        a.o(z == i.FIELD_NAME || z == i.END_OBJECT, z);
        return z;
    }

    public abstract String q();

    public abstract i z();
}
