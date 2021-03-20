package b.l.e.e0.z;

import b.l.e.b0;
import b.l.e.c0;
import b.l.e.e0.g;
import b.l.e.f0.a;
import b.l.e.k;

public final class d implements c0 {

    /* renamed from: h  reason: collision with root package name */
    public final g f5465h;

    public d(g gVar) {
        this.f5465h = gVar;
    }

    public <T> b0<T> a(k kVar, a<T> aVar) {
        b.l.e.d0.a aVar2 = (b.l.e.d0.a) aVar.a.getAnnotation(b.l.e.d0.a.class);
        if (aVar2 == null) {
            return null;
        }
        return b(this.f5465h, kVar, aVar, aVar2);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v3, resolved type: b.l.e.e0.z.m} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v13, resolved type: b.l.e.b0<?>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v14, resolved type: b.l.e.b0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: b.l.e.e0.z.m} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v15, resolved type: b.l.e.e0.z.m} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v16, resolved type: b.l.e.e0.z.m} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public b.l.e.b0<?> b(b.l.e.e0.g r9, b.l.e.k r10, b.l.e.f0.a<?> r11, b.l.e.d0.a r12) {
        /*
            r8 = this;
            java.lang.Class r0 = r12.value()
            b.l.e.f0.a r1 = new b.l.e.f0.a
            r1.<init>(r0)
            b.l.e.e0.t r9 = r9.a(r1)
            java.lang.Object r9 = r9.a()
            boolean r0 = r9 instanceof b.l.e.b0
            if (r0 == 0) goto L_0x0018
            b.l.e.b0 r9 = (b.l.e.b0) r9
            goto L_0x0072
        L_0x0018:
            boolean r0 = r9 instanceof b.l.e.c0
            if (r0 == 0) goto L_0x0023
            b.l.e.c0 r9 = (b.l.e.c0) r9
            b.l.e.b0 r9 = r9.a(r10, r11)
            goto L_0x0072
        L_0x0023:
            boolean r0 = r9 instanceof b.l.e.x
            if (r0 != 0) goto L_0x0058
            boolean r1 = r9 instanceof b.l.e.p
            if (r1 == 0) goto L_0x002c
            goto L_0x0058
        L_0x002c:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.String r12 = "Invalid attempt to bind an instance of "
            java.lang.StringBuilder r12 = b.e.a.a.a.y(r12)
            java.lang.Class r9 = r9.getClass()
            java.lang.String r9 = r9.getName()
            r12.append(r9)
            java.lang.String r9 = " as a @JsonAdapter for "
            r12.append(r9)
            java.lang.String r9 = r11.toString()
            r12.append(r9)
            java.lang.String r9 = ". @JsonAdapter value must be a TypeAdapter, TypeAdapterFactory, JsonSerializer or JsonDeserializer."
            r12.append(r9)
            java.lang.String r9 = r12.toString()
            r10.<init>(r9)
            throw r10
        L_0x0058:
            r1 = 0
            if (r0 == 0) goto L_0x0060
            r0 = r9
            b.l.e.x r0 = (b.l.e.x) r0
            r3 = r0
            goto L_0x0061
        L_0x0060:
            r3 = r1
        L_0x0061:
            boolean r0 = r9 instanceof b.l.e.p
            if (r0 == 0) goto L_0x0068
            r1 = r9
            b.l.e.p r1 = (b.l.e.p) r1
        L_0x0068:
            r4 = r1
            b.l.e.e0.z.m r9 = new b.l.e.e0.z.m
            r7 = 0
            r2 = r9
            r5 = r10
            r6 = r11
            r2.<init>(r3, r4, r5, r6, r7)
        L_0x0072:
            if (r9 == 0) goto L_0x0080
            boolean r10 = r12.nullSafe()
            if (r10 == 0) goto L_0x0080
            b.l.e.a0 r10 = new b.l.e.a0
            r10.<init>(r9)
            r9 = r10
        L_0x0080:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: b.l.e.e0.z.d.b(b.l.e.e0.g, b.l.e.k, b.l.e.f0.a, b.l.e.d0.a):b.l.e.b0");
    }
}
