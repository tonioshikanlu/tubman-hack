package e.a.a.a;

import e.a.a.a.i0;
import e.a.l;
import e.f;
import e.x.b.a;
import e.x.c.i;
import e.x.c.k;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.List;

public final class g0 extends k implements a<Type> {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ int f7538h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ i0.a f7539i;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ f f7540j;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public g0(int i2, i0.a aVar, f fVar, l lVar) {
        super(0);
        this.f7538h = i2;
        this.f7539i = aVar;
        this.f7540j = fVar;
    }

    public Object e() {
        Type type;
        Type A = this.f7539i.f7549h.A();
        if (A instanceof Class) {
            Class cls = (Class) A;
            if (cls.isArray()) {
                type = cls.getComponentType();
                i.d(type, "javaType.componentType");
            } else {
                type = Object.class;
            }
        } else if (A instanceof GenericArrayType) {
            if (this.f7538h == 0) {
                type = ((GenericArrayType) A).getGenericComponentType();
            } else {
                StringBuilder y = b.e.a.a.a.y("Array type has been queried for a non-0th argument: ");
                y.append(this.f7539i.f7549h);
                throw new l0(y.toString());
            }
        } else if (A instanceof ParameterizedType) {
            type = (Type) ((List) this.f7540j.getValue()).get(this.f7538h);
            if (type instanceof WildcardType) {
                WildcardType wildcardType = (WildcardType) type;
                Type[] lowerBounds = wildcardType.getLowerBounds();
                i.d(lowerBounds, "argument.lowerBounds");
                Type type2 = (Type) b.q.a.a.q0(lowerBounds);
                if (type2 != null) {
                    type = type2;
                } else {
                    Type[] upperBounds = wildcardType.getUpperBounds();
                    i.d(upperBounds, "argument.upperBounds");
                    type = (Type) b.q.a.a.p0(upperBounds);
                }
            }
        } else {
            StringBuilder y2 = b.e.a.a.a.y("Non-generic type has been queried for arguments: ");
            y2.append(this.f7539i.f7549h);
            throw new l0(y2.toString());
        }
        i.d(type, "when (val javaType = jav…s\")\n                    }");
        return type;
    }
}
