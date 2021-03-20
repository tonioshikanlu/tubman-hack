package b.l.a.c.f.e;

import android.content.Context;
import android.security.keystore.KeyGenParameterSpec;
import android.util.Log;
import java.security.GeneralSecurityException;
import java.security.KeyStoreException;
import java.security.ProviderException;
import javax.crypto.KeyGenerator;

public final class f5 {
    public l2 a = null;

    /* renamed from: b  reason: collision with root package name */
    public String f2956b = null;
    public x1 c = null;
    public f2 d = null;

    /* renamed from: e  reason: collision with root package name */
    public k2 f2957e;
    public k5 f = null;

    public final f5 a(Context context, String str, String str2) {
        if (context != null) {
            this.f = new k5(context, str2);
            this.a = new l5(context, str2);
            return this;
        }
        throw new IllegalArgumentException("need an Android context");
    }

    @Deprecated
    public final f5 b(l9 l9Var) {
        String s = l9Var.s();
        byte[] L = l9Var.t().L();
        ia u = l9Var.u();
        String str = g5.c;
        int ordinal = u.ordinal();
        int i2 = 4;
        if (ordinal == 1) {
            i2 = 1;
        } else if (ordinal == 2) {
            i2 = 2;
        } else if (ordinal == 3) {
            i2 = 3;
        } else if (ordinal != 4) {
            throw new IllegalArgumentException("Unknown output prefix type");
        }
        k9 v = l9.v();
        v.f(s);
        v.g(um.J(L, 0, L.length));
        int i3 = i2 - 1;
        v.h(i3 != 0 ? i3 != 1 ? i3 != 2 ? ia.CRUNCHY : ia.RAW : ia.LEGACY : ia.TINK);
        this.d = new f2((l9) v.c());
        return this;
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processExcHandler(RegionMaker.java:1043)
        	at jadx.core.dex.visitors.regions.RegionMaker.processTryCatchBlocks(RegionMaker.java:975)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:52)
        */
    public final synchronized b.l.a.c.f.e.g5 c() {
        /*
            r4 = this;
            monitor-enter(r4)
            java.lang.String r0 = r4.f2956b     // Catch:{ all -> 0x0072 }
            if (r0 == 0) goto L_0x000b
            b.l.a.c.f.e.x1 r0 = r4.d()     // Catch:{ all -> 0x0072 }
            r4.c = r0     // Catch:{ all -> 0x0072 }
        L_0x000b:
            b.l.a.c.f.e.k2 r0 = r4.e()     // Catch:{ FileNotFoundException -> 0x0010 }
            goto L_0x005e
        L_0x0010:
            r0 = move-exception
            java.lang.String r1 = b.l.a.c.f.e.g5.c     // Catch:{ all -> 0x0072 }
            java.lang.String r2 = "keyset not found, will generate a new one"
            android.util.Log.w(r1, r2, r0)     // Catch:{ all -> 0x0072 }
            b.l.a.c.f.e.f2 r0 = r4.d     // Catch:{ all -> 0x0072 }
            if (r0 == 0) goto L_0x006a
            b.l.a.c.f.e.k2 r0 = new b.l.a.c.f.e.k2     // Catch:{ all -> 0x0072 }
            b.l.a.c.f.e.p9 r1 = b.l.a.c.f.e.s9.x()     // Catch:{ all -> 0x0072 }
            r0.<init>(r1)     // Catch:{ all -> 0x0072 }
            b.l.a.c.f.e.f2 r1 = r4.d     // Catch:{ all -> 0x0072 }
            monitor-enter(r0)     // Catch:{ all -> 0x0072 }
            b.l.a.c.f.e.l9 r1 = r1.a     // Catch:{ all -> 0x0067 }
            r0.c(r1)     // Catch:{ all -> 0x0067 }
            monitor-exit(r0)     // Catch:{ all -> 0x0072 }
            b.l.a.c.f.e.j2 r1 = r0.b()     // Catch:{ all -> 0x0072 }
            b.l.a.c.f.e.s9 r1 = r1.a     // Catch:{ all -> 0x0072 }
            b.l.a.c.f.e.x9 r1 = b.l.a.c.f.e.b3.a(r1)     // Catch:{ all -> 0x0072 }
            b.l.a.c.f.e.w9 r1 = r1.s()     // Catch:{ all -> 0x0072 }
            int r1 = r1.s()     // Catch:{ all -> 0x0072 }
            r0.d(r1)     // Catch:{ all -> 0x0072 }
            b.l.a.c.f.e.x1 r1 = r4.c     // Catch:{ all -> 0x0072 }
            if (r1 == 0) goto L_0x0053
            b.l.a.c.f.e.j2 r1 = r0.b()     // Catch:{ all -> 0x0072 }
            b.l.a.c.f.e.l2 r2 = r4.a     // Catch:{ all -> 0x0072 }
            b.l.a.c.f.e.x1 r3 = r4.c     // Catch:{ all -> 0x0072 }
            r1.b(r2, r3)     // Catch:{ all -> 0x0072 }
            goto L_0x005e
        L_0x0053:
            b.l.a.c.f.e.j2 r1 = r0.b()     // Catch:{ all -> 0x0072 }
            b.l.a.c.f.e.l2 r2 = r4.a     // Catch:{ all -> 0x0072 }
            b.l.a.c.f.e.s9 r1 = r1.a     // Catch:{ all -> 0x0072 }
            r2.b(r1)     // Catch:{ all -> 0x0072 }
        L_0x005e:
            r4.f2957e = r0     // Catch:{ all -> 0x0072 }
            b.l.a.c.f.e.g5 r0 = new b.l.a.c.f.e.g5     // Catch:{ all -> 0x0072 }
            r0.<init>(r4)     // Catch:{ all -> 0x0072 }
            monitor-exit(r4)
            return r0
        L_0x0067:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0072 }
            throw r1     // Catch:{ all -> 0x0072 }
        L_0x006a:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException     // Catch:{ all -> 0x0072 }
            java.lang.String r1 = "cannot read or generate keyset"
            r0.<init>(r1)     // Catch:{ all -> 0x0072 }
            throw r0     // Catch:{ all -> 0x0072 }
        L_0x0072:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: b.l.a.c.f.e.f5.c():b.l.a.c.f.e.g5");
    }

    public final x1 d() {
        j5 j5Var = new j5();
        boolean a2 = j5Var.a(this.f2956b);
        if (!a2) {
            try {
                String str = this.f2956b;
                if (!new j5().a(str)) {
                    String c2 = vb.c("android-keystore://", str);
                    KeyGenerator instance = KeyGenerator.getInstance("AES", "AndroidKeyStore");
                    instance.init(new KeyGenParameterSpec.Builder(c2, 3).setKeySize(256).setBlockModes(new String[]{"GCM"}).setEncryptionPaddings(new String[]{"NoPadding"}).build());
                    instance.generateKey();
                } else {
                    throw new IllegalArgumentException(String.format("cannot generate a new key %s because it already exists; please delete it with deleteKey() and try again", new Object[]{str}));
                }
            } catch (GeneralSecurityException | ProviderException e2) {
                e = e2;
                Log.w(g5.c, "cannot use Android Keystore, it'll be disabled", e);
                return null;
            }
        }
        try {
            return j5Var.e(this.f2956b);
        } catch (GeneralSecurityException | ProviderException e3) {
            e = e3;
            if (a2) {
                throw new KeyStoreException(String.format("the master key %s exists but is unusable", new Object[]{this.f2956b}), e);
            }
            Log.w(g5.c, "cannot use Android Keystore, it'll be disabled", e);
            return null;
        }
    }

    public final k2 e() {
        x1 x1Var = this.c;
        if (x1Var != null) {
            try {
                return k2.a(j2.f(this.f, x1Var));
            } catch (l | GeneralSecurityException e2) {
                Log.w(g5.c, "cannot decrypt keyset: ", e2);
            }
        }
        return k2.a(j2.a(s9.w(this.f.a(), fn.a())));
    }
}
