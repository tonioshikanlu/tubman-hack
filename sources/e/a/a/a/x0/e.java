package e.a.a.a.x0;

import e.x.b.l;
import e.x.c.i;
import e.x.c.k;
import java.util.Arrays;
import java.util.Map;

public final class e extends k implements l<Map.Entry<? extends String, ? extends Object>, CharSequence> {

    /* renamed from: h  reason: collision with root package name */
    public static final e f7625h = new e();

    public e() {
        super(1);
    }

    public Object invoke(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        i.e(entry, "entry");
        String str = (String) entry.getKey();
        Object value = entry.getValue();
        String arrays = value instanceof boolean[] ? Arrays.toString((boolean[]) value) : value instanceof char[] ? Arrays.toString((char[]) value) : value instanceof byte[] ? Arrays.toString((byte[]) value) : value instanceof short[] ? Arrays.toString((short[]) value) : value instanceof int[] ? Arrays.toString((int[]) value) : value instanceof float[] ? Arrays.toString((float[]) value) : value instanceof long[] ? Arrays.toString((long[]) value) : value instanceof double[] ? Arrays.toString((double[]) value) : value instanceof Object[] ? Arrays.toString((Object[]) value) : value.toString();
        return str + '=' + arrays;
    }
}
