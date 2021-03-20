package e.a.a.a;

import e.a.a.a.y0.b.l0;
import e.a.a.a.y0.b.s;
import e.a.a.a.y0.b.w0;
import e.a.a.a.y0.e.a0.a;
import e.a.a.a.y0.e.t;
import e.a.a.a.y0.m.d0;
import e.a.a.a.z0.a;
import e.a.e;
import e.a.g;
import e.a.h;
import e.a.j;
import e.a.m;
import e.x.c.b;
import e.x.c.f;
import e.x.c.i;
import e.x.c.k;
import e.x.c.l;
import e.x.c.p;
import e.x.c.w;
import java.io.ByteArrayInputStream;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Objects;
import kotlin.Metadata;

public class q0 extends w {
    public static n h(b bVar) {
        g u = bVar.u();
        return u instanceof n ? (n) u : d.f7515j;
    }

    public h a(e.x.c.g gVar) {
        n h2 = h(gVar);
        String name = gVar.getName();
        String D = gVar.D();
        Object obj = gVar.f7972i;
        i.e(h2, "container");
        i.e(name, "name");
        i.e(D, "signature");
        return new b(h2, name, D, (s) null, obj);
    }

    public e b(Class cls) {
        Class<T> cls2;
        V v;
        e.a.a.a.z0.b<String, Object> bVar;
        a aVar;
        String str;
        e.a.a.a.z0.b<String, Object> bVar2 = k.a;
        i.e(cls, "jClass");
        String name = cls.getName();
        e.a.a.a.z0.b<String, Object> bVar3 = k.a;
        Objects.requireNonNull(bVar3);
        a aVar2 = (a) bVar3.a.a.a((long) name.hashCode());
        if (aVar2 == null) {
            aVar2 = a.f9835k;
        }
        while (true) {
            cls2 = null;
            if (aVar2 == null || aVar2.f9838j <= 0) {
                v = null;
            } else {
                e.a.a.a.z0.e eVar = (e.a.a.a.z0.e) aVar2.f9836h;
                if (eVar.f9844h.equals(name)) {
                    v = eVar.f9845i;
                    break;
                }
                aVar2 = aVar2.f9837i;
            }
        }
        v = null;
        if (v instanceof WeakReference) {
            a aVar3 = (a) ((WeakReference) v).get();
            if (aVar3 != null) {
                cls2 = aVar3.f7451k;
            }
            if (i.a(cls2, cls)) {
                return aVar3;
            }
        } else if (v != null) {
            for (WeakReference weakReference : (WeakReference[]) v) {
                a aVar4 = (a) weakReference.get();
                if (i.a(aVar4 != null ? aVar4.f7451k : null, cls)) {
                    return aVar4;
                }
            }
            int length = ((Object[]) v).length;
            WeakReference[] weakReferenceArr = new WeakReference[(length + 1)];
            System.arraycopy(v, 0, weakReferenceArr, 0, length);
            aVar = new a(cls);
            weakReferenceArr[length] = new WeakReference(aVar);
            bVar = k.a.a(name, weakReferenceArr);
            str = "K_CLASS_CACHE.plus(name, newArray)";
            i.d(bVar, str);
            k.a = bVar;
            return aVar;
        }
        aVar = new a(cls);
        bVar = k.a.a(name, new WeakReference(aVar));
        str = "K_CLASS_CACHE.plus(name, WeakReference(newKClass))";
        i.d(bVar, str);
        k.a = bVar;
        return aVar;
    }

    public g c(Class cls, String str) {
        return new v(cls, str);
    }

    public j d(l lVar) {
        return new t(h(lVar), lVar.f7974k, lVar.f7975l, lVar.f7972i);
    }

    public m e(p pVar) {
        return new a0(h(pVar), pVar.getName(), pVar.D(), pVar.f7972i);
    }

    public String f(f fVar) {
        b b2;
        i.e(fVar, "$this$reflect");
        Metadata metadata = (Metadata) fVar.getClass().getAnnotation(Metadata.class);
        b bVar = null;
        if (metadata != null) {
            String[] d1 = metadata.d1();
            boolean z = true;
            if (d1.length == 0) {
                d1 = null;
            }
            if (d1 != null) {
                String[] d2 = metadata.d2();
                e.a.a.a.y0.h.f fVar2 = e.a.a.a.y0.e.a0.b.h.a;
                i.e(d1, "data");
                i.e(d2, "strings");
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(e.a.a.a.y0.e.a0.b.a.b(d1));
                e.a.a.a.y0.h.f fVar3 = e.a.a.a.y0.e.a0.b.h.a;
                a.e eVar = (a.e) ((e.a.a.a.y0.h.b) a.e.f8730o).c(byteArrayInputStream, fVar3);
                i.d(eVar, "JvmProtoBuf.StringTableT…this, EXTENSION_REGISTRY)");
                e.a.a.a.y0.e.a0.b.g gVar = new e.a.a.a.y0.e.a0.b.g(eVar, d2);
                e.a.a.a.y0.h.b bVar2 = (e.a.a.a.y0.h.b) e.a.a.a.y0.e.i.z;
                e.a.a.a.y0.h.p d = bVar2.d(byteArrayInputStream, fVar3);
                bVar2.b(d);
                e.a.a.a.y0.e.i iVar = (e.a.a.a.y0.e.i) d;
                int[] mv = metadata.mv();
                if ((metadata.xi() & 8) == 0) {
                    z = false;
                }
                e.a.a.a.y0.e.a0.b.f fVar4 = new e.a.a.a.y0.e.a0.b.f(mv, z);
                Class<?> cls = fVar.getClass();
                t tVar = iVar.t;
                i.d(tVar, "proto.typeTable");
                l0 l0Var = (l0) v0.f(cls, iVar, gVar, new e.a.a.a.y0.e.z.e(tVar), fVar4, e.a.a.b.f7862q);
                if (l0Var != null) {
                    bVar = new b(d.f7515j, l0Var);
                }
            }
        }
        if (bVar == null || (b2 = v0.b(bVar)) == null) {
            return super.f(fVar);
        }
        r0 r0Var = r0.f7577b;
        s J = b2.D();
        i.e(J, "invoke");
        StringBuilder sb = new StringBuilder();
        r0.b(sb, J);
        List<w0> n2 = J.n();
        i.d(n2, "invoke.valueParameters");
        e.t.g.v(n2, sb, ", ", "(", ")", 0, (CharSequence) null, s0.f7580h, 48);
        sb.append(" -> ");
        d0 f = J.f();
        i.c(f);
        i.d(f, "invoke.returnType!!");
        sb.append(r0.e(f));
        String sb2 = sb.toString();
        i.d(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    public String g(k kVar) {
        return f(kVar);
    }
}
