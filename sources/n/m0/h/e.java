package n.m0.h;

import b.e.a.a.a;
import e.t.p;
import e.x.c.i;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import n.h0;
import n.j;
import n.m0.c;
import o.h;

public final class e {
    public static final h a;

    /* renamed from: b  reason: collision with root package name */
    public static final h f10231b;

    static {
        h.a aVar = h.f10456l;
        a = aVar.b("\"\\");
        f10231b = aVar.b("\t ,=");
    }

    public static final boolean a(h0 h0Var) {
        i.e(h0Var, "$this$promisesBody");
        if (i.a(h0Var.f10100h.c, "HEAD")) {
            return false;
        }
        int i2 = h0Var.f10103k;
        if (((i2 >= 100 && i2 < 200) || i2 == 204 || i2 == 304) && c.k(h0Var) == -1 && !e.c0.h.f("chunked", h0.b(h0Var, "Transfer-Encoding", (String) null, 2), true)) {
            return false;
        }
        return true;
    }

    public static final void b(o.e eVar, List<j> list) {
        String c;
        int u;
        String str;
        o.e eVar2 = eVar;
        List<j> list2 = list;
        while (true) {
            String str2 = null;
            while (true) {
                if (str2 == null) {
                    e(eVar);
                    str2 = c(eVar);
                    if (str2 == null) {
                        return;
                    }
                }
                boolean e2 = e(eVar);
                c = c(eVar);
                if (c != null) {
                    byte b2 = (byte) 61;
                    u = c.u(eVar2, b2);
                    boolean e3 = e(eVar);
                    if (e2 || (!e3 && !eVar.D())) {
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        int u2 = c.u(eVar2, b2) + u;
                        while (true) {
                            if (c == null) {
                                c = c(eVar);
                                if (e(eVar)) {
                                    continue;
                                    break;
                                }
                                u2 = c.u(eVar2, b2);
                            }
                            if (u2 == 0) {
                                continue;
                                break;
                            }
                            boolean z = true;
                            if (u2 <= 1 && !e(eVar)) {
                                byte b3 = (byte) 34;
                                if (!eVar.D() && eVar2.N(0) == b3) {
                                    if (eVar.readByte() != b3) {
                                        z = false;
                                    }
                                    if (z) {
                                        o.e eVar3 = new o.e();
                                        while (true) {
                                            long P = eVar2.P(a);
                                            if (P == -1) {
                                                break;
                                            } else if (eVar2.N(P) == b3) {
                                                eVar3.j(eVar2, P);
                                                eVar.readByte();
                                                str = eVar3.m0();
                                                break;
                                            } else if (eVar2.f10453i == P + 1) {
                                                break;
                                            } else {
                                                eVar3.j(eVar2, P);
                                                eVar.readByte();
                                                eVar3.j(eVar2, 1);
                                            }
                                        }
                                        str = null;
                                    } else {
                                        throw new IllegalArgumentException("Failed requirement.".toString());
                                    }
                                } else {
                                    str = c(eVar);
                                }
                                if (str != null && ((String) linkedHashMap.put(c, str)) == null) {
                                    if (e(eVar) || eVar.D()) {
                                        c = null;
                                    } else {
                                        return;
                                    }
                                } else {
                                    return;
                                }
                            } else {
                                return;
                            }
                        }
                        list2.add(new j(str2, linkedHashMap));
                        str2 = c;
                    }
                } else if (eVar.D()) {
                    list2.add(new j(str2, p.f7935h));
                    return;
                } else {
                    return;
                }
            }
            StringBuilder y = a.y(c);
            y.append(e.c0.h.u("=", u));
            Map singletonMap = Collections.singletonMap((Object) null, y.toString());
            i.d(singletonMap, "Collections.singletonMap…ek + \"=\".repeat(eqCount))");
            list2.add(new j(str2, singletonMap));
        }
    }

