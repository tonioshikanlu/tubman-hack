package e.a.a.a.y0.e.a0.b;

import e.a.a.a.y0.e.a0.a;
import e.a.a.a.y0.e.a0.b.e;
import e.a.a.a.y0.e.c;
import e.a.a.a.y0.e.d;
import e.a.a.a.y0.e.l;
import e.a.a.a.y0.e.n;
import e.a.a.a.y0.e.q;
import e.a.a.a.y0.e.u;
import e.a.a.a.y0.e.z.b;
import e.a.a.a.y0.h.f;
import e.a.a.a.y0.h.h;
import e.a.a.a.y0.h.p;
import e.j;
import e.t.g;
import e.x.c.i;
import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class h {
    public static final f a;

    /* renamed from: b  reason: collision with root package name */
    public static final h f8770b = new h();

    static {
        f fVar = new f();
        fVar.a(a.a);
        fVar.a(a.f8682b);
        fVar.a(a.c);
        fVar.a(a.d);
        fVar.a(a.f8683e);
        fVar.a(a.f);
        fVar.a(a.f8684g);
        fVar.a(a.f8685h);
        fVar.a(a.f8686i);
        fVar.a(a.f8687j);
        fVar.a(a.f8688k);
        fVar.a(a.f8689l);
        fVar.a(a.f8690m);
        fVar.a(a.f8691n);
        i.d(fVar, "ExtensionRegistryLite.ne…f::registerAllExtensions)");
        a = fVar;
    }

    public static final boolean d(n nVar) {
        i.e(nVar, "proto");
        d dVar = d.c;
        b.C0203b bVar = d.a;
        Object l2 = nVar.l(a.f8683e);
        i.d(l2, "proto.getExtension(JvmProtoBuf.flags)");
        Boolean f = bVar.d(((Number) l2).intValue());
        i.d(f, "JvmFlags.IS_MOVED_FROM_I…nsion(JvmProtoBuf.flags))");
        return f.booleanValue();
    }

    public static final j<g, c> f(String[] strArr, String[] strArr2) {
        i.e(strArr, "data");
        i.e(strArr2, "strings");
        byte[] b2 = a.b(strArr);
        i.d(b2, "BitEncoding.decodeBytes(data)");
        i.e(b2, "bytes");
        i.e(strArr2, "strings");
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(b2);
        f fVar = a;
        a.e eVar = (a.e) ((e.a.a.a.y0.h.b) a.e.f8730o).c(byteArrayInputStream, fVar);
        i.d(eVar, "JvmProtoBuf.StringTableT…this, EXTENSION_REGISTRY)");
        g gVar = new g(eVar, strArr2);
        e.a.a.a.y0.h.b bVar = (e.a.a.a.y0.h.b) c.G;
        p d = bVar.d(byteArrayInputStream, fVar);
        bVar.b(d);
        return new j<>(gVar, (c) d);
    }

    public static final j<g, l> g(String[] strArr, String[] strArr2) {
        i.e(strArr, "data");
        i.e(strArr2, "strings");
        byte[] b2 = a.b(strArr);
        i.d(b2, "BitEncoding.decodeBytes(data)");
        i.e(b2, "bytes");
        i.e(strArr2, "strings");
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(b2);
        f fVar = a;
        a.e eVar = (a.e) ((e.a.a.a.y0.h.b) a.e.f8730o).c(byteArrayInputStream, fVar);
        i.d(eVar, "JvmProtoBuf.StringTableT…this, EXTENSION_REGISTRY)");
        g gVar = new g(eVar, strArr2);
        e.a.a.a.y0.h.b bVar = (e.a.a.a.y0.h.b) l.s;
        p d = bVar.d(byteArrayInputStream, fVar);
        bVar.b(d);
        return new j<>(gVar, (l) d);
    }

    public final e.b a(d dVar, e.a.a.a.y0.e.z.c cVar, e.a.a.a.y0.e.z.e eVar) {
        String str;
        i.e(dVar, "proto");
        i.e(cVar, "nameResolver");
        i.e(eVar, "typeTable");
        h.f<d, a.c> fVar = a.a;
        i.d(fVar, "JvmProtoBuf.constructorSignature");
        a.c cVar2 = (a.c) b.q.a.a.I0(dVar, fVar);
        String a2 = (cVar2 == null || !cVar2.k()) ? "<init>" : cVar.a(cVar2.f8707j);
        if (cVar2 == null || !cVar2.j()) {
            List<u> list = dVar.f8852l;
            i.d(list, "proto.valueParameterList");
            ArrayList arrayList = new ArrayList(b.q.a.a.C(list, 10));
            for (u uVar : list) {
                i.d(uVar, "it");
                q m3 = b.q.a.a.m3(uVar, eVar);
                String a3 = m3.u() ? b.a(cVar.c(m3.f9039p)) : null;
                if (a3 == null) {
                    return null;
                }
                arrayList.add(a3);
            }
            str = g.x(arrayList, "", "(", ")V", 0, (CharSequence) null, (e.x.b.l) null, 56);
        } else {
            str = cVar.a(cVar2.f8708k);
        }
        return new e.b(a2, str);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0060, code lost:
        if (r7 == null) goto L_0x006c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0047  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final e.a.a.a.y0.e.a0.b.e.a b(e.a.a.a.y0.e.n r7, e.a.a.a.y0.e.z.c r8, e.a.a.a.y0.e.z.e r9, boolean r10) {
        /*
            r6 = this;
            java.lang.String r0 = "proto"
            e.x.c.i.e(r7, r0)
            java.lang.String r0 = "nameResolver"
            e.x.c.i.e(r8, r0)
            java.lang.String r0 = "typeTable"
            e.x.c.i.e(r9, r0)
            e.a.a.a.y0.h.h$f<e.a.a.a.y0.e.n, e.a.a.a.y0.e.a0.a$d> r0 = e.a.a.a.y0.e.a0.a.d
            java.lang.String r1 = "JvmProtoBuf.propertySignature"
            e.x.c.i.d(r0, r1)
            java.lang.Object r0 = b.q.a.a.I0(r7, r0)
            e.a.a.a.y0.e.a0.a$d r0 = (e.a.a.a.y0.e.a0.a.d) r0
            r1 = 0
            if (r0 == 0) goto L_0x006c
            int r2 = r0.f8717i
            r3 = 1
            r2 = r2 & r3
            r4 = 0
            if (r2 != r3) goto L_0x0028
            r2 = r3
            goto L_0x0029
        L_0x0028:
            r2 = r4
        L_0x0029:
            if (r2 == 0) goto L_0x002e
            e.a.a.a.y0.e.a0.a$b r0 = r0.f8718j
            goto L_0x002f
        L_0x002e:
            r0 = r1
        L_0x002f:
            if (r0 != 0) goto L_0x0034
            if (r10 == 0) goto L_0x0034
            return r1
        L_0x0034:
            if (r0 == 0) goto L_0x0043
            int r10 = r0.f8695i
            r10 = r10 & r3
            if (r10 != r3) goto L_0x003d
            r10 = r3
            goto L_0x003e
        L_0x003d:
            r10 = r4
        L_0x003e:
            if (r10 == 0) goto L_0x0043
            int r10 = r0.f8696j
            goto L_0x0045
        L_0x0043:
            int r10 = r7.f8986m
        L_0x0045:
            if (r0 == 0) goto L_0x0058
            int r2 = r0.f8695i
            r5 = 2
            r2 = r2 & r5
            if (r2 != r5) goto L_0x004e
            goto L_0x004f
        L_0x004e:
            r3 = r4
        L_0x004f:
            if (r3 == 0) goto L_0x0058
            int r7 = r0.f8697k
            java.lang.String r7 = r8.a(r7)
            goto L_0x0062
        L_0x0058:
            e.a.a.a.y0.e.q r7 = b.q.a.a.N2(r7, r9)
            java.lang.String r7 = r6.e(r7, r8)
            if (r7 == 0) goto L_0x006c
        L_0x0062:
            e.a.a.a.y0.e.a0.b.e$a r9 = new e.a.a.a.y0.e.a0.b.e$a
            java.lang.String r8 = r8.a(r10)
            r9.<init>(r8, r7)
            return r9
        L_0x006c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: e.a.a.a.y0.e.a0.b.h.b(e.a.a.a.y0.e.n, e.a.a.a.y0.e.z.c, e.a.a.a.y0.e.z.e, boolean):e.a.a.a.y0.e.a0.b.e$a");
    }

    public final e.b c(e.a.a.a.y0.e.i iVar, e.a.a.a.y0.e.z.c cVar, e.a.a.a.y0.e.z.e eVar) {
        int i2;
        String str;
        e.a.a.a.y0.e.i iVar2 = iVar;
        e.a.a.a.y0.e.z.c cVar2 = cVar;
        e.a.a.a.y0.e.z.e eVar2 = eVar;
        i.e(iVar2, "proto");
        i.e(cVar2, "nameResolver");
        i.e(eVar2, "typeTable");
        h.f<e.a.a.a.y0.e.i, a.c> fVar = a.f8682b;
        i.d(fVar, "JvmProtoBuf.methodSignature");
        a.c cVar3 = (a.c) b.q.a.a.I0(iVar2, fVar);
        if (cVar3 == null || !cVar3.k()) {
            i2 = iVar2.f8929m;
        } else {
            i2 = cVar3.f8707j;
        }
        if (cVar3 == null || !cVar3.j()) {
            List C = g.C(b.q.a.a.y2(iVar2, eVar2));
            List<u> list = iVar2.s;
            i.d(list, "proto.valueParameterList");
            ArrayList arrayList = new ArrayList(b.q.a.a.C(list, 10));
            for (u uVar : list) {
                i.d(uVar, "it");
                arrayList.add(b.q.a.a.m3(uVar, eVar2));
            }
            List I = g.I(C, arrayList);
            ArrayList arrayList2 = new ArrayList(b.q.a.a.C(I, 10));
            Iterator it = ((ArrayList) I).iterator();
            while (it.hasNext()) {
                q qVar = (q) it.next();
                String a2 = qVar.u() ? b.a(cVar2.c(qVar.f9039p)) : null;
                if (a2 == null) {
                    return null;
                }
                arrayList2.add(a2);
            }
            String e2 = e(b.q.a.a.M2(iVar2, eVar2), cVar2);
            if (e2 == null) {
                return null;
            }
            str = b.e.a.a.a.q(new StringBuilder(), g.x(arrayList2, "", "(", ")", 0, (CharSequence) null, (e.x.b.l) null, 56), e2);
        } else {
            str = cVar2.a(cVar3.f8708k);
        }
        return new e.b(cVar2.a(i2), str);
    }

    public final String e(q qVar, e.a.a.a.y0.e.z.c cVar) {
        if (qVar.u()) {
            return b.a(cVar.c(qVar.f9039p));
        }
        return null;
    }
}
