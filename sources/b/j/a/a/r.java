package b.j.a.a;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.ANNOTATION_TYPE, ElementType.METHOD, ElementType.FIELD, ElementType.TYPE, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
public @interface r {

    public enum a {
        ALWAYS,
        NON_NULL,
        NON_ABSENT,
        NON_EMPTY,
        NON_DEFAULT,
        f1349m,
        USE_DEFAULTS
    }

    public static class b implements Object<r> {

        /* renamed from: l  reason: collision with root package name */
        public static final b f1352l;

        /* renamed from: h  reason: collision with root package name */
        public final a f1353h;

        /* renamed from: i  reason: collision with root package name */
        public final a f1354i;

        /* renamed from: j  reason: collision with root package name */
        public final Class<?> f1355j;

        /* renamed from: k  reason: collision with root package name */
        public final Class<?> f1356k;

        static {
            a aVar = a.USE_DEFAULTS;
            f1352l = new b(aVar, aVar, (Class<?>) null, (Class<?>) null);
        }

        public b(a aVar, a aVar2, Class<?> cls, Class<?> cls2) {
            a aVar3 = a.USE_DEFAULTS;
            this.f1353h = aVar == null ? aVar3 : aVar;
            this.f1354i = aVar2 == null ? aVar3 : aVar2;
            this.f1355j = cls == Void.class ? null : cls;
            this.f1356k = cls2 == Void.class ? null : cls2;
        }

        public b a(b bVar) {
            a aVar = a.USE_DEFAULTS;
            if (!(bVar == null || bVar == f1352l)) {
                a aVar2 = bVar.f1353h;
                a aVar3 = bVar.f1354i;
                Class<?> cls = bVar.f1355j;
                Class<?> cls2 = bVar.f1356k;
                a aVar4 = this.f1353h;
                boolean z = true;
                boolean z2 = (aVar2 == aVar4 || aVar2 == aVar) ? false : true;
                a aVar5 = this.f1354i;
                boolean z3 = (aVar3 == aVar5 || aVar3 == aVar) ? false : true;
                Class<?> cls3 = this.f1355j;
                if (cls == cls3 && cls2 == cls3) {
                    z = false;
                }
                if (z2) {
                    return z3 ? new b(aVar2, aVar3, cls, cls2) : new b(aVar2, aVar5, cls, cls2);
                }
                if (z3) {
                    return new b(aVar4, aVar3, cls, cls2);
                }
                if (z) {
                    return new b(aVar4, aVar5, cls, cls2);
                }
            }
            return this;
        }

        public b b(a aVar) {
            return aVar == this.f1353h ? this : new b(aVar, this.f1354i, this.f1355j, this.f1356k);
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj == null || obj.getClass() != b.class) {
                return false;
            }
            b bVar = (b) obj;
            return bVar.f1353h == this.f1353h && bVar.f1354i == this.f1354i && bVar.f1355j == this.f1355j && bVar.f1356k == this.f1356k;
        }

        public int hashCode() {
            return this.f1354i.hashCode() + (this.f1353h.hashCode() << 2);
        }

        public String toString() {
            StringBuilder x = b.e.a.a.a.x(80, "JsonInclude.Value(value=");
            x.append(this.f1353h);
            x.append(",content=");
            x.append(this.f1354i);
            if (this.f1355j != null) {
                x.append(",valueFilter=");
                b.e.a.a.a.I(this.f1355j, x, ".class");
            }
            if (this.f1356k != null) {
                x.append(",contentFilter=");
                b.e.a.a.a.I(this.f1356k, x, ".class");
            }
            x.append(')');
            return x.toString();
        }
    }

    a content() default a.ALWAYS;

    Class<?> contentFilter() default Void.class;

    a value() default a.ALWAYS;

    Class<?> valueFilter() default Void.class;
}
