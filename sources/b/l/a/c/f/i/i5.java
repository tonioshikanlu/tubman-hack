package b.l.a.c.f.i;

public enum i5 {
    DOUBLE(0, 1, r7),
    FLOAT(1, 1, r14),
    INT64(2, 1, r6),
    UINT64(3, 1, r6),
    INT32(4, 1, r9),
    FIXED64(5, 1, r6),
    FIXED32(6, 1, r9),
    BOOL(7, 1, r10),
    STRING(8, 1, r11),
    MESSAGE(9, 1, r12),
    BYTES(10, 1, r13),
    UINT32(11, 1, r6),
    ENUM(12, 1, r21),
    SFIXED32(13, 1, r6),
    SFIXED64(14, 1, r8),
    SINT32(15, 1, r9),
    SINT64(16, 1, r8),
    GROUP(17, 1, r12),
    DOUBLE_LIST(18, 2, r7),
    FLOAT_LIST(19, 2, r14),
    INT64_LIST(20, 2, r6),
    UINT64_LIST(21, 2, r6),
    INT32_LIST(22, 2, r9),
    FIXED64_LIST(23, 2, r8),
    FIXED32_LIST(24, 2, r9),
    BOOL_LIST(25, 2, r10),
    STRING_LIST(26, 2, r11),
    MESSAGE_LIST(27, 2, r12),
    BYTES_LIST(28, 2, r13),
    UINT32_LIST(29, 2, r9),
    ENUM_LIST(30, 2, r21),
    SFIXED32_LIST(31, 2, r9),
    SFIXED64_LIST(32, 2, r8),
    SINT32_LIST(33, 2, r9),
    SINT64_LIST(34, 2, r8),
    DOUBLE_LIST_PACKED(35, 3, r7),
    FLOAT_LIST_PACKED(36, 3, r14),
    INT64_LIST_PACKED(37, 3, r6),
    UINT64_LIST_PACKED(38, 3, r6),
    INT32_LIST_PACKED(39, 3, r9),
    FIXED64_LIST_PACKED(40, 3, r8),
    FIXED32_LIST_PACKED(41, 3, r9),
    BOOL_LIST_PACKED(42, 3, r10),
    UINT32_LIST_PACKED(43, 3, r9),
    ENUM_LIST_PACKED(44, 3, r21),
    SFIXED32_LIST_PACKED(45, 3, r6),
    SFIXED64_LIST_PACKED(46, 3, r7),
    SINT32_LIST_PACKED(47, 3, r6),
    SINT64_LIST_PACKED(48, 3, r7),
    GROUP_LIST(49, 2, r12),
    MAP(50, 4, z5.VOID);
    
    public static final i5[] h0 = null;

    /* renamed from: h  reason: collision with root package name */
    public final int f3607h;

    /* access modifiers changed from: public */
    static {
        i5[] values = values();
        h0 = new i5[51];
        for (int i2 = 0; i2 < 51; i2++) {
            i5 i5Var = values[i2];
            h0[i5Var.f3607h] = i5Var;
        }
    }

    /* access modifiers changed from: public */
    i5(int i2, int i3, z5 z5Var) {
        this.f3607h = i2;
        z5 z5Var2 = z5.VOID;
        int i4 = i3 - 1;
        if (i4 == 1 || i4 == 3) {
            Class<?> cls = z5Var.f3840h;
        }
        if (i3 == 1) {
            z5Var.ordinal();
        }
    }
}
