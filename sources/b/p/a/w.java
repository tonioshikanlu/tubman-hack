package b.p.a;

import b.l.f.x.a.g;
import b.p.a.l;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public final class w<K, V> extends l<Map<K, V>> {
    public static final l.a c = new a();
    public final l<K> a;

    /* renamed from: b  reason: collision with root package name */
    public final l<V> f6441b;

    public class a implements l.a {
        public l<?> a(Type type, Set<? extends Annotation> set, x xVar) {
            Class<?> B;
            Type[] typeArr;
            if (!set.isEmpty() || (B = g.B(type)) != Map.class) {
                return null;
            }
            Class<Object> cls = Object.class;
            Class<String> cls2 = String.class;
            if (type == Properties.class) {
                typeArr = new Type[]{cls2, cls2};
            } else {
                Type E = g.E(type, B, Map.class);
                typeArr = E instanceof ParameterizedType ? ((ParameterizedType) E).getActualTypeArguments() : new Type[]{cls, cls};
            }
            return new w(xVar, typeArr[0], typeArr[1]).c();
        }
    }

    public w(x xVar, Type type, Type type2) {
        this.a = xVar.b(type);
        this.f6441b = xVar.b(type2);
    }

    public Object a(q qVar) {
        v vVar = new v();
        qVar.e();
        while (qVar.N()) {
            r rVar = (r) qVar;
            if (rVar.N()) {
                rVar.f6404q = rVar.v0();
                rVar.f6401n = 11;
            }
            K a2 = this.a.a(qVar);
            V a3 = this.f6441b.a(qVar);
            Object put = vVar.put(a2, a3);
            if (put != null) {
                throw new n("Map key '" + a2 + "' has multiple values at path " + qVar.H() + ": " + put + " and " + a3);
            }
        }
        qVar.z();
        return vVar;
    }

    public void e(u uVar, Object obj) {
        uVar.e();
        for (Map.Entry entry : ((Map) obj).entrySet()) {
            if (entry.getKey() != null) {
                int Y = uVar.Y();
                if (Y == 5 || Y == 3) {
                    uVar.f6414l = true;
                    this.a.e(uVar, entry.getKey());
                    this.f6441b.e(uVar, entry.getValue());
                } else {
                    throw new IllegalStateException("Nesting problem.");
                }
            } else {
                StringBuilder y = b.e.a.a.a.y("Map key is null at ");
                y.append(uVar.N());
                throw new n(y.toString());
            }
        }
        uVar.H();
    }

    public String toString() {
        StringBuilder y = b.e.a.a.a.y("JsonAdapter(");
        y.append(this.a);
        y.append("=");
        y.append(this.f6441b);
        y.append(")");
        return y.toString();
    }
}
