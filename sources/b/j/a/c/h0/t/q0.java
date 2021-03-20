package b.j.a.c.h0.t;

import b.j.a.b.f;
import b.j.a.c.h0.s.l;
import b.j.a.c.j0.g;
import b.j.a.c.n;
import b.j.a.c.x;
import b.j.a.c.y;
import java.util.Calendar;
import java.util.Date;
import java.util.UUID;

public abstract class q0 {
    public static final n<Object> a = new d();

    public static class a extends s0<Object> {

        /* renamed from: j  reason: collision with root package name */
        public final int f2128j;

        public a(int i2, Class<?> cls) {
            super(cls, false);
            this.f2128j = i2;
        }

        /* JADX WARNING: Can't fix incorrect switch cases order */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void f(java.lang.Object r3, b.j.a.b.f r4, b.j.a.c.y r5) {
            /*
                r2 = this;
                int r0 = r2.f2128j
                switch(r0) {
                    case 1: goto L_0x007c;
                    case 2: goto L_0x0055;
                    case 3: goto L_0x004b;
                    case 4: goto L_0x002a;
                    case 5: goto L_0x0018;
                    case 6: goto L_0x0018;
                    case 7: goto L_0x000a;
                    default: goto L_0x0005;
                }
            L_0x0005:
                java.lang.String r3 = r3.toString()
                goto L_0x0051
            L_0x000a:
                b.j.a.c.w r5 = r5.f2320h
                b.j.a.c.a0.a r5 = r5.f1609i
                b.j.a.b.a r5 = r5.f1594p
                byte[] r3 = (byte[]) r3
                r0 = 0
                java.lang.String r3 = r5.f(r3, r0)
                goto L_0x0051
            L_0x0018:
                java.lang.Number r3 = (java.lang.Number) r3
                long r0 = r3.longValue()
                java.util.Objects.requireNonNull(r4)
                java.lang.String r3 = java.lang.Long.toString(r0)
                r4.t0(r3)
                goto L_0x009d
            L_0x002a:
                b.j.a.c.x r0 = b.j.a.c.x.WRITE_ENUMS_USING_TO_STRING
                boolean r0 = r5.K(r0)
                if (r0 == 0) goto L_0x0033
                goto L_0x0005
            L_0x0033:
                java.lang.Enum r3 = (java.lang.Enum) r3
                b.j.a.c.x r0 = b.j.a.c.x.WRITE_ENUMS_USING_INDEX
                boolean r5 = r5.K(r0)
                if (r5 == 0) goto L_0x0046
                int r3 = r3.ordinal()
                java.lang.String r3 = java.lang.String.valueOf(r3)
                goto L_0x0051
            L_0x0046:
                java.lang.String r3 = r3.name()
                goto L_0x0051
            L_0x004b:
                java.lang.Class r3 = (java.lang.Class) r3
                java.lang.String r3 = r3.getName()
            L_0x0051:
                r4.t0(r3)
                goto L_0x009d
            L_0x0055:
                java.util.Calendar r3 = (java.util.Calendar) r3
                long r0 = r3.getTimeInMillis()
                java.util.Objects.requireNonNull(r5)
                b.j.a.c.x r3 = b.j.a.c.x.WRITE_DATE_KEYS_AS_TIMESTAMPS
                boolean r3 = r5.K(r3)
                if (r3 == 0) goto L_0x006b
                java.lang.String r3 = java.lang.String.valueOf(r0)
                goto L_0x0078
            L_0x006b:
                java.text.DateFormat r3 = r5.r()
                java.util.Date r5 = new java.util.Date
                r5.<init>(r0)
                java.lang.String r3 = r3.format(r5)
            L_0x0078:
                r4.t0(r3)
                goto L_0x009d
            L_0x007c:
                java.util.Date r3 = (java.util.Date) r3
                java.util.Objects.requireNonNull(r5)
                b.j.a.c.x r0 = b.j.a.c.x.WRITE_DATE_KEYS_AS_TIMESTAMPS
                boolean r0 = r5.K(r0)
                if (r0 == 0) goto L_0x0092
                long r0 = r3.getTime()
                java.lang.String r3 = java.lang.String.valueOf(r0)
                goto L_0x009a
            L_0x0092:
                java.text.DateFormat r5 = r5.r()
                java.lang.String r3 = r5.format(r3)
            L_0x009a:
                r4.t0(r3)
            L_0x009d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: b.j.a.c.h0.t.q0.a.f(java.lang.Object, b.j.a.b.f, b.j.a.c.y):void");
        }
    }

    public static class b extends s0<Object> {

        /* renamed from: j  reason: collision with root package name */
        public transient l f2129j = l.b.f2067b;

        public b() {
            super(String.class, false);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:6:0x0031, code lost:
            if (r1 != r0) goto L_0x0033;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void f(java.lang.Object r6, b.j.a.b.f r7, b.j.a.c.y r8) {
            /*
                r5 = this;
                java.lang.Class r0 = r6.getClass()
                b.j.a.c.h0.s.l r1 = r5.f2129j
                b.j.a.c.n r2 = r1.c(r0)
                if (r2 != 0) goto L_0x0035
                java.lang.Class<java.lang.Object> r2 = java.lang.Object.class
                if (r0 != r2) goto L_0x001c
                b.j.a.c.h0.t.q0$a r2 = new b.j.a.c.h0.t.q0$a
                r3 = 8
                r2.<init>(r3, r0)
                b.j.a.c.h0.s.l r0 = r1.b(r0, r2)
                goto L_0x0033
            L_0x001c:
                b.j.a.c.w r2 = r8.f2320h
                b.j.a.c.a0.a r2 = r2.f1609i
                b.j.a.c.i0.n r2 = r2.f1589k
                b.j.a.c.i0.m r3 = b.j.a.c.i0.n.f2185l
                r4 = 0
                b.j.a.c.i r2 = r2.b(r4, r0, r3)
                b.j.a.c.n r2 = r8.u(r2, r4)
                b.j.a.c.h0.s.l r0 = r1.b(r0, r2)
                if (r1 == r0) goto L_0x0035
            L_0x0033:
                r5.f2129j = r0
            L_0x0035:
                r2.f(r6, r7, r8)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: b.j.a.c.h0.t.q0.b.f(java.lang.Object, b.j.a.b.f, b.j.a.c.y):void");
        }
    }

    public static class c extends s0<Object> {

        /* renamed from: j  reason: collision with root package name */
        public final b.j.a.c.j0.l f2130j;

        public c(Class<?> cls, b.j.a.c.j0.l lVar) {
            super(cls, false);
            this.f2130j = lVar;
        }

        public void f(Object obj, f fVar, y yVar) {
            String str;
            if (yVar.K(x.WRITE_ENUMS_USING_TO_STRING)) {
                str = obj.toString();
            } else {
                Enum enumR = (Enum) obj;
                if (yVar.K(x.WRITE_ENUMS_USING_INDEX)) {
                    str = String.valueOf(enumR.ordinal());
                } else {
                    fVar.s0(this.f2130j.f2224i[enumR.ordinal()]);
                    return;
                }
            }
            fVar.t0(str);
        }
    }

    public static class d extends s0<Object> {
        public d() {
            super(String.class, false);
        }

        public void f(Object obj, f fVar, y yVar) {
            fVar.t0((String) obj);
        }
    }

    public static n a(Class<?> cls, boolean z) {
        if (cls == null || cls == Object.class) {
            return new b();
        }
        if (cls == String.class) {
            return a;
        }
        if (cls.isPrimitive()) {
            cls = g.H(cls);
        }
        if (cls == Integer.class) {
            return new a(5, cls);
        }
        if (cls == Long.class) {
            return new a(6, cls);
        }
        if (cls.isPrimitive() || Number.class.isAssignableFrom(cls)) {
            return new a(8, cls);
        }
        if (cls == Class.class) {
            return new a(3, cls);
        }
        if (Date.class.isAssignableFrom(cls)) {
            return new a(1, cls);
        }
        if (Calendar.class.isAssignableFrom(cls)) {
            return new a(2, cls);
        }
        if (cls == UUID.class) {
            return new a(8, cls);
        }
        if (cls == byte[].class) {
            return new a(7, cls);
        }
        if (z) {
            return new a(8, cls);
        }
        return null;
    }
}
