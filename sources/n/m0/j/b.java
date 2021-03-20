package n.m0.j;

import kotlin.jvm.internal.DefaultConstructorMarker;

public enum b {
    NO_ERROR(0),
    PROTOCOL_ERROR(1),
    INTERNAL_ERROR(2),
    FLOW_CONTROL_ERROR(3),
    REFUSED_STREAM(7),
    CANCEL(8);
    

    /* renamed from: p  reason: collision with root package name */
    public static final a f10268p = null;

    /* renamed from: h  reason: collision with root package name */
    public final int f10269h;

    public static final class a {
        public a(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    /* access modifiers changed from: public */
    static {
        f10268p = new a((DefaultConstructorMarker) null);
    }

    /* access modifiers changed from: public */
    b(int i2) {
        this.f10269h = i2;
    }
}
