package e.z;

import e.x.c.i;
import java.util.Random;

public final class b extends a {
    public final a c = new a();

    public static final class a extends ThreadLocal<Random> {
        public Object initialValue() {
            return new Random();
        }
    }

    public Random b() {
        Object obj = this.c.get();
        i.d(obj, "implStorage.get()");
        return (Random) obj;
    }
}
