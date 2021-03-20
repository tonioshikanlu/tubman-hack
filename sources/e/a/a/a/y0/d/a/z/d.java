package e.a.a.a.y0.d.a.z;

import e.a.a.a.y0.b.a1.m;
import e.a.a.a.y0.b.a1.n;
import e.a.a.a.y0.b.w;
import e.a.a.a.y0.b.w0;
import e.a.a.a.y0.d.a.d0.b;
import e.a.a.a.y0.m.d0;
import e.a.a.a.y0.m.k0;
import e.j;
import e.t.g;
import e.t.q;
import e.x.b.l;
import e.x.c.i;
import e.x.c.k;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;
import java.util.Map;

public final class d {
    public static final Map<String, EnumSet<n>> a = g.E(new j("PACKAGE", EnumSet.noneOf(n.class)), new j("TYPE", EnumSet.of(n.CLASS, n.FILE)), new j("ANNOTATION_TYPE", EnumSet.of(n.ANNOTATION_CLASS)), new j("TYPE_PARAMETER", EnumSet.of(n.TYPE_PARAMETER)), new j("FIELD", EnumSet.of(n.FIELD)), new j("LOCAL_VARIABLE", EnumSet.of(n.LOCAL_VARIABLE)), new j("PARAMETER", EnumSet.of(n.VALUE_PARAMETER)), new j("CONSTRUCTOR", EnumSet.of(n.CONSTRUCTOR)), new j("METHOD", EnumSet.of(n.FUNCTION, n.PROPERTY_GETTER, n.PROPERTY_SETTER)), new j("TYPE_USE", EnumSet.of(n.TYPE)));

    /* renamed from: b  reason: collision with root package name */
    public static final Map<String, m> f8610b = g.E(new j("RUNTIME", m.RUNTIME), new j("CLASS", m.BINARY), new j("SOURCE", m.SOURCE));
    public static final d c = new d();

    public static final class a extends k implements l<w, d0> {

        /* renamed from: h  reason: collision with root package name */
        public static final a f8611h = new a();

        public a() {
            super(1);
        }

        public Object invoke(Object obj) {
            d0 d;
            w wVar = (w) obj;
            i.e(wVar, "module");
            c cVar = c.f8609k;
            w0 u0 = b.q.a.a.u0(c.f8605g, wVar.v().i(e.a.a.a.y0.a.g.f7647k.z));
            if (u0 != null && (d = u0.d()) != null) {
                return d;
            }
            k0 d2 = e.a.a.a.y0.m.w.d("Error: AnnotationTarget[]");
            i.d(d2, "ErrorUtils.createErrorTy…ror: AnnotationTarget[]\")");
            return d2;
        }
    }

    public final e.a.a.a.y0.j.t.g<?> a(List<? extends b> list) {
        i.e(list, "arguments");
        ArrayList<e.a.a.a.y0.d.a.d0.m> arrayList = new ArrayList<>();
        for (T next : list) {
            if (next instanceof e.a.a.a.y0.d.a.d0.m) {
                arrayList.add(next);
            }
        }
        ArrayList<n> arrayList2 = new ArrayList<>();
        for (e.a.a.a.y0.d.a.d0.m a2 : arrayList) {
            e.a.a.a.y0.f.d a3 = a2.a();
            Iterable iterable = a.get(a3 != null ? a3.e() : null);
            if (iterable == null) {
                iterable = q.f7936h;
            }
            g.b(arrayList2, iterable);
        }
        ArrayList arrayList3 = new ArrayList(b.q.a.a.C(arrayList2, 10));
        for (n name : arrayList2) {
            e.a.a.a.y0.f.a l2 = e.a.a.a.y0.f.a.l(e.a.a.a.y0.a.g.f7647k.A);
            i.d(l2, "ClassId.topLevel(KotlinB…Q_NAMES.annotationTarget)");
            e.a.a.a.y0.f.d l3 = e.a.a.a.y0.f.d.l(name.name());
            i.d(l3, "Name.identifier(kotlinTarget.name)");
            arrayList3.add(new e.a.a.a.y0.j.t.k(l2, l3));
        }
        return new e.a.a.a.y0.j.t.b(arrayList3, a.f8611h);
    }
}
