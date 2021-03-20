package e.a.a.a.y0.i;

import e.c0.h;
import e.x.c.i;
import kotlin.jvm.internal.DefaultConstructorMarker;

public enum q {
    ;

    public static final class a extends q {
        public a(String str, int i2) {
            super(str, i2, (DefaultConstructorMarker) null);
        }

        public String d(String str) {
            i.e(str, "string");
            return h.w(h.w(str, "<", "&lt;", false, 4), ">", "&gt;", false, 4);
        }
    }

    public static final class b extends q {
        public b(String str, int i2) {
            super(str, i2, (DefaultConstructorMarker) null);
        }

        public String d(String str) {
            i.e(str, "string");
            return str;
        }
    }

    /* access modifiers changed from: public */
    q(DefaultConstructorMarker defaultConstructorMarker) {
    }

    public abstract String d(String str);
}
