package b.l.a.c.f.i;

import b.e.a.a.a;
import b.l.a.c.f.i.f4;
import b.l.a.c.f.i.g4;
import java.io.IOException;
import java.util.logging.Logger;

public abstract class g4<MessageType extends g4<MessageType, BuilderType>, BuilderType extends f4<MessageType, BuilderType>> implements q6 {
    public int zzb = 0;

    /* JADX WARNING: type inference failed for: r6v0, types: [java.util.Collection, java.lang.Object, java.lang.Iterable<T>, java.lang.Iterable] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static <T> void i(java.lang.Iterable<T> r6, java.util.List<? super T> r7) {
        /*
            java.nio.charset.Charset r0 = b.l.a.c.f.i.w5.a
            java.util.Objects.requireNonNull(r6)
            boolean r0 = r6 instanceof b.l.a.c.f.i.c6
            java.lang.String r1 = " is null."
            java.lang.String r2 = "Element at index "
            r3 = 37
            if (r0 == 0) goto L_0x0061
            b.l.a.c.f.i.c6 r6 = (b.l.a.c.f.i.c6) r6
            java.util.List r6 = r6.g()
            r0 = r7
            b.l.a.c.f.i.c6 r0 = (b.l.a.c.f.i.c6) r0
            int r7 = r7.size()
            java.util.Iterator r6 = r6.iterator()
        L_0x0020:
            boolean r4 = r6.hasNext()
            if (r4 == 0) goto L_0x00b9
            java.lang.Object r4 = r6.next()
            if (r4 != 0) goto L_0x0051
            int r6 = r0.size()
            java.lang.StringBuilder r2 = b.e.a.a.a.x(r3, r2)
            int r6 = r6 - r7
            r2.append(r6)
            r2.append(r1)
            java.lang.String r6 = r2.toString()
            int r1 = r0.size()
        L_0x0043:
            int r1 = r1 + -1
            if (r1 < r7) goto L_0x004b
            r0.remove(r1)
            goto L_0x0043
        L_0x004b:
            java.lang.NullPointerException r7 = new java.lang.NullPointerException
            r7.<init>(r6)
            throw r7
        L_0x0051:
            boolean r5 = r4 instanceof b.l.a.c.f.i.t4
            if (r5 == 0) goto L_0x005b
            b.l.a.c.f.i.t4 r4 = (b.l.a.c.f.i.t4) r4
            r0.w(r4)
            goto L_0x0020
        L_0x005b:
            java.lang.String r4 = (java.lang.String) r4
            r0.add(r4)
            goto L_0x0020
        L_0x0061:
            boolean r0 = r6 instanceof b.l.a.c.f.i.w6
            if (r0 != 0) goto L_0x00ba
            boolean r0 = r7 instanceof java.util.ArrayList
            if (r0 == 0) goto L_0x007c
            boolean r0 = r6 instanceof java.util.Collection
            if (r0 == 0) goto L_0x007c
            r0 = r7
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            int r4 = r7.size()
            int r5 = r6.size()
            int r5 = r5 + r4
            r0.ensureCapacity(r5)
        L_0x007c:
            int r0 = r7.size()
            java.util.Iterator r6 = r6.iterator()
        L_0x0084:
            boolean r4 = r6.hasNext()
            if (r4 == 0) goto L_0x00b9
            java.lang.Object r4 = r6.next()
            if (r4 != 0) goto L_0x00b5
            int r6 = r7.size()
            java.lang.StringBuilder r2 = b.e.a.a.a.x(r3, r2)
            int r6 = r6 - r0
            r2.append(r6)
            r2.append(r1)
            java.lang.String r6 = r2.toString()
            int r1 = r7.size()
        L_0x00a7:
            int r1 = r1 + -1
            if (r1 < r0) goto L_0x00af
            r7.remove(r1)
            goto L_0x00a7
        L_0x00af:
            java.lang.NullPointerException r7 = new java.lang.NullPointerException
            r7.<init>(r6)
            throw r7
        L_0x00b5:
            r7.add(r4)
            goto L_0x0084
        L_0x00b9:
            return
        L_0x00ba:
            r7.addAll(r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: b.l.a.c.f.i.g4.i(java.lang.Iterable, java.util.List):void");
    }

    public final t4 a() {
        p5 p5Var = (p5) this;
        try {
            int b2 = p5Var.b();
            t4 t4Var = t4.f3759i;
            byte[] bArr = new byte[b2];
            Logger logger = y4.f3813b;
            w4 w4Var = new w4(bArr, 0, b2);
            p5Var.o(w4Var);
            if (w4Var.z() == 0) {
                return new r4(bArr);
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (IOException e2) {
            String name = getClass().getName();
            throw new RuntimeException(a.r(new StringBuilder(name.length() + 72), "Serializing ", name, " to a ByteString threw an IOException (should never happen)."), e2);
        }
    }

    public final byte[] e() {
        p5 p5Var = (p5) this;
        try {
            int b2 = p5Var.b();
            byte[] bArr = new byte[b2];
            Logger logger = y4.f3813b;
            w4 w4Var = new w4(bArr, 0, b2);
            p5Var.o(w4Var);
            if (w4Var.z() == 0) {
                return bArr;
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (IOException e2) {
            String name = getClass().getName();
            throw new RuntimeException(a.r(new StringBuilder(name.length() + 72), "Serializing ", name, " to a byte array threw an IOException (should never happen)."), e2);
        }
    }

    public int g() {
        throw null;
    }

    public void h(int i2) {
        throw null;
    }
}
