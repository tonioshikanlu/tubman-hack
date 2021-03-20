package b.l.f.e0.c;

public enum c {
    DATA_MASK_000 {
        public boolean d(int i2, int i3) {
            return ((i2 + i3) & 1) == 0;
        }
    },
    DATA_MASK_001 {
        public boolean d(int i2, int i3) {
            return (i2 & 1) == 0;
        }
    },
    DATA_MASK_010 {
        public boolean d(int i2, int i3) {
            return i3 % 3 == 0;
        }
    },
    DATA_MASK_011 {
        public boolean d(int i2, int i3) {
            return (i2 + i3) % 3 == 0;
        }
    },
    DATA_MASK_100 {
        public boolean d(int i2, int i3) {
            return (((i3 / 3) + (i2 / 2)) & 1) == 0;
        }
    },
    DATA_MASK_101 {
        public boolean d(int i2, int i3) {
            return (i2 * i3) % 6 == 0;
        }
    },
    DATA_MASK_110 {
        public boolean d(int i2, int i3) {
            return (i2 * i3) % 6 < 3;
        }
    },
    DATA_MASK_111 {
        public boolean d(int i2, int i3) {
            return ((((i2 * i3) % 3) + (i2 + i3)) & 1) == 0;
        }
    };

    /* access modifiers changed from: public */
    c(a aVar) {
    }

    public abstract boolean d(int i2, int i3);

    public final void e(b.l.f.y.b bVar, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            for (int i4 = 0; i4 < i2; i4++) {
                if (d(i3, i4)) {
                    bVar.a(i4, i3);
                }
            }
        }
    }
}
