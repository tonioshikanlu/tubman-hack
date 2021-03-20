package b.l.f.e0.c;

public enum h {
    TERMINATOR(new int[]{0, 0, 0}, 0),
    NUMERIC(new int[]{10, 12, 14}, 1),
    ALPHANUMERIC(new int[]{9, 11, 13}, 2),
    STRUCTURED_APPEND(new int[]{0, 0, 0}, 3),
    BYTE(new int[]{8, 16, 16}, 4),
    ECI(new int[]{0, 0, 0}, 7),
    KANJI(new int[]{8, 10, 12}, 8),
    FNC1_FIRST_POSITION(new int[]{0, 0, 0}, 5),
    FNC1_SECOND_POSITION(new int[]{0, 0, 0}, 9),
    HANZI(new int[]{8, 10, 12}, 13);
    

    /* renamed from: h  reason: collision with root package name */
    public final int[] f5728h;

    /* renamed from: i  reason: collision with root package name */
    public final int f5729i;

    /* access modifiers changed from: public */
    h(int[] iArr, int i2) {
        this.f5728h = iArr;
        this.f5729i = i2;
    }

    public int d(j jVar) {
        int i2 = jVar.a;
        return this.f5728h[i2 <= 9 ? 0 : i2 <= 26 ? (char) 1 : 2];
    }
}
