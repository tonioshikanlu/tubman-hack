package b.j.a.c.f0.g;

import b.j.a.c.e;
import b.j.a.c.i;
import b.j.a.c.i0.c;
import b.j.a.c.i0.m;
import b.j.a.c.i0.n;
import b.j.a.c.j0.g;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.Objects;
import java.util.Properties;

public class j extends p {
    public j(i iVar, n nVar) {
        super(iVar, nVar);
    }

    public String a(Object obj, Class<?> cls) {
        return g(obj, cls, this.a);
    }

    public String c(Object obj) {
        return g(obj, obj.getClass(), this.a);
    }

    public String d() {
        return "class name used as type id";
    }

    public i f(e eVar, String str) {
        return h(str, eVar);
    }

    public String g(Object obj, Class<?> cls, n nVar) {
        Class cls2;
        i iVar;
        i iVar2;
        Class cls3;
        Class<Enum> cls4 = Enum.class;
        boolean isAssignableFrom = cls4.isAssignableFrom(cls);
        Class<? super Object> cls5 = cls;
        if (isAssignableFrom) {
            boolean isEnum = cls.isEnum();
            cls5 = cls;
            if (!isEnum) {
                cls5 = cls.getSuperclass();
            }
        }
        String name = cls5.getName();
        if (!name.startsWith("java.util.")) {
            return (name.indexOf(36) < 0 || g.p(cls5) == null || g.p(this.f1988b.f2152h) != null) ? name : this.f1988b.f2152h.getName();
        }
        if (obj instanceof EnumSet) {
            EnumSet enumSet = (EnumSet) obj;
            Annotation[] annotationArr = g.a;
            if (!enumSet.isEmpty()) {
                cls3 = ((Enum) enumSet.iterator().next()).getClass();
                if (cls3.getSuperclass() != cls4) {
                    cls3 = cls3.getSuperclass();
                }
            } else {
                Field field = g.b.c.a;
                if (field != null) {
                    try {
                        cls3 = (Class) field.get(enumSet);
                    } catch (Exception e2) {
                        throw new IllegalArgumentException(e2);
                    }
                } else {
                    throw new IllegalStateException("Cannot figure out type for EnumSet (odd JDK platform?)");
                }
            }
            return nVar.g(EnumSet.class, nVar.c((c) null, cls3, n.f2185l)).T();
        } else if (!(obj instanceof EnumMap)) {
            return name;
        } else {
            EnumMap enumMap = (EnumMap) obj;
            Annotation[] annotationArr2 = g.a;
            if (!enumMap.isEmpty()) {
                cls2 = ((Enum) enumMap.keySet().iterator().next()).getClass();
                if (cls2.getSuperclass() != cls4) {
                    cls2 = cls2.getSuperclass();
                }
            } else {
                Field field2 = g.b.c.f2214b;
                if (field2 != null) {
                    try {
                        cls2 = (Class) field2.get(enumMap);
                    } catch (Exception e3) {
                        throw new IllegalArgumentException(e3);
                    }
                } else {
                    throw new IllegalStateException("Cannot figure out type for EnumMap (odd JDK platform?)");
                }
            }
            Class<Object> cls6 = Object.class;
            Class<EnumMap> cls7 = EnumMap.class;
            Objects.requireNonNull(nVar);
            if (cls7 == Properties.class) {
                iVar2 = n.x;
                iVar = iVar2;
            } else {
                m mVar = n.f2185l;
                iVar2 = nVar.c((c) null, cls2, mVar);
                iVar = nVar.c((c) null, cls6, mVar);
            }
            return nVar.j(cls7, iVar2, iVar).T();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x001c, code lost:
        if (r1.I(r0.f2152h) != false) goto L_0x005f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public b.j.a.c.i h(java.lang.String r6, b.j.a.c.e r7) {
        /*
            r5 = this;
            b.j.a.c.i r0 = r5.f1988b
            java.util.Objects.requireNonNull(r7)
            r1 = 60
            int r1 = r6.indexOf(r1)
            r2 = 0
            if (r1 <= 0) goto L_0x001f
            b.j.a.c.i0.n r1 = r7.h()
            b.j.a.c.i r1 = r1.h(r6)
            java.lang.Class<?> r3 = r0.f2152h
            boolean r3 = r1.I(r3)
            if (r3 == 0) goto L_0x0036
            goto L_0x005f
        L_0x001f:
            b.j.a.c.i0.n r1 = r7.h()     // Catch:{ ClassNotFoundException -> 0x005e, Exception -> 0x003d }
            java.lang.Class r1 = r1.l(r6)     // Catch:{ ClassNotFoundException -> 0x005e, Exception -> 0x003d }
            boolean r3 = r0.J(r1)
            if (r3 == 0) goto L_0x0036
            b.j.a.c.i0.n r3 = r7.h()
            b.j.a.c.i r1 = r3.k(r0, r1)
            goto L_0x005f
        L_0x0036:
            java.lang.String r1 = "Not a subtype"
            b.j.a.c.k r6 = r7.i(r0, r6, r1)
            throw r6
        L_0x003d:
            r1 = move-exception
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            java.lang.Class r4 = r1.getClass()
            java.lang.String r4 = r4.getName()
            r2[r3] = r4
            r3 = 1
            java.lang.String r1 = b.j.a.c.j0.g.i(r1)
            r2[r3] = r1
            java.lang.String r1 = "problem: (%s) %s"
            java.lang.String r1 = java.lang.String.format(r1, r2)
            b.j.a.c.k r6 = r7.i(r0, r6, r1)
            throw r6
        L_0x005e:
            r1 = r2
        L_0x005f:
            if (r1 != 0) goto L_0x006f
            boolean r0 = r7 instanceof b.j.a.c.g
            if (r0 == 0) goto L_0x006f
            b.j.a.c.g r7 = (b.j.a.c.g) r7
            b.j.a.c.i r0 = r5.f1988b
            java.lang.String r1 = "no such class found"
            r7.I(r0, r6, r5, r1)
            return r2
        L_0x006f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: b.j.a.c.f0.g.j.h(java.lang.String, b.j.a.c.e):b.j.a.c.i");
    }
}
