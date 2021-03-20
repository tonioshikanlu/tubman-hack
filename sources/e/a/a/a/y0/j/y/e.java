package e.a.a.a.y0.j.y;

import e.a.a.a.y0.b.f0;
import e.a.a.a.y0.b.l0;
import e.a.a.a.y0.b.s;
import e.a.a.a.y0.c.a.b;
import e.a.a.a.y0.f.d;
import e.a.a.a.y0.l.i;
import e.a.a.a.y0.l.m;
import e.a.l;
import e.t.o;
import e.x.c.k;
import e.x.c.q;
import e.x.c.v;
import java.util.Collection;
import java.util.List;

public abstract class e extends j {
    public static final /* synthetic */ l[] d = {v.c(new q(v.a(e.class), "allDescriptors", "getAllDescriptors()Ljava/util/List;"))};

    /* renamed from: b  reason: collision with root package name */
    public final i f9452b;
    public final e.a.a.a.y0.b.e c;

    public static final class a extends k implements e.x.b.a<List<? extends e.a.a.a.y0.b.k>> {

        /* renamed from: h  reason: collision with root package name */
        public final /* synthetic */ e f9453h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(e eVar) {
            super(0);
            this.f9453h = eVar;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v4, resolved type: e.t.o} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v7, resolved type: java.util.ArrayList} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v13, resolved type: e.t.o} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v14, resolved type: e.t.o} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object e() {
            /*
                r12 = this;
                e.a.a.a.y0.j.y.e r0 = r12.f9453h
                java.util.List r0 = r0.h()
                e.a.a.a.y0.j.y.e r1 = r12.f9453h
                java.util.Objects.requireNonNull(r1)
                java.util.ArrayList r2 = new java.util.ArrayList
                r3 = 3
                r2.<init>(r3)
                e.a.a.a.y0.b.e r4 = r1.c
                e.a.a.a.y0.m.v0 r4 = r4.p()
                java.lang.String r5 = "containingClass.typeConstructor"
                e.x.c.i.d(r4, r5)
                java.util.Collection r4 = r4.h()
                java.lang.String r5 = "containingClass.typeConstructor.supertypes"
                e.x.c.i.d(r4, r5)
                java.util.ArrayList r5 = new java.util.ArrayList
                r5.<init>()
                java.util.Iterator r4 = r4.iterator()
            L_0x002e:
                boolean r6 = r4.hasNext()
                if (r6 == 0) goto L_0x0047
                java.lang.Object r6 = r4.next()
                e.a.a.a.y0.m.d0 r6 = (e.a.a.a.y0.m.d0) r6
                e.a.a.a.y0.j.y.i r6 = r6.z()
                r7 = 0
                java.util.Collection r6 = b.q.a.a.E0(r6, r7, r7, r3, r7)
                e.t.g.b(r5, r6)
                goto L_0x002e
            L_0x0047:
                java.util.ArrayList r3 = new java.util.ArrayList
                r3.<init>()
                java.util.Iterator r4 = r5.iterator()
            L_0x0050:
                boolean r5 = r4.hasNext()
                if (r5 == 0) goto L_0x0062
                java.lang.Object r5 = r4.next()
                boolean r6 = r5 instanceof e.a.a.a.y0.b.b
                if (r6 == 0) goto L_0x0050
                r3.add(r5)
                goto L_0x0050
            L_0x0062:
                java.util.LinkedHashMap r4 = new java.util.LinkedHashMap
                r4.<init>()
                java.util.Iterator r3 = r3.iterator()
            L_0x006b:
                boolean r5 = r3.hasNext()
                if (r5 == 0) goto L_0x0090
                java.lang.Object r5 = r3.next()
                r6 = r5
                e.a.a.a.y0.b.b r6 = (e.a.a.a.y0.b.b) r6
                e.a.a.a.y0.f.d r6 = r6.getName()
                java.lang.Object r7 = r4.get(r6)
                if (r7 != 0) goto L_0x008a
                java.util.ArrayList r7 = new java.util.ArrayList
                r7.<init>()
                r4.put(r6, r7)
            L_0x008a:
                java.util.List r7 = (java.util.List) r7
                r7.add(r5)
                goto L_0x006b
            L_0x0090:
                java.util.Set r3 = r4.entrySet()
                java.util.Iterator r3 = r3.iterator()
            L_0x0098:
                boolean r4 = r3.hasNext()
                if (r4 == 0) goto L_0x013c
                java.lang.Object r4 = r3.next()
                java.util.Map$Entry r4 = (java.util.Map.Entry) r4
                java.lang.Object r5 = r4.getKey()
                e.a.a.a.y0.f.d r5 = (e.a.a.a.y0.f.d) r5
                java.lang.Object r4 = r4.getValue()
                java.util.List r4 = (java.util.List) r4
                java.util.LinkedHashMap r6 = new java.util.LinkedHashMap
                r6.<init>()
                java.util.Iterator r4 = r4.iterator()
            L_0x00b9:
                boolean r7 = r4.hasNext()
                if (r7 == 0) goto L_0x00e0
                java.lang.Object r7 = r4.next()
                r8 = r7
                e.a.a.a.y0.b.b r8 = (e.a.a.a.y0.b.b) r8
                boolean r8 = r8 instanceof e.a.a.a.y0.b.s
                java.lang.Boolean r8 = java.lang.Boolean.valueOf(r8)
                java.lang.Object r9 = r6.get(r8)
                if (r9 != 0) goto L_0x00da
                java.util.ArrayList r9 = new java.util.ArrayList
                r9.<init>()
                r6.put(r8, r9)
            L_0x00da:
                java.util.List r9 = (java.util.List) r9
                r9.add(r7)
                goto L_0x00b9
            L_0x00e0:
                java.util.Set r4 = r6.entrySet()
                java.util.Iterator r4 = r4.iterator()
            L_0x00e8:
                boolean r6 = r4.hasNext()
                if (r6 == 0) goto L_0x0098
                java.lang.Object r6 = r4.next()
                java.util.Map$Entry r6 = (java.util.Map.Entry) r6
                java.lang.Object r7 = r6.getKey()
                java.lang.Boolean r7 = (java.lang.Boolean) r7
                boolean r7 = r7.booleanValue()
                java.lang.Object r6 = r6.getValue()
                r8 = r6
                java.util.List r8 = (java.util.List) r8
                e.a.a.a.y0.j.l r6 = e.a.a.a.y0.j.l.d
                if (r7 == 0) goto L_0x012d
                java.util.ArrayList r7 = new java.util.ArrayList
                r7.<init>()
                java.util.Iterator r9 = r0.iterator()
            L_0x0112:
                boolean r10 = r9.hasNext()
                if (r10 == 0) goto L_0x012f
                java.lang.Object r10 = r9.next()
                r11 = r10
                e.a.a.a.y0.b.s r11 = (e.a.a.a.y0.b.s) r11
                e.a.a.a.y0.f.d r11 = r11.getName()
                boolean r11 = e.x.c.i.a(r11, r5)
                if (r11 == 0) goto L_0x0112
                r7.add(r10)
                goto L_0x0112
            L_0x012d:
                e.t.o r7 = e.t.o.f7934h
            L_0x012f:
                r9 = r7
                e.a.a.a.y0.b.e r10 = r1.c
                e.a.a.a.y0.j.y.f r11 = new e.a.a.a.y0.j.y.f
                r11.<init>(r1, r2)
                r7 = r5
                r6.h(r7, r8, r9, r10, r11)
                goto L_0x00e8
            L_0x013c:
                java.util.List r1 = e.a.a.a.y0.m.o1.c.r(r2)
                java.util.List r0 = e.t.g.I(r0, r1)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: e.a.a.a.y0.j.y.e.a.e():java.lang.Object");
        }
    }

    public e(m mVar, e.a.a.a.y0.b.e eVar) {
        e.x.c.i.e(mVar, "storageManager");
        e.x.c.i.e(eVar, "containingClass");
        this.c = eVar;
        this.f9452b = mVar.a(new a(this));
    }

    public Collection<l0> a(d dVar, b bVar) {
        e.x.c.i.e(dVar, "name");
        e.x.c.i.e(bVar, "location");
        List<e.a.a.a.y0.b.k> i2 = i();
        e.a.a.a.y0.o.l lVar = new e.a.a.a.y0.o.l();
        for (T next : i2) {
            if ((next instanceof l0) && e.x.c.i.a(((l0) next).getName(), dVar)) {
                lVar.add(next);
            }
        }
        return lVar;
    }

    public Collection<e.a.a.a.y0.b.k> c(d dVar, e.x.b.l<? super d, Boolean> lVar) {
        e.x.c.i.e(dVar, "kindFilter");
        e.x.c.i.e(lVar, "nameFilter");
        return !dVar.a(d.f9447o.a) ? o.f7934h : i();
    }

    public Collection<f0> d(d dVar, b bVar) {
        e.x.c.i.e(dVar, "name");
        e.x.c.i.e(bVar, "location");
        List<e.a.a.a.y0.b.k> i2 = i();
        e.a.a.a.y0.o.l lVar = new e.a.a.a.y0.o.l();
        for (T next : i2) {
            if ((next instanceof f0) && e.x.c.i.a(((f0) next).getName(), dVar)) {
                lVar.add(next);
            }
        }
        return lVar;
    }

    public abstract List<s> h();

    public final List<e.a.a.a.y0.b.k> i() {
        return (List) b.q.a.a.j1(this.f9452b, d[0]);
    }
}
