package b.l.a.c.f.e;

import b.e.a.a.a;
import java.security.GeneralSecurityException;
import java.util.Objects;

public final class j2 {
    public final s9 a;

    public j2(s9 s9Var) {
        this.a = s9Var;
    }

    public static final j2 a(s9 s9Var) {
        if (s9Var.u() > 0) {
            return new j2(s9Var);
        }
        throw new GeneralSecurityException("empty keyset");
    }

    public static final j2 f(k5 k5Var, x1 x1Var) {
        s8 t = s8.t(k5Var.a(), fn.a());
        if (t.s().l() != 0) {
            try {
                s9 w = s9.w(x1Var.b(t.s().L(), new byte[0]), fn.a());
                if (w.u() > 0) {
                    return new j2(w);
                }
                throw new GeneralSecurityException("empty keyset");
            } catch (l unused) {
                throw new GeneralSecurityException("invalid keyset, corrupted key material");
            }
        } else {
            throw new GeneralSecurityException("empty keyset");
        }
    }

    public final void b(l2 l2Var, x1 x1Var) {
        s9 s9Var = this.a;
        byte[] a2 = x1Var.a(s9Var.a(), new byte[0]);
        try {
            if (s9.w(x1Var.b(a2, new byte[0]), fn.a()).equals(s9Var)) {
                r8 u = s8.u();
                um K = um.K(a2);
                if (u.f3216j) {
                    u.a();
                    u.f3216j = false;
                }
                ((s8) u.f3215i).zzb = K;
                x9 a3 = b3.a(s9Var);
                if (u.f3216j) {
                    u.a();
                    u.f3216j = false;
                }
                s8.x((s8) u.f3215i, a3);
                l2Var.a((s8) u.c());
                return;
            }
            throw new GeneralSecurityException("cannot encrypt keyset");
        } catch (l unused) {
            throw new GeneralSecurityException("invalid keyset, corrupted key material");
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:3:0x0010  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c(b.l.a.c.f.e.l2 r5) {
        /*
            r4 = this;
            b.l.a.c.f.e.s9 r0 = r4.a
            java.util.List r0 = r0.t()
            java.util.Iterator r0 = r0.iterator()
        L_0x000a:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0064
            java.lang.Object r1 = r0.next()
            b.l.a.c.f.e.r9 r1 = (b.l.a.c.f.e.r9) r1
            b.l.a.c.f.e.h9 r2 = r1.t()
            b.l.a.c.f.e.g9 r2 = r2.u()
            b.l.a.c.f.e.g9 r3 = b.l.a.c.f.e.g9.UNKNOWN_KEYMATERIAL
            if (r2 == r3) goto L_0x003b
            b.l.a.c.f.e.h9 r2 = r1.t()
            b.l.a.c.f.e.g9 r2 = r2.u()
            b.l.a.c.f.e.g9 r3 = b.l.a.c.f.e.g9.SYMMETRIC
            if (r2 == r3) goto L_0x003b
            b.l.a.c.f.e.h9 r2 = r1.t()
            b.l.a.c.f.e.g9 r2 = r2.u()
            b.l.a.c.f.e.g9 r3 = b.l.a.c.f.e.g9.ASYMMETRIC_PRIVATE
            if (r2 == r3) goto L_0x003b
            goto L_0x000a
        L_0x003b:
            java.security.GeneralSecurityException r5 = new java.security.GeneralSecurityException
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r2 = 0
            b.l.a.c.f.e.h9 r3 = r1.t()
            b.l.a.c.f.e.g9 r3 = r3.u()
            java.lang.String r3 = r3.name()
            r0[r2] = r3
            r2 = 1
            b.l.a.c.f.e.h9 r1 = r1.t()
            java.lang.String r1 = r1.s()
            r0[r2] = r1
            java.lang.String r1 = "keyset contains key material of type %s for type url %s"
            java.lang.String r0 = java.lang.String.format(r1, r0)
            r5.<init>(r0)
            throw r5
        L_0x0064:
            b.l.a.c.f.e.s9 r0 = r4.a
            b.l.a.c.f.e.y1 r5 = (b.l.a.c.f.e.y1) r5
            r5.b(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: b.l.a.c.f.e.j2.c(b.l.a.c.f.e.l2):void");
    }

    public final j2 d() {
        if (this.a != null) {
            p9 x = s9.x();
            for (r9 next : this.a.t()) {
                h9 t = next.t();
                if (t.u() == g9.ASYMMETRIC_PRIVATE) {
                    String s = t.s();
                    um t2 = t.t();
                    d2 i2 = a3.i(s, (Class) null);
                    if (i2 instanceof u2) {
                        u2 u2Var = (u2) i2;
                        Objects.requireNonNull(u2Var);
                        try {
                            i8 v = i8.v(t2, fn.a());
                            u4.h(v);
                            l8 t3 = v.t();
                            u2Var.c.d(t3);
                            e9 v2 = h9.v();
                            if (v2.f3216j) {
                                v2.a();
                                v2.f3216j = false;
                            }
                            ((h9) v2.f3215i).zzb = "type.googleapis.com/google.crypto.tink.EciesAeadHkdfPublicKey";
                            um n2 = t3.n();
                            if (v2.f3216j) {
                                v2.a();
                                v2.f3216j = false;
                            }
                            ((h9) v2.f3215i).zze = n2;
                            g9 g9Var = g9.ASYMMETRIC_PUBLIC;
                            if (v2.f3216j) {
                                v2.a();
                                v2.f3216j = false;
                            }
                            h9.A((h9) v2.f3215i, g9Var);
                            h9 h9Var = (h9) v2.c();
                            a3.j(h9Var.s(), h9Var.t(), (Class) null);
                            q9 x2 = r9.x();
                            x2.d(next);
                            if (x2.f3216j) {
                                x2.a();
                                x2.f3216j = false;
                            }
                            r9.z((r9) x2.f3215i, h9Var);
                            r9 r9Var = (r9) x2.c();
                            if (x.f3216j) {
                                x.a();
                                x.f3216j = false;
                            }
                            s9.A((s9) x.f3215i, r9Var);
                        } catch (l e2) {
                            throw new GeneralSecurityException("expected serialized proto of type ", e2);
                        }
                    } else {
                        throw new GeneralSecurityException(a.r(new StringBuilder(String.valueOf(s).length() + 48), "manager for key type ", s, " is not a PrivateKeyManager"));
                    }
                } else {
                    throw new GeneralSecurityException("The keyset contains a non-private key");
                }
            }
            int s2 = this.a.s();
            if (x.f3216j) {
                x.a();
                x.f3216j = false;
            }
            ((s9) x.f3215i).zzb = s2;
            return new j2((s9) x.c());
        }
        throw new GeneralSecurityException("cleartext keyset is not available");
    }

    /* JADX WARNING: Removed duplicated region for block: B:120:0x00f9 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0179  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x017b  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0191  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x01b1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final <P> P e(java.lang.Class<P> r15) {
        /*
            r14 = this;
            b.l.a.c.f.e.i9 r0 = b.l.a.c.f.e.i9.ENABLED
            java.util.concurrent.ConcurrentMap<java.lang.Class<?>, b.l.a.c.f.e.t2<?, ?>> r1 = b.l.a.c.f.e.a3.f2841e
            java.lang.Object r1 = r1.get(r15)
            b.l.a.c.f.e.t2 r1 = (b.l.a.c.f.e.t2) r1
            r2 = 0
            if (r1 != 0) goto L_0x000f
            r1 = r2
            goto L_0x0013
        L_0x000f:
            java.lang.Class r1 = r1.c()
        L_0x0013:
            java.lang.String r3 = "No wrapper found for "
            if (r1 != 0) goto L_0x0031
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            java.lang.String r15 = r15.getName()
            int r1 = r15.length()
            if (r1 == 0) goto L_0x0028
            java.lang.String r15 = r3.concat(r15)
            goto L_0x002d
        L_0x0028:
            java.lang.String r15 = new java.lang.String
            r15.<init>(r3)
        L_0x002d:
            r0.<init>(r15)
            throw r0
        L_0x0031:
            b.l.a.c.f.e.s9 r4 = r14.a
            int r5 = b.l.a.c.f.e.b3.a
            int r5 = r4.s()
            java.util.List r4 = r4.t()
            java.util.Iterator r4 = r4.iterator()
            r6 = 0
            r7 = 1
            r8 = r6
            r9 = r8
            r10 = r7
        L_0x0046:
            boolean r11 = r4.hasNext()
            if (r11 == 0) goto L_0x00db
            java.lang.Object r11 = r4.next()
            b.l.a.c.f.e.r9 r11 = (b.l.a.c.f.e.r9) r11
            b.l.a.c.f.e.i9 r12 = r11.u()
            if (r12 != r0) goto L_0x0046
            boolean r12 = r11.s()
            if (r12 == 0) goto L_0x00c3
            b.l.a.c.f.e.ia r12 = r11.w()
            b.l.a.c.f.e.ia r13 = b.l.a.c.f.e.ia.UNKNOWN_PREFIX
            if (r12 == r13) goto L_0x00ab
            b.l.a.c.f.e.i9 r12 = r11.u()
            b.l.a.c.f.e.i9 r13 = b.l.a.c.f.e.i9.UNKNOWN_STATUS
            if (r12 == r13) goto L_0x0093
            int r12 = r11.v()
            if (r12 != r5) goto L_0x0080
            if (r9 != 0) goto L_0x0078
            r9 = r7
            goto L_0x0080
        L_0x0078:
            java.security.GeneralSecurityException r15 = new java.security.GeneralSecurityException
            java.lang.String r0 = "keyset contains multiple primary keys"
            r15.<init>(r0)
            throw r15
        L_0x0080:
            b.l.a.c.f.e.h9 r11 = r11.t()
            b.l.a.c.f.e.g9 r11 = r11.u()
            b.l.a.c.f.e.g9 r12 = b.l.a.c.f.e.g9.ASYMMETRIC_PUBLIC
            if (r11 == r12) goto L_0x008e
            r11 = r6
            goto L_0x008f
        L_0x008e:
            r11 = r7
        L_0x008f:
            r10 = r10 & r11
            int r8 = r8 + 1
            goto L_0x0046
        L_0x0093:
            java.security.GeneralSecurityException r15 = new java.security.GeneralSecurityException
            java.lang.Object[] r0 = new java.lang.Object[r7]
            int r1 = r11.v()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0[r6] = r1
            java.lang.String r1 = "key %d has unknown status"
            java.lang.String r0 = java.lang.String.format(r1, r0)
            r15.<init>(r0)
            throw r15
        L_0x00ab:
            java.security.GeneralSecurityException r15 = new java.security.GeneralSecurityException
            java.lang.Object[] r0 = new java.lang.Object[r7]
            int r1 = r11.v()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0[r6] = r1
            java.lang.String r1 = "key %d has unknown prefix"
            java.lang.String r0 = java.lang.String.format(r1, r0)
            r15.<init>(r0)
            throw r15
        L_0x00c3:
            java.security.GeneralSecurityException r15 = new java.security.GeneralSecurityException
            java.lang.Object[] r0 = new java.lang.Object[r7]
            int r1 = r11.v()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0[r6] = r1
            java.lang.String r1 = "key %d has no key data"
            java.lang.String r0 = java.lang.String.format(r1, r0)
            r15.<init>(r0)
            throw r15
        L_0x00db:
            if (r8 == 0) goto L_0x0253
            if (r9 != 0) goto L_0x00ea
            if (r10 == 0) goto L_0x00e2
            goto L_0x00ea
        L_0x00e2:
            java.security.GeneralSecurityException r15 = new java.security.GeneralSecurityException
            java.lang.String r0 = "keyset doesn't contain a valid primary key"
            r15.<init>(r0)
            throw r15
        L_0x00ea:
            b.l.a.c.f.e.s2 r4 = new b.l.a.c.f.e.s2
            r4.<init>(r1)
            b.l.a.c.f.e.s9 r5 = r14.a
            java.util.List r5 = r5.t()
            java.util.Iterator r5 = r5.iterator()
        L_0x00f9:
            boolean r8 = r5.hasNext()
            if (r8 == 0) goto L_0x01e4
            java.lang.Object r8 = r5.next()
            b.l.a.c.f.e.r9 r8 = (b.l.a.c.f.e.r9) r8
            b.l.a.c.f.e.i9 r9 = r8.u()
            if (r9 != r0) goto L_0x00f9
            b.l.a.c.f.e.h9 r9 = r8.t()
            java.lang.String r10 = r9.s()
            b.l.a.c.f.e.um r9 = r9.t()
            java.lang.Object r9 = b.l.a.c.f.e.a3.j(r10, r9, r1)
            b.l.a.c.f.e.i9 r10 = r8.u()
            if (r10 != r0) goto L_0x01dc
            b.l.a.c.f.e.q2 r10 = new b.l.a.c.f.e.q2
            b.l.a.c.f.e.ia r11 = r8.w()
            int r11 = r11.ordinal()
            r12 = 5
            if (r11 == r7) goto L_0x014c
            r13 = 2
            if (r11 == r13) goto L_0x0143
            r13 = 3
            if (r11 == r13) goto L_0x0140
            r13 = 4
            if (r11 != r13) goto L_0x0138
            goto L_0x0143
        L_0x0138:
            java.security.GeneralSecurityException r15 = new java.security.GeneralSecurityException
            java.lang.String r0 = "unknown output prefix type"
            r15.<init>(r0)
            throw r15
        L_0x0140:
            byte[] r11 = b.l.a.c.f.e.z1.a
            goto L_0x0160
        L_0x0143:
            java.nio.ByteBuffer r11 = java.nio.ByteBuffer.allocate(r12)
            java.nio.ByteBuffer r11 = r11.put(r6)
            goto L_0x0154
        L_0x014c:
            java.nio.ByteBuffer r11 = java.nio.ByteBuffer.allocate(r12)
            java.nio.ByteBuffer r11 = r11.put(r7)
        L_0x0154:
            int r12 = r8.v()
            java.nio.ByteBuffer r11 = r11.putInt(r12)
            byte[] r11 = r11.array()
        L_0x0160:
            b.l.a.c.f.e.i9 r12 = r8.u()
            b.l.a.c.f.e.ia r13 = r8.w()
            r10.<init>(r9, r11, r12, r13)
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            r9.add(r10)
            b.l.a.c.f.e.r2 r11 = new b.l.a.c.f.e.r2
            byte[] r12 = r10.f3241b
            if (r12 != 0) goto L_0x017b
            r12 = r2
            goto L_0x0180
        L_0x017b:
            int r13 = r12.length
            byte[] r12 = java.util.Arrays.copyOf(r12, r13)
        L_0x0180:
            r11.<init>(r12)
            java.util.concurrent.ConcurrentMap<b.l.a.c.f.e.r2, java.util.List<b.l.a.c.f.e.q2<P>>> r12 = r4.a
            java.util.List r9 = java.util.Collections.unmodifiableList(r9)
            java.lang.Object r9 = r12.put(r11, r9)
            java.util.List r9 = (java.util.List) r9
            if (r9 == 0) goto L_0x01a5
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            r12.addAll(r9)
            r12.add(r10)
            java.util.concurrent.ConcurrentMap<b.l.a.c.f.e.r2, java.util.List<b.l.a.c.f.e.q2<P>>> r9 = r4.a
            java.util.List r12 = java.util.Collections.unmodifiableList(r12)
            r9.put(r11, r12)
        L_0x01a5:
            int r8 = r8.v()
            b.l.a.c.f.e.s9 r9 = r14.a
            int r9 = r9.s()
            if (r8 != r9) goto L_0x00f9
            b.l.a.c.f.e.i9 r8 = r10.c
            if (r8 != r0) goto L_0x01d4
            byte[] r8 = r10.f3241b
            if (r8 != 0) goto L_0x01bb
            r8 = r2
            goto L_0x01c0
        L_0x01bb:
            int r9 = r8.length
            byte[] r8 = java.util.Arrays.copyOf(r8, r9)
        L_0x01c0:
            java.util.List r8 = r4.a(r8)
            boolean r8 = r8.isEmpty()
            if (r8 != 0) goto L_0x01cc
            goto L_0x00f9
        L_0x01cc:
            java.lang.IllegalArgumentException r15 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "the primary entry cannot be set to an entry which is not held by this primitive set"
            r15.<init>(r0)
            throw r15
        L_0x01d4:
            java.lang.IllegalArgumentException r15 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "the primary entry has to be ENABLED"
            r15.<init>(r0)
            throw r15
        L_0x01dc:
            java.security.GeneralSecurityException r15 = new java.security.GeneralSecurityException
            java.lang.String r0 = "only ENABLED key is allowed"
            r15.<init>(r0)
            throw r15
        L_0x01e4:
            java.util.concurrent.ConcurrentMap<java.lang.Class<?>, b.l.a.c.f.e.t2<?, ?>> r0 = b.l.a.c.f.e.a3.f2841e
            java.lang.Object r15 = r0.get(r15)
            b.l.a.c.f.e.t2 r15 = (b.l.a.c.f.e.t2) r15
            if (r15 != 0) goto L_0x020a
            java.security.GeneralSecurityException r15 = new java.security.GeneralSecurityException
            java.lang.Class<P> r0 = r4.f3267b
            java.lang.String r0 = r0.getName()
            int r1 = r0.length()
            if (r1 == 0) goto L_0x0201
            java.lang.String r0 = r3.concat(r0)
            goto L_0x0206
        L_0x0201:
            java.lang.String r0 = new java.lang.String
            r0.<init>(r3)
        L_0x0206:
            r15.<init>(r0)
            throw r15
        L_0x020a:
            java.lang.Class r0 = r15.c()
            java.lang.Class<P> r1 = r4.f3267b
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x021b
            java.lang.Object r15 = r15.a(r4)
            return r15
        L_0x021b:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            java.lang.Class r15 = r15.c()
            java.lang.String r15 = java.lang.String.valueOf(r15)
            java.lang.Class<P> r1 = r4.f3267b
            java.lang.String r1 = java.lang.String.valueOf(r1)
            int r2 = r15.length()
            int r3 = r1.length()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            int r2 = r2 + 44
            int r2 = r2 + r3
            r4.<init>(r2)
            java.lang.String r2 = "Wrong input primitive class, expected "
            r4.append(r2)
            r4.append(r15)
            java.lang.String r15 = ", got "
            r4.append(r15)
            r4.append(r1)
            java.lang.String r15 = r4.toString()
            r0.<init>(r15)
            throw r0
        L_0x0253:
            java.security.GeneralSecurityException r15 = new java.security.GeneralSecurityException
            java.lang.String r0 = "keyset must contain at least one ENABLED key"
            r15.<init>(r0)
            throw r15
        */
        throw new UnsupportedOperationException("Method not decompiled: b.l.a.c.f.e.j2.e(java.lang.Class):java.lang.Object");
    }

    public final String toString() {
        return b3.a(this.a).toString();
    }
}