    public static final String c(o.e eVar) {
        long P = eVar.P(f10231b);
        if (P == -1) {
            P = eVar.f10453i;
        }
        if (P != 0) {
            return eVar.n0(P);
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:102:0x020c, code lost:
        if (okhttp3.internal.publicsuffix.PublicSuffixDatabase.f10497g.a(r8) == null) goto L_0x020e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x01f7, code lost:
        if (r9 == false) goto L_0x020e;
     */
    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x0204  */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x021f  */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x0222  */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x0249  */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x0253 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x01c0  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x01c2  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void d(n.q r29, n.z r30, n.y r31) {
        /*
            r0 = r29
            r1 = r30
            r2 = r31
            java.lang.String r3 = "$this$receiveHeaders"
            e.x.c.i.e(r0, r3)
            java.lang.String r3 = "url"
            e.x.c.i.e(r1, r3)
            java.lang.String r4 = "headers"
            e.x.c.i.e(r2, r4)
            n.q r5 = n.q.a
            if (r0 != r5) goto L_0x001a
            return
        L_0x001a:
            n.o r5 = n.o.f10414n
            e.t.o r5 = e.t.o.f7934h
            e.x.c.i.e(r1, r3)
            e.x.c.i.e(r2, r4)
            java.lang.String r4 = "Set-Cookie"
            java.lang.String r6 = "name"
            e.x.c.i.e(r4, r6)
            int r6 = r31.size()
            r7 = 0
            r8 = 0
            r9 = r7
        L_0x0032:
            r10 = 2
            r11 = 1
            if (r9 >= r6) goto L_0x0051
            java.lang.String r12 = r2.e(r9)
            boolean r11 = e.c0.h.f(r4, r12, r11)
            if (r11 == 0) goto L_0x004e
            if (r8 != 0) goto L_0x0047
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>(r10)
        L_0x0047:
            java.lang.String r10 = r2.p(r9)
            r8.add(r10)
        L_0x004e:
            int r9 = r9 + 1
            goto L_0x0032
        L_0x0051:
            if (r8 == 0) goto L_0x005d
            java.util.List r2 = java.util.Collections.unmodifiableList(r8)
            java.lang.String r4 = "Collections.unmodifiableList(result)"
            e.x.c.i.d(r2, r4)
            goto L_0x005e
        L_0x005d:
            r2 = r5
        L_0x005e:
            int r4 = r2.size()
            r6 = 0
            r8 = r7
        L_0x0064:
            if (r7 >= r4) goto L_0x0259
            java.lang.Object r9 = r2.get(r7)
            java.lang.String r9 = (java.lang.String) r9
            e.x.c.i.e(r1, r3)
            java.lang.String r10 = "setCookie"
            e.x.c.i.e(r9, r10)
            long r11 = java.lang.System.currentTimeMillis()
            e.x.c.i.e(r1, r3)
            e.x.c.i.e(r9, r10)
            byte[] r10 = n.m0.c.a
            int r10 = r9.length()
            r13 = 59
            int r10 = n.m0.c.f(r9, r13, r8, r10)
            r14 = 61
            int r14 = n.m0.c.f(r9, r14, r8, r10)
            if (r14 != r10) goto L_0x0096
        L_0x0092:
            r31 = r2
            goto L_0x0246
        L_0x0096:
            java.lang.String r16 = n.m0.c.A(r9, r8, r14)
            int r15 = r16.length()
            if (r15 != 0) goto L_0x00a2
            r15 = 1
            goto L_0x00a3
        L_0x00a2:
            r15 = r8
        L_0x00a3:
            if (r15 != 0) goto L_0x0092
            int r8 = n.m0.c.m(r16)
            r15 = -1
            if (r8 == r15) goto L_0x00ad
            goto L_0x00b9
        L_0x00ad:
            int r14 = r14 + 1
            java.lang.String r17 = n.m0.c.A(r9, r14, r10)
            int r8 = n.m0.c.m(r17)
            if (r8 == r15) goto L_0x00bd
        L_0x00b9:
            r31 = r2
            goto L_0x020e
        L_0x00bd:
            int r10 = r10 + 1
            int r8 = r9.length()
            r18 = -1
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 1
            r24 = 0
            r25 = 0
            r27 = r24
            r28 = r25
            r24 = r22
            r25 = r23
            r22 = r20
            r23 = r21
            r20 = 253402300799999(0xe677d21fdbff, double:1.251973714024093E-309)
        L_0x00e2:
            if (r10 >= r8) goto L_0x017f
            int r13 = n.m0.c.f(r9, r13, r10, r8)
            r14 = 61
            int r14 = n.m0.c.f(r9, r14, r10, r13)
            java.lang.String r10 = n.m0.c.A(r9, r10, r14)
            if (r14 >= r13) goto L_0x00fb
            int r14 = r14 + 1
            java.lang.String r14 = n.m0.c.A(r9, r14, r13)
            goto L_0x00fd
        L_0x00fb:
            java.lang.String r14 = ""
        L_0x00fd:
            java.lang.String r15 = "expires"
            r31 = r2
            r2 = 1
            boolean r15 = e.c0.h.f(r10, r15, r2)
            if (r15 == 0) goto L_0x0112
            int r10 = r14.length()     // Catch:{ IllegalArgumentException -> 0x0177 }
            r15 = 0
            long r20 = n.o.b(r14, r15, r10)     // Catch:{ IllegalArgumentException -> 0x0177 }
            goto L_0x011e
        L_0x0112:
            java.lang.String r15 = "max-age"
            boolean r15 = e.c0.h.f(r10, r15, r2)
            if (r15 == 0) goto L_0x0121
            long r18 = n.o.c(r14)     // Catch:{  }
        L_0x011e:
            r24 = r2
            goto L_0x0177
        L_0x0121:
            java.lang.String r15 = "domain"
            boolean r2 = e.c0.h.f(r10, r15, r2)
            if (r2 == 0) goto L_0x0156
            java.lang.String r2 = "."
            r10 = 0
            r15 = 2
            boolean r10 = e.c0.h.e(r14, r2, r10, r15)     // Catch:{ IllegalArgumentException -> 0x0177 }
            r10 = r10 ^ 1
            if (r10 == 0) goto L_0x014a
            java.lang.String r2 = e.c0.h.t(r14, r2)     // Catch:{ IllegalArgumentException -> 0x0177 }
            java.lang.String r2 = e.a.a.a.y0.m.o1.c.o0(r2)     // Catch:{ IllegalArgumentException -> 0x0177 }
            if (r2 == 0) goto L_0x0144
            r25 = 0
            r27 = r2
            goto L_0x0177
        L_0x0144:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException     // Catch:{ IllegalArgumentException -> 0x0177 }
            r2.<init>()     // Catch:{ IllegalArgumentException -> 0x0177 }
            throw r2     // Catch:{ IllegalArgumentException -> 0x0177 }
        L_0x014a:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException     // Catch:{ IllegalArgumentException -> 0x0177 }
            java.lang.String r10 = "Failed requirement."
            java.lang.String r10 = r10.toString()     // Catch:{ IllegalArgumentException -> 0x0177 }
            r2.<init>(r10)     // Catch:{ IllegalArgumentException -> 0x0177 }
            throw r2     // Catch:{ IllegalArgumentException -> 0x0177 }
        L_0x0156:
            java.lang.String r2 = "path"
            r15 = 1
            boolean r2 = e.c0.h.f(r10, r2, r15)
            if (r2 == 0) goto L_0x0162
            r28 = r14
            goto L_0x0177
        L_0x0162:
            java.lang.String r2 = "secure"
            boolean r2 = e.c0.h.f(r10, r2, r15)
            if (r2 == 0) goto L_0x016d
            r22 = r15
            goto L_0x0177
        L_0x016d:
            java.lang.String r2 = "httponly"
            boolean r2 = e.c0.h.f(r10, r2, r15)
            if (r2 == 0) goto L_0x0177
            r23 = 1
        L_0x0177:
            int r10 = r13 + 1
            r13 = 59
            r2 = r31
            goto L_0x00e2
        L_0x017f:
            r31 = r2
            r8 = -9223372036854775808
            int r2 = (r18 > r8 ? 1 : (r18 == r8 ? 0 : -1))
            if (r2 != 0) goto L_0x0188
            goto L_0x01b2
        L_0x0188:
            r8 = -1
            int r2 = (r18 > r8 ? 1 : (r18 == r8 ? 0 : -1))
            if (r2 == 0) goto L_0x01b8
            r8 = 9223372036854775(0x20c49ba5e353f7, double:4.663754807431093E-308)
            int r2 = (r18 > r8 ? 1 : (r18 == r8 ? 0 : -1))
            if (r2 > 0) goto L_0x019d
            r2 = 1000(0x3e8, float:1.401E-42)
            long r8 = (long) r2
            long r18 = r18 * r8
            goto L_0x01a2
        L_0x019d:
            r18 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
        L_0x01a2:
            long r8 = r11 + r18
            int r2 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            r10 = 253402300799999(0xe677d21fdbff, double:1.251973714024093E-309)
            if (r2 < 0) goto L_0x01b5
            int r2 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r2 <= 0) goto L_0x01b2
            goto L_0x01b5
        L_0x01b2:
            r18 = r8
            goto L_0x01ba
        L_0x01b5:
            r18 = r10
            goto L_0x01ba
        L_0x01b8:
            r18 = r20
        L_0x01ba:
            java.lang.String r2 = r1.f10431e
            r8 = r27
            if (r8 != 0) goto L_0x01c2
            r8 = r2
            goto L_0x01fa
        L_0x01c2:
            boolean r9 = e.x.c.i.a(r2, r8)
            if (r9 == 0) goto L_0x01ca
            r9 = 1
            goto L_0x01f7
        L_0x01ca:
            r9 = 2
            r10 = 0
            boolean r9 = e.c0.h.e(r2, r8, r10, r9)
            if (r9 == 0) goto L_0x01f6
            int r9 = r2.length()
            int r10 = r8.length()
            int r9 = r9 - r10
            r10 = 1
            int r9 = r9 - r10
            char r9 = r2.charAt(r9)
            r11 = 46
            if (r9 != r11) goto L_0x01f6
            byte[] r9 = n.m0.c.a
            java.lang.String r9 = "$this$canParseAsIpAddress"
            e.x.c.i.e(r2, r9)
            e.c0.d r9 = n.m0.c.f
            boolean r9 = r9.a(r2)
            if (r9 != 0) goto L_0x01f6
            r9 = r10
            goto L_0x01f7
        L_0x01f6:
            r9 = 0
        L_0x01f7:
            if (r9 != 0) goto L_0x01fa
            goto L_0x020e
        L_0x01fa:
            int r2 = r2.length()
            int r9 = r8.length()
            if (r2 == r9) goto L_0x0210
            okhttp3.internal.publicsuffix.PublicSuffixDatabase$a r2 = okhttp3.internal.publicsuffix.PublicSuffixDatabase.f10498h
            okhttp3.internal.publicsuffix.PublicSuffixDatabase r2 = okhttp3.internal.publicsuffix.PublicSuffixDatabase.f10497g
            java.lang.String r2 = r2.a(r8)
            if (r2 != 0) goto L_0x0210
        L_0x020e:
            r8 = 0
            goto L_0x0246
        L_0x0210:
            java.lang.String r2 = "/"
            r9 = 2
            r10 = 0
            r11 = r28
            if (r11 == 0) goto L_0x0222
            boolean r9 = e.c0.h.C(r11, r2, r10, r9)
            if (r9 != 0) goto L_0x021f
            goto L_0x0222
        L_0x021f:
            r21 = r11
            goto L_0x023a
        L_0x0222:
            java.lang.String r9 = r30.b()
            r11 = 47
            r12 = 6
            int r11 = e.c0.h.o(r9, r11, r10, r10, r12)
            if (r11 == 0) goto L_0x0238
            java.lang.String r2 = r9.substring(r10, r11)
            java.lang.String r9 = "(this as java.lang.Strin…ing(startIndex, endIndex)"
            e.x.c.i.d(r2, r9)
        L_0x0238:
            r21 = r2
        L_0x023a:
            n.o r2 = new n.o
            r26 = 0
            r15 = r2
            r20 = r8
            r15.<init>(r16, r17, r18, r20, r21, r22, r23, r24, r25, r26)
            r8 = r10
            goto L_0x0247
        L_0x0246:
            r2 = 0
        L_0x0247:
            if (r2 == 0) goto L_0x0253
            if (r6 != 0) goto L_0x0250
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
        L_0x0250:
            r6.add(r2)
        L_0x0253:
            int r7 = r7 + 1
            r2 = r31
            goto L_0x0064
        L_0x0259:
            if (r6 == 0) goto L_0x0264
            java.util.List r5 = java.util.Collections.unmodifiableList(r6)
            java.lang.String r2 = "Collections.unmodifiableList(cookies)"
            e.x.c.i.d(r5, r2)
        L_0x0264:
            boolean r2 = r5.isEmpty()
            if (r2 == 0) goto L_0x026b
            return
        L_0x026b:
            r0.b(r1, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: n.m0.h.e.d(n.q, n.z, n.y):void");
    }

    public static final boolean e(o.e eVar) {
        boolean z = false;
        while (!eVar.D()) {
            byte N = eVar.N(0);
            if (N == 9 || N == 32) {
                eVar.readByte();
            } else if (N != 44) {
                break;
            } else {
                eVar.readByte();
                z = true;
            }
        }
        return z;
    }
}
