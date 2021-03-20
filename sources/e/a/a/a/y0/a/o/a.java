package e.a.a.a.y0.a.o;

import e.a.a.a.y0.a.o.b;
import e.a.a.a.y0.b.e;
import e.a.a.a.y0.b.w;
import e.a.a.a.y0.b.y;
import e.a.a.a.y0.f.d;
import e.a.a.a.y0.l.m;
import e.c0.h;
import e.t.g;
import e.t.q;
import e.x.c.i;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class a implements e.a.a.a.y0.b.b1.b {
    public static final C0137a c = new C0137a((DefaultConstructorMarker) null);
    public final m a;

    /* renamed from: b  reason: collision with root package name */
    public final w f7691b;

    /* renamed from: e.a.a.a.y0.a.o.a$a  reason: collision with other inner class name */
    public static final class C0137a {
        public C0137a(DefaultConstructorMarker defaultConstructorMarker) {
        }

        /* JADX WARNING: Removed duplicated region for block: B:26:0x0074  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final e.a.a.a.y0.a.o.a.b a(java.lang.String r9, e.a.a.a.y0.f.b r10) {
            /*
                r8 = this;
                e.a.a.a.y0.a.o.b$c$a r0 = e.a.a.a.y0.a.o.b.c.f7706o
                java.util.Objects.requireNonNull(r0)
                java.lang.String r0 = "packageFqName"
                e.x.c.i.e(r10, r0)
                java.lang.String r0 = "className"
                e.x.c.i.e(r9, r0)
                e.a.a.a.y0.a.o.b$c[] r0 = e.a.a.a.y0.a.o.b.c.values()
                r1 = 0
                r2 = r1
            L_0x0015:
                r3 = 4
                r4 = 1
                r5 = 0
                if (r2 >= r3) goto L_0x0036
                r3 = r0[r2]
                e.a.a.a.y0.f.b r6 = r3.f7707h
                boolean r6 = e.x.c.i.a(r6, r10)
                if (r6 == 0) goto L_0x002f
                java.lang.String r6 = r3.f7708i
                r7 = 2
                boolean r6 = e.c0.h.C(r9, r6, r1, r7)
                if (r6 == 0) goto L_0x002f
                r6 = r4
                goto L_0x0030
            L_0x002f:
                r6 = r1
            L_0x0030:
                if (r6 == 0) goto L_0x0033
                goto L_0x0037
            L_0x0033:
                int r2 = r2 + 1
                goto L_0x0015
            L_0x0036:
                r3 = r5
            L_0x0037:
                if (r3 == 0) goto L_0x007e
                java.lang.String r10 = r3.f7708i
                int r10 = r10.length()
                java.lang.String r9 = r9.substring(r10)
                java.lang.String r10 = "(this as java.lang.String).substring(startIndex)"
                e.x.c.i.d(r9, r10)
                int r10 = r9.length()
                if (r10 != 0) goto L_0x004f
                goto L_0x0050
            L_0x004f:
                r4 = r1
            L_0x0050:
                if (r4 == 0) goto L_0x0054
            L_0x0052:
                r9 = r5
                goto L_0x0072
            L_0x0054:
                int r10 = r9.length()
                r0 = r1
            L_0x0059:
                if (r1 >= r10) goto L_0x006e
                char r2 = r9.charAt(r1)
                int r2 = r2 + -48
                r4 = 9
                if (r2 < 0) goto L_0x0052
                if (r4 >= r2) goto L_0x0068
                goto L_0x0052
            L_0x0068:
                int r0 = r0 * 10
                int r0 = r0 + r2
                int r1 = r1 + 1
                goto L_0x0059
            L_0x006e:
                java.lang.Integer r9 = java.lang.Integer.valueOf(r0)
            L_0x0072:
                if (r9 == 0) goto L_0x007e
                int r9 = r9.intValue()
                e.a.a.a.y0.a.o.a$b r10 = new e.a.a.a.y0.a.o.a$b
                r10.<init>(r3, r9)
                return r10
            L_0x007e:
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: e.a.a.a.y0.a.o.a.C0137a.a(java.lang.String, e.a.a.a.y0.f.b):e.a.a.a.y0.a.o.a$b");
        }
    }

    public static final class b {
        public final b.c a;

        /* renamed from: b  reason: collision with root package name */
        public final int f7692b;

        public b(b.c cVar, int i2) {
            i.e(cVar, "kind");
            this.a = cVar;
            this.f7692b = i2;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return i.a(this.a, bVar.a) && this.f7692b == bVar.f7692b;
        }

        public int hashCode() {
            b.c cVar = this.a;
            return ((cVar != null ? cVar.hashCode() : 0) * 31) + this.f7692b;
        }

        public String toString() {
            StringBuilder y = b.e.a.a.a.y("KindWithArity(kind=");
            y.append(this.a);
            y.append(", arity=");
            return b.e.a.a.a.o(y, this.f7692b, ")");
        }
    }

    public a(m mVar, w wVar) {
        i.e(mVar, "storageManager");
        i.e(wVar, "module");
        this.a = mVar;
        this.f7691b = wVar;
    }

    public Collection<e> a(e.a.a.a.y0.f.b bVar) {
        i.e(bVar, "packageFqName");
        return q.f7936h;
    }

    public boolean b(e.a.a.a.y0.f.b bVar, d dVar) {
        i.e(bVar, "packageFqName");
        i.e(dVar, "name");
        String e2 = dVar.e();
        i.d(e2, "name.asString()");
        return (h.C(e2, "Function", false, 2) || h.C(e2, "KFunction", false, 2) || h.C(e2, "SuspendFunction", false, 2) || h.C(e2, "KSuspendFunction", false, 2)) && c.a(e2, bVar) != null;
    }

    public e c(e.a.a.a.y0.f.a aVar) {
        i.e(aVar, "classId");
        if (!aVar.c && !aVar.k()) {
            String b2 = aVar.i().b();
            i.d(b2, "classId.relativeClassName.asString()");
            if (!h.d(b2, "Function", false, 2)) {
                return null;
            }
            e.a.a.a.y0.f.b h2 = aVar.h();
            i.d(h2, "classId.packageFqName");
            b a2 = c.a(b2, h2);
            if (a2 != null) {
                b.c cVar = a2.a;
                int i2 = a2.f7692b;
                List<y> f0 = this.f7691b.o0(h2).f0();
                ArrayList arrayList = new ArrayList();
                for (T next : f0) {
                    if (next instanceof e.a.a.a.y0.a.b) {
                        arrayList.add(next);
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    Object next2 = it.next();
                    if (next2 instanceof e.a.a.a.y0.a.e) {
                        arrayList2.add(next2);
                    }
                }
                y yVar = (e.a.a.a.y0.a.e) g.q(arrayList2);
                if (yVar == null) {
                    yVar = (e.a.a.a.y0.a.b) g.o(arrayList);
                }
                return new b(this.a, yVar, cVar, i2);
            }
        }
        return null;
    }
}
