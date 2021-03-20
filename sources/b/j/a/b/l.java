package b.j.a.b;

public enum l {
    NOT_AVAILABLE((String) null, -1),
    START_OBJECT("{", 1),
    END_OBJECT("}", 2),
    START_ARRAY("[", 3),
    END_ARRAY("]", 4),
    FIELD_NAME((String) null, 5),
    VALUE_EMBEDDED_OBJECT((String) null, 12),
    VALUE_STRING((String) null, 6),
    VALUE_NUMBER_INT((String) null, 7),
    VALUE_NUMBER_FLOAT((String) null, 8),
    VALUE_TRUE("true", 9),
    VALUE_FALSE("false", 10),
    VALUE_NULL("null", 11);
    

    /* renamed from: h  reason: collision with root package name */
    public final String f1438h;

    /* renamed from: i  reason: collision with root package name */
    public final char[] f1439i;

    /* renamed from: j  reason: collision with root package name */
    public final byte[] f1440j;

    /* renamed from: k  reason: collision with root package name */
    public final int f1441k;

    /* renamed from: l  reason: collision with root package name */
    public final boolean f1442l;

    /* renamed from: m  reason: collision with root package name */
    public final boolean f1443m;

    /* renamed from: n  reason: collision with root package name */
    public final boolean f1444n;

    /* renamed from: o  reason: collision with root package name */
    public final boolean f1445o;

    /* access modifiers changed from: public */
    l(String str, int i2) {
        boolean z = false;
        if (str == null) {
            this.f1438h = null;
            this.f1439i = null;
            this.f1440j = null;
        } else {
            this.f1438h = str;
            char[] charArray = str.toCharArray();
            this.f1439i = charArray;
            int length = charArray.length;
            this.f1440j = new byte[length];
            for (int i3 = 0; i3 < length; i3++) {
                this.f1440j[i3] = (byte) this.f1439i[i3];
            }
        }
        this.f1441k = i2;
        this.f1444n = i2 == 7 || i2 == 8;
        boolean z2 = i2 == 1 || i2 == 3;
        this.f1442l = z2;
        boolean z3 = i2 == 2 || i2 == 4;
        this.f1443m = z3;
        if (!z2 && !z3 && i2 != 5 && i2 != -1) {
            z = true;
        }
        this.f1445o = z;
    }
}
