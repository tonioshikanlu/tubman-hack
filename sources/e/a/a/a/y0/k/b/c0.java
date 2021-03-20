package e.a.a.a.y0.k.b;

import e.a.a.a.y0.a.f;
import e.a.a.a.y0.b.a1.c;
import e.a.a.a.y0.b.h;
import e.a.a.a.y0.b.r0;
import e.a.a.a.y0.e.q;
import e.a.a.a.y0.e.s;
import e.a.a.a.y0.e.z.e;
import e.a.a.a.y0.f.d;
import e.a.a.a.y0.k.b.g0.m;
import e.a.a.a.y0.m.d0;
import e.a.a.a.y0.m.k0;
import e.a.a.a.y0.m.v0;
import e.t.g;
import e.t.o;
import e.t.p;
import e.x.b.l;
import e.x.c.i;
import e.x.c.k;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public final class c0 {
    public final l<Integer, h> a;

    /* renamed from: b  reason: collision with root package name */
    public final l<Integer, h> f9489b;
    public final Map<Integer, r0> c;
    public final l d;

    /* renamed from: e  reason: collision with root package name */
    public final c0 f9490e;
    public final String f;

    /* renamed from: g  reason: collision with root package name */
    public final String f9491g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f9492h;

    public static final class a extends k implements l<q, List<? extends q.b>> {

        /* renamed from: h  reason: collision with root package name */
        public final /* synthetic */ c0 f9493h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(c0 c0Var) {
            super(1);
            this.f9493h = c0Var;
        }

        /* renamed from: a */
        public final List<q.b> invoke(q qVar) {
            i.e(qVar, "$this$collectAllArguments");
            List<q.b> list = qVar.f9034k;
            i.d(list, "argumentList");
            q u2 = b.q.a.a.u2(qVar, this.f9493h.d.f);
            Iterable a = u2 != null ? invoke(u2) : null;
            if (a == null) {
                a = o.f7934h;
            }
            return g.I(list, a);
        }
    }

    public static final class b extends k implements e.x.b.a<List<? extends c>> {

        /* renamed from: h  reason: collision with root package name */
        public final /* synthetic */ c0 f9494h;

        /* renamed from: i  reason: collision with root package name */
        public final /* synthetic */ q f9495i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(c0 c0Var, q qVar) {
            super(0);
            this.f9494h = c0Var;
            this.f9495i = qVar;
        }

        public Object e() {
            l lVar = this.f9494h.d;
            return lVar.c.f.g(this.f9495i, lVar.d);
        }
    }

    public c0(l lVar, c0 c0Var, List list, String str, String str2, boolean z, int i2) {
        Map<Integer, r0> map;
        int i3 = 0;
        z = (i2 & 32) != 0 ? false : z;
        i.e(lVar, "c");
        i.e(list, "typeParameterProtos");
        i.e(str, "debugName");
        i.e(str2, "containerPresentableName");
        this.d = lVar;
        this.f9490e = c0Var;
        this.f = str;
        this.f9491g = str2;
        this.f9492h = z;
        this.a = lVar.c.f9570b.i(new b0(this));
        this.f9489b = lVar.c.f9570b.i(new d0(this));
        if (list.isEmpty()) {
            map = p.f7935h;
        } else {
            map = new LinkedHashMap<>();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                s sVar = (s) it.next();
                map.put(Integer.valueOf(sVar.f9085k), new m(this.d, sVar, i3));
                i3++;
            }
        }
        this.c = map;
    }

    public final k0 a(int i2) {
        if (b.q.a.a.D0(this.d.d, i2).c) {
            return this.d.c.f9573h.a();
        }
        return null;
    }

    public final k0 b(d0 d0Var, d0 d0Var2) {
        e.a.a.a.y0.a.g D = e.a.a.a.y0.m.o1.c.D(d0Var);
        e.a.a.a.y0.b.a1.h k2 = d0Var.k();
        d0 d2 = f.d(d0Var);
        List<T> l2 = g.l(f.f(d0Var), 1);
        ArrayList arrayList = new ArrayList(b.q.a.a.C(l2, 10));
        for (T d3 : l2) {
            arrayList.add(d3.d());
        }
        return f.a(D, k2, d2, arrayList, (List<d>) null, d0Var2, true).a1(d0Var.X0());
    }

    public final List<r0> c() {
        return g.W(this.c.values());
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0020  */
    /* JADX WARNING: Removed duplicated region for block: B:160:0x038d  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0129  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0137  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x001f A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final e.a.a.a.y0.m.k0 d(e.a.a.a.y0.e.q r14, boolean r15) {
        /*
            r13 = this;
            java.lang.String r0 = "proto"
            e.x.c.i.e(r14, r0)
            boolean r0 = r14.u()
            r1 = 0
            if (r0 == 0) goto L_0x000f
            int r0 = r14.f9039p
            goto L_0x0017
        L_0x000f:
            boolean r0 = r14.x()
            if (r0 == 0) goto L_0x001c
            int r0 = r14.s
        L_0x0017:
            e.a.a.a.y0.m.k0 r0 = r13.a(r0)
            goto L_0x001d
        L_0x001c:
            r0 = r1
        L_0x001d:
            if (r0 == 0) goto L_0x0020
            return r0
        L_0x0020:
            e.a.a.a.y0.k.b.e0 r0 = new e.a.a.a.y0.k.b.e0
            r0.<init>(r13, r14)
            boolean r2 = r14.u()
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L_0x004c
            e.x.b.l<java.lang.Integer, e.a.a.a.y0.b.h> r2 = r13.a
            int r5 = r14.f9039p
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            java.lang.Object r2 = r2.invoke(r5)
            e.a.a.a.y0.b.h r2 = (e.a.a.a.y0.b.h) r2
            if (r2 == 0) goto L_0x003e
            goto L_0x0044
        L_0x003e:
            int r2 = r14.f9039p
            e.a.a.a.y0.b.e r2 = r0.a(r2)
        L_0x0044:
            e.a.a.a.y0.m.v0 r0 = r2.p()
            java.lang.String r2 = "(classifierDescriptors(p…assName)).typeConstructor"
            goto L_0x011c
        L_0x004c:
            int r2 = r14.f9033j
            r5 = r2 & 32
            r6 = 32
            if (r5 != r6) goto L_0x0056
            r5 = r4
            goto L_0x0057
        L_0x0056:
            r5 = r3
        L_0x0057:
            if (r5 == 0) goto L_0x0089
            int r0 = r14.f9040q
            e.a.a.a.y0.m.v0 r0 = r13.f(r0)
            if (r0 == 0) goto L_0x0063
            goto L_0x011f
        L_0x0063:
            java.lang.String r0 = "Unknown type parameter "
            java.lang.StringBuilder r0 = b.e.a.a.a.y(r0)
            int r2 = r14.f9040q
            r0.append(r2)
            java.lang.String r2 = ". Please try recompiling module containing \""
            r0.append(r2)
            java.lang.String r2 = r13.f9491g
            r0.append(r2)
            r2 = 34
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            e.a.a.a.y0.m.v0 r0 = e.a.a.a.y0.m.w.e(r0)
            java.lang.String r2 = "ErrorUtils.createErrorTy…\\\"\"\n                    )"
            goto L_0x011c
        L_0x0089:
            r5 = 64
            r2 = r2 & r5
            if (r2 != r5) goto L_0x0090
            r2 = r4
            goto L_0x0091
        L_0x0090:
            r2 = r3
        L_0x0091:
            if (r2 == 0) goto L_0x00f0
            e.a.a.a.y0.k.b.l r0 = r13.d
            e.a.a.a.y0.b.k r2 = r0.f9584e
            e.a.a.a.y0.e.z.c r0 = r0.d
            int r5 = r14.r
            java.lang.String r0 = r0.a(r5)
            java.util.List r5 = r13.c()
            java.util.Iterator r5 = r5.iterator()
        L_0x00a7:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x00c3
            java.lang.Object r6 = r5.next()
            r7 = r6
            e.a.a.a.y0.b.r0 r7 = (e.a.a.a.y0.b.r0) r7
            e.a.a.a.y0.f.d r7 = r7.getName()
            java.lang.String r7 = r7.e()
            boolean r7 = e.x.c.i.a(r7, r0)
            if (r7 == 0) goto L_0x00a7
            goto L_0x00c4
        L_0x00c3:
            r6 = r1
        L_0x00c4:
            e.a.a.a.y0.b.r0 r6 = (e.a.a.a.y0.b.r0) r6
            if (r6 == 0) goto L_0x00d0
            e.a.a.a.y0.m.v0 r5 = r6.p()
            if (r5 == 0) goto L_0x00d0
            r0 = r5
            goto L_0x00ed
        L_0x00d0:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "Deserialized type parameter "
            r5.append(r6)
            r5.append(r0)
            java.lang.String r0 = " in "
            r5.append(r0)
            r5.append(r2)
            java.lang.String r0 = r5.toString()
            e.a.a.a.y0.m.v0 r0 = e.a.a.a.y0.m.w.e(r0)
        L_0x00ed:
            java.lang.String r2 = "parameter?.typeConstruct…ter $name in $container\")"
            goto L_0x011c
        L_0x00f0:
            boolean r2 = r14.x()
            if (r2 == 0) goto L_0x0114
            e.x.b.l<java.lang.Integer, e.a.a.a.y0.b.h> r2 = r13.f9489b
            int r5 = r14.s
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            java.lang.Object r2 = r2.invoke(r5)
            e.a.a.a.y0.b.h r2 = (e.a.a.a.y0.b.h) r2
            if (r2 == 0) goto L_0x0107
            goto L_0x010d
        L_0x0107:
            int r2 = r14.s
            e.a.a.a.y0.b.e r2 = r0.a(r2)
        L_0x010d:
            e.a.a.a.y0.m.v0 r0 = r2.p()
            java.lang.String r2 = "(typeAliasDescriptors(pr…iasName)).typeConstructor"
            goto L_0x011c
        L_0x0114:
            java.lang.String r0 = "Unknown type"
            e.a.a.a.y0.m.v0 r0 = e.a.a.a.y0.m.w.e(r0)
            java.lang.String r2 = "ErrorUtils.createErrorTy…nstructor(\"Unknown type\")"
        L_0x011c:
            e.x.c.i.d(r0, r2)
        L_0x011f:
            e.a.a.a.y0.b.h r2 = r0.d()
            boolean r2 = e.a.a.a.y0.m.w.j(r2)
            if (r2 == 0) goto L_0x0137
            java.lang.String r14 = r0.toString()
            e.a.a.a.y0.m.k0 r14 = e.a.a.a.y0.m.w.h(r14, r0)
            java.lang.String r15 = "ErrorUtils.createErrorTy….toString(), constructor)"
            e.x.c.i.d(r14, r15)
            return r14
        L_0x0137:
            e.a.a.a.y0.k.b.g0.a r5 = new e.a.a.a.y0.k.b.g0.a
            e.a.a.a.y0.k.b.l r2 = r13.d
            e.a.a.a.y0.k.b.j r2 = r2.c
            e.a.a.a.y0.l.m r2 = r2.f9570b
            e.a.a.a.y0.k.b.c0$b r6 = new e.a.a.a.y0.k.b.c0$b
            r6.<init>(r13, r14)
            r5.<init>(r2, r6)
            e.a.a.a.y0.k.b.c0$a r2 = new e.a.a.a.y0.k.b.c0$a
            r2.<init>(r13)
            java.util.List r2 = r2.invoke(r14)
            java.util.ArrayList r6 = new java.util.ArrayList
            r7 = 10
            int r7 = b.q.a.a.C(r2, r7)
            r6.<init>(r7)
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            java.util.Iterator r2 = r2.iterator()
            r7 = r3
        L_0x0162:
            boolean r8 = r2.hasNext()
            java.lang.String r11 = "typeTable"
            if (r8 == 0) goto L_0x022b
            java.lang.Object r8 = r2.next()
            int r9 = r7 + 1
            if (r7 < 0) goto L_0x0227
            e.a.a.a.y0.e.q$b r8 = (e.a.a.a.y0.e.q.b) r8
            java.util.List r10 = r0.g()
            java.lang.String r12 = "constructor.parameters"
            e.x.c.i.d(r10, r12)
            java.lang.Object r7 = e.t.g.t(r10, r7)
            e.a.a.a.y0.b.r0 r7 = (e.a.a.a.y0.b.r0) r7
            e.a.a.a.y0.e.q$b$c r10 = r8.f9045j
            e.a.a.a.y0.e.q$b$c r12 = e.a.a.a.y0.e.q.b.c.STAR
            if (r10 != r12) goto L_0x01a4
            if (r7 != 0) goto L_0x019c
            e.a.a.a.y0.m.o0 r7 = new e.a.a.a.y0.m.o0
            e.a.a.a.y0.k.b.l r8 = r13.d
            e.a.a.a.y0.k.b.j r8 = r8.c
            e.a.a.a.y0.b.w r8 = r8.c
            e.a.a.a.y0.a.g r8 = r8.v()
            r7.<init>(r8)
            goto L_0x0221
        L_0x019c:
            e.a.a.a.y0.m.p0 r8 = new e.a.a.a.y0.m.p0
            r8.<init>(r7)
            r7 = r8
            goto L_0x0221
        L_0x01a4:
            java.lang.String r7 = "typeArgumentProto.projection"
            e.x.c.i.d(r10, r7)
            java.lang.String r7 = "projection"
            e.x.c.i.e(r10, r7)
            int r7 = r10.ordinal()
            if (r7 == 0) goto L_0x01df
            if (r7 == r4) goto L_0x01dc
            r12 = 2
            if (r7 == r12) goto L_0x01d9
            r14 = 3
            if (r7 == r14) goto L_0x01c2
            e.h r14 = new e.h
            r14.<init>()
            throw r14
        L_0x01c2:
            java.lang.IllegalArgumentException r14 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
            java.lang.String r0 = "Only IN, OUT and INV are supported. Actual argument: "
            r15.append(r0)
            r15.append(r10)
            java.lang.String r15 = r15.toString()
            r14.<init>(r15)
            throw r14
        L_0x01d9:
            e.a.a.a.y0.m.j1 r7 = e.a.a.a.y0.m.j1.INVARIANT
            goto L_0x01e1
        L_0x01dc:
            e.a.a.a.y0.m.j1 r7 = e.a.a.a.y0.m.j1.OUT_VARIANCE
            goto L_0x01e1
        L_0x01df:
            e.a.a.a.y0.m.j1 r7 = e.a.a.a.y0.m.j1.IN_VARIANCE
        L_0x01e1:
            e.a.a.a.y0.k.b.l r10 = r13.d
            e.a.a.a.y0.e.z.e r10 = r10.f
            java.lang.String r12 = "$this$type"
            e.x.c.i.e(r8, r12)
            e.x.c.i.e(r10, r11)
            boolean r11 = r8.j()
            if (r11 == 0) goto L_0x01f6
            e.a.a.a.y0.e.q r8 = r8.f9046k
            goto L_0x0209
        L_0x01f6:
            int r11 = r8.f9044i
            r12 = 4
            r11 = r11 & r12
            if (r11 != r12) goto L_0x01fe
            r11 = r4
            goto L_0x01ff
        L_0x01fe:
            r11 = r3
        L_0x01ff:
            if (r11 == 0) goto L_0x0208
            int r8 = r8.f9047l
            e.a.a.a.y0.e.q r8 = r10.a(r8)
            goto L_0x0209
        L_0x0208:
            r8 = r1
        L_0x0209:
            if (r8 == 0) goto L_0x0216
            e.a.a.a.y0.m.a1 r10 = new e.a.a.a.y0.m.a1
            e.a.a.a.y0.m.d0 r8 = r13.e(r8)
            r10.<init>(r7, r8)
            r7 = r10
            goto L_0x0221
        L_0x0216:
            e.a.a.a.y0.m.a1 r7 = new e.a.a.a.y0.m.a1
            java.lang.String r8 = "No type recorded"
            e.a.a.a.y0.m.k0 r8 = e.a.a.a.y0.m.w.d(r8)
            r7.<init>(r8)
        L_0x0221:
            r6.add(r7)
            r7 = r9
            goto L_0x0162
        L_0x0227:
            e.t.g.S()
            throw r1
        L_0x022b:
            java.util.List r2 = e.t.g.W(r6)
            e.a.a.a.y0.b.h r6 = r0.d()
            if (r15 == 0) goto L_0x0289
            boolean r15 = r6 instanceof e.a.a.a.y0.b.q0
            if (r15 == 0) goto L_0x0289
            e.a.a.a.y0.m.e0 r15 = e.a.a.a.y0.m.e0.a
            e.a.a.a.y0.b.q0 r6 = (e.a.a.a.y0.b.q0) r6
            e.a.a.a.y0.m.k0 r15 = e.a.a.a.y0.m.e0.b(r6, r2)
            java.lang.String r0 = "$this$isNullable"
            e.x.c.i.e(r15, r0)
            boolean r0 = e.a.a.a.y0.m.f1.g(r15)
            if (r0 != 0) goto L_0x0253
            boolean r0 = r14.f9035l
            if (r0 == 0) goto L_0x0251
            goto L_0x0253
        L_0x0251:
            r0 = r3
            goto L_0x0254
        L_0x0253:
            r0 = r4
        L_0x0254:
            e.a.a.a.y0.m.k0 r0 = r15.a1(r0)
            e.a.a.a.y0.b.a1.h$a r2 = e.a.a.a.y0.b.a1.h.f7785e
            e.a.a.a.y0.b.a1.h r15 = r15.k()
            java.lang.String r6 = "$this$plus"
            e.x.c.i.e(r5, r6)
            java.lang.String r6 = "elements"
            e.x.c.i.e(r15, r6)
            boolean r6 = r5 instanceof java.util.Collection
            if (r6 == 0) goto L_0x0273
            java.util.Collection r5 = (java.util.Collection) r5
            java.util.List r15 = e.t.g.I(r5, r15)
            goto L_0x027f
        L_0x0273:
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            e.t.g.b(r6, r5)
            e.t.g.b(r6, r15)
            r15 = r6
        L_0x027f:
            e.a.a.a.y0.b.a1.h r15 = r2.a(r15)
            e.a.a.a.y0.m.k0 r15 = r0.e1(r15)
            goto L_0x03b3
        L_0x0289:
            e.a.a.a.y0.e.z.b$b r15 = e.a.a.a.y0.e.z.b.a
            int r6 = r14.x
            java.lang.String r7 = "Flags.SUSPEND_TYPE.get(proto.flags)"
            boolean r15 = b.e.a.a.a.N(r15, r6, r7)
            if (r15 == 0) goto L_0x03a8
            boolean r8 = r14.f9035l
            java.util.List r15 = r0.g()
            int r15 = r15.size()
            int r6 = r2.size()
            int r15 = r15 - r6
            if (r15 == 0) goto L_0x02d1
            if (r15 == r4) goto L_0x02aa
            goto L_0x0389
        L_0x02aa:
            int r15 = r2.size()
            int r15 = r15 - r4
            if (r15 < 0) goto L_0x0389
            e.a.a.a.y0.a.g r6 = r0.v()
            e.a.a.a.y0.b.e r15 = r6.x(r15)
            java.lang.String r6 = "functionTypeConstructor.…getSuspendFunction(arity)"
            e.x.c.i.d(r15, r6)
            e.a.a.a.y0.m.v0 r6 = r15.p()
            java.lang.String r15 = "functionTypeConstructor.…on(arity).typeConstructor"
            e.x.c.i.d(r6, r15)
            r9 = 0
            r10 = 16
            r7 = r2
            e.a.a.a.y0.m.k0 r15 = e.a.a.a.y0.m.e0.g(r5, r6, r7, r8, r9, r10)
            goto L_0x038a
        L_0x02d1:
            r9 = 0
            r10 = 16
            r6 = r0
            r7 = r2
            e.a.a.a.y0.m.k0 r15 = e.a.a.a.y0.m.e0.g(r5, r6, r7, r8, r9, r10)
            java.lang.String r5 = "$this$isFunctionType"
            e.x.c.i.e(r15, r5)
            e.a.a.a.y0.m.v0 r5 = r15.W0()
            e.a.a.a.y0.b.h r5 = r5.d()
            if (r5 == 0) goto L_0x02ee
            e.a.a.a.y0.a.o.b$c r5 = e.a.a.a.y0.a.f.c(r5)
            goto L_0x02ef
        L_0x02ee:
            r5 = r1
        L_0x02ef:
            e.a.a.a.y0.a.o.b$c r6 = e.a.a.a.y0.a.o.b.c.Function
            if (r5 != r6) goto L_0x02f5
            r5 = r4
            goto L_0x02f6
        L_0x02f5:
            r5 = r3
        L_0x02f6:
            if (r5 != 0) goto L_0x02fa
            goto L_0x0389
        L_0x02fa:
            e.a.a.a.y0.k.b.l r5 = r13.d
            e.a.a.a.y0.k.b.j r5 = r5.c
            e.a.a.a.y0.k.b.k r5 = r5.d
            boolean r5 = r5.e()
            java.util.List r6 = e.a.a.a.y0.a.f.f(r15)
            java.lang.Object r6 = e.t.g.A(r6)
            e.a.a.a.y0.m.y0 r6 = (e.a.a.a.y0.m.y0) r6
            if (r6 == 0) goto L_0x0389
            e.a.a.a.y0.m.d0 r6 = r6.d()
            if (r6 == 0) goto L_0x0389
            java.lang.String r7 = "funType.getValueParamete…ll()?.type ?: return null"
            e.x.c.i.d(r6, r7)
            e.a.a.a.y0.m.v0 r7 = r6.W0()
            e.a.a.a.y0.b.h r7 = r7.d()
            if (r7 == 0) goto L_0x032a
            e.a.a.a.y0.f.b r7 = e.a.a.a.y0.j.v.b.h(r7)
            goto L_0x032b
        L_0x032a:
            r7 = r1
        L_0x032b:
            java.util.List r8 = r6.V0()
            int r8 = r8.size()
            if (r8 != r4) goto L_0x038a
            boolean r8 = e.a.a.a.y0.a.l.a(r7, r4)
            if (r8 != 0) goto L_0x0342
            boolean r8 = e.a.a.a.y0.a.l.a(r7, r3)
            if (r8 != 0) goto L_0x0342
            goto L_0x038a
        L_0x0342:
            java.util.List r6 = r6.V0()
            java.lang.Object r6 = e.t.g.O(r6)
            e.a.a.a.y0.m.y0 r6 = (e.a.a.a.y0.m.y0) r6
            e.a.a.a.y0.m.d0 r6 = r6.d()
            java.lang.String r8 = "continuationArgumentType.arguments.single().type"
            e.x.c.i.d(r6, r8)
            e.a.a.a.y0.k.b.l r8 = r13.d
            e.a.a.a.y0.b.k r8 = r8.f9584e
            boolean r9 = r8 instanceof e.a.a.a.y0.b.a
            if (r9 != 0) goto L_0x035e
            r8 = r1
        L_0x035e:
            e.a.a.a.y0.b.a r8 = (e.a.a.a.y0.b.a) r8
            if (r8 == 0) goto L_0x0367
            e.a.a.a.y0.f.b r8 = e.a.a.a.y0.j.v.b.d(r8)
            goto L_0x0368
        L_0x0367:
            r8 = r1
        L_0x0368:
            e.a.a.a.y0.f.b r9 = e.a.a.a.y0.k.b.a0.a
            boolean r8 = e.x.c.i.a(r8, r9)
            if (r8 == 0) goto L_0x0371
            goto L_0x0384
        L_0x0371:
            boolean r8 = r13.f9492h
            if (r8 != 0) goto L_0x0381
            if (r5 == 0) goto L_0x037f
            r5 = r5 ^ r4
            boolean r5 = e.a.a.a.y0.a.l.a(r7, r5)
            if (r5 == 0) goto L_0x037f
            goto L_0x0381
        L_0x037f:
            r5 = r3
            goto L_0x0382
        L_0x0381:
            r5 = r4
        L_0x0382:
            r13.f9492h = r5
        L_0x0384:
            e.a.a.a.y0.m.k0 r15 = r13.b(r15, r6)
            goto L_0x038a
        L_0x0389:
            r15 = r1
        L_0x038a:
            if (r15 == 0) goto L_0x038d
            goto L_0x03b3
        L_0x038d:
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
            java.lang.String r5 = "Bad suspend function in metadata with constructor: "
            r15.append(r5)
            r15.append(r0)
            java.lang.String r15 = r15.toString()
            e.a.a.a.y0.m.k0 r15 = e.a.a.a.y0.m.w.g(r15, r2)
            java.lang.String r0 = "ErrorUtils.createErrorTy…      arguments\n        )"
            e.x.c.i.d(r15, r0)
            goto L_0x03b3
        L_0x03a8:
            boolean r8 = r14.f9035l
            r9 = 0
            r10 = 16
            r6 = r0
            r7 = r2
            e.a.a.a.y0.m.k0 r15 = e.a.a.a.y0.m.e0.g(r5, r6, r7, r8, r9, r10)
        L_0x03b3:
            e.a.a.a.y0.k.b.l r0 = r13.d
            e.a.a.a.y0.e.z.e r0 = r0.f
            java.lang.String r2 = "$this$abbreviatedType"
            e.x.c.i.e(r14, r2)
            e.x.c.i.e(r0, r11)
            boolean r2 = r14.t()
            if (r2 == 0) goto L_0x03c8
            e.a.a.a.y0.e.q r1 = r14.v
            goto L_0x03d9
        L_0x03c8:
            int r2 = r14.f9033j
            r5 = 2048(0x800, float:2.87E-42)
            r2 = r2 & r5
            if (r2 != r5) goto L_0x03d0
            goto L_0x03d1
        L_0x03d0:
            r4 = r3
        L_0x03d1:
            if (r4 == 0) goto L_0x03d9
            int r1 = r14.w
            e.a.a.a.y0.e.q r1 = r0.a(r1)
        L_0x03d9:
            if (r1 == 0) goto L_0x03e3
            e.a.a.a.y0.m.k0 r0 = r13.d(r1, r3)
            e.a.a.a.y0.m.k0 r15 = e.a.a.a.y0.m.n0.c(r15, r0)
        L_0x03e3:
            boolean r0 = r14.u()
            if (r0 == 0) goto L_0x03fe
            e.a.a.a.y0.k.b.l r0 = r13.d
            e.a.a.a.y0.e.z.c r0 = r0.d
            int r14 = r14.f9039p
            e.a.a.a.y0.f.a r14 = b.q.a.a.D0(r0, r14)
            e.a.a.a.y0.k.b.l r0 = r13.d
            e.a.a.a.y0.k.b.j r0 = r0.c
            e.a.a.a.y0.b.b1.e r0 = r0.t
            e.a.a.a.y0.m.k0 r14 = r0.a(r14, r15)
            return r14
        L_0x03fe:
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: e.a.a.a.y0.k.b.c0.d(e.a.a.a.y0.e.q, boolean):e.a.a.a.y0.m.k0");
    }

    public final d0 e(q qVar) {
        q qVar2;
        i.e(qVar, "proto");
        boolean z = false;
        if (!((qVar.f9033j & 2) == 2)) {
            return d(qVar, true);
        }
        String a2 = this.d.d.a(qVar.f9036m);
        k0 d2 = d(qVar, true);
        e eVar = this.d.f;
        i.e(qVar, "$this$flexibleUpperBound");
        i.e(eVar, "typeTable");
        if (qVar.v()) {
            qVar2 = qVar.f9037n;
        } else {
            if ((qVar.f9033j & 8) == 8) {
                z = true;
            }
            qVar2 = z ? eVar.a(qVar.f9038o) : null;
        }
        i.c(qVar2);
        return this.d.c.f9576k.a(qVar, a2, d2, d(qVar2, true));
    }

    public final v0 f(int i2) {
        v0 p2;
        r0 r0Var = this.c.get(Integer.valueOf(i2));
        if (r0Var != null && (p2 = r0Var.p()) != null) {
            return p2;
        }
        c0 c0Var = this.f9490e;
        if (c0Var != null) {
            return c0Var.f(i2);
        }
        return null;
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(this.f);
        if (this.f9490e == null) {
            str = "";
        } else {
            StringBuilder y = b.e.a.a.a.y(". Child of ");
            y.append(this.f9490e.f);
            str = y.toString();
        }
        sb.append(str);
        return sb.toString();
    }
}
