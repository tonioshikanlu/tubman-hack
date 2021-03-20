package e.a.a.a;

import e.a.a.a.e;
import e.a.a.a.y0.b.f0;
import e.a.a.a.y0.d.a.s;
import e.a.a.a.y0.e.a0.a;
import e.a.a.a.y0.e.n;
import e.a.a.a.y0.e.z.e;
import e.x.c.i;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import kotlin.jvm.internal.DefaultConstructorMarker;

public abstract class f {

    public static final class a extends f {
        public final Field a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(Field field) {
            super((DefaultConstructorMarker) null);
            i.e(field, "field");
            this.a = field;
        }

        public String a() {
            return s.b(this.a.getName()) + "()" + e.a.a.a.y0.b.d1.b.b.c(this.a.getType());
        }
    }

    public static final class b extends f {
        public final Method a;

        /* renamed from: b  reason: collision with root package name */
        public final Method f7523b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(Method method, Method method2) {
            super((DefaultConstructorMarker) null);
            i.e(method, "getterMethod");
            this.a = method;
            this.f7523b = method2;
        }

        public String a() {
            return b.q.a.a.i(this.a);
        }
    }

    public static final class c extends f {
        public final String a;

        /* renamed from: b  reason: collision with root package name */
        public final f0 f7524b;
        public final n c;
        public final a.d d;

