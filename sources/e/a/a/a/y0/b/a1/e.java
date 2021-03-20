package e.a.a.a.y0.b.a1;

import e.x.c.i;
import java.util.Objects;

public enum e {
    FIELD((String) null),
    FILE((String) null),
    PROPERTY((String) null),
    PROPERTY_GETTER("get"),
    PROPERTY_SETTER("set"),
    RECEIVER((String) null),
    CONSTRUCTOR_PARAMETER("param"),
    SETTER_PARAMETER("setparam"),
    PROPERTY_DELEGATE_FIELD("delegate");
    

    /* renamed from: h  reason: collision with root package name */
    public final String f7781h;

    /* access modifiers changed from: public */
    e(String str) {
        if (str == null) {
            String name = name();
            Objects.requireNonNull(name, "null cannot be cast to non-null type java.lang.String");
            str = name.toLowerCase();
            i.d(str, "(this as java.lang.String).toLowerCase()");
        }
        this.f7781h = str;
    }
}
