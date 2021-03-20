package b.l.a.d.a.b;

import androidx.annotation.Nullable;

public final class s1 {
    public final int a;

    /* renamed from: b  reason: collision with root package name */
    public final String f4622b;
    public final long c;
    public final long d;

    /* renamed from: e  reason: collision with root package name */
    public final int f4623e;

    public s1() {
    }

    public s1(int i2, @Nullable String str, long j2, long j3, int i3) {
        this.a = i2;
        this.f4622b = str;
        this.c = j2;
        this.d = j3;
        this.f4623e = i3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0011, code lost:
        r1 = r7.f4622b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r8) {
        /*
            r7 = this;
            r0 = 1
            if (r8 != r7) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r8 instanceof b.l.a.d.a.b.s1
            r2 = 0
            if (r1 == 0) goto L_0x003a
            b.l.a.d.a.b.s1 r8 = (b.l.a.d.a.b.s1) r8
            int r1 = r7.a
            int r3 = r8.a
            if (r1 != r3) goto L_0x003a
            java.lang.String r1 = r7.f4622b
            if (r1 != 0) goto L_0x001a
            java.lang.String r1 = r8.f4622b
            if (r1 != 0) goto L_0x003a
            goto L_0x0023
        L_0x001a:
            java.lang.String r3 = r8.f4622b
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L_0x0023
            goto L_0x003a
        L_0x0023:
            long r3 = r7.c
            long r5 = r8.c
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 != 0) goto L_0x003a
            long r3 = r7.d
            long r5 = r8.d
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 != 0) goto L_0x003a
            int r1 = r7.f4623e
            int r8 = r8.f4623e
            if (r1 != r8) goto L_0x003a
            return r0
        L_0x003a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: b.l.a.d.a.b.s1.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        int i2 = (this.a ^ 1000003) * 1000003;
        String str = this.f4622b;
        int hashCode = str == null ? 0 : str.hashCode();
        long j2 = this.c;
        long j3 = this.d;
        return ((((((i2 ^ hashCode) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ ((int) ((j3 >>> 32) ^ j3))) * 1000003) ^ this.f4623e;
    }

    public String toString() {
        int i2 = this.a;
        String str = this.f4622b;
        long j2 = this.c;
        long j3 = this.d;
        int i3 = this.f4623e;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 157);
        sb.append("SliceCheckpoint{fileExtractionStatus=");
        sb.append(i2);
        sb.append(", filePath=");
        sb.append(str);
        sb.append(", fileOffset=");
        sb.append(j2);
        sb.append(", remainingBytes=");
        sb.append(j3);
        sb.append(", previousChunk=");
        sb.append(i3);
        sb.append("}");
        return sb.toString();
    }
}
