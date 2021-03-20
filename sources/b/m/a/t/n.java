package b.m.a.t;

import b.m.a.r;
import java.util.Comparator;

public class n implements Comparator<r> {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ r f5976h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ o f5977i;

    public n(o oVar, r rVar) {
        this.f5977i = oVar;
        this.f5976h = rVar;
    }

    public int compare(Object obj, Object obj2) {
        return Float.compare(this.f5977i.a((r) obj2, this.f5976h), this.f5977i.a((r) obj, this.f5976h));
    }
}
