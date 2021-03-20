package b.j.a.c.j0;

import b.e.a.a.a;
import b.j.a.b.o;
import b.j.a.b.s.i;
import b.j.a.c.a0.g;
import java.io.Serializable;
import java.lang.annotation.Annotation;

public final class l implements Serializable {

    /* renamed from: h  reason: collision with root package name */
    public final Class<Enum<?>> f2223h;

    /* renamed from: i  reason: collision with root package name */
    public final o[] f2224i;

    public l(Class<Enum<?>> cls, o[] oVarArr) {
        this.f2223h = cls;
        Enum[] enumArr = (Enum[]) cls.getEnumConstants();
        this.f2224i = oVarArr;
    }

    public static l a(g<?> gVar, Class<Enum<?>> cls) {
        Annotation[] annotationArr = g.a;
        Class<? super Enum<?>> superclass = cls.getSuperclass() != Enum.class ? cls.getSuperclass() : cls;
        Enum[] enumArr = (Enum[]) superclass.getEnumConstants();
        if (enumArr != null) {
            String[] k2 = gVar.e().k(superclass, enumArr, new String[enumArr.length]);
            o[] oVarArr = new o[enumArr.length];
            int length = enumArr.length;
            for (int i2 = 0; i2 < length; i2++) {
                Enum enumR = enumArr[i2];
                String str = k2[i2];
                if (str == null) {
                    str = enumR.name();
                }
                oVarArr[enumR.ordinal()] = new i(str);
            }
            return new l(cls, oVarArr);
        }
        throw new IllegalArgumentException(a.d(cls, a.y("Cannot determine enum constants for Class ")));
    }
}
