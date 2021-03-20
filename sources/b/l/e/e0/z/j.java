package b.l.e.e0.z;

import b.l.e.b0;
import b.l.e.c0;
import b.l.e.e;
import b.l.e.e0.g;
import b.l.e.e0.o;
import b.l.e.e0.t;
import b.l.e.g0.c;
import b.l.e.y;
import java.lang.reflect.Field;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class j implements c0 {

    /* renamed from: h  reason: collision with root package name */
    public final g f5474h;

    /* renamed from: i  reason: collision with root package name */
    public final e f5475i;

    /* renamed from: j  reason: collision with root package name */
    public final o f5476j;

    /* renamed from: k  reason: collision with root package name */
    public final d f5477k;

    /* renamed from: l  reason: collision with root package name */
    public final b.l.e.e0.a0.b f5478l = b.l.e.e0.a0.b.a;

    public static final class a<T> extends b0<T> {
        public final t<T> a;

        /* renamed from: b  reason: collision with root package name */
        public final Map<String, b> f5479b;

        public a(t<T> tVar, Map<String, b> map) {
            this.a = tVar;
            this.f5479b = map;
        }

        public T a(b.l.e.g0.a aVar) {
            if (aVar.v0() == b.l.e.g0.b.NULL) {
                aVar.r0();
                return null;
            }
            T a2 = this.a.a();
            try {
                aVar.e();
                while (aVar.Y()) {
                    b bVar = this.f5479b.get(aVar.p0());
                    if (bVar != null) {
                        if (bVar.c) {
                            bVar.a(aVar, a2);
                        }
                    }
                    aVar.A0();
                }
                aVar.N();
                return a2;
            } catch (IllegalStateException e2) {
                throw new y((Throwable) e2);
            } catch (IllegalAccessException e3) {
                throw new AssertionError(e3);
            }
        }

        public void b(c cVar, T t) {
            if (t == null) {
                cVar.Y();
                return;
            }
            cVar.q();
            try {
                for (b next : this.f5479b.values()) {
                    if (next.c(t)) {
                        cVar.O(next.a);
                        next.b(cVar, t);
                    }
                }
                cVar.N();
            } catch (IllegalAccessException e2) {
                throw new AssertionError(e2);
            }
        }
    }

    public static abstract class b {
        public final String a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f5480b;
        public final boolean c;

        public b(String str, boolean z, boolean z2) {
            this.a = str;
            this.f5480b = z;
            this.c = z2;
        }

        public abstract void a(b.l.e.g0.a aVar, Object obj);

        public abstract void b(c cVar, Object obj);

        public abstract boolean c(Object obj);
    }

    public j(g gVar, e eVar, o oVar, d dVar) {
        this.f5474h = gVar;
        this.f5475i = eVar;
        this.f5476j = oVar;
        this.f5477k = dVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x00c5  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x019f A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0184 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public <T> b.l.e.b0<T> a(b.l.e.k r35, b.l.e.f0.a<T> r36) {
        /*
            r34 = this;
            r11 = r34
            r12 = r35
            r0 = r36
            java.lang.Class<java.lang.Object> r13 = java.lang.Object.class
            java.lang.Class<? super T> r1 = r0.a
            boolean r2 = r13.isAssignableFrom(r1)
            r14 = 0
            if (r2 != 0) goto L_0x0012
            return r14
        L_0x0012:
            b.l.e.e0.g r2 = r11.f5474h
            b.l.e.e0.t r15 = r2.a(r0)
            b.l.e.e0.z.j$a r10 = new b.l.e.e0.z.j$a
            java.util.LinkedHashMap r9 = new java.util.LinkedHashMap
            r9.<init>()
            boolean r2 = r1.isInterface()
            if (r2 == 0) goto L_0x002c
        L_0x0025:
            r14 = r9
            r33 = r10
            r28 = r15
            goto L_0x01e2
        L_0x002c:
            java.lang.reflect.Type r8 = r0.f5519b
            r7 = r0
            r6 = r1
        L_0x0030:
            if (r6 == r13) goto L_0x0025
            java.lang.reflect.Field[] r5 = r6.getDeclaredFields()
            int r4 = r5.length
            r3 = 0
            r2 = r3
        L_0x0039:
            if (r2 >= r4) goto L_0x01bb
            r1 = r5[r2]
            r0 = 1
            boolean r16 = r11.b(r1, r0)
            boolean r17 = r11.b(r1, r3)
            if (r16 != 0) goto L_0x0060
            if (r17 != 0) goto L_0x0060
            r19 = r2
            r29 = r3
            r20 = r4
            r31 = r5
            r36 = r6
            r32 = r7
            r14 = r9
            r33 = r10
            r22 = r13
            r28 = r15
            r15 = r8
            goto L_0x0184
        L_0x0060:
            b.l.e.e0.a0.b r3 = r11.f5478l
            r3.a(r1)
            java.lang.reflect.Type r3 = r7.f5519b
            java.lang.reflect.Type r14 = r1.getGenericType()
            java.lang.reflect.Type r14 = b.l.e.e0.a.g(r3, r6, r14)
            java.lang.Class<b.l.e.d0.b> r3 = b.l.e.d0.b.class
            java.lang.annotation.Annotation r3 = r1.getAnnotation(r3)
            b.l.e.d0.b r3 = (b.l.e.d0.b) r3
            if (r3 != 0) goto L_0x0086
            b.l.e.e r3 = r11.f5475i
            java.lang.String r3 = r3.d(r1)
            java.util.List r3 = java.util.Collections.singletonList(r3)
            r19 = r2
            goto L_0x0097
        L_0x0086:
            java.lang.String r0 = r3.value()
            java.lang.String[] r3 = r3.alternate()
            r19 = r2
            int r2 = r3.length
            if (r2 != 0) goto L_0x009d
            java.util.List r3 = java.util.Collections.singletonList(r0)
        L_0x0097:
            r20 = r4
            r18 = 1
            r4 = r3
            goto L_0x00bd
        L_0x009d:
            java.util.ArrayList r2 = new java.util.ArrayList
            r20 = r4
            int r4 = r3.length
            r18 = 1
            int r4 = r4 + 1
            r2.<init>(r4)
            r2.add(r0)
            int r0 = r3.length
            r4 = 0
        L_0x00ae:
            if (r4 >= r0) goto L_0x00bc
            r21 = r0
            r0 = r3[r4]
            r2.add(r0)
            int r4 = r4 + 1
            r0 = r21
            goto L_0x00ae
        L_0x00bc:
            r4 = r2
        L_0x00bd:
            int r3 = r4.size()
            r0 = 0
            r2 = 0
        L_0x00c3:
            if (r2 >= r3) goto L_0x0171
            java.lang.Object r21 = r4.get(r2)
            r22 = r13
            r13 = r21
            java.lang.String r13 = (java.lang.String) r13
            r21 = r9
            if (r2 == 0) goto L_0x00d5
            r16 = 0
        L_0x00d5:
            b.l.e.f0.a r9 = new b.l.e.f0.a
            r9.<init>(r14)
            r23 = r0
            java.lang.Class<? super T> r0 = r9.a
            r24 = r2
            boolean r2 = r0 instanceof java.lang.Class
            if (r2 == 0) goto L_0x00ed
            boolean r0 = r0.isPrimitive()
            if (r0 == 0) goto L_0x00ed
            r25 = r18
            goto L_0x00ef
        L_0x00ed:
            r25 = 0
        L_0x00ef:
            java.lang.Class<b.l.e.d0.a> r0 = b.l.e.d0.a.class
            java.lang.annotation.Annotation r0 = r1.getAnnotation(r0)
            b.l.e.d0.a r0 = (b.l.e.d0.a) r0
            if (r0 == 0) goto L_0x0104
            b.l.e.e0.z.d r2 = r11.f5477k
            r26 = r1
            b.l.e.e0.g r1 = r11.f5474h
            b.l.e.b0 r0 = r2.b(r1, r12, r9, r0)
            goto L_0x0107
        L_0x0104:
            r26 = r1
            r0 = 0
        L_0x0107:
            if (r0 == 0) goto L_0x010c
            r27 = r18
            goto L_0x010e
        L_0x010c:
            r27 = 0
        L_0x010e:
            if (r0 != 0) goto L_0x0114
            b.l.e.b0 r0 = r12.e(r9)
        L_0x0114:
            r28 = r0
            b.l.e.e0.z.i r2 = new b.l.e.e0.z.i
            r1 = r23
            r0 = r2
            r11 = r1
            r23 = r26
            r1 = r34
            r12 = r2
            r2 = r13
            r26 = r3
            r29 = 0
            r3 = r16
            r30 = r4
            r4 = r17
            r31 = r5
            r5 = r23
            r36 = r6
            r6 = r27
            r27 = r14
            r14 = r7
            r7 = r28
            r28 = r15
            r15 = r8
            r8 = r35
            r32 = r14
            r14 = r21
            r33 = r10
            r10 = r25
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            java.lang.Object r0 = r14.put(r13, r12)
            b.l.e.e0.z.j$b r0 = (b.l.e.e0.z.j.b) r0
            if (r11 != 0) goto L_0x0152
            goto L_0x0153
        L_0x0152:
            r0 = r11
        L_0x0153:
            int r2 = r24 + 1
            r11 = r34
            r12 = r35
            r6 = r36
            r9 = r14
            r8 = r15
            r13 = r22
            r1 = r23
            r3 = r26
            r14 = r27
            r15 = r28
            r4 = r30
            r5 = r31
            r7 = r32
            r10 = r33
            goto L_0x00c3
        L_0x0171:
            r11 = r0
            r31 = r5
            r36 = r6
            r32 = r7
            r14 = r9
            r33 = r10
            r22 = r13
            r28 = r15
            r29 = 0
            r15 = r8
            if (r11 != 0) goto L_0x019f
        L_0x0184:
            int r2 = r19 + 1
            r11 = r34
            r12 = r35
            r6 = r36
            r9 = r14
            r8 = r15
            r4 = r20
            r13 = r22
            r15 = r28
            r3 = r29
            r5 = r31
            r7 = r32
            r10 = r33
            r14 = 0
            goto L_0x0039
        L_0x019f:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r15)
            java.lang.String r2 = " declares multiple JSON fields named "
            r1.append(r2)
            java.lang.String r2 = r11.a
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x01bb:
            r36 = r6
            r0 = r7
            r14 = r9
            r33 = r10
            r22 = r13
            r28 = r15
            r15 = r8
            java.lang.reflect.Type r0 = r0.f5519b
            java.lang.reflect.Type r1 = r36.getGenericSuperclass()
            r2 = r36
            java.lang.reflect.Type r0 = b.l.e.e0.a.g(r0, r2, r1)
            b.l.e.f0.a r7 = new b.l.e.f0.a
            r7.<init>(r0)
            java.lang.Class<? super T> r6 = r7.a
            r11 = r34
            r12 = r35
            r15 = r28
            r14 = 0
            goto L_0x0030
        L_0x01e2:
            r0 = r28
            r1 = r33
            r1.<init>(r0, r14)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: b.l.e.e0.z.j.a(b.l.e.k, b.l.e.f0.a):b.l.e.b0");
    }

    public boolean b(Field field, boolean z) {
        boolean z2;
        o oVar = this.f5476j;
        Class<?> type = field.getType();
        if (oVar.c(type) || oVar.b(type, z)) {
            return false;
        }
        if ((field.getModifiers() & 136) == 0 && !field.isSynthetic() && !oVar.c(field.getType())) {
            List<b.l.e.b> list = z ? oVar.f5432h : oVar.f5433i;
            if (!list.isEmpty()) {
                b.l.e.c cVar = new b.l.e.c(field);
                Iterator<b.l.e.b> it = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (it.next().b(cVar)) {
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
            z2 = false;
        } else {
            z2 = true;
        }
        if (!z2) {
            return true;
        }
        return false;
    }
}
