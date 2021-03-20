package n;

import kotlin.jvm.internal.DefaultConstructorMarker;

public enum d0 {
    HTTP_1_0("http/1.0"),
    HTTP_1_1("http/1.1"),
    SPDY_3("spdy/3.1"),
    HTTP_2("h2"),
    H2_PRIOR_KNOWLEDGE("h2_prior_knowledge"),
    QUIC("quic");
    

    /* renamed from: p  reason: collision with root package name */
    public static final a f10080p = null;

    /* renamed from: h  reason: collision with root package name */
    public final String f10081h;

    public static final class a {
        public a(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    /* access modifiers changed from: public */
    static {
        f10080p = new a((DefaultConstructorMarker) null);
    }

    /* access modifiers changed from: public */
    d0(String str) {
        this.f10081h = str;
    }

    public String toString() {
        return this.f10081h;
    }
}
