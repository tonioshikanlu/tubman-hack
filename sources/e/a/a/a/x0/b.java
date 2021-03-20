package e.a.a.a.x0;

import e.x.b.l;
import e.x.c.k;
import java.util.List;
import java.util.Map;

public final class b extends k implements l<Object, Boolean> {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ Class f7619h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ List f7620i;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ Map f7621j;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b(Class cls, List list, Map map) {
        super(1);
        this.f7619h = cls;
        this.f7620i = list;
        this.f7621j = map;
    }

    /* JADX WARNING: Removed duplicated region for block: B:62:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(java.lang.Object r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof java.lang.annotation.Annotation
            r1 = 0
            if (r0 != 0) goto L_0x0007
            r0 = r1
            goto L_0x0008
        L_0x0007:
            r0 = r7
        L_0x0008:
            java.lang.annotation.Annotation r0 = (java.lang.annotation.Annotation) r0
            if (r0 == 0) goto L_0x0014
            e.a.e r0 = b.q.a.a.t0(r0)
            java.lang.Class r1 = b.q.a.a.L0(r0)
        L_0x0014:
            java.lang.Class r0 = r6.f7619h
            boolean r0 = e.x.c.i.a(r1, r0)
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x00fc
            java.util.List r0 = r6.f7620i
            boolean r3 = r0 instanceof java.util.Collection
            if (r3 == 0) goto L_0x002d
            boolean r3 = r0.isEmpty()
            if (r3 == 0) goto L_0x002d
        L_0x002a:
            r7 = r1
            goto L_0x00f9
        L_0x002d:
            java.util.Iterator r0 = r0.iterator()
        L_0x0031:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x002a
            java.lang.Object r3 = r0.next()
            java.lang.reflect.Method r3 = (java.lang.reflect.Method) r3
            java.util.Map r4 = r6.f7621j
            java.lang.String r5 = r3.getName()
            java.lang.Object r4 = r4.get(r5)
            java.lang.Object[] r5 = new java.lang.Object[r2]
            java.lang.Object r3 = r3.invoke(r7, r5)
            boolean r5 = r4 instanceof boolean[]
            if (r5 == 0) goto L_0x0060
            boolean[] r4 = (boolean[]) r4
            java.lang.String r5 = "null cannot be cast to non-null type kotlin.BooleanArray"
            java.util.Objects.requireNonNull(r3, r5)
            boolean[] r3 = (boolean[]) r3
            boolean r3 = java.util.Arrays.equals(r4, r3)
            goto L_0x00f6
        L_0x0060:
            boolean r5 = r4 instanceof char[]
            if (r5 == 0) goto L_0x0073
            char[] r4 = (char[]) r4
            java.lang.String r5 = "null cannot be cast to non-null type kotlin.CharArray"
            java.util.Objects.requireNonNull(r3, r5)
            char[] r3 = (char[]) r3
            boolean r3 = java.util.Arrays.equals(r4, r3)
            goto L_0x00f6
        L_0x0073:
            boolean r5 = r4 instanceof byte[]
            if (r5 == 0) goto L_0x0086
            byte[] r4 = (byte[]) r4
            java.lang.String r5 = "null cannot be cast to non-null type kotlin.ByteArray"
            java.util.Objects.requireNonNull(r3, r5)
            byte[] r3 = (byte[]) r3
            boolean r3 = java.util.Arrays.equals(r4, r3)
            goto L_0x00f6
        L_0x0086:
            boolean r5 = r4 instanceof short[]
            if (r5 == 0) goto L_0x0098
            short[] r4 = (short[]) r4
            java.lang.String r5 = "null cannot be cast to non-null type kotlin.ShortArray"
            java.util.Objects.requireNonNull(r3, r5)
            short[] r3 = (short[]) r3
            boolean r3 = java.util.Arrays.equals(r4, r3)
            goto L_0x00f6
        L_0x0098:
            boolean r5 = r4 instanceof int[]
            if (r5 == 0) goto L_0x00aa
            int[] r4 = (int[]) r4
            java.lang.String r5 = "null cannot be cast to non-null type kotlin.IntArray"
            java.util.Objects.requireNonNull(r3, r5)
            int[] r3 = (int[]) r3
            boolean r3 = java.util.Arrays.equals(r4, r3)
            goto L_0x00f6
        L_0x00aa:
            boolean r5 = r4 instanceof float[]
            if (r5 == 0) goto L_0x00bc
            float[] r4 = (float[]) r4
            java.lang.String r5 = "null cannot be cast to non-null type kotlin.FloatArray"
            java.util.Objects.requireNonNull(r3, r5)
            float[] r3 = (float[]) r3
            boolean r3 = java.util.Arrays.equals(r4, r3)
            goto L_0x00f6
        L_0x00bc:
            boolean r5 = r4 instanceof long[]
            if (r5 == 0) goto L_0x00ce
            long[] r4 = (long[]) r4
            java.lang.String r5 = "null cannot be cast to non-null type kotlin.LongArray"
            java.util.Objects.requireNonNull(r3, r5)
            long[] r3 = (long[]) r3
            boolean r3 = java.util.Arrays.equals(r4, r3)
            goto L_0x00f6
        L_0x00ce:
            boolean r5 = r4 instanceof double[]
            if (r5 == 0) goto L_0x00e0
            double[] r4 = (double[]) r4
            java.lang.String r5 = "null cannot be cast to non-null type kotlin.DoubleArray"
            java.util.Objects.requireNonNull(r3, r5)
            double[] r3 = (double[]) r3
            boolean r3 = java.util.Arrays.equals(r4, r3)
            goto L_0x00f6
        L_0x00e0:
            boolean r5 = r4 instanceof java.lang.Object[]
            if (r5 == 0) goto L_0x00f2
            java.lang.Object[] r4 = (java.lang.Object[]) r4
            java.lang.String r5 = "null cannot be cast to non-null type kotlin.Array<*>"
            java.util.Objects.requireNonNull(r3, r5)
            java.lang.Object[] r3 = (java.lang.Object[]) r3
            boolean r3 = java.util.Arrays.equals(r4, r3)
            goto L_0x00f6
        L_0x00f2:
            boolean r3 = e.x.c.i.a(r4, r3)
        L_0x00f6:
            if (r3 != 0) goto L_0x0031
            r7 = r2
        L_0x00f9:
            if (r7 == 0) goto L_0x00fc
            goto L_0x00fd
        L_0x00fc:
            r1 = r2
        L_0x00fd:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: e.a.a.a.x0.b.a(java.lang.Object):boolean");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return Boolean.valueOf(a(obj));
    }
}
