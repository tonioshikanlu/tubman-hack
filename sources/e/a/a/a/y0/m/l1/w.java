package e.a.a.a.y0.m.l1;

import e.c0.m;
import e.x.b.l;
import e.x.c.i;
import e.x.c.k;

public final class w extends k implements l<String, StringBuilder> {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ StringBuilder f9729h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public w(StringBuilder sb) {
        super(1);
        this.f9729h = sb;
    }

    /* renamed from: a */
    public final StringBuilder invoke(String str) {
        i.e(str, "$this$unaryPlus");
        StringBuilder sb = this.f9729h;
        sb.append(str);
        i.d(sb, "append(value)");
        i.e(sb, "$this$appendln");
        sb.append(m.a);
        i.d(sb, "append(SystemProperties.LINE_SEPARATOR)");
        return sb;
    }
}
