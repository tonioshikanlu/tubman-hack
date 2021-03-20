package e.a.a.a.x0;

import e.x.b.a;
import e.x.c.k;
import java.util.Arrays;
import java.util.Map;

public final class c extends k implements a<Integer> {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ Map f7622h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c(Map map) {
        super(0);
        this.f7622h = map;
    }

    public Object e() {
        int i2 = 0;
        for (Map.Entry entry : this.f7622h.entrySet()) {
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            i2 += (value instanceof boolean[] ? Arrays.hashCode((boolean[]) value) : value instanceof char[] ? Arrays.hashCode((char[]) value) : value instanceof byte[] ? Arrays.hashCode((byte[]) value) : value instanceof short[] ? Arrays.hashCode((short[]) value) : value instanceof int[] ? Arrays.hashCode((int[]) value) : value instanceof float[] ? Arrays.hashCode((float[]) value) : value instanceof long[] ? Arrays.hashCode((long[]) value) : value instanceof double[] ? Arrays.hashCode((double[]) value) : value instanceof Object[] ? Arrays.hashCode((Object[]) value) : value.hashCode()) ^ (str.hashCode() * 127);
        }
        return Integer.valueOf(i2);
    }
}
