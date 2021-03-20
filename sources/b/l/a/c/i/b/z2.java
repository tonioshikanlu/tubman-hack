package b.l.a.c.i.b;

import b.l.a.c.f.i.r;

public abstract class z2 extends r implements a3 {
    public z2() {
        super("com.google.android.gms.measurement.internal.IMeasurementService");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x00c5, code lost:
        r10.writeNoException();
        r10.writeTypedList(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x026d, code lost:
        r10.writeNoException();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0270, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean g(int r8, android.os.Parcel r9, android.os.Parcel r10, int r11) {
        /*
            r7 = this;
            r11 = 0
            r0 = 1
            java.lang.String r1 = "null reference"
            switch(r8) {
                case 1: goto L_0x024c;
                case 2: goto L_0x022a;
                case 3: goto L_0x0007;
                case 4: goto L_0x0213;
                case 5: goto L_0x01ef;
                case 6: goto L_0x01d7;
                case 7: goto L_0x015b;
                case 8: goto L_0x0007;
                case 9: goto L_0x0140;
                case 10: goto L_0x0128;
                case 11: goto L_0x0111;
                case 12: goto L_0x00f9;
                case 13: goto L_0x00cd;
                case 14: goto L_0x00a5;
                case 15: goto L_0x0088;
                case 16: goto L_0x0070;
                case 17: goto L_0x005c;
                case 18: goto L_0x003d;
                case 19: goto L_0x0018;
                case 20: goto L_0x0008;
                default: goto L_0x0007;
            }
        L_0x0007:
            return r11
        L_0x0008:
            android.os.Parcelable$Creator<b.l.a.c.i.b.p9> r8 = b.l.a.c.i.b.p9.CREATOR
            android.os.Parcelable r8 = b.l.a.c.f.i.o0.a(r9, r8)
            b.l.a.c.i.b.p9 r8 = (b.l.a.c.i.b.p9) r8
            r9 = r7
            b.l.a.c.i.b.e5 r9 = (b.l.a.c.i.b.e5) r9
            r9.D(r8)
            goto L_0x026d
        L_0x0018:
            android.os.Parcelable$Creator r8 = android.os.Bundle.CREATOR
            android.os.Parcelable r8 = b.l.a.c.f.i.o0.a(r9, r8)
            android.os.Bundle r8 = (android.os.Bundle) r8
            android.os.Parcelable$Creator<b.l.a.c.i.b.p9> r11 = b.l.a.c.i.b.p9.CREATOR
            android.os.Parcelable r9 = b.l.a.c.f.i.o0.a(r9, r11)
            b.l.a.c.i.b.p9 r9 = (b.l.a.c.i.b.p9) r9
            r11 = r7
            b.l.a.c.i.b.e5 r11 = (b.l.a.c.i.b.e5) r11
            r11.n(r9)
            java.lang.String r9 = r9.f4218h
            java.util.Objects.requireNonNull(r9, r1)
            b.l.a.c.i.b.m4 r1 = new b.l.a.c.i.b.m4
            r1.<init>(r11, r9, r8)
            r11.k(r1)
            goto L_0x026d
        L_0x003d:
            android.os.Parcelable$Creator<b.l.a.c.i.b.p9> r8 = b.l.a.c.i.b.p9.CREATOR
            android.os.Parcelable r8 = b.l.a.c.f.i.o0.a(r9, r8)
            b.l.a.c.i.b.p9 r8 = (b.l.a.c.i.b.p9) r8
            r9 = r7
            b.l.a.c.i.b.e5 r9 = (b.l.a.c.i.b.e5) r9
            java.lang.String r1 = r8.f4218h
            b.l.a.c.b.a.x(r1)
            java.lang.String r1 = r8.f4218h
            r9.o(r1, r11)
            b.l.a.c.i.b.t4 r11 = new b.l.a.c.i.b.t4
            r11.<init>(r9, r8)
            r9.k(r11)
            goto L_0x026d
        L_0x005c:
            java.lang.String r8 = r9.readString()
            java.lang.String r11 = r9.readString()
            java.lang.String r9 = r9.readString()
            r1 = r7
            b.l.a.c.i.b.e5 r1 = (b.l.a.c.i.b.e5) r1
            java.util.List r8 = r1.R0(r8, r11, r9)
            goto L_0x00c5
        L_0x0070:
            java.lang.String r8 = r9.readString()
            java.lang.String r11 = r9.readString()
            android.os.Parcelable$Creator<b.l.a.c.i.b.p9> r1 = b.l.a.c.i.b.p9.CREATOR
            android.os.Parcelable r9 = b.l.a.c.f.i.o0.a(r9, r1)
            b.l.a.c.i.b.p9 r9 = (b.l.a.c.i.b.p9) r9
            r1 = r7
            b.l.a.c.i.b.e5 r1 = (b.l.a.c.i.b.e5) r1
            java.util.List r8 = r1.r(r8, r11, r9)
            goto L_0x00c5
        L_0x0088:
            java.lang.String r8 = r9.readString()
            java.lang.String r1 = r9.readString()
            java.lang.String r2 = r9.readString()
            java.lang.ClassLoader r3 = b.l.a.c.f.i.o0.a
            int r9 = r9.readInt()
            if (r9 == 0) goto L_0x009d
            r11 = r0
        L_0x009d:
            r9 = r7
            b.l.a.c.i.b.e5 r9 = (b.l.a.c.i.b.e5) r9
            java.util.List r8 = r9.b1(r8, r1, r2, r11)
            goto L_0x00c5
        L_0x00a5:
            java.lang.String r8 = r9.readString()
            java.lang.String r1 = r9.readString()
            java.lang.ClassLoader r2 = b.l.a.c.f.i.o0.a
            int r2 = r9.readInt()
            if (r2 == 0) goto L_0x00b6
            r11 = r0
        L_0x00b6:
            android.os.Parcelable$Creator<b.l.a.c.i.b.p9> r2 = b.l.a.c.i.b.p9.CREATOR
            android.os.Parcelable r9 = b.l.a.c.f.i.o0.a(r9, r2)
            b.l.a.c.i.b.p9 r9 = (b.l.a.c.i.b.p9) r9
            r2 = r7
            b.l.a.c.i.b.e5 r2 = (b.l.a.c.i.b.e5) r2
            java.util.List r8 = r2.O0(r8, r1, r11, r9)
        L_0x00c5:
            r10.writeNoException()
            r10.writeTypedList(r8)
            goto L_0x0270
        L_0x00cd:
            android.os.Parcelable$Creator<b.l.a.c.i.b.b> r8 = b.l.a.c.i.b.b.CREATOR
            android.os.Parcelable r8 = b.l.a.c.f.i.o0.a(r9, r8)
            b.l.a.c.i.b.b r8 = (b.l.a.c.i.b.b) r8
            r9 = r7
            b.l.a.c.i.b.e5 r9 = (b.l.a.c.i.b.e5) r9
            java.util.Objects.requireNonNull(r8, r1)
            b.l.a.c.i.b.g9 r11 = r8.f3913j
            java.util.Objects.requireNonNull(r11, r1)
            java.lang.String r11 = r8.f3911h
            b.l.a.c.b.a.x(r11)
            java.lang.String r11 = r8.f3911h
            r9.o(r11, r0)
            b.l.a.c.i.b.b r11 = new b.l.a.c.i.b.b
            r11.<init>(r8)
            b.l.a.c.i.b.o4 r8 = new b.l.a.c.i.b.o4
            r8.<init>(r9, r11)
            r9.k(r8)
            goto L_0x026d
        L_0x00f9:
            android.os.Parcelable$Creator<b.l.a.c.i.b.b> r8 = b.l.a.c.i.b.b.CREATOR
            android.os.Parcelable r8 = b.l.a.c.f.i.o0.a(r9, r8)
            b.l.a.c.i.b.b r8 = (b.l.a.c.i.b.b) r8
            android.os.Parcelable$Creator<b.l.a.c.i.b.p9> r11 = b.l.a.c.i.b.p9.CREATOR
            android.os.Parcelable r9 = b.l.a.c.f.i.o0.a(r9, r11)
            b.l.a.c.i.b.p9 r9 = (b.l.a.c.i.b.p9) r9
            r11 = r7
            b.l.a.c.i.b.e5 r11 = (b.l.a.c.i.b.e5) r11
            r11.C0(r8, r9)
            goto L_0x026d
        L_0x0111:
            android.os.Parcelable$Creator<b.l.a.c.i.b.p9> r8 = b.l.a.c.i.b.p9.CREATOR
            android.os.Parcelable r8 = b.l.a.c.f.i.o0.a(r9, r8)
            b.l.a.c.i.b.p9 r8 = (b.l.a.c.i.b.p9) r8
            r9 = r7
            b.l.a.c.i.b.e5 r9 = (b.l.a.c.i.b.e5) r9
            java.lang.String r8 = r9.Q(r8)
            r10.writeNoException()
            r10.writeString(r8)
            goto L_0x0270
        L_0x0128:
            long r2 = r9.readLong()
            java.lang.String r4 = r9.readString()
            java.lang.String r5 = r9.readString()
            java.lang.String r6 = r9.readString()
            r1 = r7
            b.l.a.c.i.b.e5 r1 = (b.l.a.c.i.b.e5) r1
            r1.D0(r2, r4, r5, r6)
            goto L_0x026d
        L_0x0140:
            android.os.Parcelable$Creator<b.l.a.c.i.b.s> r8 = b.l.a.c.i.b.s.CREATOR
            android.os.Parcelable r8 = b.l.a.c.f.i.o0.a(r9, r8)
            b.l.a.c.i.b.s r8 = (b.l.a.c.i.b.s) r8
            java.lang.String r9 = r9.readString()
            r11 = r7
            b.l.a.c.i.b.e5 r11 = (b.l.a.c.i.b.e5) r11
            byte[] r8 = r11.l1(r8, r9)
            r10.writeNoException()
            r10.writeByteArray(r8)
            goto L_0x0270
        L_0x015b:
            android.os.Parcelable$Creator<b.l.a.c.i.b.p9> r8 = b.l.a.c.i.b.p9.CREATOR
            android.os.Parcelable r8 = b.l.a.c.f.i.o0.a(r9, r8)
            b.l.a.c.i.b.p9 r8 = (b.l.a.c.i.b.p9) r8
            int r9 = r9.readInt()
            if (r9 == 0) goto L_0x016a
            r11 = r0
        L_0x016a:
            r9 = r7
            b.l.a.c.i.b.e5 r9 = (b.l.a.c.i.b.e5) r9
            r9.n(r8)
            java.lang.String r2 = r8.f4218h
            java.util.Objects.requireNonNull(r2, r1)
            b.l.a.c.i.b.d9 r1 = r9.a
            b.l.a.c.i.b.i4 r1 = r1.d()
            b.l.a.c.i.b.b5 r3 = new b.l.a.c.i.b.b5
            r3.<init>(r9, r2)
            java.util.concurrent.Future r1 = r1.p(r3)
            java.util.concurrent.FutureTask r1 = (java.util.concurrent.FutureTask) r1
            java.lang.Object r1 = r1.get()     // Catch:{ InterruptedException -> 0x01ba, ExecutionException -> 0x01b8 }
            java.util.List r1 = (java.util.List) r1     // Catch:{ InterruptedException -> 0x01ba, ExecutionException -> 0x01b8 }
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ InterruptedException -> 0x01ba, ExecutionException -> 0x01b8 }
            int r3 = r1.size()     // Catch:{ InterruptedException -> 0x01ba, ExecutionException -> 0x01b8 }
            r2.<init>(r3)     // Catch:{ InterruptedException -> 0x01ba, ExecutionException -> 0x01b8 }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ InterruptedException -> 0x01ba, ExecutionException -> 0x01b8 }
        L_0x0199:
            boolean r3 = r1.hasNext()     // Catch:{ InterruptedException -> 0x01ba, ExecutionException -> 0x01b8 }
            if (r3 == 0) goto L_0x01cf
            java.lang.Object r3 = r1.next()     // Catch:{ InterruptedException -> 0x01ba, ExecutionException -> 0x01b8 }
            b.l.a.c.i.b.i9 r3 = (b.l.a.c.i.b.i9) r3     // Catch:{ InterruptedException -> 0x01ba, ExecutionException -> 0x01b8 }
            if (r11 != 0) goto L_0x01af
            java.lang.String r4 = r3.c     // Catch:{ InterruptedException -> 0x01ba, ExecutionException -> 0x01b8 }
            boolean r4 = b.l.a.c.i.b.k9.F(r4)     // Catch:{ InterruptedException -> 0x01ba, ExecutionException -> 0x01b8 }
            if (r4 != 0) goto L_0x0199
        L_0x01af:
            b.l.a.c.i.b.g9 r4 = new b.l.a.c.i.b.g9     // Catch:{ InterruptedException -> 0x01ba, ExecutionException -> 0x01b8 }
            r4.<init>(r3)     // Catch:{ InterruptedException -> 0x01ba, ExecutionException -> 0x01b8 }
            r2.add(r4)     // Catch:{ InterruptedException -> 0x01ba, ExecutionException -> 0x01b8 }
            goto L_0x0199
        L_0x01b8:
            r11 = move-exception
            goto L_0x01bb
        L_0x01ba:
            r11 = move-exception
        L_0x01bb:
            b.l.a.c.i.b.d9 r9 = r9.a
            b.l.a.c.i.b.k3 r9 = r9.a()
            b.l.a.c.i.b.i3 r9 = r9.f
            java.lang.String r8 = r8.f4218h
            java.lang.Object r8 = b.l.a.c.i.b.k3.t(r8)
            java.lang.String r1 = "Failed to get user properties. appId"
            r9.c(r1, r8, r11)
            r2 = 0
        L_0x01cf:
            r10.writeNoException()
            r10.writeTypedList(r2)
            goto L_0x0270
        L_0x01d7:
            android.os.Parcelable$Creator<b.l.a.c.i.b.p9> r8 = b.l.a.c.i.b.p9.CREATOR
            android.os.Parcelable r8 = b.l.a.c.f.i.o0.a(r9, r8)
            b.l.a.c.i.b.p9 r8 = (b.l.a.c.i.b.p9) r8
            r9 = r7
            b.l.a.c.i.b.e5 r9 = (b.l.a.c.i.b.e5) r9
            r9.n(r8)
            b.l.a.c.i.b.u4 r11 = new b.l.a.c.i.b.u4
            r11.<init>(r9, r8)
            r9.k(r11)
            goto L_0x026d
        L_0x01ef:
            android.os.Parcelable$Creator<b.l.a.c.i.b.s> r8 = b.l.a.c.i.b.s.CREATOR
            android.os.Parcelable r8 = b.l.a.c.f.i.o0.a(r9, r8)
            b.l.a.c.i.b.s r8 = (b.l.a.c.i.b.s) r8
            java.lang.String r11 = r9.readString()
            r9.readString()
            r9 = r7
            b.l.a.c.i.b.e5 r9 = (b.l.a.c.i.b.e5) r9
            java.util.Objects.requireNonNull(r8, r1)
            b.l.a.c.b.a.x(r11)
            r9.o(r11, r0)
            b.l.a.c.i.b.x4 r1 = new b.l.a.c.i.b.x4
            r1.<init>(r9, r8, r11)
            r9.k(r1)
            goto L_0x026d
        L_0x0213:
            android.os.Parcelable$Creator<b.l.a.c.i.b.p9> r8 = b.l.a.c.i.b.p9.CREATOR
            android.os.Parcelable r8 = b.l.a.c.f.i.o0.a(r9, r8)
            b.l.a.c.i.b.p9 r8 = (b.l.a.c.i.b.p9) r8
            r9 = r7
            b.l.a.c.i.b.e5 r9 = (b.l.a.c.i.b.e5) r9
            r9.n(r8)
            b.l.a.c.i.b.c5 r11 = new b.l.a.c.i.b.c5
            r11.<init>(r9, r8)
            r9.k(r11)
            goto L_0x026d
        L_0x022a:
            android.os.Parcelable$Creator<b.l.a.c.i.b.g9> r8 = b.l.a.c.i.b.g9.CREATOR
            android.os.Parcelable r8 = b.l.a.c.f.i.o0.a(r9, r8)
            b.l.a.c.i.b.g9 r8 = (b.l.a.c.i.b.g9) r8
            android.os.Parcelable$Creator<b.l.a.c.i.b.p9> r11 = b.l.a.c.i.b.p9.CREATOR
            android.os.Parcelable r9 = b.l.a.c.f.i.o0.a(r9, r11)
            b.l.a.c.i.b.p9 r9 = (b.l.a.c.i.b.p9) r9
            r11 = r7
            b.l.a.c.i.b.e5 r11 = (b.l.a.c.i.b.e5) r11
            java.util.Objects.requireNonNull(r8, r1)
            r11.n(r9)
            b.l.a.c.i.b.z4 r1 = new b.l.a.c.i.b.z4
            r1.<init>(r11, r8, r9)
            r11.k(r1)
            goto L_0x026d
        L_0x024c:
            android.os.Parcelable$Creator<b.l.a.c.i.b.s> r8 = b.l.a.c.i.b.s.CREATOR
            android.os.Parcelable r8 = b.l.a.c.f.i.o0.a(r9, r8)
            b.l.a.c.i.b.s r8 = (b.l.a.c.i.b.s) r8
            android.os.Parcelable$Creator<b.l.a.c.i.b.p9> r11 = b.l.a.c.i.b.p9.CREATOR
            android.os.Parcelable r9 = b.l.a.c.f.i.o0.a(r9, r11)
            b.l.a.c.i.b.p9 r9 = (b.l.a.c.i.b.p9) r9
            r11 = r7
            b.l.a.c.i.b.e5 r11 = (b.l.a.c.i.b.e5) r11
            java.util.Objects.requireNonNull(r8, r1)
            r11.n(r9)
            b.l.a.c.i.b.w4 r1 = new b.l.a.c.i.b.w4
            r1.<init>(r11, r8, r9)
            r11.k(r1)
        L_0x026d:
            r10.writeNoException()
        L_0x0270:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: b.l.a.c.i.b.z2.g(int, android.os.Parcel, android.os.Parcel, int):boolean");
    }
}
