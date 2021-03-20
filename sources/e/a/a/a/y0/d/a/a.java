package e.a.a.a.y0.d.a;

import e.a.a.a.y0.b.e;
import e.a.a.a.y0.b.f;
import e.a.a.a.y0.l.h;
import e.a.a.a.y0.l.m;
import e.a.a.a.y0.o.i;
import e.a.a.a.y0.o.k;
import e.x.b.l;
import e.x.c.g;
import e.x.c.v;
import java.util.Map;
import java.util.Objects;

public final class a {
    public final h<e, e.a.a.a.y0.b.a1.c> a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f8325b;
    public final i c;

    /* renamed from: e.a.a.a.y0.d.a.a$a  reason: collision with other inner class name */
    public enum C0170a {
        METHOD_RETURN_TYPE,
        VALUE_PARAMETER,
        FIELD,
        TYPE_USE
    }

    public static final class b {
        public final e.a.a.a.y0.b.a1.c a;

        /* renamed from: b  reason: collision with root package name */
        public final int f8331b;

        public b(e.a.a.a.y0.b.a1.c cVar, int i2) {
            e.x.c.i.e(cVar, "typeQualifier");
            this.a = cVar;
            this.f8331b = i2;
        }
    }

    public static final /* synthetic */ class c extends g implements l<e, e.a.a.a.y0.b.a1.c> {
        public c(a aVar) {
            super(1, aVar);
        }

        public final String D() {
            return "computeTypeQualifierNickname(Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;)Lorg/jetbrains/kotlin/descriptors/annotations/AnnotationDescriptor;";
        }

        public final String getName() {
            return "computeTypeQualifierNickname";
        }

        public Object invoke(Object obj) {
            e eVar = (e) obj;
            e.x.c.i.e(eVar, "p1");
            a aVar = (a) this.f7972i;
            Objects.requireNonNull(aVar);
            if (!eVar.k().x(b.a)) {
                return null;
            }
            for (e.a.a.a.y0.b.a1.c d : eVar.k()) {
                e.a.a.a.y0.b.a1.c d2 = aVar.d(d);
                if (d2 != null) {
                    return d2;
                }
            }
            return null;
        }

        public final e.a.g u() {
            return v.a(a.class);
        }
    }

    public a(m mVar, i iVar) {
        e.x.c.i.e(mVar, "storageManager");
        e.x.c.i.e(iVar, "jsr305State");
        this.c = iVar;
        this.a = mVar.i(new c(this));
        this.f8325b = iVar.a();
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<e.a.a.a.y0.d.a.a.C0170a> a(e.a.a.a.y0.j.t.g<?> r3) {
        /*
            r2 = this;
            boolean r0 = r3 instanceof e.a.a.a.y0.j.t.b
            if (r0 == 0) goto L_0x0027
            e.a.a.a.y0.j.t.b r3 = (e.a.a.a.y0.j.t.b) r3
            T r3 = r3.a
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r3 = r3.iterator()
        L_0x0013:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L_0x006f
            java.lang.Object r1 = r3.next()
            e.a.a.a.y0.j.t.g r1 = (e.a.a.a.y0.j.t.g) r1
            java.util.List r1 = r2.a(r1)
            e.t.g.b(r0, r1)
            goto L_0x0013
        L_0x0027:
            boolean r0 = r3 instanceof e.a.a.a.y0.j.t.k
            if (r0 == 0) goto L_0x006d
            e.a.a.a.y0.j.t.k r3 = (e.a.a.a.y0.j.t.k) r3
            e.a.a.a.y0.f.d r3 = r3.c
            java.lang.String r3 = r3.h()
            int r0 = r3.hashCode()
            switch(r0) {
                case -2024225567: goto L_0x005c;
                case 66889946: goto L_0x0051;
                case 107598562: goto L_0x0046;
                case 446088073: goto L_0x003b;
                default: goto L_0x003a;
            }
        L_0x003a:
            goto L_0x0067
        L_0x003b:
            java.lang.String r0 = "PARAMETER"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0067
            e.a.a.a.y0.d.a.a$a r3 = e.a.a.a.y0.d.a.a.C0170a.VALUE_PARAMETER
            goto L_0x0068
        L_0x0046:
            java.lang.String r0 = "TYPE_USE"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0067
            e.a.a.a.y0.d.a.a$a r3 = e.a.a.a.y0.d.a.a.C0170a.TYPE_USE
            goto L_0x0068
        L_0x0051:
            java.lang.String r0 = "FIELD"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0067
            e.a.a.a.y0.d.a.a$a r3 = e.a.a.a.y0.d.a.a.C0170a.FIELD
            goto L_0x0068
        L_0x005c:
            java.lang.String r0 = "METHOD"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0067
            e.a.a.a.y0.d.a.a$a r3 = e.a.a.a.y0.d.a.a.C0170a.METHOD_RETURN_TYPE
            goto L_0x0068
        L_0x0067:
            r3 = 0
        L_0x0068:
            java.util.List r0 = e.t.g.C(r3)
            goto L_0x006f
        L_0x006d:
            e.t.o r0 = e.t.o.f7934h
        L_0x006f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: e.a.a.a.y0.d.a.a.a(e.a.a.a.y0.j.t.g):java.util.List");
    }

    public final k b(e.a.a.a.y0.b.a1.c cVar) {
        e.x.c.i.e(cVar, "annotationDescriptor");
        k c2 = c(cVar);
        return c2 != null ? c2 : this.c.f9816b;
    }

    public final k c(e.a.a.a.y0.b.a1.c cVar) {
        e.x.c.i.e(cVar, "annotationDescriptor");
        Map<String, k> map = this.c.d;
        e.a.a.a.y0.f.b e2 = cVar.e();
        k kVar = map.get(e2 != null ? e2.b() : null);
        if (kVar != null) {
            return kVar;
        }
        e e3 = e.a.a.a.y0.j.v.b.e(cVar);
        if (e3 == null) {
            return null;
        }
        e.a.a.a.y0.b.a1.c i2 = e3.k().i(b.d);
        e.a.a.a.y0.j.t.g<?> b2 = i2 != null ? e.a.a.a.y0.j.v.b.b(i2) : null;
        if (!(b2 instanceof e.a.a.a.y0.j.t.k)) {
            b2 = null;
        }
        e.a.a.a.y0.j.t.k kVar2 = (e.a.a.a.y0.j.t.k) b2;
        if (kVar2 == null) {
            return null;
        }
        k kVar3 = this.c.c;
        if (kVar3 != null) {
            return kVar3;
        }
        String e4 = kVar2.c.e();
        int hashCode = e4.hashCode();
        if (hashCode != -2137067054) {
            if (hashCode != -1838656823) {
                if (hashCode == 2656902 && e4.equals("WARN")) {
                    return k.WARN;
                }
                return null;
            } else if (e4.equals("STRICT")) {
                return k.STRICT;
            } else {
                return null;
            }
        } else if (e4.equals("IGNORE")) {
            return k.IGNORE;
        } else {
            return null;
        }
    }

    public final e.a.a.a.y0.b.a1.c d(e.a.a.a.y0.b.a1.c cVar) {
        e e2;
        e.x.c.i.e(cVar, "annotationDescriptor");
        if (this.c.a() || (e2 = e.a.a.a.y0.j.v.b.e(cVar)) == null) {
            return null;
        }
        if (b.f.contains(e.a.a.a.y0.j.v.b.h(e2)) || e2.k().x(b.f8340b)) {
            return cVar;
        }
        if (e2.i() != f.ANNOTATION_CLASS) {
            return null;
        }
        return this.a.invoke(e2);
    }
}
