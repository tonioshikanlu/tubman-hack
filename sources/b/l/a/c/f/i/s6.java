package b.l.a.c.f.i;

import b.e.a.a.a;
import com.google.android.material.shadow.ShadowDrawableWrapper;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import sun.misc.Unsafe;

public final class s6<T> implements a7<T> {

    /* renamed from: o  reason: collision with root package name */
    public static final int[] f3717o = new int[0];

    /* renamed from: p  reason: collision with root package name */
    public static final Unsafe f3718p = y7.t();
    public final int[] a;

    /* renamed from: b  reason: collision with root package name */
    public final Object[] f3719b;
    public final int c;
    public final int d;

    /* renamed from: e  reason: collision with root package name */
    public final q6 f3720e;
    public final boolean f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f3721g;

    /* renamed from: h  reason: collision with root package name */
    public final int[] f3722h;

    /* renamed from: i  reason: collision with root package name */
    public final int f3723i;

    /* renamed from: j  reason: collision with root package name */
    public final int f3724j;

    /* renamed from: k  reason: collision with root package name */
    public final f6 f3725k;

    /* renamed from: l  reason: collision with root package name */
    public final n7<?, ?> f3726l;

    /* renamed from: m  reason: collision with root package name */
    public final d5<?> f3727m;

    /* renamed from: n  reason: collision with root package name */
    public final m6 f3728n;

    public s6(int[] iArr, Object[] objArr, int i2, int i3, q6 q6Var, boolean z, int[] iArr2, int i4, int i5, u6 u6Var, f6 f6Var, n7 n7Var, d5 d5Var, m6 m6Var) {
        this.a = iArr;
        this.f3719b = objArr;
        this.c = i2;
        this.d = i3;
        this.f3721g = z;
        this.f = d5Var != null && d5Var.a(q6Var);
        this.f3722h = iArr2;
        this.f3723i = i4;
        this.f3724j = i5;
        this.f3725k = f6Var;
        this.f3726l = n7Var;
        this.f3727m = d5Var;
        this.f3720e = q6Var;
        this.f3728n = m6Var;
    }