        /* renamed from: e  reason: collision with root package name */
        public final e.a.a.a.y0.e.z.c f7525e;
        public final e f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        /* JADX WARNING: Code restructure failed: missing block: B:11:0x009d, code lost:
            r3 = r6.a(r3.intValue());
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public c(e.a.a.a.y0.b.f0 r3, e.a.a.a.y0.e.n r4, e.a.a.a.y0.e.a0.a.d r5, e.a.a.a.y0.e.z.c r6, e.a.a.a.y0.e.z.e r7) {
            /*
                r2 = this;
                java.lang.String r0 = "descriptor"
                e.x.c.i.e(r3, r0)
                java.lang.String r0 = "proto"
                e.x.c.i.e(r4, r0)
                java.lang.String r0 = "signature"
                e.x.c.i.e(r5, r0)
                java.lang.String r0 = "nameResolver"
                e.x.c.i.e(r6, r0)
                java.lang.String r0 = "typeTable"
                e.x.c.i.e(r7, r0)
                r0 = 0
                r2.<init>(r0)
                r2.f7524b = r3
                r2.c = r4
                r2.d = r5
                r2.f7525e = r6
                r2.f = r7
                boolean r0 = r5.j()
                if (r0 == 0) goto L_0x0056
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                e.a.a.a.y0.e.a0.a$c r4 = r5.f8720l
                java.lang.String r7 = "signature.getter"
                e.x.c.i.d(r4, r7)
                int r4 = r4.f8707j
                java.lang.String r4 = r6.a(r4)
                r3.append(r4)
                e.a.a.a.y0.e.a0.a$c r4 = r5.f8720l
                e.x.c.i.d(r4, r7)
                int r4 = r4.f8708k
                java.lang.String r4 = r6.a(r4)
                r3.append(r4)
                java.lang.String r3 = r3.toString()
                goto L_0x00f8
            L_0x0056:
                e.a.a.a.y0.e.a0.b.h r5 = e.a.a.a.y0.e.a0.b.h.f8770b
                r0 = 1
                e.a.a.a.y0.e.a0.b.e$a r4 = r5.b(r4, r6, r7, r0)
                if (r4 == 0) goto L_0x00fb
                java.lang.String r5 = r4.a
                java.lang.String r4 = r4.f8765b
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>()
                java.lang.String r5 = e.a.a.a.y0.d.a.s.b(r5)
                r7.append(r5)
                e.a.a.a.y0.b.k r5 = r3.b()
                java.lang.String r0 = "descriptor.containingDeclaration"
                e.x.c.i.d(r5, r0)
                e.a.a.a.y0.b.z0 r0 = r3.getVisibility()
                e.a.a.a.y0.b.z0 r1 = e.a.a.a.y0.b.y0.d
                boolean r0 = e.x.c.i.a(r0, r1)
                java.lang.String r1 = "$"
                if (r0 == 0) goto L_0x00be
                boolean r0 = r5 instanceof e.a.a.a.y0.k.b.g0.d
                if (r0 == 0) goto L_0x00be
                e.a.a.a.y0.k.b.g0.d r5 = (e.a.a.a.y0.k.b.g0.d) r5
                e.a.a.a.y0.e.c r3 = r5.B
                e.a.a.a.y0.h.h$f<e.a.a.a.y0.e.c, java.lang.Integer> r5 = e.a.a.a.y0.e.a0.a.f8686i
                java.lang.String r0 = "JvmProtoBuf.classModuleName"
                e.x.c.i.d(r5, r0)
                java.lang.Object r3 = b.q.a.a.I0(r3, r5)
                java.lang.Integer r3 = (java.lang.Integer) r3
                if (r3 == 0) goto L_0x00a8
                int r3 = r3.intValue()
                java.lang.String r3 = r6.a(r3)
                if (r3 == 0) goto L_0x00a8
                goto L_0x00aa
            L_0x00a8:
                java.lang.String r3 = "main"
            L_0x00aa:
                java.lang.StringBuilder r5 = b.e.a.a.a.y(r1)
                e.c0.d r6 = e.a.a.a.y0.f.e.a
                java.lang.String r6 = "name"
                e.x.c.i.e(r3, r6)
                e.c0.d r6 = e.a.a.a.y0.f.e.a
                java.lang.String r0 = "_"
                java.lang.String r3 = r6.b(r3, r0)
                goto L_0x00e8
            L_0x00be:
                e.a.a.a.y0.b.z0 r6 = r3.getVisibility()
                e.a.a.a.y0.b.z0 r0 = e.a.a.a.y0.b.y0.a
                boolean r6 = e.x.c.i.a(r6, r0)
                if (r6 == 0) goto L_0x00f0
                boolean r5 = r5 instanceof e.a.a.a.y0.b.y
                if (r5 == 0) goto L_0x00f0
                e.a.a.a.y0.k.b.g0.j r3 = (e.a.a.a.y0.k.b.g0.j) r3
                e.a.a.a.y0.k.b.g0.f r3 = r3.L
                boolean r5 = r3 instanceof e.a.a.a.y0.d.b.g
                if (r5 == 0) goto L_0x00f0
                e.a.a.a.y0.d.b.g r3 = (e.a.a.a.y0.d.b.g) r3
                e.a.a.a.y0.j.w.b r5 = r3.c
                if (r5 == 0) goto L_0x00f0
                java.lang.StringBuilder r5 = b.e.a.a.a.y(r1)
                e.a.a.a.y0.f.d r3 = r3.e()
                java.lang.String r3 = r3.e()
            L_0x00e8:
                r5.append(r3)
                java.lang.String r3 = r5.toString()
                goto L_0x00f2
            L_0x00f0:
                java.lang.String r3 = ""
            L_0x00f2:
                java.lang.String r5 = "()"
                java.lang.String r3 = b.e.a.a.a.r(r7, r3, r5, r4)
            L_0x00f8:
                r2.a = r3
                return
            L_0x00fb:
                e.a.a.a.l0 r4 = new e.a.a.a.l0
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                java.lang.String r6 = "No field signature for property: "
                r5.append(r6)
                r5.append(r3)
                java.lang.String r3 = r5.toString()
                r4.<init>(r3)
                throw r4
            */
            throw new UnsupportedOperationException("Method not decompiled: e.a.a.a.f.c.<init>(e.a.a.a.y0.b.f0, e.a.a.a.y0.e.n, e.a.a.a.y0.e.a0.a$d, e.a.a.a.y0.e.z.c, e.a.a.a.y0.e.z.e):void");
        }

        public String a() {
            return this.a;
        }
    }

    public static final class d extends f {
        public final e.C0130e a;

        /* renamed from: b  reason: collision with root package name */
        public final e.C0130e f7526b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(e.C0130e eVar, e.C0130e eVar2) {
            super((DefaultConstructorMarker) null);
            i.e(eVar, "getterSignature");
            this.a = eVar;
            this.f7526b = eVar2;
        }

        public String a() {
            return this.a.a;
        }
    }

    public f(DefaultConstructorMarker defaultConstructorMarker) {
    }

    public abstract String a();
}
