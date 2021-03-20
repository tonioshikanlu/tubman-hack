package e.a.a.a.y0.k.b;

import b.q.a.a;
import e.a.a.a.y0.b.a1.c;
import e.a.a.a.y0.b.d;
import e.a.a.a.y0.b.h;
import e.a.a.a.y0.b.m0;
import e.a.a.a.y0.b.w;
import e.a.a.a.y0.b.w0;
import e.a.a.a.y0.b.x;
import e.a.a.a.y0.e.b;
import e.a.a.a.y0.j.g;
import e.a.a.a.y0.j.t.l;
import e.a.a.a.y0.m.d0;
import e.j;
import e.t.p;
import e.t.u;
import e.x.c.i;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public final class e {
    public final w a;

    /* renamed from: b  reason: collision with root package name */
    public final x f9498b;

    public e(w wVar, x xVar) {
        i.e(wVar, "module");
        i.e(xVar, "notFoundClasses");
        this.a = wVar;
        this.f9498b = xVar;
    }

    public final c a(b bVar, e.a.a.a.y0.e.z.c cVar) {
        i.e(bVar, "proto");
        i.e(cVar, "nameResolver");
        e.a.a.a.y0.b.e o0 = a.o0(this.a, a.D0(cVar, bVar.f8775j), this.f9498b);
        Map map = p.f7935h;
        if (bVar.f8776k.size() != 0 && !e.a.a.a.y0.m.w.j(o0) && g.m(o0)) {
            Collection<d> r = o0.r();
            i.d(r, "annotationClass.constructors");
            d dVar = (d) e.t.g.P(r);
            if (dVar != null) {
                List<w0> n2 = dVar.n();
                i.d(n2, "constructor.valueParameters");
                int q2 = a.q2(a.C(n2, 10));
                if (q2 < 16) {
                    q2 = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(q2);
                for (T next : n2) {
                    w0 w0Var = (w0) next;
                    i.d(w0Var, "it");
                    linkedHashMap.put(w0Var.getName(), next);
                }
                List<b.C0195b> list = bVar.f8776k;
                i.d(list, "proto.argumentList");
                ArrayList arrayList = new ArrayList();
                for (b.C0195b bVar2 : list) {
                    i.d(bVar2, "it");
                    w0 w0Var2 = (w0) linkedHashMap.get(a.X0(cVar, bVar2.f8783j));
                    e.a.a.a.y0.j.t.g<?> gVar = null;
                    if (w0Var2 != null) {
                        e.a.a.a.y0.f.d X0 = a.X0(cVar, bVar2.f8783j);
                        d0 d = w0Var2.d();
                        i.d(d, "parameter.type");
                        b.C0195b.c cVar2 = bVar2.f8784k;
                        i.d(cVar2, "proto.value");
                        e.a.a.a.y0.j.t.g<?> c = c(d, cVar2, cVar);
                        if (b(c, d, cVar2)) {
                            gVar = c;
                        }
                        if (gVar == null) {
                            StringBuilder y = b.e.a.a.a.y("Unexpected argument value: actual type ");
                            y.append(cVar2.f8792j);
                            y.append(" != expected type ");
                            y.append(d);
                            String sb = y.toString();
                            i.e(sb, "message");
                            gVar = new l.a(sb);
                        }
                        gVar = new j<>(X0, gVar);
                    }
                    if (gVar != null) {
                        arrayList.add(gVar);
                    }
                }
                map = e.t.g.X(arrayList);
            }
        }
        return new e.a.a.a.y0.b.a1.d(o0.s(), map, m0.a);
    }

    public final boolean b(e.a.a.a.y0.j.t.g<?> gVar, d0 d0Var, b.C0195b.c cVar) {
        b.C0195b.c.C0198c cVar2 = cVar.f8792j;
        if (cVar2 != null) {
            int ordinal = cVar2.ordinal();
            if (ordinal == 9) {
                h d = d0Var.W0().d();
                if (!(d instanceof e.a.a.a.y0.b.e)) {
                    d = null;
                }
                e.a.a.a.y0.b.e eVar = (e.a.a.a.y0.b.e) d;
                if (eVar != null && !e.a.a.a.y0.a.g.c(eVar, e.a.a.a.y0.a.g.f7647k.W)) {
                    return false;
                }
            } else if (ordinal == 12) {
                if ((gVar instanceof e.a.a.a.y0.j.t.b) && ((List) ((e.a.a.a.y0.j.t.b) gVar).a).size() == cVar.r.size()) {
                    d0 g2 = this.a.v().g(d0Var);
                    i.d(g2, "builtIns.getArrayElementType(expectedType)");
                    e.a.a.a.y0.j.t.b bVar = (e.a.a.a.y0.j.t.b) gVar;
                    e.a0.d r = e.t.g.r((Collection) bVar.a);
                    if (!(r instanceof Collection) || !((Collection) r).isEmpty()) {
                        Iterator it = r.iterator();
                        while (((e.a0.c) it).f7887i) {
                            int nextInt = ((u) it).nextInt();
                            b.C0195b.c cVar3 = cVar.r.get(nextInt);
                            i.d(cVar3, "value.getArrayElement(i)");
                            if (!b((e.a.a.a.y0.j.t.g) ((List) bVar.a).get(nextInt), g2, cVar3)) {
                                return false;
                            }
                        }
                    }
                } else {
                    throw new IllegalStateException(("Deserialized ArrayValue should have the same number of elements as the original array value: " + gVar).toString());
                }
            }
            return true;
        }
        return i.a(gVar.a(this.a), d0Var);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:49:?, code lost:
        return r6;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final e.a.a.a.y0.j.t.g<?> c(e.a.a.a.y0.m.d0 r6, e.a.a.a.y0.e.b.C0195b.c r7, e.a.a.a.y0.e.z.c r8) {
        /*
            r5 = this;
            java.lang.String r0 = "expectedType"
            e.x.c.i.e(r6, r0)
            java.lang.String r0 = "value"
            e.x.c.i.e(r7, r0)
            java.lang.String r1 = "nameResolver"
            e.x.c.i.e(r8, r1)
            e.a.a.a.y0.e.z.b$b r1 = e.a.a.a.y0.e.z.b.K
            int r2 = r7.t
            java.lang.String r3 = "Flags.IS_UNSIGNED.get(value.flags)"
            boolean r1 = b.e.a.a.a.N(r1, r2, r3)
            e.a.a.a.y0.e.b$b$c$c r2 = r7.f8792j
            if (r2 == 0) goto L_0x012a
            int r2 = r2.ordinal()
            switch(r2) {
                case 0: goto L_0x0118;
                case 1: goto L_0x010d;
                case 2: goto L_0x00fb;
                case 3: goto L_0x00ea;
                case 4: goto L_0x00d9;
                case 5: goto L_0x00d1;
                case 6: goto L_0x00c9;
                case 7: goto L_0x00b8;
                case 8: goto L_0x00ac;
                case 9: goto L_0x009d;
                case 10: goto L_0x008a;
                case 11: goto L_0x0078;
                case 12: goto L_0x0026;
                default: goto L_0x0024;
            }
        L_0x0024:
            goto L_0x012a
        L_0x0026:
            java.util.List<e.a.a.a.y0.e.b$b$c> r7 = r7.r
            java.lang.String r1 = "value.arrayElementList"
            e.x.c.i.d(r7, r1)
            java.util.ArrayList r1 = new java.util.ArrayList
            r2 = 10
            int r2 = b.q.a.a.C(r7, r2)
            r1.<init>(r2)
            java.util.Iterator r7 = r7.iterator()
        L_0x003c:
            boolean r2 = r7.hasNext()
            if (r2 == 0) goto L_0x0064
            java.lang.Object r2 = r7.next()
            e.a.a.a.y0.e.b$b$c r2 = (e.a.a.a.y0.e.b.C0195b.c) r2
            e.a.a.a.y0.b.w r3 = r5.a
            e.a.a.a.y0.a.g r3 = r3.v()
            e.a.a.a.y0.m.k0 r3 = r3.f()
            java.lang.String r4 = "builtIns.anyType"
            e.x.c.i.d(r3, r4)
            java.lang.String r4 = "it"
            e.x.c.i.d(r2, r4)
            e.a.a.a.y0.j.t.g r2 = r5.c(r3, r2, r8)
            r1.add(r2)
            goto L_0x003c
        L_0x0064:
            e.x.c.i.e(r1, r0)
            java.lang.String r7 = "type"
            e.x.c.i.e(r6, r7)
            e.a.a.a.y0.j.t.b r7 = new e.a.a.a.y0.j.t.b
            e.a.a.a.y0.j.t.h r8 = new e.a.a.a.y0.j.t.h
            r8.<init>(r6)
            r7.<init>(r1, r8)
            goto L_0x0129
        L_0x0078:
            e.a.a.a.y0.j.t.a r6 = new e.a.a.a.y0.j.t.a
            e.a.a.a.y0.e.b r7 = r7.f8799q
            java.lang.String r0 = "value.annotation"
            e.x.c.i.d(r7, r0)
            e.a.a.a.y0.b.a1.c r7 = r5.a(r7, r8)
            r6.<init>(r7)
            goto L_0x0116
        L_0x008a:
            e.a.a.a.y0.j.t.k r6 = new e.a.a.a.y0.j.t.k
            int r0 = r7.f8797o
            e.a.a.a.y0.f.a r0 = b.q.a.a.D0(r8, r0)
            int r7 = r7.f8798p
            e.a.a.a.y0.f.d r7 = b.q.a.a.X0(r8, r7)
            r6.<init>(r0, r7)
            goto L_0x0116
        L_0x009d:
            e.a.a.a.y0.j.t.t r6 = new e.a.a.a.y0.j.t.t
            int r0 = r7.f8797o
            e.a.a.a.y0.f.a r8 = b.q.a.a.D0(r8, r0)
            int r7 = r7.s
            r6.<init>(r8, r7)
            goto L_0x0116
        L_0x00ac:
            e.a.a.a.y0.j.t.x r6 = new e.a.a.a.y0.j.t.x
            int r7 = r7.f8796n
            java.lang.String r7 = r8.a(r7)
            r6.<init>(r7)
            goto L_0x0116
        L_0x00b8:
            e.a.a.a.y0.j.t.c r6 = new e.a.a.a.y0.j.t.c
            long r7 = r7.f8793k
            r0 = 0
            int r7 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r7 == 0) goto L_0x00c4
            r7 = 1
            goto L_0x00c5
        L_0x00c4:
            r7 = 0
        L_0x00c5:
            r6.<init>(r7)
            goto L_0x0116
        L_0x00c9:
            e.a.a.a.y0.j.t.j r6 = new e.a.a.a.y0.j.t.j
            double r7 = r7.f8795m
            r6.<init>(r7)
            goto L_0x0116
        L_0x00d1:
            e.a.a.a.y0.j.t.m r6 = new e.a.a.a.y0.j.t.m
            float r7 = r7.f8794l
            r6.<init>(r7)
            goto L_0x0116
        L_0x00d9:
            long r6 = r7.f8793k
            if (r1 == 0) goto L_0x00e3
            e.a.a.a.y0.j.t.a0 r8 = new e.a.a.a.y0.j.t.a0
            r8.<init>(r6)
            goto L_0x00e8
        L_0x00e3:
            e.a.a.a.y0.j.t.u r8 = new e.a.a.a.y0.j.t.u
            r8.<init>(r6)
        L_0x00e8:
            r7 = r8
            goto L_0x0129
        L_0x00ea:
            long r6 = r7.f8793k
            int r6 = (int) r6
            if (r1 == 0) goto L_0x00f5
            e.a.a.a.y0.j.t.z r7 = new e.a.a.a.y0.j.t.z
            r7.<init>(r6)
            goto L_0x0129
        L_0x00f5:
            e.a.a.a.y0.j.t.n r7 = new e.a.a.a.y0.j.t.n
            r7.<init>(r6)
            goto L_0x0129
        L_0x00fb:
            long r6 = r7.f8793k
            int r6 = (int) r6
            short r6 = (short) r6
            if (r1 == 0) goto L_0x0107
            e.a.a.a.y0.j.t.b0 r7 = new e.a.a.a.y0.j.t.b0
            r7.<init>(r6)
            goto L_0x0129
        L_0x0107:
            e.a.a.a.y0.j.t.w r7 = new e.a.a.a.y0.j.t.w
            r7.<init>(r6)
            goto L_0x0129
        L_0x010d:
            e.a.a.a.y0.j.t.e r6 = new e.a.a.a.y0.j.t.e
            long r7 = r7.f8793k
            int r7 = (int) r7
            char r7 = (char) r7
            r6.<init>(r7)
        L_0x0116:
            r7 = r6
            goto L_0x0129
        L_0x0118:
            long r6 = r7.f8793k
            int r6 = (int) r6
            byte r6 = (byte) r6
            if (r1 == 0) goto L_0x0124
            e.a.a.a.y0.j.t.y r7 = new e.a.a.a.y0.j.t.y
            r7.<init>(r6)
            goto L_0x0129
        L_0x0124:
            e.a.a.a.y0.j.t.d r7 = new e.a.a.a.y0.j.t.d
            r7.<init>(r6)
        L_0x0129:
            return r7
        L_0x012a:
            java.lang.String r8 = "Unsupported annotation argument type: "
            java.lang.StringBuilder r8 = b.e.a.a.a.y(r8)
            e.a.a.a.y0.e.b$b$c$c r7 = r7.f8792j
            r8.append(r7)
            java.lang.String r7 = " (expected "
            r8.append(r7)
            r8.append(r6)
            r6 = 41
            r8.append(r6)
            java.lang.String r6 = r8.toString()
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r6 = r6.toString()
            r7.<init>(r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: e.a.a.a.y0.k.b.e.c(e.a.a.a.y0.m.d0, e.a.a.a.y0.e.b$b$c, e.a.a.a.y0.e.z.c):e.a.a.a.y0.j.t.g");
    }
}
