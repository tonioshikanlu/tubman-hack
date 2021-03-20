package b.l.a.c.f.e;

import b.l.a.c.f.e.e0;
import java.security.GeneralSecurityException;

public class e2<PrimitiveT, KeyProtoT extends e0> implements d2<PrimitiveT> {
    public final i2<KeyProtoT> a;

    /* renamed from: b  reason: collision with root package name */
    public final Class<PrimitiveT> f2937b;

    public e2(i2<KeyProtoT> i2Var, Class<PrimitiveT> cls) {
        if (i2Var.f().contains(cls) || Void.class.equals(cls)) {
            this.a = i2Var;
            this.f2937b = cls;
            return;
        }
        throw new IllegalArgumentException(String.format("Given internalKeyMananger %s does not support primitive class %s", new Object[]{i2Var.toString(), cls.getName()}));
    }

    public final PrimitiveT a(um umVar) {
        try {
            return d(this.a.c(umVar));
        } catch (l e2) {
            String name = this.a.a.getName();
            throw new GeneralSecurityException(name.length() != 0 ? "Failures parsing proto of type ".concat(name) : new String("Failures parsing proto of type "), e2);
        }
    }

    /* JADX WARNING: type inference failed for: r5v3, types: [b.l.a.c.f.e.e0, java.lang.Object] */
    public final e0 b(um umVar) {
        try {
            g2 g2 = this.a.g();
            e0 b2 = g2.b(umVar);
            g2.a(b2);
            return g2.c(b2);
        } catch (l e2) {
            String name = this.a.g().a.getName();
            throw new GeneralSecurityException(name.length() != 0 ? "Failures parsing proto of type ".concat(name) : new String("Failures parsing proto of type "), e2);
        }
    }

    /* JADX WARNING: type inference failed for: r5v3, types: [b.l.a.c.f.e.e0, java.lang.Object] */
    public final h9 c(um umVar) {
        try {
            g2 g2 = this.a.g();
            e0 b2 = g2.b(umVar);
            g2.a(b2);
            ? c = g2.c(b2);
            e9 v = h9.v();
            String a2 = this.a.a();
            if (v.f3216j) {
                v.a();
                v.f3216j = false;
            }
            v.f3215i.zzb = a2;
            um n2 = c.n();
            if (v.f3216j) {
                v.a();
                v.f3216j = false;
            }
            v.f3215i.zze = n2;
            g9 b3 = this.a.b();
            if (v.f3216j) {
                v.a();
                v.f3216j = false;
            }
            h9.A(v.f3215i, b3);
            return (h9) v.c();
        } catch (l e2) {
            throw new GeneralSecurityException("Unexpected proto", e2);
        }
    }

    public final PrimitiveT d(KeyProtoT keyprotot) {
        if (!Void.class.equals(this.f2937b)) {
            this.a.d(keyprotot);
            return this.a.e(keyprotot, this.f2937b);
        }
        throw new GeneralSecurityException("Cannot create a primitive for Void");
    }
}
