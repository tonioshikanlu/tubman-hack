package n;

import e.x.c.i;
import kotlin.jvm.internal.DefaultConstructorMarker;

public enum l0 {
    TLS_1_3("TLSv1.3"),
    TLS_1_2("TLSv1.2"),
    TLS_1_1("TLSv1.1"),
    TLS_1_0("TLSv1"),
    SSL_3_0("SSLv3");
    

    /* renamed from: o  reason: collision with root package name */
    public static final a f10147o = null;

    /* renamed from: h  reason: collision with root package name */
    public final String f10148h;

    public static final class a {
        public a(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public final l0 a(String str) {
            i.e(str, "javaName");
            int hashCode = str.hashCode();
            if (hashCode != 79201641) {
                if (hashCode != 79923350) {
                    switch (hashCode) {
                        case -503070503:
                            if (str.equals("TLSv1.1")) {
                                return l0.TLS_1_1;
                            }
                            break;
                        case -503070502:
                            if (str.equals("TLSv1.2")) {
                                return l0.TLS_1_2;
                            }
                            break;
                        case -503070501:
                            if (str.equals("TLSv1.3")) {
                                return l0.TLS_1_3;
                            }
                            break;
                    }
                } else if (str.equals("TLSv1")) {
                    return l0.TLS_1_0;
                }
            } else if (str.equals("SSLv3")) {
                return l0.SSL_3_0;
            }
            throw new IllegalArgumentException(b.e.a.a.a.m("Unexpected TLS version: ", str));
        }
    }

    /* access modifiers changed from: public */
    static {
        f10147o = new a((DefaultConstructorMarker) null);
    }

    /* access modifiers changed from: public */
    l0(String str) {
        this.f10148h = str;
    }
}
