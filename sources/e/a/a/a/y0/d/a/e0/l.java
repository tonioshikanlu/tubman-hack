package e.a.a.a.y0.d.a.e0;

import e.a.a.a.y0.b.w0;
import e.a.a.a.y0.d.a.a;
import e.a.a.a.y0.d.a.b0.h;
import e.a.a.a.y0.f.d;
import e.a.a.a.y0.m.d0;
import e.a.a.a.y0.m.i1;
import e.a.a.a.y0.o.i;
import e.x.c.k;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Objects;

public final class l {
    public final e.a.a.a.y0.d.a.a a;

    /* renamed from: b  reason: collision with root package name */
    public final i f8546b;

    public static class a {
        public final d0 a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f8547b;
        public final boolean c;

        public a(d0 d0Var, boolean z, boolean z2) {
            e.x.c.i.e(d0Var, "type");
            this.a = d0Var;
            this.f8547b = z;
            this.c = z2;
        }
    }

    public final class b {
        public final e.a.a.a.y0.b.a1.a a;

        /* renamed from: b  reason: collision with root package name */
        public final d0 f8548b;
        public final Collection<d0> c;
        public final boolean d;

        /* renamed from: e  reason: collision with root package name */
        public final h f8549e;
        public final a.C0170a f;

        /* renamed from: g  reason: collision with root package name */
        public final /* synthetic */ l f8550g;

        public static final class a extends k implements e.x.b.l<Integer, d> {

            /* renamed from: h  reason: collision with root package name */
            public final /* synthetic */ x f8551h;

            /* renamed from: i  reason: collision with root package name */
            public final /* synthetic */ e.x.b.l f8552i;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public a(x xVar, e.x.b.l lVar) {
                super(1);
                this.f8551h = xVar;
                this.f8552i = lVar;
            }

            public Object invoke(Object obj) {
                int intValue = ((Number) obj).intValue();
                d dVar = this.f8551h.a.get(Integer.valueOf(intValue));
                return dVar != null ? dVar : (d) this.f8552i.invoke(Integer.valueOf(intValue));
            }
        }

        /* renamed from: e.a.a.a.y0.d.a.e0.l$b$b  reason: collision with other inner class name */
        public static final class C0177b extends k implements e.x.b.l<i1, Boolean> {

            /* renamed from: h  reason: collision with root package name */
            public static final C0177b f8553h = new C0177b();

            public C0177b() {
                super(1);
            }

            public Object invoke(Object obj) {
                e.a.a.a.y0.b.h d = ((i1) obj).W0().d();
                if (d == null) {
                    return Boolean.FALSE;
                }
                e.x.c.i.d(d, "it.constructor.declarati… ?: return@contains false");
                d name = d.getName();
                e.a.a.a.y0.a.p.c cVar = e.a.a.a.y0.a.p.c.f7720m;
                e.a.a.a.y0.f.b bVar = e.a.a.a.y0.a.p.c.f;
                return Boolean.valueOf(e.x.c.i.a(name, bVar.g()) && e.x.c.i.a(e.a.a.a.y0.j.v.b.d(d), bVar));
            }
        }

