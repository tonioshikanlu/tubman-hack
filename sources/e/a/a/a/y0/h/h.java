package e.a.a.a.y0.h;

import e.a.a.a.y0.h.a;
import e.a.a.a.y0.h.g;
import e.a.a.a.y0.h.i;
import e.a.a.a.y0.h.k;
import e.a.a.a.y0.h.p;
import e.a.a.a.y0.h.u;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public abstract class h extends a implements Serializable {

    public static abstract class b<MessageType extends h, BuilderType extends b> extends a.C0205a<BuilderType> {

        /* renamed from: h  reason: collision with root package name */
        public c f9236h = c.f9218h;

        /* renamed from: i */
        public BuilderType clone() {
            throw new UnsupportedOperationException("This is supposed to be overridden by subclasses.");
        }

        public abstract BuilderType j(MessageType messagetype);
    }

    public static abstract class c<MessageType extends d<MessageType>, BuilderType extends c<MessageType, BuilderType>> extends b<MessageType, BuilderType> implements Object<MessageType> {

        /* renamed from: i  reason: collision with root package name */
        public g<e> f9237i = g.d;

        /* renamed from: j  reason: collision with root package name */
        public boolean f9238j;

        public final void k(MessageType messagetype) {
            if (!this.f9238j) {
                this.f9237i = this.f9237i.clone();
                this.f9238j = true;
            }
            g<e> gVar = this.f9237i;
            g<e> gVar2 = messagetype.f9239h;
            Objects.requireNonNull(gVar);
            for (int i2 = 0; i2 < gVar2.a.d(); i2++) {
                gVar.j(gVar2.a.c(i2));
            }
            for (Map.Entry<FieldDescriptorType, Object> j2 : gVar2.a.e()) {
                gVar.j(j2);
            }
        }
    }

    public static final class e implements g.a<e> {

        /* renamed from: h  reason: collision with root package name */
        public final i.b<?> f9241h;

        /* renamed from: i  reason: collision with root package name */
        public final int f9242i;

        /* renamed from: j  reason: collision with root package name */
        public final y f9243j;

        /* renamed from: k  reason: collision with root package name */
        public final boolean f9244k;

        /* renamed from: l  reason: collision with root package name */
        public final boolean f9245l;

        public e(i.b<?> bVar, int i2, y yVar, boolean z, boolean z2) {
            this.f9241h = bVar;
            this.f9242i = i2;
            this.f9243j = yVar;
            this.f9244k = z;
            this.f9245l = z2;
        }

        public int compareTo(Object obj) {
            return this.f9242i - ((e) obj).f9242i;
        }

        public int f() {
            return this.f9242i;
        }

        public p.a g(p.a aVar, p pVar) {
            return ((b) aVar).j((h) pVar);
        }

        public boolean i() {
            return this.f9244k;
        }

        public y k() {
            return this.f9243j;
        }

        public z o() {
            return this.f9243j.f9300h;
        }

        public boolean q() {
            return this.f9245l;
        }
    }

    public static class f<ContainingType extends p, Type> {
        public final ContainingType a;

        /* renamed from: b  reason: collision with root package name */
        public final Type f9246b;
        public final p c;
        public final e d;

        /* renamed from: e  reason: collision with root package name */
        public final Method f9247e;

        public f(ContainingType containingtype, Type type, p pVar, e eVar, Class cls) {
            Method method;
            if (containingtype == null) {
                throw new IllegalArgumentException("Null containingTypeDefaultInstance");
            } else if (eVar.f9243j == y.MESSAGE && pVar == null) {
                throw new IllegalArgumentException("Null messageDefaultInstance");
            } else {
                this.a = containingtype;
                this.f9246b = type;
                this.c = pVar;
                this.d = eVar;
                if (i.a.class.isAssignableFrom(cls)) {
                    try {
                        method = cls.getMethod("valueOf", new Class[]{Integer.TYPE});
                    } catch (NoSuchMethodException e2) {
                        String name = cls.getName();
                        StringBuilder sb = new StringBuilder(name.length() + 45 + 7);
                        b.e.a.a.a.L(sb, "Generated message class \"", name, "\" missing method \"", "valueOf");
                        sb.append("\".");
                        throw new RuntimeException(sb.toString(), e2);
                    }
                } else {
                    method = null;
                }
                this.f9247e = method;
            }
        }

        public Object a(Object obj) {
            if (this.d.f9243j.f9300h != z.ENUM) {
                return obj;
            }
            try {
                return this.f9247e.invoke((Object) null, new Object[]{(Integer) obj});
            } catch (IllegalAccessException e2) {
                throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e2);
            } catch (InvocationTargetException e3) {
                Throwable cause = e3.getCause();
                if (cause instanceof RuntimeException) {
                    throw ((RuntimeException) cause);
                } else if (cause instanceof Error) {
                    throw ((Error) cause);
                } else {
                    throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
                }
            }
        }

        public Object b(Object obj) {
            return this.d.f9243j.f9300h == z.ENUM ? Integer.valueOf(((i.a) obj).f()) : obj;
        }
    }

    public h() {
    }

    public h(b bVar) {
    }

    public static <ContainingType extends p, Type> f<ContainingType, Type> h(ContainingType containingtype, p pVar, i.b<?> bVar, int i2, y yVar, boolean z, Class cls) {
        return new f(containingtype, Collections.emptyList(), pVar, new e((i.b<?>) null, i2, yVar, true, z), cls);
    }

    public static <ContainingType extends p, Type> f<ContainingType, Type> i(ContainingType containingtype, Type type, p pVar, i.b<?> bVar, int i2, y yVar, Class cls) {
        return new f(containingtype, type, pVar, new e((i.b<?>) null, i2, yVar, false, false), cls);
    }

    public static abstract class d<MessageType extends d<MessageType>> extends h implements Object<MessageType> {

        /* renamed from: h  reason: collision with root package name */
        public final g<e> f9239h;

        public class a {
            public final Iterator<Map.Entry<e, Object>> a;

            /* renamed from: b  reason: collision with root package name */
            public Map.Entry<e, Object> f9240b;
            public final boolean c;

            public a(boolean z, a aVar) {
                g<e> gVar = d.this.f9239h;
                Iterator<Map.Entry<e, Object>> cVar = gVar.c ? new k.c<>(((u.d) gVar.a.entrySet()).iterator()) : ((u.d) gVar.a.entrySet()).iterator();
                this.a = cVar;
                if (cVar.hasNext()) {
                    this.f9240b = cVar.next();
                }
                this.c = z;
            }

            public void a(int i2, e eVar) {
                while (true) {
                    Map.Entry<e, Object> entry = this.f9240b;
                    if (entry != null && entry.getKey().f9242i < i2) {
                        e key = this.f9240b.getKey();
                        if (!this.c || key.f9243j.f9300h != z.MESSAGE || key.f9244k) {
                            Object value = this.f9240b.getValue();
                            g gVar = g.d;
                            y k2 = key.k();
                            int f = key.f();
                            if (key.i()) {
                                List<Object> list = (List) value;
                                if (key.q()) {
                                    eVar.A(f, 2);
                                    int i3 = 0;
                                    for (Object d2 : list) {
                                        i3 += g.d(k2, d2);
                                    }
                                    eVar.y(i3);
                                    for (Object o2 : list) {
                                        g.o(eVar, k2, o2);
                                    }
                                } else {
                                    for (Object n2 : list) {
                                        g.n(eVar, k2, f, n2);
                                    }
                                }
                            } else if (value instanceof k) {
                                g.n(eVar, k2, f, ((k) value).a());
                            } else {
                                g.n(eVar, k2, f, value);
                            }
                        } else {
                            int i4 = key.f9242i;
                            eVar.A(1, 3);
                            eVar.y(16);
                            eVar.y(i4);
                            eVar.r(3, (p) this.f9240b.getValue());
                            eVar.A(1, 4);
                        }
                        this.f9240b = this.a.hasNext() ? this.a.next() : null;
                    } else {
                        return;
                    }
                }
            }
        }

        public d() {
            this.f9239h = new g<>();
        }

        public boolean j() {
            g<e> gVar = this.f9239h;
            for (int i2 = 0; i2 < gVar.a.d(); i2++) {
                if (!gVar.h(gVar.a.c(i2))) {
                    return false;
                }
            }
            for (Map.Entry<FieldDescriptorType, Object> h2 : gVar.a.e()) {
                if (!gVar.h(h2)) {
                    return false;
                }
            }
            return true;
        }

        public int k() {
            g<e> gVar = this.f9239h;
            int i2 = 0;
            for (int i3 = 0; i3 < gVar.a.d(); i3++) {
                Map.Entry<FieldDescriptorType, Object> c = gVar.a.c(i3);
                i2 += g.e((g.a) c.getKey(), c.getValue());
            }
            for (Map.Entry next : gVar.a.e()) {
                i2 += g.e((g.a) next.getKey(), next.getValue());
            }
            return i2;
        }

        public final <Type> Type l(f<MessageType, Type> fVar) {
            r(fVar);
            Type f = this.f9239h.f(fVar.d);
            if (f == null) {
                return fVar.f9246b;
            }
            e eVar = fVar.d;
            if (!eVar.f9244k) {
                return fVar.a(f);
            }
            if (eVar.f9243j.f9300h != z.ENUM) {
                return f;
            }
            Type arrayList = new ArrayList();
            for (Object a2 : (List) f) {
                arrayList.add(fVar.a(a2));
            }
            return arrayList;
        }

        public final <Type> boolean m(f<MessageType, Type> fVar) {
            r(fVar);
            g<e> gVar = this.f9239h;
            e eVar = fVar.d;
            Objects.requireNonNull(gVar);
            if (!eVar.i()) {
                return gVar.a.get(eVar) != null;
            }
            throw new IllegalArgumentException("hasField() can only be called on non-repeated fields.");
        }

        public void n() {
            this.f9239h.i();
        }

        public d<MessageType>.defpackage.a o() {
            return new a(false, (a) null);
        }

        /* JADX WARNING: Removed duplicated region for block: B:14:0x0048  */
        /* JADX WARNING: Removed duplicated region for block: B:15:0x004e  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean q(e.a.a.a.y0.h.d r8, e.a.a.a.y0.h.e r9, e.a.a.a.y0.h.f r10, int r11) {
            /*
                r7 = this;
                e.a.a.a.y0.h.g<e.a.a.a.y0.h.h$e> r0 = r7.f9239h
                e.a.a.a.y0.h.p r1 = r7.b()
                r2 = r11 & 7
                int r3 = r11 >>> 3
                java.util.Map<e.a.a.a.y0.h.f$a, e.a.a.a.y0.h.h$f<?, ?>> r4 = r10.a
                e.a.a.a.y0.h.f$a r5 = new e.a.a.a.y0.h.f$a
                r5.<init>(r1, r3)
                java.lang.Object r1 = r4.get(r5)
                e.a.a.a.y0.h.h$f r1 = (e.a.a.a.y0.h.h.f) r1
                r3 = 0
                r4 = 1
                if (r1 != 0) goto L_0x001c
                goto L_0x0044
            L_0x001c:
                e.a.a.a.y0.h.h$e r5 = r1.d
                e.a.a.a.y0.h.y r5 = r5.f9243j
                int r5 = e.a.a.a.y0.h.g.g(r5, r3)
                if (r2 != r5) goto L_0x0029
                r2 = r3
                r5 = r2
                goto L_0x0046
            L_0x0029:
                e.a.a.a.y0.h.h$e r5 = r1.d
                boolean r6 = r5.f9244k
                if (r6 == 0) goto L_0x0044
                e.a.a.a.y0.h.y r5 = r5.f9243j
                boolean r5 = r5.d()
                if (r5 == 0) goto L_0x0044
                e.a.a.a.y0.h.h$e r5 = r1.d
                e.a.a.a.y0.h.y r5 = r5.f9243j
                int r5 = e.a.a.a.y0.h.g.g(r5, r4)
                if (r2 != r5) goto L_0x0044
                r2 = r3
                r5 = r4
                goto L_0x0046
            L_0x0044:
                r5 = r3
                r2 = r4
            L_0x0046:
                if (r2 == 0) goto L_0x004e
                boolean r4 = r8.r(r11, r9)
                goto L_0x014d
            L_0x004e:
                if (r5 == 0) goto L_0x009b
                int r9 = r8.l()
                int r9 = r8.d(r9)
                e.a.a.a.y0.h.h$e r10 = r1.d
                e.a.a.a.y0.h.y r10 = r10.f9243j
                e.a.a.a.y0.h.y r11 = e.a.a.a.y0.h.y.ENUM
                if (r10 != r11) goto L_0x0080
            L_0x0060:
                int r10 = r8.b()
                if (r10 <= 0) goto L_0x0094
                int r10 = r8.l()
                e.a.a.a.y0.h.h$e r11 = r1.d
                e.a.a.a.y0.h.i$b<?> r11 = r11.f9241h
                e.a.a.a.y0.h.i$a r10 = r11.a(r10)
                if (r10 != 0) goto L_0x0076
                goto L_0x014d
            L_0x0076:
                e.a.a.a.y0.h.h$e r11 = r1.d
                java.lang.Object r10 = r1.b(r10)
                r0.a(r11, r10)
                goto L_0x0060
            L_0x0080:
                int r10 = r8.b()
                if (r10 <= 0) goto L_0x0094
                e.a.a.a.y0.h.h$e r10 = r1.d
                e.a.a.a.y0.h.y r10 = r10.f9243j
                java.lang.Object r10 = e.a.a.a.y0.h.g.k(r8, r10, r3)
                e.a.a.a.y0.h.h$e r11 = r1.d
                r0.a(r11, r10)
                goto L_0x0080
            L_0x0094:
                r8.f9229i = r9
                r8.p()
                goto L_0x014d
            L_0x009b:
                e.a.a.a.y0.h.h$e r2 = r1.d
                e.a.a.a.y0.h.y r2 = r2.f9243j
                e.a.a.a.y0.h.z r2 = r2.f9300h
                int r2 = r2.ordinal()
                r5 = 7
                if (r2 == r5) goto L_0x0126
                r9 = 8
                if (r2 == r9) goto L_0x00b6
                e.a.a.a.y0.h.h$e r9 = r1.d
                e.a.a.a.y0.h.y r9 = r9.f9243j
                java.lang.Object r8 = e.a.a.a.y0.h.g.k(r8, r9, r3)
                goto L_0x013c
            L_0x00b6:
                r9 = 0
                e.a.a.a.y0.h.h$e r11 = r1.d
                boolean r2 = r11.f9244k
                if (r2 != 0) goto L_0x00c9
                java.lang.Object r11 = r0.f(r11)
                e.a.a.a.y0.h.p r11 = (e.a.a.a.y0.h.p) r11
                if (r11 == 0) goto L_0x00c9
                e.a.a.a.y0.h.p$a r9 = r11.c()
            L_0x00c9:
                if (r9 != 0) goto L_0x00d1
                e.a.a.a.y0.h.p r9 = r1.c
                e.a.a.a.y0.h.p$a r9 = r9.f()
            L_0x00d1:
                e.a.a.a.y0.h.h$e r11 = r1.d
                e.a.a.a.y0.h.y r2 = r11.f9243j
                e.a.a.a.y0.h.y r5 = e.a.a.a.y0.h.y.GROUP
                r6 = 64
                if (r2 != r5) goto L_0x00fa
                int r11 = r11.f9242i
                int r2 = r8.f9230j
                if (r2 >= r6) goto L_0x00f5
                int r2 = r2 + r4
                r8.f9230j = r2
                r9.H(r8, r10)
                int r10 = r11 << 3
                r10 = r10 | 4
                r8.a(r10)
                int r10 = r8.f9230j
                int r10 = r10 + -1
                r8.f9230j = r10
                goto L_0x011c
            L_0x00f5:
                e.a.a.a.y0.h.j r8 = e.a.a.a.y0.h.j.b()
                throw r8
            L_0x00fa:
                int r11 = r8.l()
                int r2 = r8.f9230j
                if (r2 >= r6) goto L_0x0121
                int r11 = r8.d(r11)
                int r2 = r8.f9230j
                int r2 = r2 + r4
                r8.f9230j = r2
                r9.H(r8, r10)
                r8.a(r3)
                int r10 = r8.f9230j
                int r10 = r10 + -1
                r8.f9230j = r10
                r8.f9229i = r11
                r8.p()
            L_0x011c:
                e.a.a.a.y0.h.p r8 = r9.e()
                goto L_0x013c
            L_0x0121:
                e.a.a.a.y0.h.j r8 = e.a.a.a.y0.h.j.b()
                throw r8
            L_0x0126:
                int r8 = r8.l()
                e.a.a.a.y0.h.h$e r10 = r1.d
                e.a.a.a.y0.h.i$b<?> r10 = r10.f9241h
                e.a.a.a.y0.h.i$a r10 = r10.a(r8)
                if (r10 != 0) goto L_0x013b
                r9.y(r11)
                r9.y(r8)
                goto L_0x014d
            L_0x013b:
                r8 = r10
            L_0x013c:
                e.a.a.a.y0.h.h$e r9 = r1.d
                boolean r10 = r9.f9244k
                java.lang.Object r8 = r1.b(r8)
                if (r10 == 0) goto L_0x014a
                r0.a(r9, r8)
                goto L_0x014d
            L_0x014a:
                r0.l(r9, r8)
            L_0x014d:
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: e.a.a.a.y0.h.h.d.q(e.a.a.a.y0.h.d, e.a.a.a.y0.h.e, e.a.a.a.y0.h.f, int):boolean");
        }

        public final void r(f<MessageType, ?> fVar) {
            if (fVar.a != b()) {
                throw new IllegalArgumentException("This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings.");
            }
        }

        public d(c<MessageType, ?> cVar) {
            cVar.f9237i.i();
            cVar.f9238j = false;
            this.f9239h = cVar.f9237i;
        }
    }
}
