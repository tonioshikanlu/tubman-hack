package b.j.a.c.d0;

import b.j.a.c.b0.a0.c0;
import java.io.File;
import java.nio.file.Path;

public class c extends c0<Path> {

    /* renamed from: k  reason: collision with root package name */
    public static final boolean f1869k;

    static {
        File[] listRoots = File.listRoots();
        int length = listRoots.length;
        boolean z = false;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                break;
            }
            String path = listRoots[i2].getPath();
            if (path.length() >= 2 && Character.isLetter(path.charAt(0)) && path.charAt(1) == ':') {
                z = true;
                break;
            }
            i2++;
        }
        f1869k = z;
    }

    public c() {
        super((Class<?>) Path.class);
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object d(b.j.a.b.i r8, b.j.a.c.g r9) {
        /*
            r7 = this;
            b.j.a.b.l r0 = b.j.a.b.l.VALUE_STRING
            boolean r0 = r8.L0(r0)
            r1 = 0
            if (r0 == 0) goto L_0x0092
            java.lang.String r8 = r8.x0()
            r0 = 58
            int r2 = r8.indexOf(r0)
            r3 = 0
            if (r2 >= 0) goto L_0x001d
            java.lang.String[] r9 = new java.lang.String[r3]
            java.nio.file.Path r8 = java.nio.file.Paths.get(r8, r9)
            goto L_0x007a
        L_0x001d:
            boolean r2 = f1869k
            if (r2 == 0) goto L_0x0040
            int r2 = r8.length()
            r4 = 2
            if (r2 < r4) goto L_0x0040
            char r2 = r8.charAt(r3)
            boolean r2 = java.lang.Character.isLetter(r2)
            if (r2 == 0) goto L_0x0040
            r2 = 1
            char r2 = r8.charAt(r2)
            if (r2 != r0) goto L_0x0040
            java.lang.String[] r9 = new java.lang.String[r3]
            java.nio.file.Path r8 = java.nio.file.Paths.get(r8, r9)
            goto L_0x007a
        L_0x0040:
            java.net.URI r0 = new java.net.URI     // Catch:{ URISyntaxException -> 0x008b }
            r0.<init>(r8)     // Catch:{ URISyntaxException -> 0x008b }
            java.nio.file.Path r8 = java.nio.file.Paths.get(r0)     // Catch:{ FileSystemNotFoundException -> 0x0051, all -> 0x004a }
            goto L_0x007a
        L_0x004a:
            r0 = move-exception
            java.lang.Class<?> r2 = r7.f1761h
            r9.B(r2, r8, r0)
            throw r1
        L_0x0051:
            r2 = move-exception
            java.lang.String r3 = r0.getScheme()     // Catch:{ all -> 0x0081 }
            java.lang.Class<java.nio.file.spi.FileSystemProvider> r4 = java.nio.file.spi.FileSystemProvider.class
            java.util.ServiceLoader r4 = java.util.ServiceLoader.load(r4)     // Catch:{ all -> 0x0081 }
            java.util.Iterator r4 = r4.iterator()     // Catch:{ all -> 0x0081 }
        L_0x0060:
            boolean r5 = r4.hasNext()     // Catch:{ all -> 0x0081 }
            if (r5 == 0) goto L_0x007b
            java.lang.Object r5 = r4.next()     // Catch:{ all -> 0x0081 }
            java.nio.file.spi.FileSystemProvider r5 = (java.nio.file.spi.FileSystemProvider) r5     // Catch:{ all -> 0x0081 }
            java.lang.String r6 = r5.getScheme()     // Catch:{ all -> 0x0081 }
            boolean r6 = r6.equalsIgnoreCase(r3)     // Catch:{ all -> 0x0081 }
            if (r6 == 0) goto L_0x0060
            java.nio.file.Path r8 = r5.getPath(r0)     // Catch:{ all -> 0x0081 }
        L_0x007a:
            return r8
        L_0x007b:
            java.lang.Class<?> r0 = r7.f1761h     // Catch:{ all -> 0x0081 }
            r9.B(r0, r8, r2)     // Catch:{ all -> 0x0081 }
            throw r1
        L_0x0081:
            r0 = move-exception
            r0.addSuppressed(r2)
            java.lang.Class<?> r2 = r7.f1761h
            r9.B(r2, r8, r0)
            throw r1
        L_0x008b:
            r0 = move-exception
            java.lang.Class<?> r2 = r7.f1761h
            r9.B(r2, r8, r0)
            throw r1
        L_0x0092:
            java.lang.Class<java.nio.file.Path> r0 = java.nio.file.Path.class
            r9.G(r0, r8)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: b.j.a.c.d0.c.d(b.j.a.b.i, b.j.a.c.g):java.lang.Object");
    }
}
