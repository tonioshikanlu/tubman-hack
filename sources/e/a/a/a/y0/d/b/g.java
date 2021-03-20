package e.a.a.a.y0.d.b;

import b.e.a.a.a;
import e.a.a.a.y0.b.n0;
import e.a.a.a.y0.f.d;
import e.a.a.a.y0.j.w.b;
import e.a.a.a.y0.k.b.g0.f;
import e.c0.h;
import e.x.c.i;

public final class g implements f {

    /* renamed from: b  reason: collision with root package name */
    public final b f8645b;
    public final b c;
    public final l d;

    /* JADX WARNING: Removed duplicated region for block: B:11:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:13:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public g(e.a.a.a.y0.d.b.l r3, e.a.a.a.y0.e.l r4, e.a.a.a.y0.e.z.c r5, e.a.a.a.y0.k.b.r<e.a.a.a.y0.e.a0.b.f> r6, boolean r7, boolean r8) {
        /*
            r2 = this;
            java.lang.String r6 = "kotlinClass"
            e.x.c.i.e(r3, r6)
            java.lang.String r6 = "packageProto"
            e.x.c.i.e(r4, r6)
            java.lang.String r7 = "nameResolver"
            e.x.c.i.e(r5, r7)
            e.a.a.a.y0.f.a r8 = r3.g()
            e.a.a.a.y0.j.w.b r8 = e.a.a.a.y0.j.w.b.b(r8)
            java.lang.String r0 = "JvmClassName.byClassId(kotlinClass.classId)"
            e.x.c.i.d(r8, r0)
            e.a.a.a.y0.d.b.w.a r0 = r3.a()
            java.lang.String r0 = r0.a()
            if (r0 == 0) goto L_0x0036
            int r1 = r0.length()
            if (r1 <= 0) goto L_0x002e
            r1 = 1
            goto L_0x002f
        L_0x002e:
            r1 = 0
        L_0x002f:
            if (r1 == 0) goto L_0x0036
            e.a.a.a.y0.j.w.b r0 = e.a.a.a.y0.j.w.b.d(r0)
            goto L_0x0037
        L_0x0036:
            r0 = 0
        L_0x0037:
            java.lang.String r1 = "className"
            e.x.c.i.e(r8, r1)
            e.x.c.i.e(r4, r6)
            e.x.c.i.e(r5, r7)
            r2.<init>()
            r2.f8645b = r8
            r2.c = r0
            r2.d = r3
            e.a.a.a.y0.h.h$f<e.a.a.a.y0.e.l, java.lang.Integer> r3 = e.a.a.a.y0.e.a0.a.f8690m
            java.lang.String r6 = "JvmProtoBuf.packageModuleName"
            e.x.c.i.d(r3, r6)
            java.lang.Object r3 = b.q.a.a.I0(r4, r3)
            java.lang.Integer r3 = (java.lang.Integer) r3
            if (r3 == 0) goto L_0x0063
            int r3 = r3.intValue()
            e.a.a.a.y0.e.a0.b.g r5 = (e.a.a.a.y0.e.a0.b.g) r5
            r5.a(r3)
        L_0x0063:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: e.a.a.a.y0.d.b.g.<init>(e.a.a.a.y0.d.b.l, e.a.a.a.y0.e.l, e.a.a.a.y0.e.z.c, e.a.a.a.y0.k.b.r, boolean, boolean):void");
    }

    public n0 a() {
        n0 n0Var = n0.a;
        i.d(n0Var, "SourceFile.NO_SOURCE_FILE");
        return n0Var;
    }

    public String c() {
        StringBuilder y = a.y("Class '");
        y.append(d().b().b());
        y.append('\'');
        return y.toString();
    }

    public final e.a.a.a.y0.f.a d() {
        e.a.a.a.y0.f.b bVar;
        b bVar2 = this.f8645b;
        int lastIndexOf = bVar2.a.lastIndexOf("/");
        if (lastIndexOf == -1) {
            bVar = e.a.a.a.y0.f.b.c;
            if (bVar == null) {
                b.a(7);
                throw null;
            }
        } else {
            bVar = new e.a.a.a.y0.f.b(bVar2.a.substring(0, lastIndexOf).replace('/', '.'));
        }
        return new e.a.a.a.y0.f.a(bVar, e());
    }

    public final d e() {
        String e2 = this.f8645b.e();
        i.d(e2, "className.internalName");
        d l2 = d.l(h.H(e2, '/', (String) null, 2));
        i.d(l2, "Name.identifier(classNam….substringAfterLast('/'))");
        return l2;
    }

    public String toString() {
        return g.class.getSimpleName() + ": " + this.f8645b;
    }
}
