package n.m0.h;

import n.a0;

public final class b implements a0 {
    public final boolean a;

    public b(boolean z) {
        this.a = z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:69:0x022b, code lost:
        if (e.c0.h.f("close", n.h0.b(r0, "Connection", (java.lang.String) null, 2), true) != false) goto L_0x022f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public n.h0 a(n.a0.a r28) {
        /*
            r27 = this;
            r0 = r28
            java.lang.String r1 = "call"
            java.lang.String r2 = "chain"
            e.x.c.i.e(r0, r2)
            n.m0.h.g r0 = (n.m0.h.g) r0
            n.m0.g.c r2 = r0.f10233e
            e.x.c.i.c(r2)
            n.e0 r0 = r0.f
            n.g0 r3 = r0.f10093e
            long r4 = java.lang.System.currentTimeMillis()
            java.lang.String r6 = "request"
            e.x.c.i.e(r0, r6)
            n.u r7 = r2.d     // Catch:{ IOException -> 0x02bb }
            n.m0.g.e r8 = r2.c     // Catch:{ IOException -> 0x02bb }
            java.util.Objects.requireNonNull(r7)     // Catch:{ IOException -> 0x02bb }
            e.x.c.i.e(r8, r1)     // Catch:{ IOException -> 0x02bb }
            n.m0.h.d r7 = r2.f     // Catch:{ IOException -> 0x02bb }
            r7.b(r0)     // Catch:{ IOException -> 0x02bb }
            n.u r7 = r2.d     // Catch:{ IOException -> 0x02bb }
            n.m0.g.e r8 = r2.c     // Catch:{ IOException -> 0x02bb }
            java.util.Objects.requireNonNull(r7)     // Catch:{ IOException -> 0x02bb }
            e.x.c.i.e(r8, r1)     // Catch:{ IOException -> 0x02bb }
            e.x.c.i.e(r0, r6)     // Catch:{ IOException -> 0x02bb }
            java.lang.String r6 = r0.c
            boolean r6 = n.m0.h.f.a(r6)
            r7 = 0
            r8 = 1
            r9 = 0
            if (r6 == 0) goto L_0x009c
            if (r3 == 0) goto L_0x009c
            java.lang.String r6 = "Expect"
            java.lang.String r6 = r0.b(r6)
            java.lang.String r10 = "100-continue"
            boolean r6 = e.c0.h.f(r10, r6, r8)
            if (r6 == 0) goto L_0x006e
            n.m0.h.d r6 = r2.f     // Catch:{ IOException -> 0x0062 }
            r6.c()     // Catch:{ IOException -> 0x0062 }
            n.h0$a r6 = r2.c(r8)
            r2.d()
            r10 = r7
            goto L_0x0070
        L_0x0062:
            r0 = move-exception
            n.u r1 = r2.d
            n.m0.g.e r3 = r2.c
            r1.b(r3, r0)
            r2.e(r0)
            throw r0
        L_0x006e:
            r10 = r8
            r6 = r9
        L_0x0070:
            if (r6 != 0) goto L_0x0083
            o.x r8 = r2.b(r0, r7)
            o.f r8 = e.a.a.a.y0.m.o1.c.l(r8)
            r3.c(r8)
            o.s r8 = (o.s) r8
            r8.close()
            goto L_0x0099
        L_0x0083:
            n.m0.g.e r3 = r2.c
            r3.k(r2, r8, r7, r9)
            n.m0.g.i r3 = r2.f10167b
            boolean r3 = r3.j()
            if (r3 != 0) goto L_0x0099
            n.m0.h.d r3 = r2.f
            n.m0.g.i r3 = r3.h()
            r3.l()
        L_0x0099:
            r9 = r6
            r8 = r10
            goto L_0x00a1
        L_0x009c:
            n.m0.g.e r3 = r2.c
            r3.k(r2, r8, r7, r9)
        L_0x00a1:
            n.m0.h.d r3 = r2.f     // Catch:{ IOException -> 0x02af }
            r3.a()     // Catch:{ IOException -> 0x02af }
            if (r9 != 0) goto L_0x00b5
            n.h0$a r9 = r2.c(r7)
            e.x.c.i.c(r9)
            if (r8 == 0) goto L_0x00b5
            r2.d()
            r8 = r7
        L_0x00b5:
            r9.g(r0)
            n.m0.g.i r3 = r2.f10167b
            n.x r3 = r3.d
            r9.f10111e = r3
            r9.f10116k = r4
            long r10 = java.lang.System.currentTimeMillis()
            r9.f10117l = r10
            n.h0 r3 = r9.a()
            int r6 = r3.f10103k
            r9 = 100
            if (r6 != r9) goto L_0x00f3
            n.h0$a r3 = r2.c(r7)
            e.x.c.i.c(r3)
            if (r8 == 0) goto L_0x00dc
            r2.d()
        L_0x00dc:
            r3.g(r0)
            n.m0.g.i r0 = r2.f10167b
            n.x r0 = r0.d
            r3.f10111e = r0
            r3.f10116k = r4
            long r4 = java.lang.System.currentTimeMillis()
            r3.f10117l = r4
            n.h0 r3 = r3.a()
            int r6 = r3.f10103k
        L_0x00f3:
            java.lang.String r0 = "response"
            e.x.c.i.e(r3, r0)
            n.u r4 = r2.d
            n.m0.g.e r5 = r2.c
            java.util.Objects.requireNonNull(r4)
            e.x.c.i.e(r5, r1)
            e.x.c.i.e(r3, r0)
            r1 = r27
            boolean r4 = r1.a
            java.lang.String r5 = "message == null"
            java.lang.String r7 = "protocol == null"
            java.lang.String r8 = "request == null"
            java.lang.String r9 = "code < 0: "
            if (r4 == 0) goto L_0x0198
            r4 = 101(0x65, float:1.42E-43)
            if (r6 != r4) goto L_0x0198
            e.x.c.i.e(r3, r0)
            n.e0 r11 = r3.f10100h
            n.d0 r12 = r3.f10101i
            int r14 = r3.f10103k
            java.lang.String r13 = r3.f10102j
            n.x r15 = r3.f10104l
            n.y r0 = r3.f10105m
            n.y$a r0 = r0.n()
            n.h0 r4 = r3.f10107o
            n.h0 r10 = r3.f10108p
            n.h0 r1 = r3.f10109q
            r28 = r8
            r16 = r9
            long r8 = r3.r
            r26 = r6
            r17 = r7
            long r6 = r3.s
            n.m0.g.c r3 = r3.t
            n.j0 r18 = n.m0.c.c
            if (r14 < 0) goto L_0x0145
            r19 = 1
            goto L_0x0147
        L_0x0145:
            r19 = 0
        L_0x0147:
            if (r19 == 0) goto L_0x0188
            if (r11 == 0) goto L_0x017e
            if (r12 == 0) goto L_0x0174
            if (r13 == 0) goto L_0x016a
            n.y r16 = r0.b()
            n.h0 r0 = new n.h0
            r5 = r10
            r10 = r0
            r17 = r18
            r18 = r4
            r19 = r5
            r20 = r1
            r21 = r8
            r23 = r6
            r25 = r3
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r23, r25)
            goto L_0x0210
        L_0x016a:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = r5.toString()
            r0.<init>(r1)
            throw r0
        L_0x0174:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = r17.toString()
            r0.<init>(r1)
            throw r0
        L_0x017e:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = r28.toString()
            r0.<init>(r1)
            throw r0
        L_0x0188:
            r1 = r16
            java.lang.String r0 = b.e.a.a.a.g(r1, r14)
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        L_0x0198:
            r26 = r6
            r17 = r7
            r28 = r8
            r1 = r9
            e.x.c.i.e(r3, r0)
            n.e0 r4 = r3.f10100h
            n.d0 r6 = r3.f10101i
            int r7 = r3.f10103k
            java.lang.String r8 = r3.f10102j
            n.x r9 = r3.f10104l
            n.y r10 = r3.f10105m
            n.y$a r10 = r10.n()
            n.h0 r11 = r3.f10107o
            n.h0 r12 = r3.f10108p
            n.h0 r13 = r3.f10109q
            long r14 = r3.r
            r18 = r14
            long r14 = r3.s
            r16 = r1
            n.m0.g.c r1 = r3.t
            e.x.c.i.e(r3, r0)
            java.lang.String r0 = "Content-Type"
            r20 = r14
            r14 = 2
            r15 = 0
            java.lang.String r0 = n.h0.b(r3, r0, r15, r14)     // Catch:{ IOException -> 0x02a3 }
            n.m0.h.d r14 = r2.f     // Catch:{ IOException -> 0x02a3 }
            long r14 = r14.d(r3)     // Catch:{ IOException -> 0x02a3 }
            r22 = r5
            n.m0.h.d r5 = r2.f     // Catch:{ IOException -> 0x02a3 }
            o.z r3 = r5.e(r3)     // Catch:{ IOException -> 0x02a3 }
            n.m0.g.c$b r5 = new n.m0.g.c$b     // Catch:{ IOException -> 0x02a3 }
            r5.<init>(r2, r3, r14)     // Catch:{ IOException -> 0x02a3 }
            n.m0.h.h r3 = new n.m0.h.h     // Catch:{ IOException -> 0x02a3 }
            o.g r5 = e.a.a.a.y0.m.o1.c.m(r5)     // Catch:{ IOException -> 0x02a3 }
            r3.<init>(r0, r14, r5)     // Catch:{ IOException -> 0x02a3 }
            if (r7 < 0) goto L_0x01ef
            r0 = 1
            goto L_0x01f0
        L_0x01ef:
            r0 = 0
        L_0x01f0:
            if (r0 == 0) goto L_0x0293
            if (r4 == 0) goto L_0x0289
            if (r6 == 0) goto L_0x027f
            if (r8 == 0) goto L_0x0275
            n.y r0 = r10.b()
            n.h0 r22 = new n.h0
            r10 = r3
            r3 = r22
            r5 = r6
            r6 = r8
            r8 = r9
            r9 = r0
            r16 = r20
            r14 = r18
            r18 = r1
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r16, r18)
            r0 = r22
        L_0x0210:
            n.e0 r1 = r0.f10100h
            java.lang.String r3 = "Connection"
            java.lang.String r1 = r1.b(r3)
            java.lang.String r4 = "close"
            r5 = 1
            boolean r1 = e.c0.h.f(r4, r1, r5)
            if (r1 != 0) goto L_0x022e
            r1 = 2
            r6 = 0
            java.lang.String r1 = n.h0.b(r0, r3, r6, r1)
            boolean r1 = e.c0.h.f(r4, r1, r5)
            if (r1 == 0) goto L_0x0238
            goto L_0x022f
        L_0x022e:
            r6 = 0
        L_0x022f:
            n.m0.h.d r1 = r2.f
            n.m0.g.i r1 = r1.h()
            r1.l()
        L_0x0238:
            r1 = 204(0xcc, float:2.86E-43)
            r2 = r26
            if (r2 == r1) goto L_0x0242
            r1 = 205(0xcd, float:2.87E-43)
            if (r2 != r1) goto L_0x0274
        L_0x0242:
            n.j0 r1 = r0.f10106n
            if (r1 == 0) goto L_0x024b
            long r3 = r1.b()
            goto L_0x024d
        L_0x024b:
            r3 = -1
        L_0x024d:
            r7 = 0
            int r1 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r1 <= 0) goto L_0x0274
            java.net.ProtocolException r1 = new java.net.ProtocolException
            java.lang.String r3 = "HTTP "
            java.lang.String r4 = " had non-zero Content-Length: "
            java.lang.StringBuilder r2 = b.e.a.a.a.z(r3, r2, r4)
            n.j0 r0 = r0.f10106n
            if (r0 == 0) goto L_0x0269
            long r3 = r0.b()
            java.lang.Long r6 = java.lang.Long.valueOf(r3)
        L_0x0269:
            r2.append(r6)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
        L_0x0274:
            return r0
        L_0x0275:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = r22.toString()
            r0.<init>(r1)
            throw r0
        L_0x027f:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = r17.toString()
            r0.<init>(r1)
            throw r0
        L_0x0289:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = r28.toString()
            r0.<init>(r1)
            throw r0
        L_0x0293:
            r0 = r16
            java.lang.String r0 = b.e.a.a.a.g(r0, r7)
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        L_0x02a3:
            r0 = move-exception
            n.u r1 = r2.d
            n.m0.g.e r3 = r2.c
            r1.c(r3, r0)
            r2.e(r0)
            throw r0
        L_0x02af:
            r0 = move-exception
            n.u r1 = r2.d
            n.m0.g.e r3 = r2.c
            r1.b(r3, r0)
            r2.e(r0)
            throw r0
        L_0x02bb:
            r0 = move-exception
            n.u r1 = r2.d
            n.m0.g.e r3 = r2.c
            r1.b(r3, r0)
            r2.e(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: n.m0.h.b.a(n.a0$a):n.h0");
    }
}
