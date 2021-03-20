package e.a.a.a.y0.m;

import b.q.a.a;
import com.segment.analytics.integrations.BasePayload;
import e.a.a.a.y0.b.e;
import e.a.a.a.y0.m.g;
import e.a.a.a.y0.m.n1.b;
import e.a.a.a.y0.m.n1.h;
import e.a.a.a.y0.m.n1.k;
import e.a.a.a.y0.o.l;
import e.t.o;
import e.x.c.i;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public final class f {
    public static final f a = new f();

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v32, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v8, resolved type: e.a.a.a.y0.m.d0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v17, resolved type: e.a.a.a.y0.m.d0} */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x018e, code lost:
        if (((e.a.a.a.y0.m.l1.h) r3).f9707n != false) goto L_0x0210;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x02ae A[LOOP:2: B:98:0x026e->B:114:0x02ae, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x02f1  */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x033a  */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x0343  */
    /* JADX WARNING: Removed duplicated region for block: B:299:0x02a9 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x013e  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0147  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean f(e.a.a.a.y0.m.f r25, e.a.a.a.y0.m.g r26, e.a.a.a.y0.m.n1.g r27, e.a.a.a.y0.m.n1.g r28, boolean r29, int r30) {
        /*
            r0 = r26
            r1 = r27
            r2 = r28
            java.lang.String r3 = "context"
            e.x.c.i.e(r0, r3)
            java.lang.String r4 = "subType"
            e.x.c.i.e(r1, r4)
            java.lang.String r5 = "superType"
            e.x.c.i.e(r2, r5)
            if (r1 != r2) goto L_0x0019
            goto L_0x0628
        L_0x0019:
            e.a.a.a.y0.m.f r12 = a
            e.a.a.a.y0.m.n1.g r1 = r26.Q(r27)
            e.a.a.a.y0.m.n1.g r1 = r0.P(r1)
            e.a.a.a.y0.m.n1.g r2 = r0.Q(r2)
            e.a.a.a.y0.m.n1.g r2 = r0.P(r2)
            java.lang.Boolean r13 = java.lang.Boolean.TRUE
            e.a.a.a.y0.m.n1.h r14 = r0.n(r1)
            e.a.a.a.y0.m.n1.h r15 = r0.e(r2)
            r11 = r0
            e.a.a.a.y0.m.l1.b r11 = (e.a.a.a.y0.m.l1.b) r11
            boolean r6 = r11.X(r14)
            r16 = 0
            java.lang.String r10 = ", "
            java.lang.String r9 = "ClassicTypeSystemContext couldn't handle: "
            if (r6 != 0) goto L_0x0101
            boolean r6 = r11.X(r15)
            if (r6 == 0) goto L_0x004c
            goto L_0x0101
        L_0x004c:
            r11.b0(r14)
            r11.b0(r15)
            java.lang.String r6 = "$this$asCapturedType"
            e.x.c.i.e(r15, r6)
            e.x.c.i.e(r15, r6)
            boolean r6 = r15 instanceof e.a.a.a.y0.m.k0
            if (r6 == 0) goto L_0x00ed
            boolean r6 = r15 instanceof e.a.a.a.y0.m.l1.h
            if (r6 != 0) goto L_0x0065
            r6 = r16
            goto L_0x0066
        L_0x0065:
            r6 = r15
        L_0x0066:
            e.a.a.a.y0.m.l1.h r6 = (e.a.a.a.y0.m.l1.h) r6
            if (r6 == 0) goto L_0x0077
            java.lang.String r7 = "$this$lowerType"
            e.x.c.i.e(r6, r7)
            e.x.c.i.e(r6, r7)
            e.a.a.a.y0.m.i1 r7 = r6.f9704k
            r17 = r7
            goto L_0x0079
        L_0x0077:
            r17 = r16
        L_0x0079:
            if (r6 == 0) goto L_0x00a2
            if (r17 == 0) goto L_0x00a2
            e.x.c.i.e(r14, r4)
            e.x.c.i.e(r6, r5)
            r18 = 0
            r19 = 8
            r6 = r12
            r7 = r11
            r8 = r14
            r20 = r9
            r9 = r17
            r25 = r13
            r13 = r10
            r10 = r18
            r29 = r5
            r5 = r11
            r11 = r19
            boolean r6 = f(r6, r7, r8, r9, r10, r11)
            if (r6 == 0) goto L_0x00aa
            r6 = r20
            goto L_0x010c
        L_0x00a2:
            r29 = r5
            r20 = r9
            r5 = r11
            r25 = r13
            r13 = r10
        L_0x00aa:
            e.a.a.a.y0.m.n1.k r6 = r5.d(r15)
            boolean r7 = r5.Z(r6)
            if (r7 == 0) goto L_0x00e7
            r5.f(r15)
            java.util.Collection r6 = r5.e0(r6)
            boolean r7 = r6.isEmpty()
            if (r7 == 0) goto L_0x00c2
            goto L_0x00e1
        L_0x00c2:
            java.util.Iterator r15 = r6.iterator()
        L_0x00c6:
            boolean r6 = r15.hasNext()
            if (r6 == 0) goto L_0x00e1
            java.lang.Object r6 = r15.next()
            r9 = r6
            e.a.a.a.y0.m.n1.g r9 = (e.a.a.a.y0.m.n1.g) r9
            r10 = 0
            r11 = 8
            r6 = r12
            r7 = r5
            r8 = r14
            boolean r6 = f(r6, r7, r8, r9, r10, r11)
            if (r6 != 0) goto L_0x00c6
            r6 = 0
            goto L_0x00e2
        L_0x00e1:
            r6 = 1
        L_0x00e2:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            goto L_0x00e9
        L_0x00e7:
            r6 = r16
        L_0x00e9:
            r7 = r6
            r6 = r20
            goto L_0x013c
        L_0x00ed:
            r6 = r9
            r13 = r10
            java.lang.StringBuilder r0 = b.e.a.a.a.D(r6, r15, r13)
            java.lang.String r0 = b.e.a.a.a.t(r15, r0)
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        L_0x0101:
            r29 = r5
            r6 = r9
            r5 = r11
            r25 = r13
            r13 = r10
            boolean r7 = r5.f9699e
            if (r7 == 0) goto L_0x010f
        L_0x010c:
            r7 = r25
            goto L_0x013c
        L_0x010f:
            boolean r7 = r5.f(r14)
            if (r7 == 0) goto L_0x011e
            boolean r7 = r5.f(r15)
            if (r7 != 0) goto L_0x011e
            java.lang.Boolean r7 = java.lang.Boolean.FALSE
            goto L_0x013c
        L_0x011e:
            r7 = 0
            e.a.a.a.y0.m.n1.h r8 = r5.g(r14, r7)
            e.a.a.a.y0.m.n1.h r7 = r5.g(r15, r7)
            e.x.c.i.e(r5, r3)
            java.lang.String r9 = "a"
            e.x.c.i.e(r8, r9)
            java.lang.String r9 = "b"
            e.x.c.i.e(r7, r9)
            boolean r7 = e.a.a.a.y0.m.d.b(r5, r8, r7)
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)
        L_0x013c:
            if (r7 == 0) goto L_0x0147
            boolean r3 = r7.booleanValue()
            r0.C(r1, r2)
            goto L_0x06f9
        L_0x0147:
            r0.C(r1, r2)
            e.a.a.a.y0.m.n1.h r1 = r0.n(r1)
            e.a.a.a.y0.m.n1.h r2 = r0.e(r2)
            e.a.a.a.y0.m.g$a$c r7 = e.a.a.a.y0.m.g.a.c.a
            e.a.a.a.y0.m.g$a$b r8 = e.a.a.a.y0.m.g.a.b.a
            e.x.c.i.e(r0, r3)
            e.x.c.i.e(r1, r4)
            r3 = r29
            e.x.c.i.e(r2, r3)
            boolean r3 = r5.f(r2)
            java.lang.String r9 = "current"
            java.lang.String r10 = ". Supertypes = "
            java.lang.String r11 = "Too many supertypes for type: "
            if (r3 == 0) goto L_0x016f
            goto L_0x0210
        L_0x016f:
            boolean r3 = r5.L(r1)
            if (r3 == 0) goto L_0x0177
            goto L_0x0210
        L_0x0177:
            boolean r3 = r1 instanceof e.a.a.a.y0.m.n1.c
            if (r3 == 0) goto L_0x01b9
            r3 = r1
            e.a.a.a.y0.m.n1.c r3 = (e.a.a.a.y0.m.n1.c) r3
            java.lang.String r14 = "$this$isProjectionNotNull"
            e.x.c.i.e(r3, r14)
            e.x.c.i.e(r3, r14)
            boolean r14 = r3 instanceof e.a.a.a.y0.m.l1.h
            if (r14 == 0) goto L_0x0192
            e.a.a.a.y0.m.l1.h r3 = (e.a.a.a.y0.m.l1.h) r3
            boolean r3 = r3.f9707n
            if (r3 == 0) goto L_0x01b9
            goto L_0x0210
        L_0x0192:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r6)
            r0.append(r3)
            r0.append(r13)
            java.lang.Class r1 = r3.getClass()
            e.a.e r1 = e.x.c.v.a(r1)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        L_0x01b9:
            boolean r3 = e.a.a.a.y0.m.c.a(r5, r1, r8)
            if (r3 == 0) goto L_0x01c0
            goto L_0x0210
        L_0x01c0:
            boolean r3 = r5.L(r2)
            if (r3 == 0) goto L_0x01c7
            goto L_0x01d6
        L_0x01c7:
            e.a.a.a.y0.m.g$a$d r3 = e.a.a.a.y0.m.g.a.d.a
            boolean r3 = e.a.a.a.y0.m.c.a(r5, r2, r3)
            if (r3 == 0) goto L_0x01d0
            goto L_0x01d6
        L_0x01d0:
            boolean r3 = r5.K(r1)
            if (r3 == 0) goto L_0x01dc
        L_0x01d6:
            r20 = r6
            r27 = r8
            goto L_0x02ec
        L_0x01dc:
            e.a.a.a.y0.m.n1.k r3 = r5.d(r2)
            java.lang.String r14 = "$this$hasPathByNotMarkedNullableNodes"
            e.x.c.i.e(r5, r14)
            java.lang.String r14 = "start"
            e.x.c.i.e(r1, r14)
            java.lang.String r14 = "end"
            e.x.c.i.e(r3, r14)
            boolean r14 = r5.a0(r1)
            if (r14 == 0) goto L_0x01f7
            r14 = 1
            goto L_0x020e
        L_0x01f7:
            boolean r14 = r5.f(r1)
            if (r14 == 0) goto L_0x01ff
            r14 = 0
            goto L_0x020e
        L_0x01ff:
            boolean r14 = r5.f
            if (r14 == 0) goto L_0x0206
            r5.b0(r1)
        L_0x0206:
            e.a.a.a.y0.m.n1.k r14 = r5.d(r1)
            boolean r14 = r5.b(r14, r3)
        L_0x020e:
            if (r14 == 0) goto L_0x0216
        L_0x0210:
            r20 = r6
            r27 = r8
            goto L_0x02ac
        L_0x0216:
            r5.J()
            java.util.ArrayDeque<e.a.a.a.y0.m.n1.h> r14 = r5.c
            e.x.c.i.c(r14)
            java.util.Set<e.a.a.a.y0.m.n1.h> r15 = r5.d
            e.x.c.i.c(r15)
            r14.push(r1)
        L_0x0226:
            boolean r17 = r14.isEmpty()
            r17 = r17 ^ 1
            if (r17 == 0) goto L_0x02e5
            r27 = r8
            int r8 = r15.size()
            r20 = r6
            r6 = 1000(0x3e8, float:1.401E-42)
            if (r8 > r6) goto L_0x02bc
            java.lang.Object r6 = r14.pop()
            e.a.a.a.y0.m.n1.h r6 = (e.a.a.a.y0.m.n1.h) r6
            e.x.c.i.d(r6, r9)
            boolean r8 = r15.add(r6)
            if (r8 != 0) goto L_0x024b
            goto L_0x02b6
        L_0x024b:
            boolean r8 = r5.f(r6)
            if (r8 == 0) goto L_0x0253
            r8 = r7
            goto L_0x0255
        L_0x0253:
            r8 = r27
        L_0x0255:
            boolean r17 = e.x.c.i.a(r8, r7)
            r17 = r17 ^ 1
            if (r17 == 0) goto L_0x025e
            goto L_0x0260
        L_0x025e:
            r8 = r16
        L_0x0260:
            if (r8 == 0) goto L_0x02b6
            e.a.a.a.y0.m.n1.k r6 = r5.d(r6)
            java.util.Collection r6 = r5.e0(r6)
            java.util.Iterator r6 = r6.iterator()
        L_0x026e:
            boolean r17 = r6.hasNext()
            if (r17 == 0) goto L_0x02b6
            java.lang.Object r17 = r6.next()
            r28 = r6
            r6 = r17
            e.a.a.a.y0.m.n1.g r6 = (e.a.a.a.y0.m.n1.g) r6
            e.a.a.a.y0.m.n1.h r6 = r8.a(r5, r6)
            boolean r17 = r5.a0(r6)
            if (r17 == 0) goto L_0x028b
            r17 = 1
            goto L_0x0293
        L_0x028b:
            boolean r17 = r5.f(r6)
            if (r17 == 0) goto L_0x0296
            r17 = 0
        L_0x0293:
            r29 = r8
            goto L_0x02a7
        L_0x0296:
            r29 = r8
            boolean r8 = r5.f
            if (r8 == 0) goto L_0x029f
            r5.b0(r6)
        L_0x029f:
            e.a.a.a.y0.m.n1.k r8 = r5.d(r6)
            boolean r17 = r5.b(r8, r3)
        L_0x02a7:
            if (r17 == 0) goto L_0x02ae
            r5.E()
        L_0x02ac:
            r3 = 1
            goto L_0x02ed
        L_0x02ae:
            r14.add(r6)
            r6 = r28
            r8 = r29
            goto L_0x026e
        L_0x02b6:
            r8 = r27
            r6 = r20
            goto L_0x0226
        L_0x02bc:
            java.lang.StringBuilder r0 = b.e.a.a.a.D(r11, r1, r10)
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 63
            r17 = r15
            java.lang.String r1 = e.t.g.x(r17, r18, r19, r20, r21, r22, r23, r24)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        L_0x02e5:
            r20 = r6
            r27 = r8
            r5.E()
        L_0x02ec:
            r3 = 0
        L_0x02ed:
            if (r3 != 0) goto L_0x02f1
            goto L_0x06f8
        L_0x02f1:
            e.a.a.a.y0.m.n1.h r3 = r0.n(r1)
            e.a.a.a.y0.m.n1.h r6 = r0.e(r2)
            boolean r8 = r0.O(r3)
            if (r8 != 0) goto L_0x0306
            boolean r8 = r0.O(r6)
            if (r8 != 0) goto L_0x0306
            goto L_0x0336
        L_0x0306:
            e.a.a.a.y0.m.e r8 = new e.a.a.a.y0.m.e
            r8.<init>(r0)
            boolean r14 = r0.O(r3)
            if (r14 == 0) goto L_0x0318
            boolean r14 = r0.O(r6)
            if (r14 == 0) goto L_0x0318
            goto L_0x0333
        L_0x0318:
            boolean r14 = r0.O(r3)
            if (r14 == 0) goto L_0x0326
            r14 = 0
            boolean r3 = r8.a(r3, r6, r14)
            if (r3 == 0) goto L_0x0336
            goto L_0x0333
        L_0x0326:
            boolean r14 = r0.O(r6)
            if (r14 == 0) goto L_0x0336
            r14 = 1
            boolean r3 = r8.a(r6, r3, r14)
            if (r3 == 0) goto L_0x0336
        L_0x0333:
            r3 = r25
            goto L_0x0338
        L_0x0336:
            r3 = r16
        L_0x0338:
            if (r3 == 0) goto L_0x0343
            boolean r3 = r3.booleanValue()
            r0.C(r1, r2)
            goto L_0x06f9
        L_0x0343:
            e.a.a.a.y0.m.n1.k r3 = r5.d(r2)
            e.a.a.a.y0.m.n1.k r6 = r5.d(r1)
            boolean r6 = r5.b(r6, r3)
            if (r6 == 0) goto L_0x0359
            int r6 = r5.c0(r3)
            if (r6 != 0) goto L_0x0359
            goto L_0x0628
        L_0x0359:
            e.a.a.a.y0.m.n1.k r6 = r5.d(r2)
            java.lang.String r8 = "$this$isAnyConstructor"
            e.x.c.i.e(r6, r8)
            e.x.c.i.e(r6, r8)
            boolean r8 = r6 instanceof e.a.a.a.y0.m.v0
            if (r8 == 0) goto L_0x06fa
            e.a.a.a.y0.m.v0 r6 = (e.a.a.a.y0.m.v0) r6
            e.a.a.a.y0.a.g$d r8 = e.a.a.a.y0.a.g.f7647k
            e.a.a.a.y0.f.c r8 = r8.a
            boolean r6 = e.a.a.a.y0.a.g.M(r6, r8)
            if (r6 == 0) goto L_0x0377
            goto L_0x0628
        L_0x0377:
            java.lang.String r6 = "$this$findCorrespondingSupertypes"
            e.x.c.i.e(r0, r6)
            e.x.c.i.e(r1, r4)
            java.lang.String r4 = "superConstructor"
            e.x.c.i.e(r3, r4)
            boolean r4 = r0.K(r1)
            if (r4 == 0) goto L_0x0390
            java.util.List r4 = r12.b(r0, r1, r3)
            goto L_0x0465
        L_0x0390:
            boolean r4 = r5.W(r3)
            if (r4 != 0) goto L_0x03a7
            java.lang.String r4 = "$this$isIntegerLiteralTypeConstructor"
            e.x.c.i.e(r3, r4)
            boolean r4 = b.q.a.a.P1(r3)
            if (r4 != 0) goto L_0x03a7
            java.util.List r4 = r12.a(r0, r1, r3)
            goto L_0x0465
        L_0x03a7:
            e.a.a.a.y0.o.l r4 = new e.a.a.a.y0.o.l
            r4.<init>()
            r26.J()
            java.util.ArrayDeque<e.a.a.a.y0.m.n1.h> r6 = r0.c
            e.x.c.i.c(r6)
            java.util.Set<e.a.a.a.y0.m.n1.h> r8 = r0.d
            e.x.c.i.c(r8)
            r6.push(r1)
        L_0x03bc:
            boolean r13 = r6.isEmpty()
            r13 = r13 ^ 1
            if (r13 == 0) goto L_0x043f
            int r13 = r8.size()
            r14 = 1000(0x3e8, float:1.401E-42)
            if (r13 > r14) goto L_0x0416
            java.lang.Object r13 = r6.pop()
            e.a.a.a.y0.m.n1.h r13 = (e.a.a.a.y0.m.n1.h) r13
            e.x.c.i.d(r13, r9)
            boolean r14 = r8.add(r13)
            if (r14 != 0) goto L_0x03dc
            goto L_0x03bc
        L_0x03dc:
            boolean r14 = r0.K(r13)
            if (r14 == 0) goto L_0x03e7
            r4.add(r13)
            r14 = r7
            goto L_0x03e9
        L_0x03e7:
            r14 = r27
        L_0x03e9:
            boolean r15 = e.x.c.i.a(r14, r7)
            r15 = r15 ^ 1
            if (r15 == 0) goto L_0x03f2
            goto L_0x03f4
        L_0x03f2:
            r14 = r16
        L_0x03f4:
            if (r14 == 0) goto L_0x03bc
            e.a.a.a.y0.m.n1.k r13 = r5.d(r13)
            java.util.Collection r13 = r5.e0(r13)
            java.util.Iterator r13 = r13.iterator()
        L_0x0402:
            boolean r15 = r13.hasNext()
            if (r15 == 0) goto L_0x03bc
            java.lang.Object r15 = r13.next()
            e.a.a.a.y0.m.n1.g r15 = (e.a.a.a.y0.m.n1.g) r15
            e.a.a.a.y0.m.n1.h r15 = r14.a(r0, r15)
            r6.add(r15)
            goto L_0x0402
        L_0x0416:
            java.lang.StringBuilder r0 = b.e.a.a.a.D(r11, r1, r10)
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 63
            r17 = r8
            java.lang.String r1 = e.t.g.x(r17, r18, r19, r20, r21, r22, r23, r24)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        L_0x043f:
            r26.E()
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.Iterator r4 = r4.iterator()
        L_0x044b:
            boolean r8 = r4.hasNext()
            if (r8 == 0) goto L_0x0464
            java.lang.Object r8 = r4.next()
            e.a.a.a.y0.m.n1.h r8 = (e.a.a.a.y0.m.n1.h) r8
            java.lang.String r13 = "it"
            e.x.c.i.d(r8, r13)
            java.util.List r8 = r12.b(r0, r8, r3)
            e.t.g.b(r6, r8)
            goto L_0x044b
        L_0x0464:
            r4 = r6
        L_0x0465:
            int r6 = r4.size()
            if (r6 == 0) goto L_0x063b
            r7 = 1
            if (r6 == r7) goto L_0x062b
            e.a.a.a.y0.m.n1.a r6 = new e.a.a.a.y0.m.n1.a
            int r7 = r5.c0(r3)
            r6.<init>(r7)
            int r7 = r5.c0(r3)
            r8 = 0
            r9 = 0
        L_0x047d:
            if (r9 >= r7) goto L_0x05fd
            if (r8 != 0) goto L_0x0490
            e.a.a.a.y0.m.n1.l r8 = r5.U(r3, r9)
            e.a.a.a.y0.m.n1.o r8 = r5.V(r8)
            e.a.a.a.y0.m.n1.o r10 = e.a.a.a.y0.m.n1.o.OUT
            if (r8 == r10) goto L_0x048e
            goto L_0x0490
        L_0x048e:
            r8 = 0
            goto L_0x0491
        L_0x0490:
            r8 = 1
        L_0x0491:
            if (r8 == 0) goto L_0x049b
            r25 = r3
            r27 = r7
            r28 = r8
            goto L_0x05e7
        L_0x049b:
            java.util.ArrayList r10 = new java.util.ArrayList
            r11 = 10
            int r11 = b.q.a.a.C(r4, r11)
            r10.<init>(r11)
            java.util.Iterator r11 = r4.iterator()
        L_0x04aa:
            boolean r13 = r11.hasNext()
            if (r13 == 0) goto L_0x0507
            java.lang.Object r13 = r11.next()
            e.a.a.a.y0.m.n1.h r13 = (e.a.a.a.y0.m.n1.h) r13
            e.a.a.a.y0.m.n1.j r14 = r0.H(r13, r9)
            if (r14 == 0) goto L_0x04dc
            e.a.a.a.y0.m.n1.o r15 = r5.p(r14)
            r25 = r3
            e.a.a.a.y0.m.n1.o r3 = e.a.a.a.y0.m.n1.o.INV
            if (r15 != r3) goto L_0x04c8
            r3 = 1
            goto L_0x04c9
        L_0x04c8:
            r3 = 0
        L_0x04c9:
            if (r3 == 0) goto L_0x04cc
            goto L_0x04ce
        L_0x04cc:
            r14 = r16
        L_0x04ce:
            if (r14 == 0) goto L_0x04dc
            e.a.a.a.y0.m.n1.g r3 = r5.x(r14)
            if (r3 == 0) goto L_0x04dc
            r10.add(r3)
            r3 = r25
            goto L_0x04aa
        L_0x04dc:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r3 = "Incorrect type: "
            r0.append(r3)
            r0.append(r13)
            java.lang.String r3 = ", subType: "
            r0.append(r3)
            r0.append(r1)
            java.lang.String r1 = ", superType: "
            r0.append(r1)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        L_0x0507:
            r25 = r3
            java.lang.String r3 = "types"
            e.x.c.i.e(r10, r3)
            e.x.c.i.e(r10, r3)
            e.a.a.a.y0.m.l1.s r11 = e.a.a.a.y0.m.l1.s.a
            e.x.c.i.e(r10, r3)
            int r3 = r10.size()
            if (r3 == 0) goto L_0x05f1
            r13 = 1
            if (r3 == r13) goto L_0x05cd
            java.util.ArrayList r3 = new java.util.ArrayList
            r13 = 10
            int r13 = b.q.a.a.C(r10, r13)
            r3.<init>(r13)
            java.util.Iterator r13 = r10.iterator()
            r14 = 0
            r15 = 0
        L_0x0530:
            boolean r17 = r13.hasNext()
            if (r17 == 0) goto L_0x0575
            java.lang.Object r17 = r13.next()
            r27 = r7
            r7 = r17
            e.a.a.a.y0.m.i1 r7 = (e.a.a.a.y0.m.i1) r7
            if (r15 != 0) goto L_0x054b
            boolean r15 = b.q.a.a.I1(r7)
            if (r15 == 0) goto L_0x0549
            goto L_0x054b
        L_0x0549:
            r15 = 0
            goto L_0x054c
        L_0x054b:
            r15 = 1
        L_0x054c:
            r28 = r8
            boolean r8 = r7 instanceof e.a.a.a.y0.m.k0
            if (r8 == 0) goto L_0x0555
            e.a.a.a.y0.m.k0 r7 = (e.a.a.a.y0.m.k0) r7
            goto L_0x0567
        L_0x0555:
            boolean r8 = r7 instanceof e.a.a.a.y0.m.x
            if (r8 == 0) goto L_0x056f
            boolean r8 = b.q.a.a.E1(r7)
            if (r8 == 0) goto L_0x0561
            goto L_0x05d8
        L_0x0561:
            e.a.a.a.y0.m.x r7 = (e.a.a.a.y0.m.x) r7
            e.a.a.a.y0.m.k0 r7 = r7.f9767i
            r8 = 1
            r14 = r8
        L_0x0567:
            r3.add(r7)
            r7 = r27
            r8 = r28
            goto L_0x0530
        L_0x056f:
            e.h r0 = new e.h
            r0.<init>()
            throw r0
        L_0x0575:
            r27 = r7
            r28 = r8
            if (r15 == 0) goto L_0x0596
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r7 = "Intersection of error types: "
            r3.append(r7)
            r3.append(r10)
            java.lang.String r3 = r3.toString()
            e.a.a.a.y0.m.k0 r7 = e.a.a.a.y0.m.w.d(r3)
            java.lang.String r3 = "ErrorUtils.createErrorTy… of error types: $types\")"
            e.x.c.i.d(r7, r3)
            goto L_0x05d8
        L_0x0596:
            if (r14 != 0) goto L_0x059d
            e.a.a.a.y0.m.k0 r7 = r11.b(r3)
            goto L_0x05d8
        L_0x059d:
            java.util.ArrayList r7 = new java.util.ArrayList
            r8 = 10
            int r8 = b.q.a.a.C(r10, r8)
            r7.<init>(r8)
            java.util.Iterator r8 = r10.iterator()
        L_0x05ac:
            boolean r10 = r8.hasNext()
            if (r10 == 0) goto L_0x05c0
            java.lang.Object r10 = r8.next()
            e.a.a.a.y0.m.i1 r10 = (e.a.a.a.y0.m.i1) r10
            e.a.a.a.y0.m.k0 r10 = b.q.a.a.s3(r10)
            r7.add(r10)
            goto L_0x05ac
        L_0x05c0:
            e.a.a.a.y0.m.k0 r3 = r11.b(r3)
            e.a.a.a.y0.m.k0 r7 = r11.b(r7)
            e.a.a.a.y0.m.i1 r7 = e.a.a.a.y0.m.e0.c(r3, r7)
            goto L_0x05d8
        L_0x05cd:
            r27 = r7
            r28 = r8
            java.lang.Object r3 = e.t.g.O(r10)
            r7 = r3
            e.a.a.a.y0.m.i1 r7 = (e.a.a.a.y0.m.i1) r7
        L_0x05d8:
            java.lang.String r3 = "$this$asTypeArgument"
            e.x.c.i.e(r7, r3)
            e.x.c.i.e(r7, r3)
            e.a.a.a.y0.m.y0 r3 = e.a.a.a.y0.m.o1.c.j(r7)
            r6.add(r3)
        L_0x05e7:
            int r9 = r9 + 1
            r3 = r25
            r7 = r27
            r8 = r28
            goto L_0x047d
        L_0x05f1:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Expected some types"
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x05fd:
            if (r8 != 0) goto L_0x0606
            boolean r1 = r12.e(r0, r6, r2)
            if (r1 == 0) goto L_0x0606
            goto L_0x0628
        L_0x0606:
            boolean r1 = r4.isEmpty()
            if (r1 == 0) goto L_0x060e
            goto L_0x06f8
        L_0x060e:
            java.util.Iterator r1 = r4.iterator()
        L_0x0612:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x06f8
            java.lang.Object r3 = r1.next()
            e.a.a.a.y0.m.n1.h r3 = (e.a.a.a.y0.m.n1.h) r3
            e.a.a.a.y0.m.n1.i r3 = r5.S(r3)
            boolean r3 = r12.e(r0, r3, r2)
            if (r3 == 0) goto L_0x0612
        L_0x0628:
            r3 = 1
            goto L_0x06f9
        L_0x062b:
            java.lang.Object r1 = e.t.g.o(r4)
            e.a.a.a.y0.m.n1.h r1 = (e.a.a.a.y0.m.n1.h) r1
            e.a.a.a.y0.m.n1.i r1 = r5.S(r1)
            boolean r3 = r12.e(r0, r1, r2)
            goto L_0x06f9
        L_0x063b:
            e.a.a.a.y0.m.n1.k r0 = r5.d(r1)
            boolean r2 = r5.W(r0)
            if (r2 == 0) goto L_0x064b
            boolean r3 = r5.l(r0)
            goto L_0x06f9
        L_0x064b:
            e.a.a.a.y0.m.n1.k r0 = r5.d(r1)
            boolean r0 = r5.l(r0)
            if (r0 == 0) goto L_0x0656
            goto L_0x0628
        L_0x0656:
            r5.J()
            java.util.ArrayDeque<e.a.a.a.y0.m.n1.h> r0 = r5.c
            e.x.c.i.c(r0)
            java.util.Set<e.a.a.a.y0.m.n1.h> r2 = r5.d
            e.x.c.i.c(r2)
            r0.push(r1)
        L_0x0666:
            boolean r3 = r0.isEmpty()
            r3 = r3 ^ 1
            if (r3 == 0) goto L_0x06f5
            int r3 = r2.size()
            r4 = 1000(0x3e8, float:1.401E-42)
            if (r3 > r4) goto L_0x06cc
            java.lang.Object r3 = r0.pop()
            e.a.a.a.y0.m.n1.h r3 = (e.a.a.a.y0.m.n1.h) r3
            e.x.c.i.d(r3, r9)
            boolean r4 = r2.add(r3)
            if (r4 != 0) goto L_0x0686
            goto L_0x0666
        L_0x0686:
            boolean r4 = r5.K(r3)
            if (r4 == 0) goto L_0x068e
            r4 = r7
            goto L_0x0690
        L_0x068e:
            r4 = r27
        L_0x0690:
            boolean r6 = e.x.c.i.a(r4, r7)
            r8 = 1
            r6 = r6 ^ r8
            if (r6 == 0) goto L_0x0699
            goto L_0x069b
        L_0x0699:
            r4 = r16
        L_0x069b:
            if (r4 == 0) goto L_0x0666
            e.a.a.a.y0.m.n1.k r3 = r5.d(r3)
            java.util.Collection r3 = r5.e0(r3)
            java.util.Iterator r3 = r3.iterator()
        L_0x06a9:
            boolean r6 = r3.hasNext()
            if (r6 == 0) goto L_0x0666
            java.lang.Object r6 = r3.next()
            e.a.a.a.y0.m.n1.g r6 = (e.a.a.a.y0.m.n1.g) r6
            e.a.a.a.y0.m.n1.h r6 = r4.a(r5, r6)
            e.a.a.a.y0.m.n1.k r12 = r5.d(r6)
            boolean r12 = r5.l(r12)
            if (r12 == 0) goto L_0x06c8
            r5.E()
            r3 = r8
            goto L_0x06f9
        L_0x06c8:
            r0.add(r6)
            goto L_0x06a9
        L_0x06cc:
            java.lang.StringBuilder r0 = b.e.a.a.a.D(r11, r1, r10)
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 63
            r17 = r2
            java.lang.String r1 = e.t.g.x(r17, r18, r19, r20, r21, r22, r23, r24)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        L_0x06f5:
            r5.E()
        L_0x06f8:
            r3 = 0
        L_0x06f9:
            return r3
        L_0x06fa:
            r0 = r20
            java.lang.StringBuilder r0 = b.e.a.a.a.E(r0, r6, r13)
            java.lang.String r0 = b.e.a.a.a.u(r6, r0)
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: e.a.a.a.y0.m.f.f(e.a.a.a.y0.m.f, e.a.a.a.y0.m.g, e.a.a.a.y0.m.n1.g, e.a.a.a.y0.m.n1.g, boolean, int):boolean");
    }

    public final List<h> a(g gVar, h hVar, k kVar) {
        g.a aVar;
        g gVar2 = gVar;
        h hVar2 = hVar;
        k kVar2 = kVar;
        g.a.c cVar = g.a.c.a;
        b bVar = b.FOR_SUBTYPING;
        o oVar = o.f7934h;
        List<h> F = gVar.F(hVar, kVar);
        if (F != null) {
            return F;
        }
        e.a.a.a.y0.m.l1.b bVar2 = (e.a.a.a.y0.m.l1.b) gVar2;
        if (!bVar2.W(kVar2) && gVar.K(hVar)) {
            return oVar;
        }
        i.e(kVar2, "$this$isCommonFinalClassConstructor");
        i.e(kVar2, "$this$isCommonFinalClassConstructor");
        if (kVar2 instanceof v0) {
            e.a.a.a.y0.b.h d = ((v0) kVar2).d();
            if (!(d instanceof e)) {
                d = null;
            }
            e eVar = (e) d;
            boolean z = false;
            if (!(eVar == null || !a.J1(eVar) || eVar.i() == e.a.a.a.y0.b.f.ENUM_ENTRY || eVar.i() == e.a.a.a.y0.b.f.ANNOTATION_CLASS)) {
                z = true;
            }
            if (!z) {
                l lVar = new l();
                gVar.J();
                ArrayDeque<h> arrayDeque = gVar2.c;
                i.c(arrayDeque);
                Set<h> set = gVar2.d;
                i.c(set);
                arrayDeque.push(hVar2);
                while (!arrayDeque.isEmpty()) {
                    if (set.size() <= 1000) {
                        h pop = arrayDeque.pop();
                        i.d(pop, "current");
                        if (set.add(pop)) {
                            h T = bVar2.T(pop, bVar);
                            if (T == null) {
                                T = pop;
                            }
                            if (gVar2.D(bVar2.d(T), kVar2)) {
                                lVar.add(T);
                                aVar = cVar;
                            } else {
                                aVar = bVar2.c(T) == 0 ? g.a.b.a : gVar2.R(T);
                            }
                            if (!(!i.a(aVar, cVar))) {
                                aVar = null;
                            }
                            if (aVar != null) {
                                for (e.a.a.a.y0.m.n1.g a2 : bVar2.e0(bVar2.d(pop))) {
                                    arrayDeque.add(aVar.a(gVar2, a2));
                                }
                            }
                        }
                    } else {
                        StringBuilder D = b.e.a.a.a.D("Too many supertypes for type: ", hVar2, ". Supertypes = ");
                        D.append(e.t.g.x(set, (CharSequence) null, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (e.x.b.l) null, 63));
                        throw new IllegalStateException(D.toString().toString());
                    }
                }
                gVar.E();
                return lVar;
            } else if (!gVar2.D(bVar2.d(hVar2), kVar2)) {
                return oVar;
            } else {
                h T2 = bVar2.T(hVar2, bVar);
                if (T2 == null) {
                    T2 = hVar2;
                }
                return a.l2(T2);
            }
        } else {
            throw new IllegalArgumentException(b.e.a.a.a.u(kVar2, b.e.a.a.a.E("ClassicTypeSystemContext couldn't handle: ", kVar2, ", ")).toString());
        }
    }

    public final List<h> b(g gVar, h hVar, k kVar) {
        List<h> a2 = a(gVar, hVar, kVar);
        if (a2.size() < 2) {
            return a2;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = a2.iterator();
        while (true) {
            boolean z = true;
            if (!it.hasNext()) {
                break;
            }
            T next = it.next();
            e.a.a.a.y0.m.l1.b bVar = (e.a.a.a.y0.m.l1.b) gVar;
            e.a.a.a.y0.m.n1.i S = bVar.S((h) next);
            int d0 = bVar.d0(S);
            int i2 = 0;
            while (true) {
                if (i2 >= d0) {
                    break;
                }
                if (!(bVar.u(bVar.x(bVar.G(S, i2))) == null)) {
                    z = false;
                    break;
                }
                i2++;
            }
            if (z) {
                arrayList.add(next);
            }
        }
        return arrayList.isEmpty() ^ true ? arrayList : a2;
    }

    public final boolean c(g gVar, e.a.a.a.y0.m.n1.g gVar2, e.a.a.a.y0.m.n1.g gVar3) {
        i.e(gVar, BasePayload.CONTEXT_KEY);
        i.e(gVar2, "a");
        i.e(gVar3, "b");
        if (gVar2 == gVar3) {
            return true;
        }
        f fVar = a;
        if (fVar.d(gVar, gVar2) && fVar.d(gVar, gVar3)) {
            e.a.a.a.y0.m.n1.g Q = gVar.Q(gVar2);
            e.a.a.a.y0.m.n1.g Q2 = gVar.Q(gVar3);
            h n2 = gVar.n(Q);
            if (!gVar.D(gVar.o(Q), gVar.o(Q2))) {
                return false;
            }
            e.a.a.a.y0.m.l1.b bVar = (e.a.a.a.y0.m.l1.b) gVar;
            if (bVar.c(n2) == 0) {
                return gVar.I(Q) || gVar.I(Q2) || bVar.f(n2) == bVar.f(gVar.n(Q2));
            }
        }
        return f(fVar, gVar, gVar2, gVar3, false, 8) && f(fVar, gVar, gVar3, gVar2, false, 8);
    }

    public final boolean d(g gVar, e.a.a.a.y0.m.n1.g gVar2) {
        k o2 = gVar.o(gVar2);
        i.e(o2, "$this$isDenotable");
        i.e(o2, "$this$isDenotable");
        if (o2 instanceof v0) {
            if (((v0) o2).b() && !gVar.M(gVar2) && !gVar.L(gVar2)) {
                e.a.a.a.y0.m.l1.b bVar = (e.a.a.a.y0.m.l1.b) gVar;
                if (i.a(bVar.d(gVar.n(gVar2)), bVar.d(gVar.e(gVar2)))) {
                    return true;
                }
            }
            return false;
        }
        throw new IllegalArgumentException(b.e.a.a.a.u(o2, b.e.a.a.a.E("ClassicTypeSystemContext couldn't handle: ", o2, ", ")).toString());
    }

    /* JADX WARNING: Removed duplicated region for block: B:35:0x009e A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x009f A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean e(e.a.a.a.y0.m.g r18, e.a.a.a.y0.m.n1.i r19, e.a.a.a.y0.m.n1.h r20) {
        /*
            r17 = this;
            r6 = r18
            r7 = r19
            r8 = r20
            e.a.a.a.y0.m.f r9 = a
            java.lang.String r0 = "$this$isSubtypeForSameConstructor"
            e.x.c.i.e(r6, r0)
            java.lang.String r0 = "capturedSubArguments"
            e.x.c.i.e(r7, r0)
            java.lang.String r0 = "superType"
            e.x.c.i.e(r8, r0)
            r10 = r6
            e.a.a.a.y0.m.l1.b r10 = (e.a.a.a.y0.m.l1.b) r10
            e.a.a.a.y0.m.n1.k r11 = r10.d(r8)
            int r12 = r10.c0(r11)
            r13 = 0
            r14 = r13
        L_0x0024:
            r0 = 1
            if (r14 >= r12) goto L_0x00c1
            e.a.a.a.y0.m.n1.j r1 = r10.m(r8, r14)
            boolean r2 = r10.t(r1)
            if (r2 == 0) goto L_0x0033
            goto L_0x009f
        L_0x0033:
            e.a.a.a.y0.m.n1.g r2 = r10.x(r1)
            e.a.a.a.y0.m.n1.j r3 = r6.G(r7, r14)
            r10.p(r3)
            e.a.a.a.y0.m.n1.o r4 = e.a.a.a.y0.m.n1.o.INV
            e.a.a.a.y0.m.n1.g r3 = r10.x(r3)
            e.a.a.a.y0.m.n1.l r5 = r10.U(r11, r14)
            e.a.a.a.y0.m.n1.o r5 = r10.V(r5)
            e.a.a.a.y0.m.n1.o r1 = r10.p(r1)
            java.lang.String r15 = "declared"
            e.x.c.i.e(r5, r15)
            java.lang.String r15 = "useSite"
            e.x.c.i.e(r1, r15)
            if (r5 != r4) goto L_0x005e
            r5 = r1
            goto L_0x0065
        L_0x005e:
            if (r1 != r4) goto L_0x0061
            goto L_0x0065
        L_0x0061:
            if (r5 != r1) goto L_0x0064
            goto L_0x0065
        L_0x0064:
            r5 = 0
        L_0x0065:
            if (r5 == 0) goto L_0x00bd
            int r1 = r6.a
            r4 = 100
            if (r1 > r4) goto L_0x00a2
            int r1 = r1 + 1
            r6.a = r1
            int r1 = r5.ordinal()
            if (r1 == 0) goto L_0x008c
            if (r1 == r0) goto L_0x0087
            r0 = 2
            if (r1 != r0) goto L_0x0081
            boolean r0 = r9.c(r6, r3, r2)
            goto L_0x0096
        L_0x0081:
            e.h r0 = new e.h
            r0.<init>()
            throw r0
        L_0x0087:
            r16 = r3
            r3 = r2
            r2 = r16
        L_0x008c:
            r5 = 8
            r4 = 0
            r0 = r9
            r1 = r18
            boolean r0 = f(r0, r1, r2, r3, r4, r5)
        L_0x0096:
            int r1 = r6.a
            int r1 = r1 + -1
            r6.a = r1
            if (r0 != 0) goto L_0x009f
            return r13
        L_0x009f:
            int r14 = r14 + 1
            goto L_0x0024
        L_0x00a2:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Arguments depth is too high. Some related argument: "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        L_0x00bd:
            boolean r0 = r18.N()
        L_0x00c1:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: e.a.a.a.y0.m.f.e(e.a.a.a.y0.m.g, e.a.a.a.y0.m.n1.i, e.a.a.a.y0.m.n1.h):boolean");
    }
}
