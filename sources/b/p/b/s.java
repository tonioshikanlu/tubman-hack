package b.p.b;

import b.e.a.a.a;
import java.io.IOException;

public enum s {
    HTTP_1_0("http/1.0"),
    HTTP_1_1("http/1.1"),
    SPDY_3("spdy/3.1"),
    HTTP_2("h2");
    

    /* renamed from: h  reason: collision with root package name */
    public final String f6755h;

    /* access modifiers changed from: public */
    s(String str) {
        this.f6755h = str;
    }

    public static s d(String str) {
        s sVar = HTTP_1_0;
        if (str.equals("http/1.0")) {
            return sVar;
        }
        s sVar2 = HTTP_1_1;
        if (str.equals("http/1.1")) {
            return sVar2;
        }
        s sVar3 = HTTP_2;
        if (str.equals("h2")) {
            return sVar3;
        }
        s sVar4 = SPDY_3;
        if (str.equals("spdy/3.1")) {
            return sVar4;
        }
        throw new IOException(a.m("Unexpected protocol: ", str));
    }

    public String toString() {
        return this.f6755h;
    }
}
