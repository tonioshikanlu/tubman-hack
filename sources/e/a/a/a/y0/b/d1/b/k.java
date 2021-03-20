package e.a.a.a.y0.b.d1.b;

import e.x.b.l;
import e.x.c.g;
import e.x.c.i;
import e.x.c.v;
import java.lang.reflect.Member;

public final /* synthetic */ class k extends g implements l<Member, Boolean> {

    /* renamed from: q  reason: collision with root package name */
    public static final k f8298q = new k();

    public k() {
        super(1);
    }

    public final String D() {
        return "isSynthetic()Z";
    }

    public final String getName() {
        return "isSynthetic";
    }

    public Object invoke(Object obj) {
        Member member = (Member) obj;
        i.e(member, "p1");
        return Boolean.valueOf(member.isSynthetic());
    }

    public final e.a.g u() {
        return v.a(Member.class);
    }
}
