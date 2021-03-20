package e.a.a.a.y0.h;

public enum y {
    DOUBLE(z.DOUBLE, 1),
    FLOAT(z.FLOAT, 5),
    INT64(r5, 0),
    UINT64(r5, 0),
    INT32(r11, 0),
    FIXED64(r5, 1),
    FIXED32(r11, 5),
    BOOL(z.BOOLEAN, 0),
    STRING(z.STRING, 2) {
        public boolean d() {
            return false;
        }
    },
    GROUP(r13, 3) {
        public boolean d() {
            return false;
        }
    },
    MESSAGE(r13, 2) {
        public boolean d() {
            return false;
        }
    },
    BYTES(z.BYTE_STRING, 2) {
        public boolean d() {
            return false;
        }
    },
    UINT32(r11, 0),
    ENUM(z.ENUM, 0),
    SFIXED32(r11, 5),
    SFIXED64(r5, 1),
    SINT32(r11, 0),
    SINT64(r5, 0);
    

    /* renamed from: h  reason: collision with root package name */
    public final z f9300h;

    /* renamed from: i  reason: collision with root package name */
    public final int f9301i;

    /* access modifiers changed from: public */
    y(z zVar, int i2) {
        this.f9300h = zVar;
        this.f9301i = i2;
    }

    /* access modifiers changed from: public */
    y(z zVar, int i2, x xVar) {
        this.f9300h = zVar;
        this.f9301i = i2;
    }

    public boolean d() {
        return true;
    }
}
