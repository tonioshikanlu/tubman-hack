package n.m0.h;

import androidx.appcompat.widget.ActivityChooserView;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.SocketTimeoutException;
import java.security.cert.CertificateException;
import java.util.regex.Pattern;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import n.a0;
import n.c0;
import n.e0;
import n.g0;
import n.h0;
import n.k0;
import n.m0.c;
import n.m0.g.d;
import n.m0.g.e;
import n.m0.g.m;

public final class i implements a0 {
    public final c0 a;

    public i(c0 c0Var) {
        e.x.c.i.e(c0Var, "client");
        this.a = c0Var;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v7, resolved type: n.m0.h.i} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v8, resolved type: n.m0.g.e} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v9, resolved type: n.m0.g.e} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v11, resolved type: n.m0.g.e} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v13, resolved type: n.m0.g.e} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v15, resolved type: n.m0.g.e} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v16, resolved type: n.m0.g.e} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v17, resolved type: n.m0.g.e} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v20, resolved type: n.m0.g.e} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v42, resolved type: n.m0.h.i} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v43, resolved type: n.m0.g.e} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v46, resolved type: n.a} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public n.h0 a(n.a0.a r49) {
        /*
            r48 = this;
            r1 = r48
            r0 = r49
            java.lang.String r2 = "chain"
            e.x.c.i.e(r0, r2)
            r2 = r0
            n.m0.h.g r2 = (n.m0.h.g) r2
            n.e0 r0 = r2.f
            n.m0.g.e r3 = r2.f10232b
            e.t.o r4 = e.t.o.f7934h
            r7 = 1
            r8 = r4
            r9 = 0
            r10 = 0
            r4 = r0
            r0 = r7
        L_0x0018:
            java.util.Objects.requireNonNull(r3)
            java.lang.String r11 = "request"
            e.x.c.i.e(r4, r11)
            n.m0.g.c r11 = r3.f10194p
            if (r11 != 0) goto L_0x0026
            r11 = r7
            goto L_0x0027
        L_0x0026:
            r11 = 0
        L_0x0027:
            if (r11 == 0) goto L_0x02f7
            monitor-enter(r3)
            boolean r11 = r3.r     // Catch:{ all -> 0x02f2 }
            r11 = r11 ^ r7
            if (r11 == 0) goto L_0x02e2
            boolean r11 = r3.f10195q     // Catch:{ all -> 0x02f2 }
            r11 = r11 ^ r7
            if (r11 == 0) goto L_0x02d4
            monitor-exit(r3)
            if (r0 == 0) goto L_0x0092
            n.m0.g.d r0 = new n.m0.g.d
            n.m0.g.j r11 = r3.f10186h
            n.z r12 = r4.f10092b
            boolean r13 = r12.a
            if (r13 == 0) goto L_0x005a
            n.c0 r13 = r3.w
            javax.net.ssl.SSLSocketFactory r14 = r13.v
            if (r14 == 0) goto L_0x0052
            javax.net.ssl.HostnameVerifier r15 = r13.z
            n.h r13 = r13.A
            r19 = r13
            r17 = r14
            r18 = r15
            goto L_0x0060
        L_0x0052:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "CLEARTEXT-only client"
            r0.<init>(r2)
            throw r0
        L_0x005a:
            r17 = 0
            r18 = 0
            r19 = 0
        L_0x0060:
            n.a r15 = new n.a
            java.lang.String r13 = r12.f10431e
            int r14 = r12.f
            n.c0 r12 = r3.w
            n.t r5 = r12.r
            javax.net.SocketFactory r6 = r12.u
            n.c r7 = r12.t
            r21 = 0
            r25 = r8
            java.util.List<n.d0> r8 = r12.y
            r26 = r9
            java.util.List<n.n> r9 = r12.x
            java.net.ProxySelector r12 = r12.s
            r24 = r12
            r12 = r15
            r1 = r15
            r15 = r5
            r16 = r6
            r20 = r7
            r22 = r8
            r23 = r9
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            n.u r5 = r3.f10187i
            r0.<init>(r11, r1, r3, r5)
            r3.f10191m = r0
            goto L_0x0096
        L_0x0092:
            r25 = r8
            r26 = r9
        L_0x0096:
            boolean r0 = r3.t     // Catch:{ all -> 0x02cb }
            if (r0 != 0) goto L_0x02be
            n.h0 r0 = r2.c(r4)     // Catch:{ l -> 0x0291, IOException -> 0x026b }
            if (r10 == 0) goto L_0x01ff
            java.lang.String r1 = "response"
            e.x.c.i.e(r0, r1)     // Catch:{ all -> 0x01f6 }
            n.e0 r1 = r0.f10100h     // Catch:{ all -> 0x01f6 }
            n.d0 r4 = r0.f10101i     // Catch:{ all -> 0x01f6 }
            int r5 = r0.f10103k     // Catch:{ all -> 0x01f6 }
            java.lang.String r6 = r0.f10102j     // Catch:{ all -> 0x01f6 }
            n.x r7 = r0.f10104l     // Catch:{ all -> 0x01f6 }
            n.y r8 = r0.f10105m     // Catch:{ all -> 0x01f6 }
            n.y$a r8 = r8.n()     // Catch:{ all -> 0x01f6 }
            n.j0 r9 = r0.f10106n     // Catch:{ all -> 0x01f6 }
            n.h0 r11 = r0.f10107o     // Catch:{ all -> 0x01f6 }
            n.h0 r12 = r0.f10108p     // Catch:{ all -> 0x01f6 }
            long r13 = r0.r     // Catch:{ all -> 0x01f6 }
            r15 = r2
            r16 = r3
            long r2 = r0.s     // Catch:{ all -> 0x01f4 }
            n.m0.g.c r0 = r0.t     // Catch:{ all -> 0x01f4 }
            r17 = r15
            java.lang.String r15 = "response"
            e.x.c.i.e(r10, r15)     // Catch:{ all -> 0x01f4 }
            n.e0 r15 = r10.f10100h     // Catch:{ all -> 0x01f4 }
            r18 = r0
            n.d0 r0 = r10.f10101i     // Catch:{ all -> 0x01f4 }
            r19 = r2
            int r2 = r10.f10103k     // Catch:{ all -> 0x01f4 }
            java.lang.String r3 = r10.f10102j     // Catch:{ all -> 0x01f4 }
            r21 = r13
            n.x r13 = r10.f10104l     // Catch:{ all -> 0x01f4 }
            n.y r14 = r10.f10105m     // Catch:{ all -> 0x01f4 }
            n.y$a r14 = r14.n()     // Catch:{ all -> 0x01f4 }
            r23 = r12
            n.h0 r12 = r10.f10107o     // Catch:{ all -> 0x01f4 }
            r24 = r11
            n.h0 r11 = r10.f10108p     // Catch:{ all -> 0x01f4 }
            r43 = r9
            n.h0 r9 = r10.f10109q     // Catch:{ all -> 0x01f4 }
            r44 = r7
            r45 = r8
            long r7 = r10.r     // Catch:{ all -> 0x01f4 }
            r46 = r4
            r47 = r5
            long r4 = r10.s     // Catch:{ all -> 0x01f4 }
            n.m0.g.c r10 = r10.t     // Catch:{ all -> 0x01f4 }
            r34 = 0
            if (r2 < 0) goto L_0x0102
            r27 = 1
            goto L_0x0104
        L_0x0102:
            r27 = 0
        L_0x0104:
            if (r27 == 0) goto L_0x01d9
            if (r15 == 0) goto L_0x01cd
            if (r0 == 0) goto L_0x01c1
            if (r3 == 0) goto L_0x01b5
            n.y r33 = r14.b()     // Catch:{ all -> 0x01f4 }
            n.h0 r14 = new n.h0     // Catch:{ all -> 0x01f4 }
            r27 = r14
            r28 = r15
            r29 = r0
            r30 = r3
            r31 = r2
            r32 = r13
            r35 = r12
            r36 = r11
            r37 = r9
            r38 = r7
            r40 = r4
            r42 = r10
            r27.<init>(r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r40, r42)     // Catch:{ all -> 0x01f4 }
            n.j0 r0 = r14.f10106n     // Catch:{ all -> 0x01f4 }
            if (r0 != 0) goto L_0x0133
            r0 = 1
            goto L_0x0134
        L_0x0133:
            r0 = 0
        L_0x0134:
            if (r0 == 0) goto L_0x01a9
            if (r47 < 0) goto L_0x013a
            r0 = 1
            goto L_0x013b
        L_0x013a:
            r0 = 0
        L_0x013b:
            if (r0 == 0) goto L_0x018c
            if (r1 == 0) goto L_0x0180
            if (r46 == 0) goto L_0x0174
            if (r6 == 0) goto L_0x0168
            n.y r33 = r45.b()     // Catch:{ all -> 0x01f4 }
            n.h0 r0 = new n.h0     // Catch:{ all -> 0x01f4 }
            r27 = r0
            r28 = r1
            r29 = r46
            r30 = r6
            r31 = r47
            r32 = r44
            r34 = r43
            r35 = r24
            r36 = r23
            r37 = r14
            r38 = r21
            r40 = r19
            r42 = r18
            r27.<init>(r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r40, r42)     // Catch:{ all -> 0x01f4 }
            goto L_0x0203
        L_0x0168:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x01f4 }
            java.lang.String r1 = "message == null"
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x01f4 }
            r0.<init>(r1)     // Catch:{ all -> 0x01f4 }
            throw r0     // Catch:{ all -> 0x01f4 }
        L_0x0174:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x01f4 }
            java.lang.String r1 = "protocol == null"
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x01f4 }
            r0.<init>(r1)     // Catch:{ all -> 0x01f4 }
            throw r0     // Catch:{ all -> 0x01f4 }
        L_0x0180:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x01f4 }
            java.lang.String r1 = "request == null"
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x01f4 }
            r0.<init>(r1)     // Catch:{ all -> 0x01f4 }
            throw r0     // Catch:{ all -> 0x01f4 }
        L_0x018c:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x01f4 }
            r0.<init>()     // Catch:{ all -> 0x01f4 }
            java.lang.String r1 = "code < 0: "
            r0.append(r1)     // Catch:{ all -> 0x01f4 }
            r1 = r47
            r0.append(r1)     // Catch:{ all -> 0x01f4 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x01f4 }
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ all -> 0x01f4 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x01f4 }
            r1.<init>(r0)     // Catch:{ all -> 0x01f4 }
            throw r1     // Catch:{ all -> 0x01f4 }
        L_0x01a9:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x01f4 }
            java.lang.String r1 = "priorResponse.body != null"
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x01f4 }
            r0.<init>(r1)     // Catch:{ all -> 0x01f4 }
            throw r0     // Catch:{ all -> 0x01f4 }
        L_0x01b5:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x01f4 }
            java.lang.String r1 = "message == null"
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x01f4 }
            r0.<init>(r1)     // Catch:{ all -> 0x01f4 }
            throw r0     // Catch:{ all -> 0x01f4 }
        L_0x01c1:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x01f4 }
            java.lang.String r1 = "protocol == null"
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x01f4 }
            r0.<init>(r1)     // Catch:{ all -> 0x01f4 }
            throw r0     // Catch:{ all -> 0x01f4 }
        L_0x01cd:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x01f4 }
            java.lang.String r1 = "request == null"
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x01f4 }
            r0.<init>(r1)     // Catch:{ all -> 0x01f4 }
            throw r0     // Catch:{ all -> 0x01f4 }
        L_0x01d9:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x01f4 }
            r0.<init>()     // Catch:{ all -> 0x01f4 }
            java.lang.String r1 = "code < 0: "
            r0.append(r1)     // Catch:{ all -> 0x01f4 }
            r0.append(r2)     // Catch:{ all -> 0x01f4 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x01f4 }
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ all -> 0x01f4 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x01f4 }
            r1.<init>(r0)     // Catch:{ all -> 0x01f4 }
            throw r1     // Catch:{ all -> 0x01f4 }
        L_0x01f4:
            r0 = move-exception
            goto L_0x01f9
        L_0x01f6:
            r0 = move-exception
            r16 = r3
        L_0x01f9:
            r2 = r48
            r1 = r16
            goto L_0x02cf
        L_0x01ff:
            r17 = r2
            r16 = r3
        L_0x0203:
            r10 = r0
            r1 = r16
            n.m0.g.c r0 = r1.f10194p     // Catch:{ all -> 0x0266 }
            r2 = r48
            n.e0 r4 = r2.b(r10, r0)     // Catch:{ all -> 0x02c9 }
            if (r4 != 0) goto L_0x0235
            if (r0 == 0) goto L_0x0230
            boolean r0 = r0.a     // Catch:{ all -> 0x02c9 }
            if (r0 == 0) goto L_0x0230
            boolean r0 = r1.f10193o     // Catch:{ all -> 0x02c9 }
            r3 = 1
            r0 = r0 ^ r3
            if (r0 == 0) goto L_0x0224
            r1.f10193o = r3     // Catch:{ all -> 0x02c9 }
            n.m0.g.e$c r0 = r1.f10188j     // Catch:{ all -> 0x02c9 }
            r0.i()     // Catch:{ all -> 0x02c9 }
            goto L_0x0230
        L_0x0224:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x02c9 }
            java.lang.String r3 = "Check failed."
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x02c9 }
            r0.<init>(r3)     // Catch:{ all -> 0x02c9 }
            throw r0     // Catch:{ all -> 0x02c9 }
        L_0x0230:
            r3 = 0
            r1.i(r3)
            return r10
        L_0x0235:
            n.j0 r0 = r10.f10106n     // Catch:{ all -> 0x02c9 }
            if (r0 == 0) goto L_0x023c
            n.m0.c.d(r0)     // Catch:{ all -> 0x02c9 }
        L_0x023c:
            int r9 = r26 + 1
            r0 = 20
            if (r9 > r0) goto L_0x024f
            r3 = 1
            r1.i(r3)
            r3 = r1
            r1 = r2
            r2 = r17
            r8 = r25
            r0 = 1
            goto L_0x02b5
        L_0x024f:
            java.net.ProtocolException r0 = new java.net.ProtocolException     // Catch:{ all -> 0x02c9 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x02c9 }
            r3.<init>()     // Catch:{ all -> 0x02c9 }
            java.lang.String r4 = "Too many follow-up requests: "
            r3.append(r4)     // Catch:{ all -> 0x02c9 }
            r3.append(r9)     // Catch:{ all -> 0x02c9 }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x02c9 }
            r0.<init>(r3)     // Catch:{ all -> 0x02c9 }
            throw r0     // Catch:{ all -> 0x02c9 }
        L_0x0266:
            r0 = move-exception
            r2 = r48
            goto L_0x02cf
        L_0x026b:
            r0 = move-exception
            r17 = r2
            r1 = r3
            r2 = r48
            r3 = r0
            boolean r0 = r3 instanceof n.m0.j.a     // Catch:{ all -> 0x02c9 }
            if (r0 != 0) goto L_0x0279
            r0 = 1
            goto L_0x027a
        L_0x0279:
            r0 = 0
        L_0x027a:
            boolean r0 = r2.c(r3, r1, r4, r0)     // Catch:{ all -> 0x02c9 }
            r5 = r25
            if (r0 == 0) goto L_0x028d
            java.util.List r0 = e.t.g.J(r5, r3)     // Catch:{ all -> 0x02c9 }
            r3 = 1
            r1.i(r3)
            r8 = r0
            r6 = 0
            goto L_0x02ae
        L_0x028d:
            n.m0.c.B(r3, r5)     // Catch:{ all -> 0x02c9 }
            throw r3     // Catch:{ all -> 0x02c9 }
        L_0x0291:
            r0 = move-exception
            r17 = r2
            r1 = r3
            r5 = r25
            r2 = r48
            r3 = r0
            java.io.IOException r0 = r3.f10220h     // Catch:{ all -> 0x02c9 }
            r6 = 0
            boolean r0 = r2.c(r0, r1, r4, r6)     // Catch:{ all -> 0x02c9 }
            if (r0 == 0) goto L_0x02b8
            java.io.IOException r0 = r3.f10221i     // Catch:{ all -> 0x02c9 }
            java.util.List r0 = e.t.g.J(r5, r0)     // Catch:{ all -> 0x02c9 }
            r3 = 1
            r1.i(r3)
            r8 = r0
        L_0x02ae:
            r3 = r1
            r1 = r2
            r0 = r6
            r2 = r17
            r9 = r26
        L_0x02b5:
            r7 = 1
            goto L_0x0018
        L_0x02b8:
            java.io.IOException r0 = r3.f10221i     // Catch:{ all -> 0x02c9 }
            n.m0.c.B(r0, r5)     // Catch:{ all -> 0x02c9 }
            throw r0     // Catch:{ all -> 0x02c9 }
        L_0x02be:
            r2 = r48
            r1 = r3
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x02c9 }
            java.lang.String r3 = "Canceled"
            r0.<init>(r3)     // Catch:{ all -> 0x02c9 }
            throw r0     // Catch:{ all -> 0x02c9 }
        L_0x02c9:
            r0 = move-exception
            goto L_0x02cf
        L_0x02cb:
            r0 = move-exception
            r2 = r48
            r1 = r3
        L_0x02cf:
            r3 = 1
            r1.i(r3)
            throw r0
        L_0x02d4:
            r2 = r1
            r1 = r3
            java.lang.String r0 = "Check failed."
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException     // Catch:{ all -> 0x02f0 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x02f0 }
            r3.<init>(r0)     // Catch:{ all -> 0x02f0 }
            throw r3     // Catch:{ all -> 0x02f0 }
        L_0x02e2:
            r2 = r1
            r1 = r3
            java.lang.String r0 = "cannot make a new request because the previous response is still open: please call response.close()"
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException     // Catch:{ all -> 0x02f0 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x02f0 }
            r3.<init>(r0)     // Catch:{ all -> 0x02f0 }
            throw r3     // Catch:{ all -> 0x02f0 }
        L_0x02f0:
            r0 = move-exception
            goto L_0x02f5
        L_0x02f2:
            r0 = move-exception
            r2 = r1
            r1 = r3
        L_0x02f5:
            monitor-exit(r1)
            throw r0
        L_0x02f7:
            r2 = r1
            java.lang.String r0 = "Check failed."
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: n.m0.h.i.a(n.a0$a):n.h0");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0003, code lost:
        r1 = r13.f10167b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final n.e0 b(n.h0 r12, n.m0.g.c r13) {
        /*
            r11 = this;
            r0 = 0
            if (r13 == 0) goto L_0x000a
            n.m0.g.i r1 = r13.f10167b
            if (r1 == 0) goto L_0x000a
            n.k0 r1 = r1.f10216q
            goto L_0x000b
        L_0x000a:
            r1 = r0
        L_0x000b:
            int r2 = r12.f10103k
            n.e0 r3 = r12.f10100h
            java.lang.String r3 = r3.c
            r4 = 0
            r5 = 308(0x134, float:4.32E-43)
            r6 = 307(0x133, float:4.3E-43)
            r7 = 1
            if (r2 == r6) goto L_0x00b3
            if (r2 == r5) goto L_0x00b3
            r8 = 401(0x191, float:5.62E-43)
            if (r2 == r8) goto L_0x00aa
            r8 = 421(0x1a5, float:5.9E-43)
            if (r2 == r8) goto L_0x0081
            r13 = 503(0x1f7, float:7.05E-43)
            if (r2 == r13) goto L_0x006b
            r13 = 407(0x197, float:5.7E-43)
            if (r2 == r13) goto L_0x004d
            r13 = 408(0x198, float:5.72E-43)
            if (r2 == r13) goto L_0x0033
            switch(r2) {
                case 300: goto L_0x00b3;
                case 301: goto L_0x00b3;
                case 302: goto L_0x00b3;
                case 303: goto L_0x00b3;
                default: goto L_0x0032;
            }
        L_0x0032:
            return r0
        L_0x0033:
            n.c0 r1 = r11.a
            boolean r1 = r1.f10055m
            if (r1 != 0) goto L_0x003a
            return r0
        L_0x003a:
            n.h0 r1 = r12.f10109q
            if (r1 == 0) goto L_0x0043
            int r1 = r1.f10103k
            if (r1 != r13) goto L_0x0043
            return r0
        L_0x0043:
            int r13 = r11.d(r12, r4)
            if (r13 <= 0) goto L_0x004a
            return r0
        L_0x004a:
            n.e0 r12 = r12.f10100h
            return r12
        L_0x004d:
            e.x.c.i.c(r1)
            java.net.Proxy r13 = r1.f10140b
            java.net.Proxy$Type r13 = r13.type()
            java.net.Proxy$Type r0 = java.net.Proxy.Type.HTTP
            if (r13 != r0) goto L_0x0063
            n.c0 r13 = r11.a
            n.c r13 = r13.t
            n.e0 r12 = r13.a(r1, r12)
            return r12
        L_0x0063:
            java.net.ProtocolException r12 = new java.net.ProtocolException
            java.lang.String r13 = "Received HTTP_PROXY_AUTH (407) code while not using proxy"
            r12.<init>(r13)
            throw r12
        L_0x006b:
            n.h0 r1 = r12.f10109q
            if (r1 == 0) goto L_0x0074
            int r1 = r1.f10103k
            if (r1 != r13) goto L_0x0074
            return r0
        L_0x0074:
            r13 = 2147483647(0x7fffffff, float:NaN)
            int r13 = r11.d(r12, r13)
            if (r13 != 0) goto L_0x0080
            n.e0 r12 = r12.f10100h
            return r12
        L_0x0080:
            return r0
        L_0x0081:
            if (r13 == 0) goto L_0x00a9
            n.m0.g.d r1 = r13.f10168e
            n.a r1 = r1.f10183h
            n.z r1 = r1.a
            java.lang.String r1 = r1.f10431e
            n.m0.g.i r2 = r13.f10167b
            n.k0 r2 = r2.f10216q
            n.a r2 = r2.a
            n.z r2 = r2.a
            java.lang.String r2 = r2.f10431e
            boolean r1 = e.x.c.i.a(r1, r2)
            r1 = r1 ^ r7
            if (r1 != 0) goto L_0x009d
            goto L_0x00a9
        L_0x009d:
            n.m0.g.i r13 = r13.f10167b
            monitor-enter(r13)
            r13.f10209j = r7     // Catch:{ all -> 0x00a6 }
            monitor-exit(r13)
            n.e0 r12 = r12.f10100h
            return r12
        L_0x00a6:
            r12 = move-exception
            monitor-exit(r13)
            throw r12
        L_0x00a9:
            return r0
        L_0x00aa:
            n.c0 r13 = r11.a
            n.c r13 = r13.f10056n
            n.e0 r12 = r13.a(r1, r12)
            return r12
        L_0x00b3:
            n.c0 r13 = r11.a
            boolean r13 = r13.f10057o
            if (r13 != 0) goto L_0x00bb
            goto L_0x0158
        L_0x00bb:
            r13 = 2
            java.lang.String r1 = "Location"
            java.lang.String r13 = n.h0.b(r12, r1, r0, r13)
            if (r13 == 0) goto L_0x0158
            n.e0 r1 = r12.f10100h
            n.z r1 = r1.f10092b
            java.util.Objects.requireNonNull(r1)
            java.lang.String r2 = "link"
            e.x.c.i.e(r13, r2)
            n.z$a r13 = r1.g(r13)
            if (r13 == 0) goto L_0x00db
            n.z r13 = r13.b()
            goto L_0x00dc
        L_0x00db:
            r13 = r0
        L_0x00dc:
            if (r13 == 0) goto L_0x0158
            java.lang.String r1 = r13.f10430b
            n.e0 r2 = r12.f10100h
            n.z r2 = r2.f10092b
            java.lang.String r2 = r2.f10430b
            boolean r1 = e.x.c.i.a(r1, r2)
            if (r1 != 0) goto L_0x00f3
            n.c0 r1 = r11.a
            boolean r1 = r1.f10058p
            if (r1 != 0) goto L_0x00f3
            goto L_0x0158
        L_0x00f3:
            n.e0 r1 = r12.f10100h
            java.util.Objects.requireNonNull(r1)
            n.e0$a r2 = new n.e0$a
            r2.<init>(r1)
            boolean r1 = n.m0.h.f.a(r3)
            if (r1 == 0) goto L_0x0142
            int r1 = r12.f10103k
            java.lang.String r8 = "method"
            e.x.c.i.e(r3, r8)
            java.lang.String r9 = "PROPFIND"
            boolean r10 = e.x.c.i.a(r3, r9)
            if (r10 != 0) goto L_0x0116
            if (r1 == r5) goto L_0x0116
            if (r1 != r6) goto L_0x0117
        L_0x0116:
            r4 = r7
        L_0x0117:
            e.x.c.i.e(r3, r8)
            boolean r8 = e.x.c.i.a(r3, r9)
            r7 = r7 ^ r8
            if (r7 == 0) goto L_0x0128
            if (r1 == r5) goto L_0x0128
            if (r1 == r6) goto L_0x0128
            java.lang.String r3 = "GET"
            goto L_0x012e
        L_0x0128:
            if (r4 == 0) goto L_0x012e
            n.e0 r0 = r12.f10100h
            n.g0 r0 = r0.f10093e
        L_0x012e:
            r2.d(r3, r0)
            if (r4 != 0) goto L_0x0142
            java.lang.String r0 = "Transfer-Encoding"
            r2.f(r0)
            java.lang.String r0 = "Content-Length"
            r2.f(r0)
            java.lang.String r0 = "Content-Type"
            r2.f(r0)
        L_0x0142:
            n.e0 r12 = r12.f10100h
            n.z r12 = r12.f10092b
            boolean r12 = n.m0.c.a(r12, r13)
            if (r12 != 0) goto L_0x0151
            java.lang.String r12 = "Authorization"
            r2.f(r12)
        L_0x0151:
            r2.h(r13)
            n.e0 r0 = r2.b()
        L_0x0158:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: n.m0.h.i.b(n.h0, n.m0.g.c):n.e0");
    }

    public final boolean c(IOException iOException, e eVar, e0 e0Var, boolean z) {
        boolean z2;
        m mVar;
        n.m0.g.i iVar;
        if (!this.a.f10055m) {
            return false;
        }
        if (z) {
            g0 g0Var = e0Var.f10093e;
            if (iOException instanceof FileNotFoundException) {
                return false;
            }
        }
        if (!(!(iOException instanceof ProtocolException) && (!(iOException instanceof InterruptedIOException) ? (!(iOException instanceof SSLHandshakeException) || !(iOException.getCause() instanceof CertificateException)) && !(iOException instanceof SSLPeerUnverifiedException) : (iOException instanceof SocketTimeoutException) && !z))) {
            return false;
        }
        d dVar = eVar.f10191m;
        e.x.c.i.c(dVar);
        int i2 = dVar.c;
        if (i2 == 0 && dVar.d == 0 && dVar.f10181e == 0) {
            z2 = false;
        } else {
            if (dVar.f == null) {
                k0 k0Var = null;
                if (i2 <= 1 && dVar.d <= 1 && dVar.f10181e <= 0 && (iVar = dVar.f10184i.f10192n) != null) {
                    synchronized (iVar) {
                        if (iVar.f10210k == 0) {
                            if (c.a(iVar.f10216q.a.a, dVar.f10183h.a)) {
                                k0Var = iVar.f10216q;
                            }
                        }
                    }
                }
                if (k0Var != null) {
                    dVar.f = k0Var;
                } else {
                    m.a aVar = dVar.a;
                    if ((aVar == null || !aVar.a()) && (mVar = dVar.f10180b) != null) {
                        z2 = mVar.a();
                    }
                }
            }
            z2 = true;
        }
        if (!z2) {
            return false;
        }
        return true;
    }

    public final int d(h0 h0Var, int i2) {
        String b2 = h0.b(h0Var, "Retry-After", (String) null, 2);
        if (b2 == null) {
            return i2;
        }
        e.x.c.i.e("\\d+", "pattern");
        Pattern compile = Pattern.compile("\\d+");
        e.x.c.i.d(compile, "Pattern.compile(pattern)");
        e.x.c.i.e(compile, "nativePattern");
        e.x.c.i.e(b2, "input");
        if (!compile.matcher(b2).matches()) {
            return ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
        }
        Integer valueOf = Integer.valueOf(b2);
        e.x.c.i.d(valueOf, "Integer.valueOf(header)");
        return valueOf.intValue();
    }
}