        public b(l lVar, e.a.a.a.y0.b.a1.a aVar, d0 d0Var, Collection<? extends d0> collection, boolean z, h hVar, a.C0170a aVar2) {
            e.x.c.i.e(d0Var, "fromOverride");
            e.x.c.i.e(collection, "fromOverridden");
            e.x.c.i.e(hVar, "containerContext");
            e.x.c.i.e(aVar2, "containerApplicabilityType");
            this.f8550g = lVar;
            this.a = aVar;
            this.f8548b = d0Var;
            this.c = collection;
            this.d = z;
            this.f8549e = hVar;
            this.f = aVar2;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:140:0x024b, code lost:
            if ((((r13 != null ? r13.R() : null) != null) && r11 && r12 == e.a.a.a.y0.d.a.e0.g.NULLABLE) == false) goto L_0x024f;
         */
        /* JADX WARNING: Removed duplicated region for block: B:112:0x0212  */
        /* JADX WARNING: Removed duplicated region for block: B:113:0x0214  */
        /* JADX WARNING: Removed duplicated region for block: B:115:0x0217  */
        /* JADX WARNING: Removed duplicated region for block: B:116:0x021a  */
        /* JADX WARNING: Removed duplicated region for block: B:124:0x022a  */
        /* JADX WARNING: Removed duplicated region for block: B:146:0x0262  */
        /* JADX WARNING: Removed duplicated region for block: B:147:0x0264  */
        /* JADX WARNING: Removed duplicated region for block: B:150:0x0269  */
        /* JADX WARNING: Removed duplicated region for block: B:163:0x028f A[ADDED_TO_REGION] */
        /* JADX WARNING: Removed duplicated region for block: B:166:0x029d  */
        /* JADX WARNING: Removed duplicated region for block: B:167:0x029f  */
        /* JADX WARNING: Removed duplicated region for block: B:172:0x02c4  */
        /* JADX WARNING: Removed duplicated region for block: B:173:0x02ca  */
        /* JADX WARNING: Removed duplicated region for block: B:176:0x02d7  */
        /* JADX WARNING: Removed duplicated region for block: B:179:0x02f5  */
        /* JADX WARNING: Removed duplicated region for block: B:180:0x02f7  */
        /* JADX WARNING: Removed duplicated region for block: B:183:0x02fc  */
        /* JADX WARNING: Removed duplicated region for block: B:184:0x0301  */
        /* JADX WARNING: Removed duplicated region for block: B:21:0x007c  */
        /* JADX WARNING: Removed duplicated region for block: B:22:0x007e  */
        /* JADX WARNING: Removed duplicated region for block: B:25:0x0087  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final e.a.a.a.y0.d.a.e0.l.a a(e.a.a.a.y0.d.a.e0.x r22) {
            /*
                r21 = this;
                r0 = r21
                r1 = r22
                java.util.Collection<e.a.a.a.y0.m.d0> r2 = r0.c
                java.util.ArrayList r3 = new java.util.ArrayList
                r4 = 10
                int r5 = b.q.a.a.C(r2, r4)
                r3.<init>(r5)
                java.util.Iterator r2 = r2.iterator()
            L_0x0015:
                boolean r5 = r2.hasNext()
                r6 = 1
                if (r5 == 0) goto L_0x0035
                java.lang.Object r5 = r2.next()
                e.a.a.a.y0.m.d0 r5 = (e.a.a.a.y0.m.d0) r5
                java.util.ArrayList r7 = new java.util.ArrayList
                r7.<init>(r6)
                e.a.a.a.y0.d.a.e0.p r6 = new e.a.a.a.y0.d.a.e0.p
                r6.<init>(r7)
                e.a.a.a.y0.d.a.b0.h r8 = r0.f8549e
                r6.a(r5, r8)
                r3.add(r7)
                goto L_0x0015
            L_0x0035:
                e.a.a.a.y0.m.d0 r2 = r0.f8548b
                java.util.ArrayList r5 = new java.util.ArrayList
                r5.<init>(r6)
                e.a.a.a.y0.d.a.e0.p r7 = new e.a.a.a.y0.d.a.e0.p
                r7.<init>(r5)
                e.a.a.a.y0.d.a.b0.h r8 = r0.f8549e
                r7.a(r2, r8)
                boolean r2 = r0.d
                if (r2 == 0) goto L_0x0079
                java.util.Collection<e.a.a.a.y0.m.d0> r2 = r0.c
                boolean r8 = r2 instanceof java.util.Collection
                if (r8 == 0) goto L_0x0057
                boolean r8 = r2.isEmpty()
                if (r8 == 0) goto L_0x0057
                goto L_0x0074
            L_0x0057:
                java.util.Iterator r2 = r2.iterator()
            L_0x005b:
                boolean r8 = r2.hasNext()
                if (r8 == 0) goto L_0x0074
                java.lang.Object r8 = r2.next()
                e.a.a.a.y0.m.d0 r8 = (e.a.a.a.y0.m.d0) r8
                e.a.a.a.y0.m.l1.d r9 = e.a.a.a.y0.m.l1.d.a
                e.a.a.a.y0.m.d0 r10 = r0.f8548b
                boolean r8 = r9.b(r8, r10)
                r8 = r8 ^ r6
                if (r8 == 0) goto L_0x005b
                r2 = r6
                goto L_0x0075
            L_0x0074:
                r2 = 0
            L_0x0075:
                if (r2 == 0) goto L_0x0079
                r2 = r6
                goto L_0x007a
            L_0x0079:
                r2 = 0
            L_0x007a:
                if (r2 == 0) goto L_0x007e
                r2 = r6
                goto L_0x0082
            L_0x007e:
                int r2 = r5.size()
            L_0x0082:
                e.a.a.a.y0.d.a.e0.d[] r8 = new e.a.a.a.y0.d.a.e0.d[r2]
                r9 = 0
            L_0x0085:
                if (r9 >= r2) goto L_0x02b7
                if (r9 != 0) goto L_0x008b
                r11 = r6
                goto L_0x008c
            L_0x008b:
                r11 = 0
            L_0x008c:
                java.lang.Object r12 = r5.get(r9)
                e.a.a.a.y0.d.a.e0.v r12 = (e.a.a.a.y0.d.a.e0.v) r12
                e.a.a.a.y0.m.d0 r13 = r12.a
                e.a.a.a.y0.d.a.e0.d r12 = r12.f8563b
                java.util.ArrayList r14 = new java.util.ArrayList
                r14.<init>()
                java.util.Iterator r15 = r3.iterator()
            L_0x009f:
                boolean r16 = r15.hasNext()
                if (r16 == 0) goto L_0x00bf
                java.lang.Object r16 = r15.next()
                r10 = r16
                java.util.List r10 = (java.util.List) r10
                java.lang.Object r10 = e.t.g.t(r10, r9)
                e.a.a.a.y0.d.a.e0.v r10 = (e.a.a.a.y0.d.a.e0.v) r10
                if (r10 == 0) goto L_0x00b8
                e.a.a.a.y0.m.d0 r10 = r10.a
                goto L_0x00b9
            L_0x00b8:
                r10 = 0
            L_0x00b9:
                if (r10 == 0) goto L_0x009f
                r14.add(r10)
                goto L_0x009f
            L_0x00bf:
                java.util.ArrayList r10 = new java.util.ArrayList
                int r15 = b.q.a.a.C(r14, r4)
                r10.<init>(r15)
                java.util.Iterator r15 = r14.iterator()
            L_0x00cc:
                boolean r16 = r15.hasNext()
                if (r16 == 0) goto L_0x00e4
                java.lang.Object r16 = r15.next()
                r4 = r16
                e.a.a.a.y0.m.d0 r4 = (e.a.a.a.y0.m.d0) r4
                e.a.a.a.y0.d.a.e0.d r4 = r0.b(r4)
                r10.add(r4)
                r4 = 10
                goto L_0x00cc
            L_0x00e4:
                java.util.ArrayList r4 = new java.util.ArrayList
                r4.<init>()
                java.util.Iterator r15 = r10.iterator()
            L_0x00ed:
                boolean r16 = r15.hasNext()
                if (r16 == 0) goto L_0x0103
                java.lang.Object r16 = r15.next()
                r7 = r16
                e.a.a.a.y0.d.a.e0.d r7 = (e.a.a.a.y0.d.a.e0.d) r7
                e.a.a.a.y0.d.a.e0.e r7 = r7.f8500b
                if (r7 == 0) goto L_0x00ed
                r4.add(r7)
                goto L_0x00ed
            L_0x0103:
                java.util.Set r4 = e.t.g.d0(r4)
                java.util.ArrayList r7 = new java.util.ArrayList
                r7.<init>()
                java.util.Iterator r15 = r10.iterator()
            L_0x0110:
                boolean r16 = r15.hasNext()
                if (r16 == 0) goto L_0x0127
                java.lang.Object r16 = r15.next()
                r6 = r16
                e.a.a.a.y0.d.a.e0.d r6 = (e.a.a.a.y0.d.a.e0.d) r6
                e.a.a.a.y0.d.a.e0.g r6 = r6.a
                if (r6 == 0) goto L_0x0125
                r7.add(r6)
            L_0x0125:
                r6 = 1
                goto L_0x0110
            L_0x0127:
                java.util.Set r6 = e.t.g.d0(r7)
                java.util.ArrayList r7 = new java.util.ArrayList
                r7.<init>()
                java.util.Iterator r14 = r14.iterator()
            L_0x0134:
                boolean r15 = r14.hasNext()
                if (r15 == 0) goto L_0x015c
                java.lang.Object r15 = r14.next()
                e.a.a.a.y0.m.d0 r15 = (e.a.a.a.y0.m.d0) r15
                r16 = r2
                java.lang.String r2 = "$this$unwrapEnhancement"
                e.x.c.i.e(r15, r2)
                e.a.a.a.y0.m.d0 r2 = b.q.a.a.G0(r15)
                if (r2 == 0) goto L_0x014e
                r15 = r2
            L_0x014e:
                e.a.a.a.y0.d.a.e0.d r2 = r0.b(r15)
                e.a.a.a.y0.d.a.e0.g r2 = r2.a
                if (r2 == 0) goto L_0x0159
                r7.add(r2)
            L_0x0159:
                r2 = r16
                goto L_0x0134
            L_0x015c:
                r16 = r2
                java.util.Set r2 = e.t.g.d0(r7)
                if (r11 == 0) goto L_0x0175
                e.a.a.a.y0.b.a1.a r7 = r0.a
                if (r7 == 0) goto L_0x0175
                e.a.a.a.y0.b.a1.h r7 = r7.k()
                e.a.a.a.y0.b.a1.h r14 = r13.k()
                e.a.a.a.y0.b.a1.h r7 = b.q.a.a.E(r7, r14)
                goto L_0x0179
            L_0x0175:
                e.a.a.a.y0.b.a1.h r7 = r13.k()
            L_0x0179:
                e.a.a.a.y0.d.a.e0.n r14 = new e.a.a.a.y0.d.a.e0.n
                r14.<init>(r7)
                e.a.a.a.y0.d.a.e0.o r15 = e.a.a.a.y0.d.a.e0.o.f8556h
                if (r11 == 0) goto L_0x0195
                e.a.a.a.y0.d.a.b0.h r12 = r0.f8549e
                e.a.a.a.y0.d.a.b0.e r12 = r12.a()
                r17 = r3
                if (r12 == 0) goto L_0x0193
                e.a.a.a.y0.d.a.a$a r3 = r0.f
                e.a.a.a.y0.d.a.e0.d r12 = r12.a(r3)
                goto L_0x0197
            L_0x0193:
                r12 = 0
                goto L_0x0197
            L_0x0195:
                r17 = r3
            L_0x0197:
                e.a.a.a.y0.d.a.e0.l r3 = r0.f8550g
                java.util.Iterator r7 = r7.iterator()
            L_0x019d:
                boolean r18 = r7.hasNext()
                if (r18 == 0) goto L_0x01b7
                java.lang.Object r18 = r7.next()
                r19 = r5
                r5 = r18
                e.a.a.a.y0.b.a1.c r5 = (e.a.a.a.y0.b.a1.c) r5
                e.a.a.a.y0.d.a.e0.h r5 = r3.b(r5)
                if (r5 == 0) goto L_0x01b4
                goto L_0x01ba
            L_0x01b4:
                r5 = r19
                goto L_0x019d
            L_0x01b7:
                r19 = r5
                r5 = 0
            L_0x01ba:
                if (r5 == 0) goto L_0x01bd
                goto L_0x01cc
            L_0x01bd:
                if (r12 == 0) goto L_0x01cb
                e.a.a.a.y0.d.a.e0.g r3 = r12.a
                if (r3 == 0) goto L_0x01cb
                e.a.a.a.y0.d.a.e0.h r5 = new e.a.a.a.y0.d.a.e0.h
                boolean r7 = r12.d
                r5.<init>(r3, r7)
                goto L_0x01cc
            L_0x01cb:
                r5 = 0
            L_0x01cc:
                e.a.a.a.y0.d.a.e0.d r3 = new e.a.a.a.y0.d.a.e0.d
                if (r5 == 0) goto L_0x01d3
                e.a.a.a.y0.d.a.e0.g r7 = r5.a
                goto L_0x01d4
            L_0x01d3:
                r7 = 0
            L_0x01d4:
                java.util.List<e.a.a.a.y0.f.b> r12 = e.a.a.a.y0.d.a.u.f8591i
                e.a.a.a.y0.d.a.e0.e r1 = e.a.a.a.y0.d.a.e0.e.READ_ONLY
                java.lang.Object r12 = r14.invoke(r12, r1)
                r18 = r8
                java.util.List<e.a.a.a.y0.f.b> r8 = e.a.a.a.y0.d.a.u.f8592j
                r20 = r9
                e.a.a.a.y0.d.a.e0.e r9 = e.a.a.a.y0.d.a.e0.e.MUTABLE
                java.lang.Object r8 = r14.invoke(r8, r9)
                java.lang.Object r8 = r15.invoke(r12, r8)
                e.a.a.a.y0.d.a.e0.e r8 = (e.a.a.a.y0.d.a.e0.e) r8
                if (r5 == 0) goto L_0x01f3
                e.a.a.a.y0.d.a.e0.g r12 = r5.a
                goto L_0x01f4
            L_0x01f3:
                r12 = 0
            L_0x01f4:
                e.a.a.a.y0.d.a.e0.g r14 = e.a.a.a.y0.d.a.e0.g.NOT_NULL
                if (r12 != r14) goto L_0x0200
                boolean r12 = e.a.a.a.y0.m.o1.c.P(r13)
                if (r12 == 0) goto L_0x0200
                r12 = 1
                goto L_0x0201
            L_0x0200:
                r12 = 0
            L_0x0201:
                if (r5 == 0) goto L_0x020a
                boolean r5 = r5.f8509b
                r13 = 1
                if (r5 != r13) goto L_0x020b
                r5 = r13
                goto L_0x020c
            L_0x020a:
                r13 = 1
            L_0x020b:
                r5 = 0
            L_0x020c:
                r3.<init>(r7, r8, r12, r5)
                r5 = r5 ^ r13
                if (r5 == 0) goto L_0x0214
                r5 = r3
                goto L_0x0215
            L_0x0214:
                r5 = 0
            L_0x0215:
                if (r5 == 0) goto L_0x021a
                e.a.a.a.y0.d.a.e0.g r5 = r5.a
                goto L_0x021b
            L_0x021a:
                r5 = 0
            L_0x021b:
                boolean r8 = r0.d
                if (r8 == 0) goto L_0x0223
                if (r11 == 0) goto L_0x0223
                r8 = 1
                goto L_0x0224
            L_0x0223:
                r8 = 0
            L_0x0224:
                e.a.a.a.y0.d.a.e0.g r12 = b.q.a.a.P2(r6, r5, r8)
                if (r12 == 0) goto L_0x024e
                e.a.a.a.y0.b.a1.a r13 = r0.a
                boolean r14 = r13 instanceof e.a.a.a.y0.b.w0
                if (r14 != 0) goto L_0x0231
                r13 = 0
            L_0x0231:
                e.a.a.a.y0.b.w0 r13 = (e.a.a.a.y0.b.w0) r13
                if (r13 == 0) goto L_0x023a
                e.a.a.a.y0.m.d0 r13 = r13.R()
                goto L_0x023b
            L_0x023a:
                r13 = 0
            L_0x023b:
                if (r13 == 0) goto L_0x023f
                r13 = 1
                goto L_0x0240
            L_0x023f:
                r13 = 0
            L_0x0240:
                if (r13 == 0) goto L_0x024a
                if (r11 == 0) goto L_0x024a
                e.a.a.a.y0.d.a.e0.g r11 = e.a.a.a.y0.d.a.e0.g.NULLABLE
                if (r12 != r11) goto L_0x024a
                r11 = 1
                goto L_0x024b
            L_0x024a:
                r11 = 0
            L_0x024b:
                if (r11 != 0) goto L_0x024e
                goto L_0x024f
            L_0x024e:
                r12 = 0
            L_0x024f:
                e.a.a.a.y0.d.a.e0.e r11 = r3.f8500b
                java.lang.Object r1 = b.q.a.a.O2(r4, r9, r1, r11, r8)
                e.a.a.a.y0.d.a.e0.e r1 = (e.a.a.a.y0.d.a.e0.e) r1
                if (r7 != r5) goto L_0x0264
                boolean r4 = e.x.c.i.a(r2, r6)
                r5 = 1
                r4 = r4 ^ r5
                if (r4 == 0) goto L_0x0262
                goto L_0x0264
            L_0x0262:
                r4 = 0
                goto L_0x0265
            L_0x0264:
                r4 = 1
            L_0x0265:
                boolean r3 = r3.c
                if (r3 != 0) goto L_0x028c
                boolean r3 = r10.isEmpty()
                if (r3 == 0) goto L_0x0270
                goto L_0x0286
            L_0x0270:
                java.util.Iterator r3 = r10.iterator()
            L_0x0274:
                boolean r5 = r3.hasNext()
                if (r5 == 0) goto L_0x0286
                java.lang.Object r5 = r3.next()
                e.a.a.a.y0.d.a.e0.d r5 = (e.a.a.a.y0.d.a.e0.d) r5
                boolean r5 = r5.c
                if (r5 == 0) goto L_0x0274
                r3 = 1
                goto L_0x0287
            L_0x0286:
                r3 = 0
            L_0x0287:
                if (r3 == 0) goto L_0x028a
                goto L_0x028c
            L_0x028a:
                r3 = 0
                goto L_0x028d
            L_0x028c:
                r3 = 1
            L_0x028d:
                if (r12 != 0) goto L_0x029b
                if (r4 == 0) goto L_0x029b
                e.a.a.a.y0.d.a.e0.g r2 = b.q.a.a.P2(r2, r7, r8)
                r4 = 1
                e.a.a.a.y0.d.a.e0.d r1 = b.q.a.a.d0(r2, r1, r4, r3)
                goto L_0x02a4
            L_0x029b:
                if (r12 != 0) goto L_0x029f
                r2 = 1
                goto L_0x02a0
            L_0x029f:
                r2 = 0
            L_0x02a0:
                e.a.a.a.y0.d.a.e0.d r1 = b.q.a.a.d0(r12, r1, r2, r3)
            L_0x02a4:
                r18[r20] = r1
                int r9 = r20 + 1
                r1 = r22
                r2 = r16
                r3 = r17
                r8 = r18
                r5 = r19
                r4 = 10
                r6 = 1
                goto L_0x0085
            L_0x02b7:
                r18 = r8
                e.a.a.a.y0.d.a.e0.m r1 = new e.a.a.a.y0.d.a.e0.m
                r2 = r18
                r1.<init>(r2)
                r2 = r22
                if (r2 == 0) goto L_0x02ca
                e.a.a.a.y0.d.a.e0.l$b$a r3 = new e.a.a.a.y0.d.a.e0.l$b$a
                r3.<init>(r2, r1)
                goto L_0x02cb
            L_0x02ca:
                r3 = 0
            L_0x02cb:
                e.a.a.a.y0.m.d0 r2 = r0.f8548b
                e.a.a.a.y0.d.a.e0.l$b$b r4 = e.a.a.a.y0.d.a.e0.l.b.C0177b.f8553h
                boolean r2 = e.a.a.a.y0.m.f1.c(r2, r4)
                e.a.a.a.y0.m.d0 r4 = r0.f8548b
                if (r3 == 0) goto L_0x02d8
                r1 = r3
            L_0x02d8:
                e.a.a.a.y0.d.a.e0.b r3 = e.a.a.a.y0.d.a.e0.y.a
                java.lang.String r3 = "$this$enhance"
                e.x.c.i.e(r4, r3)
                java.lang.String r3 = "qualifiers"
                e.x.c.i.e(r1, r3)
                e.a.a.a.y0.m.i1 r3 = r4.Z0()
                r4 = 0
                e.a.a.a.y0.d.a.e0.k r1 = e.a.a.a.y0.d.a.e0.y.b(r3, r1, r4)
                e.a.a.a.y0.m.d0 r3 = r1.a()
                boolean r1 = r1.c
                if (r1 == 0) goto L_0x02f7
                r10 = r3
                goto L_0x02f8
            L_0x02f7:
                r10 = 0
            L_0x02f8:
                e.a.a.a.y0.d.a.e0.l$a r1 = new e.a.a.a.y0.d.a.e0.l$a
                if (r10 == 0) goto L_0x0301
                r3 = 1
                r1.<init>(r10, r3, r2)
                goto L_0x0307
            L_0x0301:
                e.a.a.a.y0.m.d0 r3 = r0.f8548b
                r4 = 0
                r1.<init>(r3, r4, r2)
            L_0x0307:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: e.a.a.a.y0.d.a.e0.l.b.a(e.a.a.a.y0.d.a.e0.x):e.a.a.a.y0.d.a.e0.l$a");
        }

        /* JADX WARNING: Removed duplicated region for block: B:16:0x004d  */
        /* JADX WARNING: Removed duplicated region for block: B:17:0x004f  */
        /* JADX WARNING: Removed duplicated region for block: B:19:0x0052  */
        /* JADX WARNING: Removed duplicated region for block: B:20:0x0055  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final e.a.a.a.y0.d.a.e0.d b(e.a.a.a.y0.m.d0 r11) {
            /*
                r10 = this;
                boolean r0 = b.q.a.a.K1(r11)
                if (r0 == 0) goto L_0x0014
                e.a.a.a.y0.m.x r0 = b.q.a.a.p(r11)
                e.j r1 = new e.j
                e.a.a.a.y0.m.k0 r2 = r0.f9767i
                e.a.a.a.y0.m.k0 r0 = r0.f9768j
                r1.<init>(r2, r0)
                goto L_0x0019
            L_0x0014:
                e.j r1 = new e.j
                r1.<init>(r11, r11)
            L_0x0019:
                A r0 = r1.f7906h
                e.a.a.a.y0.m.d0 r0 = (e.a.a.a.y0.m.d0) r0
                B r1 = r1.f7907i
                e.a.a.a.y0.m.d0 r1 = (e.a.a.a.y0.m.d0) r1
                e.a.a.a.y0.a.p.c r2 = e.a.a.a.y0.a.p.c.f7720m
                e.a.a.a.y0.d.a.e0.d r9 = new e.a.a.a.y0.d.a.e0.d
                boolean r3 = r0.X0()
                r4 = 0
                if (r3 == 0) goto L_0x0030
                e.a.a.a.y0.d.a.e0.g r3 = e.a.a.a.y0.d.a.e0.g.NULLABLE
            L_0x002e:
                r5 = r3
                goto L_0x003a
            L_0x0030:
                boolean r3 = r1.X0()
                if (r3 != 0) goto L_0x0039
                e.a.a.a.y0.d.a.e0.g r3 = e.a.a.a.y0.d.a.e0.g.NOT_NULL
                goto L_0x002e
            L_0x0039:
                r5 = r4
            L_0x003a:
                java.lang.String r3 = "type"
                e.x.c.i.e(r0, r3)
                e.a.a.a.y0.b.e r0 = e.a.a.a.y0.m.f1.e(r0)
                r6 = 1
                r7 = 0
                if (r0 == 0) goto L_0x004f
                boolean r0 = r2.i(r0)
                if (r0 == 0) goto L_0x004f
                r0 = r6
                goto L_0x0050
            L_0x004f:
                r0 = r7
            L_0x0050:
                if (r0 == 0) goto L_0x0055
                e.a.a.a.y0.d.a.e0.e r0 = e.a.a.a.y0.d.a.e0.e.READ_ONLY
                goto L_0x006c
            L_0x0055:
                e.x.c.i.e(r1, r3)
                e.a.a.a.y0.b.e r0 = e.a.a.a.y0.m.f1.e(r1)
                if (r0 == 0) goto L_0x0065
                boolean r0 = r2.h(r0)
                if (r0 == 0) goto L_0x0065
                goto L_0x0066
            L_0x0065:
                r6 = r7
            L_0x0066:
                if (r6 == 0) goto L_0x006b
                e.a.a.a.y0.d.a.e0.e r0 = e.a.a.a.y0.d.a.e0.e.MUTABLE
                goto L_0x006c
            L_0x006b:
                r0 = r4
            L_0x006c:
                e.a.a.a.y0.m.i1 r11 = r11.Z0()
                boolean r6 = r11 instanceof e.a.a.a.y0.d.a.e0.f
                r7 = 0
                r8 = 8
                r3 = r9
                r4 = r5
                r5 = r0
                r3.<init>(r4, r5, r6, r7, r8)
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: e.a.a.a.y0.d.a.e0.l.b.b(e.a.a.a.y0.m.d0):e.a.a.a.y0.d.a.e0.d");
        }
    }

    public static final class c extends a {
        public final boolean d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(d0 d0Var, boolean z, boolean z2, boolean z3) {
            super(d0Var, z2, z3);
            e.x.c.i.e(d0Var, "type");
            this.d = z;
        }
    }

    public l(e.a.a.a.y0.d.a.a aVar, i iVar) {
        e.x.c.i.e(aVar, "annotationTypeQualifierResolver");
        e.x.c.i.e(iVar, "jsr305State");
        this.a = aVar;
        this.f8546b = iVar;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v1, resolved type: e.a.a.a.y0.b.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v2, resolved type: e.a.a.a.y0.b.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: e.a.a.a.y0.d.a.a0.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v0, resolved type: e.a.a.a.y0.d.a.a0.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v10, resolved type: e.a.a.a.y0.d.a.a0.f} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v16, resolved type: e.a.a.a.y0.b.f0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v27, resolved type: e.a.a.a.y0.b.f0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v28, resolved type: e.a.a.a.y0.b.f0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v75, resolved type: e.a.a.a.y0.d.a.a0.f} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v76, resolved type: e.a.a.a.y0.d.a.a0.f} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v13, resolved type: e.a.a.a.y0.b.c1.f0} */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x037a, code lost:
        if (e.a.a.a.y0.a.g.L(r5) != false) goto L_0x037e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:223:0x043e, code lost:
        if (r8.f8547b != true) goto L_0x0442;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x004e, code lost:
        if (r0.g().size() == 1) goto L_0x0050;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x0290 A[Catch:{  }] */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x029a A[Catch:{  }] */
    /* JADX WARNING: Removed duplicated region for block: B:165:0x0380  */
    /* JADX WARNING: Removed duplicated region for block: B:168:0x0389  */
    /* JADX WARNING: Removed duplicated region for block: B:169:0x038b  */
    /* JADX WARNING: Removed duplicated region for block: B:170:0x038d  */
    /* JADX WARNING: Removed duplicated region for block: B:178:0x03aa  */
    /* JADX WARNING: Removed duplicated region for block: B:179:0x03ac  */
    /* JADX WARNING: Removed duplicated region for block: B:184:0x03b8  */
    /* JADX WARNING: Removed duplicated region for block: B:185:0x03ba  */
    /* JADX WARNING: Removed duplicated region for block: B:191:0x03e0  */
    /* JADX WARNING: Removed duplicated region for block: B:192:0x03e2  */
    /* JADX WARNING: Removed duplicated region for block: B:197:0x03ee  */
    /* JADX WARNING: Removed duplicated region for block: B:198:0x03f1  */
    /* JADX WARNING: Removed duplicated region for block: B:201:0x0402  */
    /* JADX WARNING: Removed duplicated region for block: B:202:0x0405  */
    /* JADX WARNING: Removed duplicated region for block: B:211:0x041c  */
    /* JADX WARNING: Removed duplicated region for block: B:219:0x0436  */
    /* JADX WARNING: Removed duplicated region for block: B:222:0x043b  */
    /* JADX WARNING: Removed duplicated region for block: B:224:0x0441  */
    /* JADX WARNING: Removed duplicated region for block: B:227:0x0446  */
    /* JADX WARNING: Removed duplicated region for block: B:240:0x046e  */
    /* JADX WARNING: Removed duplicated region for block: B:241:0x047b  */
    /* JADX WARNING: Removed duplicated region for block: B:243:0x047e  */
    /* JADX WARNING: Removed duplicated region for block: B:244:0x0481  */
    /* JADX WARNING: Removed duplicated region for block: B:248:0x0497 A[LOOP:4: B:246:0x0491->B:248:0x0497, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0125  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x014d  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x01db  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final <D extends e.a.a.a.y0.b.b> java.util.Collection<D> a(e.a.a.a.y0.d.a.b0.h r20, java.util.Collection<? extends D> r21) {
        /*
            r19 = this;
            r7 = r19
            r8 = r20
            r0 = r21
            java.lang.String r1 = "c"
            e.x.c.i.e(r8, r1)
            java.lang.String r1 = "platformSignatures"
            e.x.c.i.e(r0, r1)
            java.util.ArrayList r9 = new java.util.ArrayList
            r10 = 10
            int r1 = b.q.a.a.C(r0, r10)
            r9.<init>(r1)
            java.util.Iterator r11 = r21.iterator()
        L_0x001f:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x04bf
            java.lang.Object r0 = r11.next()
            r12 = r0
            e.a.a.a.y0.b.b r12 = (e.a.a.a.y0.b.b) r12
            boolean r0 = r12 instanceof e.a.a.a.y0.d.a.a0.b
            if (r0 != 0) goto L_0x0031
            goto L_0x0050
        L_0x0031:
            r0 = r12
            e.a.a.a.y0.d.a.a0.b r0 = (e.a.a.a.y0.d.a.a0.b) r0
            e.a.a.a.y0.b.b$a r1 = r0.i()
            e.a.a.a.y0.b.b$a r2 = e.a.a.a.y0.b.b.a.FAKE_OVERRIDE
            r13 = 1
            if (r1 != r2) goto L_0x0053
            e.a.a.a.y0.b.b r0 = r0.a()
            java.lang.String r1 = "original"
            e.x.c.i.d(r0, r1)
            java.util.Collection r0 = r0.g()
            int r0 = r0.size()
            if (r0 != r13) goto L_0x0053
        L_0x0050:
            r4 = r10
            goto L_0x04b5
        L_0x0053:
            e.a.a.a.y0.b.a1.h r0 = r12.k()
            e.a.a.a.y0.d.a.b0.h r4 = b.q.a.a.Q(r8, r0)
            boolean r0 = r12 instanceof e.a.a.a.y0.d.a.a0.g
            if (r0 == 0) goto L_0x0074
            r0 = r12
            e.a.a.a.y0.d.a.a0.g r0 = (e.a.a.a.y0.d.a.a0.g) r0
            e.a.a.a.y0.b.c1.f0 r0 = r0.C
            if (r0 == 0) goto L_0x0074
            boolean r1 = r0.f8175l
            if (r1 != 0) goto L_0x0074
            e.x.c.i.c(r0)
            java.lang.String r1 = "getter!!"
            e.x.c.i.d(r0, r1)
            r2 = r0
            goto L_0x0075
        L_0x0074:
            r2 = r12
        L_0x0075:
            r14 = r12
            e.a.a.a.y0.d.a.a0.b r14 = (e.a.a.a.y0.d.a.a0.b) r14
            e.a.a.a.y0.b.i0 r0 = r14.U()
            r15 = 0
            if (r0 == 0) goto L_0x00a0
            boolean r0 = r2 instanceof e.a.a.a.y0.b.s
            if (r0 != 0) goto L_0x0085
            r0 = r15
            goto L_0x0086
        L_0x0085:
            r0 = r2
        L_0x0086:
            e.a.a.a.y0.b.s r0 = (e.a.a.a.y0.b.s) r0
            if (r0 == 0) goto L_0x0093
            e.a.a.a.y0.b.a$a<e.a.a.a.y0.b.w0> r1 = e.a.a.a.y0.d.a.a0.f.L
            java.lang.Object r0 = r0.P(r1)
            e.a.a.a.y0.b.w0 r0 = (e.a.a.a.y0.b.w0) r0
            goto L_0x0094
        L_0x0093:
            r0 = r15
        L_0x0094:
            e.a.a.a.y0.d.a.e0.q r1 = e.a.a.a.y0.d.a.e0.q.f8558h
            e.a.a.a.y0.d.a.e0.l$b r0 = r7.e(r12, r0, r4, r1)
            e.a.a.a.y0.d.a.e0.l$a r0 = r0.a(r15)
            r6 = r0
            goto L_0x00a1
        L_0x00a0:
            r6 = r15
        L_0x00a1:
            boolean r0 = r12 instanceof e.a.a.a.y0.d.a.a0.f
            if (r0 != 0) goto L_0x00a7
            r0 = r15
            goto L_0x00a8
        L_0x00a7:
            r0 = r12
        L_0x00a8:
            e.a.a.a.y0.d.a.a0.f r0 = (e.a.a.a.y0.d.a.a0.f) r0
            r5 = 0
            if (r0 == 0) goto L_0x0122
            e.a.a.a.y0.b.k r1 = r0.b()
            java.lang.String r3 = "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor"
            java.util.Objects.requireNonNull(r1, r3)
            e.a.a.a.y0.b.e r1 = (e.a.a.a.y0.b.e) r1
            r3 = 3
            java.lang.String r0 = b.q.a.a.H(r0, r5, r5, r3)
            java.lang.String r3 = "classDescriptor"
            e.x.c.i.e(r1, r3)
            java.lang.String r3 = "jvmDescriptor"
            e.x.c.i.e(r0, r3)
            java.lang.String r15 = "$this$internalName"
            e.x.c.i.e(r1, r15)
            e.a.a.a.y0.a.p.c r15 = e.a.a.a.y0.a.p.c.f7720m
            e.a.a.a.y0.f.b r16 = e.a.a.a.y0.j.v.b.h(r1)
            e.a.a.a.y0.f.c r13 = r16.j()
            java.lang.String r5 = "fqNameSafe.toUnsafe()"
            e.x.c.i.d(r13, r5)
            e.a.a.a.y0.f.a r5 = r15.l(r13)
            if (r5 == 0) goto L_0x00f4
            e.a.a.a.y0.j.w.b r1 = e.a.a.a.y0.j.w.b.b(r5)
            java.lang.String r5 = "JvmClassName.byClassId(it)"
            e.x.c.i.d(r1, r5)
            java.lang.String r1 = r1.e()
            java.lang.String r5 = "JvmClassName.byClassId(it).internalName"
            e.x.c.i.d(r1, r5)
            goto L_0x00fa
        L_0x00f4:
            e.a.a.a.y0.d.b.t r5 = e.a.a.a.y0.d.b.t.a
            java.lang.String r1 = e.a.a.a.y0.d.b.v.a(r1, r5)
        L_0x00fa:
            java.lang.String r5 = "internalName"
            e.x.c.i.e(r1, r5)
            e.x.c.i.e(r0, r3)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r1)
            r1 = 46
            r3.append(r1)
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            if (r0 == 0) goto L_0x0122
            java.util.Map<java.lang.String, e.a.a.a.y0.d.a.e0.j> r1 = e.a.a.a.y0.d.a.e0.i.d
            java.lang.Object r0 = r1.get(r0)
            e.a.a.a.y0.d.a.e0.j r0 = (e.a.a.a.y0.d.a.e0.j) r0
            r13 = r0
            goto L_0x0123
        L_0x0122:
            r13 = 0
        L_0x0123:
            if (r13 == 0) goto L_0x0131
            java.util.List<e.a.a.a.y0.d.a.e0.x> r0 = r13.f8544b
            r0.size()
            java.util.List r0 = r14.n()
            r0.size()
        L_0x0131:
            java.util.List r0 = r2.n()
            java.lang.String r1 = "annotationOwnerForMember.valueParameters"
            e.x.c.i.d(r0, r1)
            java.util.ArrayList r15 = new java.util.ArrayList
            int r1 = b.q.a.a.C(r0, r10)
            r15.<init>(r1)
            java.util.Iterator r0 = r0.iterator()
        L_0x0147:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x03d9
            java.lang.Object r1 = r0.next()
            e.a.a.a.y0.b.w0 r1 = (e.a.a.a.y0.b.w0) r1
            e.a.a.a.y0.d.a.e0.s r3 = new e.a.a.a.y0.d.a.e0.s
            r3.<init>(r1)
            e.a.a.a.y0.d.a.e0.l$b r3 = r7.e(r12, r1, r4, r3)
            if (r13 == 0) goto L_0x016d
            java.util.List<e.a.a.a.y0.d.a.e0.x> r5 = r13.f8544b
            if (r5 == 0) goto L_0x016d
            int r10 = r1.h()
            java.lang.Object r5 = e.t.g.t(r5, r10)
            e.a.a.a.y0.d.a.e0.x r5 = (e.a.a.a.y0.d.a.e0.x) r5
            goto L_0x016e
        L_0x016d:
            r5 = 0
        L_0x016e:
            e.a.a.a.y0.d.a.e0.l$a r3 = r3.a(r5)
            boolean r5 = r3.f8547b
            java.lang.String r10 = "p"
            if (r5 == 0) goto L_0x017d
            e.a.a.a.y0.m.d0 r5 = r3.a
            r17 = r0
            goto L_0x018b
        L_0x017d:
            e.x.c.i.d(r1, r10)
            e.a.a.a.y0.m.d0 r5 = r1.d()
            r17 = r0
            java.lang.String r0 = "p.type"
            e.x.c.i.d(r5, r0)
        L_0x018b:
            e.x.c.i.d(r1, r10)
            e.a.a.a.y0.d.a.a0.h r0 = e.a.a.a.y0.d.a.a0.h.a
            java.lang.String r10 = "$this$getDefaultValueFromAnnotation"
            e.x.c.i.e(r1, r10)
            e.a.a.a.y0.b.a1.h r10 = r1.k()
            r18 = r6
            e.a.a.a.y0.f.b r6 = e.a.a.a.y0.d.a.t.f8585m
            java.lang.String r7 = "JvmAnnotationNames.DEFAULT_VALUE_FQ_NAME"
            e.x.c.i.d(r6, r7)
            e.a.a.a.y0.b.a1.c r6 = r10.i(r6)
            if (r6 == 0) goto L_0x01c3
            e.a.a.a.y0.j.t.g r6 = e.a.a.a.y0.j.v.b.b(r6)
            if (r6 == 0) goto L_0x01c3
            boolean r7 = r6 instanceof e.a.a.a.y0.j.t.x
            if (r7 != 0) goto L_0x01b3
            r6 = 0
        L_0x01b3:
            e.a.a.a.y0.j.t.x r6 = (e.a.a.a.y0.j.t.x) r6
            if (r6 == 0) goto L_0x01c3
            T r6 = r6.a
            java.lang.String r6 = (java.lang.String) r6
            if (r6 == 0) goto L_0x01c3
            e.a.a.a.y0.d.a.a0.j r7 = new e.a.a.a.y0.d.a.a0.j
            r7.<init>(r6)
            goto L_0x01d7
        L_0x01c3:
            e.a.a.a.y0.b.a1.h r6 = r1.k()
            e.a.a.a.y0.f.b r7 = e.a.a.a.y0.d.a.t.f8586n
            java.lang.String r10 = "JvmAnnotationNames.DEFAULT_NULL_FQ_NAME"
            e.x.c.i.d(r7, r10)
            boolean r6 = r6.x(r7)
            if (r6 == 0) goto L_0x01d6
            r7 = r0
            goto L_0x01d7
        L_0x01d6:
            r7 = 0
        L_0x01d7:
            boolean r6 = r7 instanceof e.a.a.a.y0.d.a.a0.j
            if (r6 == 0) goto L_0x038d
            e.a.a.a.y0.d.a.a0.j r7 = (e.a.a.a.y0.d.a.a0.j) r7
            java.lang.String r0 = r7.a
            java.lang.String r6 = "$this$lexicalCastFrom"
            e.x.c.i.e(r5, r6)
            java.lang.String r6 = "value"
            e.x.c.i.e(r0, r6)
            e.a.a.a.y0.m.v0 r7 = r5.W0()
            e.a.a.a.y0.b.h r7 = r7.d()
            boolean r10 = r7 instanceof e.a.a.a.y0.b.e
            if (r10 == 0) goto L_0x0227
            e.a.a.a.y0.b.e r7 = (e.a.a.a.y0.b.e) r7
            e.a.a.a.y0.b.f r10 = r7.i()
            e.a.a.a.y0.b.f r8 = e.a.a.a.y0.b.f.ENUM_CLASS
            if (r10 != r8) goto L_0x0227
            e.a.a.a.y0.j.y.i r5 = r7.v0()
            e.a.a.a.y0.f.d r0 = e.a.a.a.y0.f.d.l(r0)
            java.lang.String r6 = "Name.identifier(value)"
            e.x.c.i.d(r0, r6)
            e.a.a.a.y0.c.a.d r6 = e.a.a.a.y0.c.a.d.FROM_BACKEND
            e.a.a.a.y0.b.h r0 = r5.b(r0, r6)
            boolean r5 = r0 instanceof e.a.a.a.y0.b.e
            if (r5 == 0) goto L_0x0386
            e.a.a.a.y0.b.e r0 = (e.a.a.a.y0.b.e) r0
            e.a.a.a.y0.b.f r5 = r0.i()
            e.a.a.a.y0.b.f r6 = e.a.a.a.y0.b.f.ENUM_ENTRY
            if (r5 != r6) goto L_0x0386
            e.a.a.a.y0.d.a.j r5 = new e.a.a.a.y0.d.a.j
            r5.<init>(r0)
            goto L_0x0387
        L_0x0227:
            java.lang.String r7 = "$this$makeNotNullable"
            e.x.c.i.e(r5, r7)
            e.a.a.a.y0.m.d0 r5 = e.a.a.a.y0.m.f1.i(r5)
            java.lang.String r7 = "TypeUtils.makeNotNullable(this)"
            e.x.c.i.d(r5, r7)
            e.x.c.i.e(r0, r6)
            r6 = 2
            java.lang.String r7 = "0x"
            r8 = 0
            boolean r7 = e.c0.h.C(r0, r7, r8, r6)
            java.lang.String r10 = "(this as java.lang.String).substring(startIndex)"
            if (r7 != 0) goto L_0x0273
            java.lang.String r7 = "0X"
            boolean r7 = e.c0.h.C(r0, r7, r8, r6)
            if (r7 == 0) goto L_0x024d
            goto L_0x0273
        L_0x024d:
            java.lang.String r7 = "0b"
            boolean r7 = e.c0.h.C(r0, r7, r8, r6)
            if (r7 != 0) goto L_0x0266
            java.lang.String r7 = "0B"
            boolean r7 = e.c0.h.C(r0, r7, r8, r6)
            if (r7 == 0) goto L_0x025e
            goto L_0x0266
        L_0x025e:
            e.a.a.a.y0.o.j r6 = new e.a.a.a.y0.o.j
            r7 = 10
            r6.<init>(r0, r7)
            goto L_0x0282
        L_0x0266:
            e.a.a.a.y0.o.j r7 = new e.a.a.a.y0.o.j
            java.lang.String r8 = r0.substring(r6)
            e.x.c.i.d(r8, r10)
            r7.<init>(r8, r6)
            goto L_0x0281
        L_0x0273:
            e.a.a.a.y0.o.j r7 = new e.a.a.a.y0.o.j
            java.lang.String r6 = r0.substring(r6)
            e.x.c.i.d(r6, r10)
            r8 = 16
            r7.<init>(r6, r8)
        L_0x0281:
            r6 = r7
        L_0x0282:
            java.lang.String r7 = r6.a
            int r6 = r6.f9818b
            e.a.a.a.y0.a.g$d r8 = e.a.a.a.y0.a.g.f7647k     // Catch:{  }
            e.a.a.a.y0.f.c r10 = r8.f7656h     // Catch:{  }
            boolean r10 = e.a.a.a.y0.a.g.D(r5, r10)     // Catch:{  }
            if (r10 == 0) goto L_0x029a
            boolean r0 = java.lang.Boolean.parseBoolean(r0)     // Catch:{  }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{  }
            goto L_0x037e
        L_0x029a:
            e.a.a.a.y0.f.c r10 = r8.f7657i     // Catch:{  }
            boolean r10 = e.a.a.a.y0.a.g.D(r5, r10)     // Catch:{  }
            if (r10 == 0) goto L_0x02b9
            java.lang.String r5 = "$this$singleOrNull"
            e.x.c.i.e(r0, r5)     // Catch:{  }
            int r5 = r0.length()     // Catch:{  }
            r6 = 1
            if (r5 != r6) goto L_0x037d
            r10 = 0
            char r0 = r0.charAt(r10)     // Catch:{  }
            java.lang.Character r0 = java.lang.Character.valueOf(r0)     // Catch:{  }
            goto L_0x037e
        L_0x02b9:
            e.a.a.a.y0.f.c r10 = r8.f7658j     // Catch:{  }
            boolean r10 = e.a.a.a.y0.a.g.D(r5, r10)     // Catch:{  }
            if (r10 == 0) goto L_0x02e1
            java.lang.String r0 = "$this$toByteOrNull"
            e.x.c.i.e(r7, r0)     // Catch:{  }
            java.lang.Integer r0 = e.c0.h.L(r7, r6)     // Catch:{  }
            if (r0 == 0) goto L_0x037d
            int r0 = r0.intValue()     // Catch:{  }
            r5 = -128(0xffffffffffffff80, float:NaN)
            if (r0 < r5) goto L_0x037d
            r5 = 127(0x7f, float:1.78E-43)
            if (r0 <= r5) goto L_0x02da
            goto L_0x037d
        L_0x02da:
            byte r0 = (byte) r0     // Catch:{  }
            java.lang.Byte r0 = java.lang.Byte.valueOf(r0)     // Catch:{  }
            goto L_0x037e
        L_0x02e1:
            e.a.a.a.y0.f.c r10 = r8.f7659k     // Catch:{  }
            boolean r10 = e.a.a.a.y0.a.g.D(r5, r10)     // Catch:{  }
            if (r10 == 0) goto L_0x0309
            java.lang.String r0 = "$this$toShortOrNull"
            e.x.c.i.e(r7, r0)     // Catch:{  }
            java.lang.Integer r0 = e.c0.h.L(r7, r6)     // Catch:{  }
            if (r0 == 0) goto L_0x037d
            int r0 = r0.intValue()     // Catch:{  }
            r5 = -32768(0xffffffffffff8000, float:NaN)
            if (r0 < r5) goto L_0x037d
            r5 = 32767(0x7fff, float:4.5916E-41)
            if (r0 <= r5) goto L_0x0302
            goto L_0x037d
        L_0x0302:
            short r0 = (short) r0     // Catch:{  }
            java.lang.Short r0 = java.lang.Short.valueOf(r0)     // Catch:{  }
            goto L_0x037e
        L_0x0309:
            e.a.a.a.y0.f.c r10 = r8.f7660l     // Catch:{  }
            boolean r10 = e.a.a.a.y0.a.g.D(r5, r10)     // Catch:{  }
            if (r10 == 0) goto L_0x0317
            java.lang.Integer r0 = e.c0.h.L(r7, r6)     // Catch:{  }
            goto L_0x037e
        L_0x0317:
            e.a.a.a.y0.f.c r10 = r8.f7661m     // Catch:{  }
            boolean r10 = e.a.a.a.y0.a.g.D(r5, r10)     // Catch:{  }
            if (r10 == 0) goto L_0x0324
            java.lang.Long r0 = e.c0.h.M(r7, r6)     // Catch:{  }
            goto L_0x037e
        L_0x0324:
            e.a.a.a.y0.f.c r6 = r8.f7662n     // Catch:{  }
            boolean r6 = e.a.a.a.y0.a.g.C(r5, r6)     // Catch:{  }
            if (r6 == 0) goto L_0x0334
            boolean r6 = r5.X0()     // Catch:{  }
            if (r6 != 0) goto L_0x0334
            r6 = 1
            goto L_0x0335
        L_0x0334:
            r6 = 0
        L_0x0335:
            if (r6 == 0) goto L_0x034d
            java.lang.String r5 = "$this$toFloatOrNull"
            e.x.c.i.e(r0, r5)     // Catch:{  }
            e.c0.d r5 = e.c0.e.a     // Catch:{ IllegalArgumentException -> 0x037d }
            boolean r5 = r5.a(r0)     // Catch:{ IllegalArgumentException -> 0x037d }
            if (r5 == 0) goto L_0x037d
            float r0 = java.lang.Float.parseFloat(r0)     // Catch:{ IllegalArgumentException -> 0x037d }
            java.lang.Float r0 = java.lang.Float.valueOf(r0)     // Catch:{ IllegalArgumentException -> 0x037d }
            goto L_0x037e
        L_0x034d:
            e.a.a.a.y0.f.c r6 = r8.f7663o     // Catch:{  }
            boolean r6 = e.a.a.a.y0.a.g.C(r5, r6)     // Catch:{  }
            if (r6 == 0) goto L_0x035d
            boolean r6 = r5.X0()     // Catch:{  }
            if (r6 != 0) goto L_0x035d
            r6 = 1
            goto L_0x035e
        L_0x035d:
            r6 = 0
        L_0x035e:
            if (r6 == 0) goto L_0x0376
            java.lang.String r5 = "$this$toDoubleOrNull"
            e.x.c.i.e(r0, r5)     // Catch:{  }
            e.c0.d r5 = e.c0.e.a     // Catch:{ IllegalArgumentException -> 0x037d }
            boolean r5 = r5.a(r0)     // Catch:{ IllegalArgumentException -> 0x037d }
            if (r5 == 0) goto L_0x037d
            double r5 = java.lang.Double.parseDouble(r0)     // Catch:{ IllegalArgumentException -> 0x037d }
            java.lang.Double r0 = java.lang.Double.valueOf(r5)     // Catch:{ IllegalArgumentException -> 0x037d }
            goto L_0x037e
        L_0x0376:
            boolean r5 = e.a.a.a.y0.a.g.L(r5)     // Catch:{  }
            if (r5 == 0) goto L_0x037d
            goto L_0x037e
        L_0x037d:
            r0 = 0
        L_0x037e:
            if (r0 == 0) goto L_0x0386
            e.a.a.a.y0.d.a.h r5 = new e.a.a.a.y0.d.a.h
            r5.<init>(r0)
            goto L_0x0387
        L_0x0386:
            r5 = 0
        L_0x0387:
            if (r5 == 0) goto L_0x038b
            r0 = 1
            goto L_0x039e
        L_0x038b:
            r0 = 0
            goto L_0x039e
        L_0x038d:
            boolean r0 = e.x.c.i.a(r7, r0)
            if (r0 == 0) goto L_0x0398
            boolean r0 = e.a.a.a.y0.m.f1.b(r5)
            goto L_0x039e
        L_0x0398:
            if (r7 != 0) goto L_0x03d3
            boolean r0 = r1.k0()
        L_0x039e:
            if (r0 == 0) goto L_0x03ac
            java.util.Collection r0 = r1.g()
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x03ac
            r0 = 1
            goto L_0x03ad
        L_0x03ac:
            r0 = 0
        L_0x03ad:
            boolean r5 = r3.f8547b
            if (r5 != 0) goto L_0x03ba
            boolean r1 = r1.k0()
            if (r0 == r1) goto L_0x03b8
            goto L_0x03ba
        L_0x03b8:
            r1 = 0
            goto L_0x03bb
        L_0x03ba:
            r1 = 1
        L_0x03bb:
            e.a.a.a.y0.d.a.e0.l$c r5 = new e.a.a.a.y0.d.a.e0.l$c
            e.a.a.a.y0.m.d0 r6 = r3.a
            boolean r3 = r3.c
            r5.<init>(r6, r0, r1, r3)
            r15.add(r5)
            r7 = r19
            r8 = r20
            r0 = r17
            r6 = r18
            r10 = 10
            goto L_0x0147
        L_0x03d3:
            e.h r0 = new e.h
            r0.<init>()
            throw r0
        L_0x03d9:
            r18 = r6
            r3 = 1
            boolean r0 = r12 instanceof e.a.a.a.y0.b.f0
            if (r0 != 0) goto L_0x03e2
            r0 = 0
            goto L_0x03e3
        L_0x03e2:
            r0 = r12
        L_0x03e3:
            e.a.a.a.y0.b.f0 r0 = (e.a.a.a.y0.b.f0) r0
            if (r0 == 0) goto L_0x03f1
            boolean r0 = b.q.a.a.Q1(r0)
            r1 = 1
            if (r0 != r1) goto L_0x03f1
            e.a.a.a.y0.d.a.a$a r0 = e.a.a.a.y0.d.a.a.C0170a.FIELD
            goto L_0x03f3
        L_0x03f1:
            e.a.a.a.y0.d.a.a$a r0 = e.a.a.a.y0.d.a.a.C0170a.METHOD_RETURN_TYPE
        L_0x03f3:
            r5 = r0
            e.a.a.a.y0.d.a.e0.r r6 = e.a.a.a.y0.d.a.e0.r.f8559h
            r0 = r19
            r1 = r12
            r7 = 0
            r8 = r18
            e.a.a.a.y0.d.a.e0.l$b r0 = r0.d(r1, r2, r3, r4, r5, r6)
            if (r13 == 0) goto L_0x0405
            e.a.a.a.y0.d.a.e0.x r1 = r13.a
            goto L_0x0406
        L_0x0405:
            r1 = 0
        L_0x0406:
            e.a.a.a.y0.d.a.e0.l$a r0 = r0.a(r1)
            if (r8 == 0) goto L_0x0411
            boolean r1 = r8.c
            r2 = 1
            if (r1 == r2) goto L_0x0438
        L_0x0411:
            boolean r1 = r0.c
            if (r1 != 0) goto L_0x0438
            boolean r1 = r15.isEmpty()
            if (r1 == 0) goto L_0x041c
            goto L_0x0432
        L_0x041c:
            java.util.Iterator r1 = r15.iterator()
        L_0x0420:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0432
            java.lang.Object r2 = r1.next()
            e.a.a.a.y0.d.a.e0.l$c r2 = (e.a.a.a.y0.d.a.e0.l.c) r2
            boolean r2 = r2.c
            if (r2 == 0) goto L_0x0420
            r5 = 1
            goto L_0x0433
        L_0x0432:
            r5 = r7
        L_0x0433:
            if (r5 == 0) goto L_0x0436
            goto L_0x0438
        L_0x0436:
            r5 = r7
            goto L_0x0439
        L_0x0438:
            r5 = 1
        L_0x0439:
            if (r8 == 0) goto L_0x0441
            boolean r1 = r8.f8547b
            r2 = 1
            if (r1 == r2) goto L_0x046c
            goto L_0x0442
        L_0x0441:
            r2 = 1
        L_0x0442:
            boolean r1 = r0.f8547b
            if (r1 != 0) goto L_0x046c
            boolean r1 = r15.isEmpty()
            if (r1 == 0) goto L_0x044d
            goto L_0x0463
        L_0x044d:
            java.util.Iterator r1 = r15.iterator()
        L_0x0451:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x0463
            java.lang.Object r3 = r1.next()
            e.a.a.a.y0.d.a.e0.l$c r3 = (e.a.a.a.y0.d.a.e0.l.c) r3
            boolean r3 = r3.f8547b
            if (r3 == 0) goto L_0x0451
            r13 = r2
            goto L_0x0464
        L_0x0463:
            r13 = r7
        L_0x0464:
            if (r13 != 0) goto L_0x046c
            if (r5 == 0) goto L_0x0469
            goto L_0x046c
        L_0x0469:
            r4 = 10
            goto L_0x04b5
        L_0x046c:
            if (r5 == 0) goto L_0x047b
            e.a.a.a.y0.b.a$a<java.lang.Object> r1 = e.a.a.a.y0.j.u.a.a
            e.a.a.a.y0.d.a.i r2 = new e.a.a.a.y0.d.a.i
            r2.<init>(r12)
            e.j r3 = new e.j
            r3.<init>(r1, r2)
            goto L_0x047c
        L_0x047b:
            r3 = 0
        L_0x047c:
            if (r8 == 0) goto L_0x0481
            e.a.a.a.y0.m.d0 r1 = r8.a
            goto L_0x0482
        L_0x0481:
            r1 = 0
        L_0x0482:
            java.util.ArrayList r2 = new java.util.ArrayList
            r4 = 10
            int r5 = b.q.a.a.C(r15, r4)
            r2.<init>(r5)
            java.util.Iterator r5 = r15.iterator()
        L_0x0491:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x04aa
            java.lang.Object r6 = r5.next()
            e.a.a.a.y0.d.a.e0.l$c r6 = (e.a.a.a.y0.d.a.e0.l.c) r6
            e.a.a.a.y0.d.a.a0.k r7 = new e.a.a.a.y0.d.a.a0.k
            e.a.a.a.y0.m.d0 r8 = r6.a
            boolean r6 = r6.d
            r7.<init>(r8, r6)
            r2.add(r7)
            goto L_0x0491
        L_0x04aa:
            e.a.a.a.y0.m.d0 r0 = r0.a
            e.a.a.a.y0.d.a.a0.b r12 = r14.H(r1, r2, r0, r3)
            java.lang.String r0 = "null cannot be cast to non-null type D"
            java.util.Objects.requireNonNull(r12, r0)
        L_0x04b5:
            r9.add(r12)
            r7 = r19
            r8 = r20
            r10 = r4
            goto L_0x001f
        L_0x04bf:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: e.a.a.a.y0.d.a.e0.l.a(e.a.a.a.y0.d.a.b0.h, java.util.Collection):java.util.Collection");
    }

    public final h b(e.a.a.a.y0.b.a1.c cVar) {
        h c2;
        e.x.c.i.e(cVar, "annotationDescriptor");
        h c3 = c(cVar);
        if (c3 != null) {
            return c3;
        }
        e.a.a.a.y0.b.a1.c d = this.a.d(cVar);
        if (d == null) {
            return null;
        }
        e.a.a.a.y0.o.k b2 = this.a.b(cVar);
        Objects.requireNonNull(b2);
        if (!(b2 == e.a.a.a.y0.o.k.IGNORE) && (c2 = c(d)) != null) {
            return h.a(c2, (g) null, b2.d(), 1);
        }
        return null;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0074, code lost:
        if (r2.equals("NEVER") != false) goto L_0x007f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x007d, code lost:
        if (r2.equals("MAYBE") != false) goto L_0x007f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x007f, code lost:
        r0 = new e.a.a.a.y0.d.a.e0.h(r1, false);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final e.a.a.a.y0.d.a.e0.h c(e.a.a.a.y0.b.a1.c r8) {
        /*
            r7 = this;
            e.a.a.a.y0.d.a.e0.g r0 = e.a.a.a.y0.d.a.e0.g.NOT_NULL
            e.a.a.a.y0.d.a.e0.g r1 = e.a.a.a.y0.d.a.e0.g.NULLABLE
            e.a.a.a.y0.f.b r2 = r8.e()
            r3 = 0
            if (r2 == 0) goto L_0x00ea
            java.util.List<e.a.a.a.y0.f.b> r4 = e.a.a.a.y0.d.a.u.a
            boolean r4 = r4.contains(r2)
            r5 = 1
            r6 = 0
            if (r4 == 0) goto L_0x001c
            e.a.a.a.y0.d.a.e0.h r0 = new e.a.a.a.y0.d.a.e0.h
            r0.<init>(r1, r6)
            goto L_0x00d2
        L_0x001c:
            java.util.List<e.a.a.a.y0.f.b> r4 = e.a.a.a.y0.d.a.u.d
            boolean r4 = r4.contains(r2)
            if (r4 == 0) goto L_0x002c
            e.a.a.a.y0.d.a.e0.h r1 = new e.a.a.a.y0.d.a.e0.h
            r1.<init>(r0, r6)
        L_0x0029:
            r0 = r1
            goto L_0x00d2
        L_0x002c:
            e.a.a.a.y0.f.b r4 = e.a.a.a.y0.d.a.u.f8587b
            boolean r4 = e.x.c.i.a(r2, r4)
            if (r4 == 0) goto L_0x008b
            e.a.a.a.y0.j.t.g r2 = e.a.a.a.y0.j.v.b.b(r8)
            boolean r4 = r2 instanceof e.a.a.a.y0.j.t.k
            if (r4 != 0) goto L_0x003d
            r2 = r3
        L_0x003d:
            e.a.a.a.y0.j.t.k r2 = (e.a.a.a.y0.j.t.k) r2
            if (r2 == 0) goto L_0x0085
            e.a.a.a.y0.f.d r2 = r2.c
            java.lang.String r2 = r2.e()
            int r4 = r2.hashCode()
            switch(r4) {
                case 73135176: goto L_0x0077;
                case 74175084: goto L_0x006e;
                case 433141802: goto L_0x005e;
                case 1933739535: goto L_0x0050;
                default: goto L_0x004e;
            }
        L_0x004e:
            goto L_0x00d1
        L_0x0050:
            java.lang.String r1 = "ALWAYS"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x00d1
            e.a.a.a.y0.d.a.e0.h r1 = new e.a.a.a.y0.d.a.e0.h
            r1.<init>(r0, r6)
            goto L_0x0029
        L_0x005e:
            java.lang.String r0 = "UNKNOWN"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x00d1
            e.a.a.a.y0.d.a.e0.h r0 = new e.a.a.a.y0.d.a.e0.h
            e.a.a.a.y0.d.a.e0.g r1 = e.a.a.a.y0.d.a.e0.g.FORCE_FLEXIBILITY
            r0.<init>(r1, r6)
            goto L_0x00d2
        L_0x006e:
            java.lang.String r0 = "NEVER"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x00d1
            goto L_0x007f
        L_0x0077:
            java.lang.String r0 = "MAYBE"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x00d1
        L_0x007f:
            e.a.a.a.y0.d.a.e0.h r0 = new e.a.a.a.y0.d.a.e0.h
            r0.<init>(r1, r6)
            goto L_0x00d2
        L_0x0085:
            e.a.a.a.y0.d.a.e0.h r1 = new e.a.a.a.y0.d.a.e0.h
            r1.<init>(r0, r6)
            goto L_0x0029
        L_0x008b:
            e.a.a.a.y0.f.b r4 = e.a.a.a.y0.d.a.u.f8588e
            boolean r4 = e.x.c.i.a(r2, r4)
            if (r4 == 0) goto L_0x009f
            e.a.a.a.y0.o.i r4 = r7.f8546b
            boolean r4 = r4.f9817e
            if (r4 == 0) goto L_0x009f
            e.a.a.a.y0.d.a.e0.h r0 = new e.a.a.a.y0.d.a.e0.h
            r0.<init>(r1, r6)
            goto L_0x00d2
        L_0x009f:
            e.a.a.a.y0.f.b r4 = e.a.a.a.y0.d.a.u.f
            boolean r4 = e.x.c.i.a(r2, r4)
            if (r4 == 0) goto L_0x00b4
            e.a.a.a.y0.o.i r4 = r7.f8546b
            boolean r4 = r4.f9817e
            if (r4 == 0) goto L_0x00b4
            e.a.a.a.y0.d.a.e0.h r1 = new e.a.a.a.y0.d.a.e0.h
            r1.<init>(r0, r6)
            goto L_0x0029
        L_0x00b4:
            e.a.a.a.y0.f.b r4 = e.a.a.a.y0.d.a.u.f8590h
            boolean r4 = e.x.c.i.a(r2, r4)
            if (r4 == 0) goto L_0x00c3
            e.a.a.a.y0.d.a.e0.h r1 = new e.a.a.a.y0.d.a.e0.h
            r1.<init>(r0, r5)
            goto L_0x0029
        L_0x00c3:
            e.a.a.a.y0.f.b r0 = e.a.a.a.y0.d.a.u.f8589g
            boolean r0 = e.x.c.i.a(r2, r0)
            if (r0 == 0) goto L_0x00d1
            e.a.a.a.y0.d.a.e0.h r0 = new e.a.a.a.y0.d.a.e0.h
            r0.<init>(r1, r5)
            goto L_0x00d2
        L_0x00d1:
            r0 = r3
        L_0x00d2:
            if (r0 == 0) goto L_0x00ea
            boolean r1 = r0.f8509b
            if (r1 != 0) goto L_0x00e9
            boolean r1 = r8 instanceof e.a.a.a.y0.d.a.a0.i
            if (r1 == 0) goto L_0x00e9
            e.a.a.a.y0.d.a.a0.i r8 = (e.a.a.a.y0.d.a.a0.i) r8
            boolean r8 = r8.j()
            if (r8 == 0) goto L_0x00e9
            e.a.a.a.y0.d.a.e0.h r3 = e.a.a.a.y0.d.a.e0.h.a(r0, r3, r5, r5)
            goto L_0x00ea
        L_0x00e9:
            r3 = r0
        L_0x00ea:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: e.a.a.a.y0.d.a.e0.l.c(e.a.a.a.y0.b.a1.c):e.a.a.a.y0.d.a.e0.h");
    }

    public final b d(e.a.a.a.y0.b.b bVar, e.a.a.a.y0.b.a1.a aVar, boolean z, h hVar, a.C0170a aVar2, e.x.b.l<? super e.a.a.a.y0.b.b, ? extends d0> lVar) {
        d0 d0Var = (d0) lVar.invoke(bVar);
        Collection<? extends e.a.a.a.y0.b.b> g2 = bVar.g();
        e.x.c.i.d(g2, "this.overriddenDescriptors");
        ArrayList arrayList = new ArrayList(b.q.a.a.C(g2, 10));
        for (e.a.a.a.y0.b.b bVar2 : g2) {
            e.x.c.i.d(bVar2, "it");
            arrayList.add((d0) lVar.invoke(bVar2));
        }
        return new b(this, aVar, d0Var, arrayList, z, b.q.a.a.Q(hVar, ((d0) lVar.invoke(bVar)).k()), aVar2);
    }

    public final b e(e.a.a.a.y0.b.b bVar, w0 w0Var, h hVar, e.x.b.l<? super e.a.a.a.y0.b.b, ? extends d0> lVar) {
        if (w0Var != null) {
            hVar = b.q.a.a.Q(hVar, w0Var.k());
        }
        return d(bVar, w0Var, false, hVar, a.C0170a.VALUE_PARAMETER, lVar);
    }
}
