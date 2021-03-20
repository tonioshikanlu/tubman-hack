package e.a.a.a.y0.d.b;

import e.a.a.a.y0.b.e;
import e.a.a.a.y0.b.k;
import e.a.a.a.y0.b.y;
import e.a.a.a.y0.f.b;
import e.a.a.a.y0.f.d;
import e.a.a.a.y0.f.f;
import e.c0.h;
import e.x.c.i;

public final class v {
    public static final String a(e eVar, s<?> sVar) {
        i.e(eVar, "klass");
        i.e(sVar, "typeMappingConfiguration");
        String e2 = sVar.e(eVar);
        if (e2 != null) {
            return e2;
        }
        k b2 = eVar.b();
        i.d(b2, "klass.containingDeclaration");
        d name = eVar.getName();
        d dVar = f.a;
        if (name == null || name.f9211i) {
            name = f.c;
        }
        e eVar2 = null;
        if (name != null) {
            i.d(name, "SpecialNames.safeIdentifier(klass.name)");
            String h2 = name.h();
            i.d(h2, "SpecialNames.safeIdentifier(klass.name).identifier");
            if (b2 instanceof y) {
                b e3 = ((y) b2).e();
                if (e3.d()) {
                    return h2;
                }
                StringBuilder sb = new StringBuilder();
                String b3 = e3.b();
                i.d(b3, "fqName.asString()");
                sb.append(h.v(b3, '.', '/', false, 4));
                sb.append('/');
                sb.append(h2);
                return sb.toString();
            }
            if (b2 instanceof e) {
                eVar2 = b2;
            }
            e eVar3 = eVar2;
            if (eVar3 != null) {
                String a = sVar.a(eVar3);
                if (a == null) {
                    a = a(eVar3, sVar);
                }
                return a + '$' + h2;
            }
            throw new IllegalArgumentException("Unexpected container: " + b2 + " for " + eVar);
        }
        f.a(0);
        throw null;
    }

