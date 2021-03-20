package e.a.a.a.y0.k.b;

import e.a.a.a.y0.a.g;
import e.a.a.a.y0.b.e;
import e.x.b.l;
import e.x.c.i;
import e.x.c.k;
import java.util.Objects;
import java.util.Set;

public final class h {
    public static final Set<e.a.a.a.y0.f.a> c = b.q.a.a.S2(e.a.a.a.y0.f.a.l(g.f7647k.c.i()));
    public static final h d = null;
    public final l<a, e> a;

    /* renamed from: b  reason: collision with root package name */
    public final j f9566b;

    public static final class a {
        public final e.a.a.a.y0.f.a a;

        /* renamed from: b  reason: collision with root package name */
        public final f f9567b;

        public a(e.a.a.a.y0.f.a aVar, f fVar) {
            i.e(aVar, "classId");
            this.a = aVar;
            this.f9567b = fVar;
        }

        public boolean equals(Object obj) {
            return (obj instanceof a) && i.a(this.a, ((a) obj).a);
        }

        public int hashCode() {
            return this.a.hashCode();
        }
    }

    public static final class b extends k implements l<a, e> {

        /* renamed from: h  reason: collision with root package name */
        public final /* synthetic */ h f9568h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(h hVar) {
            super(1);
            this.f9568h = hVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:33:0x00e5, code lost:
            if (((r11 instanceof e.a.a.a.y0.k.b.g0.h) && ((e.a.a.a.y0.k.b.g0.h) r11).m().contains(r12)) != false) goto L_0x00e7;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object invoke(java.lang.Object r17) {
            /*
                r16 = this;
                r0 = r17
                e.a.a.a.y0.k.b.h$a r0 = (e.a.a.a.y0.k.b.h.a) r0
                java.lang.String r1 = "key"
                e.x.c.i.e(r0, r1)
                r1 = r16
                e.a.a.a.y0.k.b.h r2 = r1.f9568h
                java.util.Objects.requireNonNull(r2)
                e.a.a.a.y0.f.a r3 = r0.a
                e.a.a.a.y0.k.b.j r4 = r2.f9566b
                java.lang.Iterable<e.a.a.a.y0.b.b1.b> r4 = r4.f9577l
                java.util.Iterator r4 = r4.iterator()
            L_0x001a:
                boolean r5 = r4.hasNext()
                r6 = 0
                if (r5 == 0) goto L_0x002f
                java.lang.Object r5 = r4.next()
                e.a.a.a.y0.b.b1.b r5 = (e.a.a.a.y0.b.b1.b) r5
                e.a.a.a.y0.b.e r6 = r5.c(r3)
                if (r6 == 0) goto L_0x001a
                goto L_0x0123
            L_0x002f:
                java.util.Set<e.a.a.a.y0.f.a> r4 = e.a.a.a.y0.k.b.h.c
                boolean r4 = r4.contains(r3)
                if (r4 == 0) goto L_0x0039
                goto L_0x0122
            L_0x0039:
                e.a.a.a.y0.k.b.f r0 = r0.f9567b
                if (r0 == 0) goto L_0x003e
                goto L_0x0046
            L_0x003e:
                e.a.a.a.y0.k.b.j r0 = r2.f9566b
                e.a.a.a.y0.k.b.g r0 = r0.f9571e
                e.a.a.a.y0.k.b.f r0 = r0.a(r3)
            L_0x0046:
                if (r0 == 0) goto L_0x0122
                e.a.a.a.y0.e.z.c r4 = r0.a
                e.a.a.a.y0.e.c r5 = r0.f9504b
                e.a.a.a.y0.e.z.a r14 = r0.c
                e.a.a.a.y0.b.m0 r0 = r0.d
                e.a.a.a.y0.f.a r7 = r3.g()
                java.lang.String r8 = "name"
                java.lang.String r9 = "classId.shortClassName"
                if (r7 == 0) goto L_0x0095
                r10 = 2
                e.a.a.a.y0.b.e r2 = e.a.a.a.y0.k.b.h.a(r2, r7, r6, r10)
                boolean r7 = r2 instanceof e.a.a.a.y0.k.b.g0.d
                if (r7 != 0) goto L_0x0064
                r2 = r6
            L_0x0064:
                e.a.a.a.y0.k.b.g0.d r2 = (e.a.a.a.y0.k.b.g0.d) r2
                if (r2 == 0) goto L_0x0122
                e.a.a.a.y0.f.d r3 = r3.j()
                e.x.c.i.d(r3, r9)
                e.x.c.i.e(r3, r8)
                e.a.a.a.y0.b.j0<e.a.a.a.y0.k.b.g0.d$a> r7 = r2.s
                e.a.a.a.y0.k.b.l r8 = r2.f9513p
                e.a.a.a.y0.k.b.j r8 = r8.c
                e.a.a.a.y0.m.l1.l r8 = r8.r
                e.a.a.a.y0.m.l1.f r8 = r8.c()
                e.a.a.a.y0.j.y.i r7 = r7.a(r8)
                e.a.a.a.y0.k.b.g0.d$a r7 = (e.a.a.a.y0.k.b.g0.d.a) r7
                java.util.Set r7 = r7.m()
                boolean r3 = r7.contains(r3)
                if (r3 != 0) goto L_0x0090
                goto L_0x0122
            L_0x0090:
                e.a.a.a.y0.k.b.l r2 = r2.f9513p
            L_0x0092:
                r8 = r2
                goto L_0x0117
            L_0x0095:
                e.a.a.a.y0.k.b.j r7 = r2.f9566b
                e.a.a.a.y0.b.z r7 = r7.f9572g
                e.a.a.a.y0.f.b r10 = r3.h()
                java.lang.String r11 = "classId.packageFqName"
                e.x.c.i.d(r10, r11)
                java.util.List r7 = r7.a(r10)
                java.util.Iterator r7 = r7.iterator()
            L_0x00aa:
                boolean r10 = r7.hasNext()
                if (r10 == 0) goto L_0x00ed
                java.lang.Object r10 = r7.next()
                r11 = r10
                e.a.a.a.y0.b.y r11 = (e.a.a.a.y0.b.y) r11
                boolean r12 = r11 instanceof e.a.a.a.y0.k.b.n
                r13 = 0
                r15 = 1
                if (r12 == 0) goto L_0x00e7
                e.a.a.a.y0.k.b.n r11 = (e.a.a.a.y0.k.b.n) r11
                e.a.a.a.y0.f.d r12 = r3.j()
                e.x.c.i.d(r12, r9)
                java.util.Objects.requireNonNull(r11)
                e.x.c.i.e(r12, r8)
                e.a.a.a.y0.k.b.o r11 = (e.a.a.a.y0.k.b.o) r11
                e.a.a.a.y0.j.y.i r11 = r11.z()
                boolean r6 = r11 instanceof e.a.a.a.y0.k.b.g0.h
                if (r6 == 0) goto L_0x00e4
                e.a.a.a.y0.k.b.g0.h r11 = (e.a.a.a.y0.k.b.g0.h) r11
                java.util.Set r6 = r11.m()
                boolean r6 = r6.contains(r12)
                if (r6 == 0) goto L_0x00e4
                r6 = r15
                goto L_0x00e5
            L_0x00e4:
                r6 = r13
            L_0x00e5:
                if (r6 == 0) goto L_0x00e8
            L_0x00e7:
                r13 = r15
            L_0x00e8:
                if (r13 == 0) goto L_0x00eb
                goto L_0x00ee
            L_0x00eb:
                r6 = 0
                goto L_0x00aa
            L_0x00ed:
                r10 = 0
            L_0x00ee:
                r8 = r10
                e.a.a.a.y0.b.y r8 = (e.a.a.a.y0.b.y) r8
                if (r8 == 0) goto L_0x0122
                e.a.a.a.y0.k.b.j r7 = r2.f9566b
                e.a.a.a.y0.e.z.e r10 = new e.a.a.a.y0.e.z.e
                e.a.a.a.y0.e.t r2 = r5.A
                java.lang.String r3 = "classProto.typeTable"
                e.x.c.i.d(r2, r3)
                r10.<init>(r2)
                e.a.a.a.y0.e.z.g$a r2 = e.a.a.a.y0.e.z.g.c
                e.a.a.a.y0.e.w r3 = r5.C
                java.lang.String r6 = "classProto.versionRequirementTable"
                e.x.c.i.d(r3, r6)
                e.a.a.a.y0.e.z.g r11 = r2.a(r3)
                r13 = 0
                r9 = r4
                r12 = r14
                e.a.a.a.y0.k.b.l r2 = r7.a(r8, r9, r10, r11, r12, r13)
                goto L_0x0092
            L_0x0117:
                e.a.a.a.y0.k.b.g0.d r6 = new e.a.a.a.y0.k.b.g0.d
                r7 = r6
                r9 = r5
                r10 = r4
                r11 = r14
                r12 = r0
                r7.<init>(r8, r9, r10, r11, r12)
                goto L_0x0123
            L_0x0122:
                r6 = 0
            L_0x0123:
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: e.a.a.a.y0.k.b.h.b.invoke(java.lang.Object):java.lang.Object");
        }
    }

    public h(j jVar) {
        i.e(jVar, "components");
        this.f9566b = jVar;
        this.a = jVar.f9570b.i(new b(this));
    }

    public static e a(h hVar, e.a.a.a.y0.f.a aVar, f fVar, int i2) {
        int i3 = i2 & 2;
        Objects.requireNonNull(hVar);
        i.e(aVar, "classId");
        return hVar.a.invoke(new a(aVar, (f) null));
    }
}
