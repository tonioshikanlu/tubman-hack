package b.l.e.e0;

import b.e.a.a.a;
import b.l.e.r;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.EnumSet;

public class j implements t<T> {
    public final /* synthetic */ Type a;

    public j(g gVar, Type type) {
        this.a = type;
    }

    public T a() {
        Type type = this.a;
        if (type instanceof ParameterizedType) {
            Type type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
            if (type2 instanceof Class) {
                return EnumSet.noneOf((Class) type2);
            }
            StringBuilder y = a.y("Invalid EnumSet type: ");
            y.append(this.a.toString());
            throw new r(y.toString());
        }
        StringBuilder y2 = a.y("Invalid EnumSet type: ");
        y2.append(this.a.toString());
        throw new r(y2.toString());
    }
}
