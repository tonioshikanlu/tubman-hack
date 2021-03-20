package b.p.a;

import b.l.f.x.a.g;
import java.io.Closeable;
import java.io.IOException;
import java.util.Arrays;
import o.e;
import o.h;

public abstract class q implements Closeable {

    /* renamed from: h  reason: collision with root package name */
    public int f6384h;

    /* renamed from: i  reason: collision with root package name */
    public int[] f6385i = new int[32];

    /* renamed from: j  reason: collision with root package name */
    public String[] f6386j = new String[32];

    /* renamed from: k  reason: collision with root package name */
    public int[] f6387k = new int[32];

    public static final class a {
        public final String[] a;

        /* renamed from: b  reason: collision with root package name */
        public final o.q f6388b;

        public a(String[] strArr, o.q qVar) {
            this.a = strArr;
            this.f6388b = qVar;
        }

        public static a a(String... strArr) {
            try {
                h[] hVarArr = new h[strArr.length];
                e eVar = new e();
                for (int i2 = 0; i2 < strArr.length; i2++) {
                    s.s0(eVar, strArr[i2]);
                    eVar.readByte();
                    hVarArr[i2] = eVar.e0();
                }
                return new a((String[]) strArr.clone(), o.q.f10477j.c(hVarArr));
            } catch (IOException e2) {
                throw new AssertionError(e2);
            }
        }
    }

    public enum b {
        BEGIN_ARRAY,
        END_ARRAY,
        BEGIN_OBJECT,
        END_OBJECT,
        NAME,
        STRING,
        NUMBER,
        BOOLEAN,
        NULL,
        END_DOCUMENT
    }

    public final String H() {
        return g.y(this.f6384h, this.f6385i, this.f6386j, this.f6387k);
    }

    public abstract boolean N();

    public abstract double O();

    public abstract int S();

    public abstract <T> T Y();

    public abstract void b();

    public abstract void e();

    public abstract String e0();

    public abstract b g0();

    public final void k0(int i2) {
        int i3 = this.f6384h;
        int[] iArr = this.f6385i;
        if (i3 == iArr.length) {
            if (i3 != 256) {
                this.f6385i = Arrays.copyOf(iArr, iArr.length * 2);
                String[] strArr = this.f6386j;
                this.f6386j = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
                int[] iArr2 = this.f6387k;
                this.f6387k = Arrays.copyOf(iArr2, iArr2.length * 2);
            } else {
                StringBuilder y = b.e.a.a.a.y("Nesting too deep at ");
                y.append(H());
                throw new n(y.toString());
            }
        }
        int[] iArr3 = this.f6385i;
        int i4 = this.f6384h;
        this.f6384h = i4 + 1;
        iArr3[i4] = i2;
    }

    public abstract int m0(a aVar);

    public abstract void n0();

    public abstract void o0();

    public final o p0(String str) {
        StringBuilder B = b.e.a.a.a.B(str, " at path ");
        B.append(H());
        throw new o(B.toString());
    }

    public abstract void q();

    public abstract void z();
}
