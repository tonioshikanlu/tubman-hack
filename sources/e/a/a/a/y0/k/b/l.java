package e.a.a.a.y0.k.b;

import e.a.a.a.y0.b.k;
import e.a.a.a.y0.e.s;
import e.a.a.a.y0.e.z.a;
import e.a.a.a.y0.e.z.c;
import e.a.a.a.y0.e.z.e;
import e.a.a.a.y0.e.z.g;
import e.a.a.a.y0.k.b.g0.f;
import e.x.c.i;
import java.util.List;

public final class l {
    public final c0 a;

    /* renamed from: b  reason: collision with root package name */
    public final v f9583b;
    public final j c;
    public final c d;

    /* renamed from: e  reason: collision with root package name */
    public final k f9584e;
    public final e f;

    /* renamed from: g  reason: collision with root package name */
    public final g f9585g;

    /* renamed from: h  reason: collision with root package name */
    public final a f9586h;

    /* renamed from: i  reason: collision with root package name */
    public final f f9587i;

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x005b, code lost:
        r0 = r18.c();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public l(e.a.a.a.y0.k.b.j r12, e.a.a.a.y0.e.z.c r13, e.a.a.a.y0.b.k r14, e.a.a.a.y0.e.z.e r15, e.a.a.a.y0.e.z.g r16, e.a.a.a.y0.e.z.a r17, e.a.a.a.y0.k.b.g0.f r18, e.a.a.a.y0.k.b.c0 r19, java.util.List<e.a.a.a.y0.e.s> r20) {
        /*
            r11 = this;
            r8 = r11
            r0 = r12
            r1 = r13
            r2 = r14
            r3 = r15
            r4 = r16
            r5 = r17
            r6 = r18
            java.lang.String r7 = "components"
            e.x.c.i.e(r12, r7)
            java.lang.String r7 = "nameResolver"
            e.x.c.i.e(r13, r7)
            java.lang.String r7 = "containingDeclaration"
            e.x.c.i.e(r14, r7)
            java.lang.String r7 = "typeTable"
            e.x.c.i.e(r15, r7)
            java.lang.String r7 = "versionRequirementTable"
            e.x.c.i.e(r4, r7)
            java.lang.String r7 = "metadataVersion"
            e.x.c.i.e(r5, r7)
            java.lang.String r7 = "typeParameters"
            r9 = r20
            e.x.c.i.e(r9, r7)
            r11.<init>()
            r8.c = r0
            r8.d = r1
            r8.f9584e = r2
            r8.f = r3
            r8.f9585g = r4
            r8.f9586h = r5
            r8.f9587i = r6
            e.a.a.a.y0.k.b.c0 r10 = new e.a.a.a.y0.k.b.c0
            java.lang.String r0 = "Deserializer for \""
            java.lang.StringBuilder r0 = b.e.a.a.a.y(r0)
            e.a.a.a.y0.f.d r1 = r14.getName()
            r0.append(r1)
            r1 = 34
            r0.append(r1)
            java.lang.String r4 = r0.toString()
            if (r6 == 0) goto L_0x0062
            java.lang.String r0 = r18.c()
            if (r0 == 0) goto L_0x0062
            goto L_0x0064
        L_0x0062:
            java.lang.String r0 = "[container not found]"
        L_0x0064:
            r5 = r0
            r6 = 0
            r7 = 32
            r0 = r10
            r1 = r11
            r2 = r19
            r3 = r20
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r8.a = r10
            e.a.a.a.y0.k.b.v r0 = new e.a.a.a.y0.k.b.v
            r0.<init>(r11)
            r8.f9583b = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: e.a.a.a.y0.k.b.l.<init>(e.a.a.a.y0.k.b.j, e.a.a.a.y0.e.z.c, e.a.a.a.y0.b.k, e.a.a.a.y0.e.z.e, e.a.a.a.y0.e.z.g, e.a.a.a.y0.e.z.a, e.a.a.a.y0.k.b.g0.f, e.a.a.a.y0.k.b.c0, java.util.List):void");
    }

    public static /* synthetic */ l b(l lVar, k kVar, List list, c cVar, e eVar, g gVar, a aVar, int i2) {
        a aVar2 = null;
        c cVar2 = (i2 & 4) != 0 ? lVar.d : null;
        e eVar2 = (i2 & 8) != 0 ? lVar.f : null;
        g gVar2 = (i2 & 16) != 0 ? lVar.f9585g : null;
        if ((i2 & 32) != 0) {
            aVar2 = lVar.f9586h;
        }
        return lVar.a(kVar, list, cVar2, eVar2, gVar2, aVar2);
    }

    public final l a(k kVar, List<s> list, c cVar, e eVar, g gVar, a aVar) {
        g gVar2;
        a aVar2 = aVar;
        k kVar2 = kVar;
        i.e(kVar, "descriptor");
        List<s> list2 = list;
        i.e(list, "typeParameterProtos");
        i.e(cVar, "nameResolver");
        i.e(eVar, "typeTable");
        g gVar3 = gVar;
        i.e(gVar3, "versionRequirementTable");
        i.e(aVar2, "metadataVersion");
        j jVar = this.c;
        i.e(aVar2, "version");
        i.e(aVar2, "version");
        boolean z = true;
        if (aVar2.a != 1 || aVar2.f9183b < 4) {
            z = false;
        }
        if (z) {
            gVar2 = gVar3;
        } else {
            gVar2 = this.f9585g;
        }
        return new l(jVar, cVar, kVar, eVar, gVar2, aVar, this.f9587i, this.a, list);
    }
}