    public static <T> s6 B(o6 o6Var, u6 u6Var, f6 f6Var, n7 n7Var, d5 d5Var, m6 m6Var) {
        if (o6Var instanceof z6) {
            return C((z6) o6Var, u6Var, f6Var, n7Var, d5Var, m6Var);
        }
        l7 l7Var = (l7) o6Var;
        throw null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:124:0x0275  */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x0278  */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x0290  */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x0293  */
    /* JADX WARNING: Removed duplicated region for block: B:161:0x0344  */
    /* JADX WARNING: Removed duplicated region for block: B:174:0x0395  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static <T> b.l.a.c.f.i.s6<T> C(b.l.a.c.f.i.z6 r35, b.l.a.c.f.i.u6 r36, b.l.a.c.f.i.f6 r37, b.l.a.c.f.i.n7<?, ?> r38, b.l.a.c.f.i.d5<?> r39, b.l.a.c.f.i.m6 r40) {
        /*
            r0 = r35
            int r1 = r0.d
            r2 = 1
            r1 = r1 & r2
            r3 = 2
            if (r1 != r2) goto L_0x000b
            r1 = r2
            goto L_0x000c
        L_0x000b:
            r1 = r3
        L_0x000c:
            r4 = 0
            if (r1 != r3) goto L_0x0011
            r11 = r2
            goto L_0x0012
        L_0x0011:
            r11 = r4
        L_0x0012:
            java.lang.String r1 = r0.f3842b
            int r3 = r1.length()
            char r5 = r1.charAt(r4)
            r6 = 55296(0xd800, float:7.7486E-41)
            if (r5 < r6) goto L_0x002c
            r5 = r2
        L_0x0022:
            int r7 = r5 + 1
            char r5 = r1.charAt(r5)
            if (r5 < r6) goto L_0x002d
            r5 = r7
            goto L_0x0022
        L_0x002c:
            r7 = r2
        L_0x002d:
            int r5 = r7 + 1
            char r7 = r1.charAt(r7)
            if (r7 < r6) goto L_0x004c
            r7 = r7 & 8191(0x1fff, float:1.1478E-41)
            r9 = 13
        L_0x0039:
            int r10 = r5 + 1
            char r5 = r1.charAt(r5)
            if (r5 < r6) goto L_0x0049
            r5 = r5 & 8191(0x1fff, float:1.1478E-41)
            int r5 = r5 << r9
            r7 = r7 | r5
            int r9 = r9 + 13
            r5 = r10
            goto L_0x0039
        L_0x0049:
            int r5 = r5 << r9
            r7 = r7 | r5
            r5 = r10
        L_0x004c:
            if (r7 != 0) goto L_0x0059
            int[] r7 = f3717o
            r9 = r4
            r10 = r9
            r12 = r10
            r14 = r12
            r15 = r14
            r13 = r7
            r7 = r15
            goto L_0x016a
        L_0x0059:
            int r7 = r5 + 1
            char r5 = r1.charAt(r5)
            if (r5 < r6) goto L_0x0078
            r5 = r5 & 8191(0x1fff, float:1.1478E-41)
            r9 = 13
        L_0x0065:
            int r10 = r7 + 1
            char r7 = r1.charAt(r7)
            if (r7 < r6) goto L_0x0075
            r7 = r7 & 8191(0x1fff, float:1.1478E-41)
            int r7 = r7 << r9
            r5 = r5 | r7
            int r9 = r9 + 13
            r7 = r10
            goto L_0x0065
        L_0x0075:
            int r7 = r7 << r9
            r5 = r5 | r7
            r7 = r10
        L_0x0078:
            int r9 = r7 + 1
            char r7 = r1.charAt(r7)
            if (r7 < r6) goto L_0x0097
            r7 = r7 & 8191(0x1fff, float:1.1478E-41)
            r10 = 13
        L_0x0084:
            int r12 = r9 + 1
            char r9 = r1.charAt(r9)
            if (r9 < r6) goto L_0x0094
            r9 = r9 & 8191(0x1fff, float:1.1478E-41)
            int r9 = r9 << r10
            r7 = r7 | r9
            int r10 = r10 + 13
            r9 = r12
            goto L_0x0084
        L_0x0094:
            int r9 = r9 << r10
            r7 = r7 | r9
            r9 = r12
        L_0x0097:
            int r10 = r9 + 1
            char r9 = r1.charAt(r9)
            if (r9 < r6) goto L_0x00b6
            r9 = r9 & 8191(0x1fff, float:1.1478E-41)
            r12 = 13
        L_0x00a3:
            int r13 = r10 + 1
            char r10 = r1.charAt(r10)
            if (r10 < r6) goto L_0x00b3
            r10 = r10 & 8191(0x1fff, float:1.1478E-41)
            int r10 = r10 << r12
            r9 = r9 | r10
            int r12 = r12 + 13
            r10 = r13
            goto L_0x00a3
        L_0x00b3:
            int r10 = r10 << r12
            r9 = r9 | r10
            r10 = r13
        L_0x00b6:
            int r12 = r10 + 1
            char r10 = r1.charAt(r10)
            if (r10 < r6) goto L_0x00d5
            r10 = r10 & 8191(0x1fff, float:1.1478E-41)
            r13 = 13
        L_0x00c2:
            int r14 = r12 + 1
            char r12 = r1.charAt(r12)
            if (r12 < r6) goto L_0x00d2
            r12 = r12 & 8191(0x1fff, float:1.1478E-41)
            int r12 = r12 << r13
            r10 = r10 | r12
            int r13 = r13 + 13
            r12 = r14
            goto L_0x00c2
        L_0x00d2:
            int r12 = r12 << r13
            r10 = r10 | r12
            r12 = r14
        L_0x00d5:
            int r13 = r12 + 1
            char r12 = r1.charAt(r12)
            if (r12 < r6) goto L_0x00f4
            r12 = r12 & 8191(0x1fff, float:1.1478E-41)
            r14 = 13
        L_0x00e1:
            int r15 = r13 + 1
            char r13 = r1.charAt(r13)
            if (r13 < r6) goto L_0x00f1
            r13 = r13 & 8191(0x1fff, float:1.1478E-41)
            int r13 = r13 << r14
            r12 = r12 | r13
            int r14 = r14 + 13
            r13 = r15
            goto L_0x00e1
        L_0x00f1:
            int r13 = r13 << r14
            r12 = r12 | r13
            r13 = r15
        L_0x00f4:
            int r14 = r13 + 1
            char r13 = r1.charAt(r13)
            if (r13 < r6) goto L_0x0115
            r13 = r13 & 8191(0x1fff, float:1.1478E-41)
            r15 = 13
        L_0x0100:
            int r16 = r14 + 1
            char r14 = r1.charAt(r14)
            if (r14 < r6) goto L_0x0111
            r14 = r14 & 8191(0x1fff, float:1.1478E-41)
            int r14 = r14 << r15
            r13 = r13 | r14
            int r15 = r15 + 13
            r14 = r16
            goto L_0x0100
        L_0x0111:
            int r14 = r14 << r15
            r13 = r13 | r14
            r14 = r16
        L_0x0115:
            int r15 = r14 + 1
            char r14 = r1.charAt(r14)
            if (r14 < r6) goto L_0x0138
            r14 = r14 & 8191(0x1fff, float:1.1478E-41)
            r16 = 13
        L_0x0121:
            int r17 = r15 + 1
            char r15 = r1.charAt(r15)
            if (r15 < r6) goto L_0x0133
            r15 = r15 & 8191(0x1fff, float:1.1478E-41)
            int r15 = r15 << r16
            r14 = r14 | r15
            int r16 = r16 + 13
            r15 = r17
            goto L_0x0121
        L_0x0133:
            int r15 = r15 << r16
            r14 = r14 | r15
            r15 = r17
        L_0x0138:
            int r16 = r15 + 1
            char r15 = r1.charAt(r15)
            if (r15 < r6) goto L_0x015d
            r15 = r15 & 8191(0x1fff, float:1.1478E-41)
            r4 = r16
            r16 = 13
        L_0x0146:
            int r18 = r4 + 1
            char r4 = r1.charAt(r4)
            if (r4 < r6) goto L_0x0158
            r4 = r4 & 8191(0x1fff, float:1.1478E-41)
            int r4 = r4 << r16
            r15 = r15 | r4
            int r16 = r16 + 13
            r4 = r18
            goto L_0x0146
        L_0x0158:
            int r4 = r4 << r16
            r15 = r15 | r4
            r16 = r18
        L_0x015d:
            int r4 = r15 + r13
            int r4 = r4 + r14
            int[] r4 = new int[r4]
            int r14 = r5 + r5
            int r14 = r14 + r7
            r7 = r13
            r13 = r4
            r4 = r5
            r5 = r16
        L_0x016a:
            sun.misc.Unsafe r8 = f3718p
            java.lang.Object[] r2 = r0.c
            b.l.a.c.f.i.q6 r6 = r0.a
            java.lang.Class r6 = r6.getClass()
            r20 = r5
            int r5 = r12 * 3
            int[] r5 = new int[r5]
            int r12 = r12 + r12
            java.lang.Object[] r12 = new java.lang.Object[r12]
            int r21 = r15 + r7
            r23 = r15
            r7 = r20
            r24 = r21
            r20 = 0
            r22 = 0
        L_0x0189:
            if (r7 >= r3) goto L_0x03e8
            int r25 = r7 + 1
            char r7 = r1.charAt(r7)
            r26 = r3
            r3 = 55296(0xd800, float:7.7486E-41)
            if (r7 < r3) goto L_0x01bd
            r7 = r7 & 8191(0x1fff, float:1.1478E-41)
            r3 = r25
            r25 = 13
        L_0x019e:
            int r27 = r3 + 1
            char r3 = r1.charAt(r3)
            r28 = r15
            r15 = 55296(0xd800, float:7.7486E-41)
            if (r3 < r15) goto L_0x01b7
            r3 = r3 & 8191(0x1fff, float:1.1478E-41)
            int r3 = r3 << r25
            r7 = r7 | r3
            int r25 = r25 + 13
            r3 = r27
            r15 = r28
            goto L_0x019e
        L_0x01b7:
            int r3 = r3 << r25
            r7 = r7 | r3
            r3 = r27
            goto L_0x01c1
        L_0x01bd:
            r28 = r15
            r3 = r25
        L_0x01c1:
            int r15 = r3 + 1
            char r3 = r1.charAt(r3)
            r25 = r15
            r15 = 55296(0xd800, float:7.7486E-41)
            if (r3 < r15) goto L_0x01f3
            r3 = r3 & 8191(0x1fff, float:1.1478E-41)
            r15 = r25
            r25 = 13
        L_0x01d4:
            int r27 = r15 + 1
            char r15 = r1.charAt(r15)
            r29 = r10
            r10 = 55296(0xd800, float:7.7486E-41)
            if (r15 < r10) goto L_0x01ed
            r10 = r15 & 8191(0x1fff, float:1.1478E-41)
            int r10 = r10 << r25
            r3 = r3 | r10
            int r25 = r25 + 13
            r15 = r27
            r10 = r29
            goto L_0x01d4
        L_0x01ed:
            int r10 = r15 << r25
            r3 = r3 | r10
            r15 = r27
            goto L_0x01f7
        L_0x01f3:
            r29 = r10
            r15 = r25
        L_0x01f7:
            r10 = r3 & 255(0xff, float:3.57E-43)
            r25 = r9
            r9 = r3 & 1024(0x400, float:1.435E-42)
            if (r9 == 0) goto L_0x0205
            int r9 = r22 + 1
            r13[r22] = r20
            r22 = r9
        L_0x0205:
            r9 = 51
            if (r10 < r9) goto L_0x02b2
            int r9 = r15 + 1
            char r15 = r1.charAt(r15)
            r27 = r9
            r9 = 55296(0xd800, float:7.7486E-41)
            if (r15 < r9) goto L_0x023d
            r15 = r15 & 8191(0x1fff, float:1.1478E-41)
            r32 = 13
            r34 = r27
            r27 = r15
            r15 = r34
        L_0x0220:
            int r33 = r15 + 1
            char r15 = r1.charAt(r15)
            if (r15 < r9) goto L_0x0236
            r9 = r15 & 8191(0x1fff, float:1.1478E-41)
            int r9 = r9 << r32
            r27 = r27 | r9
            int r32 = r32 + 13
            r15 = r33
            r9 = 55296(0xd800, float:7.7486E-41)
            goto L_0x0220
        L_0x0236:
            int r9 = r15 << r32
            r15 = r27 | r9
            r9 = r33
            goto L_0x023f
        L_0x023d:
            r9 = r27
        L_0x023f:
            r27 = r9
            int r9 = r10 + -51
            r0 = 9
            if (r9 == r0) goto L_0x0260
            r0 = 17
            if (r9 != r0) goto L_0x024c
            goto L_0x0260
        L_0x024c:
            r0 = 12
            if (r9 != r0) goto L_0x026e
            if (r11 != 0) goto L_0x026e
            int r0 = r20 / 3
            int r9 = r14 + 1
            int r0 = r0 + r0
            r18 = 1
            int r0 = r0 + 1
            r14 = r2[r14]
            r12[r0] = r14
            goto L_0x026d
        L_0x0260:
            int r0 = r20 / 3
            int r9 = r14 + 1
            int r0 = r0 + r0
            r18 = 1
            int r0 = r0 + 1
            r14 = r2[r14]
            r12[r0] = r14
        L_0x026d:
            r14 = r9
        L_0x026e:
            int r15 = r15 + r15
            r0 = r2[r15]
            boolean r9 = r0 instanceof java.lang.reflect.Field
            if (r9 == 0) goto L_0x0278
            java.lang.reflect.Field r0 = (java.lang.reflect.Field) r0
            goto L_0x0280
        L_0x0278:
            java.lang.String r0 = (java.lang.String) r0
            java.lang.reflect.Field r0 = D(r6, r0)
            r2[r15] = r0
        L_0x0280:
            r9 = r4
            r32 = r5
            long r4 = r8.objectFieldOffset(r0)
            int r0 = (int) r4
            int r15 = r15 + 1
            r4 = r2[r15]
            boolean r5 = r4 instanceof java.lang.reflect.Field
            if (r5 == 0) goto L_0x0293
            java.lang.reflect.Field r4 = (java.lang.reflect.Field) r4
            goto L_0x029b
        L_0x0293:
            java.lang.String r4 = (java.lang.String) r4
            java.lang.reflect.Field r4 = D(r6, r4)
            r2[r15] = r4
        L_0x029b:
            long r4 = r8.objectFieldOffset(r4)
            int r4 = (int) r4
            r19 = r1
            r30 = r4
            r31 = r14
            r15 = r27
            r18 = 1
            r4 = r0
            r14 = r6
            r0 = 55296(0xd800, float:7.7486E-41)
            r6 = 0
            goto L_0x03ae
        L_0x02b2:
            r9 = r4
            r32 = r5
            int r0 = r14 + 1
            r4 = r2[r14]
            java.lang.String r4 = (java.lang.String) r4
            java.lang.reflect.Field r4 = D(r6, r4)
            r5 = 49
            r14 = 9
            if (r10 == r14) goto L_0x0327
            r14 = 17
            if (r10 != r14) goto L_0x02ca
            goto L_0x0327
        L_0x02ca:
            r14 = 27
            if (r10 == r14) goto L_0x0316
            if (r10 != r5) goto L_0x02d1
            goto L_0x0316
        L_0x02d1:
            r14 = 12
            if (r10 == r14) goto L_0x0306
            r14 = 30
            if (r10 == r14) goto L_0x0306
            r14 = 44
            if (r10 != r14) goto L_0x02de
            goto L_0x0306
        L_0x02de:
            r14 = 50
            if (r10 != r14) goto L_0x0303
            int r14 = r23 + 1
            r13[r23] = r20
            int r23 = r20 / 3
            int r23 = r23 + r23
            int r27 = r0 + 1
            r0 = r2[r0]
            r12[r23] = r0
            r0 = r3 & 2048(0x800, float:2.87E-42)
            if (r0 == 0) goto L_0x02ff
            int r0 = r27 + 1
            int r23 = r23 + 1
            r27 = r2[r27]
            r12[r23] = r27
            r23 = r14
            goto L_0x0303
        L_0x02ff:
            r23 = r14
            r0 = r27
        L_0x0303:
            r18 = 1
            goto L_0x0334
        L_0x0306:
            if (r11 != 0) goto L_0x0303
            int r14 = r20 / 3
            int r27 = r0 + 1
            int r14 = r14 + r14
            r18 = 1
            int r14 = r14 + 1
            r0 = r2[r0]
            r12[r14] = r0
            goto L_0x0323
        L_0x0316:
            r18 = 1
            int r14 = r20 / 3
            int r27 = r0 + 1
            int r14 = r14 + r14
            int r14 = r14 + 1
            r0 = r2[r0]
            r12[r14] = r0
        L_0x0323:
            r14 = r6
            r0 = r27
            goto L_0x0335
        L_0x0327:
            r18 = 1
            int r14 = r20 / 3
            int r14 = r14 + r14
            int r14 = r14 + 1
            java.lang.Class r27 = r4.getType()
            r12[r14] = r27
        L_0x0334:
            r14 = r6
        L_0x0335:
            long r5 = r8.objectFieldOffset(r4)
            int r4 = (int) r5
            r5 = r3 & 4096(0x1000, float:5.74E-42)
            r6 = 4096(0x1000, float:5.74E-42)
            if (r5 != r6) goto L_0x0395
            r5 = 17
            if (r10 > r5) goto L_0x0395
            int r5 = r15 + 1
            char r6 = r1.charAt(r15)
            r15 = 55296(0xd800, float:7.7486E-41)
            if (r6 < r15) goto L_0x0369
            r6 = r6 & 8191(0x1fff, float:1.1478E-41)
            r19 = 13
        L_0x0353:
            int r30 = r5 + 1
            char r5 = r1.charAt(r5)
            if (r5 < r15) goto L_0x0365
            r5 = r5 & 8191(0x1fff, float:1.1478E-41)
            int r5 = r5 << r19
            r6 = r6 | r5
            int r19 = r19 + 13
            r5 = r30
            goto L_0x0353
        L_0x0365:
            int r5 = r5 << r19
            r6 = r6 | r5
            goto L_0x036b
        L_0x0369:
            r30 = r5
        L_0x036b:
            int r5 = r9 + r9
            int r19 = r6 / 32
            int r19 = r19 + r5
            r5 = r2[r19]
            boolean r15 = r5 instanceof java.lang.reflect.Field
            if (r15 == 0) goto L_0x037a
            java.lang.reflect.Field r5 = (java.lang.reflect.Field) r5
            goto L_0x0382
        L_0x037a:
            java.lang.String r5 = (java.lang.String) r5
            java.lang.reflect.Field r5 = D(r14, r5)
            r2[r19] = r5
        L_0x0382:
            r31 = r0
            r19 = r1
            long r0 = r8.objectFieldOffset(r5)
            int r0 = (int) r0
            int r6 = r6 % 32
            r15 = r30
            r30 = r0
            r0 = 55296(0xd800, float:7.7486E-41)
            goto L_0x03a0
        L_0x0395:
            r31 = r0
            r19 = r1
            r0 = 55296(0xd800, float:7.7486E-41)
            r6 = 0
            r30 = 1048575(0xfffff, float:1.469367E-39)
        L_0x03a0:
            r1 = 18
            if (r10 < r1) goto L_0x03ae
            r1 = 49
            if (r10 > r1) goto L_0x03ae
            int r1 = r24 + 1
            r13[r24] = r4
            r24 = r1
        L_0x03ae:
            int r1 = r20 + 1
            r32[r20] = r7
            int r5 = r1 + 1
            r7 = r3 & 512(0x200, float:7.175E-43)
            if (r7 == 0) goto L_0x03bb
            r7 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x03bc
        L_0x03bb:
            r7 = 0
        L_0x03bc:
            r3 = r3 & 256(0x100, float:3.59E-43)
            if (r3 == 0) goto L_0x03c3
            r3 = 268435456(0x10000000, float:2.5243549E-29)
            goto L_0x03c4
        L_0x03c3:
            r3 = 0
        L_0x03c4:
            r3 = r3 | r7
            int r7 = r10 << 20
            r3 = r3 | r7
            r3 = r3 | r4
            r32[r1] = r3
            int r20 = r5 + 1
            int r1 = r6 << 20
            r1 = r1 | r30
            r32[r5] = r1
            r0 = r35
            r4 = r9
            r6 = r14
            r7 = r15
            r1 = r19
            r9 = r25
            r3 = r26
            r15 = r28
            r10 = r29
            r14 = r31
            r5 = r32
            goto L_0x0189
        L_0x03e8:
            r32 = r5
            r25 = r9
            r29 = r10
            r28 = r15
            b.l.a.c.f.i.s6 r0 = new b.l.a.c.f.i.s6
            r1 = r35
            b.l.a.c.f.i.q6 r10 = r1.a
            r1 = r32
            r5 = r0
            r6 = r1
            r7 = r12
            r8 = r25
            r9 = r29
            r12 = r13
            r13 = r28
            r14 = r21
            r15 = r36
            r16 = r37
            r17 = r38
            r18 = r39
            r19 = r40
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: b.l.a.c.f.i.s6.C(b.l.a.c.f.i.z6, b.l.a.c.f.i.u6, b.l.a.c.f.i.f6, b.l.a.c.f.i.n7, b.l.a.c.f.i.d5, b.l.a.c.f.i.m6):b.l.a.c.f.i.s6");
    }

    public static Field D(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            String name = cls.getName();
            String arrays = Arrays.toString(declaredFields);
            StringBuilder sb = new StringBuilder(a.b(String.valueOf(str).length(), 40, name.length(), String.valueOf(arrays).length()));
            a.L(sb, "Field ", str, " for ", name);
            throw new RuntimeException(a.q(sb, " not found. Known fields are ", arrays));
        }
    }

    public static <T> double l(T t, long j2) {
        return ((Double) y7.q(t, j2)).doubleValue();
    }

    public static <T> float m(T t, long j2) {
        return ((Float) y7.q(t, j2)).floatValue();
    }

    public static <T> int n(T t, long j2) {
        return ((Integer) y7.q(t, j2)).intValue();
    }

    public static <T> long o(T t, long j2) {
        return ((Long) y7.q(t, j2)).longValue();
    }

    public static <T> boolean p(T t, long j2) {
        return ((Boolean) y7.q(t, j2)).booleanValue();
    }

    public static final void y(int i2, Object obj, z4 z4Var) {
        if (obj instanceof String) {
            z4Var.a.k(i2, (String) obj);
            return;
        }
        z4Var.a.l(i2, (t4) obj);
    }

    public static o7 z(Object obj) {
        p5 p5Var = (p5) obj;
        o7 o7Var = p5Var.zzc;
        if (o7Var != o7.f) {
            return o7Var;
        }
        o7 a2 = o7.a();
        p5Var.zzc = a2;
        return a2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v8, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r35v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v3, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v13, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v21, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v10, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v12, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v7, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v7, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r25v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v8, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v7, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r25v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r25v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v13, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v9, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r25v3, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v19, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r25v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v22, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r25v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r25v6, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v18, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v9, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v15, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v12, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v16, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v17, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v11, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v26, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v19, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v27, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v10, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v27, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v29, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v30, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v7, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v20, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v31, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v8, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v32, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v9, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v21, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v33, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v34, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v35, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v22, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v14, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v22, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v23, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v15, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v38, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v25, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v39, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v26, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v27, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v42, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v28, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v29, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v23, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v30, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v31, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v32, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v33, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v34, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v35, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v18, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v36, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v12, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v51, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v52, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v24, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v25, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v15, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r31v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v100, resolved type: byte} */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x02c0, code lost:
        r12 = r36;
        r16 = r5;
        r3 = r7;
        r2 = r22;
        r5 = r35;
        r7 = r1;
        r1 = r37;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x02ce, code lost:
        r6 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x02e5, code lost:
        r5 = r35;
        r12 = r0;
        r0 = r8;
        r8 = r6;
        r6 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x02ed, code lost:
        r18 = r35;
        r2 = r3;
        r9 = r6;
        r27 = r7;
        r30 = r11;
        r7 = r12;
        r6 = r37;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x0398, code lost:
        if (r0 != r15) goto L_0x03e7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x03e5, code lost:
        if (r0 != r15) goto L_0x03e7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x03e7, code lost:
        r15 = r32;
        r14 = r33;
        r4 = r34;
        r6 = r36;
        r12 = r6;
        r1 = r37;
        r13 = r38;
        r5 = r18;
        r2 = r22;
        r16 = r25;
        r7 = r26;
        r3 = r27;
        r11 = r30;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0153, code lost:
        r11.putInt(r14, r9, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x016b, code lost:
        r1 = r13.c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0195, code lost:
        r11.putObject(r14, r9, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0198, code lost:
        r8 = r0;
        r0 = r12 | r25;
        r1 = r6;
        r6 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x0206, code lost:
        r5 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x0230, code lost:
        r6 = r2;
        r3 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x024e, code lost:
        r1 = r12 | r25;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x026c, code lost:
        r0.putLong(r1, r9, r17);
        r0 = r12 | r25;
        r1 = r6;
        r4 = r4;
        r6 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x027b, code lost:
        r10 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x027c, code lost:
        r6 = r10;
     */
    /* JADX WARNING: Incorrect type for immutable var: ssa=byte, code=int, for r0v7, types: [int, byte] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int A(T r33, byte[] r34, int r35, int r36, int r37, b.l.a.c.f.i.j4 r38) {
        /*
            r32 = this;
            r15 = r32
            r14 = r33
            r12 = r36
            r13 = r38
            sun.misc.Unsafe r11 = f3718p
            r4 = r34
            r0 = r35
            r1 = r37
            r6 = r12
            r2 = -1
            r3 = 0
            r5 = 1048575(0xfffff, float:1.469367E-39)
            r7 = 0
            r16 = 0
        L_0x0019:
            r17 = 0
            if (r0 >= r6) goto L_0x0480
            int r9 = r0 + 1
            byte r0 = r4[r0]
            if (r0 >= 0) goto L_0x002e
            int r0 = b.l.a.c.b.a.x1(r0, r4, r9, r13)
            int r9 = r13.a
            r31 = r9
            r9 = r0
            r0 = r31
        L_0x002e:
            int r10 = r0 >>> 3
            r8 = r0 & 7
            r35 = r0
            r0 = 3
            if (r10 <= r2) goto L_0x0049
            int r3 = r3 / r0
            int r2 = r15.c
            if (r10 < r2) goto L_0x0045
            int r2 = r15.d
            if (r10 > r2) goto L_0x0045
            int r2 = r15.w(r10, r3)
            goto L_0x0046
        L_0x0045:
            r2 = -1
        L_0x0046:
            r3 = r2
            r2 = 0
            goto L_0x0059
        L_0x0049:
            int r2 = r15.c
            if (r10 < r2) goto L_0x0057
            int r2 = r15.d
            if (r10 > r2) goto L_0x0057
            r2 = 0
            int r3 = r15.w(r10, r2)
            goto L_0x0059
        L_0x0057:
            r2 = 0
            r3 = -1
        L_0x0059:
            r12 = -1
            if (r3 != r12) goto L_0x006e
            r6 = r1
            r20 = r2
            r27 = r20
            r18 = r5
            r2 = r9
            r22 = r10
            r30 = r11
            r19 = r12
            r9 = r35
            goto L_0x0409
        L_0x006e:
            int[] r1 = r15.a
            int r16 = r3 + 1
            r12 = r1[r16]
            int r2 = r12 >>> 20
            r2 = r2 & 255(0xff, float:3.57E-43)
            r16 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r12 & r16
            r16 = r9
            r22 = r10
            long r9 = (long) r0
            r0 = 17
            r23 = r12
            if (r2 > r0) goto L_0x02fc
            int r0 = r3 + 2
            r0 = r1[r0]
            int r1 = r0 >>> 20
            r12 = 1
            int r25 = r12 << r1
            r1 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r1
            if (r0 == r5) goto L_0x00a5
            if (r5 == r1) goto L_0x009d
            long r12 = (long) r5
            r11.putInt(r14, r12, r7)
        L_0x009d:
            long r12 = (long) r0
            int r7 = r11.getInt(r14, r12)
            r12 = r7
            r7 = r0
            goto L_0x00a7
        L_0x00a5:
            r12 = r7
            r7 = r5
        L_0x00a7:
            r0 = 5
            switch(r2) {
                case 0: goto L_0x02a0;
                case 1: goto L_0x027f;
                case 2: goto L_0x0252;
                case 3: goto L_0x0252;
                case 4: goto L_0x0236;
                case 5: goto L_0x0208;
                case 6: goto L_0x01ee;
                case 7: goto L_0x01c5;
                case 8: goto L_0x01a0;
                case 9: goto L_0x016e;
                case 10: goto L_0x0157;
                case 11: goto L_0x0236;
                case 12: goto L_0x0120;
                case 13: goto L_0x01ee;
                case 14: goto L_0x0208;
                case 15: goto L_0x0106;
                case 16: goto L_0x00d7;
                default: goto L_0x00ab;
            }
        L_0x00ab:
            r5 = r35
            r13 = r38
            r35 = r7
            r0 = 3
            r20 = 0
            r7 = r3
            r3 = r16
            r16 = r1
            if (r8 != r0) goto L_0x02ce
            b.l.a.c.f.i.a7 r0 = r15.L(r7)
            int r1 = r22 << 3
            r4 = r1 | 4
            r1 = r34
            r2 = r3
            r3 = r36
            r6 = r5
            r5 = r38
            int r0 = b.l.a.c.b.a.B2(r0, r1, r2, r3, r4, r5)
            r1 = r12 & r25
            if (r1 != 0) goto L_0x02d0
            java.lang.Object r1 = r13.c
            goto L_0x02da
        L_0x00d7:
            if (r8 != 0) goto L_0x00f6
            r13 = r38
            r5 = r16
            int r8 = b.l.a.c.b.a.S1(r4, r5, r13)
            long r1 = r13.f3616b
            long r17 = b.l.a.c.f.i.u4.b(r1)
            r5 = r35
            r0 = r11
            r16 = 1048575(0xfffff, float:1.469367E-39)
            r1 = r33
            r35 = r7
            r20 = 0
            r7 = r3
            goto L_0x026c
        L_0x00f6:
            r10 = r35
            r13 = r38
            r35 = r7
            r5 = r16
            r20 = 0
            r16 = r1
            r7 = r3
            r3 = r5
            goto L_0x027c
        L_0x0106:
            r2 = r35
            r13 = r38
            r35 = r7
            r5 = r16
            r20 = 0
            r16 = r1
            r7 = r3
            if (r8 != 0) goto L_0x0230
            int r0 = b.l.a.c.b.a.R0(r4, r5, r13)
            int r1 = r13.a
            int r1 = b.l.a.c.f.i.u4.a(r1)
            goto L_0x0153
        L_0x0120:
            r2 = r35
            r13 = r38
            r35 = r7
            r5 = r16
            r20 = 0
            r16 = r1
            r7 = r3
            if (r8 != 0) goto L_0x0230
            int r0 = b.l.a.c.b.a.R0(r4, r5, r13)
            int r1 = r13.a
            b.l.a.c.f.i.s5 r3 = r15.N(r7)
            if (r3 == 0) goto L_0x0153
            boolean r3 = r3.a(r1)
            if (r3 == 0) goto L_0x0142
            goto L_0x0153
        L_0x0142:
            b.l.a.c.f.i.o7 r3 = z(r33)
            long r8 = (long) r1
            java.lang.Long r1 = java.lang.Long.valueOf(r8)
            r3.c(r2, r1)
            r5 = r35
            r8 = r2
            goto L_0x0345
        L_0x0153:
            r11.putInt(r14, r9, r1)
            goto L_0x0198
        L_0x0157:
            r2 = r35
            r13 = r38
            r35 = r7
            r5 = r16
            r0 = 2
            r20 = 0
            r16 = r1
            r7 = r3
            if (r8 != r0) goto L_0x0230
            int r0 = b.l.a.c.b.a.x2(r4, r5, r13)
        L_0x016b:
            java.lang.Object r1 = r13.c
            goto L_0x0195
        L_0x016e:
            r2 = r35
            r13 = r38
            r35 = r7
            r5 = r16
            r0 = 2
            r20 = 0
            r16 = r1
            r7 = r3
            if (r8 != r0) goto L_0x0230
            b.l.a.c.f.i.a7 r0 = r15.L(r7)
            int r0 = b.l.a.c.b.a.z2(r0, r4, r5, r6, r13)
            r1 = r12 & r25
            if (r1 != 0) goto L_0x018b
            goto L_0x016b
        L_0x018b:
            java.lang.Object r1 = r11.getObject(r14, r9)
            java.lang.Object r3 = r13.c
            java.lang.Object r1 = b.l.a.c.f.i.w5.c(r1, r3)
        L_0x0195:
            r11.putObject(r14, r9, r1)
        L_0x0198:
            r1 = r12 | r25
            r8 = r0
            r0 = r1
            r1 = r6
            r6 = r2
            goto L_0x02e5
        L_0x01a0:
            r2 = r35
            r13 = r38
            r35 = r7
            r5 = r16
            r0 = 2
            r20 = 0
            r16 = r1
            r7 = r3
            if (r8 != r0) goto L_0x0230
            r0 = 536870912(0x20000000, float:1.0842022E-19)
            r0 = r23 & r0
            if (r0 != 0) goto L_0x01bb
            int r0 = b.l.a.c.b.a.o2(r4, r5, r13)
            goto L_0x01bf
        L_0x01bb:
            int r0 = b.l.a.c.b.a.s2(r4, r5, r13)
        L_0x01bf:
            java.lang.Object r1 = r13.c
            r11.putObject(r14, r9, r1)
            goto L_0x0206
        L_0x01c5:
            r2 = r35
            r13 = r38
            r35 = r7
            r5 = r16
            r20 = 0
            r16 = r1
            r7 = r3
            if (r8 != 0) goto L_0x0230
            int r0 = b.l.a.c.b.a.S1(r4, r5, r13)
            r3 = r0
            long r0 = r13.f3616b
            r23 = 0
            int r0 = (r0 > r23 ? 1 : (r0 == r23 ? 0 : -1))
            if (r0 == 0) goto L_0x01e3
            r0 = 1
            goto L_0x01e5
        L_0x01e3:
            r0 = r20
        L_0x01e5:
            b.l.a.c.f.i.x7 r1 = b.l.a.c.f.i.y7.f3819e
            r1.d(r14, r9, r0)
            r5 = r2
            r0 = r3
            goto L_0x024e
        L_0x01ee:
            r2 = r35
            r13 = r38
            r35 = r7
            r5 = r16
            r20 = 0
            r16 = r1
            r7 = r3
            if (r8 != r0) goto L_0x0230
            int r0 = b.l.a.c.b.a.f2(r4, r5)
            r11.putInt(r14, r9, r0)
            int r0 = r5 + 4
        L_0x0206:
            r5 = r2
            goto L_0x024e
        L_0x0208:
            r2 = r35
            r13 = r38
            r35 = r7
            r5 = r16
            r0 = 1
            r20 = 0
            r16 = r1
            r7 = r3
            if (r8 != r0) goto L_0x0230
            long r17 = b.l.a.c.b.a.l2(r4, r5)
            r0 = r11
            r1 = r33
            r8 = r2
            r2 = r9
            r9 = r4
            r10 = r5
            r4 = r17
            r0.putLong(r1, r2, r4)
            int r0 = r10 + 8
            r1 = r12 | r25
            r5 = r8
            r4 = r9
            goto L_0x02c0
        L_0x0230:
            r8 = r2
            r10 = r5
            r6 = r8
            r3 = r10
            goto L_0x02ed
        L_0x0236:
            r5 = r35
            r13 = r38
            r35 = r7
            r20 = 0
            r7 = r3
            r3 = r16
            r16 = r1
            if (r8 != 0) goto L_0x027b
            int r0 = b.l.a.c.b.a.R0(r4, r3, r13)
            int r1 = r13.a
            r11.putInt(r14, r9, r1)
        L_0x024e:
            r1 = r12 | r25
            goto L_0x02c0
        L_0x0252:
            r5 = r35
            r13 = r38
            r35 = r7
            r20 = 0
            r7 = r3
            r3 = r16
            r16 = r1
            if (r8 != 0) goto L_0x027b
            int r8 = b.l.a.c.b.a.S1(r4, r3, r13)
            long r2 = r13.f3616b
            r0 = r11
            r1 = r33
            r17 = r2
        L_0x026c:
            r2 = r9
            r9 = r4
            r10 = r5
            r4 = r17
            r0.putLong(r1, r2, r4)
            r0 = r12 | r25
            r1 = r6
            r4 = r9
            r6 = r10
            goto L_0x02e5
        L_0x027b:
            r10 = r5
        L_0x027c:
            r6 = r10
            goto L_0x02ed
        L_0x027f:
            r5 = r35
            r13 = r38
            r35 = r7
            r20 = 0
            r7 = r3
            r3 = r16
            r16 = r1
            r1 = r4
            if (r8 != r0) goto L_0x02ce
            int r0 = b.l.a.c.b.a.f2(r1, r3)
            float r0 = java.lang.Float.intBitsToFloat(r0)
            b.l.a.c.f.i.x7 r2 = b.l.a.c.f.i.y7.f3819e
            r2.f(r14, r9, r0)
            int r0 = r3 + 4
            r4 = r1
            goto L_0x024e
        L_0x02a0:
            r5 = r35
            r13 = r38
            r35 = r7
            r0 = 1
            r20 = 0
            r7 = r3
            r3 = r16
            r16 = r1
            r1 = r4
            if (r8 != r0) goto L_0x02ce
            long r17 = b.l.a.c.b.a.l2(r1, r3)
            r4 = r1
            double r0 = java.lang.Double.longBitsToDouble(r17)
            b.l.a.c.f.i.y7.p(r14, r9, r0)
            int r0 = r3 + 8
            goto L_0x024e
        L_0x02c0:
            r12 = r36
            r16 = r5
            r3 = r7
            r2 = r22
            r5 = r35
            r7 = r1
            r1 = r37
            goto L_0x0019
        L_0x02ce:
            r6 = r5
            goto L_0x02ed
        L_0x02d0:
            java.lang.Object r1 = r11.getObject(r14, r9)
            java.lang.Object r2 = r13.c
            java.lang.Object r1 = b.l.a.c.f.i.w5.c(r1, r2)
        L_0x02da:
            r11.putObject(r14, r9, r1)
            r1 = r12 | r25
            r4 = r34
            r8 = r0
            r0 = r1
            r1 = r36
        L_0x02e5:
            r5 = r35
            r12 = r0
            r0 = r8
            r8 = r6
            r6 = r1
            goto L_0x0345
        L_0x02ed:
            r18 = r35
            r2 = r3
            r9 = r6
            r27 = r7
            r30 = r11
            r7 = r12
            r19 = -1
            r6 = r37
            goto L_0x0409
        L_0x02fc:
            r6 = r35
            r12 = r7
            r20 = 0
            r7 = r3
            r3 = r16
            r16 = 1048575(0xfffff, float:1.469367E-39)
            r0 = 27
            if (r2 != r0) goto L_0x0360
            r0 = 2
            if (r8 != r0) goto L_0x0351
            java.lang.Object r0 = r11.getObject(r14, r9)
            b.l.a.c.f.i.v5 r0 = (b.l.a.c.f.i.v5) r0
            boolean r1 = r0.a()
            if (r1 != 0) goto L_0x032b
            int r1 = r0.size()
            if (r1 != 0) goto L_0x0323
            r1 = 10
            goto L_0x0324
        L_0x0323:
            int r1 = r1 + r1
        L_0x0324:
            b.l.a.c.f.i.v5 r0 = r0.h(r1)
            r11.putObject(r14, r9, r0)
        L_0x032b:
            r8 = r0
            b.l.a.c.f.i.a7 r0 = r15.L(r7)
            r1 = r6
            r2 = r34
            r4 = r36
            r18 = r5
            r5 = r8
            r8 = r6
            r6 = r38
            int r0 = b.l.a.c.b.a.H2(r0, r1, r2, r3, r4, r5, r6)
            r4 = r34
            r6 = r36
            r5 = r18
        L_0x0345:
            r1 = r37
            r3 = r7
            r16 = r8
            r7 = r12
            r2 = r22
            r12 = r36
            goto L_0x0019
        L_0x0351:
            r18 = r5
            r15 = r3
            r25 = r6
            r27 = r7
            r30 = r11
            r26 = r12
            r19 = -1
            goto L_0x03b8
        L_0x0360:
            r18 = r5
            r0 = 49
            if (r2 > r0) goto L_0x039e
            r5 = r23
            long r4 = (long) r5
            r0 = r32
            r1 = r33
            r35 = r2
            r2 = r34
            r21 = r3
            r23 = r4
            r4 = r36
            r5 = r6
            r25 = r6
            r6 = r22
            r27 = r7
            r26 = r12
            r7 = r8
            r8 = r27
            r28 = r9
            r12 = r21
            r19 = -1
            r9 = r23
            r30 = r11
            r11 = r35
            r15 = r12
            r12 = r28
            r14 = r38
            int r0 = r0.I(r1, r2, r3, r4, r5, r6, r7, r8, r9, r11, r12, r14)
            if (r0 == r15) goto L_0x039b
            goto L_0x03e7
        L_0x039b:
            r9 = r0
            goto L_0x0402
        L_0x039e:
            r35 = r2
            r15 = r3
            r25 = r6
            r27 = r7
            r28 = r9
            r30 = r11
            r26 = r12
            r5 = r23
            r19 = -1
            r0 = 50
            r9 = r35
            if (r9 != r0) goto L_0x03cb
            r0 = 2
            if (r8 == r0) goto L_0x03ba
        L_0x03b8:
            r9 = r15
            goto L_0x0402
        L_0x03ba:
            r0 = r32
            r1 = r33
            r2 = r34
            r3 = r15
            r4 = r36
            r5 = r27
            r6 = r28
            r0.J(r1, r2, r3, r4, r5, r6)
            throw r17
        L_0x03cb:
            r0 = r32
            r1 = r33
            r2 = r34
            r3 = r15
            r4 = r36
            r10 = r5
            r5 = r25
            r6 = r22
            r7 = r8
            r8 = r10
            r10 = r28
            r12 = r27
            r13 = r38
            int r0 = r0.K(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r12, r13)
            if (r0 == r15) goto L_0x039b
        L_0x03e7:
            r15 = r32
            r14 = r33
            r4 = r34
            r6 = r36
            r12 = r6
            r1 = r37
            r13 = r38
            r5 = r18
            r2 = r22
            r16 = r25
            r7 = r26
            r3 = r27
            r11 = r30
            goto L_0x0019
        L_0x0402:
            r6 = r37
            r2 = r9
            r9 = r25
            r7 = r26
        L_0x0409:
            if (r9 != r6) goto L_0x0417
            if (r6 == 0) goto L_0x0417
            r8 = r32
            r12 = r33
            r0 = r2
            r1 = r6
            r5 = r18
            goto L_0x048a
        L_0x0417:
            r8 = r32
            boolean r0 = r8.f
            if (r0 == 0) goto L_0x0457
            r10 = r38
            b.l.a.c.f.i.c5 r0 = r10.d
            b.l.a.c.f.i.c5 r1 = b.l.a.c.f.i.c5.a()
            if (r0 == r1) goto L_0x0454
            b.l.a.c.f.i.q6 r0 = r8.f3720e
            b.l.a.c.f.i.c5 r1 = r10.d
            java.util.Map<b.l.a.c.f.i.b5, b.l.a.c.f.i.o5<?, ?>> r1 = r1.a
            b.l.a.c.f.i.b5 r3 = new b.l.a.c.f.i.b5
            r11 = r22
            r3.<init>(r0, r11)
            java.lang.Object r0 = r1.get(r3)
            b.l.a.c.f.i.o5 r0 = (b.l.a.c.f.i.o5) r0
            if (r0 != 0) goto L_0x044e
            b.l.a.c.f.i.o7 r4 = z(r33)
            r0 = r9
            r1 = r34
            r3 = r36
            r5 = r38
            int r0 = b.l.a.c.b.a.J2(r0, r1, r2, r3, r4, r5)
            r12 = r33
            goto L_0x046c
        L_0x044e:
            r12 = r33
            r0 = r12
            b.l.a.c.f.i.n5 r0 = (b.l.a.c.f.i.n5) r0
            throw r17
        L_0x0454:
            r12 = r33
            goto L_0x045b
        L_0x0457:
            r12 = r33
            r10 = r38
        L_0x045b:
            r11 = r22
            b.l.a.c.f.i.o7 r4 = z(r33)
            r0 = r9
            r1 = r34
            r3 = r36
            r5 = r38
            int r0 = b.l.a.c.b.a.J2(r0, r1, r2, r3, r4, r5)
        L_0x046c:
            r4 = r34
            r1 = r6
            r15 = r8
            r16 = r9
            r13 = r10
            r2 = r11
            r14 = r12
            r5 = r18
            r3 = r27
            r11 = r30
            r6 = r36
            r12 = r6
            goto L_0x0019
        L_0x0480:
            r18 = r5
            r26 = r7
            r30 = r11
            r12 = r14
            r8 = r15
            r9 = r16
        L_0x048a:
            r2 = 1048575(0xfffff, float:1.469367E-39)
            if (r5 == r2) goto L_0x0495
            long r3 = (long) r5
            r5 = r30
            r5.putInt(r12, r3, r7)
        L_0x0495:
            int r3 = r8.f3723i
        L_0x0497:
            int r4 = r8.f3724j
            if (r3 >= r4) goto L_0x04c2
            int[] r4 = r8.f3722h
            r4 = r4[r3]
            int[] r5 = r8.a
            r5 = r5[r4]
            int r5 = r8.j(r4)
            r5 = r5 & r2
            long r5 = (long) r5
            java.lang.Object r5 = b.l.a.c.f.i.y7.q(r12, r5)
            if (r5 != 0) goto L_0x04b0
            goto L_0x04b6
        L_0x04b0:
            b.l.a.c.f.i.s5 r6 = r8.N(r4)
            if (r6 != 0) goto L_0x04b9
        L_0x04b6:
            int r3 = r3 + 1
            goto L_0x0497
        L_0x04b9:
            b.l.a.c.f.i.l6 r5 = (b.l.a.c.f.i.l6) r5
            java.lang.Object r0 = r8.M(r4)
            b.l.a.c.f.i.k6 r0 = (b.l.a.c.f.i.k6) r0
            throw r17
        L_0x04c2:
            r2 = r36
            if (r1 != 0) goto L_0x04ce
            if (r0 != r2) goto L_0x04c9
            goto L_0x04d2
        L_0x04c9:
            b.l.a.c.f.i.y5 r0 = b.l.a.c.f.i.y5.c()
            throw r0
        L_0x04ce:
            if (r0 > r2) goto L_0x04d3
            if (r9 != r1) goto L_0x04d3
        L_0x04d2:
            return r0
        L_0x04d3:
            b.l.a.c.f.i.y5 r0 = b.l.a.c.f.i.y5.c()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: b.l.a.c.f.i.s6.A(java.lang.Object, byte[], int, int, int, b.l.a.c.f.i.j4):int");
    }

    public final void E(T t, T t2, int i2) {
        long j2 = (long) (this.a[i2 + 1] & 1048575);
        if (s(t2, i2)) {
            Object q2 = y7.q(t, j2);
            Object q3 = y7.q(t2, j2);
            if (q2 != null && q3 != null) {
                y7.f3819e.s(t, j2, w5.c(q2, q3));
                t(t, i2);
            } else if (q3 != null) {
                y7.f3819e.s(t, j2, q3);
                t(t, i2);
            }
        }
    }

    public final void F(T t, T t2, int i2) {
        int[] iArr = this.a;
        int i3 = iArr[i2 + 1];
        int i4 = iArr[i2];
        long j2 = (long) (i3 & 1048575);
        if (u(t2, i4, i2)) {
            Object q2 = u(t, i4, i2) ? y7.q(t, j2) : null;
            Object q3 = y7.q(t2, j2);
            if (q2 != null && q3 != null) {
                y7.f3819e.s(t, j2, w5.c(q2, q3));
                v(t, i4, i2);
            } else if (q3 != null) {
                y7.f3819e.s(t, j2, q3);
                v(t, i4, i2);
            }
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x0325, code lost:
        r1 = r1 + r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x035c, code lost:
        r1 = b.l.a.c.f.i.y4.u(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x0389, code lost:
        r6 = b.l.a.c.f.i.y4.u(r8 << 3);
        r1 = ((b.l.a.c.f.i.t4) r1).l();
        r4 = ((b.l.a.c.f.i.y4.u(r1) + r1) + r6) + r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x03b6, code lost:
        r1 = r1 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x03c6, code lost:
        r1 = r0.getInt(r15, r12);
        r6 = b.l.a.c.f.i.y4.u(r8 << 3);
        r1 = b.l.a.c.f.i.y4.t(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x03d4, code lost:
        r1 = r1 + r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x03df, code lost:
        r6 = r0.getLong(r15, r12);
        r1 = b.l.a.c.f.i.y4.u(r8 << 3);
        r6 = b.l.a.c.f.i.y4.v(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x03ed, code lost:
        r1 = r1 + r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x03f3, code lost:
        r1 = b.l.a.c.f.i.y4.u(r8 << 3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x03f9, code lost:
        r1 = r1 + 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x0400, code lost:
        r1 = b.l.a.c.f.i.y4.u(r8 << 3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x0406, code lost:
        r1 = r1 + 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x0409, code lost:
        r3 = r3 + 3;
        r1 = 1048575;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00ae, code lost:
        r1 = b.l.a.c.f.i.y4.u(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00e1, code lost:
        r6 = b.l.a.c.f.i.y4.u(r8 << 3);
        r1 = ((b.l.a.c.f.i.t4) r1).l();
        r7 = (b.l.a.c.f.i.y4.u(r1) + r1) + r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0125, code lost:
        r1 = n(r15, r12);
        r6 = b.l.a.c.f.i.y4.u(r8 << 3);
        r1 = b.l.a.c.f.i.y4.t(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0142, code lost:
        r6 = o(r15, r12);
        r1 = b.l.a.c.f.i.y4.u(r8 << 3);
        r6 = b.l.a.c.f.i.y4.v(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0158, code lost:
        r1 = b.l.a.c.f.i.y4.u(r8 << 3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0166, code lost:
        r1 = b.l.a.c.f.i.y4.u(r8 << 3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x0248, code lost:
        r7 = (b.l.a.c.f.i.y4.u(r1) + b.l.a.c.f.i.y4.s(r8)) + r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x0252, code lost:
        r4 = r4 + r7;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int G(T r15) {
        /*
            r14 = this;
            sun.misc.Unsafe r0 = f3718p
            r1 = 1048575(0xfffff, float:1.469367E-39)
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = r4
            r4 = r3
            r3 = r2
            r2 = r1
        L_0x000c:
            int[] r6 = r14.a
            int r6 = r6.length
            if (r3 >= r6) goto L_0x0410
            int r6 = r14.j(r3)
            int[] r7 = r14.a
            r8 = r7[r3]
            int r9 = r6 >>> 20
            r9 = r9 & 255(0xff, float:3.57E-43)
            r10 = 17
            r11 = 1
            if (r9 > r10) goto L_0x0036
            int r10 = r3 + 2
            r7 = r7[r10]
            r10 = r7 & r1
            int r7 = r7 >>> 20
            int r7 = r11 << r7
            if (r10 == r2) goto L_0x0037
            long r12 = (long) r10
            int r2 = r0.getInt(r15, r12)
            r5 = r2
            r2 = r10
            goto L_0x0037
        L_0x0036:
            r7 = 0
        L_0x0037:
            r1 = r1 & r6
            long r12 = (long) r1
            r1 = 63
            switch(r9) {
                case 0: goto L_0x03fc;
                case 1: goto L_0x03ef;
                case 2: goto L_0x03db;
                case 3: goto L_0x03d6;
                case 4: goto L_0x03c2;
                case 5: goto L_0x03bd;
                case 6: goto L_0x03b8;
                case 7: goto L_0x03ac;
                case 8: goto L_0x037d;
                case 9: goto L_0x036b;
                case 10: goto L_0x0362;
                case 11: goto L_0x034e;
                case 12: goto L_0x0348;
                case 13: goto L_0x0342;
                case 14: goto L_0x033c;
                case 15: goto L_0x0328;
                case 16: goto L_0x030f;
                case 17: goto L_0x02fb;
                case 18: goto L_0x02ef;
                case 19: goto L_0x02e3;
                case 20: goto L_0x02d7;
                case 21: goto L_0x02ca;
                case 22: goto L_0x02bd;
                case 23: goto L_0x02ef;
                case 24: goto L_0x02e3;
                case 25: goto L_0x02b1;
                case 26: goto L_0x02a5;
                case 27: goto L_0x0295;
                case 28: goto L_0x0289;
                case 29: goto L_0x027c;
                case 30: goto L_0x026f;
                case 31: goto L_0x02e3;
                case 32: goto L_0x02ef;
                case 33: goto L_0x0262;
                case 34: goto L_0x0255;
                case 35: goto L_0x023c;
                case 36: goto L_0x022f;
                case 37: goto L_0x0222;
                case 38: goto L_0x0215;
                case 39: goto L_0x0208;
                case 40: goto L_0x01fb;
                case 41: goto L_0x01ee;
                case 42: goto L_0x01df;
                case 43: goto L_0x01d1;
                case 44: goto L_0x01c3;
                case 45: goto L_0x01b5;
                case 46: goto L_0x01a7;
                case 47: goto L_0x0199;
                case 48: goto L_0x018b;
                case 49: goto L_0x017b;
                case 50: goto L_0x016e;
                case 51: goto L_0x0160;
                case 52: goto L_0x0152;
                case 53: goto L_0x013c;
                case 54: goto L_0x0135;
                case 55: goto L_0x011f;
                case 56: goto L_0x0118;
                case 57: goto L_0x0111;
                case 58: goto L_0x0103;
                case 59: goto L_0x00d3;
                case 60: goto L_0x00bf;
                case 61: goto L_0x00b4;
                case 62: goto L_0x009e;
                case 63: goto L_0x0096;
                case 64: goto L_0x008e;
                case 65: goto L_0x0086;
                case 66: goto L_0x0070;
                case 67: goto L_0x0056;
                case 68: goto L_0x0040;
                default: goto L_0x003e;
            }
        L_0x003e:
            goto L_0x0409
        L_0x0040:
            boolean r1 = r14.u(r15, r8, r3)
            if (r1 == 0) goto L_0x0409
            java.lang.Object r1 = r0.getObject(r15, r12)
            b.l.a.c.f.i.q6 r1 = (b.l.a.c.f.i.q6) r1
            b.l.a.c.f.i.a7 r6 = r14.L(r3)
            int r1 = b.l.a.c.f.i.y4.c(r8, r1, r6)
            goto L_0x0408
        L_0x0056:
            boolean r6 = r14.u(r15, r8, r3)
            if (r6 == 0) goto L_0x0409
            long r6 = o(r15, r12)
            int r8 = r8 << 3
            int r8 = b.l.a.c.f.i.y4.u(r8)
            long r9 = r6 + r6
            long r6 = r6 >> r1
            long r6 = r6 ^ r9
            int r1 = b.l.a.c.f.i.y4.v(r6)
            goto L_0x0325
        L_0x0070:
            boolean r1 = r14.u(r15, r8, r3)
            if (r1 == 0) goto L_0x0409
            int r1 = n(r15, r12)
            int r6 = r8 << 3
            int r6 = b.l.a.c.f.i.y4.u(r6)
            int r7 = r1 + r1
            int r1 = r1 >> 31
            r1 = r1 ^ r7
            goto L_0x00ae
        L_0x0086:
            boolean r1 = r14.u(r15, r8, r3)
            if (r1 == 0) goto L_0x0409
            goto L_0x0166
        L_0x008e:
            boolean r1 = r14.u(r15, r8, r3)
            if (r1 == 0) goto L_0x0409
            goto L_0x0158
        L_0x0096:
            boolean r1 = r14.u(r15, r8, r3)
            if (r1 == 0) goto L_0x0409
            goto L_0x0125
        L_0x009e:
            boolean r1 = r14.u(r15, r8, r3)
            if (r1 == 0) goto L_0x0409
            int r1 = n(r15, r12)
            int r6 = r8 << 3
            int r6 = b.l.a.c.f.i.y4.u(r6)
        L_0x00ae:
            int r1 = b.l.a.c.f.i.y4.u(r1)
            goto L_0x03d4
        L_0x00b4:
            boolean r1 = r14.u(r15, r8, r3)
            if (r1 == 0) goto L_0x0409
            java.lang.Object r1 = r0.getObject(r15, r12)
            goto L_0x00e1
        L_0x00bf:
            boolean r1 = r14.u(r15, r8, r3)
            if (r1 == 0) goto L_0x0409
            java.lang.Object r1 = r0.getObject(r15, r12)
            b.l.a.c.f.i.a7 r6 = r14.L(r3)
            int r1 = b.l.a.c.f.i.c7.O(r8, r1, r6)
            goto L_0x0408
        L_0x00d3:
            boolean r1 = r14.u(r15, r8, r3)
            if (r1 == 0) goto L_0x0409
            java.lang.Object r1 = r0.getObject(r15, r12)
            boolean r6 = r1 instanceof b.l.a.c.f.i.t4
            if (r6 == 0) goto L_0x00f5
        L_0x00e1:
            b.l.a.c.f.i.t4 r1 = (b.l.a.c.f.i.t4) r1
            int r6 = r8 << 3
            int r6 = b.l.a.c.f.i.y4.u(r6)
            int r1 = r1.l()
            int r7 = b.l.a.c.f.i.y4.u(r1)
            int r7 = r7 + r1
            int r7 = r7 + r6
            goto L_0x0252
        L_0x00f5:
            java.lang.String r1 = (java.lang.String) r1
            int r6 = r8 << 3
            int r6 = b.l.a.c.f.i.y4.u(r6)
            int r1 = b.l.a.c.f.i.y4.w(r1)
            goto L_0x03d4
        L_0x0103:
            boolean r1 = r14.u(r15, r8, r3)
            if (r1 == 0) goto L_0x0409
            int r1 = r8 << 3
            int r1 = b.l.a.c.f.i.y4.u(r1)
            goto L_0x03b6
        L_0x0111:
            boolean r1 = r14.u(r15, r8, r3)
            if (r1 == 0) goto L_0x0409
            goto L_0x0158
        L_0x0118:
            boolean r1 = r14.u(r15, r8, r3)
            if (r1 == 0) goto L_0x0409
            goto L_0x0166
        L_0x011f:
            boolean r1 = r14.u(r15, r8, r3)
            if (r1 == 0) goto L_0x0409
        L_0x0125:
            int r1 = n(r15, r12)
            int r6 = r8 << 3
            int r6 = b.l.a.c.f.i.y4.u(r6)
            int r1 = b.l.a.c.f.i.y4.t(r1)
            goto L_0x03d4
        L_0x0135:
            boolean r1 = r14.u(r15, r8, r3)
            if (r1 == 0) goto L_0x0409
            goto L_0x0142
        L_0x013c:
            boolean r1 = r14.u(r15, r8, r3)
            if (r1 == 0) goto L_0x0409
        L_0x0142:
            long r6 = o(r15, r12)
            int r1 = r8 << 3
            int r1 = b.l.a.c.f.i.y4.u(r1)
            int r6 = b.l.a.c.f.i.y4.v(r6)
            goto L_0x03ed
        L_0x0152:
            boolean r1 = r14.u(r15, r8, r3)
            if (r1 == 0) goto L_0x0409
        L_0x0158:
            int r1 = r8 << 3
            int r1 = b.l.a.c.f.i.y4.u(r1)
            goto L_0x03f9
        L_0x0160:
            boolean r1 = r14.u(r15, r8, r3)
            if (r1 == 0) goto L_0x0409
        L_0x0166:
            int r1 = r8 << 3
            int r1 = b.l.a.c.f.i.y4.u(r1)
            goto L_0x0406
        L_0x016e:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.lang.Object r6 = r14.M(r3)
            b.l.a.c.f.i.m6.a(r8, r1, r6)
            goto L_0x0409
        L_0x017b:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            b.l.a.c.f.i.a7 r6 = r14.L(r3)
            int r1 = b.l.a.c.f.i.c7.R(r8, r1, r6)
            goto L_0x0408
        L_0x018b:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            int r1 = b.l.a.c.f.i.c7.y(r1)
            if (r1 <= 0) goto L_0x0409
            goto L_0x0248
        L_0x0199:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            int r1 = b.l.a.c.f.i.c7.G(r1)
            if (r1 <= 0) goto L_0x0409
            goto L_0x0248
        L_0x01a7:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            int r1 = b.l.a.c.f.i.c7.K(r1)
            if (r1 <= 0) goto L_0x0409
            goto L_0x0248
        L_0x01b5:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            int r1 = b.l.a.c.f.i.c7.I(r1)
            if (r1 <= 0) goto L_0x0409
            goto L_0x0248
        L_0x01c3:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            int r1 = b.l.a.c.f.i.c7.A(r1)
            if (r1 <= 0) goto L_0x0409
            goto L_0x0248
        L_0x01d1:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            int r1 = b.l.a.c.f.i.c7.E(r1)
            if (r1 <= 0) goto L_0x0409
            goto L_0x0248
        L_0x01df:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            java.lang.Class<?> r6 = b.l.a.c.f.i.c7.a
            int r1 = r1.size()
            if (r1 <= 0) goto L_0x0409
            goto L_0x0248
        L_0x01ee:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            int r1 = b.l.a.c.f.i.c7.I(r1)
            if (r1 <= 0) goto L_0x0409
            goto L_0x0248
        L_0x01fb:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            int r1 = b.l.a.c.f.i.c7.K(r1)
            if (r1 <= 0) goto L_0x0409
            goto L_0x0248
        L_0x0208:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            int r1 = b.l.a.c.f.i.c7.C(r1)
            if (r1 <= 0) goto L_0x0409
            goto L_0x0248
        L_0x0215:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            int r1 = b.l.a.c.f.i.c7.w(r1)
            if (r1 <= 0) goto L_0x0409
            goto L_0x0248
        L_0x0222:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            int r1 = b.l.a.c.f.i.c7.u(r1)
            if (r1 <= 0) goto L_0x0409
            goto L_0x0248
        L_0x022f:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            int r1 = b.l.a.c.f.i.c7.I(r1)
            if (r1 <= 0) goto L_0x0409
            goto L_0x0248
        L_0x023c:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            int r1 = b.l.a.c.f.i.c7.K(r1)
            if (r1 <= 0) goto L_0x0409
        L_0x0248:
            int r6 = b.l.a.c.f.i.y4.s(r8)
            int r7 = b.l.a.c.f.i.y4.u(r1)
            int r7 = r7 + r6
            int r7 = r7 + r1
        L_0x0252:
            int r4 = r4 + r7
            goto L_0x0409
        L_0x0255:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            r6 = 0
            int r1 = b.l.a.c.f.i.c7.z(r8, r1, r6)
            goto L_0x0408
        L_0x0262:
            r1 = 0
            java.lang.Object r6 = r0.getObject(r15, r12)
            java.util.List r6 = (java.util.List) r6
            int r1 = b.l.a.c.f.i.c7.H(r8, r6, r1)
            goto L_0x0408
        L_0x026f:
            r1 = 0
            java.lang.Object r6 = r0.getObject(r15, r12)
            java.util.List r6 = (java.util.List) r6
            int r1 = b.l.a.c.f.i.c7.B(r8, r6, r1)
            goto L_0x0408
        L_0x027c:
            r1 = 0
            java.lang.Object r6 = r0.getObject(r15, r12)
            java.util.List r6 = (java.util.List) r6
            int r1 = b.l.a.c.f.i.c7.F(r8, r6, r1)
            goto L_0x0408
        L_0x0289:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            int r1 = b.l.a.c.f.i.c7.Q(r8, r1)
            goto L_0x0408
        L_0x0295:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            b.l.a.c.f.i.a7 r6 = r14.L(r3)
            int r1 = b.l.a.c.f.i.c7.P(r8, r1, r6)
            goto L_0x0408
        L_0x02a5:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            int r1 = b.l.a.c.f.i.c7.N(r8, r1)
            goto L_0x0408
        L_0x02b1:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            int r1 = b.l.a.c.f.i.c7.M(r8, r1)
            goto L_0x0408
        L_0x02bd:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            r6 = 0
            int r1 = b.l.a.c.f.i.c7.D(r8, r1, r6)
            goto L_0x0408
        L_0x02ca:
            r1 = 0
            java.lang.Object r6 = r0.getObject(r15, r12)
            java.util.List r6 = (java.util.List) r6
            int r1 = b.l.a.c.f.i.c7.x(r8, r6, r1)
            goto L_0x0408
        L_0x02d7:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            int r1 = b.l.a.c.f.i.c7.v(r8, r1)
            goto L_0x0408
        L_0x02e3:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            int r1 = b.l.a.c.f.i.c7.J(r8, r1)
            goto L_0x0408
        L_0x02ef:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            int r1 = b.l.a.c.f.i.c7.L(r8, r1)
            goto L_0x0408
        L_0x02fb:
            r1 = r5 & r7
            if (r1 == 0) goto L_0x0409
            java.lang.Object r1 = r0.getObject(r15, r12)
            b.l.a.c.f.i.q6 r1 = (b.l.a.c.f.i.q6) r1
            b.l.a.c.f.i.a7 r6 = r14.L(r3)
            int r1 = b.l.a.c.f.i.y4.c(r8, r1, r6)
            goto L_0x0408
        L_0x030f:
            r6 = r7 & r5
            if (r6 == 0) goto L_0x0409
            long r6 = r0.getLong(r15, r12)
            int r8 = r8 << 3
            int r8 = b.l.a.c.f.i.y4.u(r8)
            long r9 = r6 + r6
            long r6 = r6 >> r1
            long r6 = r6 ^ r9
            int r1 = b.l.a.c.f.i.y4.v(r6)
        L_0x0325:
            int r1 = r1 + r8
            goto L_0x0408
        L_0x0328:
            r1 = r5 & r7
            if (r1 == 0) goto L_0x0409
            int r1 = r0.getInt(r15, r12)
            int r6 = r8 << 3
            int r6 = b.l.a.c.f.i.y4.u(r6)
            int r7 = r1 + r1
            int r1 = r1 >> 31
            r1 = r1 ^ r7
            goto L_0x035c
        L_0x033c:
            r1 = r5 & r7
            if (r1 == 0) goto L_0x0409
            goto L_0x0400
        L_0x0342:
            r1 = r5 & r7
            if (r1 == 0) goto L_0x0409
            goto L_0x03f3
        L_0x0348:
            r1 = r5 & r7
            if (r1 == 0) goto L_0x0409
            goto L_0x03c6
        L_0x034e:
            r1 = r5 & r7
            if (r1 == 0) goto L_0x0409
            int r1 = r0.getInt(r15, r12)
            int r6 = r8 << 3
            int r6 = b.l.a.c.f.i.y4.u(r6)
        L_0x035c:
            int r1 = b.l.a.c.f.i.y4.u(r1)
            goto L_0x03d4
        L_0x0362:
            r1 = r5 & r7
            if (r1 == 0) goto L_0x0409
            java.lang.Object r1 = r0.getObject(r15, r12)
            goto L_0x0389
        L_0x036b:
            r1 = r5 & r7
            if (r1 == 0) goto L_0x0409
            java.lang.Object r1 = r0.getObject(r15, r12)
            b.l.a.c.f.i.a7 r6 = r14.L(r3)
            int r1 = b.l.a.c.f.i.c7.O(r8, r1, r6)
            goto L_0x0408
        L_0x037d:
            r1 = r5 & r7
            if (r1 == 0) goto L_0x0409
            java.lang.Object r1 = r0.getObject(r15, r12)
            boolean r6 = r1 instanceof b.l.a.c.f.i.t4
            if (r6 == 0) goto L_0x039f
        L_0x0389:
            b.l.a.c.f.i.t4 r1 = (b.l.a.c.f.i.t4) r1
            int r6 = r8 << 3
            int r6 = b.l.a.c.f.i.y4.u(r6)
            int r1 = r1.l()
            int r7 = b.l.a.c.f.i.y4.u(r1)
            int r7 = r7 + r1
            int r7 = r7 + r6
            int r7 = r7 + r4
            r4 = r7
            goto L_0x0409
        L_0x039f:
            java.lang.String r1 = (java.lang.String) r1
            int r6 = r8 << 3
            int r6 = b.l.a.c.f.i.y4.u(r6)
            int r1 = b.l.a.c.f.i.y4.w(r1)
            goto L_0x03d4
        L_0x03ac:
            r1 = r5 & r7
            if (r1 == 0) goto L_0x0409
            int r1 = r8 << 3
            int r1 = b.l.a.c.f.i.y4.u(r1)
        L_0x03b6:
            int r1 = r1 + r11
            goto L_0x0408
        L_0x03b8:
            r1 = r5 & r7
            if (r1 == 0) goto L_0x0409
            goto L_0x03f3
        L_0x03bd:
            r1 = r5 & r7
            if (r1 == 0) goto L_0x0409
            goto L_0x0400
        L_0x03c2:
            r1 = r5 & r7
            if (r1 == 0) goto L_0x0409
        L_0x03c6:
            int r1 = r0.getInt(r15, r12)
            int r6 = r8 << 3
            int r6 = b.l.a.c.f.i.y4.u(r6)
            int r1 = b.l.a.c.f.i.y4.t(r1)
        L_0x03d4:
            int r1 = r1 + r6
            goto L_0x0408
        L_0x03d6:
            r1 = r5 & r7
            if (r1 == 0) goto L_0x0409
            goto L_0x03df
        L_0x03db:
            r1 = r5 & r7
            if (r1 == 0) goto L_0x0409
        L_0x03df:
            long r6 = r0.getLong(r15, r12)
            int r1 = r8 << 3
            int r1 = b.l.a.c.f.i.y4.u(r1)
            int r6 = b.l.a.c.f.i.y4.v(r6)
        L_0x03ed:
            int r1 = r1 + r6
            goto L_0x0408
        L_0x03ef:
            r1 = r5 & r7
            if (r1 == 0) goto L_0x0409
        L_0x03f3:
            int r1 = r8 << 3
            int r1 = b.l.a.c.f.i.y4.u(r1)
        L_0x03f9:
            int r1 = r1 + 4
            goto L_0x0408
        L_0x03fc:
            r1 = r5 & r7
            if (r1 == 0) goto L_0x0409
        L_0x0400:
            int r1 = r8 << 3
            int r1 = b.l.a.c.f.i.y4.u(r1)
        L_0x0406:
            int r1 = r1 + 8
        L_0x0408:
            int r4 = r4 + r1
        L_0x0409:
            int r3 = r3 + 3
            r1 = 1048575(0xfffff, float:1.469367E-39)
            goto L_0x000c
        L_0x0410:
            b.l.a.c.f.i.n7<?, ?> r0 = r14.f3726l
            java.lang.Object r1 = r0.d(r15)
            int r0 = r0.h(r1)
            int r0 = r0 + r4
            boolean r1 = r14.f
            if (r1 != 0) goto L_0x0420
            return r0
        L_0x0420:
            b.l.a.c.f.i.d5<?> r0 = r14.f3727m
            r0.b(r15)
            r15 = 0
            throw r15
        */
        throw new UnsupportedOperationException("Method not decompiled: b.l.a.c.f.i.s6.G(java.lang.Object):int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:103:0x0282, code lost:
        r4 = b.l.a.c.f.i.y4.v((r5 >> 63) ^ (r5 + r5)) + b.l.a.c.f.i.y4.u(r7 << 3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x029e, code lost:
        r5 = b.l.a.c.f.i.y4.u(r7 << 3);
        r4 = (r4 >> 31) ^ (r4 + r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x02cc, code lost:
        r5 = b.l.a.c.f.i.y4.u(r7 << 3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x02d2, code lost:
        r4 = b.l.a.c.f.i.y4.u(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x02de, code lost:
        r4 = b.l.a.c.f.i.y7.q(r11, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x02e9, code lost:
        r4 = b.l.a.c.f.i.c7.O(r7, b.l.a.c.f.i.y7.q(r11, r8), L(r2));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x0303, code lost:
        if ((r4 instanceof b.l.a.c.f.i.t4) != false) goto L_0x0305;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x0305, code lost:
        r5 = b.l.a.c.f.i.y4.u(r7 << 3);
        r4 = ((b.l.a.c.f.i.t4) r4).l();
        r6 = (b.l.a.c.f.i.y4.u(r4) + r4) + r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x0317, code lost:
        r3 = r3 + r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x031a, code lost:
        r5 = b.l.a.c.f.i.y4.u(r7 << 3);
        r4 = b.l.a.c.f.i.y4.w((java.lang.String) r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x032d, code lost:
        r4 = b.l.a.c.f.i.y4.u(r7 << 3) + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x034a, code lost:
        r4 = b.l.a.c.f.i.y7.j(r11, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x034e, code lost:
        r5 = b.l.a.c.f.i.y4.u(r7 << 3);
        r4 = b.l.a.c.f.i.y4.t(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x0358, code lost:
        r4 = r4 + r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x0367, code lost:
        r4 = b.l.a.c.f.i.y7.k(r11, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x036b, code lost:
        r4 = b.l.a.c.f.i.y4.v(r4) + b.l.a.c.f.i.y4.u(r7 << 3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x037d, code lost:
        r4 = b.l.a.c.f.i.y4.u(r7 << 3) + 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x038c, code lost:
        r4 = b.l.a.c.f.i.y4.u(r7 << 3) + 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x0394, code lost:
        r3 = r3 + r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x0395, code lost:
        r2 = r2 + 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0091, code lost:
        if ((r4 instanceof b.l.a.c.f.i.t4) != false) goto L_0x0305;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00b3, code lost:
        r4 = n(r11, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00c6, code lost:
        r4 = o(r11, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x01b6, code lost:
        r6 = (b.l.a.c.f.i.y4.u(r4) + b.l.a.c.f.i.y4.s(r7)) + r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x0268, code lost:
        r4 = b.l.a.c.f.i.y4.c(r7, (b.l.a.c.f.i.q6) b.l.a.c.f.i.y7.q(r11, r8), L(r2));
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int H(T r11) {
        /*
            r10 = this;
            sun.misc.Unsafe r0 = f3718p
            r1 = 0
            r2 = r1
            r3 = r2
        L_0x0005:
            int[] r4 = r10.a
            int r4 = r4.length
            if (r2 >= r4) goto L_0x0399
            int r4 = r10.j(r2)
            int r5 = r4 >>> 20
            r5 = r5 & 255(0xff, float:3.57E-43)
            int[] r6 = r10.a
            r7 = r6[r2]
            r8 = 1048575(0xfffff, float:1.469367E-39)
            r4 = r4 & r8
            long r8 = (long) r4
            b.l.a.c.f.i.i5 r4 = b.l.a.c.f.i.i5.DOUBLE_LIST_PACKED
            int r4 = r4.f3607h
            if (r5 < r4) goto L_0x002b
            b.l.a.c.f.i.i5 r4 = b.l.a.c.f.i.i5.SINT64_LIST_PACKED
            int r4 = r4.f3607h
            if (r5 > r4) goto L_0x002b
            int r4 = r2 + 2
            r4 = r6[r4]
        L_0x002b:
            r4 = 63
            switch(r5) {
                case 0: goto L_0x0386;
                case 1: goto L_0x0377;
                case 2: goto L_0x0361;
                case 3: goto L_0x035a;
                case 4: goto L_0x0344;
                case 5: goto L_0x033d;
                case 6: goto L_0x0336;
                case 7: goto L_0x0327;
                case 8: goto L_0x02f7;
                case 9: goto L_0x02e3;
                case 10: goto L_0x02d8;
                case 11: goto L_0x02c2;
                case 12: goto L_0x02ba;
                case 13: goto L_0x02b2;
                case 14: goto L_0x02aa;
                case 15: goto L_0x0294;
                case 16: goto L_0x0278;
                case 17: goto L_0x0262;
                case 18: goto L_0x0256;
                case 19: goto L_0x024a;
                case 20: goto L_0x023e;
                case 21: goto L_0x0232;
                case 22: goto L_0x0226;
                case 23: goto L_0x0256;
                case 24: goto L_0x024a;
                case 25: goto L_0x021a;
                case 26: goto L_0x020e;
                case 27: goto L_0x01fe;
                case 28: goto L_0x01f2;
                case 29: goto L_0x01e6;
                case 30: goto L_0x01da;
                case 31: goto L_0x024a;
                case 32: goto L_0x0256;
                case 33: goto L_0x01ce;
                case 34: goto L_0x01c2;
                case 35: goto L_0x01aa;
                case 36: goto L_0x019d;
                case 37: goto L_0x0190;
                case 38: goto L_0x0183;
                case 39: goto L_0x0176;
                case 40: goto L_0x0169;
                case 41: goto L_0x015c;
                case 42: goto L_0x014d;
                case 43: goto L_0x013f;
                case 44: goto L_0x0131;
                case 45: goto L_0x0123;
                case 46: goto L_0x0115;
                case 47: goto L_0x0107;
                case 48: goto L_0x00f9;
                case 49: goto L_0x00e9;
                case 50: goto L_0x00dc;
                case 51: goto L_0x00d4;
                case 52: goto L_0x00cc;
                case 53: goto L_0x00c0;
                case 54: goto L_0x00b9;
                case 55: goto L_0x00ad;
                case 56: goto L_0x00a5;
                case 57: goto L_0x009d;
                case 58: goto L_0x0095;
                case 59: goto L_0x0085;
                case 60: goto L_0x007d;
                case 61: goto L_0x0075;
                case 62: goto L_0x0069;
                case 63: goto L_0x0062;
                case 64: goto L_0x005a;
                case 65: goto L_0x0052;
                case 66: goto L_0x0046;
                case 67: goto L_0x003a;
                case 68: goto L_0x0032;
                default: goto L_0x0030;
            }
        L_0x0030:
            goto L_0x0395
        L_0x0032:
            boolean r4 = r10.u(r11, r7, r2)
            if (r4 == 0) goto L_0x0395
            goto L_0x0268
        L_0x003a:
            boolean r5 = r10.u(r11, r7, r2)
            if (r5 == 0) goto L_0x0395
            long r5 = o(r11, r8)
            goto L_0x0282
        L_0x0046:
            boolean r4 = r10.u(r11, r7, r2)
            if (r4 == 0) goto L_0x0395
            int r4 = n(r11, r8)
            goto L_0x029e
        L_0x0052:
            boolean r4 = r10.u(r11, r7, r2)
            if (r4 == 0) goto L_0x0395
            goto L_0x038c
        L_0x005a:
            boolean r4 = r10.u(r11, r7, r2)
            if (r4 == 0) goto L_0x0395
            goto L_0x037d
        L_0x0062:
            boolean r4 = r10.u(r11, r7, r2)
            if (r4 == 0) goto L_0x0395
            goto L_0x00b3
        L_0x0069:
            boolean r4 = r10.u(r11, r7, r2)
            if (r4 == 0) goto L_0x0395
            int r4 = n(r11, r8)
            goto L_0x02cc
        L_0x0075:
            boolean r4 = r10.u(r11, r7, r2)
            if (r4 == 0) goto L_0x0395
            goto L_0x02de
        L_0x007d:
            boolean r4 = r10.u(r11, r7, r2)
            if (r4 == 0) goto L_0x0395
            goto L_0x02e9
        L_0x0085:
            boolean r4 = r10.u(r11, r7, r2)
            if (r4 == 0) goto L_0x0395
            java.lang.Object r4 = b.l.a.c.f.i.y7.q(r11, r8)
            boolean r5 = r4 instanceof b.l.a.c.f.i.t4
            if (r5 == 0) goto L_0x031a
            goto L_0x0305
        L_0x0095:
            boolean r4 = r10.u(r11, r7, r2)
            if (r4 == 0) goto L_0x0395
            goto L_0x032d
        L_0x009d:
            boolean r4 = r10.u(r11, r7, r2)
            if (r4 == 0) goto L_0x0395
            goto L_0x037d
        L_0x00a5:
            boolean r4 = r10.u(r11, r7, r2)
            if (r4 == 0) goto L_0x0395
            goto L_0x038c
        L_0x00ad:
            boolean r4 = r10.u(r11, r7, r2)
            if (r4 == 0) goto L_0x0395
        L_0x00b3:
            int r4 = n(r11, r8)
            goto L_0x034e
        L_0x00b9:
            boolean r4 = r10.u(r11, r7, r2)
            if (r4 == 0) goto L_0x0395
            goto L_0x00c6
        L_0x00c0:
            boolean r4 = r10.u(r11, r7, r2)
            if (r4 == 0) goto L_0x0395
        L_0x00c6:
            long r4 = o(r11, r8)
            goto L_0x036b
        L_0x00cc:
            boolean r4 = r10.u(r11, r7, r2)
            if (r4 == 0) goto L_0x0395
            goto L_0x037d
        L_0x00d4:
            boolean r4 = r10.u(r11, r7, r2)
            if (r4 == 0) goto L_0x0395
            goto L_0x038c
        L_0x00dc:
            java.lang.Object r4 = b.l.a.c.f.i.y7.q(r11, r8)
            java.lang.Object r5 = r10.M(r2)
            b.l.a.c.f.i.m6.a(r7, r4, r5)
            goto L_0x0395
        L_0x00e9:
            java.lang.Object r4 = b.l.a.c.f.i.y7.q(r11, r8)
            java.util.List r4 = (java.util.List) r4
            b.l.a.c.f.i.a7 r5 = r10.L(r2)
            int r4 = b.l.a.c.f.i.c7.R(r7, r4, r5)
            goto L_0x0394
        L_0x00f9:
            java.lang.Object r4 = r0.getObject(r11, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = b.l.a.c.f.i.c7.y(r4)
            if (r4 <= 0) goto L_0x0395
            goto L_0x01b6
        L_0x0107:
            java.lang.Object r4 = r0.getObject(r11, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = b.l.a.c.f.i.c7.G(r4)
            if (r4 <= 0) goto L_0x0395
            goto L_0x01b6
        L_0x0115:
            java.lang.Object r4 = r0.getObject(r11, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = b.l.a.c.f.i.c7.K(r4)
            if (r4 <= 0) goto L_0x0395
            goto L_0x01b6
        L_0x0123:
            java.lang.Object r4 = r0.getObject(r11, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = b.l.a.c.f.i.c7.I(r4)
            if (r4 <= 0) goto L_0x0395
            goto L_0x01b6
        L_0x0131:
            java.lang.Object r4 = r0.getObject(r11, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = b.l.a.c.f.i.c7.A(r4)
            if (r4 <= 0) goto L_0x0395
            goto L_0x01b6
        L_0x013f:
            java.lang.Object r4 = r0.getObject(r11, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = b.l.a.c.f.i.c7.E(r4)
            if (r4 <= 0) goto L_0x0395
            goto L_0x01b6
        L_0x014d:
            java.lang.Object r4 = r0.getObject(r11, r8)
            java.util.List r4 = (java.util.List) r4
            java.lang.Class<?> r5 = b.l.a.c.f.i.c7.a
            int r4 = r4.size()
            if (r4 <= 0) goto L_0x0395
            goto L_0x01b6
        L_0x015c:
            java.lang.Object r4 = r0.getObject(r11, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = b.l.a.c.f.i.c7.I(r4)
            if (r4 <= 0) goto L_0x0395
            goto L_0x01b6
        L_0x0169:
            java.lang.Object r4 = r0.getObject(r11, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = b.l.a.c.f.i.c7.K(r4)
            if (r4 <= 0) goto L_0x0395
            goto L_0x01b6
        L_0x0176:
            java.lang.Object r4 = r0.getObject(r11, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = b.l.a.c.f.i.c7.C(r4)
            if (r4 <= 0) goto L_0x0395
            goto L_0x01b6
        L_0x0183:
            java.lang.Object r4 = r0.getObject(r11, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = b.l.a.c.f.i.c7.w(r4)
            if (r4 <= 0) goto L_0x0395
            goto L_0x01b6
        L_0x0190:
            java.lang.Object r4 = r0.getObject(r11, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = b.l.a.c.f.i.c7.u(r4)
            if (r4 <= 0) goto L_0x0395
            goto L_0x01b6
        L_0x019d:
            java.lang.Object r4 = r0.getObject(r11, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = b.l.a.c.f.i.c7.I(r4)
            if (r4 <= 0) goto L_0x0395
            goto L_0x01b6
        L_0x01aa:
            java.lang.Object r4 = r0.getObject(r11, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = b.l.a.c.f.i.c7.K(r4)
            if (r4 <= 0) goto L_0x0395
        L_0x01b6:
            int r5 = b.l.a.c.f.i.y4.s(r7)
            int r6 = b.l.a.c.f.i.y4.u(r4)
            int r6 = r6 + r5
            int r6 = r6 + r4
            goto L_0x0317
        L_0x01c2:
            java.lang.Object r4 = b.l.a.c.f.i.y7.q(r11, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = b.l.a.c.f.i.c7.z(r7, r4, r1)
            goto L_0x0394
        L_0x01ce:
            java.lang.Object r4 = b.l.a.c.f.i.y7.q(r11, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = b.l.a.c.f.i.c7.H(r7, r4, r1)
            goto L_0x0394
        L_0x01da:
            java.lang.Object r4 = b.l.a.c.f.i.y7.q(r11, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = b.l.a.c.f.i.c7.B(r7, r4, r1)
            goto L_0x0394
        L_0x01e6:
            java.lang.Object r4 = b.l.a.c.f.i.y7.q(r11, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = b.l.a.c.f.i.c7.F(r7, r4, r1)
            goto L_0x0394
        L_0x01f2:
            java.lang.Object r4 = b.l.a.c.f.i.y7.q(r11, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = b.l.a.c.f.i.c7.Q(r7, r4)
            goto L_0x0394
        L_0x01fe:
            java.lang.Object r4 = b.l.a.c.f.i.y7.q(r11, r8)
            java.util.List r4 = (java.util.List) r4
            b.l.a.c.f.i.a7 r5 = r10.L(r2)
            int r4 = b.l.a.c.f.i.c7.P(r7, r4, r5)
            goto L_0x0394
        L_0x020e:
            java.lang.Object r4 = b.l.a.c.f.i.y7.q(r11, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = b.l.a.c.f.i.c7.N(r7, r4)
            goto L_0x0394
        L_0x021a:
            java.lang.Object r4 = b.l.a.c.f.i.y7.q(r11, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = b.l.a.c.f.i.c7.M(r7, r4)
            goto L_0x0394
        L_0x0226:
            java.lang.Object r4 = b.l.a.c.f.i.y7.q(r11, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = b.l.a.c.f.i.c7.D(r7, r4, r1)
            goto L_0x0394
        L_0x0232:
            java.lang.Object r4 = b.l.a.c.f.i.y7.q(r11, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = b.l.a.c.f.i.c7.x(r7, r4, r1)
            goto L_0x0394
        L_0x023e:
            java.lang.Object r4 = b.l.a.c.f.i.y7.q(r11, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = b.l.a.c.f.i.c7.v(r7, r4)
            goto L_0x0394
        L_0x024a:
            java.lang.Object r4 = b.l.a.c.f.i.y7.q(r11, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = b.l.a.c.f.i.c7.J(r7, r4)
            goto L_0x0394
        L_0x0256:
            java.lang.Object r4 = b.l.a.c.f.i.y7.q(r11, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = b.l.a.c.f.i.c7.L(r7, r4)
            goto L_0x0394
        L_0x0262:
            boolean r4 = r10.s(r11, r2)
            if (r4 == 0) goto L_0x0395
        L_0x0268:
            java.lang.Object r4 = b.l.a.c.f.i.y7.q(r11, r8)
            b.l.a.c.f.i.q6 r4 = (b.l.a.c.f.i.q6) r4
            b.l.a.c.f.i.a7 r5 = r10.L(r2)
            int r4 = b.l.a.c.f.i.y4.c(r7, r4, r5)
            goto L_0x0394
        L_0x0278:
            boolean r5 = r10.s(r11, r2)
            if (r5 == 0) goto L_0x0395
            long r5 = b.l.a.c.f.i.y7.k(r11, r8)
        L_0x0282:
            int r7 = r7 << 3
            int r7 = b.l.a.c.f.i.y4.u(r7)
            long r8 = r5 + r5
            long r4 = r5 >> r4
            long r4 = r4 ^ r8
            int r4 = b.l.a.c.f.i.y4.v(r4)
            int r4 = r4 + r7
            goto L_0x0394
        L_0x0294:
            boolean r4 = r10.s(r11, r2)
            if (r4 == 0) goto L_0x0395
            int r4 = b.l.a.c.f.i.y7.j(r11, r8)
        L_0x029e:
            int r5 = r7 << 3
            int r5 = b.l.a.c.f.i.y4.u(r5)
            int r6 = r4 + r4
            int r4 = r4 >> 31
            r4 = r4 ^ r6
            goto L_0x02d2
        L_0x02aa:
            boolean r4 = r10.s(r11, r2)
            if (r4 == 0) goto L_0x0395
            goto L_0x038c
        L_0x02b2:
            boolean r4 = r10.s(r11, r2)
            if (r4 == 0) goto L_0x0395
            goto L_0x037d
        L_0x02ba:
            boolean r4 = r10.s(r11, r2)
            if (r4 == 0) goto L_0x0395
            goto L_0x034a
        L_0x02c2:
            boolean r4 = r10.s(r11, r2)
            if (r4 == 0) goto L_0x0395
            int r4 = b.l.a.c.f.i.y7.j(r11, r8)
        L_0x02cc:
            int r5 = r7 << 3
            int r5 = b.l.a.c.f.i.y4.u(r5)
        L_0x02d2:
            int r4 = b.l.a.c.f.i.y4.u(r4)
            goto L_0x0358
        L_0x02d8:
            boolean r4 = r10.s(r11, r2)
            if (r4 == 0) goto L_0x0395
        L_0x02de:
            java.lang.Object r4 = b.l.a.c.f.i.y7.q(r11, r8)
            goto L_0x0305
        L_0x02e3:
            boolean r4 = r10.s(r11, r2)
            if (r4 == 0) goto L_0x0395
        L_0x02e9:
            java.lang.Object r4 = b.l.a.c.f.i.y7.q(r11, r8)
            b.l.a.c.f.i.a7 r5 = r10.L(r2)
            int r4 = b.l.a.c.f.i.c7.O(r7, r4, r5)
            goto L_0x0394
        L_0x02f7:
            boolean r4 = r10.s(r11, r2)
            if (r4 == 0) goto L_0x0395
            java.lang.Object r4 = b.l.a.c.f.i.y7.q(r11, r8)
            boolean r5 = r4 instanceof b.l.a.c.f.i.t4
            if (r5 == 0) goto L_0x031a
        L_0x0305:
            b.l.a.c.f.i.t4 r4 = (b.l.a.c.f.i.t4) r4
            int r5 = r7 << 3
            int r5 = b.l.a.c.f.i.y4.u(r5)
            int r4 = r4.l()
            int r6 = b.l.a.c.f.i.y4.u(r4)
            int r6 = r6 + r4
            int r6 = r6 + r5
        L_0x0317:
            int r3 = r3 + r6
            goto L_0x0395
        L_0x031a:
            java.lang.String r4 = (java.lang.String) r4
            int r5 = r7 << 3
            int r5 = b.l.a.c.f.i.y4.u(r5)
            int r4 = b.l.a.c.f.i.y4.w(r4)
            goto L_0x0358
        L_0x0327:
            boolean r4 = r10.s(r11, r2)
            if (r4 == 0) goto L_0x0395
        L_0x032d:
            int r4 = r7 << 3
            int r4 = b.l.a.c.f.i.y4.u(r4)
            int r4 = r4 + 1
            goto L_0x0394
        L_0x0336:
            boolean r4 = r10.s(r11, r2)
            if (r4 == 0) goto L_0x0395
            goto L_0x037d
        L_0x033d:
            boolean r4 = r10.s(r11, r2)
            if (r4 == 0) goto L_0x0395
            goto L_0x038c
        L_0x0344:
            boolean r4 = r10.s(r11, r2)
            if (r4 == 0) goto L_0x0395
        L_0x034a:
            int r4 = b.l.a.c.f.i.y7.j(r11, r8)
        L_0x034e:
            int r5 = r7 << 3
            int r5 = b.l.a.c.f.i.y4.u(r5)
            int r4 = b.l.a.c.f.i.y4.t(r4)
        L_0x0358:
            int r4 = r4 + r5
            goto L_0x0394
        L_0x035a:
            boolean r4 = r10.s(r11, r2)
            if (r4 == 0) goto L_0x0395
            goto L_0x0367
        L_0x0361:
            boolean r4 = r10.s(r11, r2)
            if (r4 == 0) goto L_0x0395
        L_0x0367:
            long r4 = b.l.a.c.f.i.y7.k(r11, r8)
        L_0x036b:
            int r6 = r7 << 3
            int r6 = b.l.a.c.f.i.y4.u(r6)
            int r4 = b.l.a.c.f.i.y4.v(r4)
            int r4 = r4 + r6
            goto L_0x0394
        L_0x0377:
            boolean r4 = r10.s(r11, r2)
            if (r4 == 0) goto L_0x0395
        L_0x037d:
            int r4 = r7 << 3
            int r4 = b.l.a.c.f.i.y4.u(r4)
            int r4 = r4 + 4
            goto L_0x0394
        L_0x0386:
            boolean r4 = r10.s(r11, r2)
            if (r4 == 0) goto L_0x0395
        L_0x038c:
            int r4 = r7 << 3
            int r4 = b.l.a.c.f.i.y4.u(r4)
            int r4 = r4 + 8
        L_0x0394:
            int r3 = r3 + r4
        L_0x0395:
            int r2 = r2 + 3
            goto L_0x0005
        L_0x0399:
            b.l.a.c.f.i.n7<?, ?> r0 = r10.f3726l
            java.lang.Object r11 = r0.d(r11)
            int r11 = r0.h(r11)
            int r11 = r11 + r3
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: b.l.a.c.f.i.s6.H(java.lang.Object):int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:164:0x02be, code lost:
        if (r7.f3616b != 0) goto L_0x02da;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x02c1, code lost:
        r4 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x02c2, code lost:
        r13.e(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x02c5, code lost:
        if (r1 >= r5) goto L_0x02dc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x02c7, code lost:
        r4 = b.l.a.c.b.a.R0(r3, r1, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:169:0x02cd, code lost:
        if (r2 == r7.a) goto L_0x02d0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:0x02d0, code lost:
        r1 = b.l.a.c.b.a.S1(r3, r4, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:171:0x02d8, code lost:
        if (r7.f3616b == 0) goto L_0x02c1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:172:0x02da, code lost:
        r4 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:173:0x02dc, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x0186, code lost:
        if (r4 == 0) goto L_0x01aa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x0189, code lost:
        r13.add(b.l.a.c.f.i.t4.H(r3, r1, r4));
        r1 = r1 + r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0191, code lost:
        if (r1 >= r5) goto L_0x01ba;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0193, code lost:
        r4 = b.l.a.c.b.a.R0(r3, r1, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x0199, code lost:
        if (r2 == r7.a) goto L_0x019c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x019c, code lost:
        r1 = b.l.a.c.b.a.R0(r3, r4, r7);
        r4 = r7.a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x01a2, code lost:
        if (r4 < 0) goto L_0x01b5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x01a6, code lost:
        if (r4 > (r3.length - r1)) goto L_0x01b0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x01a8, code lost:
        if (r4 != 0) goto L_0x0189;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x01aa, code lost:
        r13.add(b.l.a.c.f.i.t4.f3759i);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x01b4, code lost:
        throw b.l.a.c.f.i.y5.a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x01b9, code lost:
        throw b.l.a.c.f.i.y5.b();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x01ba, code lost:
        return r1;
     */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x0205  */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x024d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int I(T r18, byte[] r19, int r20, int r21, int r22, int r23, int r24, int r25, long r26, int r28, long r29, b.l.a.c.f.i.j4 r31) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r3 = r19
            r4 = r20
            r5 = r21
            r2 = r22
            r8 = r23
            r6 = r24
            r9 = r25
            r10 = r29
            r7 = r31
            sun.misc.Unsafe r12 = f3718p
            java.lang.Object r13 = r12.getObject(r1, r10)
            b.l.a.c.f.i.v5 r13 = (b.l.a.c.f.i.v5) r13
            boolean r14 = r13.a()
            if (r14 != 0) goto L_0x0035
            int r14 = r13.size()
            if (r14 != 0) goto L_0x002d
            r14 = 10
            goto L_0x002e
        L_0x002d:
            int r14 = r14 + r14
        L_0x002e:
            b.l.a.c.f.i.v5 r13 = r13.h(r14)
            r12.putObject(r1, r10, r13)
        L_0x0035:
            r10 = 5
            r11 = 2
            r14 = 0
            r12 = 1
            switch(r28) {
                case 18: goto L_0x03fd;
                case 19: goto L_0x03b2;
                case 20: goto L_0x037a;
                case 21: goto L_0x037a;
                case 22: goto L_0x035f;
                case 23: goto L_0x0320;
                case 24: goto L_0x02dd;
                case 25: goto L_0x028b;
                case 26: goto L_0x01e0;
                case 27: goto L_0x01c5;
                case 28: goto L_0x0178;
                case 29: goto L_0x035f;
                case 30: goto L_0x00da;
                case 31: goto L_0x02dd;
                case 32: goto L_0x0320;
                case 33: goto L_0x009a;
                case 34: goto L_0x005a;
                case 35: goto L_0x03fd;
                case 36: goto L_0x03b2;
                case 37: goto L_0x037a;
                case 38: goto L_0x037a;
                case 39: goto L_0x035f;
                case 40: goto L_0x0320;
                case 41: goto L_0x02dd;
                case 42: goto L_0x028b;
                case 43: goto L_0x035f;
                case 44: goto L_0x00da;
                case 45: goto L_0x02dd;
                case 46: goto L_0x0320;
                case 47: goto L_0x009a;
                case 48: goto L_0x005a;
                default: goto L_0x003d;
            }
        L_0x003d:
            r1 = 3
            if (r6 != r1) goto L_0x0465
            b.l.a.c.f.i.a7 r1 = r0.L(r9)
            r6 = r2 & -8
            r6 = r6 | 4
            r23 = r1
            r24 = r19
            r25 = r20
            r26 = r21
            r27 = r6
            r28 = r31
            int r4 = b.l.a.c.b.a.B2(r23, r24, r25, r26, r27, r28)
            goto L_0x0443
        L_0x005a:
            if (r6 != r11) goto L_0x007e
            b.l.a.c.f.i.g6 r13 = (b.l.a.c.f.i.g6) r13
            int r1 = b.l.a.c.b.a.R0(r3, r4, r7)
            int r2 = r7.a
            int r2 = r2 + r1
        L_0x0065:
            if (r1 >= r2) goto L_0x0075
            int r1 = b.l.a.c.b.a.S1(r3, r1, r7)
            long r4 = r7.f3616b
            long r4 = b.l.a.c.f.i.u4.b(r4)
            r13.n(r4)
            goto L_0x0065
        L_0x0075:
            if (r1 != r2) goto L_0x0079
            goto L_0x0466
        L_0x0079:
            b.l.a.c.f.i.y5 r1 = b.l.a.c.f.i.y5.a()
            throw r1
        L_0x007e:
            if (r6 != 0) goto L_0x0465
            b.l.a.c.f.i.g6 r13 = (b.l.a.c.f.i.g6) r13
        L_0x0082:
            int r1 = b.l.a.c.b.a.S1(r3, r4, r7)
            long r8 = r7.f3616b
            long r8 = b.l.a.c.f.i.u4.b(r8)
            r13.n(r8)
            if (r1 >= r5) goto L_0x0099
            int r4 = b.l.a.c.b.a.R0(r3, r1, r7)
            int r6 = r7.a
            if (r2 == r6) goto L_0x0082
        L_0x0099:
            return r1
        L_0x009a:
            if (r6 != r11) goto L_0x00be
            b.l.a.c.f.i.q5 r13 = (b.l.a.c.f.i.q5) r13
            int r1 = b.l.a.c.b.a.R0(r3, r4, r7)
            int r2 = r7.a
            int r2 = r2 + r1
        L_0x00a5:
            if (r1 >= r2) goto L_0x00b5
            int r1 = b.l.a.c.b.a.R0(r3, r1, r7)
            int r4 = r7.a
            int r4 = b.l.a.c.f.i.u4.a(r4)
            r13.n(r4)
            goto L_0x00a5
        L_0x00b5:
            if (r1 != r2) goto L_0x00b9
            goto L_0x0466
        L_0x00b9:
            b.l.a.c.f.i.y5 r1 = b.l.a.c.f.i.y5.a()
            throw r1
        L_0x00be:
            if (r6 != 0) goto L_0x0465
            b.l.a.c.f.i.q5 r13 = (b.l.a.c.f.i.q5) r13
        L_0x00c2:
            int r1 = b.l.a.c.b.a.R0(r3, r4, r7)
            int r4 = r7.a
            int r4 = b.l.a.c.f.i.u4.a(r4)
            r13.n(r4)
            if (r1 >= r5) goto L_0x00d9
            int r4 = b.l.a.c.b.a.R0(r3, r1, r7)
            int r6 = r7.a
            if (r2 == r6) goto L_0x00c2
        L_0x00d9:
            return r1
        L_0x00da:
            if (r6 != r11) goto L_0x00e1
            int r2 = b.l.a.c.b.a.F2(r3, r4, r13, r7)
            goto L_0x00f2
        L_0x00e1:
            if (r6 != 0) goto L_0x0465
            r2 = r22
            r3 = r19
            r4 = r20
            r5 = r21
            r6 = r13
            r7 = r31
            int r2 = b.l.a.c.b.a.D2(r2, r3, r4, r5, r6, r7)
        L_0x00f2:
            b.l.a.c.f.i.p5 r1 = (b.l.a.c.f.i.p5) r1
            b.l.a.c.f.i.o7 r3 = r1.zzc
            b.l.a.c.f.i.o7 r4 = b.l.a.c.f.i.o7.f
            if (r3 != r4) goto L_0x00fb
            r3 = 0
        L_0x00fb:
            b.l.a.c.f.i.s5 r4 = r0.N(r9)
            b.l.a.c.f.i.n7<?, ?> r5 = r0.f3726l
            java.lang.Class<?> r6 = b.l.a.c.f.i.c7.a
            if (r4 != 0) goto L_0x0106
            goto L_0x016e
        L_0x0106:
            boolean r6 = r13 instanceof java.util.RandomAccess
            if (r6 == 0) goto L_0x0146
            int r6 = r13.size()
            r7 = 0
            r12 = 0
        L_0x0110:
            if (r12 >= r6) goto L_0x013b
            java.lang.Object r9 = r13.get(r12)
            java.lang.Integer r9 = (java.lang.Integer) r9
            int r9 = r9.intValue()
            boolean r10 = r4.a(r9)
            if (r10 == 0) goto L_0x012e
            if (r12 == r7) goto L_0x012b
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r13.set(r7, r9)
        L_0x012b:
            int r7 = r7 + 1
            goto L_0x0138
        L_0x012e:
            if (r3 != 0) goto L_0x0134
            java.lang.Object r3 = r5.b()
        L_0x0134:
            long r9 = (long) r9
            r5.a(r3, r8, r9)
        L_0x0138:
            int r12 = r12 + 1
            goto L_0x0110
        L_0x013b:
            if (r7 != r6) goto L_0x013e
            goto L_0x016e
        L_0x013e:
            java.util.List r4 = r13.subList(r7, r6)
            r4.clear()
            goto L_0x016e
        L_0x0146:
            java.util.Iterator r6 = r13.iterator()
        L_0x014a:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L_0x016e
            java.lang.Object r7 = r6.next()
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            boolean r9 = r4.a(r7)
            if (r9 != 0) goto L_0x014a
            if (r3 != 0) goto L_0x0166
            java.lang.Object r3 = r5.b()
        L_0x0166:
            long r9 = (long) r7
            r5.a(r3, r8, r9)
            r6.remove()
            goto L_0x014a
        L_0x016e:
            if (r3 != 0) goto L_0x0173
            r1 = r2
            goto L_0x0466
        L_0x0173:
            b.l.a.c.f.i.o7 r3 = (b.l.a.c.f.i.o7) r3
            r1.zzc = r3
            return r2
        L_0x0178:
            if (r6 != r11) goto L_0x0465
            int r1 = b.l.a.c.b.a.R0(r3, r4, r7)
            int r4 = r7.a
            if (r4 < 0) goto L_0x01c0
            int r6 = r3.length
            int r6 = r6 - r1
            if (r4 > r6) goto L_0x01bb
            if (r4 != 0) goto L_0x0189
            goto L_0x01aa
        L_0x0189:
            b.l.a.c.f.i.t4 r6 = b.l.a.c.f.i.t4.H(r3, r1, r4)
            r13.add(r6)
            int r1 = r1 + r4
        L_0x0191:
            if (r1 >= r5) goto L_0x01ba
            int r4 = b.l.a.c.b.a.R0(r3, r1, r7)
            int r6 = r7.a
            if (r2 == r6) goto L_0x019c
            goto L_0x01ba
        L_0x019c:
            int r1 = b.l.a.c.b.a.R0(r3, r4, r7)
            int r4 = r7.a
            if (r4 < 0) goto L_0x01b5
            int r6 = r3.length
            int r6 = r6 - r1
            if (r4 > r6) goto L_0x01b0
            if (r4 != 0) goto L_0x0189
        L_0x01aa:
            b.l.a.c.f.i.t4 r4 = b.l.a.c.f.i.t4.f3759i
            r13.add(r4)
            goto L_0x0191
        L_0x01b0:
            b.l.a.c.f.i.y5 r1 = b.l.a.c.f.i.y5.a()
            throw r1
        L_0x01b5:
            b.l.a.c.f.i.y5 r1 = b.l.a.c.f.i.y5.b()
            throw r1
        L_0x01ba:
            return r1
        L_0x01bb:
            b.l.a.c.f.i.y5 r1 = b.l.a.c.f.i.y5.a()
            throw r1
        L_0x01c0:
            b.l.a.c.f.i.y5 r1 = b.l.a.c.f.i.y5.b()
            throw r1
        L_0x01c5:
            if (r6 == r11) goto L_0x01c9
            goto L_0x0465
        L_0x01c9:
            b.l.a.c.f.i.a7 r1 = r0.L(r9)
            r23 = r1
            r24 = r22
            r25 = r19
            r26 = r20
            r27 = r21
            r28 = r13
            r29 = r31
            int r1 = b.l.a.c.b.a.H2(r23, r24, r25, r26, r27, r28, r29)
            return r1
        L_0x01e0:
            if (r6 != r11) goto L_0x0465
            r8 = 536870912(0x20000000, double:2.652494739E-315)
            long r8 = r26 & r8
            int r1 = (r8 > r14 ? 1 : (r8 == r14 ? 0 : -1))
            java.lang.String r6 = ""
            if (r1 != 0) goto L_0x022d
            int r1 = b.l.a.c.b.a.R0(r3, r4, r7)
            int r4 = r7.a
            if (r4 < 0) goto L_0x0228
            if (r4 != 0) goto L_0x01f8
            goto L_0x0217
        L_0x01f8:
            java.lang.String r8 = new java.lang.String
            java.nio.charset.Charset r9 = b.l.a.c.f.i.w5.a
            r8.<init>(r3, r1, r4, r9)
        L_0x01ff:
            r13.add(r8)
            int r1 = r1 + r4
        L_0x0203:
            if (r1 >= r5) goto L_0x0466
            int r4 = b.l.a.c.b.a.R0(r3, r1, r7)
            int r8 = r7.a
            if (r2 != r8) goto L_0x0466
            int r1 = b.l.a.c.b.a.R0(r3, r4, r7)
            int r4 = r7.a
            if (r4 < 0) goto L_0x0223
            if (r4 != 0) goto L_0x021b
        L_0x0217:
            r13.add(r6)
            goto L_0x0203
        L_0x021b:
            java.lang.String r8 = new java.lang.String
            java.nio.charset.Charset r9 = b.l.a.c.f.i.w5.a
            r8.<init>(r3, r1, r4, r9)
            goto L_0x01ff
        L_0x0223:
            b.l.a.c.f.i.y5 r1 = b.l.a.c.f.i.y5.b()
            throw r1
        L_0x0228:
            b.l.a.c.f.i.y5 r1 = b.l.a.c.f.i.y5.b()
            throw r1
        L_0x022d:
            int r1 = b.l.a.c.b.a.R0(r3, r4, r7)
            int r4 = r7.a
            if (r4 < 0) goto L_0x0286
            if (r4 != 0) goto L_0x0239
        L_0x0237:
            r8 = r1
            goto L_0x0260
        L_0x0239:
            int r8 = r1 + r4
            boolean r9 = b.l.a.c.f.i.d8.a(r3, r1, r8)
            if (r9 == 0) goto L_0x0281
            java.lang.String r9 = new java.lang.String
            java.nio.charset.Charset r10 = b.l.a.c.f.i.w5.a
            r9.<init>(r3, r1, r4, r10)
        L_0x0248:
            r13.add(r9)
        L_0x024b:
            if (r8 >= r5) goto L_0x027e
            int r1 = b.l.a.c.b.a.R0(r3, r8, r7)
            int r4 = r7.a
            if (r2 != r4) goto L_0x027e
            int r1 = b.l.a.c.b.a.R0(r3, r1, r7)
            int r4 = r7.a
            if (r4 < 0) goto L_0x0279
            if (r4 != 0) goto L_0x0264
            goto L_0x0237
        L_0x0260:
            r13.add(r6)
            goto L_0x024b
        L_0x0264:
            int r8 = r1 + r4
            boolean r9 = b.l.a.c.f.i.d8.a(r3, r1, r8)
            if (r9 == 0) goto L_0x0274
            java.lang.String r9 = new java.lang.String
            java.nio.charset.Charset r10 = b.l.a.c.f.i.w5.a
            r9.<init>(r3, r1, r4, r10)
            goto L_0x0248
        L_0x0274:
            b.l.a.c.f.i.y5 r1 = b.l.a.c.f.i.y5.d()
            throw r1
        L_0x0279:
            b.l.a.c.f.i.y5 r1 = b.l.a.c.f.i.y5.b()
            throw r1
        L_0x027e:
            r1 = r8
            goto L_0x0466
        L_0x0281:
            b.l.a.c.f.i.y5 r1 = b.l.a.c.f.i.y5.d()
            throw r1
        L_0x0286:
            b.l.a.c.f.i.y5 r1 = b.l.a.c.f.i.y5.b()
            throw r1
        L_0x028b:
            if (r6 != r11) goto L_0x02b2
            b.l.a.c.f.i.k4 r13 = (b.l.a.c.f.i.k4) r13
            int r1 = b.l.a.c.b.a.R0(r3, r4, r7)
            int r2 = r7.a
            int r2 = r2 + r1
        L_0x0296:
            if (r1 >= r2) goto L_0x02a9
            int r1 = b.l.a.c.b.a.S1(r3, r1, r7)
            long r4 = r7.f3616b
            int r4 = (r4 > r14 ? 1 : (r4 == r14 ? 0 : -1))
            if (r4 == 0) goto L_0x02a4
            r4 = r12
            goto L_0x02a5
        L_0x02a4:
            r4 = 0
        L_0x02a5:
            r13.e(r4)
            goto L_0x0296
        L_0x02a9:
            if (r1 != r2) goto L_0x02ad
            goto L_0x0466
        L_0x02ad:
            b.l.a.c.f.i.y5 r1 = b.l.a.c.f.i.y5.a()
            throw r1
        L_0x02b2:
            if (r6 != 0) goto L_0x0465
            b.l.a.c.f.i.k4 r13 = (b.l.a.c.f.i.k4) r13
            int r1 = b.l.a.c.b.a.S1(r3, r4, r7)
            long r8 = r7.f3616b
            int r4 = (r8 > r14 ? 1 : (r8 == r14 ? 0 : -1))
            if (r4 == 0) goto L_0x02c1
            goto L_0x02da
        L_0x02c1:
            r4 = 0
        L_0x02c2:
            r13.e(r4)
            if (r1 >= r5) goto L_0x02dc
            int r4 = b.l.a.c.b.a.R0(r3, r1, r7)
            int r6 = r7.a
            if (r2 == r6) goto L_0x02d0
            goto L_0x02dc
        L_0x02d0:
            int r1 = b.l.a.c.b.a.S1(r3, r4, r7)
            long r8 = r7.f3616b
            int r4 = (r8 > r14 ? 1 : (r8 == r14 ? 0 : -1))
            if (r4 == 0) goto L_0x02c1
        L_0x02da:
            r4 = r12
            goto L_0x02c2
        L_0x02dc:
            return r1
        L_0x02dd:
            if (r6 != r11) goto L_0x02fd
            b.l.a.c.f.i.q5 r13 = (b.l.a.c.f.i.q5) r13
            int r1 = b.l.a.c.b.a.R0(r3, r4, r7)
            int r2 = r7.a
            int r2 = r2 + r1
        L_0x02e8:
            if (r1 >= r2) goto L_0x02f4
            int r4 = b.l.a.c.b.a.f2(r3, r1)
            r13.n(r4)
            int r1 = r1 + 4
            goto L_0x02e8
        L_0x02f4:
            if (r1 != r2) goto L_0x02f8
            goto L_0x0466
        L_0x02f8:
            b.l.a.c.f.i.y5 r1 = b.l.a.c.f.i.y5.a()
            throw r1
        L_0x02fd:
            if (r6 != r10) goto L_0x0465
            b.l.a.c.f.i.q5 r13 = (b.l.a.c.f.i.q5) r13
            int r1 = b.l.a.c.b.a.f2(r19, r20)
        L_0x0305:
            r13.n(r1)
            int r4 = r4 + 4
            if (r4 >= r5) goto L_0x031f
            int r1 = b.l.a.c.b.a.R0(r3, r4, r7)
            int r6 = r7.a
            if (r2 == r6) goto L_0x0315
            goto L_0x031f
        L_0x0315:
            int r4 = b.l.a.c.b.a.f2(r3, r1)
            r16 = r4
            r4 = r1
            r1 = r16
            goto L_0x0305
        L_0x031f:
            return r4
        L_0x0320:
            if (r6 != r11) goto L_0x0340
            b.l.a.c.f.i.g6 r13 = (b.l.a.c.f.i.g6) r13
            int r1 = b.l.a.c.b.a.R0(r3, r4, r7)
            int r2 = r7.a
            int r2 = r2 + r1
        L_0x032b:
            if (r1 >= r2) goto L_0x0337
            long r4 = b.l.a.c.b.a.l2(r3, r1)
            r13.n(r4)
            int r1 = r1 + 8
            goto L_0x032b
        L_0x0337:
            if (r1 != r2) goto L_0x033b
            goto L_0x0466
        L_0x033b:
            b.l.a.c.f.i.y5 r1 = b.l.a.c.f.i.y5.a()
            throw r1
        L_0x0340:
            if (r6 != r12) goto L_0x0465
            b.l.a.c.f.i.g6 r13 = (b.l.a.c.f.i.g6) r13
            long r8 = b.l.a.c.b.a.l2(r19, r20)
        L_0x0348:
            r13.n(r8)
            int r4 = r4 + 8
            if (r4 >= r5) goto L_0x035e
            int r1 = b.l.a.c.b.a.R0(r3, r4, r7)
            int r6 = r7.a
            if (r2 == r6) goto L_0x0358
            goto L_0x035e
        L_0x0358:
            long r8 = b.l.a.c.b.a.l2(r3, r1)
            r4 = r1
            goto L_0x0348
        L_0x035e:
            return r4
        L_0x035f:
            if (r6 != r11) goto L_0x0367
            int r1 = b.l.a.c.b.a.F2(r3, r4, r13, r7)
            goto L_0x0466
        L_0x0367:
            if (r6 == 0) goto L_0x036b
            goto L_0x0465
        L_0x036b:
            r23 = r19
            r24 = r20
            r25 = r21
            r26 = r13
            r27 = r31
            int r1 = b.l.a.c.b.a.D2(r22, r23, r24, r25, r26, r27)
            return r1
        L_0x037a:
            if (r6 != r11) goto L_0x039a
            b.l.a.c.f.i.g6 r13 = (b.l.a.c.f.i.g6) r13
            int r1 = b.l.a.c.b.a.R0(r3, r4, r7)
            int r2 = r7.a
            int r2 = r2 + r1
        L_0x0385:
            if (r1 >= r2) goto L_0x0391
            int r1 = b.l.a.c.b.a.S1(r3, r1, r7)
            long r4 = r7.f3616b
            r13.n(r4)
            goto L_0x0385
        L_0x0391:
            if (r1 != r2) goto L_0x0395
            goto L_0x0466
        L_0x0395:
            b.l.a.c.f.i.y5 r1 = b.l.a.c.f.i.y5.a()
            throw r1
        L_0x039a:
            if (r6 != 0) goto L_0x0465
            b.l.a.c.f.i.g6 r13 = (b.l.a.c.f.i.g6) r13
        L_0x039e:
            int r1 = b.l.a.c.b.a.S1(r3, r4, r7)
            long r8 = r7.f3616b
            r13.n(r8)
            if (r1 >= r5) goto L_0x03b1
            int r4 = b.l.a.c.b.a.R0(r3, r1, r7)
            int r6 = r7.a
            if (r2 == r6) goto L_0x039e
        L_0x03b1:
            return r1
        L_0x03b2:
            if (r6 != r11) goto L_0x03d6
            b.l.a.c.f.i.j5 r13 = (b.l.a.c.f.i.j5) r13
            int r1 = b.l.a.c.b.a.R0(r3, r4, r7)
            int r2 = r7.a
            int r2 = r2 + r1
        L_0x03bd:
            if (r1 >= r2) goto L_0x03cd
            int r4 = b.l.a.c.b.a.f2(r3, r1)
            float r4 = java.lang.Float.intBitsToFloat(r4)
            r13.e(r4)
            int r1 = r1 + 4
            goto L_0x03bd
        L_0x03cd:
            if (r1 != r2) goto L_0x03d1
            goto L_0x0466
        L_0x03d1:
            b.l.a.c.f.i.y5 r1 = b.l.a.c.f.i.y5.a()
            throw r1
        L_0x03d6:
            if (r6 != r10) goto L_0x0465
            b.l.a.c.f.i.j5 r13 = (b.l.a.c.f.i.j5) r13
            int r1 = b.l.a.c.b.a.f2(r19, r20)
        L_0x03de:
            float r1 = java.lang.Float.intBitsToFloat(r1)
            r13.e(r1)
            int r4 = r4 + 4
            if (r4 >= r5) goto L_0x03fc
            int r1 = b.l.a.c.b.a.R0(r3, r4, r7)
            int r6 = r7.a
            if (r2 == r6) goto L_0x03f2
            goto L_0x03fc
        L_0x03f2:
            int r4 = b.l.a.c.b.a.f2(r3, r1)
            r16 = r4
            r4 = r1
            r1 = r16
            goto L_0x03de
        L_0x03fc:
            return r4
        L_0x03fd:
            if (r6 != r11) goto L_0x0420
            b.l.a.c.f.i.a5 r13 = (b.l.a.c.f.i.a5) r13
            int r1 = b.l.a.c.b.a.R0(r3, r4, r7)
            int r2 = r7.a
            int r2 = r2 + r1
        L_0x0408:
            if (r1 >= r2) goto L_0x0418
            long r4 = b.l.a.c.b.a.l2(r3, r1)
            double r4 = java.lang.Double.longBitsToDouble(r4)
            r13.e(r4)
            int r1 = r1 + 8
            goto L_0x0408
        L_0x0418:
            if (r1 != r2) goto L_0x041b
            goto L_0x0466
        L_0x041b:
            b.l.a.c.f.i.y5 r1 = b.l.a.c.f.i.y5.a()
            throw r1
        L_0x0420:
            if (r6 != r12) goto L_0x0465
            b.l.a.c.f.i.a5 r13 = (b.l.a.c.f.i.a5) r13
            long r8 = b.l.a.c.b.a.l2(r19, r20)
        L_0x0428:
            double r8 = java.lang.Double.longBitsToDouble(r8)
            r13.e(r8)
            int r4 = r4 + 8
            if (r4 >= r5) goto L_0x0442
            int r1 = b.l.a.c.b.a.R0(r3, r4, r7)
            int r6 = r7.a
            if (r2 == r6) goto L_0x043c
            goto L_0x0442
        L_0x043c:
            long r8 = b.l.a.c.b.a.l2(r3, r1)
            r4 = r1
            goto L_0x0428
        L_0x0442:
            return r4
        L_0x0443:
            java.lang.Object r8 = r7.c
            r13.add(r8)
            if (r4 >= r5) goto L_0x0464
            int r8 = b.l.a.c.b.a.R0(r3, r4, r7)
            int r9 = r7.a
            if (r2 == r9) goto L_0x0453
            goto L_0x0464
        L_0x0453:
            r23 = r1
            r24 = r19
            r25 = r8
            r26 = r21
            r27 = r6
            r28 = r31
            int r4 = b.l.a.c.b.a.B2(r23, r24, r25, r26, r27, r28)
            goto L_0x0443
        L_0x0464:
            return r4
        L_0x0465:
            r1 = r4
        L_0x0466:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: b.l.a.c.f.i.s6.I(java.lang.Object, byte[], int, int, int, int, int, int, long, int, long, b.l.a.c.f.i.j4):int");
    }

    public final <K, V> int J(Object obj, byte[] bArr, int i2, int i3, int i4, long j2) {
        Unsafe unsafe = f3718p;
        Object M = M(i4);
        Object object = unsafe.getObject(obj, j2);
        if (!((l6) object).f3645h) {
            l6 l6Var = l6.f3644i;
            l6 l6Var2 = l6Var.isEmpty() ? new l6() : new l6(l6Var);
            m6.b(l6Var2, object);
            unsafe.putObject(obj, j2, l6Var2);
        }
        k6 k6Var = (k6) M;
        throw null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00c7, code lost:
        if (r15 == null) goto L_0x00db;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00ca, code lost:
        r3 = b.l.a.c.f.i.w5.c(r15, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00db, code lost:
        r12.putObject(r1, r9, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00fe, code lost:
        r12.putInt(r1, r13, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x014c, code lost:
        r3 = java.lang.Integer.valueOf(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x015a, code lost:
        r3 = java.lang.Long.valueOf(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x015e, code lost:
        r12.putObject(r1, r9, r3);
        r12.putInt(r1, r13, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0164, code lost:
        return r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:?, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:?, code lost:
        return r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x004e, code lost:
        if (r15 == null) goto L_0x00db;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int K(T r17, byte[] r18, int r19, int r20, int r21, int r22, int r23, int r24, int r25, long r26, int r28, b.l.a.c.f.i.j4 r29) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r3 = r18
            r4 = r19
            r2 = r21
            r8 = r22
            r5 = r23
            r9 = r26
            r6 = r28
            r11 = r29
            sun.misc.Unsafe r12 = f3718p
            int[] r7 = r0.a
            int r13 = r6 + 2
            r7 = r7[r13]
            r13 = 1048575(0xfffff, float:1.469367E-39)
            r7 = r7 & r13
            long r13 = (long) r7
            r7 = 2
            r15 = 5
            switch(r25) {
                case 51: goto L_0x017d;
                case 52: goto L_0x0165;
                case 53: goto L_0x0151;
                case 54: goto L_0x0151;
                case 55: goto L_0x0143;
                case 56: goto L_0x012e;
                case 57: goto L_0x0119;
                case 58: goto L_0x0103;
                case 59: goto L_0x00cf;
                case 60: goto L_0x00ad;
                case 61: goto L_0x00a1;
                case 62: goto L_0x0143;
                case 63: goto L_0x0072;
                case 64: goto L_0x0119;
                case 65: goto L_0x012e;
                case 66: goto L_0x0062;
                case 67: goto L_0x0052;
                case 68: goto L_0x0028;
                default: goto L_0x0026;
            }
        L_0x0026:
            goto L_0x0196
        L_0x0028:
            r7 = 3
            if (r5 != r7) goto L_0x0196
            b.l.a.c.f.i.a7 r5 = r0.L(r6)
            r2 = r2 & -8
            r6 = r2 | 4
            r2 = r5
            r3 = r18
            r4 = r19
            r5 = r20
            r7 = r29
            int r2 = b.l.a.c.b.a.B2(r2, r3, r4, r5, r6, r7)
            int r3 = r12.getInt(r1, r13)
            if (r3 != r8) goto L_0x004b
            java.lang.Object r15 = r12.getObject(r1, r9)
            goto L_0x004c
        L_0x004b:
            r15 = 0
        L_0x004c:
            java.lang.Object r3 = r11.c
            if (r15 != 0) goto L_0x00ca
            goto L_0x00db
        L_0x0052:
            if (r5 == 0) goto L_0x0056
            goto L_0x0196
        L_0x0056:
            int r2 = b.l.a.c.b.a.S1(r3, r4, r11)
            long r3 = r11.f3616b
            long r3 = b.l.a.c.f.i.u4.b(r3)
            goto L_0x015a
        L_0x0062:
            if (r5 == 0) goto L_0x0066
            goto L_0x0196
        L_0x0066:
            int r2 = b.l.a.c.b.a.R0(r3, r4, r11)
            int r3 = r11.a
            int r3 = b.l.a.c.f.i.u4.a(r3)
            goto L_0x014c
        L_0x0072:
            if (r5 != 0) goto L_0x0196
            int r3 = b.l.a.c.b.a.R0(r3, r4, r11)
            int r4 = r11.a
            b.l.a.c.f.i.s5 r5 = r0.N(r6)
            if (r5 == 0) goto L_0x0094
            boolean r5 = r5.a(r4)
            if (r5 == 0) goto L_0x0087
            goto L_0x0094
        L_0x0087:
            b.l.a.c.f.i.o7 r1 = z(r17)
            long r4 = (long) r4
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            r1.c(r2, r4)
            goto L_0x009e
        L_0x0094:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r4)
            r12.putObject(r1, r9, r2)
            r12.putInt(r1, r13, r8)
        L_0x009e:
            r2 = r3
            goto L_0x0197
        L_0x00a1:
            if (r5 == r7) goto L_0x00a5
            goto L_0x0196
        L_0x00a5:
            int r2 = b.l.a.c.b.a.x2(r3, r4, r11)
            java.lang.Object r3 = r11.c
            goto L_0x015e
        L_0x00ad:
            if (r5 != r7) goto L_0x0196
            b.l.a.c.f.i.a7 r2 = r0.L(r6)
            r5 = r20
            int r2 = b.l.a.c.b.a.z2(r2, r3, r4, r5, r11)
            int r3 = r12.getInt(r1, r13)
            if (r3 != r8) goto L_0x00c4
            java.lang.Object r15 = r12.getObject(r1, r9)
            goto L_0x00c5
        L_0x00c4:
            r15 = 0
        L_0x00c5:
            java.lang.Object r3 = r11.c
            if (r15 != 0) goto L_0x00ca
            goto L_0x00db
        L_0x00ca:
            java.lang.Object r3 = b.l.a.c.f.i.w5.c(r15, r3)
            goto L_0x00db
        L_0x00cf:
            if (r5 != r7) goto L_0x0196
            int r2 = b.l.a.c.b.a.R0(r3, r4, r11)
            int r4 = r11.a
            if (r4 != 0) goto L_0x00df
            java.lang.String r3 = ""
        L_0x00db:
            r12.putObject(r1, r9, r3)
            goto L_0x00fe
        L_0x00df:
            r5 = 536870912(0x20000000, float:1.0842022E-19)
            r5 = r24 & r5
            if (r5 == 0) goto L_0x00f3
            int r5 = r2 + r4
            boolean r5 = b.l.a.c.f.i.d8.a(r3, r2, r5)
            if (r5 == 0) goto L_0x00ee
            goto L_0x00f3
        L_0x00ee:
            b.l.a.c.f.i.y5 r1 = b.l.a.c.f.i.y5.d()
            throw r1
        L_0x00f3:
            java.lang.String r5 = new java.lang.String
            java.nio.charset.Charset r6 = b.l.a.c.f.i.w5.a
            r5.<init>(r3, r2, r4, r6)
            r12.putObject(r1, r9, r5)
            int r2 = r2 + r4
        L_0x00fe:
            r12.putInt(r1, r13, r8)
            goto L_0x0197
        L_0x0103:
            if (r5 != 0) goto L_0x0196
            int r2 = b.l.a.c.b.a.S1(r3, r4, r11)
            long r3 = r11.f3616b
            r5 = 0
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 == 0) goto L_0x0113
            r15 = 1
            goto L_0x0114
        L_0x0113:
            r15 = 0
        L_0x0114:
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r15)
            goto L_0x015e
        L_0x0119:
            if (r5 == r15) goto L_0x011d
            goto L_0x0196
        L_0x011d:
            int r2 = b.l.a.c.b.a.f2(r18, r19)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r12.putObject(r1, r9, r2)
            r12.putInt(r1, r13, r8)
            int r1 = r4 + 4
            return r1
        L_0x012e:
            r2 = 1
            if (r5 == r2) goto L_0x0132
            goto L_0x0196
        L_0x0132:
            long r2 = b.l.a.c.b.a.l2(r18, r19)
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r12.putObject(r1, r9, r2)
            r12.putInt(r1, r13, r8)
            int r1 = r4 + 8
            return r1
        L_0x0143:
            if (r5 == 0) goto L_0x0146
            goto L_0x0196
        L_0x0146:
            int r2 = b.l.a.c.b.a.R0(r3, r4, r11)
            int r3 = r11.a
        L_0x014c:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            goto L_0x015e
        L_0x0151:
            if (r5 == 0) goto L_0x0154
            goto L_0x0196
        L_0x0154:
            int r2 = b.l.a.c.b.a.S1(r3, r4, r11)
            long r3 = r11.f3616b
        L_0x015a:
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
        L_0x015e:
            r12.putObject(r1, r9, r3)
            r12.putInt(r1, r13, r8)
            return r2
        L_0x0165:
            if (r5 == r15) goto L_0x0168
            goto L_0x0196
        L_0x0168:
            int r2 = b.l.a.c.b.a.f2(r18, r19)
            float r2 = java.lang.Float.intBitsToFloat(r2)
            java.lang.Float r2 = java.lang.Float.valueOf(r2)
            r12.putObject(r1, r9, r2)
            r12.putInt(r1, r13, r8)
            int r1 = r4 + 4
            return r1
        L_0x017d:
            r2 = 1
            if (r5 == r2) goto L_0x0181
            goto L_0x0196
        L_0x0181:
            long r2 = b.l.a.c.b.a.l2(r18, r19)
            double r2 = java.lang.Double.longBitsToDouble(r2)
            java.lang.Double r2 = java.lang.Double.valueOf(r2)
            r12.putObject(r1, r9, r2)
            r12.putInt(r1, r13, r8)
            int r1 = r4 + 8
            return r1
        L_0x0196:
            r2 = r4
        L_0x0197:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: b.l.a.c.f.i.s6.K(java.lang.Object, byte[], int, int, int, int, int, int, int, long, int, b.l.a.c.f.i.j4):int");
    }

    public final a7 L(int i2) {
        int i3 = i2 / 3;
        int i4 = i3 + i3;
        Object[] objArr = this.f3719b;
        a7 a7Var = (a7) objArr[i4];
        if (a7Var != null) {
            return a7Var;
        }
        a7 a2 = x6.c.a((Class) objArr[i4 + 1]);
        this.f3719b[i4] = a2;
        return a2;
    }

    public final Object M(int i2) {
        int i3 = i2 / 3;
        return this.f3719b[i3 + i3];
    }

    public final s5 N(int i2) {
        int i3 = i2 / 3;
        return (s5) this.f3719b[i3 + i3 + 1];
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v7, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v2, resolved type: byte} */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x02ed, code lost:
        if (r0 != r3) goto L_0x033d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x033b, code lost:
        if (r0 != r14) goto L_0x033d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x033d, code lost:
        r5 = r15;
        r6 = r21;
        r2 = r22;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00c5, code lost:
        r0 = r23 | r22;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00f7, code lost:
        r9.putInt(r14, r7, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x010e, code lost:
        r10 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0110, code lost:
        r5 = r6;
        r22 = r13;
        r6 = r0;
        r0 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0131, code lost:
        r1 = r11.c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x013b, code lost:
        r10 = r34;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x015a, code lost:
        r9.putObject(r14, r7, r1);
        r4 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0160, code lost:
        r29 = r13;
        r13 = r4;
        r4 = r29;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x019b, code lost:
        r1 = r23 | r22;
        r2 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x01bf, code lost:
        r13 = r4;
        r4 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x0214, code lost:
        r13 = r0;
        r0 = r23 | r22;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x0218, code lost:
        r1 = r0;
        r0 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x021b, code lost:
        r3 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x0237, code lost:
        r2 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x0238, code lost:
        r5 = r6;
        r13 = r10;
        r7 = r21;
        r8 = 0;
        r10 = -1;
        r6 = r1;
        r1 = r19;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x0243, code lost:
        r2 = r3;
        r8 = r4;
        r15 = r6;
        r27 = r9;
        r6 = r23;
        r18 = 0;
        r28 = -1;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x005e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int O(T r31, byte[] r32, int r33, int r34, b.l.a.c.f.i.j4 r35) {
        /*
            r30 = this;
            r15 = r30
            r14 = r31
            r12 = r32
            r13 = r34
            r11 = r35
            sun.misc.Unsafe r9 = f3718p
            r10 = -1
            r8 = 0
            r7 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r33
            r5 = r7
            r2 = r8
            r6 = r2
            r1 = r10
        L_0x0017:
            if (r0 >= r13) goto L_0x0371
            int r3 = r0 + 1
            byte r0 = r12[r0]
            if (r0 >= 0) goto L_0x0029
            int r0 = b.l.a.c.b.a.x1(r0, r12, r3, r11)
            int r3 = r11.a
            r4 = r0
            r16 = r3
            goto L_0x002c
        L_0x0029:
            r16 = r0
            r4 = r3
        L_0x002c:
            int r3 = r16 >>> 3
            r0 = r16 & 7
            if (r3 <= r1) goto L_0x0041
            int r2 = r2 / 3
            int r1 = r15.c
            if (r3 < r1) goto L_0x004f
            int r1 = r15.d
            if (r3 > r1) goto L_0x004f
            int r1 = r15.w(r3, r2)
            goto L_0x004d
        L_0x0041:
            int r1 = r15.c
            if (r3 < r1) goto L_0x004f
            int r1 = r15.d
            if (r3 > r1) goto L_0x004f
            int r1 = r15.w(r3, r8)
        L_0x004d:
            r2 = r1
            goto L_0x0050
        L_0x004f:
            r2 = r10
        L_0x0050:
            if (r2 != r10) goto L_0x005e
            r19 = r3
            r2 = r4
            r15 = r5
            r18 = r8
            r27 = r9
            r28 = r10
            goto L_0x0348
        L_0x005e:
            int[] r1 = r15.a
            int r17 = r2 + 1
            r8 = r1[r17]
            int r10 = r8 >>> 20
            r10 = r10 & 255(0xff, float:3.57E-43)
            r33 = r3
            r3 = r8 & r7
            r20 = r8
            long r7 = (long) r3
            r3 = 17
            if (r10 > r3) goto L_0x0250
            int r3 = r2 + 2
            r1 = r1[r3]
            int r3 = r1 >>> 20
            r13 = 1
            int r22 = r13 << r3
            r3 = 1048575(0xfffff, float:1.469367E-39)
            r1 = r1 & r3
            r19 = r4
            if (r1 == r5) goto L_0x0099
            if (r5 == r3) goto L_0x008d
            long r3 = (long) r5
            r9.putInt(r14, r3, r6)
            r3 = 1048575(0xfffff, float:1.469367E-39)
        L_0x008d:
            if (r1 == r3) goto L_0x0095
            long r4 = (long) r1
            int r4 = r9.getInt(r14, r4)
            r6 = r4
        L_0x0095:
            r23 = r6
            r6 = r1
            goto L_0x009c
        L_0x0099:
            r23 = r6
            r6 = r5
        L_0x009c:
            r1 = 5
            switch(r10) {
                case 0: goto L_0x021d;
                case 1: goto L_0x01fa;
                case 2: goto L_0x01d9;
                case 3: goto L_0x01d9;
                case 4: goto L_0x01c4;
                case 5: goto L_0x01a0;
                case 6: goto L_0x0186;
                case 7: goto L_0x0167;
                case 8: goto L_0x013e;
                case 9: goto L_0x0117;
                case 10: goto L_0x00fb;
                case 11: goto L_0x01c4;
                case 12: goto L_0x00e8;
                case 13: goto L_0x0186;
                case 14: goto L_0x01a0;
                case 15: goto L_0x00d4;
                case 16: goto L_0x00ab;
                default: goto L_0x00a0;
            }
        L_0x00a0:
            r10 = r34
            r4 = r2
            r21 = r3
            r3 = r19
            r19 = r33
            goto L_0x0243
        L_0x00ab:
            if (r0 != 0) goto L_0x00c8
            r4 = r19
            int r10 = b.l.a.c.b.a.S1(r12, r4, r11)
            long r0 = r11.f3616b
            long r4 = b.l.a.c.f.i.u4.b(r0)
            r0 = r9
            r1 = r31
            r19 = r33
            r13 = r2
            r21 = r3
            r2 = r7
            r0.putLong(r1, r2, r4)
        L_0x00c5:
            r0 = r23 | r22
            goto L_0x0110
        L_0x00c8:
            r21 = r3
            r4 = r19
            r19 = r33
            r10 = r34
            r3 = r4
            r4 = r2
            goto L_0x0243
        L_0x00d4:
            r13 = r2
            r21 = r3
            r4 = r19
            r19 = r33
            if (r0 != 0) goto L_0x013b
            int r0 = b.l.a.c.b.a.R0(r12, r4, r11)
            int r1 = r11.a
            int r1 = b.l.a.c.f.i.u4.a(r1)
            goto L_0x00f7
        L_0x00e8:
            r13 = r2
            r21 = r3
            r4 = r19
            r19 = r33
            if (r0 != 0) goto L_0x013b
            int r0 = b.l.a.c.b.a.R0(r12, r4, r11)
            int r1 = r11.a
        L_0x00f7:
            r9.putInt(r14, r7, r1)
            goto L_0x010e
        L_0x00fb:
            r13 = r2
            r21 = r3
            r4 = r19
            r1 = 2
            r19 = r33
            if (r0 != r1) goto L_0x013b
            int r0 = b.l.a.c.b.a.x2(r12, r4, r11)
            java.lang.Object r1 = r11.c
            r9.putObject(r14, r7, r1)
        L_0x010e:
            r10 = r0
            goto L_0x00c5
        L_0x0110:
            r5 = r6
            r22 = r13
            r6 = r0
            r0 = r10
            goto L_0x0293
        L_0x0117:
            r13 = r2
            r21 = r3
            r4 = r19
            r1 = 2
            r19 = r33
            if (r0 != r1) goto L_0x013b
            b.l.a.c.f.i.a7 r0 = r15.L(r13)
            r10 = r34
            int r0 = b.l.a.c.b.a.z2(r0, r12, r4, r10, r11)
            java.lang.Object r1 = r9.getObject(r14, r7)
            if (r1 != 0) goto L_0x0134
        L_0x0131:
            java.lang.Object r1 = r11.c
            goto L_0x015a
        L_0x0134:
            java.lang.Object r2 = r11.c
            java.lang.Object r1 = b.l.a.c.f.i.w5.c(r1, r2)
            goto L_0x015a
        L_0x013b:
            r10 = r34
            goto L_0x0160
        L_0x013e:
            r10 = r34
            r13 = r2
            r21 = r3
            r4 = r19
            r1 = 2
            r19 = r33
            if (r0 != r1) goto L_0x0160
            r0 = 536870912(0x20000000, float:1.0842022E-19)
            r0 = r20 & r0
            if (r0 != 0) goto L_0x0155
            int r0 = b.l.a.c.b.a.o2(r12, r4, r11)
            goto L_0x0131
        L_0x0155:
            int r0 = b.l.a.c.b.a.s2(r12, r4, r11)
            goto L_0x0131
        L_0x015a:
            r9.putObject(r14, r7, r1)
            r4 = r13
            goto L_0x0214
        L_0x0160:
            r29 = r13
            r13 = r4
            r4 = r29
            goto L_0x021b
        L_0x0167:
            r10 = r34
            r5 = r2
            r21 = r3
            r4 = r19
            r19 = r33
            if (r0 != 0) goto L_0x01bf
            int r0 = b.l.a.c.b.a.S1(r12, r4, r11)
            long r1 = r11.f3616b
            r3 = 0
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 == 0) goto L_0x017f
            goto L_0x0180
        L_0x017f:
            r13 = 0
        L_0x0180:
            b.l.a.c.f.i.x7 r1 = b.l.a.c.f.i.y7.f3819e
            r1.d(r14, r7, r13)
            goto L_0x019b
        L_0x0186:
            r10 = r34
            r5 = r2
            r21 = r3
            r4 = r19
            r19 = r33
            if (r0 != r1) goto L_0x01bf
            int r0 = b.l.a.c.b.a.f2(r12, r4)
            r9.putInt(r14, r7, r0)
            int r4 = r4 + 4
            r0 = r4
        L_0x019b:
            r1 = r23 | r22
            r2 = r5
            goto L_0x0238
        L_0x01a0:
            r10 = r34
            r5 = r2
            r21 = r3
            r4 = r19
            r19 = r33
            if (r0 != r13) goto L_0x01bf
            long r24 = b.l.a.c.b.a.l2(r12, r4)
            r0 = r9
            r1 = r31
            r2 = r7
            r13 = r4
            r7 = r5
            r4 = r24
            r0.putLong(r1, r2, r4)
            int r0 = r13 + 8
            r4 = r7
            goto L_0x0214
        L_0x01bf:
            r13 = r4
            r7 = r5
            r4 = r7
            goto L_0x021b
        L_0x01c4:
            r10 = r34
            r4 = r2
            r21 = r3
            r13 = r19
            r19 = r33
            if (r0 != 0) goto L_0x021b
            int r0 = b.l.a.c.b.a.R0(r12, r13, r11)
            int r1 = r11.a
            r9.putInt(r14, r7, r1)
            goto L_0x0214
        L_0x01d9:
            r10 = r34
            r4 = r2
            r21 = r3
            r13 = r19
            r19 = r33
            if (r0 != 0) goto L_0x021b
            int r13 = b.l.a.c.b.a.S1(r12, r13, r11)
            long r2 = r11.f3616b
            r0 = r9
            r1 = r31
            r24 = r2
            r2 = r7
            r7 = r4
            r4 = r24
            r0.putLong(r1, r2, r4)
            r0 = r23 | r22
            r4 = r7
            goto L_0x0218
        L_0x01fa:
            r10 = r34
            r4 = r2
            r21 = r3
            r13 = r19
            r19 = r33
            if (r0 != r1) goto L_0x021b
            int r0 = b.l.a.c.b.a.f2(r12, r13)
            float r0 = java.lang.Float.intBitsToFloat(r0)
            b.l.a.c.f.i.x7 r1 = b.l.a.c.f.i.y7.f3819e
            r1.f(r14, r7, r0)
            int r0 = r13 + 4
        L_0x0214:
            r1 = r23 | r22
            r13 = r0
            r0 = r1
        L_0x0218:
            r1 = r0
            r0 = r13
            goto L_0x0237
        L_0x021b:
            r3 = r13
            goto L_0x0243
        L_0x021d:
            r10 = r34
            r4 = r2
            r21 = r3
            r3 = r19
            r19 = r33
            if (r0 != r13) goto L_0x0243
            long r0 = b.l.a.c.b.a.l2(r12, r3)
            double r0 = java.lang.Double.longBitsToDouble(r0)
            b.l.a.c.f.i.y7.p(r14, r7, r0)
            int r0 = r3 + 8
            r1 = r23 | r22
        L_0x0237:
            r2 = r4
        L_0x0238:
            r5 = r6
            r13 = r10
            r7 = r21
            r8 = 0
            r10 = -1
            r6 = r1
            r1 = r19
            goto L_0x0017
        L_0x0243:
            r2 = r3
            r8 = r4
            r15 = r6
            r27 = r9
            r6 = r23
            r18 = 0
            r28 = -1
            goto L_0x0348
        L_0x0250:
            r19 = r33
            r3 = r4
            r1 = 2
            r21 = 1048575(0xfffff, float:1.469367E-39)
            r4 = r2
            r2 = 27
            if (r10 != r2) goto L_0x02ad
            if (r0 != r1) goto L_0x029f
            java.lang.Object r0 = r9.getObject(r14, r7)
            b.l.a.c.f.i.v5 r0 = (b.l.a.c.f.i.v5) r0
            boolean r1 = r0.a()
            if (r1 != 0) goto L_0x027b
            int r1 = r0.size()
            if (r1 != 0) goto L_0x0273
            r1 = 10
            goto L_0x0274
        L_0x0273:
            int r1 = r1 + r1
        L_0x0274:
            b.l.a.c.f.i.v5 r0 = r0.h(r1)
            r9.putObject(r14, r7, r0)
        L_0x027b:
            r7 = r0
            b.l.a.c.f.i.a7 r0 = r15.L(r4)
            r1 = r16
            r2 = r32
            r22 = r4
            r4 = r34
            r13 = r5
            r5 = r7
            r7 = r6
            r6 = r35
            int r0 = b.l.a.c.b.a.H2(r0, r1, r2, r3, r4, r5, r6)
            r6 = r7
            r5 = r13
        L_0x0293:
            r13 = r34
            r1 = r19
            r7 = r21
            r2 = r22
            r8 = 0
            r10 = -1
            goto L_0x0017
        L_0x029f:
            r22 = r4
            r14 = r3
            r15 = r5
            r21 = r6
            r27 = r9
            r18 = 0
            r28 = -1
            goto L_0x030f
        L_0x02ad:
            r22 = r4
            r13 = r5
            r2 = 49
            if (r10 > r2) goto L_0x02f3
            r5 = r20
            long r4 = (long) r5
            r2 = r0
            r0 = r30
            r1 = r31
            r33 = r2
            r2 = r32
            r20 = r3
            r23 = r4
            r4 = r34
            r5 = r16
            r15 = r6
            r6 = r19
            r25 = r7
            r8 = r21
            r7 = r33
            r21 = r15
            r18 = 0
            r15 = r8
            r8 = r22
            r27 = r9
            r17 = r10
            r28 = -1
            r9 = r23
            r11 = r17
            r15 = r13
            r12 = r25
            r14 = r35
            int r0 = r0.I(r1, r2, r3, r4, r5, r6, r7, r8, r9, r11, r12, r14)
            r14 = r20
            if (r0 == r14) goto L_0x02f0
            goto L_0x033d
        L_0x02f0:
            r4 = r0
            goto L_0x0343
        L_0x02f3:
            r33 = r0
            r14 = r3
            r21 = r6
            r25 = r7
            r27 = r9
            r17 = r10
            r15 = r13
            r5 = r20
            r18 = 0
            r28 = -1
            r0 = 50
            r9 = r17
            r7 = r33
            if (r9 != r0) goto L_0x0323
            if (r7 == r1) goto L_0x0311
        L_0x030f:
            r4 = r14
            goto L_0x0343
        L_0x0311:
            r0 = r30
            r1 = r31
            r2 = r32
            r3 = r14
            r4 = r34
            r5 = r22
            r6 = r25
            r0.J(r1, r2, r3, r4, r5, r6)
            r0 = 0
            throw r0
        L_0x0323:
            r0 = r30
            r1 = r31
            r2 = r32
            r3 = r14
            r4 = r34
            r8 = r5
            r5 = r16
            r6 = r19
            r10 = r25
            r12 = r22
            r13 = r35
            int r0 = r0.K(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r12, r13)
            if (r0 == r14) goto L_0x02f0
        L_0x033d:
            r5 = r15
            r6 = r21
            r2 = r22
            goto L_0x035a
        L_0x0343:
            r2 = r4
            r6 = r21
            r8 = r22
        L_0x0348:
            b.l.a.c.f.i.o7 r4 = z(r31)
            r0 = r16
            r1 = r32
            r3 = r34
            r5 = r35
            int r0 = b.l.a.c.b.a.J2(r0, r1, r2, r3, r4, r5)
            r2 = r8
            r5 = r15
        L_0x035a:
            r15 = r30
            r14 = r31
            r12 = r32
            r13 = r34
            r11 = r35
            r8 = r18
            r1 = r19
            r9 = r27
            r10 = r28
            r7 = 1048575(0xfffff, float:1.469367E-39)
            goto L_0x0017
        L_0x0371:
            r15 = r5
            r21 = r6
            r1 = r7
            r27 = r9
            if (r15 == r1) goto L_0x0383
            long r1 = (long) r15
            r3 = r31
            r6 = r21
            r4 = r27
            r4.putInt(r3, r1, r6)
        L_0x0383:
            r1 = r34
            if (r0 != r1) goto L_0x0388
            return r0
        L_0x0388:
            b.l.a.c.f.i.y5 r0 = b.l.a.c.f.i.y5.c()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: b.l.a.c.f.i.s6.O(java.lang.Object, byte[], int, int, b.l.a.c.f.i.j4):int");
    }

    public final T a() {
        return ((p5) this.f3720e).r(4, (Object) null, (Object) null);
    }

    public final boolean b(T t) {
        int i2;
        int i3;
        T t2 = t;
        int i4 = 0;
        int i5 = 0;
        int i6 = 1048575;
        while (i5 < this.f3723i) {
            int i7 = this.f3722h[i5];
            int i8 = this.a[i7];
            int j2 = j(i7);
            int i9 = this.a[i7 + 2];
            int i10 = i9 & 1048575;
            int i11 = 1 << (i9 >>> 20);
            if (i10 != i6) {
                if (i10 != 1048575) {
                    i4 = f3718p.getInt(t2, (long) i10);
                }
                i2 = i4;
                i3 = i10;
            } else {
                i3 = i6;
                i2 = i4;
            }
            if ((268435456 & j2) != 0 && !r(t, i7, i3, i2, i11)) {
                return false;
            }
            int i12 = (j2 >>> 20) & 255;
            if (i12 != 9 && i12 != 17) {
                if (i12 != 27) {
                    if (i12 == 60 || i12 == 68) {
                        if (u(t2, i8, i7) && !L(i7).b(y7.q(t2, (long) (j2 & 1048575)))) {
                            return false;
                        }
                    } else if (i12 != 49) {
                        if (i12 == 50 && !((l6) y7.q(t2, (long) (j2 & 1048575))).isEmpty()) {
                            k6 k6Var = (k6) M(i7);
                            throw null;
                        }
                    }
                }
                List list = (List) y7.q(t2, (long) (j2 & 1048575));
                if (!list.isEmpty()) {
                    a7 L = L(i7);
                    for (int i13 = 0; i13 < list.size(); i13++) {
                        if (!L.b(list.get(i13))) {
                            return false;
                        }
                    }
                    continue;
                } else {
                    continue;
                }
            } else if (r(t, i7, i3, i2, i11) && !L(i7).b(y7.q(t2, (long) (j2 & 1048575)))) {
                return false;
            }
            i5++;
            i6 = i3;
            i4 = i2;
        }
        if (!this.f) {
            return true;
        }
        this.f3727m.b(t2);
        throw null;
    }

    public final int c(T t) {
        return this.f3721g ? H(t) : G(t);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0031, code lost:
        b.l.a.c.f.i.y7.f3819e.s(r7, r2, b.l.a.c.f.i.y7.q(r8, r2));
        v(r7, r4, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0099, code lost:
        b.l.a.c.f.i.y7.f3819e.s(r7, r2, b.l.a.c.f.i.y7.q(r8, r2));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00c7, code lost:
        b.l.a.c.f.i.y7.f3819e.o(r7, r2, b.l.a.c.f.i.y7.j(r8, r2));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00de, code lost:
        b.l.a.c.f.i.y7.l(r7, r2, b.l.a.c.f.i.y7.k(r8, r2));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0103, code lost:
        t(r7, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0106, code lost:
        r0 = r0 + 3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void d(T r7, T r8) {
        /*
            r6 = this;
            java.util.Objects.requireNonNull(r8)
            r0 = 0
        L_0x0004:
            int[] r1 = r6.a
            int r1 = r1.length
            if (r0 >= r1) goto L_0x010a
            int r1 = r6.j(r0)
            r2 = 1048575(0xfffff, float:1.469367E-39)
            r2 = r2 & r1
            long r2 = (long) r2
            int[] r4 = r6.a
            r4 = r4[r0]
            int r1 = r1 >>> 20
            r1 = r1 & 255(0xff, float:3.57E-43)
            switch(r1) {
                case 0: goto L_0x00f6;
                case 1: goto L_0x00e6;
                case 2: goto L_0x00d8;
                case 3: goto L_0x00d1;
                case 4: goto L_0x00c1;
                case 5: goto L_0x00ba;
                case 6: goto L_0x00b3;
                case 7: goto L_0x00a3;
                case 8: goto L_0x0093;
                case 9: goto L_0x008e;
                case 10: goto L_0x0087;
                case 11: goto L_0x0080;
                case 12: goto L_0x0079;
                case 13: goto L_0x0072;
                case 14: goto L_0x006a;
                case 15: goto L_0x0063;
                case 16: goto L_0x005b;
                case 17: goto L_0x008e;
                case 18: goto L_0x0054;
                case 19: goto L_0x0054;
                case 20: goto L_0x0054;
                case 21: goto L_0x0054;
                case 22: goto L_0x0054;
                case 23: goto L_0x0054;
                case 24: goto L_0x0054;
                case 25: goto L_0x0054;
                case 26: goto L_0x0054;
                case 27: goto L_0x0054;
                case 28: goto L_0x0054;
                case 29: goto L_0x0054;
                case 30: goto L_0x0054;
                case 31: goto L_0x0054;
                case 32: goto L_0x0054;
                case 33: goto L_0x0054;
                case 34: goto L_0x0054;
                case 35: goto L_0x0054;
                case 36: goto L_0x0054;
                case 37: goto L_0x0054;
                case 38: goto L_0x0054;
                case 39: goto L_0x0054;
                case 40: goto L_0x0054;
                case 41: goto L_0x0054;
                case 42: goto L_0x0054;
                case 43: goto L_0x0054;
                case 44: goto L_0x0054;
                case 45: goto L_0x0054;
                case 46: goto L_0x0054;
                case 47: goto L_0x0054;
                case 48: goto L_0x0054;
                case 49: goto L_0x0054;
                case 50: goto L_0x003f;
                case 51: goto L_0x002b;
                case 52: goto L_0x002b;
                case 53: goto L_0x002b;
                case 54: goto L_0x002b;
                case 55: goto L_0x002b;
                case 56: goto L_0x002b;
                case 57: goto L_0x002b;
                case 58: goto L_0x002b;
                case 59: goto L_0x002b;
                case 60: goto L_0x0026;
                case 61: goto L_0x001f;
                case 62: goto L_0x001f;
                case 63: goto L_0x001f;
                case 64: goto L_0x001f;
                case 65: goto L_0x001f;
                case 66: goto L_0x001f;
                case 67: goto L_0x001f;
                case 68: goto L_0x0026;
                default: goto L_0x001d;
            }
        L_0x001d:
            goto L_0x0106
        L_0x001f:
            boolean r1 = r6.u(r8, r4, r0)
            if (r1 == 0) goto L_0x0106
            goto L_0x0031
        L_0x0026:
            r6.F(r7, r8, r0)
            goto L_0x0106
        L_0x002b:
            boolean r1 = r6.u(r8, r4, r0)
            if (r1 == 0) goto L_0x0106
        L_0x0031:
            java.lang.Object r1 = b.l.a.c.f.i.y7.q(r8, r2)
            b.l.a.c.f.i.x7 r5 = b.l.a.c.f.i.y7.f3819e
            r5.s(r7, r2, r1)
            r6.v(r7, r4, r0)
            goto L_0x0106
        L_0x003f:
            java.lang.Class<?> r1 = b.l.a.c.f.i.c7.a
            java.lang.Object r1 = b.l.a.c.f.i.y7.q(r7, r2)
            java.lang.Object r4 = b.l.a.c.f.i.y7.q(r8, r2)
            java.lang.Object r1 = b.l.a.c.f.i.m6.b(r1, r4)
            b.l.a.c.f.i.x7 r4 = b.l.a.c.f.i.y7.f3819e
            r4.s(r7, r2, r1)
            goto L_0x0106
        L_0x0054:
            b.l.a.c.f.i.f6 r1 = r6.f3725k
            r1.b(r7, r8, r2)
            goto L_0x0106
        L_0x005b:
            boolean r1 = r6.s(r8, r0)
            if (r1 == 0) goto L_0x0106
            goto L_0x00de
        L_0x0063:
            boolean r1 = r6.s(r8, r0)
            if (r1 == 0) goto L_0x0106
            goto L_0x00c7
        L_0x006a:
            boolean r1 = r6.s(r8, r0)
            if (r1 == 0) goto L_0x0106
            goto L_0x00de
        L_0x0072:
            boolean r1 = r6.s(r8, r0)
            if (r1 == 0) goto L_0x0106
            goto L_0x00c7
        L_0x0079:
            boolean r1 = r6.s(r8, r0)
            if (r1 == 0) goto L_0x0106
            goto L_0x00c7
        L_0x0080:
            boolean r1 = r6.s(r8, r0)
            if (r1 == 0) goto L_0x0106
            goto L_0x00c7
        L_0x0087:
            boolean r1 = r6.s(r8, r0)
            if (r1 == 0) goto L_0x0106
            goto L_0x0099
        L_0x008e:
            r6.E(r7, r8, r0)
            goto L_0x0106
        L_0x0093:
            boolean r1 = r6.s(r8, r0)
            if (r1 == 0) goto L_0x0106
        L_0x0099:
            java.lang.Object r1 = b.l.a.c.f.i.y7.q(r8, r2)
            b.l.a.c.f.i.x7 r4 = b.l.a.c.f.i.y7.f3819e
            r4.s(r7, r2, r1)
            goto L_0x0103
        L_0x00a3:
            boolean r1 = r6.s(r8, r0)
            if (r1 == 0) goto L_0x0106
            boolean r1 = b.l.a.c.f.i.y7.m(r8, r2)
            b.l.a.c.f.i.x7 r4 = b.l.a.c.f.i.y7.f3819e
            r4.d(r7, r2, r1)
            goto L_0x0103
        L_0x00b3:
            boolean r1 = r6.s(r8, r0)
            if (r1 == 0) goto L_0x0106
            goto L_0x00c7
        L_0x00ba:
            boolean r1 = r6.s(r8, r0)
            if (r1 == 0) goto L_0x0106
            goto L_0x00de
        L_0x00c1:
            boolean r1 = r6.s(r8, r0)
            if (r1 == 0) goto L_0x0106
        L_0x00c7:
            int r1 = b.l.a.c.f.i.y7.j(r8, r2)
            b.l.a.c.f.i.x7 r4 = b.l.a.c.f.i.y7.f3819e
            r4.o(r7, r2, r1)
            goto L_0x0103
        L_0x00d1:
            boolean r1 = r6.s(r8, r0)
            if (r1 == 0) goto L_0x0106
            goto L_0x00de
        L_0x00d8:
            boolean r1 = r6.s(r8, r0)
            if (r1 == 0) goto L_0x0106
        L_0x00de:
            long r4 = b.l.a.c.f.i.y7.k(r8, r2)
            b.l.a.c.f.i.y7.l(r7, r2, r4)
            goto L_0x0103
        L_0x00e6:
            boolean r1 = r6.s(r8, r0)
            if (r1 == 0) goto L_0x0106
            float r1 = b.l.a.c.f.i.y7.n(r8, r2)
            b.l.a.c.f.i.x7 r4 = b.l.a.c.f.i.y7.f3819e
            r4.f(r7, r2, r1)
            goto L_0x0103
        L_0x00f6:
            boolean r1 = r6.s(r8, r0)
            if (r1 == 0) goto L_0x0106
            double r4 = b.l.a.c.f.i.y7.o(r8, r2)
            b.l.a.c.f.i.y7.p(r7, r2, r4)
        L_0x0103:
            r6.t(r7, r0)
        L_0x0106:
            int r0 = r0 + 3
            goto L_0x0004
        L_0x010a:
            b.l.a.c.f.i.n7<?, ?> r0 = r6.f3726l
            java.lang.Class<?> r1 = b.l.a.c.f.i.c7.a
            java.lang.Object r1 = r0.d(r7)
            java.lang.Object r2 = r0.d(r8)
            java.lang.Object r1 = r0.f(r1, r2)
            r0.c(r7, r1)
            boolean r7 = r6.f
            if (r7 != 0) goto L_0x0122
            return
        L_0x0122:
            b.l.a.c.f.i.d5<?> r7 = r6.f3727m
            r7.b(r8)
            r7 = 0
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: b.l.a.c.f.i.s6.d(java.lang.Object, java.lang.Object):void");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x008d, code lost:
        r2 = r2 * 53;
        r3 = n(r9, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00a2, code lost:
        r2 = r2 * 53;
        r3 = o(r9, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00c8, code lost:
        if (r3 != null) goto L_0x00dc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00cb, code lost:
        r2 = r2 * 53;
        r3 = b.l.a.c.f.i.y7.q(r9, r5).hashCode();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00da, code lost:
        if (r3 != null) goto L_0x00dc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00dc, code lost:
        r7 = r3.hashCode();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00e0, code lost:
        r2 = (r2 * 53) + r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00e4, code lost:
        r2 = r2 * 53;
        r3 = ((java.lang.String) b.l.a.c.f.i.y7.q(r9, r5)).hashCode();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00f7, code lost:
        r3 = b.l.a.c.f.i.w5.b(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0110, code lost:
        r3 = java.lang.Float.floatToIntBits(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x011b, code lost:
        r3 = java.lang.Double.doubleToLongBits(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x011f, code lost:
        r3 = b.l.a.c.f.i.w5.a(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0123, code lost:
        r2 = r3 + r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0125, code lost:
        r1 = r1 + 3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int e(T r9) {
        /*
            r8 = this;
            int[] r0 = r8.a
            int r0 = r0.length
            r1 = 0
            r2 = r1
        L_0x0005:
            if (r1 >= r0) goto L_0x0129
            int r3 = r8.j(r1)
            int[] r4 = r8.a
            r4 = r4[r1]
            r5 = 1048575(0xfffff, float:1.469367E-39)
            r5 = r5 & r3
            long r5 = (long) r5
            int r3 = r3 >>> 20
            r3 = r3 & 255(0xff, float:3.57E-43)
            r7 = 37
            switch(r3) {
                case 0: goto L_0x0115;
                case 1: goto L_0x010a;
                case 2: goto L_0x0103;
                case 3: goto L_0x0103;
                case 4: goto L_0x00fc;
                case 5: goto L_0x0103;
                case 6: goto L_0x00fc;
                case 7: goto L_0x00f1;
                case 8: goto L_0x00e4;
                case 9: goto L_0x00d6;
                case 10: goto L_0x00cb;
                case 11: goto L_0x00fc;
                case 12: goto L_0x00fc;
                case 13: goto L_0x00fc;
                case 14: goto L_0x0103;
                case 15: goto L_0x00fc;
                case 16: goto L_0x0103;
                case 17: goto L_0x00c4;
                case 18: goto L_0x00cb;
                case 19: goto L_0x00cb;
                case 20: goto L_0x00cb;
                case 21: goto L_0x00cb;
                case 22: goto L_0x00cb;
                case 23: goto L_0x00cb;
                case 24: goto L_0x00cb;
                case 25: goto L_0x00cb;
                case 26: goto L_0x00cb;
                case 27: goto L_0x00cb;
                case 28: goto L_0x00cb;
                case 29: goto L_0x00cb;
                case 30: goto L_0x00cb;
                case 31: goto L_0x00cb;
                case 32: goto L_0x00cb;
                case 33: goto L_0x00cb;
                case 34: goto L_0x00cb;
                case 35: goto L_0x00cb;
                case 36: goto L_0x00cb;
                case 37: goto L_0x00cb;
                case 38: goto L_0x00cb;
                case 39: goto L_0x00cb;
                case 40: goto L_0x00cb;
                case 41: goto L_0x00cb;
                case 42: goto L_0x00cb;
                case 43: goto L_0x00cb;
                case 44: goto L_0x00cb;
                case 45: goto L_0x00cb;
                case 46: goto L_0x00cb;
                case 47: goto L_0x00cb;
                case 48: goto L_0x00cb;
                case 49: goto L_0x00cb;
                case 50: goto L_0x00cb;
                case 51: goto L_0x00b7;
                case 52: goto L_0x00aa;
                case 53: goto L_0x009c;
                case 54: goto L_0x0095;
                case 55: goto L_0x0087;
                case 56: goto L_0x0080;
                case 57: goto L_0x0079;
                case 58: goto L_0x006b;
                case 59: goto L_0x0063;
                case 60: goto L_0x005b;
                case 61: goto L_0x0053;
                case 62: goto L_0x004c;
                case 63: goto L_0x0045;
                case 64: goto L_0x003e;
                case 65: goto L_0x0036;
                case 66: goto L_0x002f;
                case 67: goto L_0x0027;
                case 68: goto L_0x001f;
                default: goto L_0x001d;
            }
        L_0x001d:
            goto L_0x0125
        L_0x001f:
            boolean r3 = r8.u(r9, r4, r1)
            if (r3 == 0) goto L_0x0125
            goto L_0x00cb
        L_0x0027:
            boolean r3 = r8.u(r9, r4, r1)
            if (r3 == 0) goto L_0x0125
            goto L_0x00a2
        L_0x002f:
            boolean r3 = r8.u(r9, r4, r1)
            if (r3 == 0) goto L_0x0125
            goto L_0x008d
        L_0x0036:
            boolean r3 = r8.u(r9, r4, r1)
            if (r3 == 0) goto L_0x0125
            goto L_0x00a2
        L_0x003e:
            boolean r3 = r8.u(r9, r4, r1)
            if (r3 == 0) goto L_0x0125
            goto L_0x008d
        L_0x0045:
            boolean r3 = r8.u(r9, r4, r1)
            if (r3 == 0) goto L_0x0125
            goto L_0x008d
        L_0x004c:
            boolean r3 = r8.u(r9, r4, r1)
            if (r3 == 0) goto L_0x0125
            goto L_0x008d
        L_0x0053:
            boolean r3 = r8.u(r9, r4, r1)
            if (r3 == 0) goto L_0x0125
            goto L_0x00cb
        L_0x005b:
            boolean r3 = r8.u(r9, r4, r1)
            if (r3 == 0) goto L_0x0125
            goto L_0x00cb
        L_0x0063:
            boolean r3 = r8.u(r9, r4, r1)
            if (r3 == 0) goto L_0x0125
            goto L_0x00e4
        L_0x006b:
            boolean r3 = r8.u(r9, r4, r1)
            if (r3 == 0) goto L_0x0125
            int r2 = r2 * 53
            boolean r3 = p(r9, r5)
            goto L_0x00f7
        L_0x0079:
            boolean r3 = r8.u(r9, r4, r1)
            if (r3 == 0) goto L_0x0125
            goto L_0x008d
        L_0x0080:
            boolean r3 = r8.u(r9, r4, r1)
            if (r3 == 0) goto L_0x0125
            goto L_0x00a2
        L_0x0087:
            boolean r3 = r8.u(r9, r4, r1)
            if (r3 == 0) goto L_0x0125
        L_0x008d:
            int r2 = r2 * 53
            int r3 = n(r9, r5)
            goto L_0x0123
        L_0x0095:
            boolean r3 = r8.u(r9, r4, r1)
            if (r3 == 0) goto L_0x0125
            goto L_0x00a2
        L_0x009c:
            boolean r3 = r8.u(r9, r4, r1)
            if (r3 == 0) goto L_0x0125
        L_0x00a2:
            int r2 = r2 * 53
            long r3 = o(r9, r5)
            goto L_0x011f
        L_0x00aa:
            boolean r3 = r8.u(r9, r4, r1)
            if (r3 == 0) goto L_0x0125
            int r2 = r2 * 53
            float r3 = m(r9, r5)
            goto L_0x0110
        L_0x00b7:
            boolean r3 = r8.u(r9, r4, r1)
            if (r3 == 0) goto L_0x0125
            int r2 = r2 * 53
            double r3 = l(r9, r5)
            goto L_0x011b
        L_0x00c4:
            java.lang.Object r3 = b.l.a.c.f.i.y7.q(r9, r5)
            if (r3 == 0) goto L_0x00e0
            goto L_0x00dc
        L_0x00cb:
            int r2 = r2 * 53
            java.lang.Object r3 = b.l.a.c.f.i.y7.q(r9, r5)
            int r3 = r3.hashCode()
            goto L_0x0123
        L_0x00d6:
            java.lang.Object r3 = b.l.a.c.f.i.y7.q(r9, r5)
            if (r3 == 0) goto L_0x00e0
        L_0x00dc:
            int r7 = r3.hashCode()
        L_0x00e0:
            int r2 = r2 * 53
            int r2 = r2 + r7
            goto L_0x0125
        L_0x00e4:
            int r2 = r2 * 53
            java.lang.Object r3 = b.l.a.c.f.i.y7.q(r9, r5)
            java.lang.String r3 = (java.lang.String) r3
            int r3 = r3.hashCode()
            goto L_0x0123
        L_0x00f1:
            int r2 = r2 * 53
            boolean r3 = b.l.a.c.f.i.y7.m(r9, r5)
        L_0x00f7:
            int r3 = b.l.a.c.f.i.w5.b(r3)
            goto L_0x0123
        L_0x00fc:
            int r2 = r2 * 53
            int r3 = b.l.a.c.f.i.y7.j(r9, r5)
            goto L_0x0123
        L_0x0103:
            int r2 = r2 * 53
            long r3 = b.l.a.c.f.i.y7.k(r9, r5)
            goto L_0x011f
        L_0x010a:
            int r2 = r2 * 53
            float r3 = b.l.a.c.f.i.y7.n(r9, r5)
        L_0x0110:
            int r3 = java.lang.Float.floatToIntBits(r3)
            goto L_0x0123
        L_0x0115:
            int r2 = r2 * 53
            double r3 = b.l.a.c.f.i.y7.o(r9, r5)
        L_0x011b:
            long r3 = java.lang.Double.doubleToLongBits(r3)
        L_0x011f:
            int r3 = b.l.a.c.f.i.w5.a(r3)
        L_0x0123:
            int r3 = r3 + r2
            r2 = r3
        L_0x0125:
            int r1 = r1 + 3
            goto L_0x0005
        L_0x0129:
            int r2 = r2 * 53
            b.l.a.c.f.i.n7<?, ?> r0 = r8.f3726l
            java.lang.Object r0 = r0.d(r9)
            int r0 = r0.hashCode()
            int r0 = r0 + r2
            boolean r1 = r8.f
            if (r1 != 0) goto L_0x013b
            return r0
        L_0x013b:
            b.l.a.c.f.i.d5<?> r0 = r8.f3727m
            r0.b(r9)
            r9 = 0
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: b.l.a.c.f.i.s6.e(java.lang.Object):int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:83:0x01b6, code lost:
        r2 = r2 + 3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean f(T r9, T r10) {
        /*
            r8 = this;
            int[] r0 = r8.a
            int r0 = r0.length
            r1 = 0
            r2 = r1
        L_0x0005:
            if (r2 >= r0) goto L_0x01ba
            int r3 = r8.j(r2)
            r4 = 1048575(0xfffff, float:1.469367E-39)
            r5 = r3 & r4
            long r5 = (long) r5
            int r3 = r3 >>> 20
            r3 = r3 & 255(0xff, float:3.57E-43)
            switch(r3) {
                case 0: goto L_0x019a;
                case 1: goto L_0x0181;
                case 2: goto L_0x016e;
                case 3: goto L_0x015b;
                case 4: goto L_0x014a;
                case 5: goto L_0x0136;
                case 6: goto L_0x0124;
                case 7: goto L_0x0112;
                case 8: goto L_0x00fc;
                case 9: goto L_0x00e6;
                case 10: goto L_0x00d0;
                case 11: goto L_0x00be;
                case 12: goto L_0x00ac;
                case 13: goto L_0x009a;
                case 14: goto L_0x0086;
                case 15: goto L_0x0074;
                case 16: goto L_0x0060;
                case 17: goto L_0x004a;
                case 18: goto L_0x003a;
                case 19: goto L_0x003a;
                case 20: goto L_0x003a;
                case 21: goto L_0x003a;
                case 22: goto L_0x003a;
                case 23: goto L_0x003a;
                case 24: goto L_0x003a;
                case 25: goto L_0x003a;
                case 26: goto L_0x003a;
                case 27: goto L_0x003a;
                case 28: goto L_0x003a;
                case 29: goto L_0x003a;
                case 30: goto L_0x003a;
                case 31: goto L_0x003a;
                case 32: goto L_0x003a;
                case 33: goto L_0x003a;
                case 34: goto L_0x003a;
                case 35: goto L_0x003a;
                case 36: goto L_0x003a;
                case 37: goto L_0x003a;
                case 38: goto L_0x003a;
                case 39: goto L_0x003a;
                case 40: goto L_0x003a;
                case 41: goto L_0x003a;
                case 42: goto L_0x003a;
                case 43: goto L_0x003a;
                case 44: goto L_0x003a;
                case 45: goto L_0x003a;
                case 46: goto L_0x003a;
                case 47: goto L_0x003a;
                case 48: goto L_0x003a;
                case 49: goto L_0x003a;
                case 50: goto L_0x003a;
                case 51: goto L_0x001a;
                case 52: goto L_0x001a;
                case 53: goto L_0x001a;
                case 54: goto L_0x001a;
                case 55: goto L_0x001a;
                case 56: goto L_0x001a;
                case 57: goto L_0x001a;
                case 58: goto L_0x001a;
                case 59: goto L_0x001a;
                case 60: goto L_0x001a;
                case 61: goto L_0x001a;
                case 62: goto L_0x001a;
                case 63: goto L_0x001a;
                case 64: goto L_0x001a;
                case 65: goto L_0x001a;
                case 66: goto L_0x001a;
                case 67: goto L_0x001a;
                case 68: goto L_0x001a;
                default: goto L_0x0018;
            }
        L_0x0018:
            goto L_0x01b6
        L_0x001a:
            int r3 = r8.k(r2)
            r3 = r3 & r4
            long r3 = (long) r3
            int r7 = b.l.a.c.f.i.y7.j(r9, r3)
            int r3 = b.l.a.c.f.i.y7.j(r10, r3)
            if (r7 != r3) goto L_0x01b5
            java.lang.Object r3 = b.l.a.c.f.i.y7.q(r9, r5)
            java.lang.Object r4 = b.l.a.c.f.i.y7.q(r10, r5)
            boolean r3 = b.l.a.c.f.i.c7.a(r3, r4)
            if (r3 != 0) goto L_0x01b6
            goto L_0x01b5
        L_0x003a:
            java.lang.Object r3 = b.l.a.c.f.i.y7.q(r9, r5)
            java.lang.Object r4 = b.l.a.c.f.i.y7.q(r10, r5)
            boolean r3 = b.l.a.c.f.i.c7.a(r3, r4)
            if (r3 != 0) goto L_0x01b6
            goto L_0x01b5
        L_0x004a:
            boolean r3 = r8.q(r9, r10, r2)
            if (r3 == 0) goto L_0x01b5
            java.lang.Object r3 = b.l.a.c.f.i.y7.q(r9, r5)
            java.lang.Object r4 = b.l.a.c.f.i.y7.q(r10, r5)
            boolean r3 = b.l.a.c.f.i.c7.a(r3, r4)
            if (r3 == 0) goto L_0x01b5
            goto L_0x01b6
        L_0x0060:
            boolean r3 = r8.q(r9, r10, r2)
            if (r3 == 0) goto L_0x01b5
            long r3 = b.l.a.c.f.i.y7.k(r9, r5)
            long r5 = b.l.a.c.f.i.y7.k(r10, r5)
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 != 0) goto L_0x01b5
            goto L_0x01b6
        L_0x0074:
            boolean r3 = r8.q(r9, r10, r2)
            if (r3 == 0) goto L_0x01b5
            int r3 = b.l.a.c.f.i.y7.j(r9, r5)
            int r4 = b.l.a.c.f.i.y7.j(r10, r5)
            if (r3 != r4) goto L_0x01b5
            goto L_0x01b6
        L_0x0086:
            boolean r3 = r8.q(r9, r10, r2)
            if (r3 == 0) goto L_0x01b5
            long r3 = b.l.a.c.f.i.y7.k(r9, r5)
            long r5 = b.l.a.c.f.i.y7.k(r10, r5)
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 != 0) goto L_0x01b5
            goto L_0x01b6
        L_0x009a:
            boolean r3 = r8.q(r9, r10, r2)
            if (r3 == 0) goto L_0x01b5
            int r3 = b.l.a.c.f.i.y7.j(r9, r5)
            int r4 = b.l.a.c.f.i.y7.j(r10, r5)
            if (r3 != r4) goto L_0x01b5
            goto L_0x01b6
        L_0x00ac:
            boolean r3 = r8.q(r9, r10, r2)
            if (r3 == 0) goto L_0x01b5
            int r3 = b.l.a.c.f.i.y7.j(r9, r5)
            int r4 = b.l.a.c.f.i.y7.j(r10, r5)
            if (r3 != r4) goto L_0x01b5
            goto L_0x01b6
        L_0x00be:
            boolean r3 = r8.q(r9, r10, r2)
            if (r3 == 0) goto L_0x01b5
            int r3 = b.l.a.c.f.i.y7.j(r9, r5)
            int r4 = b.l.a.c.f.i.y7.j(r10, r5)
            if (r3 != r4) goto L_0x01b5
            goto L_0x01b6
        L_0x00d0:
            boolean r3 = r8.q(r9, r10, r2)
            if (r3 == 0) goto L_0x01b5
            java.lang.Object r3 = b.l.a.c.f.i.y7.q(r9, r5)
            java.lang.Object r4 = b.l.a.c.f.i.y7.q(r10, r5)
            boolean r3 = b.l.a.c.f.i.c7.a(r3, r4)
            if (r3 == 0) goto L_0x01b5
            goto L_0x01b6
        L_0x00e6:
            boolean r3 = r8.q(r9, r10, r2)
            if (r3 == 0) goto L_0x01b5
            java.lang.Object r3 = b.l.a.c.f.i.y7.q(r9, r5)
            java.lang.Object r4 = b.l.a.c.f.i.y7.q(r10, r5)
            boolean r3 = b.l.a.c.f.i.c7.a(r3, r4)
            if (r3 == 0) goto L_0x01b5
            goto L_0x01b6
        L_0x00fc:
            boolean r3 = r8.q(r9, r10, r2)
            if (r3 == 0) goto L_0x01b5
            java.lang.Object r3 = b.l.a.c.f.i.y7.q(r9, r5)
            java.lang.Object r4 = b.l.a.c.f.i.y7.q(r10, r5)
            boolean r3 = b.l.a.c.f.i.c7.a(r3, r4)
            if (r3 == 0) goto L_0x01b5
            goto L_0x01b6
        L_0x0112:
            boolean r3 = r8.q(r9, r10, r2)
            if (r3 == 0) goto L_0x01b5
            boolean r3 = b.l.a.c.f.i.y7.m(r9, r5)
            boolean r4 = b.l.a.c.f.i.y7.m(r10, r5)
            if (r3 != r4) goto L_0x01b5
            goto L_0x01b6
        L_0x0124:
            boolean r3 = r8.q(r9, r10, r2)
            if (r3 == 0) goto L_0x01b5
            int r3 = b.l.a.c.f.i.y7.j(r9, r5)
            int r4 = b.l.a.c.f.i.y7.j(r10, r5)
            if (r3 != r4) goto L_0x01b5
            goto L_0x01b6
        L_0x0136:
            boolean r3 = r8.q(r9, r10, r2)
            if (r3 == 0) goto L_0x01b5
            long r3 = b.l.a.c.f.i.y7.k(r9, r5)
            long r5 = b.l.a.c.f.i.y7.k(r10, r5)
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 != 0) goto L_0x01b5
            goto L_0x01b6
        L_0x014a:
            boolean r3 = r8.q(r9, r10, r2)
            if (r3 == 0) goto L_0x01b5
            int r3 = b.l.a.c.f.i.y7.j(r9, r5)
            int r4 = b.l.a.c.f.i.y7.j(r10, r5)
            if (r3 != r4) goto L_0x01b5
            goto L_0x01b6
        L_0x015b:
            boolean r3 = r8.q(r9, r10, r2)
            if (r3 == 0) goto L_0x01b5
            long r3 = b.l.a.c.f.i.y7.k(r9, r5)
            long r5 = b.l.a.c.f.i.y7.k(r10, r5)
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 != 0) goto L_0x01b5
            goto L_0x01b6
        L_0x016e:
            boolean r3 = r8.q(r9, r10, r2)
            if (r3 == 0) goto L_0x01b5
            long r3 = b.l.a.c.f.i.y7.k(r9, r5)
            long r5 = b.l.a.c.f.i.y7.k(r10, r5)
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 != 0) goto L_0x01b5
            goto L_0x01b6
        L_0x0181:
            boolean r3 = r8.q(r9, r10, r2)
            if (r3 == 0) goto L_0x01b5
            float r3 = b.l.a.c.f.i.y7.n(r9, r5)
            int r3 = java.lang.Float.floatToIntBits(r3)
            float r4 = b.l.a.c.f.i.y7.n(r10, r5)
            int r4 = java.lang.Float.floatToIntBits(r4)
            if (r3 != r4) goto L_0x01b5
            goto L_0x01b6
        L_0x019a:
            boolean r3 = r8.q(r9, r10, r2)
            if (r3 == 0) goto L_0x01b5
            double r3 = b.l.a.c.f.i.y7.o(r9, r5)
            long r3 = java.lang.Double.doubleToLongBits(r3)
            double r5 = b.l.a.c.f.i.y7.o(r10, r5)
            long r5 = java.lang.Double.doubleToLongBits(r5)
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 != 0) goto L_0x01b5
            goto L_0x01b6
        L_0x01b5:
            return r1
        L_0x01b6:
            int r2 = r2 + 3
            goto L_0x0005
        L_0x01ba:
            b.l.a.c.f.i.n7<?, ?> r0 = r8.f3726l
            java.lang.Object r0 = r0.d(r9)
            b.l.a.c.f.i.n7<?, ?> r2 = r8.f3726l
            java.lang.Object r2 = r2.d(r10)
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x01cd
            return r1
        L_0x01cd:
            boolean r0 = r8.f
            if (r0 != 0) goto L_0x01d3
            r9 = 1
            return r9
        L_0x01d3:
            b.l.a.c.f.i.d5<?> r0 = r8.f3727m
            r0.b(r9)
            b.l.a.c.f.i.d5<?> r9 = r8.f3727m
            r9.b(r10)
            r9 = 0
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: b.l.a.c.f.i.s6.f(java.lang.Object, java.lang.Object):boolean");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:100:0x0323, code lost:
        r12.d(r6, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x0334, code lost:
        r12.c(r6, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x0345, code lost:
        r12.a.i(r6, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x0358, code lost:
        r12.a.g(r6, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x036b, code lost:
        r12.a.e(r6, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x037e, code lost:
        r12.a.f(r6, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x038b, code lost:
        r12.a.l(r6, (b.l.a.c.f.i.t4) b.l.a.c.f.i.y7.q(r11, (long) (r4 & 1048575)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x03a0, code lost:
        r12.e(r6, b.l.a.c.f.i.y7.q(r11, (long) (r4 & 1048575)), L(r3));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x03b5, code lost:
        y(r6, b.l.a.c.f.i.y7.q(r11, (long) (r4 & 1048575)), r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x03cc, code lost:
        r12.a.j(r6, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x03df, code lost:
        r12.a.g(r6, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x03f1, code lost:
        r12.a.i(r6, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x0403, code lost:
        r12.a.e(r6, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x0415, code lost:
        r12.a.h(r6, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x0427, code lost:
        r12.a.h(r6, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x0439, code lost:
        r12.a(r6, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x0449, code lost:
        r12.b(r6, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x0308, code lost:
        r12.f(r6, b.l.a.c.f.i.y7.q(r11, (long) (r4 & 1048575)), L(r3));
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void g(T r11, b.l.a.c.f.i.z4 r12) {
        /*
            r10 = this;
            boolean r0 = r10.f3721g
            if (r0 == 0) goto L_0x0460
            boolean r0 = r10.f
            r1 = 0
            if (r0 != 0) goto L_0x045a
            int[] r0 = r10.a
            int r0 = r0.length
            r2 = 0
            r3 = r2
        L_0x000e:
            if (r3 >= r0) goto L_0x0450
            int r4 = r10.j(r3)
            int[] r5 = r10.a
            r6 = r5[r3]
            int r7 = r4 >>> 20
            r7 = r7 & 255(0xff, float:3.57E-43)
            r8 = 1
            r9 = 1048575(0xfffff, float:1.469367E-39)
            switch(r7) {
                case 0: goto L_0x043d;
                case 1: goto L_0x042d;
                case 2: goto L_0x041b;
                case 3: goto L_0x0409;
                case 4: goto L_0x03f7;
                case 5: goto L_0x03e5;
                case 6: goto L_0x03d3;
                case 7: goto L_0x03c0;
                case 8: goto L_0x03af;
                case 9: goto L_0x039a;
                case 10: goto L_0x0385;
                case 11: goto L_0x0372;
                case 12: goto L_0x035f;
                case 13: goto L_0x034c;
                case 14: goto L_0x0339;
                case 15: goto L_0x0328;
                case 16: goto L_0x0317;
                case 17: goto L_0x0302;
                case 18: goto L_0x02f3;
                case 19: goto L_0x02e4;
                case 20: goto L_0x02d5;
                case 21: goto L_0x02c6;
                case 22: goto L_0x02b7;
                case 23: goto L_0x02a8;
                case 24: goto L_0x0299;
                case 25: goto L_0x028a;
                case 26: goto L_0x027b;
                case 27: goto L_0x0268;
                case 28: goto L_0x0259;
                case 29: goto L_0x024a;
                case 30: goto L_0x023b;
                case 31: goto L_0x022c;
                case 32: goto L_0x021d;
                case 33: goto L_0x020e;
                case 34: goto L_0x01ff;
                case 35: goto L_0x01f0;
                case 36: goto L_0x01e1;
                case 37: goto L_0x01d2;
                case 38: goto L_0x01c3;
                case 39: goto L_0x01b4;
                case 40: goto L_0x01a5;
                case 41: goto L_0x0196;
                case 42: goto L_0x0187;
                case 43: goto L_0x0178;
                case 44: goto L_0x0169;
                case 45: goto L_0x015a;
                case 46: goto L_0x014b;
                case 47: goto L_0x013c;
                case 48: goto L_0x012d;
                case 49: goto L_0x011a;
                case 50: goto L_0x0109;
                case 51: goto L_0x00fb;
                case 52: goto L_0x00ed;
                case 53: goto L_0x00df;
                case 54: goto L_0x00d1;
                case 55: goto L_0x00c3;
                case 56: goto L_0x00b5;
                case 57: goto L_0x00a7;
                case 58: goto L_0x0099;
                case 59: goto L_0x0091;
                case 60: goto L_0x0089;
                case 61: goto L_0x0081;
                case 62: goto L_0x0073;
                case 63: goto L_0x0065;
                case 64: goto L_0x0057;
                case 65: goto L_0x0049;
                case 66: goto L_0x003b;
                case 67: goto L_0x002d;
                case 68: goto L_0x0025;
                default: goto L_0x0023;
            }
        L_0x0023:
            goto L_0x044c
        L_0x0025:
            boolean r5 = r10.u(r11, r6, r3)
            if (r5 == 0) goto L_0x044c
            goto L_0x0308
        L_0x002d:
            boolean r5 = r10.u(r11, r6, r3)
            if (r5 == 0) goto L_0x044c
            r4 = r4 & r9
            long r4 = (long) r4
            long r4 = o(r11, r4)
            goto L_0x0323
        L_0x003b:
            boolean r5 = r10.u(r11, r6, r3)
            if (r5 == 0) goto L_0x044c
            r4 = r4 & r9
            long r4 = (long) r4
            int r4 = n(r11, r4)
            goto L_0x0334
        L_0x0049:
            boolean r5 = r10.u(r11, r6, r3)
            if (r5 == 0) goto L_0x044c
            r4 = r4 & r9
            long r4 = (long) r4
            long r4 = o(r11, r4)
            goto L_0x0345
        L_0x0057:
            boolean r5 = r10.u(r11, r6, r3)
            if (r5 == 0) goto L_0x044c
            r4 = r4 & r9
            long r4 = (long) r4
            int r4 = n(r11, r4)
            goto L_0x0358
        L_0x0065:
            boolean r5 = r10.u(r11, r6, r3)
            if (r5 == 0) goto L_0x044c
            r4 = r4 & r9
            long r4 = (long) r4
            int r4 = n(r11, r4)
            goto L_0x036b
        L_0x0073:
            boolean r5 = r10.u(r11, r6, r3)
            if (r5 == 0) goto L_0x044c
            r4 = r4 & r9
            long r4 = (long) r4
            int r4 = n(r11, r4)
            goto L_0x037e
        L_0x0081:
            boolean r5 = r10.u(r11, r6, r3)
            if (r5 == 0) goto L_0x044c
            goto L_0x038b
        L_0x0089:
            boolean r5 = r10.u(r11, r6, r3)
            if (r5 == 0) goto L_0x044c
            goto L_0x03a0
        L_0x0091:
            boolean r5 = r10.u(r11, r6, r3)
            if (r5 == 0) goto L_0x044c
            goto L_0x03b5
        L_0x0099:
            boolean r5 = r10.u(r11, r6, r3)
            if (r5 == 0) goto L_0x044c
            r4 = r4 & r9
            long r4 = (long) r4
            boolean r4 = p(r11, r4)
            goto L_0x03cc
        L_0x00a7:
            boolean r5 = r10.u(r11, r6, r3)
            if (r5 == 0) goto L_0x044c
            r4 = r4 & r9
            long r4 = (long) r4
            int r4 = n(r11, r4)
            goto L_0x03df
        L_0x00b5:
            boolean r5 = r10.u(r11, r6, r3)
            if (r5 == 0) goto L_0x044c
            r4 = r4 & r9
            long r4 = (long) r4
            long r4 = o(r11, r4)
            goto L_0x03f1
        L_0x00c3:
            boolean r5 = r10.u(r11, r6, r3)
            if (r5 == 0) goto L_0x044c
            r4 = r4 & r9
            long r4 = (long) r4
            int r4 = n(r11, r4)
            goto L_0x0403
        L_0x00d1:
            boolean r5 = r10.u(r11, r6, r3)
            if (r5 == 0) goto L_0x044c
            r4 = r4 & r9
            long r4 = (long) r4
            long r4 = o(r11, r4)
            goto L_0x0415
        L_0x00df:
            boolean r5 = r10.u(r11, r6, r3)
            if (r5 == 0) goto L_0x044c
            r4 = r4 & r9
            long r4 = (long) r4
            long r4 = o(r11, r4)
            goto L_0x0427
        L_0x00ed:
            boolean r5 = r10.u(r11, r6, r3)
            if (r5 == 0) goto L_0x044c
            r4 = r4 & r9
            long r4 = (long) r4
            float r4 = m(r11, r4)
            goto L_0x0439
        L_0x00fb:
            boolean r5 = r10.u(r11, r6, r3)
            if (r5 == 0) goto L_0x044c
            r4 = r4 & r9
            long r4 = (long) r4
            double r4 = l(r11, r4)
            goto L_0x0449
        L_0x0109:
            r4 = r4 & r9
            long r4 = (long) r4
            java.lang.Object r4 = b.l.a.c.f.i.y7.q(r11, r4)
            if (r4 != 0) goto L_0x0113
            goto L_0x044c
        L_0x0113:
            java.lang.Object r11 = r10.M(r3)
            b.l.a.c.f.i.k6 r11 = (b.l.a.c.f.i.k6) r11
            throw r1
        L_0x011a:
            r5 = r5[r3]
            r4 = r4 & r9
            long r6 = (long) r4
            java.lang.Object r4 = b.l.a.c.f.i.y7.q(r11, r6)
            java.util.List r4 = (java.util.List) r4
            b.l.a.c.f.i.a7 r6 = r10.L(r3)
            b.l.a.c.f.i.c7.s(r5, r4, r12, r6)
            goto L_0x044c
        L_0x012d:
            r5 = r5[r3]
            r4 = r4 & r9
            long r6 = (long) r4
            java.lang.Object r4 = b.l.a.c.f.i.y7.q(r11, r6)
            java.util.List r4 = (java.util.List) r4
            b.l.a.c.f.i.c7.f(r5, r4, r12, r8)
            goto L_0x044c
        L_0x013c:
            r5 = r5[r3]
            r4 = r4 & r9
            long r6 = (long) r4
            java.lang.Object r4 = b.l.a.c.f.i.y7.q(r11, r6)
            java.util.List r4 = (java.util.List) r4
            b.l.a.c.f.i.c7.k(r5, r4, r12, r8)
            goto L_0x044c
        L_0x014b:
            r5 = r5[r3]
            r4 = r4 & r9
            long r6 = (long) r4
            java.lang.Object r4 = b.l.a.c.f.i.y7.q(r11, r6)
            java.util.List r4 = (java.util.List) r4
            b.l.a.c.f.i.c7.h(r5, r4, r12, r8)
            goto L_0x044c
        L_0x015a:
            r5 = r5[r3]
            r4 = r4 & r9
            long r6 = (long) r4
            java.lang.Object r4 = b.l.a.c.f.i.y7.q(r11, r6)
            java.util.List r4 = (java.util.List) r4
            b.l.a.c.f.i.c7.m(r5, r4, r12, r8)
            goto L_0x044c
        L_0x0169:
            r5 = r5[r3]
            r4 = r4 & r9
            long r6 = (long) r4
            java.lang.Object r4 = b.l.a.c.f.i.y7.q(r11, r6)
            java.util.List r4 = (java.util.List) r4
            b.l.a.c.f.i.c7.n(r5, r4, r12, r8)
            goto L_0x044c
        L_0x0178:
            r5 = r5[r3]
            r4 = r4 & r9
            long r6 = (long) r4
            java.lang.Object r4 = b.l.a.c.f.i.y7.q(r11, r6)
            java.util.List r4 = (java.util.List) r4
            b.l.a.c.f.i.c7.j(r5, r4, r12, r8)
            goto L_0x044c
        L_0x0187:
            r5 = r5[r3]
            r4 = r4 & r9
            long r6 = (long) r4
            java.lang.Object r4 = b.l.a.c.f.i.y7.q(r11, r6)
            java.util.List r4 = (java.util.List) r4
            b.l.a.c.f.i.c7.o(r5, r4, r12, r8)
            goto L_0x044c
        L_0x0196:
            r5 = r5[r3]
            r4 = r4 & r9
            long r6 = (long) r4
            java.lang.Object r4 = b.l.a.c.f.i.y7.q(r11, r6)
            java.util.List r4 = (java.util.List) r4
            b.l.a.c.f.i.c7.l(r5, r4, r12, r8)
            goto L_0x044c
        L_0x01a5:
            r5 = r5[r3]
            r4 = r4 & r9
            long r6 = (long) r4
            java.lang.Object r4 = b.l.a.c.f.i.y7.q(r11, r6)
            java.util.List r4 = (java.util.List) r4
            b.l.a.c.f.i.c7.g(r5, r4, r12, r8)
            goto L_0x044c
        L_0x01b4:
            r5 = r5[r3]
            r4 = r4 & r9
            long r6 = (long) r4
            java.lang.Object r4 = b.l.a.c.f.i.y7.q(r11, r6)
            java.util.List r4 = (java.util.List) r4
            b.l.a.c.f.i.c7.i(r5, r4, r12, r8)
            goto L_0x044c
        L_0x01c3:
            r5 = r5[r3]
            r4 = r4 & r9
            long r6 = (long) r4
            java.lang.Object r4 = b.l.a.c.f.i.y7.q(r11, r6)
            java.util.List r4 = (java.util.List) r4
            b.l.a.c.f.i.c7.e(r5, r4, r12, r8)
            goto L_0x044c
        L_0x01d2:
            r5 = r5[r3]
            r4 = r4 & r9
            long r6 = (long) r4
            java.lang.Object r4 = b.l.a.c.f.i.y7.q(r11, r6)
            java.util.List r4 = (java.util.List) r4
            b.l.a.c.f.i.c7.d(r5, r4, r12, r8)
            goto L_0x044c
        L_0x01e1:
            r5 = r5[r3]
            r4 = r4 & r9
            long r6 = (long) r4
            java.lang.Object r4 = b.l.a.c.f.i.y7.q(r11, r6)
            java.util.List r4 = (java.util.List) r4
            b.l.a.c.f.i.c7.c(r5, r4, r12, r8)
            goto L_0x044c
        L_0x01f0:
            r5 = r5[r3]
            r4 = r4 & r9
            long r6 = (long) r4
            java.lang.Object r4 = b.l.a.c.f.i.y7.q(r11, r6)
            java.util.List r4 = (java.util.List) r4
            b.l.a.c.f.i.c7.b(r5, r4, r12, r8)
            goto L_0x044c
        L_0x01ff:
            r5 = r5[r3]
            r4 = r4 & r9
            long r6 = (long) r4
            java.lang.Object r4 = b.l.a.c.f.i.y7.q(r11, r6)
            java.util.List r4 = (java.util.List) r4
            b.l.a.c.f.i.c7.f(r5, r4, r12, r2)
            goto L_0x044c
        L_0x020e:
            r5 = r5[r3]
            r4 = r4 & r9
            long r6 = (long) r4
            java.lang.Object r4 = b.l.a.c.f.i.y7.q(r11, r6)
            java.util.List r4 = (java.util.List) r4
            b.l.a.c.f.i.c7.k(r5, r4, r12, r2)
            goto L_0x044c
        L_0x021d:
            r5 = r5[r3]
            r4 = r4 & r9
            long r6 = (long) r4
            java.lang.Object r4 = b.l.a.c.f.i.y7.q(r11, r6)
            java.util.List r4 = (java.util.List) r4
            b.l.a.c.f.i.c7.h(r5, r4, r12, r2)
            goto L_0x044c
        L_0x022c:
            r5 = r5[r3]
            r4 = r4 & r9
            long r6 = (long) r4
            java.lang.Object r4 = b.l.a.c.f.i.y7.q(r11, r6)
            java.util.List r4 = (java.util.List) r4
            b.l.a.c.f.i.c7.m(r5, r4, r12, r2)
            goto L_0x044c
        L_0x023b:
            r5 = r5[r3]
            r4 = r4 & r9
            long r6 = (long) r4
            java.lang.Object r4 = b.l.a.c.f.i.y7.q(r11, r6)
            java.util.List r4 = (java.util.List) r4
            b.l.a.c.f.i.c7.n(r5, r4, r12, r2)
            goto L_0x044c
        L_0x024a:
            r5 = r5[r3]
            r4 = r4 & r9
            long r6 = (long) r4
            java.lang.Object r4 = b.l.a.c.f.i.y7.q(r11, r6)
            java.util.List r4 = (java.util.List) r4
            b.l.a.c.f.i.c7.j(r5, r4, r12, r2)
            goto L_0x044c
        L_0x0259:
            r5 = r5[r3]
            r4 = r4 & r9
            long r6 = (long) r4
            java.lang.Object r4 = b.l.a.c.f.i.y7.q(r11, r6)
            java.util.List r4 = (java.util.List) r4
            b.l.a.c.f.i.c7.q(r5, r4, r12)
            goto L_0x044c
        L_0x0268:
            r5 = r5[r3]
            r4 = r4 & r9
            long r6 = (long) r4
            java.lang.Object r4 = b.l.a.c.f.i.y7.q(r11, r6)
            java.util.List r4 = (java.util.List) r4
            b.l.a.c.f.i.a7 r6 = r10.L(r3)
            b.l.a.c.f.i.c7.r(r5, r4, r12, r6)
            goto L_0x044c
        L_0x027b:
            r5 = r5[r3]
            r4 = r4 & r9
            long r6 = (long) r4
            java.lang.Object r4 = b.l.a.c.f.i.y7.q(r11, r6)
            java.util.List r4 = (java.util.List) r4
            b.l.a.c.f.i.c7.p(r5, r4, r12)
            goto L_0x044c
        L_0x028a:
            r5 = r5[r3]
            r4 = r4 & r9
            long r6 = (long) r4
            java.lang.Object r4 = b.l.a.c.f.i.y7.q(r11, r6)
            java.util.List r4 = (java.util.List) r4
            b.l.a.c.f.i.c7.o(r5, r4, r12, r2)
            goto L_0x044c
        L_0x0299:
            r5 = r5[r3]
            r4 = r4 & r9
            long r6 = (long) r4
            java.lang.Object r4 = b.l.a.c.f.i.y7.q(r11, r6)
            java.util.List r4 = (java.util.List) r4
            b.l.a.c.f.i.c7.l(r5, r4, r12, r2)
            goto L_0x044c
        L_0x02a8:
            r5 = r5[r3]
            r4 = r4 & r9
            long r6 = (long) r4
            java.lang.Object r4 = b.l.a.c.f.i.y7.q(r11, r6)
            java.util.List r4 = (java.util.List) r4
            b.l.a.c.f.i.c7.g(r5, r4, r12, r2)
            goto L_0x044c
        L_0x02b7:
            r5 = r5[r3]
            r4 = r4 & r9
            long r6 = (long) r4
            java.lang.Object r4 = b.l.a.c.f.i.y7.q(r11, r6)
            java.util.List r4 = (java.util.List) r4
            b.l.a.c.f.i.c7.i(r5, r4, r12, r2)
            goto L_0x044c
        L_0x02c6:
            r5 = r5[r3]
            r4 = r4 & r9
            long r6 = (long) r4
            java.lang.Object r4 = b.l.a.c.f.i.y7.q(r11, r6)
            java.util.List r4 = (java.util.List) r4
            b.l.a.c.f.i.c7.e(r5, r4, r12, r2)
            goto L_0x044c
        L_0x02d5:
            r5 = r5[r3]
            r4 = r4 & r9
            long r6 = (long) r4
            java.lang.Object r4 = b.l.a.c.f.i.y7.q(r11, r6)
            java.util.List r4 = (java.util.List) r4
            b.l.a.c.f.i.c7.d(r5, r4, r12, r2)
            goto L_0x044c
        L_0x02e4:
            r5 = r5[r3]
            r4 = r4 & r9
            long r6 = (long) r4
            java.lang.Object r4 = b.l.a.c.f.i.y7.q(r11, r6)
            java.util.List r4 = (java.util.List) r4
            b.l.a.c.f.i.c7.c(r5, r4, r12, r2)
            goto L_0x044c
        L_0x02f3:
            r5 = r5[r3]
            r4 = r4 & r9
            long r6 = (long) r4
            java.lang.Object r4 = b.l.a.c.f.i.y7.q(r11, r6)
            java.util.List r4 = (java.util.List) r4
            b.l.a.c.f.i.c7.b(r5, r4, r12, r2)
            goto L_0x044c
        L_0x0302:
            boolean r5 = r10.s(r11, r3)
            if (r5 == 0) goto L_0x044c
        L_0x0308:
            r4 = r4 & r9
            long r4 = (long) r4
            java.lang.Object r4 = b.l.a.c.f.i.y7.q(r11, r4)
            b.l.a.c.f.i.a7 r5 = r10.L(r3)
            r12.f(r6, r4, r5)
            goto L_0x044c
        L_0x0317:
            boolean r5 = r10.s(r11, r3)
            if (r5 == 0) goto L_0x044c
            r4 = r4 & r9
            long r4 = (long) r4
            long r4 = b.l.a.c.f.i.y7.k(r11, r4)
        L_0x0323:
            r12.d(r6, r4)
            goto L_0x044c
        L_0x0328:
            boolean r5 = r10.s(r11, r3)
            if (r5 == 0) goto L_0x044c
            r4 = r4 & r9
            long r4 = (long) r4
            int r4 = b.l.a.c.f.i.y7.j(r11, r4)
        L_0x0334:
            r12.c(r6, r4)
            goto L_0x044c
        L_0x0339:
            boolean r5 = r10.s(r11, r3)
            if (r5 == 0) goto L_0x044c
            r4 = r4 & r9
            long r4 = (long) r4
            long r4 = b.l.a.c.f.i.y7.k(r11, r4)
        L_0x0345:
            b.l.a.c.f.i.y4 r7 = r12.a
            r7.i(r6, r4)
            goto L_0x044c
        L_0x034c:
            boolean r5 = r10.s(r11, r3)
            if (r5 == 0) goto L_0x044c
            r4 = r4 & r9
            long r4 = (long) r4
            int r4 = b.l.a.c.f.i.y7.j(r11, r4)
        L_0x0358:
            b.l.a.c.f.i.y4 r5 = r12.a
            r5.g(r6, r4)
            goto L_0x044c
        L_0x035f:
            boolean r5 = r10.s(r11, r3)
            if (r5 == 0) goto L_0x044c
            r4 = r4 & r9
            long r4 = (long) r4
            int r4 = b.l.a.c.f.i.y7.j(r11, r4)
        L_0x036b:
            b.l.a.c.f.i.y4 r5 = r12.a
            r5.e(r6, r4)
            goto L_0x044c
        L_0x0372:
            boolean r5 = r10.s(r11, r3)
            if (r5 == 0) goto L_0x044c
            r4 = r4 & r9
            long r4 = (long) r4
            int r4 = b.l.a.c.f.i.y7.j(r11, r4)
        L_0x037e:
            b.l.a.c.f.i.y4 r5 = r12.a
            r5.f(r6, r4)
            goto L_0x044c
        L_0x0385:
            boolean r5 = r10.s(r11, r3)
            if (r5 == 0) goto L_0x044c
        L_0x038b:
            r4 = r4 & r9
            long r4 = (long) r4
            java.lang.Object r4 = b.l.a.c.f.i.y7.q(r11, r4)
            b.l.a.c.f.i.t4 r4 = (b.l.a.c.f.i.t4) r4
            b.l.a.c.f.i.y4 r5 = r12.a
            r5.l(r6, r4)
            goto L_0x044c
        L_0x039a:
            boolean r5 = r10.s(r11, r3)
            if (r5 == 0) goto L_0x044c
        L_0x03a0:
            r4 = r4 & r9
            long r4 = (long) r4
            java.lang.Object r4 = b.l.a.c.f.i.y7.q(r11, r4)
            b.l.a.c.f.i.a7 r5 = r10.L(r3)
            r12.e(r6, r4, r5)
            goto L_0x044c
        L_0x03af:
            boolean r5 = r10.s(r11, r3)
            if (r5 == 0) goto L_0x044c
        L_0x03b5:
            r4 = r4 & r9
            long r4 = (long) r4
            java.lang.Object r4 = b.l.a.c.f.i.y7.q(r11, r4)
            y(r6, r4, r12)
            goto L_0x044c
        L_0x03c0:
            boolean r5 = r10.s(r11, r3)
            if (r5 == 0) goto L_0x044c
            r4 = r4 & r9
            long r4 = (long) r4
            boolean r4 = b.l.a.c.f.i.y7.m(r11, r4)
        L_0x03cc:
            b.l.a.c.f.i.y4 r5 = r12.a
            r5.j(r6, r4)
            goto L_0x044c
        L_0x03d3:
            boolean r5 = r10.s(r11, r3)
            if (r5 == 0) goto L_0x044c
            r4 = r4 & r9
            long r4 = (long) r4
            int r4 = b.l.a.c.f.i.y7.j(r11, r4)
        L_0x03df:
            b.l.a.c.f.i.y4 r5 = r12.a
            r5.g(r6, r4)
            goto L_0x044c
        L_0x03e5:
            boolean r5 = r10.s(r11, r3)
            if (r5 == 0) goto L_0x044c
            r4 = r4 & r9
            long r4 = (long) r4
            long r4 = b.l.a.c.f.i.y7.k(r11, r4)
        L_0x03f1:
            b.l.a.c.f.i.y4 r7 = r12.a
            r7.i(r6, r4)
            goto L_0x044c
        L_0x03f7:
            boolean r5 = r10.s(r11, r3)
            if (r5 == 0) goto L_0x044c
            r4 = r4 & r9
            long r4 = (long) r4
            int r4 = b.l.a.c.f.i.y7.j(r11, r4)
        L_0x0403:
            b.l.a.c.f.i.y4 r5 = r12.a
            r5.e(r6, r4)
            goto L_0x044c
        L_0x0409:
            boolean r5 = r10.s(r11, r3)
            if (r5 == 0) goto L_0x044c
            r4 = r4 & r9
            long r4 = (long) r4
            long r4 = b.l.a.c.f.i.y7.k(r11, r4)
        L_0x0415:
            b.l.a.c.f.i.y4 r7 = r12.a
            r7.h(r6, r4)
            goto L_0x044c
        L_0x041b:
            boolean r5 = r10.s(r11, r3)
            if (r5 == 0) goto L_0x044c
            r4 = r4 & r9
            long r4 = (long) r4
            long r4 = b.l.a.c.f.i.y7.k(r11, r4)
        L_0x0427:
            b.l.a.c.f.i.y4 r7 = r12.a
            r7.h(r6, r4)
            goto L_0x044c
        L_0x042d:
            boolean r5 = r10.s(r11, r3)
            if (r5 == 0) goto L_0x044c
            r4 = r4 & r9
            long r4 = (long) r4
            float r4 = b.l.a.c.f.i.y7.n(r11, r4)
        L_0x0439:
            r12.a(r6, r4)
            goto L_0x044c
        L_0x043d:
            boolean r5 = r10.s(r11, r3)
            if (r5 == 0) goto L_0x044c
            r4 = r4 & r9
            long r4 = (long) r4
            double r4 = b.l.a.c.f.i.y7.o(r11, r4)
        L_0x0449:
            r12.b(r6, r4)
        L_0x044c:
            int r3 = r3 + 3
            goto L_0x000e
        L_0x0450:
            b.l.a.c.f.i.n7<?, ?> r0 = r10.f3726l
            java.lang.Object r11 = r0.d(r11)
            r0.i(r11, r12)
            return
        L_0x045a:
            b.l.a.c.f.i.d5<?> r12 = r10.f3727m
            r12.b(r11)
            throw r1
        L_0x0460:
            r10.x(r11, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: b.l.a.c.f.i.s6.g(java.lang.Object, b.l.a.c.f.i.z4):void");
    }

    public final void h(T t) {
        int i2;
        int i3 = this.f3723i;
        while (true) {
            i2 = this.f3724j;
            if (i3 >= i2) {
                break;
            }
            long j2 = (long) (j(this.f3722h[i3]) & 1048575);
            Object q2 = y7.q(t, j2);
            if (q2 != null) {
                ((l6) q2).f3645h = false;
                y7.f3819e.s(t, j2, q2);
            }
            i3++;
        }
        int length = this.f3722h.length;
        while (i2 < length) {
            this.f3725k.a(t, (long) this.f3722h[i2]);
            i2++;
        }
        this.f3726l.e(t);
        if (this.f) {
            this.f3727m.c(t);
        }
    }

    public final void i(T t, byte[] bArr, int i2, int i3, j4 j4Var) {
        if (this.f3721g) {
            O(t, bArr, i2, i3, j4Var);
        } else {
            A(t, bArr, i2, i3, 0, j4Var);
        }
    }

    public final int j(int i2) {
        return this.a[i2 + 1];
    }

    public final int k(int i2) {
        return this.a[i2 + 2];
    }

    public final boolean q(T t, T t2, int i2) {
        return s(t, i2) == s(t2, i2);
    }

    public final boolean r(T t, int i2, int i3, int i4, int i5) {
        return i3 == 1048575 ? s(t, i2) : (i4 & i5) != 0;
    }

    public final boolean s(T t, int i2) {
        int[] iArr = this.a;
        int i3 = iArr[i2 + 2];
        long j2 = (long) (i3 & 1048575);
        if (j2 != 1048575) {
            return (y7.j(t, j2) & (1 << (i3 >>> 20))) != 0;
        }
        int i4 = iArr[i2 + 1];
        long j3 = (long) (i4 & 1048575);
        switch ((i4 >>> 20) & 255) {
            case 0:
                return y7.o(t, j3) != ShadowDrawableWrapper.COS_45;
            case 1:
                return y7.n(t, j3) != 0.0f;
            case 2:
                return y7.k(t, j3) != 0;
            case 3:
                return y7.k(t, j3) != 0;
            case 4:
                return y7.j(t, j3) != 0;
            case 5:
                return y7.k(t, j3) != 0;
            case 6:
                return y7.j(t, j3) != 0;
            case 7:
                return y7.m(t, j3);
            case 8:
                Object q2 = y7.q(t, j3);
                if (q2 instanceof String) {
                    return !((String) q2).isEmpty();
                }
                if (q2 instanceof t4) {
                    return !t4.f3759i.equals(q2);
                }
                throw new IllegalArgumentException();
            case 9:
                return y7.q(t, j3) != null;
            case 10:
                return !t4.f3759i.equals(y7.q(t, j3));
            case 11:
                return y7.j(t, j3) != 0;
            case 12:
                return y7.j(t, j3) != 0;
            case 13:
                return y7.j(t, j3) != 0;
            case 14:
                return y7.k(t, j3) != 0;
            case 15:
                return y7.j(t, j3) != 0;
            case 16:
                return y7.k(t, j3) != 0;
            case 17:
                return y7.q(t, j3) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    public final void t(T t, int i2) {
        int i3 = this.a[i2 + 2];
        long j2 = (long) (1048575 & i3);
        if (j2 != 1048575) {
            y7.f3819e.o(t, j2, (1 << (i3 >>> 20)) | y7.j(t, j2));
        }
    }

    public final boolean u(T t, int i2, int i3) {
        return y7.j(t, (long) (this.a[i3 + 2] & 1048575)) == i2;
    }

    public final void v(T t, int i2, int i3) {
        y7.f3819e.o(t, (long) (this.a[i3 + 2] & 1048575), i2);
    }

    public final int w(int i2, int i3) {
        int length = (this.a.length / 3) - 1;
        while (i3 <= length) {
            int i4 = (length + i3) >>> 1;
            int i5 = i4 * 3;
            int i6 = this.a[i5];
            if (i2 == i6) {
                return i5;
            }
            if (i2 < i6) {
                length = i4 - 1;
            } else {
                i3 = i4 + 1;
            }
        }
        return -1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:164:0x0463, code lost:
        r8 = r8 + 3;
        r6 = 1048575;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x019f, code lost:
        b.l.a.c.f.i.c7.f(r11, r6, r2, r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x01a9, code lost:
        b.l.a.c.f.i.c7.k(r11, (java.util.List) r5.getObject(r1, r6), r2, r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x01b9, code lost:
        b.l.a.c.f.i.c7.h(r11, (java.util.List) r5.getObject(r1, r6), r2, r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x01c9, code lost:
        b.l.a.c.f.i.c7.m(r11, (java.util.List) r5.getObject(r1, r6), r2, r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x01d9, code lost:
        b.l.a.c.f.i.c7.n(r11, (java.util.List) r5.getObject(r1, r6), r2, r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x01e9, code lost:
        b.l.a.c.f.i.c7.j(r11, (java.util.List) r5.getObject(r1, r6), r2, r12);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void x(T r17, b.l.a.c.f.i.z4 r18) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = r18
            boolean r3 = r0.f
            r4 = 0
            if (r3 != 0) goto L_0x0474
            int[] r3 = r0.a
            int r3 = r3.length
            sun.misc.Unsafe r5 = f3718p
            r6 = 1048575(0xfffff, float:1.469367E-39)
            r9 = r6
            r8 = 0
            r10 = 0
        L_0x0016:
            if (r8 >= r3) goto L_0x046a
            int r11 = r0.j(r8)
            int[] r12 = r0.a
            r13 = r12[r8]
            int r14 = r11 >>> 20
            r14 = r14 & 255(0xff, float:3.57E-43)
            r15 = 17
            r7 = 1
            if (r14 > r15) goto L_0x003c
            int r15 = r8 + 2
            r12 = r12[r15]
            r15 = r12 & r6
            if (r15 == r9) goto L_0x0037
            long r9 = (long) r15
            int r10 = r5.getInt(r1, r9)
            r9 = r15
        L_0x0037:
            int r12 = r12 >>> 20
            int r12 = r7 << r12
            goto L_0x003d
        L_0x003c:
            r12 = 0
        L_0x003d:
            r11 = r11 & r6
            long r6 = (long) r11
            switch(r14) {
                case 0: goto L_0x0457;
                case 1: goto L_0x044a;
                case 2: goto L_0x043b;
                case 3: goto L_0x042c;
                case 4: goto L_0x041d;
                case 5: goto L_0x040e;
                case 6: goto L_0x03ff;
                case 7: goto L_0x03f0;
                case 8: goto L_0x03e2;
                case 9: goto L_0x03d0;
                case 10: goto L_0x03be;
                case 11: goto L_0x03ae;
                case 12: goto L_0x039e;
                case 13: goto L_0x038e;
                case 14: goto L_0x037e;
                case 15: goto L_0x0370;
                case 16: goto L_0x0362;
                case 17: goto L_0x0350;
                case 18: goto L_0x0340;
                case 19: goto L_0x0330;
                case 20: goto L_0x0320;
                case 21: goto L_0x0310;
                case 22: goto L_0x0300;
                case 23: goto L_0x02f0;
                case 24: goto L_0x02e0;
                case 25: goto L_0x02d0;
                case 26: goto L_0x02c2;
                case 27: goto L_0x02b0;
                case 28: goto L_0x02a2;
                case 29: goto L_0x0298;
                case 30: goto L_0x0291;
                case 31: goto L_0x028a;
                case 32: goto L_0x0283;
                case 33: goto L_0x027c;
                case 34: goto L_0x026f;
                case 35: goto L_0x0260;
                case 36: goto L_0x0251;
                case 37: goto L_0x0242;
                case 38: goto L_0x0233;
                case 39: goto L_0x0224;
                case 40: goto L_0x0214;
                case 41: goto L_0x0204;
                case 42: goto L_0x01f4;
                case 43: goto L_0x01e4;
                case 44: goto L_0x01d4;
                case 45: goto L_0x01c4;
                case 46: goto L_0x01b4;
                case 47: goto L_0x01a4;
                case 48: goto L_0x0194;
                case 49: goto L_0x0181;
                case 50: goto L_0x0172;
                case 51: goto L_0x0163;
                case 52: goto L_0x0154;
                case 53: goto L_0x0143;
                case 54: goto L_0x0132;
                case 55: goto L_0x0121;
                case 56: goto L_0x0110;
                case 57: goto L_0x00ff;
                case 58: goto L_0x00ee;
                case 59: goto L_0x00df;
                case 60: goto L_0x00cc;
                case 61: goto L_0x00b9;
                case 62: goto L_0x00a8;
                case 63: goto L_0x0097;
                case 64: goto L_0x0086;
                case 65: goto L_0x0075;
                case 66: goto L_0x0066;
                case 67: goto L_0x0057;
                case 68: goto L_0x0044;
                default: goto L_0x0042;
            }
        L_0x0042:
            goto L_0x029f
        L_0x0044:
            boolean r11 = r0.u(r1, r13, r8)
            if (r11 == 0) goto L_0x029f
            java.lang.Object r6 = r5.getObject(r1, r6)
            b.l.a.c.f.i.a7 r7 = r0.L(r8)
            r2.f(r13, r6, r7)
            goto L_0x029f
        L_0x0057:
            boolean r11 = r0.u(r1, r13, r8)
            if (r11 == 0) goto L_0x029f
            long r6 = o(r1, r6)
            r2.d(r13, r6)
            goto L_0x029f
        L_0x0066:
            boolean r11 = r0.u(r1, r13, r8)
            if (r11 == 0) goto L_0x029f
            int r6 = n(r1, r6)
            r2.c(r13, r6)
            goto L_0x029f
        L_0x0075:
            boolean r11 = r0.u(r1, r13, r8)
            if (r11 == 0) goto L_0x029f
            long r6 = o(r1, r6)
            b.l.a.c.f.i.y4 r11 = r2.a
            r11.i(r13, r6)
            goto L_0x029f
        L_0x0086:
            boolean r11 = r0.u(r1, r13, r8)
            if (r11 == 0) goto L_0x029f
            int r6 = n(r1, r6)
            b.l.a.c.f.i.y4 r7 = r2.a
            r7.g(r13, r6)
            goto L_0x029f
        L_0x0097:
            boolean r11 = r0.u(r1, r13, r8)
            if (r11 == 0) goto L_0x029f
            int r6 = n(r1, r6)
            b.l.a.c.f.i.y4 r7 = r2.a
            r7.e(r13, r6)
            goto L_0x029f
        L_0x00a8:
            boolean r11 = r0.u(r1, r13, r8)
            if (r11 == 0) goto L_0x029f
            int r6 = n(r1, r6)
            b.l.a.c.f.i.y4 r7 = r2.a
            r7.f(r13, r6)
            goto L_0x029f
        L_0x00b9:
            boolean r11 = r0.u(r1, r13, r8)
            if (r11 == 0) goto L_0x029f
            java.lang.Object r6 = r5.getObject(r1, r6)
            b.l.a.c.f.i.t4 r6 = (b.l.a.c.f.i.t4) r6
            b.l.a.c.f.i.y4 r7 = r2.a
            r7.l(r13, r6)
            goto L_0x029f
        L_0x00cc:
            boolean r11 = r0.u(r1, r13, r8)
            if (r11 == 0) goto L_0x029f
            java.lang.Object r6 = r5.getObject(r1, r6)
            b.l.a.c.f.i.a7 r7 = r0.L(r8)
            r2.e(r13, r6, r7)
            goto L_0x029f
        L_0x00df:
            boolean r11 = r0.u(r1, r13, r8)
            if (r11 == 0) goto L_0x029f
            java.lang.Object r6 = r5.getObject(r1, r6)
            y(r13, r6, r2)
            goto L_0x029f
        L_0x00ee:
            boolean r11 = r0.u(r1, r13, r8)
            if (r11 == 0) goto L_0x029f
            boolean r6 = p(r1, r6)
            b.l.a.c.f.i.y4 r7 = r2.a
            r7.j(r13, r6)
            goto L_0x029f
        L_0x00ff:
            boolean r11 = r0.u(r1, r13, r8)
            if (r11 == 0) goto L_0x029f
            int r6 = n(r1, r6)
            b.l.a.c.f.i.y4 r7 = r2.a
            r7.g(r13, r6)
            goto L_0x029f
        L_0x0110:
            boolean r11 = r0.u(r1, r13, r8)
            if (r11 == 0) goto L_0x029f
            long r6 = o(r1, r6)
            b.l.a.c.f.i.y4 r11 = r2.a
            r11.i(r13, r6)
            goto L_0x029f
        L_0x0121:
            boolean r11 = r0.u(r1, r13, r8)
            if (r11 == 0) goto L_0x029f
            int r6 = n(r1, r6)
            b.l.a.c.f.i.y4 r7 = r2.a
            r7.e(r13, r6)
            goto L_0x029f
        L_0x0132:
            boolean r11 = r0.u(r1, r13, r8)
            if (r11 == 0) goto L_0x029f
            long r6 = o(r1, r6)
            b.l.a.c.f.i.y4 r11 = r2.a
            r11.h(r13, r6)
            goto L_0x029f
        L_0x0143:
            boolean r11 = r0.u(r1, r13, r8)
            if (r11 == 0) goto L_0x029f
            long r6 = o(r1, r6)
            b.l.a.c.f.i.y4 r11 = r2.a
            r11.h(r13, r6)
            goto L_0x029f
        L_0x0154:
            boolean r11 = r0.u(r1, r13, r8)
            if (r11 == 0) goto L_0x029f
            float r6 = m(r1, r6)
            r2.a(r13, r6)
            goto L_0x029f
        L_0x0163:
            boolean r11 = r0.u(r1, r13, r8)
            if (r11 == 0) goto L_0x029f
            double r6 = l(r1, r6)
            r2.b(r13, r6)
            goto L_0x029f
        L_0x0172:
            java.lang.Object r6 = r5.getObject(r1, r6)
            if (r6 != 0) goto L_0x017a
            goto L_0x029f
        L_0x017a:
            java.lang.Object r1 = r0.M(r8)
            b.l.a.c.f.i.k6 r1 = (b.l.a.c.f.i.k6) r1
            throw r4
        L_0x0181:
            int[] r11 = r0.a
            r11 = r11[r8]
            java.lang.Object r6 = r5.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            b.l.a.c.f.i.a7 r7 = r0.L(r8)
            b.l.a.c.f.i.c7.s(r11, r6, r2, r7)
            goto L_0x029f
        L_0x0194:
            int[] r11 = r0.a
            r11 = r11[r8]
            java.lang.Object r6 = r5.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            r12 = 1
        L_0x019f:
            b.l.a.c.f.i.c7.f(r11, r6, r2, r12)
            goto L_0x029f
        L_0x01a4:
            r12 = 1
            int[] r11 = r0.a
            r11 = r11[r8]
        L_0x01a9:
            java.lang.Object r6 = r5.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            b.l.a.c.f.i.c7.k(r11, r6, r2, r12)
            goto L_0x029f
        L_0x01b4:
            r12 = 1
            int[] r11 = r0.a
            r11 = r11[r8]
        L_0x01b9:
            java.lang.Object r6 = r5.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            b.l.a.c.f.i.c7.h(r11, r6, r2, r12)
            goto L_0x029f
        L_0x01c4:
            r12 = 1
            int[] r11 = r0.a
            r11 = r11[r8]
        L_0x01c9:
            java.lang.Object r6 = r5.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            b.l.a.c.f.i.c7.m(r11, r6, r2, r12)
            goto L_0x029f
        L_0x01d4:
            r12 = 1
            int[] r11 = r0.a
            r11 = r11[r8]
        L_0x01d9:
            java.lang.Object r6 = r5.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            b.l.a.c.f.i.c7.n(r11, r6, r2, r12)
            goto L_0x029f
        L_0x01e4:
            r12 = 1
            int[] r11 = r0.a
            r11 = r11[r8]
        L_0x01e9:
            java.lang.Object r6 = r5.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            b.l.a.c.f.i.c7.j(r11, r6, r2, r12)
            goto L_0x029f
        L_0x01f4:
            r12 = 1
            int[] r11 = r0.a
            r11 = r11[r8]
            java.lang.Object r6 = r5.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            b.l.a.c.f.i.c7.o(r11, r6, r2, r12)
            goto L_0x029f
        L_0x0204:
            r12 = 1
            int[] r11 = r0.a
            r11 = r11[r8]
            java.lang.Object r6 = r5.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            b.l.a.c.f.i.c7.l(r11, r6, r2, r12)
            goto L_0x029f
        L_0x0214:
            r12 = 1
            int[] r11 = r0.a
            r11 = r11[r8]
            java.lang.Object r6 = r5.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            b.l.a.c.f.i.c7.g(r11, r6, r2, r12)
            goto L_0x029f
        L_0x0224:
            r12 = 1
            int[] r11 = r0.a
            r11 = r11[r8]
            java.lang.Object r6 = r5.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            b.l.a.c.f.i.c7.i(r11, r6, r2, r12)
            goto L_0x029f
        L_0x0233:
            r12 = 1
            int[] r11 = r0.a
            r11 = r11[r8]
            java.lang.Object r6 = r5.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            b.l.a.c.f.i.c7.e(r11, r6, r2, r12)
            goto L_0x029f
        L_0x0242:
            r12 = 1
            int[] r11 = r0.a
            r11 = r11[r8]
            java.lang.Object r6 = r5.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            b.l.a.c.f.i.c7.d(r11, r6, r2, r12)
            goto L_0x029f
        L_0x0251:
            r12 = 1
            int[] r11 = r0.a
            r11 = r11[r8]
            java.lang.Object r6 = r5.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            b.l.a.c.f.i.c7.c(r11, r6, r2, r12)
            goto L_0x029f
        L_0x0260:
            r12 = 1
            int[] r11 = r0.a
            r11 = r11[r8]
            java.lang.Object r6 = r5.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            b.l.a.c.f.i.c7.b(r11, r6, r2, r12)
            goto L_0x029f
        L_0x026f:
            int[] r11 = r0.a
            r11 = r11[r8]
            java.lang.Object r6 = r5.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            r12 = 0
            goto L_0x019f
        L_0x027c:
            r12 = 0
            int[] r11 = r0.a
            r11 = r11[r8]
            goto L_0x01a9
        L_0x0283:
            r12 = 0
            int[] r11 = r0.a
            r11 = r11[r8]
            goto L_0x01b9
        L_0x028a:
            r12 = 0
            int[] r11 = r0.a
            r11 = r11[r8]
            goto L_0x01c9
        L_0x0291:
            r12 = 0
            int[] r11 = r0.a
            r11 = r11[r8]
            goto L_0x01d9
        L_0x0298:
            r12 = 0
            int[] r11 = r0.a
            r11 = r11[r8]
            goto L_0x01e9
        L_0x029f:
            r14 = 0
            goto L_0x0463
        L_0x02a2:
            int[] r11 = r0.a
            r11 = r11[r8]
            java.lang.Object r6 = r5.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            b.l.a.c.f.i.c7.q(r11, r6, r2)
            goto L_0x029f
        L_0x02b0:
            int[] r11 = r0.a
            r11 = r11[r8]
            java.lang.Object r6 = r5.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            b.l.a.c.f.i.a7 r7 = r0.L(r8)
            b.l.a.c.f.i.c7.r(r11, r6, r2, r7)
            goto L_0x029f
        L_0x02c2:
            int[] r11 = r0.a
            r11 = r11[r8]
            java.lang.Object r6 = r5.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            b.l.a.c.f.i.c7.p(r11, r6, r2)
            goto L_0x029f
        L_0x02d0:
            int[] r11 = r0.a
            r11 = r11[r8]
            java.lang.Object r6 = r5.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            r14 = 0
            b.l.a.c.f.i.c7.o(r11, r6, r2, r14)
            goto L_0x0463
        L_0x02e0:
            r14 = 0
            int[] r11 = r0.a
            r11 = r11[r8]
            java.lang.Object r6 = r5.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            b.l.a.c.f.i.c7.l(r11, r6, r2, r14)
            goto L_0x0463
        L_0x02f0:
            r14 = 0
            int[] r11 = r0.a
            r11 = r11[r8]
            java.lang.Object r6 = r5.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            b.l.a.c.f.i.c7.g(r11, r6, r2, r14)
            goto L_0x0463
        L_0x0300:
            r14 = 0
            int[] r11 = r0.a
            r11 = r11[r8]
            java.lang.Object r6 = r5.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            b.l.a.c.f.i.c7.i(r11, r6, r2, r14)
            goto L_0x0463
        L_0x0310:
            r14 = 0
            int[] r11 = r0.a
            r11 = r11[r8]
            java.lang.Object r6 = r5.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            b.l.a.c.f.i.c7.e(r11, r6, r2, r14)
            goto L_0x0463
        L_0x0320:
            r14 = 0
            int[] r11 = r0.a
            r11 = r11[r8]
            java.lang.Object r6 = r5.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            b.l.a.c.f.i.c7.d(r11, r6, r2, r14)
            goto L_0x0463
        L_0x0330:
            r14 = 0
            int[] r11 = r0.a
            r11 = r11[r8]
            java.lang.Object r6 = r5.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            b.l.a.c.f.i.c7.c(r11, r6, r2, r14)
            goto L_0x0463
        L_0x0340:
            r14 = 0
            int[] r11 = r0.a
            r11 = r11[r8]
            java.lang.Object r6 = r5.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            b.l.a.c.f.i.c7.b(r11, r6, r2, r14)
            goto L_0x0463
        L_0x0350:
            r14 = 0
            r11 = r10 & r12
            if (r11 == 0) goto L_0x0463
            java.lang.Object r6 = r5.getObject(r1, r6)
            b.l.a.c.f.i.a7 r7 = r0.L(r8)
            r2.f(r13, r6, r7)
            goto L_0x0463
        L_0x0362:
            r14 = 0
            r11 = r10 & r12
            if (r11 == 0) goto L_0x0463
            long r6 = r5.getLong(r1, r6)
            r2.d(r13, r6)
            goto L_0x0463
        L_0x0370:
            r14 = 0
            r11 = r10 & r12
            if (r11 == 0) goto L_0x0463
            int r6 = r5.getInt(r1, r6)
            r2.c(r13, r6)
            goto L_0x0463
        L_0x037e:
            r14 = 0
            r11 = r10 & r12
            if (r11 == 0) goto L_0x0463
            long r6 = r5.getLong(r1, r6)
            b.l.a.c.f.i.y4 r11 = r2.a
            r11.i(r13, r6)
            goto L_0x0463
        L_0x038e:
            r14 = 0
            r11 = r10 & r12
            if (r11 == 0) goto L_0x0463
            int r6 = r5.getInt(r1, r6)
            b.l.a.c.f.i.y4 r7 = r2.a
            r7.g(r13, r6)
            goto L_0x0463
        L_0x039e:
            r14 = 0
            r11 = r10 & r12
            if (r11 == 0) goto L_0x0463
            int r6 = r5.getInt(r1, r6)
            b.l.a.c.f.i.y4 r7 = r2.a
            r7.e(r13, r6)
            goto L_0x0463
        L_0x03ae:
            r14 = 0
            r11 = r10 & r12
            if (r11 == 0) goto L_0x0463
            int r6 = r5.getInt(r1, r6)
            b.l.a.c.f.i.y4 r7 = r2.a
            r7.f(r13, r6)
            goto L_0x0463
        L_0x03be:
            r14 = 0
            r11 = r10 & r12
            if (r11 == 0) goto L_0x0463
            java.lang.Object r6 = r5.getObject(r1, r6)
            b.l.a.c.f.i.t4 r6 = (b.l.a.c.f.i.t4) r6
            b.l.a.c.f.i.y4 r7 = r2.a
            r7.l(r13, r6)
            goto L_0x0463
        L_0x03d0:
            r14 = 0
            r11 = r10 & r12
            if (r11 == 0) goto L_0x0463
            java.lang.Object r6 = r5.getObject(r1, r6)
            b.l.a.c.f.i.a7 r7 = r0.L(r8)
            r2.e(r13, r6, r7)
            goto L_0x0463
        L_0x03e2:
            r14 = 0
            r11 = r10 & r12
            if (r11 == 0) goto L_0x0463
            java.lang.Object r6 = r5.getObject(r1, r6)
            y(r13, r6, r2)
            goto L_0x0463
        L_0x03f0:
            r14 = 0
            r11 = r10 & r12
            if (r11 == 0) goto L_0x0463
            boolean r6 = b.l.a.c.f.i.y7.m(r1, r6)
            b.l.a.c.f.i.y4 r7 = r2.a
            r7.j(r13, r6)
            goto L_0x0463
        L_0x03ff:
            r14 = 0
            r11 = r10 & r12
            if (r11 == 0) goto L_0x0463
            int r6 = r5.getInt(r1, r6)
            b.l.a.c.f.i.y4 r7 = r2.a
            r7.g(r13, r6)
            goto L_0x0463
        L_0x040e:
            r14 = 0
            r11 = r10 & r12
            if (r11 == 0) goto L_0x0463
            long r6 = r5.getLong(r1, r6)
            b.l.a.c.f.i.y4 r11 = r2.a
            r11.i(r13, r6)
            goto L_0x0463
        L_0x041d:
            r14 = 0
            r11 = r10 & r12
            if (r11 == 0) goto L_0x0463
            int r6 = r5.getInt(r1, r6)
            b.l.a.c.f.i.y4 r7 = r2.a
            r7.e(r13, r6)
            goto L_0x0463
        L_0x042c:
            r14 = 0
            r11 = r10 & r12
            if (r11 == 0) goto L_0x0463
            long r6 = r5.getLong(r1, r6)
            b.l.a.c.f.i.y4 r11 = r2.a
            r11.h(r13, r6)
            goto L_0x0463
        L_0x043b:
            r14 = 0
            r11 = r10 & r12
            if (r11 == 0) goto L_0x0463
            long r6 = r5.getLong(r1, r6)
            b.l.a.c.f.i.y4 r11 = r2.a
            r11.h(r13, r6)
            goto L_0x0463
        L_0x044a:
            r14 = 0
            r11 = r10 & r12
            if (r11 == 0) goto L_0x0463
            float r6 = b.l.a.c.f.i.y7.n(r1, r6)
            r2.a(r13, r6)
            goto L_0x0463
        L_0x0457:
            r14 = 0
            r11 = r10 & r12
            if (r11 == 0) goto L_0x0463
            double r6 = b.l.a.c.f.i.y7.o(r1, r6)
            r2.b(r13, r6)
        L_0x0463:
            int r8 = r8 + 3
            r6 = 1048575(0xfffff, float:1.469367E-39)
            goto L_0x0016
        L_0x046a:
            b.l.a.c.f.i.n7<?, ?> r3 = r0.f3726l
            java.lang.Object r1 = r3.d(r1)
            r3.i(r1, r2)
            return
        L_0x0474:
            b.l.a.c.f.i.d5<?> r2 = r0.f3727m
            r2.b(r1)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: b.l.a.c.f.i.s6.x(java.lang.Object, b.l.a.c.f.i.z4):void");
    }
}
