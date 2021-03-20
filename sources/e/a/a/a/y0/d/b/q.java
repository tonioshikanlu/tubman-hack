package e.a.a.a.y0.d.b;

import e.x.b.l;
import e.x.c.i;
import e.x.c.k;

public final class q extends k implements l<String, CharSequence> {

    /* renamed from: h  reason: collision with root package name */
    public static final q f8648h = new q();

    public q() {
        super(1);
    }

    public Object invoke(Object obj) {
        String str = (String) obj;
        i.e(str, "it");
        if (str.length() <= 1) {
            return str;
        }
        return 'L' + str + ';';
    }
}