    /* JADX WARNING: type inference failed for: r5v9, types: [e.a.a.a.y0.b.k, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0190, code lost:
        if (r7 != false) goto L_0x01a9;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0128  */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <T> java.lang.Object b(e.a.a.a.y0.m.d0 r19, e.a.a.a.y0.d.b.i r20, e.a.a.a.y0.d.b.u r21, e.a.a.a.y0.d.b.s r22, e.x.b.q r23) {
        /*
            r0 = r19
            r1 = r20
            r2 = r21
            r3 = r22
            r4 = r23
            e.a.a.a.y0.m.l1.o r5 = e.a.a.a.y0.m.l1.o.a
            java.lang.String r6 = "kotlinType"
            e.x.c.i.e(r0, r6)
            java.lang.String r6 = "factory"
            e.x.c.i.e(r1, r6)
            java.lang.String r6 = "mode"
            e.x.c.i.e(r2, r6)
            java.lang.String r7 = "typeMappingConfiguration"
            e.x.c.i.e(r3, r7)
            java.lang.String r7 = "writeGenericType"
            e.x.c.i.e(r4, r7)
            e.a.a.a.y0.m.d0 r7 = r3.b(r0)
            if (r7 == 0) goto L_0x0030
            java.lang.Object r0 = b(r7, r1, r2, r3, r4)
            return r0
        L_0x0030:
            boolean r7 = e.a.a.a.y0.a.f.h(r19)
            if (r7 == 0) goto L_0x00c6
            boolean r5 = r22.c()
            e.a.a.a.y0.b.c1.b0 r6 = e.a.a.a.y0.a.l.a
            java.lang.String r6 = "suspendFunType"
            e.x.c.i.e(r0, r6)
            e.a.a.a.y0.a.f.h(r19)
            e.a.a.a.y0.a.g r7 = e.a.a.a.y0.m.o1.c.D(r19)
            e.a.a.a.y0.b.a1.h r8 = r19.k()
            e.a.a.a.y0.m.d0 r9 = e.a.a.a.y0.a.f.d(r19)
            java.util.List r6 = e.a.a.a.y0.a.f.f(r19)
            java.util.ArrayList r10 = new java.util.ArrayList
            r11 = 10
            int r11 = b.q.a.a.C(r6, r11)
            r10.<init>(r11)
            java.util.Iterator r6 = r6.iterator()
        L_0x0063:
            boolean r11 = r6.hasNext()
            if (r11 == 0) goto L_0x0077
            java.lang.Object r11 = r6.next()
            e.a.a.a.y0.m.y0 r11 = (e.a.a.a.y0.m.y0) r11
            e.a.a.a.y0.m.d0 r11 = r11.d()
            r10.add(r11)
            goto L_0x0063
        L_0x0077:
            e.a.a.a.y0.b.a1.h$a r6 = e.a.a.a.y0.b.a1.h.f7785e
            java.util.Objects.requireNonNull(r6)
            e.a.a.a.y0.b.a1.h r11 = e.a.a.a.y0.b.a1.h.a.a
            if (r5 == 0) goto L_0x0083
            e.a.a.a.y0.b.c1.b0 r5 = e.a.a.a.y0.a.l.f7684b
            goto L_0x0085
        L_0x0083:
            e.a.a.a.y0.b.c1.b0 r5 = e.a.a.a.y0.a.l.a
        L_0x0085:
            e.a.a.a.y0.m.v0 r12 = r5.p()
            java.lang.String r5 = "if (isReleaseCoroutines)…ERIMENTAL.typeConstructor"
            e.x.c.i.d(r12, r5)
            e.a.a.a.y0.m.d0 r5 = e.a.a.a.y0.a.f.e(r19)
            e.a.a.a.y0.m.y0 r5 = e.a.a.a.y0.m.o1.c.j(r5)
            java.util.List r13 = b.q.a.a.l2(r5)
            r14 = 0
            r15 = 0
            r16 = 16
            e.a.a.a.y0.m.k0 r5 = e.a.a.a.y0.m.e0.g(r11, r12, r13, r14, r15, r16)
            java.util.List r10 = e.t.g.J(r10, r5)
            r11 = 0
            e.a.a.a.y0.a.g r5 = e.a.a.a.y0.m.o1.c.D(r19)
            e.a.a.a.y0.m.k0 r12 = r5.p()
            java.lang.String r5 = "suspendFunType.builtIns.nullableAnyType"
            e.x.c.i.d(r12, r5)
            r13 = 0
            e.a.a.a.y0.m.k0 r5 = e.a.a.a.y0.a.f.a(r7, r8, r9, r10, r11, r12, r13)
            boolean r0 = r19.X0()
            e.a.a.a.y0.m.k0 r0 = r5.a1(r0)
            java.lang.Object r0 = b(r0, r1, r2, r3, r4)
            return r0
        L_0x00c6:
            java.lang.String r7 = "$this$mapBuiltInType"
            e.x.c.i.e(r5, r7)
            java.lang.String r7 = "type"
            e.x.c.i.e(r0, r7)
            java.lang.String r8 = "typeFactory"
            e.x.c.i.e(r1, r8)
            e.x.c.i.e(r2, r6)
            e.a.a.a.y0.m.n1.k r6 = r5.o(r0)
            boolean r8 = r5.G(r6)
            r9 = 0
            java.lang.String r10 = "["
            r11 = 0
            r12 = 1
            if (r8 != 0) goto L_0x00e9
            goto L_0x01a9
        L_0x00e9:
            e.a.a.a.y0.a.i r8 = r5.E(r6)
            if (r8 == 0) goto L_0x012f
            e.a.a.a.y0.j.w.c r6 = e.a.a.a.y0.j.w.c.h(r8)
            java.lang.String r8 = "JvmPrimitiveType.get(primitiveType)"
            e.x.c.i.d(r6, r8)
            java.lang.String r6 = r6.j()
            java.lang.String r8 = "JvmPrimitiveType.get(primitiveType).desc"
            e.x.c.i.d(r6, r8)
            java.lang.Object r6 = r1.a(r6)
            boolean r8 = r5.r(r0)
            if (r8 != 0) goto L_0x0125
            e.a.a.a.y0.d.a.e0.b r8 = e.a.a.a.y0.d.a.e0.y.a
            java.lang.String r8 = "$this$hasEnhancedNullability"
            e.x.c.i.e(r5, r8)
            e.x.c.i.e(r0, r7)
            e.a.a.a.y0.f.b r7 = e.a.a.a.y0.d.a.t.f8582j
            java.lang.String r8 = "JvmAnnotationNames.ENHANCED_NULLABILITY_ANNOTATION"
            e.x.c.i.d(r7, r8)
            boolean r7 = r5.F(r0, r7)
            if (r7 == 0) goto L_0x0123
            goto L_0x0125
        L_0x0123:
            r7 = r11
            goto L_0x0126
        L_0x0125:
            r7 = r12
        L_0x0126:
            if (r7 == 0) goto L_0x012c
            java.lang.Object r6 = r1.d(r6)
        L_0x012c:
            r9 = r6
            goto L_0x01a9
        L_0x012f:
            e.a.a.a.y0.a.i r7 = r5.D(r6)
            if (r7 == 0) goto L_0x0152
            java.lang.StringBuilder r6 = b.e.a.a.a.y(r10)
            e.a.a.a.y0.j.w.c r7 = e.a.a.a.y0.j.w.c.h(r7)
            java.lang.String r8 = "JvmPrimitiveType.get(arrayElementType)"
            e.x.c.i.d(r7, r8)
            java.lang.String r7 = r7.j()
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            java.lang.Object r9 = r1.a(r6)
            goto L_0x01a9
        L_0x0152:
            boolean r7 = r5.H(r6)
            if (r7 == 0) goto L_0x01a9
            e.a.a.a.y0.f.c r6 = r5.C(r6)
            e.a.a.a.y0.a.p.c r7 = e.a.a.a.y0.a.p.c.f7720m
            e.a.a.a.y0.f.a r6 = r7.l(r6)
            if (r6 == 0) goto L_0x01a9
            boolean r7 = r2.f8654g
            if (r7 != 0) goto L_0x0193
            java.util.List<e.a.a.a.y0.a.p.c$a> r7 = e.a.a.a.y0.a.p.c.f7719l
            boolean r8 = r7 instanceof java.util.Collection
            if (r8 == 0) goto L_0x0175
            boolean r8 = r7.isEmpty()
            if (r8 == 0) goto L_0x0175
            goto L_0x018f
        L_0x0175:
            java.util.Iterator r7 = r7.iterator()
        L_0x0179:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L_0x018f
            java.lang.Object r8 = r7.next()
            e.a.a.a.y0.a.p.c$a r8 = (e.a.a.a.y0.a.p.c.a) r8
            e.a.a.a.y0.f.a r8 = r8.a
            boolean r8 = e.x.c.i.a(r8, r6)
            if (r8 == 0) goto L_0x0179
            r7 = r12
            goto L_0x0190
        L_0x018f:
            r7 = r11
        L_0x0190:
            if (r7 == 0) goto L_0x0193
            goto L_0x01a9
        L_0x0193:
            e.a.a.a.y0.j.w.b r6 = e.a.a.a.y0.j.w.b.b(r6)
            java.lang.String r7 = "JvmClassName.byClassId(classId)"
            e.x.c.i.d(r6, r7)
            java.lang.String r6 = r6.e()
            java.lang.String r7 = "JvmClassName.byClassId(classId).internalName"
            e.x.c.i.d(r6, r7)
            java.lang.Object r9 = r1.b(r6)
        L_0x01a9:
            if (r9 == 0) goto L_0x01b7
            boolean r3 = r2.a
            if (r3 == 0) goto L_0x01b3
            java.lang.Object r9 = r1.d(r9)
        L_0x01b3:
            r4.r(r0, r9, r2)
            return r9
        L_0x01b7:
            e.a.a.a.y0.m.v0 r6 = r19.W0()
            boolean r7 = r6 instanceof e.a.a.a.y0.m.b0
            if (r7 == 0) goto L_0x01d5
            e.a.a.a.y0.m.b0 r6 = (e.a.a.a.y0.m.b0) r6
            e.a.a.a.y0.m.d0 r0 = r6.a
            if (r0 == 0) goto L_0x01c6
            goto L_0x01cc
        L_0x01c6:
            java.util.LinkedHashSet<e.a.a.a.y0.m.d0> r0 = r6.f9648b
            e.a.a.a.y0.m.d0 r0 = r3.g(r0)
        L_0x01cc:
            e.a.a.a.y0.m.d0 r0 = e.a.a.a.y0.m.o1.c.Z(r0)
            java.lang.Object r0 = b(r0, r1, r2, r3, r4)
            return r0
        L_0x01d5:
            e.a.a.a.y0.b.h r6 = r6.d()
            if (r6 == 0) goto L_0x0342
            java.lang.String r7 = "constructor.declarationD…structor of $kotlinType\")"
            e.x.c.i.d(r6, r7)
            boolean r7 = e.a.a.a.y0.m.w.j(r6)
            if (r7 == 0) goto L_0x01f2
            java.lang.String r2 = "error/NonExistentClass"
            java.lang.Object r1 = r1.b(r2)
            e.a.a.a.y0.b.e r6 = (e.a.a.a.y0.b.e) r6
            r3.f(r0, r6)
            return r1
        L_0x01f2:
            boolean r7 = r6 instanceof e.a.a.a.y0.b.e
            if (r7 == 0) goto L_0x0273
            boolean r8 = e.a.a.a.y0.a.g.A(r19)
            if (r8 == 0) goto L_0x0273
            java.util.List r5 = r19.V0()
            int r5 = r5.size()
            if (r5 != r12) goto L_0x026b
            java.util.List r0 = r19.V0()
            java.lang.Object r0 = r0.get(r11)
            e.a.a.a.y0.m.y0 r0 = (e.a.a.a.y0.m.y0) r0
            e.a.a.a.y0.m.d0 r5 = r0.d()
            java.lang.String r6 = "memberProjection.type"
            e.x.c.i.d(r5, r6)
            e.a.a.a.y0.m.j1 r6 = r0.b()
            e.a.a.a.y0.m.j1 r7 = e.a.a.a.y0.m.j1.IN_VARIANCE
            if (r6 != r7) goto L_0x0228
            java.lang.String r0 = "java/lang/Object"
            java.lang.Object r0 = r1.b(r0)
            goto L_0x0257
        L_0x0228:
            e.a.a.a.y0.m.j1 r0 = r0.b()
            java.lang.String r6 = "memberProjection.projectionKind"
            e.x.c.i.d(r0, r6)
            java.lang.String r6 = "effectiveVariance"
            e.x.c.i.e(r0, r6)
            boolean r6 = r2.c
            if (r6 == 0) goto L_0x023b
            goto L_0x0252
        L_0x023b:
            int r0 = r0.ordinal()
            if (r0 == 0) goto L_0x024d
            if (r0 == r12) goto L_0x0248
            e.a.a.a.y0.d.b.u r0 = r2.f
            if (r0 == 0) goto L_0x0252
            goto L_0x0253
        L_0x0248:
            e.a.a.a.y0.d.b.u r0 = r2.f8655h
            if (r0 == 0) goto L_0x0252
            goto L_0x0253
        L_0x024d:
            e.a.a.a.y0.d.b.u r0 = r2.f8656i
            if (r0 == 0) goto L_0x0252
            goto L_0x0253
        L_0x0252:
            r0 = r2
        L_0x0253:
            java.lang.Object r0 = b(r5, r1, r0, r3, r4)
        L_0x0257:
            java.lang.StringBuilder r2 = b.e.a.a.a.y(r10)
            java.lang.String r0 = r1.c(r0)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            java.lang.Object r0 = r1.a(r0)
            return r0
        L_0x026b:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "arrays must have one type argument"
            r0.<init>(r1)
            throw r0
        L_0x0273:
            if (r7 == 0) goto L_0x0307
            e.a.a.a.y0.b.e r6 = (e.a.a.a.y0.b.e) r6
            boolean r7 = r6.l()
            if (r7 == 0) goto L_0x02ba
            boolean r7 = r2.f8652b
            if (r7 != 0) goto L_0x02ba
            java.lang.String r7 = "$this$computeExpandedTypeForInlineClass"
            e.x.c.i.e(r5, r7)
            java.lang.String r7 = "inlineClassType"
            e.x.c.i.e(r0, r7)
            java.util.HashSet r7 = new java.util.HashSet
            r7.<init>()
            e.a.a.a.y0.m.n1.g r5 = b.q.a.a.G(r5, r0, r7)
            e.a.a.a.y0.m.d0 r5 = (e.a.a.a.y0.m.d0) r5
            if (r5 == 0) goto L_0x02ba
            e.a.a.a.y0.d.b.u r0 = new e.a.a.a.y0.d.b.u
            boolean r8 = r2.a
            boolean r10 = r2.c
            boolean r11 = r2.d
            boolean r12 = r2.f8653e
            e.a.a.a.y0.d.b.u r13 = r2.f
            boolean r14 = r2.f8654g
            e.a.a.a.y0.d.b.u r15 = r2.f8655h
            e.a.a.a.y0.d.b.u r2 = r2.f8656i
            r9 = 1
            r17 = 0
            r18 = 512(0x200, float:7.175E-43)
            r7 = r0
            r16 = r2
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            java.lang.Object r0 = b(r5, r1, r0, r3, r4)
            return r0
        L_0x02ba:
            boolean r5 = r2.c
            if (r5 == 0) goto L_0x02cd
            e.a.a.a.y0.a.g$d r5 = e.a.a.a.y0.a.g.f7647k
            e.a.a.a.y0.f.c r5 = r5.W
            boolean r5 = e.a.a.a.y0.a.g.c(r6, r5)
            if (r5 == 0) goto L_0x02cd
            java.lang.Object r1 = r20.e()
            goto L_0x0303
        L_0x02cd:
            e.a.a.a.y0.b.e r5 = r6.a()
            java.lang.String r7 = "descriptor.original"
            e.x.c.i.d(r5, r7)
            java.lang.Object r5 = r3.d(r5)
            if (r5 == 0) goto L_0x02de
            r1 = r5
            goto L_0x0303
        L_0x02de:
            e.a.a.a.y0.b.f r5 = r6.i()
            e.a.a.a.y0.b.f r7 = e.a.a.a.y0.b.f.ENUM_ENTRY
            if (r5 != r7) goto L_0x02f2
            e.a.a.a.y0.b.k r5 = r6.b()
            java.lang.String r6 = "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor"
            java.util.Objects.requireNonNull(r5, r6)
            r6 = r5
            e.a.a.a.y0.b.e r6 = (e.a.a.a.y0.b.e) r6
        L_0x02f2:
            e.a.a.a.y0.b.e r5 = r6.a()
            java.lang.String r6 = "enumClassIfEnumEntry.original"
            e.x.c.i.d(r5, r6)
            java.lang.String r3 = a(r5, r3)
            java.lang.Object r1 = r1.b(r3)
        L_0x0303:
            r4.r(r0, r1, r2)
            return r1
        L_0x0307:
            boolean r5 = r6 instanceof e.a.a.a.y0.b.r0
            if (r5 == 0) goto L_0x0318
            e.a.a.a.y0.b.r0 r6 = (e.a.a.a.y0.b.r0) r6
            e.a.a.a.y0.m.d0 r0 = e.a.a.a.y0.m.o1.c.G(r6)
            e.x.b.q<java.lang.Object, java.lang.Object, java.lang.Object, e.r> r4 = e.a.a.a.y0.o.g.f9808b
            java.lang.Object r0 = b(r0, r1, r2, r3, r4)
            return r0
        L_0x0318:
            boolean r5 = r6 instanceof e.a.a.a.y0.b.q0
            if (r5 == 0) goto L_0x032b
            boolean r5 = r2.f8657j
            if (r5 == 0) goto L_0x032b
            e.a.a.a.y0.b.q0 r6 = (e.a.a.a.y0.b.q0) r6
            e.a.a.a.y0.m.k0 r0 = r6.F0()
            java.lang.Object r0 = b(r0, r1, r2, r3, r4)
            return r0
        L_0x032b:
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Unknown type "
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
        L_0x0342:
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "no descriptor for type constructor of "
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: e.a.a.a.y0.d.b.v.b(e.a.a.a.y0.m.d0, e.a.a.a.y0.d.b.i, e.a.a.a.y0.d.b.u, e.a.a.a.y0.d.b.s, e.x.b.q):java.lang.Object");
    }
}
