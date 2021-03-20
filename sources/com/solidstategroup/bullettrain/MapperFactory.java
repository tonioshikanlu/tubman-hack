package com.solidstategroup.bullettrain;

import b.j.a.b.d;
import b.j.a.c.b0.l;
import b.j.a.c.f;
import b.j.a.c.h;
import b.j.a.c.h0.j;
import b.j.a.c.p;
import b.j.a.c.r;

public class MapperFactory {
    private static volatile r mapper;

    public static r getMappper() {
        if (mapper == null) {
            mapper = new r((d) null, (j) null, (l) null);
            mapper.f(p.USE_ANNOTATIONS, true);
            r rVar = mapper;
            h hVar = h.FAIL_ON_IGNORED_PROPERTIES;
            f fVar = rVar.f2289o;
            int i2 = fVar.v;
            int i3 = i2 & (~hVar.f2032i);
            if (i3 != i2) {
                fVar = new f(fVar, fVar.f1608h, i3, fVar.w, fVar.x, fVar.y, fVar.z);
            }
            rVar.f2289o = fVar;
        }
        return mapper;
    }
}
