package b.l.a.c.f.e;

import androidx.exifinterface.media.ExifInterface;
import java.security.GeneralSecurityException;
import java.security.SecureRandom;

public final class k2 {
    public final p9 a;

    public k2(p9 p9Var) {
        this.a = p9Var;
    }

    public static k2 a(j2 j2Var) {
        s9 s9Var = j2Var.a;
        on onVar = (on) s9Var.h(5, (Object) null, (Object) null);
        onVar.d(s9Var);
        return new k2((p9) onVar);
    }

    public static int g() {
        SecureRandom secureRandom = new SecureRandom();
        byte[] bArr = new byte[4];
        byte b2 = 0;
        while (b2 == 0) {
            secureRandom.nextBytes(bArr);
            b2 = ((bArr[0] & Byte.MAX_VALUE) << 24) | ((bArr[1] & ExifInterface.MARKER) << 16) | ((bArr[2] & ExifInterface.MARKER) << 8) | (bArr[3] & ExifInterface.MARKER);
        }
        return b2;
    }

    public final synchronized j2 b() {
        return j2.a((s9) this.a.c());
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    @java.lang.Deprecated
    public final synchronized int c(b.l.a.c.f.e.l9 r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            monitor-enter(r2)     // Catch:{ all -> 0x002b }
            b.l.a.c.f.e.h9 r0 = b.l.a.c.f.e.a3.c(r3)     // Catch:{ all -> 0x0028 }
            b.l.a.c.f.e.ia r3 = r3.u()     // Catch:{ all -> 0x0028 }
            b.l.a.c.f.e.r9 r3 = r2.e(r0, r3)     // Catch:{ all -> 0x0028 }
            monitor-exit(r2)     // Catch:{ all -> 0x002b }
            b.l.a.c.f.e.p9 r0 = r2.a     // Catch:{ all -> 0x002b }
            boolean r1 = r0.f3216j     // Catch:{ all -> 0x002b }
            if (r1 == 0) goto L_0x001b
            r0.a()     // Catch:{ all -> 0x002b }
            r1 = 0
            r0.f3216j = r1     // Catch:{ all -> 0x002b }
        L_0x001b:
            MessageType r0 = r0.f3215i     // Catch:{ all -> 0x002b }
            b.l.a.c.f.e.s9 r0 = (b.l.a.c.f.e.s9) r0     // Catch:{ all -> 0x002b }
            b.l.a.c.f.e.s9.A(r0, r3)     // Catch:{ all -> 0x002b }
            int r3 = r3.v()     // Catch:{ all -> 0x002b }
            monitor-exit(r2)
            return r3
        L_0x0028:
            r3 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x002b }
            throw r3     // Catch:{ all -> 0x002b }
        L_0x002b:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: b.l.a.c.f.e.k2.c(b.l.a.c.f.e.l9):int");
    }

    public final synchronized k2 d(int i2) {
        int i3 = 0;
        while (i3 < ((s9) this.a.f3215i).u()) {
            r9 v = ((s9) this.a.f3215i).v(i3);
            if (v.v() != i2) {
                i3++;
            } else if (v.u().equals(i9.ENABLED)) {
                p9 p9Var = this.a;
                if (p9Var.f3216j) {
                    p9Var.a();
                    p9Var.f3216j = false;
                }
                ((s9) p9Var.f3215i).zzb = i2;
            } else {
                StringBuilder sb = new StringBuilder(63);
                sb.append("cannot set key as primary because it's not enabled: ");
                sb.append(i2);
                throw new GeneralSecurityException(sb.toString());
            }
        }
        StringBuilder sb2 = new StringBuilder(26);
        sb2.append("key not found: ");
        sb2.append(i2);
        throw new GeneralSecurityException(sb2.toString());
        return this;
    }

    public final synchronized r9 e(h9 h9Var, ia iaVar) {
        q9 x;
        int f = f();
        if (iaVar != ia.UNKNOWN_PREFIX) {
            x = r9.x();
            if (x.f3216j) {
                x.a();
                x.f3216j = false;
            }
            r9.z((r9) x.f3215i, h9Var);
            if (x.f3216j) {
                x.a();
                x.f3216j = false;
            }
            ((r9) x.f3215i).zzf = f;
            i9 i9Var = i9.ENABLED;
            if (x.f3216j) {
                x.a();
                x.f3216j = false;
            }
            ((r9) x.f3215i).zze = i9Var.a();
            if (x.f3216j) {
                x.a();
                x.f3216j = false;
            }
            ((r9) x.f3215i).zzg = iaVar.a();
        } else {
            throw new GeneralSecurityException("unknown output prefix type");
        }
        return (r9) x.c();
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
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processLoop(RegionMaker.java:210)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public final synchronized int f() {
        /*
            r3 = this;
            monitor-enter(r3)
        L_0x0001:
            int r0 = g()     // Catch:{ all -> 0x0036 }
            monitor-enter(r3)     // Catch:{ all -> 0x0036 }
            b.l.a.c.f.e.p9 r1 = r3.a     // Catch:{ all -> 0x0033 }
            MessageType r1 = r1.f3215i     // Catch:{ all -> 0x0033 }
            b.l.a.c.f.e.s9 r1 = (b.l.a.c.f.e.s9) r1     // Catch:{ all -> 0x0033 }
            java.util.List r1 = r1.t()     // Catch:{ all -> 0x0033 }
            java.util.List r1 = java.util.Collections.unmodifiableList(r1)     // Catch:{ all -> 0x0033 }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x0033 }
        L_0x0018:
            boolean r2 = r1.hasNext()     // Catch:{ all -> 0x0033 }
            if (r2 == 0) goto L_0x002c
            java.lang.Object r2 = r1.next()     // Catch:{ all -> 0x0033 }
            b.l.a.c.f.e.r9 r2 = (b.l.a.c.f.e.r9) r2     // Catch:{ all -> 0x0033 }
            int r2 = r2.v()     // Catch:{ all -> 0x0033 }
            if (r2 != r0) goto L_0x0018
            r1 = 1
            goto L_0x002d
        L_0x002c:
            r1 = 0
        L_0x002d:
            monitor-exit(r3)     // Catch:{ all -> 0x0036 }
            if (r1 == 0) goto L_0x0031
            goto L_0x0001
        L_0x0031:
            monitor-exit(r3)
            return r0
        L_0x0033:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0036 }
            throw r0     // Catch:{ all -> 0x0036 }
        L_0x0036:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: b.l.a.c.f.e.k2.f():int");
    }
}
